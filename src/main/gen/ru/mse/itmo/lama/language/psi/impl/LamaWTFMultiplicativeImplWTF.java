// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFCustomOperatorExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFMultiplicative;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import java.util.List;

public class LamaWTFMultiplicativeImplWTF extends ASTWrapperPsiElement implements LamaWTFMultiplicative {

  public LamaWTFMultiplicativeImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitMultiplicative(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LamaWTFCustomOperatorExpression> getCustomOperatorExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LamaWTFCustomOperatorExpression.class);
  }

}
