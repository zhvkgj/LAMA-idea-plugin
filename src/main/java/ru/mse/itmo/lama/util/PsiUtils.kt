package ru.mse.itmo.lama.util

import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiManager
import com.intellij.psi.search.FileTypeIndex
import com.intellij.psi.search.GlobalSearchScope
import com.intellij.psi.util.PsiTreeUtil
import ru.mse.itmo.lama.language.LamaFileType
import ru.mse.itmo.lama.language.psi.LamaFile
import ru.mse.itmo.lama.language.psi.LamaWTFDefinition
import ru.mse.itmo.lama.language.psi.LamaWTFVariableUsage
import ru.mse.itmo.lama.language.psi.ref.LamaElem

class PsiUtils {
    companion object {

        fun findByValueFromParent(parent: PsiElement, value: String) : List<PsiElement> {
            val ans = ArrayList<LamaElem>()
            val foundData = PsiTreeUtil.getChildrenOfType(parent, LamaElem::class.java)
            for (elem in foundData) {
                val foundVal = elem as LamaWTFDefinition
                if (value == foundVal.value) ans.add(elem)
            }
            val foundUsages = PsiTreeUtil.getChildrenOfType(parent, LamaWTFVariableUsage::class.java)?: return ans
            for (usage in foundUsages) {
                if (usage.lident.text == value) ans.add(usage)
            }
            return ans
        }


        fun findByKeyFromParent(parent: PsiElement, key: String) : List<LamaElem> {
            val ans = ArrayList<LamaElem>()
            val foundData = PsiTreeUtil.getChildrenOfType(parent, LamaElem::class.java) ?: return emptyList()
            for (elem in foundData) {
                if (key == elem.name) ans.add(elem)
            }
            return ans
        }

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


        fun getParentOfType(element: PsiElement?, type: Class<*>): PsiElement? {
            if (element == null) {
                return null
            }
            return if (type.isAssignableFrom(element.javaClass)) {
                element
            } else getParentOfType(element.parent, type)
        }
    }



}