// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.mse.itmo.lama.language.psi.LamaTypes.*;
import ru.mse.itmo.lama.language.psi.*;

public class LamaWTFArrayIndexingImplWTF extends LamaWTFPostfixExpressionImplWTF implements LamaWTFArrayIndexing {

  public LamaWTFArrayIndexingImplWTF(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitArrayIndexing(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LamaWTFExpression getExpression() {
    return findNotNullChildByClass(LamaWTFExpression.class);
  }

  @Override
  @NotNull
  public LamaWTFPostfixExpression getPostfixExpression() {
    return findNotNullChildByClass(LamaWTFPostfixExpression.class);
  }

}
