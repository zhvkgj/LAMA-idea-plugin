package ru.mse.itmo.lama.util

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.util.SmartList
import ru.mse.itmo.lama.language.LamaFileType
import ru.mse.itmo.lama.language.psi.LamaFile
import ru.mse.itmo.lama.language.psi.ref.LamaElem

class PsiUtils {
    companion object {
        fun findByKey(project: Project, key: String) : List<LamaElem> {
            val ans = SmartList<LamaElem>()
            val virtualFiles = FileTypeIndex.getFiles(LamaFileType.INSTANCE, GlobalSearchScope.allScope(project))
            for (virtualFile in virtualFiles) {
                val lamaFile = PsiManager.getInstance(project).findFile(virtualFile) as LamaFile
                val foundData = PsiTreeUtil.getChildrenOfType(lamaFile, LamaElem::class.java)
                for (symbol in foundData) {
                    if (key == symbol.name) ans.add(symbol)
                }
            }
            return ans
        }

        fun findAll(project: Project) : List<PsiElement> {
            val ans = SmartList<PsiElement>()
            val virtualFiles = FileTypeIndex.getFiles(LamaFileType.INSTANCE, GlobalSearchScope.allScope(project))
            for (virtualFile in virtualFiles) {
                val lamaFile = PsiManager.getInstance(project).findFile(virtualFile) as LamaFile
                val foundData = PsiTreeUtil.getChildrenOfType(lamaFile, LamaFile::class.java)
                ans.addAll(foundData)
            }
            return ans
        }
    }



}