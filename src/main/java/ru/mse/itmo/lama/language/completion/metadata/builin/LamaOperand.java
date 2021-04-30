package ru.mse.itmo.lama.language.completion.metadata.builin;

import com.intellij.codeInsight.completion.util.ParenthesesInsertHandler;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import ru.mse.itmo.lama.language.completion.metadata.LamaElement;

public class LamaOperand implements LamaElement {
    private final String name;
    private final String signature;

    LamaOperand(String name, String signature) {
        this.name = name;
        this.signature = signature;
    }

    @Override
    public LookupElement getLookupElement() {
        return LookupElementBuilder
                .create(name)
                .withTailText(signature);
    }
}