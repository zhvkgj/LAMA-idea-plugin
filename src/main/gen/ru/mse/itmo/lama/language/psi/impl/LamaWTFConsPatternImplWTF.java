// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFConsPattern;
import ru.mse.itmo.lama.language.psi.LamaWTFPattern;
import ru.mse.itmo.lama.language.psi.LamaWTFSimplePattern;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

public class LamaWTFConsPatternImplWTF extends ASTWrapperPsiElement implements LamaWTFConsPattern {

  public LamaWTFConsPatternImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitConsPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LamaWTFPattern getPattern() {
    return findNotNullChildByClass(LamaWTFPattern.class);
  }

  @Override
  @NotNull
  public LamaWTFSimplePattern getSimplePattern() {
    return findNotNullChildByClass(LamaWTFSimplePattern.class);
  }

}
