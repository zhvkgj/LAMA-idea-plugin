package ru.mse.itmo.lama.language.psi.ref

import com.intellij.lang.cacheBuilder.DefaultWordsScanner
import com.intellij.lang.cacheBuilder.WordsScanner
import com.intellij.lang.findUsages.FindUsagesProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.tree.TokenSet
import com.intellij.psi.util.elementType
import com.jetbrains.rd.util.LogLevel
import com.jetbrains.rd.util.getLogger
import ru.mse.itmo.lama.language.LamaLexerAdapter
import ru.mse.itmo.lama.language.psi.LamaElementType
import ru.mse.itmo.lama.language.psi.LamaTypes


class LamaFindUsagesProvider : FindUsagesProvider {

    override fun getWordsScanner(): WordsScanner? {
        return DefaultWordsScanner(LamaLexerAdapter(),
                TokenSet.create(LamaTypes.LIDENT),
                TokenSet.create(LamaTypes.DO),
                TokenSet.create(LamaTypes.CHAR))
    }

    override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
        val ans = psiElement is PsiNamedElement
//        getLogger<LamaFindUsagesProvider>().log(LogLevel.Info, ans, null)
        getLogger<LamaFindUsagesProvider>().log(LogLevel.Info, psiElement.references, null)
        return ans
    }

    override fun getHelpId(psiElement: PsiElement): String? {
        return null
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