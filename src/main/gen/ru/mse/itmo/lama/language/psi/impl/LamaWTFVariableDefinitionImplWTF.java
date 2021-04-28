// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFVariableDefinition;
import ru.mse.itmo.lama.language.psi.LamaWTFVariableDefinitionSeq;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

public class LamaWTFVariableDefinitionImplWTF extends ASTWrapperPsiElement implements LamaWTFVariableDefinition {

  public LamaWTFVariableDefinitionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitVariableDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LamaWTFVariableDefinitionSeq getVariableDefinitionSeq() {
    return findNotNullChildByClass(LamaWTFVariableDefinitionSeq.class);
  }

}
