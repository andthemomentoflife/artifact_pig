// $ANTLR 3.5.3 com/github/gumtreediff/gen/antlr3/json/JSON.g 2025-04-14 15:35:24

package com.github.gumtreediff.gen.antlr3.json;

import java.util.regex.Pattern;
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class JSONParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "COMMA", "Digit", "EscapeSequence", 
		"Exponent", "FALSE", "FIELD", "HexDigit", "NULL", "NUMBER", "Number", 
		"OBJECT", "STRING", "String", "TRUE", "UnicodeEscape", "WS", "':'", "'['", 
		"']'", "'false'", "'null'", "'true'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int ARRAY=4;
	public static final int COMMA=5;
	public static final int Digit=6;
	public static final int EscapeSequence=7;
	public static final int Exponent=8;
	public static final int FALSE=9;
	public static final int FIELD=10;
	public static final int HexDigit=11;
	public static final int NULL=12;
	public static final int NUMBER=13;
	public static final int Number=14;
	public static final int OBJECT=15;
	public static final int STRING=16;
	public static final int String=17;
	public static final int TRUE=18;
	public static final int UnicodeEscape=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JSONParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JSONParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JSONParser.tokenNames; }
	@Override public String getGrammarFileName() { return "com/github/gumtreediff/gen/antlr3/json/JSON.g"; }

	 
	protected void mismatch(IntStream input, int ttype, BitSet follow) 
	throws RecognitionException 
	{ 
	throw new MismatchedTokenException(ttype, input); 
	} 
	public Object recoverFromMismatchedSet(IntStream input, 
	RecognitionException e, 
	BitSet follow) 
	throws RecognitionException 
	{ 
	throw e; 
	} 


	public static class value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value"
	// com/github/gumtreediff/gen/antlr3/json/JSON.g:49:1: value : ( string | number | object | array | 'true' -> TRUE | 'false' -> FALSE | 'null' -> NULL );
	public final JSONParser.value_return value() throws RecognitionException {
		JSONParser.value_return retval = new JSONParser.value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal5=null;
		Token string_literal6=null;
		Token string_literal7=null;
		ParserRuleReturnScope string1 =null;
		ParserRuleReturnScope number2 =null;
		ParserRuleReturnScope object3 =null;
		ParserRuleReturnScope array4 =null;

		Object string_literal5_tree=null;
		Object string_literal6_tree=null;
		Object string_literal7_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");

		try {
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:50:2: ( string | number | object | array | 'true' -> TRUE | 'false' -> FALSE | 'null' -> NULL )
			int alt1=7;
			switch ( input.LA(1) ) {
			case String:
				{
				alt1=1;
				}
				break;
			case Number:
				{
				alt1=2;
				}
				break;
			case 27:
				{
				alt1=3;
				}
				break;
			case 22:
				{
				alt1=4;
				}
				break;
			case 26:
				{
				alt1=5;
				}
				break;
			case 24:
				{
				alt1=6;
				}
				break;
			case 25:
				{
				alt1=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:50:4: string
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_string_in_value96);
					string1=string();
					state._fsp--;

					adaptor.addChild(root_0, string1.getTree());

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:51:4: number
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_number_in_value101);
					number2=number();
					state._fsp--;

					adaptor.addChild(root_0, number2.getTree());

					}
					break;
				case 3 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:52:4: object
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_object_in_value106);
					object3=object();
					state._fsp--;

					adaptor.addChild(root_0, object3.getTree());

					}
					break;
				case 4 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:53:4: array
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_array_in_value111);
					array4=array();
					state._fsp--;

					adaptor.addChild(root_0, array4.getTree());

					}
					break;
				case 5 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:54:4: 'true'
					{
					string_literal5=(Token)match(input,26,FOLLOW_26_in_value116);  
					stream_26.add(string_literal5);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 54:11: -> TRUE
					{
						adaptor.addChild(root_0, (Object)adaptor.create(TRUE, "TRUE"));
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:55:4: 'false'
					{
					string_literal6=(Token)match(input,24,FOLLOW_24_in_value125);  
					stream_24.add(string_literal6);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 55:12: -> FALSE
					{
						adaptor.addChild(root_0, (Object)adaptor.create(FALSE, "FALSE"));
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:56:4: 'null'
					{
					string_literal7=(Token)match(input,25,FOLLOW_25_in_value134);  
					stream_25.add(string_literal7);


					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 56:11: -> NULL
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NULL, "NULL"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		catch (RecognitionException e) { 
		throw e; 
		} 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class string_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string"
	// com/github/gumtreediff/gen/antlr3/json/JSON.g:59:1: string : String -> ^( STRING String ) ;
	public final JSONParser.string_return string() throws RecognitionException {
		JSONParser.string_return retval = new JSONParser.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token String8=null;

		Object String8_tree=null;
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");

		try {
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:59:9: ( String -> ^( STRING String ) )
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:59:11: String
			{
			String8=(Token)match(input,String,FOLLOW_String_in_string149);  
			stream_String.add(String8);


			// AST REWRITE
			// elements: String
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 60:4: -> ^( STRING String )
			{
				// com/github/gumtreediff/gen/antlr3/json/JSON.g:60:7: ^( STRING String )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRING, "STRING"), root_1);
				adaptor.addChild(root_1, stream_String.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		catch (RecognitionException e) { 
		throw e; 
		} 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string"


	public static class number_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "number"
	// com/github/gumtreediff/gen/antlr3/json/JSON.g:64:1: number : n= Number {...}? ( Exponent )? -> ^( NUMBER Number ( Exponent )? ) ;
	public final JSONParser.number_return number() throws RecognitionException {
		JSONParser.number_return retval = new JSONParser.number_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token n=null;
		Token Exponent9=null;

		Object n_tree=null;
		Object Exponent9_tree=null;
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_Exponent=new RewriteRuleTokenStream(adaptor,"token Exponent");

		try {
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:64:8: (n= Number {...}? ( Exponent )? -> ^( NUMBER Number ( Exponent )? ) )
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:64:10: n= Number {...}? ( Exponent )?
			{
			n=(Token)match(input,Number,FOLLOW_Number_in_number173);  
			stream_Number.add(n);

			if ( !((Pattern.matches("(0|(-?[1-9]\\d*))(\\.\\d+)?", n.getText()))) ) {
				throw new FailedPredicateException(input, "number", "Pattern.matches(\"(0|(-?[1-9]\\\\d*))(\\\\.\\\\d+)?\", n.getText())");
			}
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:65:6: ( Exponent )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Exponent) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:65:6: Exponent
					{
					Exponent9=(Token)match(input,Exponent,FOLLOW_Exponent_in_number183);  
					stream_Exponent.add(Exponent9);

					}
					break;

			}


			// AST REWRITE
			// elements: Number, Exponent
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:4: -> ^( NUMBER Number ( Exponent )? )
			{
				// com/github/gumtreediff/gen/antlr3/json/JSON.g:66:7: ^( NUMBER Number ( Exponent )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUMBER, "NUMBER"), root_1);
				adaptor.addChild(root_1, stream_Number.nextNode());
				// com/github/gumtreediff/gen/antlr3/json/JSON.g:66:23: ( Exponent )?
				if ( stream_Exponent.hasNext() ) {
					adaptor.addChild(root_1, stream_Exponent.nextNode());
				}
				stream_Exponent.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		catch (RecognitionException e) { 
		throw e; 
		} 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "number"


	public static class object_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "object"
	// com/github/gumtreediff/gen/antlr3/json/JSON.g:69:1: object : '{' ( members )? '}' -> ^( OBJECT ( members )? ) ;
	public final JSONParser.object_return object() throws RecognitionException {
		JSONParser.object_return retval = new JSONParser.object_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal10=null;
		Token char_literal12=null;
		ParserRuleReturnScope members11 =null;

		Object char_literal10_tree=null;
		Object char_literal12_tree=null;
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleSubtreeStream stream_members=new RewriteRuleSubtreeStream(adaptor,"rule members");

		try {
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:69:8: ( '{' ( members )? '}' -> ^( OBJECT ( members )? ) )
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:69:10: '{' ( members )? '}'
			{
			char_literal10=(Token)match(input,27,FOLLOW_27_in_object209);  
			stream_27.add(char_literal10);

			// com/github/gumtreediff/gen/antlr3/json/JSON.g:69:14: ( members )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==String) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:69:14: members
					{
					pushFollow(FOLLOW_members_in_object211);
					members11=members();
					state._fsp--;

					stream_members.add(members11.getTree());
					}
					break;

			}

			char_literal12=(Token)match(input,28,FOLLOW_28_in_object214);  
			stream_28.add(char_literal12);


			// AST REWRITE
			// elements: members
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 70:4: -> ^( OBJECT ( members )? )
			{
				// com/github/gumtreediff/gen/antlr3/json/JSON.g:70:7: ^( OBJECT ( members )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OBJECT, "OBJECT"), root_1);
				// com/github/gumtreediff/gen/antlr3/json/JSON.g:70:16: ( members )?
				if ( stream_members.hasNext() ) {
					adaptor.addChild(root_1, stream_members.nextTree());
				}
				stream_members.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		catch (RecognitionException e) { 
		throw e; 
		} 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "object"


	public static class array_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array"
	// com/github/gumtreediff/gen/antlr3/json/JSON.g:73:1: array : '[' ( elements )? ']' -> ^( ARRAY ( elements )? ) ;
	public final JSONParser.array_return array() throws RecognitionException {
		JSONParser.array_return retval = new JSONParser.array_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal13=null;
		Token char_literal15=null;
		ParserRuleReturnScope elements14 =null;

		Object char_literal13_tree=null;
		Object char_literal15_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleSubtreeStream stream_elements=new RewriteRuleSubtreeStream(adaptor,"rule elements");

		try {
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:73:7: ( '[' ( elements )? ']' -> ^( ARRAY ( elements )? ) )
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:73:9: '[' ( elements )? ']'
			{
			char_literal13=(Token)match(input,22,FOLLOW_22_in_array238);  
			stream_22.add(char_literal13);

			// com/github/gumtreediff/gen/antlr3/json/JSON.g:73:13: ( elements )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==Number||LA4_0==String||LA4_0==22||(LA4_0 >= 24 && LA4_0 <= 27)) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:73:13: elements
					{
					pushFollow(FOLLOW_elements_in_array240);
					elements14=elements();
					state._fsp--;

					stream_elements.add(elements14.getTree());
					}
					break;

			}

			char_literal15=(Token)match(input,23,FOLLOW_23_in_array243);  
			stream_23.add(char_literal15);


			// AST REWRITE
			// elements: elements
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 74:4: -> ^( ARRAY ( elements )? )
			{
				// com/github/gumtreediff/gen/antlr3/json/JSON.g:74:7: ^( ARRAY ( elements )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				// com/github/gumtreediff/gen/antlr3/json/JSON.g:74:15: ( elements )?
				if ( stream_elements.hasNext() ) {
					adaptor.addChild(root_1, stream_elements.nextTree());
				}
				stream_elements.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		catch (RecognitionException e) { 
		throw e; 
		} 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array"


	public static class elements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elements"
	// com/github/gumtreediff/gen/antlr3/json/JSON.g:77:1: elements : value ( COMMA ! value )* ;
	public final JSONParser.elements_return elements() throws RecognitionException {
		JSONParser.elements_return retval = new JSONParser.elements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA17=null;
		ParserRuleReturnScope value16 =null;
		ParserRuleReturnScope value18 =null;

		Object COMMA17_tree=null;

		try {
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:77:9: ( value ( COMMA ! value )* )
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:77:11: value ( COMMA ! value )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_value_in_elements264);
			value16=value();
			state._fsp--;

			adaptor.addChild(root_0, value16.getTree());

			// com/github/gumtreediff/gen/antlr3/json/JSON.g:77:17: ( COMMA ! value )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:77:18: COMMA ! value
					{
					COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_elements267); 
					pushFollow(FOLLOW_value_in_elements270);
					value18=value();
					state._fsp--;

					adaptor.addChild(root_0, value18.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		catch (RecognitionException e) { 
		throw e; 
		} 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elements"


	public static class members_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "members"
	// com/github/gumtreediff/gen/antlr3/json/JSON.g:80:1: members : pair ( COMMA ! pair )* ;
	public final JSONParser.members_return members() throws RecognitionException {
		JSONParser.members_return retval = new JSONParser.members_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA20=null;
		ParserRuleReturnScope pair19 =null;
		ParserRuleReturnScope pair21 =null;

		Object COMMA20_tree=null;

		try {
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:80:9: ( pair ( COMMA ! pair )* )
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:80:11: pair ( COMMA ! pair )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_pair_in_members283);
			pair19=pair();
			state._fsp--;

			adaptor.addChild(root_0, pair19.getTree());

			// com/github/gumtreediff/gen/antlr3/json/JSON.g:80:16: ( COMMA ! pair )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==COMMA) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/json/JSON.g:80:17: COMMA ! pair
					{
					COMMA20=(Token)match(input,COMMA,FOLLOW_COMMA_in_members286); 
					pushFollow(FOLLOW_pair_in_members289);
					pair21=pair();
					state._fsp--;

					adaptor.addChild(root_0, pair21.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		catch (RecognitionException e) { 
		throw e; 
		} 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "members"


	public static class pair_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "pair"
	// com/github/gumtreediff/gen/antlr3/json/JSON.g:83:1: pair : String ':' value -> ^( FIELD String value ) ;
	public final JSONParser.pair_return pair() throws RecognitionException {
		JSONParser.pair_return retval = new JSONParser.pair_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token String22=null;
		Token char_literal23=null;
		ParserRuleReturnScope value24 =null;

		Object String22_tree=null;
		Object char_literal23_tree=null;
		RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:83:6: ( String ':' value -> ^( FIELD String value ) )
			// com/github/gumtreediff/gen/antlr3/json/JSON.g:83:8: String ':' value
			{
			String22=(Token)match(input,String,FOLLOW_String_in_pair303);  
			stream_String.add(String22);

			char_literal23=(Token)match(input,21,FOLLOW_21_in_pair305);  
			stream_21.add(char_literal23);

			pushFollow(FOLLOW_value_in_pair307);
			value24=value();
			state._fsp--;

			stream_value.add(value24.getTree());

			// AST REWRITE
			// elements: String, value
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 84:4: -> ^( FIELD String value )
			{
				// com/github/gumtreediff/gen/antlr3/json/JSON.g:84:7: ^( FIELD String value )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FIELD, "FIELD"), root_1);
				adaptor.addChild(root_1, stream_String.nextNode());
				adaptor.addChild(root_1, stream_value.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		 
		catch (RecognitionException e) { 
		throw e; 
		} 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pair"

	// Delegated rules



	public static final BitSet FOLLOW_string_in_value96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_number_in_value101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_object_in_value106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_in_value111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_value116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_value125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_value134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_string149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_number173 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_Exponent_in_number183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_object209 = new BitSet(new long[]{0x0000000010020000L});
	public static final BitSet FOLLOW_members_in_object211 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_object214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_array238 = new BitSet(new long[]{0x000000000FC24000L});
	public static final BitSet FOLLOW_elements_in_array240 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_array243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_elements264 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_elements267 = new BitSet(new long[]{0x000000000F424000L});
	public static final BitSet FOLLOW_value_in_elements270 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_pair_in_members283 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_COMMA_in_members286 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_pair_in_members289 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_String_in_pair303 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_pair305 = new BitSet(new long[]{0x000000000F424000L});
	public static final BitSet FOLLOW_value_in_pair307 = new BitSet(new long[]{0x0000000000000002L});
}
