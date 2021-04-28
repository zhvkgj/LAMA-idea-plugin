// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFArrayIndexing;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFPostfixExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

public class LamaWTFArrayIndexingImplWTF extends LamaWTFPostfixExpressionImplWTF implements LamaWTFArrayIndexing {

  public LamaWTFArrayIndexingImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitArrayIndexing(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LamaWTFExpression getExpression() {
    return findNotNullChildByClass(LamaWTFExpression.class);
  }

  @Override
  @NotNull
  public LamaWTFPostfixExpression getPostfixExpression() {
    return findNotNullChildByClass(LamaWTFPostfixExpression.class);
  }

}
