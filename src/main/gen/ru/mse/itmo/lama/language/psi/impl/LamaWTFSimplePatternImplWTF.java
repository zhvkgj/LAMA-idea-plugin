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

public class LamaWTFSimplePatternImplWTF extends ASTWrapperPsiElement implements LamaWTFSimplePattern {

  public LamaWTFSimplePatternImplWTF(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitSimplePattern(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LamaWTFArrayPattern getArrayPattern() {
    return findChildByClass(LamaWTFArrayPattern.class);
  }

  @Override
  @Nullable
  public LamaWTFListPattern getListPattern() {
    return findChildByClass(LamaWTFListPattern.class);
  }

  @Override
  @Nullable
  public LamaWTFPattern getPattern() {
    return findChildByClass(LamaWTFPattern.class);
  }

  @Override
  @Nullable
  public LamaWTFSExprPattern getSExprPattern() {
    return findChildByClass(LamaWTFSExprPattern.class);
  }

  @Override
  @Nullable
  public LamaWTFWildcardPattern getWildcardPattern() {
    return findChildByClass(LamaWTFWildcardPattern.class);
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
