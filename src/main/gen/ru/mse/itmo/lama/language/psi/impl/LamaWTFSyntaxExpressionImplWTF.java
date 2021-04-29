// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.LamaWTFSyntaxExpression;
import ru.mse.itmo.lama.language.psi.LamaWTFSyntaxSeq;
import ru.mse.itmo.lama.language.psi.LamaWTFVisitor;

import java.util.List;

public class LamaWTFSyntaxExpressionImplWTF extends ASTWrapperPsiElement implements LamaWTFSyntaxExpression {

  public LamaWTFSyntaxExpressionImplWTF(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitSyntaxExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LamaWTFSyntaxSeq> getSyntaxSeqList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LamaWTFSyntaxSeq.class);
  }

}
