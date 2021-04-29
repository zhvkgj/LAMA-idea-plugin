// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.LamaWTFPattern;
import ru.mse.itmo.lama.language.psi.LamaWTFSyntaxBinding;
import ru.mse.itmo.lama.language.psi.LamaWTFSyntaxPostfix;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

public class LamaWTFSyntaxBindingImplWTF extends ASTWrapperPsiElement implements LamaWTFSyntaxBinding {

  public LamaWTFSyntaxBindingImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitSyntaxBinding(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LamaWTFPattern getPattern() {
    return findChildByClass(LamaWTFPattern.class);
  }

  @Override
  @NotNull
  public LamaWTFSyntaxPostfix getSyntaxPostfix() {
    return findNotNullChildByClass(LamaWTFSyntaxPostfix.class);
  }

}
