package ru.mse.itmo.lama.language.psi.ref;

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVariableDefinition;

public class LamaJavaReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(@NotNull PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(LamaWTFExpression.class),
                new PsiReferenceProvider() {
                    @NotNull
                    @Override
                    public PsiReference[] getReferencesByElement(@NotNull PsiElement element,
                                                                 @NotNull ProcessingContext context) {
                        var sym = (LamaWTFVariableDefinition) element;
                        var value = sym.getVariableDefinitionSeq();
                        var range = value.getTextRange();
                        return new PsiReference[]{new LamaReference(element, range)};
                    }
                });
    }
}
