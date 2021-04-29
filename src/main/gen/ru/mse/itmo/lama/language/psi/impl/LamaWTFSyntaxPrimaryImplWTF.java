// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFSyntaxExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFSyntaxPrimary;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import java.util.List;

import static ru.mse.itmo.lama.language.psi.LamaTypes.LIDENT;

public class LamaWTFSyntaxPrimaryImplWTF extends ASTWrapperPsiElement implements LamaWTFSyntaxPrimary {

  public LamaWTFSyntaxPrimaryImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitSyntaxPrimary(this);
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
  @Nullable
  public LamaWTFSyntaxExpression getSyntaxExpression() {
    return findChildByClass(LamaWTFSyntaxExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getLident() {
    return findChildByType(LIDENT);
  }

}
