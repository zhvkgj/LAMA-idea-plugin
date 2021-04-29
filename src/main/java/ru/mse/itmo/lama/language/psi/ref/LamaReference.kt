package ru.mse.itmo.lama.language.psi.ref

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.ResolveResult
import com.jetbrains.rd.util.LogLevel
import com.jetbrains.rd.util.getLogger
import ru.mse.itmo.lama.language.psi.LamaWTFDefinition
import ru.mse.itmo.lama.language.psi.LamaWTFScopeExpression
import ru.mse.itmo.lama.language.psi.LamaWTFVariableUsage
import ru.mse.itmo.lama.util.PsiUtils


class LamaReference(o: PsiElement, textRange: TextRange = o.lastChild.textRange) : PsiReferenceBase<PsiElement>(o) { //, PsiPolyVariantReference {

    override fun resolve(): PsiElement? {
        val ans = if (myElement is LamaWTFDefinition) {
            multiResolveForDefinition()
        } else multiResolveForUsage(false)
        if (ans == null || ans.isEmpty()) {
            getLogger<LamaReference>().log(LogLevel.Warn, "null for resolve of ${myElement.text}", null)
            return null
        }
        if (ans.size > 1 ) {
            return ans[1]!!.element
        }
        getLogger<LamaReference>().log(LogLevel.Info, "resolved for ${myElement.text} as ${ans.first()!!.element}", null)
        return ans.first()!!.element
    }

    fun multiResolve(incompleteCode: Boolean): Array<ResolveResult> {
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

        val foundData = if (PsiUtils.isInsideDef(myElement)) {
            if (PsiUtils.isLhsOfDef(myElement)) {
                PsiUtils.findByValueFromParent(parent, name!!)
            } else PsiUtils.findByKeyFromParent(parent, name!!)
        } else {
            PsiUtils.findByKeyFromParent(parent, name!!)
        }



        return PsiElementResolveResult.createResults(foundData)
    }


    private fun multiResolveForDefinition(): Array<ResolveResult>? {
        val parent = PsiUtils.getParentOfType(myElement, LamaWTFScopeExpression::class.java) ?: return null
        val elem = myElement as LamaElem
        val name = elem.name
        val foundData = PsiUtils.findByValueFromParent(parent, name!!)

        return PsiElementResolveResult.createResults(foundData)
    }


    override fun getVariants(): Array<Any?>  {
        return arrayOf(object : Any() {})
//        val project = myElement.project
////        val properties = PsiUtils.findAll(project)
//        val properties = PsiUtils.findAllVarUsages(project)
//        val variants = ArrayList<LookupElement>()
//        for (property in properties) {
//            if (property.name != null ) {
//                variants.add(LookupElementBuilder
//                        .create(property).withTypeText(property.containingFile.name)
//                )
//            }
//        }
//        return variants.toTypedArray()
    }

    override fun isReferenceTo(element: PsiElement): Boolean {
        getLogger<LamaReference>().log(LogLevel.Error, "called is Reference to $myElement", null)
        val refs = multiResolve(false)

        for (ref in refs) {
            if (this.element.manager.areElementsEquivalent(ref.element, element)) return true
        }

        return false
    }

    override fun getRangeInElement(): TextRange {
        return myElement.textRange
    }
}