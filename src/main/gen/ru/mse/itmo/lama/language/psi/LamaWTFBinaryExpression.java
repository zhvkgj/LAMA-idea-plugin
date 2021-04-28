// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LamaWTFBinaryExpression extends LamaWTFBasicExpression {

  @NotNull
  List<LamaWTFBasicExpression> getBasicExpressionList();

  @NotNull
  PsiElement getInfixop();

}
