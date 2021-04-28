// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFBasicExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

public class LamaWTFBasicExpressionImplWTF extends ASTWrapperPsiElement implements LamaWTFBasicExpression {

  public LamaWTFBasicExpressionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitBasicExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LamaWTFDisjunction getDisjunction() {
    return findNotNullChildByClass(LamaWTFDisjunction.class);
  }

}
