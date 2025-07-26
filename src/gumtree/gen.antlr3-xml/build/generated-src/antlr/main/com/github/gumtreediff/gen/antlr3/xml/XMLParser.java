// $ANTLR 3.5.3 com/github/gumtreediff/gen/antlr3/xml/XML.g 2025-04-14 15:35:35
 package com.github.gumtreediff.gen.antlr3.xml; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class XMLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ATTRIBUTE", "ATTRIBUTES", "ATTRIBUTE_ID", 
		"ATTR_EQ", "ATTR_VALUE", "DIGIT", "ELEMENT", "ELEMENT_ID", "GENERIC_ID", 
		"LETTER", "NAMECHAR", "PCDATA", "TAG_CLOSE", "TAG_EMPTY_CLOSE", "TAG_END_OPEN", 
		"TAG_START_OPEN", "WS"
	};
	public static final int EOF=-1;
	public static final int ATTRIBUTE=4;
	public static final int ATTRIBUTES=5;
	public static final int ATTRIBUTE_ID=6;
	public static final int ATTR_EQ=7;
	public static final int ATTR_VALUE=8;
	public static final int DIGIT=9;
	public static final int ELEMENT=10;
	public static final int ELEMENT_ID=11;
	public static final int GENERIC_ID=12;
	public static final int LETTER=13;
	public static final int NAMECHAR=14;
	public static final int PCDATA=15;
	public static final int TAG_CLOSE=16;
	public static final int TAG_EMPTY_CLOSE=17;
	public static final int TAG_END_OPEN=18;
	public static final int TAG_START_OPEN=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public XMLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public XMLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return XMLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "com/github/gumtreediff/gen/antlr3/xml/XML.g"; }


	public static class document_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "document"
	// com/github/gumtreediff/gen/antlr3/xml/XML.g:24:1: document : element ;
	public final XMLParser.document_return document() throws RecognitionException {
		XMLParser.document_return retval = new XMLParser.document_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope element1 =null;


		try {
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:24:10: ( element )
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:24:12: element
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_element_in_document88);
			element1=element();
			state._fsp--;

			adaptor.addChild(root_0, element1.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "document"


	public static class element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "element"
	// com/github/gumtreediff/gen/antlr3/xml/XML.g:26:1: element : ( startTag ^ ( element | PCDATA )* endTag !| emptyElement ) ;
	public final XMLParser.element_return element() throws RecognitionException {
		XMLParser.element_return retval = new XMLParser.element_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PCDATA4=null;
		ParserRuleReturnScope startTag2 =null;
		ParserRuleReturnScope element3 =null;
		ParserRuleReturnScope endTag5 =null;
		ParserRuleReturnScope emptyElement6 =null;

		CommonTree PCDATA4_tree=null;

		try {
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:27:5: ( ( startTag ^ ( element | PCDATA )* endTag !| emptyElement ) )
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:27:7: ( startTag ^ ( element | PCDATA )* endTag !| emptyElement )
			{
			root_0 = (CommonTree)adaptor.nil();


			// com/github/gumtreediff/gen/antlr3/xml/XML.g:27:7: ( startTag ^ ( element | PCDATA )* endTag !| emptyElement )
			int alt2=2;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/xml/XML.g:27:9: startTag ^ ( element | PCDATA )* endTag !
					{
					pushFollow(FOLLOW_startTag_in_element104);
					startTag2=startTag();
					state._fsp--;

					root_0 = (CommonTree)adaptor.becomeRoot(startTag2.getTree(), root_0);
					// com/github/gumtreediff/gen/antlr3/xml/XML.g:28:13: ( element | PCDATA )*
					loop1:
					while (true) {
						int alt1=3;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==TAG_START_OPEN) ) {
							alt1=1;
						}
						else if ( (LA1_0==PCDATA) ) {
							alt1=2;
						}

						switch (alt1) {
						case 1 :
							// com/github/gumtreediff/gen/antlr3/xml/XML.g:28:14: element
							{
							pushFollow(FOLLOW_element_in_element120);
							element3=element();
							state._fsp--;

							adaptor.addChild(root_0, element3.getTree());

							}
							break;
						case 2 :
							// com/github/gumtreediff/gen/antlr3/xml/XML.g:29:15: PCDATA
							{
							PCDATA4=(Token)match(input,PCDATA,FOLLOW_PCDATA_in_element136); 
							PCDATA4_tree = (CommonTree)adaptor.create(PCDATA4);
							adaptor.addChild(root_0, PCDATA4_tree);

							}
							break;

						default :
							break loop1;
						}
					}

					pushFollow(FOLLOW_endTag_in_element165);
					endTag5=endTag();
					state._fsp--;

					}
					break;
				case 2 :
					// com/github/gumtreediff/gen/antlr3/xml/XML.g:32:11: emptyElement
					{
					pushFollow(FOLLOW_emptyElement_in_element178);
					emptyElement6=emptyElement();
					state._fsp--;

					adaptor.addChild(root_0, emptyElement6.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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


	public static class startTag_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "startTag"
	// com/github/gumtreediff/gen/antlr3/xml/XML.g:36:1: startTag : TAG_START_OPEN g= GENERIC_ID ( attribute )* TAG_CLOSE -> ^( ELEMENT ELEMENT_ID[g] ( attribute )* ) ;
	public final XMLParser.startTag_return startTag() throws RecognitionException {
		XMLParser.startTag_return retval = new XMLParser.startTag_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token g=null;
		Token TAG_START_OPEN7=null;
		Token TAG_CLOSE9=null;
		ParserRuleReturnScope attribute8 =null;

		CommonTree g_tree=null;
		CommonTree TAG_START_OPEN7_tree=null;
		CommonTree TAG_CLOSE9_tree=null;
		RewriteRuleTokenStream stream_TAG_START_OPEN=new RewriteRuleTokenStream(adaptor,"token TAG_START_OPEN");
		RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
		RewriteRuleTokenStream stream_TAG_CLOSE=new RewriteRuleTokenStream(adaptor,"token TAG_CLOSE");
		RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");

		try {
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:36:10: ( TAG_START_OPEN g= GENERIC_ID ( attribute )* TAG_CLOSE -> ^( ELEMENT ELEMENT_ID[g] ( attribute )* ) )
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:36:12: TAG_START_OPEN g= GENERIC_ID ( attribute )* TAG_CLOSE
			{
			TAG_START_OPEN7=(Token)match(input,TAG_START_OPEN,FOLLOW_TAG_START_OPEN_in_startTag202);  
			stream_TAG_START_OPEN.add(TAG_START_OPEN7);

			g=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_startTag206);  
			stream_GENERIC_ID.add(g);

			// com/github/gumtreediff/gen/antlr3/xml/XML.g:36:40: ( attribute )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==GENERIC_ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/xml/XML.g:36:40: attribute
					{
					pushFollow(FOLLOW_attribute_in_startTag208);
					attribute8=attribute();
					state._fsp--;

					stream_attribute.add(attribute8.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			TAG_CLOSE9=(Token)match(input,TAG_CLOSE,FOLLOW_TAG_CLOSE_in_startTag211);  
			stream_TAG_CLOSE.add(TAG_CLOSE9);


			// AST REWRITE
			// elements: attribute
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 37:9: -> ^( ELEMENT ELEMENT_ID[g] ( attribute )* )
			{
				// com/github/gumtreediff/gen/antlr3/xml/XML.g:37:12: ^( ELEMENT ELEMENT_ID[g] ( attribute )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELEMENT, "ELEMENT"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(ELEMENT_ID, g));
				// com/github/gumtreediff/gen/antlr3/xml/XML.g:37:36: ( attribute )*
				while ( stream_attribute.hasNext() ) {
					adaptor.addChild(root_1, stream_attribute.nextTree());
				}
				stream_attribute.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "startTag"


	public static class attribute_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "attribute"
	// com/github/gumtreediff/gen/antlr3/xml/XML.g:40:1: attribute : g= GENERIC_ID ATTR_EQ ATTR_VALUE -> ^( ATTRIBUTE ATTRIBUTE_ID[g] ATTR_VALUE ) ;
	public final XMLParser.attribute_return attribute() throws RecognitionException {
		XMLParser.attribute_return retval = new XMLParser.attribute_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token g=null;
		Token ATTR_EQ10=null;
		Token ATTR_VALUE11=null;

		CommonTree g_tree=null;
		CommonTree ATTR_EQ10_tree=null;
		CommonTree ATTR_VALUE11_tree=null;
		RewriteRuleTokenStream stream_ATTR_VALUE=new RewriteRuleTokenStream(adaptor,"token ATTR_VALUE");
		RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
		RewriteRuleTokenStream stream_ATTR_EQ=new RewriteRuleTokenStream(adaptor,"token ATTR_EQ");

		try {
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:40:11: (g= GENERIC_ID ATTR_EQ ATTR_VALUE -> ^( ATTRIBUTE ATTRIBUTE_ID[g] ATTR_VALUE ) )
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:40:13: g= GENERIC_ID ATTR_EQ ATTR_VALUE
			{
			g=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_attribute247);  
			stream_GENERIC_ID.add(g);

			ATTR_EQ10=(Token)match(input,ATTR_EQ,FOLLOW_ATTR_EQ_in_attribute249);  
			stream_ATTR_EQ.add(ATTR_EQ10);

			ATTR_VALUE11=(Token)match(input,ATTR_VALUE,FOLLOW_ATTR_VALUE_in_attribute251);  
			stream_ATTR_VALUE.add(ATTR_VALUE11);


			// AST REWRITE
			// elements: ATTR_VALUE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 40:45: -> ^( ATTRIBUTE ATTRIBUTE_ID[g] ATTR_VALUE )
			{
				// com/github/gumtreediff/gen/antlr3/xml/XML.g:40:48: ^( ATTRIBUTE ATTRIBUTE_ID[g] ATTR_VALUE )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(ATTRIBUTE_ID, g));
				adaptor.addChild(root_1, stream_ATTR_VALUE.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "attribute"


	public static class endTag_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "endTag"
	// com/github/gumtreediff/gen/antlr3/xml/XML.g:42:1: endTag : TAG_END_OPEN GENERIC_ID TAG_CLOSE ;
	public final XMLParser.endTag_return endTag() throws RecognitionException {
		XMLParser.endTag_return retval = new XMLParser.endTag_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token TAG_END_OPEN12=null;
		Token GENERIC_ID13=null;
		Token TAG_CLOSE14=null;

		CommonTree TAG_END_OPEN12_tree=null;
		CommonTree GENERIC_ID13_tree=null;
		CommonTree TAG_CLOSE14_tree=null;

		try {
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:42:9: ( TAG_END_OPEN GENERIC_ID TAG_CLOSE )
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:42:11: TAG_END_OPEN GENERIC_ID TAG_CLOSE
			{
			root_0 = (CommonTree)adaptor.nil();


			TAG_END_OPEN12=(Token)match(input,TAG_END_OPEN,FOLLOW_TAG_END_OPEN_in_endTag273); 
			TAG_END_OPEN12_tree = (CommonTree)adaptor.create(TAG_END_OPEN12);
			adaptor.addChild(root_0, TAG_END_OPEN12_tree);

			GENERIC_ID13=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_endTag275); 
			GENERIC_ID13_tree = (CommonTree)adaptor.create(GENERIC_ID13);
			adaptor.addChild(root_0, GENERIC_ID13_tree);

			TAG_CLOSE14=(Token)match(input,TAG_CLOSE,FOLLOW_TAG_CLOSE_in_endTag277); 
			TAG_CLOSE14_tree = (CommonTree)adaptor.create(TAG_CLOSE14);
			adaptor.addChild(root_0, TAG_CLOSE14_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "endTag"


	public static class emptyElement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "emptyElement"
	// com/github/gumtreediff/gen/antlr3/xml/XML.g:44:1: emptyElement : TAG_START_OPEN g= GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE -> ^( ELEMENT ELEMENT_ID[g] ( attribute )* ) ;
	public final XMLParser.emptyElement_return emptyElement() throws RecognitionException {
		XMLParser.emptyElement_return retval = new XMLParser.emptyElement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token g=null;
		Token TAG_START_OPEN15=null;
		Token TAG_EMPTY_CLOSE17=null;
		ParserRuleReturnScope attribute16 =null;

		CommonTree g_tree=null;
		CommonTree TAG_START_OPEN15_tree=null;
		CommonTree TAG_EMPTY_CLOSE17_tree=null;
		RewriteRuleTokenStream stream_TAG_START_OPEN=new RewriteRuleTokenStream(adaptor,"token TAG_START_OPEN");
		RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
		RewriteRuleTokenStream stream_TAG_EMPTY_CLOSE=new RewriteRuleTokenStream(adaptor,"token TAG_EMPTY_CLOSE");
		RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");

		try {
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:44:14: ( TAG_START_OPEN g= GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE -> ^( ELEMENT ELEMENT_ID[g] ( attribute )* ) )
			// com/github/gumtreediff/gen/antlr3/xml/XML.g:44:16: TAG_START_OPEN g= GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE
			{
			TAG_START_OPEN15=(Token)match(input,TAG_START_OPEN,FOLLOW_TAG_START_OPEN_in_emptyElement286);  
			stream_TAG_START_OPEN.add(TAG_START_OPEN15);

			g=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_emptyElement290);  
			stream_GENERIC_ID.add(g);

			// com/github/gumtreediff/gen/antlr3/xml/XML.g:44:44: ( attribute )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==GENERIC_ID) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// com/github/gumtreediff/gen/antlr3/xml/XML.g:44:44: attribute
					{
					pushFollow(FOLLOW_attribute_in_emptyElement292);
					attribute16=attribute();
					state._fsp--;

					stream_attribute.add(attribute16.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			TAG_EMPTY_CLOSE17=(Token)match(input,TAG_EMPTY_CLOSE,FOLLOW_TAG_EMPTY_CLOSE_in_emptyElement295);  
			stream_TAG_EMPTY_CLOSE.add(TAG_EMPTY_CLOSE17);


			// AST REWRITE
			// elements: attribute
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 45:9: -> ^( ELEMENT ELEMENT_ID[g] ( attribute )* )
			{
				// com/github/gumtreediff/gen/antlr3/xml/XML.g:45:12: ^( ELEMENT ELEMENT_ID[g] ( attribute )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELEMENT, "ELEMENT"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(ELEMENT_ID, g));
				// com/github/gumtreediff/gen/antlr3/xml/XML.g:45:36: ( attribute )*
				while ( stream_attribute.hasNext() ) {
					adaptor.addChild(root_1, stream_attribute.nextTree());
				}
				stream_attribute.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// $ANTLR end "emptyElement"

	// Delegated rules


	protected DFA2 dfa2 = new DFA2(this);
	static final String DFA2_eotS =
		"\10\uffff";
	static final String DFA2_eofS =
		"\10\uffff";
	static final String DFA2_minS =
		"\1\23\2\14\1\7\2\uffff\1\10\1\14";
	static final String DFA2_maxS =
		"\1\23\1\14\1\21\1\7\2\uffff\1\10\1\21";
	static final String DFA2_acceptS =
		"\4\uffff\1\1\1\2\2\uffff";
	static final String DFA2_specialS =
		"\10\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\3\uffff\1\4\1\5",
			"\1\6",
			"",
			"",
			"\1\7",
			"\1\3\3\uffff\1\4\1\5"
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "27:7: ( startTag ^ ( element | PCDATA )* endTag !| emptyElement )";
		}
	}

	public static final BitSet FOLLOW_element_in_document88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_startTag_in_element104 = new BitSet(new long[]{0x00000000000C8000L});
	public static final BitSet FOLLOW_element_in_element120 = new BitSet(new long[]{0x00000000000C8000L});
	public static final BitSet FOLLOW_PCDATA_in_element136 = new BitSet(new long[]{0x00000000000C8000L});
	public static final BitSet FOLLOW_endTag_in_element165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_emptyElement_in_element178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_START_OPEN_in_startTag202 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_GENERIC_ID_in_startTag206 = new BitSet(new long[]{0x0000000000011000L});
	public static final BitSet FOLLOW_attribute_in_startTag208 = new BitSet(new long[]{0x0000000000011000L});
	public static final BitSet FOLLOW_TAG_CLOSE_in_startTag211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERIC_ID_in_attribute247 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ATTR_EQ_in_attribute249 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ATTR_VALUE_in_attribute251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_END_OPEN_in_endTag273 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_GENERIC_ID_in_endTag275 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_TAG_CLOSE_in_endTag277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_START_OPEN_in_emptyElement286 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_GENERIC_ID_in_emptyElement290 = new BitSet(new long[]{0x0000000000021000L});
	public static final BitSet FOLLOW_attribute_in_emptyElement292 = new BitSet(new long[]{0x0000000000021000L});
	public static final BitSet FOLLOW_TAG_EMPTY_CLOSE_in_emptyElement295 = new BitSet(new long[]{0x0000000000000002L});
}
