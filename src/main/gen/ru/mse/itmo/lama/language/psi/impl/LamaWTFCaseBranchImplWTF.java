// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.mse.itmo.lama.language.psi.LamaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ru.mse.itmo.lama.language.psi.*;

public class LamaWTFCaseBranchImplWTF extends ASTWrapperPsiElement implements LamaWTFCaseBranch {

  public LamaWTFCaseBranchImplWTF(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitCaseBranch(this);
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
  public LamaWTFScopeExpression getScopeExpression() {
    return findNotNullChildByClass(LamaWTFScopeExpression.class);
  }

}
