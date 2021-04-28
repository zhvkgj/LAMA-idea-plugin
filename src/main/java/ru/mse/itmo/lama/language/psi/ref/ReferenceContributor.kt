package ru.mse.itmo.lama.language.psi.ref

import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet
import com.intellij.util.ProcessingContext
import ru.mse.itmo.lama.language.psi.LamaWTFDefinition
import ru.mse.itmo.lama.language.psi.LamaWTFExpression


class LamaReferenceContributor : PsiReferenceContributor() {

    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement(LamaWTFDefinition::class.java),
                LamaFileReferenceProvider()
        )

//        registrar.registerReferenceProvider(
//                PlatformPatterns.psiElement(LamaWTFPrimary::class.java),
//                object : PsiReferenceProvider() {
//                    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
//                        val sym = element as LamaWTFPrimary
//                        val value = sym
//                        val range = value.textRange
//                        return arrayOf<PsiReference>(LamaReference(element, range))
//                    }
//                }
//        )

    }
}

private class LamaFileReferenceProvider: PsiReferenceProvider() {
    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext) : Array<PsiReference> {
        val sym = element as LamaWTFDefinition
        val value = sym.nameIdentifier ?: return emptyArray()

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