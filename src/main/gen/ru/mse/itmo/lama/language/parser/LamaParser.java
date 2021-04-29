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

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return compilationUnit(builder_, level_ + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARRAY_INDEXING, FUNCTION_CALL, POSTFIX_EXPRESSION, PRIMARY),
  };

  /* ********************************************************** */
  // multiplicative ( ('+' | '-') multiplicative ) *
  public static boolean additive(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ADDITIVE, "<additive>");
    result_ = multiplicative(builder_, level_ + 1);
    result_ = result_ && additive_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( ('+' | '-') multiplicative ) *
  private static boolean additive_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!additive_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "additive_1", pos_)) break;
    }
    return true;
  }

  // ('+' | '-') multiplicative
  private static boolean additive_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = additive_1_0_0(builder_, level_ + 1);
    result_ = result_ && multiplicative(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '+' | '-'
  private static boolean additive_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "additive_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "+");
    if (!result_) result_ = consumeToken(builder_, "-");
    return result_;
  }

  /* ********************************************************** */
  // '[' [ expression ( ',' expression ) * ] ']'
  public static boolean arrayExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression")) return false;
    if (!nextTokenIs(builder_, LSQUARE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LSQUARE);
    result_ = result_ && arrayExpression_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RSQUARE);
    exit_section_(builder_, marker_, ARRAY_EXPRESSION, result_);
    return result_;
  }

  // [ expression ( ',' expression ) * ]
  private static boolean arrayExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression_1")) return false;
    arrayExpression_1_0(builder_, level_ + 1);
    return true;
  }

  // expression ( ',' expression ) *
  private static boolean arrayExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && arrayExpression_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' expression ) *
  private static boolean arrayExpression_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!arrayExpression_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arrayExpression_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean arrayExpression_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayExpression_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '[' [ pattern ( ',' pattern ) * ] ']'
  public static boolean arrayPattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayPattern")) return false;
    if (!nextTokenIs(builder_, LSQUARE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LSQUARE);
    result_ = result_ && arrayPattern_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RSQUARE);
    exit_section_(builder_, marker_, ARRAY_PATTERN, result_);
    return result_;
  }

  // [ pattern ( ',' pattern ) * ]
  private static boolean arrayPattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayPattern_1")) return false;
    arrayPattern_1_0(builder_, level_ + 1);
    return true;
  }

  // pattern ( ',' pattern ) *
  private static boolean arrayPattern_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayPattern_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = pattern(builder_, level_ + 1);
    result_ = result_ && arrayPattern_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' pattern ) *
  private static boolean arrayPattern_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayPattern_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!arrayPattern_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arrayPattern_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' pattern
  private static boolean arrayPattern_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayPattern_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && pattern(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // disjunction
  public static boolean basicExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "basicExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BASIC_EXPRESSION, "<basic expression>");
    result_ = disjunction(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // pattern hence scopeExpression
  public static boolean caseBranch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseBranch")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CASE_BRANCH, "<case branch>");
    result_ = pattern(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, HENCE);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // caseBranch [ ( alt caseBranch ) * ]
  public static boolean caseBranches(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseBranches")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CASE_BRANCHES, "<case branches>");
    result_ = caseBranch(builder_, level_ + 1);
    result_ = result_ && caseBranches_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ( alt caseBranch ) * ]
  private static boolean caseBranches_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseBranches_1")) return false;
    caseBranches_1_0(builder_, level_ + 1);
    return true;
  }

  // ( alt caseBranch ) *
  private static boolean caseBranches_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseBranches_1_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!caseBranches_1_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "caseBranches_1_0", pos_)) break;
    }
    return true;
  }

  // alt caseBranch
  private static boolean caseBranches_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseBranches_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ALT);
    result_ = result_ && caseBranch(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // case expression of caseBranches esac
  public static boolean caseExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseExpression")) return false;
    if (!nextTokenIs(builder_, CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CASE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OF);
    result_ = result_ && caseBranches(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ESAC);
    exit_section_(builder_, marker_, CASE_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // additive ( ('<' | '>' | '<=' | '>=') additive ) *
  public static boolean comparison(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparison")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPARISON, "<comparison>");
    result_ = additive(builder_, level_ + 1);
    result_ = result_ && comparison_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( ('<' | '>' | '<=' | '>=') additive ) *
  private static boolean comparison_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparison_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!comparison_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "comparison_1", pos_)) break;
    }
    return true;
  }

  // ('<' | '>' | '<=' | '>=') additive
  private static boolean comparison_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparison_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = comparison_1_0_0(builder_, level_ + 1);
    result_ = result_ && additive(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '<' | '>' | '<=' | '>='
  private static boolean comparison_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "comparison_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "<");
    if (!result_) result_ = consumeToken(builder_, ">");
    if (!result_) result_ = consumeToken(builder_, "<=");
    if (!result_) result_ = consumeToken(builder_, ">=");
    return result_;
  }

  /* ********************************************************** */
  // importRule * scopeExpression
  static boolean compilationUnit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compilationUnit")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = compilationUnit_0(builder_, level_ + 1);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // importRule *
  private static boolean compilationUnit_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "compilationUnit_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!importRule(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "compilationUnit_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // equality ( '&&' equality ) *
  public static boolean conjunction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conjunction")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONJUNCTION, "<conjunction>");
    result_ = equality(builder_, level_ + 1);
    result_ = result_ && conjunction_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( '&&' equality ) *
  private static boolean conjunction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conjunction_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!conjunction_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "conjunction_1", pos_)) break;
    }
    return true;
  }

  // '&&' equality
  private static boolean conjunction_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "conjunction_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "&&");
    result_ = result_ && equality(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // simplePattern  ':' pattern
  public static boolean consPattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "consPattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONS_PATTERN, "<cons pattern>");
    result_ = simplePattern(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ":");
    result_ = result_ && pattern(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // dotNotation ( infixop dotNotation ) *
  public static boolean customOperatorExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "customOperatorExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CUSTOM_OPERATOR_EXPRESSION, "<custom operator expression>");
    result_ = dotNotation(builder_, level_ + 1);
    result_ = result_ && customOperatorExpression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( infixop dotNotation ) *
  private static boolean customOperatorExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "customOperatorExpression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customOperatorExpression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "customOperatorExpression_1", pos_)) break;
    }
    return true;
  }

  // infixop dotNotation
  private static boolean customOperatorExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "customOperatorExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INFIXOP);
    result_ = result_ && dotNotation(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variableDefinition
  //     | functionDefinition
  //     | infixDefinition
  public static boolean definition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "definition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DEFINITION, "<definition>");
    result_ = variableDefinition(builder_, level_ + 1);
    if (!result_) result_ = functionDefinition(builder_, level_ + 1);
    if (!result_) result_ = infixDefinition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // conjunction ( '!!' conjunction ) *
  public static boolean disjunction(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "disjunction")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DISJUNCTION, "<disjunction>");
    result_ = conjunction(builder_, level_ + 1);
    result_ = result_ && disjunction_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( '!!' conjunction ) *
  private static boolean disjunction_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "disjunction_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!disjunction_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "disjunction_1", pos_)) break;
    }
    return true;
  }

  // '!!' conjunction
  private static boolean disjunction_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "disjunction_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "!!");
    result_ = result_ && conjunction(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // do scopeExpression while expression od
  public static boolean doWhileExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "doWhileExpression")) return false;
    if (!nextTokenIs(builder_, DO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DO);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, WHILE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OD);
    exit_section_(builder_, marker_, DO_WHILE_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // postfixExpression ( '.' (functionCall | lident) ) *
  public static boolean dotNotation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotNotation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, DOT_NOTATION, "<dot notation>");
    result_ = postfixExpression(builder_, level_ + 1, -1);
    result_ = result_ && dotNotation_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( '.' (functionCall | lident) ) *
  private static boolean dotNotation_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotNotation_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!dotNotation_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "dotNotation_1", pos_)) break;
    }
    return true;
  }

  // '.' (functionCall | lident)
  private static boolean dotNotation_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotNotation_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".");
    result_ = result_ && dotNotation_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // functionCall | lident
  private static boolean dotNotation_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dotNotation_1_0_1")) return false;
    boolean result_;
    result_ = postfixExpression(builder_, level_ + 1, 0);
    if (!result_) result_ = consumeToken(builder_, LIDENT);
    return result_;
  }

  /* ********************************************************** */
  // elif expression then scopeExpression [ elsePart ] |
  //     else scopeExpression
  public static boolean elsePart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elsePart")) return false;
    if (!nextTokenIs(builder_, "<else part>", ELIF, ELSE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ELSE_PART, "<else part>");
    result_ = elsePart_0(builder_, level_ + 1);
    if (!result_) result_ = elsePart_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // elif expression then scopeExpression [ elsePart ]
  private static boolean elsePart_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elsePart_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELIF);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, THEN);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    result_ = result_ && elsePart_0_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ elsePart ]
  private static boolean elsePart_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elsePart_0_4")) return false;
    elsePart(builder_, level_ + 1);
    return true;
  }

  // else scopeExpression
  private static boolean elsePart_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "elsePart_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // comparison (('==' | '!=') comparison ) *
  public static boolean equality(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EQUALITY, "<equality>");
    result_ = comparison(builder_, level_ + 1);
    result_ = result_ && equality_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (('==' | '!=') comparison ) *
  private static boolean equality_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!equality_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "equality_1", pos_)) break;
    }
    return true;
  }

  // ('==' | '!=') comparison
  private static boolean equality_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = equality_1_0_0(builder_, level_ + 1);
    result_ = result_ && comparison(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '==' | '!='
  private static boolean equality_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "equality_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "==");
    if (!result_) result_ = consumeToken(builder_, "!=");
    return result_;
  }

  /* ********************************************************** */
  // eta basicExpression
  public static boolean etaExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "etaExpression")) return false;
    if (!nextTokenIs(builder_, ETA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ETA);
    result_ = result_ && basicExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, ETA_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // basicExpression [ ';' expression ]
  public static boolean expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = basicExpression(builder_, level_ + 1);
    result_ = result_ && expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ';' expression ]
  private static boolean expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_1")) return false;
    expression_1_0(builder_, level_ + 1);
    return true;
  }

  // ';' expression
  private static boolean expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ";");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // for scopeExpression ',' expression ',' expression do scopeExpression od
  public static boolean forExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forExpression")) return false;
    if (!nextTokenIs(builder_, FOR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FOR);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ",");
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DO);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OD);
    exit_section_(builder_, marker_, FOR_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // pattern
  public static boolean functionArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_ARGUMENT, "<function argument>");
    result_ = pattern(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [ functionArgument ( ',' functionArgument ) * ]
  public static boolean functionArguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionArguments")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_ARGUMENTS, "<function arguments>");
    functionArguments_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, true, false, null);
    return true;
  }

  // functionArgument ( ',' functionArgument ) *
  private static boolean functionArguments_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionArguments_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = functionArgument(builder_, level_ + 1);
    result_ = result_ && functionArguments_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' functionArgument ) *
  private static boolean functionArguments_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionArguments_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!functionArguments_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionArguments_0_1", pos_)) break;
    }
    return true;
  }

  // ',' functionArgument
  private static boolean functionArguments_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionArguments_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && functionArgument(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' scopeExpression '}'
  public static boolean functionBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionBody")) return false;
    if (!nextTokenIs(builder_, LCURLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LCURLY);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, marker_, FUNCTION_BODY, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ public ] fun lident '(' functionArguments ')' functionBody
  public static boolean functionDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDefinition")) return false;
    if (!nextTokenIs(builder_, "<function definition>", FUN, PUBLIC)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_DEFINITION, "<function definition>");
    result_ = functionDefinition_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, FUN, LIDENT, LB);
    result_ = result_ && functionArguments(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    result_ = result_ && functionBody(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ public ]
  private static boolean functionDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDefinition_0")) return false;
    consumeToken(builder_, PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // if expression then scopeExpression [ elsePart ] fi
  public static boolean ifExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifExpression")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IF);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, THEN);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    result_ = result_ && ifExpression_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, FI);
    exit_section_(builder_, marker_, IF_EXPRESSION, result_);
    return result_;
  }

  // [ elsePart ]
  private static boolean ifExpression_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifExpression_4")) return false;
    elsePart(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // import uident ';'
  public static boolean importRule(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importRule")) return false;
    if (!nextTokenIs(builder_, IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IMPORT, UIDENT);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, marker_, IMPORT_RULE, result_);
    return result_;
  }

  /* ********************************************************** */
  // infixHead '(' functionArguments ')' functionBody
  public static boolean infixDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "infixDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INFIX_DEFINITION, "<infix definition>");
    result_ = infixHead(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LB);
    result_ = result_ && functionArguments(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    result_ = result_ && functionBody(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [ public ] infixity infixop level
  public static boolean infixHead(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "infixHead")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INFIX_HEAD, "<infix head>");
    result_ = infixHead_0(builder_, level_ + 1);
    result_ = result_ && infixity(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, INFIXOP);
    result_ = result_ && level(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ public ]
  private static boolean infixHead_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "infixHead_0")) return false;
    consumeToken(builder_, PUBLIC);
    return true;
  }

  /* ********************************************************** */
  // infix
  //     | infixl
  //     | infixr
  public static boolean infixity(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "infixity")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INFIXITY, "<infixity>");
    result_ = consumeToken(builder_, INFIX);
    if (!result_) result_ = consumeToken(builder_, INFIXL);
    if (!result_) result_ = consumeToken(builder_, INFIXR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // lazy basicExpression
  public static boolean lazyExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "lazyExpression")) return false;
    if (!nextTokenIs(builder_, LAZY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LAZY);
    result_ = result_ && basicExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, LAZY_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ at | before | after ] infixop
  public static boolean level(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "level")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LEVEL, "<level>");
    result_ = level_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, INFIXOP);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ at | before | after ]
  private static boolean level_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "level_0")) return false;
    level_0_0(builder_, level_ + 1);
    return true;
  }

  // at | before | after
  private static boolean level_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "level_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, AT);
    if (!result_) result_ = consumeToken(builder_, BEFORE);
    if (!result_) result_ = consumeToken(builder_, AFTER);
    return result_;
  }

  /* ********************************************************** */
  // '{' [ expression ( ',' expression ) * ] '}'
  public static boolean listExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listExpression")) return false;
    if (!nextTokenIs(builder_, LCURLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LCURLY);
    result_ = result_ && listExpression_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, marker_, LIST_EXPRESSION, result_);
    return result_;
  }

  // [ expression ( ',' expression ) * ]
  private static boolean listExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listExpression_1")) return false;
    listExpression_1_0(builder_, level_ + 1);
    return true;
  }

  // expression ( ',' expression ) *
  private static boolean listExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && listExpression_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' expression ) *
  private static boolean listExpression_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listExpression_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!listExpression_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "listExpression_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean listExpression_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listExpression_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '{' [ pattern ( ',' pattern ) * ] '}'
  public static boolean listPattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listPattern")) return false;
    if (!nextTokenIs(builder_, LCURLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LCURLY);
    result_ = result_ && listPattern_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, marker_, LIST_PATTERN, result_);
    return result_;
  }

  // [ pattern ( ',' pattern ) * ]
  private static boolean listPattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listPattern_1")) return false;
    listPattern_1_0(builder_, level_ + 1);
    return true;
  }

  // pattern ( ',' pattern ) *
  private static boolean listPattern_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listPattern_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = pattern(builder_, level_ + 1);
    result_ = result_ && listPattern_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' pattern ) *
  private static boolean listPattern_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listPattern_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!listPattern_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "listPattern_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' pattern
  private static boolean listPattern_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "listPattern_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && pattern(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // customOperatorExpression ( ('*' | '/' | '%') customOperatorExpression ) *
  public static boolean multiplicative(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MULTIPLICATIVE, "<multiplicative>");
    result_ = customOperatorExpression(builder_, level_ + 1);
    result_ = result_ && multiplicative_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ( ('*' | '/' | '%') customOperatorExpression ) *
  private static boolean multiplicative_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!multiplicative_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "multiplicative_1", pos_)) break;
    }
    return true;
  }

  // ('*' | '/' | '%') customOperatorExpression
  private static boolean multiplicative_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = multiplicative_1_0_0(builder_, level_ + 1);
    result_ = result_ && customOperatorExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '*' | '/' | '%'
  private static boolean multiplicative_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multiplicative_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "*");
    if (!result_) result_ = consumeToken(builder_, "/");
    if (!result_) result_ = consumeToken(builder_, "%");
    return result_;
  }

  /* ********************************************************** */
  // consPattern
  //     | simplePattern
  public static boolean pattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PATTERN, "<pattern>");
    result_ = consPattern(builder_, level_ + 1);
    if (!result_) result_ = simplePattern(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // uident [ '(' pattern ( ',' pattern ) * ')' ]
  public static boolean sExprPattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExprPattern")) return false;
    if (!nextTokenIs(builder_, UIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, UIDENT);
    result_ = result_ && sExprPattern_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, S_EXPR_PATTERN, result_);
    return result_;
  }

  // [ '(' pattern ( ',' pattern ) * ')' ]
  private static boolean sExprPattern_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExprPattern_1")) return false;
    sExprPattern_1_0(builder_, level_ + 1);
    return true;
  }

  // '(' pattern ( ',' pattern ) * ')'
  private static boolean sExprPattern_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExprPattern_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LB);
    result_ = result_ && pattern(builder_, level_ + 1);
    result_ = result_ && sExprPattern_1_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' pattern ) *
  private static boolean sExprPattern_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExprPattern_1_0_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!sExprPattern_1_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "sExprPattern_1_0_2", pos_)) break;
    }
    return true;
  }

  // ',' pattern
  private static boolean sExprPattern_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExprPattern_1_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && pattern(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // uident [ '(' expression [ ( ',' expression ) * ] ')' ]
  public static boolean sExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExpression")) return false;
    if (!nextTokenIs(builder_, UIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, UIDENT);
    result_ = result_ && sExpression_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, S_EXPRESSION, result_);
    return result_;
  }

  // [ '(' expression [ ( ',' expression ) * ] ')' ]
  private static boolean sExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExpression_1")) return false;
    sExpression_1_0(builder_, level_ + 1);
    return true;
  }

  // '(' expression [ ( ',' expression ) * ] ')'
  private static boolean sExpression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExpression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LB);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && sExpression_1_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ ( ',' expression ) * ]
  private static boolean sExpression_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExpression_1_0_2")) return false;
    sExpression_1_0_2_0(builder_, level_ + 1);
    return true;
  }

  // ( ',' expression ) *
  private static boolean sExpression_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExpression_1_0_2_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!sExpression_1_0_2_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "sExpression_1_0_2_0", pos_)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean sExpression_1_0_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sExpression_1_0_2_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // definition * [ expression ]
  public static boolean scopeExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scopeExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SCOPE_EXPRESSION, "<scope expression>");
    result_ = scopeExpression_0(builder_, level_ + 1);
    result_ = result_ && scopeExpression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // definition *
  private static boolean scopeExpression_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scopeExpression_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!definition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "scopeExpression_0", pos_)) break;
    }
    return true;
  }

  // [ expression ]
  private static boolean scopeExpression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scopeExpression_1")) return false;
    expression(builder_, level_ + 1);
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
  public static boolean simplePattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simplePattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SIMPLE_PATTERN, "<simple pattern>");
    result_ = wildcardPattern(builder_, level_ + 1);
    if (!result_) result_ = sExprPattern(builder_, level_ + 1);
    if (!result_) result_ = arrayPattern(builder_, level_ + 1);
    if (!result_) result_ = listPattern(builder_, level_ + 1);
    if (!result_) result_ = simplePattern_4(builder_, level_ + 1);
    if (!result_) result_ = simplePattern_5(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING);
    if (!result_) result_ = consumeToken(builder_, CHAR);
    if (!result_) result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    if (!result_) result_ = parseTokens(builder_, 0, SHARP, BOX);
    if (!result_) result_ = parseTokens(builder_, 0, SHARP, VAL);
    if (!result_) result_ = parseTokens(builder_, 0, SHARP, STR);
    if (!result_) result_ = parseTokens(builder_, 0, SHARP, ARRAY);
    if (!result_) result_ = parseTokens(builder_, 0, SHARP, SEXP);
    if (!result_) result_ = parseTokens(builder_, 0, SHARP, FUN);
    if (!result_) result_ = simplePattern_16(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // lident [ '@' pattern ]
  private static boolean simplePattern_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simplePattern_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LIDENT);
    result_ = result_ && simplePattern_4_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ '@' pattern ]
  private static boolean simplePattern_4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simplePattern_4_1")) return false;
    simplePattern_4_1_0(builder_, level_ + 1);
    return true;
  }

  // '@' pattern
  private static boolean simplePattern_4_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simplePattern_4_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "@");
    result_ = result_ && pattern(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ '-' ] decimal
  private static boolean simplePattern_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simplePattern_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simplePattern_5_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DECIMAL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ '-' ]
  private static boolean simplePattern_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simplePattern_5_0")) return false;
    consumeToken(builder_, "-");
    return true;
  }

  // '(' pattern ')'
  private static boolean simplePattern_16(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simplePattern_16")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LB);
    result_ = result_ && pattern(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [ '-' ] [ pattern '=' ] syntaxPostfix
  public static boolean syntaxBinding(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxBinding")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SYNTAX_BINDING, "<syntax binding>");
    result_ = syntaxBinding_0(builder_, level_ + 1);
    result_ = result_ && syntaxBinding_1(builder_, level_ + 1);
    result_ = result_ && syntaxPostfix(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ '-' ]
  private static boolean syntaxBinding_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxBinding_0")) return false;
    consumeToken(builder_, "-");
    return true;
  }

  // [ pattern '=' ]
  private static boolean syntaxBinding_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxBinding_1")) return false;
    syntaxBinding_1_0(builder_, level_ + 1);
    return true;
  }

  // pattern '='
  private static boolean syntaxBinding_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxBinding_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = pattern(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "=");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // syntax '(' syntaxSeq (alt syntaxSeq ) * ')'
  public static boolean syntaxExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxExpression")) return false;
    if (!nextTokenIs(builder_, SYNTAX)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, SYNTAX, LB);
    result_ = result_ && syntaxSeq(builder_, level_ + 1);
    result_ = result_ && syntaxExpression_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, SYNTAX_EXPRESSION, result_);
    return result_;
  }

  // (alt syntaxSeq ) *
  private static boolean syntaxExpression_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxExpression_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!syntaxExpression_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "syntaxExpression_3", pos_)) break;
    }
    return true;
  }

  // alt syntaxSeq
  private static boolean syntaxExpression_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxExpression_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ALT);
    result_ = result_ && syntaxSeq(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // syntaxPrimary [ ('*' | '+' | '?' ) ]
  public static boolean syntaxPostfix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPostfix")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SYNTAX_POSTFIX, "<syntax postfix>");
    result_ = syntaxPrimary(builder_, level_ + 1);
    result_ = result_ && syntaxPostfix_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ('*' | '+' | '?' ) ]
  private static boolean syntaxPostfix_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPostfix_1")) return false;
    syntaxPostfix_1_0(builder_, level_ + 1);
    return true;
  }

  // '*' | '+' | '?'
  private static boolean syntaxPostfix_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPostfix_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "*");
    if (!result_) result_ = consumeToken(builder_, "+");
    if (!result_) result_ = consumeToken(builder_, "?");
    return result_;
  }

  /* ********************************************************** */
  // lident ( '[' [ expression ( ',' expression ) * ] ']' ) *
  //     | '(' syntaxExpression ')'
  //     | '$(' expression ')'
  public static boolean syntaxPrimary(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SYNTAX_PRIMARY, "<syntax primary>");
    result_ = syntaxPrimary_0(builder_, level_ + 1);
    if (!result_) result_ = syntaxPrimary_1(builder_, level_ + 1);
    if (!result_) result_ = syntaxPrimary_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // lident ( '[' [ expression ( ',' expression ) * ] ']' ) *
  private static boolean syntaxPrimary_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LIDENT);
    result_ = result_ && syntaxPrimary_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( '[' [ expression ( ',' expression ) * ] ']' ) *
  private static boolean syntaxPrimary_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!syntaxPrimary_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "syntaxPrimary_0_1", pos_)) break;
    }
    return true;
  }

  // '[' [ expression ( ',' expression ) * ] ']'
  private static boolean syntaxPrimary_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LSQUARE);
    result_ = result_ && syntaxPrimary_0_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RSQUARE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ expression ( ',' expression ) * ]
  private static boolean syntaxPrimary_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary_0_1_0_1")) return false;
    syntaxPrimary_0_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // expression ( ',' expression ) *
  private static boolean syntaxPrimary_0_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary_0_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && syntaxPrimary_0_1_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' expression ) *
  private static boolean syntaxPrimary_0_1_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary_0_1_0_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!syntaxPrimary_0_1_0_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "syntaxPrimary_0_1_0_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean syntaxPrimary_0_1_0_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary_0_1_0_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' syntaxExpression ')'
  private static boolean syntaxPrimary_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LB);
    result_ = result_ && syntaxExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '$(' expression ')'
  private static boolean syntaxPrimary_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxPrimary_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "$(");
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // syntaxBinding + [ '{' expression '}' ]
  public static boolean syntaxSeq(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxSeq")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SYNTAX_SEQ, "<syntax seq>");
    result_ = syntaxSeq_0(builder_, level_ + 1);
    result_ = result_ && syntaxSeq_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // syntaxBinding +
  private static boolean syntaxSeq_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxSeq_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = syntaxBinding(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!syntaxBinding(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "syntaxSeq_0", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ '{' expression '}' ]
  private static boolean syntaxSeq_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxSeq_1")) return false;
    syntaxSeq_1_0(builder_, level_ + 1);
    return true;
  }

  // '{' expression '}'
  private static boolean syntaxSeq_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "syntaxSeq_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LCURLY);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ( var | public ) variableDefinitionSeq ';'
  public static boolean variableDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDefinition")) return false;
    if (!nextTokenIs(builder_, "<variable definition>", PUBLIC, VAR)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VARIABLE_DEFINITION, "<variable definition>");
    result_ = variableDefinition_0(builder_, level_ + 1);
    result_ = result_ && variableDefinitionSeq(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ";");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // var | public
  private static boolean variableDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDefinition_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, VAR);
    if (!result_) result_ = consumeToken(builder_, PUBLIC);
    return result_;
  }

  /* ********************************************************** */
  // lident [ '=' basicExpression ]
  public static boolean variableDefinitionItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDefinitionItem")) return false;
    if (!nextTokenIs(builder_, LIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LIDENT);
    result_ = result_ && variableDefinitionItem_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARIABLE_DEFINITION_ITEM, result_);
    return result_;
  }

  // [ '=' basicExpression ]
  private static boolean variableDefinitionItem_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDefinitionItem_1")) return false;
    variableDefinitionItem_1_0(builder_, level_ + 1);
    return true;
  }

  // '=' basicExpression
  private static boolean variableDefinitionItem_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDefinitionItem_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "=");
    result_ = result_ && basicExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // variableDefinitionItem ( ',' variableDefinitionItem ) *
  public static boolean variableDefinitionSeq(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDefinitionSeq")) return false;
    if (!nextTokenIs(builder_, LIDENT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = variableDefinitionItem(builder_, level_ + 1);
    result_ = result_ && variableDefinitionSeq_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, VARIABLE_DEFINITION_SEQ, result_);
    return result_;
  }

  // ( ',' variableDefinitionItem ) *
  private static boolean variableDefinitionSeq_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDefinitionSeq_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!variableDefinitionSeq_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "variableDefinitionSeq_1", pos_)) break;
    }
    return true;
  }

  // ',' variableDefinitionItem
  private static boolean variableDefinitionSeq_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "variableDefinitionSeq_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && variableDefinitionItem(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // while expression do scopeExpression od
  public static boolean whileDoExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whileDoExpression")) return false;
    if (!nextTokenIs(builder_, WHILE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WHILE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DO);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OD);
    exit_section_(builder_, marker_, WHILE_DO_EXPRESSION, result_);
    return result_;
  }

  /* ********************************************************** */
  // '_'
  public static boolean wildcardPattern(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "wildcardPattern")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WILDCARD_PATTERN, "<wildcard pattern>");
    result_ = consumeToken(builder_, "_");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Expression root: postfixExpression
  // Operator priority table:
  // 0: ATOM(primary)
  // 1: POSTFIX(functionCall)
  // 2: POSTFIX(arrayIndexing)
  public static boolean postfixExpression(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "postfixExpression")) return false;
    addVariant(builder_, "<postfix expression>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<postfix expression>");
    result_ = primary(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && postfixExpression_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean postfixExpression_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "postfixExpression_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 1 && functionCall_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, FUNCTION_CALL, result_, true, null);
      }
      else if (priority_ < 2 && arrayIndexing_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, ARRAY_INDEXING, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  // '-' ? decimal           |
  //     string                  |
  //     char                    |
  //     lident                  |
  //     true                    |
  //     false                   |
  //     infix infixop           |
  //     fun '(' functionArguments ')' functionBody |
  //     skip                    |
  //     syntaxExpression        |
  //     '(' scopeExpression ')' |
  //     lazyExpression          |
  //     etaExpression           |
  //     listExpression          |
  //     arrayExpression         |
  //     sExpression             |
  //     ifExpression            |
  //     whileDoExpression       |
  //     doWhileExpression       |
  //     forExpression           |
  //     caseExpression
  public static boolean primary(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMARY, "<primary>");
    result_ = primary_0(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenSmart(builder_, STRING);
    if (!result_) result_ = consumeTokenSmart(builder_, CHAR);
    if (!result_) result_ = consumeTokenSmart(builder_, LIDENT);
    if (!result_) result_ = consumeTokenSmart(builder_, TRUE);
    if (!result_) result_ = consumeTokenSmart(builder_, FALSE);
    if (!result_) result_ = parseTokensSmart(builder_, 0, INFIX, INFIXOP);
    if (!result_) result_ = primary_7(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenSmart(builder_, SKIP);
    if (!result_) result_ = syntaxExpression(builder_, level_ + 1);
    if (!result_) result_ = primary_10(builder_, level_ + 1);
    if (!result_) result_ = lazyExpression(builder_, level_ + 1);
    if (!result_) result_ = etaExpression(builder_, level_ + 1);
    if (!result_) result_ = listExpression(builder_, level_ + 1);
    if (!result_) result_ = arrayExpression(builder_, level_ + 1);
    if (!result_) result_ = sExpression(builder_, level_ + 1);
    if (!result_) result_ = ifExpression(builder_, level_ + 1);
    if (!result_) result_ = whileDoExpression(builder_, level_ + 1);
    if (!result_) result_ = doWhileExpression(builder_, level_ + 1);
    if (!result_) result_ = forExpression(builder_, level_ + 1);
    if (!result_) result_ = caseExpression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // '-' ? decimal
  private static boolean primary_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = primary_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DECIMAL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '-' ?
  private static boolean primary_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_0_0")) return false;
    consumeTokenSmart(builder_, "-");
    return true;
  }

  // fun '(' functionArguments ')' functionBody
  private static boolean primary_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokensSmart(builder_, 0, FUN, LB);
    result_ = result_ && functionArguments(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    result_ = result_ && functionBody(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' scopeExpression ')'
  private static boolean primary_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primary_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LB);
    result_ = result_ && scopeExpression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '(' [ expression ( ',' expression ) * ] ')'
  private static boolean functionCall_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionCall_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LB);
    result_ = result_ && functionCall_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RB);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ expression ( ',' expression ) * ]
  private static boolean functionCall_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionCall_0_1")) return false;
    functionCall_0_1_0(builder_, level_ + 1);
    return true;
  }

  // expression ( ',' expression ) *
  private static boolean functionCall_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionCall_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = expression(builder_, level_ + 1);
    result_ = result_ && functionCall_0_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' expression ) *
  private static boolean functionCall_0_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionCall_0_1_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!functionCall_0_1_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "functionCall_0_1_0_1", pos_)) break;
    }
    return true;
  }

  // ',' expression
  private static boolean functionCall_0_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionCall_0_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, ",");
    result_ = result_ && expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // '[' expression ']'
  private static boolean arrayIndexing_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayIndexing_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, LSQUARE);
    result_ = result_ && expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RSQUARE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
