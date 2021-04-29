package ru.mse.itmo.lama.language.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import ru.mse.itmo.lama.language.LamaLexerAdapter;
import ru.mse.itmo.lama.language.psi.LamaTypes;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class LamaSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Set<IElementType> LAMA_KEYWORD_TYPES =
            Set.of(
                    LamaTypes.AFTER,
                    LamaTypes.ESAC,
                    LamaTypes.INFIXL,
                    LamaTypes.SYNTAX,
                    LamaTypes.ARRAY,
                    LamaTypes.ETA,
                    LamaTypes.INFIXR,
                    LamaTypes.THEN,
                    LamaTypes.AT,
                    LamaTypes.FALSE,
                    LamaTypes.LAZY,
                    LamaTypes.TRUE,
                    LamaTypes.BEFORE,
                    LamaTypes.FI,
                    LamaTypes.OD,
                    LamaTypes.VAL,
                    LamaTypes.BOX,
                    LamaTypes.FOR,
                    LamaTypes.OF,
                    LamaTypes.VAR,
                    LamaTypes.CASE,
                    LamaTypes.FUN,
                    LamaTypes.PUBLIC,
                    LamaTypes.WHILE,
                    LamaTypes.DO,
                    LamaTypes.IF,
                    LamaTypes.SEXP,
                    LamaTypes.ELIF,
                    LamaTypes.IMPORT,
                    LamaTypes.SKIP,
                    LamaTypes.ELSE,
                    LamaTypes.INFIX,
                    LamaTypes.STR
            );

    public static final TextAttributesKey SINGLECOMMENT_ = createTextAttributesKey("LAMA_SINGLECOMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey MULTICOMMENT_ = createTextAttributesKey("LAMA_MULTICOMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey KEYWORD_ = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING_ = createTextAttributesKey("LAMA_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey LIDENT_ = createTextAttributesKey("LAMA_LIDENT", DefaultLanguageHighlighterColors.IDENTIFIER);
    // FIXME: find another color
    public static final TextAttributesKey UIDENT_ = createTextAttributesKey("LAMA_UIDENT", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey DECIMAL_ = createTextAttributesKey("LAMA_DECIMAL", DefaultLanguageHighlighterColors.NUMBER);

    private static final TextAttributesKey[] SINGLECOMMENT_KEYS = new TextAttributesKey[]{SINGLECOMMENT_};
    private static final TextAttributesKey[] MULTICOMMENT_KEYS = new TextAttributesKey[]{MULTICOMMENT_};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD_};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING_};
    private static final TextAttributesKey[] LIDENT_KEYS = new TextAttributesKey[]{LIDENT_};
    private static final TextAttributesKey[] UIDENT_KEYS = new TextAttributesKey[]{UIDENT_};
    private static final TextAttributesKey[] DECIMAL_KEYS = new TextAttributesKey[]{DECIMAL_};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new LamaLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(LamaTypes.SINGLECOMMENT)) {
            return SINGLECOMMENT_KEYS;
        } else if (tokenType.equals(LamaTypes.MULTICOMMENT)) {
            return MULTICOMMENT_KEYS;
        } else if (LAMA_KEYWORD_TYPES.contains(tokenType)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(LamaTypes.STRING) || tokenType.equals(LamaTypes.CHAR)) {
            return STRING_KEYS;
        } else if (tokenType.equals(LamaTypes.LIDENT)) {
            return LIDENT_KEYS;
        } else if (tokenType.equals(LamaTypes.UIDENT)) {
            return UIDENT_KEYS;
        } else if (tokenType.equals(LamaTypes.DECIMAL)) {
            return DECIMAL_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
