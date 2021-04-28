// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFFunctionCall;
import ru.mse.itmo.lama.language.psi.LamaWTFPostfixExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import java.util.List;

public class LamaWTFFunctionCallImplWTF extends LamaWTFPostfixExpressionImplWTF implements LamaWTFFunctionCall {

  public LamaWTFFunctionCallImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitFunctionCall(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LamaWTFExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LamaWTFExpression.class);
  }

  @Override
  @NotNull
  public LamaWTFPostfixExpression getPostfixExpression() {
    return findNotNullChildByClass(LamaWTFPostfixExpression.class);
  }

}
