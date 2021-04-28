// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFFunctionArguments;
import ru.mse.itmo.lama.language.psi.LamaWTFFunctionBody;
import ru.mse.itmo.lama.language.psi.LamaWTFFunctionDefinition;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import static ru.mse.itmo.lama.language.psi.LamaTypes.LIDENT;

public class LamaWTFFunctionDefinitionImplWTF extends ASTWrapperPsiElement implements LamaWTFFunctionDefinition {

  public LamaWTFFunctionDefinitionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitFunctionDefinition(this);
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
  public PsiElement getLident() {
    return findNotNullChildByType(LIDENT);
  }

}
