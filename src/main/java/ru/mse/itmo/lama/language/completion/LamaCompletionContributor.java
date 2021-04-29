package ru.mse.itmo.lama.language.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import ru.mse.itmo.lama.language.completion.providers.LamaBuiltinCompletionProvider;
import ru.mse.itmo.lama.language.completion.providers.LamaKeywordCompletionProvider;

public class LamaCompletionContributor extends CompletionContributor {
    public LamaCompletionContributor() {
        extend(CompletionType.BASIC, LamaKeywordCompletionProvider.PATTERN, new LamaKeywordCompletionProvider());

        extend(CompletionType.BASIC, LamaBuiltinCompletionProvider.PATTERN, new LamaBuiltinCompletionProvider());
    }
}
