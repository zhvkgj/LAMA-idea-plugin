// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lama.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static ru.mse.itmo.lama.language.psi.LamaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LamaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return compilationUnit(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARRAY_INDEXING, FUNCTION_CALL, POSTFIX_EXPRESSION, PRIMARY),
  };

  /* ********************************************************** */
  // multiplicative ( ('+' | '-') multiplicative ) *
  public static boolean additive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE, "<additive>");
    r = multiplicative(b, l + 1);
    r = r && additive_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ('+' | '-') multiplicative ) *
  private static boolean additive_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!additive_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "additive_1", c)) break;
    }
    return true;
  }

  // ('+' | '-') multiplicative
  private static boolean additive_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additive_1_0_0(b, l + 1);
    r = r && multiplicative(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '+' | '-'
  private static boolean additive_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    return r;
  }

  /* ********************************************************** */
  // '[' [ expression ( ',' expression ) * ] ']'
  public static boolean arrayExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_EXPRESSION, "<array expression>");
    r = consumeToken(b, "[");
    r = r && arrayExpression_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ expression ( ',' expression ) * ]
  private static boolean arrayExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpression_1")) return false;
    arrayExpression_1_0(b, l + 1);
    return true;
  }

  // expression ( ',' expression ) *
  private static boolean arrayExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && arrayExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expression ) *
  private static boolean arrayExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayExpression_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayExpression_1_0_1", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean arrayExpression_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayExpression_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '[' [ pattern ( ',' pattern ) * ] ']'
  public static boolean arrayPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_PATTERN, "<array pattern>");
    r = consumeToken(b, "[");
    r = r && arrayPattern_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ pattern ( ',' pattern ) * ]
  private static boolean arrayPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayPattern_1")) return false;
    arrayPattern_1_0(b, l + 1);
    return true;
  }

  // pattern ( ',' pattern ) *
  private static boolean arrayPattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayPattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    r = r && arrayPattern_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' pattern ) *
  private static boolean arrayPattern_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayPattern_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arrayPattern_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayPattern_1_0_1", c)) break;
    }
    return true;
  }

  // ',' pattern
  private static boolean arrayPattern_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayPattern_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // disjunction
  public static boolean basicExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basicExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BASIC_EXPRESSION, "<basic expression>");
    r = disjunction(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // pattern hence scopeExpression
  public static boolean caseBranch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseBranch")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_BRANCH, "<case branch>");
    r = pattern(b, l + 1);
    r = r && consumeToken(b, HENCE);
    r = r && scopeExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // caseBranch [ ( alt caseBranch ) * ]
  public static boolean caseBranches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseBranches")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASE_BRANCHES, "<case branches>");
    r = caseBranch(b, l + 1);
    r = r && caseBranches_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ( alt caseBranch ) * ]
  private static boolean caseBranches_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseBranches_1")) return false;
    caseBranches_1_0(b, l + 1);
    return true;
  }

  // ( alt caseBranch ) *
  private static boolean caseBranches_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseBranches_1_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!caseBranches_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "caseBranches_1_0", c)) break;
    }
    return true;
  }

  // alt caseBranch
  private static boolean caseBranches_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseBranches_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALT);
    r = r && caseBranch(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // case expression of caseBranches esac
  public static boolean caseExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseExpression")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CASE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, OF);
    r = r && caseBranches(b, l + 1);
    r = r && consumeToken(b, ESAC);
    exit_section_(b, m, CASE_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // additive ( ('<' | '>' | '<=' | '>=') additive ) *
  public static boolean comparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON, "<comparison>");
    r = additive(b, l + 1);
    r = r && comparison_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ('<' | '>' | '<=' | '>=') additive ) *
  private static boolean comparison_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!comparison_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparison_1", c)) break;
    }
    return true;
  }

  // ('<' | '>' | '<=' | '>=') additive
  private static boolean comparison_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparison_1_0_0(b, l + 1);
    r = r && additive(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<' | '>' | '<=' | '>='
  private static boolean comparison_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">=");
    return r;
  }

  /* ********************************************************** */
  // importRule * scopeExpression
  static boolean compilationUnit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compilationUnit_0(b, l + 1);
    r = r && scopeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // importRule *
  private static boolean compilationUnit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilationUnit_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!importRule(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "compilationUnit_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // equality ( '&&' equality ) *
  public static boolean conjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONJUNCTION, "<conjunction>");
    r = equality(b, l + 1);
    r = r && conjunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '&&' equality ) *
  private static boolean conjunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!conjunction_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conjunction_1", c)) break;
    }
    return true;
  }

  // '&&' equality
  private static boolean conjunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conjunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "&&");
    r = r && equality(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simplePattern  ':' pattern
  public static boolean consPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "consPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONS_PATTERN, "<cons pattern>");
    r = simplePattern(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && pattern(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // dotNotation ( infixop dotNotation ) *
  public static boolean customOperatorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "customOperatorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CUSTOM_OPERATOR_EXPRESSION, "<custom operator expression>");
    r = dotNotation(b, l + 1);
    r = r && customOperatorExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( infixop dotNotation ) *
  private static boolean customOperatorExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "customOperatorExpression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!customOperatorExpression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "customOperatorExpression_1", c)) break;
    }
    return true;
  }

  // infixop dotNotation
  private static boolean customOperatorExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "customOperatorExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INFIXOP);
    r = r && dotNotation(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variableDefinition
  //     | functionDefinition
  //     | infixDefinition
  public static boolean definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEFINITION, "<definition>");
    r = variableDefinition(b, l + 1);
    if (!r) r = functionDefinition(b, l + 1);
    if (!r) r = infixDefinition(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // conjunction ( '!!' conjunction ) *
  public static boolean disjunction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DISJUNCTION, "<disjunction>");
    r = conjunction(b, l + 1);
    r = r && disjunction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '!!' conjunction ) *
  private static boolean disjunction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!disjunction_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "disjunction_1", c)) break;
    }
    return true;
  }

  // '!!' conjunction
  private static boolean disjunction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "disjunction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "!!");
    r = r && conjunction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // do scopeExpression while expression od
  public static boolean doWhileExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doWhileExpression")) return false;
    if (!nextTokenIs(b, DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO);
    r = r && scopeExpression(b, l + 1);
    r = r && consumeToken(b, WHILE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, OD);
    exit_section_(b, m, DO_WHILE_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // postfixExpression ( '.' (functionCall | lident) ) *
  public static boolean dotNotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotNotation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DOT_NOTATION, "<dot notation>");
    r = postfixExpression(b, l + 1, -1);
    r = r && dotNotation_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( '.' (functionCall | lident) ) *
  private static boolean dotNotation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotNotation_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dotNotation_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dotNotation_1", c)) break;
    }
    return true;
  }

  // '.' (functionCall | lident)
  private static boolean dotNotation_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotNotation_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && dotNotation_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // functionCall | lident
  private static boolean dotNotation_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dotNotation_1_0_1")) return false;
    boolean r;
    r = postfixExpression(b, l + 1, 0);
    if (!r) r = consumeToken(b, LIDENT);
    return r;
  }

  /* ********************************************************** */
  // elif expression then scopeExpression [ elsePart ] |
  //     else scopeExpression
  public static boolean elsePart(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elsePart")) return false;
    if (!nextTokenIs(b, "<else part>", ELIF, ELSE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELSE_PART, "<else part>");
    r = elsePart_0(b, l + 1);
    if (!r) r = elsePart_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // elif expression then scopeExpression [ elsePart ]
  private static boolean elsePart_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elsePart_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELIF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && scopeExpression(b, l + 1);
    r = r && elsePart_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ elsePart ]
  private static boolean elsePart_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elsePart_0_4")) return false;
    elsePart(b, l + 1);
    return true;
  }

  // else scopeExpression
  private static boolean elsePart_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "elsePart_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && scopeExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // comparison (('==' | '!=') comparison ) *
  public static boolean equality(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY, "<equality>");
    r = comparison(b, l + 1);
    r = r && equality_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (('==' | '!=') comparison ) *
  private static boolean equality_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!equality_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "equality_1", c)) break;
    }
    return true;
  }

  // ('==' | '!=') comparison
  private static boolean equality_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equality_1_0_0(b, l + 1);
    r = r && comparison(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '==' | '!='
  private static boolean equality_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, "!=");
    return r;
  }

  /* ********************************************************** */
  // basicExpression [ ';' expression ]
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = basicExpression(b, l + 1);
    r = r && expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ';' expression ]
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    expression_1_0(b, l + 1);
    return true;
  }

  // ';' expression
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ";");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // for scopeExpression ',' expression ',' expression do scopeExpression od
  public static boolean forExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forExpression")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && scopeExpression(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, DO);
    r = r && scopeExpression(b, l + 1);
    r = r && consumeToken(b, OD);
    exit_section_(b, m, FOR_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // lident |
  //     pattern
  public static boolean functionArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ARGUMENT, "<function argument>");
    r = consumeToken(b, LIDENT);
    if (!r) r = pattern(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ functionArgument ( ',' functionArgument ) * ]
  public static boolean functionArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionArguments")) return false;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_ARGUMENTS, "<function arguments>");
    functionArguments_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // functionArgument ( ',' functionArgument ) *
  private static boolean functionArguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionArguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionArgument(b, l + 1);
    r = r && functionArguments_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' functionArgument ) *
  private static boolean functionArguments_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionArguments_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionArguments_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionArguments_0_1", c)) break;
    }
    return true;
  }

  // ',' functionArgument
  private static boolean functionArguments_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionArguments_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && functionArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' scopeExpression '}'
  public static boolean functionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_BODY, "<function body>");
    r = consumeToken(b, "{");
    r = r && scopeExpression(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ public ] fun lident '(' functionArguments ')' functionBody
  public static boolean functionDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDefinition")) return false;
    if (!nextTokenIs(b, "<function definition>", FUN, PUBLIC)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DEFINITION, "<function definition>");
    r = functionDefinition_0(b, l + 1);
    r = r && consumeTokens(b, 0, FUN, LIDENT);
    r = r && consumeToken(b, "(");
    r = r && functionArguments(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && functionBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ public ]
  private static boolean functionDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDefinition_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // if expression then scopeExpression [ elsePart ] fi
  public static boolean ifExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, THEN);
    r = r && scopeExpression(b, l + 1);
    r = r && ifExpression_4(b, l + 1);
    r = r && consumeToken(b, FI);
    exit_section_(b, m, IF_EXPRESSION, r);
    return r;
  }

  // [ elsePart ]
  private static boolean ifExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifExpression_4")) return false;
    elsePart(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // import uident ';'
  public static boolean importRule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importRule")) return false;
    if (!nextTokenIs(b, IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IMPORT, UIDENT);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, IMPORT_RULE, r);
    return r;
  }

  /* ********************************************************** */
  // infixHead '(' functionArguments ')' functionBody
  public static boolean infixDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixDefinition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX_DEFINITION, "<infix definition>");
    r = infixHead(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && functionArguments(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && functionBody(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ public ] infixity infixop level
  public static boolean infixHead(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixHead")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX_HEAD, "<infix head>");
    r = infixHead_0(b, l + 1);
    r = r && infixity(b, l + 1);
    r = r && consumeToken(b, INFIXOP);
    r = r && level(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ public ]
  private static boolean infixHead_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixHead_0")) return false;
    consumeToken(b, PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // infix
  //     | infixl
  //     | infixr
  public static boolean infixity(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infixity")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIXITY, "<infixity>");
    r = consumeToken(b, INFIX);
    if (!r) r = consumeToken(b, INFIXL);
    if (!r) r = consumeToken(b, INFIXR);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [ at | before | after ] infixop
  public static boolean level(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "level")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LEVEL, "<level>");
    r = level_0(b, l + 1);
    r = r && consumeToken(b, INFIXOP);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ at | before | after ]
  private static boolean level_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "level_0")) return false;
    level_0_0(b, l + 1);
    return true;
  }

  // at | before | after
  private static boolean level_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "level_0_0")) return false;
    boolean r;
    r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, BEFORE);
    if (!r) r = consumeToken(b, AFTER);
    return r;
  }

  /* ********************************************************** */
  // '{' [ expression ( ',' expression ) * ] '}'
  public static boolean listExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_EXPRESSION, "<list expression>");
    r = consumeToken(b, "{");
    r = r && listExpression_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ expression ( ',' expression ) * ]
  private static boolean listExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpression_1")) return false;
    listExpression_1_0(b, l + 1);
    return true;
  }

  // expression ( ',' expression ) *
  private static boolean listExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && listExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expression ) *
  private static boolean listExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpression_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!listExpression_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "listExpression_1_0_1", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean listExpression_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listExpression_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' [ pattern ( ',' pattern ) * ] '}'
  public static boolean listPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_PATTERN, "<list pattern>");
    r = consumeToken(b, "{");
    r = r && listPattern_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ pattern ( ',' pattern ) * ]
  private static boolean listPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1")) return false;
    listPattern_1_0(b, l + 1);
    return true;
  }

  // pattern ( ',' pattern ) *
  private static boolean listPattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    r = r && listPattern_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' pattern ) *
  private static boolean listPattern_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!listPattern_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "listPattern_1_0_1", c)) break;
    }
    return true;
  }

  // ',' pattern
  private static boolean listPattern_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listPattern_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // customOperatorExpression ( ('*' | '/' | '%') customOperatorExpression ) *
  public static boolean multiplicative(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTIPLICATIVE, "<multiplicative>");
    r = customOperatorExpression(b, l + 1);
    r = r && multiplicative_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ( ('*' | '/' | '%') customOperatorExpression ) *
  private static boolean multiplicative_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!multiplicative_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "multiplicative_1", c)) break;
    }
    return true;
  }

  // ('*' | '/' | '%') customOperatorExpression
  private static boolean multiplicative_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = multiplicative_1_0_0(b, l + 1);
    r = r && customOperatorExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' | '/' | '%'
  private static boolean multiplicative_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "multiplicative_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "%");
    return r;
  }

  /* ********************************************************** */
  // consPattern
  //     | simplePattern
  public static boolean pattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PATTERN, "<pattern>");
    r = consPattern(b, l + 1);
    if (!r) r = simplePattern(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // uident [ '(' pattern ( ',' pattern ) * ')' ]
  public static boolean sExprPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExprPattern")) return false;
    if (!nextTokenIs(b, UIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UIDENT);
    r = r && sExprPattern_1(b, l + 1);
    exit_section_(b, m, S_EXPR_PATTERN, r);
    return r;
  }

  // [ '(' pattern ( ',' pattern ) * ')' ]
  private static boolean sExprPattern_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExprPattern_1")) return false;
    sExprPattern_1_0(b, l + 1);
    return true;
  }

  // '(' pattern ( ',' pattern ) * ')'
  private static boolean sExprPattern_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExprPattern_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && pattern(b, l + 1);
    r = r && sExprPattern_1_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' pattern ) *
  private static boolean sExprPattern_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExprPattern_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sExprPattern_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sExprPattern_1_0_2", c)) break;
    }
    return true;
  }

  // ',' pattern
  private static boolean sExprPattern_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExprPattern_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // uident [ '(' expression [ ( ',' expression ) * ] ')' ]
  public static boolean sExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExpression")) return false;
    if (!nextTokenIs(b, UIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, UIDENT);
    r = r && sExpression_1(b, l + 1);
    exit_section_(b, m, S_EXPRESSION, r);
    return r;
  }

  // [ '(' expression [ ( ',' expression ) * ] ')' ]
  private static boolean sExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExpression_1")) return false;
    sExpression_1_0(b, l + 1);
    return true;
  }

  // '(' expression [ ( ',' expression ) * ] ')'
  private static boolean sExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && sExpression_1_0_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ ( ',' expression ) * ]
  private static boolean sExpression_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExpression_1_0_2")) return false;
    sExpression_1_0_2_0(b, l + 1);
    return true;
  }

  // ( ',' expression ) *
  private static boolean sExpression_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExpression_1_0_2_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sExpression_1_0_2_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sExpression_1_0_2_0", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean sExpression_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sExpression_1_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // definition * [ expression ]
  public static boolean scopeExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scopeExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCOPE_EXPRESSION, "<scope expression>");
    r = scopeExpression_0(b, l + 1);
    r = r && scopeExpression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // definition *
  private static boolean scopeExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scopeExpression_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!definition(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "scopeExpression_0", c)) break;
    }
    return true;
  }

  // [ expression ]
  private static boolean scopeExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scopeExpression_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // wildcardPattern
  //     | sExprPattern
  //     | arrayPattern
  //     | listPattern
  //     | lident [ '@' pattern ]
  //     | [ '-' ] decimal
  //     | string
  //     | char
  //     | true
  //     | false
  //     | sharp box
  //     | sharp val
  //     | sharp str
  //     | sharp array
  //     | sharp sexp
  //     | sharp fun
  //     | '(' pattern ')'
  public static boolean simplePattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simplePattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_PATTERN, "<simple pattern>");
    r = wildcardPattern(b, l + 1);
    if (!r) r = sExprPattern(b, l + 1);
    if (!r) r = arrayPattern(b, l + 1);
    if (!r) r = listPattern(b, l + 1);
    if (!r) r = simplePattern_4(b, l + 1);
    if (!r) r = simplePattern_5(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = parseTokens(b, 0, SHARP, BOX);
    if (!r) r = parseTokens(b, 0, SHARP, VAL);
    if (!r) r = parseTokens(b, 0, SHARP, STR);
    if (!r) r = parseTokens(b, 0, SHARP, ARRAY);
    if (!r) r = parseTokens(b, 0, SHARP, SEXP);
    if (!r) r = parseTokens(b, 0, SHARP, FUN);
    if (!r) r = simplePattern_16(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lident [ '@' pattern ]
  private static boolean simplePattern_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simplePattern_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIDENT);
    r = r && simplePattern_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '@' pattern ]
  private static boolean simplePattern_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simplePattern_4_1")) return false;
    simplePattern_4_1_0(b, l + 1);
    return true;
  }

  // '@' pattern
  private static boolean simplePattern_4_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simplePattern_4_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "@");
    r = r && pattern(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '-' ] decimal
  private static boolean simplePattern_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simplePattern_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simplePattern_5_0(b, l + 1);
    r = r && consumeToken(b, DECIMAL);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '-' ]
  private static boolean simplePattern_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simplePattern_5_0")) return false;
    consumeToken(b, "-");
    return true;
  }

  // '(' pattern ')'
  private static boolean simplePattern_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simplePattern_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && pattern(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [ '-' ] [ pattern '=' ] syntaxPostfix
  public static boolean syntaxBinding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxBinding")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYNTAX_BINDING, "<syntax binding>");
    r = syntaxBinding_0(b, l + 1);
    r = r && syntaxBinding_1(b, l + 1);
    r = r && syntaxPostfix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ '-' ]
  private static boolean syntaxBinding_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxBinding_0")) return false;
    consumeToken(b, "-");
    return true;
  }

  // [ pattern '=' ]
  private static boolean syntaxBinding_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxBinding_1")) return false;
    syntaxBinding_1_0(b, l + 1);
    return true;
  }

  // pattern '='
  private static boolean syntaxBinding_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxBinding_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pattern(b, l + 1);
    r = r && consumeToken(b, "=");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // syntax '(' syntaxSeq (alt syntaxSeq ) * ')'
  public static boolean syntaxExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxExpression")) return false;
    if (!nextTokenIs(b, SYNTAX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SYNTAX);
    r = r && consumeToken(b, "(");
    r = r && syntaxSeq(b, l + 1);
    r = r && syntaxExpression_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, SYNTAX_EXPRESSION, r);
    return r;
  }

  // (alt syntaxSeq ) *
  private static boolean syntaxExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxExpression_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!syntaxExpression_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "syntaxExpression_3", c)) break;
    }
    return true;
  }

  // alt syntaxSeq
  private static boolean syntaxExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ALT);
    r = r && syntaxSeq(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // syntaxPrimary [ ('*' | '+' | '?' ) ]
  public static boolean syntaxPostfix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPostfix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYNTAX_POSTFIX, "<syntax postfix>");
    r = syntaxPrimary(b, l + 1);
    r = r && syntaxPostfix_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ ('*' | '+' | '?' ) ]
  private static boolean syntaxPostfix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPostfix_1")) return false;
    syntaxPostfix_1_0(b, l + 1);
    return true;
  }

  // '*' | '+' | '?'
  private static boolean syntaxPostfix_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPostfix_1_0")) return false;
    boolean r;
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "?");
    return r;
  }

  /* ********************************************************** */
  // lident ( '[' [ expression ( ',' expression ) * ] ']' ) *
  //     | '(' syntaxExpression ')'
  //     | '$(' expression ')'
  public static boolean syntaxPrimary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYNTAX_PRIMARY, "<syntax primary>");
    r = syntaxPrimary_0(b, l + 1);
    if (!r) r = syntaxPrimary_1(b, l + 1);
    if (!r) r = syntaxPrimary_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // lident ( '[' [ expression ( ',' expression ) * ] ']' ) *
  private static boolean syntaxPrimary_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIDENT);
    r = r && syntaxPrimary_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( '[' [ expression ( ',' expression ) * ] ']' ) *
  private static boolean syntaxPrimary_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!syntaxPrimary_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "syntaxPrimary_0_1", c)) break;
    }
    return true;
  }

  // '[' [ expression ( ',' expression ) * ] ']'
  private static boolean syntaxPrimary_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && syntaxPrimary_0_1_0_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ expression ( ',' expression ) * ]
  private static boolean syntaxPrimary_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary_0_1_0_1")) return false;
    syntaxPrimary_0_1_0_1_0(b, l + 1);
    return true;
  }

  // expression ( ',' expression ) *
  private static boolean syntaxPrimary_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && syntaxPrimary_0_1_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expression ) *
  private static boolean syntaxPrimary_0_1_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary_0_1_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!syntaxPrimary_0_1_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "syntaxPrimary_0_1_0_1_0_1", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean syntaxPrimary_0_1_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary_0_1_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' syntaxExpression ')'
  private static boolean syntaxPrimary_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && syntaxExpression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '$(' expression ')'
  private static boolean syntaxPrimary_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxPrimary_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "$(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // syntaxBinding + [ '{' expression '}' ]
  public static boolean syntaxSeq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxSeq")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYNTAX_SEQ, "<syntax seq>");
    r = syntaxSeq_0(b, l + 1);
    r = r && syntaxSeq_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // syntaxBinding +
  private static boolean syntaxSeq_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxSeq_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = syntaxBinding(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!syntaxBinding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "syntaxSeq_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '{' expression '}' ]
  private static boolean syntaxSeq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxSeq_1")) return false;
    syntaxSeq_1_0(b, l + 1);
    return true;
  }

  // '{' expression '}'
  private static boolean syntaxSeq_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "syntaxSeq_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( var | public ) variableDefinitionSeq ';'
  public static boolean variableDefinition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinition")) return false;
    if (!nextTokenIs(b, "<variable definition>", PUBLIC, VAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_DEFINITION, "<variable definition>");
    r = variableDefinition_0(b, l + 1);
    r = r && variableDefinitionSeq(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var | public
  private static boolean variableDefinition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinition_0")) return false;
    boolean r;
    r = consumeToken(b, VAR);
    if (!r) r = consumeToken(b, PUBLIC);
    return r;
  }

  /* ********************************************************** */
  // lident [ '=' basicExpression ]
  public static boolean variableDefinitionItem(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinitionItem")) return false;
    if (!nextTokenIs(b, LIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIDENT);
    r = r && variableDefinitionItem_1(b, l + 1);
    exit_section_(b, m, VARIABLE_DEFINITION_ITEM, r);
    return r;
  }

  // [ '=' basicExpression ]
  private static boolean variableDefinitionItem_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinitionItem_1")) return false;
    variableDefinitionItem_1_0(b, l + 1);
    return true;
  }

  // '=' basicExpression
  private static boolean variableDefinitionItem_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinitionItem_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "=");
    r = r && basicExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // variableDefinitionItem ( ',' variableDefinitionItem ) *
  public static boolean variableDefinitionSeq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinitionSeq")) return false;
    if (!nextTokenIs(b, LIDENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variableDefinitionItem(b, l + 1);
    r = r && variableDefinitionSeq_1(b, l + 1);
    exit_section_(b, m, VARIABLE_DEFINITION_SEQ, r);
    return r;
  }

  // ( ',' variableDefinitionItem ) *
  private static boolean variableDefinitionSeq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinitionSeq_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!variableDefinitionSeq_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableDefinitionSeq_1", c)) break;
    }
    return true;
  }

  // ',' variableDefinitionItem
  private static boolean variableDefinitionSeq_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDefinitionSeq_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && variableDefinitionItem(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // while expression do scopeExpression od
  public static boolean whileDoExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileDoExpression")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, DO);
    r = r && scopeExpression(b, l + 1);
    r = r && consumeToken(b, OD);
    exit_section_(b, m, WHILE_DO_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // '_'
  public static boolean wildcardPattern(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "wildcardPattern")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WILDCARD_PATTERN, "<wildcard pattern>");
    r = consumeToken(b, "_");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: postfixExpression
  // Operator priority table:
  // 0: ATOM(primary)
  // 1: POSTFIX(functionCall)
  // 2: POSTFIX(arrayIndexing)
  public static boolean postfixExpression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "postfixExpression")) return false;
    addVariant(b, "<postfix expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<postfix expression>");
    r = primary(b, l + 1);
    p = r;
    r = r && postfixExpression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean postfixExpression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "postfixExpression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && functionCall_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, FUNCTION_CALL, r, true, null);
      }
      else if (g < 2 && arrayIndexing_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, ARRAY_INDEXING, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // decimal                 |
  //     string                  |
  //     char                    |
  //     lident                  |
  //     true                    |
  //     false                   |
  //     infix infixop           |
  //     fun '(' functionArguments ')' functionBody |
  //     skip                    |
  //     syntaxExpression        |
  //     '(' scopeExpression ')'   |
  //     listExpression          |
  //     arrayExpression         |
  //     sExpression             |
  //     ifExpression            |
  //     whileDoExpression       |
  //     doWhileExpression       |
  //     forExpression           |
  //     caseExpression
  public static boolean primary(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY, "<primary>");
    r = consumeTokenSmart(b, DECIMAL);
    if (!r) r = consumeTokenSmart(b, STRING);
    if (!r) r = consumeTokenSmart(b, CHAR);
    if (!r) r = consumeTokenSmart(b, LIDENT);
    if (!r) r = consumeTokenSmart(b, TRUE);
    if (!r) r = consumeTokenSmart(b, FALSE);
    if (!r) r = parseTokensSmart(b, 0, INFIX, INFIXOP);
    if (!r) r = primary_7(b, l + 1);
    if (!r) r = consumeTokenSmart(b, SKIP);
    if (!r) r = syntaxExpression(b, l + 1);
    if (!r) r = primary_10(b, l + 1);
    if (!r) r = listExpression(b, l + 1);
    if (!r) r = arrayExpression(b, l + 1);
    if (!r) r = sExpression(b, l + 1);
    if (!r) r = ifExpression(b, l + 1);
    if (!r) r = whileDoExpression(b, l + 1);
    if (!r) r = doWhileExpression(b, l + 1);
    if (!r) r = forExpression(b, l + 1);
    if (!r) r = caseExpression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // fun '(' functionArguments ')' functionBody
  private static boolean primary_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, FUN);
    r = r && consumeToken(b, "(");
    r = r && functionArguments(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && functionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' scopeExpression ')'
  private static boolean primary_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "(");
    r = r && scopeExpression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' [ expression ( ',' expression ) * ] ')'
  private static boolean functionCall_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "(");
    r = r && functionCall_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [ expression ( ',' expression ) * ]
  private static boolean functionCall_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_0_1")) return false;
    functionCall_0_1_0(b, l + 1);
    return true;
  }

  // expression ( ',' expression ) *
  private static boolean functionCall_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    r = r && functionCall_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( ',' expression ) *
  private static boolean functionCall_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_0_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!functionCall_0_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionCall_0_1_0_1", c)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean functionCall_0_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCall_0_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' expression ']'
  private static boolean arrayIndexing_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayIndexing_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, "[");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

}
