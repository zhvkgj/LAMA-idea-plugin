// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

public interface LamaWTFVariableUsage extends PsiElement {

  @NotNull
  PsiElement getLident();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
