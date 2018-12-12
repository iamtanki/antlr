// Generated from GE_Expr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GE_ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, EQ=6, STRING=7, RGB=8, EXID=9, 
		ID=10, INT=11, LINE=12, WS=13, CC=14;
	public static final int
		RULE_prog = 0, RULE_assign = 1, RULE_expr = 2, RULE_exprList = 3, RULE_text = 4;
	public static final String[] ruleNames = {
		"prog", "assign", "expr", "exprList", "text"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'('", "')'", "'['", "']'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "EQ", "STRING", "RGB", "EXID", "ID", 
		"INT", "LINE", "WS", "CC"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GE_Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GE_ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				assign();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GE_ExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(GE_ExprParser.EQ, 0); }
		public TerminalNode LINE() { return getToken(GE_ExprParser.LINE, 0); }
		public List<TerminalNode> WS() { return getTokens(GE_ExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GE_ExprParser.WS, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(ID);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(16);
				match(WS);
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EQ);
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(23);
					match(WS);
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(29);
				expr();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==WS) {
					{
					{
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(30);
						match(WS);
						}
						}
						setState(35);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(36);
					match(T__0);
					setState(40);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(37);
							match(WS);
							}
							} 
						}
						setState(42);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
					}
					setState(43);
					expr();
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(51);
			match(LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode EXID() { return getToken(GE_ExprParser.EXID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitCall(this);
		}
	}
	public static class EmptyContext extends ExprContext {
		public EmptyContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitEmpty(this);
		}
	}
	public static class WenbenContext extends ExprContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public WenbenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterWenben(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitWenben(this);
		}
	}
	public static class IndexContext extends ExprContext {
		public TerminalNode RGB() { return getToken(GE_ExprParser.RGB, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public IndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitIndex(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(GE_ExprParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitString(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(GE_ExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitInt(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			int _alt;
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(EXID);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(54);
					match(T__1);
					setState(56);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(55);
						exprList();
						}
						break;
					}
					setState(58);
					match(T__2);
					}
				}

				}
				break;
			case 2:
				_localctx = new IndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(RGB);
				setState(62);
				match(T__3);
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(63);
					exprList();
					}
					break;
				}
				setState(66);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				match(INT);
				}
				break;
			case 4:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(STRING);
				}
				break;
			case 5:
				_localctx = new WenbenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(70); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(69);
						text();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(GE_ExprParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GE_ExprParser.WS, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			expr();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==WS) {
				{
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(78);
					match(WS);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(T__0);
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(85);
						match(WS);
						}
						} 
					}
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(91);
				expr();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public List<TerminalNode> CC() { return getTokens(GE_ExprParser.CC); }
		public TerminalNode CC(int i) {
			return getToken(GE_ExprParser.CC, i);
		}
		public List<TerminalNode> LINE() { return getTokens(GE_ExprParser.LINE); }
		public TerminalNode LINE(int i) {
			return getToken(GE_ExprParser.LINE, i);
		}
		public List<TerminalNode> ID() { return getTokens(GE_ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GE_ExprParser.ID, i);
		}
		public List<TerminalNode> EQ() { return getTokens(GE_ExprParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(GE_ExprParser.EQ, i);
		}
		public List<TerminalNode> EXID() { return getTokens(GE_ExprParser.EXID); }
		public TerminalNode EXID(int i) {
			return getToken(GE_ExprParser.EXID, i);
		}
		public List<TerminalNode> RGB() { return getTokens(GE_ExprParser.RGB); }
		public TerminalNode RGB(int i) {
			return getToken(GE_ExprParser.RGB, i);
		}
		public List<TerminalNode> STRING() { return getTokens(GE_ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GE_ExprParser.STRING, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GE_ExprListener ) ((GE_ExprListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(97);
						_la = _input.LA(1);
						if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << EQ) | (1L << STRING) | (1L << RGB) | (1L << EXID) | (1L << ID) | (1L << LINE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						setState(98);
						match(CC);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(101); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\7\3\24\n"+
		"\3\f\3\16\3\27\13\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\7\3\""+
		"\n\3\f\3\16\3%\13\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\7\3/\n\3\f\3\16"+
		"\3\62\13\3\5\3\64\n\3\3\3\3\3\3\4\3\4\3\4\5\4;\n\4\3\4\5\4>\n\4\3\4\3"+
		"\4\3\4\5\4C\n\4\3\4\3\4\3\4\3\4\6\4I\n\4\r\4\16\4J\3\4\5\4N\n\4\3\5\3"+
		"\5\7\5R\n\5\f\5\16\5U\13\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\7\5_\n"+
		"\5\f\5\16\5b\13\5\3\6\3\6\6\6f\n\6\r\6\16\6g\3\6\2\2\7\2\4\6\b\n\2\3\5"+
		"\2\3\5\b\f\16\16\2y\2\r\3\2\2\2\4\21\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\ne"+
		"\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2"+
		"\2\2\20\3\3\2\2\2\21\25\7\f\2\2\22\24\7\17\2\2\23\22\3\2\2\2\24\27\3\2"+
		"\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25\3\2\2\2\30\34\7\b"+
		"\2\2\31\33\7\17\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3"+
		"\2\2\2\35\63\3\2\2\2\36\34\3\2\2\2\37\60\5\6\4\2 \"\7\17\2\2! \3\2\2\2"+
		"\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&*\7\3\2\2\')\7\17"+
		"\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-/\5"+
		"\6\4\2.#\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\63\37\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\16\2\2\66"+
		"\5\3\2\2\2\67=\7\13\2\28:\7\4\2\29;\5\b\5\2:9\3\2\2\2:;\3\2\2\2;<\3\2"+
		"\2\2<>\7\5\2\2=8\3\2\2\2=>\3\2\2\2>N\3\2\2\2?@\7\n\2\2@B\7\6\2\2AC\5\b"+
		"\5\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DN\7\7\2\2EN\7\r\2\2FN\7\t\2\2GI\5\n"+
		"\6\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KN\3\2\2\2LN\3\2\2\2M\67\3"+
		"\2\2\2M?\3\2\2\2ME\3\2\2\2MF\3\2\2\2MH\3\2\2\2ML\3\2\2\2N\7\3\2\2\2O`"+
		"\5\6\4\2PR\7\17\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2"+
		"US\3\2\2\2VZ\7\3\2\2WY\7\17\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2"+
		"\2[]\3\2\2\2\\Z\3\2\2\2]_\5\6\4\2^S\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2a\t\3\2\2\2b`\3\2\2\2cf\n\2\2\2df\7\20\2\2ec\3\2\2\2ed\3\2\2\2fg\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2h\13\3\2\2\2\23\17\25\34#*\60\63:=BJMSZ`eg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}