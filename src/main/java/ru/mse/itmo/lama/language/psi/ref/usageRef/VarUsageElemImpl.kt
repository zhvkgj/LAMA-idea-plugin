package ru.mse.itmo.lama.language.psi.ref.usageRef

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiReference
import ru.mse.itmo.lama.language.psi.ref.LamaElem
import ru.mse.itmo.lama.language.psi.ref.LamaReference

abstract class VarUsageElemImpl(node: ASTNode) : ASTWrapperPsiElement(node), LamaElem {

    override fun getReference(): PsiReference? {
        val element = node.psi
        val identifier = element.text

        return LamaReference(element, element.textRange)
    }

    override fun getTextOffset(): Int {
        return node.startOffset
    }
}