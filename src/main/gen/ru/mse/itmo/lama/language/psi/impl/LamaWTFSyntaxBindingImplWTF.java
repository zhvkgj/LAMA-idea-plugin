// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFBasicExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFBinaryExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import java.util.List;

import static ru.mse.itmo.lama.language.psi.LamaTypes.INFIXOP;

public class LamaWTFBinaryExpressionImplWTF extends LamaWTFBasicExpressionImplWTF implements LamaWTFBinaryExpression {

  public LamaWTFBinaryExpressionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitBinaryExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LamaWTFBasicExpression> getBasicExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LamaWTFBasicExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getInfixop() {
    return findNotNullChildByType(INFIXOP);
  }

}
