package ru.mse.itmo.lama.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LamaFileType extends LanguageFileType {
    public static final LamaFileType INSTANCE = new LamaFileType();

    private LamaFileType() {
        super(LamaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Lama File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Lama language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "lama";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }
}