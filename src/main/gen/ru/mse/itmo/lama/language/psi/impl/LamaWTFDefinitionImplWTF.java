// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.*;
import ru.mse.itmo.lama.language.psi.ref.impl.LamaElemImpl;
import ru.mse.itmo.lama.language.psi.ref.impl.LamaParsersUtil;

public class LamaWTFDefinitionImplWTF extends LamaElemImpl implements LamaWTFDefinition {

  public LamaWTFDefinitionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LamaWTFFunctionDefinition getFunctionDefinition() {
    return findChildByClass(LamaWTFFunctionDefinition.class);
  }

  @Override
  @Nullable
  public LamaWTFInfixDefinition getInfixDefinition() {
    return findChildByClass(LamaWTFInfixDefinition.class);
  }

  @Override
  @Nullable
  public LamaWTFVariableDefinition getVariableDefinition() {
    return findChildByClass(LamaWTFVariableDefinition.class);
  }

  @Override
  public String getKey() {
    return LamaParsersUtil.getKey(this);
  }

  @Override
  public String getValue() {
    return LamaParsersUtil.getValue(this);
  }

  @Override
  public String getName() {
    return LamaParsersUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return LamaParsersUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return LamaParsersUtil.getNameIdentifier(this);
  }

  @Override
  public ItemPresentation getPresentation() {
    return LamaParsersUtil.getPresentation(this);
  }

}
