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
import ru.mse.itmo.lama.language.psi.LamaWTFScopeExpression
import ru.mse.itmo.lama.language.psi.LamaWTFVariableUsage
import ru.mse.itmo.lama.language.psi.ref.LamaElem
import ru.mse.itmo.lama.language.psi.ref.impl.LamaParsersUtil

class PsiUtils {
    companion object {

        fun isInsideDef(element: PsiElement) : Boolean {
            return PsiTreeUtil.getParentOfType(element, LamaWTFDefinition::class.java) != null
        }

        fun isLhsOfDef(element: PsiElement) : Boolean {
            val parent = PsiTreeUtil.getParentOfType(element, LamaWTFDefinition::class.java) ?: false
            return (parent as LamaWTFDefinition).name == element.text
        }


        fun findByValueFromParentForDef(parent: PsiElement, value: String) : List<LamaElem> {
            val ans = ArrayList<LamaElem>()
            val foundData = PsiTreeUtil.getChildrenOfType(parent, LamaWTFDefinition::class.java)
            if (foundData != null) {
                for (elem in foundData) {
                    if (value == elem.value) {
                        ans.add(elem)
//                        val childr = PsiTreeUtil.getChildrenOfType(elem, LamaWTFVariableUsage::class.java)
//                        for (usage in childr) {
//                            if (usage.text == value) ans.add(usage)
//                        }

                    }
                }
            }
            return ans
        }


        fun findByValueFromParent(parent: PsiElement, value: String, isReturnAsVarUsage: Boolean = true) : List<LamaElem> {
            val ans = ArrayList<LamaElem>()
            val foundData = PsiTreeUtil.getChildrenOfType(parent, LamaWTFDefinition::class.java)
            if (foundData != null) {
                for (elem in foundData) {
                    val foundVal = elem as LamaWTFDefinition
                    val foundUsages = PsiTreeUtil.findChildrenOfType(foundVal, LamaElem::class.java)
                    for (usage in foundUsages) {
                        if (value == usage.name) {
                            ans.add(usage)
                        }
                    }
//                    if (value == ) ans.add(elem)
                }
            }
//            val foundUsages = PsiTreeUtil.getChildrenOfType(parent, LamaWTFVariableUsage::class.java)?: return ans
//            for (usage in foundUsages) {
//                if (usage.lident.text == value) ans.add(usage)
//            }
            return ans
        }


//        fun findByKeyFromParent(parent: PsiElement, key: String, isReturnAsVarUsage: Boolean = true) : List<LamaWTFDefinition> {
        fun findByKeyFromParent(parent: PsiElement, key: String, isReturnAsVarUsage: Boolean = true) : List<LamaElem> {
            val ans = ArrayList<LamaElem>()
            var newToSearchIn = if (isInsideDef(parent)) {
                PsiTreeUtil.findFirstParent(parent) {
                    it is LamaFile
                }
            } else {
                    parent
            }

            if (newToSearchIn is LamaFile) {
                newToSearchIn = PsiTreeUtil.findChildOfType(newToSearchIn, LamaWTFScopeExpression::class.java)
            }

            val foundData = PsiTreeUtil.getChildrenOfType(newToSearchIn, LamaWTFDefinition::class.java) ?: return emptyList()
            for (elem in foundData) {
                if (key == elem.name)  {
                    val navigationElem = elem.navigationElement
                    if (navigationElem is LamaElem) {
                        ans.add(navigationElem)
                    } else {
                        val foundLamaElems = LamaParsersUtil.resolveNeededKeyElement(elem)
                        if (foundLamaElems is LamaElem) {
                            ans.add(foundLamaElems)
                        }
                    }
                }
            }
            return ans
        }

        fun findByKey(project: Project, key: String) : List<PsiElement> {
            val ans = ArrayList<PsiElement>()
            val virtualFiles = FileTypeIndex.getFiles(LamaFileType.INSTANCE, GlobalSearchScope.allScope(project))
            val manager = PsiManager.getInstance(project)
            for (virtualFile in virtualFiles) {
                val lamaFile = manager.findFile(virtualFile)
                if (lamaFile != null && lamaFile is LamaFile) {
                    if (lamaFile.isValid && lamaFile.children.isNotEmpty() && lamaFile.firstChild.children.isNotEmpty()) {
                        val seenVars = mutableSetOf< LamaWTFVariableUsage>()
                        val foundData = PsiTreeUtil.getChildrenOfType(lamaFile.firstChild, LamaWTFDefinition::class.java)
                        for (elem in foundData) {
                            val childs = PsiTreeUtil.findChildrenOfType(elem, LamaWTFVariableUsage::class.java)
//                            for (child in childs) {
//                                if (child.lident.text == key) seenVars.add(child)
//                            }
                            if (key == elem.name) ans.add(elem)
                        }
                        ans.addAll(seenVars)
                    }
                }
            }
            return ans
        }


        fun findAllVarUsages(project: Project) : List<LamaWTFVariableUsage> {
            val ans = ArrayList<LamaWTFVariableUsage>()
            val virtualFiles = FileTypeIndex.getFiles(LamaFileType.INSTANCE, GlobalSearchScope.allScope(project))
            val manager = PsiManager.getInstance(project)
            for (virtualFile in virtualFiles) {
                val lamaFile = manager.findFile(virtualFile)
                if (lamaFile != null && lamaFile is LamaFile) {
                    var foundScopes = PsiTreeUtil.getChildrenOfType(lamaFile, LamaWTFScopeExpression::class.java) ?: return emptyList()
                    for (scope in foundScopes) {
                        val foundUsages = PsiTreeUtil.getChildrenOfType(scope, LamaWTFVariableUsage::class.java)?: continue
                        ans.addAll(foundUsages)
                    }
                }
            }
            return ans
        }

        fun findAll(project: Project) : List<LamaWTFDefinition> {
            val ans = ArrayList<LamaWTFDefinition>()
            val virtualFiles = FileTypeIndex.getFiles(LamaFileType.INSTANCE, GlobalSearchScope.allScope(project))
            val manager = PsiManager.getInstance(project)
            for (virtualFile in virtualFiles) {
                val lamaFile = manager.findFile(virtualFile)
                if (lamaFile != null && lamaFile is LamaFile) {
                    if (lamaFile.isValid && lamaFile.children.isNotEmpty() && lamaFile.firstChild.children.isNotEmpty()) {
                        var foundData = PsiTreeUtil.getChildrenOfType(lamaFile.firstChild, LamaWTFDefinition::class.java)
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