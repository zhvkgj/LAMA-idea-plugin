package ru.mse.itmo.lama.language.annotators;

import static com.intellij.lang.annotation.HighlightSeverity.INFORMATION;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.*;


public class LamaHighlightAnnotator implements Annotator {
    LamaHighlightAnnotator() {
    }

    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        IElementType elementType = element.getNode().getElementType();

        if (elementType.equals(LamaTypes.UIDENT)) {
            PsiElement parent = element.getParent();
            if (parent instanceof LamaWTFImportRule) {
                color(holder, element.getNavigationElement(), DefaultLanguageHighlighterColors.CLASS_NAME);
            }
        } else if (elementType.equals(LamaTypes.LIDENT)) {
            PsiElement p = element.getParent();
            if (p instanceof LamaWTFPrimary) {
                PsiElement pp = p.getParent();
                if (pp instanceof LamaWTFFunctionCall) {
                    color(holder, element.getNavigationElement(), DefaultLanguageHighlighterColors.STATIC_METHOD);
                }
            }
        }
    }

    private void color(
            @NotNull AnnotationHolder holder,
            @NotNull PsiElement element,
            @NotNull TextAttributesKey key) {
        holder.newSilentAnnotation(INFORMATION).range(element).textAttributes(key).create();
    }
}
