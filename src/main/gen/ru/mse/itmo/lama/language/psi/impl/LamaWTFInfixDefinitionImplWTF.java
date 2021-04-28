// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.*;

public class LamaWTFInfixDefinitionImplWTF extends ASTWrapperPsiElement implements LamaWTFInfixDefinition {

  public LamaWTFInfixDefinitionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitInfixDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LamaWTFFunctionArguments getFunctionArguments() {
    return findNotNullChildByClass(LamaWTFFunctionArguments.class);
  }

  @Override
  @NotNull
  public LamaWTFFunctionBody getFunctionBody() {
    return findNotNullChildByClass(LamaWTFFunctionBody.class);
  }

  @Override
  @NotNull
  public LamaWTFInfixHead getInfixHead() {
    return findNotNullChildByClass(LamaWTFInfixHead.class);
  }

}
