// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFScopeExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;
import ru.mse.itmo.lama.language.psi.LamaWTFWhileDoExpression;

public class LamaWTFWhileDoExpressionImplWTF extends ASTWrapperPsiElement implements LamaWTFWhileDoExpression {

  public LamaWTFWhileDoExpressionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitWhileDoExpression(this);
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
  public LamaWTFScopeExpression getScopeExpression() {
    return findNotNullChildByClass(LamaWTFScopeExpression.class);
  }

}
