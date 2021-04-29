package ru.mse.itmo.lama.language;

import com.intellij.lexer.FlexAdapter;

public class LamaLexerAdapter extends FlexAdapter {
    public LamaLexerAdapter() {
        super(new _LamaLexer(null));
    }
}
