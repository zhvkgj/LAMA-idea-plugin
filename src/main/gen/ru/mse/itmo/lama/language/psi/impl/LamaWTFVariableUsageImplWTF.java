// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFVariableUsage;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;
import ru.mse.itmo.lama.language.psi.ref.impl.LamaParsersUtil;

import static ru.mse.itmo.lama.language.psi.LamaTypes.LIDENT;

public class LamaWTFVariableUsageImplWTF extends ASTWrapperPsiElement implements LamaWTFVariableUsage {

  public LamaWTFVariableUsageImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitVariableUsage(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getLident() {
    return findNotNullChildByType(LIDENT);
  }

  @Override
  public String getName() {
    return LamaParsersUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return LamaParsersUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return LamaParsersUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return LamaParsersUtil.getPresentation(this);
  }

}
