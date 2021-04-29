package ru.mse.itmo.lama.language.psi.ref.impl;

import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.ReferenceProvidersRegistry;
import com.sun.istack.Nullable;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.*;
import ru.mse.itmo.lama.language.psi.ref.LamaElementFactory;

import javax.swing.*;

public class LamaParsersUtil extends GeneratedParserUtilBase {

    private static String convertEmbeddedSpaces(String str) {
        return str.replaceAll("\\\\ ", " ");
    }


    private static PsiElement getKeyFromFunctionDecl(LamaWTFFunctionDefinition funcDefinition) {
        return funcDefinition.getLident();
    }

    private static PsiElement getValueFromFunctionDecl(LamaWTFFunctionDefinition funcDefinition) {
        return funcDefinition.getFunctionBody();
    }

    private static PsiElement getKeyFromVarDecl(LamaWTFVariableDefinition varDefinition) {
        var definitionSeq = varDefinition.getVariableDefinitionSeq();
        var definitionItemList = definitionSeq.getVariableDefinitionItemList();
        if (definitionItemList.size() == 0) {
            return null;
        }
        return definitionItemList.get(0).getVariableUsage();
    }

    private static PsiElement getValueFromVarDecl(LamaWTFVariableDefinition varDefinition) {
        var definitionSeq = varDefinition.getVariableDefinitionSeq();
        var definitionItemList = definitionSeq.getVariableDefinitionItemList();
        if (definitionItemList.size() == 0) {
            return null;
        }
        return definitionItemList.get(0).getBasicExpression();
    }

    private static PsiElement getKeyFromInfixDef(LamaWTFInfixDefinition infixDefinition) {
        return infixDefinition.getInfixHead();
    }

    private static PsiElement getValueFromInfixDef(LamaWTFInfixDefinition infixDefinition) {
        return infixDefinition.getFunctionBody().getScopeExpression();
    }

    private static PsiElement resolveNeededKeyElement(LamaWTFDefinition element) {
        PsiElement ans = null;

        if (element.getFunctionDefinition() != null) {
            ans = getKeyFromFunctionDecl(element.getFunctionDefinition());
        } else if (element.getVariableDefinition() != null) {
            ans = getKeyFromVarDecl(element.getVariableDefinition());
        } else if (element.getInfixDefinition() != null) {
            ans = getKeyFromInfixDef(element.getInfixDefinition());
        }

        return ans;
    }


    public static String getKey(LamaWTFDefinition element) {
        String foundText = null;

        if (element.getFunctionDefinition() != null) {
            foundText = getKeyFromFunctionDecl(element.getFunctionDefinition()).getText();
        } else if (element.getVariableDefinition() != null) {
            var name = getKeyFromVarDecl(element.getVariableDefinition());
            if (name != null) {
                foundText = name.getText();
            }
        } else if (element.getInfixDefinition() != null) {
            foundText = getKeyFromInfixDef(element.getInfixDefinition()).getText();
        }


        if (foundText != null) {
            return convertEmbeddedSpaces(foundText);
        }
        return foundText;
//        ASTNode keyNode = element.getNode().findChildByType(LamaTypes.LIDENT);
//        if (keyNode != null) {
//            // IMPORTANT: Convert embedded escaped spaces to simple spaces
//            return keyNode.getText().replaceAll("\\\\ ", " ");
//        } else {
//            return null;
//        }
    }

    public static String getValue(LamaWTFDefinition element) {
        String foundText = null;

        if (element.getFunctionDefinition() != null) {
            foundText = getValueFromFunctionDecl(element.getFunctionDefinition()).getText();
        } else if (element.getVariableDefinition() != null) {
            var name = getValueFromVarDecl(element.getVariableDefinition());
            if (name != null) {
                foundText = name.getText();
            }
        } else if (element.getInfixDefinition() != null) {
            foundText = getValueFromInfixDef(element.getInfixDefinition()).getText();
        }

        if (foundText != null) {
            return convertEmbeddedSpaces(foundText);
        }

        return foundText;
    }

    public static String getName(LamaWTFDefinition element) {
        return getKey(element);
    }

    public static PsiElement setName(LamaWTFDefinition element, String newName) {
        var keyNode = resolveNeededKeyElement(element);
        if (keyNode != null) {
            var newIndent = LamaElementFactory.Companion.createLamaElem(element.getProject(), newName);
            element.getNode().replaceChild(keyNode.getNode(), newIndent.getNode());
        }
       return element;
    }

    public static PsiElement getNameIdentifier(LamaWTFDefinition element) {
        return resolveNeededKeyElement(element);
    }

    public static ItemPresentation getPresentation(final LamaWTFDefinition element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getText();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Override
            public Icon getIcon(boolean unused) {
                return null;
            }
        };
    }


    public static PsiElement setName(LamaWTFVariableUsage element, String newName) {
        var keyNode = element.getLident();
        var newIndent = LamaElementFactory.Companion.createLamaElem(element.getProject(), newName);
        element.getNode().replaceChild(keyNode.getNode(), newIndent.getNode());
        return element;
    }

    public static String getName(LamaWTFVariableUsage element) {
        return element.getLident().getText();
    }

    public static PsiElement getNameIdentifier(LamaWTFVariableUsage element) {
        return element.getLident();
    }

    public static ItemPresentation getPresentation(final LamaWTFVariableUsage element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getLident().getText();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Override
            public Icon getIcon(boolean unused) {
                return null;
            }
        };
    }


    public static PsiReference @NotNull [] getReferences(final PsiElement element) {
        return ReferenceProvidersRegistry.getReferencesFromProviders(element);
    }

}
