// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFSExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import java.util.List;

import static ru.mse.itmo.lama.language.psi.LamaTypes.UIDENT;

public class LamaWTFSExpressionImplWTF extends ASTWrapperPsiElement implements LamaWTFSExpression {

  public LamaWTFSExpressionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitSExpression(this);
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
  public PsiElement getUident() {
    return findNotNullChildByType(UIDENT);
  }

}
