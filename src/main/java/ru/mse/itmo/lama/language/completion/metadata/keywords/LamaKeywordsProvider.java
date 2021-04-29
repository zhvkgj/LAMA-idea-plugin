package ru.mse.itmo.lama.language.completion.metadata.keywords;

import com.intellij.codeInsight.lookup.LookupElement;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LamaKeywordsProvider {
    public Collection<String> getLamaKeywordsAsStrings() {
        return new HashSet<>(Arrays.asList("after", "esac", "infixl",
                "syntax", "array", "eta", "infixr", "then", "at", "false",
                "lazy", "true", "before", "fi", "od", "val", "box", "for",
                "of", "var", "case", "fun", "public", "while", "do", "if",
                "sexp", "elif", "import", "skip", "else", "infix", "str"));
    }

    public List<LookupElement> getKeywordsLookupElements() {
        return this.getLamaKeywordsAsStrings().stream()
                .map(LamaElementKeyword::new)
                .map(LamaElementKeyword::getLookupElement)
                .collect(Collectors.toList());
    }
}
