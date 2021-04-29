package ru.mse.itmo.lama.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.LamaLanguage;

public class LamaTokenType extends IElementType {
    public LamaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, LamaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
