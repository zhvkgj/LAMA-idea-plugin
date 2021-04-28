// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFInfixHead;
import ru.mse.itmo.lama.language.psi.LamaWTFInfixity;
import ru.mse.itmo.lama.language.psi.LamaWTFLevel;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import static ru.mse.itmo.lama.language.psi.LamaTypes.INFIXOP;

public class LamaWTFInfixHeadImplWTF extends ASTWrapperPsiElement implements LamaWTFInfixHead {

  public LamaWTFInfixHeadImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitInfixHead(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LamaWTFInfixity getInfixity() {
    return findNotNullChildByClass(LamaWTFInfixity.class);
  }

  @Override
  @NotNull
  public LamaWTFLevel getLevel() {
    return findNotNullChildByClass(LamaWTFLevel.class);
  }

  @Override
  @NotNull
  public PsiElement getInfixop() {
    return findNotNullChildByType(INFIXOP);
  }

}
