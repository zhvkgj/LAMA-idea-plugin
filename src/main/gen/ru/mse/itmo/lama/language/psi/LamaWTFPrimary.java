// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LamaWTFPrimary extends PsiElement {

  @Nullable
  LamaWTFArrayExpression getArrayExpression();

  @Nullable
  LamaWTFIfExpression getIfExpression();

  @Nullable
  LamaWTFListExpression getListExpression();

  @Nullable
  LamaWTFSExpression getSExpression();

  @Nullable
  LamaWTFWhileDoExpression getWhileDoExpression();

  @Nullable
  PsiElement getChar();

  @Nullable
  PsiElement getDecimal();

  @Nullable
  PsiElement getLident();

  @Nullable
  PsiElement getString();

}
