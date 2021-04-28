// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.LamaWTFBasicExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;
import ru.mse.itmo.lama.language.psi.ref.impl.LamaElemImpl;
import ru.mse.itmo.lama.language.psi.ref.impl.LamaParserUtil;

public class LamaWTFExpressionImplWTF extends LamaElemImpl implements LamaWTFExpression {

  public LamaWTFExpressionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LamaWTFBasicExpression getBasicExpression() {
    return findNotNullChildByClass(LamaWTFBasicExpression.class);
  }

  @Override
  @Nullable
  public LamaWTFExpression getExpression() {
    return findChildByClass(LamaWTFExpression.class);
  }

  @Override
  public String getKey() {
    return LamaParserUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return LamaParserUtil.getValue(this);
  }

  @Override
  public String getName() {
    return LamaParserUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return LamaParserUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return LamaParserUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return LamaParserUtil.getPresentation(this);
  }

}
