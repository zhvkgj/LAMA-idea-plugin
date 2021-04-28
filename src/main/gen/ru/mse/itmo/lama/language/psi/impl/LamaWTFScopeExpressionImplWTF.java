// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.LamaWTFDefinition;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFScopeExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import java.util.List;

public class LamaWTFScopeExpressionImplWTF extends ASTWrapperPsiElement implements LamaWTFScopeExpression {

  public LamaWTFScopeExpressionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitScopeExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LamaWTFDefinition> getDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LamaWTFDefinition.class);
  }

  @Override
  @Nullable
  public LamaWTFExpression getExpression() {
    return findChildByClass(LamaWTFExpression.class);
  }

}
