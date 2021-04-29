package ru.mse.itmo.lama.language.psi.ref

import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet
import com.intellij.util.ProcessingContext
import com.jetbrains.rd.util.LogLevel
import com.jetbrains.rd.util.getLogger
import ru.mse.itmo.lama.language.psi.LamaWTFExpression
import ru.mse.itmo.lama.language.psi.LamaWTFVariableUsage


class LamaReferenceContributor : PsiReferenceContributor() {

    override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
        registrar.registerReferenceProvider(
                PlatformPatterns.psiElement(LamaWTFVariableUsage::class.java),
                LamaFileReferenceProvider()
        )

//        registrar.registerReferenceProvider(
//                PlatformPatterns.psiElement(LamaWTFDefinition::class.java),
//                object : PsiReferenceProvider() {
//                    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<PsiReference> {
//                        val sym = element as LamaWTFDefinition
//                        getLogger<LamaReferenceContributor>().log(LogLevel.Info, sym.toString() + "\t ${sym.name}", null)
//                        if (sym.nameIdentifier == null) {
//                            return emptyArray()
//                        }
//                        val range = sym.textRange
//                        return arrayOf<PsiReference>(LamaReference(sym, range))
//                    }
//                }
//        )

    }
}

private class LamaFileReferenceProvider: PsiReferenceProvider() {
    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext) : Array<PsiReference> {
        val sym = element as LamaWTFVariableUsage
        getLogger<LamaReferenceContributor>().log(LogLevel.Info, sym.toString() + "\t ${sym.text}", null)

        val range = sym.textRange
        return arrayOf(LamaReference(sym, range))

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