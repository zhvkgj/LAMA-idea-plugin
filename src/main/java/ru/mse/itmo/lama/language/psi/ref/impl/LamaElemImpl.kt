package ru.mse.itmo.lama.language.psi.ref.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import ru.mse.itmo.lama.language.psi.ref.LamaElem

abstract class LamaElemImpl(node: ASTNode) : ASTWrapperPsiElement(node), LamaElem {

}
