package ru.mse.itmo.lama.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import ru.mse.itmo.lama.language.LamaFileType;
import ru.mse.itmo.lama.language.LamaLanguage;
import org.jetbrains.annotations.NotNull;

public class LamaFile extends PsiFileBase {

    public LamaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, LamaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return LamaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Lama super file!";
    }

}