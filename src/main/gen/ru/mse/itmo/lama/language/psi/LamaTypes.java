// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.mse.itmo.lama.language.psi.impl.*;

public interface LamaTypes {

  IElementType ARRAY_EXPRESSION = new LamaElementType("ARRAY_EXPRESSION");
  IElementType DEFINITION = new LamaElementType("DEFINITION");
  IElementType ELSE_PART = new LamaElementType("ELSE_PART");
  IElementType EXPRESSION = new LamaElementType("EXPRESSION");
  IElementType FUNCTION_ARGUMENTS = new LamaElementType("FUNCTION_ARGUMENTS");
  IElementType FUNCTION_BODY = new LamaElementType("FUNCTION_BODY");
  IElementType FUNCTION_DEFINITION = new LamaElementType("FUNCTION_DEFINITION");
  IElementType IF_EXPRESSION = new LamaElementType("IF_EXPRESSION");
  IElementType IMPORT_RULE = new LamaElementType("IMPORT_RULE");
  IElementType INFIXITY = new LamaElementType("INFIXITY");
  IElementType INFIX_DEFINITION = new LamaElementType("INFIX_DEFINITION");
  IElementType INFIX_HEAD = new LamaElementType("INFIX_HEAD");
  IElementType LEVEL = new LamaElementType("LEVEL");
  IElementType LIST_EXPRESSION = new LamaElementType("LIST_EXPRESSION");
  IElementType PRIMARY = new LamaElementType("PRIMARY");
  IElementType SCOPE_EXPRESSION = new LamaElementType("SCOPE_EXPRESSION");
  IElementType S_EXPRESSION = new LamaElementType("S_EXPRESSION");
  IElementType VARIABLE_DEFINITION = new LamaElementType("VARIABLE_DEFINITION");
  IElementType VARIABLE_DEFINITION_ITEM = new LamaElementType("VARIABLE_DEFINITION_ITEM");
  IElementType VARIABLE_DEFINITION_SEQ = new LamaElementType("VARIABLE_DEFINITION_SEQ");
  IElementType WHILE_DO_EXPRESSION = new LamaElementType("WHILE_DO_EXPRESSION");

  IElementType AFTER = new LamaTokenType("after");
  IElementType ARRAY = new LamaTokenType("array");
  IElementType AT = new LamaTokenType("at");
  IElementType BEFORE = new LamaTokenType("before");
  IElementType BOX = new LamaTokenType("box");
  IElementType CASE = new LamaTokenType("case");
  IElementType CHAR = new LamaTokenType("char");
  IElementType DECIMAL = new LamaTokenType("decimal");
  IElementType DO = new LamaTokenType("do");
  IElementType ELIF = new LamaTokenType("elif");
  IElementType ELSE = new LamaTokenType("else");
  IElementType ESAC = new LamaTokenType("esac");
  IElementType ETA = new LamaTokenType("eta");
  IElementType FALSE = new LamaTokenType("false");
  IElementType FI = new LamaTokenType("fi");
  IElementType FOR = new LamaTokenType("for");
  IElementType FUN = new LamaTokenType("fun");
  IElementType IF = new LamaTokenType("if");
  IElementType IMPORT = new LamaTokenType("import");
  IElementType INFIX = new LamaTokenType("infix");
  IElementType INFIXL = new LamaTokenType("infixl");
  IElementType INFIXOP = new LamaTokenType("infixop");
  IElementType INFIXR = new LamaTokenType("infixr");
  IElementType LAZY = new LamaTokenType("lazy");
  IElementType LIDENT = new LamaTokenType("lident");
  IElementType MULTICOMMENT = new LamaTokenType("multiComment");
  IElementType OD = new LamaTokenType("od");
  IElementType OF = new LamaTokenType("of");
  IElementType PUBLIC = new LamaTokenType("public");
  IElementType SEXP = new LamaTokenType("sexp");
  IElementType SINGLECOMMENT = new LamaTokenType("singleComment");
  IElementType SKIP = new LamaTokenType("skip");
  IElementType STR = new LamaTokenType("str");
  IElementType STRING = new LamaTokenType("string");
  IElementType SYNTAX = new LamaTokenType("syntax");
  IElementType THEN = new LamaTokenType("then");
  IElementType TRUE = new LamaTokenType("true");
  IElementType UIDENT = new LamaTokenType("uident");
  IElementType VAL = new LamaTokenType("val");
  IElementType VAR = new LamaTokenType("var");
  IElementType WHILE = new LamaTokenType("while");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARRAY_EXPRESSION) {
        return new LamaWTFArrayExpressionImplWTF(node);
      }
      else if (type == DEFINITION) {
        return new LamaWTFDefinitionImplWTF(node);
      }
      else if (type == ELSE_PART) {
        return new LamaWTFElsePartImplWTF(node);
      }
      else if (type == EXPRESSION) {
        return new LamaWTFExpressionImplWTF(node);
      }
      else if (type == FUNCTION_ARGUMENTS) {
        return new LamaWTFFunctionArgumentsImplWTF(node);
      }
      else if (type == FUNCTION_BODY) {
        return new LamaWTFFunctionBodyImplWTF(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new LamaWTFFunctionDefinitionImplWTF(node);
      }
      else if (type == IF_EXPRESSION) {
        return new LamaWTFIfExpressionImplWTF(node);
      }
      else if (type == IMPORT_RULE) {
        return new LamaWTFImportRuleImplWTF(node);
      }
      else if (type == INFIXITY) {
        return new LamaWTFInfixityImplWTF(node);
      }
      else if (type == INFIX_DEFINITION) {
        return new LamaWTFInfixDefinitionImplWTF(node);
      }
      else if (type == INFIX_HEAD) {
        return new LamaWTFInfixHeadImplWTF(node);
      }
      else if (type == LEVEL) {
        return new LamaWTFLevelImplWTF(node);
      }
      else if (type == LIST_EXPRESSION) {
        return new LamaWTFListExpressionImplWTF(node);
      }
      else if (type == PRIMARY) {
        return new LamaWTFPrimaryImplWTF(node);
      }
      else if (type == SCOPE_EXPRESSION) {
        return new LamaWTFScopeExpressionImplWTF(node);
      }
      else if (type == S_EXPRESSION) {
        return new LamaWTFSExpressionImplWTF(node);
      }
      else if (type == VARIABLE_DEFINITION) {
        return new LamaWTFVariableDefinitionImplWTF(node);
      }
      else if (type == VARIABLE_DEFINITION_ITEM) {
        return new LamaWTFVariableDefinitionItemImplWTF(node);
      }
      else if (type == VARIABLE_DEFINITION_SEQ) {
        return new LamaWTFVariableDefinitionSeqImplWTF(node);
      }
      else if (type == WHILE_DO_EXPRESSION) {
        return new LamaWTFWhileDoExpressionImplWTF(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
