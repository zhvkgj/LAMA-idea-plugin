// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.LamaWTFConsPattern;
import ru.mse.itmo.lama.language.psi.LamaWTFPattern;
import ru.mse.itmo.lama.language.psi.LamaWTFSimplePattern;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

public class LamaWTFPatternImplWTF extends ASTWrapperPsiElement implements LamaWTFPattern {

  public LamaWTFPatternImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitPattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LamaWTFConsPattern getConsPattern() {
    return findChildByClass(LamaWTFConsPattern.class);
  }

  @Override
  @Nullable
  public LamaWTFSimplePattern getSimplePattern() {
    return findChildByClass(LamaWTFSimplePattern.class);
  }

}
