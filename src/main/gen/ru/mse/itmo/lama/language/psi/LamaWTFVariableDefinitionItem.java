// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface LamaWTFVariableDefinitionItem extends PsiElement {

  @Nullable
  LamaWTFBasicExpression getBasicExpression();

  @NotNull
  LamaWTFVariableUsage getVariableUsage();

}
