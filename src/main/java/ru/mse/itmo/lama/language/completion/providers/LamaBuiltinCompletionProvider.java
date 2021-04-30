package ru.mse.itmo.lama.language.completion.providers;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.codeInsight.completion.util.ParenthesesInsertHandler;
import com.intellij.patterns.ElementPattern;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.LamaLanguage;
import ru.mse.itmo.lama.language.completion.metadata.builin.LamaStdLibFunctionsProvider;
import ru.mse.itmo.lama.language.completion.providers.patterns.LamaPatternProvider;

public class LamaBuiltinCompletionProvider extends CompletionProvider<CompletionParameters> {
    public static final ElementPattern<PsiElement> PATTERN = LamaPatternProvider.getForBuiltIn();

    private static final LamaStdLibFunctionsProvider functionProvider = new LamaStdLibFunctionsProvider();

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters, @NotNull ProcessingContext context, @NotNull CompletionResultSet result) {
        result.addAllElements(functionProvider.getFunctions());
    }
}
