// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LamaWTFSExprPattern extends PsiElement {

  @NotNull
  List<LamaWTFPattern> getPatternList();

  @NotNull
  PsiElement getUident();

}