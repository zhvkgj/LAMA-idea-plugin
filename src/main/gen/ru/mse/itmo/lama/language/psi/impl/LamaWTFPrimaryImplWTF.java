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

public class LamaWTFPrimaryImplWTF extends ASTWrapperPsiElement implements LamaWTFPrimary {

  public LamaWTFPrimaryImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitPrimary(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LamaWTFArrayExpression getArrayExpression() {
    return findChildByClass(LamaWTFArrayExpression.class);
  }

  @Override
  @Nullable
  public LamaWTFIfExpression getIfExpression() {
    return findChildByClass(LamaWTFIfExpression.class);
  }

  @Override
  @Nullable
  public LamaWTFListExpression getListExpression() {
    return findChildByClass(LamaWTFListExpression.class);
  }

  @Override
  @Nullable
  public LamaWTFSExpression getSExpression() {
    return findChildByClass(LamaWTFSExpression.class);
  }

  @Override
  @Nullable
  public LamaWTFWhileDoExpression getWhileDoExpression() {
    return findChildByClass(LamaWTFWhileDoExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getChar() {
    return findChildByType(CHAR);
  }

  @Override
  @Nullable
  public PsiElement getDecimal() {
    return findChildByType(DECIMAL);
  }

  @Override
  @Nullable
  public PsiElement getLident() {
    return findChildByType(LIDENT);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

}
