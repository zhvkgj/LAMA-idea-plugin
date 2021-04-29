package ru.mse.itmo.lama.language.annotators;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.impl.source.tree.PsiErrorElementImpl;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaTypes;

public class LamaSyntaxErrorAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        IElementType elementType = element.getNode().getElementType();

        if (elementType.equals(LamaTypes.LIDENT) && element.getParent() instanceof PsiErrorElementImpl) {
            holdErrorMsg(holder, "Operator or bracket expected");
        }

        if (elementType.equals(LamaTypes.DECIMAL) || elementType.equals(LamaTypes.STRING)) {
            if (element.getParent() instanceof PsiErrorElementImpl) {
                holdErrorMsg(holder, "Operator or bracket expected");
            }
        }

        if (elementType.equals(LamaTypes.INFIXOP)) {
            if (element.getParent() instanceof PsiErrorElementImpl) {
                holdErrorMsg(holder, "Incorrect usage of operator " + element.getText());
            }
        }
    }

    private void holdErrorMsg(@NotNull AnnotationHolder holder, @NotNull String msg) {
        holder.newAnnotation(HighlightSeverity.ERROR, msg)
                .create();
    }
}
