// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.LamaWTFBasicExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVariableDefinitionItem;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import static ru.mse.itmo.lama.language.psi.LamaTypes.LIDENT;

public class LamaWTFVariableDefinitionItemImplWTF extends ASTWrapperPsiElement implements LamaWTFVariableDefinitionItem {

  public LamaWTFVariableDefinitionItemImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitVariableDefinitionItem(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LamaWTFBasicExpression getBasicExpression() {
    return findChildByClass(LamaWTFBasicExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getLident() {
    return findNotNullChildByType(LIDENT);
  }

}
