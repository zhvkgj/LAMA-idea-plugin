package ru.mse.itmo.lama.language.psi.ref.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.sun.istack.Nullable;
import ru.mse.itmo.lama.language.psi.LamaTypes;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;

import javax.swing.*;

public class LamaParserUtil {

    public static String getKey(LamaWTFExpression element) {
        ASTNode keyNode = element.getNode().findChildByType(LamaTypes.BEFORE);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(LamaWTFExpression element) {
        ASTNode valueNode = element.getNode().findChildByType(LamaTypes.AFTER);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(LamaWTFExpression element) {
        return getKey(element);
    }

    public static PsiElement setName(LamaWTFExpression element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(LamaTypes.AFTER);
//        if (keyNode != null) {
//            SimpleProperty property = SimpleElementFactory.createProperty(element.getProject(), newName);
//            ASTNode newKeyNode = property.getFirstChild().getNode();
//            element.getNode().replaceChild(keyNode, newKeyNode);
//        }
        return element;
    }

    public static PsiElement getNameIdentifier(LamaWTFExpression element) {
        ASTNode keyNode = element.getNode().findChildByType(LamaTypes.AFTER);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final LamaWTFExpression element) {
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
