package ru.mse.itmo.lama.language.completion.providers.patterns;

import com.intellij.patterns.ElementPattern;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import ru.mse.itmo.lama.language.LamaLanguage;
import ru.mse.itmo.lama.language.psi.LamaTypes;

public class LamaPatternProvider {
    public static ElementPattern<PsiElement> getForKeyword() {
        return PlatformPatterns
                .psiElement()
                .withLanguage(LamaLanguage.INSTANCE)
                .andNot(getForLineComment())
                .andNot(getForBlockComment());
    }

    private static ElementPattern<PsiElement> getForLineComment() {
        return PlatformPatterns.psiElement(LamaTypes.SINGLECOMMENT);
    }

    private static ElementPattern<PsiElement> getForBlockComment() {
        return PlatformPatterns.psiElement(LamaTypes.MULTICOMMENT);
    }
}
