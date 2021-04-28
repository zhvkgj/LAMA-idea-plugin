package ru.mse.itmo.lama.language.psi.ref.impl;

import com.intellij.lang.ASTNode;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.sun.istack.Nullable;
import ru.mse.itmo.lama.language.psi.LamaTypes;
import ru.mse.itmo.lama.language.psi.LamaWTFDefinition;

import javax.swing.*;

public class LamaParsersUtil extends GeneratedParserUtilBase {
    public static String getKey(LamaWTFDefinition element) {
        ASTNode keyNode = element.getNode().findChildByType(LamaTypes.LIDENT);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(LamaWTFDefinition element) {
        ASTNode valueNode = element.getNode().findChildByType(LamaTypes.BASIC_EXPRESSION);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(LamaWTFDefinition element) {
        return getKey(element);
    }

    public static PsiElement setName(LamaWTFDefinition element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(LamaTypes.LIDENT);
//        if (keyNode != null) {
//            SimpleProperty property = SimpleElementFactory.createProperty(element.getProject(), newName);
//            ASTNode newKeyNode = property.getFirstChild().getNode();
//            element.getNode().replaceChild(keyNode, newKeyNode);
//        }
        return element;
    }

    public static PsiElement getNameIdentifier(LamaWTFDefinition element) {
        ASTNode keyNode = element.getNode().findChildByType(LamaTypes.LIDENT);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
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
}
