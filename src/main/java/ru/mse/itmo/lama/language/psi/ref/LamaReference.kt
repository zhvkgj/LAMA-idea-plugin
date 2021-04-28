package ru.mse.itmo.lama.language.psi.ref

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiElementResolveResult
import com.intellij.psi.PsiReferenceBase
import com.intellij.psi.ResolveResult
import ru.mse.itmo.lama.util.PsiUtils


class LamaReference(o: PsiElement, textRange: TextRange = o.lastChild.textRange) : PsiReferenceBase<PsiElement>(o) { //, PsiPolyVariantReference {

    override fun resolve(): PsiElement? {
//        val project = element.project
//        val matches = PsiUtils.findByKey(project, this.element.text)
//        return matches[0]
        val ans = multiResolve(false)
        return ans?.first()?.element
    }

    fun multiResolve(incompleteCode: Boolean): Array<ResolveResult?>? {
        val project = myElement.project
        val properties = PsiUtils.findByKey(project, this.element.text)
        val results = ArrayList<ResolveResult>()
        for (property in properties) {
            results.add(PsiElementResolveResult(property))
        }
        return results.toArray(arrayOfNulls<ResolveResult>(results.size))
    }


}