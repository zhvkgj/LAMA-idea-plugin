package ru.mse.itmo.lama.language.completion.metadata.keywords;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import ru.mse.itmo.lama.language.completion.metadata.LamaElement;

public class LamaElementKeyword implements LamaElement {
    private final String keywordStringRepresentation;

    public LamaElementKeyword(String keywordStringRepresentation) {
        this.keywordStringRepresentation = keywordStringRepresentation;
    }

    @Override
    public LookupElement getLookupElement() {
        return LookupElementBuilder.create(this.keywordStringRepresentation).bold();
    }
}
