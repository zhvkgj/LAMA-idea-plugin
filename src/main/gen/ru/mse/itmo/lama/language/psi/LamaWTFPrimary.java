// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface LamaWTFPrimary extends LamaWTFPostfixExpression {

  @Nullable
  LamaWTFArrayExpression getArrayExpression();

  @Nullable
  LamaWTFCaseExpression getCaseExpression();

  @Nullable
  LamaWTFDoWhileExpression getDoWhileExpression();

  @Nullable
  LamaWTFForExpression getForExpression();

  @Nullable
  LamaWTFFunctionArguments getFunctionArguments();

  @Nullable
  LamaWTFFunctionBody getFunctionBody();

  @Nullable
  LamaWTFIfExpression getIfExpression();

  @Nullable
  LamaWTFListExpression getListExpression();

  @Nullable
  LamaWTFSExpression getSExpression();

  @Nullable
  LamaWTFScopeExpression getScopeExpression();

  @Nullable
  LamaWTFSyntaxExpression getSyntaxExpression();

  @Nullable
  LamaWTFVariableUsage getVariableUsage();

  @Nullable
  LamaWTFWhileDoExpression getWhileDoExpression();

  @Nullable
  PsiElement getChar();

  @Nullable
  PsiElement getDecimal();

  @Nullable
  PsiElement getInfixop();

  @Nullable
  PsiElement getString();

}
