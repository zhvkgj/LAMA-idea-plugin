/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package ru.mse.itmo.lama.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static ru.mse.itmo.lama.language.psi.LamaTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_LamaLexer.flex</tt>
 */
public class LamaLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\4\1\22\0\1\2\1\16\1\13\1\50\3\16\1\15\1\4\1\6\1\5\1\16\1\0\1\3\1"+
    "\0\1\16\12\12\1\16\1\0\2\16\1\46\2\16\32\7\1\0\1\14\1\0\1\16\1\10\1\0\1\17"+
    "\1\36\1\25\1\40\1\22\1\20\1\11\1\33\1\26\1\11\1\45\1\31\1\44\1\27\1\37\1\42"+
    "\1\11\1\23\1\24\1\21\1\35\1\41\1\43\1\30\1\32\1\34\1\0\1\47\10\0\1\1\32\0"+
    "\1\2\337\0\1\2\177\0\13\2\35\0\2\1\5\0\1\2\57\0\1\2\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\3\1\4\1\5"+
    "\1\6\2\1\16\5\1\7\1\10\1\11\1\12\2\0"+
    "\1\13\3\0\1\5\1\14\2\5\1\15\14\5\1\16"+
    "\5\5\1\17\1\20\1\21\3\5\1\0\1\22\3\5"+
    "\1\23\1\24\2\5\1\25\3\5\1\26\10\5\1\27"+
    "\1\30\1\31\2\5\1\32\3\5\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\5\1\41\1\42\2\5\1\43"+
    "\3\5\1\44\1\45\1\46\1\5\1\47\3\5\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e\0\u0267"+
    "\0\u0290\0\u02b9\0\u02e2\0\u030b\0\u0334\0\u035d\0\u0386\0\u03af"+
    "\0\u03d8\0\315\0\315\0\315\0\315\0\u0401\0\u0171\0\51"+
    "\0\u042a\0\u0453\0\u047c\0\u04a5\0\u011f\0\u04ce\0\u04f7\0\u011f"+
    "\0\u0520\0\u0549\0\u0572\0\u059b\0\u05c4\0\u05ed\0\u0616\0\u063f"+
    "\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u011f\0\u070c\0\u0735\0\u075e"+
    "\0\u0787\0\u07b0\0\u011f\0\u011f\0\u011f\0\u07d9\0\u0802\0\u082b"+
    "\0\u0854\0\51\0\u087d\0\u08a6\0\u08cf\0\u011f\0\u011f\0\u08f8"+
    "\0\u0921\0\u011f\0\u094a\0\u0973\0\u099c\0\u011f\0\u09c5\0\u09ee"+
    "\0\u0a17\0\u0a40\0\u0a69\0\u0a92\0\u0abb\0\u0ae4\0\u011f\0\u011f"+
    "\0\u011f\0\u0b0d\0\u0b36\0\u0401\0\u0b5f\0\u0b88\0\u0bb1\0\u011f"+
    "\0\u011f\0\u011f\0\u011f\0\u011f\0\u011f\0\u0bda\0\u011f\0\u011f"+
    "\0\u0c03\0\u0c2c\0\u011f\0\u0c55\0\u0c7e\0\u0ca7\0\u011f\0\u011f"+
    "\0\u011f\0\u0cd0\0\u0cf9\0\u0d22\0\u0d4b\0\u0d74\0\u011f\0\u011f"+
    "\0\u011f\0\u011f\0\u011f\0\u011f\0\u011f";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\2\1\7\1\2"+
    "\1\10\1\11\1\12\1\6\1\13\1\6\1\14\1\15"+
    "\1\16\1\17\1\10\1\20\1\21\1\22\2\10\1\23"+
    "\4\10\1\24\1\25\1\26\1\27\1\30\1\31\2\10"+
    "\1\6\1\32\1\33\52\0\2\3\51\0\1\34\1\0"+
    "\1\6\4\0\1\11\1\0\1\6\1\0\1\6\27\0"+
    "\1\35\2\6\5\0\1\36\46\0\1\6\1\0\1\6"+
    "\6\0\1\6\1\0\1\6\27\0\3\6\7\0\4\7"+
    "\4\0\27\7\12\0\4\10\4\0\27\10\15\0\1\11"+
    "\36\0\13\37\1\40\1\41\34\37\15\42\1\43\33\42"+
    "\7\0\4\10\4\0\1\10\1\44\1\45\1\10\1\46"+
    "\22\10\12\0\4\10\4\0\1\47\6\10\1\50\6\10"+
    "\1\51\1\10\1\52\6\10\12\0\4\10\4\0\4\10"+
    "\1\53\7\10\1\54\12\10\12\0\4\10\4\0\2\10"+
    "\1\55\2\10\1\56\4\10\1\57\14\10\12\0\4\10"+
    "\4\0\2\10\1\60\1\61\7\10\1\62\12\10\1\63"+
    "\12\0\4\10\4\0\1\64\26\10\12\0\4\10\4\0"+
    "\1\10\1\65\6\10\1\66\14\10\1\67\1\10\12\0"+
    "\4\10\4\0\1\70\26\10\12\0\4\10\4\0\3\10"+
    "\1\71\14\10\1\72\6\10\12\0\4\10\4\0\1\10"+
    "\1\73\17\10\1\74\5\10\12\0\4\10\4\0\20\10"+
    "\1\75\6\10\12\0\4\10\4\0\1\76\26\10\12\0"+
    "\4\10\4\0\16\10\1\77\10\10\12\0\4\10\4\0"+
    "\14\10\1\100\12\10\3\0\1\36\1\0\3\36\1\101"+
    "\43\36\1\37\1\0\47\37\15\0\1\102\50\0\1\42"+
    "\42\0\4\10\4\0\2\10\1\103\24\10\12\0\4\10"+
    "\4\0\4\10\1\104\22\10\12\0\4\10\4\0\12\10"+
    "\1\105\14\10\12\0\4\10\4\0\10\10\1\106\16\10"+
    "\12\0\4\10\4\0\4\10\1\107\22\10\12\0\4\10"+
    "\4\0\16\10\1\110\10\10\12\0\4\10\4\0\3\10"+
    "\1\111\23\10\12\0\4\10\4\0\1\112\26\10\12\0"+
    "\4\10\4\0\1\113\26\10\12\0\4\10\4\0\5\10"+
    "\1\114\1\10\1\115\17\10\12\0\4\10\4\0\4\10"+
    "\1\116\22\10\12\0\4\10\4\0\11\10\1\117\15\10"+
    "\12\0\4\10\4\0\10\10\1\120\16\10\12\0\4\10"+
    "\4\0\7\10\1\121\17\10\12\0\4\10\4\0\5\10"+
    "\1\122\21\10\12\0\4\10\4\0\1\10\1\123\25\10"+
    "\12\0\4\10\4\0\23\10\1\124\3\10\12\0\4\10"+
    "\4\0\15\10\1\125\11\10\12\0\4\10\4\0\1\10"+
    "\1\126\25\10\12\0\4\10\4\0\11\10\1\127\15\10"+
    "\12\0\4\10\4\0\4\10\1\130\5\10\1\131\14\10"+
    "\12\0\4\10\4\0\17\10\1\132\7\10\12\0\4\10"+
    "\4\0\7\10\1\133\17\10\3\0\1\36\1\0\3\36"+
    "\1\101\1\134\42\36\7\0\4\10\4\0\3\10\1\135"+
    "\23\10\12\0\4\10\4\0\1\136\26\10\12\0\4\10"+
    "\4\0\5\10\1\137\21\10\12\0\4\10\4\0\3\10"+
    "\1\140\23\10\12\0\4\10\4\0\10\10\1\141\16\10"+
    "\12\0\4\10\4\0\6\10\1\142\20\10\12\0\4\10"+
    "\4\0\3\10\1\143\23\10\12\0\4\10\4\0\1\10"+
    "\1\144\25\10\12\0\4\10\4\0\23\10\1\145\3\10"+
    "\12\0\4\10\4\0\2\10\1\146\24\10\12\0\4\10"+
    "\4\0\23\10\1\147\3\10\12\0\4\10\4\0\3\10"+
    "\1\150\23\10\12\0\4\10\4\0\7\10\1\151\17\10"+
    "\12\0\4\10\4\0\20\10\1\152\6\10\12\0\4\10"+
    "\4\0\13\10\1\153\13\10\12\0\4\10\4\0\20\10"+
    "\1\154\6\10\12\0\4\10\4\0\12\10\1\155\14\10"+
    "\12\0\4\10\4\0\12\10\1\156\14\10\12\0\4\10"+
    "\4\0\4\10\1\157\22\10\12\0\4\10\4\0\13\10"+
    "\1\160\13\10\12\0\4\10\4\0\3\10\1\161\23\10"+
    "\12\0\4\10\4\0\1\162\26\10\12\0\4\10\4\0"+
    "\11\10\1\163\15\10\12\0\4\10\4\0\4\10\1\164"+
    "\22\10\12\0\4\10\4\0\4\10\1\165\22\10\12\0"+
    "\4\10\4\0\7\10\1\166\17\10\12\0\4\10\4\0"+
    "\3\10\1\167\23\10\12\0\4\10\4\0\11\10\1\170"+
    "\15\10\12\0\4\10\4\0\4\10\1\171\5\10\1\172"+
    "\14\10\12\0\4\10\4\0\2\10\1\173\24\10\12\0"+
    "\4\10\4\0\3\10\1\174\23\10\12\0\4\10\4\0"+
    "\6\10\1\175\20\10\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3485];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\33\1\2\0\1\11\3\0\35\1\1\0"+
    "\1\11\73\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public LamaLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LamaLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 47: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 48: break;
          case 3: 
            { return INFIXOP;
            } 
            // fall through
          case 49: break;
          case 4: 
            { return UIDENT;
            } 
            // fall through
          case 50: break;
          case 5: 
            { return LIDENT;
            } 
            // fall through
          case 51: break;
          case 6: 
            { return DECIMAL;
            } 
            // fall through
          case 52: break;
          case 7: 
            { return ALT;
            } 
            // fall through
          case 53: break;
          case 8: 
            { return SHARP;
            } 
            // fall through
          case 54: break;
          case 9: 
            { return SINGLECOMMENT;
            } 
            // fall through
          case 55: break;
          case 10: 
            { return HENCE;
            } 
            // fall through
          case 56: break;
          case 11: 
            { return STRING;
            } 
            // fall through
          case 57: break;
          case 12: 
            { return AT;
            } 
            // fall through
          case 58: break;
          case 13: 
            { return FI;
            } 
            // fall through
          case 59: break;
          case 14: 
            { return IF;
            } 
            // fall through
          case 60: break;
          case 15: 
            { return OF;
            } 
            // fall through
          case 61: break;
          case 16: 
            { return OD;
            } 
            // fall through
          case 62: break;
          case 17: 
            { return DO;
            } 
            // fall through
          case 63: break;
          case 18: 
            { return CHAR;
            } 
            // fall through
          case 64: break;
          case 19: 
            { return FUN;
            } 
            // fall through
          case 65: break;
          case 20: 
            { return FOR;
            } 
            // fall through
          case 66: break;
          case 21: 
            { return ETA;
            } 
            // fall through
          case 67: break;
          case 22: 
            { return STR;
            } 
            // fall through
          case 68: break;
          case 23: 
            { return BOX;
            } 
            // fall through
          case 69: break;
          case 24: 
            { return VAR;
            } 
            // fall through
          case 70: break;
          case 25: 
            { return VAL;
            } 
            // fall through
          case 71: break;
          case 26: 
            { return MULTICOMMENT;
            } 
            // fall through
          case 72: break;
          case 27: 
            { return TRUE;
            } 
            // fall through
          case 73: break;
          case 28: 
            { return THEN;
            } 
            // fall through
          case 74: break;
          case 29: 
            { return ESAC;
            } 
            // fall through
          case 75: break;
          case 30: 
            { return ELSE;
            } 
            // fall through
          case 76: break;
          case 31: 
            { return ELIF;
            } 
            // fall through
          case 77: break;
          case 32: 
            { return SEXP;
            } 
            // fall through
          case 78: break;
          case 33: 
            { return SKIP;
            } 
            // fall through
          case 79: break;
          case 34: 
            { return CASE;
            } 
            // fall through
          case 80: break;
          case 35: 
            { return LAZY;
            } 
            // fall through
          case 81: break;
          case 36: 
            { return AFTER;
            } 
            // fall through
          case 82: break;
          case 37: 
            { return ARRAY;
            } 
            // fall through
          case 83: break;
          case 38: 
            { return FALSE;
            } 
            // fall through
          case 84: break;
          case 39: 
            { return INFIX;
            } 
            // fall through
          case 85: break;
          case 40: 
            { return WHILE;
            } 
            // fall through
          case 86: break;
          case 41: 
            { return SYNTAX;
            } 
            // fall through
          case 87: break;
          case 42: 
            { return INFIXR;
            } 
            // fall through
          case 88: break;
          case 43: 
            { return INFIXL;
            } 
            // fall through
          case 89: break;
          case 44: 
            { return IMPORT;
            } 
            // fall through
          case 90: break;
          case 45: 
            { return BEFORE;
            } 
            // fall through
          case 91: break;
          case 46: 
            { return PUBLIC;
            } 
            // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}