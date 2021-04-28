// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lama.language.psi.ref.LamaElem;

public class LamaWTFVisitor extends PsiElementVisitor {

  public void visitArrayExpression(@NotNull LamaWTFArrayExpression o) {
    visitPsiElement(o);
  }

  public void visitArrayIndexing(@NotNull LamaWTFArrayIndexing o) {
    visitPostfixExpression(o);
  }

  public void visitArrayPattern(@NotNull LamaWTFArrayPattern o) {
    visitPsiElement(o);
  }

  public void visitBasicExpression(@NotNull LamaWTFBasicExpression o) {
    visitPsiElement(o);
  }

  public void visitBinaryExpression(@NotNull LamaWTFBinaryExpression o) {
    visitBasicExpression(o);
  }

  public void visitBinaryOperand(@NotNull LamaWTFBinaryOperand o) {
    visitBasicExpression(o);
  }

  public void visitCaseBranch(@NotNull LamaWTFCaseBranch o) {
    visitPsiElement(o);
  }

  public void visitCaseBranches(@NotNull LamaWTFCaseBranches o) {
    visitPsiElement(o);
  }

  public void visitCaseExpression(@NotNull LamaWTFCaseExpression o) {
    visitPsiElement(o);
  }

  public void visitConsPattern(@NotNull LamaWTFConsPattern o) {
    visitPsiElement(o);
  }

  public void visitDefinition(@NotNull LamaWTFDefinition o) {
    visitPsiElement(o);
  }

  public void visitDoWhileExpression(@NotNull LamaWTFDoWhileExpression o) {
    visitPsiElement(o);
  }

  public void visitElsePart(@NotNull LamaWTFElsePart o) {
    visitPsiElement(o);
  }

  public void visitExpression(@NotNull LamaWTFExpression o) {
    visitLamaElem(o);
  }

  public void visitForExpression(@NotNull LamaWTFForExpression o) {
    visitPsiElement(o);
  }

  public void visitFunctionArguments(@NotNull LamaWTFFunctionArguments o) {
    visitPsiElement(o);
  }

  public void visitFunctionBody(@NotNull LamaWTFFunctionBody o) {
    visitPsiElement(o);
  }

  public void visitFunctionCall(@NotNull LamaWTFFunctionCall o) {
    visitPostfixExpression(o);
  }

  public void visitFunctionDefinition(@NotNull LamaWTFFunctionDefinition o) {
    visitPsiElement(o);
  }

  public void visitIfExpression(@NotNull LamaWTFIfExpression o) {
    visitPsiElement(o);
  }

  public void visitImportRule(@NotNull LamaWTFImportRule o) {
    visitPsiElement(o);
  }

  public void visitInfixDefinition(@NotNull LamaWTFInfixDefinition o) {
    visitPsiElement(o);
  }

  public void visitInfixHead(@NotNull LamaWTFInfixHead o) {
    visitPsiElement(o);
  }

  public void visitInfixity(@NotNull LamaWTFInfixity o) {
    visitPsiElement(o);
  }

  public void visitLevel(@NotNull LamaWTFLevel o) {
    visitPsiElement(o);
  }

  public void visitListExpression(@NotNull LamaWTFListExpression o) {
    visitPsiElement(o);
  }

  public void visitListPattern(@NotNull LamaWTFListPattern o) {
    visitPsiElement(o);
  }

  public void visitPattern(@NotNull LamaWTFPattern o) {
    visitPsiElement(o);
  }

  public void visitPostfixExpression(@NotNull LamaWTFPostfixExpression o) {
    visitPsiElement(o);
  }

  public void visitPrimary(@NotNull LamaWTFPrimary o) {
    visitPostfixExpression(o);
  }

  public void visitSExprPattern(@NotNull LamaWTFSExprPattern o) {
    visitPsiElement(o);
  }

  public void visitSExpression(@NotNull LamaWTFSExpression o) {
    visitPsiElement(o);
  }

  public void visitScopeExpression(@NotNull LamaWTFScopeExpression o) {
    visitPsiElement(o);
  }

  public void visitSimplePattern(@NotNull LamaWTFSimplePattern o) {
    visitPsiElement(o);
  }

  public void visitVariableDefinition(@NotNull LamaWTFVariableDefinition o) {
    visitPsiElement(o);
  }

  public void visitVariableDefinitionItem(@NotNull LamaWTFVariableDefinitionItem o) {
    visitPsiElement(o);
  }

  public void visitVariableDefinitionSeq(@NotNull LamaWTFVariableDefinitionSeq o) {
    visitPsiElement(o);
  }

  public void visitWhileDoExpression(@NotNull LamaWTFWhileDoExpression o) {
    visitPsiElement(o);
  }

  public void visitWildcardPattern(@NotNull LamaWTFWildcardPattern o) {
    visitPsiElement(o);
  }

  public void visitLamaElem(@NotNull LamaElem o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
