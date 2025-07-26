// $ANTLR 3.5.3 com/github/gumtreediff/gen/antlr3/php/Php.g 2025-04-14 15:35:28
 package com.github.gumtreediff.gen.antlr3.php; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class PhpLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__112=112;
	public static final int Abstract=4;
	public static final int AccessModifier=5;
	public static final int Ampersand=6;
	public static final int And=7;
	public static final int Apply=8;
	public static final int Array=9;
	public static final int ArrayAssign=10;
	public static final int AsignmentOperator=11;
	public static final int Asterisk=12;
	public static final int Bang=13;
	public static final int Block=14;
	public static final int BodyString=15;
	public static final int Boolean=16;
	public static final int Break=17;
	public static final int Case=18;
	public static final int Cast=19;
	public static final int Class=20;
	public static final int ClassDefinition=21;
	public static final int ClassMember=22;
	public static final int Clone=23;
	public static final int CloseBrace=24;
	public static final int CloseCurlyBrace=25;
	public static final int CloseSquareBrace=26;
	public static final int Colon=27;
	public static final int Comma=28;
	public static final int ComparisionOperator=29;
	public static final int Const=30;
	public static final int Continue=31;
	public static final int DNum=32;
	public static final int Decimal=33;
	public static final int Default=34;
	public static final int Digits=35;
	public static final int Do=36;
	public static final int Dollar=37;
	public static final int Dot=38;
	public static final int DoubleQuotedString=39;
	public static final int Echo=40;
	public static final int Else=41;
	public static final int ElseIf=42;
	public static final int Empty=43;
	public static final int Eol=44;
	public static final int EqualityOperator=45;
	public static final int Equals=46;
	public static final int EscapeCharector=47;
	public static final int Exponent_DNum=48;
	public static final int Extends=49;
	public static final int Field=50;
	public static final int FirstBodyString=51;
	public static final int For=52;
	public static final int ForCondition=53;
	public static final int ForInit=54;
	public static final int ForUpdate=55;
	public static final int Foreach=56;
	public static final int Forwardslash=57;
	public static final int Function=58;
	public static final int Global=59;
	public static final int HereDoc=60;
	public static final int HereDocContents=61;
	public static final int Hexadecimal=62;
	public static final int If=63;
	public static final int IfExpression=64;
	public static final int Implements=65;
	public static final int IncrementOperator=66;
	public static final int InstanceMember=67;
	public static final int Instanceof=68;
	public static final int Integer=69;
	public static final int Interface=70;
	public static final int Label=71;
	public static final int LogicalAnd=72;
	public static final int LogicalOr=73;
	public static final int Member=74;
	public static final int Method=75;
	public static final int Minus=76;
	public static final int Modifiers=77;
	public static final int MultilineComment=78;
	public static final int New=79;
	public static final int Octal=80;
	public static final int OpenBrace=81;
	public static final int OpenCurlyBrace=82;
	public static final int OpenSquareBrace=83;
	public static final int Or=84;
	public static final int Params=85;
	public static final int Percent=86;
	public static final int Pipe=87;
	public static final int Plus=88;
	public static final int Postfix=89;
	public static final int Prefix=90;
	public static final int PrimitiveType=91;
	public static final int QuestionMark=92;
	public static final int Real=93;
	public static final int Reference=94;
	public static final int RequireOperator=95;
	public static final int Return=96;
	public static final int SemiColon=97;
	public static final int ShiftOperator=98;
	public static final int SingleQuotedString=99;
	public static final int SinglelineComment=100;
	public static final int Static=101;
	public static final int SuppressWarnings=102;
	public static final int Switch=103;
	public static final int Throw=104;
	public static final int Tilde=105;
	public static final int UnixComment=106;
	public static final int UnquotedString=107;
	public static final int Var=108;
	public static final int While=109;
	public static final int WhiteSpace=110;
	public static final int Xor=111;

	    // Handle the first token, which will always be a BodyString.
	    public Token nextToken(){
	        //The following code was pulled out from super.nextToken()
	        if (input.index() == 0) {
	            try {
	                state.token = null;
	                state.channel = Token.DEFAULT_CHANNEL;
	                state.tokenStartCharIndex = input.index();
	                state.tokenStartCharPositionInLine = input.getCharPositionInLine();
	                state.tokenStartLine = input.getLine();
	                state.text = null;
	                mFirstBodyString();
	                state.type = BodyString;
	                emit();
	                return state.token;
	            } catch (NoViableAltException nva) {
	                reportError(nva);
	                recover(nva); // throw out current char and try again
	            } catch (RecognitionException re) {
	                reportError(re);
	                // match() routine has already called recover()
	            }    
	        }
	        return super.nextToken();
	    }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PhpLexer() {} 
	public PhpLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PhpLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "com/github/gumtreediff/gen/antlr3/php/Php.g"; }

	// $ANTLR start "Abstract"
	public final void mAbstract() throws RecognitionException {
		try {
			int _type = Abstract;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:31:10: ( 'abstract' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:31:12: 'abstract'
			{
			match("abstract"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Abstract"

	// $ANTLR start "Ampersand"
	public final void mAmpersand() throws RecognitionException {
		try {
			int _type = Ampersand;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:32:11: ( '&' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:32:13: '&'
			{
			match('&'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Ampersand"

	// $ANTLR start "And"
	public final void mAnd() throws RecognitionException {
		try {
			int _type = And;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:33:5: ( 'and' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:33:7: 'and'
			{
			match("and"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "And"

	// $ANTLR start "ArrayAssign"
	public final void mArrayAssign() throws RecognitionException {
		try {
			int _type = ArrayAssign;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:34:13: ( '=>' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:34:15: '=>'
			{
			match("=>"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ArrayAssign"

	// $ANTLR start "Asterisk"
	public final void mAsterisk() throws RecognitionException {
		try {
			int _type = Asterisk;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:35:10: ( '*' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:35:12: '*'
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Asterisk"

	// $ANTLR start "Bang"
	public final void mBang() throws RecognitionException {
		try {
			int _type = Bang;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:36:6: ( '!' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:36:8: '!'
			{
			match('!'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Bang"

	// $ANTLR start "Break"
	public final void mBreak() throws RecognitionException {
		try {
			int _type = Break;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:37:7: ( 'break' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:37:9: 'break'
			{
			match("break"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Break"

	// $ANTLR start "Case"
	public final void mCase() throws RecognitionException {
		try {
			int _type = Case;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:38:6: ( 'case' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:38:8: 'case'
			{
			match("case"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Case"

	// $ANTLR start "Class"
	public final void mClass() throws RecognitionException {
		try {
			int _type = Class;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:39:7: ( 'class' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:39:9: 'class'
			{
			match("class"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Class"

	// $ANTLR start "ClassMember"
	public final void mClassMember() throws RecognitionException {
		try {
			int _type = ClassMember;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:40:13: ( '::' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:40:15: '::'
			{
			match("::"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ClassMember"

	// $ANTLR start "Clone"
	public final void mClone() throws RecognitionException {
		try {
			int _type = Clone;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:41:7: ( 'clone' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:41:9: 'clone'
			{
			match("clone"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Clone"

	// $ANTLR start "CloseBrace"
	public final void mCloseBrace() throws RecognitionException {
		try {
			int _type = CloseBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:42:12: ( ')' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:42:14: ')'
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CloseBrace"

	// $ANTLR start "CloseCurlyBrace"
	public final void mCloseCurlyBrace() throws RecognitionException {
		try {
			int _type = CloseCurlyBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:43:17: ( '}' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:43:19: '}'
			{
			match('}'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CloseCurlyBrace"

	// $ANTLR start "CloseSquareBrace"
	public final void mCloseSquareBrace() throws RecognitionException {
		try {
			int _type = CloseSquareBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:44:18: ( ']' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:44:20: ']'
			{
			match(']'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CloseSquareBrace"

	// $ANTLR start "Colon"
	public final void mColon() throws RecognitionException {
		try {
			int _type = Colon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:45:7: ( ':' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:45:9: ':'
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Colon"

	// $ANTLR start "Comma"
	public final void mComma() throws RecognitionException {
		try {
			int _type = Comma;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:46:7: ( ',' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:46:9: ','
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comma"

	// $ANTLR start "Const"
	public final void mConst() throws RecognitionException {
		try {
			int _type = Const;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:47:7: ( 'const' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:47:9: 'const'
			{
			match("const"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Const"

	// $ANTLR start "Continue"
	public final void mContinue() throws RecognitionException {
		try {
			int _type = Continue;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:48:10: ( 'continue' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:48:12: 'continue'
			{
			match("continue"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Continue"

	// $ANTLR start "Default"
	public final void mDefault() throws RecognitionException {
		try {
			int _type = Default;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:49:9: ( 'default' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:49:11: 'default'
			{
			match("default"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Default"

	// $ANTLR start "Do"
	public final void mDo() throws RecognitionException {
		try {
			int _type = Do;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:50:4: ( 'do' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:50:6: 'do'
			{
			match("do"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Do"

	// $ANTLR start "Dollar"
	public final void mDollar() throws RecognitionException {
		try {
			int _type = Dollar;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:51:8: ( '$' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:51:10: '$'
			{
			match('$'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dollar"

	// $ANTLR start "Dot"
	public final void mDot() throws RecognitionException {
		try {
			int _type = Dot;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:52:5: ( '.' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:52:7: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dot"

	// $ANTLR start "Echo"
	public final void mEcho() throws RecognitionException {
		try {
			int _type = Echo;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:53:6: ( 'echo' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:53:8: 'echo'
			{
			match("echo"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Echo"

	// $ANTLR start "Else"
	public final void mElse() throws RecognitionException {
		try {
			int _type = Else;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:54:6: ( 'else' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:54:8: 'else'
			{
			match("else"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Else"

	// $ANTLR start "ElseIf"
	public final void mElseIf() throws RecognitionException {
		try {
			int _type = ElseIf;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:55:8: ( 'elseif' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:55:10: 'elseif'
			{
			match("elseif"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ElseIf"

	// $ANTLR start "Equals"
	public final void mEquals() throws RecognitionException {
		try {
			int _type = Equals;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:56:8: ( '=' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:56:10: '='
			{
			match('='); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Equals"

	// $ANTLR start "Extends"
	public final void mExtends() throws RecognitionException {
		try {
			int _type = Extends;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:57:9: ( 'extends' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:57:11: 'extends'
			{
			match("extends"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Extends"

	// $ANTLR start "For"
	public final void mFor() throws RecognitionException {
		try {
			int _type = For;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:58:5: ( 'for' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:58:7: 'for'
			{
			match("for"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "For"

	// $ANTLR start "Foreach"
	public final void mForeach() throws RecognitionException {
		try {
			int _type = Foreach;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:59:9: ( 'foreach' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:59:11: 'foreach'
			{
			match("foreach"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Foreach"

	// $ANTLR start "Forwardslash"
	public final void mForwardslash() throws RecognitionException {
		try {
			int _type = Forwardslash;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:60:14: ( '/' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:60:16: '/'
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Forwardslash"

	// $ANTLR start "Function"
	public final void mFunction() throws RecognitionException {
		try {
			int _type = Function;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:61:10: ( 'function' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:61:12: 'function'
			{
			match("function"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Function"

	// $ANTLR start "Global"
	public final void mGlobal() throws RecognitionException {
		try {
			int _type = Global;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:62:8: ( 'global' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:62:10: 'global'
			{
			match("global"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Global"

	// $ANTLR start "If"
	public final void mIf() throws RecognitionException {
		try {
			int _type = If;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:63:4: ( 'if' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:63:6: 'if'
			{
			match("if"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "If"

	// $ANTLR start "Implements"
	public final void mImplements() throws RecognitionException {
		try {
			int _type = Implements;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:64:12: ( 'implements' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:64:14: 'implements'
			{
			match("implements"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Implements"

	// $ANTLR start "InstanceMember"
	public final void mInstanceMember() throws RecognitionException {
		try {
			int _type = InstanceMember;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:65:16: ( '->' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:65:18: '->'
			{
			match("->"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "InstanceMember"

	// $ANTLR start "Instanceof"
	public final void mInstanceof() throws RecognitionException {
		try {
			int _type = Instanceof;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:66:12: ( 'instanceof' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:66:14: 'instanceof'
			{
			match("instanceof"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Instanceof"

	// $ANTLR start "Interface"
	public final void mInterface() throws RecognitionException {
		try {
			int _type = Interface;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:67:11: ( 'interface' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:67:13: 'interface'
			{
			match("interface"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Interface"

	// $ANTLR start "LogicalAnd"
	public final void mLogicalAnd() throws RecognitionException {
		try {
			int _type = LogicalAnd;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:68:12: ( '&&' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:68:14: '&&'
			{
			match("&&"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LogicalAnd"

	// $ANTLR start "LogicalOr"
	public final void mLogicalOr() throws RecognitionException {
		try {
			int _type = LogicalOr;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:69:11: ( '||' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:69:13: '||'
			{
			match("||"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LogicalOr"

	// $ANTLR start "Minus"
	public final void mMinus() throws RecognitionException {
		try {
			int _type = Minus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:70:7: ( '-' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:70:9: '-'
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Minus"

	// $ANTLR start "New"
	public final void mNew() throws RecognitionException {
		try {
			int _type = New;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:71:5: ( 'new' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:71:7: 'new'
			{
			match("new"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "New"

	// $ANTLR start "OpenBrace"
	public final void mOpenBrace() throws RecognitionException {
		try {
			int _type = OpenBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:72:11: ( '(' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:72:13: '('
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OpenBrace"

	// $ANTLR start "OpenCurlyBrace"
	public final void mOpenCurlyBrace() throws RecognitionException {
		try {
			int _type = OpenCurlyBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:73:16: ( '{' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:73:18: '{'
			{
			match('{'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OpenCurlyBrace"

	// $ANTLR start "OpenSquareBrace"
	public final void mOpenSquareBrace() throws RecognitionException {
		try {
			int _type = OpenSquareBrace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:74:17: ( '[' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:74:19: '['
			{
			match('['); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OpenSquareBrace"

	// $ANTLR start "Or"
	public final void mOr() throws RecognitionException {
		try {
			int _type = Or;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:75:4: ( 'or' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:75:6: 'or'
			{
			match("or"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Or"

	// $ANTLR start "Percent"
	public final void mPercent() throws RecognitionException {
		try {
			int _type = Percent;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:76:9: ( '%' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:76:11: '%'
			{
			match('%'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Percent"

	// $ANTLR start "Pipe"
	public final void mPipe() throws RecognitionException {
		try {
			int _type = Pipe;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:77:6: ( '|' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:77:8: '|'
			{
			match('|'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Pipe"

	// $ANTLR start "Plus"
	public final void mPlus() throws RecognitionException {
		try {
			int _type = Plus;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:78:6: ( '+' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:78:8: '+'
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Plus"

	// $ANTLR start "QuestionMark"
	public final void mQuestionMark() throws RecognitionException {
		try {
			int _type = QuestionMark;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:79:14: ( '?' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:79:16: '?'
			{
			match('?'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QuestionMark"

	// $ANTLR start "Return"
	public final void mReturn() throws RecognitionException {
		try {
			int _type = Return;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:80:8: ( 'return' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:80:10: 'return'
			{
			match("return"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Return"

	// $ANTLR start "SemiColon"
	public final void mSemiColon() throws RecognitionException {
		try {
			int _type = SemiColon;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:81:11: ( ';' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:81:13: ';'
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SemiColon"

	// $ANTLR start "Static"
	public final void mStatic() throws RecognitionException {
		try {
			int _type = Static;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:82:8: ( 'static' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:82:10: 'static'
			{
			match("static"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Static"

	// $ANTLR start "SuppressWarnings"
	public final void mSuppressWarnings() throws RecognitionException {
		try {
			int _type = SuppressWarnings;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:83:18: ( '@' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:83:20: '@'
			{
			match('@'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SuppressWarnings"

	// $ANTLR start "Switch"
	public final void mSwitch() throws RecognitionException {
		try {
			int _type = Switch;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:84:8: ( 'switch' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:84:10: 'switch'
			{
			match("switch"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Switch"

	// $ANTLR start "Throw"
	public final void mThrow() throws RecognitionException {
		try {
			int _type = Throw;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:85:7: ( 'throw' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:85:9: 'throw'
			{
			match("throw"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Throw"

	// $ANTLR start "Tilde"
	public final void mTilde() throws RecognitionException {
		try {
			int _type = Tilde;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:86:7: ( '~' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:86:9: '~'
			{
			match('~'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Tilde"

	// $ANTLR start "Var"
	public final void mVar() throws RecognitionException {
		try {
			int _type = Var;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:87:5: ( 'var' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:87:7: 'var'
			{
			match("var"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Var"

	// $ANTLR start "While"
	public final void mWhile() throws RecognitionException {
		try {
			int _type = While;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:88:7: ( 'while' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:88:9: 'while'
			{
			match("while"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "While"

	// $ANTLR start "Xor"
	public final void mXor() throws RecognitionException {
		try {
			int _type = Xor;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:89:5: ( 'xor' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:89:7: 'xor'
			{
			match("xor"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Xor"

	// $ANTLR start "T__112"
	public final void mT__112() throws RecognitionException {
		try {
			int _type = T__112;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:90:8: ( 'as' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:90:10: 'as'
			{
			match("as"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__112"

	// $ANTLR start "BodyString"
	public final void mBodyString() throws RecognitionException {
		try {
			int _type = BodyString;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:437:5: ( '?>' ( ( '<' ~ '?' )=> '<' |~ '<' )* ( '<?' ( ( 'php' )? ) )? )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:437:7: '?>' ( ( '<' ~ '?' )=> '<' |~ '<' )* ( '<?' ( ( 'php' )? ) )?
			{
			match("?>"); if (state.failed) return;

			// com/github/gumtreediff/gen/antlr3/php/Php.g:437:12: ( ( '<' ~ '?' )=> '<' |~ '<' )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='<') ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1=='?') ) {
						int LA1_4 = input.LA(3);
						if ( (synpred1_Php()) ) {
							alt1=1;
						}

					}
					else if ( (LA1_1=='<') && (synpred1_Php())) {
						alt1=1;
					}
					else if ( ((LA1_1 >= '\u0000' && LA1_1 <= ';')||(LA1_1 >= '=' && LA1_1 <= '>')||(LA1_1 >= '@' && LA1_1 <= '\uFFFF')) && (synpred1_Php())) {
						alt1=1;
					}
					else {
						alt1=1;
					}

				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= ';')||(LA1_0 >= '=' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:437:13: ( '<' ~ '?' )=> '<'
					{
					match('<'); if (state.failed) return;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:437:33: ~ '<'
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ';')||(input.LA(1) >= '=' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			// com/github/gumtreediff/gen/antlr3/php/Php.g:437:41: ( '<?' ( ( 'php' )? ) )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='<') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:437:42: '<?' ( ( 'php' )? )
					{
					match("<?"); if (state.failed) return;

					// com/github/gumtreediff/gen/antlr3/php/Php.g:437:47: ( ( 'php' )? )
					// com/github/gumtreediff/gen/antlr3/php/Php.g:437:48: ( 'php' )?
					{
					// com/github/gumtreediff/gen/antlr3/php/Php.g:437:48: ( 'php' )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0=='p') ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:437:48: 'php'
							{
							match("php"); if (state.failed) return;

							}
							break;

					}

					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BodyString"

	// $ANTLR start "FirstBodyString"
	public final void mFirstBodyString() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:443:5: ( ( ( '<' ~ '?' )=> '<' |~ '<' )* '<?' ( ( 'php' )? ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:443:7: ( ( '<' ~ '?' )=> '<' |~ '<' )* '<?' ( ( 'php' )? )
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:443:7: ( ( '<' ~ '?' )=> '<' |~ '<' )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='<') ) {
					int LA4_1 = input.LA(2);
					if ( (LA4_1=='?') ) {
						int LA4_3 = input.LA(3);
						if ( (LA4_3=='p') ) {
							int LA4_6 = input.LA(4);
							if ( (LA4_6=='h') ) {
								int LA4_8 = input.LA(5);
								if ( (LA4_8=='p') ) {
									int LA4_9 = input.LA(6);
									if ( (LA4_9=='<') && (synpred2_Php())) {
										alt4=1;
									}
									else if ( ((LA4_9 >= '\u0000' && LA4_9 <= ';')||(LA4_9 >= '=' && LA4_9 <= '\uFFFF')) && (synpred2_Php())) {
										alt4=1;
									}

								}
								else if ( (LA4_8=='<') && (synpred2_Php())) {
									alt4=1;
								}
								else if ( ((LA4_8 >= '\u0000' && LA4_8 <= ';')||(LA4_8 >= '=' && LA4_8 <= 'o')||(LA4_8 >= 'q' && LA4_8 <= '\uFFFF')) && (synpred2_Php())) {
									alt4=1;
								}

							}
							else if ( (LA4_6=='<') && (synpred2_Php())) {
								alt4=1;
							}
							else if ( ((LA4_6 >= '\u0000' && LA4_6 <= ';')||(LA4_6 >= '=' && LA4_6 <= 'g')||(LA4_6 >= 'i' && LA4_6 <= '\uFFFF')) && (synpred2_Php())) {
								alt4=1;
							}

						}
						else if ( (LA4_3=='<') && (synpred2_Php())) {
							alt4=1;
						}
						else if ( ((LA4_3 >= '\u0000' && LA4_3 <= ';')||(LA4_3 >= '=' && LA4_3 <= 'o')||(LA4_3 >= 'q' && LA4_3 <= '\uFFFF')) && (synpred2_Php())) {
							alt4=1;
						}

					}
					else if ( (LA4_1=='<') && (synpred2_Php())) {
						alt4=1;
					}
					else if ( ((LA4_1 >= '\u0000' && LA4_1 <= ';')||(LA4_1 >= '=' && LA4_1 <= '>')||(LA4_1 >= '@' && LA4_1 <= '\uFFFF')) && (synpred2_Php())) {
						alt4=1;
					}

				}
				else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ';')||(LA4_0 >= '=' && LA4_0 <= '\uFFFF')) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:443:8: ( '<' ~ '?' )=> '<'
					{
					match('<'); if (state.failed) return;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:443:28: ~ '<'
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ';')||(input.LA(1) >= '=' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			match("<?"); if (state.failed) return;

			// com/github/gumtreediff/gen/antlr3/php/Php.g:443:41: ( ( 'php' )? )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:443:42: ( 'php' )?
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:443:42: ( 'php' )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='p') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:443:42: 'php'
					{
					match("php"); if (state.failed) return;

					}
					break;

			}

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FirstBodyString"

	// $ANTLR start "MultilineComment"
	public final void mMultilineComment() throws RecognitionException {
		try {
			int _type = MultilineComment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:446:5: ( '/*' ( ( '*' ~ '/' )=> '*' |~ '*' )* '*/' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:446:7: '/*' ( ( '*' ~ '/' )=> '*' |~ '*' )* '*/'
			{
			match("/*"); if (state.failed) return;

			// com/github/gumtreediff/gen/antlr3/php/Php.g:446:12: ( ( '*' ~ '/' )=> '*' |~ '*' )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='*') ) {
					int LA6_1 = input.LA(2);
					if ( (LA6_1=='/') ) {
						int LA6_3 = input.LA(3);
						if ( (LA6_3=='*') && (synpred3_Php())) {
							alt6=1;
						}
						else if ( ((LA6_3 >= '\u0000' && LA6_3 <= ')')||(LA6_3 >= '+' && LA6_3 <= '\uFFFF')) && (synpred3_Php())) {
							alt6=1;
						}

					}
					else if ( (LA6_1=='*') && (synpred3_Php())) {
						alt6=1;
					}
					else if ( ((LA6_1 >= '\u0000' && LA6_1 <= ')')||(LA6_1 >= '+' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) && (synpred3_Php())) {
						alt6=1;
					}

				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:446:13: ( '*' ~ '/' )=> '*'
					{
					match('*'); if (state.failed) return;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:446:32: ~ '*'
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ')')||(input.LA(1) >= '+' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			match("*/"); if (state.failed) return;

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MultilineComment"

	// $ANTLR start "SinglelineComment"
	public final void mSinglelineComment() throws RecognitionException {
		try {
			int _type = SinglelineComment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:450:5: ( '//' ( ( '?' ~ '>' )=> '?' |~ ( '\\n' | '?' ) )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:450:7: '//' ( ( '?' ~ '>' )=> '?' |~ ( '\\n' | '?' ) )*
			{
			match("//"); if (state.failed) return;

			// com/github/gumtreediff/gen/antlr3/php/Php.g:450:13: ( ( '?' ~ '>' )=> '?' |~ ( '\\n' | '?' ) )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='?') && (synpred4_Php())) {
					alt7=1;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '>')||(LA7_0 >= '@' && LA7_0 <= '\uFFFF')) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:450:14: ( '?' ~ '>' )=> '?'
					{
					match('?'); if (state.failed) return;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:450:32: ~ ( '\\n' | '?' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '>')||(input.LA(1) >= '@' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SinglelineComment"

	// $ANTLR start "UnixComment"
	public final void mUnixComment() throws RecognitionException {
		try {
			int _type = UnixComment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:454:5: ( '#' ( ( '?' ~ '>' )=> '?' |~ ( '\\n' | '?' ) )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:454:7: '#' ( ( '?' ~ '>' )=> '?' |~ ( '\\n' | '?' ) )*
			{
			match('#'); if (state.failed) return;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:454:11: ( ( '?' ~ '>' )=> '?' |~ ( '\\n' | '?' ) )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='?') && (synpred5_Php())) {
					alt8=1;
				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '>')||(LA8_0 >= '@' && LA8_0 <= '\uFFFF')) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:454:12: ( '?' ~ '>' )=> '?'
					{
					match('?'); if (state.failed) return;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:454:30: ~ ( '\\n' | '?' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '>')||(input.LA(1) >= '@' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			if ( state.backtracking==0 ) {_channel=HIDDEN;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UnixComment"

	// $ANTLR start "Array"
	public final void mArray() throws RecognitionException {
		try {
			int _type = Array;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:459:5: ( ( 'a' | 'A' ) ( 'r' | 'R' ) ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'y' | 'Y' ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:459:7: ( 'a' | 'A' ) ( 'r' | 'R' ) ( 'r' | 'R' ) ( 'a' | 'A' ) ( 'y' | 'Y' )
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Array"

	// $ANTLR start "RequireOperator"
	public final void mRequireOperator() throws RecognitionException {
		try {
			int _type = RequireOperator;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:463:5: ( 'require' | 'require_once' | 'include' | 'include_once' )
			int alt9=4;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='r') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='e') ) {
					int LA9_3 = input.LA(3);
					if ( (LA9_3=='q') ) {
						int LA9_5 = input.LA(4);
						if ( (LA9_5=='u') ) {
							int LA9_7 = input.LA(5);
							if ( (LA9_7=='i') ) {
								int LA9_9 = input.LA(6);
								if ( (LA9_9=='r') ) {
									int LA9_11 = input.LA(7);
									if ( (LA9_11=='e') ) {
										int LA9_13 = input.LA(8);
										if ( (LA9_13=='_') ) {
											alt9=2;
										}

										else {
											alt9=1;
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 9, 11, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 9, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA9_0=='i') ) {
				int LA9_2 = input.LA(2);
				if ( (LA9_2=='n') ) {
					int LA9_4 = input.LA(3);
					if ( (LA9_4=='c') ) {
						int LA9_6 = input.LA(4);
						if ( (LA9_6=='l') ) {
							int LA9_8 = input.LA(5);
							if ( (LA9_8=='u') ) {
								int LA9_10 = input.LA(6);
								if ( (LA9_10=='d') ) {
									int LA9_12 = input.LA(7);
									if ( (LA9_12=='e') ) {
										int LA9_14 = input.LA(8);
										if ( (LA9_14=='_') ) {
											alt9=4;
										}

										else {
											alt9=3;
										}

									}

									else {
										if (state.backtracking>0) {state.failed=true; return;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 9, 12, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:463:7: 'require'
					{
					match("require"); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:463:19: 'require_once'
					{
					match("require_once"); if (state.failed) return;

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:463:36: 'include'
					{
					match("include"); if (state.failed) return;

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:463:48: 'include_once'
					{
					match("include_once"); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RequireOperator"

	// $ANTLR start "PrimitiveType"
	public final void mPrimitiveType() throws RecognitionException {
		try {
			int _type = PrimitiveType;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:467:5: ( 'int' | 'float' | 'string' | 'array' | 'object' | 'bool' )
			int alt10=6;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt10=1;
				}
				break;
			case 'f':
				{
				alt10=2;
				}
				break;
			case 's':
				{
				alt10=3;
				}
				break;
			case 'a':
				{
				alt10=4;
				}
				break;
			case 'o':
				{
				alt10=5;
				}
				break;
			case 'b':
				{
				alt10=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:467:7: 'int'
					{
					match("int"); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:467:13: 'float'
					{
					match("float"); if (state.failed) return;

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:467:21: 'string'
					{
					match("string"); if (state.failed) return;

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:467:30: 'array'
					{
					match("array"); if (state.failed) return;

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:467:38: 'object'
					{
					match("object"); if (state.failed) return;

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:467:47: 'bool'
					{
					match("bool"); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PrimitiveType"

	// $ANTLR start "AccessModifier"
	public final void mAccessModifier() throws RecognitionException {
		try {
			int _type = AccessModifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:471:5: ( 'public' | 'private' | 'protected' )
			int alt11=3;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='p') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='u') ) {
					alt11=1;
				}
				else if ( (LA11_1=='r') ) {
					int LA11_3 = input.LA(3);
					if ( (LA11_3=='i') ) {
						alt11=2;
					}
					else if ( (LA11_3=='o') ) {
						alt11=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:471:7: 'public'
					{
					match("public"); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:471:18: 'private'
					{
					match("private"); if (state.failed) return;

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:471:30: 'protected'
					{
					match("protected"); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AccessModifier"

	// $ANTLR start "Decimal"
	public final void mDecimal() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:477:2: ( ( '1' .. '9' ( '0' .. '9' )* ) | '0' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= '1' && LA13_0 <= '9')) ) {
				alt13=1;
			}
			else if ( (LA13_0=='0') ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:477:3: ( '1' .. '9' ( '0' .. '9' )* )
					{
					// com/github/gumtreediff/gen/antlr3/php/Php.g:477:3: ( '1' .. '9' ( '0' .. '9' )* )
					// com/github/gumtreediff/gen/antlr3/php/Php.g:477:4: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); if (state.failed) return;
					// com/github/gumtreediff/gen/antlr3/php/Php.g:477:13: ( '0' .. '9' )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop12;
						}
					}

					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:477:26: '0'
					{
					match('0'); if (state.failed) return;
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Decimal"

	// $ANTLR start "Hexadecimal"
	public final void mHexadecimal() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:481:2: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:481:4: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
			{
			match('0'); if (state.failed) return;
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// com/github/gumtreediff/gen/antlr3/php/Php.g:481:16: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')||(LA14_0 >= 'A' && LA14_0 <= 'F')||(LA14_0 >= 'a' && LA14_0 <= 'f')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Hexadecimal"

	// $ANTLR start "Octal"
	public final void mOctal() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:486:2: ( '0' ( '0' .. '7' )+ )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:486:4: '0' ( '0' .. '7' )+
			{
			match('0'); if (state.failed) return;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:486:7: ( '0' .. '7' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '7')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Octal"

	// $ANTLR start "Integer"
	public final void mInteger() throws RecognitionException {
		try {
			int _type = Integer;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:488:2: ( Octal | Decimal | Hexadecimal )
			int alt16=3;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='0') ) {
				switch ( input.LA(2) ) {
				case 'X':
				case 'x':
					{
					alt16=3;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt16=1;
					}
					break;
				default:
					alt16=2;
				}
			}
			else if ( ((LA16_0 >= '1' && LA16_0 <= '9')) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:488:3: Octal
					{
					mOctal(); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:488:9: Decimal
					{
					mDecimal(); if (state.failed) return;

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:488:17: Hexadecimal
					{
					mHexadecimal(); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer"

	// $ANTLR start "Digits"
	public final void mDigits() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:494:2: ( ( '0' .. '9' )+ )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:494:4: ( '0' .. '9' )+
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:494:4: ( '0' .. '9' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digits"

	// $ANTLR start "DNum"
	public final void mDNum() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:499:2: ( ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:499:3: ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) )
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:499:3: ( ( '.' Digits )=> ( '.' Digits ) | ( Digits '.' ( Digits )? ) )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='.') && (synpred6_Php())) {
				alt19=1;
			}
			else if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
				alt19=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:499:4: ( '.' Digits )=> ( '.' Digits )
					{
					// com/github/gumtreediff/gen/antlr3/php/Php.g:499:18: ( '.' Digits )
					// com/github/gumtreediff/gen/antlr3/php/Php.g:499:19: '.' Digits
					{
					match('.'); if (state.failed) return;
					mDigits(); if (state.failed) return;

					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:499:31: ( Digits '.' ( Digits )? )
					{
					// com/github/gumtreediff/gen/antlr3/php/Php.g:499:31: ( Digits '.' ( Digits )? )
					// com/github/gumtreediff/gen/antlr3/php/Php.g:499:32: Digits '.' ( Digits )?
					{
					mDigits(); if (state.failed) return;

					match('.'); if (state.failed) return;
					// com/github/gumtreediff/gen/antlr3/php/Php.g:499:43: ( Digits )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:499:43: Digits
							{
							mDigits(); if (state.failed) return;

							}
							break;

					}

					}

					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DNum"

	// $ANTLR start "Exponent_DNum"
	public final void mExponent_DNum() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:504:2: ( ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:504:3: ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits )
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:504:3: ( ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:504:4: ( Digits | DNum ) ( 'e' | 'E' ) ( '+' '-' )? Digits
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:504:4: ( Digits | DNum )
			int alt20=2;
			alt20 = dfa20.predict(input);
			switch (alt20) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:504:5: Digits
					{
					mDigits(); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:504:12: DNum
					{
					mDNum(); if (state.failed) return;

					}
					break;

			}

			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// com/github/gumtreediff/gen/antlr3/php/Php.g:504:26: ( '+' '-' )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='+') ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:504:27: '+' '-'
					{
					match('+'); if (state.failed) return;
					match('-'); if (state.failed) return;
					}
					break;

			}

			mDigits(); if (state.failed) return;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent_DNum"

	// $ANTLR start "Real"
	public final void mReal() throws RecognitionException {
		try {
			int _type = Real;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:507:5: ( DNum | Exponent_DNum )
			int alt22=2;
			alt22 = dfa22.predict(input);
			switch (alt22) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:507:7: DNum
					{
					mDNum(); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:507:12: Exponent_DNum
					{
					mExponent_DNum(); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Real"

	// $ANTLR start "Boolean"
	public final void mBoolean() throws RecognitionException {
		try {
			int _type = Boolean;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:511:5: ( 'true' | 'false' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='t') ) {
				alt23=1;
			}
			else if ( (LA23_0=='f') ) {
				alt23=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:511:7: 'true'
					{
					match("true"); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:511:16: 'false'
					{
					match("false"); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Boolean"

	// $ANTLR start "SingleQuotedString"
	public final void mSingleQuotedString() throws RecognitionException {
		try {
			int _type = SingleQuotedString;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:515:5: ( '\\'' ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' |~ ( '\\'' | '\\\\' ) )* '\\'' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:515:7: '\\'' ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' |~ ( '\\'' | '\\\\' ) )* '\\''
			{
			match('\''); if (state.failed) return;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:515:12: ( ( '\\\\' '\\'' )=> '\\\\' '\\'' | ( '\\\\' '\\\\' )=> '\\\\' '\\\\' | '\\\\' |~ ( '\\'' | '\\\\' ) )*
			loop24:
			while (true) {
				int alt24=5;
				int LA24_0 = input.LA(1);
				if ( (LA24_0=='\\') ) {
					int LA24_2 = input.LA(2);
					if ( (LA24_2=='\'') ) {
						int LA24_4 = input.LA(3);
						if ( (LA24_4=='\'') && (synpred7_Php())) {
							alt24=1;
						}
						else if ( (LA24_4=='\\') && (synpred7_Php())) {
							alt24=1;
						}
						else if ( ((LA24_4 >= '\u0000' && LA24_4 <= '&')||(LA24_4 >= '(' && LA24_4 <= '[')||(LA24_4 >= ']' && LA24_4 <= '\uFFFF')) && (synpred7_Php())) {
							alt24=1;
						}
						else {
							alt24=3;
						}

					}
					else if ( (LA24_2=='\\') ) {
						int LA24_5 = input.LA(3);
						if ( (synpred8_Php()) ) {
							alt24=2;
						}
						else if ( (true) ) {
							alt24=3;
						}

					}
					else if ( ((LA24_2 >= '\u0000' && LA24_2 <= '&')||(LA24_2 >= '(' && LA24_2 <= '[')||(LA24_2 >= ']' && LA24_2 <= '\uFFFF')) ) {
						alt24=3;
					}

				}
				else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '&')||(LA24_0 >= '(' && LA24_0 <= '[')||(LA24_0 >= ']' && LA24_0 <= '\uFFFF')) ) {
					alt24=4;
				}

				switch (alt24) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:515:13: ( '\\\\' '\\'' )=> '\\\\' '\\''
					{
					match('\\'); if (state.failed) return;
					match('\''); if (state.failed) return;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:516:15: ( '\\\\' '\\\\' )=> '\\\\' '\\\\'
					{
					match('\\'); if (state.failed) return;
					match('\\'); if (state.failed) return;
					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:517:15: '\\\\'
					{
					match('\\'); if (state.failed) return;
					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:517:22: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop24;
				}
			}

			match('\''); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SingleQuotedString"

	// $ANTLR start "EscapeCharector"
	public final void mEscapeCharector() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:524:5: ( 'n' | 'r' | 't' | '\\\\' | '$' | '\"' | Digits | 'x' )
			int alt25=8;
			switch ( input.LA(1) ) {
			case 'n':
				{
				alt25=1;
				}
				break;
			case 'r':
				{
				alt25=2;
				}
				break;
			case 't':
				{
				alt25=3;
				}
				break;
			case '\\':
				{
				alt25=4;
				}
				break;
			case '$':
				{
				alt25=5;
				}
				break;
			case '\"':
				{
				alt25=6;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				alt25=7;
				}
				break;
			case 'x':
				{
				alt25=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:524:7: 'n'
					{
					match('n'); if (state.failed) return;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:524:13: 'r'
					{
					match('r'); if (state.failed) return;
					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:524:19: 't'
					{
					match('t'); if (state.failed) return;
					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:524:25: '\\\\'
					{
					match('\\'); if (state.failed) return;
					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:524:32: '$'
					{
					match('$'); if (state.failed) return;
					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:524:38: '\"'
					{
					match('\"'); if (state.failed) return;
					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:524:44: Digits
					{
					mDigits(); if (state.failed) return;

					}
					break;
				case 8 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:524:53: 'x'
					{
					match('x'); if (state.failed) return;
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeCharector"

	// $ANTLR start "DoubleQuotedString"
	public final void mDoubleQuotedString() throws RecognitionException {
		try {
			int _type = DoubleQuotedString;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:527:5: ( '\"' ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' |~ ( '\\\\' | '\"' ) )* '\"' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:527:7: '\"' ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); if (state.failed) return;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:527:12: ( ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector | '\\\\' |~ ( '\\\\' | '\"' ) )*
			loop26:
			while (true) {
				int alt26=4;
				int LA26_0 = input.LA(1);
				if ( (LA26_0=='\\') ) {
					int LA26_2 = input.LA(2);
					if ( (LA26_2=='n') ) {
						int LA26_4 = input.LA(3);
						if ( (synpred9_Php()) ) {
							alt26=1;
						}
						else if ( (true) ) {
							alt26=2;
						}

					}
					else if ( (LA26_2=='r') ) {
						int LA26_5 = input.LA(3);
						if ( (synpred9_Php()) ) {
							alt26=1;
						}
						else if ( (true) ) {
							alt26=2;
						}

					}
					else if ( (LA26_2=='t') ) {
						int LA26_6 = input.LA(3);
						if ( (synpred9_Php()) ) {
							alt26=1;
						}
						else if ( (true) ) {
							alt26=2;
						}

					}
					else if ( (LA26_2=='\\') ) {
						int LA26_7 = input.LA(3);
						if ( (synpred9_Php()) ) {
							alt26=1;
						}
						else if ( (true) ) {
							alt26=2;
						}

					}
					else if ( (LA26_2=='$') ) {
						int LA26_8 = input.LA(3);
						if ( (synpred9_Php()) ) {
							alt26=1;
						}
						else if ( (true) ) {
							alt26=2;
						}

					}
					else if ( (LA26_2=='\"') ) {
						int LA26_9 = input.LA(3);
						if ( (LA26_9=='\"') && (synpred9_Php())) {
							alt26=1;
						}
						else if ( (LA26_9=='\\') && (synpred9_Php())) {
							alt26=1;
						}
						else if ( ((LA26_9 >= '\u0000' && LA26_9 <= '!')||(LA26_9 >= '#' && LA26_9 <= '[')||(LA26_9 >= ']' && LA26_9 <= '\uFFFF')) && (synpred9_Php())) {
							alt26=1;
						}
						else {
							alt26=2;
						}

					}
					else if ( ((LA26_2 >= '0' && LA26_2 <= '9')) ) {
						int LA26_10 = input.LA(3);
						if ( (synpred9_Php()) ) {
							alt26=1;
						}
						else if ( (true) ) {
							alt26=2;
						}

					}
					else if ( (LA26_2=='x') ) {
						int LA26_11 = input.LA(3);
						if ( (synpred9_Php()) ) {
							alt26=1;
						}
						else if ( (true) ) {
							alt26=2;
						}

					}
					else if ( ((LA26_2 >= '\u0000' && LA26_2 <= '!')||LA26_2=='#'||(LA26_2 >= '%' && LA26_2 <= '/')||(LA26_2 >= ':' && LA26_2 <= '[')||(LA26_2 >= ']' && LA26_2 <= 'm')||(LA26_2 >= 'o' && LA26_2 <= 'q')||LA26_2=='s'||(LA26_2 >= 'u' && LA26_2 <= 'w')||(LA26_2 >= 'y' && LA26_2 <= '\uFFFF')) ) {
						alt26=2;
					}

				}
				else if ( ((LA26_0 >= '\u0000' && LA26_0 <= '!')||(LA26_0 >= '#' && LA26_0 <= '[')||(LA26_0 >= ']' && LA26_0 <= '\uFFFF')) ) {
					alt26=3;
				}

				switch (alt26) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:527:14: ( '\\\\' EscapeCharector )=> '\\\\' EscapeCharector
					{
					match('\\'); if (state.failed) return;
					mEscapeCharector(); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:528:7: '\\\\'
					{
					match('\\'); if (state.failed) return;
					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:529:7: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop26;
				}
			}

			match('\"'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DoubleQuotedString"

	// $ANTLR start "HereDoc"
	public final void mHereDoc() throws RecognitionException {
		try {
			int _type = HereDoc;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:534:5: ( '<<<' HereDocContents )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:534:7: '<<<' HereDocContents
			{
			match("<<<"); if (state.failed) return;

			mHereDocContents(); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HereDoc"

	// $ANTLR start "UnquotedString"
	public final void mUnquotedString() throws RecognitionException {
		try {
			int _type = UnquotedString;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:539:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:539:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// com/github/gumtreediff/gen/antlr3/php/Php.g:539:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= '0' && LA27_0 <= '9')||(LA27_0 >= 'A' && LA27_0 <= 'Z')||LA27_0=='_'||(LA27_0 >= 'a' && LA27_0 <= 'z')) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop27;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UnquotedString"

	// $ANTLR start "HereDocContents"
	public final void mHereDocContents() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:546:5: ()
			// com/github/gumtreediff/gen/antlr3/php/Php.g:546:7: 
			{
			if ( state.backtracking==0 ) {
			        StringBuilder sb = new StringBuilder();
			        while(input.LA(1)!='\n'){
			            sb.append((char)input.LA(1));
			            input.consume();
			        }
			        input.consume();
			        String hereDocName = sb.toString();
			        int hdnl = hereDocName.length();
			        while(true){
			            boolean matchEnd = true;
			            for(int i = 0; i<hdnl; i++){
			                if(input.LA(1)!=hereDocName.charAt(i)){
			                    matchEnd=false;
			                    break;
			                }
			                input.consume();
			            }
			            if(matchEnd==false){
			                while(input.LA(1)!='\n'){
			                    input.consume();
			                }
			                input.consume();
			            }else{
			                break;
			            }
			        }
			    }
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HereDocContents"

	// $ANTLR start "AsignmentOperator"
	public final void mAsignmentOperator() throws RecognitionException {
		try {
			int _type = AsignmentOperator;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:576:5: ( '+=' | '-=' | '*=' | '/=' | '.=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' )
			int alt28=11;
			switch ( input.LA(1) ) {
			case '+':
				{
				alt28=1;
				}
				break;
			case '-':
				{
				alt28=2;
				}
				break;
			case '*':
				{
				alt28=3;
				}
				break;
			case '/':
				{
				alt28=4;
				}
				break;
			case '.':
				{
				alt28=5;
				}
				break;
			case '%':
				{
				alt28=6;
				}
				break;
			case '&':
				{
				alt28=7;
				}
				break;
			case '|':
				{
				alt28=8;
				}
				break;
			case '^':
				{
				alt28=9;
				}
				break;
			case '<':
				{
				alt28=10;
				}
				break;
			case '>':
				{
				alt28=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:7: '+='
					{
					match("+="); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:12: '-='
					{
					match("-="); if (state.failed) return;

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:17: '*='
					{
					match("*="); if (state.failed) return;

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:22: '/='
					{
					match("/="); if (state.failed) return;

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:27: '.='
					{
					match(".="); if (state.failed) return;

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:32: '%='
					{
					match("%="); if (state.failed) return;

					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:37: '&='
					{
					match("&="); if (state.failed) return;

					}
					break;
				case 8 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:42: '|='
					{
					match("|="); if (state.failed) return;

					}
					break;
				case 9 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:47: '^='
					{
					match("^="); if (state.failed) return;

					}
					break;
				case 10 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:52: '<<='
					{
					match("<<="); if (state.failed) return;

					}
					break;
				case 11 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:576:58: '>>='
					{
					match(">>="); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AsignmentOperator"

	// $ANTLR start "EqualityOperator"
	public final void mEqualityOperator() throws RecognitionException {
		try {
			int _type = EqualityOperator;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:580:5: ( '==' | '!=' | '===' | '!==' )
			int alt29=4;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='=') ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1=='=') ) {
					int LA29_3 = input.LA(3);
					if ( (LA29_3=='=') ) {
						alt29=3;
					}

					else {
						alt29=1;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA29_0=='!') ) {
				int LA29_2 = input.LA(2);
				if ( (LA29_2=='=') ) {
					int LA29_4 = input.LA(3);
					if ( (LA29_4=='=') ) {
						alt29=4;
					}

					else {
						alt29=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:580:7: '=='
					{
					match("=="); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:580:14: '!='
					{
					match("!="); if (state.failed) return;

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:580:21: '==='
					{
					match("==="); if (state.failed) return;

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:580:29: '!=='
					{
					match("!=="); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EqualityOperator"

	// $ANTLR start "ComparisionOperator"
	public final void mComparisionOperator() throws RecognitionException {
		try {
			int _type = ComparisionOperator;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:584:5: ( '<' | '<=' | '>' | '>=' | '<>' )
			int alt30=5;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='<') ) {
				switch ( input.LA(2) ) {
				case '=':
					{
					alt30=2;
					}
					break;
				case '>':
					{
					alt30=5;
					}
					break;
				default:
					alt30=1;
				}
			}
			else if ( (LA30_0=='>') ) {
				int LA30_2 = input.LA(2);
				if ( (LA30_2=='=') ) {
					alt30=4;
				}

				else {
					alt30=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:584:7: '<'
					{
					match('<'); if (state.failed) return;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:584:13: '<='
					{
					match("<="); if (state.failed) return;

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:584:20: '>'
					{
					match('>'); if (state.failed) return;
					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:584:26: '>='
					{
					match(">="); if (state.failed) return;

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:584:33: '<>'
					{
					match("<>"); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ComparisionOperator"

	// $ANTLR start "ShiftOperator"
	public final void mShiftOperator() throws RecognitionException {
		try {
			int _type = ShiftOperator;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:588:5: ( '<<' | '>>' )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='<') ) {
				alt31=1;
			}
			else if ( (LA31_0=='>') ) {
				alt31=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:588:7: '<<'
					{
					match("<<"); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:588:14: '>>'
					{
					match(">>"); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ShiftOperator"

	// $ANTLR start "IncrementOperator"
	public final void mIncrementOperator() throws RecognitionException {
		try {
			int _type = IncrementOperator;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:592:5: ( '--' | '++' )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='-') ) {
				alt32=1;
			}
			else if ( (LA32_0=='+') ) {
				alt32=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:592:7: '--'
					{
					match("--"); if (state.failed) return;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:592:12: '++'
					{
					match("++"); if (state.failed) return;

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IncrementOperator"

	// $ANTLR start "Eol"
	public final void mEol() throws RecognitionException {
		try {
			// com/github/gumtreediff/gen/antlr3/php/Php.g:598:5: ( '\\n' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:598:7: '\\n'
			{
			match('\n'); if (state.failed) return;
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Eol"

	// $ANTLR start "WhiteSpace"
	public final void mWhiteSpace() throws RecognitionException {
		try {
			int _type = WhiteSpace;
			int _channel = DEFAULT_TOKEN_CHANNEL;

			    _channel=HIDDEN;

			// com/github/gumtreediff/gen/antlr3/php/Php.g:604:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:604:4: ( ' ' | '\\t' | '\\n' | '\\r' )*
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:604:4: ( ' ' | '\\t' | '\\n' | '\\r' )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( ((LA33_0 >= '\t' && LA33_0 <= '\n')||LA33_0=='\r'||LA33_0==' ') ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop33;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WhiteSpace"

	@Override
	public void mTokens() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:1:8: ( Abstract | Ampersand | And | ArrayAssign | Asterisk | Bang | Break | Case | Class | ClassMember | Clone | CloseBrace | CloseCurlyBrace | CloseSquareBrace | Colon | Comma | Const | Continue | Default | Do | Dollar | Dot | Echo | Else | ElseIf | Equals | Extends | For | Foreach | Forwardslash | Function | Global | If | Implements | InstanceMember | Instanceof | Interface | LogicalAnd | LogicalOr | Minus | New | OpenBrace | OpenCurlyBrace | OpenSquareBrace | Or | Percent | Pipe | Plus | QuestionMark | Return | SemiColon | Static | SuppressWarnings | Switch | Throw | Tilde | Var | While | Xor | T__112 | BodyString | MultilineComment | SinglelineComment | UnixComment | Array | RequireOperator | PrimitiveType | AccessModifier | Integer | Real | Boolean | SingleQuotedString | DoubleQuotedString | HereDoc | UnquotedString | AsignmentOperator | EqualityOperator | ComparisionOperator | ShiftOperator | IncrementOperator | WhiteSpace )
		int alt34=81;
		alt34 = dfa34.predict(input);
		switch (alt34) {
			case 1 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:10: Abstract
				{
				mAbstract(); if (state.failed) return;

				}
				break;
			case 2 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:19: Ampersand
				{
				mAmpersand(); if (state.failed) return;

				}
				break;
			case 3 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:29: And
				{
				mAnd(); if (state.failed) return;

				}
				break;
			case 4 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:33: ArrayAssign
				{
				mArrayAssign(); if (state.failed) return;

				}
				break;
			case 5 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:45: Asterisk
				{
				mAsterisk(); if (state.failed) return;

				}
				break;
			case 6 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:54: Bang
				{
				mBang(); if (state.failed) return;

				}
				break;
			case 7 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:59: Break
				{
				mBreak(); if (state.failed) return;

				}
				break;
			case 8 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:65: Case
				{
				mCase(); if (state.failed) return;

				}
				break;
			case 9 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:70: Class
				{
				mClass(); if (state.failed) return;

				}
				break;
			case 10 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:76: ClassMember
				{
				mClassMember(); if (state.failed) return;

				}
				break;
			case 11 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:88: Clone
				{
				mClone(); if (state.failed) return;

				}
				break;
			case 12 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:94: CloseBrace
				{
				mCloseBrace(); if (state.failed) return;

				}
				break;
			case 13 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:105: CloseCurlyBrace
				{
				mCloseCurlyBrace(); if (state.failed) return;

				}
				break;
			case 14 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:121: CloseSquareBrace
				{
				mCloseSquareBrace(); if (state.failed) return;

				}
				break;
			case 15 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:138: Colon
				{
				mColon(); if (state.failed) return;

				}
				break;
			case 16 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:144: Comma
				{
				mComma(); if (state.failed) return;

				}
				break;
			case 17 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:150: Const
				{
				mConst(); if (state.failed) return;

				}
				break;
			case 18 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:156: Continue
				{
				mContinue(); if (state.failed) return;

				}
				break;
			case 19 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:165: Default
				{
				mDefault(); if (state.failed) return;

				}
				break;
			case 20 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:173: Do
				{
				mDo(); if (state.failed) return;

				}
				break;
			case 21 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:176: Dollar
				{
				mDollar(); if (state.failed) return;

				}
				break;
			case 22 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:183: Dot
				{
				mDot(); if (state.failed) return;

				}
				break;
			case 23 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:187: Echo
				{
				mEcho(); if (state.failed) return;

				}
				break;
			case 24 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:192: Else
				{
				mElse(); if (state.failed) return;

				}
				break;
			case 25 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:197: ElseIf
				{
				mElseIf(); if (state.failed) return;

				}
				break;
			case 26 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:204: Equals
				{
				mEquals(); if (state.failed) return;

				}
				break;
			case 27 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:211: Extends
				{
				mExtends(); if (state.failed) return;

				}
				break;
			case 28 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:219: For
				{
				mFor(); if (state.failed) return;

				}
				break;
			case 29 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:223: Foreach
				{
				mForeach(); if (state.failed) return;

				}
				break;
			case 30 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:231: Forwardslash
				{
				mForwardslash(); if (state.failed) return;

				}
				break;
			case 31 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:244: Function
				{
				mFunction(); if (state.failed) return;

				}
				break;
			case 32 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:253: Global
				{
				mGlobal(); if (state.failed) return;

				}
				break;
			case 33 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:260: If
				{
				mIf(); if (state.failed) return;

				}
				break;
			case 34 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:263: Implements
				{
				mImplements(); if (state.failed) return;

				}
				break;
			case 35 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:274: InstanceMember
				{
				mInstanceMember(); if (state.failed) return;

				}
				break;
			case 36 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:289: Instanceof
				{
				mInstanceof(); if (state.failed) return;

				}
				break;
			case 37 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:300: Interface
				{
				mInterface(); if (state.failed) return;

				}
				break;
			case 38 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:310: LogicalAnd
				{
				mLogicalAnd(); if (state.failed) return;

				}
				break;
			case 39 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:321: LogicalOr
				{
				mLogicalOr(); if (state.failed) return;

				}
				break;
			case 40 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:331: Minus
				{
				mMinus(); if (state.failed) return;

				}
				break;
			case 41 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:337: New
				{
				mNew(); if (state.failed) return;

				}
				break;
			case 42 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:341: OpenBrace
				{
				mOpenBrace(); if (state.failed) return;

				}
				break;
			case 43 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:351: OpenCurlyBrace
				{
				mOpenCurlyBrace(); if (state.failed) return;

				}
				break;
			case 44 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:366: OpenSquareBrace
				{
				mOpenSquareBrace(); if (state.failed) return;

				}
				break;
			case 45 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:382: Or
				{
				mOr(); if (state.failed) return;

				}
				break;
			case 46 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:385: Percent
				{
				mPercent(); if (state.failed) return;

				}
				break;
			case 47 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:393: Pipe
				{
				mPipe(); if (state.failed) return;

				}
				break;
			case 48 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:398: Plus
				{
				mPlus(); if (state.failed) return;

				}
				break;
			case 49 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:403: QuestionMark
				{
				mQuestionMark(); if (state.failed) return;

				}
				break;
			case 50 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:416: Return
				{
				mReturn(); if (state.failed) return;

				}
				break;
			case 51 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:423: SemiColon
				{
				mSemiColon(); if (state.failed) return;

				}
				break;
			case 52 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:433: Static
				{
				mStatic(); if (state.failed) return;

				}
				break;
			case 53 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:440: SuppressWarnings
				{
				mSuppressWarnings(); if (state.failed) return;

				}
				break;
			case 54 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:457: Switch
				{
				mSwitch(); if (state.failed) return;

				}
				break;
			case 55 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:464: Throw
				{
				mThrow(); if (state.failed) return;

				}
				break;
			case 56 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:470: Tilde
				{
				mTilde(); if (state.failed) return;

				}
				break;
			case 57 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:476: Var
				{
				mVar(); if (state.failed) return;

				}
				break;
			case 58 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:480: While
				{
				mWhile(); if (state.failed) return;

				}
				break;
			case 59 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:486: Xor
				{
				mXor(); if (state.failed) return;

				}
				break;
			case 60 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:490: T__112
				{
				mT__112(); if (state.failed) return;

				}
				break;
			case 61 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:497: BodyString
				{
				mBodyString(); if (state.failed) return;

				}
				break;
			case 62 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:508: MultilineComment
				{
				mMultilineComment(); if (state.failed) return;

				}
				break;
			case 63 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:525: SinglelineComment
				{
				mSinglelineComment(); if (state.failed) return;

				}
				break;
			case 64 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:543: UnixComment
				{
				mUnixComment(); if (state.failed) return;

				}
				break;
			case 65 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:555: Array
				{
				mArray(); if (state.failed) return;

				}
				break;
			case 66 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:561: RequireOperator
				{
				mRequireOperator(); if (state.failed) return;

				}
				break;
			case 67 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:577: PrimitiveType
				{
				mPrimitiveType(); if (state.failed) return;

				}
				break;
			case 68 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:591: AccessModifier
				{
				mAccessModifier(); if (state.failed) return;

				}
				break;
			case 69 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:606: Integer
				{
				mInteger(); if (state.failed) return;

				}
				break;
			case 70 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:614: Real
				{
				mReal(); if (state.failed) return;

				}
				break;
			case 71 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:619: Boolean
				{
				mBoolean(); if (state.failed) return;

				}
				break;
			case 72 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:627: SingleQuotedString
				{
				mSingleQuotedString(); if (state.failed) return;

				}
				break;
			case 73 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:646: DoubleQuotedString
				{
				mDoubleQuotedString(); if (state.failed) return;

				}
				break;
			case 74 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:665: HereDoc
				{
				mHereDoc(); if (state.failed) return;

				}
				break;
			case 75 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:673: UnquotedString
				{
				mUnquotedString(); if (state.failed) return;

				}
				break;
			case 76 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:688: AsignmentOperator
				{
				mAsignmentOperator(); if (state.failed) return;

				}
				break;
			case 77 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:706: EqualityOperator
				{
				mEqualityOperator(); if (state.failed) return;

				}
				break;
			case 78 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:723: ComparisionOperator
				{
				mComparisionOperator(); if (state.failed) return;

				}
				break;
			case 79 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:743: ShiftOperator
				{
				mShiftOperator(); if (state.failed) return;

				}
				break;
			case 80 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:757: IncrementOperator
				{
				mIncrementOperator(); if (state.failed) return;

				}
				break;
			case 81 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:1:775: WhiteSpace
				{
				mWhiteSpace(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_Php
	public final void synpred1_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:437:13: ( '<' ~ '?' )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:437:14: '<' ~ '?'
		{
		match('<'); if (state.failed) return;
		if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '>')||(input.LA(1) >= '@' && input.LA(1) <= '\uFFFF') ) {
			input.consume();
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			recover(mse);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred1_Php

	// $ANTLR start synpred2_Php
	public final void synpred2_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:443:8: ( '<' ~ '?' )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:443:9: '<' ~ '?'
		{
		match('<'); if (state.failed) return;
		if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '>')||(input.LA(1) >= '@' && input.LA(1) <= '\uFFFF') ) {
			input.consume();
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			recover(mse);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred2_Php

	// $ANTLR start synpred3_Php
	public final void synpred3_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:446:13: ( '*' ~ '/' )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:446:14: '*' ~ '/'
		{
		match('*'); if (state.failed) return;
		if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '\uFFFF') ) {
			input.consume();
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			recover(mse);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred3_Php

	// $ANTLR start synpred4_Php
	public final void synpred4_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:450:14: ( '?' ~ '>' )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:450:15: '?' ~ '>'
		{
		match('?'); if (state.failed) return;
		if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '=')||(input.LA(1) >= '?' && input.LA(1) <= '\uFFFF') ) {
			input.consume();
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			recover(mse);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred4_Php

	// $ANTLR start synpred5_Php
	public final void synpred5_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:454:12: ( '?' ~ '>' )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:454:13: '?' ~ '>'
		{
		match('?'); if (state.failed) return;
		if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '=')||(input.LA(1) >= '?' && input.LA(1) <= '\uFFFF') ) {
			input.consume();
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			recover(mse);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred5_Php

	// $ANTLR start synpred6_Php
	public final void synpred6_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:499:4: ( '.' Digits )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:499:5: '.' Digits
		{
		match('.'); if (state.failed) return;
		mDigits(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_Php

	// $ANTLR start synpred7_Php
	public final void synpred7_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:515:13: ( '\\\\' '\\'' )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:515:14: '\\\\' '\\''
		{
		match('\\'); if (state.failed) return;
		match('\''); if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_Php

	// $ANTLR start synpred8_Php
	public final void synpred8_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:516:15: ( '\\\\' '\\\\' )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:516:16: '\\\\' '\\\\'
		{
		match('\\'); if (state.failed) return;
		match('\\'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_Php

	// $ANTLR start synpred9_Php
	public final void synpred9_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:527:14: ( '\\\\' EscapeCharector )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:527:15: '\\\\' EscapeCharector
		{
		match('\\'); if (state.failed) return;
		mEscapeCharector(); if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_Php

	public final boolean synpred1_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA20 dfa20 = new DFA20(this);
	protected DFA22 dfa22 = new DFA22(this);
	protected DFA34 dfa34 = new DFA34(this);
	static final String DFA20_eotS =
		"\4\uffff";
	static final String DFA20_eofS =
		"\4\uffff";
	static final String DFA20_minS =
		"\2\56\2\uffff";
	static final String DFA20_maxS =
		"\1\71\1\145\2\uffff";
	static final String DFA20_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA20_specialS =
		"\4\uffff}>";
	static final String[] DFA20_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "504:4: ( Digits | DNum )";
		}
	}

	static final String DFA22_eotS =
		"\3\uffff\2\6\2\uffff\1\6";
	static final String DFA22_eofS =
		"\10\uffff";
	static final String DFA22_minS =
		"\1\56\1\60\1\56\2\60\2\uffff\1\60";
	static final String DFA22_maxS =
		"\2\71\3\145\2\uffff\1\145";
	static final String DFA22_acceptS =
		"\5\uffff\1\2\1\1\1\uffff";
	static final String DFA22_specialS =
		"\10\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1\1\uffff\12\2",
			"\12\3",
			"\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
			"\12\3\13\uffff\1\5\37\uffff\1\5",
			"\12\7\13\uffff\1\5\37\uffff\1\5",
			"",
			"",
			"\12\7\13\uffff\1\5\37\uffff\1\5"
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "506:1: Real : ( DNum | Exponent_DNum );";
		}
	}

	static final String DFA34_eotS =
		"\1\63\1\60\1\72\1\75\1\76\1\77\2\60\1\106\4\uffff\1\60\1\uffff\1\111\2"+
		"\60\1\124\2\60\1\133\1\135\1\60\3\uffff\1\60\1\141\1\142\1\144\1\60\1"+
		"\uffff\1\60\1\uffff\1\60\1\uffff\3\60\1\uffff\2\60\2\157\2\uffff\1\163"+
		"\2\uffff\1\163\1\uffff\2\60\1\167\2\60\7\uffff\5\60\2\uffff\1\60\1\u0081"+
		"\2\uffff\7\60\3\uffff\1\60\1\u008a\2\60\5\uffff\1\60\1\u0090\1\60\4\uffff"+
		"\12\60\1\uffff\2\157\1\u00a0\1\uffff\1\u00a0\1\60\1\u00a2\1\uffff\11\60"+
		"\1\uffff\3\60\1\u00b1\4\60\1\uffff\2\60\1\u00b9\1\60\1\u00bb\1\uffff\10"+
		"\60\1\u00c4\1\60\1\u00c6\3\60\2\uffff\1\60\1\uffff\3\60\1\u00b9\1\u00ce"+
		"\5\60\1\u00d4\1\u00d6\2\60\1\uffff\7\60\1\uffff\1\60\1\uffff\7\60\1\u00e8"+
		"\1\uffff\1\60\1\uffff\4\60\2\u00ee\1\u00ef\1\uffff\1\u00f0\1\u00f1\1\u00f2"+
		"\2\60\1\uffff\1\60\1\uffff\3\60\1\u00b9\1\u00e8\13\60\1\u0104\1\uffff"+
		"\1\u0105\4\60\5\uffff\2\60\1\u010c\3\60\1\u0110\4\60\1\u00b9\1\u0115\1"+
		"\60\1\u0117\1\u00b9\1\u0118\2\uffff\1\u0119\4\60\1\u011e\1\uffff\1\u011f"+
		"\1\u0120\1\60\1\uffff\3\60\1\u0126\1\uffff\1\u0126\3\uffff\1\u0119\1\60"+
		"\1\u0129\1\u012a\3\uffff\1\u012b\4\60\1\uffff\2\60\3\uffff\2\60\1\u0134"+
		"\2\60\1\u0119\1\u0137\1\u0138\1\uffff\2\60\2\uffff\2\60\2\u0126";
	static final String DFA34_eofS =
		"\u013d\uffff";
	static final String DFA34_minS =
		"\1\41\1\122\1\46\3\75\1\157\1\141\1\72\4\uffff\1\145\1\uffff\1\60\1\143"+
		"\1\141\1\52\1\154\1\146\1\55\1\75\1\145\3\uffff\1\142\1\75\1\53\1\76\1"+
		"\145\1\uffff\1\164\1\uffff\1\150\1\uffff\1\141\1\150\1\157\1\uffff\1\122"+
		"\1\162\2\56\2\uffff\1\74\2\uffff\1\76\1\uffff\1\163\1\144\1\60\2\122\7"+
		"\uffff\1\145\1\157\1\163\1\141\1\156\2\uffff\1\146\1\60\2\uffff\1\150"+
		"\1\163\1\164\1\162\1\156\1\157\1\154\3\uffff\1\157\1\60\1\160\1\143\5"+
		"\uffff\1\167\1\60\1\152\4\uffff\1\161\1\141\1\151\1\162\1\165\1\162\1"+
		"\151\1\162\1\142\1\151\1\uffff\2\56\1\74\1\uffff\1\75\1\164\1\60\1\uffff"+
		"\2\101\1\141\1\154\1\145\1\163\1\156\1\163\1\141\1\uffff\1\157\2\145\1"+
		"\60\1\143\1\141\1\163\1\142\1\uffff\1\154\1\164\1\60\1\154\1\60\1\uffff"+
		"\1\145\2\165\1\164\1\151\1\164\1\157\1\145\1\60\1\154\1\60\1\154\1\166"+
		"\1\164\2\uffff\1\162\1\uffff\2\131\1\153\2\60\1\163\1\145\1\164\1\151"+
		"\1\165\2\60\1\156\1\141\1\uffff\2\164\1\145\1\141\1\145\1\141\1\162\1"+
		"\uffff\1\165\1\uffff\1\143\1\162\2\151\1\156\1\143\1\167\1\60\1\uffff"+
		"\1\145\1\uffff\1\151\1\141\1\145\1\141\3\60\1\uffff\3\60\1\156\1\154\1"+
		"\uffff\1\146\1\uffff\1\144\1\143\1\151\2\60\1\154\1\155\1\156\1\146\1"+
		"\144\1\164\1\156\1\162\1\143\1\147\1\150\1\60\1\uffff\1\60\1\143\1\164"+
		"\2\143\5\uffff\1\165\1\164\1\60\1\163\1\150\1\157\1\60\1\145\1\143\1\141"+
		"\1\145\2\60\1\145\3\60\2\uffff\1\60\1\145\2\164\1\145\1\60\1\uffff\2\60"+
		"\1\156\1\uffff\1\156\1\145\1\143\1\60\1\uffff\1\60\3\uffff\1\60\1\145"+
		"\2\60\3\uffff\1\60\1\164\1\157\1\145\1\157\1\uffff\1\157\1\144\3\uffff"+
		"\1\163\1\146\1\60\2\156\3\60\1\uffff\2\143\2\uffff\2\145\2\60";
	static final String DFA34_maxS =
		"\1\176\1\163\1\75\1\76\2\75\1\162\1\157\1\72\4\uffff\1\157\1\uffff\1\75"+
		"\1\170\1\165\1\75\1\154\1\156\1\76\1\174\1\145\3\uffff\1\162\2\75\1\76"+
		"\1\145\1\uffff\1\167\1\uffff\1\162\1\uffff\1\141\1\150\1\157\1\uffff\1"+
		"\162\1\165\2\145\2\uffff\1\74\2\uffff\1\76\1\uffff\1\163\1\144\1\172\2"+
		"\162\7\uffff\1\145\1\157\1\163\1\157\1\156\2\uffff\1\146\1\172\2\uffff"+
		"\1\150\1\163\1\164\1\162\1\156\1\157\1\154\3\uffff\1\157\1\172\1\160\1"+
		"\164\5\uffff\1\167\1\172\1\152\4\uffff\1\164\1\162\1\151\1\162\1\165\1"+
		"\162\1\151\1\162\1\142\1\157\1\uffff\2\145\1\75\1\uffff\1\75\1\164\1\172"+
		"\1\uffff\3\141\1\154\1\145\1\163\1\156\1\164\1\141\1\uffff\1\157\2\145"+
		"\1\172\1\143\1\141\1\163\1\142\1\uffff\1\154\1\164\1\172\1\154\1\172\1"+
		"\uffff\1\145\2\165\1\164\1\151\1\164\1\157\1\145\1\172\1\154\1\172\1\154"+
		"\1\166\1\164\2\uffff\1\162\1\uffff\2\171\1\153\2\172\1\163\1\145\1\164"+
		"\1\151\1\165\2\172\1\156\1\141\1\uffff\2\164\1\145\1\141\1\145\1\141\1"+
		"\162\1\uffff\1\165\1\uffff\1\143\1\162\2\151\1\156\1\143\1\167\1\172\1"+
		"\uffff\1\145\1\uffff\1\151\1\141\1\145\1\141\3\172\1\uffff\3\172\1\156"+
		"\1\154\1\uffff\1\146\1\uffff\1\144\1\143\1\151\2\172\1\154\1\155\1\156"+
		"\1\146\1\144\1\164\1\156\1\162\1\143\1\147\1\150\1\172\1\uffff\1\172\1"+
		"\143\1\164\2\143\5\uffff\1\165\1\164\1\172\1\163\1\150\1\157\1\172\1\145"+
		"\1\143\1\141\1\145\2\172\1\145\3\172\2\uffff\1\172\1\145\2\164\1\145\1"+
		"\172\1\uffff\2\172\1\156\1\uffff\1\156\1\145\1\143\1\172\1\uffff\1\172"+
		"\3\uffff\1\172\1\145\2\172\3\uffff\1\172\1\164\1\157\1\145\1\157\1\uffff"+
		"\1\157\1\144\3\uffff\1\163\1\146\1\172\2\156\3\172\1\uffff\2\143\2\uffff"+
		"\2\145\2\172";
	static final String DFA34_acceptS =
		"\11\uffff\1\14\1\15\1\16\1\20\1\uffff\1\25\11\uffff\1\52\1\53\1\54\5\uffff"+
		"\1\63\1\uffff\1\65\1\uffff\1\70\3\uffff\1\100\4\uffff\1\110\1\111\1\uffff"+
		"\1\113\1\114\1\uffff\1\121\5\uffff\1\46\1\2\1\4\1\115\1\32\1\5\1\6\5\uffff"+
		"\1\12\1\17\2\uffff\1\26\1\106\7\uffff\1\76\1\77\1\36\4\uffff\1\43\1\120"+
		"\1\50\1\47\1\57\3\uffff\1\56\1\60\1\75\1\61\12\uffff\1\105\3\uffff\1\116"+
		"\3\uffff\1\74\11\uffff\1\24\10\uffff\1\41\5\uffff\1\55\16\uffff\1\112"+
		"\1\117\1\uffff\1\3\16\uffff\1\34\7\uffff\1\103\1\uffff\1\51\10\uffff\1"+
		"\71\1\uffff\1\73\7\uffff\1\10\5\uffff\1\27\1\uffff\1\30\21\uffff\1\107"+
		"\5\uffff\1\101\1\7\1\11\1\13\1\21\21\uffff\1\67\1\72\6\uffff\1\31\3\uffff"+
		"\1\40\4\uffff\1\62\1\uffff\1\64\1\66\1\104\4\uffff\1\23\1\33\1\35\5\uffff"+
		"\1\102\2\uffff\1\1\1\22\1\37\10\uffff\1\45\2\uffff\1\42\1\44\4\uffff";
	static final String DFA34_specialS =
		"\u013d\uffff}>";
	static final String[] DFA34_transitionS = {
			"\1\5\1\56\1\50\1\16\1\34\1\2\1\55\1\30\1\11\1\4\1\35\1\14\1\25\1\17\1"+
			"\22\1\53\11\54\1\10\1\40\1\57\1\3\1\62\1\36\1\42\1\51\31\60\1\32\1\uffff"+
			"\1\13\1\61\1\60\1\uffff\1\1\1\6\1\7\1\15\1\20\1\21\1\23\1\60\1\24\4\60"+
			"\1\27\1\33\1\52\1\60\1\37\1\41\1\43\1\60\1\45\1\46\1\47\2\60\1\31\1\26"+
			"\1\12\1\44",
			"\1\70\17\uffff\1\64\13\uffff\1\65\3\uffff\1\67\1\66",
			"\1\71\26\uffff\1\61",
			"\1\74\1\73",
			"\1\61",
			"\1\74",
			"\1\101\2\uffff\1\100",
			"\1\102\12\uffff\1\103\2\uffff\1\104",
			"\1\105",
			"",
			"",
			"",
			"",
			"\1\107\11\uffff\1\110",
			"",
			"\12\112\3\uffff\1\61",
			"\1\113\10\uffff\1\114\13\uffff\1\115",
			"\1\121\12\uffff\1\120\2\uffff\1\116\5\uffff\1\117",
			"\1\122\4\uffff\1\123\15\uffff\1\61",
			"\1\125",
			"\1\126\6\uffff\1\127\1\130",
			"\1\132\17\uffff\1\61\1\131",
			"\1\61\76\uffff\1\134",
			"\1\136",
			"",
			"",
			"",
			"\1\140\17\uffff\1\137",
			"\1\61",
			"\1\132\21\uffff\1\61",
			"\1\143",
			"\1\145",
			"",
			"\1\146\2\uffff\1\147",
			"",
			"\1\150\11\uffff\1\151",
			"",
			"\1\152",
			"\1\153",
			"\1\154",
			"",
			"\1\70\37\uffff\1\70",
			"\1\156\2\uffff\1\155",
			"\1\112\1\uffff\10\160\2\112\13\uffff\1\112\37\uffff\1\112",
			"\1\112\1\uffff\12\161\13\uffff\1\112\37\uffff\1\112",
			"",
			"",
			"\1\162",
			"",
			"",
			"\1\164",
			"",
			"\1\165",
			"\1\166",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\171\37\uffff\1\170",
			"\1\171\37\uffff\1\171",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175\15\uffff\1\176",
			"\1\177",
			"",
			"",
			"\1\u0080",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"",
			"",
			"",
			"\1\u0089",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u008b",
			"\1\u008e\17\uffff\1\u008c\1\u008d",
			"",
			"",
			"",
			"",
			"",
			"\1\u008f",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0091",
			"",
			"",
			"",
			"",
			"\1\u0093\2\uffff\1\u0092",
			"\1\u0094\20\uffff\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d\5\uffff\1\u009e",
			"",
			"\1\112\1\uffff\10\160\2\112\13\uffff\1\112\37\uffff\1\112",
			"\1\112\1\uffff\12\161\13\uffff\1\112\37\uffff\1\112",
			"\1\u009f\1\61",
			"",
			"\1\61",
			"\1\u00a1",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\1\u00a4\37\uffff\1\u00a3",
			"\1\u00a4\37\uffff\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa\1\u00ab",
			"\1\u00ac",
			"",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00b0\25\60",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"",
			"\1\u00b6",
			"\1\u00b7",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60\1\u00b8\25\60",
			"\1\u00ba",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00c5",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"",
			"",
			"\1\u00ca",
			"",
			"\1\u00cc\37\uffff\1\u00cb",
			"\1\u00cc\37\uffff\1\u00cc",
			"\1\u00cd",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u00d5\21\60",
			"\1\u00d7",
			"\1\u00d8",
			"",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"",
			"\1\u00e0",
			"",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\1\u00e9",
			"",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00f3",
			"\1\u00f4",
			"",
			"\1\u00f5",
			"",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"",
			"",
			"",
			"",
			"",
			"\1\u010a",
			"\1\u010b",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u010d",
			"\1\u010e",
			"\1\u010f",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0116",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0121",
			"",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\12\60\7\uffff\32\60\4\uffff\1\u0125\1\uffff\32\60",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\u0127\1\uffff\32\60",
			"",
			"",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0128",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"",
			"\1\u0130",
			"\1\u0131",
			"",
			"",
			"",
			"\1\u0132",
			"\1\u0133",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0135",
			"\1\u0136",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\1\u0139",
			"\1\u013a",
			"",
			"",
			"\1\u013b",
			"\1\u013c",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60"
	};

	static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
	static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
	static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
	static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
	static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
	static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
	static final short[][] DFA34_transition;

	static {
		int numStates = DFA34_transitionS.length;
		DFA34_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
		}
	}

	protected class DFA34 extends DFA {

		public DFA34(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 34;
			this.eot = DFA34_eot;
			this.eof = DFA34_eof;
			this.min = DFA34_min;
			this.max = DFA34_max;
			this.accept = DFA34_accept;
			this.special = DFA34_special;
			this.transition = DFA34_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( Abstract | Ampersand | And | ArrayAssign | Asterisk | Bang | Break | Case | Class | ClassMember | Clone | CloseBrace | CloseCurlyBrace | CloseSquareBrace | Colon | Comma | Const | Continue | Default | Do | Dollar | Dot | Echo | Else | ElseIf | Equals | Extends | For | Foreach | Forwardslash | Function | Global | If | Implements | InstanceMember | Instanceof | Interface | LogicalAnd | LogicalOr | Minus | New | OpenBrace | OpenCurlyBrace | OpenSquareBrace | Or | Percent | Pipe | Plus | QuestionMark | Return | SemiColon | Static | SuppressWarnings | Switch | Throw | Tilde | Var | While | Xor | T__112 | BodyString | MultilineComment | SinglelineComment | UnixComment | Array | RequireOperator | PrimitiveType | AccessModifier | Integer | Real | Boolean | SingleQuotedString | DoubleQuotedString | HereDoc | UnquotedString | AsignmentOperator | EqualityOperator | ComparisionOperator | ShiftOperator | IncrementOperator | WhiteSpace );";
		}
	}

}
