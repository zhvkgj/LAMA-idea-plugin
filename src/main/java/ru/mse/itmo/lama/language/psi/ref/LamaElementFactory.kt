package ru.mse.itmo.lama.language.psi.ref

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFileFactory
import ru.mse.itmo.lama.language.LamaFileType
import ru.mse.itmo.lama.language.psi.LamaFile

class LamaElementFactory {
    companion object {
        fun createLamaElem(project: Project, newName: String) : PsiElement {
            val tmpFile = createLamaFile(project, newName)
            return tmpFile.children.first().firstChild
        }


        fun createLamaFile(project: Project, content: String): LamaFile {
            val name = "dummy.lama"
            return PsiFileFactory.getInstance(project).createFileFromText(name, LamaFileType.INSTANCE, content)
                    as LamaFile
        }
    }
}