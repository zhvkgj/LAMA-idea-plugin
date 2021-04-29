package ru.mse.itmo.lama.language.highlighting;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.LamaTypes;

public class PairedBrackets implements PairedBraceMatcher {
    private final static BracePair[] BRACE_PAIRS = new BracePair[]{
            // paired keywords
            new BracePair(LamaTypes.DO, LamaTypes.OD, true),
            new BracePair(LamaTypes.CASE, LamaTypes.ESAC, true),
            new BracePair(LamaTypes.IF, LamaTypes.FI, true),

            // brackets
            new BracePair(LamaTypes.LB, LamaTypes.RB, true),
            new BracePair(LamaTypes.LCURLY, LamaTypes.RCURLY, true),
            new BracePair(LamaTypes.LSQUARE, LamaTypes.RSQUARE, true)
    };

    @Override
    public BracePair @NotNull [] getPairs() {
        return BRACE_PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return 0;
    }
}
