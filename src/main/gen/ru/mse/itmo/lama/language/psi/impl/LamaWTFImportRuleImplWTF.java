// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFImportRule;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import static ru.mse.itmo.lama.language.psi.LamaTypes.UIDENT;

public class LamaWTFImportRuleImplWTF extends ASTWrapperPsiElement implements LamaWTFImportRule {

  public LamaWTFImportRuleImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitImportRule(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getUident() {
    return findNotNullChildByType(UIDENT);
  }

}
