package ru.mse.itmo.lama.util

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import ru.mse.itmo.lama.language.LamaFileType
import ru.mse.itmo.lama.language.psi.LamaFile
import ru.mse.itmo.lama.language.psi.ref.LamaElem

class PsiUtils {
    companion object {
        fun findByKey(project: Project, key: String) : List<LamaElem> {
            val ans = ArrayList<LamaElem>()
            val virtualFiles = FileTypeIndex.getFiles(LamaFileType.INSTANCE, GlobalSearchScope.allScope(project))
            val manager = PsiManager.getInstance(project)
            for (virtualFile in virtualFiles) {
                val lamaFile = manager.findFile(virtualFile)
                if (lamaFile != null && lamaFile is LamaFile) {
                    if (lamaFile.isValid && lamaFile.children.isNotEmpty() && lamaFile.firstChild.children.isNotEmpty()) {
                        val foundData = PsiTreeUtil.getChildrenOfType(lamaFile.firstChild, LamaElem::class.java)
                        for (elem in foundData) {
                            if (key == elem.name) ans.add(elem)

                        }
                    }
                }
            }
            return ans
        }

        fun findAll(project: Project) : List<LamaElem> {
            val ans = ArrayList<LamaElem>()
            val virtualFiles = FileTypeIndex.getFiles(LamaFileType.INSTANCE, GlobalSearchScope.allScope(project))
            val manager = PsiManager.getInstance(project)
            for (virtualFile in virtualFiles) {
                val lamaFile = manager.findFile(virtualFile)
                if (lamaFile != null && lamaFile is LamaFile) {
                    if (lamaFile.isValid && lamaFile.children.isNotEmpty() && lamaFile.firstChild.children.isNotEmpty()) {
                        val foundData = PsiTreeUtil.getChildrenOfType(lamaFile.firstChild, LamaElem::class.java)
                        if (foundData != null) {
                            ans.addAll(foundData)
                        }
                    }
                }
            }
            return ans
        }
    }



}