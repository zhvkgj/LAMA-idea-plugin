// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import ru.mse.itmo.lama.language.psi.impl.*;

public interface LamaTypes {

  IElementType ADDITIVE = new LamaElementType("ADDITIVE");
  IElementType ARRAY_EXPRESSION = new LamaElementType("ARRAY_EXPRESSION");
  IElementType ARRAY_INDEXING = new LamaElementType("ARRAY_INDEXING");
  IElementType ARRAY_PATTERN = new LamaElementType("ARRAY_PATTERN");
  IElementType BASIC_EXPRESSION = new LamaElementType("BASIC_EXPRESSION");
  IElementType CASE_BRANCH = new LamaElementType("CASE_BRANCH");
  IElementType CASE_BRANCHES = new LamaElementType("CASE_BRANCHES");
  IElementType CASE_EXPRESSION = new LamaElementType("CASE_EXPRESSION");
  IElementType COMPARISON = new LamaElementType("COMPARISON");
  IElementType CONJUNCTION = new LamaElementType("CONJUNCTION");
  IElementType CONS_PATTERN = new LamaElementType("CONS_PATTERN");
  IElementType CUSTOM_OPERATOR_EXPRESSION = new LamaElementType("CUSTOM_OPERATOR_EXPRESSION");
  IElementType DEFINITION = new LamaElementType("DEFINITION");
  IElementType DISJUNCTION = new LamaElementType("DISJUNCTION");
  IElementType DOT_NOTATION = new LamaElementType("DOT_NOTATION");
  IElementType DO_WHILE_EXPRESSION = new LamaElementType("DO_WHILE_EXPRESSION");
  IElementType ELSE_PART = new LamaElementType("ELSE_PART");
  IElementType EQUALITY = new LamaElementType("EQUALITY");
  IElementType EXPRESSION = new LamaElementType("EXPRESSION");
  IElementType FOR_EXPRESSION = new LamaElementType("FOR_EXPRESSION");
  IElementType FUNCTION_ARGUMENT = new LamaElementType("FUNCTION_ARGUMENT");
  IElementType FUNCTION_ARGUMENTS = new LamaElementType("FUNCTION_ARGUMENTS");
  IElementType FUNCTION_BODY = new LamaElementType("FUNCTION_BODY");
  IElementType FUNCTION_CALL = new LamaElementType("FUNCTION_CALL");
  IElementType FUNCTION_DEFINITION = new LamaElementType("FUNCTION_DEFINITION");
  IElementType IF_EXPRESSION = new LamaElementType("IF_EXPRESSION");
  IElementType IMPORT_RULE = new LamaElementType("IMPORT_RULE");
  IElementType INFIXITY = new LamaElementType("INFIXITY");
  IElementType INFIX_DEFINITION = new LamaElementType("INFIX_DEFINITION");
  IElementType INFIX_HEAD = new LamaElementType("INFIX_HEAD");
  IElementType LEVEL = new LamaElementType("LEVEL");
  IElementType LIST_EXPRESSION = new LamaElementType("LIST_EXPRESSION");
  IElementType LIST_PATTERN = new LamaElementType("LIST_PATTERN");
  IElementType MULTIPLICATIVE = new LamaElementType("MULTIPLICATIVE");
  IElementType PATTERN = new LamaElementType("PATTERN");
  IElementType POSTFIX_EXPRESSION = new LamaElementType("POSTFIX_EXPRESSION");
  IElementType PRIMARY = new LamaElementType("PRIMARY");
  IElementType SCOPE_EXPRESSION = new LamaElementType("SCOPE_EXPRESSION");
  IElementType SIMPLE_PATTERN = new LamaElementType("SIMPLE_PATTERN");
  IElementType SYNTAX_BINDING = new LamaElementType("SYNTAX_BINDING");
  IElementType SYNTAX_EXPRESSION = new LamaElementType("SYNTAX_EXPRESSION");
  IElementType SYNTAX_POSTFIX = new LamaElementType("SYNTAX_POSTFIX");
  IElementType SYNTAX_PRIMARY = new LamaElementType("SYNTAX_PRIMARY");
  IElementType SYNTAX_SEQ = new LamaElementType("SYNTAX_SEQ");
  IElementType S_EXPRESSION = new LamaElementType("S_EXPRESSION");
  IElementType S_EXPR_PATTERN = new LamaElementType("S_EXPR_PATTERN");
  IElementType VARIABLE_DEFINITION = new LamaElementType("VARIABLE_DEFINITION");
  IElementType VARIABLE_DEFINITION_ITEM = new LamaElementType("VARIABLE_DEFINITION_ITEM");
  IElementType VARIABLE_DEFINITION_SEQ = new LamaElementType("VARIABLE_DEFINITION_SEQ");
  IElementType WHILE_DO_EXPRESSION = new LamaElementType("WHILE_DO_EXPRESSION");
  IElementType WILDCARD_PATTERN = new LamaElementType("WILDCARD_PATTERN");

  IElementType AFTER = new LamaTokenType("after");
  IElementType ALT = new LamaTokenType("|");
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
  IElementType HENCE = new LamaTokenType("->");
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
  IElementType SHARP = new LamaTokenType("#");
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
      if (type == ADDITIVE) {
        return new LamaWTFAdditiveImplWTF(node);
      }
      else if (type == ARRAY_EXPRESSION) {
        return new LamaWTFArrayExpressionImplWTF(node);
      }
      else if (type == ARRAY_INDEXING) {
        return new LamaWTFArrayIndexingImplWTF(node);
      }
      else if (type == ARRAY_PATTERN) {
        return new LamaWTFArrayPatternImplWTF(node);
      }
      else if (type == BASIC_EXPRESSION) {
        return new LamaWTFBasicExpressionImplWTF(node);
      }
      else if (type == CASE_BRANCH) {
        return new LamaWTFCaseBranchImplWTF(node);
      }
      else if (type == CASE_BRANCHES) {
        return new LamaWTFCaseBranchesImplWTF(node);
      }
      else if (type == CASE_EXPRESSION) {
        return new LamaWTFCaseExpressionImplWTF(node);
      }
      else if (type == COMPARISON) {
        return new LamaWTFComparisonImplWTF(node);
      }
      else if (type == CONJUNCTION) {
        return new LamaWTFConjunctionImplWTF(node);
      }
      else if (type == CONS_PATTERN) {
        return new LamaWTFConsPatternImplWTF(node);
      }
      else if (type == CUSTOM_OPERATOR_EXPRESSION) {
        return new LamaWTFCustomOperatorExpressionImplWTF(node);
      }
      else if (type == DEFINITION) {
        return new LamaWTFDefinitionImplWTF(node);
      }
      else if (type == DISJUNCTION) {
        return new LamaWTFDisjunctionImplWTF(node);
      }
      else if (type == DOT_NOTATION) {
        return new LamaWTFDotNotationImplWTF(node);
      }
      else if (type == DO_WHILE_EXPRESSION) {
        return new LamaWTFDoWhileExpressionImplWTF(node);
      }
      else if (type == ELSE_PART) {
        return new LamaWTFElsePartImplWTF(node);
      }
      else if (type == EQUALITY) {
        return new LamaWTFEqualityImplWTF(node);
      }
      else if (type == EXPRESSION) {
        return new LamaWTFExpressionImplWTF(node);
      }
      else if (type == FOR_EXPRESSION) {
        return new LamaWTFForExpressionImplWTF(node);
      }
      else if (type == FUNCTION_ARGUMENT) {
        return new LamaWTFFunctionArgumentImplWTF(node);
      }
      else if (type == FUNCTION_ARGUMENTS) {
        return new LamaWTFFunctionArgumentsImplWTF(node);
      }
      else if (type == FUNCTION_BODY) {
        return new LamaWTFFunctionBodyImplWTF(node);
      }
      else if (type == FUNCTION_CALL) {
        return new LamaWTFFunctionCallImplWTF(node);
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
      else if (type == LIST_PATTERN) {
        return new LamaWTFListPatternImplWTF(node);
      }
      else if (type == MULTIPLICATIVE) {
        return new LamaWTFMultiplicativeImplWTF(node);
      }
      else if (type == PATTERN) {
        return new LamaWTFPatternImplWTF(node);
      }
      else if (type == PRIMARY) {
        return new LamaWTFPrimaryImplWTF(node);
      }
      else if (type == SCOPE_EXPRESSION) {
        return new LamaWTFScopeExpressionImplWTF(node);
      }
      else if (type == SIMPLE_PATTERN) {
        return new LamaWTFSimplePatternImplWTF(node);
      }
      else if (type == SYNTAX_BINDING) {
        return new LamaWTFSyntaxBindingImplWTF(node);
      }
      else if (type == SYNTAX_EXPRESSION) {
        return new LamaWTFSyntaxExpressionImplWTF(node);
      }
      else if (type == SYNTAX_POSTFIX) {
        return new LamaWTFSyntaxPostfixImplWTF(node);
      }
      else if (type == SYNTAX_PRIMARY) {
        return new LamaWTFSyntaxPrimaryImplWTF(node);
      }
      else if (type == SYNTAX_SEQ) {
        return new LamaWTFSyntaxSeqImplWTF(node);
      }
      else if (type == S_EXPRESSION) {
        return new LamaWTFSExpressionImplWTF(node);
      }
      else if (type == S_EXPR_PATTERN) {
        return new LamaWTFSExprPatternImplWTF(node);
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
      else if (type == WILDCARD_PATTERN) {
        return new LamaWTFWildcardPatternImplWTF(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}