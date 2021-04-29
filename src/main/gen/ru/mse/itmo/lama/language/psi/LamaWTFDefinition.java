// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.Nullable;

public interface LamaWTFDefinition extends PsiElement {

  @Nullable
  LamaWTFFunctionDefinition getFunctionDefinition();

  @Nullable
  LamaWTFInfixDefinition getInfixDefinition();

  @Nullable
  LamaWTFVariableDefinition getVariableDefinition();

  String getKey();

  String getValue();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

}
