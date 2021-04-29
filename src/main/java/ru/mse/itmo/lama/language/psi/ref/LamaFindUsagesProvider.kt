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
import ru.mse.itmo.lama.language.psi.LamaTypes
import ru.mse.itmo.lama.language.psi.LamaWTFDefinition


class LamaFindUsagesProvider : FindUsagesProvider {

    override fun getWordsScanner(): WordsScanner? {
        return DefaultWordsScanner(LamaLexerAdapter(),
                TokenSet.create(LamaTypes.LIDENT, LamaTypes.PRIMARY),
                TokenSet.create(LamaTypes.SINGLECOMMENT, LamaTypes.MULTICOMMENT),
                TokenSet.create(LamaTypes.CHAR))
//                TokenSet.EMPTY)
    }

    override fun canFindUsagesFor(psiElement: PsiElement): Boolean {
        val ans = psiElement is PsiNamedElement
        val refs = psiElement.references
        var str = "It's empty"
        if (refs.isNotEmpty()) {
            str = ""
            for (ref in refs) {
                str += "${ref.element.text} + ${ref.resolve()}" + "${ref.resolve()?.text}" + "\t"
            }
        }

        getLogger<LamaFindUsagesProvider>().log(LogLevel.Info, str, null)
        return ans
    }

    override fun getHelpId(psiElement: PsiElement): String? {
        return null
    }

    override fun getType(element: PsiElement): String {
        return if (element is LamaElem) {
//            (element.elementType as LamaElementType).toString()
            if (element is LamaWTFDefinition) {
                "definition"
            } else {
                "identifier"
            }
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