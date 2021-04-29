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

public class LamaWTFDisjunctionImplWTF extends ASTWrapperPsiElement implements LamaWTFDisjunction {

  public LamaWTFDisjunctionImplWTF(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LamaWTFVisitor visitor) {
    visitor.visitDisjunction(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LamaWTFVisitor) accept((LamaWTFVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LamaWTFConjunction> getConjunctionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LamaWTFConjunction.class);
  }

}
