// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LamaWTFSimplePattern extends PsiElement {

  @Nullable
  LamaWTFArrayPattern getArrayPattern();

  @Nullable
  LamaWTFListPattern getListPattern();

  @Nullable
  LamaWTFPattern getPattern();

  @Nullable
  LamaWTFSExprPattern getSExprPattern();

  @Nullable
  LamaWTFWildcardPattern getWildcardPattern();

  @Nullable
  PsiElement getChar();

  @Nullable
  PsiElement getDecimal();

  @Nullable
  PsiElement getLident();

  @Nullable
  PsiElement getString();

}
