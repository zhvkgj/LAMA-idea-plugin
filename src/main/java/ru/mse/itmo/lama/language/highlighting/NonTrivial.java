package ru.mse.itmo.lama.language.highlighting;

import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter;
import com.intellij.lang.BracePair;
import com.intellij.openapi.editor.highlighter.HighlighterIterator;
import com.intellij.openapi.fileTypes.FileType;
import ru.mse.itmo.lama.language.LamaLanguage;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;

public class NonTrivial extends PairedBraceMatcherAdapter {
    private final ArrayList<BracePair> PAIRS = new ArrayList<>(Arrays.asList(getPairs()));

    public NonTrivial() {
        super(new PairedBrackets(), LamaLanguage.INSTANCE);
    }

    @Nullable
    @Override
    public BracePair findPair(boolean left, HighlighterIterator iterator, CharSequence fileText, FileType fileType) {
        BracePair pair = super.findPair(left, iterator, fileText, fileType);

        if (PAIRS.contains(pair)) {
            iterator.advance();
            iterator.retreat();
        }

        return pair;
    }
}
