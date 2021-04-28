package ru.mse.itmo.lama.language.psi.ref

import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiReferenceBase
import ru.mse.itmo.lama.util.PsiUtils

class LamaReference(o: PsiElement, textRange: TextRange = o.lastChild.textRange) : PsiReferenceBase<PsiElement>(o) { //, PsiPolyVariantReference {

    override fun resolve(): PsiElement {
        val project = element.project
        val matches = PsiUtils.findByKey(project, this.element.text)
        return matches[0]
    }


}