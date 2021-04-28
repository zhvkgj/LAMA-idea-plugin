package ru.mse.itmo.lama.language.psi.ref

import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.util.elementType
import ru.mse.itmo.lama.language.psi.LamaElementType

class LamaFindUsagesProvider : FindUsagesProvider {
    override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
        return psiElement is PsiNamedElement
    }

    override fun getHelpId(psiElement: PsiElement): String? {
        return psiElement.text
    }

    override fun getType(element: PsiElement): String {
        return if (element is LamaElem) {
            (element.elementType as LamaElementType).toString()
        } else {
            if (element.elementType != null) {
                element.elementType.toString()
            } else ""
        }
    }

    override fun getDescriptiveName(element: PsiElement): String {
        return if (element is LamaElem) {
            element.name?: ""
        } else {
            element.toString()
        }
    }

    override fun getNodeText(element: PsiElement, useFullName: Boolean): String {
        return element.text
    }
}