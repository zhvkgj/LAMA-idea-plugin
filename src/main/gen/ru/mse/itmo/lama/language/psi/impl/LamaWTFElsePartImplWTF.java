// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.LamaWTFElsePart;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFScopeExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

public class LamaWTFElsePartImplWTF extends ASTWrapperPsiElement implements LamaWTFElsePart {

  public LamaWTFElsePartImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitElsePart(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LamaWTFElsePart getElsePart() {
    return findChildByClass(LamaWTFElsePart.class);
  }

  @Override
  @Nullable
  public LamaWTFExpression getExpression() {
    return findChildByClass(LamaWTFExpression.class);
  }

  @Override
  @NotNull
  public LamaWTFScopeExpression getScopeExpression() {
    return findNotNullChildByClass(LamaWTFScopeExpression.class);
  }

}
