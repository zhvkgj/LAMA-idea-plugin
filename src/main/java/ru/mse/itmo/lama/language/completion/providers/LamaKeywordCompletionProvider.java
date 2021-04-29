package ru.mse.itmo.lama.language.completion.providers;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.patterns.ElementPattern;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.completion.metadata.keywords.LamaKeywordsProvider;
import ru.mse.itmo.lama.language.completion.providers.patterns.LamaPatternProvider;

public class LamaKeywordCompletionProvider extends CompletionProvider<CompletionParameters> {
    private static final LamaKeywordsProvider keywordsProvider = new LamaKeywordsProvider();

    public static final ElementPattern<PsiElement> PATTERN = LamaPatternProvider.getForKeyword();

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters,
                                  @NotNull ProcessingContext context,
                                  @NotNull CompletionResultSet result) {
        result.addAllElements(keywordsProvider.getKeywordsLookupElements());
    }
}
