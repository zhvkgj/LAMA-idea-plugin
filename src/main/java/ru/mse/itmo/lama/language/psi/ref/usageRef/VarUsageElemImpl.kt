package ru.mse.itmo.lama.language.psi.ref.usageRef

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import ru.mse.itmo.lama.language.psi.ref.LamaElem

abstract class VarUsageElemImpl(node: ASTNode) : ASTWrapperPsiElement(node), LamaElem {
}