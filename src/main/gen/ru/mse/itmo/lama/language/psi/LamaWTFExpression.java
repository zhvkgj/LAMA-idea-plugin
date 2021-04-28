// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lama.language.psi.ref.LamaElem;

public interface LamaWTFExpression extends LamaElem {

  @NotNull
  LamaWTFBasicExpression getBasicExpression();

  @Nullable
  LamaWTFExpression getExpression();

  String getKey();

  String getValue();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
