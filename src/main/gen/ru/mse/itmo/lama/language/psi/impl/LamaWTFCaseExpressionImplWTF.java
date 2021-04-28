// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFCaseBranches;
import ru.mse.itmo.lama.language.psi.LamaWTFCaseExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

public class LamaWTFCaseExpressionImplWTF extends ASTWrapperPsiElement implements LamaWTFCaseExpression {

  public LamaWTFCaseExpressionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitCaseExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LamaWTFCaseBranches getCaseBranches() {
    return findNotNullChildByClass(LamaWTFCaseBranches.class);
  }

  @Override
  @NotNull
  public LamaWTFExpression getExpression() {
    return findNotNullChildByClass(LamaWTFExpression.class);
  }

}
