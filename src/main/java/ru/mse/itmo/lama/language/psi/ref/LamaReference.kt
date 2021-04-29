package ru.mse.itmo.lama.language.psi.ref

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.ResolveResult
import ru.mse.itmo.lama.language.psi.LamaWTFScopeExpression
import ru.mse.itmo.lama.language.psi.LamaWTFVariableUsage
import ru.mse.itmo.lama.util.PsiUtils


class LamaReference(o: PsiElement, textRange: TextRange = o.lastChild.textRange) : PsiReferenceBase<PsiElement>(o) { //, PsiPolyVariantReference {

    override fun resolve(): PsiElement? {
//        val project = element.project
//        val matches = PsiUtils.findByKey(project, this.element.text)
//        return matches[0]
        val ans = if (myElement is LamaElem) {
            multiResolveForDefinition()
        } else multiResolve(false)
        if (ans == null || ans.isEmpty()) {
            return null
        }
        return ans.first()!!.element
    }

    fun multiResolve(incompleteCode: Boolean): Array<ResolveResult?>? {
        val project = myElement.project
        val elem = this.element as LamaWTFVariableUsage

        val name = elem.lident.text
        val properties = PsiUtils.findByKey(project, name!!)


        val results = PsiElementResolveResult.createResults(properties)
        return results.toList().toTypedArray()
    }


    private fun multiResolveForDefinition(): Array<ResolveResult?>? {
        val parent = PsiUtils.getParentOfType(myElement, LamaWTFScopeExpression::class.java) ?: return null
        val elem = myElement as LamaElem
        val name = elem.name
        val foundData = PsiUtils.findByValueFromParent(parent, name!!)

        return PsiElementResolveResult.createResults(foundData).toList().toTypedArray()
    }


    override fun getRangeInElement(): TextRange {
        return myElement.textRange
    }
}