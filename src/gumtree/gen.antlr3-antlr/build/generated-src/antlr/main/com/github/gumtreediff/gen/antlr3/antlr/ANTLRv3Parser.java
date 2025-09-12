// $ANTLR 3.5.3 com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g 2025-04-14 15:35:18
 package com.github.gumtreediff.gen.antlr3.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


/** ANTLR v3 grammar written in ANTLR v3 with AST construction */
@SuppressWarnings("all")
public class ANTLRv3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ACTION_CHAR_LITERAL", 
		"ACTION_ESC", "ACTION_STRING_LITERAL", "ALT", "ARG", "ARGLIST", "ARG_ACTION", 
		"BACKTRACK_SEMPRED", "BANG", "BLOCK", "CHAR_LITERAL", "CHAR_RANGE", "CLOSURE", 
		"COMBINED_GRAMMAR", "DOC_COMMENT", "DOUBLE_ANGLE_STRING_LITERAL", "DOUBLE_QUOTE_STRING_LITERAL", 
		"EOA", "EOB", "EOR", "EPSILON", "ESC", "FRAGMENT", "GATED_SEMPRED", "ID", 
		"INITACTION", "INT", "LABEL", "LEXER", "LEXER_GRAMMAR", "LITERAL_CHAR", 
		"ML_COMMENT", "NESTED_ACTION", "NESTED_ARG_ACTION", "OPTIONAL", "OPTIONS", 
		"PARSER", "PARSER_GRAMMAR", "POSITIVE_CLOSURE", "RANGE", "RET", "REWRITE", 
		"ROOT", "RULE", "RULE_REF", "SCOPE", "SEMPRED", "SL_COMMENT", "SRC", "STRING_LITERAL", 
		"SYNPRED", "SYN_SEMPRED", "TEMPLATE", "TOKENS", "TOKEN_REF", "TREE_BEGIN", 
		"TREE_GRAMMAR", "WS", "WS_LOOP", "XDIGIT", "'$'", "'('", "')'", "'*'", 
		"'+'", "'+='", "','", "'.'", "':'", "'::'", "';'", "'='", "'=>'", "'?'", 
		"'@'", "'catch'", "'finally'", "'grammar'", "'lexer'", "'parser'", "'private'", 
		"'protected'", "'public'", "'returns'", "'throws'", "'tree'", "'|'", "'}'", 
		"'~'"
	};
	public static final int EOF=-1;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int ACTION=4;
	public static final int ACTION_CHAR_LITERAL=5;
	public static final int ACTION_ESC=6;
	public static final int ACTION_STRING_LITERAL=7;
	public static final int ALT=8;
	public static final int ARG=9;
	public static final int ARGLIST=10;
	public static final int ARG_ACTION=11;
	public static final int BACKTRACK_SEMPRED=12;
	public static final int BANG=13;
	public static final int BLOCK=14;
	public static final int CHAR_LITERAL=15;
	public static final int CHAR_RANGE=16;
	public static final int CLOSURE=17;
	public static final int COMBINED_GRAMMAR=18;
	public static final int DOC_COMMENT=19;
	public static final int DOUBLE_ANGLE_STRING_LITERAL=20;
	public static final int DOUBLE_QUOTE_STRING_LITERAL=21;
	public static final int EOA=22;
	public static final int EOB=23;
	public static final int EOR=24;
	public static final int EPSILON=25;
	public static final int ESC=26;
	public static final int FRAGMENT=27;
	public static final int GATED_SEMPRED=28;
	public static final int ID=29;
	public static final int INITACTION=30;
	public static final int INT=31;
	public static final int LABEL=32;
	public static final int LEXER=33;
	public static final int LEXER_GRAMMAR=34;
	public static final int LITERAL_CHAR=35;
	public static final int ML_COMMENT=36;
	public static final int NESTED_ACTION=37;
	public static final int NESTED_ARG_ACTION=38;
	public static final int OPTIONAL=39;
	public static final int OPTIONS=40;
	public static final int PARSER=41;
	public static final int PARSER_GRAMMAR=42;
	public static final int POSITIVE_CLOSURE=43;
	public static final int RANGE=44;
	public static final int RET=45;
	public static final int REWRITE=46;
	public static final int ROOT=47;
	public static final int RULE=48;
	public static final int RULE_REF=49;
	public static final int SCOPE=50;
	public static final int SEMPRED=51;
	public static final int SL_COMMENT=52;
	public static final int SRC=53;
	public static final int STRING_LITERAL=54;
	public static final int SYNPRED=55;
	public static final int SYN_SEMPRED=56;
	public static final int TEMPLATE=57;
	public static final int TOKENS=58;
	public static final int TOKEN_REF=59;
	public static final int TREE_BEGIN=60;
	public static final int TREE_GRAMMAR=61;
	public static final int WS=62;
	public static final int WS_LOOP=63;
	public static final int XDIGIT=64;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ANTLRv3Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ANTLRv3Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ANTLRv3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g"; }


		int gtype;


	public static class grammarDef_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "grammarDef"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:85:1: grammarDef : ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' |) g= 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF -> ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ ) ;
	public final ANTLRv3Parser.grammarDef_return grammarDef() throws RecognitionException {
		ANTLRv3Parser.grammarDef_return retval = new ANTLRv3Parser.grammarDef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token g=null;
		Token DOC_COMMENT1=null;
		Token string_literal2=null;
		Token string_literal3=null;
		Token string_literal4=null;
		Token char_literal6=null;
		Token EOF12=null;
		ParserRuleReturnScope id5 =null;
		ParserRuleReturnScope optionsSpec7 =null;
		ParserRuleReturnScope tokensSpec8 =null;
		ParserRuleReturnScope attrScope9 =null;
		ParserRuleReturnScope action10 =null;
		ParserRuleReturnScope rule11 =null;

		CommonTree g_tree=null;
		CommonTree DOC_COMMENT1_tree=null;
		CommonTree string_literal2_tree=null;
		CommonTree string_literal3_tree=null;
		CommonTree string_literal4_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree EOF12_tree=null;
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_DOC_COMMENT=new RewriteRuleTokenStream(adaptor,"token DOC_COMMENT");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_attrScope=new RewriteRuleSubtreeStream(adaptor,"rule attrScope");
		RewriteRuleSubtreeStream stream_tokensSpec=new RewriteRuleSubtreeStream(adaptor,"rule tokensSpec");
		RewriteRuleSubtreeStream stream_optionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule optionsSpec");
		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
		RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:86:5: ( ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' |) g= 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF -> ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:86:9: ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' |) g= 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF
			{
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:86:9: ( DOC_COMMENT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DOC_COMMENT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:86:9: DOC_COMMENT
					{
					DOC_COMMENT1=(Token)match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_grammarDef343); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOC_COMMENT.add(DOC_COMMENT1);

					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:87:6: ( 'lexer' | 'parser' | 'tree' |)
			int alt2=4;
			switch ( input.LA(1) ) {
			case 83:
				{
				alt2=1;
				}
				break;
			case 84:
				{
				alt2=2;
				}
				break;
			case 90:
				{
				alt2=3;
				}
				break;
			case 82:
				{
				alt2=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:87:8: 'lexer'
					{
					string_literal2=(Token)match(input,83,FOLLOW_83_in_grammarDef353); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_83.add(string_literal2);

					if ( state.backtracking==0 ) {gtype=LEXER_GRAMMAR;}
					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:88:10: 'parser'
					{
					string_literal3=(Token)match(input,84,FOLLOW_84_in_grammarDef371); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_84.add(string_literal3);

					if ( state.backtracking==0 ) {gtype=PARSER_GRAMMAR;}
					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:89:10: 'tree'
					{
					string_literal4=(Token)match(input,90,FOLLOW_90_in_grammarDef387); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_90.add(string_literal4);

					if ( state.backtracking==0 ) {gtype=TREE_GRAMMAR;}
					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:90:14: 
					{
					if ( state.backtracking==0 ) {gtype=COMBINED_GRAMMAR;}
					}
					break;

			}

			g=(Token)match(input,82,FOLLOW_82_in_grammarDef428); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_82.add(g);

			pushFollow(FOLLOW_id_in_grammarDef430);
			id5=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id5.getTree());
			char_literal6=(Token)match(input,75,FOLLOW_75_in_grammarDef432); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_75.add(char_literal6);

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:92:25: ( optionsSpec )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==OPTIONS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:92:25: optionsSpec
					{
					pushFollow(FOLLOW_optionsSpec_in_grammarDef434);
					optionsSpec7=optionsSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_optionsSpec.add(optionsSpec7.getTree());
					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:92:38: ( tokensSpec )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==TOKENS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:92:38: tokensSpec
					{
					pushFollow(FOLLOW_tokensSpec_in_grammarDef437);
					tokensSpec8=tokensSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tokensSpec.add(tokensSpec8.getTree());
					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:92:50: ( attrScope )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==SCOPE) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:92:50: attrScope
					{
					pushFollow(FOLLOW_attrScope_in_grammarDef440);
					attrScope9=attrScope();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_attrScope.add(attrScope9.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:92:61: ( action )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==79) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:92:61: action
					{
					pushFollow(FOLLOW_action_in_grammarDef443);
					action10=action();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_action.add(action10.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:93:6: ( rule )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==DOC_COMMENT||LA7_0==FRAGMENT||LA7_0==RULE_REF||LA7_0==TOKEN_REF||(LA7_0 >= 85 && LA7_0 <= 87)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:93:6: rule
					{
					pushFollow(FOLLOW_rule_in_grammarDef451);
					rule11=rule();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rule.add(rule11.getTree());
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			EOF12=(Token)match(input,EOF,FOLLOW_EOF_in_grammarDef459); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF12);


			// AST REWRITE
			// elements: action, optionsSpec, attrScope, DOC_COMMENT, id, tokensSpec, rule
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 95:6: -> ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:95:9: ^( id ( DOC_COMMENT )? ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(adaptor.create(gtype,g), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:96:12: ( DOC_COMMENT )?
				if ( stream_DOC_COMMENT.hasNext() ) {
					adaptor.addChild(root_1, stream_DOC_COMMENT.nextNode());
				}
				stream_DOC_COMMENT.reset();

				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:96:25: ( optionsSpec )?
				if ( stream_optionsSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_optionsSpec.nextTree());
				}
				stream_optionsSpec.reset();

				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:96:38: ( tokensSpec )?
				if ( stream_tokensSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_tokensSpec.nextTree());
				}
				stream_tokensSpec.reset();

				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:96:50: ( attrScope )*
				while ( stream_attrScope.hasNext() ) {
					adaptor.addChild(root_1, stream_attrScope.nextTree());
				}
				stream_attrScope.reset();

				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:96:61: ( action )*
				while ( stream_action.hasNext() ) {
					adaptor.addChild(root_1, stream_action.nextTree());
				}
				stream_action.reset();

				if ( !(stream_rule.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_rule.hasNext() ) {
					adaptor.addChild(root_1, stream_rule.nextTree());
				}
				stream_rule.reset();

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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "grammarDef"


	public static class tokensSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tokensSpec"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:100:1: tokensSpec : TOKENS ( tokenSpec )+ '}' -> ^( TOKENS ( tokenSpec )+ ) ;
	public final ANTLRv3Parser.tokensSpec_return tokensSpec() throws RecognitionException {
		ANTLRv3Parser.tokensSpec_return retval = new ANTLRv3Parser.tokensSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TOKENS13=null;
		Token char_literal15=null;
		ParserRuleReturnScope tokenSpec14 =null;

		CommonTree TOKENS13_tree=null;
		CommonTree char_literal15_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleTokenStream stream_TOKENS=new RewriteRuleTokenStream(adaptor,"token TOKENS");
		RewriteRuleSubtreeStream stream_tokenSpec=new RewriteRuleSubtreeStream(adaptor,"rule tokenSpec");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:101:2: ( TOKENS ( tokenSpec )+ '}' -> ^( TOKENS ( tokenSpec )+ ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:101:4: TOKENS ( tokenSpec )+ '}'
			{
			TOKENS13=(Token)match(input,TOKENS,FOLLOW_TOKENS_in_tokensSpec520); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TOKENS.add(TOKENS13);

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:101:11: ( tokenSpec )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==TOKEN_REF) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:101:11: tokenSpec
					{
					pushFollow(FOLLOW_tokenSpec_in_tokensSpec522);
					tokenSpec14=tokenSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tokenSpec.add(tokenSpec14.getTree());
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			char_literal15=(Token)match(input,92,FOLLOW_92_in_tokensSpec525); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(char_literal15);


			// AST REWRITE
			// elements: TOKENS, tokenSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 101:26: -> ^( TOKENS ( tokenSpec )+ )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:101:29: ^( TOKENS ( tokenSpec )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_TOKENS.nextNode(), root_1);
				if ( !(stream_tokenSpec.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_tokenSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_tokenSpec.nextTree());
				}
				stream_tokenSpec.reset();

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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tokensSpec"


	public static class tokenSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "tokenSpec"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:104:1: tokenSpec : TOKEN_REF ( '=' (lit= STRING_LITERAL |lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF ) ';' ;
	public final ANTLRv3Parser.tokenSpec_return tokenSpec() throws RecognitionException {
		ANTLRv3Parser.tokenSpec_return retval = new ANTLRv3Parser.tokenSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token lit=null;
		Token TOKEN_REF16=null;
		Token char_literal17=null;
		Token char_literal18=null;

		CommonTree lit_tree=null;
		CommonTree TOKEN_REF16_tree=null;
		CommonTree char_literal17_tree=null;
		CommonTree char_literal18_tree=null;
		RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_CHAR_LITERAL=new RewriteRuleTokenStream(adaptor,"token CHAR_LITERAL");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:105:2: ( TOKEN_REF ( '=' (lit= STRING_LITERAL |lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF ) ';' )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:105:4: TOKEN_REF ( '=' (lit= STRING_LITERAL |lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF ) ';'
			{
			TOKEN_REF16=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_tokenSpec545); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TOKEN_REF.add(TOKEN_REF16);

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:106:3: ( '=' (lit= STRING_LITERAL |lit= CHAR_LITERAL ) -> ^( '=' TOKEN_REF $lit) | -> TOKEN_REF )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==76) ) {
				alt10=1;
			}
			else if ( (LA10_0==75) ) {
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
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:106:5: '=' (lit= STRING_LITERAL |lit= CHAR_LITERAL )
					{
					char_literal17=(Token)match(input,76,FOLLOW_76_in_tokenSpec551); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(char_literal17);

					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:106:9: (lit= STRING_LITERAL |lit= CHAR_LITERAL )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==STRING_LITERAL) ) {
						alt9=1;
					}
					else if ( (LA9_0==CHAR_LITERAL) ) {
						alt9=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:106:10: lit= STRING_LITERAL
							{
							lit=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_tokenSpec556); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_STRING_LITERAL.add(lit);

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:106:29: lit= CHAR_LITERAL
							{
							lit=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_tokenSpec560); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_CHAR_LITERAL.add(lit);

							}
							break;

					}


					// AST REWRITE
					// elements: lit, 76, TOKEN_REF
					// token labels: lit
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_lit=new RewriteRuleTokenStream(adaptor,"token lit",lit);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 106:47: -> ^( '=' TOKEN_REF $lit)
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:106:50: ^( '=' TOKEN_REF $lit)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_76.nextNode(), root_1);
						adaptor.addChild(root_1, stream_TOKEN_REF.nextNode());
						adaptor.addChild(root_1, stream_lit.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:107:16: 
					{

					// AST REWRITE
					// elements: TOKEN_REF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 107:16: -> TOKEN_REF
					{
						adaptor.addChild(root_0, stream_TOKEN_REF.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;

			}

			char_literal18=(Token)match(input,75,FOLLOW_75_in_tokenSpec599); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_75.add(char_literal18);

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tokenSpec"


	public static class attrScope_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "attrScope"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:112:1: attrScope : 'scope' id ACTION -> ^( 'scope' id ACTION ) ;
	public final ANTLRv3Parser.attrScope_return attrScope() throws RecognitionException {
		ANTLRv3Parser.attrScope_return retval = new ANTLRv3Parser.attrScope_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal19=null;
		Token ACTION21=null;
		ParserRuleReturnScope id20 =null;

		CommonTree string_literal19_tree=null;
		CommonTree ACTION21_tree=null;
		RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
		RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:113:2: ( 'scope' id ACTION -> ^( 'scope' id ACTION ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:113:4: 'scope' id ACTION
			{
			string_literal19=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_attrScope610); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SCOPE.add(string_literal19);

			pushFollow(FOLLOW_id_in_attrScope612);
			id20=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id20.getTree());
			ACTION21=(Token)match(input,ACTION,FOLLOW_ACTION_in_attrScope614); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ACTION.add(ACTION21);


			// AST REWRITE
			// elements: ACTION, id, SCOPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 113:22: -> ^( 'scope' id ACTION )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:113:25: ^( 'scope' id ACTION )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_1, stream_ACTION.nextNode());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "attrScope"


	public static class action_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "action"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:117:1: action : '@' ( actionScopeName '::' )? id ACTION -> ^( '@' ( actionScopeName )? id ACTION ) ;
	public final ANTLRv3Parser.action_return action() throws RecognitionException {
		ANTLRv3Parser.action_return retval = new ANTLRv3Parser.action_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal22=null;
		Token string_literal24=null;
		Token ACTION26=null;
		ParserRuleReturnScope actionScopeName23 =null;
		ParserRuleReturnScope id25 =null;

		CommonTree char_literal22_tree=null;
		CommonTree string_literal24_tree=null;
		CommonTree ACTION26_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
		RewriteRuleSubtreeStream stream_actionScopeName=new RewriteRuleSubtreeStream(adaptor,"rule actionScopeName");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:118:2: ( '@' ( actionScopeName '::' )? id ACTION -> ^( '@' ( actionScopeName )? id ACTION ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:118:4: '@' ( actionScopeName '::' )? id ACTION
			{
			char_literal22=(Token)match(input,79,FOLLOW_79_in_action637); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_79.add(char_literal22);

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:118:8: ( actionScopeName '::' )?
			int alt11=2;
			switch ( input.LA(1) ) {
				case TOKEN_REF:
					{
					int LA11_1 = input.LA(2);
					if ( (LA11_1==74) ) {
						alt11=1;
					}
					}
					break;
				case RULE_REF:
					{
					int LA11_2 = input.LA(2);
					if ( (LA11_2==74) ) {
						alt11=1;
					}
					}
					break;
				case 83:
				case 84:
					{
					alt11=1;
					}
					break;
			}
			switch (alt11) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:118:9: actionScopeName '::'
					{
					pushFollow(FOLLOW_actionScopeName_in_action640);
					actionScopeName23=actionScopeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actionScopeName.add(actionScopeName23.getTree());
					string_literal24=(Token)match(input,74,FOLLOW_74_in_action642); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_74.add(string_literal24);

					}
					break;

			}

			pushFollow(FOLLOW_id_in_action646);
			id25=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id25.getTree());
			ACTION26=(Token)match(input,ACTION,FOLLOW_ACTION_in_action648); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ACTION.add(ACTION26);


			// AST REWRITE
			// elements: ACTION, id, 79, actionScopeName
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 118:42: -> ^( '@' ( actionScopeName )? id ACTION )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:118:45: ^( '@' ( actionScopeName )? id ACTION )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_79.nextNode(), root_1);
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:118:51: ( actionScopeName )?
				if ( stream_actionScopeName.hasNext() ) {
					adaptor.addChild(root_1, stream_actionScopeName.nextTree());
				}
				stream_actionScopeName.reset();

				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_1, stream_ACTION.nextNode());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "action"


	public static class actionScopeName_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "actionScopeName"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:124:1: actionScopeName : ( id |l= 'lexer' -> ID[$l] |p= 'parser' -> ID[$p] );
	public final ANTLRv3Parser.actionScopeName_return actionScopeName() throws RecognitionException {
		ANTLRv3Parser.actionScopeName_return retval = new ANTLRv3Parser.actionScopeName_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token l=null;
		Token p=null;
		ParserRuleReturnScope id27 =null;

		CommonTree l_tree=null;
		CommonTree p_tree=null;
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:125:2: ( id |l= 'lexer' -> ID[$l] |p= 'parser' -> ID[$p] )
			int alt12=3;
			switch ( input.LA(1) ) {
			case RULE_REF:
			case TOKEN_REF:
				{
				alt12=1;
				}
				break;
			case 83:
				{
				alt12=2;
				}
				break;
			case 84:
				{
				alt12=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:125:4: id
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_id_in_actionScopeName674);
					id27=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, id27.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:126:4: l= 'lexer'
					{
					l=(Token)match(input,83,FOLLOW_83_in_actionScopeName681); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_83.add(l);


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
					// 126:14: -> ID[$l]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, l));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:127:9: p= 'parser'
					{
					p=(Token)match(input,84,FOLLOW_84_in_actionScopeName698); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_84.add(p);


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
					// 127:20: -> ID[$p]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, p));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionScopeName"


	public static class optionsSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "optionsSpec"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:130:1: optionsSpec : OPTIONS ( option ';' )+ '}' -> ^( OPTIONS ( option )+ ) ;
	public final ANTLRv3Parser.optionsSpec_return optionsSpec() throws RecognitionException {
		ANTLRv3Parser.optionsSpec_return retval = new ANTLRv3Parser.optionsSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPTIONS28=null;
		Token char_literal30=null;
		Token char_literal31=null;
		ParserRuleReturnScope option29 =null;

		CommonTree OPTIONS28_tree=null;
		CommonTree char_literal30_tree=null;
		CommonTree char_literal31_tree=null;
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleTokenStream stream_OPTIONS=new RewriteRuleTokenStream(adaptor,"token OPTIONS");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:131:2: ( OPTIONS ( option ';' )+ '}' -> ^( OPTIONS ( option )+ ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:131:4: OPTIONS ( option ';' )+ '}'
			{
			OPTIONS28=(Token)match(input,OPTIONS,FOLLOW_OPTIONS_in_optionsSpec714); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_OPTIONS.add(OPTIONS28);

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:131:12: ( option ';' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==RULE_REF||LA13_0==TOKEN_REF) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:131:13: option ';'
					{
					pushFollow(FOLLOW_option_in_optionsSpec717);
					option29=option();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_option.add(option29.getTree());
					char_literal30=(Token)match(input,75,FOLLOW_75_in_optionsSpec719); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_75.add(char_literal30);

					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			char_literal31=(Token)match(input,92,FOLLOW_92_in_optionsSpec723); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_92.add(char_literal31);


			// AST REWRITE
			// elements: option, OPTIONS
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 131:30: -> ^( OPTIONS ( option )+ )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:131:33: ^( OPTIONS ( option )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_OPTIONS.nextNode(), root_1);
				if ( !(stream_option.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_option.hasNext() ) {
					adaptor.addChild(root_1, stream_option.nextTree());
				}
				stream_option.reset();

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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optionsSpec"


	public static class option_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "option"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:134:1: option : id '=' optionValue -> ^( '=' id optionValue ) ;
	public final ANTLRv3Parser.option_return option() throws RecognitionException {
		ANTLRv3Parser.option_return retval = new ANTLRv3Parser.option_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal33=null;
		ParserRuleReturnScope id32 =null;
		ParserRuleReturnScope optionValue34 =null;

		CommonTree char_literal33_tree=null;
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_optionValue=new RewriteRuleSubtreeStream(adaptor,"rule optionValue");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:135:5: ( id '=' optionValue -> ^( '=' id optionValue ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:135:9: id '=' optionValue
			{
			pushFollow(FOLLOW_id_in_option748);
			id32=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id32.getTree());
			char_literal33=(Token)match(input,76,FOLLOW_76_in_option750); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_76.add(char_literal33);

			pushFollow(FOLLOW_optionValue_in_option752);
			optionValue34=optionValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_optionValue.add(optionValue34.getTree());

			// AST REWRITE
			// elements: id, optionValue, 76
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 135:28: -> ^( '=' id optionValue )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:135:31: ^( '=' id optionValue )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_76.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_1, stream_optionValue.nextTree());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "option"


	public static class optionValue_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "optionValue"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:138:1: optionValue : ( id | STRING_LITERAL | CHAR_LITERAL | INT |s= '*' -> STRING_LITERAL[$s] );
	public final ANTLRv3Parser.optionValue_return optionValue() throws RecognitionException {
		ANTLRv3Parser.optionValue_return retval = new ANTLRv3Parser.optionValue_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token s=null;
		Token STRING_LITERAL36=null;
		Token CHAR_LITERAL37=null;
		Token INT38=null;
		ParserRuleReturnScope id35 =null;

		CommonTree s_tree=null;
		CommonTree STRING_LITERAL36_tree=null;
		CommonTree CHAR_LITERAL37_tree=null;
		CommonTree INT38_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:139:5: ( id | STRING_LITERAL | CHAR_LITERAL | INT |s= '*' -> STRING_LITERAL[$s] )
			int alt14=5;
			switch ( input.LA(1) ) {
			case RULE_REF:
			case TOKEN_REF:
				{
				alt14=1;
				}
				break;
			case STRING_LITERAL:
				{
				alt14=2;
				}
				break;
			case CHAR_LITERAL:
				{
				alt14=3;
				}
				break;
			case INT:
				{
				alt14=4;
				}
				break;
			case 68:
				{
				alt14=5;
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
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:139:9: id
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_id_in_optionValue781);
					id35=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, id35.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:140:9: STRING_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING_LITERAL36=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_optionValue791); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING_LITERAL36_tree = (CommonTree)adaptor.create(STRING_LITERAL36);
					adaptor.addChild(root_0, STRING_LITERAL36_tree);
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:141:9: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL37=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_optionValue801); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_LITERAL37_tree = (CommonTree)adaptor.create(CHAR_LITERAL37);
					adaptor.addChild(root_0, CHAR_LITERAL37_tree);
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:142:9: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT38=(Token)match(input,INT,FOLLOW_INT_in_optionValue811); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT38_tree = (CommonTree)adaptor.create(INT38);
					adaptor.addChild(root_0, INT38_tree);
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:143:7: s= '*'
					{
					s=(Token)match(input,68,FOLLOW_68_in_optionValue821); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(s);


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
					// 143:13: -> STRING_LITERAL[$s]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(STRING_LITERAL, s));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "optionValue"


	protected static class rule_scope {
		String name;
	}
	protected Stack<rule_scope> rule_stack = new Stack<rule_scope>();

	public static class rule_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rule"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:146:1: rule : ( DOC_COMMENT )? (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? (arg= ARG_ACTION )? ( 'returns' rt= ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )? -> ^( RULE id ( ^( ARG $arg) )? ( ^( RET $rt) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] ) ;
	public final ANTLRv3Parser.rule_return rule() throws RecognitionException {
		rule_stack.push(new rule_scope());
		ANTLRv3Parser.rule_return retval = new ANTLRv3Parser.rule_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token modifier=null;
		Token arg=null;
		Token rt=null;
		Token DOC_COMMENT39=null;
		Token char_literal41=null;
		Token string_literal42=null;
		Token char_literal47=null;
		Token char_literal49=null;
		ParserRuleReturnScope id40 =null;
		ParserRuleReturnScope throwsSpec43 =null;
		ParserRuleReturnScope optionsSpec44 =null;
		ParserRuleReturnScope ruleScopeSpec45 =null;
		ParserRuleReturnScope ruleAction46 =null;
		ParserRuleReturnScope altList48 =null;
		ParserRuleReturnScope exceptionGroup50 =null;

		CommonTree modifier_tree=null;
		CommonTree arg_tree=null;
		CommonTree rt_tree=null;
		CommonTree DOC_COMMENT39_tree=null;
		CommonTree char_literal41_tree=null;
		CommonTree string_literal42_tree=null;
		CommonTree char_literal47_tree=null;
		CommonTree char_literal49_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
		RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
		RewriteRuleTokenStream stream_FRAGMENT=new RewriteRuleTokenStream(adaptor,"token FRAGMENT");
		RewriteRuleTokenStream stream_DOC_COMMENT=new RewriteRuleTokenStream(adaptor,"token DOC_COMMENT");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_ruleAction=new RewriteRuleSubtreeStream(adaptor,"rule ruleAction");
		RewriteRuleSubtreeStream stream_throwsSpec=new RewriteRuleSubtreeStream(adaptor,"rule throwsSpec");
		RewriteRuleSubtreeStream stream_optionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule optionsSpec");
		RewriteRuleSubtreeStream stream_altList=new RewriteRuleSubtreeStream(adaptor,"rule altList");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
		RewriteRuleSubtreeStream stream_ruleScopeSpec=new RewriteRuleSubtreeStream(adaptor,"rule ruleScopeSpec");
		RewriteRuleSubtreeStream stream_exceptionGroup=new RewriteRuleSubtreeStream(adaptor,"rule exceptionGroup");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:150:2: ( ( DOC_COMMENT )? (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? (arg= ARG_ACTION )? ( 'returns' rt= ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )? -> ^( RULE id ( ^( ARG $arg) )? ( ^( RET $rt) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:150:4: ( DOC_COMMENT )? (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? (arg= ARG_ACTION )? ( 'returns' rt= ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )?
			{
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:150:4: ( DOC_COMMENT )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==DOC_COMMENT) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:150:4: DOC_COMMENT
					{
					DOC_COMMENT39=(Token)match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_rule846); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOC_COMMENT.add(DOC_COMMENT39);

					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:151:3: (modifier= ( 'protected' | 'public' | 'private' | 'fragment' ) )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==FRAGMENT||(LA17_0 >= 85 && LA17_0 <= 87)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:151:5: modifier= ( 'protected' | 'public' | 'private' | 'fragment' )
					{
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:151:14: ( 'protected' | 'public' | 'private' | 'fragment' )
					int alt16=4;
					switch ( input.LA(1) ) {
					case 86:
						{
						alt16=1;
						}
						break;
					case 87:
						{
						alt16=2;
						}
						break;
					case 85:
						{
						alt16=3;
						}
						break;
					case FRAGMENT:
						{
						alt16=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}
					switch (alt16) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:151:15: 'protected'
							{
							modifier=(Token)match(input,86,FOLLOW_86_in_rule856); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_86.add(modifier);

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:151:27: 'public'
							{
							modifier=(Token)match(input,87,FOLLOW_87_in_rule858); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_87.add(modifier);

							}
							break;
						case 3 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:151:36: 'private'
							{
							modifier=(Token)match(input,85,FOLLOW_85_in_rule860); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_85.add(modifier);

							}
							break;
						case 4 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:151:46: 'fragment'
							{
							modifier=(Token)match(input,FRAGMENT,FOLLOW_FRAGMENT_in_rule862); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_FRAGMENT.add(modifier);

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_id_in_rule870);
			id40=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id40.getTree());
			if ( state.backtracking==0 ) {rule_stack.peek().name = (id40!=null?input.toString(id40.start,id40.stop):null);}
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:153:3: ( '!' )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==BANG) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:153:3: '!'
					{
					char_literal41=(Token)match(input,BANG,FOLLOW_BANG_in_rule876); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BANG.add(char_literal41);

					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:154:3: (arg= ARG_ACTION )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ARG_ACTION) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:154:5: arg= ARG_ACTION
					{
					arg=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule885); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ARG_ACTION.add(arg);

					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:155:3: ( 'returns' rt= ARG_ACTION )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==88) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:155:5: 'returns' rt= ARG_ACTION
					{
					string_literal42=(Token)match(input,88,FOLLOW_88_in_rule894); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_88.add(string_literal42);

					rt=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule898); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ARG_ACTION.add(rt);

					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:156:3: ( throwsSpec )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==89) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:156:3: throwsSpec
					{
					pushFollow(FOLLOW_throwsSpec_in_rule906);
					throwsSpec43=throwsSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_throwsSpec.add(throwsSpec43.getTree());
					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:156:15: ( optionsSpec )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==OPTIONS) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:156:15: optionsSpec
					{
					pushFollow(FOLLOW_optionsSpec_in_rule909);
					optionsSpec44=optionsSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_optionsSpec.add(optionsSpec44.getTree());
					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:156:28: ( ruleScopeSpec )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==SCOPE) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:156:28: ruleScopeSpec
					{
					pushFollow(FOLLOW_ruleScopeSpec_in_rule912);
					ruleScopeSpec45=ruleScopeSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ruleScopeSpec.add(ruleScopeSpec45.getTree());
					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:156:43: ( ruleAction )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==79) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:156:43: ruleAction
					{
					pushFollow(FOLLOW_ruleAction_in_rule915);
					ruleAction46=ruleAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ruleAction.add(ruleAction46.getTree());
					}
					break;

				default :
					break loop24;
				}
			}

			char_literal47=(Token)match(input,73,FOLLOW_73_in_rule920); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_73.add(char_literal47);

			pushFollow(FOLLOW_altList_in_rule922);
			altList48=altList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_altList.add(altList48.getTree());
			char_literal49=(Token)match(input,75,FOLLOW_75_in_rule924); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_75.add(char_literal49);

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:158:3: ( exceptionGroup )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= 80 && LA25_0 <= 81)) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:158:3: exceptionGroup
					{
					pushFollow(FOLLOW_exceptionGroup_in_rule928);
					exceptionGroup50=exceptionGroup();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exceptionGroup.add(exceptionGroup50.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: altList, exceptionGroup, ruleScopeSpec, id, optionsSpec, ruleAction, rt, arg
			// token labels: rt, arg
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_rt=new RewriteRuleTokenStream(adaptor,"token rt",rt);
			RewriteRuleTokenStream stream_arg=new RewriteRuleTokenStream(adaptor,"token arg",arg);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 159:6: -> ^( RULE id ( ^( ARG $arg) )? ( ^( RET $rt) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:159:9: ^( RULE id ( ^( ARG $arg) )? ( ^( RET $rt) )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* altList ( exceptionGroup )? EOR[\"EOR\"] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RULE, "RULE"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_1, modifier!=null?adaptor.create(modifier):null);
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:159:67: ( ^( ARG $arg) )?
				if ( stream_arg.hasNext() ) {
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:159:67: ^( ARG $arg)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, "ARG"), root_2);
					adaptor.addChild(root_2, stream_arg.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_arg.reset();

				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:159:80: ( ^( RET $rt) )?
				if ( stream_rt.hasNext() ) {
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:159:80: ^( RET $rt)
					{
					CommonTree root_2 = (CommonTree)adaptor.nil();
					root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RET, "RET"), root_2);
					adaptor.addChild(root_2, stream_rt.nextNode());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_rt.reset();

				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:160:9: ( optionsSpec )?
				if ( stream_optionsSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_optionsSpec.nextTree());
				}
				stream_optionsSpec.reset();

				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:160:22: ( ruleScopeSpec )?
				if ( stream_ruleScopeSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_ruleScopeSpec.nextTree());
				}
				stream_ruleScopeSpec.reset();

				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:160:37: ( ruleAction )*
				while ( stream_ruleAction.hasNext() ) {
					adaptor.addChild(root_1, stream_ruleAction.nextTree());
				}
				stream_ruleAction.reset();

				adaptor.addChild(root_1, stream_altList.nextTree());
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:162:9: ( exceptionGroup )?
				if ( stream_exceptionGroup.hasNext() ) {
					adaptor.addChild(root_1, stream_exceptionGroup.nextTree());
				}
				stream_exceptionGroup.reset();

				adaptor.addChild(root_1, (CommonTree)adaptor.create(EOR, "EOR"));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			rule_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "rule"


	public static class ruleAction_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ruleAction"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:168:1: ruleAction : '@' id ACTION -> ^( '@' id ACTION ) ;
	public final ANTLRv3Parser.ruleAction_return ruleAction() throws RecognitionException {
		ANTLRv3Parser.ruleAction_return retval = new ANTLRv3Parser.ruleAction_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal51=null;
		Token ACTION53=null;
		ParserRuleReturnScope id52 =null;

		CommonTree char_literal51_tree=null;
		CommonTree ACTION53_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:169:2: ( '@' id ACTION -> ^( '@' id ACTION ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:169:4: '@' id ACTION
			{
			char_literal51=(Token)match(input,79,FOLLOW_79_in_ruleAction1030); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_79.add(char_literal51);

			pushFollow(FOLLOW_id_in_ruleAction1032);
			id52=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id52.getTree());
			ACTION53=(Token)match(input,ACTION,FOLLOW_ACTION_in_ruleAction1034); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ACTION.add(ACTION53);


			// AST REWRITE
			// elements: 79, ACTION, id
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 169:18: -> ^( '@' id ACTION )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:169:21: ^( '@' id ACTION )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_79.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_1, stream_ACTION.nextNode());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ruleAction"


	public static class throwsSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "throwsSpec"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:172:1: throwsSpec : 'throws' id ( ',' id )* -> ^( 'throws' ( id )+ ) ;
	public final ANTLRv3Parser.throwsSpec_return throwsSpec() throws RecognitionException {
		ANTLRv3Parser.throwsSpec_return retval = new ANTLRv3Parser.throwsSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal54=null;
		Token char_literal56=null;
		ParserRuleReturnScope id55 =null;
		ParserRuleReturnScope id57 =null;

		CommonTree string_literal54_tree=null;
		CommonTree char_literal56_tree=null;
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:173:2: ( 'throws' id ( ',' id )* -> ^( 'throws' ( id )+ ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:173:4: 'throws' id ( ',' id )*
			{
			string_literal54=(Token)match(input,89,FOLLOW_89_in_throwsSpec1055); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_89.add(string_literal54);

			pushFollow(FOLLOW_id_in_throwsSpec1057);
			id55=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id55.getTree());
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:173:16: ( ',' id )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==71) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:173:18: ',' id
					{
					char_literal56=(Token)match(input,71,FOLLOW_71_in_throwsSpec1061); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal56);

					pushFollow(FOLLOW_id_in_throwsSpec1063);
					id57=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id57.getTree());
					}
					break;

				default :
					break loop26;
				}
			}


			// AST REWRITE
			// elements: id, 89
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 173:28: -> ^( 'throws' ( id )+ )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:173:31: ^( 'throws' ( id )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_89.nextNode(), root_1);
				if ( !(stream_id.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_id.hasNext() ) {
					adaptor.addChild(root_1, stream_id.nextTree());
				}
				stream_id.reset();

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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "throwsSpec"


	public static class ruleScopeSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ruleScopeSpec"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:176:1: ruleScopeSpec : ( 'scope' ACTION -> ^( 'scope' ACTION ) | 'scope' id ( ',' id )* ';' -> ^( 'scope' ( id )+ ) | 'scope' ACTION 'scope' id ( ',' id )* ';' -> ^( 'scope' ACTION ( id )+ ) );
	public final ANTLRv3Parser.ruleScopeSpec_return ruleScopeSpec() throws RecognitionException {
		ANTLRv3Parser.ruleScopeSpec_return retval = new ANTLRv3Parser.ruleScopeSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal58=null;
		Token ACTION59=null;
		Token string_literal60=null;
		Token char_literal62=null;
		Token char_literal64=null;
		Token string_literal65=null;
		Token ACTION66=null;
		Token string_literal67=null;
		Token char_literal69=null;
		Token char_literal71=null;
		ParserRuleReturnScope id61 =null;
		ParserRuleReturnScope id63 =null;
		ParserRuleReturnScope id68 =null;
		ParserRuleReturnScope id70 =null;

		CommonTree string_literal58_tree=null;
		CommonTree ACTION59_tree=null;
		CommonTree string_literal60_tree=null;
		CommonTree char_literal62_tree=null;
		CommonTree char_literal64_tree=null;
		CommonTree string_literal65_tree=null;
		CommonTree ACTION66_tree=null;
		CommonTree string_literal67_tree=null;
		CommonTree char_literal69_tree=null;
		CommonTree char_literal71_tree=null;
		RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
		RewriteRuleTokenStream stream_SCOPE=new RewriteRuleTokenStream(adaptor,"token SCOPE");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:177:2: ( 'scope' ACTION -> ^( 'scope' ACTION ) | 'scope' id ( ',' id )* ';' -> ^( 'scope' ( id )+ ) | 'scope' ACTION 'scope' id ( ',' id )* ';' -> ^( 'scope' ACTION ( id )+ ) )
			int alt29=3;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==SCOPE) ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1==ACTION) ) {
					int LA29_2 = input.LA(3);
					if ( (LA29_2==SCOPE) ) {
						alt29=3;
					}
					else if ( (LA29_2==73||LA29_2==79) ) {
						alt29=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA29_1==RULE_REF||LA29_1==TOKEN_REF) ) {
					alt29=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:177:4: 'scope' ACTION
					{
					string_literal58=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1086); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCOPE.add(string_literal58);

					ACTION59=(Token)match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec1088); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ACTION.add(ACTION59);


					// AST REWRITE
					// elements: ACTION, SCOPE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 177:19: -> ^( 'scope' ACTION )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:177:22: ^( 'scope' ACTION )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ACTION.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:178:4: 'scope' id ( ',' id )* ';'
					{
					string_literal60=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1101); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCOPE.add(string_literal60);

					pushFollow(FOLLOW_id_in_ruleScopeSpec1103);
					id61=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id61.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:178:15: ( ',' id )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==71) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:178:16: ',' id
							{
							char_literal62=(Token)match(input,71,FOLLOW_71_in_ruleScopeSpec1106); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_71.add(char_literal62);

							pushFollow(FOLLOW_id_in_ruleScopeSpec1108);
							id63=id();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_id.add(id63.getTree());
							}
							break;

						default :
							break loop27;
						}
					}

					char_literal64=(Token)match(input,75,FOLLOW_75_in_ruleScopeSpec1112); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_75.add(char_literal64);


					// AST REWRITE
					// elements: SCOPE, id
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 178:29: -> ^( 'scope' ( id )+ )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:178:32: ^( 'scope' ( id )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);
						if ( !(stream_id.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_id.hasNext() ) {
							adaptor.addChild(root_1, stream_id.nextTree());
						}
						stream_id.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:179:4: 'scope' ACTION 'scope' id ( ',' id )* ';'
					{
					string_literal65=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1126); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCOPE.add(string_literal65);

					ACTION66=(Token)match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec1128); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ACTION.add(ACTION66);

					string_literal67=(Token)match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec1132); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SCOPE.add(string_literal67);

					pushFollow(FOLLOW_id_in_ruleScopeSpec1134);
					id68=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id68.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:180:14: ( ',' id )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==71) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:180:15: ',' id
							{
							char_literal69=(Token)match(input,71,FOLLOW_71_in_ruleScopeSpec1137); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_71.add(char_literal69);

							pushFollow(FOLLOW_id_in_ruleScopeSpec1139);
							id70=id();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_id.add(id70.getTree());
							}
							break;

						default :
							break loop28;
						}
					}

					char_literal71=(Token)match(input,75,FOLLOW_75_in_ruleScopeSpec1143); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_75.add(char_literal71);


					// AST REWRITE
					// elements: ACTION, id, SCOPE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 181:3: -> ^( 'scope' ACTION ( id )+ )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:181:6: ^( 'scope' ACTION ( id )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_SCOPE.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ACTION.nextNode());
						if ( !(stream_id.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_id.hasNext() ) {
							adaptor.addChild(root_1, stream_id.nextTree());
						}
						stream_id.reset();

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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ruleScopeSpec"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:184:1: block : lp= '(' ( (opts= optionsSpec )? ':' )? a1= alternative rewrite ( '|' a2= alternative rewrite )* rp= ')' -> ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( alternative ( rewrite )? )+ EOB[$rp,\"EOB\"] ) ;
	public final ANTLRv3Parser.block_return block() throws RecognitionException {
		ANTLRv3Parser.block_return retval = new ANTLRv3Parser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token lp=null;
		Token rp=null;
		Token char_literal72=null;
		Token char_literal74=null;
		ParserRuleReturnScope opts =null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope rewrite73 =null;
		ParserRuleReturnScope rewrite75 =null;

		CommonTree lp_tree=null;
		CommonTree rp_tree=null;
		CommonTree char_literal72_tree=null;
		CommonTree char_literal74_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_optionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule optionsSpec");
		RewriteRuleSubtreeStream stream_alternative=new RewriteRuleSubtreeStream(adaptor,"rule alternative");
		RewriteRuleSubtreeStream stream_rewrite=new RewriteRuleSubtreeStream(adaptor,"rule rewrite");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:185:5: (lp= '(' ( (opts= optionsSpec )? ':' )? a1= alternative rewrite ( '|' a2= alternative rewrite )* rp= ')' -> ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( alternative ( rewrite )? )+ EOB[$rp,\"EOB\"] ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:185:9: lp= '(' ( (opts= optionsSpec )? ':' )? a1= alternative rewrite ( '|' a2= alternative rewrite )* rp= ')'
			{
			lp=(Token)match(input,66,FOLLOW_66_in_block1175); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_66.add(lp);

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:186:3: ( (opts= optionsSpec )? ':' )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==OPTIONS||LA31_0==73) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:186:5: (opts= optionsSpec )? ':'
					{
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:186:5: (opts= optionsSpec )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==OPTIONS) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:186:6: opts= optionsSpec
							{
							pushFollow(FOLLOW_optionsSpec_in_block1184);
							opts=optionsSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_optionsSpec.add(opts.getTree());
							}
							break;

					}

					char_literal72=(Token)match(input,73,FOLLOW_73_in_block1188); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal72);

					}
					break;

			}

			pushFollow(FOLLOW_alternative_in_block1197);
			a1=alternative();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_alternative.add(a1.getTree());
			pushFollow(FOLLOW_rewrite_in_block1199);
			rewrite73=rewrite();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rewrite.add(rewrite73.getTree());
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:187:26: ( '|' a2= alternative rewrite )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==91) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:187:28: '|' a2= alternative rewrite
					{
					char_literal74=(Token)match(input,91,FOLLOW_91_in_block1203); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_91.add(char_literal74);

					pushFollow(FOLLOW_alternative_in_block1207);
					a2=alternative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alternative.add(a2.getTree());
					pushFollow(FOLLOW_rewrite_in_block1209);
					rewrite75=rewrite();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewrite.add(rewrite75.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			rp=(Token)match(input,67,FOLLOW_67_in_block1224); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(rp);


			// AST REWRITE
			// elements: alternative, optionsSpec, rewrite
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 189:9: -> ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( alternative ( rewrite )? )+ EOB[$rp,\"EOB\"] )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:189:12: ^( BLOCK[$lp,\"BLOCK\"] ( optionsSpec )? ( alternative ( rewrite )? )+ EOB[$rp,\"EOB\"] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, lp, "BLOCK"), root_1);
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:189:34: ( optionsSpec )?
				if ( stream_optionsSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_optionsSpec.nextTree());
				}
				stream_optionsSpec.reset();

				if ( !(stream_alternative.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_alternative.hasNext() ) {
					adaptor.addChild(root_1, stream_alternative.nextTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:189:60: ( rewrite )?
					if ( stream_rewrite.hasNext() ) {
						adaptor.addChild(root_1, stream_rewrite.nextTree());
					}
					stream_rewrite.reset();

				}
				stream_alternative.reset();

				adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, rp, "EOB"));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class altList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "altList"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:192:1: altList : a1= alternative rewrite ( '|' a2= alternative rewrite )* -> ^( ( alternative ( rewrite )? )+ EOB[\"EOB\"] ) ;
	public final ANTLRv3Parser.altList_return altList() throws RecognitionException {
		ANTLRv3Parser.altList_return retval = new ANTLRv3Parser.altList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal77=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope rewrite76 =null;
		ParserRuleReturnScope rewrite78 =null;

		CommonTree char_literal77_tree=null;
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleSubtreeStream stream_alternative=new RewriteRuleSubtreeStream(adaptor,"rule alternative");
		RewriteRuleSubtreeStream stream_rewrite=new RewriteRuleSubtreeStream(adaptor,"rule rewrite");


			// must create root manually as it's used by invoked rules in real antlr tool.
			// leave here to demonstrate use of {...} in rewrite rule
			// it's really BLOCK[firstToken,"BLOCK"]; set line/col to previous ( or : token.
		    CommonTree blkRoot = (CommonTree)adaptor.create(BLOCK,input.LT(-1),"BLOCK");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:199:5: (a1= alternative rewrite ( '|' a2= alternative rewrite )* -> ^( ( alternative ( rewrite )? )+ EOB[\"EOB\"] ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:199:9: a1= alternative rewrite ( '|' a2= alternative rewrite )*
			{
			pushFollow(FOLLOW_alternative_in_altList1281);
			a1=alternative();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_alternative.add(a1.getTree());
			pushFollow(FOLLOW_rewrite_in_altList1283);
			rewrite76=rewrite();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rewrite.add(rewrite76.getTree());
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:199:32: ( '|' a2= alternative rewrite )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==91) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:199:34: '|' a2= alternative rewrite
					{
					char_literal77=(Token)match(input,91,FOLLOW_91_in_altList1287); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_91.add(char_literal77);

					pushFollow(FOLLOW_alternative_in_altList1291);
					a2=alternative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_alternative.add(a2.getTree());
					pushFollow(FOLLOW_rewrite_in_altList1293);
					rewrite78=rewrite();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewrite.add(rewrite78.getTree());
					}
					break;

				default :
					break loop33;
				}
			}


			// AST REWRITE
			// elements: rewrite, alternative
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 200:3: -> ^( ( alternative ( rewrite )? )+ EOB[\"EOB\"] )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:200:6: ^( ( alternative ( rewrite )? )+ EOB[\"EOB\"] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(blkRoot, root_1);
				if ( !(stream_alternative.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_alternative.hasNext() ) {
					adaptor.addChild(root_1, stream_alternative.nextTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:200:32: ( rewrite )?
					if ( stream_rewrite.hasNext() ) {
						adaptor.addChild(root_1, stream_rewrite.nextTree());
					}
					stream_rewrite.reset();

				}
				stream_alternative.reset();

				adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, "EOB"));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "altList"


	public static class alternative_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "alternative"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:203:1: alternative : ( ( element )+ -> ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] ) | -> ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] ) );
	public final ANTLRv3Parser.alternative_return alternative() throws RecognitionException {
		ANTLRv3Parser.alternative_return retval = new ANTLRv3Parser.alternative_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope element79 =null;

		RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");


			Token firstToken = input.LT(1);
			Token prevToken = input.LT(-1); // either : or | I think

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:208:5: ( ( element )+ -> ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] ) | -> ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] ) )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==ACTION||LA35_0==CHAR_LITERAL||LA35_0==RULE_REF||LA35_0==SEMPRED||LA35_0==STRING_LITERAL||(LA35_0 >= TOKEN_REF && LA35_0 <= TREE_BEGIN)||LA35_0==66||LA35_0==72||LA35_0==93) ) {
				alt35=1;
			}
			else if ( (LA35_0==REWRITE||LA35_0==67||LA35_0==75||LA35_0==91) ) {
				alt35=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:208:9: ( element )+
					{
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:208:9: ( element )+
					int cnt34=0;
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==ACTION||LA34_0==CHAR_LITERAL||LA34_0==RULE_REF||LA34_0==SEMPRED||LA34_0==STRING_LITERAL||(LA34_0 >= TOKEN_REF && LA34_0 <= TREE_BEGIN)||LA34_0==66||LA34_0==72||LA34_0==93) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:208:9: element
							{
							pushFollow(FOLLOW_element_in_alternative1341);
							element79=element();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_element.add(element79.getTree());
							}
							break;

						default :
							if ( cnt34 >= 1 ) break loop34;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(34, input);
							throw eee;
						}
						cnt34++;
					}


					// AST REWRITE
					// elements: element
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 208:18: -> ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:208:21: ^( ALT[firstToken,\"ALT\"] ( element )+ EOA[\"EOA\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, firstToken, "ALT"), root_1);
						if ( !(stream_element.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_element.hasNext() ) {
							adaptor.addChild(root_1, stream_element.nextTree());
						}
						stream_element.reset();

						adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:209:9: 
					{

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
					// 209:9: -> ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:209:12: ^( ALT[prevToken,\"ALT\"] EPSILON[prevToken,\"EPSILON\"] EOA[\"EOA\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, prevToken, "ALT"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(EPSILON, prevToken, "EPSILON"));
						adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternative"


	public static class exceptionGroup_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exceptionGroup"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:212:1: exceptionGroup : ( ( exceptionHandler )+ ( finallyClause )? | finallyClause );
	public final ANTLRv3Parser.exceptionGroup_return exceptionGroup() throws RecognitionException {
		ANTLRv3Parser.exceptionGroup_return retval = new ANTLRv3Parser.exceptionGroup_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope exceptionHandler80 =null;
		ParserRuleReturnScope finallyClause81 =null;
		ParserRuleReturnScope finallyClause82 =null;


		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:213:2: ( ( exceptionHandler )+ ( finallyClause )? | finallyClause )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==80) ) {
				alt38=1;
			}
			else if ( (LA38_0==81) ) {
				alt38=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:213:4: ( exceptionHandler )+ ( finallyClause )?
					{
					root_0 = (CommonTree)adaptor.nil();


					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:213:4: ( exceptionHandler )+
					int cnt36=0;
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==80) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:213:6: exceptionHandler
							{
							pushFollow(FOLLOW_exceptionHandler_in_exceptionGroup1392);
							exceptionHandler80=exceptionHandler();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exceptionHandler80.getTree());

							}
							break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(36, input);
							throw eee;
						}
						cnt36++;
					}

					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:213:26: ( finallyClause )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==81) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:213:28: finallyClause
							{
							pushFollow(FOLLOW_finallyClause_in_exceptionGroup1399);
							finallyClause81=finallyClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, finallyClause81.getTree());

							}
							break;

					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:214:4: finallyClause
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_finallyClause_in_exceptionGroup1407);
					finallyClause82=finallyClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, finallyClause82.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exceptionGroup"


	public static class exceptionHandler_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exceptionHandler"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:217:1: exceptionHandler : 'catch' ARG_ACTION ACTION -> ^( 'catch' ARG_ACTION ACTION ) ;
	public final ANTLRv3Parser.exceptionHandler_return exceptionHandler() throws RecognitionException {
		ANTLRv3Parser.exceptionHandler_return retval = new ANTLRv3Parser.exceptionHandler_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal83=null;
		Token ARG_ACTION84=null;
		Token ACTION85=null;

		CommonTree string_literal83_tree=null;
		CommonTree ARG_ACTION84_tree=null;
		CommonTree ACTION85_tree=null;
		RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
		RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:218:5: ( 'catch' ARG_ACTION ACTION -> ^( 'catch' ARG_ACTION ACTION ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:218:10: 'catch' ARG_ACTION ACTION
			{
			string_literal83=(Token)match(input,80,FOLLOW_80_in_exceptionHandler1427); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_80.add(string_literal83);

			ARG_ACTION84=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_exceptionHandler1429); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ARG_ACTION.add(ARG_ACTION84);

			ACTION85=(Token)match(input,ACTION,FOLLOW_ACTION_in_exceptionHandler1431); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ACTION.add(ACTION85);


			// AST REWRITE
			// elements: 80, ARG_ACTION, ACTION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 218:36: -> ^( 'catch' ARG_ACTION ACTION )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:218:39: ^( 'catch' ARG_ACTION ACTION )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_80.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());
				adaptor.addChild(root_1, stream_ACTION.nextNode());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exceptionHandler"


	public static class finallyClause_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "finallyClause"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:221:1: finallyClause : 'finally' ACTION -> ^( 'finally' ACTION ) ;
	public final ANTLRv3Parser.finallyClause_return finallyClause() throws RecognitionException {
		ANTLRv3Parser.finallyClause_return retval = new ANTLRv3Parser.finallyClause_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal86=null;
		Token ACTION87=null;

		CommonTree string_literal86_tree=null;
		CommonTree ACTION87_tree=null;
		RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:222:5: ( 'finally' ACTION -> ^( 'finally' ACTION ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:222:10: 'finally' ACTION
			{
			string_literal86=(Token)match(input,81,FOLLOW_81_in_finallyClause1461); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_81.add(string_literal86);

			ACTION87=(Token)match(input,ACTION,FOLLOW_ACTION_in_finallyClause1463); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ACTION.add(ACTION87);


			// AST REWRITE
			// elements: 81, ACTION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 222:27: -> ^( 'finally' ACTION )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:222:30: ^( 'finally' ACTION )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_81.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ACTION.nextNode());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "finallyClause"


	public static class element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "element"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:225:1: element : elementNoOptionSpec ;
	public final ANTLRv3Parser.element_return element() throws RecognitionException {
		ANTLRv3Parser.element_return retval = new ANTLRv3Parser.element_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope elementNoOptionSpec88 =null;


		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:226:2: ( elementNoOptionSpec )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:226:4: elementNoOptionSpec
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_elementNoOptionSpec_in_element1485);
			elementNoOptionSpec88=elementNoOptionSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, elementNoOptionSpec88.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "element"


	public static class elementNoOptionSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "elementNoOptionSpec"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:229:1: elementNoOptionSpec : ( id (labelOp= '=' |labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) ) | id (labelOp= '=' |labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) ) | atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> atom ) | ebnf | ACTION | SEMPRED ( '=>' -> GATED_SEMPRED | -> SEMPRED ) | treeSpec ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> treeSpec ) );
	public final ANTLRv3Parser.elementNoOptionSpec_return elementNoOptionSpec() throws RecognitionException {
		ANTLRv3Parser.elementNoOptionSpec_return retval = new ANTLRv3Parser.elementNoOptionSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token labelOp=null;
		Token ACTION98=null;
		Token SEMPRED99=null;
		Token string_literal100=null;
		ParserRuleReturnScope id89 =null;
		ParserRuleReturnScope atom90 =null;
		ParserRuleReturnScope ebnfSuffix91 =null;
		ParserRuleReturnScope id92 =null;
		ParserRuleReturnScope block93 =null;
		ParserRuleReturnScope ebnfSuffix94 =null;
		ParserRuleReturnScope atom95 =null;
		ParserRuleReturnScope ebnfSuffix96 =null;
		ParserRuleReturnScope ebnf97 =null;
		ParserRuleReturnScope treeSpec101 =null;
		ParserRuleReturnScope ebnfSuffix102 =null;

		CommonTree labelOp_tree=null;
		CommonTree ACTION98_tree=null;
		CommonTree SEMPRED99_tree=null;
		CommonTree string_literal100_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_SEMPRED=new RewriteRuleTokenStream(adaptor,"token SEMPRED");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_treeSpec=new RewriteRuleSubtreeStream(adaptor,"rule treeSpec");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
		RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
		RewriteRuleSubtreeStream stream_ebnfSuffix=new RewriteRuleSubtreeStream(adaptor,"rule ebnfSuffix");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:230:2: ( id (labelOp= '=' |labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) ) | id (labelOp= '=' |labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) ) | atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> atom ) | ebnf | ACTION | SEMPRED ( '=>' -> GATED_SEMPRED | -> SEMPRED ) | treeSpec ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> treeSpec ) )
			int alt46=7;
			switch ( input.LA(1) ) {
			case TOKEN_REF:
				{
				switch ( input.LA(2) ) {
				case 76:
					{
					int LA46_8 = input.LA(3);
					if ( (LA46_8==CHAR_LITERAL||LA46_8==RULE_REF||LA46_8==STRING_LITERAL||LA46_8==TOKEN_REF||LA46_8==72||LA46_8==93) ) {
						alt46=1;
					}
					else if ( (LA46_8==66) ) {
						alt46=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 70:
					{
					int LA46_9 = input.LA(3);
					if ( (LA46_9==CHAR_LITERAL||LA46_9==RULE_REF||LA46_9==STRING_LITERAL||LA46_9==TOKEN_REF||LA46_9==72||LA46_9==93) ) {
						alt46=1;
					}
					else if ( (LA46_9==66) ) {
						alt46=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ACTION:
				case ARG_ACTION:
				case BANG:
				case CHAR_LITERAL:
				case REWRITE:
				case ROOT:
				case RULE_REF:
				case SEMPRED:
				case STRING_LITERAL:
				case TOKEN_REF:
				case TREE_BEGIN:
				case 66:
				case 67:
				case 68:
				case 69:
				case 72:
				case 75:
				case 78:
				case 91:
				case 93:
					{
					alt46=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RULE_REF:
				{
				switch ( input.LA(2) ) {
				case 76:
					{
					int LA46_8 = input.LA(3);
					if ( (LA46_8==CHAR_LITERAL||LA46_8==RULE_REF||LA46_8==STRING_LITERAL||LA46_8==TOKEN_REF||LA46_8==72||LA46_8==93) ) {
						alt46=1;
					}
					else if ( (LA46_8==66) ) {
						alt46=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 70:
					{
					int LA46_9 = input.LA(3);
					if ( (LA46_9==CHAR_LITERAL||LA46_9==RULE_REF||LA46_9==STRING_LITERAL||LA46_9==TOKEN_REF||LA46_9==72||LA46_9==93) ) {
						alt46=1;
					}
					else if ( (LA46_9==66) ) {
						alt46=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ACTION:
				case ARG_ACTION:
				case BANG:
				case CHAR_LITERAL:
				case REWRITE:
				case ROOT:
				case RULE_REF:
				case SEMPRED:
				case STRING_LITERAL:
				case TOKEN_REF:
				case TREE_BEGIN:
				case 66:
				case 67:
				case 68:
				case 69:
				case 72:
				case 75:
				case 78:
				case 91:
				case 93:
					{
					alt46=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case 72:
			case 93:
				{
				alt46=3;
				}
				break;
			case 66:
				{
				alt46=4;
				}
				break;
			case ACTION:
				{
				alt46=5;
				}
				break;
			case SEMPRED:
				{
				alt46=6;
				}
				break;
			case TREE_BEGIN:
				{
				alt46=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:230:4: id (labelOp= '=' |labelOp= '+=' ) atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) )
					{
					pushFollow(FOLLOW_id_in_elementNoOptionSpec1496);
					id89=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id89.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:230:7: (labelOp= '=' |labelOp= '+=' )
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==76) ) {
						alt39=1;
					}
					else if ( (LA39_0==70) ) {
						alt39=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						throw nvae;
					}

					switch (alt39) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:230:8: labelOp= '='
							{
							labelOp=(Token)match(input,76,FOLLOW_76_in_elementNoOptionSpec1501); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_76.add(labelOp);

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:230:20: labelOp= '+='
							{
							labelOp=(Token)match(input,70,FOLLOW_70_in_elementNoOptionSpec1505); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_70.add(labelOp);

							}
							break;

					}

					pushFollow(FOLLOW_atom_in_elementNoOptionSpec1508);
					atom90=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atom.add(atom90.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:231:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id atom ) )
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( ((LA40_0 >= 68 && LA40_0 <= 69)||LA40_0==78) ) {
						alt40=1;
					}
					else if ( (LA40_0==ACTION||LA40_0==CHAR_LITERAL||LA40_0==REWRITE||LA40_0==RULE_REF||LA40_0==SEMPRED||LA40_0==STRING_LITERAL||(LA40_0 >= TOKEN_REF && LA40_0 <= TREE_BEGIN)||(LA40_0 >= 66 && LA40_0 <= 67)||LA40_0==72||LA40_0==75||LA40_0==91||LA40_0==93) ) {
						alt40=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 40, 0, input);
						throw nvae;
					}

					switch (alt40) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:231:5: ebnfSuffix
							{
							pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1514);
							ebnfSuffix91=ebnfSuffix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix91.getTree());

							// AST REWRITE
							// elements: ebnfSuffix, labelOp, atom, id
							// token labels: labelOp
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 231:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:231:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:231:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] ) EOB[\"EOB\"] )
								{
								CommonTree root_2 = (CommonTree)adaptor.nil();
								root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:231:50: ^( ALT[\"ALT\"] ^( $labelOp id atom ) EOA[\"EOA\"] )
								{
								CommonTree root_3 = (CommonTree)adaptor.nil();
								root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:231:63: ^( $labelOp id atom )
								{
								CommonTree root_4 = (CommonTree)adaptor.nil();
								root_4 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_4);
								adaptor.addChild(root_4, stream_id.nextTree());
								adaptor.addChild(root_4, stream_atom.nextTree());
								adaptor.addChild(root_3, root_4);
								}

								adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));
								adaptor.addChild(root_2, root_3);
								}

								adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:232:8: 
							{

							// AST REWRITE
							// elements: labelOp, id, atom
							// token labels: labelOp
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 232:8: -> ^( $labelOp id atom )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:232:11: ^( $labelOp id atom )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_1);
								adaptor.addChild(root_1, stream_id.nextTree());
								adaptor.addChild(root_1, stream_atom.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:234:4: id (labelOp= '=' |labelOp= '+=' ) block ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) )
					{
					pushFollow(FOLLOW_id_in_elementNoOptionSpec1573);
					id92=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id92.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:234:7: (labelOp= '=' |labelOp= '+=' )
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==76) ) {
						alt41=1;
					}
					else if ( (LA41_0==70) ) {
						alt41=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 41, 0, input);
						throw nvae;
					}

					switch (alt41) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:234:8: labelOp= '='
							{
							labelOp=(Token)match(input,76,FOLLOW_76_in_elementNoOptionSpec1578); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_76.add(labelOp);

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:234:20: labelOp= '+='
							{
							labelOp=(Token)match(input,70,FOLLOW_70_in_elementNoOptionSpec1582); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_70.add(labelOp);

							}
							break;

					}

					pushFollow(FOLLOW_block_in_elementNoOptionSpec1585);
					block93=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block93.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:235:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> ^( $labelOp id block ) )
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( ((LA42_0 >= 68 && LA42_0 <= 69)||LA42_0==78) ) {
						alt42=1;
					}
					else if ( (LA42_0==ACTION||LA42_0==CHAR_LITERAL||LA42_0==REWRITE||LA42_0==RULE_REF||LA42_0==SEMPRED||LA42_0==STRING_LITERAL||(LA42_0 >= TOKEN_REF && LA42_0 <= TREE_BEGIN)||(LA42_0 >= 66 && LA42_0 <= 67)||LA42_0==72||LA42_0==75||LA42_0==91||LA42_0==93) ) {
						alt42=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 42, 0, input);
						throw nvae;
					}

					switch (alt42) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:235:5: ebnfSuffix
							{
							pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1591);
							ebnfSuffix94=ebnfSuffix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix94.getTree());

							// AST REWRITE
							// elements: ebnfSuffix, labelOp, id, block
							// token labels: labelOp
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 235:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:235:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:235:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] ) EOB[\"EOB\"] )
								{
								CommonTree root_2 = (CommonTree)adaptor.nil();
								root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:235:50: ^( ALT[\"ALT\"] ^( $labelOp id block ) EOA[\"EOA\"] )
								{
								CommonTree root_3 = (CommonTree)adaptor.nil();
								root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:235:63: ^( $labelOp id block )
								{
								CommonTree root_4 = (CommonTree)adaptor.nil();
								root_4 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_4);
								adaptor.addChild(root_4, stream_id.nextTree());
								adaptor.addChild(root_4, stream_block.nextTree());
								adaptor.addChild(root_3, root_4);
								}

								adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));
								adaptor.addChild(root_2, root_3);
								}

								adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:236:8: 
							{

							// AST REWRITE
							// elements: id, block, labelOp
							// token labels: labelOp
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleTokenStream stream_labelOp=new RewriteRuleTokenStream(adaptor,"token labelOp",labelOp);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 236:8: -> ^( $labelOp id block )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:236:11: ^( $labelOp id block )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_labelOp.nextNode(), root_1);
								adaptor.addChild(root_1, stream_id.nextTree());
								adaptor.addChild(root_1, stream_block.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:238:4: atom ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> atom )
					{
					pushFollow(FOLLOW_atom_in_elementNoOptionSpec1650);
					atom95=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_atom.add(atom95.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:239:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> atom )
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( ((LA43_0 >= 68 && LA43_0 <= 69)||LA43_0==78) ) {
						alt43=1;
					}
					else if ( (LA43_0==ACTION||LA43_0==CHAR_LITERAL||LA43_0==REWRITE||LA43_0==RULE_REF||LA43_0==SEMPRED||LA43_0==STRING_LITERAL||(LA43_0 >= TOKEN_REF && LA43_0 <= TREE_BEGIN)||(LA43_0 >= 66 && LA43_0 <= 67)||LA43_0==72||LA43_0==75||LA43_0==91||LA43_0==93) ) {
						alt43=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
						throw nvae;
					}

					switch (alt43) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:239:5: ebnfSuffix
							{
							pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1656);
							ebnfSuffix96=ebnfSuffix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix96.getTree());

							// AST REWRITE
							// elements: atom, ebnfSuffix
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 239:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:239:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:239:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] atom EOA[\"EOA\"] ) EOB[\"EOB\"] )
								{
								CommonTree root_2 = (CommonTree)adaptor.nil();
								root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:239:50: ^( ALT[\"ALT\"] atom EOA[\"EOA\"] )
								{
								CommonTree root_3 = (CommonTree)adaptor.nil();
								root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);
								adaptor.addChild(root_3, stream_atom.nextTree());
								adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));
								adaptor.addChild(root_2, root_3);
								}

								adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:240:8: 
							{

							// AST REWRITE
							// elements: atom
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 240:8: -> atom
							{
								adaptor.addChild(root_0, stream_atom.nextTree());
							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:242:4: ebnf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_ebnf_in_elementNoOptionSpec1702);
					ebnf97=ebnf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ebnf97.getTree());

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:243:6: ACTION
					{
					root_0 = (CommonTree)adaptor.nil();


					ACTION98=(Token)match(input,ACTION,FOLLOW_ACTION_in_elementNoOptionSpec1709); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ACTION98_tree = (CommonTree)adaptor.create(ACTION98);
					adaptor.addChild(root_0, ACTION98_tree);
					}

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:244:6: SEMPRED ( '=>' -> GATED_SEMPRED | -> SEMPRED )
					{
					SEMPRED99=(Token)match(input,SEMPRED,FOLLOW_SEMPRED_in_elementNoOptionSpec1716); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMPRED.add(SEMPRED99);

					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:244:14: ( '=>' -> GATED_SEMPRED | -> SEMPRED )
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==77) ) {
						alt44=1;
					}
					else if ( (LA44_0==ACTION||LA44_0==CHAR_LITERAL||LA44_0==REWRITE||LA44_0==RULE_REF||LA44_0==SEMPRED||LA44_0==STRING_LITERAL||(LA44_0 >= TOKEN_REF && LA44_0 <= TREE_BEGIN)||(LA44_0 >= 66 && LA44_0 <= 67)||LA44_0==72||LA44_0==75||LA44_0==91||LA44_0==93) ) {
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
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:244:16: '=>'
							{
							string_literal100=(Token)match(input,77,FOLLOW_77_in_elementNoOptionSpec1720); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_77.add(string_literal100);


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
							// 244:21: -> GATED_SEMPRED
							{
								adaptor.addChild(root_0, (CommonTree)adaptor.create(GATED_SEMPRED, "GATED_SEMPRED"));
							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:244:40: 
							{

							// AST REWRITE
							// elements: SEMPRED
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 244:40: -> SEMPRED
							{
								adaptor.addChild(root_0, stream_SEMPRED.nextNode());
							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:245:6: treeSpec ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> treeSpec )
					{
					pushFollow(FOLLOW_treeSpec_in_elementNoOptionSpec1739);
					treeSpec101=treeSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_treeSpec.add(treeSpec101.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:246:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> treeSpec )
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( ((LA45_0 >= 68 && LA45_0 <= 69)||LA45_0==78) ) {
						alt45=1;
					}
					else if ( (LA45_0==ACTION||LA45_0==CHAR_LITERAL||LA45_0==REWRITE||LA45_0==RULE_REF||LA45_0==SEMPRED||LA45_0==STRING_LITERAL||(LA45_0 >= TOKEN_REF && LA45_0 <= TREE_BEGIN)||(LA45_0 >= 66 && LA45_0 <= 67)||LA45_0==72||LA45_0==75||LA45_0==91||LA45_0==93) ) {
						alt45=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 45, 0, input);
						throw nvae;
					}

					switch (alt45) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:246:5: ebnfSuffix
							{
							pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1745);
							ebnfSuffix102=ebnfSuffix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix102.getTree());

							// AST REWRITE
							// elements: ebnfSuffix, treeSpec
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 246:16: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:246:19: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:246:33: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] ) EOB[\"EOB\"] )
								{
								CommonTree root_2 = (CommonTree)adaptor.nil();
								root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:246:50: ^( ALT[\"ALT\"] treeSpec EOA[\"EOA\"] )
								{
								CommonTree root_3 = (CommonTree)adaptor.nil();
								root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);
								adaptor.addChild(root_3, stream_treeSpec.nextTree());
								adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));
								adaptor.addChild(root_2, root_3);
								}

								adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:247:8: 
							{

							// AST REWRITE
							// elements: treeSpec
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 247:8: -> treeSpec
							{
								adaptor.addChild(root_0, stream_treeSpec.nextTree());
							}


							retval.tree = root_0;
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elementNoOptionSpec"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:1: atom : ( range ( (op= '^' |op= '!' ) -> ^( $op range ) | -> range ) | terminal | notSet ( (op= '^' |op= '!' ) -> ^( $op notSet ) | -> notSet ) | RULE_REF (arg= ARG_ACTION )? ( (op= '^' |op= '!' ) )? -> {$arg!=null&&op!=null}? ^( $op RULE_REF $arg) -> {$arg!=null}? ^( RULE_REF $arg) -> {$op!=null}? ^( $op RULE_REF ) -> RULE_REF );
	public final ANTLRv3Parser.atom_return atom() throws RecognitionException {
		ANTLRv3Parser.atom_return retval = new ANTLRv3Parser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token op=null;
		Token arg=null;
		Token RULE_REF106=null;
		ParserRuleReturnScope range103 =null;
		ParserRuleReturnScope terminal104 =null;
		ParserRuleReturnScope notSet105 =null;

		CommonTree op_tree=null;
		CommonTree arg_tree=null;
		CommonTree RULE_REF106_tree=null;
		RewriteRuleTokenStream stream_ROOT=new RewriteRuleTokenStream(adaptor,"token ROOT");
		RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
		RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
		RewriteRuleTokenStream stream_RULE_REF=new RewriteRuleTokenStream(adaptor,"token RULE_REF");
		RewriteRuleSubtreeStream stream_notSet=new RewriteRuleSubtreeStream(adaptor,"rule notSet");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:5: ( range ( (op= '^' |op= '!' ) -> ^( $op range ) | -> range ) | terminal | notSet ( (op= '^' |op= '!' ) -> ^( $op notSet ) | -> notSet ) | RULE_REF (arg= ARG_ACTION )? ( (op= '^' |op= '!' ) )? -> {$arg!=null&&op!=null}? ^( $op RULE_REF $arg) -> {$arg!=null}? ^( RULE_REF $arg) -> {$op!=null}? ^( $op RULE_REF ) -> RULE_REF )
			int alt54=4;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
				{
				int LA54_1 = input.LA(2);
				if ( (LA54_1==RANGE) ) {
					alt54=1;
				}
				else if ( (LA54_1==ACTION||LA54_1==BANG||LA54_1==CHAR_LITERAL||(LA54_1 >= REWRITE && LA54_1 <= ROOT)||LA54_1==RULE_REF||LA54_1==SEMPRED||LA54_1==STRING_LITERAL||(LA54_1 >= TOKEN_REF && LA54_1 <= TREE_BEGIN)||(LA54_1 >= 66 && LA54_1 <= 69)||LA54_1==72||LA54_1==75||LA54_1==78||LA54_1==91||LA54_1==93) ) {
					alt54=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING_LITERAL:
			case TOKEN_REF:
			case 72:
				{
				alt54=2;
				}
				break;
			case 93:
				{
				alt54=3;
				}
				break;
			case RULE_REF:
				{
				alt54=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:9: range ( (op= '^' |op= '!' ) -> ^( $op range ) | -> range )
					{
					pushFollow(FOLLOW_range_in_atom1797);
					range103=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(range103.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:15: ( (op= '^' |op= '!' ) -> ^( $op range ) | -> range )
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==BANG||LA48_0==ROOT) ) {
						alt48=1;
					}
					else if ( (LA48_0==ACTION||LA48_0==CHAR_LITERAL||LA48_0==REWRITE||LA48_0==RULE_REF||LA48_0==SEMPRED||LA48_0==STRING_LITERAL||(LA48_0 >= TOKEN_REF && LA48_0 <= TREE_BEGIN)||(LA48_0 >= 66 && LA48_0 <= 69)||LA48_0==72||LA48_0==75||LA48_0==78||LA48_0==91||LA48_0==93) ) {
						alt48=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 48, 0, input);
						throw nvae;
					}

					switch (alt48) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:17: (op= '^' |op= '!' )
							{
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:17: (op= '^' |op= '!' )
							int alt47=2;
							int LA47_0 = input.LA(1);
							if ( (LA47_0==ROOT) ) {
								alt47=1;
							}
							else if ( (LA47_0==BANG) ) {
								alt47=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 47, 0, input);
								throw nvae;
							}

							switch (alt47) {
								case 1 :
									// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:18: op= '^'
									{
									op=(Token)match(input,ROOT,FOLLOW_ROOT_in_atom1804); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_ROOT.add(op);

									}
									break;
								case 2 :
									// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:25: op= '!'
									{
									op=(Token)match(input,BANG,FOLLOW_BANG_in_atom1808); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_BANG.add(op);

									}
									break;

							}


							// AST REWRITE
							// elements: range, op
							// token labels: op
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 251:33: -> ^( $op range )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:36: ^( $op range )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
								adaptor.addChild(root_1, stream_range.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:251:51: 
							{

							// AST REWRITE
							// elements: range
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 251:51: -> range
							{
								adaptor.addChild(root_0, stream_range.nextTree());
							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:252:9: terminal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_terminal_in_atom1836);
					terminal104=terminal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, terminal104.getTree());

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:253:7: notSet ( (op= '^' |op= '!' ) -> ^( $op notSet ) | -> notSet )
					{
					pushFollow(FOLLOW_notSet_in_atom1844);
					notSet105=notSet();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_notSet.add(notSet105.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:253:14: ( (op= '^' |op= '!' ) -> ^( $op notSet ) | -> notSet )
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==BANG||LA50_0==ROOT) ) {
						alt50=1;
					}
					else if ( (LA50_0==ACTION||LA50_0==CHAR_LITERAL||LA50_0==REWRITE||LA50_0==RULE_REF||LA50_0==SEMPRED||LA50_0==STRING_LITERAL||(LA50_0 >= TOKEN_REF && LA50_0 <= TREE_BEGIN)||(LA50_0 >= 66 && LA50_0 <= 69)||LA50_0==72||LA50_0==75||LA50_0==78||LA50_0==91||LA50_0==93) ) {
						alt50=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}

					switch (alt50) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:253:16: (op= '^' |op= '!' )
							{
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:253:16: (op= '^' |op= '!' )
							int alt49=2;
							int LA49_0 = input.LA(1);
							if ( (LA49_0==ROOT) ) {
								alt49=1;
							}
							else if ( (LA49_0==BANG) ) {
								alt49=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 49, 0, input);
								throw nvae;
							}

							switch (alt49) {
								case 1 :
									// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:253:17: op= '^'
									{
									op=(Token)match(input,ROOT,FOLLOW_ROOT_in_atom1851); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_ROOT.add(op);

									}
									break;
								case 2 :
									// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:253:24: op= '!'
									{
									op=(Token)match(input,BANG,FOLLOW_BANG_in_atom1855); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_BANG.add(op);

									}
									break;

							}


							// AST REWRITE
							// elements: op, notSet
							// token labels: op
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 253:32: -> ^( $op notSet )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:253:35: ^( $op notSet )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
								adaptor.addChild(root_1, stream_notSet.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:253:51: 
							{

							// AST REWRITE
							// elements: notSet
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 253:51: -> notSet
							{
								adaptor.addChild(root_0, stream_notSet.nextTree());
							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:254:9: RULE_REF (arg= ARG_ACTION )? ( (op= '^' |op= '!' ) )?
					{
					RULE_REF106=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_atom1883); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RULE_REF.add(RULE_REF106);

					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:254:18: (arg= ARG_ACTION )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==ARG_ACTION) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:254:20: arg= ARG_ACTION
							{
							arg=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_atom1889); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ARG_ACTION.add(arg);

							}
							break;

					}

					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:254:38: ( (op= '^' |op= '!' ) )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==BANG||LA53_0==ROOT) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:254:40: (op= '^' |op= '!' )
							{
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:254:40: (op= '^' |op= '!' )
							int alt52=2;
							int LA52_0 = input.LA(1);
							if ( (LA52_0==ROOT) ) {
								alt52=1;
							}
							else if ( (LA52_0==BANG) ) {
								alt52=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 52, 0, input);
								throw nvae;
							}

							switch (alt52) {
								case 1 :
									// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:254:41: op= '^'
									{
									op=(Token)match(input,ROOT,FOLLOW_ROOT_in_atom1899); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_ROOT.add(op);

									}
									break;
								case 2 :
									// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:254:48: op= '!'
									{
									op=(Token)match(input,BANG,FOLLOW_BANG_in_atom1903); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_BANG.add(op);

									}
									break;

							}

							}
							break;

					}


					// AST REWRITE
					// elements: RULE_REF, arg, RULE_REF, op, RULE_REF, arg, op, RULE_REF
					// token labels: op, arg
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
					RewriteRuleTokenStream stream_arg=new RewriteRuleTokenStream(adaptor,"token arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 255:6: -> {$arg!=null&&op!=null}? ^( $op RULE_REF $arg)
					if (arg!=null&&op!=null) {
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:255:33: ^( $op RULE_REF $arg)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
						adaptor.addChild(root_1, stream_RULE_REF.nextNode());
						adaptor.addChild(root_1, stream_arg.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 256:6: -> {$arg!=null}? ^( RULE_REF $arg)
					if (arg!=null) {
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:256:25: ^( RULE_REF $arg)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_RULE_REF.nextNode(), root_1);
						adaptor.addChild(root_1, stream_arg.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 257:6: -> {$op!=null}? ^( $op RULE_REF )
					if (op!=null) {
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:257:25: ^( $op RULE_REF )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_op.nextNode(), root_1);
						adaptor.addChild(root_1, stream_RULE_REF.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 258:6: -> RULE_REF
					{
						adaptor.addChild(root_0, stream_RULE_REF.nextNode());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class notSet_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "notSet"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:261:1: notSet : '~' ( notTerminal -> ^( '~' notTerminal ) | block -> ^( '~' block ) ) ;
	public final ANTLRv3Parser.notSet_return notSet() throws RecognitionException {
		ANTLRv3Parser.notSet_return retval = new ANTLRv3Parser.notSet_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal107=null;
		ParserRuleReturnScope notTerminal108 =null;
		ParserRuleReturnScope block109 =null;

		CommonTree char_literal107_tree=null;
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_notTerminal=new RewriteRuleSubtreeStream(adaptor,"rule notTerminal");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:262:2: ( '~' ( notTerminal -> ^( '~' notTerminal ) | block -> ^( '~' block ) ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:262:4: '~' ( notTerminal -> ^( '~' notTerminal ) | block -> ^( '~' block ) )
			{
			char_literal107=(Token)match(input,93,FOLLOW_93_in_notSet1986); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_93.add(char_literal107);

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:263:3: ( notTerminal -> ^( '~' notTerminal ) | block -> ^( '~' block ) )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==CHAR_LITERAL||LA55_0==STRING_LITERAL||LA55_0==TOKEN_REF) ) {
				alt55=1;
			}
			else if ( (LA55_0==66) ) {
				alt55=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}

			switch (alt55) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:263:5: notTerminal
					{
					pushFollow(FOLLOW_notTerminal_in_notSet1992);
					notTerminal108=notTerminal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_notTerminal.add(notTerminal108.getTree());

					// AST REWRITE
					// elements: notTerminal, 93
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 263:17: -> ^( '~' notTerminal )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:263:20: ^( '~' notTerminal )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_93.nextNode(), root_1);
						adaptor.addChild(root_1, stream_notTerminal.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:264:5: block
					{
					pushFollow(FOLLOW_block_in_notSet2006);
					block109=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block109.getTree());

					// AST REWRITE
					// elements: block, 93
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 264:12: -> ^( '~' block )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:264:15: ^( '~' block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_93.nextNode(), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "notSet"


	public static class treeSpec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "treeSpec"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:268:1: treeSpec : '^(' element ( element )+ ')' -> ^( TREE_BEGIN ( element )+ ) ;
	public final ANTLRv3Parser.treeSpec_return treeSpec() throws RecognitionException {
		ANTLRv3Parser.treeSpec_return retval = new ANTLRv3Parser.treeSpec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal110=null;
		Token char_literal113=null;
		ParserRuleReturnScope element111 =null;
		ParserRuleReturnScope element112 =null;

		CommonTree string_literal110_tree=null;
		CommonTree char_literal113_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_TREE_BEGIN=new RewriteRuleTokenStream(adaptor,"token TREE_BEGIN");
		RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:269:2: ( '^(' element ( element )+ ')' -> ^( TREE_BEGIN ( element )+ ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:269:4: '^(' element ( element )+ ')'
			{
			string_literal110=(Token)match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_treeSpec2030); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TREE_BEGIN.add(string_literal110);

			pushFollow(FOLLOW_element_in_treeSpec2032);
			element111=element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_element.add(element111.getTree());
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:269:17: ( element )+
			int cnt56=0;
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==ACTION||LA56_0==CHAR_LITERAL||LA56_0==RULE_REF||LA56_0==SEMPRED||LA56_0==STRING_LITERAL||(LA56_0 >= TOKEN_REF && LA56_0 <= TREE_BEGIN)||LA56_0==66||LA56_0==72||LA56_0==93) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:269:19: element
					{
					pushFollow(FOLLOW_element_in_treeSpec2036);
					element112=element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_element.add(element112.getTree());
					}
					break;

				default :
					if ( cnt56 >= 1 ) break loop56;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(56, input);
					throw eee;
				}
				cnt56++;
			}

			char_literal113=(Token)match(input,67,FOLLOW_67_in_treeSpec2041); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal113);


			// AST REWRITE
			// elements: element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 269:34: -> ^( TREE_BEGIN ( element )+ )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:269:37: ^( TREE_BEGIN ( element )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TREE_BEGIN, "TREE_BEGIN"), root_1);
				if ( !(stream_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_element.hasNext() ) {
					adaptor.addChild(root_1, stream_element.nextTree());
				}
				stream_element.reset();

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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "treeSpec"


	public static class ebnf_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ebnf"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:273:1: ebnf : block (op= '?' -> ^( OPTIONAL[op] block ) |op= '*' -> ^( CLOSURE[op] block ) |op= '+' -> ^( POSITIVE_CLOSURE[op] block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block ) ;
	public final ANTLRv3Parser.ebnf_return ebnf() throws RecognitionException {
		ANTLRv3Parser.ebnf_return retval = new ANTLRv3Parser.ebnf_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token op=null;
		Token string_literal115=null;
		ParserRuleReturnScope block114 =null;

		CommonTree op_tree=null;
		CommonTree string_literal115_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");


		    Token firstToken = input.LT(1);

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:281:2: ( block (op= '?' -> ^( OPTIONAL[op] block ) |op= '*' -> ^( CLOSURE[op] block ) |op= '+' -> ^( POSITIVE_CLOSURE[op] block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:281:4: block (op= '?' -> ^( OPTIONAL[op] block ) |op= '*' -> ^( CLOSURE[op] block ) |op= '+' -> ^( POSITIVE_CLOSURE[op] block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block )
			{
			pushFollow(FOLLOW_block_in_ebnf2073);
			block114=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block114.getTree());
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:282:3: (op= '?' -> ^( OPTIONAL[op] block ) |op= '*' -> ^( CLOSURE[op] block ) |op= '+' -> ^( POSITIVE_CLOSURE[op] block ) | '=>' -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block ) -> SYN_SEMPRED | -> block )
			int alt57=5;
			switch ( input.LA(1) ) {
			case 78:
				{
				alt57=1;
				}
				break;
			case 68:
				{
				alt57=2;
				}
				break;
			case 69:
				{
				alt57=3;
				}
				break;
			case 77:
				{
				alt57=4;
				}
				break;
			case ACTION:
			case CHAR_LITERAL:
			case REWRITE:
			case RULE_REF:
			case SEMPRED:
			case STRING_LITERAL:
			case TOKEN_REF:
			case TREE_BEGIN:
			case 66:
			case 67:
			case 72:
			case 75:
			case 91:
			case 93:
				{
				alt57=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:282:5: op= '?'
					{
					op=(Token)match(input,78,FOLLOW_78_in_ebnf2081); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(op);


					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 282:12: -> ^( OPTIONAL[op] block )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:282:15: ^( OPTIONAL[op] block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPTIONAL, op), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:283:5: op= '*'
					{
					op=(Token)match(input,68,FOLLOW_68_in_ebnf2098); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(op);


					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 283:12: -> ^( CLOSURE[op] block )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:283:15: ^( CLOSURE[op] block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CLOSURE, op), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:284:5: op= '+'
					{
					op=(Token)match(input,69,FOLLOW_69_in_ebnf2115); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_69.add(op);


					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 284:12: -> ^( POSITIVE_CLOSURE[op] block )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:284:15: ^( POSITIVE_CLOSURE[op] block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POSITIVE_CLOSURE, op), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:285:7: '=>'
					{
					string_literal115=(Token)match(input,77,FOLLOW_77_in_ebnf2132); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_77.add(string_literal115);


					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 286:6: -> {gtype==COMBINED_GRAMMAR &&\n\t\t\t\t\t Character.isUpperCase($rule::name.charAt(0))}? ^( SYNPRED[\"=>\"] block )
					if (gtype==COMBINED_GRAMMAR &&
										    Character.isUpperCase(rule_stack.peek().name.charAt(0))) {
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:289:9: ^( SYNPRED[\"=>\"] block )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SYNPRED, "=>"), root_1);
						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 291:6: -> SYN_SEMPRED
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SYN_SEMPRED, "SYN_SEMPRED"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:292:13: 
					{

					// AST REWRITE
					// elements: block
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 292:13: -> block
					{
						adaptor.addChild(root_0, stream_block.nextTree());
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
			if ( state.backtracking==0 ) {
				retval.tree.getToken().setLine(firstToken.getLine());
				retval.tree.getToken().setCharPositionInLine(firstToken.getCharPositionInLine());
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ebnf"


	public static class range_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "range"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:296:1: range : c1= CHAR_LITERAL RANGE c2= CHAR_LITERAL -> ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2) ;
	public final ANTLRv3Parser.range_return range() throws RecognitionException {
		ANTLRv3Parser.range_return retval = new ANTLRv3Parser.range_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token c1=null;
		Token c2=null;
		Token RANGE116=null;

		CommonTree c1_tree=null;
		CommonTree c2_tree=null;
		CommonTree RANGE116_tree=null;
		RewriteRuleTokenStream stream_CHAR_LITERAL=new RewriteRuleTokenStream(adaptor,"token CHAR_LITERAL");
		RewriteRuleTokenStream stream_RANGE=new RewriteRuleTokenStream(adaptor,"token RANGE");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:297:2: (c1= CHAR_LITERAL RANGE c2= CHAR_LITERAL -> ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:297:4: c1= CHAR_LITERAL RANGE c2= CHAR_LITERAL
			{
			c1=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range2215); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CHAR_LITERAL.add(c1);

			RANGE116=(Token)match(input,RANGE,FOLLOW_RANGE_in_range2217); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RANGE.add(RANGE116);

			c2=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range2221); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CHAR_LITERAL.add(c2);


			// AST REWRITE
			// elements: c1, c2
			// token labels: c1, c2
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c1=new RewriteRuleTokenStream(adaptor,"token c1",c1);
			RewriteRuleTokenStream stream_c2=new RewriteRuleTokenStream(adaptor,"token c2",c2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 297:42: -> ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2)
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:297:45: ^( CHAR_RANGE[$c1,\"..\"] $c1 $c2)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CHAR_RANGE, c1, ".."), root_1);
				adaptor.addChild(root_1, stream_c1.nextNode());
				adaptor.addChild(root_1, stream_c2.nextNode());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range"


	public static class terminal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "terminal"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:300:1: terminal : ( CHAR_LITERAL -> CHAR_LITERAL | TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF ) | STRING_LITERAL -> STRING_LITERAL | '.' -> '.' ) ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )? ;
	public final ANTLRv3Parser.terminal_return terminal() throws RecognitionException {
		ANTLRv3Parser.terminal_return retval = new ANTLRv3Parser.terminal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CHAR_LITERAL117=null;
		Token TOKEN_REF118=null;
		Token ARG_ACTION119=null;
		Token STRING_LITERAL120=null;
		Token char_literal121=null;
		Token char_literal122=null;
		Token char_literal123=null;

		CommonTree CHAR_LITERAL117_tree=null;
		CommonTree TOKEN_REF118_tree=null;
		CommonTree ARG_ACTION119_tree=null;
		CommonTree STRING_LITERAL120_tree=null;
		CommonTree char_literal121_tree=null;
		CommonTree char_literal122_tree=null;
		CommonTree char_literal123_tree=null;
		RewriteRuleTokenStream stream_ROOT=new RewriteRuleTokenStream(adaptor,"token ROOT");
		RewriteRuleTokenStream stream_BANG=new RewriteRuleTokenStream(adaptor,"token BANG");
		RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");
		RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_CHAR_LITERAL=new RewriteRuleTokenStream(adaptor,"token CHAR_LITERAL");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:301:5: ( ( CHAR_LITERAL -> CHAR_LITERAL | TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF ) | STRING_LITERAL -> STRING_LITERAL | '.' -> '.' ) ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )? )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:301:9: ( CHAR_LITERAL -> CHAR_LITERAL | TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF ) | STRING_LITERAL -> STRING_LITERAL | '.' -> '.' ) ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )?
			{
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:301:9: ( CHAR_LITERAL -> CHAR_LITERAL | TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF ) | STRING_LITERAL -> STRING_LITERAL | '.' -> '.' )
			int alt59=4;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
				{
				alt59=1;
				}
				break;
			case TOKEN_REF:
				{
				alt59=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt59=3;
				}
				break;
			case 72:
				{
				alt59=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:301:11: CHAR_LITERAL
					{
					CHAR_LITERAL117=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_terminal2252); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CHAR_LITERAL.add(CHAR_LITERAL117);


					// AST REWRITE
					// elements: CHAR_LITERAL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 301:27: -> CHAR_LITERAL
					{
						adaptor.addChild(root_0, stream_CHAR_LITERAL.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:303:7: TOKEN_REF ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF )
					{
					TOKEN_REF118=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_terminal2274); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TOKEN_REF.add(TOKEN_REF118);

					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:304:4: ( ARG_ACTION -> ^( TOKEN_REF ARG_ACTION ) | -> TOKEN_REF )
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==ARG_ACTION) ) {
						alt58=1;
					}
					else if ( (LA58_0==ACTION||LA58_0==BANG||LA58_0==CHAR_LITERAL||(LA58_0 >= REWRITE && LA58_0 <= ROOT)||LA58_0==RULE_REF||LA58_0==SEMPRED||LA58_0==STRING_LITERAL||(LA58_0 >= TOKEN_REF && LA58_0 <= TREE_BEGIN)||(LA58_0 >= 66 && LA58_0 <= 69)||LA58_0==72||LA58_0==75||LA58_0==78||LA58_0==91||LA58_0==93) ) {
						alt58=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 58, 0, input);
						throw nvae;
					}

					switch (alt58) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:304:6: ARG_ACTION
							{
							ARG_ACTION119=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_terminal2281); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ARG_ACTION.add(ARG_ACTION119);


							// AST REWRITE
							// elements: TOKEN_REF, ARG_ACTION
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 304:20: -> ^( TOKEN_REF ARG_ACTION )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:304:23: ^( TOKEN_REF ARG_ACTION )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_TOKEN_REF.nextNode(), root_1);
								adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:305:12: 
							{

							// AST REWRITE
							// elements: TOKEN_REF
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 305:12: -> TOKEN_REF
							{
								adaptor.addChild(root_0, stream_TOKEN_REF.nextNode());
							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:307:7: STRING_LITERAL
					{
					STRING_LITERAL120=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_terminal2320); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STRING_LITERAL.add(STRING_LITERAL120);


					// AST REWRITE
					// elements: STRING_LITERAL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 307:25: -> STRING_LITERAL
					{
						adaptor.addChild(root_0, stream_STRING_LITERAL.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:308:7: '.'
					{
					char_literal121=(Token)match(input,72,FOLLOW_72_in_terminal2335); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal121);


					// AST REWRITE
					// elements: 72
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 308:17: -> '.'
					{
						adaptor.addChild(root_0, stream_72.nextNode());
					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:310:3: ( '^' -> ^( '^' $terminal) | '!' -> ^( '!' $terminal) )?
			int alt60=3;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==ROOT) ) {
				alt60=1;
			}
			else if ( (LA60_0==BANG) ) {
				alt60=2;
			}
			switch (alt60) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:310:5: '^'
					{
					char_literal122=(Token)match(input,ROOT,FOLLOW_ROOT_in_terminal2356); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ROOT.add(char_literal122);


					// AST REWRITE
					// elements: terminal, ROOT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 310:15: -> ^( '^' $terminal)
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:310:18: ^( '^' $terminal)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ROOT.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:311:5: '!'
					{
					char_literal123=(Token)match(input,BANG,FOLLOW_BANG_in_terminal2377); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BANG.add(char_literal123);


					// AST REWRITE
					// elements: terminal, BANG
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 311:15: -> ^( '!' $terminal)
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:311:18: ^( '!' $terminal)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_BANG.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "terminal"


	public static class notTerminal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "notTerminal"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:315:1: notTerminal : ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL );
	public final ANTLRv3Parser.notTerminal_return notTerminal() throws RecognitionException {
		ANTLRv3Parser.notTerminal_return retval = new ANTLRv3Parser.notTerminal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set124=null;

		CommonTree set124_tree=null;

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:316:2: ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set124=input.LT(1);
			if ( input.LA(1)==CHAR_LITERAL||input.LA(1)==STRING_LITERAL||input.LA(1)==TOKEN_REF ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set124));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "notTerminal"


	public static class ebnfSuffix_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ebnfSuffix"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:321:1: ebnfSuffix : ( '?' -> OPTIONAL[op] | '*' -> CLOSURE[op] | '+' -> POSITIVE_CLOSURE[op] );
	public final ANTLRv3Parser.ebnfSuffix_return ebnfSuffix() throws RecognitionException {
		ANTLRv3Parser.ebnfSuffix_return retval = new ANTLRv3Parser.ebnfSuffix_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal125=null;
		Token char_literal126=null;
		Token char_literal127=null;

		CommonTree char_literal125_tree=null;
		CommonTree char_literal126_tree=null;
		CommonTree char_literal127_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");


			Token op = input.LT(1);

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:325:2: ( '?' -> OPTIONAL[op] | '*' -> CLOSURE[op] | '+' -> POSITIVE_CLOSURE[op] )
			int alt61=3;
			switch ( input.LA(1) ) {
			case 78:
				{
				alt61=1;
				}
				break;
			case 68:
				{
				alt61=2;
				}
				break;
			case 69:
				{
				alt61=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:325:4: '?'
					{
					char_literal125=(Token)match(input,78,FOLLOW_78_in_ebnfSuffix2437); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal125);


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
					// 325:8: -> OPTIONAL[op]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(OPTIONAL, op));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:326:6: '*'
					{
					char_literal126=(Token)match(input,68,FOLLOW_68_in_ebnfSuffix2449); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(char_literal126);


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
					// 326:10: -> CLOSURE[op]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(CLOSURE, op));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:327:7: '+'
					{
					char_literal127=(Token)match(input,69,FOLLOW_69_in_ebnfSuffix2462); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_69.add(char_literal127);


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
					// 327:11: -> POSITIVE_CLOSURE[op]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(POSITIVE_CLOSURE, op));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ebnfSuffix"


	public static class rewrite_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:334:1: rewrite : ( (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )* rew2= '->' last= rewrite_alternative -> ( ^( $rew $preds $predicated) )* ^( $rew2 $last) |);
	public final ANTLRv3Parser.rewrite_return rewrite() throws RecognitionException {
		ANTLRv3Parser.rewrite_return retval = new ANTLRv3Parser.rewrite_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token rew2=null;
		Token rew=null;
		Token preds=null;
		List<Object> list_rew=null;
		List<Object> list_preds=null;
		List<Object> list_predicated=null;
		ParserRuleReturnScope last =null;
		RuleReturnScope predicated = null;
		CommonTree rew2_tree=null;
		CommonTree rew_tree=null;
		CommonTree preds_tree=null;
		RewriteRuleTokenStream stream_REWRITE=new RewriteRuleTokenStream(adaptor,"token REWRITE");
		RewriteRuleTokenStream stream_SEMPRED=new RewriteRuleTokenStream(adaptor,"token SEMPRED");
		RewriteRuleSubtreeStream stream_rewrite_alternative=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_alternative");


			Token firstToken = input.LT(1);

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:338:2: ( (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )* rew2= '->' last= rewrite_alternative -> ( ^( $rew $preds $predicated) )* ^( $rew2 $last) |)
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==REWRITE) ) {
				alt63=1;
			}
			else if ( (LA63_0==67||LA63_0==75||LA63_0==91) ) {
				alt63=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:338:4: (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )* rew2= '->' last= rewrite_alternative
					{
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:338:4: (rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative )*
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==REWRITE) ) {
							int LA62_1 = input.LA(2);
							if ( (LA62_1==SEMPRED) ) {
								alt62=1;
							}

						}

						switch (alt62) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:338:5: rew+= '->' preds+= SEMPRED predicated+= rewrite_alternative
							{
							rew=(Token)match(input,REWRITE,FOLLOW_REWRITE_in_rewrite2491); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_REWRITE.add(rew);

							if (list_rew==null) list_rew=new ArrayList<Object>();
							list_rew.add(rew);
							preds=(Token)match(input,SEMPRED,FOLLOW_SEMPRED_in_rewrite2495); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMPRED.add(preds);

							if (list_preds==null) list_preds=new ArrayList<Object>();
							list_preds.add(preds);
							pushFollow(FOLLOW_rewrite_alternative_in_rewrite2499);
							predicated=rewrite_alternative();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_rewrite_alternative.add(predicated.getTree());
							if (list_predicated==null) list_predicated=new ArrayList<Object>();
							list_predicated.add(predicated.getTree());
							}
							break;

						default :
							break loop62;
						}
					}

					rew2=(Token)match(input,REWRITE,FOLLOW_REWRITE_in_rewrite2507); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REWRITE.add(rew2);

					pushFollow(FOLLOW_rewrite_alternative_in_rewrite2511);
					last=rewrite_alternative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewrite_alternative.add(last.getTree());

					// AST REWRITE
					// elements: preds, rew2, predicated, last, rew
					// token labels: rew2
					// rule labels: last, retval
					// token list labels: rew, preds
					// rule list labels: predicated
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_rew2=new RewriteRuleTokenStream(adaptor,"token rew2",rew2);
					RewriteRuleTokenStream stream_rew=new RewriteRuleTokenStream(adaptor,"token rew", list_rew);
					RewriteRuleTokenStream stream_preds=new RewriteRuleTokenStream(adaptor,"token preds", list_preds);
					RewriteRuleSubtreeStream stream_last=new RewriteRuleSubtreeStream(adaptor,"rule last",last!=null?last.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_predicated=new RewriteRuleSubtreeStream(adaptor,"token predicated",list_predicated);
					root_0 = (CommonTree)adaptor.nil();
					// 340:9: -> ( ^( $rew $preds $predicated) )* ^( $rew2 $last)
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:340:12: ( ^( $rew $preds $predicated) )*
						while ( stream_preds.hasNext()||stream_predicated.hasNext()||stream_rew.hasNext() ) {
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:340:12: ^( $rew $preds $predicated)
							{
							CommonTree root_1 = (CommonTree)adaptor.nil();
							root_1 = (CommonTree)adaptor.becomeRoot(stream_rew.nextNode(), root_1);
							adaptor.addChild(root_1, stream_preds.nextNode());
							adaptor.addChild(root_1, stream_predicated.nextTree());
							adaptor.addChild(root_0, root_1);
							}

						}
						stream_preds.reset();
						stream_predicated.reset();
						stream_rew.reset();

						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:340:40: ^( $rew2 $last)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_rew2.nextNode(), root_1);
						adaptor.addChild(root_1, stream_last.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:342:2: 
					{
					root_0 = (CommonTree)adaptor.nil();


					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite"


	public static class rewrite_alternative_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_alternative"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:344:1: rewrite_alternative options {backtrack=true; } : ( rewrite_template | rewrite_tree_alternative | -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] ) );
	public final ANTLRv3Parser.rewrite_alternative_return rewrite_alternative() throws RecognitionException {
		ANTLRv3Parser.rewrite_alternative_return retval = new ANTLRv3Parser.rewrite_alternative_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope rewrite_template128 =null;
		ParserRuleReturnScope rewrite_tree_alternative129 =null;


		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:346:2: ( rewrite_template | rewrite_tree_alternative | -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] ) )
			int alt64=3;
			switch ( input.LA(1) ) {
			case TOKEN_REF:
				{
				int LA64_1 = input.LA(2);
				if ( (LA64_1==66) ) {
					switch ( input.LA(3) ) {
					case TOKEN_REF:
						{
						int LA64_10 = input.LA(4);
						if ( (LA64_10==76) ) {
							alt64=1;
						}
						else if ( (LA64_10==ACTION||LA64_10==ARG_ACTION||LA64_10==CHAR_LITERAL||LA64_10==RULE_REF||LA64_10==STRING_LITERAL||(LA64_10 >= TOKEN_REF && LA64_10 <= TREE_BEGIN)||(LA64_10 >= 65 && LA64_10 <= 69)||LA64_10==78) ) {
							alt64=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 64, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case RULE_REF:
						{
						int LA64_11 = input.LA(4);
						if ( (LA64_11==76) ) {
							alt64=1;
						}
						else if ( (LA64_11==ACTION||LA64_11==CHAR_LITERAL||LA64_11==RULE_REF||LA64_11==STRING_LITERAL||(LA64_11 >= TOKEN_REF && LA64_11 <= TREE_BEGIN)||(LA64_11 >= 65 && LA64_11 <= 69)||LA64_11==78) ) {
							alt64=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 64, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 67:
						{
						alt64=1;
						}
						break;
					case ACTION:
					case CHAR_LITERAL:
					case STRING_LITERAL:
					case TREE_BEGIN:
					case 65:
					case 66:
						{
						alt64=2;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 64, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA64_1==ACTION||LA64_1==ARG_ACTION||LA64_1==CHAR_LITERAL||LA64_1==REWRITE||LA64_1==RULE_REF||LA64_1==STRING_LITERAL||(LA64_1 >= TOKEN_REF && LA64_1 <= TREE_BEGIN)||LA64_1==65||(LA64_1 >= 67 && LA64_1 <= 69)||LA64_1==75||LA64_1==78||LA64_1==91) ) {
					alt64=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RULE_REF:
				{
				int LA64_2 = input.LA(2);
				if ( (LA64_2==66) ) {
					switch ( input.LA(3) ) {
					case TOKEN_REF:
						{
						int LA64_10 = input.LA(4);
						if ( (LA64_10==76) ) {
							alt64=1;
						}
						else if ( (LA64_10==ACTION||LA64_10==ARG_ACTION||LA64_10==CHAR_LITERAL||LA64_10==RULE_REF||LA64_10==STRING_LITERAL||(LA64_10 >= TOKEN_REF && LA64_10 <= TREE_BEGIN)||(LA64_10 >= 65 && LA64_10 <= 69)||LA64_10==78) ) {
							alt64=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 64, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case RULE_REF:
						{
						int LA64_11 = input.LA(4);
						if ( (LA64_11==76) ) {
							alt64=1;
						}
						else if ( (LA64_11==ACTION||LA64_11==CHAR_LITERAL||LA64_11==RULE_REF||LA64_11==STRING_LITERAL||(LA64_11 >= TOKEN_REF && LA64_11 <= TREE_BEGIN)||(LA64_11 >= 65 && LA64_11 <= 69)||LA64_11==78) ) {
							alt64=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 64, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 67:
						{
						alt64=1;
						}
						break;
					case ACTION:
					case CHAR_LITERAL:
					case STRING_LITERAL:
					case TREE_BEGIN:
					case 65:
					case 66:
						{
						alt64=2;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 64, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA64_2==ACTION||LA64_2==CHAR_LITERAL||LA64_2==REWRITE||LA64_2==RULE_REF||LA64_2==STRING_LITERAL||(LA64_2 >= TOKEN_REF && LA64_2 <= TREE_BEGIN)||LA64_2==65||(LA64_2 >= 67 && LA64_2 <= 69)||LA64_2==75||LA64_2==78||LA64_2==91) ) {
					alt64=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 66:
				{
				int LA64_3 = input.LA(2);
				if ( (LA64_3==ACTION) ) {
					int LA64_8 = input.LA(3);
					if ( (LA64_8==67) ) {
						int LA64_12 = input.LA(4);
						if ( (LA64_12==66) ) {
							alt64=1;
						}
						else if ( ((LA64_12 >= 68 && LA64_12 <= 69)||LA64_12==78) ) {
							alt64=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 64, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA64_8==ACTION||LA64_8==CHAR_LITERAL||LA64_8==RULE_REF||LA64_8==STRING_LITERAL||(LA64_8 >= TOKEN_REF && LA64_8 <= TREE_BEGIN)||(LA64_8 >= 65 && LA64_8 <= 66)||(LA64_8 >= 68 && LA64_8 <= 69)||LA64_8==78) ) {
						alt64=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 64, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA64_3==CHAR_LITERAL||LA64_3==RULE_REF||LA64_3==STRING_LITERAL||(LA64_3 >= TOKEN_REF && LA64_3 <= TREE_BEGIN)||(LA64_3 >= 65 && LA64_3 <= 66)) ) {
					alt64=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ACTION:
				{
				int LA64_4 = input.LA(2);
				if ( (synpred1_ANTLRv3()) ) {
					alt64=1;
				}
				else if ( (synpred2_ANTLRv3()) ) {
					alt64=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TREE_BEGIN:
			case 65:
				{
				alt64=2;
				}
				break;
			case REWRITE:
			case 67:
			case 75:
			case 91:
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
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:346:4: rewrite_template
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rewrite_template_in_rewrite_alternative2562);
					rewrite_template128=rewrite_template();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_template128.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:347:4: rewrite_tree_alternative
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_alternative2567);
					rewrite_tree_alternative129=rewrite_tree_alternative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_tree_alternative129.getTree());

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:348:29: 
					{

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
					// 348:29: -> ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:348:32: ^( ALT[\"ALT\"] EPSILON[\"EPSILON\"] EOA[\"EOA\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(EPSILON, "EPSILON"));
						adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_alternative"


	public static class rewrite_tree_block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_tree_block"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:351:1: rewrite_tree_block : lp= '(' rewrite_tree_alternative ')' -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] ) ;
	public final ANTLRv3Parser.rewrite_tree_block_return rewrite_tree_block() throws RecognitionException {
		ANTLRv3Parser.rewrite_tree_block_return retval = new ANTLRv3Parser.rewrite_tree_block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token lp=null;
		Token char_literal131=null;
		ParserRuleReturnScope rewrite_tree_alternative130 =null;

		CommonTree lp_tree=null;
		CommonTree char_literal131_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleSubtreeStream stream_rewrite_tree_alternative=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_alternative");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:352:5: (lp= '(' rewrite_tree_alternative ')' -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:352:9: lp= '(' rewrite_tree_alternative ')'
			{
			lp=(Token)match(input,66,FOLLOW_66_in_rewrite_tree_block2609); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_66.add(lp);

			pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block2611);
			rewrite_tree_alternative130=rewrite_tree_alternative();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rewrite_tree_alternative.add(rewrite_tree_alternative130.getTree());
			char_literal131=(Token)match(input,67,FOLLOW_67_in_rewrite_tree_block2613); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal131);


			// AST REWRITE
			// elements: rewrite_tree_alternative
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 353:6: -> ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:353:9: ^( BLOCK[$lp,\"BLOCK\"] rewrite_tree_alternative EOB[$lp,\"EOB\"] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, lp, "BLOCK"), root_1);
				adaptor.addChild(root_1, stream_rewrite_tree_alternative.nextTree());
				adaptor.addChild(root_1, (CommonTree)adaptor.create(EOB, lp, "EOB"));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_block"


	public static class rewrite_tree_alternative_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_tree_alternative"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:356:1: rewrite_tree_alternative : ( rewrite_tree_element )+ -> ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] ) ;
	public final ANTLRv3Parser.rewrite_tree_alternative_return rewrite_tree_alternative() throws RecognitionException {
		ANTLRv3Parser.rewrite_tree_alternative_return retval = new ANTLRv3Parser.rewrite_tree_alternative_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope rewrite_tree_element132 =null;

		RewriteRuleSubtreeStream stream_rewrite_tree_element=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_element");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:357:5: ( ( rewrite_tree_element )+ -> ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:357:7: ( rewrite_tree_element )+
			{
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:357:7: ( rewrite_tree_element )+
			int cnt65=0;
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==ACTION||LA65_0==CHAR_LITERAL||LA65_0==RULE_REF||LA65_0==STRING_LITERAL||(LA65_0 >= TOKEN_REF && LA65_0 <= TREE_BEGIN)||(LA65_0 >= 65 && LA65_0 <= 66)) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:357:7: rewrite_tree_element
					{
					pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative2647);
					rewrite_tree_element132=rewrite_tree_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewrite_tree_element.add(rewrite_tree_element132.getTree());
					}
					break;

				default :
					if ( cnt65 >= 1 ) break loop65;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(65, input);
					throw eee;
				}
				cnt65++;
			}


			// AST REWRITE
			// elements: rewrite_tree_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 357:29: -> ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:357:32: ^( ALT[\"ALT\"] ( rewrite_tree_element )+ EOA[\"EOA\"] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_1);
				if ( !(stream_rewrite_tree_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_rewrite_tree_element.hasNext() ) {
					adaptor.addChild(root_1, stream_rewrite_tree_element.nextTree());
				}
				stream_rewrite_tree_element.reset();

				adaptor.addChild(root_1, (CommonTree)adaptor.create(EOA, "EOA"));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_alternative"


	public static class rewrite_tree_element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_tree_element"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:360:1: rewrite_tree_element : ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | rewrite_tree ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> rewrite_tree ) | rewrite_tree_ebnf );
	public final ANTLRv3Parser.rewrite_tree_element_return rewrite_tree_element() throws RecognitionException {
		ANTLRv3Parser.rewrite_tree_element_return retval = new ANTLRv3Parser.rewrite_tree_element_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope rewrite_tree_atom133 =null;
		ParserRuleReturnScope rewrite_tree_atom134 =null;
		ParserRuleReturnScope ebnfSuffix135 =null;
		ParserRuleReturnScope rewrite_tree136 =null;
		ParserRuleReturnScope ebnfSuffix137 =null;
		ParserRuleReturnScope rewrite_tree_ebnf138 =null;

		RewriteRuleSubtreeStream stream_rewrite_tree_atom=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_atom");
		RewriteRuleSubtreeStream stream_ebnfSuffix=new RewriteRuleSubtreeStream(adaptor,"rule ebnfSuffix");
		RewriteRuleSubtreeStream stream_rewrite_tree=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:361:2: ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | rewrite_tree ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> rewrite_tree ) | rewrite_tree_ebnf )
			int alt67=4;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
				{
				int LA67_1 = input.LA(2);
				if ( (LA67_1==EOF||LA67_1==ACTION||LA67_1==CHAR_LITERAL||LA67_1==REWRITE||LA67_1==RULE_REF||LA67_1==STRING_LITERAL||(LA67_1 >= TOKEN_REF && LA67_1 <= TREE_BEGIN)||(LA67_1 >= 65 && LA67_1 <= 67)||LA67_1==75||LA67_1==91) ) {
					alt67=1;
				}
				else if ( ((LA67_1 >= 68 && LA67_1 <= 69)||LA67_1==78) ) {
					alt67=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TOKEN_REF:
				{
				switch ( input.LA(2) ) {
				case ARG_ACTION:
					{
					int LA67_11 = input.LA(3);
					if ( (LA67_11==EOF||LA67_11==ACTION||LA67_11==CHAR_LITERAL||LA67_11==REWRITE||LA67_11==RULE_REF||LA67_11==STRING_LITERAL||(LA67_11 >= TOKEN_REF && LA67_11 <= TREE_BEGIN)||(LA67_11 >= 65 && LA67_11 <= 67)||LA67_11==75||LA67_11==91) ) {
						alt67=1;
					}
					else if ( ((LA67_11 >= 68 && LA67_11 <= 69)||LA67_11==78) ) {
						alt67=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 67, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case EOF:
				case ACTION:
				case CHAR_LITERAL:
				case REWRITE:
				case RULE_REF:
				case STRING_LITERAL:
				case TOKEN_REF:
				case TREE_BEGIN:
				case 65:
				case 66:
				case 67:
				case 75:
				case 91:
					{
					alt67=1;
					}
					break;
				case 68:
				case 69:
				case 78:
					{
					alt67=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case RULE_REF:
				{
				int LA67_3 = input.LA(2);
				if ( (LA67_3==EOF||LA67_3==ACTION||LA67_3==CHAR_LITERAL||LA67_3==REWRITE||LA67_3==RULE_REF||LA67_3==STRING_LITERAL||(LA67_3 >= TOKEN_REF && LA67_3 <= TREE_BEGIN)||(LA67_3 >= 65 && LA67_3 <= 67)||LA67_3==75||LA67_3==91) ) {
					alt67=1;
				}
				else if ( ((LA67_3 >= 68 && LA67_3 <= 69)||LA67_3==78) ) {
					alt67=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRING_LITERAL:
				{
				int LA67_4 = input.LA(2);
				if ( (LA67_4==EOF||LA67_4==ACTION||LA67_4==CHAR_LITERAL||LA67_4==REWRITE||LA67_4==RULE_REF||LA67_4==STRING_LITERAL||(LA67_4 >= TOKEN_REF && LA67_4 <= TREE_BEGIN)||(LA67_4 >= 65 && LA67_4 <= 67)||LA67_4==75||LA67_4==91) ) {
					alt67=1;
				}
				else if ( ((LA67_4 >= 68 && LA67_4 <= 69)||LA67_4==78) ) {
					alt67=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 65:
				{
				int LA67_5 = input.LA(2);
				if ( (LA67_5==TOKEN_REF) ) {
					int LA67_12 = input.LA(3);
					if ( (LA67_12==EOF||LA67_12==ACTION||LA67_12==CHAR_LITERAL||LA67_12==REWRITE||LA67_12==RULE_REF||LA67_12==STRING_LITERAL||(LA67_12 >= TOKEN_REF && LA67_12 <= TREE_BEGIN)||(LA67_12 >= 65 && LA67_12 <= 67)||LA67_12==75||LA67_12==91) ) {
						alt67=1;
					}
					else if ( ((LA67_12 >= 68 && LA67_12 <= 69)||LA67_12==78) ) {
						alt67=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 67, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA67_5==RULE_REF) ) {
					int LA67_13 = input.LA(3);
					if ( (LA67_13==EOF||LA67_13==ACTION||LA67_13==CHAR_LITERAL||LA67_13==REWRITE||LA67_13==RULE_REF||LA67_13==STRING_LITERAL||(LA67_13 >= TOKEN_REF && LA67_13 <= TREE_BEGIN)||(LA67_13 >= 65 && LA67_13 <= 67)||LA67_13==75||LA67_13==91) ) {
						alt67=1;
					}
					else if ( ((LA67_13 >= 68 && LA67_13 <= 69)||LA67_13==78) ) {
						alt67=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 67, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ACTION:
				{
				int LA67_6 = input.LA(2);
				if ( (LA67_6==EOF||LA67_6==ACTION||LA67_6==CHAR_LITERAL||LA67_6==REWRITE||LA67_6==RULE_REF||LA67_6==STRING_LITERAL||(LA67_6 >= TOKEN_REF && LA67_6 <= TREE_BEGIN)||(LA67_6 >= 65 && LA67_6 <= 67)||LA67_6==75||LA67_6==91) ) {
					alt67=1;
				}
				else if ( ((LA67_6 >= 68 && LA67_6 <= 69)||LA67_6==78) ) {
					alt67=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case TREE_BEGIN:
				{
				alt67=3;
				}
				break;
			case 66:
				{
				alt67=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:361:4: rewrite_tree_atom
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2675);
					rewrite_tree_atom133=rewrite_tree_atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_tree_atom133.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:362:4: rewrite_tree_atom ebnfSuffix
					{
					pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2680);
					rewrite_tree_atom134=rewrite_tree_atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewrite_tree_atom.add(rewrite_tree_atom134.getTree());
					pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element2682);
					ebnfSuffix135=ebnfSuffix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix135.getTree());

					// AST REWRITE
					// elements: rewrite_tree_atom, ebnfSuffix
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 363:3: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:363:6: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:363:20: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] ) EOB[\"EOB\"] )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:363:37: ^( ALT[\"ALT\"] rewrite_tree_atom EOA[\"EOA\"] )
						{
						CommonTree root_3 = (CommonTree)adaptor.nil();
						root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);
						adaptor.addChild(root_3, stream_rewrite_tree_atom.nextTree());
						adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:364:6: rewrite_tree ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> rewrite_tree )
					{
					pushFollow(FOLLOW_rewrite_tree_in_rewrite_tree_element2716);
					rewrite_tree136=rewrite_tree();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewrite_tree.add(rewrite_tree136.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:365:3: ( ebnfSuffix -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) ) | -> rewrite_tree )
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( ((LA66_0 >= 68 && LA66_0 <= 69)||LA66_0==78) ) {
						alt66=1;
					}
					else if ( (LA66_0==EOF||LA66_0==ACTION||LA66_0==CHAR_LITERAL||LA66_0==REWRITE||LA66_0==RULE_REF||LA66_0==STRING_LITERAL||(LA66_0 >= TOKEN_REF && LA66_0 <= TREE_BEGIN)||(LA66_0 >= 65 && LA66_0 <= 67)||LA66_0==75||LA66_0==91) ) {
						alt66=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 66, 0, input);
						throw nvae;
					}

					switch (alt66) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:365:5: ebnfSuffix
							{
							pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element2722);
							ebnfSuffix137=ebnfSuffix();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix137.getTree());

							// AST REWRITE
							// elements: rewrite_tree, ebnfSuffix
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 366:4: -> ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
							{
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:366:7: ^( ebnfSuffix ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] ) )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:366:20: ^( BLOCK[\"BLOCK\"] ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] ) EOB[\"EOB\"] )
								{
								CommonTree root_2 = (CommonTree)adaptor.nil();
								root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_2);
								// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:366:37: ^( ALT[\"ALT\"] rewrite_tree EOA[\"EOA\"] )
								{
								CommonTree root_3 = (CommonTree)adaptor.nil();
								root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ALT, "ALT"), root_3);
								adaptor.addChild(root_3, stream_rewrite_tree.nextTree());
								adaptor.addChild(root_3, (CommonTree)adaptor.create(EOA, "EOA"));
								adaptor.addChild(root_2, root_3);
								}

								adaptor.addChild(root_2, (CommonTree)adaptor.create(EOB, "EOB"));
								adaptor.addChild(root_1, root_2);
								}

								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:367:5: 
							{

							// AST REWRITE
							// elements: rewrite_tree
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 367:5: -> rewrite_tree
							{
								adaptor.addChild(root_0, stream_rewrite_tree.nextTree());
							}


							retval.tree = root_0;
							}

							}
							break;

					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:369:6: rewrite_tree_ebnf
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element2768);
					rewrite_tree_ebnf138=rewrite_tree_ebnf();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_tree_ebnf138.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_element"


	public static class rewrite_tree_atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_tree_atom"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:372:1: rewrite_tree_atom : ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION )? -> ^( TOKEN_REF ( ARG_ACTION )? ) | RULE_REF | STRING_LITERAL |d= '$' id -> LABEL[$d,$id.text] | ACTION );
	public final ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom() throws RecognitionException {
		ANTLRv3Parser.rewrite_tree_atom_return retval = new ANTLRv3Parser.rewrite_tree_atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token d=null;
		Token CHAR_LITERAL139=null;
		Token TOKEN_REF140=null;
		Token ARG_ACTION141=null;
		Token RULE_REF142=null;
		Token STRING_LITERAL143=null;
		Token ACTION145=null;
		ParserRuleReturnScope id144 =null;

		CommonTree d_tree=null;
		CommonTree CHAR_LITERAL139_tree=null;
		CommonTree TOKEN_REF140_tree=null;
		CommonTree ARG_ACTION141_tree=null;
		CommonTree RULE_REF142_tree=null;
		CommonTree STRING_LITERAL143_tree=null;
		CommonTree ACTION145_tree=null;
		RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");
		RewriteRuleTokenStream stream_ARG_ACTION=new RewriteRuleTokenStream(adaptor,"token ARG_ACTION");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:373:5: ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION )? -> ^( TOKEN_REF ( ARG_ACTION )? ) | RULE_REF | STRING_LITERAL |d= '$' id -> LABEL[$d,$id.text] | ACTION )
			int alt69=6;
			switch ( input.LA(1) ) {
			case CHAR_LITERAL:
				{
				alt69=1;
				}
				break;
			case TOKEN_REF:
				{
				alt69=2;
				}
				break;
			case RULE_REF:
				{
				alt69=3;
				}
				break;
			case STRING_LITERAL:
				{
				alt69=4;
				}
				break;
			case 65:
				{
				alt69=5;
				}
				break;
			case ACTION:
				{
				alt69=6;
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
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:373:9: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL139=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom2784); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHAR_LITERAL139_tree = (CommonTree)adaptor.create(CHAR_LITERAL139);
					adaptor.addChild(root_0, CHAR_LITERAL139_tree);
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:374:6: TOKEN_REF ( ARG_ACTION )?
					{
					TOKEN_REF140=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_rewrite_tree_atom2791); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TOKEN_REF.add(TOKEN_REF140);

					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:374:16: ( ARG_ACTION )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==ARG_ACTION) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:374:16: ARG_ACTION
							{
							ARG_ACTION141=(Token)match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rewrite_tree_atom2793); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ARG_ACTION.add(ARG_ACTION141);

							}
							break;

					}


					// AST REWRITE
					// elements: ARG_ACTION, TOKEN_REF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 374:28: -> ^( TOKEN_REF ( ARG_ACTION )? )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:374:31: ^( TOKEN_REF ( ARG_ACTION )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_TOKEN_REF.nextNode(), root_1);
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:374:43: ( ARG_ACTION )?
						if ( stream_ARG_ACTION.hasNext() ) {
							adaptor.addChild(root_1, stream_ARG_ACTION.nextNode());
						}
						stream_ARG_ACTION.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:375:9: RULE_REF
					{
					root_0 = (CommonTree)adaptor.nil();


					RULE_REF142=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_rewrite_tree_atom2814); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RULE_REF142_tree = (CommonTree)adaptor.create(RULE_REF142);
					adaptor.addChild(root_0, RULE_REF142_tree);
					}

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:376:6: STRING_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING_LITERAL143=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_rewrite_tree_atom2821); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING_LITERAL143_tree = (CommonTree)adaptor.create(STRING_LITERAL143);
					adaptor.addChild(root_0, STRING_LITERAL143_tree);
					}

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:377:6: d= '$' id
					{
					d=(Token)match(input,65,FOLLOW_65_in_rewrite_tree_atom2830); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_65.add(d);

					pushFollow(FOLLOW_id_in_rewrite_tree_atom2832);
					id144=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id144.getTree());

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
					// 377:15: -> LABEL[$d,$id.text]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(LABEL, d, (id144!=null?input.toString(id144.start,id144.stop):null)));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:378:4: ACTION
					{
					root_0 = (CommonTree)adaptor.nil();


					ACTION145=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_tree_atom2843); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ACTION145_tree = (CommonTree)adaptor.create(ACTION145);
					adaptor.addChild(root_0, ACTION145_tree);
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_atom"


	public static class rewrite_tree_ebnf_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_tree_ebnf"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:381:1: rewrite_tree_ebnf : rewrite_tree_block ebnfSuffix -> ^( ebnfSuffix rewrite_tree_block ) ;
	public final ANTLRv3Parser.rewrite_tree_ebnf_return rewrite_tree_ebnf() throws RecognitionException {
		ANTLRv3Parser.rewrite_tree_ebnf_return retval = new ANTLRv3Parser.rewrite_tree_ebnf_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope rewrite_tree_block146 =null;
		ParserRuleReturnScope ebnfSuffix147 =null;

		RewriteRuleSubtreeStream stream_rewrite_tree_block=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_block");
		RewriteRuleSubtreeStream stream_ebnfSuffix=new RewriteRuleSubtreeStream(adaptor,"rule ebnfSuffix");


		    Token firstToken = input.LT(1);

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:389:2: ( rewrite_tree_block ebnfSuffix -> ^( ebnfSuffix rewrite_tree_block ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:389:4: rewrite_tree_block ebnfSuffix
			{
			pushFollow(FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf2864);
			rewrite_tree_block146=rewrite_tree_block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rewrite_tree_block.add(rewrite_tree_block146.getTree());
			pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf2866);
			ebnfSuffix147=ebnfSuffix();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ebnfSuffix.add(ebnfSuffix147.getTree());

			// AST REWRITE
			// elements: rewrite_tree_block, ebnfSuffix
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 389:34: -> ^( ebnfSuffix rewrite_tree_block )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:389:37: ^( ebnfSuffix rewrite_tree_block )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_ebnfSuffix.nextNode(), root_1);
				adaptor.addChild(root_1, stream_rewrite_tree_block.nextTree());
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
			if ( state.backtracking==0 ) {
				retval.tree.getToken().setLine(firstToken.getLine());
				retval.tree.getToken().setCharPositionInLine(firstToken.getCharPositionInLine());
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree_ebnf"


	public static class rewrite_tree_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_tree"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:392:1: rewrite_tree : '^(' rewrite_tree_atom ( rewrite_tree_element )* ')' -> ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* ) ;
	public final ANTLRv3Parser.rewrite_tree_return rewrite_tree() throws RecognitionException {
		ANTLRv3Parser.rewrite_tree_return retval = new ANTLRv3Parser.rewrite_tree_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal148=null;
		Token char_literal151=null;
		ParserRuleReturnScope rewrite_tree_atom149 =null;
		ParserRuleReturnScope rewrite_tree_element150 =null;

		CommonTree string_literal148_tree=null;
		CommonTree char_literal151_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_TREE_BEGIN=new RewriteRuleTokenStream(adaptor,"token TREE_BEGIN");
		RewriteRuleSubtreeStream stream_rewrite_tree_atom=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_atom");
		RewriteRuleSubtreeStream stream_rewrite_tree_element=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_tree_element");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:393:2: ( '^(' rewrite_tree_atom ( rewrite_tree_element )* ')' -> ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:393:4: '^(' rewrite_tree_atom ( rewrite_tree_element )* ')'
			{
			string_literal148=(Token)match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_rewrite_tree2886); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_TREE_BEGIN.add(string_literal148);

			pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree2888);
			rewrite_tree_atom149=rewrite_tree_atom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rewrite_tree_atom.add(rewrite_tree_atom149.getTree());
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:393:27: ( rewrite_tree_element )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==ACTION||LA70_0==CHAR_LITERAL||LA70_0==RULE_REF||LA70_0==STRING_LITERAL||(LA70_0 >= TOKEN_REF && LA70_0 <= TREE_BEGIN)||(LA70_0 >= 65 && LA70_0 <= 66)) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:393:27: rewrite_tree_element
					{
					pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree2890);
					rewrite_tree_element150=rewrite_tree_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewrite_tree_element.add(rewrite_tree_element150.getTree());
					}
					break;

				default :
					break loop70;
				}
			}

			char_literal151=(Token)match(input,67,FOLLOW_67_in_rewrite_tree2893); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal151);


			// AST REWRITE
			// elements: rewrite_tree_atom, rewrite_tree_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 394:3: -> ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:394:6: ^( TREE_BEGIN rewrite_tree_atom ( rewrite_tree_element )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TREE_BEGIN, "TREE_BEGIN"), root_1);
				adaptor.addChild(root_1, stream_rewrite_tree_atom.nextTree());
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:394:37: ( rewrite_tree_element )*
				while ( stream_rewrite_tree_element.hasNext() ) {
					adaptor.addChild(root_1, stream_rewrite_tree_element.nextTree());
				}
				stream_rewrite_tree_element.reset();

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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_tree"


	public static class rewrite_template_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_template"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:408:1: rewrite_template : ( id lp= '(' rewrite_template_args ')' (str= DOUBLE_QUOTE_STRING_LITERAL |str= DOUBLE_ANGLE_STRING_LITERAL ) -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );
	public final ANTLRv3Parser.rewrite_template_return rewrite_template() throws RecognitionException {
		ANTLRv3Parser.rewrite_template_return retval = new ANTLRv3Parser.rewrite_template_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token lp=null;
		Token str=null;
		Token char_literal154=null;
		Token ACTION157=null;
		ParserRuleReturnScope id152 =null;
		ParserRuleReturnScope rewrite_template_args153 =null;
		ParserRuleReturnScope rewrite_template_ref155 =null;
		ParserRuleReturnScope rewrite_indirect_template_head156 =null;

		CommonTree lp_tree=null;
		CommonTree str_tree=null;
		CommonTree char_literal154_tree=null;
		CommonTree ACTION157_tree=null;
		RewriteRuleTokenStream stream_DOUBLE_QUOTE_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token DOUBLE_QUOTE_STRING_LITERAL");
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_DOUBLE_ANGLE_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token DOUBLE_ANGLE_STRING_LITERAL");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
		RewriteRuleSubtreeStream stream_rewrite_template_args=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_args");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:409:2: ( id lp= '(' rewrite_template_args ')' (str= DOUBLE_QUOTE_STRING_LITERAL |str= DOUBLE_ANGLE_STRING_LITERAL ) -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str) | rewrite_template_ref | rewrite_indirect_template_head | ACTION )
			int alt72=4;
			alt72 = dfa72.predict(input);
			switch (alt72) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:410:3: id lp= '(' rewrite_template_args ')' (str= DOUBLE_QUOTE_STRING_LITERAL |str= DOUBLE_ANGLE_STRING_LITERAL )
					{
					pushFollow(FOLLOW_id_in_rewrite_template2925);
					id152=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_id.add(id152.getTree());
					lp=(Token)match(input,66,FOLLOW_66_in_rewrite_template2929); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_66.add(lp);

					pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template2931);
					rewrite_template_args153=rewrite_template_args();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewrite_template_args.add(rewrite_template_args153.getTree());
					char_literal154=(Token)match(input,67,FOLLOW_67_in_rewrite_template2933); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_67.add(char_literal154);

					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:411:3: (str= DOUBLE_QUOTE_STRING_LITERAL |str= DOUBLE_ANGLE_STRING_LITERAL )
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==DOUBLE_QUOTE_STRING_LITERAL) ) {
						alt71=1;
					}
					else if ( (LA71_0==DOUBLE_ANGLE_STRING_LITERAL) ) {
						alt71=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 71, 0, input);
						throw nvae;
					}

					switch (alt71) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:411:5: str= DOUBLE_QUOTE_STRING_LITERAL
							{
							str=(Token)match(input,DOUBLE_QUOTE_STRING_LITERAL,FOLLOW_DOUBLE_QUOTE_STRING_LITERAL_in_rewrite_template2941); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOUBLE_QUOTE_STRING_LITERAL.add(str);

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:411:39: str= DOUBLE_ANGLE_STRING_LITERAL
							{
							str=(Token)match(input,DOUBLE_ANGLE_STRING_LITERAL,FOLLOW_DOUBLE_ANGLE_STRING_LITERAL_in_rewrite_template2947); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOUBLE_ANGLE_STRING_LITERAL.add(str);

							}
							break;

					}


					// AST REWRITE
					// elements: rewrite_template_args, str, id
					// token labels: str
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_str=new RewriteRuleTokenStream(adaptor,"token str",str);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 412:3: -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str)
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:412:6: ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, lp, "TEMPLATE"), root_1);
						adaptor.addChild(root_1, stream_id.nextTree());
						adaptor.addChild(root_1, stream_rewrite_template_args.nextTree());
						adaptor.addChild(root_1, stream_str.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:415:3: rewrite_template_ref
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rewrite_template_ref_in_rewrite_template2974);
					rewrite_template_ref155=rewrite_template_ref();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_template_ref155.getTree());

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:418:3: rewrite_indirect_template_head
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_rewrite_indirect_template_head_in_rewrite_template2983);
					rewrite_indirect_template_head156=rewrite_indirect_template_head();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rewrite_indirect_template_head156.getTree());

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:421:3: ACTION
					{
					root_0 = (CommonTree)adaptor.nil();


					ACTION157=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_template2992); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ACTION157_tree = (CommonTree)adaptor.create(ACTION157);
					adaptor.addChild(root_0, ACTION157_tree);
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_template"


	public static class rewrite_template_ref_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_template_ref"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:425:1: rewrite_template_ref : id lp= '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args ) ;
	public final ANTLRv3Parser.rewrite_template_ref_return rewrite_template_ref() throws RecognitionException {
		ANTLRv3Parser.rewrite_template_ref_return retval = new ANTLRv3Parser.rewrite_template_ref_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token lp=null;
		Token char_literal160=null;
		ParserRuleReturnScope id158 =null;
		ParserRuleReturnScope rewrite_template_args159 =null;

		CommonTree lp_tree=null;
		CommonTree char_literal160_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
		RewriteRuleSubtreeStream stream_rewrite_template_args=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_args");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:426:2: ( id lp= '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:426:4: id lp= '(' rewrite_template_args ')'
			{
			pushFollow(FOLLOW_id_in_rewrite_template_ref3005);
			id158=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id158.getTree());
			lp=(Token)match(input,66,FOLLOW_66_in_rewrite_template_ref3009); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_66.add(lp);

			pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template_ref3011);
			rewrite_template_args159=rewrite_template_args();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rewrite_template_args.add(rewrite_template_args159.getTree());
			char_literal160=(Token)match(input,67,FOLLOW_67_in_rewrite_template_ref3013); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal160);


			// AST REWRITE
			// elements: id, rewrite_template_args
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 427:3: -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:427:6: ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, lp, "TEMPLATE"), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_1, stream_rewrite_template_args.nextTree());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_template_ref"


	public static class rewrite_indirect_template_head_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_indirect_template_head"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:431:1: rewrite_indirect_template_head : lp= '(' ACTION ')' '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args ) ;
	public final ANTLRv3Parser.rewrite_indirect_template_head_return rewrite_indirect_template_head() throws RecognitionException {
		ANTLRv3Parser.rewrite_indirect_template_head_return retval = new ANTLRv3Parser.rewrite_indirect_template_head_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token lp=null;
		Token ACTION161=null;
		Token char_literal162=null;
		Token char_literal163=null;
		Token char_literal165=null;
		ParserRuleReturnScope rewrite_template_args164 =null;

		CommonTree lp_tree=null;
		CommonTree ACTION161_tree=null;
		CommonTree char_literal162_tree=null;
		CommonTree char_literal163_tree=null;
		CommonTree char_literal165_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
		RewriteRuleSubtreeStream stream_rewrite_template_args=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_args");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:432:2: (lp= '(' ACTION ')' '(' rewrite_template_args ')' -> ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:432:4: lp= '(' ACTION ')' '(' rewrite_template_args ')'
			{
			lp=(Token)match(input,66,FOLLOW_66_in_rewrite_indirect_template_head3041); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_66.add(lp);

			ACTION161=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_indirect_template_head3043); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ACTION.add(ACTION161);

			char_literal162=(Token)match(input,67,FOLLOW_67_in_rewrite_indirect_template_head3045); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal162);

			char_literal163=(Token)match(input,66,FOLLOW_66_in_rewrite_indirect_template_head3047); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_66.add(char_literal163);

			pushFollow(FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head3049);
			rewrite_template_args164=rewrite_template_args();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rewrite_template_args.add(rewrite_template_args164.getTree());
			char_literal165=(Token)match(input,67,FOLLOW_67_in_rewrite_indirect_template_head3051); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(char_literal165);


			// AST REWRITE
			// elements: rewrite_template_args, ACTION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 433:3: -> ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:433:6: ^( TEMPLATE[$lp,\"TEMPLATE\"] ACTION rewrite_template_args )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TEMPLATE, lp, "TEMPLATE"), root_1);
				adaptor.addChild(root_1, stream_ACTION.nextNode());
				adaptor.addChild(root_1, stream_rewrite_template_args.nextTree());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_indirect_template_head"


	public static class rewrite_template_args_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_template_args"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:436:1: rewrite_template_args : ( rewrite_template_arg ( ',' rewrite_template_arg )* -> ^( ARGLIST ( rewrite_template_arg )+ ) | -> ARGLIST );
	public final ANTLRv3Parser.rewrite_template_args_return rewrite_template_args() throws RecognitionException {
		ANTLRv3Parser.rewrite_template_args_return retval = new ANTLRv3Parser.rewrite_template_args_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal167=null;
		ParserRuleReturnScope rewrite_template_arg166 =null;
		ParserRuleReturnScope rewrite_template_arg168 =null;

		CommonTree char_literal167_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleSubtreeStream stream_rewrite_template_arg=new RewriteRuleSubtreeStream(adaptor,"rule rewrite_template_arg");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:437:2: ( rewrite_template_arg ( ',' rewrite_template_arg )* -> ^( ARGLIST ( rewrite_template_arg )+ ) | -> ARGLIST )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==RULE_REF||LA74_0==TOKEN_REF) ) {
				alt74=1;
			}
			else if ( (LA74_0==67) ) {
				alt74=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:437:4: rewrite_template_arg ( ',' rewrite_template_arg )*
					{
					pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args3075);
					rewrite_template_arg166=rewrite_template_arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_rewrite_template_arg.add(rewrite_template_arg166.getTree());
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:437:25: ( ',' rewrite_template_arg )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==71) ) {
							alt73=1;
						}

						switch (alt73) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:437:26: ',' rewrite_template_arg
							{
							char_literal167=(Token)match(input,71,FOLLOW_71_in_rewrite_template_args3078); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_71.add(char_literal167);

							pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args3080);
							rewrite_template_arg168=rewrite_template_arg();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_rewrite_template_arg.add(rewrite_template_arg168.getTree());
							}
							break;

						default :
							break loop73;
						}
					}


					// AST REWRITE
					// elements: rewrite_template_arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 438:3: -> ^( ARGLIST ( rewrite_template_arg )+ )
					{
						// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:438:6: ^( ARGLIST ( rewrite_template_arg )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGLIST, "ARGLIST"), root_1);
						if ( !(stream_rewrite_template_arg.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_rewrite_template_arg.hasNext() ) {
							adaptor.addChild(root_1, stream_rewrite_template_arg.nextTree());
						}
						stream_rewrite_template_arg.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:439:4: 
					{

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
					// 439:4: -> ARGLIST
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(ARGLIST, "ARGLIST"));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_template_args"


	public static class rewrite_template_arg_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rewrite_template_arg"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:442:1: rewrite_template_arg : id '=' ACTION -> ^( ARG[$id.start] id ACTION ) ;
	public final ANTLRv3Parser.rewrite_template_arg_return rewrite_template_arg() throws RecognitionException {
		ANTLRv3Parser.rewrite_template_arg_return retval = new ANTLRv3Parser.rewrite_template_arg_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal170=null;
		Token ACTION171=null;
		ParserRuleReturnScope id169 =null;

		CommonTree char_literal170_tree=null;
		CommonTree ACTION171_tree=null;
		RewriteRuleTokenStream stream_ACTION=new RewriteRuleTokenStream(adaptor,"token ACTION");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:443:2: ( id '=' ACTION -> ^( ARG[$id.start] id ACTION ) )
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:443:6: id '=' ACTION
			{
			pushFollow(FOLLOW_id_in_rewrite_template_arg3113);
			id169=id();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_id.add(id169.getTree());
			char_literal170=(Token)match(input,76,FOLLOW_76_in_rewrite_template_arg3115); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_76.add(char_literal170);

			ACTION171=(Token)match(input,ACTION,FOLLOW_ACTION_in_rewrite_template_arg3117); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ACTION.add(ACTION171);


			// AST REWRITE
			// elements: id, ACTION
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 443:20: -> ^( ARG[$id.start] id ACTION )
			{
				// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:443:23: ^( ARG[$id.start] id ACTION )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG, (id169!=null?(id169.start):null)), root_1);
				adaptor.addChild(root_1, stream_id.nextTree());
				adaptor.addChild(root_1, stream_ACTION.nextNode());
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rewrite_template_arg"


	public static class id_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "id"
	// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:446:1: id : ( TOKEN_REF -> ID[$TOKEN_REF] | RULE_REF -> ID[$RULE_REF] );
	public final ANTLRv3Parser.id_return id() throws RecognitionException {
		ANTLRv3Parser.id_return retval = new ANTLRv3Parser.id_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TOKEN_REF172=null;
		Token RULE_REF173=null;

		CommonTree TOKEN_REF172_tree=null;
		CommonTree RULE_REF173_tree=null;
		RewriteRuleTokenStream stream_TOKEN_REF=new RewriteRuleTokenStream(adaptor,"token TOKEN_REF");
		RewriteRuleTokenStream stream_RULE_REF=new RewriteRuleTokenStream(adaptor,"token RULE_REF");

		try {
			// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:446:4: ( TOKEN_REF -> ID[$TOKEN_REF] | RULE_REF -> ID[$RULE_REF] )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==TOKEN_REF) ) {
				alt75=1;
			}
			else if ( (LA75_0==RULE_REF) ) {
				alt75=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:446:6: TOKEN_REF
					{
					TOKEN_REF172=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_id3138); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TOKEN_REF.add(TOKEN_REF172);


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
					// 446:16: -> ID[$TOKEN_REF]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, TOKEN_REF172));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:447:4: RULE_REF
					{
					RULE_REF173=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_id3148); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RULE_REF.add(RULE_REF173);


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
					// 447:14: -> ID[$RULE_REF]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(ID, RULE_REF173));
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
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id"

	// $ANTLR start synpred1_ANTLRv3
	public final void synpred1_ANTLRv3_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:346:4: ( rewrite_template )
		// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:346:4: rewrite_template
		{
		pushFollow(FOLLOW_rewrite_template_in_synpred1_ANTLRv32562);
		rewrite_template();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_ANTLRv3

	// $ANTLR start synpred2_ANTLRv3
	public final void synpred2_ANTLRv3_fragment() throws RecognitionException {
		// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:347:4: ( rewrite_tree_alternative )
		// com/github/gumtreediff/gen/antlr3/antlr/ANTLRv3.g:347:4: rewrite_tree_alternative
		{
		pushFollow(FOLLOW_rewrite_tree_alternative_in_synpred2_ANTLRv32567);
		rewrite_tree_alternative();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_ANTLRv3

	// Delegated rules

	public final boolean synpred2_ANTLRv3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_ANTLRv3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_ANTLRv3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_ANTLRv3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA72 dfa72 = new DFA72(this);
	static final String DFA72_eotS =
		"\22\uffff";
	static final String DFA72_eofS =
		"\10\uffff\1\13\11\uffff";
	static final String DFA72_minS =
		"\1\4\2\102\2\uffff\1\61\2\114\1\24\1\4\2\uffff\1\103\1\61\2\114\1\4\1"+
		"\103";
	static final String DFA72_maxS =
		"\3\102\2\uffff\1\103\2\114\1\133\1\4\2\uffff\1\107\1\73\2\114\1\4\1\107";
	static final String DFA72_acceptS =
		"\3\uffff\1\3\1\4\5\uffff\1\1\1\2\6\uffff";
	static final String DFA72_specialS =
		"\22\uffff}>";
	static final String[] DFA72_transitionS = {
			"\1\4\54\uffff\1\2\11\uffff\1\1\6\uffff\1\3",
			"\1\5",
			"\1\5",
			"",
			"",
			"\1\7\11\uffff\1\6\7\uffff\1\10",
			"\1\11",
			"\1\11",
			"\2\12\30\uffff\1\13\24\uffff\1\13\7\uffff\1\13\17\uffff\1\13",
			"\1\14",
			"",
			"",
			"\1\10\3\uffff\1\15",
			"\1\17\11\uffff\1\16",
			"\1\20",
			"\1\20",
			"\1\21",
			"\1\10\3\uffff\1\15"
	};

	static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
	static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
	static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
	static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
	static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
	static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
	static final short[][] DFA72_transition;

	static {
		int numStates = DFA72_transitionS.length;
		DFA72_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
		}
	}

	protected class DFA72 extends DFA {

		public DFA72(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 72;
			this.eot = DFA72_eot;
			this.eof = DFA72_eof;
			this.min = DFA72_min;
			this.max = DFA72_max;
			this.accept = DFA72_accept;
			this.special = DFA72_special;
			this.transition = DFA72_transition;
		}
		@Override
		public String getDescription() {
			return "408:1: rewrite_template : ( id lp= '(' rewrite_template_args ')' (str= DOUBLE_QUOTE_STRING_LITERAL |str= DOUBLE_ANGLE_STRING_LITERAL ) -> ^( TEMPLATE[$lp,\"TEMPLATE\"] id rewrite_template_args $str) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );";
		}
	}

	public static final BitSet FOLLOW_DOC_COMMENT_in_grammarDef343 = new BitSet(new long[]{0x0000000000000000L,0x00000000041C0000L});
	public static final BitSet FOLLOW_83_in_grammarDef353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_84_in_grammarDef371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_90_in_grammarDef387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_82_in_grammarDef428 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_grammarDef430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_grammarDef432 = new BitSet(new long[]{0x0C06010008080000L,0x0000000000E08000L});
	public static final BitSet FOLLOW_optionsSpec_in_grammarDef434 = new BitSet(new long[]{0x0C06000008080000L,0x0000000000E08000L});
	public static final BitSet FOLLOW_tokensSpec_in_grammarDef437 = new BitSet(new long[]{0x0806000008080000L,0x0000000000E08000L});
	public static final BitSet FOLLOW_attrScope_in_grammarDef440 = new BitSet(new long[]{0x0806000008080000L,0x0000000000E08000L});
	public static final BitSet FOLLOW_action_in_grammarDef443 = new BitSet(new long[]{0x0802000008080000L,0x0000000000E08000L});
	public static final BitSet FOLLOW_rule_in_grammarDef451 = new BitSet(new long[]{0x0802000008080000L,0x0000000000E00000L});
	public static final BitSet FOLLOW_EOF_in_grammarDef459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKENS_in_tokensSpec520 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_tokenSpec_in_tokensSpec522 = new BitSet(new long[]{0x0800000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_tokensSpec525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_REF_in_tokenSpec545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
	public static final BitSet FOLLOW_76_in_tokenSpec551 = new BitSet(new long[]{0x0040000000008000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_tokenSpec556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_tokenSpec560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_tokenSpec599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCOPE_in_attrScope610 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_attrScope612 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTION_in_attrScope614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_action637 = new BitSet(new long[]{0x0802000000000000L,0x0000000000180000L});
	public static final BitSet FOLLOW_actionScopeName_in_action640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_action642 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_action646 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTION_in_action648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_actionScopeName674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_actionScopeName681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_actionScopeName698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPTIONS_in_optionsSpec714 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_option_in_optionsSpec717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_optionsSpec719 = new BitSet(new long[]{0x0802000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_optionsSpec723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_option748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_option750 = new BitSet(new long[]{0x0842000080008000L,0x0000000000000010L});
	public static final BitSet FOLLOW_optionValue_in_option752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_optionValue781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_optionValue791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_optionValue801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_optionValue811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_optionValue821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOC_COMMENT_in_rule846 = new BitSet(new long[]{0x0802000008000000L,0x0000000000E00000L});
	public static final BitSet FOLLOW_86_in_rule856 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_87_in_rule858 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_85_in_rule860 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_FRAGMENT_in_rule862 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_rule870 = new BitSet(new long[]{0x0004010000002800L,0x0000000003008200L});
	public static final BitSet FOLLOW_BANG_in_rule876 = new BitSet(new long[]{0x0004010000000800L,0x0000000003008200L});
	public static final BitSet FOLLOW_ARG_ACTION_in_rule885 = new BitSet(new long[]{0x0004010000000000L,0x0000000003008200L});
	public static final BitSet FOLLOW_88_in_rule894 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ARG_ACTION_in_rule898 = new BitSet(new long[]{0x0004010000000000L,0x0000000002008200L});
	public static final BitSet FOLLOW_throwsSpec_in_rule906 = new BitSet(new long[]{0x0004010000000000L,0x0000000000008200L});
	public static final BitSet FOLLOW_optionsSpec_in_rule909 = new BitSet(new long[]{0x0004000000000000L,0x0000000000008200L});
	public static final BitSet FOLLOW_ruleScopeSpec_in_rule912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008200L});
	public static final BitSet FOLLOW_ruleAction_in_rule915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008200L});
	public static final BitSet FOLLOW_73_in_rule920 = new BitSet(new long[]{0x184A400000008010L,0x0000000028000104L});
	public static final BitSet FOLLOW_altList_in_rule922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_rule924 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
	public static final BitSet FOLLOW_exceptionGroup_in_rule928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_ruleAction1030 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_ruleAction1032 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTION_in_ruleAction1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_throwsSpec1055 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_throwsSpec1057 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_throwsSpec1061 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_throwsSpec1063 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1086 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1101 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_ruleScopeSpec1103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000880L});
	public static final BitSet FOLLOW_71_in_ruleScopeSpec1106 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_ruleScopeSpec1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000880L});
	public static final BitSet FOLLOW_75_in_ruleScopeSpec1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1126 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec1128 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec1132 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_ruleScopeSpec1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000880L});
	public static final BitSet FOLLOW_71_in_ruleScopeSpec1137 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_ruleScopeSpec1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000880L});
	public static final BitSet FOLLOW_75_in_ruleScopeSpec1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_block1175 = new BitSet(new long[]{0x184A410000008010L,0x000000002800030CL});
	public static final BitSet FOLLOW_optionsSpec_in_block1184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_block1188 = new BitSet(new long[]{0x184A400000008010L,0x000000002800010CL});
	public static final BitSet FOLLOW_alternative_in_block1197 = new BitSet(new long[]{0x0000400000000000L,0x0000000008000008L});
	public static final BitSet FOLLOW_rewrite_in_block1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000008L});
	public static final BitSet FOLLOW_91_in_block1203 = new BitSet(new long[]{0x184A400000008010L,0x000000002800010CL});
	public static final BitSet FOLLOW_alternative_in_block1207 = new BitSet(new long[]{0x0000400000000000L,0x0000000008000008L});
	public static final BitSet FOLLOW_rewrite_in_block1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000008L});
	public static final BitSet FOLLOW_67_in_block1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_altList1281 = new BitSet(new long[]{0x0000400000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_rewrite_in_altList1283 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_altList1287 = new BitSet(new long[]{0x184A400000008010L,0x0000000028000104L});
	public static final BitSet FOLLOW_alternative_in_altList1291 = new BitSet(new long[]{0x0000400000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_rewrite_in_altList1293 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_element_in_alternative1341 = new BitSet(new long[]{0x184A000000008012L,0x0000000020000104L});
	public static final BitSet FOLLOW_exceptionHandler_in_exceptionGroup1392 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
	public static final BitSet FOLLOW_finallyClause_in_exceptionGroup1399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finallyClause_in_exceptionGroup1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_exceptionHandler1427 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ARG_ACTION_in_exceptionHandler1429 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTION_in_exceptionHandler1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_finallyClause1461 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTION_in_finallyClause1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_elementNoOptionSpec_in_element1485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_elementNoOptionSpec1496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_76_in_elementNoOptionSpec1501 = new BitSet(new long[]{0x0842000000008000L,0x0000000020000100L});
	public static final BitSet FOLLOW_70_in_elementNoOptionSpec1505 = new BitSet(new long[]{0x0842000000008000L,0x0000000020000100L});
	public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1508 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004030L});
	public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_elementNoOptionSpec1573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_76_in_elementNoOptionSpec1578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_70_in_elementNoOptionSpec1582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_elementNoOptionSpec1585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004030L});
	public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004030L});
	public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ebnf_in_elementNoOptionSpec1702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_elementNoOptionSpec1709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMPRED_in_elementNoOptionSpec1716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_elementNoOptionSpec1720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_treeSpec_in_elementNoOptionSpec1739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004030L});
	public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_in_atom1797 = new BitSet(new long[]{0x0000800000002002L});
	public static final BitSet FOLLOW_ROOT_in_atom1804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BANG_in_atom1808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_terminal_in_atom1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notSet_in_atom1844 = new BitSet(new long[]{0x0000800000002002L});
	public static final BitSet FOLLOW_ROOT_in_atom1851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BANG_in_atom1855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_REF_in_atom1883 = new BitSet(new long[]{0x0000800000002802L});
	public static final BitSet FOLLOW_ARG_ACTION_in_atom1889 = new BitSet(new long[]{0x0000800000002002L});
	public static final BitSet FOLLOW_ROOT_in_atom1899 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BANG_in_atom1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_notSet1986 = new BitSet(new long[]{0x0840000000008000L,0x0000000000000004L});
	public static final BitSet FOLLOW_notTerminal_in_notSet1992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_notSet2006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TREE_BEGIN_in_treeSpec2030 = new BitSet(new long[]{0x184A000000008010L,0x0000000020000104L});
	public static final BitSet FOLLOW_element_in_treeSpec2032 = new BitSet(new long[]{0x184A000000008010L,0x0000000020000104L});
	public static final BitSet FOLLOW_element_in_treeSpec2036 = new BitSet(new long[]{0x184A000000008010L,0x000000002000010CL});
	public static final BitSet FOLLOW_67_in_treeSpec2041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_ebnf2073 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006030L});
	public static final BitSet FOLLOW_78_in_ebnf2081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ebnf2098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_ebnf2115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_ebnf2132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_range2215 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_RANGE_in_range2217 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_range2221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_terminal2252 = new BitSet(new long[]{0x0000800000002002L});
	public static final BitSet FOLLOW_TOKEN_REF_in_terminal2274 = new BitSet(new long[]{0x0000800000002802L});
	public static final BitSet FOLLOW_ARG_ACTION_in_terminal2281 = new BitSet(new long[]{0x0000800000002002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_terminal2320 = new BitSet(new long[]{0x0000800000002002L});
	public static final BitSet FOLLOW_72_in_terminal2335 = new BitSet(new long[]{0x0000800000002002L});
	public static final BitSet FOLLOW_ROOT_in_terminal2356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BANG_in_terminal2377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_ebnfSuffix2437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_ebnfSuffix2449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_ebnfSuffix2462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REWRITE_in_rewrite2491 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_SEMPRED_in_rewrite2495 = new BitSet(new long[]{0x1842400000008010L,0x0000000000000006L});
	public static final BitSet FOLLOW_rewrite_alternative_in_rewrite2499 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_REWRITE_in_rewrite2507 = new BitSet(new long[]{0x1842000000008010L,0x0000000000000006L});
	public static final BitSet FOLLOW_rewrite_alternative_in_rewrite2511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_template_in_rewrite_alternative2562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_alternative2567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_rewrite_tree_block2609 = new BitSet(new long[]{0x1842000000008010L,0x0000000000000006L});
	public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block2611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_rewrite_tree_block2613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative2647 = new BitSet(new long[]{0x1842000000008012L,0x0000000000000006L});
	public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element2680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004030L});
	public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element2682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_in_rewrite_tree_element2716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004030L});
	public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element2722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element2768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom2784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_REF_in_rewrite_tree_atom2791 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ARG_ACTION_in_rewrite_tree_atom2793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_REF_in_rewrite_tree_atom2814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_rewrite_tree_atom2821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_rewrite_tree_atom2830 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_id_in_rewrite_tree_atom2832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_rewrite_tree_atom2843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004030L});
	public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf2866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TREE_BEGIN_in_rewrite_tree2886 = new BitSet(new long[]{0x0842000000008010L,0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree2888 = new BitSet(new long[]{0x1842000000008010L,0x000000000000000EL});
	public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree2890 = new BitSet(new long[]{0x1842000000008010L,0x000000000000000EL});
	public static final BitSet FOLLOW_67_in_rewrite_tree2893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_rewrite_template2925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_rewrite_template2929 = new BitSet(new long[]{0x0802000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template2931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_rewrite_template2933 = new BitSet(new long[]{0x0000000000300000L});
	public static final BitSet FOLLOW_DOUBLE_QUOTE_STRING_LITERAL_in_rewrite_template2941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_ANGLE_STRING_LITERAL_in_rewrite_template2947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_template_ref_in_rewrite_template2974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_indirect_template_head_in_rewrite_template2983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_rewrite_template2992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_rewrite_template_ref3005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_rewrite_template_ref3009 = new BitSet(new long[]{0x0802000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template_ref3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_rewrite_template_ref3013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_rewrite_indirect_template_head3041 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTION_in_rewrite_indirect_template_head3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_rewrite_indirect_template_head3045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_rewrite_indirect_template_head3047 = new BitSet(new long[]{0x0802000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head3049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_rewrite_indirect_template_head3051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args3075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_rewrite_template_args3078 = new BitSet(new long[]{0x0802000000000000L});
	public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args3080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_id_in_rewrite_template_arg3113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_rewrite_template_arg3115 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ACTION_in_rewrite_template_arg3117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOKEN_REF_in_id3138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RULE_REF_in_id3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_template_in_synpred1_ANTLRv32562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rewrite_tree_alternative_in_synpred2_ANTLRv32567 = new BitSet(new long[]{0x0000000000000002L});
}
