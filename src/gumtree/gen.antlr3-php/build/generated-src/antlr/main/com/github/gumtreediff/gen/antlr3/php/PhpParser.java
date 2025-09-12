// $ANTLR 3.5.3 com/github/gumtreediff/gen/antlr3/php/Php.g 2025-04-14 15:35:28
 package com.github.gumtreediff.gen.antlr3.php; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PhpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Abstract", "AccessModifier", 
		"Ampersand", "And", "Apply", "Array", "ArrayAssign", "AsignmentOperator", 
		"Asterisk", "Bang", "Block", "BodyString", "Boolean", "Break", "Case", 
		"Cast", "Class", "ClassDefinition", "ClassMember", "Clone", "CloseBrace", 
		"CloseCurlyBrace", "CloseSquareBrace", "Colon", "Comma", "ComparisionOperator", 
		"Const", "Continue", "DNum", "Decimal", "Default", "Digits", "Do", "Dollar", 
		"Dot", "DoubleQuotedString", "Echo", "Else", "ElseIf", "Empty", "Eol", 
		"EqualityOperator", "Equals", "EscapeCharector", "Exponent_DNum", "Extends", 
		"Field", "FirstBodyString", "For", "ForCondition", "ForInit", "ForUpdate", 
		"Foreach", "Forwardslash", "Function", "Global", "HereDoc", "HereDocContents", 
		"Hexadecimal", "If", "IfExpression", "Implements", "IncrementOperator", 
		"InstanceMember", "Instanceof", "Integer", "Interface", "Label", "LogicalAnd", 
		"LogicalOr", "Member", "Method", "Minus", "Modifiers", "MultilineComment", 
		"New", "Octal", "OpenBrace", "OpenCurlyBrace", "OpenSquareBrace", "Or", 
		"Params", "Percent", "Pipe", "Plus", "Postfix", "Prefix", "PrimitiveType", 
		"QuestionMark", "Real", "Reference", "RequireOperator", "Return", "SemiColon", 
		"ShiftOperator", "SingleQuotedString", "SinglelineComment", "Static", 
		"SuppressWarnings", "Switch", "Throw", "Tilde", "UnixComment", "UnquotedString", 
		"Var", "While", "WhiteSpace", "Xor", "'as'"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PhpParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PhpParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[175+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PhpParser.tokenNames; }
	@Override public String getGrammarFileName() { return "com/github/gumtreediff/gen/antlr3/php/Php.g"; }


	  public void display_next_tokens(){
	    System.err.print("Allowed tokens: ");
	    for(int next: next_tokens())
	      System.err.print(tokenNames[next]);
	    System.err.println("");
	  }
	  public int[] next_tokens(){
	    return state.following[state._fsp].toArray();
	  }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:143:1: prog : ( statement )* ;
	public final PhpParser.prog_return prog() throws RecognitionException {
		PhpParser.prog_return retval = new PhpParser.prog_return();
		retval.start = input.LT(1);
		int prog_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope statement1 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:143:6: ( ( statement )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:143:8: ( statement )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/github/gumtreediff/gen/antlr3/php/Php.g:143:8: ( statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==Abstract||LA1_0==Ampersand||LA1_0==Array||LA1_0==Bang||(LA1_0 >= BodyString && LA1_0 <= Break)||LA1_0==Class||LA1_0==Clone||LA1_0==Continue||(LA1_0 >= Do && LA1_0 <= Dollar)||(LA1_0 >= DoubleQuotedString && LA1_0 <= Echo)||LA1_0==For||LA1_0==Foreach||(LA1_0 >= Function && LA1_0 <= HereDoc)||LA1_0==If||LA1_0==IncrementOperator||(LA1_0 >= Integer && LA1_0 <= Interface)||LA1_0==Minus||LA1_0==New||(LA1_0 >= OpenBrace && LA1_0 <= OpenCurlyBrace)||LA1_0==Real||(LA1_0 >= RequireOperator && LA1_0 <= Return)||LA1_0==SingleQuotedString||(LA1_0 >= Static && LA1_0 <= Tilde)||LA1_0==UnquotedString||LA1_0==While) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:143:8: statement
					{
					pushFollow(FOLLOW_statement_in_prog899);
					statement1=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, prog_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:145:1: statement : ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' !);
	public final PhpParser.statement_return statement() throws RecognitionException {
		PhpParser.statement_return retval = new PhpParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token BodyString3=null;
		Token char_literal4=null;
		Token char_literal6=null;
		Token char_literal12=null;
		ParserRuleReturnScope simpleStatement2 =null;
		ParserRuleReturnScope statement5 =null;
		ParserRuleReturnScope bracketedBlock7 =null;
		ParserRuleReturnScope classDefinition8 =null;
		ParserRuleReturnScope interfaceDefinition9 =null;
		ParserRuleReturnScope complexStatement10 =null;
		ParserRuleReturnScope simpleStatement11 =null;

		CommonTree BodyString3_tree=null;
		CommonTree char_literal4_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree char_literal12_tree=null;
		RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
		RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:146:5: ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' !)
			int alt3=7;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:146:7: ( simpleStatement )? BodyString
					{
					root_0 = (CommonTree)adaptor.nil();


					// com/github/gumtreediff/gen/antlr3/php/Php.g:146:7: ( simpleStatement )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==Ampersand||LA2_0==Array||LA2_0==Bang||(LA2_0 >= Boolean && LA2_0 <= Break)||LA2_0==Clone||LA2_0==Continue||LA2_0==Dollar||(LA2_0 >= DoubleQuotedString && LA2_0 <= Echo)||(LA2_0 >= Global && LA2_0 <= HereDoc)||LA2_0==IncrementOperator||LA2_0==Integer||LA2_0==Minus||LA2_0==New||LA2_0==OpenBrace||LA2_0==Real||(LA2_0 >= RequireOperator && LA2_0 <= Return)||LA2_0==SingleQuotedString||(LA2_0 >= Static && LA2_0 <= SuppressWarnings)||(LA2_0 >= Throw && LA2_0 <= Tilde)||LA2_0==UnquotedString) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:146:7: simpleStatement
							{
							pushFollow(FOLLOW_simpleStatement_in_statement912);
							simpleStatement2=simpleStatement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement2.getTree());

							}
							break;

					}

					BodyString3=(Token)match(input,BodyString,FOLLOW_BodyString_in_statement915); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BodyString3_tree = (CommonTree)adaptor.create(BodyString3);
					adaptor.addChild(root_0, BodyString3_tree);
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:147:7: '{' statement '}'
					{
					char_literal4=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_statement923); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(char_literal4);

					pushFollow(FOLLOW_statement_in_statement925);
					statement5=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement5.getTree());
					char_literal6=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_statement927); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(char_literal6);


					// AST REWRITE
					// elements: statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 147:25: -> statement
					{
						adaptor.addChild(root_0, stream_statement.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:148:7: bracketedBlock
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bracketedBlock_in_statement939);
					bracketedBlock7=bracketedBlock();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bracketedBlock7.getTree());

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:150:7: classDefinition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_classDefinition_in_statement952);
					classDefinition8=classDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition8.getTree());

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:151:7: interfaceDefinition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_interfaceDefinition_in_statement960);
					interfaceDefinition9=interfaceDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDefinition9.getTree());

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:152:7: complexStatement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_complexStatement_in_statement968);
					complexStatement10=complexStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, complexStatement10.getTree());

					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:153:7: simpleStatement ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simpleStatement_in_statement976);
					simpleStatement11=simpleStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleStatement11.getTree());

					char_literal12=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_statement978); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class bracketedBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bracketedBlock"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:156:1: bracketedBlock : '{' (stmts= statement )* '}' -> ^( Block $stmts) ;
	public final PhpParser.bracketedBlock_return bracketedBlock() throws RecognitionException {
		PhpParser.bracketedBlock_return retval = new PhpParser.bracketedBlock_return();
		retval.start = input.LT(1);
		int bracketedBlock_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal13=null;
		Token char_literal14=null;
		ParserRuleReturnScope stmts =null;

		CommonTree char_literal13_tree=null;
		CommonTree char_literal14_tree=null;
		RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
		RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:157:5: ( '{' (stmts= statement )* '}' -> ^( Block $stmts) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:157:7: '{' (stmts= statement )* '}'
			{
			char_literal13=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_bracketedBlock1000); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(char_literal13);

			// com/github/gumtreediff/gen/antlr3/php/Php.g:157:16: (stmts= statement )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==Abstract||LA4_0==Ampersand||LA4_0==Array||LA4_0==Bang||(LA4_0 >= BodyString && LA4_0 <= Break)||LA4_0==Class||LA4_0==Clone||LA4_0==Continue||(LA4_0 >= Do && LA4_0 <= Dollar)||(LA4_0 >= DoubleQuotedString && LA4_0 <= Echo)||LA4_0==For||LA4_0==Foreach||(LA4_0 >= Function && LA4_0 <= HereDoc)||LA4_0==If||LA4_0==IncrementOperator||(LA4_0 >= Integer && LA4_0 <= Interface)||LA4_0==Minus||LA4_0==New||(LA4_0 >= OpenBrace && LA4_0 <= OpenCurlyBrace)||LA4_0==Real||(LA4_0 >= RequireOperator && LA4_0 <= Return)||LA4_0==SingleQuotedString||(LA4_0 >= Static && LA4_0 <= Tilde)||LA4_0==UnquotedString||LA4_0==While) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:157:16: stmts= statement
					{
					pushFollow(FOLLOW_statement_in_bracketedBlock1004);
					stmts=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(stmts.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			char_literal14=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_bracketedBlock1007); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(char_literal14);


			// AST REWRITE
			// elements: stmts
			// token labels: 
			// rule labels: stmts, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_stmts=new RewriteRuleSubtreeStream(adaptor,"rule stmts",stmts!=null?stmts.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 157:32: -> ^( Block $stmts)
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:157:35: ^( Block $stmts)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Block, "Block"), root_1);
				adaptor.addChild(root_1, stream_stmts.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, bracketedBlock_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bracketedBlock"


	public static class interfaceDefinition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceDefinition"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:160:1: interfaceDefinition : Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) ;
	public final PhpParser.interfaceDefinition_return interfaceDefinition() throws RecognitionException {
		PhpParser.interfaceDefinition_return retval = new PhpParser.interfaceDefinition_return();
		retval.start = input.LT(1);
		int interfaceDefinition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token interfaceName=null;
		Token Interface15=null;
		Token OpenCurlyBrace17=null;
		Token CloseCurlyBrace19=null;
		ParserRuleReturnScope interfaceExtends16 =null;
		ParserRuleReturnScope interfaceMember18 =null;

		CommonTree interfaceName_tree=null;
		CommonTree Interface15_tree=null;
		CommonTree OpenCurlyBrace17_tree=null;
		CommonTree CloseCurlyBrace19_tree=null;
		RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
		RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
		RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
		RewriteRuleTokenStream stream_Interface=new RewriteRuleTokenStream(adaptor,"token Interface");
		RewriteRuleSubtreeStream stream_interfaceMember=new RewriteRuleSubtreeStream(adaptor,"rule interfaceMember");
		RewriteRuleSubtreeStream stream_interfaceExtends=new RewriteRuleSubtreeStream(adaptor,"rule interfaceExtends");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:161:5: ( Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:161:7: Interface interfaceName= UnquotedString ( interfaceExtends )? OpenCurlyBrace ( interfaceMember )* CloseCurlyBrace
			{
			Interface15=(Token)match(input,Interface,FOLLOW_Interface_in_interfaceDefinition1033); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Interface.add(Interface15);

			interfaceName=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceDefinition1037); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UnquotedString.add(interfaceName);

			// com/github/gumtreediff/gen/antlr3/php/Php.g:161:46: ( interfaceExtends )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Extends) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:161:46: interfaceExtends
					{
					pushFollow(FOLLOW_interfaceExtends_in_interfaceDefinition1039);
					interfaceExtends16=interfaceExtends();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_interfaceExtends.add(interfaceExtends16.getTree());
					}
					break;

			}

			OpenCurlyBrace17=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_interfaceDefinition1050); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(OpenCurlyBrace17);

			// com/github/gumtreediff/gen/antlr3/php/Php.g:163:9: ( interfaceMember )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= Abstract && LA6_0 <= AccessModifier)||LA6_0==Const||LA6_0==Function||LA6_0==Static) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:163:9: interfaceMember
					{
					pushFollow(FOLLOW_interfaceMember_in_interfaceDefinition1060);
					interfaceMember18=interfaceMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_interfaceMember.add(interfaceMember18.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			CloseCurlyBrace19=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_interfaceDefinition1071); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(CloseCurlyBrace19);


			// AST REWRITE
			// elements: interfaceMember, Interface, interfaceName, interfaceExtends
			// token labels: interfaceName
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_interfaceName=new RewriteRuleTokenStream(adaptor,"token interfaceName",interfaceName);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 165:9: -> ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:165:12: ^( Interface $interfaceName ( interfaceExtends )? ( interfaceMember )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_Interface.nextNode(), root_1);
				adaptor.addChild(root_1, stream_interfaceName.nextNode());
				// com/github/gumtreediff/gen/antlr3/php/Php.g:165:39: ( interfaceExtends )?
				if ( stream_interfaceExtends.hasNext() ) {
					adaptor.addChild(root_1, stream_interfaceExtends.nextTree());
				}
				stream_interfaceExtends.reset();

				// com/github/gumtreediff/gen/antlr3/php/Php.g:165:57: ( interfaceMember )*
				while ( stream_interfaceMember.hasNext() ) {
					adaptor.addChild(root_1, stream_interfaceMember.nextTree());
				}
				stream_interfaceMember.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, interfaceDefinition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceDefinition"


	public static class interfaceExtends_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceExtends"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:168:1: interfaceExtends : Extends ^ UnquotedString ( Comma ! UnquotedString )* ;
	public final PhpParser.interfaceExtends_return interfaceExtends() throws RecognitionException {
		PhpParser.interfaceExtends_return retval = new PhpParser.interfaceExtends_return();
		retval.start = input.LT(1);
		int interfaceExtends_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Extends20=null;
		Token UnquotedString21=null;
		Token Comma22=null;
		Token UnquotedString23=null;

		CommonTree Extends20_tree=null;
		CommonTree UnquotedString21_tree=null;
		CommonTree Comma22_tree=null;
		CommonTree UnquotedString23_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:169:5: ( Extends ^ UnquotedString ( Comma ! UnquotedString )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:169:7: Extends ^ UnquotedString ( Comma ! UnquotedString )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Extends20=(Token)match(input,Extends,FOLLOW_Extends_in_interfaceExtends1111); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Extends20_tree = (CommonTree)adaptor.create(Extends20);
			root_0 = (CommonTree)adaptor.becomeRoot(Extends20_tree, root_0);
			}

			UnquotedString21=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1114); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UnquotedString21_tree = (CommonTree)adaptor.create(UnquotedString21);
			adaptor.addChild(root_0, UnquotedString21_tree);
			}

			// com/github/gumtreediff/gen/antlr3/php/Php.g:169:31: ( Comma ! UnquotedString )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==Comma) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:169:32: Comma ! UnquotedString
					{
					Comma22=(Token)match(input,Comma,FOLLOW_Comma_in_interfaceExtends1117); if (state.failed) return retval;
					UnquotedString23=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceExtends1120); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString23_tree = (CommonTree)adaptor.create(UnquotedString23);
					adaptor.addChild(root_0, UnquotedString23_tree);
					}

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, interfaceExtends_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceExtends"


	public static class interfaceMember_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interfaceMember"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:171:1: interfaceMember : ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) );
	public final PhpParser.interfaceMember_return interfaceMember() throws RecognitionException {
		PhpParser.interfaceMember_return retval = new PhpParser.interfaceMember_return();
		retval.start = input.LT(1);
		int interfaceMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Const24=null;
		Token UnquotedString25=null;
		Token Equals26=null;
		Token char_literal28=null;
		Token Function30=null;
		Token UnquotedString31=null;
		Token char_literal33=null;
		ParserRuleReturnScope atom27 =null;
		ParserRuleReturnScope fieldModifier29 =null;
		ParserRuleReturnScope parametersDefinition32 =null;

		CommonTree Const24_tree=null;
		CommonTree UnquotedString25_tree=null;
		CommonTree Equals26_tree=null;
		CommonTree char_literal28_tree=null;
		CommonTree Function30_tree=null;
		CommonTree UnquotedString31_tree=null;
		CommonTree char_literal33_tree=null;
		RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
		RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
		RewriteRuleTokenStream stream_Const=new RewriteRuleTokenStream(adaptor,"token Const");
		RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
		RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
		RewriteRuleSubtreeStream stream_fieldModifier=new RewriteRuleSubtreeStream(adaptor,"rule fieldModifier");
		RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:172:5: ( Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* Function UnquotedString parametersDefinition ';' -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==Const) ) {
				alt10=1;
			}
			else if ( ((LA10_0 >= Abstract && LA10_0 <= AccessModifier)||LA10_0==Function||LA10_0==Static) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:172:7: Const UnquotedString ( Equals atom )? ';'
					{
					Const24=(Token)match(input,Const,FOLLOW_Const_in_interfaceMember1138); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Const.add(Const24);

					UnquotedString25=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1140); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString25);

					// com/github/gumtreediff/gen/antlr3/php/Php.g:172:28: ( Equals atom )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==Equals) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:172:29: Equals atom
							{
							Equals26=(Token)match(input,Equals,FOLLOW_Equals_in_interfaceMember1143); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Equals.add(Equals26);

							pushFollow(FOLLOW_atom_in_interfaceMember1145);
							atom27=atom();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_atom.add(atom27.getTree());
							}
							break;

					}

					char_literal28=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1149); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SemiColon.add(char_literal28);


					// AST REWRITE
					// elements: atom, Const, UnquotedString
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 173:9: -> ^( Const UnquotedString ( atom )? )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:173:12: ^( Const UnquotedString ( atom )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_Const.nextNode(), root_1);
						adaptor.addChild(root_1, stream_UnquotedString.nextNode());
						// com/github/gumtreediff/gen/antlr3/php/Php.g:173:35: ( atom )?
						if ( stream_atom.hasNext() ) {
							adaptor.addChild(root_1, stream_atom.nextTree());
						}
						stream_atom.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:174:7: ( fieldModifier )* Function UnquotedString parametersDefinition ';'
					{
					// com/github/gumtreediff/gen/antlr3/php/Php.g:174:7: ( fieldModifier )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= Abstract && LA9_0 <= AccessModifier)||LA9_0==Static) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:174:7: fieldModifier
							{
							pushFollow(FOLLOW_fieldModifier_in_interfaceMember1177);
							fieldModifier29=fieldModifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier29.getTree());
							}
							break;

						default :
							break loop9;
						}
					}

					Function30=(Token)match(input,Function,FOLLOW_Function_in_interfaceMember1180); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Function.add(Function30);

					UnquotedString31=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_interfaceMember1182); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString31);

					pushFollow(FOLLOW_parametersDefinition_in_interfaceMember1184);
					parametersDefinition32=parametersDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition32.getTree());
					char_literal33=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_interfaceMember1186); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SemiColon.add(char_literal33);


					// AST REWRITE
					// elements: fieldModifier, UnquotedString, parametersDefinition
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 175:9: -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:175:12: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Method, "Method"), root_1);
						// com/github/gumtreediff/gen/antlr3/php/Php.g:175:21: ^( Modifiers ( fieldModifier )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);
						// com/github/gumtreediff/gen/antlr3/php/Php.g:175:33: ( fieldModifier )*
						while ( stream_fieldModifier.hasNext() ) {
							adaptor.addChild(root_2, stream_fieldModifier.nextTree());
						}
						stream_fieldModifier.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_UnquotedString.nextNode());
						adaptor.addChild(root_1, stream_parametersDefinition.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, interfaceMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interfaceMember"


	public static class classDefinition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classDefinition"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:178:1: classDefinition : ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) ;
	public final PhpParser.classDefinition_return classDefinition() throws RecognitionException {
		PhpParser.classDefinition_return retval = new PhpParser.classDefinition_return();
		retval.start = input.LT(1);
		int classDefinition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token className=null;
		Token extendsclass=null;
		Token Class35=null;
		Token Extends36=null;
		Token OpenCurlyBrace38=null;
		Token CloseCurlyBrace40=null;
		ParserRuleReturnScope classModifier34 =null;
		ParserRuleReturnScope classImplements37 =null;
		ParserRuleReturnScope classMember39 =null;

		CommonTree className_tree=null;
		CommonTree extendsclass_tree=null;
		CommonTree Class35_tree=null;
		CommonTree Extends36_tree=null;
		CommonTree OpenCurlyBrace38_tree=null;
		CommonTree CloseCurlyBrace40_tree=null;
		RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
		RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
		RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
		RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
		RewriteRuleTokenStream stream_Extends=new RewriteRuleTokenStream(adaptor,"token Extends");
		RewriteRuleSubtreeStream stream_classModifier=new RewriteRuleSubtreeStream(adaptor,"rule classModifier");
		RewriteRuleSubtreeStream stream_classImplements=new RewriteRuleSubtreeStream(adaptor,"rule classImplements");
		RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:179:5: ( ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:179:9: ( classModifier )? Class className= UnquotedString ( Extends extendsclass= UnquotedString )? ( classImplements )? OpenCurlyBrace ( classMember )* CloseCurlyBrace
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:179:9: ( classModifier )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Abstract) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:179:9: classModifier
					{
					pushFollow(FOLLOW_classModifier_in_classDefinition1230);
					classModifier34=classModifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classModifier.add(classModifier34.getTree());
					}
					break;

			}

			Class35=(Token)match(input,Class,FOLLOW_Class_in_classDefinition1242); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Class.add(Class35);

			className=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1246); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UnquotedString.add(className);

			// com/github/gumtreediff/gen/antlr3/php/Php.g:181:9: ( Extends extendsclass= UnquotedString )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Extends) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:181:10: Extends extendsclass= UnquotedString
					{
					Extends36=(Token)match(input,Extends,FOLLOW_Extends_in_classDefinition1258); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Extends.add(Extends36);

					extendsclass=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classDefinition1262); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UnquotedString.add(extendsclass);

					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/php/Php.g:182:9: ( classImplements )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Implements) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:182:9: classImplements
					{
					pushFollow(FOLLOW_classImplements_in_classDefinition1275);
					classImplements37=classImplements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classImplements.add(classImplements37.getTree());
					}
					break;

			}

			OpenCurlyBrace38=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_classDefinition1286); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(OpenCurlyBrace38);

			// com/github/gumtreediff/gen/antlr3/php/Php.g:184:9: ( classMember )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= Abstract && LA14_0 <= AccessModifier)||LA14_0==Const||LA14_0==Dollar||LA14_0==Function||LA14_0==Static||LA14_0==Var) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:184:9: classMember
					{
					pushFollow(FOLLOW_classMember_in_classDefinition1296);
					classMember39=classMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_classMember.add(classMember39.getTree());
					}
					break;

				default :
					break loop14;
				}
			}

			CloseCurlyBrace40=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_classDefinition1307); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(CloseCurlyBrace40);


			// AST REWRITE
			// elements: classModifier, Extends, extendsclass, Class, className, classMember, classImplements
			// token labels: className, extendsclass
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_className=new RewriteRuleTokenStream(adaptor,"token className",className);
			RewriteRuleTokenStream stream_extendsclass=new RewriteRuleTokenStream(adaptor,"token extendsclass",extendsclass);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 186:9: -> ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:186:12: ^( Class ^( Modifiers ( classModifier )? ) $className ( ^( Extends $extendsclass) )? ( classImplements )? ( classMember )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_Class.nextNode(), root_1);
				// com/github/gumtreediff/gen/antlr3/php/Php.g:186:20: ^( Modifiers ( classModifier )? )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);
				// com/github/gumtreediff/gen/antlr3/php/Php.g:186:32: ( classModifier )?
				if ( stream_classModifier.hasNext() ) {
					adaptor.addChild(root_2, stream_classModifier.nextTree());
				}
				stream_classModifier.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_className.nextNode());
				// com/github/gumtreediff/gen/antlr3/php/Php.g:186:59: ( ^( Extends $extendsclass) )?
				if ( stream_Extends.hasNext()||stream_extendsclass.hasNext() ) {
					// com/github/gumtreediff/gen/antlr3/php/Php.g:186:59: ^( Extends $extendsclass)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot(stream_Extends.nextNode(), root_2);
					adaptor.addChild(root_2, stream_extendsclass.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_Extends.reset();
				stream_extendsclass.reset();

				// com/github/gumtreediff/gen/antlr3/php/Php.g:186:85: ( classImplements )?
				if ( stream_classImplements.hasNext() ) {
					adaptor.addChild(root_1, stream_classImplements.nextTree());
				}
				stream_classImplements.reset();

				// com/github/gumtreediff/gen/antlr3/php/Php.g:187:13: ( classMember )*
				while ( stream_classMember.hasNext() ) {
					adaptor.addChild(root_1, stream_classMember.nextTree());
				}
				stream_classMember.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, classDefinition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classDefinition"


	public static class classImplements_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classImplements"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:191:1: classImplements : Implements ^ ( UnquotedString ( Comma ! UnquotedString )* ) ;
	public final PhpParser.classImplements_return classImplements() throws RecognitionException {
		PhpParser.classImplements_return retval = new PhpParser.classImplements_return();
		retval.start = input.LT(1);
		int classImplements_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Implements41=null;
		Token UnquotedString42=null;
		Token Comma43=null;
		Token UnquotedString44=null;

		CommonTree Implements41_tree=null;
		CommonTree UnquotedString42_tree=null;
		CommonTree Comma43_tree=null;
		CommonTree UnquotedString44_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:192:5: ( Implements ^ ( UnquotedString ( Comma ! UnquotedString )* ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:192:8: Implements ^ ( UnquotedString ( Comma ! UnquotedString )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			Implements41=(Token)match(input,Implements,FOLLOW_Implements_in_classImplements1389); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Implements41_tree = (CommonTree)adaptor.create(Implements41);
			root_0 = (CommonTree)adaptor.becomeRoot(Implements41_tree, root_0);
			}

			// com/github/gumtreediff/gen/antlr3/php/Php.g:192:20: ( UnquotedString ( Comma ! UnquotedString )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:192:21: UnquotedString ( Comma ! UnquotedString )*
			{
			UnquotedString42=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1393); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UnquotedString42_tree = (CommonTree)adaptor.create(UnquotedString42);
			adaptor.addChild(root_0, UnquotedString42_tree);
			}

			// com/github/gumtreediff/gen/antlr3/php/Php.g:192:36: ( Comma ! UnquotedString )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==Comma) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:192:37: Comma ! UnquotedString
					{
					Comma43=(Token)match(input,Comma,FOLLOW_Comma_in_classImplements1396); if (state.failed) return retval;
					UnquotedString44=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classImplements1399); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString44_tree = (CommonTree)adaptor.create(UnquotedString44);
					adaptor.addChild(root_0, UnquotedString44_tree);
					}

					}
					break;

				default :
					break loop15;
				}
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, classImplements_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classImplements"


	public static class classMember_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classMember"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:195:1: classMember : ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) );
	public final PhpParser.classMember_return classMember() throws RecognitionException {
		PhpParser.classMember_return retval = new PhpParser.classMember_return();
		retval.start = input.LT(1);
		int classMember_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Function46=null;
		Token UnquotedString47=null;
		Token char_literal50=null;
		Token Var51=null;
		Token Dollar52=null;
		Token UnquotedString53=null;
		Token Equals54=null;
		Token char_literal56=null;
		Token Const57=null;
		Token UnquotedString58=null;
		Token Equals59=null;
		Token char_literal61=null;
		Token Dollar63=null;
		Token UnquotedString64=null;
		Token Equals65=null;
		Token char_literal67=null;
		ParserRuleReturnScope fieldModifier45 =null;
		ParserRuleReturnScope parametersDefinition48 =null;
		ParserRuleReturnScope bracketedBlock49 =null;
		ParserRuleReturnScope atom55 =null;
		ParserRuleReturnScope atom60 =null;
		ParserRuleReturnScope fieldModifier62 =null;
		ParserRuleReturnScope atom66 =null;

		CommonTree Function46_tree=null;
		CommonTree UnquotedString47_tree=null;
		CommonTree char_literal50_tree=null;
		CommonTree Var51_tree=null;
		CommonTree Dollar52_tree=null;
		CommonTree UnquotedString53_tree=null;
		CommonTree Equals54_tree=null;
		CommonTree char_literal56_tree=null;
		CommonTree Const57_tree=null;
		CommonTree UnquotedString58_tree=null;
		CommonTree Equals59_tree=null;
		CommonTree char_literal61_tree=null;
		CommonTree Dollar63_tree=null;
		CommonTree UnquotedString64_tree=null;
		CommonTree Equals65_tree=null;
		CommonTree char_literal67_tree=null;
		RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
		RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
		RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
		RewriteRuleTokenStream stream_Var=new RewriteRuleTokenStream(adaptor,"token Var");
		RewriteRuleTokenStream stream_Const=new RewriteRuleTokenStream(adaptor,"token Const");
		RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
		RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
		RewriteRuleSubtreeStream stream_fieldModifier=new RewriteRuleSubtreeStream(adaptor,"rule fieldModifier");
		RewriteRuleSubtreeStream stream_bracketedBlock=new RewriteRuleSubtreeStream(adaptor,"rule bracketedBlock");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
		RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:196:5: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? ) | Var Dollar UnquotedString ( Equals atom )? ';' -> ^( Var ^( Dollar UnquotedString ) ( atom )? ) | Const UnquotedString ( Equals atom )? ';' -> ^( Const UnquotedString ( atom )? ) | ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';' -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? ) )
			int alt22=4;
			switch ( input.LA(1) ) {
			case Abstract:
			case AccessModifier:
			case Static:
				{
				switch ( input.LA(2) ) {
				case Function:
					{
					alt22=1;
					}
					break;
				case Abstract:
				case AccessModifier:
				case Static:
					{
					int LA22_7 = input.LA(3);
					if ( (synpred23_Php()) ) {
						alt22=1;
					}
					else if ( (true) ) {
						alt22=4;
					}

					}
					break;
				case Dollar:
					{
					alt22=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Function:
				{
				alt22=1;
				}
				break;
			case Var:
				{
				alt22=2;
				}
				break;
			case Const:
				{
				alt22=3;
				}
				break;
			case Dollar:
				{
				alt22=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:196:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
					{
					// com/github/gumtreediff/gen/antlr3/php/Php.g:196:7: ( fieldModifier )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= Abstract && LA16_0 <= AccessModifier)||LA16_0==Static) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:196:7: fieldModifier
							{
							pushFollow(FOLLOW_fieldModifier_in_classMember1419);
							fieldModifier45=fieldModifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier45.getTree());
							}
							break;

						default :
							break loop16;
						}
					}

					Function46=(Token)match(input,Function,FOLLOW_Function_in_classMember1422); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Function.add(Function46);

					UnquotedString47=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1424); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString47);

					pushFollow(FOLLOW_parametersDefinition_in_classMember1426);
					parametersDefinition48=parametersDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition48.getTree());
					// com/github/gumtreediff/gen/antlr3/php/Php.g:197:9: ( bracketedBlock | ';' )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==OpenCurlyBrace) ) {
						alt17=1;
					}
					else if ( (LA17_0==SemiColon) ) {
						alt17=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:197:10: bracketedBlock
							{
							pushFollow(FOLLOW_bracketedBlock_in_classMember1438);
							bracketedBlock49=bracketedBlock();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock49.getTree());
							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:197:27: ';'
							{
							char_literal50=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1442); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SemiColon.add(char_literal50);

							}
							break;

					}


					// AST REWRITE
					// elements: parametersDefinition, bracketedBlock, fieldModifier, UnquotedString
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 198:9: -> ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:198:12: ^( Method ^( Modifiers ( fieldModifier )* ) UnquotedString parametersDefinition ( bracketedBlock )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Method, "Method"), root_1);
						// com/github/gumtreediff/gen/antlr3/php/Php.g:198:21: ^( Modifiers ( fieldModifier )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);
						// com/github/gumtreediff/gen/antlr3/php/Php.g:198:33: ( fieldModifier )*
						while ( stream_fieldModifier.hasNext() ) {
							adaptor.addChild(root_2, stream_fieldModifier.nextTree());
						}
						stream_fieldModifier.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_UnquotedString.nextNode());
						adaptor.addChild(root_1, stream_parametersDefinition.nextTree());
						// com/github/gumtreediff/gen/antlr3/php/Php.g:198:85: ( bracketedBlock )?
						if ( stream_bracketedBlock.hasNext() ) {
							adaptor.addChild(root_1, stream_bracketedBlock.nextTree());
						}
						stream_bracketedBlock.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:199:7: Var Dollar UnquotedString ( Equals atom )? ';'
					{
					Var51=(Token)match(input,Var,FOLLOW_Var_in_classMember1479); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Var.add(Var51);

					Dollar52=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1481); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Dollar.add(Dollar52);

					UnquotedString53=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1483); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString53);

					// com/github/gumtreediff/gen/antlr3/php/Php.g:199:33: ( Equals atom )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==Equals) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:199:34: Equals atom
							{
							Equals54=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1486); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Equals.add(Equals54);

							pushFollow(FOLLOW_atom_in_classMember1488);
							atom55=atom();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_atom.add(atom55.getTree());
							}
							break;

					}

					char_literal56=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1492); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SemiColon.add(char_literal56);


					// AST REWRITE
					// elements: atom, UnquotedString, Dollar, Var
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 200:9: -> ^( Var ^( Dollar UnquotedString ) ( atom )? )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:200:12: ^( Var ^( Dollar UnquotedString ) ( atom )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_Var.nextNode(), root_1);
						// com/github/gumtreediff/gen/antlr3/php/Php.g:200:18: ^( Dollar UnquotedString )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);
						adaptor.addChild(root_2, stream_UnquotedString.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						// com/github/gumtreediff/gen/antlr3/php/Php.g:200:43: ( atom )?
						if ( stream_atom.hasNext() ) {
							adaptor.addChild(root_1, stream_atom.nextTree());
						}
						stream_atom.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:201:7: Const UnquotedString ( Equals atom )? ';'
					{
					Const57=(Token)match(input,Const,FOLLOW_Const_in_classMember1525); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Const.add(Const57);

					UnquotedString58=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1527); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString58);

					// com/github/gumtreediff/gen/antlr3/php/Php.g:201:28: ( Equals atom )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==Equals) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:201:29: Equals atom
							{
							Equals59=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1530); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Equals.add(Equals59);

							pushFollow(FOLLOW_atom_in_classMember1532);
							atom60=atom();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_atom.add(atom60.getTree());
							}
							break;

					}

					char_literal61=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1536); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SemiColon.add(char_literal61);


					// AST REWRITE
					// elements: Const, UnquotedString, atom
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 202:9: -> ^( Const UnquotedString ( atom )? )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:202:12: ^( Const UnquotedString ( atom )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_Const.nextNode(), root_1);
						adaptor.addChild(root_1, stream_UnquotedString.nextNode());
						// com/github/gumtreediff/gen/antlr3/php/Php.g:202:35: ( atom )?
						if ( stream_atom.hasNext() ) {
							adaptor.addChild(root_1, stream_atom.nextTree());
						}
						stream_atom.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:203:7: ( fieldModifier )* ( Dollar UnquotedString ) ( Equals atom )? ';'
					{
					// com/github/gumtreediff/gen/antlr3/php/Php.g:203:7: ( fieldModifier )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= Abstract && LA20_0 <= AccessModifier)||LA20_0==Static) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:203:7: fieldModifier
							{
							pushFollow(FOLLOW_fieldModifier_in_classMember1564);
							fieldModifier62=fieldModifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_fieldModifier.add(fieldModifier62.getTree());
							}
							break;

						default :
							break loop20;
						}
					}

					// com/github/gumtreediff/gen/antlr3/php/Php.g:203:22: ( Dollar UnquotedString )
					// com/github/gumtreediff/gen/antlr3/php/Php.g:203:23: Dollar UnquotedString
					{
					Dollar63=(Token)match(input,Dollar,FOLLOW_Dollar_in_classMember1568); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Dollar.add(Dollar63);

					UnquotedString64=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_classMember1570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString64);

					}

					// com/github/gumtreediff/gen/antlr3/php/Php.g:203:46: ( Equals atom )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==Equals) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:203:47: Equals atom
							{
							Equals65=(Token)match(input,Equals,FOLLOW_Equals_in_classMember1574); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Equals.add(Equals65);

							pushFollow(FOLLOW_atom_in_classMember1576);
							atom66=atom();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_atom.add(atom66.getTree());
							}
							break;

					}

					char_literal67=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_classMember1580); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SemiColon.add(char_literal67);


					// AST REWRITE
					// elements: Dollar, UnquotedString, atom, fieldModifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 204:9: -> ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:204:12: ^( Field ^( Modifiers ( fieldModifier )* ) ^( Dollar UnquotedString ) ( atom )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Field, "Field"), root_1);
						// com/github/gumtreediff/gen/antlr3/php/Php.g:204:20: ^( Modifiers ( fieldModifier )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Modifiers, "Modifiers"), root_2);
						// com/github/gumtreediff/gen/antlr3/php/Php.g:204:32: ( fieldModifier )*
						while ( stream_fieldModifier.hasNext() ) {
							adaptor.addChild(root_2, stream_fieldModifier.nextTree());
						}
						stream_fieldModifier.reset();

						adaptor.addChild(root_1, root_2);
						}

						// com/github/gumtreediff/gen/antlr3/php/Php.g:204:48: ^( Dollar UnquotedString )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);
						adaptor.addChild(root_2, stream_UnquotedString.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						// com/github/gumtreediff/gen/antlr3/php/Php.g:204:73: ( atom )?
						if ( stream_atom.hasNext() ) {
							adaptor.addChild(root_1, stream_atom.nextTree());
						}
						stream_atom.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, classMember_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classMember"


	public static class fieldDefinition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fieldDefinition"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:207:1: fieldDefinition : Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) ;
	public final PhpParser.fieldDefinition_return fieldDefinition() throws RecognitionException {
		PhpParser.fieldDefinition_return retval = new PhpParser.fieldDefinition_return();
		retval.start = input.LT(1);
		int fieldDefinition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Dollar68=null;
		Token UnquotedString69=null;
		Token Equals70=null;
		Token char_literal72=null;
		ParserRuleReturnScope atom71 =null;

		CommonTree Dollar68_tree=null;
		CommonTree UnquotedString69_tree=null;
		CommonTree Equals70_tree=null;
		CommonTree char_literal72_tree=null;
		RewriteRuleTokenStream stream_Equals=new RewriteRuleTokenStream(adaptor,"token Equals");
		RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
		RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
		RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:208:5: ( Dollar UnquotedString ( Equals atom )? ';' -> ^( Field ^( Dollar UnquotedString ) ( atom )? ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:208:7: Dollar UnquotedString ( Equals atom )? ';'
			{
			Dollar68=(Token)match(input,Dollar,FOLLOW_Dollar_in_fieldDefinition1628); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Dollar.add(Dollar68);

			UnquotedString69=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_fieldDefinition1630); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString69);

			// com/github/gumtreediff/gen/antlr3/php/Php.g:208:29: ( Equals atom )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==Equals) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:208:30: Equals atom
					{
					Equals70=(Token)match(input,Equals,FOLLOW_Equals_in_fieldDefinition1633); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Equals.add(Equals70);

					pushFollow(FOLLOW_atom_in_fieldDefinition1635);
					atom71=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atom.add(atom71.getTree());
					}
					break;

			}

			char_literal72=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_fieldDefinition1639); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SemiColon.add(char_literal72);


			// AST REWRITE
			// elements: UnquotedString, atom, Dollar
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 208:47: -> ^( Field ^( Dollar UnquotedString ) ( atom )? )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:208:50: ^( Field ^( Dollar UnquotedString ) ( atom )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Field, "Field"), root_1);
				// com/github/gumtreediff/gen/antlr3/php/Php.g:208:58: ^( Dollar UnquotedString )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_UnquotedString.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// com/github/gumtreediff/gen/antlr3/php/Php.g:208:83: ( atom )?
				if ( stream_atom.hasNext() ) {
					adaptor.addChild(root_1, stream_atom.nextTree());
				}
				stream_atom.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, fieldDefinition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fieldDefinition"


	public static class classModifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "classModifier"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:211:1: classModifier : 'abstract' ;
	public final PhpParser.classModifier_return classModifier() throws RecognitionException {
		PhpParser.classModifier_return retval = new PhpParser.classModifier_return();
		retval.start = input.LT(1);
		int classModifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal73=null;

		CommonTree string_literal73_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:212:5: ( 'abstract' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:212:7: 'abstract'
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal73=(Token)match(input,Abstract,FOLLOW_Abstract_in_classModifier1674); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal73_tree = (CommonTree)adaptor.create(string_literal73);
			adaptor.addChild(root_0, string_literal73_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, classModifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "classModifier"


	public static class fieldModifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fieldModifier"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:214:1: fieldModifier : ( AccessModifier | 'abstract' | 'static' );
	public final PhpParser.fieldModifier_return fieldModifier() throws RecognitionException {
		PhpParser.fieldModifier_return retval = new PhpParser.fieldModifier_return();
		retval.start = input.LT(1);
		int fieldModifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set74=null;

		CommonTree set74_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:215:5: ( AccessModifier | 'abstract' | 'static' )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set74=input.LT(1);
			if ( (input.LA(1) >= Abstract && input.LA(1) <= AccessModifier)||input.LA(1)==Static ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set74));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, fieldModifier_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "fieldModifier"


	public static class complexStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "complexStatement"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:219:1: complexStatement : ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' expression 'as' arrayEntry ')' statement -> ^( Foreach expression arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition );
	public final PhpParser.complexStatement_return complexStatement() throws RecognitionException {
		PhpParser.complexStatement_return retval = new PhpParser.complexStatement_return();
		retval.start = input.LT(1);
		int complexStatement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token If75=null;
		Token char_literal76=null;
		Token char_literal77=null;
		Token For79=null;
		Token char_literal80=null;
		Token char_literal84=null;
		Token Foreach86=null;
		Token char_literal87=null;
		Token string_literal89=null;
		Token char_literal91=null;
		Token While93=null;
		Token char_literal94=null;
		Token char_literal95=null;
		Token Do97=null;
		Token While99=null;
		Token char_literal100=null;
		Token char_literal101=null;
		Token char_literal102=null;
		Token Switch103=null;
		Token char_literal104=null;
		Token char_literal106=null;
		Token char_literal107=null;
		Token char_literal109=null;
		ParserRuleReturnScope ifCondition =null;
		ParserRuleReturnScope ifTrue =null;
		ParserRuleReturnScope whileCondition =null;
		ParserRuleReturnScope doCondition =null;
		ParserRuleReturnScope conditional78 =null;
		ParserRuleReturnScope forInit81 =null;
		ParserRuleReturnScope forCondition82 =null;
		ParserRuleReturnScope forUpdate83 =null;
		ParserRuleReturnScope statement85 =null;
		ParserRuleReturnScope expression88 =null;
		ParserRuleReturnScope arrayEntry90 =null;
		ParserRuleReturnScope statement92 =null;
		ParserRuleReturnScope statement96 =null;
		ParserRuleReturnScope statement98 =null;
		ParserRuleReturnScope expression105 =null;
		ParserRuleReturnScope cases108 =null;
		ParserRuleReturnScope functionDefinition110 =null;

		CommonTree If75_tree=null;
		CommonTree char_literal76_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree For79_tree=null;
		CommonTree char_literal80_tree=null;
		CommonTree char_literal84_tree=null;
		CommonTree Foreach86_tree=null;
		CommonTree char_literal87_tree=null;
		CommonTree string_literal89_tree=null;
		CommonTree char_literal91_tree=null;
		CommonTree While93_tree=null;
		CommonTree char_literal94_tree=null;
		CommonTree char_literal95_tree=null;
		CommonTree Do97_tree=null;
		CommonTree While99_tree=null;
		CommonTree char_literal100_tree=null;
		CommonTree char_literal101_tree=null;
		CommonTree char_literal102_tree=null;
		CommonTree Switch103_tree=null;
		CommonTree char_literal104_tree=null;
		CommonTree char_literal106_tree=null;
		CommonTree char_literal107_tree=null;
		CommonTree char_literal109_tree=null;
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_CloseCurlyBrace=new RewriteRuleTokenStream(adaptor,"token CloseCurlyBrace");
		RewriteRuleTokenStream stream_Switch=new RewriteRuleTokenStream(adaptor,"token Switch");
		RewriteRuleTokenStream stream_OpenCurlyBrace=new RewriteRuleTokenStream(adaptor,"token OpenCurlyBrace");
		RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
		RewriteRuleTokenStream stream_Foreach=new RewriteRuleTokenStream(adaptor,"token Foreach");
		RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
		RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
		RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
		RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
		RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
		RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
		RewriteRuleSubtreeStream stream_forUpdate=new RewriteRuleSubtreeStream(adaptor,"rule forUpdate");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_forCondition=new RewriteRuleSubtreeStream(adaptor,"rule forCondition");
		RewriteRuleSubtreeStream stream_arrayEntry=new RewriteRuleSubtreeStream(adaptor,"rule arrayEntry");
		RewriteRuleSubtreeStream stream_cases=new RewriteRuleSubtreeStream(adaptor,"rule cases");
		RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
		RewriteRuleSubtreeStream stream_forInit=new RewriteRuleSubtreeStream(adaptor,"rule forInit");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:220:5: ( If '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( 'if' expression $ifTrue ( conditional )? ) | For '(' forInit forCondition forUpdate ')' statement -> ^( For forInit forCondition forUpdate statement ) | Foreach '(' expression 'as' arrayEntry ')' statement -> ^( Foreach expression arrayEntry statement ) | While '(' (whileCondition= expression )? ')' statement -> ^( While $whileCondition statement ) | Do statement While '(' doCondition= expression ')' ';' -> ^( Do statement $doCondition) | Switch '(' expression ')' '{' cases '}' -> ^( Switch expression cases ) | functionDefinition )
			int alt26=7;
			switch ( input.LA(1) ) {
			case If:
				{
				alt26=1;
				}
				break;
			case For:
				{
				alt26=2;
				}
				break;
			case Foreach:
				{
				alt26=3;
				}
				break;
			case While:
				{
				alt26=4;
				}
				break;
			case Do:
				{
				alt26=5;
				}
				break;
			case Switch:
				{
				alt26=6;
				}
				break;
			case Function:
				{
				alt26=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:220:7: If '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
					{
					If75=(Token)match(input,If,FOLLOW_If_in_complexStatement1717); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_If.add(If75);

					char_literal76=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1719); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal76);

					pushFollow(FOLLOW_expression_in_complexStatement1723);
					ifCondition=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());
					char_literal77=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1725); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal77);

					pushFollow(FOLLOW_statement_in_complexStatement1729);
					ifTrue=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());
					// com/github/gumtreediff/gen/antlr3/php/Php.g:220:58: ( conditional )?
					int alt24=2;
					alt24 = dfa24.predict(input);
					switch (alt24) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:220:58: conditional
							{
							pushFollow(FOLLOW_conditional_in_complexStatement1731);
							conditional78=conditional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_conditional.add(conditional78.getTree());
							}
							break;

					}


					// AST REWRITE
					// elements: conditional, ifTrue, expression, If
					// token labels: 
					// rule labels: ifTrue, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_ifTrue=new RewriteRuleSubtreeStream(adaptor,"rule ifTrue",ifTrue!=null?ifTrue.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 221:9: -> ^( 'if' expression $ifTrue ( conditional )? )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:221:12: ^( 'if' expression $ifTrue ( conditional )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(If, "If"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_ifTrue.nextTree());
						// com/github/gumtreediff/gen/antlr3/php/Php.g:221:38: ( conditional )?
						if ( stream_conditional.hasNext() ) {
							adaptor.addChild(root_1, stream_conditional.nextTree());
						}
						stream_conditional.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:222:7: For '(' forInit forCondition forUpdate ')' statement
					{
					For79=(Token)match(input,For,FOLLOW_For_in_complexStatement1762); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_For.add(For79);

					char_literal80=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1764); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal80);

					pushFollow(FOLLOW_forInit_in_complexStatement1766);
					forInit81=forInit();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_forInit.add(forInit81.getTree());
					pushFollow(FOLLOW_forCondition_in_complexStatement1768);
					forCondition82=forCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_forCondition.add(forCondition82.getTree());
					pushFollow(FOLLOW_forUpdate_in_complexStatement1770);
					forUpdate83=forUpdate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_forUpdate.add(forUpdate83.getTree());
					char_literal84=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1772); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal84);

					pushFollow(FOLLOW_statement_in_complexStatement1774);
					statement85=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement85.getTree());

					// AST REWRITE
					// elements: statement, forCondition, forInit, forUpdate, For
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 222:60: -> ^( For forInit forCondition forUpdate statement )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:222:63: ^( For forInit forCondition forUpdate statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_For.nextNode(), root_1);
						adaptor.addChild(root_1, stream_forInit.nextTree());
						adaptor.addChild(root_1, stream_forCondition.nextTree());
						adaptor.addChild(root_1, stream_forUpdate.nextTree());
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:223:7: Foreach '(' expression 'as' arrayEntry ')' statement
					{
					Foreach86=(Token)match(input,Foreach,FOLLOW_Foreach_in_complexStatement1796); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Foreach.add(Foreach86);

					char_literal87=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1798); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal87);

					pushFollow(FOLLOW_expression_in_complexStatement1800);
					expression88=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression88.getTree());
					string_literal89=(Token)match(input,112,FOLLOW_112_in_complexStatement1802); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(string_literal89);

					pushFollow(FOLLOW_arrayEntry_in_complexStatement1804);
					arrayEntry90=arrayEntry();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry90.getTree());
					char_literal91=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1806); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal91);

					pushFollow(FOLLOW_statement_in_complexStatement1808);
					statement92=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement92.getTree());

					// AST REWRITE
					// elements: Foreach, arrayEntry, expression, statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 223:60: -> ^( Foreach expression arrayEntry statement )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:223:63: ^( Foreach expression arrayEntry statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_Foreach.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_arrayEntry.nextTree());
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:224:7: While '(' (whileCondition= expression )? ')' statement
					{
					While93=(Token)match(input,While,FOLLOW_While_in_complexStatement1828); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_While.add(While93);

					char_literal94=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1830); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal94);

					// com/github/gumtreediff/gen/antlr3/php/Php.g:224:31: (whileCondition= expression )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==Ampersand||LA25_0==Array||LA25_0==Bang||LA25_0==Boolean||LA25_0==Clone||LA25_0==Dollar||LA25_0==DoubleQuotedString||LA25_0==HereDoc||LA25_0==IncrementOperator||LA25_0==Integer||LA25_0==Minus||LA25_0==New||LA25_0==OpenBrace||LA25_0==Real||LA25_0==SingleQuotedString||LA25_0==SuppressWarnings||LA25_0==Tilde||LA25_0==UnquotedString) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:224:31: whileCondition= expression
							{
							pushFollow(FOLLOW_expression_in_complexStatement1834);
							whileCondition=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(whileCondition.getTree());
							}
							break;

					}

					char_literal95=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1837); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal95);

					pushFollow(FOLLOW_statement_in_complexStatement1839);
					statement96=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement96.getTree());

					// AST REWRITE
					// elements: statement, While, whileCondition
					// token labels: 
					// rule labels: whileCondition, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_whileCondition=new RewriteRuleSubtreeStream(adaptor,"rule whileCondition",whileCondition!=null?whileCondition.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 224:58: -> ^( While $whileCondition statement )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:224:61: ^( While $whileCondition statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_While.nextNode(), root_1);
						adaptor.addChild(root_1, stream_whileCondition.nextTree());
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:225:7: Do statement While '(' doCondition= expression ')' ';'
					{
					Do97=(Token)match(input,Do,FOLLOW_Do_in_complexStatement1858); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Do.add(Do97);

					pushFollow(FOLLOW_statement_in_complexStatement1860);
					statement98=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement98.getTree());
					While99=(Token)match(input,While,FOLLOW_While_in_complexStatement1862); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_While.add(While99);

					char_literal100=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1864); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal100);

					pushFollow(FOLLOW_expression_in_complexStatement1868);
					doCondition=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(doCondition.getTree());
					char_literal101=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1870); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal101);

					char_literal102=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_complexStatement1872); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SemiColon.add(char_literal102);


					// AST REWRITE
					// elements: Do, doCondition, statement
					// token labels: 
					// rule labels: doCondition, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_doCondition=new RewriteRuleSubtreeStream(adaptor,"rule doCondition",doCondition!=null?doCondition.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 225:61: -> ^( Do statement $doCondition)
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:225:64: ^( Do statement $doCondition)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_Do.nextNode(), root_1);
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_1, stream_doCondition.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:226:7: Switch '(' expression ')' '{' cases '}'
					{
					Switch103=(Token)match(input,Switch,FOLLOW_Switch_in_complexStatement1891); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Switch.add(Switch103);

					char_literal104=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_complexStatement1893); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal104);

					pushFollow(FOLLOW_expression_in_complexStatement1895);
					expression105=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression105.getTree());
					char_literal106=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_complexStatement1897); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal106);

					char_literal107=(Token)match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_complexStatement1899); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenCurlyBrace.add(char_literal107);

					pushFollow(FOLLOW_cases_in_complexStatement1900);
					cases108=cases();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cases.add(cases108.getTree());
					char_literal109=(Token)match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_complexStatement1901); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseCurlyBrace.add(char_literal109);


					// AST REWRITE
					// elements: expression, Switch, cases
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 226:45: -> ^( Switch expression cases )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:226:48: ^( Switch expression cases )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_Switch.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_cases.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:227:7: functionDefinition
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_functionDefinition_in_complexStatement1919);
					functionDefinition110=functionDefinition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDefinition110.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, complexStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "complexStatement"


	public static class simpleStatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simpleStatement"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:230:1: simpleStatement : ( Echo ^ commaList | Throw ^ expression | Global ^ name ( ',' ! name )* | Static ^ variable Equals ! atom | Break ^ ( Integer )? | Continue ^ ( Integer )? | Return ^ ( expression )? | RequireOperator ^ expression | expression );
	public final PhpParser.simpleStatement_return simpleStatement() throws RecognitionException {
		PhpParser.simpleStatement_return retval = new PhpParser.simpleStatement_return();
		retval.start = input.LT(1);
		int simpleStatement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Echo111=null;
		Token Throw113=null;
		Token Global115=null;
		Token char_literal117=null;
		Token Static119=null;
		Token Equals121=null;
		Token Break123=null;
		Token Integer124=null;
		Token Continue125=null;
		Token Integer126=null;
		Token Return127=null;
		Token RequireOperator129=null;
		ParserRuleReturnScope commaList112 =null;
		ParserRuleReturnScope expression114 =null;
		ParserRuleReturnScope name116 =null;
		ParserRuleReturnScope name118 =null;
		ParserRuleReturnScope variable120 =null;
		ParserRuleReturnScope atom122 =null;
		ParserRuleReturnScope expression128 =null;
		ParserRuleReturnScope expression130 =null;
		ParserRuleReturnScope expression131 =null;

		CommonTree Echo111_tree=null;
		CommonTree Throw113_tree=null;
		CommonTree Global115_tree=null;
		CommonTree char_literal117_tree=null;
		CommonTree Static119_tree=null;
		CommonTree Equals121_tree=null;
		CommonTree Break123_tree=null;
		CommonTree Integer124_tree=null;
		CommonTree Continue125_tree=null;
		CommonTree Integer126_tree=null;
		CommonTree Return127_tree=null;
		CommonTree RequireOperator129_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:231:5: ( Echo ^ commaList | Throw ^ expression | Global ^ name ( ',' ! name )* | Static ^ variable Equals ! atom | Break ^ ( Integer )? | Continue ^ ( Integer )? | Return ^ ( expression )? | RequireOperator ^ expression | expression )
			int alt31=9;
			switch ( input.LA(1) ) {
			case Echo:
				{
				alt31=1;
				}
				break;
			case Throw:
				{
				alt31=2;
				}
				break;
			case Global:
				{
				alt31=3;
				}
				break;
			case Static:
				{
				alt31=4;
				}
				break;
			case Break:
				{
				alt31=5;
				}
				break;
			case Continue:
				{
				alt31=6;
				}
				break;
			case Return:
				{
				alt31=7;
				}
				break;
			case RequireOperator:
				{
				alt31=8;
				}
				break;
			case Ampersand:
			case Array:
			case Bang:
			case Boolean:
			case Clone:
			case Dollar:
			case DoubleQuotedString:
			case HereDoc:
			case IncrementOperator:
			case Integer:
			case Minus:
			case New:
			case OpenBrace:
			case Real:
			case SingleQuotedString:
			case SuppressWarnings:
			case Tilde:
			case UnquotedString:
				{
				alt31=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:231:7: Echo ^ commaList
					{
					root_0 = (CommonTree)adaptor.nil();


					Echo111=(Token)match(input,Echo,FOLLOW_Echo_in_simpleStatement1936); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Echo111_tree = (CommonTree)adaptor.create(Echo111);
					root_0 = (CommonTree)adaptor.becomeRoot(Echo111_tree, root_0);
					}

					pushFollow(FOLLOW_commaList_in_simpleStatement1939);
					commaList112=commaList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commaList112.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:232:7: Throw ^ expression
					{
					root_0 = (CommonTree)adaptor.nil();


					Throw113=(Token)match(input,Throw,FOLLOW_Throw_in_simpleStatement1947); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Throw113_tree = (CommonTree)adaptor.create(Throw113);
					root_0 = (CommonTree)adaptor.becomeRoot(Throw113_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_simpleStatement1950);
					expression114=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression114.getTree());

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:233:7: Global ^ name ( ',' ! name )*
					{
					root_0 = (CommonTree)adaptor.nil();


					Global115=(Token)match(input,Global,FOLLOW_Global_in_simpleStatement1958); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Global115_tree = (CommonTree)adaptor.create(Global115);
					root_0 = (CommonTree)adaptor.becomeRoot(Global115_tree, root_0);
					}

					pushFollow(FOLLOW_name_in_simpleStatement1961);
					name116=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, name116.getTree());

					// com/github/gumtreediff/gen/antlr3/php/Php.g:233:20: ( ',' ! name )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==Comma) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:233:21: ',' ! name
							{
							char_literal117=(Token)match(input,Comma,FOLLOW_Comma_in_simpleStatement1964); if (state.failed) return retval;
							pushFollow(FOLLOW_name_in_simpleStatement1967);
							name118=name();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, name118.getTree());

							}
							break;

						default :
							break loop27;
						}
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:234:7: Static ^ variable Equals ! atom
					{
					root_0 = (CommonTree)adaptor.nil();


					Static119=(Token)match(input,Static,FOLLOW_Static_in_simpleStatement1977); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Static119_tree = (CommonTree)adaptor.create(Static119);
					root_0 = (CommonTree)adaptor.becomeRoot(Static119_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_simpleStatement1980);
					variable120=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable120.getTree());

					Equals121=(Token)match(input,Equals,FOLLOW_Equals_in_simpleStatement1982); if (state.failed) return retval;
					pushFollow(FOLLOW_atom_in_simpleStatement1985);
					atom122=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom122.getTree());

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:235:7: Break ^ ( Integer )?
					{
					root_0 = (CommonTree)adaptor.nil();


					Break123=(Token)match(input,Break,FOLLOW_Break_in_simpleStatement1993); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Break123_tree = (CommonTree)adaptor.create(Break123);
					root_0 = (CommonTree)adaptor.becomeRoot(Break123_tree, root_0);
					}

					// com/github/gumtreediff/gen/antlr3/php/Php.g:235:14: ( Integer )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==Integer) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:235:14: Integer
							{
							Integer124=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement1996); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Integer124_tree = (CommonTree)adaptor.create(Integer124);
							adaptor.addChild(root_0, Integer124_tree);
							}

							}
							break;

					}

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:236:7: Continue ^ ( Integer )?
					{
					root_0 = (CommonTree)adaptor.nil();


					Continue125=(Token)match(input,Continue,FOLLOW_Continue_in_simpleStatement2005); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Continue125_tree = (CommonTree)adaptor.create(Continue125);
					root_0 = (CommonTree)adaptor.becomeRoot(Continue125_tree, root_0);
					}

					// com/github/gumtreediff/gen/antlr3/php/Php.g:236:17: ( Integer )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==Integer) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:236:17: Integer
							{
							Integer126=(Token)match(input,Integer,FOLLOW_Integer_in_simpleStatement2008); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Integer126_tree = (CommonTree)adaptor.create(Integer126);
							adaptor.addChild(root_0, Integer126_tree);
							}

							}
							break;

					}

					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:238:7: Return ^ ( expression )?
					{
					root_0 = (CommonTree)adaptor.nil();


					Return127=(Token)match(input,Return,FOLLOW_Return_in_simpleStatement2022); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Return127_tree = (CommonTree)adaptor.create(Return127);
					root_0 = (CommonTree)adaptor.becomeRoot(Return127_tree, root_0);
					}

					// com/github/gumtreediff/gen/antlr3/php/Php.g:238:15: ( expression )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==Ampersand||LA30_0==Array||LA30_0==Bang||LA30_0==Boolean||LA30_0==Clone||LA30_0==Dollar||LA30_0==DoubleQuotedString||LA30_0==HereDoc||LA30_0==IncrementOperator||LA30_0==Integer||LA30_0==Minus||LA30_0==New||LA30_0==OpenBrace||LA30_0==Real||LA30_0==SingleQuotedString||LA30_0==SuppressWarnings||LA30_0==Tilde||LA30_0==UnquotedString) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:238:15: expression
							{
							pushFollow(FOLLOW_expression_in_simpleStatement2025);
							expression128=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression128.getTree());

							}
							break;

					}

					}
					break;
				case 8 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:239:7: RequireOperator ^ expression
					{
					root_0 = (CommonTree)adaptor.nil();


					RequireOperator129=(Token)match(input,RequireOperator,FOLLOW_RequireOperator_in_simpleStatement2034); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RequireOperator129_tree = (CommonTree)adaptor.create(RequireOperator129);
					root_0 = (CommonTree)adaptor.becomeRoot(RequireOperator129_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_simpleStatement2037);
					expression130=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression130.getTree());

					}
					break;
				case 9 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:240:7: expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_in_simpleStatement2045);
					expression131=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression131.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, simpleStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simpleStatement"


	public static class conditional_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditional"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:244:1: conditional : ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement );
	public final PhpParser.conditional_return conditional() throws RecognitionException {
		PhpParser.conditional_return retval = new PhpParser.conditional_return();
		retval.start = input.LT(1);
		int conditional_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ElseIf132=null;
		Token char_literal133=null;
		Token char_literal134=null;
		Token Else136=null;
		ParserRuleReturnScope ifCondition =null;
		ParserRuleReturnScope ifTrue =null;
		ParserRuleReturnScope conditional135 =null;
		ParserRuleReturnScope statement137 =null;

		CommonTree ElseIf132_tree=null;
		CommonTree char_literal133_tree=null;
		CommonTree char_literal134_tree=null;
		CommonTree Else136_tree=null;
		RewriteRuleTokenStream stream_ElseIf=new RewriteRuleTokenStream(adaptor,"token ElseIf");
		RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
		RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
		RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:245:5: ( ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )? -> ^( If $ifCondition $ifTrue ( conditional )? ) | Else statement -> statement )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==ElseIf) ) {
				alt33=1;
			}
			else if ( (LA33_0==Else) ) {
				alt33=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:245:7: ElseIf '(' ifCondition= expression ')' ifTrue= statement ( conditional )?
					{
					ElseIf132=(Token)match(input,ElseIf,FOLLOW_ElseIf_in_conditional2063); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ElseIf.add(ElseIf132);

					char_literal133=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_conditional2065); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenBrace.add(char_literal133);

					pushFollow(FOLLOW_expression_in_conditional2069);
					ifCondition=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(ifCondition.getTree());
					char_literal134=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_conditional2071); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseBrace.add(char_literal134);

					pushFollow(FOLLOW_statement_in_conditional2075);
					ifTrue=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(ifTrue.getTree());
					// com/github/gumtreediff/gen/antlr3/php/Php.g:245:62: ( conditional )?
					int alt32=2;
					alt32 = dfa32.predict(input);
					switch (alt32) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:245:62: conditional
							{
							pushFollow(FOLLOW_conditional_in_conditional2077);
							conditional135=conditional();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_conditional.add(conditional135.getTree());
							}
							break;

					}


					// AST REWRITE
					// elements: ifCondition, ifTrue, conditional
					// token labels: 
					// rule labels: ifCondition, ifTrue, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_ifCondition=new RewriteRuleSubtreeStream(adaptor,"rule ifCondition",ifCondition!=null?ifCondition.getTree():null);
					RewriteRuleSubtreeStream stream_ifTrue=new RewriteRuleSubtreeStream(adaptor,"rule ifTrue",ifTrue!=null?ifTrue.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 245:75: -> ^( If $ifCondition $ifTrue ( conditional )? )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:245:78: ^( If $ifCondition $ifTrue ( conditional )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(If, "If"), root_1);
						adaptor.addChild(root_1, stream_ifCondition.nextTree());
						adaptor.addChild(root_1, stream_ifTrue.nextTree());
						// com/github/gumtreediff/gen/antlr3/php/Php.g:245:104: ( conditional )?
						if ( stream_conditional.hasNext() ) {
							adaptor.addChild(root_1, stream_conditional.nextTree());
						}
						stream_conditional.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:246:7: Else statement
					{
					Else136=(Token)match(input,Else,FOLLOW_Else_in_conditional2101); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Else.add(Else136);

					pushFollow(FOLLOW_statement_in_conditional2103);
					statement137=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement137.getTree());

					// AST REWRITE
					// elements: statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 246:22: -> statement
					{
						adaptor.addChild(root_0, stream_statement.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, conditional_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "conditional"


	public static class forInit_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forInit"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:249:1: forInit : ( commaList )? ';' -> ^( ForInit ( commaList )? ) ;
	public final PhpParser.forInit_return forInit() throws RecognitionException {
		PhpParser.forInit_return retval = new PhpParser.forInit_return();
		retval.start = input.LT(1);
		int forInit_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal139=null;
		ParserRuleReturnScope commaList138 =null;

		CommonTree char_literal139_tree=null;
		RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
		RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:250:5: ( ( commaList )? ';' -> ^( ForInit ( commaList )? ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:250:7: ( commaList )? ';'
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:250:7: ( commaList )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Ampersand||LA34_0==Array||LA34_0==Bang||LA34_0==Boolean||LA34_0==Clone||LA34_0==Dollar||LA34_0==DoubleQuotedString||LA34_0==HereDoc||LA34_0==IncrementOperator||LA34_0==Integer||LA34_0==Minus||LA34_0==New||LA34_0==OpenBrace||LA34_0==Real||LA34_0==SingleQuotedString||LA34_0==SuppressWarnings||LA34_0==Tilde||LA34_0==UnquotedString) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:250:7: commaList
					{
					pushFollow(FOLLOW_commaList_in_forInit2124);
					commaList138=commaList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commaList.add(commaList138.getTree());
					}
					break;

			}

			char_literal139=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forInit2127); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SemiColon.add(char_literal139);


			// AST REWRITE
			// elements: commaList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 250:22: -> ^( ForInit ( commaList )? )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:250:25: ^( ForInit ( commaList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForInit, "ForInit"), root_1);
				// com/github/gumtreediff/gen/antlr3/php/Php.g:250:35: ( commaList )?
				if ( stream_commaList.hasNext() ) {
					adaptor.addChild(root_1, stream_commaList.nextTree());
				}
				stream_commaList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, forInit_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forInit"


	public static class forCondition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forCondition"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:253:1: forCondition : ( commaList )? ';' -> ^( ForCondition ( commaList )? ) ;
	public final PhpParser.forCondition_return forCondition() throws RecognitionException {
		PhpParser.forCondition_return retval = new PhpParser.forCondition_return();
		retval.start = input.LT(1);
		int forCondition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal141=null;
		ParserRuleReturnScope commaList140 =null;

		CommonTree char_literal141_tree=null;
		RewriteRuleTokenStream stream_SemiColon=new RewriteRuleTokenStream(adaptor,"token SemiColon");
		RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:254:5: ( ( commaList )? ';' -> ^( ForCondition ( commaList )? ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:254:7: ( commaList )? ';'
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:254:7: ( commaList )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Ampersand||LA35_0==Array||LA35_0==Bang||LA35_0==Boolean||LA35_0==Clone||LA35_0==Dollar||LA35_0==DoubleQuotedString||LA35_0==HereDoc||LA35_0==IncrementOperator||LA35_0==Integer||LA35_0==Minus||LA35_0==New||LA35_0==OpenBrace||LA35_0==Real||LA35_0==SingleQuotedString||LA35_0==SuppressWarnings||LA35_0==Tilde||LA35_0==UnquotedString) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:254:7: commaList
					{
					pushFollow(FOLLOW_commaList_in_forCondition2153);
					commaList140=commaList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commaList.add(commaList140.getTree());
					}
					break;

			}

			char_literal141=(Token)match(input,SemiColon,FOLLOW_SemiColon_in_forCondition2156); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SemiColon.add(char_literal141);


			// AST REWRITE
			// elements: commaList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 254:22: -> ^( ForCondition ( commaList )? )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:254:25: ^( ForCondition ( commaList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForCondition, "ForCondition"), root_1);
				// com/github/gumtreediff/gen/antlr3/php/Php.g:254:40: ( commaList )?
				if ( stream_commaList.hasNext() ) {
					adaptor.addChild(root_1, stream_commaList.nextTree());
				}
				stream_commaList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, forCondition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forCondition"


	public static class forUpdate_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forUpdate"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:257:1: forUpdate : ( commaList )? -> ^( ForUpdate ( commaList )? ) ;
	public final PhpParser.forUpdate_return forUpdate() throws RecognitionException {
		PhpParser.forUpdate_return retval = new PhpParser.forUpdate_return();
		retval.start = input.LT(1);
		int forUpdate_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope commaList142 =null;

		RewriteRuleSubtreeStream stream_commaList=new RewriteRuleSubtreeStream(adaptor,"rule commaList");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:258:5: ( ( commaList )? -> ^( ForUpdate ( commaList )? ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:258:7: ( commaList )?
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:258:7: ( commaList )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==Ampersand||LA36_0==Array||LA36_0==Bang||LA36_0==Boolean||LA36_0==Clone||LA36_0==Dollar||LA36_0==DoubleQuotedString||LA36_0==HereDoc||LA36_0==IncrementOperator||LA36_0==Integer||LA36_0==Minus||LA36_0==New||LA36_0==OpenBrace||LA36_0==Real||LA36_0==SingleQuotedString||LA36_0==SuppressWarnings||LA36_0==Tilde||LA36_0==UnquotedString) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:258:7: commaList
					{
					pushFollow(FOLLOW_commaList_in_forUpdate2186);
					commaList142=commaList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commaList.add(commaList142.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: commaList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 258:18: -> ^( ForUpdate ( commaList )? )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:258:21: ^( ForUpdate ( commaList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ForUpdate, "ForUpdate"), root_1);
				// com/github/gumtreediff/gen/antlr3/php/Php.g:258:33: ( commaList )?
				if ( stream_commaList.hasNext() ) {
					adaptor.addChild(root_1, stream_commaList.nextTree());
				}
				stream_commaList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, forUpdate_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "forUpdate"


	public static class cases_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cases"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:261:1: cases : ( casestatement )* ( defaultcase )? ;
	public final PhpParser.cases_return cases() throws RecognitionException {
		PhpParser.cases_return retval = new PhpParser.cases_return();
		retval.start = input.LT(1);
		int cases_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope casestatement143 =null;
		ParserRuleReturnScope defaultcase144 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:262:5: ( ( casestatement )* ( defaultcase )? )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:262:7: ( casestatement )* ( defaultcase )?
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/github/gumtreediff/gen/antlr3/php/Php.g:262:7: ( casestatement )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==Case) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:262:7: casestatement
					{
					pushFollow(FOLLOW_casestatement_in_cases2214);
					casestatement143=casestatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, casestatement143.getTree());

					}
					break;

				default :
					break loop37;
				}
			}

			// com/github/gumtreediff/gen/antlr3/php/Php.g:262:23: ( defaultcase )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==Default) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:262:23: defaultcase
					{
					pushFollow(FOLLOW_defaultcase_in_cases2218);
					defaultcase144=defaultcase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, defaultcase144.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, cases_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "cases"


	public static class casestatement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "casestatement"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:265:1: casestatement : Case ^ expression ':' ! ( statement )* ;
	public final PhpParser.casestatement_return casestatement() throws RecognitionException {
		PhpParser.casestatement_return retval = new PhpParser.casestatement_return();
		retval.start = input.LT(1);
		int casestatement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Case145=null;
		Token char_literal147=null;
		ParserRuleReturnScope expression146 =null;
		ParserRuleReturnScope statement148 =null;

		CommonTree Case145_tree=null;
		CommonTree char_literal147_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:266:5: ( Case ^ expression ':' ! ( statement )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:266:7: Case ^ expression ':' ! ( statement )*
			{
			root_0 = (CommonTree)adaptor.nil();


			Case145=(Token)match(input,Case,FOLLOW_Case_in_casestatement2236); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Case145_tree = (CommonTree)adaptor.create(Case145);
			root_0 = (CommonTree)adaptor.becomeRoot(Case145_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_casestatement2239);
			expression146=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression146.getTree());

			char_literal147=(Token)match(input,Colon,FOLLOW_Colon_in_casestatement2241); if (state.failed) return retval;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:266:29: ( statement )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==Abstract||LA39_0==Ampersand||LA39_0==Array||LA39_0==Bang||(LA39_0 >= BodyString && LA39_0 <= Break)||LA39_0==Class||LA39_0==Clone||LA39_0==Continue||(LA39_0 >= Do && LA39_0 <= Dollar)||(LA39_0 >= DoubleQuotedString && LA39_0 <= Echo)||LA39_0==For||LA39_0==Foreach||(LA39_0 >= Function && LA39_0 <= HereDoc)||LA39_0==If||LA39_0==IncrementOperator||(LA39_0 >= Integer && LA39_0 <= Interface)||LA39_0==Minus||LA39_0==New||(LA39_0 >= OpenBrace && LA39_0 <= OpenCurlyBrace)||LA39_0==Real||(LA39_0 >= RequireOperator && LA39_0 <= Return)||LA39_0==SingleQuotedString||(LA39_0 >= Static && LA39_0 <= Tilde)||LA39_0==UnquotedString||LA39_0==While) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:266:29: statement
					{
					pushFollow(FOLLOW_statement_in_casestatement2244);
					statement148=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement148.getTree());

					}
					break;

				default :
					break loop39;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, casestatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "casestatement"


	public static class defaultcase_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "defaultcase"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:269:1: defaultcase : ( Default ^ ':' ! ( statement )* ) ;
	public final PhpParser.defaultcase_return defaultcase() throws RecognitionException {
		PhpParser.defaultcase_return retval = new PhpParser.defaultcase_return();
		retval.start = input.LT(1);
		int defaultcase_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Default149=null;
		Token char_literal150=null;
		ParserRuleReturnScope statement151 =null;

		CommonTree Default149_tree=null;
		CommonTree char_literal150_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:270:5: ( ( Default ^ ':' ! ( statement )* ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:270:7: ( Default ^ ':' ! ( statement )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/github/gumtreediff/gen/antlr3/php/Php.g:270:7: ( Default ^ ':' ! ( statement )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:270:8: Default ^ ':' ! ( statement )*
			{
			Default149=(Token)match(input,Default,FOLLOW_Default_in_defaultcase2264); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Default149_tree = (CommonTree)adaptor.create(Default149);
			root_0 = (CommonTree)adaptor.becomeRoot(Default149_tree, root_0);
			}

			char_literal150=(Token)match(input,Colon,FOLLOW_Colon_in_defaultcase2267); if (state.failed) return retval;
			// com/github/gumtreediff/gen/antlr3/php/Php.g:270:22: ( statement )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==Abstract||LA40_0==Ampersand||LA40_0==Array||LA40_0==Bang||(LA40_0 >= BodyString && LA40_0 <= Break)||LA40_0==Class||LA40_0==Clone||LA40_0==Continue||(LA40_0 >= Do && LA40_0 <= Dollar)||(LA40_0 >= DoubleQuotedString && LA40_0 <= Echo)||LA40_0==For||LA40_0==Foreach||(LA40_0 >= Function && LA40_0 <= HereDoc)||LA40_0==If||LA40_0==IncrementOperator||(LA40_0 >= Integer && LA40_0 <= Interface)||LA40_0==Minus||LA40_0==New||(LA40_0 >= OpenBrace && LA40_0 <= OpenCurlyBrace)||LA40_0==Real||(LA40_0 >= RequireOperator && LA40_0 <= Return)||LA40_0==SingleQuotedString||(LA40_0 >= Static && LA40_0 <= Tilde)||LA40_0==UnquotedString||LA40_0==While) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:270:22: statement
					{
					pushFollow(FOLLOW_statement_in_defaultcase2270);
					statement151=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement151.getTree());

					}
					break;

				default :
					break loop40;
				}
			}

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, defaultcase_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "defaultcase"


	public static class functionDefinition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functionDefinition"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:273:1: functionDefinition : Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) ;
	public final PhpParser.functionDefinition_return functionDefinition() throws RecognitionException {
		PhpParser.functionDefinition_return retval = new PhpParser.functionDefinition_return();
		retval.start = input.LT(1);
		int functionDefinition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Function152=null;
		Token UnquotedString153=null;
		ParserRuleReturnScope parametersDefinition154 =null;
		ParserRuleReturnScope bracketedBlock155 =null;

		CommonTree Function152_tree=null;
		CommonTree UnquotedString153_tree=null;
		RewriteRuleTokenStream stream_Function=new RewriteRuleTokenStream(adaptor,"token Function");
		RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
		RewriteRuleSubtreeStream stream_bracketedBlock=new RewriteRuleSubtreeStream(adaptor,"rule bracketedBlock");
		RewriteRuleSubtreeStream stream_parametersDefinition=new RewriteRuleSubtreeStream(adaptor,"rule parametersDefinition");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:274:5: ( Function UnquotedString parametersDefinition bracketedBlock -> ^( Function UnquotedString parametersDefinition bracketedBlock ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:274:7: Function UnquotedString parametersDefinition bracketedBlock
			{
			Function152=(Token)match(input,Function,FOLLOW_Function_in_functionDefinition2289); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Function.add(Function152);

			UnquotedString153=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_functionDefinition2291); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString153);

			pushFollow(FOLLOW_parametersDefinition_in_functionDefinition2293);
			parametersDefinition154=parametersDefinition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_parametersDefinition.add(parametersDefinition154.getTree());
			pushFollow(FOLLOW_bracketedBlock_in_functionDefinition2295);
			bracketedBlock155=bracketedBlock();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_bracketedBlock.add(bracketedBlock155.getTree());

			// AST REWRITE
			// elements: UnquotedString, bracketedBlock, Function, parametersDefinition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 274:67: -> ^( Function UnquotedString parametersDefinition bracketedBlock )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:275:9: ^( Function UnquotedString parametersDefinition bracketedBlock )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_Function.nextNode(), root_1);
				adaptor.addChild(root_1, stream_UnquotedString.nextNode());
				adaptor.addChild(root_1, stream_parametersDefinition.nextTree());
				adaptor.addChild(root_1, stream_bracketedBlock.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, functionDefinition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "functionDefinition"


	public static class parametersDefinition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parametersDefinition"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:278:1: parametersDefinition : OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace -> ^( Params ( paramDef )* ) ;
	public final PhpParser.parametersDefinition_return parametersDefinition() throws RecognitionException {
		PhpParser.parametersDefinition_return retval = new PhpParser.parametersDefinition_return();
		retval.start = input.LT(1);
		int parametersDefinition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OpenBrace156=null;
		Token Comma158=null;
		Token CloseBrace160=null;
		ParserRuleReturnScope paramDef157 =null;
		ParserRuleReturnScope paramDef159 =null;

		CommonTree OpenBrace156_tree=null;
		CommonTree Comma158_tree=null;
		CommonTree CloseBrace160_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
		RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
		RewriteRuleSubtreeStream stream_paramDef=new RewriteRuleSubtreeStream(adaptor,"rule paramDef");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:279:5: ( OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace -> ^( Params ( paramDef )* ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:279:7: OpenBrace ( paramDef ( Comma paramDef )* )? CloseBrace
			{
			OpenBrace156=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_parametersDefinition2333); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace156);

			// com/github/gumtreediff/gen/antlr3/php/Php.g:279:17: ( paramDef ( Comma paramDef )* )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Ampersand||LA42_0==Dollar) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:279:18: paramDef ( Comma paramDef )*
					{
					pushFollow(FOLLOW_paramDef_in_parametersDefinition2336);
					paramDef157=paramDef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramDef.add(paramDef157.getTree());
					// com/github/gumtreediff/gen/antlr3/php/Php.g:279:27: ( Comma paramDef )*
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==Comma) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:279:28: Comma paramDef
							{
							Comma158=(Token)match(input,Comma,FOLLOW_Comma_in_parametersDefinition2339); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Comma.add(Comma158);

							pushFollow(FOLLOW_paramDef_in_parametersDefinition2341);
							paramDef159=paramDef();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_paramDef.add(paramDef159.getTree());
							}
							break;

						default :
							break loop41;
						}
					}

					}
					break;

			}

			CloseBrace160=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_parametersDefinition2347); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace160);


			// AST REWRITE
			// elements: paramDef
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 279:58: -> ^( Params ( paramDef )* )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:279:61: ^( Params ( paramDef )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Params, "Params"), root_1);
				// com/github/gumtreediff/gen/antlr3/php/Php.g:279:70: ( paramDef )*
				while ( stream_paramDef.hasNext() ) {
					adaptor.addChild(root_1, stream_paramDef.nextTree());
				}
				stream_paramDef.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, parametersDefinition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "parametersDefinition"


	public static class paramDef_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "paramDef"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:282:1: paramDef : paramName ( Equals ^ atom )? ;
	public final PhpParser.paramDef_return paramDef() throws RecognitionException {
		PhpParser.paramDef_return retval = new PhpParser.paramDef_return();
		retval.start = input.LT(1);
		int paramDef_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Equals162=null;
		ParserRuleReturnScope paramName161 =null;
		ParserRuleReturnScope atom163 =null;

		CommonTree Equals162_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:283:5: ( paramName ( Equals ^ atom )? )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:283:7: paramName ( Equals ^ atom )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_paramName_in_paramDef2374);
			paramName161=paramName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, paramName161.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:283:17: ( Equals ^ atom )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Equals) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:283:18: Equals ^ atom
					{
					Equals162=(Token)match(input,Equals,FOLLOW_Equals_in_paramDef2377); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Equals162_tree = (CommonTree)adaptor.create(Equals162);
					root_0 = (CommonTree)adaptor.becomeRoot(Equals162_tree, root_0);
					}

					pushFollow(FOLLOW_atom_in_paramDef2380);
					atom163=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom163.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, paramDef_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramDef"


	public static class paramName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "paramName"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:286:1: paramName : ( Dollar ^ UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) );
	public final PhpParser.paramName_return paramName() throws RecognitionException {
		PhpParser.paramName_return retval = new PhpParser.paramName_return();
		retval.start = input.LT(1);
		int paramName_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Dollar164=null;
		Token UnquotedString165=null;
		Token Ampersand166=null;
		Token Dollar167=null;
		Token UnquotedString168=null;

		CommonTree Dollar164_tree=null;
		CommonTree UnquotedString165_tree=null;
		CommonTree Ampersand166_tree=null;
		CommonTree Dollar167_tree=null;
		CommonTree UnquotedString168_tree=null;
		RewriteRuleTokenStream stream_Dollar=new RewriteRuleTokenStream(adaptor,"token Dollar");
		RewriteRuleTokenStream stream_UnquotedString=new RewriteRuleTokenStream(adaptor,"token UnquotedString");
		RewriteRuleTokenStream stream_Ampersand=new RewriteRuleTokenStream(adaptor,"token Ampersand");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:287:5: ( Dollar ^ UnquotedString | Ampersand Dollar UnquotedString -> ^( Ampersand ^( Dollar UnquotedString ) ) )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==Dollar) ) {
				alt44=1;
			}
			else if ( (LA44_0==Ampersand) ) {
				alt44=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:287:7: Dollar ^ UnquotedString
					{
					root_0 = (CommonTree)adaptor.nil();


					Dollar164=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2399); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Dollar164_tree = (CommonTree)adaptor.create(Dollar164);
					root_0 = (CommonTree)adaptor.becomeRoot(Dollar164_tree, root_0);
					}

					UnquotedString165=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2402); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString165_tree = (CommonTree)adaptor.create(UnquotedString165);
					adaptor.addChild(root_0, UnquotedString165_tree);
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:288:7: Ampersand Dollar UnquotedString
					{
					Ampersand166=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_paramName2410); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Ampersand.add(Ampersand166);

					Dollar167=(Token)match(input,Dollar,FOLLOW_Dollar_in_paramName2412); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Dollar.add(Dollar167);

					UnquotedString168=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_paramName2414); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UnquotedString.add(UnquotedString168);


					// AST REWRITE
					// elements: Ampersand, UnquotedString, Dollar
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 288:39: -> ^( Ampersand ^( Dollar UnquotedString ) )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:288:42: ^( Ampersand ^( Dollar UnquotedString ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_Ampersand.nextNode(), root_1);
						// com/github/gumtreediff/gen/antlr3/php/Php.g:288:54: ^( Dollar UnquotedString )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot(stream_Dollar.nextNode(), root_2);
						adaptor.addChild(root_2, stream_UnquotedString.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, paramName_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "paramName"


	public static class commaList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "commaList"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:291:1: commaList : expression ( ',' ! expression )* ;
	public final PhpParser.commaList_return commaList() throws RecognitionException {
		PhpParser.commaList_return retval = new PhpParser.commaList_return();
		retval.start = input.LT(1);
		int commaList_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal170=null;
		ParserRuleReturnScope expression169 =null;
		ParserRuleReturnScope expression171 =null;

		CommonTree char_literal170_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:292:5: ( expression ( ',' ! expression )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:292:7: expression ( ',' ! expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_expression_in_commaList2443);
			expression169=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression169.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:292:18: ( ',' ! expression )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==Comma) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:292:19: ',' ! expression
					{
					char_literal170=(Token)match(input,Comma,FOLLOW_Comma_in_commaList2446); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_commaList2449);
					expression171=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression171.getTree());

					}
					break;

				default :
					break loop45;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, commaList_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "commaList"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:295:1: expression : weakLogicalOr ;
	public final PhpParser.expression_return expression() throws RecognitionException {
		PhpParser.expression_return retval = new PhpParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope weakLogicalOr172 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:296:5: ( weakLogicalOr )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:296:7: weakLogicalOr
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_weakLogicalOr_in_expression2473);
			weakLogicalOr172=weakLogicalOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalOr172.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class weakLogicalOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "weakLogicalOr"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:299:1: weakLogicalOr : weakLogicalXor ( Or ^ weakLogicalXor )* ;
	public final PhpParser.weakLogicalOr_return weakLogicalOr() throws RecognitionException {
		PhpParser.weakLogicalOr_return retval = new PhpParser.weakLogicalOr_return();
		retval.start = input.LT(1);
		int weakLogicalOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Or174=null;
		ParserRuleReturnScope weakLogicalXor173 =null;
		ParserRuleReturnScope weakLogicalXor175 =null;

		CommonTree Or174_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:300:5: ( weakLogicalXor ( Or ^ weakLogicalXor )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:300:7: weakLogicalXor ( Or ^ weakLogicalXor )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2490);
			weakLogicalXor173=weakLogicalXor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalXor173.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:300:22: ( Or ^ weakLogicalXor )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==Or) ) {
					int LA46_10 = input.LA(2);
					if ( (synpred67_Php()) ) {
						alt46=1;
					}

				}

				switch (alt46) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:300:23: Or ^ weakLogicalXor
					{
					Or174=(Token)match(input,Or,FOLLOW_Or_in_weakLogicalOr2493); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Or174_tree = (CommonTree)adaptor.create(Or174);
					root_0 = (CommonTree)adaptor.becomeRoot(Or174_tree, root_0);
					}

					pushFollow(FOLLOW_weakLogicalXor_in_weakLogicalOr2496);
					weakLogicalXor175=weakLogicalXor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalXor175.getTree());

					}
					break;

				default :
					break loop46;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, weakLogicalOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "weakLogicalOr"


	public static class weakLogicalXor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "weakLogicalXor"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:303:1: weakLogicalXor : weakLogicalAnd ( Xor ^ weakLogicalAnd )* ;
	public final PhpParser.weakLogicalXor_return weakLogicalXor() throws RecognitionException {
		PhpParser.weakLogicalXor_return retval = new PhpParser.weakLogicalXor_return();
		retval.start = input.LT(1);
		int weakLogicalXor_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Xor177=null;
		ParserRuleReturnScope weakLogicalAnd176 =null;
		ParserRuleReturnScope weakLogicalAnd178 =null;

		CommonTree Xor177_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:304:5: ( weakLogicalAnd ( Xor ^ weakLogicalAnd )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:304:7: weakLogicalAnd ( Xor ^ weakLogicalAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2515);
			weakLogicalAnd176=weakLogicalAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd176.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:304:22: ( Xor ^ weakLogicalAnd )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==Xor) ) {
					int LA47_10 = input.LA(2);
					if ( (synpred68_Php()) ) {
						alt47=1;
					}

				}

				switch (alt47) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:304:23: Xor ^ weakLogicalAnd
					{
					Xor177=(Token)match(input,Xor,FOLLOW_Xor_in_weakLogicalXor2518); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Xor177_tree = (CommonTree)adaptor.create(Xor177);
					root_0 = (CommonTree)adaptor.becomeRoot(Xor177_tree, root_0);
					}

					pushFollow(FOLLOW_weakLogicalAnd_in_weakLogicalXor2521);
					weakLogicalAnd178=weakLogicalAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd178.getTree());

					}
					break;

				default :
					break loop47;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, weakLogicalXor_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "weakLogicalXor"


	public static class weakLogicalAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "weakLogicalAnd"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:307:1: weakLogicalAnd : assignment ( And ^ assignment )* ;
	public final PhpParser.weakLogicalAnd_return weakLogicalAnd() throws RecognitionException {
		PhpParser.weakLogicalAnd_return retval = new PhpParser.weakLogicalAnd_return();
		retval.start = input.LT(1);
		int weakLogicalAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token And180=null;
		ParserRuleReturnScope assignment179 =null;
		ParserRuleReturnScope assignment181 =null;

		CommonTree And180_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:308:5: ( assignment ( And ^ assignment )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:308:7: assignment ( And ^ assignment )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_in_weakLogicalAnd2544);
			assignment179=assignment();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment179.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:308:18: ( And ^ assignment )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==And) ) {
					int LA48_10 = input.LA(2);
					if ( (synpred69_Php()) ) {
						alt48=1;
					}

				}

				switch (alt48) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:308:19: And ^ assignment
					{
					And180=(Token)match(input,And,FOLLOW_And_in_weakLogicalAnd2547); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					And180_tree = (CommonTree)adaptor.create(And180);
					root_0 = (CommonTree)adaptor.becomeRoot(And180_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_in_weakLogicalAnd2550);
					assignment181=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment181.getTree());

					}
					break;

				default :
					break loop48;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, weakLogicalAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "weakLogicalAnd"


	public static class assignment_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:311:1: assignment : ( name ( ( Equals | AsignmentOperator ) ^ assignment ) | ternary );
	public final PhpParser.assignment_return assignment() throws RecognitionException {
		PhpParser.assignment_return retval = new PhpParser.assignment_return();
		retval.start = input.LT(1);
		int assignment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set183=null;
		ParserRuleReturnScope name182 =null;
		ParserRuleReturnScope assignment184 =null;
		ParserRuleReturnScope ternary185 =null;

		CommonTree set183_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:312:5: ( name ( ( Equals | AsignmentOperator ) ^ assignment ) | ternary )
			int alt49=2;
			switch ( input.LA(1) ) {
			case UnquotedString:
				{
				switch ( input.LA(2) ) {
				case ClassMember:
					{
					int LA49_17 = input.LA(3);
					if ( (synpred71_Php()) ) {
						alt49=1;
					}
					else if ( (true) ) {
						alt49=2;
					}

					}
					break;
				case OpenSquareBrace:
					{
					int LA49_18 = input.LA(3);
					if ( (synpred71_Php()) ) {
						alt49=1;
					}
					else if ( (true) ) {
						alt49=2;
					}

					}
					break;
				case InstanceMember:
					{
					int LA49_19 = input.LA(3);
					if ( (synpred71_Php()) ) {
						alt49=1;
					}
					else if ( (true) ) {
						alt49=2;
					}

					}
					break;
				case AsignmentOperator:
				case Equals:
					{
					alt49=1;
					}
					break;
				case EOF:
				case Ampersand:
				case And:
				case ArrayAssign:
				case Asterisk:
				case BodyString:
				case CloseBrace:
				case CloseSquareBrace:
				case Colon:
				case Comma:
				case ComparisionOperator:
				case Dot:
				case EqualityOperator:
				case Forwardslash:
				case IncrementOperator:
				case Instanceof:
				case LogicalAnd:
				case LogicalOr:
				case Minus:
				case OpenBrace:
				case Or:
				case Percent:
				case Pipe:
				case Plus:
				case QuestionMark:
				case SemiColon:
				case ShiftOperator:
				case Xor:
				case 112:
					{
					alt49=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Dollar:
				{
				int LA49_2 = input.LA(2);
				if ( (LA49_2==Dollar) ) {
					int LA49_46 = input.LA(3);
					if ( (synpred71_Php()) ) {
						alt49=1;
					}
					else if ( (true) ) {
						alt49=2;
					}

				}
				else if ( (LA49_2==UnquotedString) ) {
					int LA49_47 = input.LA(3);
					if ( (synpred71_Php()) ) {
						alt49=1;
					}
					else if ( (true) ) {
						alt49=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Ampersand:
			case Array:
			case Bang:
			case Boolean:
			case Clone:
			case DoubleQuotedString:
			case HereDoc:
			case IncrementOperator:
			case Integer:
			case Minus:
			case New:
			case OpenBrace:
			case Real:
			case SingleQuotedString:
			case SuppressWarnings:
			case Tilde:
				{
				alt49=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:312:7: name ( ( Equals | AsignmentOperator ) ^ assignment )
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_name_in_assignment2569);
					name182=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, name182.getTree());

					// com/github/gumtreediff/gen/antlr3/php/Php.g:312:12: ( ( Equals | AsignmentOperator ) ^ assignment )
					// com/github/gumtreediff/gen/antlr3/php/Php.g:312:13: ( Equals | AsignmentOperator ) ^ assignment
					{
					set183=input.LT(1);
					set183=input.LT(1);
					if ( input.LA(1)==AsignmentOperator||input.LA(1)==Equals ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set183), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_assignment_in_assignment2581);
					assignment184=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment184.getTree());

					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:313:7: ternary
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ternary_in_assignment2590);
					ternary185=ternary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ternary185.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, assignment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ternary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ternary"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:316:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );
	public final PhpParser.ternary_return ternary() throws RecognitionException {
		PhpParser.ternary_return retval = new PhpParser.ternary_return();
		retval.start = input.LT(1);
		int ternary_StartIndex = input.index();

		CommonTree root_0 = null;

		Token QuestionMark187=null;
		Token Colon189=null;
		ParserRuleReturnScope logicalOr186 =null;
		ParserRuleReturnScope expression188 =null;
		ParserRuleReturnScope expression190 =null;
		ParserRuleReturnScope logicalOr191 =null;

		CommonTree QuestionMark187_tree=null;
		CommonTree Colon189_tree=null;
		RewriteRuleTokenStream stream_QuestionMark=new RewriteRuleTokenStream(adaptor,"token QuestionMark");
		RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_logicalOr=new RewriteRuleSubtreeStream(adaptor,"rule logicalOr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:317:5: ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr )
			int alt50=2;
			alt50 = dfa50.predict(input);
			switch (alt50) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:317:7: logicalOr QuestionMark expression Colon expression
					{
					pushFollow(FOLLOW_logicalOr_in_ternary2607);
					logicalOr186=logicalOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalOr.add(logicalOr186.getTree());
					QuestionMark187=(Token)match(input,QuestionMark,FOLLOW_QuestionMark_in_ternary2609); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QuestionMark.add(QuestionMark187);

					pushFollow(FOLLOW_expression_in_ternary2611);
					expression188=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression188.getTree());
					Colon189=(Token)match(input,Colon,FOLLOW_Colon_in_ternary2613); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Colon.add(Colon189);

					pushFollow(FOLLOW_expression_in_ternary2615);
					expression190=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression190.getTree());

					// AST REWRITE
					// elements: logicalOr, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 317:58: -> ^( IfExpression logicalOr ( expression )* )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:317:61: ^( IfExpression logicalOr ( expression )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IfExpression, "IfExpression"), root_1);
						adaptor.addChild(root_1, stream_logicalOr.nextTree());
						// com/github/gumtreediff/gen/antlr3/php/Php.g:317:86: ( expression )*
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:318:7: logicalOr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_logicalOr_in_ternary2634);
					logicalOr191=logicalOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOr191.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, ternary_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "ternary"


	public static class logicalOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalOr"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:321:1: logicalOr : logicalAnd ( LogicalOr ^ logicalAnd )* ;
	public final PhpParser.logicalOr_return logicalOr() throws RecognitionException {
		PhpParser.logicalOr_return retval = new PhpParser.logicalOr_return();
		retval.start = input.LT(1);
		int logicalOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LogicalOr193=null;
		ParserRuleReturnScope logicalAnd192 =null;
		ParserRuleReturnScope logicalAnd194 =null;

		CommonTree LogicalOr193_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:322:5: ( logicalAnd ( LogicalOr ^ logicalAnd )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:322:7: logicalAnd ( LogicalOr ^ logicalAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalAnd_in_logicalOr2655);
			logicalAnd192=logicalAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd192.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:322:18: ( LogicalOr ^ logicalAnd )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==LogicalOr) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:322:19: LogicalOr ^ logicalAnd
					{
					LogicalOr193=(Token)match(input,LogicalOr,FOLLOW_LogicalOr_in_logicalOr2658); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LogicalOr193_tree = (CommonTree)adaptor.create(LogicalOr193);
					root_0 = (CommonTree)adaptor.becomeRoot(LogicalOr193_tree, root_0);
					}

					pushFollow(FOLLOW_logicalAnd_in_logicalOr2661);
					logicalAnd194=logicalAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalAnd194.getTree());

					}
					break;

				default :
					break loop51;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, logicalOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalOr"


	public static class logicalAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalAnd"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:325:1: logicalAnd : bitwiseOr ( LogicalAnd ^ bitwiseOr )* ;
	public final PhpParser.logicalAnd_return logicalAnd() throws RecognitionException {
		PhpParser.logicalAnd_return retval = new PhpParser.logicalAnd_return();
		retval.start = input.LT(1);
		int logicalAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token LogicalAnd196=null;
		ParserRuleReturnScope bitwiseOr195 =null;
		ParserRuleReturnScope bitwiseOr197 =null;

		CommonTree LogicalAnd196_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:326:5: ( bitwiseOr ( LogicalAnd ^ bitwiseOr )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:326:7: bitwiseOr ( LogicalAnd ^ bitwiseOr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2680);
			bitwiseOr195=bitwiseOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr195.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:326:17: ( LogicalAnd ^ bitwiseOr )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==LogicalAnd) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:326:18: LogicalAnd ^ bitwiseOr
					{
					LogicalAnd196=(Token)match(input,LogicalAnd,FOLLOW_LogicalAnd_in_logicalAnd2683); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LogicalAnd196_tree = (CommonTree)adaptor.create(LogicalAnd196);
					root_0 = (CommonTree)adaptor.becomeRoot(LogicalAnd196_tree, root_0);
					}

					pushFollow(FOLLOW_bitwiseOr_in_logicalAnd2686);
					bitwiseOr197=bitwiseOr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitwiseOr197.getTree());

					}
					break;

				default :
					break loop52;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, logicalAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalAnd"


	public static class bitwiseOr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bitwiseOr"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:329:1: bitwiseOr : bitWiseAnd ( Pipe ^ bitWiseAnd )* ;
	public final PhpParser.bitwiseOr_return bitwiseOr() throws RecognitionException {
		PhpParser.bitwiseOr_return retval = new PhpParser.bitwiseOr_return();
		retval.start = input.LT(1);
		int bitwiseOr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Pipe199=null;
		ParserRuleReturnScope bitWiseAnd198 =null;
		ParserRuleReturnScope bitWiseAnd200 =null;

		CommonTree Pipe199_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:330:5: ( bitWiseAnd ( Pipe ^ bitWiseAnd )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:330:7: bitWiseAnd ( Pipe ^ bitWiseAnd )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2709);
			bitWiseAnd198=bitWiseAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd198.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:330:18: ( Pipe ^ bitWiseAnd )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==Pipe) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:330:19: Pipe ^ bitWiseAnd
					{
					Pipe199=(Token)match(input,Pipe,FOLLOW_Pipe_in_bitwiseOr2712); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Pipe199_tree = (CommonTree)adaptor.create(Pipe199);
					root_0 = (CommonTree)adaptor.becomeRoot(Pipe199_tree, root_0);
					}

					pushFollow(FOLLOW_bitWiseAnd_in_bitwiseOr2715);
					bitWiseAnd200=bitWiseAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseAnd200.getTree());

					}
					break;

				default :
					break loop53;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, bitwiseOr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitwiseOr"


	public static class bitWiseAnd_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bitWiseAnd"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:333:1: bitWiseAnd : equalityCheck ( Ampersand ^ equalityCheck )* ;
	public final PhpParser.bitWiseAnd_return bitWiseAnd() throws RecognitionException {
		PhpParser.bitWiseAnd_return retval = new PhpParser.bitWiseAnd_return();
		retval.start = input.LT(1);
		int bitWiseAnd_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Ampersand202=null;
		ParserRuleReturnScope equalityCheck201 =null;
		ParserRuleReturnScope equalityCheck203 =null;

		CommonTree Ampersand202_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:334:5: ( equalityCheck ( Ampersand ^ equalityCheck )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:334:7: equalityCheck ( Ampersand ^ equalityCheck )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2734);
			equalityCheck201=equalityCheck();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck201.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:334:21: ( Ampersand ^ equalityCheck )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==Ampersand) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:334:22: Ampersand ^ equalityCheck
					{
					Ampersand202=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_bitWiseAnd2737); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Ampersand202_tree = (CommonTree)adaptor.create(Ampersand202);
					root_0 = (CommonTree)adaptor.becomeRoot(Ampersand202_tree, root_0);
					}

					pushFollow(FOLLOW_equalityCheck_in_bitWiseAnd2740);
					equalityCheck203=equalityCheck();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityCheck203.getTree());

					}
					break;

				default :
					break loop54;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, bitWiseAnd_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitWiseAnd"


	public static class equalityCheck_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equalityCheck"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:337:1: equalityCheck : comparisionCheck ( EqualityOperator ^ comparisionCheck )? ;
	public final PhpParser.equalityCheck_return equalityCheck() throws RecognitionException {
		PhpParser.equalityCheck_return retval = new PhpParser.equalityCheck_return();
		retval.start = input.LT(1);
		int equalityCheck_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EqualityOperator205=null;
		ParserRuleReturnScope comparisionCheck204 =null;
		ParserRuleReturnScope comparisionCheck206 =null;

		CommonTree EqualityOperator205_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:338:5: ( comparisionCheck ( EqualityOperator ^ comparisionCheck )? )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:338:7: comparisionCheck ( EqualityOperator ^ comparisionCheck )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2759);
			comparisionCheck204=comparisionCheck();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck204.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:338:24: ( EqualityOperator ^ comparisionCheck )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==EqualityOperator) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:338:25: EqualityOperator ^ comparisionCheck
					{
					EqualityOperator205=(Token)match(input,EqualityOperator,FOLLOW_EqualityOperator_in_equalityCheck2762); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EqualityOperator205_tree = (CommonTree)adaptor.create(EqualityOperator205);
					root_0 = (CommonTree)adaptor.becomeRoot(EqualityOperator205_tree, root_0);
					}

					pushFollow(FOLLOW_comparisionCheck_in_equalityCheck2765);
					comparisionCheck206=comparisionCheck();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparisionCheck206.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, equalityCheck_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "equalityCheck"


	public static class comparisionCheck_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comparisionCheck"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:341:1: comparisionCheck : bitWiseShift ( ComparisionOperator ^ bitWiseShift )? ;
	public final PhpParser.comparisionCheck_return comparisionCheck() throws RecognitionException {
		PhpParser.comparisionCheck_return retval = new PhpParser.comparisionCheck_return();
		retval.start = input.LT(1);
		int comparisionCheck_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ComparisionOperator208=null;
		ParserRuleReturnScope bitWiseShift207 =null;
		ParserRuleReturnScope bitWiseShift209 =null;

		CommonTree ComparisionOperator208_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:342:5: ( bitWiseShift ( ComparisionOperator ^ bitWiseShift )? )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:342:7: bitWiseShift ( ComparisionOperator ^ bitWiseShift )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2788);
			bitWiseShift207=bitWiseShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift207.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:342:20: ( ComparisionOperator ^ bitWiseShift )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==ComparisionOperator) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:342:21: ComparisionOperator ^ bitWiseShift
					{
					ComparisionOperator208=(Token)match(input,ComparisionOperator,FOLLOW_ComparisionOperator_in_comparisionCheck2791); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ComparisionOperator208_tree = (CommonTree)adaptor.create(ComparisionOperator208);
					root_0 = (CommonTree)adaptor.becomeRoot(ComparisionOperator208_tree, root_0);
					}

					pushFollow(FOLLOW_bitWiseShift_in_comparisionCheck2794);
					bitWiseShift209=bitWiseShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bitWiseShift209.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, comparisionCheck_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comparisionCheck"


	public static class bitWiseShift_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bitWiseShift"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:345:1: bitWiseShift : addition ( ShiftOperator ^ addition )* ;
	public final PhpParser.bitWiseShift_return bitWiseShift() throws RecognitionException {
		PhpParser.bitWiseShift_return retval = new PhpParser.bitWiseShift_return();
		retval.start = input.LT(1);
		int bitWiseShift_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ShiftOperator211=null;
		ParserRuleReturnScope addition210 =null;
		ParserRuleReturnScope addition212 =null;

		CommonTree ShiftOperator211_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:346:5: ( addition ( ShiftOperator ^ addition )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:346:7: addition ( ShiftOperator ^ addition )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_addition_in_bitWiseShift2813);
			addition210=addition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, addition210.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:346:16: ( ShiftOperator ^ addition )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==ShiftOperator) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:346:17: ShiftOperator ^ addition
					{
					ShiftOperator211=(Token)match(input,ShiftOperator,FOLLOW_ShiftOperator_in_bitWiseShift2816); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ShiftOperator211_tree = (CommonTree)adaptor.create(ShiftOperator211);
					root_0 = (CommonTree)adaptor.becomeRoot(ShiftOperator211_tree, root_0);
					}

					pushFollow(FOLLOW_addition_in_bitWiseShift2819);
					addition212=addition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addition212.getTree());

					}
					break;

				default :
					break loop57;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, bitWiseShift_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bitWiseShift"


	public static class addition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "addition"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:349:1: addition : multiplication ( ( Plus | Minus | Dot ) ^ multiplication )* ;
	public final PhpParser.addition_return addition() throws RecognitionException {
		PhpParser.addition_return retval = new PhpParser.addition_return();
		retval.start = input.LT(1);
		int addition_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set214=null;
		ParserRuleReturnScope multiplication213 =null;
		ParserRuleReturnScope multiplication215 =null;

		CommonTree set214_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:350:5: ( multiplication ( ( Plus | Minus | Dot ) ^ multiplication )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:350:7: multiplication ( ( Plus | Minus | Dot ) ^ multiplication )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplication_in_addition2842);
			multiplication213=multiplication();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication213.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:350:22: ( ( Plus | Minus | Dot ) ^ multiplication )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==Dot||LA58_0==Minus||LA58_0==Plus) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:350:23: ( Plus | Minus | Dot ) ^ multiplication
					{
					set214=input.LT(1);
					set214=input.LT(1);
					if ( input.LA(1)==Dot||input.LA(1)==Minus||input.LA(1)==Plus ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set214), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplication_in_addition2858);
					multiplication215=multiplication();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplication215.getTree());

					}
					break;

				default :
					break loop58;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, addition_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "addition"


	public static class multiplication_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplication"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:353:1: multiplication : logicalNot ( ( Asterisk | Forwardslash | Percent ) ^ logicalNot )* ;
	public final PhpParser.multiplication_return multiplication() throws RecognitionException {
		PhpParser.multiplication_return retval = new PhpParser.multiplication_return();
		retval.start = input.LT(1);
		int multiplication_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set217=null;
		ParserRuleReturnScope logicalNot216 =null;
		ParserRuleReturnScope logicalNot218 =null;

		CommonTree set217_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:354:5: ( logicalNot ( ( Asterisk | Forwardslash | Percent ) ^ logicalNot )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:354:7: logicalNot ( ( Asterisk | Forwardslash | Percent ) ^ logicalNot )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logicalNot_in_multiplication2877);
			logicalNot216=logicalNot();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot216.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:354:18: ( ( Asterisk | Forwardslash | Percent ) ^ logicalNot )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==Asterisk||LA59_0==Forwardslash||LA59_0==Percent) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:354:19: ( Asterisk | Forwardslash | Percent ) ^ logicalNot
					{
					set217=input.LT(1);
					set217=input.LT(1);
					if ( input.LA(1)==Asterisk||input.LA(1)==Forwardslash||input.LA(1)==Percent ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set217), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_logicalNot_in_multiplication2893);
					logicalNot218=logicalNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot218.getTree());

					}
					break;

				default :
					break loop59;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, multiplication_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiplication"


	public static class logicalNot_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logicalNot"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:357:1: logicalNot : ( Bang ^ logicalNot | instanceOf );
	public final PhpParser.logicalNot_return logicalNot() throws RecognitionException {
		PhpParser.logicalNot_return retval = new PhpParser.logicalNot_return();
		retval.start = input.LT(1);
		int logicalNot_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Bang219=null;
		ParserRuleReturnScope logicalNot220 =null;
		ParserRuleReturnScope instanceOf221 =null;

		CommonTree Bang219_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:358:5: ( Bang ^ logicalNot | instanceOf )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==Bang) ) {
				alt60=1;
			}
			else if ( (LA60_0==Ampersand||LA60_0==Array||LA60_0==Boolean||LA60_0==Clone||LA60_0==Dollar||LA60_0==DoubleQuotedString||LA60_0==HereDoc||LA60_0==IncrementOperator||LA60_0==Integer||LA60_0==Minus||LA60_0==New||LA60_0==OpenBrace||LA60_0==Real||LA60_0==SingleQuotedString||LA60_0==SuppressWarnings||LA60_0==Tilde||LA60_0==UnquotedString) ) {
				alt60=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:358:7: Bang ^ logicalNot
					{
					root_0 = (CommonTree)adaptor.nil();


					Bang219=(Token)match(input,Bang,FOLLOW_Bang_in_logicalNot2912); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Bang219_tree = (CommonTree)adaptor.create(Bang219);
					root_0 = (CommonTree)adaptor.becomeRoot(Bang219_tree, root_0);
					}

					pushFollow(FOLLOW_logicalNot_in_logicalNot2915);
					logicalNot220=logicalNot();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalNot220.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:359:7: instanceOf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instanceOf_in_logicalNot2923);
					instanceOf221=instanceOf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOf221.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, logicalNot_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "logicalNot"


	public static class instanceOf_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instanceOf"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:362:1: instanceOf : negateOrCast ( Instanceof ^ negateOrCast )? ;
	public final PhpParser.instanceOf_return instanceOf() throws RecognitionException {
		PhpParser.instanceOf_return retval = new PhpParser.instanceOf_return();
		retval.start = input.LT(1);
		int instanceOf_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Instanceof223=null;
		ParserRuleReturnScope negateOrCast222 =null;
		ParserRuleReturnScope negateOrCast224 =null;

		CommonTree Instanceof223_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:363:5: ( negateOrCast ( Instanceof ^ negateOrCast )? )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:363:7: negateOrCast ( Instanceof ^ negateOrCast )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_negateOrCast_in_instanceOf2940);
			negateOrCast222=negateOrCast();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast222.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:363:20: ( Instanceof ^ negateOrCast )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==Instanceof) ) {
				alt61=1;
			}
			switch (alt61) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:363:21: Instanceof ^ negateOrCast
					{
					Instanceof223=(Token)match(input,Instanceof,FOLLOW_Instanceof_in_instanceOf2943); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Instanceof223_tree = (CommonTree)adaptor.create(Instanceof223);
					root_0 = (CommonTree)adaptor.becomeRoot(Instanceof223_tree, root_0);
					}

					pushFollow(FOLLOW_negateOrCast_in_instanceOf2946);
					negateOrCast224=negateOrCast();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, negateOrCast224.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, instanceOf_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "instanceOf"


	public static class negateOrCast_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "negateOrCast"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:366:1: negateOrCast : ( ( Tilde | Minus | SuppressWarnings ) ^ increment | OpenBrace PrimitiveType CloseBrace increment -> ^( Cast PrimitiveType increment ) | OpenBrace ! weakLogicalAnd CloseBrace !| increment );
	public final PhpParser.negateOrCast_return negateOrCast() throws RecognitionException {
		PhpParser.negateOrCast_return retval = new PhpParser.negateOrCast_return();
		retval.start = input.LT(1);
		int negateOrCast_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set225=null;
		Token OpenBrace227=null;
		Token PrimitiveType228=null;
		Token CloseBrace229=null;
		Token OpenBrace231=null;
		Token CloseBrace233=null;
		ParserRuleReturnScope increment226 =null;
		ParserRuleReturnScope increment230 =null;
		ParserRuleReturnScope weakLogicalAnd232 =null;
		ParserRuleReturnScope increment234 =null;

		CommonTree set225_tree=null;
		CommonTree OpenBrace227_tree=null;
		CommonTree PrimitiveType228_tree=null;
		CommonTree CloseBrace229_tree=null;
		CommonTree OpenBrace231_tree=null;
		CommonTree CloseBrace233_tree=null;
		RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
		RewriteRuleTokenStream stream_PrimitiveType=new RewriteRuleTokenStream(adaptor,"token PrimitiveType");
		RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
		RewriteRuleSubtreeStream stream_increment=new RewriteRuleSubtreeStream(adaptor,"rule increment");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:367:5: ( ( Tilde | Minus | SuppressWarnings ) ^ increment | OpenBrace PrimitiveType CloseBrace increment -> ^( Cast PrimitiveType increment ) | OpenBrace ! weakLogicalAnd CloseBrace !| increment )
			int alt62=4;
			switch ( input.LA(1) ) {
			case Minus:
			case SuppressWarnings:
			case Tilde:
				{
				alt62=1;
				}
				break;
			case OpenBrace:
				{
				int LA62_2 = input.LA(2);
				if ( (LA62_2==PrimitiveType) ) {
					alt62=2;
				}
				else if ( (LA62_2==Ampersand||LA62_2==Array||LA62_2==Bang||LA62_2==Boolean||LA62_2==Clone||LA62_2==Dollar||LA62_2==DoubleQuotedString||LA62_2==HereDoc||LA62_2==IncrementOperator||LA62_2==Integer||LA62_2==Minus||LA62_2==New||LA62_2==OpenBrace||LA62_2==Real||LA62_2==SingleQuotedString||LA62_2==SuppressWarnings||LA62_2==Tilde||LA62_2==UnquotedString) ) {
					alt62=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Ampersand:
			case Array:
			case Boolean:
			case Clone:
			case Dollar:
			case DoubleQuotedString:
			case HereDoc:
			case IncrementOperator:
			case Integer:
			case New:
			case Real:
			case SingleQuotedString:
			case UnquotedString:
				{
				alt62=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:367:7: ( Tilde | Minus | SuppressWarnings ) ^ increment
					{
					root_0 = (CommonTree)adaptor.nil();


					set225=input.LT(1);
					set225=input.LT(1);
					if ( input.LA(1)==Minus||input.LA(1)==SuppressWarnings||input.LA(1)==Tilde ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set225), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_increment_in_negateOrCast2978);
					increment226=increment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, increment226.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:368:7: OpenBrace PrimitiveType CloseBrace increment
					{
					OpenBrace227=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_negateOrCast2986); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace227);

					PrimitiveType228=(Token)match(input,PrimitiveType,FOLLOW_PrimitiveType_in_negateOrCast2988); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PrimitiveType.add(PrimitiveType228);

					CloseBrace229=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_negateOrCast2990); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace229);

					pushFollow(FOLLOW_increment_in_negateOrCast2992);
					increment230=increment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_increment.add(increment230.getTree());

					// AST REWRITE
					// elements: PrimitiveType, increment
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 368:52: -> ^( Cast PrimitiveType increment )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:368:55: ^( Cast PrimitiveType increment )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Cast, "Cast"), root_1);
						adaptor.addChild(root_1, stream_PrimitiveType.nextNode());
						adaptor.addChild(root_1, stream_increment.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:369:7: OpenBrace ! weakLogicalAnd CloseBrace !
					{
					root_0 = (CommonTree)adaptor.nil();


					OpenBrace231=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_negateOrCast3010); if (state.failed) return retval;
					pushFollow(FOLLOW_weakLogicalAnd_in_negateOrCast3013);
					weakLogicalAnd232=weakLogicalAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, weakLogicalAnd232.getTree());

					CloseBrace233=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_negateOrCast3015); if (state.failed) return retval;
					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:370:7: increment
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_increment_in_negateOrCast3024);
					increment234=increment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, increment234.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, negateOrCast_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "negateOrCast"


	public static class increment_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "increment"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:373:1: increment : ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone );
	public final PhpParser.increment_return increment() throws RecognitionException {
		PhpParser.increment_return retval = new PhpParser.increment_return();
		retval.start = input.LT(1);
		int increment_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IncrementOperator235=null;
		Token IncrementOperator238=null;
		ParserRuleReturnScope name236 =null;
		ParserRuleReturnScope name237 =null;
		ParserRuleReturnScope newOrClone239 =null;

		CommonTree IncrementOperator235_tree=null;
		CommonTree IncrementOperator238_tree=null;
		RewriteRuleTokenStream stream_IncrementOperator=new RewriteRuleTokenStream(adaptor,"token IncrementOperator");
		RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:374:5: ( IncrementOperator name -> ^( Prefix IncrementOperator name ) | name IncrementOperator -> ^( Postfix IncrementOperator name ) | newOrClone )
			int alt63=3;
			switch ( input.LA(1) ) {
			case IncrementOperator:
				{
				alt63=1;
				}
				break;
			case UnquotedString:
				{
				switch ( input.LA(2) ) {
				case ClassMember:
					{
					int LA63_14 = input.LA(3);
					if ( (synpred94_Php()) ) {
						alt63=2;
					}
					else if ( (true) ) {
						alt63=3;
					}

					}
					break;
				case OpenSquareBrace:
					{
					int LA63_15 = input.LA(3);
					if ( (synpred94_Php()) ) {
						alt63=2;
					}
					else if ( (true) ) {
						alt63=3;
					}

					}
					break;
				case InstanceMember:
					{
					int LA63_16 = input.LA(3);
					if ( (synpred94_Php()) ) {
						alt63=2;
					}
					else if ( (true) ) {
						alt63=3;
					}

					}
					break;
				case IncrementOperator:
					{
					alt63=2;
					}
					break;
				case EOF:
				case Ampersand:
				case And:
				case ArrayAssign:
				case Asterisk:
				case BodyString:
				case CloseBrace:
				case CloseSquareBrace:
				case Colon:
				case Comma:
				case ComparisionOperator:
				case Dot:
				case EqualityOperator:
				case Forwardslash:
				case Instanceof:
				case LogicalAnd:
				case LogicalOr:
				case Minus:
				case OpenBrace:
				case Or:
				case Percent:
				case Pipe:
				case Plus:
				case QuestionMark:
				case SemiColon:
				case ShiftOperator:
				case Xor:
				case 112:
					{
					alt63=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Dollar:
				{
				int LA63_3 = input.LA(2);
				if ( (LA63_3==Dollar) ) {
					int LA63_42 = input.LA(3);
					if ( (synpred94_Php()) ) {
						alt63=2;
					}
					else if ( (true) ) {
						alt63=3;
					}

				}
				else if ( (LA63_3==UnquotedString) ) {
					int LA63_43 = input.LA(3);
					if ( (synpred94_Php()) ) {
						alt63=2;
					}
					else if ( (true) ) {
						alt63=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 63, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Ampersand:
			case Array:
			case Boolean:
			case Clone:
			case DoubleQuotedString:
			case HereDoc:
			case Integer:
			case New:
			case Real:
			case SingleQuotedString:
				{
				alt63=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:374:7: IncrementOperator name
					{
					IncrementOperator235=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3041); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator235);

					pushFollow(FOLLOW_name_in_increment3043);
					name236=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_name.add(name236.getTree());

					// AST REWRITE
					// elements: name, IncrementOperator
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 374:30: -> ^( Prefix IncrementOperator name )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:374:33: ^( Prefix IncrementOperator name )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Prefix, "Prefix"), root_1);
						adaptor.addChild(root_1, stream_IncrementOperator.nextNode());
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:375:7: name IncrementOperator
					{
					pushFollow(FOLLOW_name_in_increment3061);
					name237=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_name.add(name237.getTree());
					IncrementOperator238=(Token)match(input,IncrementOperator,FOLLOW_IncrementOperator_in_increment3063); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IncrementOperator.add(IncrementOperator238);


					// AST REWRITE
					// elements: name, IncrementOperator
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 375:30: -> ^( Postfix IncrementOperator name )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:375:33: ^( Postfix IncrementOperator name )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Postfix, "Postfix"), root_1);
						adaptor.addChild(root_1, stream_IncrementOperator.nextNode());
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:376:7: newOrClone
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_newOrClone_in_increment3081);
					newOrClone239=newOrClone();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, newOrClone239.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, increment_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "increment"


	public static class newOrClone_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "newOrClone"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:379:1: newOrClone : ( New ^ nameOrFunctionCall | Clone ^ name | atomOrReference );
	public final PhpParser.newOrClone_return newOrClone() throws RecognitionException {
		PhpParser.newOrClone_return retval = new PhpParser.newOrClone_return();
		retval.start = input.LT(1);
		int newOrClone_StartIndex = input.index();

		CommonTree root_0 = null;

		Token New240=null;
		Token Clone242=null;
		ParserRuleReturnScope nameOrFunctionCall241 =null;
		ParserRuleReturnScope name243 =null;
		ParserRuleReturnScope atomOrReference244 =null;

		CommonTree New240_tree=null;
		CommonTree Clone242_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:380:5: ( New ^ nameOrFunctionCall | Clone ^ name | atomOrReference )
			int alt64=3;
			switch ( input.LA(1) ) {
			case New:
				{
				alt64=1;
				}
				break;
			case Clone:
				{
				alt64=2;
				}
				break;
			case Ampersand:
			case Array:
			case Boolean:
			case Dollar:
			case DoubleQuotedString:
			case HereDoc:
			case Integer:
			case Real:
			case SingleQuotedString:
			case UnquotedString:
				{
				alt64=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:380:7: New ^ nameOrFunctionCall
					{
					root_0 = (CommonTree)adaptor.nil();


					New240=(Token)match(input,New,FOLLOW_New_in_newOrClone3098); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					New240_tree = (CommonTree)adaptor.create(New240);
					root_0 = (CommonTree)adaptor.becomeRoot(New240_tree, root_0);
					}

					pushFollow(FOLLOW_nameOrFunctionCall_in_newOrClone3101);
					nameOrFunctionCall241=nameOrFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall241.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:381:7: Clone ^ name
					{
					root_0 = (CommonTree)adaptor.nil();


					Clone242=(Token)match(input,Clone,FOLLOW_Clone_in_newOrClone3109); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Clone242_tree = (CommonTree)adaptor.create(Clone242);
					root_0 = (CommonTree)adaptor.becomeRoot(Clone242_tree, root_0);
					}

					pushFollow(FOLLOW_name_in_newOrClone3112);
					name243=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, name243.getTree());

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:382:7: atomOrReference
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atomOrReference_in_newOrClone3120);
					atomOrReference244=atomOrReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atomOrReference244.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, newOrClone_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "newOrClone"


	public static class atomOrReference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomOrReference"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:385:1: atomOrReference : ( atom | reference );
	public final PhpParser.atomOrReference_return atomOrReference() throws RecognitionException {
		PhpParser.atomOrReference_return retval = new PhpParser.atomOrReference_return();
		retval.start = input.LT(1);
		int atomOrReference_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope atom245 =null;
		ParserRuleReturnScope reference246 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:386:5: ( atom | reference )
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==Array||LA65_0==Boolean||LA65_0==DoubleQuotedString||LA65_0==HereDoc||LA65_0==Integer||LA65_0==Real||LA65_0==SingleQuotedString) ) {
				alt65=1;
			}
			else if ( (LA65_0==Ampersand||LA65_0==Dollar||LA65_0==UnquotedString) ) {
				alt65=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:386:7: atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_atom_in_atomOrReference3137);
					atom245=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, atom245.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:387:7: reference
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_reference_in_atomOrReference3145);
					reference246=reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, reference246.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 47, atomOrReference_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atomOrReference"


	public static class arrayDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayDeclaration"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:390:1: arrayDeclaration : Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace -> ^( Array ( arrayEntry )* ) ;
	public final PhpParser.arrayDeclaration_return arrayDeclaration() throws RecognitionException {
		PhpParser.arrayDeclaration_return retval = new PhpParser.arrayDeclaration_return();
		retval.start = input.LT(1);
		int arrayDeclaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Array247=null;
		Token OpenBrace248=null;
		Token Comma250=null;
		Token CloseBrace252=null;
		ParserRuleReturnScope arrayEntry249 =null;
		ParserRuleReturnScope arrayEntry251 =null;

		CommonTree Array247_tree=null;
		CommonTree OpenBrace248_tree=null;
		CommonTree Comma250_tree=null;
		CommonTree CloseBrace252_tree=null;
		RewriteRuleTokenStream stream_Array=new RewriteRuleTokenStream(adaptor,"token Array");
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
		RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
		RewriteRuleSubtreeStream stream_arrayEntry=new RewriteRuleSubtreeStream(adaptor,"rule arrayEntry");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:391:5: ( Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace -> ^( Array ( arrayEntry )* ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:391:7: Array OpenBrace ( arrayEntry ( Comma arrayEntry )* )? CloseBrace
			{
			Array247=(Token)match(input,Array,FOLLOW_Array_in_arrayDeclaration3162); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Array.add(Array247);

			OpenBrace248=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_arrayDeclaration3164); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace248);

			// com/github/gumtreediff/gen/antlr3/php/Php.g:391:23: ( arrayEntry ( Comma arrayEntry )* )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==Ampersand||LA67_0==Array||LA67_0==Bang||LA67_0==Boolean||LA67_0==Clone||LA67_0==Dollar||LA67_0==DoubleQuotedString||LA67_0==HereDoc||LA67_0==IncrementOperator||LA67_0==Integer||LA67_0==Minus||LA67_0==New||LA67_0==OpenBrace||LA67_0==Real||LA67_0==SingleQuotedString||LA67_0==SuppressWarnings||LA67_0==Tilde||LA67_0==UnquotedString) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:391:24: arrayEntry ( Comma arrayEntry )*
					{
					pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3167);
					arrayEntry249=arrayEntry();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry249.getTree());
					// com/github/gumtreediff/gen/antlr3/php/Php.g:391:35: ( Comma arrayEntry )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==Comma) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:391:36: Comma arrayEntry
							{
							Comma250=(Token)match(input,Comma,FOLLOW_Comma_in_arrayDeclaration3170); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Comma.add(Comma250);

							pushFollow(FOLLOW_arrayEntry_in_arrayDeclaration3172);
							arrayEntry251=arrayEntry();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayEntry.add(arrayEntry251.getTree());
							}
							break;

						default :
							break loop66;
						}
					}

					}
					break;

			}

			CloseBrace252=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_arrayDeclaration3178); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace252);


			// AST REWRITE
			// elements: arrayEntry, Array
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 391:68: -> ^( Array ( arrayEntry )* )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:391:71: ^( Array ( arrayEntry )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_Array.nextNode(), root_1);
				// com/github/gumtreediff/gen/antlr3/php/Php.g:391:79: ( arrayEntry )*
				while ( stream_arrayEntry.hasNext() ) {
					adaptor.addChild(root_1, stream_arrayEntry.nextTree());
				}
				stream_arrayEntry.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 48, arrayDeclaration_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayDeclaration"


	public static class arrayEntry_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arrayEntry"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:394:1: arrayEntry : ( keyValuePair | expression ) ;
	public final PhpParser.arrayEntry_return arrayEntry() throws RecognitionException {
		PhpParser.arrayEntry_return retval = new PhpParser.arrayEntry_return();
		retval.start = input.LT(1);
		int arrayEntry_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope keyValuePair253 =null;
		ParserRuleReturnScope expression254 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:395:5: ( ( keyValuePair | expression ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:395:7: ( keyValuePair | expression )
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/github/gumtreediff/gen/antlr3/php/Php.g:395:7: ( keyValuePair | expression )
			int alt68=2;
			alt68 = dfa68.predict(input);
			switch (alt68) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:395:8: keyValuePair
					{
					pushFollow(FOLLOW_keyValuePair_in_arrayEntry3205);
					keyValuePair253=keyValuePair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, keyValuePair253.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:395:23: expression
					{
					pushFollow(FOLLOW_expression_in_arrayEntry3209);
					expression254=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression254.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 49, arrayEntry_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arrayEntry"


	public static class keyValuePair_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "keyValuePair"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:398:1: keyValuePair : ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) ;
	public final PhpParser.keyValuePair_return keyValuePair() throws RecognitionException {
		PhpParser.keyValuePair_return retval = new PhpParser.keyValuePair_return();
		retval.start = input.LT(1);
		int keyValuePair_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ArrayAssign256=null;
		ParserRuleReturnScope expression255 =null;
		ParserRuleReturnScope expression257 =null;

		CommonTree ArrayAssign256_tree=null;
		RewriteRuleTokenStream stream_ArrayAssign=new RewriteRuleTokenStream(adaptor,"token ArrayAssign");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:399:5: ( ( expression ArrayAssign expression ) -> ^( ArrayAssign ( expression )+ ) )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:399:7: ( expression ArrayAssign expression )
			{
			// com/github/gumtreediff/gen/antlr3/php/Php.g:399:7: ( expression ArrayAssign expression )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:399:8: expression ArrayAssign expression
			{
			pushFollow(FOLLOW_expression_in_keyValuePair3228);
			expression255=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression255.getTree());
			ArrayAssign256=(Token)match(input,ArrayAssign,FOLLOW_ArrayAssign_in_keyValuePair3230); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ArrayAssign.add(ArrayAssign256);

			pushFollow(FOLLOW_expression_in_keyValuePair3232);
			expression257=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression257.getTree());
			}


			// AST REWRITE
			// elements: expression, ArrayAssign
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 399:43: -> ^( ArrayAssign ( expression )+ )
			{
				// com/github/gumtreediff/gen/antlr3/php/Php.g:399:46: ^( ArrayAssign ( expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ArrayAssign.nextNode(), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 50, keyValuePair_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "keyValuePair"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:402:1: atom : ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration );
	public final PhpParser.atom_return atom() throws RecognitionException {
		PhpParser.atom_return retval = new PhpParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		CommonTree root_0 = null;

		Token SingleQuotedString258=null;
		Token DoubleQuotedString259=null;
		Token HereDoc260=null;
		Token Integer261=null;
		Token Real262=null;
		Token Boolean263=null;
		ParserRuleReturnScope arrayDeclaration264 =null;

		CommonTree SingleQuotedString258_tree=null;
		CommonTree DoubleQuotedString259_tree=null;
		CommonTree HereDoc260_tree=null;
		CommonTree Integer261_tree=null;
		CommonTree Real262_tree=null;
		CommonTree Boolean263_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:402:5: ( SingleQuotedString | DoubleQuotedString | HereDoc | Integer | Real | Boolean | arrayDeclaration )
			int alt69=7;
			switch ( input.LA(1) ) {
			case SingleQuotedString:
				{
				alt69=1;
				}
				break;
			case DoubleQuotedString:
				{
				alt69=2;
				}
				break;
			case HereDoc:
				{
				alt69=3;
				}
				break;
			case Integer:
				{
				alt69=4;
				}
				break;
			case Real:
				{
				alt69=5;
				}
				break;
			case Boolean:
				{
				alt69=6;
				}
				break;
			case Array:
				{
				alt69=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:402:7: SingleQuotedString
					{
					root_0 = (CommonTree)adaptor.nil();


					SingleQuotedString258=(Token)match(input,SingleQuotedString,FOLLOW_SingleQuotedString_in_atom3254); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SingleQuotedString258_tree = (CommonTree)adaptor.create(SingleQuotedString258);
					adaptor.addChild(root_0, SingleQuotedString258_tree);
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:402:28: DoubleQuotedString
					{
					root_0 = (CommonTree)adaptor.nil();


					DoubleQuotedString259=(Token)match(input,DoubleQuotedString,FOLLOW_DoubleQuotedString_in_atom3258); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DoubleQuotedString259_tree = (CommonTree)adaptor.create(DoubleQuotedString259);
					adaptor.addChild(root_0, DoubleQuotedString259_tree);
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:402:49: HereDoc
					{
					root_0 = (CommonTree)adaptor.nil();


					HereDoc260=(Token)match(input,HereDoc,FOLLOW_HereDoc_in_atom3262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					HereDoc260_tree = (CommonTree)adaptor.create(HereDoc260);
					adaptor.addChild(root_0, HereDoc260_tree);
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:402:59: Integer
					{
					root_0 = (CommonTree)adaptor.nil();


					Integer261=(Token)match(input,Integer,FOLLOW_Integer_in_atom3266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Integer261_tree = (CommonTree)adaptor.create(Integer261);
					adaptor.addChild(root_0, Integer261_tree);
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:402:69: Real
					{
					root_0 = (CommonTree)adaptor.nil();


					Real262=(Token)match(input,Real,FOLLOW_Real_in_atom3270); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Real262_tree = (CommonTree)adaptor.create(Real262);
					adaptor.addChild(root_0, Real262_tree);
					}

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:402:76: Boolean
					{
					root_0 = (CommonTree)adaptor.nil();


					Boolean263=(Token)match(input,Boolean,FOLLOW_Boolean_in_atom3274); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Boolean263_tree = (CommonTree)adaptor.create(Boolean263);
					adaptor.addChild(root_0, Boolean263_tree);
					}

					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:402:86: arrayDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_arrayDeclaration_in_atom3278);
					arrayDeclaration264=arrayDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayDeclaration264.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 51, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "reference"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:406:1: reference : ( Ampersand ^ nameOrFunctionCall | nameOrFunctionCall );
	public final PhpParser.reference_return reference() throws RecognitionException {
		PhpParser.reference_return retval = new PhpParser.reference_return();
		retval.start = input.LT(1);
		int reference_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Ampersand265=null;
		ParserRuleReturnScope nameOrFunctionCall266 =null;
		ParserRuleReturnScope nameOrFunctionCall267 =null;

		CommonTree Ampersand265_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:407:5: ( Ampersand ^ nameOrFunctionCall | nameOrFunctionCall )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==Ampersand) ) {
				alt70=1;
			}
			else if ( (LA70_0==Dollar||LA70_0==UnquotedString) ) {
				alt70=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:407:7: Ampersand ^ nameOrFunctionCall
					{
					root_0 = (CommonTree)adaptor.nil();


					Ampersand265=(Token)match(input,Ampersand,FOLLOW_Ampersand_in_reference3296); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Ampersand265_tree = (CommonTree)adaptor.create(Ampersand265);
					root_0 = (CommonTree)adaptor.becomeRoot(Ampersand265_tree, root_0);
					}

					pushFollow(FOLLOW_nameOrFunctionCall_in_reference3299);
					nameOrFunctionCall266=nameOrFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall266.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:408:7: nameOrFunctionCall
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_nameOrFunctionCall_in_reference3307);
					nameOrFunctionCall267=nameOrFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nameOrFunctionCall267.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 52, reference_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "reference"


	public static class nameOrFunctionCall_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nameOrFunctionCall"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:411:1: nameOrFunctionCall : ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace -> ^( Apply name ( expression )* ) | name );
	public final PhpParser.nameOrFunctionCall_return nameOrFunctionCall() throws RecognitionException {
		PhpParser.nameOrFunctionCall_return retval = new PhpParser.nameOrFunctionCall_return();
		retval.start = input.LT(1);
		int nameOrFunctionCall_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OpenBrace269=null;
		Token Comma271=null;
		Token CloseBrace273=null;
		ParserRuleReturnScope name268 =null;
		ParserRuleReturnScope expression270 =null;
		ParserRuleReturnScope expression272 =null;
		ParserRuleReturnScope name274 =null;

		CommonTree OpenBrace269_tree=null;
		CommonTree Comma271_tree=null;
		CommonTree CloseBrace273_tree=null;
		RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
		RewriteRuleTokenStream stream_OpenBrace=new RewriteRuleTokenStream(adaptor,"token OpenBrace");
		RewriteRuleTokenStream stream_CloseBrace=new RewriteRuleTokenStream(adaptor,"token CloseBrace");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:412:5: ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace -> ^( Apply name ( expression )* ) | name )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==UnquotedString) ) {
				switch ( input.LA(2) ) {
				case ClassMember:
					{
					int LA73_3 = input.LA(3);
					if ( (synpred110_Php()) ) {
						alt73=1;
					}
					else if ( (true) ) {
						alt73=2;
					}

					}
					break;
				case OpenSquareBrace:
					{
					int LA73_4 = input.LA(3);
					if ( (synpred110_Php()) ) {
						alt73=1;
					}
					else if ( (true) ) {
						alt73=2;
					}

					}
					break;
				case InstanceMember:
					{
					int LA73_5 = input.LA(3);
					if ( (synpred110_Php()) ) {
						alt73=1;
					}
					else if ( (true) ) {
						alt73=2;
					}

					}
					break;
				case OpenBrace:
					{
					alt73=1;
					}
					break;
				case EOF:
				case Ampersand:
				case And:
				case ArrayAssign:
				case Asterisk:
				case BodyString:
				case CloseBrace:
				case CloseSquareBrace:
				case Colon:
				case Comma:
				case ComparisionOperator:
				case Dot:
				case EqualityOperator:
				case Forwardslash:
				case Instanceof:
				case LogicalAnd:
				case LogicalOr:
				case Minus:
				case Or:
				case Percent:
				case Pipe:
				case Plus:
				case QuestionMark:
				case SemiColon:
				case ShiftOperator:
				case Xor:
				case 112:
					{
					alt73=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA73_0==Dollar) ) {
				int LA73_2 = input.LA(2);
				if ( (LA73_2==Dollar) ) {
					int LA73_30 = input.LA(3);
					if ( (synpred110_Php()) ) {
						alt73=1;
					}
					else if ( (true) ) {
						alt73=2;
					}

				}
				else if ( (LA73_2==UnquotedString) ) {
					int LA73_31 = input.LA(3);
					if ( (synpred110_Php()) ) {
						alt73=1;
					}
					else if ( (true) ) {
						alt73=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:412:7: name OpenBrace ( expression ( Comma expression )* )? CloseBrace
					{
					pushFollow(FOLLOW_name_in_nameOrFunctionCall3324);
					name268=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_name.add(name268.getTree());
					OpenBrace269=(Token)match(input,OpenBrace,FOLLOW_OpenBrace_in_nameOrFunctionCall3326); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OpenBrace.add(OpenBrace269);

					// com/github/gumtreediff/gen/antlr3/php/Php.g:412:22: ( expression ( Comma expression )* )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==Ampersand||LA72_0==Array||LA72_0==Bang||LA72_0==Boolean||LA72_0==Clone||LA72_0==Dollar||LA72_0==DoubleQuotedString||LA72_0==HereDoc||LA72_0==IncrementOperator||LA72_0==Integer||LA72_0==Minus||LA72_0==New||LA72_0==OpenBrace||LA72_0==Real||LA72_0==SingleQuotedString||LA72_0==SuppressWarnings||LA72_0==Tilde||LA72_0==UnquotedString) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:412:23: expression ( Comma expression )*
							{
							pushFollow(FOLLOW_expression_in_nameOrFunctionCall3329);
							expression270=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression270.getTree());
							// com/github/gumtreediff/gen/antlr3/php/Php.g:412:34: ( Comma expression )*
							loop71:
							while (true) {
								int alt71=2;
								int LA71_0 = input.LA(1);
								if ( (LA71_0==Comma) ) {
									alt71=1;
								}

								switch (alt71) {
								case 1 :
									// com/github/gumtreediff/gen/antlr3/php/Php.g:412:35: Comma expression
									{
									Comma271=(Token)match(input,Comma,FOLLOW_Comma_in_nameOrFunctionCall3332); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_Comma.add(Comma271);

									pushFollow(FOLLOW_expression_in_nameOrFunctionCall3334);
									expression272=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_expression.add(expression272.getTree());
									}
									break;

								default :
									break loop71;
								}
							}

							}
							break;

					}

					CloseBrace273=(Token)match(input,CloseBrace,FOLLOW_CloseBrace_in_nameOrFunctionCall3340); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CloseBrace.add(CloseBrace273);


					// AST REWRITE
					// elements: name, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 412:67: -> ^( Apply name ( expression )* )
					{
						// com/github/gumtreediff/gen/antlr3/php/Php.g:412:70: ^( Apply name ( expression )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(Apply, "Apply"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						// com/github/gumtreediff/gen/antlr3/php/Php.g:412:83: ( expression )*
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:413:7: name
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_name_in_nameOrFunctionCall3359);
					name274=name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, name274.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 53, nameOrFunctionCall_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "nameOrFunctionCall"


	public static class name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "name"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:416:1: name : ( staticMemberAccess ( OpenSquareBrace ^ CloseSquareBrace )? | memberAccess ( OpenSquareBrace ^ CloseSquareBrace )? | variable ( OpenSquareBrace ^ CloseSquareBrace )? );
	public final PhpParser.name_return name() throws RecognitionException {
		PhpParser.name_return retval = new PhpParser.name_return();
		retval.start = input.LT(1);
		int name_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OpenSquareBrace276=null;
		Token CloseSquareBrace277=null;
		Token OpenSquareBrace279=null;
		Token CloseSquareBrace280=null;
		Token OpenSquareBrace282=null;
		Token CloseSquareBrace283=null;
		ParserRuleReturnScope staticMemberAccess275 =null;
		ParserRuleReturnScope memberAccess278 =null;
		ParserRuleReturnScope variable281 =null;

		CommonTree OpenSquareBrace276_tree=null;
		CommonTree CloseSquareBrace277_tree=null;
		CommonTree OpenSquareBrace279_tree=null;
		CommonTree CloseSquareBrace280_tree=null;
		CommonTree OpenSquareBrace282_tree=null;
		CommonTree CloseSquareBrace283_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:416:5: ( staticMemberAccess ( OpenSquareBrace ^ CloseSquareBrace )? | memberAccess ( OpenSquareBrace ^ CloseSquareBrace )? | variable ( OpenSquareBrace ^ CloseSquareBrace )? )
			int alt77=3;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==UnquotedString) ) {
				int LA77_1 = input.LA(2);
				if ( (LA77_1==ClassMember) ) {
					alt77=1;
				}
				else if ( (synpred114_Php()) ) {
					alt77=2;
				}
				else if ( (true) ) {
					alt77=3;
				}

			}
			else if ( (LA77_0==Dollar) ) {
				int LA77_2 = input.LA(2);
				if ( (LA77_2==Dollar) ) {
					int LA77_34 = input.LA(3);
					if ( (synpred114_Php()) ) {
						alt77=2;
					}
					else if ( (true) ) {
						alt77=3;
					}

				}
				else if ( (LA77_2==UnquotedString) ) {
					int LA77_35 = input.LA(3);
					if ( (synpred114_Php()) ) {
						alt77=2;
					}
					else if ( (true) ) {
						alt77=3;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 77, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:416:7: staticMemberAccess ( OpenSquareBrace ^ CloseSquareBrace )?
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_staticMemberAccess_in_name3371);
					staticMemberAccess275=staticMemberAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, staticMemberAccess275.getTree());

					// com/github/gumtreediff/gen/antlr3/php/Php.g:416:26: ( OpenSquareBrace ^ CloseSquareBrace )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==OpenSquareBrace) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:416:27: OpenSquareBrace ^ CloseSquareBrace
							{
							OpenSquareBrace276=(Token)match(input,OpenSquareBrace,FOLLOW_OpenSquareBrace_in_name3374); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							OpenSquareBrace276_tree = (CommonTree)adaptor.create(OpenSquareBrace276);
							root_0 = (CommonTree)adaptor.becomeRoot(OpenSquareBrace276_tree, root_0);
							}

							CloseSquareBrace277=(Token)match(input,CloseSquareBrace,FOLLOW_CloseSquareBrace_in_name3377); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							CloseSquareBrace277_tree = (CommonTree)adaptor.create(CloseSquareBrace277);
							adaptor.addChild(root_0, CloseSquareBrace277_tree);
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:417:7: memberAccess ( OpenSquareBrace ^ CloseSquareBrace )?
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_memberAccess_in_name3387);
					memberAccess278=memberAccess();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, memberAccess278.getTree());

					// com/github/gumtreediff/gen/antlr3/php/Php.g:417:20: ( OpenSquareBrace ^ CloseSquareBrace )?
					int alt75=2;
					int LA75_0 = input.LA(1);
					if ( (LA75_0==OpenSquareBrace) ) {
						alt75=1;
					}
					switch (alt75) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:417:21: OpenSquareBrace ^ CloseSquareBrace
							{
							OpenSquareBrace279=(Token)match(input,OpenSquareBrace,FOLLOW_OpenSquareBrace_in_name3390); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							OpenSquareBrace279_tree = (CommonTree)adaptor.create(OpenSquareBrace279);
							root_0 = (CommonTree)adaptor.becomeRoot(OpenSquareBrace279_tree, root_0);
							}

							CloseSquareBrace280=(Token)match(input,CloseSquareBrace,FOLLOW_CloseSquareBrace_in_name3393); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							CloseSquareBrace280_tree = (CommonTree)adaptor.create(CloseSquareBrace280);
							adaptor.addChild(root_0, CloseSquareBrace280_tree);
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:418:7: variable ( OpenSquareBrace ^ CloseSquareBrace )?
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_variable_in_name3403);
					variable281=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable281.getTree());

					// com/github/gumtreediff/gen/antlr3/php/Php.g:418:16: ( OpenSquareBrace ^ CloseSquareBrace )?
					int alt76=2;
					int LA76_0 = input.LA(1);
					if ( (LA76_0==OpenSquareBrace) ) {
						alt76=1;
					}
					switch (alt76) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/php/Php.g:418:17: OpenSquareBrace ^ CloseSquareBrace
							{
							OpenSquareBrace282=(Token)match(input,OpenSquareBrace,FOLLOW_OpenSquareBrace_in_name3406); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							OpenSquareBrace282_tree = (CommonTree)adaptor.create(OpenSquareBrace282);
							root_0 = (CommonTree)adaptor.becomeRoot(OpenSquareBrace282_tree, root_0);
							}

							CloseSquareBrace283=(Token)match(input,CloseSquareBrace,FOLLOW_CloseSquareBrace_in_name3409); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							CloseSquareBrace283_tree = (CommonTree)adaptor.create(CloseSquareBrace283);
							adaptor.addChild(root_0, CloseSquareBrace283_tree);
							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 54, name_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "name"


	public static class staticMemberAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "staticMemberAccess"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:421:1: staticMemberAccess : UnquotedString '::' ^ variable ;
	public final PhpParser.staticMemberAccess_return staticMemberAccess() throws RecognitionException {
		PhpParser.staticMemberAccess_return retval = new PhpParser.staticMemberAccess_return();
		retval.start = input.LT(1);
		int staticMemberAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		Token UnquotedString284=null;
		Token string_literal285=null;
		ParserRuleReturnScope variable286 =null;

		CommonTree UnquotedString284_tree=null;
		CommonTree string_literal285_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:422:5: ( UnquotedString '::' ^ variable )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:422:7: UnquotedString '::' ^ variable
			{
			root_0 = (CommonTree)adaptor.nil();


			UnquotedString284=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_staticMemberAccess3432); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UnquotedString284_tree = (CommonTree)adaptor.create(UnquotedString284);
			adaptor.addChild(root_0, UnquotedString284_tree);
			}

			string_literal285=(Token)match(input,ClassMember,FOLLOW_ClassMember_in_staticMemberAccess3434); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			string_literal285_tree = (CommonTree)adaptor.create(string_literal285);
			root_0 = (CommonTree)adaptor.becomeRoot(string_literal285_tree, root_0);
			}

			pushFollow(FOLLOW_variable_in_staticMemberAccess3437);
			variable286=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable286.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 55, staticMemberAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "staticMemberAccess"


	public static class memberAccess_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "memberAccess"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:425:1: memberAccess : variable ( OpenSquareBrace ^ expression CloseSquareBrace !| '->' ^ UnquotedString )* ;
	public final PhpParser.memberAccess_return memberAccess() throws RecognitionException {
		PhpParser.memberAccess_return retval = new PhpParser.memberAccess_return();
		retval.start = input.LT(1);
		int memberAccess_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OpenSquareBrace288=null;
		Token CloseSquareBrace290=null;
		Token string_literal291=null;
		Token UnquotedString292=null;
		ParserRuleReturnScope variable287 =null;
		ParserRuleReturnScope expression289 =null;

		CommonTree OpenSquareBrace288_tree=null;
		CommonTree CloseSquareBrace290_tree=null;
		CommonTree string_literal291_tree=null;
		CommonTree UnquotedString292_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:426:5: ( variable ( OpenSquareBrace ^ expression CloseSquareBrace !| '->' ^ UnquotedString )* )
			// com/github/gumtreediff/gen/antlr3/php/Php.g:426:7: variable ( OpenSquareBrace ^ expression CloseSquareBrace !| '->' ^ UnquotedString )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_variable_in_memberAccess3454);
			variable287=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable287.getTree());

			// com/github/gumtreediff/gen/antlr3/php/Php.g:427:9: ( OpenSquareBrace ^ expression CloseSquareBrace !| '->' ^ UnquotedString )*
			loop78:
			while (true) {
				int alt78=3;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==OpenSquareBrace) ) {
					int LA78_1 = input.LA(2);
					if ( (LA78_1==Ampersand||LA78_1==Array||LA78_1==Bang||LA78_1==Boolean||LA78_1==Clone||LA78_1==Dollar||LA78_1==DoubleQuotedString||LA78_1==HereDoc||LA78_1==IncrementOperator||LA78_1==Integer||LA78_1==Minus||LA78_1==New||LA78_1==OpenBrace||LA78_1==Real||LA78_1==SingleQuotedString||LA78_1==SuppressWarnings||LA78_1==Tilde||LA78_1==UnquotedString) ) {
						alt78=1;
					}

				}
				else if ( (LA78_0==InstanceMember) ) {
					alt78=2;
				}

				switch (alt78) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:427:11: OpenSquareBrace ^ expression CloseSquareBrace !
					{
					OpenSquareBrace288=(Token)match(input,OpenSquareBrace,FOLLOW_OpenSquareBrace_in_memberAccess3467); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OpenSquareBrace288_tree = (CommonTree)adaptor.create(OpenSquareBrace288);
					root_0 = (CommonTree)adaptor.becomeRoot(OpenSquareBrace288_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_memberAccess3470);
					expression289=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression289.getTree());

					CloseSquareBrace290=(Token)match(input,CloseSquareBrace,FOLLOW_CloseSquareBrace_in_memberAccess3472); if (state.failed) return retval;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:428:11: '->' ^ UnquotedString
					{
					string_literal291=(Token)match(input,InstanceMember,FOLLOW_InstanceMember_in_memberAccess3485); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal291_tree = (CommonTree)adaptor.create(string_literal291);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal291_tree, root_0);
					}

					UnquotedString292=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_memberAccess3488); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString292_tree = (CommonTree)adaptor.create(UnquotedString292);
					adaptor.addChild(root_0, UnquotedString292_tree);
					}

					}
					break;

				default :
					break loop78;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 56, memberAccess_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "memberAccess"


	public static class variable_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// com/github/gumtreediff/gen/antlr3/php/Php.g:431:1: variable : ( Dollar ^ variable | UnquotedString );
	public final PhpParser.variable_return variable() throws RecognitionException {
		PhpParser.variable_return retval = new PhpParser.variable_return();
		retval.start = input.LT(1);
		int variable_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Dollar293=null;
		Token UnquotedString295=null;
		ParserRuleReturnScope variable294 =null;

		CommonTree Dollar293_tree=null;
		CommonTree UnquotedString295_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/php/Php.g:432:5: ( Dollar ^ variable | UnquotedString )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==Dollar) ) {
				alt79=1;
			}
			else if ( (LA79_0==UnquotedString) ) {
				alt79=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:432:7: Dollar ^ variable
					{
					root_0 = (CommonTree)adaptor.nil();


					Dollar293=(Token)match(input,Dollar,FOLLOW_Dollar_in_variable3511); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Dollar293_tree = (CommonTree)adaptor.create(Dollar293);
					root_0 = (CommonTree)adaptor.becomeRoot(Dollar293_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_variable3514);
					variable294=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable294.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/php/Php.g:433:7: UnquotedString
					{
					root_0 = (CommonTree)adaptor.nil();


					UnquotedString295=(Token)match(input,UnquotedString,FOLLOW_UnquotedString_in_variable3522); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					UnquotedString295_tree = (CommonTree)adaptor.create(UnquotedString295);
					adaptor.addChild(root_0, UnquotedString295_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		  catch(RecognitionException re){
		    throw re; // Stop at first error
		  }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 57, variable_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "variable"

	// $ANTLR start synpred3_Php
	public final void synpred3_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:146:7: ( ( simpleStatement )? BodyString )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:146:7: ( simpleStatement )? BodyString
		{
		// com/github/gumtreediff/gen/antlr3/php/Php.g:146:7: ( simpleStatement )?
		int alt80=2;
		int LA80_0 = input.LA(1);
		if ( (LA80_0==Ampersand||LA80_0==Array||LA80_0==Bang||(LA80_0 >= Boolean && LA80_0 <= Break)||LA80_0==Clone||LA80_0==Continue||LA80_0==Dollar||(LA80_0 >= DoubleQuotedString && LA80_0 <= Echo)||(LA80_0 >= Global && LA80_0 <= HereDoc)||LA80_0==IncrementOperator||LA80_0==Integer||LA80_0==Minus||LA80_0==New||LA80_0==OpenBrace||LA80_0==Real||(LA80_0 >= RequireOperator && LA80_0 <= Return)||LA80_0==SingleQuotedString||(LA80_0 >= Static && LA80_0 <= SuppressWarnings)||(LA80_0 >= Throw && LA80_0 <= Tilde)||LA80_0==UnquotedString) ) {
			alt80=1;
		}
		switch (alt80) {
			case 1 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:146:7: simpleStatement
				{
				pushFollow(FOLLOW_simpleStatement_in_synpred3_Php912);
				simpleStatement();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		match(input,BodyString,FOLLOW_BodyString_in_synpred3_Php915); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_Php

	// $ANTLR start synpred4_Php
	public final void synpred4_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:147:7: ( '{' statement '}' )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:147:7: '{' statement '}'
		{
		match(input,OpenCurlyBrace,FOLLOW_OpenCurlyBrace_in_synpred4_Php923); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred4_Php925);
		statement();
		state._fsp--;
		if (state.failed) return;

		match(input,CloseCurlyBrace,FOLLOW_CloseCurlyBrace_in_synpred4_Php927); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_Php

	// $ANTLR start synpred5_Php
	public final void synpred5_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:148:7: ( bracketedBlock )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:148:7: bracketedBlock
		{
		pushFollow(FOLLOW_bracketedBlock_in_synpred5_Php939);
		bracketedBlock();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred5_Php

	// $ANTLR start synpred23_Php
	public final void synpred23_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:196:7: ( ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' ) )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:196:7: ( fieldModifier )* Function UnquotedString parametersDefinition ( bracketedBlock | ';' )
		{
		// com/github/gumtreediff/gen/antlr3/php/Php.g:196:7: ( fieldModifier )*
		loop82:
		while (true) {
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( ((LA82_0 >= Abstract && LA82_0 <= AccessModifier)||LA82_0==Static) ) {
				alt82=1;
			}

			switch (alt82) {
			case 1 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:196:7: fieldModifier
				{
				pushFollow(FOLLOW_fieldModifier_in_synpred23_Php1419);
				fieldModifier();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop82;
			}
		}

		match(input,Function,FOLLOW_Function_in_synpred23_Php1422); if (state.failed) return;

		match(input,UnquotedString,FOLLOW_UnquotedString_in_synpred23_Php1424); if (state.failed) return;

		pushFollow(FOLLOW_parametersDefinition_in_synpred23_Php1426);
		parametersDefinition();
		state._fsp--;
		if (state.failed) return;

		// com/github/gumtreediff/gen/antlr3/php/Php.g:197:9: ( bracketedBlock | ';' )
		int alt83=2;
		int LA83_0 = input.LA(1);
		if ( (LA83_0==OpenCurlyBrace) ) {
			alt83=1;
		}
		else if ( (LA83_0==SemiColon) ) {
			alt83=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 83, 0, input);
			throw nvae;
		}

		switch (alt83) {
			case 1 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:197:10: bracketedBlock
				{
				pushFollow(FOLLOW_bracketedBlock_in_synpred23_Php1438);
				bracketedBlock();
				state._fsp--;
				if (state.failed) return;

				}
				break;
			case 2 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:197:27: ';'
				{
				match(input,SemiColon,FOLLOW_SemiColon_in_synpred23_Php1442); if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred23_Php

	// $ANTLR start synpred33_Php
	public final void synpred33_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:220:58: ( conditional )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:220:58: conditional
		{
		pushFollow(FOLLOW_conditional_in_synpred33_Php1731);
		conditional();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred33_Php

	// $ANTLR start synpred53_Php
	public final void synpred53_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:245:62: ( conditional )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:245:62: conditional
		{
		pushFollow(FOLLOW_conditional_in_synpred53_Php2077);
		conditional();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred53_Php

	// $ANTLR start synpred67_Php
	public final void synpred67_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:300:23: ( Or weakLogicalXor )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:300:23: Or weakLogicalXor
		{
		match(input,Or,FOLLOW_Or_in_synpred67_Php2493); if (state.failed) return;

		pushFollow(FOLLOW_weakLogicalXor_in_synpred67_Php2496);
		weakLogicalXor();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred67_Php

	// $ANTLR start synpred68_Php
	public final void synpred68_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:304:23: ( Xor weakLogicalAnd )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:304:23: Xor weakLogicalAnd
		{
		match(input,Xor,FOLLOW_Xor_in_synpred68_Php2518); if (state.failed) return;

		pushFollow(FOLLOW_weakLogicalAnd_in_synpred68_Php2521);
		weakLogicalAnd();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred68_Php

	// $ANTLR start synpred69_Php
	public final void synpred69_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:308:19: ( And assignment )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:308:19: And assignment
		{
		match(input,And,FOLLOW_And_in_synpred69_Php2547); if (state.failed) return;

		pushFollow(FOLLOW_assignment_in_synpred69_Php2550);
		assignment();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred69_Php

	// $ANTLR start synpred71_Php
	public final void synpred71_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:312:7: ( name ( ( Equals | AsignmentOperator ) assignment ) )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:312:7: name ( ( Equals | AsignmentOperator ) assignment )
		{
		pushFollow(FOLLOW_name_in_synpred71_Php2569);
		name();
		state._fsp--;
		if (state.failed) return;

		// com/github/gumtreediff/gen/antlr3/php/Php.g:312:12: ( ( Equals | AsignmentOperator ) assignment )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:312:13: ( Equals | AsignmentOperator ) assignment
		{
		if ( input.LA(1)==AsignmentOperator||input.LA(1)==Equals ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_assignment_in_synpred71_Php2581);
		assignment();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred71_Php

	// $ANTLR start synpred72_Php
	public final void synpred72_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:317:7: ( logicalOr QuestionMark expression Colon expression )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:317:7: logicalOr QuestionMark expression Colon expression
		{
		pushFollow(FOLLOW_logicalOr_in_synpred72_Php2607);
		logicalOr();
		state._fsp--;
		if (state.failed) return;

		match(input,QuestionMark,FOLLOW_QuestionMark_in_synpred72_Php2609); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred72_Php2611);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input,Colon,FOLLOW_Colon_in_synpred72_Php2613); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred72_Php2615);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred72_Php

	// $ANTLR start synpred94_Php
	public final void synpred94_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:375:7: ( name IncrementOperator )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:375:7: name IncrementOperator
		{
		pushFollow(FOLLOW_name_in_synpred94_Php3061);
		name();
		state._fsp--;
		if (state.failed) return;

		match(input,IncrementOperator,FOLLOW_IncrementOperator_in_synpred94_Php3063); if (state.failed) return;

		}

	}
	// $ANTLR end synpred94_Php

	// $ANTLR start synpred100_Php
	public final void synpred100_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:395:8: ( keyValuePair )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:395:8: keyValuePair
		{
		pushFollow(FOLLOW_keyValuePair_in_synpred100_Php3205);
		keyValuePair();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred100_Php

	// $ANTLR start synpred110_Php
	public final void synpred110_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:412:7: ( name OpenBrace ( expression ( Comma expression )* )? CloseBrace )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:412:7: name OpenBrace ( expression ( Comma expression )* )? CloseBrace
		{
		pushFollow(FOLLOW_name_in_synpred110_Php3324);
		name();
		state._fsp--;
		if (state.failed) return;

		match(input,OpenBrace,FOLLOW_OpenBrace_in_synpred110_Php3326); if (state.failed) return;

		// com/github/gumtreediff/gen/antlr3/php/Php.g:412:22: ( expression ( Comma expression )* )?
		int alt97=2;
		int LA97_0 = input.LA(1);
		if ( (LA97_0==Ampersand||LA97_0==Array||LA97_0==Bang||LA97_0==Boolean||LA97_0==Clone||LA97_0==Dollar||LA97_0==DoubleQuotedString||LA97_0==HereDoc||LA97_0==IncrementOperator||LA97_0==Integer||LA97_0==Minus||LA97_0==New||LA97_0==OpenBrace||LA97_0==Real||LA97_0==SingleQuotedString||LA97_0==SuppressWarnings||LA97_0==Tilde||LA97_0==UnquotedString) ) {
			alt97=1;
		}
		switch (alt97) {
			case 1 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:412:23: expression ( Comma expression )*
				{
				pushFollow(FOLLOW_expression_in_synpred110_Php3329);
				expression();
				state._fsp--;
				if (state.failed) return;

				// com/github/gumtreediff/gen/antlr3/php/Php.g:412:34: ( Comma expression )*
				loop96:
				while (true) {
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==Comma) ) {
						alt96=1;
					}

					switch (alt96) {
					case 1 :
						// com/github/gumtreediff/gen/antlr3/php/Php.g:412:35: Comma expression
						{
						match(input,Comma,FOLLOW_Comma_in_synpred110_Php3332); if (state.failed) return;

						pushFollow(FOLLOW_expression_in_synpred110_Php3334);
						expression();
						state._fsp--;
						if (state.failed) return;

						}
						break;

					default :
						break loop96;
					}
				}

				}
				break;

		}

		match(input,CloseBrace,FOLLOW_CloseBrace_in_synpred110_Php3340); if (state.failed) return;

		}

	}
	// $ANTLR end synpred110_Php

	// $ANTLR start synpred114_Php
	public final void synpred114_Php_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/php/Php.g:417:7: ( memberAccess ( OpenSquareBrace CloseSquareBrace )? )
		// com/github/gumtreediff/gen/antlr3/php/Php.g:417:7: memberAccess ( OpenSquareBrace CloseSquareBrace )?
		{
		pushFollow(FOLLOW_memberAccess_in_synpred114_Php3387);
		memberAccess();
		state._fsp--;
		if (state.failed) return;

		// com/github/gumtreediff/gen/antlr3/php/Php.g:417:20: ( OpenSquareBrace CloseSquareBrace )?
		int alt99=2;
		int LA99_0 = input.LA(1);
		if ( (LA99_0==OpenSquareBrace) ) {
			alt99=1;
		}
		switch (alt99) {
			case 1 :
				// com/github/gumtreediff/gen/antlr3/php/Php.g:417:21: OpenSquareBrace CloseSquareBrace
				{
				match(input,OpenSquareBrace,FOLLOW_OpenSquareBrace_in_synpred114_Php3390); if (state.failed) return;

				match(input,CloseSquareBrace,FOLLOW_CloseSquareBrace_in_synpred114_Php3393); if (state.failed) return;

				}
				break;

		}

		}

	}
	// $ANTLR end synpred114_Php

	// Delegated rules

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
	public final boolean synpred53_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred100_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred100_Php_fragment(); // can never throw exception
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
	public final boolean synpred69_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred114_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred114_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred33_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred33_Php_fragment(); // can never throw exception
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
	public final boolean synpred68_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred68_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred94_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred94_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred110_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred110_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred72_Php() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred72_Php_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA24 dfa24 = new DFA24(this);
	protected DFA32 dfa32 = new DFA32(this);
	protected DFA50 dfa50 = new DFA50(this);
	protected DFA68 dfa68 = new DFA68(this);
	static final String DFA3_eotS =
		"\u0146\uffff";
	static final String DFA3_eofS =
		"\u0146\uffff";
	static final String DFA3_minS =
		"\1\4\2\6\2\45\2\17\3\6\1\45\3\6\3\45\6\6\1\121\1\45\1\uffff\1\4\12\uffff"+
		"\45\0\2\uffff\1\0\2\uffff\20\0\2\uffff\44\0\2\uffff\104\0\2\uffff\16\0"+
		"\2\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff\47\0\2\uffff";
	static final String DFA3_maxS =
		"\1\155\4\153\2\141\2\153\1\157\7\153\6\157\1\121\1\153\1\uffff\1\155\12"+
		"\uffff\45\0\2\uffff\1\0\2\uffff\20\0\2\uffff\44\0\2\uffff\104\0\2\uffff"+
		"\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff\16\0\2\uffff\47\0"+
		"\2\uffff";
	static final String DFA3_acceptS =
		"\31\uffff\1\1\1\uffff\1\4\1\uffff\1\5\1\6\54\uffff\1\7\u00f8\uffff\1\3"+
		"\1\2";
	static final String DFA3_specialS =
		"\45\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\2\uffff\1\45\2\uffff\1\46"+
		"\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64"+
		"\1\65\2\uffff\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100"+
		"\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114"+
		"\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130"+
		"\1\131\2\uffff\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1"+
		"\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
		"\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172"+
		"\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084"+
		"\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d"+
		"\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096"+
		"\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d\2\uffff\1\u009e"+
		"\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6\1\u00a7"+
		"\1\u00a8\1\u00a9\1\u00aa\1\u00ab\2\uffff\1\u00ac\1\u00ad\1\u00ae\1\u00af"+
		"\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\u00b8"+
		"\1\u00b9\2\uffff\1\u00ba\1\u00bb\1\u00bc\1\u00bd\1\u00be\1\u00bf\1\u00c0"+
		"\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\u00c6\1\u00c7\2\uffff\1\u00c8"+
		"\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1"+
		"\1\u00d2\1\u00d3\1\u00d4\1\u00d5\2\uffff\1\u00d6\1\u00d7\1\u00d8\1\u00d9"+
		"\1\u00da\1\u00db\1\u00dc\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2"+
		"\1\u00e3\2\uffff\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea"+
		"\1\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3"+
		"\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9\1\u00fa\1\u00fb\1\u00fc"+
		"\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105"+
		"\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a\2\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\33\1\uffff\1\30\2\uffff\1\27\3\uffff\1\13\1\uffff\1\31\1\26\1\5\2"+
			"\uffff\1\33\2\uffff\1\20\7\uffff\1\6\4\uffff\1\36\1\12\1\uffff\1\22\1"+
			"\1\13\uffff\1\36\3\uffff\1\36\1\uffff\1\36\1\3\1\23\2\uffff\1\36\2\uffff"+
			"\1\16\2\uffff\1\24\1\35\5\uffff\1\14\2\uffff\1\17\1\uffff\1\15\1\32\12"+
			"\uffff\1\25\1\uffff\1\10\1\7\2\uffff\1\21\1\uffff\1\4\1\14\1\36\1\2\1"+
			"\14\1\uffff\1\11\1\uffff\1\36",
			"\1\64\2\uffff\1\63\3\uffff\1\47\2\uffff\1\62\6\uffff\1\54\15\uffff\1"+
			"\46\1\uffff\1\56\24\uffff\1\57\5\uffff\1\52\2\uffff\1\60\6\uffff\1\50"+
			"\2\uffff\1\53\1\uffff\1\51\13\uffff\1\61\5\uffff\1\55\2\uffff\1\50\2"+
			"\uffff\1\50\1\uffff\1\45",
			"\1\104\2\uffff\1\103\3\uffff\1\67\2\uffff\1\102\6\uffff\1\74\15\uffff"+
			"\1\66\1\uffff\1\76\24\uffff\1\77\5\uffff\1\72\2\uffff\1\100\6\uffff\1"+
			"\70\2\uffff\1\73\1\uffff\1\71\13\uffff\1\101\5\uffff\1\75\2\uffff\1\70"+
			"\2\uffff\1\70\1\uffff\1\65",
			"\1\106\105\uffff\1\105",
			"\1\107\105\uffff\1\110",
			"\1\31\65\uffff\1\111\33\uffff\1\113",
			"\1\31\65\uffff\1\114\33\uffff\1\113",
			"\1\136\2\uffff\1\135\3\uffff\1\121\1\uffff\1\31\1\134\6\uffff\1\126"+
			"\15\uffff\1\120\1\uffff\1\130\24\uffff\1\131\5\uffff\1\124\2\uffff\1"+
			"\132\6\uffff\1\122\2\uffff\1\125\1\uffff\1\123\13\uffff\1\133\3\uffff"+
			"\1\113\1\uffff\1\127\2\uffff\1\122\2\uffff\1\122\1\uffff\1\117",
			"\1\160\2\uffff\1\157\3\uffff\1\143\2\uffff\1\156\6\uffff\1\150\15\uffff"+
			"\1\142\1\uffff\1\152\24\uffff\1\153\5\uffff\1\146\2\uffff\1\154\6\uffff"+
			"\1\144\2\uffff\1\147\1\uffff\1\145\13\uffff\1\155\5\uffff\1\151\2\uffff"+
			"\1\144\2\uffff\1\144\1\uffff\1\141",
			"\1\175\1\u0082\3\uffff\1\164\1\170\2\uffff\1\31\6\uffff\1\161\6\uffff"+
			"\1\173\10\uffff\1\171\6\uffff\1\174\1\164\12\uffff\1\170\10\uffff\1\165"+
			"\1\163\1\167\3\uffff\1\177\1\u0080\2\uffff\1\171\4\uffff\1\166\1\uffff"+
			"\1\162\1\u0084\1\uffff\1\170\1\176\1\171\3\uffff\1\u0081\4\uffff\1\113"+
			"\1\172\14\uffff\1\u0083",
			"\1\u0087\105\uffff\1\u0088",
			"\1\u0098\2\uffff\1\u0097\3\uffff\1\u0089\2\uffff\1\u0096\6\uffff\1\u0090"+
			"\15\uffff\1\u008e\1\uffff\1\u0092\24\uffff\1\u0093\5\uffff\1\u008c\2"+
			"\uffff\1\u0094\6\uffff\1\u008a\2\uffff\1\u008f\1\uffff\1\u008b\13\uffff"+
			"\1\u0095\5\uffff\1\u0091\2\uffff\1\u008a\2\uffff\1\u008a\1\uffff\1\u008d",
			"\1\u00a5\2\uffff\1\u00a4\6\uffff\1\u00a3\6\uffff\1\u009d\15\uffff\1"+
			"\u009b\1\uffff\1\u009f\24\uffff\1\u00a0\5\uffff\1\u0099\2\uffff\1\u00a1"+
			"\11\uffff\1\u009c\15\uffff\1\u00a2\5\uffff\1\u009e\7\uffff\1\u009a",
			"\1\u00b6\2\uffff\1\u00b5\3\uffff\1\u00a9\2\uffff\1\u00b4\6\uffff\1\u00ae"+
			"\15\uffff\1\u00a8\1\uffff\1\u00b0\24\uffff\1\u00b1\5\uffff\1\u00ac\2"+
			"\uffff\1\u00b2\6\uffff\1\u00aa\2\uffff\1\u00ad\1\uffff\1\u00ab\11\uffff"+
			"\1\u00a6\1\uffff\1\u00b3\5\uffff\1\u00af\2\uffff\1\u00aa\2\uffff\1\u00aa"+
			"\1\uffff\1\u00a7",
			"\1\u00b8\105\uffff\1\u00b7",
			"\1\u00ba\105\uffff\1\u00b9",
			"\1\u00bc\105\uffff\1\u00bb",
			"\1\u00c3\1\u00c8\4\uffff\1\u00be\2\uffff\1\31\15\uffff\1\u00c1\10\uffff"+
			"\1\u00bf\6\uffff\1\u00c2\13\uffff\1\u00be\12\uffff\1\u00bd\3\uffff\1"+
			"\u00c5\1\u00c6\2\uffff\1\u00bf\7\uffff\1\u00ca\1\uffff\1\u00be\1\u00c4"+
			"\1\u00bf\3\uffff\1\u00c7\4\uffff\1\113\1\u00c0\14\uffff\1\u00c9",
			"\1\u00d3\1\u00d8\4\uffff\1\u00ce\2\uffff\1\31\15\uffff\1\u00d1\10\uffff"+
			"\1\u00cf\6\uffff\1\u00d2\13\uffff\1\u00ce\12\uffff\1\u00cd\3\uffff\1"+
			"\u00d5\1\u00d6\2\uffff\1\u00cf\7\uffff\1\u00da\1\uffff\1\u00ce\1\u00d4"+
			"\1\u00cf\3\uffff\1\u00d7\4\uffff\1\113\1\u00d0\14\uffff\1\u00d9",
			"\1\u00e3\1\u00e8\4\uffff\1\u00de\2\uffff\1\31\15\uffff\1\u00e1\10\uffff"+
			"\1\u00df\6\uffff\1\u00e2\13\uffff\1\u00de\12\uffff\1\u00dd\3\uffff\1"+
			"\u00e5\1\u00e6\2\uffff\1\u00df\7\uffff\1\u00ea\1\uffff\1\u00de\1\u00e4"+
			"\1\u00df\3\uffff\1\u00e7\4\uffff\1\113\1\u00e0\14\uffff\1\u00e9",
			"\1\u00f3\1\u00f8\4\uffff\1\u00ee\2\uffff\1\31\15\uffff\1\u00f1\10\uffff"+
			"\1\u00ef\6\uffff\1\u00f2\13\uffff\1\u00ee\12\uffff\1\u00ed\3\uffff\1"+
			"\u00f5\1\u00f6\2\uffff\1\u00ef\7\uffff\1\u00fa\1\uffff\1\u00ee\1\u00f4"+
			"\1\u00ef\3\uffff\1\u00f7\4\uffff\1\113\1\u00f0\14\uffff\1\u00f9",
			"\1\u0103\1\u0108\4\uffff\1\u00fe\2\uffff\1\31\15\uffff\1\u0101\10\uffff"+
			"\1\u00ff\6\uffff\1\u0102\13\uffff\1\u00fe\12\uffff\1\u00fd\3\uffff\1"+
			"\u0105\1\u0106\2\uffff\1\u00ff\7\uffff\1\u010a\1\uffff\1\u00fe\1\u0104"+
			"\1\u00ff\3\uffff\1\u0107\4\uffff\1\113\1\u0100\14\uffff\1\u0109",
			"\1\u0113\1\u0118\4\uffff\1\u010e\2\uffff\1\31\15\uffff\1\u0111\10\uffff"+
			"\1\u010f\6\uffff\1\u0112\13\uffff\1\u010e\12\uffff\1\u010d\3\uffff\1"+
			"\u0115\1\u0116\2\uffff\1\u010f\7\uffff\1\u011a\1\uffff\1\u010e\1\u0114"+
			"\1\u010f\3\uffff\1\u0117\4\uffff\1\113\1\u0110\14\uffff\1\u0119",
			"\1\u011d",
			"\1\u011f\105\uffff\1\u011e",
			"",
			"\1\u013a\1\uffff\1\u0137\2\uffff\1\u0136\3\uffff\1\u012a\1\uffff\1\u0138"+
			"\1\u0135\1\u0124\2\uffff\1\u013b\2\uffff\1\u012f\1\uffff\1\u0144\5\uffff"+
			"\1\u0125\4\uffff\1\u0141\1\u0129\1\uffff\1\u0131\1\u0120\13\uffff\1\u013e"+
			"\3\uffff\1\u013f\1\uffff\1\u0143\1\u0122\1\u0132\2\uffff\1\u013d\2\uffff"+
			"\1\u012d\2\uffff\1\u0133\1\u013c\5\uffff\1\u012b\2\uffff\1\u012e\1\uffff"+
			"\1\u012c\1\u0139\12\uffff\1\u0134\1\uffff\1\u0127\1\u0126\2\uffff\1\u0130"+
			"\1\uffff\1\u0123\1\u012b\1\u0142\1\u0121\1\u012b\1\uffff\1\u0128\1\uffff"+
			"\1\u0140",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "145:1: statement : ( ( simpleStatement )? BodyString | '{' statement '}' -> statement | bracketedBlock | classDefinition | interfaceDefinition | complexStatement | simpleStatement ';' !);";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA3_37 = input.LA(1);
						 
						int index3_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_37);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA3_38 = input.LA(1);
						 
						int index3_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_38);
						if ( s>=0 ) return s;
						break;
					case 2 : 
						int LA3_39 = input.LA(1);
						 
						int index3_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_39);
						if ( s>=0 ) return s;
						break;
					case 3 : 
						int LA3_40 = input.LA(1);
						 
						int index3_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_40);
						if ( s>=0 ) return s;
						break;
					case 4 : 
						int LA3_41 = input.LA(1);
						 
						int index3_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_41);
						if ( s>=0 ) return s;
						break;
					case 5 : 
						int LA3_42 = input.LA(1);
						 
						int index3_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_42);
						if ( s>=0 ) return s;
						break;
					case 6 : 
						int LA3_43 = input.LA(1);
						 
						int index3_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_43);
						if ( s>=0 ) return s;
						break;
					case 7 : 
						int LA3_44 = input.LA(1);
						 
						int index3_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_44);
						if ( s>=0 ) return s;
						break;
					case 8 : 
						int LA3_45 = input.LA(1);
						 
						int index3_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_45);
						if ( s>=0 ) return s;
						break;
					case 9 : 
						int LA3_46 = input.LA(1);
						 
						int index3_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_46);
						if ( s>=0 ) return s;
						break;
					case 10 : 
						int LA3_47 = input.LA(1);
						 
						int index3_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_47);
						if ( s>=0 ) return s;
						break;
					case 11 : 
						int LA3_48 = input.LA(1);
						 
						int index3_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_48);
						if ( s>=0 ) return s;
						break;
					case 12 : 
						int LA3_49 = input.LA(1);
						 
						int index3_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_49);
						if ( s>=0 ) return s;
						break;
					case 13 : 
						int LA3_50 = input.LA(1);
						 
						int index3_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_50);
						if ( s>=0 ) return s;
						break;
					case 14 : 
						int LA3_51 = input.LA(1);
						 
						int index3_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_51);
						if ( s>=0 ) return s;
						break;
					case 15 : 
						int LA3_52 = input.LA(1);
						 
						int index3_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_52);
						if ( s>=0 ) return s;
						break;
					case 16 : 
						int LA3_53 = input.LA(1);
						 
						int index3_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_53);
						if ( s>=0 ) return s;
						break;
					case 17 : 
						int LA3_54 = input.LA(1);
						 
						int index3_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_54);
						if ( s>=0 ) return s;
						break;
					case 18 : 
						int LA3_55 = input.LA(1);
						 
						int index3_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_55);
						if ( s>=0 ) return s;
						break;
					case 19 : 
						int LA3_56 = input.LA(1);
						 
						int index3_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_56);
						if ( s>=0 ) return s;
						break;
					case 20 : 
						int LA3_57 = input.LA(1);
						 
						int index3_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_57);
						if ( s>=0 ) return s;
						break;
					case 21 : 
						int LA3_58 = input.LA(1);
						 
						int index3_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_58);
						if ( s>=0 ) return s;
						break;
					case 22 : 
						int LA3_59 = input.LA(1);
						 
						int index3_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_59);
						if ( s>=0 ) return s;
						break;
					case 23 : 
						int LA3_60 = input.LA(1);
						 
						int index3_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_60);
						if ( s>=0 ) return s;
						break;
					case 24 : 
						int LA3_61 = input.LA(1);
						 
						int index3_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_61);
						if ( s>=0 ) return s;
						break;
					case 25 : 
						int LA3_62 = input.LA(1);
						 
						int index3_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_62);
						if ( s>=0 ) return s;
						break;
					case 26 : 
						int LA3_63 = input.LA(1);
						 
						int index3_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_63);
						if ( s>=0 ) return s;
						break;
					case 27 : 
						int LA3_64 = input.LA(1);
						 
						int index3_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_64);
						if ( s>=0 ) return s;
						break;
					case 28 : 
						int LA3_65 = input.LA(1);
						 
						int index3_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_65);
						if ( s>=0 ) return s;
						break;
					case 29 : 
						int LA3_66 = input.LA(1);
						 
						int index3_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_66);
						if ( s>=0 ) return s;
						break;
					case 30 : 
						int LA3_67 = input.LA(1);
						 
						int index3_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_67);
						if ( s>=0 ) return s;
						break;
					case 31 : 
						int LA3_68 = input.LA(1);
						 
						int index3_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_68);
						if ( s>=0 ) return s;
						break;
					case 32 : 
						int LA3_69 = input.LA(1);
						 
						int index3_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_69);
						if ( s>=0 ) return s;
						break;
					case 33 : 
						int LA3_70 = input.LA(1);
						 
						int index3_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_70);
						if ( s>=0 ) return s;
						break;
					case 34 : 
						int LA3_71 = input.LA(1);
						 
						int index3_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_71);
						if ( s>=0 ) return s;
						break;
					case 35 : 
						int LA3_72 = input.LA(1);
						 
						int index3_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_72);
						if ( s>=0 ) return s;
						break;
					case 36 : 
						int LA3_73 = input.LA(1);
						 
						int index3_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_73);
						if ( s>=0 ) return s;
						break;
					case 37 : 
						int LA3_76 = input.LA(1);
						 
						int index3_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_76);
						if ( s>=0 ) return s;
						break;
					case 38 : 
						int LA3_79 = input.LA(1);
						 
						int index3_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_79);
						if ( s>=0 ) return s;
						break;
					case 39 : 
						int LA3_80 = input.LA(1);
						 
						int index3_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_80);
						if ( s>=0 ) return s;
						break;
					case 40 : 
						int LA3_81 = input.LA(1);
						 
						int index3_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_81);
						if ( s>=0 ) return s;
						break;
					case 41 : 
						int LA3_82 = input.LA(1);
						 
						int index3_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_82);
						if ( s>=0 ) return s;
						break;
					case 42 : 
						int LA3_83 = input.LA(1);
						 
						int index3_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_83);
						if ( s>=0 ) return s;
						break;
					case 43 : 
						int LA3_84 = input.LA(1);
						 
						int index3_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_84);
						if ( s>=0 ) return s;
						break;
					case 44 : 
						int LA3_85 = input.LA(1);
						 
						int index3_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_85);
						if ( s>=0 ) return s;
						break;
					case 45 : 
						int LA3_86 = input.LA(1);
						 
						int index3_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_86);
						if ( s>=0 ) return s;
						break;
					case 46 : 
						int LA3_87 = input.LA(1);
						 
						int index3_87 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_87);
						if ( s>=0 ) return s;
						break;
					case 47 : 
						int LA3_88 = input.LA(1);
						 
						int index3_88 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_88);
						if ( s>=0 ) return s;
						break;
					case 48 : 
						int LA3_89 = input.LA(1);
						 
						int index3_89 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_89);
						if ( s>=0 ) return s;
						break;
					case 49 : 
						int LA3_90 = input.LA(1);
						 
						int index3_90 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_90);
						if ( s>=0 ) return s;
						break;
					case 50 : 
						int LA3_91 = input.LA(1);
						 
						int index3_91 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_91);
						if ( s>=0 ) return s;
						break;
					case 51 : 
						int LA3_92 = input.LA(1);
						 
						int index3_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_92);
						if ( s>=0 ) return s;
						break;
					case 52 : 
						int LA3_93 = input.LA(1);
						 
						int index3_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_93);
						if ( s>=0 ) return s;
						break;
					case 53 : 
						int LA3_94 = input.LA(1);
						 
						int index3_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_94);
						if ( s>=0 ) return s;
						break;
					case 54 : 
						int LA3_97 = input.LA(1);
						 
						int index3_97 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_97);
						if ( s>=0 ) return s;
						break;
					case 55 : 
						int LA3_98 = input.LA(1);
						 
						int index3_98 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_98);
						if ( s>=0 ) return s;
						break;
					case 56 : 
						int LA3_99 = input.LA(1);
						 
						int index3_99 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_99);
						if ( s>=0 ) return s;
						break;
					case 57 : 
						int LA3_100 = input.LA(1);
						 
						int index3_100 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_100);
						if ( s>=0 ) return s;
						break;
					case 58 : 
						int LA3_101 = input.LA(1);
						 
						int index3_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_101);
						if ( s>=0 ) return s;
						break;
					case 59 : 
						int LA3_102 = input.LA(1);
						 
						int index3_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_102);
						if ( s>=0 ) return s;
						break;
					case 60 : 
						int LA3_103 = input.LA(1);
						 
						int index3_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_103);
						if ( s>=0 ) return s;
						break;
					case 61 : 
						int LA3_104 = input.LA(1);
						 
						int index3_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_104);
						if ( s>=0 ) return s;
						break;
					case 62 : 
						int LA3_105 = input.LA(1);
						 
						int index3_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_105);
						if ( s>=0 ) return s;
						break;
					case 63 : 
						int LA3_106 = input.LA(1);
						 
						int index3_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_106);
						if ( s>=0 ) return s;
						break;
					case 64 : 
						int LA3_107 = input.LA(1);
						 
						int index3_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_107);
						if ( s>=0 ) return s;
						break;
					case 65 : 
						int LA3_108 = input.LA(1);
						 
						int index3_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_108);
						if ( s>=0 ) return s;
						break;
					case 66 : 
						int LA3_109 = input.LA(1);
						 
						int index3_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_109);
						if ( s>=0 ) return s;
						break;
					case 67 : 
						int LA3_110 = input.LA(1);
						 
						int index3_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_110);
						if ( s>=0 ) return s;
						break;
					case 68 : 
						int LA3_111 = input.LA(1);
						 
						int index3_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_111);
						if ( s>=0 ) return s;
						break;
					case 69 : 
						int LA3_112 = input.LA(1);
						 
						int index3_112 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_112);
						if ( s>=0 ) return s;
						break;
					case 70 : 
						int LA3_113 = input.LA(1);
						 
						int index3_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_113);
						if ( s>=0 ) return s;
						break;
					case 71 : 
						int LA3_114 = input.LA(1);
						 
						int index3_114 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_114);
						if ( s>=0 ) return s;
						break;
					case 72 : 
						int LA3_115 = input.LA(1);
						 
						int index3_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_115);
						if ( s>=0 ) return s;
						break;
					case 73 : 
						int LA3_116 = input.LA(1);
						 
						int index3_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_116);
						if ( s>=0 ) return s;
						break;
					case 74 : 
						int LA3_117 = input.LA(1);
						 
						int index3_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_117);
						if ( s>=0 ) return s;
						break;
					case 75 : 
						int LA3_118 = input.LA(1);
						 
						int index3_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_118);
						if ( s>=0 ) return s;
						break;
					case 76 : 
						int LA3_119 = input.LA(1);
						 
						int index3_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_119);
						if ( s>=0 ) return s;
						break;
					case 77 : 
						int LA3_120 = input.LA(1);
						 
						int index3_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_120);
						if ( s>=0 ) return s;
						break;
					case 78 : 
						int LA3_121 = input.LA(1);
						 
						int index3_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_121);
						if ( s>=0 ) return s;
						break;
					case 79 : 
						int LA3_122 = input.LA(1);
						 
						int index3_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_122);
						if ( s>=0 ) return s;
						break;
					case 80 : 
						int LA3_123 = input.LA(1);
						 
						int index3_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_123);
						if ( s>=0 ) return s;
						break;
					case 81 : 
						int LA3_124 = input.LA(1);
						 
						int index3_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_124);
						if ( s>=0 ) return s;
						break;
					case 82 : 
						int LA3_125 = input.LA(1);
						 
						int index3_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_125);
						if ( s>=0 ) return s;
						break;
					case 83 : 
						int LA3_126 = input.LA(1);
						 
						int index3_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_126);
						if ( s>=0 ) return s;
						break;
					case 84 : 
						int LA3_127 = input.LA(1);
						 
						int index3_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_127);
						if ( s>=0 ) return s;
						break;
					case 85 : 
						int LA3_128 = input.LA(1);
						 
						int index3_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_128);
						if ( s>=0 ) return s;
						break;
					case 86 : 
						int LA3_129 = input.LA(1);
						 
						int index3_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_129);
						if ( s>=0 ) return s;
						break;
					case 87 : 
						int LA3_130 = input.LA(1);
						 
						int index3_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_130);
						if ( s>=0 ) return s;
						break;
					case 88 : 
						int LA3_131 = input.LA(1);
						 
						int index3_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_131);
						if ( s>=0 ) return s;
						break;
					case 89 : 
						int LA3_132 = input.LA(1);
						 
						int index3_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_132);
						if ( s>=0 ) return s;
						break;
					case 90 : 
						int LA3_135 = input.LA(1);
						 
						int index3_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_135);
						if ( s>=0 ) return s;
						break;
					case 91 : 
						int LA3_136 = input.LA(1);
						 
						int index3_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_136);
						if ( s>=0 ) return s;
						break;
					case 92 : 
						int LA3_137 = input.LA(1);
						 
						int index3_137 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_137);
						if ( s>=0 ) return s;
						break;
					case 93 : 
						int LA3_138 = input.LA(1);
						 
						int index3_138 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_138);
						if ( s>=0 ) return s;
						break;
					case 94 : 
						int LA3_139 = input.LA(1);
						 
						int index3_139 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_139);
						if ( s>=0 ) return s;
						break;
					case 95 : 
						int LA3_140 = input.LA(1);
						 
						int index3_140 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_140);
						if ( s>=0 ) return s;
						break;
					case 96 : 
						int LA3_141 = input.LA(1);
						 
						int index3_141 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_141);
						if ( s>=0 ) return s;
						break;
					case 97 : 
						int LA3_142 = input.LA(1);
						 
						int index3_142 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_142);
						if ( s>=0 ) return s;
						break;
					case 98 : 
						int LA3_143 = input.LA(1);
						 
						int index3_143 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_143);
						if ( s>=0 ) return s;
						break;
					case 99 : 
						int LA3_144 = input.LA(1);
						 
						int index3_144 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_144);
						if ( s>=0 ) return s;
						break;
					case 100 : 
						int LA3_145 = input.LA(1);
						 
						int index3_145 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_145);
						if ( s>=0 ) return s;
						break;
					case 101 : 
						int LA3_146 = input.LA(1);
						 
						int index3_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_146);
						if ( s>=0 ) return s;
						break;
					case 102 : 
						int LA3_147 = input.LA(1);
						 
						int index3_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_147);
						if ( s>=0 ) return s;
						break;
					case 103 : 
						int LA3_148 = input.LA(1);
						 
						int index3_148 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_148);
						if ( s>=0 ) return s;
						break;
					case 104 : 
						int LA3_149 = input.LA(1);
						 
						int index3_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_149);
						if ( s>=0 ) return s;
						break;
					case 105 : 
						int LA3_150 = input.LA(1);
						 
						int index3_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_150);
						if ( s>=0 ) return s;
						break;
					case 106 : 
						int LA3_151 = input.LA(1);
						 
						int index3_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_151);
						if ( s>=0 ) return s;
						break;
					case 107 : 
						int LA3_152 = input.LA(1);
						 
						int index3_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_152);
						if ( s>=0 ) return s;
						break;
					case 108 : 
						int LA3_153 = input.LA(1);
						 
						int index3_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_153);
						if ( s>=0 ) return s;
						break;
					case 109 : 
						int LA3_154 = input.LA(1);
						 
						int index3_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_154);
						if ( s>=0 ) return s;
						break;
					case 110 : 
						int LA3_155 = input.LA(1);
						 
						int index3_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_155);
						if ( s>=0 ) return s;
						break;
					case 111 : 
						int LA3_156 = input.LA(1);
						 
						int index3_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_156);
						if ( s>=0 ) return s;
						break;
					case 112 : 
						int LA3_157 = input.LA(1);
						 
						int index3_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_157);
						if ( s>=0 ) return s;
						break;
					case 113 : 
						int LA3_158 = input.LA(1);
						 
						int index3_158 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_158);
						if ( s>=0 ) return s;
						break;
					case 114 : 
						int LA3_159 = input.LA(1);
						 
						int index3_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_159);
						if ( s>=0 ) return s;
						break;
					case 115 : 
						int LA3_160 = input.LA(1);
						 
						int index3_160 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_160);
						if ( s>=0 ) return s;
						break;
					case 116 : 
						int LA3_161 = input.LA(1);
						 
						int index3_161 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_161);
						if ( s>=0 ) return s;
						break;
					case 117 : 
						int LA3_162 = input.LA(1);
						 
						int index3_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_162);
						if ( s>=0 ) return s;
						break;
					case 118 : 
						int LA3_163 = input.LA(1);
						 
						int index3_163 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_163);
						if ( s>=0 ) return s;
						break;
					case 119 : 
						int LA3_164 = input.LA(1);
						 
						int index3_164 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_164);
						if ( s>=0 ) return s;
						break;
					case 120 : 
						int LA3_165 = input.LA(1);
						 
						int index3_165 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_165);
						if ( s>=0 ) return s;
						break;
					case 121 : 
						int LA3_166 = input.LA(1);
						 
						int index3_166 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_166);
						if ( s>=0 ) return s;
						break;
					case 122 : 
						int LA3_167 = input.LA(1);
						 
						int index3_167 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_167);
						if ( s>=0 ) return s;
						break;
					case 123 : 
						int LA3_168 = input.LA(1);
						 
						int index3_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_168);
						if ( s>=0 ) return s;
						break;
					case 124 : 
						int LA3_169 = input.LA(1);
						 
						int index3_169 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_169);
						if ( s>=0 ) return s;
						break;
					case 125 : 
						int LA3_170 = input.LA(1);
						 
						int index3_170 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_170);
						if ( s>=0 ) return s;
						break;
					case 126 : 
						int LA3_171 = input.LA(1);
						 
						int index3_171 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_171);
						if ( s>=0 ) return s;
						break;
					case 127 : 
						int LA3_172 = input.LA(1);
						 
						int index3_172 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_172);
						if ( s>=0 ) return s;
						break;
					case 128 : 
						int LA3_173 = input.LA(1);
						 
						int index3_173 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_173);
						if ( s>=0 ) return s;
						break;
					case 129 : 
						int LA3_174 = input.LA(1);
						 
						int index3_174 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_174);
						if ( s>=0 ) return s;
						break;
					case 130 : 
						int LA3_175 = input.LA(1);
						 
						int index3_175 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_175);
						if ( s>=0 ) return s;
						break;
					case 131 : 
						int LA3_176 = input.LA(1);
						 
						int index3_176 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_176);
						if ( s>=0 ) return s;
						break;
					case 132 : 
						int LA3_177 = input.LA(1);
						 
						int index3_177 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_177);
						if ( s>=0 ) return s;
						break;
					case 133 : 
						int LA3_178 = input.LA(1);
						 
						int index3_178 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_178);
						if ( s>=0 ) return s;
						break;
					case 134 : 
						int LA3_179 = input.LA(1);
						 
						int index3_179 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_179);
						if ( s>=0 ) return s;
						break;
					case 135 : 
						int LA3_180 = input.LA(1);
						 
						int index3_180 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_180);
						if ( s>=0 ) return s;
						break;
					case 136 : 
						int LA3_181 = input.LA(1);
						 
						int index3_181 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_181);
						if ( s>=0 ) return s;
						break;
					case 137 : 
						int LA3_182 = input.LA(1);
						 
						int index3_182 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_182);
						if ( s>=0 ) return s;
						break;
					case 138 : 
						int LA3_183 = input.LA(1);
						 
						int index3_183 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_183);
						if ( s>=0 ) return s;
						break;
					case 139 : 
						int LA3_184 = input.LA(1);
						 
						int index3_184 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_184);
						if ( s>=0 ) return s;
						break;
					case 140 : 
						int LA3_185 = input.LA(1);
						 
						int index3_185 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_185);
						if ( s>=0 ) return s;
						break;
					case 141 : 
						int LA3_186 = input.LA(1);
						 
						int index3_186 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_186);
						if ( s>=0 ) return s;
						break;
					case 142 : 
						int LA3_187 = input.LA(1);
						 
						int index3_187 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_187);
						if ( s>=0 ) return s;
						break;
					case 143 : 
						int LA3_188 = input.LA(1);
						 
						int index3_188 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_188);
						if ( s>=0 ) return s;
						break;
					case 144 : 
						int LA3_189 = input.LA(1);
						 
						int index3_189 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_189);
						if ( s>=0 ) return s;
						break;
					case 145 : 
						int LA3_190 = input.LA(1);
						 
						int index3_190 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_190);
						if ( s>=0 ) return s;
						break;
					case 146 : 
						int LA3_191 = input.LA(1);
						 
						int index3_191 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_191);
						if ( s>=0 ) return s;
						break;
					case 147 : 
						int LA3_192 = input.LA(1);
						 
						int index3_192 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_192);
						if ( s>=0 ) return s;
						break;
					case 148 : 
						int LA3_193 = input.LA(1);
						 
						int index3_193 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_193);
						if ( s>=0 ) return s;
						break;
					case 149 : 
						int LA3_194 = input.LA(1);
						 
						int index3_194 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_194);
						if ( s>=0 ) return s;
						break;
					case 150 : 
						int LA3_195 = input.LA(1);
						 
						int index3_195 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_195);
						if ( s>=0 ) return s;
						break;
					case 151 : 
						int LA3_196 = input.LA(1);
						 
						int index3_196 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_196);
						if ( s>=0 ) return s;
						break;
					case 152 : 
						int LA3_197 = input.LA(1);
						 
						int index3_197 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_197);
						if ( s>=0 ) return s;
						break;
					case 153 : 
						int LA3_198 = input.LA(1);
						 
						int index3_198 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_198);
						if ( s>=0 ) return s;
						break;
					case 154 : 
						int LA3_199 = input.LA(1);
						 
						int index3_199 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_199);
						if ( s>=0 ) return s;
						break;
					case 155 : 
						int LA3_200 = input.LA(1);
						 
						int index3_200 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_200);
						if ( s>=0 ) return s;
						break;
					case 156 : 
						int LA3_201 = input.LA(1);
						 
						int index3_201 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_201);
						if ( s>=0 ) return s;
						break;
					case 157 : 
						int LA3_202 = input.LA(1);
						 
						int index3_202 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_202);
						if ( s>=0 ) return s;
						break;
					case 158 : 
						int LA3_205 = input.LA(1);
						 
						int index3_205 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_205);
						if ( s>=0 ) return s;
						break;
					case 159 : 
						int LA3_206 = input.LA(1);
						 
						int index3_206 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_206);
						if ( s>=0 ) return s;
						break;
					case 160 : 
						int LA3_207 = input.LA(1);
						 
						int index3_207 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_207);
						if ( s>=0 ) return s;
						break;
					case 161 : 
						int LA3_208 = input.LA(1);
						 
						int index3_208 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_208);
						if ( s>=0 ) return s;
						break;
					case 162 : 
						int LA3_209 = input.LA(1);
						 
						int index3_209 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_209);
						if ( s>=0 ) return s;
						break;
					case 163 : 
						int LA3_210 = input.LA(1);
						 
						int index3_210 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_210);
						if ( s>=0 ) return s;
						break;
					case 164 : 
						int LA3_211 = input.LA(1);
						 
						int index3_211 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_211);
						if ( s>=0 ) return s;
						break;
					case 165 : 
						int LA3_212 = input.LA(1);
						 
						int index3_212 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_212);
						if ( s>=0 ) return s;
						break;
					case 166 : 
						int LA3_213 = input.LA(1);
						 
						int index3_213 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_213);
						if ( s>=0 ) return s;
						break;
					case 167 : 
						int LA3_214 = input.LA(1);
						 
						int index3_214 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_214);
						if ( s>=0 ) return s;
						break;
					case 168 : 
						int LA3_215 = input.LA(1);
						 
						int index3_215 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_215);
						if ( s>=0 ) return s;
						break;
					case 169 : 
						int LA3_216 = input.LA(1);
						 
						int index3_216 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_216);
						if ( s>=0 ) return s;
						break;
					case 170 : 
						int LA3_217 = input.LA(1);
						 
						int index3_217 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_217);
						if ( s>=0 ) return s;
						break;
					case 171 : 
						int LA3_218 = input.LA(1);
						 
						int index3_218 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_218);
						if ( s>=0 ) return s;
						break;
					case 172 : 
						int LA3_221 = input.LA(1);
						 
						int index3_221 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_221);
						if ( s>=0 ) return s;
						break;
					case 173 : 
						int LA3_222 = input.LA(1);
						 
						int index3_222 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_222);
						if ( s>=0 ) return s;
						break;
					case 174 : 
						int LA3_223 = input.LA(1);
						 
						int index3_223 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_223);
						if ( s>=0 ) return s;
						break;
					case 175 : 
						int LA3_224 = input.LA(1);
						 
						int index3_224 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_224);
						if ( s>=0 ) return s;
						break;
					case 176 : 
						int LA3_225 = input.LA(1);
						 
						int index3_225 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_225);
						if ( s>=0 ) return s;
						break;
					case 177 : 
						int LA3_226 = input.LA(1);
						 
						int index3_226 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_226);
						if ( s>=0 ) return s;
						break;
					case 178 : 
						int LA3_227 = input.LA(1);
						 
						int index3_227 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_227);
						if ( s>=0 ) return s;
						break;
					case 179 : 
						int LA3_228 = input.LA(1);
						 
						int index3_228 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_228);
						if ( s>=0 ) return s;
						break;
					case 180 : 
						int LA3_229 = input.LA(1);
						 
						int index3_229 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_229);
						if ( s>=0 ) return s;
						break;
					case 181 : 
						int LA3_230 = input.LA(1);
						 
						int index3_230 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_230);
						if ( s>=0 ) return s;
						break;
					case 182 : 
						int LA3_231 = input.LA(1);
						 
						int index3_231 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_231);
						if ( s>=0 ) return s;
						break;
					case 183 : 
						int LA3_232 = input.LA(1);
						 
						int index3_232 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_232);
						if ( s>=0 ) return s;
						break;
					case 184 : 
						int LA3_233 = input.LA(1);
						 
						int index3_233 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_233);
						if ( s>=0 ) return s;
						break;
					case 185 : 
						int LA3_234 = input.LA(1);
						 
						int index3_234 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_234);
						if ( s>=0 ) return s;
						break;
					case 186 : 
						int LA3_237 = input.LA(1);
						 
						int index3_237 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_237);
						if ( s>=0 ) return s;
						break;
					case 187 : 
						int LA3_238 = input.LA(1);
						 
						int index3_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_238);
						if ( s>=0 ) return s;
						break;
					case 188 : 
						int LA3_239 = input.LA(1);
						 
						int index3_239 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_239);
						if ( s>=0 ) return s;
						break;
					case 189 : 
						int LA3_240 = input.LA(1);
						 
						int index3_240 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_240);
						if ( s>=0 ) return s;
						break;
					case 190 : 
						int LA3_241 = input.LA(1);
						 
						int index3_241 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_241);
						if ( s>=0 ) return s;
						break;
					case 191 : 
						int LA3_242 = input.LA(1);
						 
						int index3_242 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_242);
						if ( s>=0 ) return s;
						break;
					case 192 : 
						int LA3_243 = input.LA(1);
						 
						int index3_243 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_243);
						if ( s>=0 ) return s;
						break;
					case 193 : 
						int LA3_244 = input.LA(1);
						 
						int index3_244 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_244);
						if ( s>=0 ) return s;
						break;
					case 194 : 
						int LA3_245 = input.LA(1);
						 
						int index3_245 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_245);
						if ( s>=0 ) return s;
						break;
					case 195 : 
						int LA3_246 = input.LA(1);
						 
						int index3_246 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_246);
						if ( s>=0 ) return s;
						break;
					case 196 : 
						int LA3_247 = input.LA(1);
						 
						int index3_247 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_247);
						if ( s>=0 ) return s;
						break;
					case 197 : 
						int LA3_248 = input.LA(1);
						 
						int index3_248 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_248);
						if ( s>=0 ) return s;
						break;
					case 198 : 
						int LA3_249 = input.LA(1);
						 
						int index3_249 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_249);
						if ( s>=0 ) return s;
						break;
					case 199 : 
						int LA3_250 = input.LA(1);
						 
						int index3_250 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_250);
						if ( s>=0 ) return s;
						break;
					case 200 : 
						int LA3_253 = input.LA(1);
						 
						int index3_253 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_253);
						if ( s>=0 ) return s;
						break;
					case 201 : 
						int LA3_254 = input.LA(1);
						 
						int index3_254 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_254);
						if ( s>=0 ) return s;
						break;
					case 202 : 
						int LA3_255 = input.LA(1);
						 
						int index3_255 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_255);
						if ( s>=0 ) return s;
						break;
					case 203 : 
						int LA3_256 = input.LA(1);
						 
						int index3_256 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_256);
						if ( s>=0 ) return s;
						break;
					case 204 : 
						int LA3_257 = input.LA(1);
						 
						int index3_257 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_257);
						if ( s>=0 ) return s;
						break;
					case 205 : 
						int LA3_258 = input.LA(1);
						 
						int index3_258 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_258);
						if ( s>=0 ) return s;
						break;
					case 206 : 
						int LA3_259 = input.LA(1);
						 
						int index3_259 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_259);
						if ( s>=0 ) return s;
						break;
					case 207 : 
						int LA3_260 = input.LA(1);
						 
						int index3_260 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_260);
						if ( s>=0 ) return s;
						break;
					case 208 : 
						int LA3_261 = input.LA(1);
						 
						int index3_261 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_261);
						if ( s>=0 ) return s;
						break;
					case 209 : 
						int LA3_262 = input.LA(1);
						 
						int index3_262 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_262);
						if ( s>=0 ) return s;
						break;
					case 210 : 
						int LA3_263 = input.LA(1);
						 
						int index3_263 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_263);
						if ( s>=0 ) return s;
						break;
					case 211 : 
						int LA3_264 = input.LA(1);
						 
						int index3_264 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_264);
						if ( s>=0 ) return s;
						break;
					case 212 : 
						int LA3_265 = input.LA(1);
						 
						int index3_265 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_265);
						if ( s>=0 ) return s;
						break;
					case 213 : 
						int LA3_266 = input.LA(1);
						 
						int index3_266 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_266);
						if ( s>=0 ) return s;
						break;
					case 214 : 
						int LA3_269 = input.LA(1);
						 
						int index3_269 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_269);
						if ( s>=0 ) return s;
						break;
					case 215 : 
						int LA3_270 = input.LA(1);
						 
						int index3_270 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_270);
						if ( s>=0 ) return s;
						break;
					case 216 : 
						int LA3_271 = input.LA(1);
						 
						int index3_271 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_271);
						if ( s>=0 ) return s;
						break;
					case 217 : 
						int LA3_272 = input.LA(1);
						 
						int index3_272 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_272);
						if ( s>=0 ) return s;
						break;
					case 218 : 
						int LA3_273 = input.LA(1);
						 
						int index3_273 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_273);
						if ( s>=0 ) return s;
						break;
					case 219 : 
						int LA3_274 = input.LA(1);
						 
						int index3_274 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_274);
						if ( s>=0 ) return s;
						break;
					case 220 : 
						int LA3_275 = input.LA(1);
						 
						int index3_275 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_275);
						if ( s>=0 ) return s;
						break;
					case 221 : 
						int LA3_276 = input.LA(1);
						 
						int index3_276 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_276);
						if ( s>=0 ) return s;
						break;
					case 222 : 
						int LA3_277 = input.LA(1);
						 
						int index3_277 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_277);
						if ( s>=0 ) return s;
						break;
					case 223 : 
						int LA3_278 = input.LA(1);
						 
						int index3_278 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_278);
						if ( s>=0 ) return s;
						break;
					case 224 : 
						int LA3_279 = input.LA(1);
						 
						int index3_279 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_279);
						if ( s>=0 ) return s;
						break;
					case 225 : 
						int LA3_280 = input.LA(1);
						 
						int index3_280 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_280);
						if ( s>=0 ) return s;
						break;
					case 226 : 
						int LA3_281 = input.LA(1);
						 
						int index3_281 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_281);
						if ( s>=0 ) return s;
						break;
					case 227 : 
						int LA3_282 = input.LA(1);
						 
						int index3_282 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_282);
						if ( s>=0 ) return s;
						break;
					case 228 : 
						int LA3_285 = input.LA(1);
						 
						int index3_285 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_285);
						if ( s>=0 ) return s;
						break;
					case 229 : 
						int LA3_286 = input.LA(1);
						 
						int index3_286 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_286);
						if ( s>=0 ) return s;
						break;
					case 230 : 
						int LA3_287 = input.LA(1);
						 
						int index3_287 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_Php()) ) {s = 25;}
						else if ( (true) ) {s = 75;}
						 
						input.seek(index3_287);
						if ( s>=0 ) return s;
						break;
					case 231 : 
						int LA3_288 = input.LA(1);
						 
						int index3_288 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_288);
						if ( s>=0 ) return s;
						break;
					case 232 : 
						int LA3_289 = input.LA(1);
						 
						int index3_289 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_289);
						if ( s>=0 ) return s;
						break;
					case 233 : 
						int LA3_290 = input.LA(1);
						 
						int index3_290 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_290);
						if ( s>=0 ) return s;
						break;
					case 234 : 
						int LA3_291 = input.LA(1);
						 
						int index3_291 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_291);
						if ( s>=0 ) return s;
						break;
					case 235 : 
						int LA3_292 = input.LA(1);
						 
						int index3_292 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_292);
						if ( s>=0 ) return s;
						break;
					case 236 : 
						int LA3_293 = input.LA(1);
						 
						int index3_293 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_293);
						if ( s>=0 ) return s;
						break;
					case 237 : 
						int LA3_294 = input.LA(1);
						 
						int index3_294 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_294);
						if ( s>=0 ) return s;
						break;
					case 238 : 
						int LA3_295 = input.LA(1);
						 
						int index3_295 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_295);
						if ( s>=0 ) return s;
						break;
					case 239 : 
						int LA3_296 = input.LA(1);
						 
						int index3_296 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_296);
						if ( s>=0 ) return s;
						break;
					case 240 : 
						int LA3_297 = input.LA(1);
						 
						int index3_297 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_297);
						if ( s>=0 ) return s;
						break;
					case 241 : 
						int LA3_298 = input.LA(1);
						 
						int index3_298 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_298);
						if ( s>=0 ) return s;
						break;
					case 242 : 
						int LA3_299 = input.LA(1);
						 
						int index3_299 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_299);
						if ( s>=0 ) return s;
						break;
					case 243 : 
						int LA3_300 = input.LA(1);
						 
						int index3_300 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_300);
						if ( s>=0 ) return s;
						break;
					case 244 : 
						int LA3_301 = input.LA(1);
						 
						int index3_301 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_301);
						if ( s>=0 ) return s;
						break;
					case 245 : 
						int LA3_302 = input.LA(1);
						 
						int index3_302 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_302);
						if ( s>=0 ) return s;
						break;
					case 246 : 
						int LA3_303 = input.LA(1);
						 
						int index3_303 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_303);
						if ( s>=0 ) return s;
						break;
					case 247 : 
						int LA3_304 = input.LA(1);
						 
						int index3_304 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_304);
						if ( s>=0 ) return s;
						break;
					case 248 : 
						int LA3_305 = input.LA(1);
						 
						int index3_305 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_305);
						if ( s>=0 ) return s;
						break;
					case 249 : 
						int LA3_306 = input.LA(1);
						 
						int index3_306 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_306);
						if ( s>=0 ) return s;
						break;
					case 250 : 
						int LA3_307 = input.LA(1);
						 
						int index3_307 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_307);
						if ( s>=0 ) return s;
						break;
					case 251 : 
						int LA3_308 = input.LA(1);
						 
						int index3_308 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_308);
						if ( s>=0 ) return s;
						break;
					case 252 : 
						int LA3_309 = input.LA(1);
						 
						int index3_309 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_309);
						if ( s>=0 ) return s;
						break;
					case 253 : 
						int LA3_310 = input.LA(1);
						 
						int index3_310 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_310);
						if ( s>=0 ) return s;
						break;
					case 254 : 
						int LA3_311 = input.LA(1);
						 
						int index3_311 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_311);
						if ( s>=0 ) return s;
						break;
					case 255 : 
						int LA3_312 = input.LA(1);
						 
						int index3_312 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_312);
						if ( s>=0 ) return s;
						break;
					case 256 : 
						int LA3_313 = input.LA(1);
						 
						int index3_313 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_313);
						if ( s>=0 ) return s;
						break;
					case 257 : 
						int LA3_314 = input.LA(1);
						 
						int index3_314 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_314);
						if ( s>=0 ) return s;
						break;
					case 258 : 
						int LA3_315 = input.LA(1);
						 
						int index3_315 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_315);
						if ( s>=0 ) return s;
						break;
					case 259 : 
						int LA3_316 = input.LA(1);
						 
						int index3_316 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_316);
						if ( s>=0 ) return s;
						break;
					case 260 : 
						int LA3_317 = input.LA(1);
						 
						int index3_317 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_317);
						if ( s>=0 ) return s;
						break;
					case 261 : 
						int LA3_318 = input.LA(1);
						 
						int index3_318 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_318);
						if ( s>=0 ) return s;
						break;
					case 262 : 
						int LA3_319 = input.LA(1);
						 
						int index3_319 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_319);
						if ( s>=0 ) return s;
						break;
					case 263 : 
						int LA3_320 = input.LA(1);
						 
						int index3_320 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_320);
						if ( s>=0 ) return s;
						break;
					case 264 : 
						int LA3_321 = input.LA(1);
						 
						int index3_321 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_321);
						if ( s>=0 ) return s;
						break;
					case 265 : 
						int LA3_322 = input.LA(1);
						 
						int index3_322 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_322);
						if ( s>=0 ) return s;
						break;
					case 266 : 
						int LA3_323 = input.LA(1);
						 
						int index3_323 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_Php()) ) {s = 325;}
						else if ( (synpred5_Php()) ) {s = 324;}
						 
						input.seek(index3_323);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 3, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA24_eotS =
		"\121\uffff";
	static final String DFA24_eofS =
		"\1\3\120\uffff";
	static final String DFA24_minS =
		"\1\4\2\0\116\uffff";
	static final String DFA24_maxS =
		"\1\155\2\0\116\uffff";
	static final String DFA24_acceptS =
		"\3\uffff\1\2\50\uffff\1\1\44\uffff";
	static final String DFA24_specialS =
		"\1\uffff\1\0\1\1\116\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\1\uffff\4\3\1\uffff\1\3\2\uffff"+
			"\1\3\1\uffff\1\3\5\uffff\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\2\3\1\2"+
			"\1\1\11\uffff\1\3\3\uffff\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\1\3\2\uffff"+
			"\2\3\5\uffff\1\3\2\uffff\1\3\1\uffff\2\3\12\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\uffff\5\3\1\uffff\1\3\1\uffff\1\3",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	protected class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}
		@Override
		public String getDescription() {
			return "220:58: ( conditional )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA24_1 = input.LA(1);
						 
						int index24_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred33_Php()) ) {s = 44;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index24_1);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA24_2 = input.LA(1);
						 
						int index24_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred33_Php()) ) {s = 44;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index24_2);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 24, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA32_eotS =
		"\121\uffff";
	static final String DFA32_eofS =
		"\1\3\120\uffff";
	static final String DFA32_minS =
		"\1\4\2\0\116\uffff";
	static final String DFA32_maxS =
		"\1\155\2\0\116\uffff";
	static final String DFA32_acceptS =
		"\3\uffff\1\2\50\uffff\1\1\44\uffff";
	static final String DFA32_specialS =
		"\1\uffff\1\0\1\1\116\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\1\uffff\4\3\1\uffff\1\3\2\uffff"+
			"\1\3\1\uffff\1\3\5\uffff\1\3\2\uffff\1\3\1\uffff\2\3\1\uffff\2\3\1\2"+
			"\1\1\11\uffff\1\3\3\uffff\1\3\1\uffff\3\3\2\uffff\1\3\2\uffff\1\3\2\uffff"+
			"\2\3\5\uffff\1\3\2\uffff\1\3\1\uffff\2\3\12\uffff\1\3\1\uffff\2\3\2\uffff"+
			"\1\3\1\uffff\5\3\1\uffff\1\3\1\uffff\1\3",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "245:62: ( conditional )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA32_1 = input.LA(1);
						 
						int index32_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_Php()) ) {s = 44;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index32_1);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA32_2 = input.LA(1);
						 
						int index32_2 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_Php()) ) {s = 44;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index32_2);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 32, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA50_eotS =
		"\u00f0\uffff";
	static final String DFA50_eofS =
		"\5\uffff\1\121\3\uffff\6\121\u00e1\uffff";
	static final String DFA50_minS =
		"\4\6\1\45\1\6\3\45\6\6\1\121\1\45\77\0\15\uffff\20\0\15\uffff\12\0\15"+
		"\uffff\12\0\15\uffff\12\0\15\uffff\12\0\15\uffff\12\0\15\uffff\3\0";
	static final String DFA50_maxS =
		"\5\153\1\160\3\153\6\160\1\121\1\153\77\0\15\uffff\20\0\15\uffff\12\0"+
		"\15\uffff\12\0\15\uffff\12\0\15\uffff\12\0\15\uffff\12\0\15\uffff\3\0";
	static final String DFA50_acceptS =
		"\120\uffff\1\1\1\2\u009e\uffff";
	static final String DFA50_specialS =
		"\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
		"\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
		"\1\70\1\71\1\72\1\73\1\74\1\75\1\76\15\uffff\1\77\1\100\1\101\1\102\1"+
		"\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116"+
		"\15\uffff\1\117\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\130"+
		"\15\uffff\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142"+
		"\15\uffff\1\143\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\154"+
		"\15\uffff\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166"+
		"\15\uffff\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080"+
		"\15\uffff\1\u0081\1\u0082\1\u0083}>";
	static final String[] DFA50_transitionS = {
			"\1\20\2\uffff\1\17\3\uffff\1\1\2\uffff\1\16\6\uffff\1\10\15\uffff\1\6"+
			"\1\uffff\1\12\24\uffff\1\13\5\uffff\1\4\2\uffff\1\14\6\uffff\1\2\2\uffff"+
			"\1\7\1\uffff\1\3\13\uffff\1\15\5\uffff\1\11\2\uffff\1\2\2\uffff\1\2\1"+
			"\uffff\1\5",
			"\1\40\2\uffff\1\37\3\uffff\1\21\2\uffff\1\36\6\uffff\1\30\15\uffff\1"+
			"\26\1\uffff\1\32\24\uffff\1\33\5\uffff\1\24\2\uffff\1\34\6\uffff\1\22"+
			"\2\uffff\1\27\1\uffff\1\23\13\uffff\1\35\5\uffff\1\31\2\uffff\1\22\2"+
			"\uffff\1\22\1\uffff\1\25",
			"\1\55\2\uffff\1\54\6\uffff\1\53\6\uffff\1\45\15\uffff\1\43\1\uffff\1"+
			"\47\24\uffff\1\50\5\uffff\1\41\2\uffff\1\51\11\uffff\1\44\15\uffff\1"+
			"\52\5\uffff\1\46\7\uffff\1\42",
			"\1\76\2\uffff\1\75\3\uffff\1\61\2\uffff\1\74\6\uffff\1\66\15\uffff\1"+
			"\60\1\uffff\1\70\24\uffff\1\71\5\uffff\1\64\2\uffff\1\72\6\uffff\1\62"+
			"\2\uffff\1\65\1\uffff\1\63\11\uffff\1\56\1\uffff\1\73\5\uffff\1\67\2"+
			"\uffff\1\62\2\uffff\1\62\1\uffff\1\57",
			"\1\100\105\uffff\1\77",
			"\1\114\1\121\2\uffff\1\121\1\uffff\1\107\2\uffff\1\121\6\uffff\1\101"+
			"\1\uffff\1\121\1\uffff\3\121\1\112\10\uffff\1\110\6\uffff\1\113\13\uffff"+
			"\1\107\10\uffff\1\104\1\103\1\106\3\uffff\1\116\1\117\2\uffff\1\110\4"+
			"\uffff\1\105\1\uffff\1\102\1\121\1\uffff\1\107\1\115\1\110\3\uffff\1"+
			"\120\4\uffff\1\121\1\111\14\uffff\2\121",
			"\1\135\105\uffff\1\136",
			"\1\140\105\uffff\1\137",
			"\1\142\105\uffff\1\141",
			"\1\151\1\121\2\uffff\1\121\1\uffff\1\144\2\uffff\1\121\10\uffff\1\121"+
			"\1\uffff\3\121\1\147\10\uffff\1\145\6\uffff\1\150\13\uffff\1\144\12\uffff"+
			"\1\143\3\uffff\1\153\1\154\2\uffff\1\145\7\uffff\1\121\1\uffff\1\144"+
			"\1\152\1\145\3\uffff\1\120\4\uffff\1\121\1\146\14\uffff\2\121",
			"\1\u0080\1\121\2\uffff\1\121\1\uffff\1\173\2\uffff\1\121\10\uffff\1"+
			"\121\1\uffff\3\121\1\176\10\uffff\1\174\6\uffff\1\177\13\uffff\1\173"+
			"\12\uffff\1\172\3\uffff\1\u0082\1\u0083\2\uffff\1\174\7\uffff\1\121\1"+
			"\uffff\1\173\1\u0081\1\174\3\uffff\1\120\4\uffff\1\121\1\175\14\uffff"+
			"\2\121",
			"\1\u0097\1\121\2\uffff\1\121\1\uffff\1\u0092\2\uffff\1\121\10\uffff"+
			"\1\121\1\uffff\3\121\1\u0095\10\uffff\1\u0093\6\uffff\1\u0096\13\uffff"+
			"\1\u0092\12\uffff\1\u0091\3\uffff\1\u0099\1\u009a\2\uffff\1\u0093\7\uffff"+
			"\1\121\1\uffff\1\u0092\1\u0098\1\u0093\3\uffff\1\120\4\uffff\1\121\1"+
			"\u0094\14\uffff\2\121",
			"\1\u00ae\1\121\2\uffff\1\121\1\uffff\1\u00a9\2\uffff\1\121\10\uffff"+
			"\1\121\1\uffff\3\121\1\u00ac\10\uffff\1\u00aa\6\uffff\1\u00ad\13\uffff"+
			"\1\u00a9\12\uffff\1\u00a8\3\uffff\1\u00b0\1\u00b1\2\uffff\1\u00aa\7\uffff"+
			"\1\121\1\uffff\1\u00a9\1\u00af\1\u00aa\3\uffff\1\120\4\uffff\1\121\1"+
			"\u00ab\14\uffff\2\121",
			"\1\u00c5\1\121\2\uffff\1\121\1\uffff\1\u00c0\2\uffff\1\121\10\uffff"+
			"\1\121\1\uffff\3\121\1\u00c3\10\uffff\1\u00c1\6\uffff\1\u00c4\13\uffff"+
			"\1\u00c0\12\uffff\1\u00bf\3\uffff\1\u00c7\1\u00c8\2\uffff\1\u00c1\7\uffff"+
			"\1\121\1\uffff\1\u00c0\1\u00c6\1\u00c1\3\uffff\1\120\4\uffff\1\121\1"+
			"\u00c2\14\uffff\2\121",
			"\1\u00dc\1\121\2\uffff\1\121\1\uffff\1\u00d7\2\uffff\1\121\10\uffff"+
			"\1\121\1\uffff\3\121\1\u00da\10\uffff\1\u00d8\6\uffff\1\u00db\13\uffff"+
			"\1\u00d7\12\uffff\1\u00d6\3\uffff\1\u00de\1\u00df\2\uffff\1\u00d8\7\uffff"+
			"\1\121\1\uffff\1\u00d7\1\u00dd\1\u00d8\3\uffff\1\120\4\uffff\1\121\1"+
			"\u00d9\14\uffff\2\121",
			"\1\u00ed",
			"\1\u00ef\105\uffff\1\u00ee",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
	static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
	static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
	static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
	static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
	static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
	static final short[][] DFA50_transition;

	static {
		int numStates = DFA50_transitionS.length;
		DFA50_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
		}
	}

	protected class DFA50 extends DFA {

		public DFA50(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 50;
			this.eot = DFA50_eot;
			this.eof = DFA50_eof;
			this.min = DFA50_min;
			this.max = DFA50_max;
			this.accept = DFA50_accept;
			this.special = DFA50_special;
			this.transition = DFA50_transition;
		}
		@Override
		public String getDescription() {
			return "316:1: ternary : ( logicalOr QuestionMark expression Colon expression -> ^( IfExpression logicalOr ( expression )* ) | logicalOr );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA50_17 = input.LA(1);
						 
						int index50_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_17);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA50_18 = input.LA(1);
						 
						int index50_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_18);
						if ( s>=0 ) return s;
						break;
					case 2 : 
						int LA50_19 = input.LA(1);
						 
						int index50_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_19);
						if ( s>=0 ) return s;
						break;
					case 3 : 
						int LA50_20 = input.LA(1);
						 
						int index50_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_20);
						if ( s>=0 ) return s;
						break;
					case 4 : 
						int LA50_21 = input.LA(1);
						 
						int index50_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_21);
						if ( s>=0 ) return s;
						break;
					case 5 : 
						int LA50_22 = input.LA(1);
						 
						int index50_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_22);
						if ( s>=0 ) return s;
						break;
					case 6 : 
						int LA50_23 = input.LA(1);
						 
						int index50_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_23);
						if ( s>=0 ) return s;
						break;
					case 7 : 
						int LA50_24 = input.LA(1);
						 
						int index50_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_24);
						if ( s>=0 ) return s;
						break;
					case 8 : 
						int LA50_25 = input.LA(1);
						 
						int index50_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_25);
						if ( s>=0 ) return s;
						break;
					case 9 : 
						int LA50_26 = input.LA(1);
						 
						int index50_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_26);
						if ( s>=0 ) return s;
						break;
					case 10 : 
						int LA50_27 = input.LA(1);
						 
						int index50_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_27);
						if ( s>=0 ) return s;
						break;
					case 11 : 
						int LA50_28 = input.LA(1);
						 
						int index50_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_28);
						if ( s>=0 ) return s;
						break;
					case 12 : 
						int LA50_29 = input.LA(1);
						 
						int index50_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_29);
						if ( s>=0 ) return s;
						break;
					case 13 : 
						int LA50_30 = input.LA(1);
						 
						int index50_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_30);
						if ( s>=0 ) return s;
						break;
					case 14 : 
						int LA50_31 = input.LA(1);
						 
						int index50_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_31);
						if ( s>=0 ) return s;
						break;
					case 15 : 
						int LA50_32 = input.LA(1);
						 
						int index50_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_32);
						if ( s>=0 ) return s;
						break;
					case 16 : 
						int LA50_33 = input.LA(1);
						 
						int index50_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_33);
						if ( s>=0 ) return s;
						break;
					case 17 : 
						int LA50_34 = input.LA(1);
						 
						int index50_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_34);
						if ( s>=0 ) return s;
						break;
					case 18 : 
						int LA50_35 = input.LA(1);
						 
						int index50_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_35);
						if ( s>=0 ) return s;
						break;
					case 19 : 
						int LA50_36 = input.LA(1);
						 
						int index50_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_36);
						if ( s>=0 ) return s;
						break;
					case 20 : 
						int LA50_37 = input.LA(1);
						 
						int index50_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_37);
						if ( s>=0 ) return s;
						break;
					case 21 : 
						int LA50_38 = input.LA(1);
						 
						int index50_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_38);
						if ( s>=0 ) return s;
						break;
					case 22 : 
						int LA50_39 = input.LA(1);
						 
						int index50_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_39);
						if ( s>=0 ) return s;
						break;
					case 23 : 
						int LA50_40 = input.LA(1);
						 
						int index50_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_40);
						if ( s>=0 ) return s;
						break;
					case 24 : 
						int LA50_41 = input.LA(1);
						 
						int index50_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_41);
						if ( s>=0 ) return s;
						break;
					case 25 : 
						int LA50_42 = input.LA(1);
						 
						int index50_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_42);
						if ( s>=0 ) return s;
						break;
					case 26 : 
						int LA50_43 = input.LA(1);
						 
						int index50_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_43);
						if ( s>=0 ) return s;
						break;
					case 27 : 
						int LA50_44 = input.LA(1);
						 
						int index50_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_44);
						if ( s>=0 ) return s;
						break;
					case 28 : 
						int LA50_45 = input.LA(1);
						 
						int index50_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_45);
						if ( s>=0 ) return s;
						break;
					case 29 : 
						int LA50_46 = input.LA(1);
						 
						int index50_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_46);
						if ( s>=0 ) return s;
						break;
					case 30 : 
						int LA50_47 = input.LA(1);
						 
						int index50_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_47);
						if ( s>=0 ) return s;
						break;
					case 31 : 
						int LA50_48 = input.LA(1);
						 
						int index50_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_48);
						if ( s>=0 ) return s;
						break;
					case 32 : 
						int LA50_49 = input.LA(1);
						 
						int index50_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_49);
						if ( s>=0 ) return s;
						break;
					case 33 : 
						int LA50_50 = input.LA(1);
						 
						int index50_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_50);
						if ( s>=0 ) return s;
						break;
					case 34 : 
						int LA50_51 = input.LA(1);
						 
						int index50_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_51);
						if ( s>=0 ) return s;
						break;
					case 35 : 
						int LA50_52 = input.LA(1);
						 
						int index50_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_52);
						if ( s>=0 ) return s;
						break;
					case 36 : 
						int LA50_53 = input.LA(1);
						 
						int index50_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_53);
						if ( s>=0 ) return s;
						break;
					case 37 : 
						int LA50_54 = input.LA(1);
						 
						int index50_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_54);
						if ( s>=0 ) return s;
						break;
					case 38 : 
						int LA50_55 = input.LA(1);
						 
						int index50_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_55);
						if ( s>=0 ) return s;
						break;
					case 39 : 
						int LA50_56 = input.LA(1);
						 
						int index50_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_56);
						if ( s>=0 ) return s;
						break;
					case 40 : 
						int LA50_57 = input.LA(1);
						 
						int index50_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_57);
						if ( s>=0 ) return s;
						break;
					case 41 : 
						int LA50_58 = input.LA(1);
						 
						int index50_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_58);
						if ( s>=0 ) return s;
						break;
					case 42 : 
						int LA50_59 = input.LA(1);
						 
						int index50_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_59);
						if ( s>=0 ) return s;
						break;
					case 43 : 
						int LA50_60 = input.LA(1);
						 
						int index50_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_60);
						if ( s>=0 ) return s;
						break;
					case 44 : 
						int LA50_61 = input.LA(1);
						 
						int index50_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_61);
						if ( s>=0 ) return s;
						break;
					case 45 : 
						int LA50_62 = input.LA(1);
						 
						int index50_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_62);
						if ( s>=0 ) return s;
						break;
					case 46 : 
						int LA50_63 = input.LA(1);
						 
						int index50_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_63);
						if ( s>=0 ) return s;
						break;
					case 47 : 
						int LA50_64 = input.LA(1);
						 
						int index50_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_64);
						if ( s>=0 ) return s;
						break;
					case 48 : 
						int LA50_65 = input.LA(1);
						 
						int index50_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_65);
						if ( s>=0 ) return s;
						break;
					case 49 : 
						int LA50_66 = input.LA(1);
						 
						int index50_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_66);
						if ( s>=0 ) return s;
						break;
					case 50 : 
						int LA50_67 = input.LA(1);
						 
						int index50_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_67);
						if ( s>=0 ) return s;
						break;
					case 51 : 
						int LA50_68 = input.LA(1);
						 
						int index50_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_68);
						if ( s>=0 ) return s;
						break;
					case 52 : 
						int LA50_69 = input.LA(1);
						 
						int index50_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_69);
						if ( s>=0 ) return s;
						break;
					case 53 : 
						int LA50_70 = input.LA(1);
						 
						int index50_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_70);
						if ( s>=0 ) return s;
						break;
					case 54 : 
						int LA50_71 = input.LA(1);
						 
						int index50_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_71);
						if ( s>=0 ) return s;
						break;
					case 55 : 
						int LA50_72 = input.LA(1);
						 
						int index50_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_72);
						if ( s>=0 ) return s;
						break;
					case 56 : 
						int LA50_73 = input.LA(1);
						 
						int index50_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_73);
						if ( s>=0 ) return s;
						break;
					case 57 : 
						int LA50_74 = input.LA(1);
						 
						int index50_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_74);
						if ( s>=0 ) return s;
						break;
					case 58 : 
						int LA50_75 = input.LA(1);
						 
						int index50_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_75);
						if ( s>=0 ) return s;
						break;
					case 59 : 
						int LA50_76 = input.LA(1);
						 
						int index50_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_76);
						if ( s>=0 ) return s;
						break;
					case 60 : 
						int LA50_77 = input.LA(1);
						 
						int index50_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_77);
						if ( s>=0 ) return s;
						break;
					case 61 : 
						int LA50_78 = input.LA(1);
						 
						int index50_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_78);
						if ( s>=0 ) return s;
						break;
					case 62 : 
						int LA50_79 = input.LA(1);
						 
						int index50_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_79);
						if ( s>=0 ) return s;
						break;
					case 63 : 
						int LA50_93 = input.LA(1);
						 
						int index50_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_93);
						if ( s>=0 ) return s;
						break;
					case 64 : 
						int LA50_94 = input.LA(1);
						 
						int index50_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_94);
						if ( s>=0 ) return s;
						break;
					case 65 : 
						int LA50_95 = input.LA(1);
						 
						int index50_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_95);
						if ( s>=0 ) return s;
						break;
					case 66 : 
						int LA50_96 = input.LA(1);
						 
						int index50_96 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_96);
						if ( s>=0 ) return s;
						break;
					case 67 : 
						int LA50_97 = input.LA(1);
						 
						int index50_97 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_97);
						if ( s>=0 ) return s;
						break;
					case 68 : 
						int LA50_98 = input.LA(1);
						 
						int index50_98 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_98);
						if ( s>=0 ) return s;
						break;
					case 69 : 
						int LA50_99 = input.LA(1);
						 
						int index50_99 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_99);
						if ( s>=0 ) return s;
						break;
					case 70 : 
						int LA50_100 = input.LA(1);
						 
						int index50_100 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_100);
						if ( s>=0 ) return s;
						break;
					case 71 : 
						int LA50_101 = input.LA(1);
						 
						int index50_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_101);
						if ( s>=0 ) return s;
						break;
					case 72 : 
						int LA50_102 = input.LA(1);
						 
						int index50_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_102);
						if ( s>=0 ) return s;
						break;
					case 73 : 
						int LA50_103 = input.LA(1);
						 
						int index50_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_103);
						if ( s>=0 ) return s;
						break;
					case 74 : 
						int LA50_104 = input.LA(1);
						 
						int index50_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_104);
						if ( s>=0 ) return s;
						break;
					case 75 : 
						int LA50_105 = input.LA(1);
						 
						int index50_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_105);
						if ( s>=0 ) return s;
						break;
					case 76 : 
						int LA50_106 = input.LA(1);
						 
						int index50_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_106);
						if ( s>=0 ) return s;
						break;
					case 77 : 
						int LA50_107 = input.LA(1);
						 
						int index50_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_107);
						if ( s>=0 ) return s;
						break;
					case 78 : 
						int LA50_108 = input.LA(1);
						 
						int index50_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_108);
						if ( s>=0 ) return s;
						break;
					case 79 : 
						int LA50_122 = input.LA(1);
						 
						int index50_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_122);
						if ( s>=0 ) return s;
						break;
					case 80 : 
						int LA50_123 = input.LA(1);
						 
						int index50_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_123);
						if ( s>=0 ) return s;
						break;
					case 81 : 
						int LA50_124 = input.LA(1);
						 
						int index50_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_124);
						if ( s>=0 ) return s;
						break;
					case 82 : 
						int LA50_125 = input.LA(1);
						 
						int index50_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_125);
						if ( s>=0 ) return s;
						break;
					case 83 : 
						int LA50_126 = input.LA(1);
						 
						int index50_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_126);
						if ( s>=0 ) return s;
						break;
					case 84 : 
						int LA50_127 = input.LA(1);
						 
						int index50_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_127);
						if ( s>=0 ) return s;
						break;
					case 85 : 
						int LA50_128 = input.LA(1);
						 
						int index50_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_128);
						if ( s>=0 ) return s;
						break;
					case 86 : 
						int LA50_129 = input.LA(1);
						 
						int index50_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_129);
						if ( s>=0 ) return s;
						break;
					case 87 : 
						int LA50_130 = input.LA(1);
						 
						int index50_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_130);
						if ( s>=0 ) return s;
						break;
					case 88 : 
						int LA50_131 = input.LA(1);
						 
						int index50_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_131);
						if ( s>=0 ) return s;
						break;
					case 89 : 
						int LA50_145 = input.LA(1);
						 
						int index50_145 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_145);
						if ( s>=0 ) return s;
						break;
					case 90 : 
						int LA50_146 = input.LA(1);
						 
						int index50_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_146);
						if ( s>=0 ) return s;
						break;
					case 91 : 
						int LA50_147 = input.LA(1);
						 
						int index50_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_147);
						if ( s>=0 ) return s;
						break;
					case 92 : 
						int LA50_148 = input.LA(1);
						 
						int index50_148 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_148);
						if ( s>=0 ) return s;
						break;
					case 93 : 
						int LA50_149 = input.LA(1);
						 
						int index50_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_149);
						if ( s>=0 ) return s;
						break;
					case 94 : 
						int LA50_150 = input.LA(1);
						 
						int index50_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_150);
						if ( s>=0 ) return s;
						break;
					case 95 : 
						int LA50_151 = input.LA(1);
						 
						int index50_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_151);
						if ( s>=0 ) return s;
						break;
					case 96 : 
						int LA50_152 = input.LA(1);
						 
						int index50_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_152);
						if ( s>=0 ) return s;
						break;
					case 97 : 
						int LA50_153 = input.LA(1);
						 
						int index50_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_153);
						if ( s>=0 ) return s;
						break;
					case 98 : 
						int LA50_154 = input.LA(1);
						 
						int index50_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_154);
						if ( s>=0 ) return s;
						break;
					case 99 : 
						int LA50_168 = input.LA(1);
						 
						int index50_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_168);
						if ( s>=0 ) return s;
						break;
					case 100 : 
						int LA50_169 = input.LA(1);
						 
						int index50_169 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_169);
						if ( s>=0 ) return s;
						break;
					case 101 : 
						int LA50_170 = input.LA(1);
						 
						int index50_170 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_170);
						if ( s>=0 ) return s;
						break;
					case 102 : 
						int LA50_171 = input.LA(1);
						 
						int index50_171 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_171);
						if ( s>=0 ) return s;
						break;
					case 103 : 
						int LA50_172 = input.LA(1);
						 
						int index50_172 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_172);
						if ( s>=0 ) return s;
						break;
					case 104 : 
						int LA50_173 = input.LA(1);
						 
						int index50_173 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_173);
						if ( s>=0 ) return s;
						break;
					case 105 : 
						int LA50_174 = input.LA(1);
						 
						int index50_174 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_174);
						if ( s>=0 ) return s;
						break;
					case 106 : 
						int LA50_175 = input.LA(1);
						 
						int index50_175 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_175);
						if ( s>=0 ) return s;
						break;
					case 107 : 
						int LA50_176 = input.LA(1);
						 
						int index50_176 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_176);
						if ( s>=0 ) return s;
						break;
					case 108 : 
						int LA50_177 = input.LA(1);
						 
						int index50_177 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_177);
						if ( s>=0 ) return s;
						break;
					case 109 : 
						int LA50_191 = input.LA(1);
						 
						int index50_191 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_191);
						if ( s>=0 ) return s;
						break;
					case 110 : 
						int LA50_192 = input.LA(1);
						 
						int index50_192 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_192);
						if ( s>=0 ) return s;
						break;
					case 111 : 
						int LA50_193 = input.LA(1);
						 
						int index50_193 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_193);
						if ( s>=0 ) return s;
						break;
					case 112 : 
						int LA50_194 = input.LA(1);
						 
						int index50_194 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_194);
						if ( s>=0 ) return s;
						break;
					case 113 : 
						int LA50_195 = input.LA(1);
						 
						int index50_195 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_195);
						if ( s>=0 ) return s;
						break;
					case 114 : 
						int LA50_196 = input.LA(1);
						 
						int index50_196 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_196);
						if ( s>=0 ) return s;
						break;
					case 115 : 
						int LA50_197 = input.LA(1);
						 
						int index50_197 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_197);
						if ( s>=0 ) return s;
						break;
					case 116 : 
						int LA50_198 = input.LA(1);
						 
						int index50_198 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_198);
						if ( s>=0 ) return s;
						break;
					case 117 : 
						int LA50_199 = input.LA(1);
						 
						int index50_199 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_199);
						if ( s>=0 ) return s;
						break;
					case 118 : 
						int LA50_200 = input.LA(1);
						 
						int index50_200 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_200);
						if ( s>=0 ) return s;
						break;
					case 119 : 
						int LA50_214 = input.LA(1);
						 
						int index50_214 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_214);
						if ( s>=0 ) return s;
						break;
					case 120 : 
						int LA50_215 = input.LA(1);
						 
						int index50_215 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_215);
						if ( s>=0 ) return s;
						break;
					case 121 : 
						int LA50_216 = input.LA(1);
						 
						int index50_216 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_216);
						if ( s>=0 ) return s;
						break;
					case 122 : 
						int LA50_217 = input.LA(1);
						 
						int index50_217 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_217);
						if ( s>=0 ) return s;
						break;
					case 123 : 
						int LA50_218 = input.LA(1);
						 
						int index50_218 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_218);
						if ( s>=0 ) return s;
						break;
					case 124 : 
						int LA50_219 = input.LA(1);
						 
						int index50_219 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_219);
						if ( s>=0 ) return s;
						break;
					case 125 : 
						int LA50_220 = input.LA(1);
						 
						int index50_220 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_220);
						if ( s>=0 ) return s;
						break;
					case 126 : 
						int LA50_221 = input.LA(1);
						 
						int index50_221 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_221);
						if ( s>=0 ) return s;
						break;
					case 127 : 
						int LA50_222 = input.LA(1);
						 
						int index50_222 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_222);
						if ( s>=0 ) return s;
						break;
					case 128 : 
						int LA50_223 = input.LA(1);
						 
						int index50_223 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_223);
						if ( s>=0 ) return s;
						break;
					case 129 : 
						int LA50_237 = input.LA(1);
						 
						int index50_237 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_237);
						if ( s>=0 ) return s;
						break;
					case 130 : 
						int LA50_238 = input.LA(1);
						 
						int index50_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_238);
						if ( s>=0 ) return s;
						break;
					case 131 : 
						int LA50_239 = input.LA(1);
						 
						int index50_239 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred72_Php()) ) {s = 80;}
						else if ( (true) ) {s = 81;}
						 
						input.seek(index50_239);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 50, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA68_eotS =
		"\u00ce\uffff";
	static final String DFA68_eofS =
		"\1\uffff\1\46\7\uffff\6\46\u00bf\uffff";
	static final String DFA68_minS =
		"\2\6\1\45\3\6\3\45\6\6\1\121\1\45\24\0\4\uffff\104\0\4\uffff\16\0\4\uffff"+
		"\16\0\4\uffff\16\0\4\uffff\16\0\4\uffff\16\0\4\uffff\3\0";
	static final String DFA68_maxS =
		"\1\153\1\157\7\153\6\157\1\121\1\153\24\0\4\uffff\104\0\4\uffff\16\0\4"+
		"\uffff\16\0\4\uffff\16\0\4\uffff\16\0\4\uffff\16\0\4\uffff\3\0";
	static final String DFA68_acceptS =
		"\45\uffff\1\1\1\2\u00a7\uffff";
	static final String DFA68_specialS =
		"\21\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\4\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1"+
		"\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1"+
		"\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1"+
		"\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103"+
		"\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\115\1\116\1\117"+
		"\1\120\1\121\1\122\1\123\1\124\1\125\1\126\1\127\4\uffff\1\130\1\131\1"+
		"\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145"+
		"\4\uffff\1\146\1\147\1\150\1\151\1\152\1\153\1\154\1\155\1\156\1\157\1"+
		"\160\1\161\1\162\1\163\4\uffff\1\164\1\165\1\166\1\167\1\170\1\171\1\172"+
		"\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\4\uffff\1\u0082\1\u0083"+
		"\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c"+
		"\1\u008d\1\u008e\1\u008f\4\uffff\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094"+
		"\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d"+
		"\4\uffff\1\u009e\1\u009f\1\u00a0}>";
	static final String[] DFA68_transitionS = {
			"\1\20\2\uffff\1\17\3\uffff\1\3\2\uffff\1\16\6\uffff\1\10\15\uffff\1\2"+
			"\1\uffff\1\12\24\uffff\1\13\5\uffff\1\6\2\uffff\1\14\6\uffff\1\4\2\uffff"+
			"\1\7\1\uffff\1\5\13\uffff\1\15\5\uffff\1\11\2\uffff\1\4\2\uffff\1\4\1"+
			"\uffff\1\1",
			"\1\35\1\42\2\uffff\1\45\1\24\1\30\11\uffff\1\21\1\uffff\1\46\3\uffff"+
			"\1\46\1\33\10\uffff\1\31\6\uffff\1\34\1\24\12\uffff\1\30\10\uffff\1\25"+
			"\1\23\1\27\3\uffff\1\37\1\40\2\uffff\1\31\4\uffff\1\26\1\uffff\1\22\1"+
			"\44\1\uffff\1\30\1\36\1\31\3\uffff\1\41\5\uffff\1\32\14\uffff\1\43",
			"\1\51\105\uffff\1\52",
			"\1\72\2\uffff\1\71\3\uffff\1\53\2\uffff\1\70\6\uffff\1\62\15\uffff\1"+
			"\60\1\uffff\1\64\24\uffff\1\65\5\uffff\1\56\2\uffff\1\66\6\uffff\1\54"+
			"\2\uffff\1\61\1\uffff\1\55\13\uffff\1\67\5\uffff\1\63\2\uffff\1\54\2"+
			"\uffff\1\54\1\uffff\1\57",
			"\1\107\2\uffff\1\106\6\uffff\1\105\6\uffff\1\77\15\uffff\1\75\1\uffff"+
			"\1\101\24\uffff\1\102\5\uffff\1\73\2\uffff\1\103\11\uffff\1\76\15\uffff"+
			"\1\104\5\uffff\1\100\7\uffff\1\74",
			"\1\130\2\uffff\1\127\3\uffff\1\113\2\uffff\1\126\6\uffff\1\120\15\uffff"+
			"\1\112\1\uffff\1\122\24\uffff\1\123\5\uffff\1\116\2\uffff\1\124\6\uffff"+
			"\1\114\2\uffff\1\117\1\uffff\1\115\11\uffff\1\110\1\uffff\1\125\5\uffff"+
			"\1\121\2\uffff\1\114\2\uffff\1\114\1\uffff\1\111",
			"\1\132\105\uffff\1\131",
			"\1\134\105\uffff\1\133",
			"\1\136\105\uffff\1\135",
			"\1\145\1\152\2\uffff\1\45\1\uffff\1\140\13\uffff\1\46\3\uffff\1\46\1"+
			"\143\10\uffff\1\141\6\uffff\1\144\13\uffff\1\140\12\uffff\1\137\3\uffff"+
			"\1\147\1\150\2\uffff\1\141\7\uffff\1\154\1\uffff\1\140\1\146\1\141\3"+
			"\uffff\1\151\5\uffff\1\142\14\uffff\1\153",
			"\1\167\1\174\2\uffff\1\45\1\uffff\1\162\13\uffff\1\46\3\uffff\1\46\1"+
			"\165\10\uffff\1\163\6\uffff\1\166\13\uffff\1\162\12\uffff\1\161\3\uffff"+
			"\1\171\1\172\2\uffff\1\163\7\uffff\1\176\1\uffff\1\162\1\170\1\163\3"+
			"\uffff\1\173\5\uffff\1\164\14\uffff\1\175",
			"\1\u0089\1\u008e\2\uffff\1\45\1\uffff\1\u0084\13\uffff\1\46\3\uffff"+
			"\1\46\1\u0087\10\uffff\1\u0085\6\uffff\1\u0088\13\uffff\1\u0084\12\uffff"+
			"\1\u0083\3\uffff\1\u008b\1\u008c\2\uffff\1\u0085\7\uffff\1\u0090\1\uffff"+
			"\1\u0084\1\u008a\1\u0085\3\uffff\1\u008d\5\uffff\1\u0086\14\uffff\1\u008f",
			"\1\u009b\1\u00a0\2\uffff\1\45\1\uffff\1\u0096\13\uffff\1\46\3\uffff"+
			"\1\46\1\u0099\10\uffff\1\u0097\6\uffff\1\u009a\13\uffff\1\u0096\12\uffff"+
			"\1\u0095\3\uffff\1\u009d\1\u009e\2\uffff\1\u0097\7\uffff\1\u00a2\1\uffff"+
			"\1\u0096\1\u009c\1\u0097\3\uffff\1\u009f\5\uffff\1\u0098\14\uffff\1\u00a1",
			"\1\u00ad\1\u00b2\2\uffff\1\45\1\uffff\1\u00a8\13\uffff\1\46\3\uffff"+
			"\1\46\1\u00ab\10\uffff\1\u00a9\6\uffff\1\u00ac\13\uffff\1\u00a8\12\uffff"+
			"\1\u00a7\3\uffff\1\u00af\1\u00b0\2\uffff\1\u00a9\7\uffff\1\u00b4\1\uffff"+
			"\1\u00a8\1\u00ae\1\u00a9\3\uffff\1\u00b1\5\uffff\1\u00aa\14\uffff\1\u00b3",
			"\1\u00bf\1\u00c4\2\uffff\1\45\1\uffff\1\u00ba\13\uffff\1\46\3\uffff"+
			"\1\46\1\u00bd\10\uffff\1\u00bb\6\uffff\1\u00be\13\uffff\1\u00ba\12\uffff"+
			"\1\u00b9\3\uffff\1\u00c1\1\u00c2\2\uffff\1\u00bb\7\uffff\1\u00c6\1\uffff"+
			"\1\u00ba\1\u00c0\1\u00bb\3\uffff\1\u00c3\5\uffff\1\u00bc\14\uffff\1\u00c5",
			"\1\u00cb",
			"\1\u00cd\105\uffff\1\u00cc",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
	static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
	static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
	static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
	static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
	static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
	static final short[][] DFA68_transition;

	static {
		int numStates = DFA68_transitionS.length;
		DFA68_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
		}
	}

	protected class DFA68 extends DFA {

		public DFA68(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 68;
			this.eot = DFA68_eot;
			this.eof = DFA68_eof;
			this.min = DFA68_min;
			this.max = DFA68_max;
			this.accept = DFA68_accept;
			this.special = DFA68_special;
			this.transition = DFA68_transition;
		}
		@Override
		public String getDescription() {
			return "395:7: ( keyValuePair | expression )";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA68_17 = input.LA(1);
						 
						int index68_17 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_17);
						if ( s>=0 ) return s;
						break;
					case 1 : 
						int LA68_18 = input.LA(1);
						 
						int index68_18 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_18);
						if ( s>=0 ) return s;
						break;
					case 2 : 
						int LA68_19 = input.LA(1);
						 
						int index68_19 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_19);
						if ( s>=0 ) return s;
						break;
					case 3 : 
						int LA68_20 = input.LA(1);
						 
						int index68_20 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_20);
						if ( s>=0 ) return s;
						break;
					case 4 : 
						int LA68_21 = input.LA(1);
						 
						int index68_21 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_21);
						if ( s>=0 ) return s;
						break;
					case 5 : 
						int LA68_22 = input.LA(1);
						 
						int index68_22 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_22);
						if ( s>=0 ) return s;
						break;
					case 6 : 
						int LA68_23 = input.LA(1);
						 
						int index68_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_23);
						if ( s>=0 ) return s;
						break;
					case 7 : 
						int LA68_24 = input.LA(1);
						 
						int index68_24 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_24);
						if ( s>=0 ) return s;
						break;
					case 8 : 
						int LA68_25 = input.LA(1);
						 
						int index68_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_25);
						if ( s>=0 ) return s;
						break;
					case 9 : 
						int LA68_26 = input.LA(1);
						 
						int index68_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_26);
						if ( s>=0 ) return s;
						break;
					case 10 : 
						int LA68_27 = input.LA(1);
						 
						int index68_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_27);
						if ( s>=0 ) return s;
						break;
					case 11 : 
						int LA68_28 = input.LA(1);
						 
						int index68_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_28);
						if ( s>=0 ) return s;
						break;
					case 12 : 
						int LA68_29 = input.LA(1);
						 
						int index68_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_29);
						if ( s>=0 ) return s;
						break;
					case 13 : 
						int LA68_30 = input.LA(1);
						 
						int index68_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_30);
						if ( s>=0 ) return s;
						break;
					case 14 : 
						int LA68_31 = input.LA(1);
						 
						int index68_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_31);
						if ( s>=0 ) return s;
						break;
					case 15 : 
						int LA68_32 = input.LA(1);
						 
						int index68_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_32);
						if ( s>=0 ) return s;
						break;
					case 16 : 
						int LA68_33 = input.LA(1);
						 
						int index68_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_33);
						if ( s>=0 ) return s;
						break;
					case 17 : 
						int LA68_34 = input.LA(1);
						 
						int index68_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_34);
						if ( s>=0 ) return s;
						break;
					case 18 : 
						int LA68_35 = input.LA(1);
						 
						int index68_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_35);
						if ( s>=0 ) return s;
						break;
					case 19 : 
						int LA68_36 = input.LA(1);
						 
						int index68_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_36);
						if ( s>=0 ) return s;
						break;
					case 20 : 
						int LA68_41 = input.LA(1);
						 
						int index68_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_41);
						if ( s>=0 ) return s;
						break;
					case 21 : 
						int LA68_42 = input.LA(1);
						 
						int index68_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_42);
						if ( s>=0 ) return s;
						break;
					case 22 : 
						int LA68_43 = input.LA(1);
						 
						int index68_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_43);
						if ( s>=0 ) return s;
						break;
					case 23 : 
						int LA68_44 = input.LA(1);
						 
						int index68_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_44);
						if ( s>=0 ) return s;
						break;
					case 24 : 
						int LA68_45 = input.LA(1);
						 
						int index68_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_45);
						if ( s>=0 ) return s;
						break;
					case 25 : 
						int LA68_46 = input.LA(1);
						 
						int index68_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_46);
						if ( s>=0 ) return s;
						break;
					case 26 : 
						int LA68_47 = input.LA(1);
						 
						int index68_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_47);
						if ( s>=0 ) return s;
						break;
					case 27 : 
						int LA68_48 = input.LA(1);
						 
						int index68_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_48);
						if ( s>=0 ) return s;
						break;
					case 28 : 
						int LA68_49 = input.LA(1);
						 
						int index68_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_49);
						if ( s>=0 ) return s;
						break;
					case 29 : 
						int LA68_50 = input.LA(1);
						 
						int index68_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_50);
						if ( s>=0 ) return s;
						break;
					case 30 : 
						int LA68_51 = input.LA(1);
						 
						int index68_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_51);
						if ( s>=0 ) return s;
						break;
					case 31 : 
						int LA68_52 = input.LA(1);
						 
						int index68_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_52);
						if ( s>=0 ) return s;
						break;
					case 32 : 
						int LA68_53 = input.LA(1);
						 
						int index68_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_53);
						if ( s>=0 ) return s;
						break;
					case 33 : 
						int LA68_54 = input.LA(1);
						 
						int index68_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_54);
						if ( s>=0 ) return s;
						break;
					case 34 : 
						int LA68_55 = input.LA(1);
						 
						int index68_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_55);
						if ( s>=0 ) return s;
						break;
					case 35 : 
						int LA68_56 = input.LA(1);
						 
						int index68_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_56);
						if ( s>=0 ) return s;
						break;
					case 36 : 
						int LA68_57 = input.LA(1);
						 
						int index68_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_57);
						if ( s>=0 ) return s;
						break;
					case 37 : 
						int LA68_58 = input.LA(1);
						 
						int index68_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_58);
						if ( s>=0 ) return s;
						break;
					case 38 : 
						int LA68_59 = input.LA(1);
						 
						int index68_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_59);
						if ( s>=0 ) return s;
						break;
					case 39 : 
						int LA68_60 = input.LA(1);
						 
						int index68_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_60);
						if ( s>=0 ) return s;
						break;
					case 40 : 
						int LA68_61 = input.LA(1);
						 
						int index68_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_61);
						if ( s>=0 ) return s;
						break;
					case 41 : 
						int LA68_62 = input.LA(1);
						 
						int index68_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_62);
						if ( s>=0 ) return s;
						break;
					case 42 : 
						int LA68_63 = input.LA(1);
						 
						int index68_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_63);
						if ( s>=0 ) return s;
						break;
					case 43 : 
						int LA68_64 = input.LA(1);
						 
						int index68_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_64);
						if ( s>=0 ) return s;
						break;
					case 44 : 
						int LA68_65 = input.LA(1);
						 
						int index68_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_65);
						if ( s>=0 ) return s;
						break;
					case 45 : 
						int LA68_66 = input.LA(1);
						 
						int index68_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_66);
						if ( s>=0 ) return s;
						break;
					case 46 : 
						int LA68_67 = input.LA(1);
						 
						int index68_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_67);
						if ( s>=0 ) return s;
						break;
					case 47 : 
						int LA68_68 = input.LA(1);
						 
						int index68_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_68);
						if ( s>=0 ) return s;
						break;
					case 48 : 
						int LA68_69 = input.LA(1);
						 
						int index68_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_69);
						if ( s>=0 ) return s;
						break;
					case 49 : 
						int LA68_70 = input.LA(1);
						 
						int index68_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_70);
						if ( s>=0 ) return s;
						break;
					case 50 : 
						int LA68_71 = input.LA(1);
						 
						int index68_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_71);
						if ( s>=0 ) return s;
						break;
					case 51 : 
						int LA68_72 = input.LA(1);
						 
						int index68_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_72);
						if ( s>=0 ) return s;
						break;
					case 52 : 
						int LA68_73 = input.LA(1);
						 
						int index68_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_73);
						if ( s>=0 ) return s;
						break;
					case 53 : 
						int LA68_74 = input.LA(1);
						 
						int index68_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_74);
						if ( s>=0 ) return s;
						break;
					case 54 : 
						int LA68_75 = input.LA(1);
						 
						int index68_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_75);
						if ( s>=0 ) return s;
						break;
					case 55 : 
						int LA68_76 = input.LA(1);
						 
						int index68_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_76);
						if ( s>=0 ) return s;
						break;
					case 56 : 
						int LA68_77 = input.LA(1);
						 
						int index68_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_77);
						if ( s>=0 ) return s;
						break;
					case 57 : 
						int LA68_78 = input.LA(1);
						 
						int index68_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_78);
						if ( s>=0 ) return s;
						break;
					case 58 : 
						int LA68_79 = input.LA(1);
						 
						int index68_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_79);
						if ( s>=0 ) return s;
						break;
					case 59 : 
						int LA68_80 = input.LA(1);
						 
						int index68_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_80);
						if ( s>=0 ) return s;
						break;
					case 60 : 
						int LA68_81 = input.LA(1);
						 
						int index68_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_81);
						if ( s>=0 ) return s;
						break;
					case 61 : 
						int LA68_82 = input.LA(1);
						 
						int index68_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_82);
						if ( s>=0 ) return s;
						break;
					case 62 : 
						int LA68_83 = input.LA(1);
						 
						int index68_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_83);
						if ( s>=0 ) return s;
						break;
					case 63 : 
						int LA68_84 = input.LA(1);
						 
						int index68_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_84);
						if ( s>=0 ) return s;
						break;
					case 64 : 
						int LA68_85 = input.LA(1);
						 
						int index68_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_85);
						if ( s>=0 ) return s;
						break;
					case 65 : 
						int LA68_86 = input.LA(1);
						 
						int index68_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_86);
						if ( s>=0 ) return s;
						break;
					case 66 : 
						int LA68_87 = input.LA(1);
						 
						int index68_87 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_87);
						if ( s>=0 ) return s;
						break;
					case 67 : 
						int LA68_88 = input.LA(1);
						 
						int index68_88 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_88);
						if ( s>=0 ) return s;
						break;
					case 68 : 
						int LA68_89 = input.LA(1);
						 
						int index68_89 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_89);
						if ( s>=0 ) return s;
						break;
					case 69 : 
						int LA68_90 = input.LA(1);
						 
						int index68_90 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_90);
						if ( s>=0 ) return s;
						break;
					case 70 : 
						int LA68_91 = input.LA(1);
						 
						int index68_91 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_91);
						if ( s>=0 ) return s;
						break;
					case 71 : 
						int LA68_92 = input.LA(1);
						 
						int index68_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_92);
						if ( s>=0 ) return s;
						break;
					case 72 : 
						int LA68_93 = input.LA(1);
						 
						int index68_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_93);
						if ( s>=0 ) return s;
						break;
					case 73 : 
						int LA68_94 = input.LA(1);
						 
						int index68_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_94);
						if ( s>=0 ) return s;
						break;
					case 74 : 
						int LA68_95 = input.LA(1);
						 
						int index68_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_95);
						if ( s>=0 ) return s;
						break;
					case 75 : 
						int LA68_96 = input.LA(1);
						 
						int index68_96 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_96);
						if ( s>=0 ) return s;
						break;
					case 76 : 
						int LA68_97 = input.LA(1);
						 
						int index68_97 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_97);
						if ( s>=0 ) return s;
						break;
					case 77 : 
						int LA68_98 = input.LA(1);
						 
						int index68_98 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_98);
						if ( s>=0 ) return s;
						break;
					case 78 : 
						int LA68_99 = input.LA(1);
						 
						int index68_99 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_99);
						if ( s>=0 ) return s;
						break;
					case 79 : 
						int LA68_100 = input.LA(1);
						 
						int index68_100 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_100);
						if ( s>=0 ) return s;
						break;
					case 80 : 
						int LA68_101 = input.LA(1);
						 
						int index68_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_101);
						if ( s>=0 ) return s;
						break;
					case 81 : 
						int LA68_102 = input.LA(1);
						 
						int index68_102 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_102);
						if ( s>=0 ) return s;
						break;
					case 82 : 
						int LA68_103 = input.LA(1);
						 
						int index68_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_103);
						if ( s>=0 ) return s;
						break;
					case 83 : 
						int LA68_104 = input.LA(1);
						 
						int index68_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_104);
						if ( s>=0 ) return s;
						break;
					case 84 : 
						int LA68_105 = input.LA(1);
						 
						int index68_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_105);
						if ( s>=0 ) return s;
						break;
					case 85 : 
						int LA68_106 = input.LA(1);
						 
						int index68_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_106);
						if ( s>=0 ) return s;
						break;
					case 86 : 
						int LA68_107 = input.LA(1);
						 
						int index68_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_107);
						if ( s>=0 ) return s;
						break;
					case 87 : 
						int LA68_108 = input.LA(1);
						 
						int index68_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_108);
						if ( s>=0 ) return s;
						break;
					case 88 : 
						int LA68_113 = input.LA(1);
						 
						int index68_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_113);
						if ( s>=0 ) return s;
						break;
					case 89 : 
						int LA68_114 = input.LA(1);
						 
						int index68_114 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_114);
						if ( s>=0 ) return s;
						break;
					case 90 : 
						int LA68_115 = input.LA(1);
						 
						int index68_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_115);
						if ( s>=0 ) return s;
						break;
					case 91 : 
						int LA68_116 = input.LA(1);
						 
						int index68_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_116);
						if ( s>=0 ) return s;
						break;
					case 92 : 
						int LA68_117 = input.LA(1);
						 
						int index68_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_117);
						if ( s>=0 ) return s;
						break;
					case 93 : 
						int LA68_118 = input.LA(1);
						 
						int index68_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_118);
						if ( s>=0 ) return s;
						break;
					case 94 : 
						int LA68_119 = input.LA(1);
						 
						int index68_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_119);
						if ( s>=0 ) return s;
						break;
					case 95 : 
						int LA68_120 = input.LA(1);
						 
						int index68_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_120);
						if ( s>=0 ) return s;
						break;
					case 96 : 
						int LA68_121 = input.LA(1);
						 
						int index68_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_121);
						if ( s>=0 ) return s;
						break;
					case 97 : 
						int LA68_122 = input.LA(1);
						 
						int index68_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_122);
						if ( s>=0 ) return s;
						break;
					case 98 : 
						int LA68_123 = input.LA(1);
						 
						int index68_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_123);
						if ( s>=0 ) return s;
						break;
					case 99 : 
						int LA68_124 = input.LA(1);
						 
						int index68_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_124);
						if ( s>=0 ) return s;
						break;
					case 100 : 
						int LA68_125 = input.LA(1);
						 
						int index68_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_125);
						if ( s>=0 ) return s;
						break;
					case 101 : 
						int LA68_126 = input.LA(1);
						 
						int index68_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_126);
						if ( s>=0 ) return s;
						break;
					case 102 : 
						int LA68_131 = input.LA(1);
						 
						int index68_131 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_131);
						if ( s>=0 ) return s;
						break;
					case 103 : 
						int LA68_132 = input.LA(1);
						 
						int index68_132 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_132);
						if ( s>=0 ) return s;
						break;
					case 104 : 
						int LA68_133 = input.LA(1);
						 
						int index68_133 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_133);
						if ( s>=0 ) return s;
						break;
					case 105 : 
						int LA68_134 = input.LA(1);
						 
						int index68_134 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_134);
						if ( s>=0 ) return s;
						break;
					case 106 : 
						int LA68_135 = input.LA(1);
						 
						int index68_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_135);
						if ( s>=0 ) return s;
						break;
					case 107 : 
						int LA68_136 = input.LA(1);
						 
						int index68_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_136);
						if ( s>=0 ) return s;
						break;
					case 108 : 
						int LA68_137 = input.LA(1);
						 
						int index68_137 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_137);
						if ( s>=0 ) return s;
						break;
					case 109 : 
						int LA68_138 = input.LA(1);
						 
						int index68_138 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_138);
						if ( s>=0 ) return s;
						break;
					case 110 : 
						int LA68_139 = input.LA(1);
						 
						int index68_139 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_139);
						if ( s>=0 ) return s;
						break;
					case 111 : 
						int LA68_140 = input.LA(1);
						 
						int index68_140 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_140);
						if ( s>=0 ) return s;
						break;
					case 112 : 
						int LA68_141 = input.LA(1);
						 
						int index68_141 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_141);
						if ( s>=0 ) return s;
						break;
					case 113 : 
						int LA68_142 = input.LA(1);
						 
						int index68_142 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_142);
						if ( s>=0 ) return s;
						break;
					case 114 : 
						int LA68_143 = input.LA(1);
						 
						int index68_143 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_143);
						if ( s>=0 ) return s;
						break;
					case 115 : 
						int LA68_144 = input.LA(1);
						 
						int index68_144 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_144);
						if ( s>=0 ) return s;
						break;
					case 116 : 
						int LA68_149 = input.LA(1);
						 
						int index68_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_149);
						if ( s>=0 ) return s;
						break;
					case 117 : 
						int LA68_150 = input.LA(1);
						 
						int index68_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_150);
						if ( s>=0 ) return s;
						break;
					case 118 : 
						int LA68_151 = input.LA(1);
						 
						int index68_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_151);
						if ( s>=0 ) return s;
						break;
					case 119 : 
						int LA68_152 = input.LA(1);
						 
						int index68_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_152);
						if ( s>=0 ) return s;
						break;
					case 120 : 
						int LA68_153 = input.LA(1);
						 
						int index68_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_153);
						if ( s>=0 ) return s;
						break;
					case 121 : 
						int LA68_154 = input.LA(1);
						 
						int index68_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_154);
						if ( s>=0 ) return s;
						break;
					case 122 : 
						int LA68_155 = input.LA(1);
						 
						int index68_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_155);
						if ( s>=0 ) return s;
						break;
					case 123 : 
						int LA68_156 = input.LA(1);
						 
						int index68_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_156);
						if ( s>=0 ) return s;
						break;
					case 124 : 
						int LA68_157 = input.LA(1);
						 
						int index68_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_157);
						if ( s>=0 ) return s;
						break;
					case 125 : 
						int LA68_158 = input.LA(1);
						 
						int index68_158 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_158);
						if ( s>=0 ) return s;
						break;
					case 126 : 
						int LA68_159 = input.LA(1);
						 
						int index68_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_159);
						if ( s>=0 ) return s;
						break;
					case 127 : 
						int LA68_160 = input.LA(1);
						 
						int index68_160 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_160);
						if ( s>=0 ) return s;
						break;
					case 128 : 
						int LA68_161 = input.LA(1);
						 
						int index68_161 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_161);
						if ( s>=0 ) return s;
						break;
					case 129 : 
						int LA68_162 = input.LA(1);
						 
						int index68_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_162);
						if ( s>=0 ) return s;
						break;
					case 130 : 
						int LA68_167 = input.LA(1);
						 
						int index68_167 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_167);
						if ( s>=0 ) return s;
						break;
					case 131 : 
						int LA68_168 = input.LA(1);
						 
						int index68_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_168);
						if ( s>=0 ) return s;
						break;
					case 132 : 
						int LA68_169 = input.LA(1);
						 
						int index68_169 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_169);
						if ( s>=0 ) return s;
						break;
					case 133 : 
						int LA68_170 = input.LA(1);
						 
						int index68_170 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_170);
						if ( s>=0 ) return s;
						break;
					case 134 : 
						int LA68_171 = input.LA(1);
						 
						int index68_171 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_171);
						if ( s>=0 ) return s;
						break;
					case 135 : 
						int LA68_172 = input.LA(1);
						 
						int index68_172 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_172);
						if ( s>=0 ) return s;
						break;
					case 136 : 
						int LA68_173 = input.LA(1);
						 
						int index68_173 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_173);
						if ( s>=0 ) return s;
						break;
					case 137 : 
						int LA68_174 = input.LA(1);
						 
						int index68_174 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_174);
						if ( s>=0 ) return s;
						break;
					case 138 : 
						int LA68_175 = input.LA(1);
						 
						int index68_175 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_175);
						if ( s>=0 ) return s;
						break;
					case 139 : 
						int LA68_176 = input.LA(1);
						 
						int index68_176 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_176);
						if ( s>=0 ) return s;
						break;
					case 140 : 
						int LA68_177 = input.LA(1);
						 
						int index68_177 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_177);
						if ( s>=0 ) return s;
						break;
					case 141 : 
						int LA68_178 = input.LA(1);
						 
						int index68_178 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_178);
						if ( s>=0 ) return s;
						break;
					case 142 : 
						int LA68_179 = input.LA(1);
						 
						int index68_179 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_179);
						if ( s>=0 ) return s;
						break;
					case 143 : 
						int LA68_180 = input.LA(1);
						 
						int index68_180 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_180);
						if ( s>=0 ) return s;
						break;
					case 144 : 
						int LA68_185 = input.LA(1);
						 
						int index68_185 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_185);
						if ( s>=0 ) return s;
						break;
					case 145 : 
						int LA68_186 = input.LA(1);
						 
						int index68_186 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_186);
						if ( s>=0 ) return s;
						break;
					case 146 : 
						int LA68_187 = input.LA(1);
						 
						int index68_187 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_187);
						if ( s>=0 ) return s;
						break;
					case 147 : 
						int LA68_188 = input.LA(1);
						 
						int index68_188 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_188);
						if ( s>=0 ) return s;
						break;
					case 148 : 
						int LA68_189 = input.LA(1);
						 
						int index68_189 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_189);
						if ( s>=0 ) return s;
						break;
					case 149 : 
						int LA68_190 = input.LA(1);
						 
						int index68_190 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_190);
						if ( s>=0 ) return s;
						break;
					case 150 : 
						int LA68_191 = input.LA(1);
						 
						int index68_191 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_191);
						if ( s>=0 ) return s;
						break;
					case 151 : 
						int LA68_192 = input.LA(1);
						 
						int index68_192 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_192);
						if ( s>=0 ) return s;
						break;
					case 152 : 
						int LA68_193 = input.LA(1);
						 
						int index68_193 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_193);
						if ( s>=0 ) return s;
						break;
					case 153 : 
						int LA68_194 = input.LA(1);
						 
						int index68_194 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_194);
						if ( s>=0 ) return s;
						break;
					case 154 : 
						int LA68_195 = input.LA(1);
						 
						int index68_195 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_195);
						if ( s>=0 ) return s;
						break;
					case 155 : 
						int LA68_196 = input.LA(1);
						 
						int index68_196 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_196);
						if ( s>=0 ) return s;
						break;
					case 156 : 
						int LA68_197 = input.LA(1);
						 
						int index68_197 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_197);
						if ( s>=0 ) return s;
						break;
					case 157 : 
						int LA68_198 = input.LA(1);
						 
						int index68_198 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_198);
						if ( s>=0 ) return s;
						break;
					case 158 : 
						int LA68_203 = input.LA(1);
						 
						int index68_203 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_203);
						if ( s>=0 ) return s;
						break;
					case 159 : 
						int LA68_204 = input.LA(1);
						 
						int index68_204 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_204);
						if ( s>=0 ) return s;
						break;
					case 160 : 
						int LA68_205 = input.LA(1);
						 
						int index68_205 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred100_Php()) ) {s = 37;}
						else if ( (true) ) {s = 38;}
						 
						input.seek(index68_205);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 68, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_statement_in_prog899 = new BitSet(new long[]{0x9D1001B08093A252L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_simpleStatement_in_statement912 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_BodyString_in_statement915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OpenCurlyBrace_in_statement923 = new BitSet(new long[]{0x9D1001B08093A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_statement925 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_CloseCurlyBrace_in_statement927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bracketedBlock_in_statement939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classDefinition_in_statement952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDefinition_in_statement960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexStatement_in_statement968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleStatement_in_statement976 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_statement978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OpenCurlyBrace_in_bracketedBlock1000 = new BitSet(new long[]{0x9D1001B08293A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_bracketedBlock1004 = new BitSet(new long[]{0x9D1001B08293A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_CloseCurlyBrace_in_bracketedBlock1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDefinition1033 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_interfaceDefinition1037 = new BitSet(new long[]{0x0002000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_interfaceExtends_in_interfaceDefinition1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_OpenCurlyBrace_in_interfaceDefinition1050 = new BitSet(new long[]{0x0400000042000030L,0x0000002000000000L});
	public static final BitSet FOLLOW_interfaceMember_in_interfaceDefinition1060 = new BitSet(new long[]{0x0400000042000030L,0x0000002000000000L});
	public static final BitSet FOLLOW_CloseCurlyBrace_in_interfaceDefinition1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_interfaceExtends1111 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1114 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_interfaceExtends1117 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_interfaceExtends1120 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Const_in_interfaceMember1138 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1140 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Equals_in_interfaceMember1143 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
	public static final BitSet FOLLOW_atom_in_interfaceMember1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_interfaceMember1149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldModifier_in_interfaceMember1177 = new BitSet(new long[]{0x0400000000000030L,0x0000002000000000L});
	public static final BitSet FOLLOW_Function_in_interfaceMember1180 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_interfaceMember1182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_parametersDefinition_in_interfaceMember1184 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_interfaceMember1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classModifier_in_classDefinition1230 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_Class_in_classDefinition1242 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_classDefinition1246 = new BitSet(new long[]{0x0002000000000000L,0x0000000000040002L});
	public static final BitSet FOLLOW_Extends_in_classDefinition1258 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_classDefinition1262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040002L});
	public static final BitSet FOLLOW_classImplements_in_classDefinition1275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_OpenCurlyBrace_in_classDefinition1286 = new BitSet(new long[]{0x0400002042000030L,0x0000102000000000L});
	public static final BitSet FOLLOW_classMember_in_classDefinition1296 = new BitSet(new long[]{0x0400002042000030L,0x0000102000000000L});
	public static final BitSet FOLLOW_CloseCurlyBrace_in_classDefinition1307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Implements_in_classImplements1389 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_classImplements1393 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_classImplements1396 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_classImplements1399 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_fieldModifier_in_classMember1419 = new BitSet(new long[]{0x0400000000000030L,0x0000002000000000L});
	public static final BitSet FOLLOW_Function_in_classMember1422 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_classMember1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_parametersDefinition_in_classMember1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000200040000L});
	public static final BitSet FOLLOW_bracketedBlock_in_classMember1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SemiColon_in_classMember1442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Var_in_classMember1479 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Dollar_in_classMember1481 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_classMember1483 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Equals_in_classMember1486 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
	public static final BitSet FOLLOW_atom_in_classMember1488 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_classMember1492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Const_in_classMember1525 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_classMember1527 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Equals_in_classMember1530 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
	public static final BitSet FOLLOW_atom_in_classMember1532 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_classMember1536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldModifier_in_classMember1564 = new BitSet(new long[]{0x0000002000000030L,0x0000002000000000L});
	public static final BitSet FOLLOW_Dollar_in_classMember1568 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_classMember1570 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Equals_in_classMember1574 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
	public static final BitSet FOLLOW_atom_in_classMember1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_classMember1580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dollar_in_fieldDefinition1628 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_fieldDefinition1630 = new BitSet(new long[]{0x0000400000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_Equals_in_fieldDefinition1633 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
	public static final BitSet FOLLOW_atom_in_fieldDefinition1635 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_fieldDefinition1639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Abstract_in_classModifier1674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_complexStatement1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_complexStatement1719 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_complexStatement1723 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CloseBrace_in_complexStatement1725 = new BitSet(new long[]{0x9D1001B08093A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_complexStatement1729 = new BitSet(new long[]{0x0000060000000002L});
	public static final BitSet FOLLOW_conditional_in_complexStatement1731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_complexStatement1762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_complexStatement1764 = new BitSet(new long[]{0x100000A000812240L,0x00000A4A20029024L});
	public static final BitSet FOLLOW_forInit_in_complexStatement1766 = new BitSet(new long[]{0x100000A000812240L,0x00000A4A20029024L});
	public static final BitSet FOLLOW_forCondition_in_complexStatement1768 = new BitSet(new long[]{0x100000A001812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_forUpdate_in_complexStatement1770 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CloseBrace_in_complexStatement1772 = new BitSet(new long[]{0x9D1001B08093A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_complexStatement1774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_complexStatement1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_complexStatement1798 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_complexStatement1800 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_complexStatement1802 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_arrayEntry_in_complexStatement1804 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CloseBrace_in_complexStatement1806 = new BitSet(new long[]{0x9D1001B08093A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_complexStatement1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_While_in_complexStatement1828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_complexStatement1830 = new BitSet(new long[]{0x100000A001812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_complexStatement1834 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CloseBrace_in_complexStatement1837 = new BitSet(new long[]{0x9D1001B08093A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_complexStatement1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Do_in_complexStatement1858 = new BitSet(new long[]{0x9D1001B08093A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_complexStatement1860 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_While_in_complexStatement1862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_complexStatement1864 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_complexStatement1868 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CloseBrace_in_complexStatement1870 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_complexStatement1872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Switch_in_complexStatement1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_complexStatement1893 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_complexStatement1895 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CloseBrace_in_complexStatement1897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_OpenCurlyBrace_in_complexStatement1899 = new BitSet(new long[]{0x0000000402040000L});
	public static final BitSet FOLLOW_cases_in_complexStatement1900 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_CloseCurlyBrace_in_complexStatement1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDefinition_in_complexStatement1919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Echo_in_simpleStatement1936 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_commaList_in_simpleStatement1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Throw_in_simpleStatement1947 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_simpleStatement1950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Global_in_simpleStatement1958 = new BitSet(new long[]{0x0000002000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_name_in_simpleStatement1961 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_simpleStatement1964 = new BitSet(new long[]{0x0000002000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_name_in_simpleStatement1967 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Static_in_simpleStatement1977 = new BitSet(new long[]{0x0000002000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_variable_in_simpleStatement1980 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_Equals_in_simpleStatement1982 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
	public static final BitSet FOLLOW_atom_in_simpleStatement1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Break_in_simpleStatement1993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_Integer_in_simpleStatement1996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Continue_in_simpleStatement2005 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_Integer_in_simpleStatement2008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Return_in_simpleStatement2022 = new BitSet(new long[]{0x100000A000812242L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_simpleStatement2025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RequireOperator_in_simpleStatement2034 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_simpleStatement2037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_simpleStatement2045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ElseIf_in_conditional2063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_conditional2065 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_conditional2069 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CloseBrace_in_conditional2071 = new BitSet(new long[]{0x9D1001B08093A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_conditional2075 = new BitSet(new long[]{0x0000060000000002L});
	public static final BitSet FOLLOW_conditional_in_conditional2077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Else_in_conditional2101 = new BitSet(new long[]{0x9D1001B08093A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_conditional2103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commaList_in_forInit2124 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_forInit2127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commaList_in_forCondition2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_SemiColon_in_forCondition2156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commaList_in_forUpdate2186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_casestatement_in_cases2214 = new BitSet(new long[]{0x0000000400040002L});
	public static final BitSet FOLLOW_defaultcase_in_cases2218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Case_in_casestatement2236 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_casestatement2239 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Colon_in_casestatement2241 = new BitSet(new long[]{0x9D1001B08093A252L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_casestatement2244 = new BitSet(new long[]{0x9D1001B08093A252L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_Default_in_defaultcase2264 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Colon_in_defaultcase2267 = new BitSet(new long[]{0x9D1001B08093A252L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_defaultcase2270 = new BitSet(new long[]{0x9D1001B08093A252L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_Function_in_functionDefinition2289 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_functionDefinition2291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_parametersDefinition_in_functionDefinition2293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_bracketedBlock_in_functionDefinition2295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OpenBrace_in_parametersDefinition2333 = new BitSet(new long[]{0x0000002001000040L});
	public static final BitSet FOLLOW_paramDef_in_parametersDefinition2336 = new BitSet(new long[]{0x0000000011000000L});
	public static final BitSet FOLLOW_Comma_in_parametersDefinition2339 = new BitSet(new long[]{0x0000002000000040L});
	public static final BitSet FOLLOW_paramDef_in_parametersDefinition2341 = new BitSet(new long[]{0x0000000011000000L});
	public static final BitSet FOLLOW_CloseBrace_in_parametersDefinition2347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramName_in_paramDef2374 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_Equals_in_paramDef2377 = new BitSet(new long[]{0x1000008000010200L,0x0000000820000020L});
	public static final BitSet FOLLOW_atom_in_paramDef2380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dollar_in_paramName2399 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_paramName2402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ampersand_in_paramName2410 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Dollar_in_paramName2412 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_paramName2414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_commaList2443 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_Comma_in_commaList2446 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_commaList2449 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_weakLogicalOr_in_expression2473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2490 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_Or_in_weakLogicalOr2493 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_weakLogicalXor_in_weakLogicalOr2496 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2515 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_Xor_in_weakLogicalXor2518 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_weakLogicalAnd_in_weakLogicalXor2521 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
	public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2544 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_And_in_weakLogicalAnd2547 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_assignment_in_weakLogicalAnd2550 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_name_in_assignment2569 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_set_in_assignment2572 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_assignment_in_assignment2581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ternary_in_assignment2590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOr_in_ternary2607 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_QuestionMark_in_ternary2609 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_ternary2611 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Colon_in_ternary2613 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_ternary2615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOr_in_ternary2634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalAnd_in_logicalOr2655 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_LogicalOr_in_logicalOr2658 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_logicalAnd_in_logicalOr2661 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_LogicalAnd_in_logicalAnd2683 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_bitwiseOr_in_logicalAnd2686 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_Pipe_in_bitwiseOr2712 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_bitWiseAnd_in_bitwiseOr2715 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2734 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_Ampersand_in_bitWiseAnd2737 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_equalityCheck_in_bitWiseAnd2740 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2759 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_EqualityOperator_in_equalityCheck2762 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_comparisionCheck_in_equalityCheck2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2788 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ComparisionOperator_in_comparisionCheck2791 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_bitWiseShift_in_comparisionCheck2794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addition_in_bitWiseShift2813 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_ShiftOperator_in_bitWiseShift2816 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_addition_in_bitWiseShift2819 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_multiplication_in_addition2842 = new BitSet(new long[]{0x0000004000000002L,0x0000000001001000L});
	public static final BitSet FOLLOW_set_in_addition2845 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_multiplication_in_addition2858 = new BitSet(new long[]{0x0000004000000002L,0x0000000001001000L});
	public static final BitSet FOLLOW_logicalNot_in_multiplication2877 = new BitSet(new long[]{0x0200000000001002L,0x0000000000400000L});
	public static final BitSet FOLLOW_set_in_multiplication2880 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_logicalNot_in_multiplication2893 = new BitSet(new long[]{0x0200000000001002L,0x0000000000400000L});
	public static final BitSet FOLLOW_Bang_in_logicalNot2912 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_logicalNot_in_logicalNot2915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instanceOf_in_logicalNot2923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_negateOrCast_in_instanceOf2940 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_Instanceof_in_instanceOf2943 = new BitSet(new long[]{0x100000A000810240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_negateOrCast_in_instanceOf2946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_negateOrCast2965 = new BitSet(new long[]{0x100000A000810240L,0x0000080820008024L});
	public static final BitSet FOLLOW_increment_in_negateOrCast2978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OpenBrace_in_negateOrCast2986 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_PrimitiveType_in_negateOrCast2988 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CloseBrace_in_negateOrCast2990 = new BitSet(new long[]{0x100000A000810240L,0x0000080820008024L});
	public static final BitSet FOLLOW_increment_in_negateOrCast2992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OpenBrace_in_negateOrCast3010 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_weakLogicalAnd_in_negateOrCast3013 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CloseBrace_in_negateOrCast3015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_increment_in_negateOrCast3024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IncrementOperator_in_increment3041 = new BitSet(new long[]{0x0000002000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_name_in_increment3043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_increment3061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_IncrementOperator_in_increment3063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_newOrClone_in_increment3081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_New_in_newOrClone3098 = new BitSet(new long[]{0x0000002000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_nameOrFunctionCall_in_newOrClone3101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_newOrClone3109 = new BitSet(new long[]{0x0000002000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_name_in_newOrClone3112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomOrReference_in_newOrClone3120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_atomOrReference3137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_in_atomOrReference3145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Array_in_arrayDeclaration3162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_arrayDeclaration3164 = new BitSet(new long[]{0x100000A001812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3167 = new BitSet(new long[]{0x0000000011000000L});
	public static final BitSet FOLLOW_Comma_in_arrayDeclaration3170 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_arrayEntry_in_arrayDeclaration3172 = new BitSet(new long[]{0x0000000011000000L});
	public static final BitSet FOLLOW_CloseBrace_in_arrayDeclaration3178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyValuePair_in_arrayEntry3205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_arrayEntry3209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_keyValuePair3228 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ArrayAssign_in_keyValuePair3230 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_keyValuePair3232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SingleQuotedString_in_atom3254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DoubleQuotedString_in_atom3258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HereDoc_in_atom3262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_in_atom3266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Real_in_atom3270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Boolean_in_atom3274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDeclaration_in_atom3278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Ampersand_in_reference3296 = new BitSet(new long[]{0x0000002000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameOrFunctionCall_in_reference3307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_nameOrFunctionCall3324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_nameOrFunctionCall3326 = new BitSet(new long[]{0x100000A001812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3329 = new BitSet(new long[]{0x0000000011000000L});
	public static final BitSet FOLLOW_Comma_in_nameOrFunctionCall3332 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_nameOrFunctionCall3334 = new BitSet(new long[]{0x0000000011000000L});
	public static final BitSet FOLLOW_CloseBrace_in_nameOrFunctionCall3340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_nameOrFunctionCall3359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticMemberAccess_in_name3371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_OpenSquareBrace_in_name3374 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CloseSquareBrace_in_name3377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccess_in_name3387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_OpenSquareBrace_in_name3390 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CloseSquareBrace_in_name3393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_name3403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_OpenSquareBrace_in_name3406 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CloseSquareBrace_in_name3409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UnquotedString_in_staticMemberAccess3432 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ClassMember_in_staticMemberAccess3434 = new BitSet(new long[]{0x0000002000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_variable_in_staticMemberAccess3437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_memberAccess3454 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080008L});
	public static final BitSet FOLLOW_OpenSquareBrace_in_memberAccess3467 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_memberAccess3470 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CloseSquareBrace_in_memberAccess3472 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080008L});
	public static final BitSet FOLLOW_InstanceMember_in_memberAccess3485 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_memberAccess3488 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080008L});
	public static final BitSet FOLLOW_Dollar_in_variable3511 = new BitSet(new long[]{0x0000002000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_variable_in_variable3514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UnquotedString_in_variable3522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleStatement_in_synpred3_Php912 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_BodyString_in_synpred3_Php915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OpenCurlyBrace_in_synpred4_Php923 = new BitSet(new long[]{0x9D1001B08093A250L,0x00002BE9A0069064L});
	public static final BitSet FOLLOW_statement_in_synpred4_Php925 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_CloseCurlyBrace_in_synpred4_Php927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bracketedBlock_in_synpred5_Php939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldModifier_in_synpred23_Php1419 = new BitSet(new long[]{0x0400000000000030L,0x0000002000000000L});
	public static final BitSet FOLLOW_Function_in_synpred23_Php1422 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_UnquotedString_in_synpred23_Php1424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_parametersDefinition_in_synpred23_Php1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000200040000L});
	public static final BitSet FOLLOW_bracketedBlock_in_synpred23_Php1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SemiColon_in_synpred23_Php1442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_synpred33_Php1731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_synpred53_Php2077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Or_in_synpred67_Php2493 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_weakLogicalXor_in_synpred67_Php2496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Xor_in_synpred68_Php2518 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_weakLogicalAnd_in_synpred68_Php2521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_And_in_synpred69_Php2547 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_assignment_in_synpred69_Php2550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_synpred71_Php2569 = new BitSet(new long[]{0x0000400000000800L});
	public static final BitSet FOLLOW_set_in_synpred71_Php2572 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_assignment_in_synpred71_Php2581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOr_in_synpred72_Php2607 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_QuestionMark_in_synpred72_Php2609 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_synpred72_Php2611 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Colon_in_synpred72_Php2613 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_synpred72_Php2615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_synpred94_Php3061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_IncrementOperator_in_synpred94_Php3063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_keyValuePair_in_synpred100_Php3205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_name_in_synpred110_Php3324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_OpenBrace_in_synpred110_Php3326 = new BitSet(new long[]{0x100000A001812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_synpred110_Php3329 = new BitSet(new long[]{0x0000000011000000L});
	public static final BitSet FOLLOW_Comma_in_synpred110_Php3332 = new BitSet(new long[]{0x100000A000812240L,0x00000A4820029024L});
	public static final BitSet FOLLOW_expression_in_synpred110_Php3334 = new BitSet(new long[]{0x0000000011000000L});
	public static final BitSet FOLLOW_CloseBrace_in_synpred110_Php3340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_memberAccess_in_synpred114_Php3387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
	public static final BitSet FOLLOW_OpenSquareBrace_in_synpred114_Php3390 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CloseSquareBrace_in_synpred114_Php3393 = new BitSet(new long[]{0x0000000000000002L});
}
