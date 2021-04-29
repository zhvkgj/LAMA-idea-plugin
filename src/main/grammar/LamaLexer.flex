package ru.mse.itmo.lama.language.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static ru.mse.itmo.lama.language.psi.LamaTypes.*;

%%

%{
  public _LamaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _LamaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
SINGLECOMMENT=--[^\r\n]*
MULTICOMMENT=\(\*(.|\n)*\*\)
UIDENT=[A-Z][a-zA-Z_0-9]*
LIDENT=[a-z][a-zA-Z_0-9]*
DECIMAL=[0-9]+
STRING=\"([^\"]|\"\")*\"
CHAR='([^']|''|\\n|\\t)'
INFIXOP=[+*/%$#@!|&\^?<>:=\\-]+

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "after"              { return AFTER; }
  "esac"               { return ESAC; }
  "infixl"             { return INFIXL; }
  "syntax"             { return SYNTAX; }
  "array"              { return ARRAY; }
  "eta"                { return ETA; }
  "infixr"             { return INFIXR; }
  "then"               { return THEN; }
  "at"                 { return AT; }
  "false"              { return FALSE; }
  "lazy"               { return LAZY; }
  "true"               { return TRUE; }
  "before"             { return BEFORE; }
  "fi"                 { return FI; }
  "od"                 { return OD; }
  "val"                { return VAL; }
  "box"                { return BOX; }
  "for"                { return FOR; }
  "of"                 { return OF; }
  "var"                { return VAR; }
  "case"               { return CASE; }
  "fun"                { return FUN; }
  "public"             { return PUBLIC; }
  "while"              { return WHILE; }
  "do"                 { return DO; }
  "if"                 { return IF; }
  "sexp"               { return SEXP; }
  "elif"               { return ELIF; }
  "import"             { return IMPORT; }
  "skip"               { return SKIP; }
  "else"               { return ELSE; }
  "infix"              { return INFIX; }
  "str"                { return STR; }
  "->"                 { return HENCE; }
  "|"                  { return ALT; }
  "#"                  { return SHARP; }
  "("                  { return LB; }
  ")"                  { return RB; }
  "{"                  { return LCURLY; }
  "}"                  { return RCURLY; }
  "["                  { return LSQUARE; }
  "]"                  { return RSQUARE; }

  {SPACE}              { return SPACE; }
  {SINGLECOMMENT}      { return SINGLECOMMENT; }
  {MULTICOMMENT}       { return MULTICOMMENT; }
  {UIDENT}             { return UIDENT; }
  {LIDENT}             { return LIDENT; }
  {DECIMAL}            { return DECIMAL; }
  {STRING}             { return STRING; }
  {CHAR}               { return CHAR; }
  {INFIXOP}            { return INFIXOP; }

}

[^] { return BAD_CHARACTER; }
