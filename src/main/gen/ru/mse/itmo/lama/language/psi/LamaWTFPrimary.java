// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

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
  LamaWTFWhileDoExpression getWhileDoExpression();

  @Nullable
  PsiElement getChar();

  @Nullable
  PsiElement getDecimal();

  @Nullable
  PsiElement getInfixop();

  @Nullable
  PsiElement getLident();

  @Nullable
  PsiElement getString();

}