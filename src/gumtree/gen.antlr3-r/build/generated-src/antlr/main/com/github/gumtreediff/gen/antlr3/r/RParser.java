// $ANTLR 3.5.3 com/github/gumtreediff/gen/antlr3/r/R.g 2025-04-14 15:35:31
 package com.github.gumtreediff.gen.antlr3.r; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class RParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARROW", "ASSIGN", "AT", 
		"BITWISEAND", "BITWISEOR", "BRAKET", "BREAK", "CALL", "CARRET", "COLUMN", 
		"COMMA", "COMMENT", "DD", "DIV", "ELSE", "EQ", "ESC_SEQ", "EXPONENT", 
		"FALSE", "FIELD", "FOR", "FUNCTION", "GE", "GT", "HEX_DIGIT", "HEX_ESC", 
		"ID", "ID_NAME", "IF", "IN", "KW", "LBB", "LBRACE", "LBRAKET", "LE", "LINE_BREAK", 
		"LPAR", "LT", "MINUS", "MISSING_VAL", "MOD", "MULT", "NE", "NEWLINE", 
		"NEXT", "NOT", "NS_GET", "NS_GET_INT", "NULL", "NUMBER", "OCTAL_ESC", 
		"OP", "OP_NAME", "OR", "PARMS", "PLUS", "RBRACE", "RBRAKET", "REPEAT", 
		"RIGHT_ARROW", "RPAR", "SEMICOLUMN", "SEQUENCE", "STRING", "SUPER_ARROW", 
		"SUPER_RIGHT_ARROW", "TILDE", "TRUE", "UMINUS", "UNICODE_ESC", "UPLUS", 
		"UTILDE", "VARIATIC", "WHILE", "WS", "'--EOF--'"
	};
	public static final int EOF=-1;
	public static final int T__80=80;
	public static final int AND=4;
	public static final int ARROW=5;
	public static final int ASSIGN=6;
	public static final int AT=7;
	public static final int BITWISEAND=8;
	public static final int BITWISEOR=9;
	public static final int BRAKET=10;
	public static final int BREAK=11;
	public static final int CALL=12;
	public static final int CARRET=13;
	public static final int COLUMN=14;
	public static final int COMMA=15;
	public static final int COMMENT=16;
	public static final int DD=17;
	public static final int DIV=18;
	public static final int ELSE=19;
	public static final int EQ=20;
	public static final int ESC_SEQ=21;
	public static final int EXPONENT=22;
	public static final int FALSE=23;
	public static final int FIELD=24;
	public static final int FOR=25;
	public static final int FUNCTION=26;
	public static final int GE=27;
	public static final int GT=28;
	public static final int HEX_DIGIT=29;
	public static final int HEX_ESC=30;
	public static final int ID=31;
	public static final int ID_NAME=32;
	public static final int IF=33;
	public static final int IN=34;
	public static final int KW=35;
	public static final int LBB=36;
	public static final int LBRACE=37;
	public static final int LBRAKET=38;
	public static final int LE=39;
	public static final int LINE_BREAK=40;
	public static final int LPAR=41;
	public static final int LT=42;
	public static final int MINUS=43;
	public static final int MISSING_VAL=44;
	public static final int MOD=45;
	public static final int MULT=46;
	public static final int NE=47;
	public static final int NEWLINE=48;
	public static final int NEXT=49;
	public static final int NOT=50;
	public static final int NS_GET=51;
	public static final int NS_GET_INT=52;
	public static final int NULL=53;
	public static final int NUMBER=54;
	public static final int OCTAL_ESC=55;
	public static final int OP=56;
	public static final int OP_NAME=57;
	public static final int OR=58;
	public static final int PARMS=59;
	public static final int PLUS=60;
	public static final int RBRACE=61;
	public static final int RBRAKET=62;
	public static final int REPEAT=63;
	public static final int RIGHT_ARROW=64;
	public static final int RPAR=65;
	public static final int SEMICOLUMN=66;
	public static final int SEQUENCE=67;
	public static final int STRING=68;
	public static final int SUPER_ARROW=69;
	public static final int SUPER_RIGHT_ARROW=70;
	public static final int TILDE=71;
	public static final int TRUE=72;
	public static final int UMINUS=73;
	public static final int UNICODE_ESC=74;
	public static final int UPLUS=75;
	public static final int UTILDE=76;
	public static final int VARIATIC=77;
	public static final int WHILE=78;
	public static final int WS=79;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public RParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public RParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[42+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return RParser.tokenNames; }
	@Override public String getGrammarFileName() { return "com/github/gumtreediff/gen/antlr3/r/R.g"; }


	  public void display_next_tokens(){
	    System.err.print("Allowed tokens: ");
	    for(int next: next_tokens())
	      System.err.print(tokenNames[next]);
	    System.err.println("");
	  }
	  public int[] next_tokens(){
	    return state.following[state._fsp].toArray();
	  }


	public static class script_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "script"
	// com/github/gumtreediff/gen/antlr3/r/R.g:72:1: script : n_ ( statement )* -> ^( SEQUENCE ( statement )* ) ;
	public final RParser.script_return script() throws RecognitionException {
		RParser.script_return retval = new RParser.script_return();
		retval.start = input.LT(1);
		int script_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope n_1 =null;
		ParserRuleReturnScope statement2 =null;

		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:73:3: ( n_ ( statement )* -> ^( SEQUENCE ( statement )* ) )
			// com/github/gumtreediff/gen/antlr3/r/R.g:73:5: n_ ( statement )*
			{
			pushFollow(FOLLOW_n__in_script158);
			n_1=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_1.getTree());
			// com/github/gumtreediff/gen/antlr3/r/R.g:73:8: ( statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==BREAK||LA1_0==DD||LA1_0==FALSE||(LA1_0 >= FOR && LA1_0 <= FUNCTION)||LA1_0==ID||LA1_0==IF||LA1_0==LBRACE||LA1_0==LPAR||LA1_0==MINUS||(LA1_0 >= NEXT && LA1_0 <= NOT)||(LA1_0 >= NULL && LA1_0 <= NUMBER)||LA1_0==PLUS||LA1_0==REPEAT||LA1_0==STRING||(LA1_0 >= TILDE && LA1_0 <= TRUE)||(LA1_0 >= VARIATIC && LA1_0 <= WHILE)||LA1_0==80) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:73:8: statement
					{
					pushFollow(FOLLOW_statement_in_script160);
					statement2=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement2.getTree());
					}
					break;

				default :
					break loop1;
				}
			}


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
			// 73:19: -> ^( SEQUENCE ( statement )* )
			{
				// com/github/gumtreediff/gen/antlr3/r/R.g:73:22: ^( SEQUENCE ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, "SEQUENCE"), root_1);
				// com/github/gumtreediff/gen/antlr3/r/R.g:73:33: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 1, script_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "script"


	public static class interactive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "interactive"
	// com/github/gumtreediff/gen/antlr3/r/R.g:75:1: interactive : n_ ! statement ;
	public final RParser.interactive_return interactive() throws RecognitionException {
		RParser.interactive_return retval = new RParser.interactive_return();
		retval.start = input.LT(1);
		int interactive_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope n_3 =null;
		ParserRuleReturnScope statement4 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:76:3: ( n_ ! statement )
			// com/github/gumtreediff/gen/antlr3/r/R.g:76:5: n_ ! statement
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_n__in_interactive182);
			n_3=n_();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_statement_in_interactive185);
			statement4=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement4.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 2, interactive_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "interactive"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// com/github/gumtreediff/gen/antlr3/r/R.g:78:1: statement : ( expr_or_assign n !| '--EOF--' ( . )* EOF ->);
	public final RParser.statement_return statement() throws RecognitionException {
		RParser.statement_return retval = new RParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal7=null;
		Token wildcard8=null;
		Token EOF9=null;
		ParserRuleReturnScope expr_or_assign5 =null;
		ParserRuleReturnScope n6 =null;

		CommonTree string_literal7_tree=null;
		CommonTree wildcard8_tree=null;
		CommonTree EOF9_tree=null;
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:79:3: ( expr_or_assign n !| '--EOF--' ( . )* EOF ->)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BREAK||LA3_0==DD||LA3_0==FALSE||(LA3_0 >= FOR && LA3_0 <= FUNCTION)||LA3_0==ID||LA3_0==IF||LA3_0==LBRACE||LA3_0==LPAR||LA3_0==MINUS||(LA3_0 >= NEXT && LA3_0 <= NOT)||(LA3_0 >= NULL && LA3_0 <= NUMBER)||LA3_0==PLUS||LA3_0==REPEAT||LA3_0==STRING||(LA3_0 >= TILDE && LA3_0 <= TRUE)||(LA3_0 >= VARIATIC && LA3_0 <= WHILE)) ) {
				alt3=1;
			}
			else if ( (LA3_0==80) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:79:5: expr_or_assign n !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expr_or_assign_in_statement197);
					expr_or_assign5=expr_or_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign5.getTree());

					pushFollow(FOLLOW_n_in_statement199);
					n6=n();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:80:5: '--EOF--' ( . )* EOF
					{
					string_literal7=(Token)match(input,80,FOLLOW_80_in_statement206); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_80.add(string_literal7);

					// com/github/gumtreediff/gen/antlr3/r/R.g:80:15: ( . )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= AND && LA2_0 <= 80)) ) {
							alt2=1;
						}
						else if ( (LA2_0==EOF) ) {
							alt2=2;
						}

						switch (alt2) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/r/R.g:80:15: .
							{
							wildcard8=input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard8_tree = (CommonTree)adaptor.create(wildcard8);
							adaptor.addChild(root_0, wildcard8_tree);
							}

							}
							break;

						default :
							break loop2;
						}
					}

					EOF9=(Token)match(input,EOF,FOLLOW_EOF_in_statement211); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EOF.add(EOF9);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 80:22: ->
					{
						root_0 = null;
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
			if ( state.backtracking>0 ) { memoize(input, 3, statement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class n__return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "n_"
	// com/github/gumtreediff/gen/antlr3/r/R.g:83:1: n_ : ( NEWLINE | COMMENT )* ;
	public final RParser.n__return n_() throws RecognitionException {
		RParser.n__return retval = new RParser.n__return();
		retval.start = input.LT(1);
		int n__StartIndex = input.index();

		CommonTree root_0 = null;

		Token set10=null;

		CommonTree set10_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:83:5: ( ( NEWLINE | COMMENT )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:83:7: ( NEWLINE | COMMENT )*
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/github/gumtreediff/gen/antlr3/r/R.g:83:7: ( NEWLINE | COMMENT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==COMMENT||LA4_0==NEWLINE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:
					{
					set10=input.LT(1);
					if ( input.LA(1)==COMMENT||input.LA(1)==NEWLINE ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set10));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
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
			if ( state.backtracking>0 ) { memoize(input, 4, n__StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "n_"


	public static class n_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "n"
	// com/github/gumtreediff/gen/antlr3/r/R.g:84:1: n : ( ( NEWLINE | COMMENT )+ | EOF | SEMICOLUMN n_ );
	public final RParser.n_return n() throws RecognitionException {
		RParser.n_return retval = new RParser.n_return();
		retval.start = input.LT(1);
		int n_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set11=null;
		Token EOF12=null;
		Token SEMICOLUMN13=null;
		ParserRuleReturnScope n_14 =null;

		CommonTree set11_tree=null;
		CommonTree EOF12_tree=null;
		CommonTree SEMICOLUMN13_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:84:3: ( ( NEWLINE | COMMENT )+ | EOF | SEMICOLUMN n_ )
			int alt6=3;
			switch ( input.LA(1) ) {
			case COMMENT:
			case NEWLINE:
				{
				alt6=1;
				}
				break;
			case EOF:
				{
				alt6=2;
				}
				break;
			case SEMICOLUMN:
				{
				alt6=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:84:5: ( NEWLINE | COMMENT )+
					{
					root_0 = (CommonTree)adaptor.nil();


					// com/github/gumtreediff/gen/antlr3/r/R.g:84:5: ( NEWLINE | COMMENT )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==COMMENT||LA5_0==NEWLINE) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/r/R.g:
							{
							set11=input.LT(1);
							if ( input.LA(1)==COMMENT||input.LA(1)==NEWLINE ) {
								input.consume();
								if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set11));
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:84:28: EOF
					{
					root_0 = (CommonTree)adaptor.nil();


					EOF12=(Token)match(input,EOF,FOLLOW_EOF_in_n252); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF12_tree = (CommonTree)adaptor.create(EOF12);
					adaptor.addChild(root_0, EOF12_tree);
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:84:34: SEMICOLUMN n_
					{
					root_0 = (CommonTree)adaptor.nil();


					SEMICOLUMN13=(Token)match(input,SEMICOLUMN,FOLLOW_SEMICOLUMN_in_n256); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLUMN13_tree = (CommonTree)adaptor.create(SEMICOLUMN13);
					adaptor.addChild(root_0, SEMICOLUMN13_tree);
					}

					pushFollow(FOLLOW_n__in_n258);
					n_14=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, n_14.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 5, n_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "n"


	public static class expr_or_assign_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr_or_assign"
	// com/github/gumtreediff/gen/antlr3/r/R.g:86:1: expr_or_assign : alter_assign ;
	public final RParser.expr_or_assign_return expr_or_assign() throws RecognitionException {
		RParser.expr_or_assign_return retval = new RParser.expr_or_assign_return();
		retval.start = input.LT(1);
		int expr_or_assign_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope alter_assign15 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:87:3: ( alter_assign )
			// com/github/gumtreediff/gen/antlr3/r/R.g:87:5: alter_assign
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_alter_assign_in_expr_or_assign268);
			alter_assign15=alter_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, alter_assign15.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 6, expr_or_assign_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expr_or_assign"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:90:1: expr : assign ;
	public final RParser.expr_return expr() throws RecognitionException {
		RParser.expr_return retval = new RParser.expr_return();
		retval.start = input.LT(1);
		int expr_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope assign16 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:91:3: ( assign )
			// com/github/gumtreediff/gen/antlr3/r/R.g:91:5: assign
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assign_in_expr281);
			assign16=assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assign16.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 7, expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr_wo_assign_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr_wo_assign"
	// com/github/gumtreediff/gen/antlr3/r/R.g:94:1: expr_wo_assign : ( while_expr | if_expr | for_expr | repeat_expr | function | NEXT ( LPAR n_ RPAR )? -> NEXT | BREAK ( LPAR n_ RPAR )? -> BREAK );
	public final RParser.expr_wo_assign_return expr_wo_assign() throws RecognitionException {
		RParser.expr_wo_assign_return retval = new RParser.expr_wo_assign_return();
		retval.start = input.LT(1);
		int expr_wo_assign_StartIndex = input.index();

		CommonTree root_0 = null;

		Token NEXT22=null;
		Token LPAR23=null;
		Token RPAR25=null;
		Token BREAK26=null;
		Token LPAR27=null;
		Token RPAR29=null;
		ParserRuleReturnScope while_expr17 =null;
		ParserRuleReturnScope if_expr18 =null;
		ParserRuleReturnScope for_expr19 =null;
		ParserRuleReturnScope repeat_expr20 =null;
		ParserRuleReturnScope function21 =null;
		ParserRuleReturnScope n_24 =null;
		ParserRuleReturnScope n_28 =null;

		CommonTree NEXT22_tree=null;
		CommonTree LPAR23_tree=null;
		CommonTree RPAR25_tree=null;
		CommonTree BREAK26_tree=null;
		CommonTree LPAR27_tree=null;
		CommonTree RPAR29_tree=null;
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_NEXT=new RewriteRuleTokenStream(adaptor,"token NEXT");
		RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:95:3: ( while_expr | if_expr | for_expr | repeat_expr | function | NEXT ( LPAR n_ RPAR )? -> NEXT | BREAK ( LPAR n_ RPAR )? -> BREAK )
			int alt9=7;
			switch ( input.LA(1) ) {
			case WHILE:
				{
				alt9=1;
				}
				break;
			case IF:
				{
				alt9=2;
				}
				break;
			case FOR:
				{
				alt9=3;
				}
				break;
			case REPEAT:
				{
				alt9=4;
				}
				break;
			case FUNCTION:
				{
				alt9=5;
				}
				break;
			case NEXT:
				{
				alt9=6;
				}
				break;
			case BREAK:
				{
				alt9=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:95:5: while_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_while_expr_in_expr_wo_assign295);
					while_expr17=while_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, while_expr17.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:96:5: if_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_if_expr_in_expr_wo_assign301);
					if_expr18=if_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_expr18.getTree());

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:97:5: for_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_for_expr_in_expr_wo_assign307);
					for_expr19=for_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, for_expr19.getTree());

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:98:5: repeat_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_repeat_expr_in_expr_wo_assign313);
					repeat_expr20=repeat_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, repeat_expr20.getTree());

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:99:5: function
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_function_in_expr_wo_assign319);
					function21=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function21.getTree());

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:100:5: NEXT ( LPAR n_ RPAR )?
					{
					NEXT22=(Token)match(input,NEXT,FOLLOW_NEXT_in_expr_wo_assign325); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NEXT.add(NEXT22);

					// com/github/gumtreediff/gen/antlr3/r/R.g:100:10: ( LPAR n_ RPAR )?
					int alt7=2;
					alt7 = dfa7.predict(input);
					switch (alt7) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/r/R.g:100:11: LPAR n_ RPAR
							{
							LPAR23=(Token)match(input,LPAR,FOLLOW_LPAR_in_expr_wo_assign328); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAR.add(LPAR23);

							pushFollow(FOLLOW_n__in_expr_wo_assign330);
							n_24=n_();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_n_.add(n_24.getTree());
							RPAR25=(Token)match(input,RPAR,FOLLOW_RPAR_in_expr_wo_assign332); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAR.add(RPAR25);

							}
							break;

					}


					// AST REWRITE
					// elements: NEXT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 100:26: -> NEXT
					{
						adaptor.addChild(root_0, stream_NEXT.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:101:5: BREAK ( LPAR n_ RPAR )?
					{
					BREAK26=(Token)match(input,BREAK,FOLLOW_BREAK_in_expr_wo_assign344); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BREAK.add(BREAK26);

					// com/github/gumtreediff/gen/antlr3/r/R.g:101:11: ( LPAR n_ RPAR )?
					int alt8=2;
					alt8 = dfa8.predict(input);
					switch (alt8) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/r/R.g:101:12: LPAR n_ RPAR
							{
							LPAR27=(Token)match(input,LPAR,FOLLOW_LPAR_in_expr_wo_assign347); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAR.add(LPAR27);

							pushFollow(FOLLOW_n__in_expr_wo_assign349);
							n_28=n_();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_n_.add(n_28.getTree());
							RPAR29=(Token)match(input,RPAR,FOLLOW_RPAR_in_expr_wo_assign351); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAR.add(RPAR29);

							}
							break;

					}


					// AST REWRITE
					// elements: BREAK
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 101:27: -> BREAK
					{
						adaptor.addChild(root_0, stream_BREAK.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 8, expr_wo_assign_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expr_wo_assign"


	public static class sequence_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sequence"
	// com/github/gumtreediff/gen/antlr3/r/R.g:103:1: sequence : lbb= LBRACE n_ (e+= expr_or_assign ( n e+= expr_or_assign )* ( n )? )? RBRACE -> ^( SEQUENCE[lbb] ( $e)* ) ;
	public final RParser.sequence_return sequence() throws RecognitionException {
		RParser.sequence_return retval = new RParser.sequence_return();
		retval.start = input.LT(1);
		int sequence_StartIndex = input.index();

		CommonTree root_0 = null;

		Token lbb=null;
		Token RBRACE33=null;
		List<Object> list_e=null;
		ParserRuleReturnScope n_30 =null;
		ParserRuleReturnScope n31 =null;
		ParserRuleReturnScope n32 =null;
		RuleReturnScope e = null;
		CommonTree lbb_tree=null;
		CommonTree RBRACE33_tree=null;
		RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
		RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");
		RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:104:3: (lbb= LBRACE n_ (e+= expr_or_assign ( n e+= expr_or_assign )* ( n )? )? RBRACE -> ^( SEQUENCE[lbb] ( $e)* ) )
			// com/github/gumtreediff/gen/antlr3/r/R.g:104:5: lbb= LBRACE n_ (e+= expr_or_assign ( n e+= expr_or_assign )* ( n )? )? RBRACE
			{
			lbb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_sequence371); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACE.add(lbb);

			pushFollow(FOLLOW_n__in_sequence373);
			n_30=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_30.getTree());
			// com/github/gumtreediff/gen/antlr3/r/R.g:104:19: (e+= expr_or_assign ( n e+= expr_or_assign )* ( n )? )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==BREAK||LA12_0==DD||LA12_0==FALSE||(LA12_0 >= FOR && LA12_0 <= FUNCTION)||LA12_0==ID||LA12_0==IF||LA12_0==LBRACE||LA12_0==LPAR||LA12_0==MINUS||(LA12_0 >= NEXT && LA12_0 <= NOT)||(LA12_0 >= NULL && LA12_0 <= NUMBER)||LA12_0==PLUS||LA12_0==REPEAT||LA12_0==STRING||(LA12_0 >= TILDE && LA12_0 <= TRUE)||(LA12_0 >= VARIATIC && LA12_0 <= WHILE)) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:104:20: e+= expr_or_assign ( n e+= expr_or_assign )* ( n )?
					{
					pushFollow(FOLLOW_expr_or_assign_in_sequence378);
					e=expr_or_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_or_assign.add(e.getTree());
					if (list_e==null) list_e=new ArrayList<Object>();
					list_e.add(e.getTree());
					// com/github/gumtreediff/gen/antlr3/r/R.g:104:38: ( n e+= expr_or_assign )*
					loop10:
					while (true) {
						int alt10=2;
						alt10 = dfa10.predict(input);
						switch (alt10) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/r/R.g:104:39: n e+= expr_or_assign
							{
							pushFollow(FOLLOW_n_in_sequence381);
							n31=n();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_n.add(n31.getTree());
							pushFollow(FOLLOW_expr_or_assign_in_sequence385);
							e=expr_or_assign();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expr_or_assign.add(e.getTree());
							if (list_e==null) list_e=new ArrayList<Object>();
							list_e.add(e.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					// com/github/gumtreediff/gen/antlr3/r/R.g:104:61: ( n )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EOF||LA11_0==COMMENT||LA11_0==NEWLINE||LA11_0==SEMICOLUMN) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/r/R.g:104:61: n
							{
							pushFollow(FOLLOW_n_in_sequence389);
							n32=n();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_n.add(n32.getTree());
							}
							break;

					}

					}
					break;

			}

			RBRACE33=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_sequence395); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE33);


			// AST REWRITE
			// elements: e
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: e
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"token e",list_e);
			root_0 = (CommonTree)adaptor.nil();
			// 104:75: -> ^( SEQUENCE[lbb] ( $e)* )
			{
				// com/github/gumtreediff/gen/antlr3/r/R.g:104:78: ^( SEQUENCE[lbb] ( $e)* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEQUENCE, lbb), root_1);
				// com/github/gumtreediff/gen/antlr3/r/R.g:104:95: ( $e)*
				while ( stream_e.hasNext() ) {
					adaptor.addChild(root_1, stream_e.nextTree());
				}
				stream_e.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 9, sequence_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "sequence"


	public static class assign_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assign"
	// com/github/gumtreediff/gen/antlr3/r/R.g:107:1: assign : l= tilde_expr ( ARROW n_ r= expr -> ^( ARROW $l $r) | SUPER_ARROW n_ r= expr -> ^( SUPER_ARROW $l $r) |a= RIGHT_ARROW n_ r= expr -> ^( ARROW[$a] $r $l) |a= SUPER_RIGHT_ARROW n_ r= expr -> ^( SUPER_ARROW[$a] $r $l) | -> $l) ;
	public final RParser.assign_return assign() throws RecognitionException {
		RParser.assign_return retval = new RParser.assign_return();
		retval.start = input.LT(1);
		int assign_StartIndex = input.index();

		CommonTree root_0 = null;

		Token a=null;
		Token ARROW34=null;
		Token SUPER_ARROW36=null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope n_35 =null;
		ParserRuleReturnScope n_37 =null;
		ParserRuleReturnScope n_38 =null;
		ParserRuleReturnScope n_39 =null;

		CommonTree a_tree=null;
		CommonTree ARROW34_tree=null;
		CommonTree SUPER_ARROW36_tree=null;
		RewriteRuleTokenStream stream_SUPER_RIGHT_ARROW=new RewriteRuleTokenStream(adaptor,"token SUPER_RIGHT_ARROW");
		RewriteRuleTokenStream stream_RIGHT_ARROW=new RewriteRuleTokenStream(adaptor,"token RIGHT_ARROW");
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_SUPER_ARROW=new RewriteRuleTokenStream(adaptor,"token SUPER_ARROW");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_tilde_expr=new RewriteRuleSubtreeStream(adaptor,"rule tilde_expr");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:108:3: (l= tilde_expr ( ARROW n_ r= expr -> ^( ARROW $l $r) | SUPER_ARROW n_ r= expr -> ^( SUPER_ARROW $l $r) |a= RIGHT_ARROW n_ r= expr -> ^( ARROW[$a] $r $l) |a= SUPER_RIGHT_ARROW n_ r= expr -> ^( SUPER_ARROW[$a] $r $l) | -> $l) )
			// com/github/gumtreediff/gen/antlr3/r/R.g:108:5: l= tilde_expr ( ARROW n_ r= expr -> ^( ARROW $l $r) | SUPER_ARROW n_ r= expr -> ^( SUPER_ARROW $l $r) |a= RIGHT_ARROW n_ r= expr -> ^( ARROW[$a] $r $l) |a= SUPER_RIGHT_ARROW n_ r= expr -> ^( SUPER_ARROW[$a] $r $l) | -> $l)
			{
			pushFollow(FOLLOW_tilde_expr_in_assign422);
			l=tilde_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tilde_expr.add(l.getTree());
			// com/github/gumtreediff/gen/antlr3/r/R.g:109:5: ( ARROW n_ r= expr -> ^( ARROW $l $r) | SUPER_ARROW n_ r= expr -> ^( SUPER_ARROW $l $r) |a= RIGHT_ARROW n_ r= expr -> ^( ARROW[$a] $r $l) |a= SUPER_RIGHT_ARROW n_ r= expr -> ^( SUPER_ARROW[$a] $r $l) | -> $l)
			int alt13=5;
			switch ( input.LA(1) ) {
			case ARROW:
				{
				alt13=1;
				}
				break;
			case SUPER_ARROW:
				{
				alt13=2;
				}
				break;
			case RIGHT_ARROW:
				{
				alt13=3;
				}
				break;
			case SUPER_RIGHT_ARROW:
				{
				alt13=4;
				}
				break;
			case EOF:
			case ASSIGN:
			case BREAK:
			case COMMA:
			case COMMENT:
			case DD:
			case ELSE:
			case FALSE:
			case FOR:
			case FUNCTION:
			case ID:
			case IF:
			case IN:
			case LBRACE:
			case LPAR:
			case MINUS:
			case NEWLINE:
			case NEXT:
			case NOT:
			case NULL:
			case NUMBER:
			case PLUS:
			case RBRACE:
			case RBRAKET:
			case REPEAT:
			case RPAR:
			case STRING:
			case TILDE:
			case TRUE:
			case VARIATIC:
			case WHILE:
			case 80:
				{
				alt13=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:109:7: ARROW n_ r= expr
					{
					ARROW34=(Token)match(input,ARROW,FOLLOW_ARROW_in_assign432); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ARROW.add(ARROW34);

					pushFollow(FOLLOW_n__in_assign434);
					n_35=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_35.getTree());
					pushFollow(FOLLOW_expr_in_assign438);
					r=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(r.getTree());

					// AST REWRITE
					// elements: ARROW, r, l
					// token labels: 
					// rule labels: r, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 109:23: -> ^( ARROW $l $r)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:109:26: ^( ARROW $l $r)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ARROW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_l.nextTree());
						adaptor.addChild(root_1, stream_r.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:110:7: SUPER_ARROW n_ r= expr
					{
					SUPER_ARROW36=(Token)match(input,SUPER_ARROW,FOLLOW_SUPER_ARROW_in_assign458); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SUPER_ARROW.add(SUPER_ARROW36);

					pushFollow(FOLLOW_n__in_assign460);
					n_37=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_37.getTree());
					pushFollow(FOLLOW_expr_in_assign464);
					r=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(r.getTree());

					// AST REWRITE
					// elements: l, r, SUPER_ARROW
					// token labels: 
					// rule labels: r, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 110:29: -> ^( SUPER_ARROW $l $r)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:110:32: ^( SUPER_ARROW $l $r)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SUPER_ARROW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_l.nextTree());
						adaptor.addChild(root_1, stream_r.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:111:7: a= RIGHT_ARROW n_ r= expr
					{
					a=(Token)match(input,RIGHT_ARROW,FOLLOW_RIGHT_ARROW_in_assign486); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_ARROW.add(a);

					pushFollow(FOLLOW_n__in_assign488);
					n_38=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_38.getTree());
					pushFollow(FOLLOW_expr_in_assign492);
					r=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(r.getTree());

					// AST REWRITE
					// elements: l, r, ARROW
					// token labels: 
					// rule labels: r, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 111:31: -> ^( ARROW[$a] $r $l)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:111:34: ^( ARROW[$a] $r $l)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARROW, a), root_1);
						adaptor.addChild(root_1, stream_r.nextTree());
						adaptor.addChild(root_1, stream_l.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:112:7: a= SUPER_RIGHT_ARROW n_ r= expr
					{
					a=(Token)match(input,SUPER_RIGHT_ARROW,FOLLOW_SUPER_RIGHT_ARROW_in_assign515); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SUPER_RIGHT_ARROW.add(a);

					pushFollow(FOLLOW_n__in_assign517);
					n_39=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_39.getTree());
					pushFollow(FOLLOW_expr_in_assign521);
					r=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(r.getTree());

					// AST REWRITE
					// elements: SUPER_ARROW, l, r
					// token labels: 
					// rule labels: r, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 112:37: -> ^( SUPER_ARROW[$a] $r $l)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:112:40: ^( SUPER_ARROW[$a] $r $l)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_ARROW, a), root_1);
						adaptor.addChild(root_1, stream_r.nextTree());
						adaptor.addChild(root_1, stream_l.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:113:7: 
					{

					// AST REWRITE
					// elements: l
					// token labels: 
					// rule labels: l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 113:7: -> $l
					{
						adaptor.addChild(root_0, stream_l.nextTree());
					}


					retval.tree = root_0;
					}

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
			if ( state.backtracking>0 ) { memoize(input, 10, assign_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "assign"


	public static class alter_assign_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "alter_assign"
	// com/github/gumtreediff/gen/antlr3/r/R.g:116:1: alter_assign : l= tilde_expr ( ARROW n_ r= expr_or_assign -> ^( ARROW $l $r) | SUPER_ARROW n_ r= expr_or_assign -> ^( SUPER_ARROW $l $r) |a= RIGHT_ARROW n_ r= expr_or_assign -> ^( ARROW[$a] $r $l) |a= SUPER_RIGHT_ARROW n_ r= expr_or_assign -> ^( SUPER_ARROW[$a] $r $l) |a= ASSIGN n_ r= expr_or_assign -> ^( ARROW[$a] $l $r) | -> $l) ;
	public final RParser.alter_assign_return alter_assign() throws RecognitionException {
		RParser.alter_assign_return retval = new RParser.alter_assign_return();
		retval.start = input.LT(1);
		int alter_assign_StartIndex = input.index();

		CommonTree root_0 = null;

		Token a=null;
		Token ARROW40=null;
		Token SUPER_ARROW42=null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope n_41 =null;
		ParserRuleReturnScope n_43 =null;
		ParserRuleReturnScope n_44 =null;
		ParserRuleReturnScope n_45 =null;
		ParserRuleReturnScope n_46 =null;

		CommonTree a_tree=null;
		CommonTree ARROW40_tree=null;
		CommonTree SUPER_ARROW42_tree=null;
		RewriteRuleTokenStream stream_SUPER_RIGHT_ARROW=new RewriteRuleTokenStream(adaptor,"token SUPER_RIGHT_ARROW");
		RewriteRuleTokenStream stream_RIGHT_ARROW=new RewriteRuleTokenStream(adaptor,"token RIGHT_ARROW");
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_SUPER_ARROW=new RewriteRuleTokenStream(adaptor,"token SUPER_ARROW");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_tilde_expr=new RewriteRuleSubtreeStream(adaptor,"rule tilde_expr");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:117:3: (l= tilde_expr ( ARROW n_ r= expr_or_assign -> ^( ARROW $l $r) | SUPER_ARROW n_ r= expr_or_assign -> ^( SUPER_ARROW $l $r) |a= RIGHT_ARROW n_ r= expr_or_assign -> ^( ARROW[$a] $r $l) |a= SUPER_RIGHT_ARROW n_ r= expr_or_assign -> ^( SUPER_ARROW[$a] $r $l) |a= ASSIGN n_ r= expr_or_assign -> ^( ARROW[$a] $l $r) | -> $l) )
			// com/github/gumtreediff/gen/antlr3/r/R.g:117:5: l= tilde_expr ( ARROW n_ r= expr_or_assign -> ^( ARROW $l $r) | SUPER_ARROW n_ r= expr_or_assign -> ^( SUPER_ARROW $l $r) |a= RIGHT_ARROW n_ r= expr_or_assign -> ^( ARROW[$a] $r $l) |a= SUPER_RIGHT_ARROW n_ r= expr_or_assign -> ^( SUPER_ARROW[$a] $r $l) |a= ASSIGN n_ r= expr_or_assign -> ^( ARROW[$a] $l $r) | -> $l)
			{
			pushFollow(FOLLOW_tilde_expr_in_alter_assign565);
			l=tilde_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tilde_expr.add(l.getTree());
			// com/github/gumtreediff/gen/antlr3/r/R.g:118:5: ( ARROW n_ r= expr_or_assign -> ^( ARROW $l $r) | SUPER_ARROW n_ r= expr_or_assign -> ^( SUPER_ARROW $l $r) |a= RIGHT_ARROW n_ r= expr_or_assign -> ^( ARROW[$a] $r $l) |a= SUPER_RIGHT_ARROW n_ r= expr_or_assign -> ^( SUPER_ARROW[$a] $r $l) |a= ASSIGN n_ r= expr_or_assign -> ^( ARROW[$a] $l $r) | -> $l)
			int alt14=6;
			switch ( input.LA(1) ) {
			case ARROW:
				{
				alt14=1;
				}
				break;
			case SUPER_ARROW:
				{
				alt14=2;
				}
				break;
			case RIGHT_ARROW:
				{
				alt14=3;
				}
				break;
			case SUPER_RIGHT_ARROW:
				{
				alt14=4;
				}
				break;
			case ASSIGN:
				{
				alt14=5;
				}
				break;
			case EOF:
			case AND:
			case AT:
			case BITWISEAND:
			case BITWISEOR:
			case CARRET:
			case COLUMN:
			case COMMA:
			case COMMENT:
			case DIV:
			case ELSE:
			case EQ:
			case FIELD:
			case GE:
			case GT:
			case LBB:
			case LBRAKET:
			case LE:
			case LPAR:
			case LT:
			case MINUS:
			case MOD:
			case MULT:
			case NE:
			case NEWLINE:
			case OP:
			case OR:
			case PLUS:
			case RBRACE:
			case RBRAKET:
			case RPAR:
			case SEMICOLUMN:
			case TILDE:
				{
				alt14=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:118:7: ARROW n_ r= expr_or_assign
					{
					ARROW40=(Token)match(input,ARROW,FOLLOW_ARROW_in_alter_assign575); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ARROW.add(ARROW40);

					pushFollow(FOLLOW_n__in_alter_assign577);
					n_41=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_41.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_alter_assign581);
					r=expr_or_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_or_assign.add(r.getTree());

					// AST REWRITE
					// elements: l, r, ARROW
					// token labels: 
					// rule labels: r, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 118:33: -> ^( ARROW $l $r)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:118:36: ^( ARROW $l $r)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ARROW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_l.nextTree());
						adaptor.addChild(root_1, stream_r.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:119:7: SUPER_ARROW n_ r= expr_or_assign
					{
					SUPER_ARROW42=(Token)match(input,SUPER_ARROW,FOLLOW_SUPER_ARROW_in_alter_assign601); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SUPER_ARROW.add(SUPER_ARROW42);

					pushFollow(FOLLOW_n__in_alter_assign603);
					n_43=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_43.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_alter_assign607);
					r=expr_or_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_or_assign.add(r.getTree());

					// AST REWRITE
					// elements: r, l, SUPER_ARROW
					// token labels: 
					// rule labels: r, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 119:39: -> ^( SUPER_ARROW $l $r)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:119:42: ^( SUPER_ARROW $l $r)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SUPER_ARROW.nextNode(), root_1);
						adaptor.addChild(root_1, stream_l.nextTree());
						adaptor.addChild(root_1, stream_r.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:120:7: a= RIGHT_ARROW n_ r= expr_or_assign
					{
					a=(Token)match(input,RIGHT_ARROW,FOLLOW_RIGHT_ARROW_in_alter_assign629); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_ARROW.add(a);

					pushFollow(FOLLOW_n__in_alter_assign631);
					n_44=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_44.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_alter_assign635);
					r=expr_or_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_or_assign.add(r.getTree());

					// AST REWRITE
					// elements: l, ARROW, r
					// token labels: 
					// rule labels: r, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 120:41: -> ^( ARROW[$a] $r $l)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:120:44: ^( ARROW[$a] $r $l)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARROW, a), root_1);
						adaptor.addChild(root_1, stream_r.nextTree());
						adaptor.addChild(root_1, stream_l.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:121:7: a= SUPER_RIGHT_ARROW n_ r= expr_or_assign
					{
					a=(Token)match(input,SUPER_RIGHT_ARROW,FOLLOW_SUPER_RIGHT_ARROW_in_alter_assign658); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SUPER_RIGHT_ARROW.add(a);

					pushFollow(FOLLOW_n__in_alter_assign660);
					n_45=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_45.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_alter_assign664);
					r=expr_or_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_or_assign.add(r.getTree());

					// AST REWRITE
					// elements: SUPER_ARROW, l, r
					// token labels: 
					// rule labels: r, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 121:47: -> ^( SUPER_ARROW[$a] $r $l)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:121:50: ^( SUPER_ARROW[$a] $r $l)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SUPER_ARROW, a), root_1);
						adaptor.addChild(root_1, stream_r.nextTree());
						adaptor.addChild(root_1, stream_l.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:122:7: a= ASSIGN n_ r= expr_or_assign
					{
					a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_alter_assign687); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(a);

					pushFollow(FOLLOW_n__in_alter_assign689);
					n_46=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_46.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_alter_assign693);
					r=expr_or_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_or_assign.add(r.getTree());

					// AST REWRITE
					// elements: r, l, ARROW
					// token labels: 
					// rule labels: r, l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 122:36: -> ^( ARROW[$a] $l $r)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:122:39: ^( ARROW[$a] $l $r)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARROW, a), root_1);
						adaptor.addChild(root_1, stream_l.nextTree());
						adaptor.addChild(root_1, stream_r.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:123:7: 
					{

					// AST REWRITE
					// elements: l
					// token labels: 
					// rule labels: l, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_l=new RewriteRuleSubtreeStream(adaptor,"rule l",l!=null?l.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 123:7: -> $l
					{
						adaptor.addChild(root_0, stream_l.nextTree());
					}


					retval.tree = root_0;
					}

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
			if ( state.backtracking>0 ) { memoize(input, 11, alter_assign_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "alter_assign"


	public static class if_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "if_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:127:1: if_expr : IF n_ LPAR n_ cond= expr_or_assign n_ RPAR n_ t= expr_or_assign ( options {greedy=false; backtrack=true; } : n_ ELSE n_ f= expr_or_assign )? -> ^( IF $cond $t ( $f)? ) ;
	public final RParser.if_expr_return if_expr() throws RecognitionException {
		RParser.if_expr_return retval = new RParser.if_expr_return();
		retval.start = input.LT(1);
		int if_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token IF47=null;
		Token LPAR49=null;
		Token RPAR52=null;
		Token ELSE55=null;
		ParserRuleReturnScope cond =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope f =null;
		ParserRuleReturnScope n_48 =null;
		ParserRuleReturnScope n_50 =null;
		ParserRuleReturnScope n_51 =null;
		ParserRuleReturnScope n_53 =null;
		ParserRuleReturnScope n_54 =null;
		ParserRuleReturnScope n_56 =null;

		CommonTree IF47_tree=null;
		CommonTree LPAR49_tree=null;
		CommonTree RPAR52_tree=null;
		CommonTree ELSE55_tree=null;
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:128:3: ( IF n_ LPAR n_ cond= expr_or_assign n_ RPAR n_ t= expr_or_assign ( options {greedy=false; backtrack=true; } : n_ ELSE n_ f= expr_or_assign )? -> ^( IF $cond $t ( $f)? ) )
			// com/github/gumtreediff/gen/antlr3/r/R.g:129:3: IF n_ LPAR n_ cond= expr_or_assign n_ RPAR n_ t= expr_or_assign ( options {greedy=false; backtrack=true; } : n_ ELSE n_ f= expr_or_assign )?
			{
			IF47=(Token)match(input,IF,FOLLOW_IF_in_if_expr738); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IF.add(IF47);

			pushFollow(FOLLOW_n__in_if_expr740);
			n_48=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_48.getTree());
			LPAR49=(Token)match(input,LPAR,FOLLOW_LPAR_in_if_expr742); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAR.add(LPAR49);

			pushFollow(FOLLOW_n__in_if_expr744);
			n_50=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_50.getTree());
			pushFollow(FOLLOW_expr_or_assign_in_if_expr748);
			cond=expr_or_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr_or_assign.add(cond.getTree());
			pushFollow(FOLLOW_n__in_if_expr750);
			n_51=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_51.getTree());
			RPAR52=(Token)match(input,RPAR,FOLLOW_RPAR_in_if_expr752); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAR.add(RPAR52);

			pushFollow(FOLLOW_n__in_if_expr754);
			n_53=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_53.getTree());
			pushFollow(FOLLOW_expr_or_assign_in_if_expr758);
			t=expr_or_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr_or_assign.add(t.getTree());
			// com/github/gumtreediff/gen/antlr3/r/R.g:130:18: ( options {greedy=false; backtrack=true; } : n_ ELSE n_ f= expr_or_assign )?
			int alt15=2;
			switch ( input.LA(1) ) {
				case COMMENT:
				case NEWLINE:
					{
					int LA15_1 = input.LA(2);
					if ( (synpred1_R()) ) {
						alt15=1;
					}
					else if ( (true) ) {
						alt15=2;
					}
					}
					break;
				case ELSE:
					{
					int LA15_2 = input.LA(2);
					if ( (synpred1_R()) ) {
						alt15=1;
					}
					else if ( (true) ) {
						alt15=2;
					}
					}
					break;
				case EOF:
				case AND:
				case ARROW:
				case ASSIGN:
				case AT:
				case BITWISEAND:
				case BITWISEOR:
				case CARRET:
				case COLUMN:
				case COMMA:
				case DIV:
				case EQ:
				case FIELD:
				case GE:
				case GT:
				case LBB:
				case LBRAKET:
				case LE:
				case LPAR:
				case LT:
				case MINUS:
				case MOD:
				case MULT:
				case NE:
				case OP:
				case OR:
				case PLUS:
				case RBRACE:
				case RBRAKET:
				case RIGHT_ARROW:
				case RPAR:
				case SEMICOLUMN:
				case SUPER_ARROW:
				case SUPER_RIGHT_ARROW:
				case TILDE:
					{
					alt15=2;
					}
					break;
			}
			switch (alt15) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:132:5: n_ ELSE n_ f= expr_or_assign
					{
					pushFollow(FOLLOW_n__in_if_expr788);
					n_54=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_54.getTree());
					ELSE55=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expr790); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELSE.add(ELSE55);

					pushFollow(FOLLOW_n__in_if_expr792);
					n_56=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_56.getTree());
					pushFollow(FOLLOW_expr_or_assign_in_if_expr796);
					f=expr_or_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_or_assign.add(f.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: cond, IF, t, f
			// token labels: 
			// rule labels: t, f, cond, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond",cond!=null?cond.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 134:3: -> ^( IF $cond $t ( $f)? )
			{
				// com/github/gumtreediff/gen/antlr3/r/R.g:134:6: ^( IF $cond $t ( $f)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);
				adaptor.addChild(root_1, stream_cond.nextTree());
				adaptor.addChild(root_1, stream_t.nextTree());
				// com/github/gumtreediff/gen/antlr3/r/R.g:134:21: ( $f)?
				if ( stream_f.hasNext() ) {
					adaptor.addChild(root_1, stream_f.nextTree());
				}
				stream_f.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 12, if_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "if_expr"


	public static class while_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "while_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:137:1: while_expr : WHILE n_ LPAR n_ c= expr_or_assign n_ RPAR n_ body= expr_or_assign -> ^( WHILE $c $body) ;
	public final RParser.while_expr_return while_expr() throws RecognitionException {
		RParser.while_expr_return retval = new RParser.while_expr_return();
		retval.start = input.LT(1);
		int while_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token WHILE57=null;
		Token LPAR59=null;
		Token RPAR62=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope body =null;
		ParserRuleReturnScope n_58 =null;
		ParserRuleReturnScope n_60 =null;
		ParserRuleReturnScope n_61 =null;
		ParserRuleReturnScope n_63 =null;

		CommonTree WHILE57_tree=null;
		CommonTree LPAR59_tree=null;
		CommonTree RPAR62_tree=null;
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:138:3: ( WHILE n_ LPAR n_ c= expr_or_assign n_ RPAR n_ body= expr_or_assign -> ^( WHILE $c $body) )
			// com/github/gumtreediff/gen/antlr3/r/R.g:138:5: WHILE n_ LPAR n_ c= expr_or_assign n_ RPAR n_ body= expr_or_assign
			{
			WHILE57=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_expr832); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(WHILE57);

			pushFollow(FOLLOW_n__in_while_expr834);
			n_58=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_58.getTree());
			LPAR59=(Token)match(input,LPAR,FOLLOW_LPAR_in_while_expr836); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAR.add(LPAR59);

			pushFollow(FOLLOW_n__in_while_expr838);
			n_60=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_60.getTree());
			pushFollow(FOLLOW_expr_or_assign_in_while_expr842);
			c=expr_or_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr_or_assign.add(c.getTree());
			pushFollow(FOLLOW_n__in_while_expr844);
			n_61=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_61.getTree());
			RPAR62=(Token)match(input,RPAR,FOLLOW_RPAR_in_while_expr846); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAR.add(RPAR62);

			pushFollow(FOLLOW_n__in_while_expr848);
			n_63=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_63.getTree());
			pushFollow(FOLLOW_expr_or_assign_in_while_expr852);
			body=expr_or_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr_or_assign.add(body.getTree());

			// AST REWRITE
			// elements: c, body, WHILE
			// token labels: 
			// rule labels: c, body, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body",body!=null?body.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 138:70: -> ^( WHILE $c $body)
			{
				// com/github/gumtreediff/gen/antlr3/r/R.g:138:73: ^( WHILE $c $body)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_1, stream_body.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 13, while_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "while_expr"


	public static class for_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "for_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:140:1: for_expr : FOR n_ LPAR n_ ID n_ IN n_ in= expr_or_assign n_ RPAR n_ body= expr_or_assign -> ^( FOR ID $in $body) ;
	public final RParser.for_expr_return for_expr() throws RecognitionException {
		RParser.for_expr_return retval = new RParser.for_expr_return();
		retval.start = input.LT(1);
		int for_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FOR64=null;
		Token LPAR66=null;
		Token ID68=null;
		Token IN70=null;
		Token RPAR73=null;
		ParserRuleReturnScope in =null;
		ParserRuleReturnScope body =null;
		ParserRuleReturnScope n_65 =null;
		ParserRuleReturnScope n_67 =null;
		ParserRuleReturnScope n_69 =null;
		ParserRuleReturnScope n_71 =null;
		ParserRuleReturnScope n_72 =null;
		ParserRuleReturnScope n_74 =null;

		CommonTree FOR64_tree=null;
		CommonTree LPAR66_tree=null;
		CommonTree ID68_tree=null;
		CommonTree IN70_tree=null;
		CommonTree RPAR73_tree=null;
		RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:141:3: ( FOR n_ LPAR n_ ID n_ IN n_ in= expr_or_assign n_ RPAR n_ body= expr_or_assign -> ^( FOR ID $in $body) )
			// com/github/gumtreediff/gen/antlr3/r/R.g:141:5: FOR n_ LPAR n_ ID n_ IN n_ in= expr_or_assign n_ RPAR n_ body= expr_or_assign
			{
			FOR64=(Token)match(input,FOR,FOLLOW_FOR_in_for_expr876); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR.add(FOR64);

			pushFollow(FOLLOW_n__in_for_expr878);
			n_65=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_65.getTree());
			LPAR66=(Token)match(input,LPAR,FOLLOW_LPAR_in_for_expr880); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAR.add(LPAR66);

			pushFollow(FOLLOW_n__in_for_expr882);
			n_67=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_67.getTree());
			ID68=(Token)match(input,ID,FOLLOW_ID_in_for_expr884); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID68);

			pushFollow(FOLLOW_n__in_for_expr886);
			n_69=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_69.getTree());
			IN70=(Token)match(input,IN,FOLLOW_IN_in_for_expr888); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IN.add(IN70);

			pushFollow(FOLLOW_n__in_for_expr890);
			n_71=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_71.getTree());
			pushFollow(FOLLOW_expr_or_assign_in_for_expr894);
			in=expr_or_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr_or_assign.add(in.getTree());
			pushFollow(FOLLOW_n__in_for_expr896);
			n_72=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_72.getTree());
			RPAR73=(Token)match(input,RPAR,FOLLOW_RPAR_in_for_expr898); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAR.add(RPAR73);

			pushFollow(FOLLOW_n__in_for_expr900);
			n_74=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_74.getTree());
			pushFollow(FOLLOW_expr_or_assign_in_for_expr904);
			body=expr_or_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr_or_assign.add(body.getTree());

			// AST REWRITE
			// elements: in, FOR, ID, body
			// token labels: 
			// rule labels: in, body, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_in=new RewriteRuleSubtreeStream(adaptor,"rule in",in!=null?in.getTree():null);
			RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body",body!=null?body.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 141:81: -> ^( FOR ID $in $body)
			{
				// com/github/gumtreediff/gen/antlr3/r/R.g:141:84: ^( FOR ID $in $body)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_FOR.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				adaptor.addChild(root_1, stream_in.nextTree());
				adaptor.addChild(root_1, stream_body.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 14, for_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "for_expr"


	public static class repeat_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "repeat_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:143:1: repeat_expr : REPEAT n_ body= expr_or_assign -> ^( REPEAT $body) ;
	public final RParser.repeat_expr_return repeat_expr() throws RecognitionException {
		RParser.repeat_expr_return retval = new RParser.repeat_expr_return();
		retval.start = input.LT(1);
		int repeat_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token REPEAT75=null;
		ParserRuleReturnScope body =null;
		ParserRuleReturnScope n_76 =null;

		CommonTree REPEAT75_tree=null;
		RewriteRuleTokenStream stream_REPEAT=new RewriteRuleTokenStream(adaptor,"token REPEAT");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:144:3: ( REPEAT n_ body= expr_or_assign -> ^( REPEAT $body) )
			// com/github/gumtreediff/gen/antlr3/r/R.g:144:5: REPEAT n_ body= expr_or_assign
			{
			REPEAT75=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_repeat_expr930); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_REPEAT.add(REPEAT75);

			pushFollow(FOLLOW_n__in_repeat_expr932);
			n_76=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_76.getTree());
			pushFollow(FOLLOW_expr_or_assign_in_repeat_expr936);
			body=expr_or_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr_or_assign.add(body.getTree());

			// AST REWRITE
			// elements: REPEAT, body
			// token labels: 
			// rule labels: body, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body",body!=null?body.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 144:35: -> ^( REPEAT $body)
			{
				// com/github/gumtreediff/gen/antlr3/r/R.g:144:38: ^( REPEAT $body)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_REPEAT.nextNode(), root_1);
				adaptor.addChild(root_1, stream_body.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 15, repeat_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "repeat_expr"


	public static class function_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function"
	// com/github/gumtreediff/gen/antlr3/r/R.g:148:1: function : FUNCTION n_ LPAR n_ ( par_decl ( n_ COMMA n_ par_decl )* n_ )? RPAR n_ body= expr_or_assign -> ^( FUNCTION ( par_decl )* $body) ;
	public final RParser.function_return function() throws RecognitionException {
		RParser.function_return retval = new RParser.function_return();
		retval.start = input.LT(1);
		int function_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FUNCTION77=null;
		Token LPAR79=null;
		Token COMMA83=null;
		Token RPAR87=null;
		ParserRuleReturnScope body =null;
		ParserRuleReturnScope n_78 =null;
		ParserRuleReturnScope n_80 =null;
		ParserRuleReturnScope par_decl81 =null;
		ParserRuleReturnScope n_82 =null;
		ParserRuleReturnScope n_84 =null;
		ParserRuleReturnScope par_decl85 =null;
		ParserRuleReturnScope n_86 =null;
		ParserRuleReturnScope n_88 =null;

		CommonTree FUNCTION77_tree=null;
		CommonTree LPAR79_tree=null;
		CommonTree COMMA83_tree=null;
		CommonTree RPAR87_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_par_decl=new RewriteRuleSubtreeStream(adaptor,"rule par_decl");
		RewriteRuleSubtreeStream stream_expr_or_assign=new RewriteRuleSubtreeStream(adaptor,"rule expr_or_assign");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:149:3: ( FUNCTION n_ LPAR n_ ( par_decl ( n_ COMMA n_ par_decl )* n_ )? RPAR n_ body= expr_or_assign -> ^( FUNCTION ( par_decl )* $body) )
			// com/github/gumtreediff/gen/antlr3/r/R.g:149:5: FUNCTION n_ LPAR n_ ( par_decl ( n_ COMMA n_ par_decl )* n_ )? RPAR n_ body= expr_or_assign
			{
			FUNCTION77=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_function959); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION77);

			pushFollow(FOLLOW_n__in_function961);
			n_78=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_78.getTree());
			LPAR79=(Token)match(input,LPAR,FOLLOW_LPAR_in_function963); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAR.add(LPAR79);

			pushFollow(FOLLOW_n__in_function966);
			n_80=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_80.getTree());
			// com/github/gumtreediff/gen/antlr3/r/R.g:149:26: ( par_decl ( n_ COMMA n_ par_decl )* n_ )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ID||LA17_0==VARIATIC) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:149:27: par_decl ( n_ COMMA n_ par_decl )* n_
					{
					pushFollow(FOLLOW_par_decl_in_function969);
					par_decl81=par_decl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_par_decl.add(par_decl81.getTree());
					// com/github/gumtreediff/gen/antlr3/r/R.g:149:36: ( n_ COMMA n_ par_decl )*
					loop16:
					while (true) {
						int alt16=2;
						alt16 = dfa16.predict(input);
						switch (alt16) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/r/R.g:149:37: n_ COMMA n_ par_decl
							{
							pushFollow(FOLLOW_n__in_function972);
							n_82=n_();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_n_.add(n_82.getTree());
							COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_function974); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA83);

							pushFollow(FOLLOW_n__in_function976);
							n_84=n_();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_n_.add(n_84.getTree());
							pushFollow(FOLLOW_par_decl_in_function978);
							par_decl85=par_decl();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_par_decl.add(par_decl85.getTree());
							}
							break;

						default :
							break loop16;
						}
					}

					pushFollow(FOLLOW_n__in_function982);
					n_86=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_86.getTree());
					}
					break;

			}

			RPAR87=(Token)match(input,RPAR,FOLLOW_RPAR_in_function986); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAR.add(RPAR87);

			pushFollow(FOLLOW_n__in_function988);
			n_88=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_88.getTree());
			pushFollow(FOLLOW_expr_or_assign_in_function992);
			body=expr_or_assign();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr_or_assign.add(body.getTree());

			// AST REWRITE
			// elements: par_decl, body, FUNCTION
			// token labels: 
			// rule labels: body, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body",body!=null?body.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 149:93: -> ^( FUNCTION ( par_decl )* $body)
			{
				// com/github/gumtreediff/gen/antlr3/r/R.g:149:96: ^( FUNCTION ( par_decl )* $body)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);
				// com/github/gumtreediff/gen/antlr3/r/R.g:149:107: ( par_decl )*
				while ( stream_par_decl.hasNext() ) {
					adaptor.addChild(root_1, stream_par_decl.nextTree());
				}
				stream_par_decl.reset();

				adaptor.addChild(root_1, stream_body.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 16, function_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "function"


	public static class par_decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "par_decl"
	// com/github/gumtreediff/gen/antlr3/r/R.g:151:1: par_decl : (iid= ID -> ^( ID NULL[iid] ) | ID n_ ASSIGN n_ expr -> ^( ID expr ) | VARIATIC -> VARIATIC );
	public final RParser.par_decl_return par_decl() throws RecognitionException {
		RParser.par_decl_return retval = new RParser.par_decl_return();
		retval.start = input.LT(1);
		int par_decl_StartIndex = input.index();

		CommonTree root_0 = null;

		Token iid=null;
		Token ID89=null;
		Token ASSIGN91=null;
		Token VARIATIC94=null;
		ParserRuleReturnScope n_90 =null;
		ParserRuleReturnScope n_92 =null;
		ParserRuleReturnScope expr93 =null;

		CommonTree iid_tree=null;
		CommonTree ID89_tree=null;
		CommonTree ASSIGN91_tree=null;
		CommonTree VARIATIC94_tree=null;
		RewriteRuleTokenStream stream_VARIATIC=new RewriteRuleTokenStream(adaptor,"token VARIATIC");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:152:3: (iid= ID -> ^( ID NULL[iid] ) | ID n_ ASSIGN n_ expr -> ^( ID expr ) | VARIATIC -> VARIATIC )
			int alt18=3;
			alt18 = dfa18.predict(input);
			switch (alt18) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:152:5: iid= ID
					{
					iid=(Token)match(input,ID,FOLLOW_ID_in_par_decl1018); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(iid);


					// AST REWRITE
					// elements: ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 152:12: -> ^( ID NULL[iid] )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:152:15: ^( ID NULL[iid] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(NULL, iid));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:153:5: ID n_ ASSIGN n_ expr
					{
					ID89=(Token)match(input,ID,FOLLOW_ID_in_par_decl1033); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID89);

					pushFollow(FOLLOW_n__in_par_decl1035);
					n_90=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_90.getTree());
					ASSIGN91=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_par_decl1037); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN91);

					pushFollow(FOLLOW_n__in_par_decl1039);
					n_92=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_92.getTree());
					pushFollow(FOLLOW_expr_in_par_decl1041);
					expr93=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr93.getTree());

					// AST REWRITE
					// elements: ID, expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 153:26: -> ^( ID expr )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:153:29: ^( ID expr )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ID.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:154:5: VARIATIC
					{
					VARIATIC94=(Token)match(input,VARIATIC,FOLLOW_VARIATIC_in_par_decl1055); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIATIC.add(VARIATIC94);


					// AST REWRITE
					// elements: VARIATIC
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 154:14: -> VARIATIC
					{
						adaptor.addChild(root_0, stream_VARIATIC.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 17, par_decl_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "par_decl"


	public static class tilde_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tilde_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:156:1: tilde_expr : or_expr ( TILDE ^ n_ ! or_expr )* ;
	public final RParser.tilde_expr_return tilde_expr() throws RecognitionException {
		RParser.tilde_expr_return retval = new RParser.tilde_expr_return();
		retval.start = input.LT(1);
		int tilde_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token TILDE96=null;
		ParserRuleReturnScope or_expr95 =null;
		ParserRuleReturnScope n_97 =null;
		ParserRuleReturnScope or_expr98 =null;

		CommonTree TILDE96_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:157:3: ( or_expr ( TILDE ^ n_ ! or_expr )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:157:5: or_expr ( TILDE ^ n_ ! or_expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_or_expr_in_tilde_expr1071);
			or_expr95=or_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expr95.getTree());

			// com/github/gumtreediff/gen/antlr3/r/R.g:157:13: ( TILDE ^ n_ ! or_expr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==TILDE) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:157:14: TILDE ^ n_ ! or_expr
					{
					TILDE96=(Token)match(input,TILDE,FOLLOW_TILDE_in_tilde_expr1074); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TILDE96_tree = (CommonTree)adaptor.create(TILDE96);
					root_0 = (CommonTree)adaptor.becomeRoot(TILDE96_tree, root_0);
					}

					pushFollow(FOLLOW_n__in_tilde_expr1077);
					n_97=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_or_expr_in_tilde_expr1080);
					or_expr98=or_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, or_expr98.getTree());

					}
					break;

				default :
					break loop19;
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
			if ( state.backtracking>0 ) { memoize(input, 18, tilde_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tilde_expr"


	public static class or_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "or_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:159:1: or_expr : and_expr ( or_operator ^ n_ ! and_expr )* ;
	public final RParser.or_expr_return or_expr() throws RecognitionException {
		RParser.or_expr_return retval = new RParser.or_expr_return();
		retval.start = input.LT(1);
		int or_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope and_expr99 =null;
		ParserRuleReturnScope or_operator100 =null;
		ParserRuleReturnScope n_101 =null;
		ParserRuleReturnScope and_expr102 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:160:3: ( and_expr ( or_operator ^ n_ ! and_expr )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:160:5: and_expr ( or_operator ^ n_ ! and_expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_and_expr_in_or_expr1094);
			and_expr99=and_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expr99.getTree());

			// com/github/gumtreediff/gen/antlr3/r/R.g:160:14: ( or_operator ^ n_ ! and_expr )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==BITWISEOR||LA20_0==OR) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:160:15: or_operator ^ n_ ! and_expr
					{
					pushFollow(FOLLOW_or_operator_in_or_expr1097);
					or_operator100=or_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(or_operator100.getTree(), root_0);
					pushFollow(FOLLOW_n__in_or_expr1100);
					n_101=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_and_expr_in_or_expr1103);
					and_expr102=and_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expr102.getTree());

					}
					break;

				default :
					break loop20;
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
			if ( state.backtracking>0 ) { memoize(input, 19, or_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "or_expr"


	public static class and_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "and_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:162:1: and_expr : comp_expr ( and_operator ^ n_ ! comp_expr )* ;
	public final RParser.and_expr_return and_expr() throws RecognitionException {
		RParser.and_expr_return retval = new RParser.and_expr_return();
		retval.start = input.LT(1);
		int and_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope comp_expr103 =null;
		ParserRuleReturnScope and_operator104 =null;
		ParserRuleReturnScope n_105 =null;
		ParserRuleReturnScope comp_expr106 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:163:3: ( comp_expr ( and_operator ^ n_ ! comp_expr )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:163:5: comp_expr ( and_operator ^ n_ ! comp_expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_comp_expr_in_and_expr1117);
			comp_expr103=comp_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comp_expr103.getTree());

			// com/github/gumtreediff/gen/antlr3/r/R.g:163:15: ( and_operator ^ n_ ! comp_expr )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==AND||LA21_0==BITWISEAND) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:163:16: and_operator ^ n_ ! comp_expr
					{
					pushFollow(FOLLOW_and_operator_in_and_expr1120);
					and_operator104=and_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(and_operator104.getTree(), root_0);
					pushFollow(FOLLOW_n__in_and_expr1123);
					n_105=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_comp_expr_in_and_expr1126);
					comp_expr106=comp_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comp_expr106.getTree());

					}
					break;

				default :
					break loop21;
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
			if ( state.backtracking>0 ) { memoize(input, 20, and_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "and_expr"


	public static class comp_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comp_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:165:1: comp_expr : add_expr ( comp_operator ^ n_ ! add_expr )* ;
	public final RParser.comp_expr_return comp_expr() throws RecognitionException {
		RParser.comp_expr_return retval = new RParser.comp_expr_return();
		retval.start = input.LT(1);
		int comp_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope add_expr107 =null;
		ParserRuleReturnScope comp_operator108 =null;
		ParserRuleReturnScope n_109 =null;
		ParserRuleReturnScope add_expr110 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:166:3: ( add_expr ( comp_operator ^ n_ ! add_expr )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:166:5: add_expr ( comp_operator ^ n_ ! add_expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_add_expr_in_comp_expr1142);
			add_expr107=add_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr107.getTree());

			// com/github/gumtreediff/gen/antlr3/r/R.g:166:14: ( comp_operator ^ n_ ! add_expr )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==EQ||(LA22_0 >= GE && LA22_0 <= GT)||LA22_0==LE||LA22_0==LT||LA22_0==NE) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:166:15: comp_operator ^ n_ ! add_expr
					{
					pushFollow(FOLLOW_comp_operator_in_comp_expr1145);
					comp_operator108=comp_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comp_operator108.getTree(), root_0);
					pushFollow(FOLLOW_n__in_comp_expr1148);
					n_109=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_add_expr_in_comp_expr1151);
					add_expr110=add_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, add_expr110.getTree());

					}
					break;

				default :
					break loop22;
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
			if ( state.backtracking>0 ) { memoize(input, 21, comp_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comp_expr"


	public static class add_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "add_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:168:1: add_expr : mult_expr ( add_operator ^ n_ ! mult_expr )* ;
	public final RParser.add_expr_return add_expr() throws RecognitionException {
		RParser.add_expr_return retval = new RParser.add_expr_return();
		retval.start = input.LT(1);
		int add_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope mult_expr111 =null;
		ParserRuleReturnScope add_operator112 =null;
		ParserRuleReturnScope n_113 =null;
		ParserRuleReturnScope mult_expr114 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:169:3: ( mult_expr ( add_operator ^ n_ ! mult_expr )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:169:5: mult_expr ( add_operator ^ n_ ! mult_expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_mult_expr_in_add_expr1166);
			mult_expr111=mult_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr111.getTree());

			// com/github/gumtreediff/gen/antlr3/r/R.g:169:15: ( add_operator ^ n_ ! mult_expr )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==MINUS||LA23_0==PLUS) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:169:16: add_operator ^ n_ ! mult_expr
					{
					pushFollow(FOLLOW_add_operator_in_add_expr1169);
					add_operator112=add_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(add_operator112.getTree(), root_0);
					pushFollow(FOLLOW_n__in_add_expr1172);
					n_113=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_mult_expr_in_add_expr1175);
					mult_expr114=mult_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, mult_expr114.getTree());

					}
					break;

				default :
					break loop23;
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
			if ( state.backtracking>0 ) { memoize(input, 22, add_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "add_expr"


	public static class mult_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mult_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:171:1: mult_expr : operator_expr ( mult_operator ^ n_ ! operator_expr )* ;
	public final RParser.mult_expr_return mult_expr() throws RecognitionException {
		RParser.mult_expr_return retval = new RParser.mult_expr_return();
		retval.start = input.LT(1);
		int mult_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope operator_expr115 =null;
		ParserRuleReturnScope mult_operator116 =null;
		ParserRuleReturnScope n_117 =null;
		ParserRuleReturnScope operator_expr118 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:172:3: ( operator_expr ( mult_operator ^ n_ ! operator_expr )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:172:5: operator_expr ( mult_operator ^ n_ ! operator_expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_operator_expr_in_mult_expr1189);
			operator_expr115=operator_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_expr115.getTree());

			// com/github/gumtreediff/gen/antlr3/r/R.g:172:19: ( mult_operator ^ n_ ! operator_expr )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==DIV||(LA24_0 >= MOD && LA24_0 <= MULT)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:172:20: mult_operator ^ n_ ! operator_expr
					{
					pushFollow(FOLLOW_mult_operator_in_mult_expr1192);
					mult_operator116=mult_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(mult_operator116.getTree(), root_0);
					pushFollow(FOLLOW_n__in_mult_expr1195);
					n_117=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_operator_expr_in_mult_expr1198);
					operator_expr118=operator_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_expr118.getTree());

					}
					break;

				default :
					break loop24;
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
			if ( state.backtracking>0 ) { memoize(input, 23, mult_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "mult_expr"


	public static class operator_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "operator_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:174:1: operator_expr : column_expr ( OP ^ n_ ! column_expr )* ;
	public final RParser.operator_expr_return operator_expr() throws RecognitionException {
		RParser.operator_expr_return retval = new RParser.operator_expr_return();
		retval.start = input.LT(1);
		int operator_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token OP120=null;
		ParserRuleReturnScope column_expr119 =null;
		ParserRuleReturnScope n_121 =null;
		ParserRuleReturnScope column_expr122 =null;

		CommonTree OP120_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:175:3: ( column_expr ( OP ^ n_ ! column_expr )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:175:5: column_expr ( OP ^ n_ ! column_expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_column_expr_in_operator_expr1212);
			column_expr119=column_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, column_expr119.getTree());

			// com/github/gumtreediff/gen/antlr3/r/R.g:175:17: ( OP ^ n_ ! column_expr )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==OP) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:175:18: OP ^ n_ ! column_expr
					{
					OP120=(Token)match(input,OP,FOLLOW_OP_in_operator_expr1215); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OP120_tree = (CommonTree)adaptor.create(OP120);
					root_0 = (CommonTree)adaptor.becomeRoot(OP120_tree, root_0);
					}

					pushFollow(FOLLOW_n__in_operator_expr1218);
					n_121=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_column_expr_in_operator_expr1221);
					column_expr122=column_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, column_expr122.getTree());

					}
					break;

				default :
					break loop25;
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
			if ( state.backtracking>0 ) { memoize(input, 24, operator_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "operator_expr"


	public static class column_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "column_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:177:1: column_expr : power_expr ( COLUMN ^ n_ ! power_expr )* ;
	public final RParser.column_expr_return column_expr() throws RecognitionException {
		RParser.column_expr_return retval = new RParser.column_expr_return();
		retval.start = input.LT(1);
		int column_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COLUMN124=null;
		ParserRuleReturnScope power_expr123 =null;
		ParserRuleReturnScope n_125 =null;
		ParserRuleReturnScope power_expr126 =null;

		CommonTree COLUMN124_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:178:3: ( power_expr ( COLUMN ^ n_ ! power_expr )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:178:5: power_expr ( COLUMN ^ n_ ! power_expr )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_power_expr_in_column_expr1235);
			power_expr123=power_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expr123.getTree());

			// com/github/gumtreediff/gen/antlr3/r/R.g:178:16: ( COLUMN ^ n_ ! power_expr )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==COLUMN) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:178:17: COLUMN ^ n_ ! power_expr
					{
					COLUMN124=(Token)match(input,COLUMN,FOLLOW_COLUMN_in_column_expr1238); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COLUMN124_tree = (CommonTree)adaptor.create(COLUMN124);
					root_0 = (CommonTree)adaptor.becomeRoot(COLUMN124_tree, root_0);
					}

					pushFollow(FOLLOW_n__in_column_expr1241);
					n_125=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_power_expr_in_column_expr1244);
					power_expr126=power_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, power_expr126.getTree());

					}
					break;

				default :
					break loop26;
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
			if ( state.backtracking>0 ) { memoize(input, 25, column_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "column_expr"


	public static class power_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "power_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:180:1: power_expr : l= unary_expression ( power_operator ^ n_ !r= unary_expression )* ;
	public final RParser.power_expr_return power_expr() throws RecognitionException {
		RParser.power_expr_return retval = new RParser.power_expr_return();
		retval.start = input.LT(1);
		int power_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope power_operator127 =null;
		ParserRuleReturnScope n_128 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:181:3: (l= unary_expression ( power_operator ^ n_ !r= unary_expression )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:181:5: l= unary_expression ( power_operator ^ n_ !r= unary_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_unary_expression_in_power_expr1260);
			l=unary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// com/github/gumtreediff/gen/antlr3/r/R.g:181:24: ( power_operator ^ n_ !r= unary_expression )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==CARRET) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:181:25: power_operator ^ n_ !r= unary_expression
					{
					pushFollow(FOLLOW_power_operator_in_power_expr1263);
					power_operator127=power_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(power_operator127.getTree(), root_0);
					pushFollow(FOLLOW_n__in_power_expr1266);
					n_128=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_unary_expression_in_power_expr1271);
					r=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					}
					break;

				default :
					break loop27;
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
			if ( state.backtracking>0 ) { memoize(input, 26, power_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "power_expr"


	public static class unary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary_expression"
	// com/github/gumtreediff/gen/antlr3/r/R.g:183:1: unary_expression : ( NOT n_ unary_expression -> ^( NOT unary_expression ) |pl= PLUS n_ unary_expression -> ^( UPLUS[pl] unary_expression ) |m= MINUS n_ unary_expression -> ^( UMINUS[m] unary_expression ) |t= TILDE n_ unary_expression -> ^( UTILDE[t] unary_expression ) | basic_expr );
	public final RParser.unary_expression_return unary_expression() throws RecognitionException {
		RParser.unary_expression_return retval = new RParser.unary_expression_return();
		retval.start = input.LT(1);
		int unary_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token pl=null;
		Token m=null;
		Token t=null;
		Token NOT129=null;
		ParserRuleReturnScope n_130 =null;
		ParserRuleReturnScope unary_expression131 =null;
		ParserRuleReturnScope n_132 =null;
		ParserRuleReturnScope unary_expression133 =null;
		ParserRuleReturnScope n_134 =null;
		ParserRuleReturnScope unary_expression135 =null;
		ParserRuleReturnScope n_136 =null;
		ParserRuleReturnScope unary_expression137 =null;
		ParserRuleReturnScope basic_expr138 =null;

		CommonTree pl_tree=null;
		CommonTree m_tree=null;
		CommonTree t_tree=null;
		CommonTree NOT129_tree=null;
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:184:3: ( NOT n_ unary_expression -> ^( NOT unary_expression ) |pl= PLUS n_ unary_expression -> ^( UPLUS[pl] unary_expression ) |m= MINUS n_ unary_expression -> ^( UMINUS[m] unary_expression ) |t= TILDE n_ unary_expression -> ^( UTILDE[t] unary_expression ) | basic_expr )
			int alt28=5;
			switch ( input.LA(1) ) {
			case NOT:
				{
				alt28=1;
				}
				break;
			case PLUS:
				{
				alt28=2;
				}
				break;
			case MINUS:
				{
				alt28=3;
				}
				break;
			case TILDE:
				{
				alt28=4;
				}
				break;
			case BREAK:
			case DD:
			case FALSE:
			case FOR:
			case FUNCTION:
			case ID:
			case IF:
			case LBRACE:
			case LPAR:
			case NEXT:
			case NULL:
			case NUMBER:
			case REPEAT:
			case STRING:
			case TRUE:
			case VARIATIC:
			case WHILE:
				{
				alt28=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:184:5: NOT n_ unary_expression
					{
					NOT129=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression1286); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT129);

					pushFollow(FOLLOW_n__in_unary_expression1288);
					n_130=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_130.getTree());
					pushFollow(FOLLOW_unary_expression_in_unary_expression1290);
					unary_expression131=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression131.getTree());

					// AST REWRITE
					// elements: unary_expression, NOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 184:29: -> ^( NOT unary_expression )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:184:32: ^( NOT unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_NOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:185:5: pl= PLUS n_ unary_expression
					{
					pl=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression1306); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(pl);

					pushFollow(FOLLOW_n__in_unary_expression1308);
					n_132=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_132.getTree());
					pushFollow(FOLLOW_unary_expression_in_unary_expression1310);
					unary_expression133=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression133.getTree());

					// AST REWRITE
					// elements: unary_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 185:33: -> ^( UPLUS[pl] unary_expression )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:185:36: ^( UPLUS[pl] unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UPLUS, pl), root_1);
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:186:5: m= MINUS n_ unary_expression
					{
					m=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression1327); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(m);

					pushFollow(FOLLOW_n__in_unary_expression1329);
					n_134=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_134.getTree());
					pushFollow(FOLLOW_unary_expression_in_unary_expression1331);
					unary_expression135=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression135.getTree());

					// AST REWRITE
					// elements: unary_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 186:33: -> ^( UMINUS[m] unary_expression )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:186:36: ^( UMINUS[m] unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UMINUS, m), root_1);
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:187:5: t= TILDE n_ unary_expression
					{
					t=(Token)match(input,TILDE,FOLLOW_TILDE_in_unary_expression1348); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TILDE.add(t);

					pushFollow(FOLLOW_n__in_unary_expression1350);
					n_136=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_136.getTree());
					pushFollow(FOLLOW_unary_expression_in_unary_expression1352);
					unary_expression137=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression137.getTree());

					// AST REWRITE
					// elements: unary_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 187:33: -> ^( UTILDE[t] unary_expression )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:187:36: ^( UTILDE[t] unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(UTILDE, t), root_1);
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:188:5: basic_expr
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_basic_expr_in_unary_expression1367);
					basic_expr138=basic_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, basic_expr138.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 27, unary_expression_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "unary_expression"


	public static class basic_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "basic_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:190:1: basic_expr : (lhs= simple_expr -> $lhs) ( ( FIELD n_ name= id ) -> ^( FIELD $basic_expr $name) | ( AT n_ name= id ) -> ^( AT $basic_expr $name) | ( LBRAKET subscript= expr_list RBRAKET ) -> ^( BRAKET[lhs.start] $basic_expr ( $subscript)? ) | ( LBB subscript= expr_list RBRAKET RBRAKET ) -> ^( LBB $basic_expr ( $subscript)? ) | ( LPAR a= args RPAR ) -> ^( CALL[lhs.start] $basic_expr ( $a)? ) )* ;
	public final RParser.basic_expr_return basic_expr() throws RecognitionException {
		RParser.basic_expr_return retval = new RParser.basic_expr_return();
		retval.start = input.LT(1);
		int basic_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token FIELD139=null;
		Token AT141=null;
		Token LBRAKET143=null;
		Token RBRAKET144=null;
		Token LBB145=null;
		Token RBRAKET146=null;
		Token RBRAKET147=null;
		Token LPAR148=null;
		Token RPAR149=null;
		ParserRuleReturnScope lhs =null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope subscript =null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope n_140 =null;
		ParserRuleReturnScope n_142 =null;

		CommonTree FIELD139_tree=null;
		CommonTree AT141_tree=null;
		CommonTree LBRAKET143_tree=null;
		CommonTree RBRAKET144_tree=null;
		CommonTree LBB145_tree=null;
		CommonTree RBRAKET146_tree=null;
		CommonTree RBRAKET147_tree=null;
		CommonTree LPAR148_tree=null;
		CommonTree RPAR149_tree=null;
		RewriteRuleTokenStream stream_AT=new RewriteRuleTokenStream(adaptor,"token AT");
		RewriteRuleTokenStream stream_FIELD=new RewriteRuleTokenStream(adaptor,"token FIELD");
		RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
		RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
		RewriteRuleTokenStream stream_RBRAKET=new RewriteRuleTokenStream(adaptor,"token RBRAKET");
		RewriteRuleTokenStream stream_LBB=new RewriteRuleTokenStream(adaptor,"token LBB");
		RewriteRuleTokenStream stream_LBRAKET=new RewriteRuleTokenStream(adaptor,"token LBRAKET");
		RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
		RewriteRuleSubtreeStream stream_simple_expr=new RewriteRuleSubtreeStream(adaptor,"rule simple_expr");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:191:3: ( (lhs= simple_expr -> $lhs) ( ( FIELD n_ name= id ) -> ^( FIELD $basic_expr $name) | ( AT n_ name= id ) -> ^( AT $basic_expr $name) | ( LBRAKET subscript= expr_list RBRAKET ) -> ^( BRAKET[lhs.start] $basic_expr ( $subscript)? ) | ( LBB subscript= expr_list RBRAKET RBRAKET ) -> ^( LBB $basic_expr ( $subscript)? ) | ( LPAR a= args RPAR ) -> ^( CALL[lhs.start] $basic_expr ( $a)? ) )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:191:5: (lhs= simple_expr -> $lhs) ( ( FIELD n_ name= id ) -> ^( FIELD $basic_expr $name) | ( AT n_ name= id ) -> ^( AT $basic_expr $name) | ( LBRAKET subscript= expr_list RBRAKET ) -> ^( BRAKET[lhs.start] $basic_expr ( $subscript)? ) | ( LBB subscript= expr_list RBRAKET RBRAKET ) -> ^( LBB $basic_expr ( $subscript)? ) | ( LPAR a= args RPAR ) -> ^( CALL[lhs.start] $basic_expr ( $a)? ) )*
			{
			// com/github/gumtreediff/gen/antlr3/r/R.g:191:5: (lhs= simple_expr -> $lhs)
			// com/github/gumtreediff/gen/antlr3/r/R.g:191:6: lhs= simple_expr
			{
			pushFollow(FOLLOW_simple_expr_in_basic_expr1382);
			lhs=simple_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_simple_expr.add(lhs.getTree());

			// AST REWRITE
			// elements: lhs
			// token labels: 
			// rule labels: lhs, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs",lhs!=null?lhs.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 191:22: -> $lhs
			{
				adaptor.addChild(root_0, stream_lhs.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// com/github/gumtreediff/gen/antlr3/r/R.g:192:7: ( ( FIELD n_ name= id ) -> ^( FIELD $basic_expr $name) | ( AT n_ name= id ) -> ^( AT $basic_expr $name) | ( LBRAKET subscript= expr_list RBRAKET ) -> ^( BRAKET[lhs.start] $basic_expr ( $subscript)? ) | ( LBB subscript= expr_list RBRAKET RBRAKET ) -> ^( LBB $basic_expr ( $subscript)? ) | ( LPAR a= args RPAR ) -> ^( CALL[lhs.start] $basic_expr ( $a)? ) )*
			loop29:
			while (true) {
				int alt29=6;
				switch ( input.LA(1) ) {
				case FIELD:
					{
					alt29=1;
					}
					break;
				case AT:
					{
					alt29=2;
					}
					break;
				case LBRAKET:
					{
					alt29=3;
					}
					break;
				case LBB:
					{
					alt29=4;
					}
					break;
				case LPAR:
					{
					alt29=5;
					}
					break;
				}
				switch (alt29) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:192:9: ( FIELD n_ name= id )
					{
					// com/github/gumtreediff/gen/antlr3/r/R.g:192:9: ( FIELD n_ name= id )
					// com/github/gumtreediff/gen/antlr3/r/R.g:192:10: FIELD n_ name= id
					{
					FIELD139=(Token)match(input,FIELD,FOLLOW_FIELD_in_basic_expr1399); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FIELD.add(FIELD139);

					pushFollow(FOLLOW_n__in_basic_expr1401);
					n_140=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_140.getTree());
					pushFollow(FOLLOW_id_in_basic_expr1405);
					name=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(name.getTree());
					}


					// AST REWRITE
					// elements: basic_expr, FIELD, name
					// token labels: 
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 192:29: -> ^( FIELD $basic_expr $name)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:192:32: ^( FIELD $basic_expr $name)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_FIELD.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:193:9: ( AT n_ name= id )
					{
					// com/github/gumtreediff/gen/antlr3/r/R.g:193:9: ( AT n_ name= id )
					// com/github/gumtreediff/gen/antlr3/r/R.g:193:10: AT n_ name= id
					{
					AT141=(Token)match(input,AT,FOLLOW_AT_in_basic_expr1430); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AT.add(AT141);

					pushFollow(FOLLOW_n__in_basic_expr1432);
					n_142=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_142.getTree());
					pushFollow(FOLLOW_id_in_basic_expr1436);
					name=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(name.getTree());
					}


					// AST REWRITE
					// elements: basic_expr, name, AT
					// token labels: 
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 193:25: -> ^( AT $basic_expr $name)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:193:28: ^( AT $basic_expr $name)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_AT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:194:9: ( LBRAKET subscript= expr_list RBRAKET )
					{
					// com/github/gumtreediff/gen/antlr3/r/R.g:194:9: ( LBRAKET subscript= expr_list RBRAKET )
					// com/github/gumtreediff/gen/antlr3/r/R.g:194:10: LBRAKET subscript= expr_list RBRAKET
					{
					LBRAKET143=(Token)match(input,LBRAKET,FOLLOW_LBRAKET_in_basic_expr1460); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRAKET.add(LBRAKET143);

					pushFollow(FOLLOW_expr_list_in_basic_expr1464);
					subscript=expr_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_list.add(subscript.getTree());
					RBRAKET144=(Token)match(input,RBRAKET,FOLLOW_RBRAKET_in_basic_expr1466); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRAKET.add(RBRAKET144);

					}


					// AST REWRITE
					// elements: subscript, basic_expr
					// token labels: 
					// rule labels: subscript, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_subscript=new RewriteRuleSubtreeStream(adaptor,"rule subscript",subscript!=null?subscript.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 194:47: -> ^( BRAKET[lhs.start] $basic_expr ( $subscript)? )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:194:50: ^( BRAKET[lhs.start] $basic_expr ( $subscript)? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRAKET, lhs.start), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// com/github/gumtreediff/gen/antlr3/r/R.g:194:83: ( $subscript)?
						if ( stream_subscript.hasNext() ) {
							adaptor.addChild(root_1, stream_subscript.nextTree());
						}
						stream_subscript.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:195:9: ( LBB subscript= expr_list RBRAKET RBRAKET )
					{
					// com/github/gumtreediff/gen/antlr3/r/R.g:195:9: ( LBB subscript= expr_list RBRAKET RBRAKET )
					// com/github/gumtreediff/gen/antlr3/r/R.g:195:10: LBB subscript= expr_list RBRAKET RBRAKET
					{
					LBB145=(Token)match(input,LBB,FOLLOW_LBB_in_basic_expr1492); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBB.add(LBB145);

					pushFollow(FOLLOW_expr_list_in_basic_expr1496);
					subscript=expr_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_list.add(subscript.getTree());
					RBRAKET146=(Token)match(input,RBRAKET,FOLLOW_RBRAKET_in_basic_expr1498); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRAKET.add(RBRAKET146);

					RBRAKET147=(Token)match(input,RBRAKET,FOLLOW_RBRAKET_in_basic_expr1500); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRAKET.add(RBRAKET147);

					}


					// AST REWRITE
					// elements: basic_expr, LBB, subscript
					// token labels: 
					// rule labels: subscript, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_subscript=new RewriteRuleSubtreeStream(adaptor,"rule subscript",subscript!=null?subscript.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 195:51: -> ^( LBB $basic_expr ( $subscript)? )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:195:54: ^( LBB $basic_expr ( $subscript)? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_LBB.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// com/github/gumtreediff/gen/antlr3/r/R.g:195:73: ( $subscript)?
						if ( stream_subscript.hasNext() ) {
							adaptor.addChild(root_1, stream_subscript.nextTree());
						}
						stream_subscript.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:197:9: ( LPAR a= args RPAR )
					{
					// com/github/gumtreediff/gen/antlr3/r/R.g:197:9: ( LPAR a= args RPAR )
					// com/github/gumtreediff/gen/antlr3/r/R.g:197:10: LPAR a= args RPAR
					{
					LPAR148=(Token)match(input,LPAR,FOLLOW_LPAR_in_basic_expr1538); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAR.add(LPAR148);

					pushFollow(FOLLOW_args_in_basic_expr1542);
					a=args();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_args.add(a.getTree());
					RPAR149=(Token)match(input,RPAR,FOLLOW_RPAR_in_basic_expr1544); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAR.add(RPAR149);

					}


					// AST REWRITE
					// elements: a, basic_expr
					// token labels: 
					// rule labels: a, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 197:30: -> ^( CALL[lhs.start] $basic_expr ( $a)? )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:197:33: ^( CALL[lhs.start] $basic_expr ( $a)? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CALL, lhs.start), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// com/github/gumtreediff/gen/antlr3/r/R.g:197:64: ( $a)?
						if ( stream_a.hasNext() ) {
							adaptor.addChild(root_1, stream_a.nextTree());
						}
						stream_a.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop29;
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
			if ( state.backtracking>0 ) { memoize(input, 28, basic_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "basic_expr"


	public static class simple_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:200:1: simple_expr : ( id | bool | DD | NULL | NUMBER | id NS_GET ^ n_ ! id | id NS_GET_INT ^ n_ ! id | LPAR ! n_ ! expr_or_assign n_ ! RPAR !| sequence | expr_wo_assign );
	public final RParser.simple_expr_return simple_expr() throws RecognitionException {
		RParser.simple_expr_return retval = new RParser.simple_expr_return();
		retval.start = input.LT(1);
		int simple_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token DD152=null;
		Token NULL153=null;
		Token NUMBER154=null;
		Token NS_GET156=null;
		Token NS_GET_INT160=null;
		Token LPAR163=null;
		Token RPAR167=null;
		ParserRuleReturnScope id150 =null;
		ParserRuleReturnScope bool151 =null;
		ParserRuleReturnScope id155 =null;
		ParserRuleReturnScope n_157 =null;
		ParserRuleReturnScope id158 =null;
		ParserRuleReturnScope id159 =null;
		ParserRuleReturnScope n_161 =null;
		ParserRuleReturnScope id162 =null;
		ParserRuleReturnScope n_164 =null;
		ParserRuleReturnScope expr_or_assign165 =null;
		ParserRuleReturnScope n_166 =null;
		ParserRuleReturnScope sequence168 =null;
		ParserRuleReturnScope expr_wo_assign169 =null;

		CommonTree DD152_tree=null;
		CommonTree NULL153_tree=null;
		CommonTree NUMBER154_tree=null;
		CommonTree NS_GET156_tree=null;
		CommonTree NS_GET_INT160_tree=null;
		CommonTree LPAR163_tree=null;
		CommonTree RPAR167_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:201:3: ( id | bool | DD | NULL | NUMBER | id NS_GET ^ n_ ! id | id NS_GET_INT ^ n_ ! id | LPAR ! n_ ! expr_or_assign n_ ! RPAR !| sequence | expr_wo_assign )
			int alt30=10;
			switch ( input.LA(1) ) {
			case ID:
			case STRING:
			case VARIATIC:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case AND:
				case ARROW:
				case ASSIGN:
				case AT:
				case BITWISEAND:
				case BITWISEOR:
				case CARRET:
				case COLUMN:
				case COMMA:
				case COMMENT:
				case DIV:
				case ELSE:
				case EQ:
				case FIELD:
				case GE:
				case GT:
				case LBB:
				case LBRAKET:
				case LE:
				case LPAR:
				case LT:
				case MINUS:
				case MOD:
				case MULT:
				case NE:
				case NEWLINE:
				case OP:
				case OR:
				case PLUS:
				case RBRACE:
				case RBRAKET:
				case RIGHT_ARROW:
				case RPAR:
				case SEMICOLUMN:
				case SUPER_ARROW:
				case SUPER_RIGHT_ARROW:
				case TILDE:
					{
					alt30=1;
					}
					break;
				case NS_GET:
					{
					alt30=6;
					}
					break;
				case NS_GET_INT:
					{
					alt30=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt30=2;
				}
				break;
			case DD:
				{
				alt30=3;
				}
				break;
			case NULL:
				{
				alt30=4;
				}
				break;
			case NUMBER:
				{
				alt30=5;
				}
				break;
			case LPAR:
				{
				alt30=8;
				}
				break;
			case LBRACE:
				{
				alt30=9;
				}
				break;
			case BREAK:
			case FOR:
			case FUNCTION:
			case IF:
			case NEXT:
			case REPEAT:
			case WHILE:
				{
				alt30=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:201:5: id
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_id_in_simple_expr1582);
					id150=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, id150.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:202:5: bool
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_bool_in_simple_expr1588);
					bool151=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool151.getTree());

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:203:5: DD
					{
					root_0 = (CommonTree)adaptor.nil();


					DD152=(Token)match(input,DD,FOLLOW_DD_in_simple_expr1594); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DD152_tree = (CommonTree)adaptor.create(DD152);
					adaptor.addChild(root_0, DD152_tree);
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:204:5: NULL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL153=(Token)match(input,NULL,FOLLOW_NULL_in_simple_expr1600); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NULL153_tree = (CommonTree)adaptor.create(NULL153);
					adaptor.addChild(root_0, NULL153_tree);
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:205:5: NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					NUMBER154=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_simple_expr1606); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NUMBER154_tree = (CommonTree)adaptor.create(NUMBER154);
					adaptor.addChild(root_0, NUMBER154_tree);
					}

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:206:5: id NS_GET ^ n_ ! id
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_id_in_simple_expr1612);
					id155=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, id155.getTree());

					NS_GET156=(Token)match(input,NS_GET,FOLLOW_NS_GET_in_simple_expr1614); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NS_GET156_tree = (CommonTree)adaptor.create(NS_GET156);
					root_0 = (CommonTree)adaptor.becomeRoot(NS_GET156_tree, root_0);
					}

					pushFollow(FOLLOW_n__in_simple_expr1617);
					n_157=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_id_in_simple_expr1620);
					id158=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, id158.getTree());

					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:207:5: id NS_GET_INT ^ n_ ! id
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_id_in_simple_expr1626);
					id159=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, id159.getTree());

					NS_GET_INT160=(Token)match(input,NS_GET_INT,FOLLOW_NS_GET_INT_in_simple_expr1628); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NS_GET_INT160_tree = (CommonTree)adaptor.create(NS_GET_INT160);
					root_0 = (CommonTree)adaptor.becomeRoot(NS_GET_INT160_tree, root_0);
					}

					pushFollow(FOLLOW_n__in_simple_expr1631);
					n_161=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_id_in_simple_expr1634);
					id162=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, id162.getTree());

					}
					break;
				case 8 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:208:5: LPAR ! n_ ! expr_or_assign n_ ! RPAR !
					{
					root_0 = (CommonTree)adaptor.nil();


					LPAR163=(Token)match(input,LPAR,FOLLOW_LPAR_in_simple_expr1640); if (state.failed) return retval;
					pushFollow(FOLLOW_n__in_simple_expr1643);
					n_164=n_();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_or_assign_in_simple_expr1646);
					expr_or_assign165=expr_or_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or_assign165.getTree());

					pushFollow(FOLLOW_n__in_simple_expr1648);
					n_166=n_();
					state._fsp--;
					if (state.failed) return retval;
					RPAR167=(Token)match(input,RPAR,FOLLOW_RPAR_in_simple_expr1651); if (state.failed) return retval;
					}
					break;
				case 9 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:209:5: sequence
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_sequence_in_simple_expr1658);
					sequence168=sequence();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence168.getTree());

					}
					break;
				case 10 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:210:5: expr_wo_assign
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expr_wo_assign_in_simple_expr1664);
					expr_wo_assign169=expr_wo_assign();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_wo_assign169.getTree());

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
			if ( state.backtracking>0 ) { memoize(input, 29, simple_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "simple_expr"


	public static class id_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "id"
	// com/github/gumtreediff/gen/antlr3/r/R.g:212:1: id : ( ID | STRING | VARIATIC );
	public final RParser.id_return id() throws RecognitionException {
		RParser.id_return retval = new RParser.id_return();
		retval.start = input.LT(1);
		int id_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set170=null;

		CommonTree set170_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:212:5: ( ID | STRING | VARIATIC )
			// com/github/gumtreediff/gen/antlr3/r/R.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set170=input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==STRING||input.LA(1)==VARIATIC ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set170));
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
			if ( state.backtracking>0 ) { memoize(input, 30, id_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "id"


	public static class bool_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// com/github/gumtreediff/gen/antlr3/r/R.g:213:1: bool : ( TRUE | FALSE );
	public final RParser.bool_return bool() throws RecognitionException {
		RParser.bool_return retval = new RParser.bool_return();
		retval.start = input.LT(1);
		int bool_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set171=null;

		CommonTree set171_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:213:5: ( TRUE | FALSE )
			// com/github/gumtreediff/gen/antlr3/r/R.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set171=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set171));
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
			if ( state.backtracking>0 ) { memoize(input, 31, bool_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "bool"


	public static class or_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "or_operator"
	// com/github/gumtreediff/gen/antlr3/r/R.g:214:1: or_operator : ( OR | BITWISEOR );
	public final RParser.or_operator_return or_operator() throws RecognitionException {
		RParser.or_operator_return retval = new RParser.or_operator_return();
		retval.start = input.LT(1);
		int or_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set172=null;

		CommonTree set172_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:215:3: ( OR | BITWISEOR )
			// com/github/gumtreediff/gen/antlr3/r/R.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set172=input.LT(1);
			if ( input.LA(1)==BITWISEOR||input.LA(1)==OR ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set172));
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
			if ( state.backtracking>0 ) { memoize(input, 32, or_operator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "or_operator"


	public static class and_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "and_operator"
	// com/github/gumtreediff/gen/antlr3/r/R.g:216:1: and_operator : ( AND | BITWISEAND );
	public final RParser.and_operator_return and_operator() throws RecognitionException {
		RParser.and_operator_return retval = new RParser.and_operator_return();
		retval.start = input.LT(1);
		int and_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set173=null;

		CommonTree set173_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:217:3: ( AND | BITWISEAND )
			// com/github/gumtreediff/gen/antlr3/r/R.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set173=input.LT(1);
			if ( input.LA(1)==AND||input.LA(1)==BITWISEAND ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set173));
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
			if ( state.backtracking>0 ) { memoize(input, 33, and_operator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "and_operator"


	public static class comp_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "comp_operator"
	// com/github/gumtreediff/gen/antlr3/r/R.g:218:1: comp_operator : ( GT | GE | LT | LE | EQ | NE );
	public final RParser.comp_operator_return comp_operator() throws RecognitionException {
		RParser.comp_operator_return retval = new RParser.comp_operator_return();
		retval.start = input.LT(1);
		int comp_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set174=null;

		CommonTree set174_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:219:3: ( GT | GE | LT | LE | EQ | NE )
			// com/github/gumtreediff/gen/antlr3/r/R.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set174=input.LT(1);
			if ( input.LA(1)==EQ||(input.LA(1) >= GE && input.LA(1) <= GT)||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set174));
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
			if ( state.backtracking>0 ) { memoize(input, 34, comp_operator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "comp_operator"


	public static class add_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "add_operator"
	// com/github/gumtreediff/gen/antlr3/r/R.g:220:1: add_operator : ( PLUS | MINUS );
	public final RParser.add_operator_return add_operator() throws RecognitionException {
		RParser.add_operator_return retval = new RParser.add_operator_return();
		retval.start = input.LT(1);
		int add_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set175=null;

		CommonTree set175_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:221:3: ( PLUS | MINUS )
			// com/github/gumtreediff/gen/antlr3/r/R.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set175=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set175));
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
			if ( state.backtracking>0 ) { memoize(input, 35, add_operator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "add_operator"


	public static class mult_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mult_operator"
	// com/github/gumtreediff/gen/antlr3/r/R.g:222:1: mult_operator : ( MULT | DIV | MOD );
	public final RParser.mult_operator_return mult_operator() throws RecognitionException {
		RParser.mult_operator_return retval = new RParser.mult_operator_return();
		retval.start = input.LT(1);
		int mult_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set176=null;

		CommonTree set176_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:223:3: ( MULT | DIV | MOD )
			// com/github/gumtreediff/gen/antlr3/r/R.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set176=input.LT(1);
			if ( input.LA(1)==DIV||(input.LA(1) >= MOD && input.LA(1) <= MULT) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set176));
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
			if ( state.backtracking>0 ) { memoize(input, 36, mult_operator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "mult_operator"


	public static class power_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "power_operator"
	// com/github/gumtreediff/gen/antlr3/r/R.g:224:1: power_operator : CARRET ;
	public final RParser.power_operator_return power_operator() throws RecognitionException {
		RParser.power_operator_return retval = new RParser.power_operator_return();
		retval.start = input.LT(1);
		int power_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token CARRET177=null;

		CommonTree CARRET177_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:225:3: ( CARRET )
			// com/github/gumtreediff/gen/antlr3/r/R.g:225:5: CARRET
			{
			root_0 = (CommonTree)adaptor.nil();


			CARRET177=(Token)match(input,CARRET,FOLLOW_CARRET_in_power_operator1788); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CARRET177_tree = (CommonTree)adaptor.create(CARRET177);
			adaptor.addChild(root_0, CARRET177_tree);
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
			if ( state.backtracking>0 ) { memoize(input, 37, power_operator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "power_operator"


	public static class expr_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// com/github/gumtreediff/gen/antlr3/r/R.g:227:1: expr_list : ( n_ expr_list_arg )? n_ ( COMMA ( n_ expr_list_arg )? n_ )* -> ( expr_list_arg )* ;
	public final RParser.expr_list_return expr_list() throws RecognitionException {
		RParser.expr_list_return retval = new RParser.expr_list_return();
		retval.start = input.LT(1);
		int expr_list_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA181=null;
		ParserRuleReturnScope n_178 =null;
		ParserRuleReturnScope expr_list_arg179 =null;
		ParserRuleReturnScope n_180 =null;
		ParserRuleReturnScope n_182 =null;
		ParserRuleReturnScope expr_list_arg183 =null;
		ParserRuleReturnScope n_184 =null;

		CommonTree COMMA181_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr_list_arg=new RewriteRuleSubtreeStream(adaptor,"rule expr_list_arg");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:228:3: ( ( n_ expr_list_arg )? n_ ( COMMA ( n_ expr_list_arg )? n_ )* -> ( expr_list_arg )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:228:5: ( n_ expr_list_arg )? n_ ( COMMA ( n_ expr_list_arg )? n_ )*
			{
			// com/github/gumtreediff/gen/antlr3/r/R.g:228:5: ( n_ expr_list_arg )?
			int alt31=2;
			alt31 = dfa31.predict(input);
			switch (alt31) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:228:6: n_ expr_list_arg
					{
					pushFollow(FOLLOW_n__in_expr_list1801);
					n_178=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_178.getTree());
					pushFollow(FOLLOW_expr_list_arg_in_expr_list1803);
					expr_list_arg179=expr_list_arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_list_arg.add(expr_list_arg179.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_n__in_expr_list1807);
			n_180=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_180.getTree());
			// com/github/gumtreediff/gen/antlr3/r/R.g:228:28: ( COMMA ( n_ expr_list_arg )? n_ )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMMA) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:228:29: COMMA ( n_ expr_list_arg )? n_
					{
					COMMA181=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list1810); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA181);

					// com/github/gumtreediff/gen/antlr3/r/R.g:228:35: ( n_ expr_list_arg )?
					int alt32=2;
					alt32 = dfa32.predict(input);
					switch (alt32) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/r/R.g:228:36: n_ expr_list_arg
							{
							pushFollow(FOLLOW_n__in_expr_list1813);
							n_182=n_();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_n_.add(n_182.getTree());
							pushFollow(FOLLOW_expr_list_arg_in_expr_list1815);
							expr_list_arg183=expr_list_arg();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expr_list_arg.add(expr_list_arg183.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_n__in_expr_list1819);
					n_184=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_184.getTree());
					}
					break;

				default :
					break loop33;
				}
			}


			// AST REWRITE
			// elements: expr_list_arg
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 228:60: -> ( expr_list_arg )*
			{
				// com/github/gumtreediff/gen/antlr3/r/R.g:228:63: ( expr_list_arg )*
				while ( stream_expr_list_arg.hasNext() ) {
					adaptor.addChild(root_0, stream_expr_list_arg.nextTree());
				}
				stream_expr_list_arg.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 38, expr_list_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expr_list"


	public static class expr_list_arg_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr_list_arg"
	// com/github/gumtreediff/gen/antlr3/r/R.g:230:1: expr_list_arg : ( expr -> expr |name= id n_ ASSIGN n_ v= expr -> ^( KW[name.start] $name $v) );
	public final RParser.expr_list_arg_return expr_list_arg() throws RecognitionException {
		RParser.expr_list_arg_return retval = new RParser.expr_list_arg_return();
		retval.start = input.LT(1);
		int expr_list_arg_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ASSIGN187=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope expr185 =null;
		ParserRuleReturnScope n_186 =null;
		ParserRuleReturnScope n_188 =null;

		CommonTree ASSIGN187_tree=null;
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:231:3: ( expr -> expr |name= id n_ ASSIGN n_ v= expr -> ^( KW[name.start] $name $v) )
			int alt34=2;
			alt34 = dfa34.predict(input);
			switch (alt34) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:231:5: expr
					{
					pushFollow(FOLLOW_expr_in_expr_list_arg1838);
					expr185=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr185.getTree());

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 231:10: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:232:5: name= id n_ ASSIGN n_ v= expr
					{
					pushFollow(FOLLOW_id_in_expr_list_arg1850);
					name=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(name.getTree());
					pushFollow(FOLLOW_n__in_expr_list_arg1852);
					n_186=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_186.getTree());
					ASSIGN187=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr_list_arg1854); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN187);

					pushFollow(FOLLOW_n__in_expr_list_arg1856);
					n_188=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_188.getTree());
					pushFollow(FOLLOW_expr_in_expr_list_arg1860);
					v=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(v.getTree());

					// AST REWRITE
					// elements: name, v
					// token labels: 
					// rule labels: v, name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 232:33: -> ^( KW[name.start] $name $v)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:232:36: ^( KW[name.start] $name $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KW, name.start), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_1, stream_v.nextTree());
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
			if ( state.backtracking>0 ) { memoize(input, 39, expr_list_arg_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expr_list_arg"


	public static class args_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "args"
	// com/github/gumtreediff/gen/antlr3/r/R.g:234:1: args : ( n_ arg_expr )? n_ ( COMMA ( n_ arg_expr )? n_ )* -> ( arg_expr )* ;
	public final RParser.args_return args() throws RecognitionException {
		RParser.args_return retval = new RParser.args_return();
		retval.start = input.LT(1);
		int args_StartIndex = input.index();

		CommonTree root_0 = null;

		Token COMMA192=null;
		ParserRuleReturnScope n_189 =null;
		ParserRuleReturnScope arg_expr190 =null;
		ParserRuleReturnScope n_191 =null;
		ParserRuleReturnScope n_193 =null;
		ParserRuleReturnScope arg_expr194 =null;
		ParserRuleReturnScope n_195 =null;

		CommonTree COMMA192_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_arg_expr=new RewriteRuleSubtreeStream(adaptor,"rule arg_expr");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:234:5: ( ( n_ arg_expr )? n_ ( COMMA ( n_ arg_expr )? n_ )* -> ( arg_expr )* )
			// com/github/gumtreediff/gen/antlr3/r/R.g:234:7: ( n_ arg_expr )? n_ ( COMMA ( n_ arg_expr )? n_ )*
			{
			// com/github/gumtreediff/gen/antlr3/r/R.g:234:7: ( n_ arg_expr )?
			int alt35=2;
			alt35 = dfa35.predict(input);
			switch (alt35) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:234:8: n_ arg_expr
					{
					pushFollow(FOLLOW_n__in_args1883);
					n_189=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_189.getTree());
					pushFollow(FOLLOW_arg_expr_in_args1885);
					arg_expr190=arg_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arg_expr.add(arg_expr190.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_n__in_args1889);
			n_191=n_();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_n_.add(n_191.getTree());
			// com/github/gumtreediff/gen/antlr3/r/R.g:234:25: ( COMMA ( n_ arg_expr )? n_ )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==COMMA) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:234:26: COMMA ( n_ arg_expr )? n_
					{
					COMMA192=(Token)match(input,COMMA,FOLLOW_COMMA_in_args1892); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA192);

					// com/github/gumtreediff/gen/antlr3/r/R.g:234:32: ( n_ arg_expr )?
					int alt36=2;
					alt36 = dfa36.predict(input);
					switch (alt36) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/r/R.g:234:33: n_ arg_expr
							{
							pushFollow(FOLLOW_n__in_args1895);
							n_193=n_();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_n_.add(n_193.getTree());
							pushFollow(FOLLOW_arg_expr_in_args1897);
							arg_expr194=arg_expr();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arg_expr.add(arg_expr194.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_n__in_args1901);
					n_195=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_195.getTree());
					}
					break;

				default :
					break loop37;
				}
			}


			// AST REWRITE
			// elements: arg_expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 234:52: -> ( arg_expr )*
			{
				// com/github/gumtreediff/gen/antlr3/r/R.g:234:55: ( arg_expr )*
				while ( stream_arg_expr.hasNext() ) {
					adaptor.addChild(root_0, stream_arg_expr.nextTree());
				}
				stream_arg_expr.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 40, args_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "args"


	public static class arg_expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arg_expr"
	// com/github/gumtreediff/gen/antlr3/r/R.g:236:1: arg_expr : ( expr -> expr |name= id n_ ASSIGN n_ v= expr -> ^( KW[name.start] $name $v) |name= id n_ ass= ASSIGN -> ^( KW[name.start] $name NULL[ass] ) |nn= NULL n_ ASSIGN n_ v= expr -> ^( KW[nn] $nn $v) |nnn= NULL n_ ASSIGN -> ^( KW[nnn] $nnn $nnn) );
	public final RParser.arg_expr_return arg_expr() throws RecognitionException {
		RParser.arg_expr_return retval = new RParser.arg_expr_return();
		retval.start = input.LT(1);
		int arg_expr_StartIndex = input.index();

		CommonTree root_0 = null;

		Token ass=null;
		Token nn=null;
		Token nnn=null;
		Token ASSIGN198=null;
		Token ASSIGN202=null;
		Token ASSIGN205=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope expr196 =null;
		ParserRuleReturnScope n_197 =null;
		ParserRuleReturnScope n_199 =null;
		ParserRuleReturnScope n_200 =null;
		ParserRuleReturnScope n_201 =null;
		ParserRuleReturnScope n_203 =null;
		ParserRuleReturnScope n_204 =null;

		CommonTree ass_tree=null;
		CommonTree nn_tree=null;
		CommonTree nnn_tree=null;
		CommonTree ASSIGN198_tree=null;
		CommonTree ASSIGN202_tree=null;
		CommonTree ASSIGN205_tree=null;
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_n_=new RewriteRuleSubtreeStream(adaptor,"rule n_");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// com/github/gumtreediff/gen/antlr3/r/R.g:237:3: ( expr -> expr |name= id n_ ASSIGN n_ v= expr -> ^( KW[name.start] $name $v) |name= id n_ ass= ASSIGN -> ^( KW[name.start] $name NULL[ass] ) |nn= NULL n_ ASSIGN n_ v= expr -> ^( KW[nn] $nn $v) |nnn= NULL n_ ASSIGN -> ^( KW[nnn] $nnn $nnn) )
			int alt38=5;
			alt38 = dfa38.predict(input);
			switch (alt38) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:237:5: expr
					{
					pushFollow(FOLLOW_expr_in_arg_expr1921);
					expr196=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr196.getTree());

					// AST REWRITE
					// elements: expr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 237:10: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:238:5: name= id n_ ASSIGN n_ v= expr
					{
					pushFollow(FOLLOW_id_in_arg_expr1933);
					name=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(name.getTree());
					pushFollow(FOLLOW_n__in_arg_expr1935);
					n_197=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_197.getTree());
					ASSIGN198=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arg_expr1937); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN198);

					pushFollow(FOLLOW_n__in_arg_expr1939);
					n_199=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_199.getTree());
					pushFollow(FOLLOW_expr_in_arg_expr1943);
					v=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(v.getTree());

					// AST REWRITE
					// elements: v, name
					// token labels: 
					// rule labels: v, name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 238:33: -> ^( KW[name.start] $name $v)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:238:36: ^( KW[name.start] $name $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KW, name.start), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_1, stream_v.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:239:5: name= id n_ ass= ASSIGN
					{
					pushFollow(FOLLOW_id_in_arg_expr1964);
					name=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(name.getTree());
					pushFollow(FOLLOW_n__in_arg_expr1966);
					n_200=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_200.getTree());
					ass=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arg_expr1970); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ass);


					// AST REWRITE
					// elements: name
					// token labels: 
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 239:27: -> ^( KW[name.start] $name NULL[ass] )
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:239:30: ^( KW[name.start] $name NULL[ass] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KW, name.start), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(NULL, ass));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:240:5: nn= NULL n_ ASSIGN n_ v= expr
					{
					nn=(Token)match(input,NULL,FOLLOW_NULL_in_arg_expr1992); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(nn);

					pushFollow(FOLLOW_n__in_arg_expr1994);
					n_201=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_201.getTree());
					ASSIGN202=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arg_expr1996); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN202);

					pushFollow(FOLLOW_n__in_arg_expr1998);
					n_203=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_203.getTree());
					pushFollow(FOLLOW_expr_in_arg_expr2002);
					v=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(v.getTree());

					// AST REWRITE
					// elements: nn, v
					// token labels: nn
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_nn=new RewriteRuleTokenStream(adaptor,"token nn",nn);
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 240:33: -> ^( KW[nn] $nn $v)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:240:36: ^( KW[nn] $nn $v)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KW, nn), root_1);
						adaptor.addChild(root_1, stream_nn.nextNode());
						adaptor.addChild(root_1, stream_v.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/r/R.g:241:5: nnn= NULL n_ ASSIGN
					{
					nnn=(Token)match(input,NULL,FOLLOW_NULL_in_arg_expr2023); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(nnn);

					pushFollow(FOLLOW_n__in_arg_expr2025);
					n_204=n_();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_n_.add(n_204.getTree());
					ASSIGN205=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_arg_expr2027); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN205);


					// AST REWRITE
					// elements: nnn, nnn
					// token labels: nnn
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_nnn=new RewriteRuleTokenStream(adaptor,"token nnn",nnn);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 241:24: -> ^( KW[nnn] $nnn $nnn)
					{
						// com/github/gumtreediff/gen/antlr3/r/R.g:241:27: ^( KW[nnn] $nnn $nnn)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KW, nnn), root_1);
						adaptor.addChild(root_1, stream_nnn.nextNode());
						adaptor.addChild(root_1, stream_nnn.nextNode());
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
			if ( state.backtracking>0 ) { memoize(input, 41, arg_expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "arg_expr"

	// $ANTLR start synpred1_R
	public final void synpred1_R_fragment() throws RecognitionException {
		ParserRuleReturnScope f =null;


		// com/github/gumtreediff/gen/antlr3/r/R.g:132:5: ( n_ ELSE n_ f= expr_or_assign )
		// com/github/gumtreediff/gen/antlr3/r/R.g:132:5: n_ ELSE n_ f= expr_or_assign
		{
		pushFollow(FOLLOW_n__in_synpred1_R788);
		n_();
		state._fsp--;
		if (state.failed) return;

		match(input,ELSE,FOLLOW_ELSE_in_synpred1_R790); if (state.failed) return;

		pushFollow(FOLLOW_n__in_synpred1_R792);
		n_();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_expr_or_assign_in_synpred1_R796);
		f=expr_or_assign();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_R

	// Delegated rules

	public final boolean synpred1_R() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_R_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA8 dfa8 = new DFA8(this);
	protected DFA10 dfa10 = new DFA10(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA32 dfa32 = new DFA32(this);
	protected DFA34 dfa34 = new DFA34(this);
	protected DFA35 dfa35 = new DFA35(this);
	protected DFA36 dfa36 = new DFA36(this);
	protected DFA38 dfa38 = new DFA38(this);
	static final String DFA7_eotS =
		"\5\uffff";
	static final String DFA7_eofS =
		"\1\2\4\uffff";
	static final String DFA7_minS =
		"\1\4\1\13\1\uffff\1\13\1\uffff";
	static final String DFA7_maxS =
		"\1\107\1\116\1\uffff\1\116\1\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA7_specialS =
		"\5\uffff}>";
	static final String[] DFA7_transitionS = {
			"\6\2\3\uffff\4\2\1\uffff\3\2\3\uffff\1\2\2\uffff\2\2\7\uffff\1\2\1\uffff"+
			"\2\2\1\uffff\1\1\2\2\1\uffff\4\2\7\uffff\1\2\1\uffff\1\2\1\uffff\3\2"+
			"\1\uffff\3\2\2\uffff\3\2",
			"\1\2\3\uffff\1\2\1\3\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\3\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\2\uffff\1\2\1\uffff\1\4\2\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\2\2",
			"",
			"\1\2\3\uffff\1\2\1\3\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\3\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\2\uffff\1\2\1\uffff\1\4\2\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\2\2",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "100:10: ( LPAR n_ RPAR )?";
		}
	}

	static final String DFA8_eotS =
		"\5\uffff";
	static final String DFA8_eofS =
		"\1\2\4\uffff";
	static final String DFA8_minS =
		"\1\4\1\13\1\uffff\1\13\1\uffff";
	static final String DFA8_maxS =
		"\1\107\1\116\1\uffff\1\116\1\uffff";
	static final String DFA8_acceptS =
		"\2\uffff\1\2\1\uffff\1\1";
	static final String DFA8_specialS =
		"\5\uffff}>";
	static final String[] DFA8_transitionS = {
			"\6\2\3\uffff\4\2\1\uffff\3\2\3\uffff\1\2\2\uffff\2\2\7\uffff\1\2\1\uffff"+
			"\2\2\1\uffff\1\1\2\2\1\uffff\4\2\7\uffff\1\2\1\uffff\1\2\1\uffff\3\2"+
			"\1\uffff\3\2\2\uffff\3\2",
			"\1\2\3\uffff\1\2\1\3\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\3\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\2\uffff\1\2\1\uffff\1\4\2\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\2\2",
			"",
			"\1\2\3\uffff\1\2\1\3\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\3\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\2\uffff\1\2\1\uffff\1\4\2\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\2\2",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "101:11: ( LPAR n_ RPAR )?";
		}
	}

	static final String DFA10_eotS =
		"\7\uffff";
	static final String DFA10_eofS =
		"\1\2\6\uffff";
	static final String DFA10_minS =
		"\1\20\3\13\2\uffff\1\13";
	static final String DFA10_maxS =
		"\1\102\3\116\2\uffff\1\116";
	static final String DFA10_acceptS =
		"\4\uffff\1\2\1\1\1\uffff";
	static final String DFA10_specialS =
		"\7\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\1\37\uffff\1\1\14\uffff\1\4\4\uffff\1\3",
			"\1\5\4\uffff\1\1\1\5\5\uffff\1\5\1\uffff\2\5\4\uffff\1\5\1\uffff\1\5"+
			"\3\uffff\1\5\3\uffff\1\5\1\uffff\1\5\4\uffff\1\1\2\5\2\uffff\2\5\5\uffff"+
			"\1\5\1\4\1\uffff\1\5\4\uffff\1\5\2\uffff\2\5\4\uffff\2\5",
			"\1\5\5\uffff\1\5\5\uffff\1\5\1\uffff\2\5\4\uffff\1\5\1\uffff\1\5\3\uffff"+
			"\1\5\3\uffff\1\5\1\uffff\1\5\5\uffff\2\5\2\uffff\2\5\5\uffff\1\5\1\4"+
			"\1\uffff\1\5\4\uffff\1\5\2\uffff\2\5\4\uffff\2\5",
			"\1\5\4\uffff\1\6\1\5\5\uffff\1\5\1\uffff\2\5\4\uffff\1\5\1\uffff\1\5"+
			"\3\uffff\1\5\3\uffff\1\5\1\uffff\1\5\4\uffff\1\6\2\5\2\uffff\2\5\5\uffff"+
			"\1\5\1\4\1\uffff\1\5\4\uffff\1\5\2\uffff\2\5\4\uffff\2\5",
			"",
			"",
			"\1\5\4\uffff\1\6\1\5\5\uffff\1\5\1\uffff\2\5\4\uffff\1\5\1\uffff\1\5"+
			"\3\uffff\1\5\3\uffff\1\5\1\uffff\1\5\4\uffff\1\6\2\5\2\uffff\2\5\5\uffff"+
			"\1\5\1\4\1\uffff\1\5\4\uffff\1\5\2\uffff\2\5\4\uffff\2\5"
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 104:38: ( n e+= expr_or_assign )*";
		}
	}

	static final String DFA16_eotS =
		"\4\uffff";
	static final String DFA16_eofS =
		"\4\uffff";
	static final String DFA16_minS =
		"\2\17\2\uffff";
	static final String DFA16_maxS =
		"\2\101\2\uffff";
	static final String DFA16_acceptS =
		"\2\uffff\1\2\1\1";
	static final String DFA16_specialS =
		"\4\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\3\1\1\37\uffff\1\1\20\uffff\1\2",
			"\1\3\1\1\37\uffff\1\1\20\uffff\1\2",
			"",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 149:36: ( n_ COMMA n_ par_decl )*";
		}
	}

	static final String DFA18_eotS =
		"\6\uffff";
	static final String DFA18_eofS =
		"\6\uffff";
	static final String DFA18_minS =
		"\1\37\1\6\1\uffff\1\6\2\uffff";
	static final String DFA18_maxS =
		"\1\115\1\101\1\uffff\1\101\2\uffff";
	static final String DFA18_acceptS =
		"\2\uffff\1\3\1\uffff\1\1\1\2";
	static final String DFA18_specialS =
		"\6\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\1\55\uffff\1\2",
			"\1\5\10\uffff\1\4\1\3\37\uffff\1\3\20\uffff\1\4",
			"",
			"\1\5\10\uffff\1\4\1\3\37\uffff\1\3\20\uffff\1\4",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "151:1: par_decl : (iid= ID -> ^( ID NULL[iid] ) | ID n_ ASSIGN n_ expr -> ^( ID expr ) | VARIATIC -> VARIATIC );";
		}
	}

	static final String DFA31_eotS =
		"\4\uffff";
	static final String DFA31_eofS =
		"\4\uffff";
	static final String DFA31_minS =
		"\2\13\2\uffff";
	static final String DFA31_maxS =
		"\2\116\2\uffff";
	static final String DFA31_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA31_specialS =
		"\4\uffff}>";
	static final String[] DFA31_transitionS = {
			"\1\2\3\uffff\1\3\1\1\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\1\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\1\uffff\1\3\1\2\4\uffff\1\2\2\uffff\2\2\4\uffff\2\2",
			"\1\2\3\uffff\1\3\1\1\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\1\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\1\uffff\1\3\1\2\4\uffff\1\2\2\uffff\2\2\4\uffff\2\2",
			"",
			""
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "228:5: ( n_ expr_list_arg )?";
		}
	}

	static final String DFA32_eotS =
		"\4\uffff";
	static final String DFA32_eofS =
		"\4\uffff";
	static final String DFA32_minS =
		"\2\13\2\uffff";
	static final String DFA32_maxS =
		"\2\116\2\uffff";
	static final String DFA32_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA32_specialS =
		"\4\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\2\3\uffff\1\3\1\1\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\1\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\1\uffff\1\3\1\2\4\uffff\1\2\2\uffff\2\2\4\uffff\2\2",
			"\1\2\3\uffff\1\3\1\1\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\1\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\1\uffff\1\3\1\2\4\uffff\1\2\2\uffff\2\2\4\uffff\2\2",
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
			return "228:35: ( n_ expr_list_arg )?";
		}
	}

	static final String DFA34_eotS =
		"\5\uffff";
	static final String DFA34_eofS =
		"\5\uffff";
	static final String DFA34_minS =
		"\1\13\1\uffff\1\4\1\6\1\uffff";
	static final String DFA34_maxS =
		"\1\116\1\uffff\1\107\1\76\1\uffff";
	static final String DFA34_acceptS =
		"\1\uffff\1\1\2\uffff\1\2";
	static final String DFA34_specialS =
		"\5\uffff}>";
	static final String[] DFA34_transitionS = {
			"\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\2\1\4\uffff\1\2\1\uffff\1\1\3\uffff"+
			"\1\1\3\uffff\1\1\1\uffff\1\1\5\uffff\2\1\2\uffff\2\1\5\uffff\1\1\2\uffff"+
			"\1\1\4\uffff\1\2\2\uffff\2\1\4\uffff\1\2\1\1",
			"",
			"\2\1\1\4\3\1\3\uffff\3\1\1\3\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\2\uffff"+
			"\2\1\7\uffff\1\1\1\uffff\2\1\1\uffff\3\1\1\uffff\3\1\1\3\2\uffff\2\1"+
			"\3\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff"+
			"\3\1",
			"\1\4\10\uffff\1\1\1\3\37\uffff\1\3\15\uffff\1\1",
			""
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
			return "230:1: expr_list_arg : ( expr -> expr |name= id n_ ASSIGN n_ v= expr -> ^( KW[name.start] $name $v) );";
		}
	}

	static final String DFA35_eotS =
		"\4\uffff";
	static final String DFA35_eofS =
		"\4\uffff";
	static final String DFA35_minS =
		"\2\13\2\uffff";
	static final String DFA35_maxS =
		"\2\116\2\uffff";
	static final String DFA35_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA35_specialS =
		"\4\uffff}>";
	static final String[] DFA35_transitionS = {
			"\1\2\3\uffff\1\3\1\1\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\1\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\2\uffff\1\2\1\uffff\1\3\2\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\2\2",
			"\1\2\3\uffff\1\3\1\1\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\1\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\2\uffff\1\2\1\uffff\1\3\2\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\2\2",
			"",
			""
	};

	static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
	static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
	static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
	static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
	static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
	static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
	static final short[][] DFA35_transition;

	static {
		int numStates = DFA35_transitionS.length;
		DFA35_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
		}
	}

	protected class DFA35 extends DFA {

		public DFA35(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 35;
			this.eot = DFA35_eot;
			this.eof = DFA35_eof;
			this.min = DFA35_min;
			this.max = DFA35_max;
			this.accept = DFA35_accept;
			this.special = DFA35_special;
			this.transition = DFA35_transition;
		}
		@Override
		public String getDescription() {
			return "234:7: ( n_ arg_expr )?";
		}
	}

	static final String DFA36_eotS =
		"\4\uffff";
	static final String DFA36_eofS =
		"\4\uffff";
	static final String DFA36_minS =
		"\2\13\2\uffff";
	static final String DFA36_maxS =
		"\2\116\2\uffff";
	static final String DFA36_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA36_specialS =
		"\4\uffff}>";
	static final String[] DFA36_transitionS = {
			"\1\2\3\uffff\1\3\1\1\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\1\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\2\uffff\1\2\1\uffff\1\3\2\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\2\2",
			"\1\2\3\uffff\1\3\1\1\1\2\5\uffff\1\2\1\uffff\2\2\4\uffff\1\2\1\uffff"+
			"\1\2\3\uffff\1\2\3\uffff\1\2\1\uffff\1\2\4\uffff\1\1\2\2\2\uffff\2\2"+
			"\5\uffff\1\2\2\uffff\1\2\1\uffff\1\3\2\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\2\2",
			"",
			""
	};

	static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
	static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
	static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
	static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
	static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
	static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
	static final short[][] DFA36_transition;

	static {
		int numStates = DFA36_transitionS.length;
		DFA36_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
		}
	}

	protected class DFA36 extends DFA {

		public DFA36(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 36;
			this.eot = DFA36_eot;
			this.eof = DFA36_eof;
			this.min = DFA36_min;
			this.max = DFA36_max;
			this.accept = DFA36_accept;
			this.special = DFA36_special;
			this.transition = DFA36_transition;
		}
		@Override
		public String getDescription() {
			return "234:32: ( n_ arg_expr )?";
		}
	}

	static final String DFA38_eotS =
		"\16\uffff";
	static final String DFA38_eofS =
		"\16\uffff";
	static final String DFA38_minS =
		"\1\13\1\uffff\2\4\1\6\1\13\1\6\2\13\2\uffff\1\13\2\uffff";
	static final String DFA38_maxS =
		"\1\116\1\uffff\2\107\1\101\1\116\1\101\2\116\2\uffff\1\116\2\uffff";
	static final String DFA38_acceptS =
		"\1\uffff\1\1\7\uffff\1\2\1\3\1\uffff\1\4\1\5";
	static final String DFA38_specialS =
		"\16\uffff}>";
	static final String[] DFA38_transitionS = {
			"\1\1\5\uffff\1\1\5\uffff\1\1\1\uffff\2\1\4\uffff\1\2\1\uffff\1\1\3\uffff"+
			"\1\1\3\uffff\1\1\1\uffff\1\1\5\uffff\2\1\2\uffff\1\3\1\1\5\uffff\1\1"+
			"\2\uffff\1\1\4\uffff\1\2\2\uffff\2\1\4\uffff\1\2\1\1",
			"",
			"\2\1\1\5\3\1\3\uffff\3\1\1\4\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\2\uffff"+
			"\2\1\7\uffff\1\1\1\uffff\2\1\1\uffff\3\1\1\uffff\3\1\1\4\2\uffff\2\1"+
			"\3\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\2\1\3\uffff\3\1",
			"\2\1\1\7\3\1\3\uffff\3\1\1\6\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\2\uffff"+
			"\2\1\7\uffff\1\1\1\uffff\2\1\1\uffff\3\1\1\uffff\3\1\1\6\7\uffff\1\1"+
			"\1\uffff\1\1\1\uffff\1\1\3\uffff\2\1\3\uffff\3\1",
			"\1\5\10\uffff\1\1\1\4\37\uffff\1\4\20\uffff\1\1",
			"\1\11\3\uffff\1\12\1\10\1\11\5\uffff\1\11\1\uffff\2\11\4\uffff\1\11"+
			"\1\uffff\1\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\4\uffff\1\10\2\11"+
			"\2\uffff\2\11\5\uffff\1\11\2\uffff\1\11\1\uffff\1\12\2\uffff\1\11\2\uffff"+
			"\2\11\4\uffff\2\11",
			"\1\7\10\uffff\1\1\1\6\37\uffff\1\6\20\uffff\1\1",
			"\1\14\3\uffff\1\15\1\13\1\14\5\uffff\1\14\1\uffff\2\14\4\uffff\1\14"+
			"\1\uffff\1\14\3\uffff\1\14\3\uffff\1\14\1\uffff\1\14\4\uffff\1\13\2\14"+
			"\2\uffff\2\14\5\uffff\1\14\2\uffff\1\14\1\uffff\1\15\2\uffff\1\14\2\uffff"+
			"\2\14\4\uffff\2\14",
			"\1\11\3\uffff\1\12\1\10\1\11\5\uffff\1\11\1\uffff\2\11\4\uffff\1\11"+
			"\1\uffff\1\11\3\uffff\1\11\3\uffff\1\11\1\uffff\1\11\4\uffff\1\10\2\11"+
			"\2\uffff\2\11\5\uffff\1\11\2\uffff\1\11\1\uffff\1\12\2\uffff\1\11\2\uffff"+
			"\2\11\4\uffff\2\11",
			"",
			"",
			"\1\14\3\uffff\1\15\1\13\1\14\5\uffff\1\14\1\uffff\2\14\4\uffff\1\14"+
			"\1\uffff\1\14\3\uffff\1\14\3\uffff\1\14\1\uffff\1\14\4\uffff\1\13\2\14"+
			"\2\uffff\2\14\5\uffff\1\14\2\uffff\1\14\1\uffff\1\15\2\uffff\1\14\2\uffff"+
			"\2\14\4\uffff\2\14",
			"",
			""
	};

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "236:1: arg_expr : ( expr -> expr |name= id n_ ASSIGN n_ v= expr -> ^( KW[name.start] $name $v) |name= id n_ ass= ASSIGN -> ^( KW[name.start] $name NULL[ass] ) |nn= NULL n_ ASSIGN n_ v= expr -> ^( KW[nn] $nn $v) |nnn= NULL n_ ASSIGN -> ^( KW[nnn] $nnn $nnn) );";
		}
	}

	public static final BitSet FOLLOW_n__in_script158 = new BitSet(new long[]{0x90660A2286820802L,0x0000000000016190L});
	public static final BitSet FOLLOW_statement_in_script160 = new BitSet(new long[]{0x90660A2286820802L,0x0000000000016190L});
	public static final BitSet FOLLOW_n__in_interactive182 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000016190L});
	public static final BitSet FOLLOW_statement_in_interactive185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_or_assign_in_statement197 = new BitSet(new long[]{0x0001000000010000L,0x0000000000000004L});
	public static final BitSet FOLLOW_n_in_statement199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_statement206 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000001FFFFL});
	public static final BitSet FOLLOW_EOF_in_statement211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EOF_in_n252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMICOLUMN_in_n256 = new BitSet(new long[]{0x0001000000010000L});
	public static final BitSet FOLLOW_n__in_n258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alter_assign_in_expr_or_assign268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_expr281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_expr_in_expr_wo_assign295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_expr_in_expr_wo_assign301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_expr_in_expr_wo_assign307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_repeat_expr_in_expr_wo_assign313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_expr_wo_assign319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEXT_in_expr_wo_assign325 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_LPAR_in_expr_wo_assign328 = new BitSet(new long[]{0x0001000000010000L,0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_expr_wo_assign330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAR_in_expr_wo_assign332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_expr_wo_assign344 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_LPAR_in_expr_wo_assign347 = new BitSet(new long[]{0x0001000000010000L,0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_expr_wo_assign349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAR_in_expr_wo_assign351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_sequence371 = new BitSet(new long[]{0xB0670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_sequence373 = new BitSet(new long[]{0xB0660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_sequence378 = new BitSet(new long[]{0x2001000000010000L,0x0000000000000004L});
	public static final BitSet FOLLOW_n_in_sequence381 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_sequence385 = new BitSet(new long[]{0x2001000000010000L,0x0000000000000004L});
	public static final BitSet FOLLOW_n_in_sequence389 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_RBRACE_in_sequence395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tilde_expr_in_assign422 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000061L});
	public static final BitSet FOLLOW_ARROW_in_assign432 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_assign434 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_in_assign438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_ARROW_in_assign458 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_assign460 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_in_assign464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_ARROW_in_assign486 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_assign488 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_in_assign492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_RIGHT_ARROW_in_assign515 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_assign517 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_in_assign521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tilde_expr_in_alter_assign565 = new BitSet(new long[]{0x0000000000000062L,0x0000000000000061L});
	public static final BitSet FOLLOW_ARROW_in_alter_assign575 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_alter_assign577 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_alter_assign581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_ARROW_in_alter_assign601 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_alter_assign603 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_alter_assign607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_ARROW_in_alter_assign629 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_alter_assign631 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_alter_assign635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_RIGHT_ARROW_in_alter_assign658 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_alter_assign660 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_alter_assign664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_alter_assign687 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_alter_assign689 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_alter_assign693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_expr738 = new BitSet(new long[]{0x0001020000010000L});
	public static final BitSet FOLLOW_n__in_if_expr740 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_if_expr742 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_if_expr744 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_if_expr748 = new BitSet(new long[]{0x0001000000010000L,0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_if_expr750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAR_in_if_expr752 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_if_expr754 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_if_expr758 = new BitSet(new long[]{0x0001000000090002L});
	public static final BitSet FOLLOW_n__in_if_expr788 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ELSE_in_if_expr790 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_if_expr792 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_if_expr796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_expr832 = new BitSet(new long[]{0x0001020000010000L});
	public static final BitSet FOLLOW_n__in_while_expr834 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_while_expr836 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_while_expr838 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_while_expr842 = new BitSet(new long[]{0x0001000000010000L,0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_while_expr844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAR_in_while_expr846 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_while_expr848 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_while_expr852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_expr876 = new BitSet(new long[]{0x0001020000010000L});
	public static final BitSet FOLLOW_n__in_for_expr878 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_for_expr880 = new BitSet(new long[]{0x0001000080010000L});
	public static final BitSet FOLLOW_n__in_for_expr882 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_for_expr884 = new BitSet(new long[]{0x0001000400010000L});
	public static final BitSet FOLLOW_n__in_for_expr886 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_IN_in_for_expr888 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_for_expr890 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_for_expr894 = new BitSet(new long[]{0x0001000000010000L,0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_for_expr896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAR_in_for_expr898 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_for_expr900 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_for_expr904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REPEAT_in_repeat_expr930 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_repeat_expr932 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_repeat_expr936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function959 = new BitSet(new long[]{0x0001020000010000L});
	public static final BitSet FOLLOW_n__in_function961 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAR_in_function963 = new BitSet(new long[]{0x0001000080010000L,0x0000000000002002L});
	public static final BitSet FOLLOW_n__in_function966 = new BitSet(new long[]{0x0000000080000000L,0x0000000000002002L});
	public static final BitSet FOLLOW_par_decl_in_function969 = new BitSet(new long[]{0x0001000000018000L,0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_function972 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_COMMA_in_function974 = new BitSet(new long[]{0x0001000080010000L,0x0000000000002000L});
	public static final BitSet FOLLOW_n__in_function976 = new BitSet(new long[]{0x0000000080000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_par_decl_in_function978 = new BitSet(new long[]{0x0001000000018000L,0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_function982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAR_in_function986 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_function988 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_function992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_par_decl1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_par_decl1033 = new BitSet(new long[]{0x0001000000010040L});
	public static final BitSet FOLLOW_n__in_par_decl1035 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_par_decl1037 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_par_decl1039 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_in_par_decl1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIATIC_in_par_decl1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_or_expr_in_tilde_expr1071 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_TILDE_in_tilde_expr1074 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_tilde_expr1077 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_or_expr_in_tilde_expr1080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1094 = new BitSet(new long[]{0x0400000000000202L});
	public static final BitSet FOLLOW_or_operator_in_or_expr1097 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_or_expr1100 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_and_expr_in_or_expr1103 = new BitSet(new long[]{0x0400000000000202L});
	public static final BitSet FOLLOW_comp_expr_in_and_expr1117 = new BitSet(new long[]{0x0000000000000112L});
	public static final BitSet FOLLOW_and_operator_in_and_expr1120 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_and_expr1123 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_comp_expr_in_and_expr1126 = new BitSet(new long[]{0x0000000000000112L});
	public static final BitSet FOLLOW_add_expr_in_comp_expr1142 = new BitSet(new long[]{0x0000848018100002L});
	public static final BitSet FOLLOW_comp_operator_in_comp_expr1145 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_comp_expr1148 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_add_expr_in_comp_expr1151 = new BitSet(new long[]{0x0000848018100002L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr1166 = new BitSet(new long[]{0x1000080000000002L});
	public static final BitSet FOLLOW_add_operator_in_add_expr1169 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_add_expr1172 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr1175 = new BitSet(new long[]{0x1000080000000002L});
	public static final BitSet FOLLOW_operator_expr_in_mult_expr1189 = new BitSet(new long[]{0x0000600000040002L});
	public static final BitSet FOLLOW_mult_operator_in_mult_expr1192 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_mult_expr1195 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_operator_expr_in_mult_expr1198 = new BitSet(new long[]{0x0000600000040002L});
	public static final BitSet FOLLOW_column_expr_in_operator_expr1212 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_OP_in_operator_expr1215 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_operator_expr1218 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_column_expr_in_operator_expr1221 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_power_expr_in_column_expr1235 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COLUMN_in_column_expr1238 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_column_expr1241 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_power_expr_in_column_expr1244 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_unary_expression_in_power_expr1260 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_power_operator_in_power_expr1263 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_power_expr1266 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_unary_expression_in_power_expr1271 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_NOT_in_unary_expression1286 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_unary_expression1288 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unary_expression1306 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_unary_expression1308 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unary_expression1327 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_unary_expression1329 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TILDE_in_unary_expression1348 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_unary_expression1350 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basic_expr_in_unary_expression1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_expr_in_basic_expr1382 = new BitSet(new long[]{0x0000025001000082L});
	public static final BitSet FOLLOW_FIELD_in_basic_expr1399 = new BitSet(new long[]{0x0001000080010000L,0x0000000000002010L});
	public static final BitSet FOLLOW_n__in_basic_expr1401 = new BitSet(new long[]{0x0000000080000000L,0x0000000000002010L});
	public static final BitSet FOLLOW_id_in_basic_expr1405 = new BitSet(new long[]{0x0000025001000082L});
	public static final BitSet FOLLOW_AT_in_basic_expr1430 = new BitSet(new long[]{0x0001000080010000L,0x0000000000002010L});
	public static final BitSet FOLLOW_n__in_basic_expr1432 = new BitSet(new long[]{0x0000000080000000L,0x0000000000002010L});
	public static final BitSet FOLLOW_id_in_basic_expr1436 = new BitSet(new long[]{0x0000025001000082L});
	public static final BitSet FOLLOW_LBRAKET_in_basic_expr1460 = new BitSet(new long[]{0x90670A2286838800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_list_in_basic_expr1464 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RBRAKET_in_basic_expr1466 = new BitSet(new long[]{0x0000025001000082L});
	public static final BitSet FOLLOW_LBB_in_basic_expr1492 = new BitSet(new long[]{0x90670A2286838800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_list_in_basic_expr1496 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RBRAKET_in_basic_expr1498 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RBRAKET_in_basic_expr1500 = new BitSet(new long[]{0x0000025001000082L});
	public static final BitSet FOLLOW_LPAR_in_basic_expr1538 = new BitSet(new long[]{0x90670A2286838800L,0x0000000000006190L});
	public static final BitSet FOLLOW_args_in_basic_expr1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAR_in_basic_expr1544 = new BitSet(new long[]{0x0000025001000082L});
	public static final BitSet FOLLOW_id_in_simple_expr1582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_simple_expr1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DD_in_simple_expr1594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_simple_expr1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_simple_expr1606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_simple_expr1612 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_NS_GET_in_simple_expr1614 = new BitSet(new long[]{0x0001000080010000L,0x0000000000002010L});
	public static final BitSet FOLLOW_n__in_simple_expr1617 = new BitSet(new long[]{0x0000000080000000L,0x0000000000002010L});
	public static final BitSet FOLLOW_id_in_simple_expr1620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_simple_expr1626 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_NS_GET_INT_in_simple_expr1628 = new BitSet(new long[]{0x0001000080010000L,0x0000000000002010L});
	public static final BitSet FOLLOW_n__in_simple_expr1631 = new BitSet(new long[]{0x0000000080000000L,0x0000000000002010L});
	public static final BitSet FOLLOW_id_in_simple_expr1634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_simple_expr1640 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_simple_expr1643 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_simple_expr1646 = new BitSet(new long[]{0x0001000000010000L,0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_simple_expr1648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RPAR_in_simple_expr1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequence_in_simple_expr1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_wo_assign_in_simple_expr1664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CARRET_in_power_operator1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_expr_list1801 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_list_arg_in_expr_list1803 = new BitSet(new long[]{0x0001000000018000L});
	public static final BitSet FOLLOW_n__in_expr_list1807 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_COMMA_in_expr_list1810 = new BitSet(new long[]{0x90670A2286838800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_expr_list1813 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_list_arg_in_expr_list1815 = new BitSet(new long[]{0x0001000000018000L});
	public static final BitSet FOLLOW_n__in_expr_list1819 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expr_in_expr_list_arg1838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_expr_list_arg1850 = new BitSet(new long[]{0x0001000000010040L});
	public static final BitSet FOLLOW_n__in_expr_list_arg1852 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_expr_list_arg1854 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_expr_list_arg1856 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_in_expr_list_arg1860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_args1883 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_arg_expr_in_args1885 = new BitSet(new long[]{0x0001000000018000L});
	public static final BitSet FOLLOW_n__in_args1889 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_COMMA_in_args1892 = new BitSet(new long[]{0x90670A2286838800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_args1895 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_arg_expr_in_args1897 = new BitSet(new long[]{0x0001000000018000L});
	public static final BitSet FOLLOW_n__in_args1901 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_expr_in_arg_expr1921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_arg_expr1933 = new BitSet(new long[]{0x0001000000010040L});
	public static final BitSet FOLLOW_n__in_arg_expr1935 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_arg_expr1937 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_arg_expr1939 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_in_arg_expr1943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_arg_expr1964 = new BitSet(new long[]{0x0001000000010040L});
	public static final BitSet FOLLOW_n__in_arg_expr1966 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_arg_expr1970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_arg_expr1992 = new BitSet(new long[]{0x0001000000010040L});
	public static final BitSet FOLLOW_n__in_arg_expr1994 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_arg_expr1996 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_arg_expr1998 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_in_arg_expr2002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_arg_expr2023 = new BitSet(new long[]{0x0001000000010040L});
	public static final BitSet FOLLOW_n__in_arg_expr2025 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_arg_expr2027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_n__in_synpred1_R788 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ELSE_in_synpred1_R790 = new BitSet(new long[]{0x90670A2286830800L,0x0000000000006190L});
	public static final BitSet FOLLOW_n__in_synpred1_R792 = new BitSet(new long[]{0x90660A2286820800L,0x0000000000006190L});
	public static final BitSet FOLLOW_expr_or_assign_in_synpred1_R796 = new BitSet(new long[]{0x0000000000000002L});
}
