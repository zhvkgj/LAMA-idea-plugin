package ru.mse.itmo.lama.language.psi.ref

import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet
import com.intellij.util.ProcessingContext
import ru.mse.itmo.lama.language.psi.LamaWTFExpression
import ru.mse.itmo.lama.language.psi.LamaWTFVariableDefinition


class LamaReferenceContributor : PsiReferenceContributor() {

    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement(LamaWTFExpression::class.java),
                LamaFileReferenceProvider()
        )

        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement(LamaWTFVariableDefinition::class.java),
                object : PsiReferenceProvider() {
                    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
                        val sym = element as LamaWTFVariableDefinition
                        val value = sym.variableDefinitionSeq
                        val range = value.textRange
                        return arrayOf<PsiReference>(LamaReference(element, range))
                    }
                }
        )
    }
}

private class LamaFileReferenceProvider: PsiReferenceProvider() {
    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext) : Array<PsiReference> {
        val sym = element as LamaWTFExpression
//        if (sym is LamAWTF)
        val value = sym.basicExpression

        val range = value.textRange
        return arrayOf<PsiReference>(LamaReference(value, range))

//        val fs = element.containingFile.originalFile.virtualFile.fileSystem
            // return type : Array<FileReferences>
//        return LamaSymbolReferenceSet(value, sym, fs.isCaseSensitive).allReferences
    }
}


//todo: add for files
private class LamaSymbolReferenceSet(str: String, element: LamaWTFExpression, isCaseSensitive: Boolean) :
        FileReferenceSet(str, element, element.textOffset, null, isCaseSensitive) {
    override fun getDefaultContexts(): MutableCollection<PsiFileSystemItem> = parentDirectoryContext
}