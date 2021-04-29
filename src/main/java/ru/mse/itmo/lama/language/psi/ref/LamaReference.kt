package ru.mse.itmo.lama.language.psi.ref

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder
import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import ru.mse.itmo.lama.language.psi.LamaWTFDefinition
import ru.mse.itmo.lama.language.psi.LamaWTFScopeExpression
import ru.mse.itmo.lama.language.psi.LamaWTFVariableUsage
import ru.mse.itmo.lama.util.PsiUtils


class LamaReference(o: PsiElement, textRange: TextRange = o.lastChild.textRange) : PsiReferenceBase<PsiElement>(o), PsiPolyVariantReference, PsiReference { //, PsiPolyVariantReference {

    override fun resolve(): PsiElement? {
        val ans = if (myElement is LamaWTFDefinition) {
            multiResolveForDefinition()
        } else multiResolveForUsage(false)
        if (ans == null || ans.isEmpty()) {
            return null
        }
        return ans.first()!!.element
    }

    override fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
        val ans = if (myElement is LamaWTFDefinition) {
            multiResolveForDefinition()
        } else multiResolveForUsage(false)
        if (ans == null || ans.isEmpty()) {
            return emptyArray()
        }
        return (ans as Array<ResolveResult>)
    }

    fun multiResolveForUsage(incompleteCode: Boolean): Array<ResolveResult>? {
        val project = myElement.project
        val elem = myElement as LamaWTFVariableUsage

        val name = elem.lident.text
        val parent = PsiUtils.getParentOfType(myElement, LamaWTFScopeExpression::class.java) ?: return null
//        val properties = PsiUtils.findByValueFromParent(parent, name!!)
        val children = parent.children
        if (children.isEmpty()) {
            return emptyArray()
        }

        val results = PsiElementResolveResult.createResults(children.first())
        return results.toList().toTypedArray()
    }


    private fun multiResolveForDefinition(): Array<ResolveResult?>? {
        val parent = PsiUtils.getParentOfType(myElement, LamaWTFScopeExpression::class.java) ?: return null
        val elem = myElement as LamaElem
        val name = elem.name
        val foundData = PsiUtils.findByValueFromParent(parent, name!!)

        return PsiElementResolveResult.createResults(foundData).toList().toTypedArray()
    }


    override fun getVariants(): Array<Any?>  {
        val project = myElement.project
        val properties = PsiUtils.findAll(project)
        val variants = ArrayList<LookupElement>()
        for (property in properties) {
            if (property.name != null ) {
                variants.add(LookupElementBuilder
                        .create(property).withTypeText(property.containingFile.name)
                )
            }
        }
        return variants.toTypedArray()
    }


    override fun getRangeInElement(): TextRange {
        return myElement.textRange
    }
}