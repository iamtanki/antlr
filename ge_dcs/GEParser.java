// Generated from GE.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GEParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LAYEREND=1, LAYERDEF=2, OBJEND=3, OBJSTART=4, END=5, EQ=6, ID=7, LINE=8, 
		WS=9, TEXT=10;
	public static final int
		RULE_file = 0, RULE_layer = 1, RULE_objs = 2, RULE_obj = 3, RULE_expr = 4, 
		RULE_layerend = 5, RULE_layerdef = 6, RULE_objend = 7, RULE_objstart = 8;
	public static final String[] ruleNames = {
		"file", "layer", "objs", "obj", "expr", "layerend", "layerdef", "objend", 
		"objstart"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'LayerEnd'", null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LAYEREND", "LAYERDEF", "OBJEND", "OBJSTART", "END", "EQ", "ID", 
		"LINE", "WS", "TEXT"
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
	public String getGrammarFileName() { return "GE.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GEParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(GEParser.END, 0); }
		public List<LayerContext> layer() {
			return getRuleContexts(LayerContext.class);
		}
		public LayerContext layer(int i) {
			return getRuleContext(LayerContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				layer();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LAYERDEF );
			setState(23);
			match(END);
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

	public static class LayerContext extends ParserRuleContext {
		public LayerdefContext layerdef() {
			return getRuleContext(LayerdefContext.class,0);
		}
		public ObjsContext objs() {
			return getRuleContext(ObjsContext.class,0);
		}
		public LayerendContext layerend() {
			return getRuleContext(LayerendContext.class,0);
		}
		public LayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitLayer(this);
		}
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_layer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			layerdef();
			setState(26);
			objs();
			setState(27);
			layerend();
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

	public static class ObjsContext extends ParserRuleContext {
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public ObjsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterObjs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitObjs(this);
		}
	}

	public final ObjsContext objs() throws RecognitionException {
		ObjsContext _localctx = new ObjsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJSTART) {
				{
				{
				setState(29);
				obj();
				}
				}
				setState(34);
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

	public static class ObjContext extends ParserRuleContext {
		public ObjstartContext objstart() {
			return getRuleContext(ObjstartContext.class,0);
		}
		public ObjendContext objend() {
			return getRuleContext(ObjendContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitObj(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			objstart();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(36);
				expr();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			objend();
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
		public TerminalNode TEXT() { return getToken(GEParser.TEXT, 0); }
		public List<TerminalNode> LINE() { return getTokens(GEParser.LINE); }
		public TerminalNode LINE(int i) {
			return getToken(GEParser.LINE, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(TEXT);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE) {
				{
				{
				setState(45);
				match(LINE);
				}
				}
				setState(50);
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

	public static class LayerendContext extends ParserRuleContext {
		public TerminalNode LAYEREND() { return getToken(GEParser.LAYEREND, 0); }
		public TerminalNode LINE() { return getToken(GEParser.LINE, 0); }
		public LayerendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layerend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterLayerend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitLayerend(this);
		}
	}

	public final LayerendContext layerend() throws RecognitionException {
		LayerendContext _localctx = new LayerendContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_layerend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LAYEREND);
			setState(52);
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

	public static class LayerdefContext extends ParserRuleContext {
		public TerminalNode LAYERDEF() { return getToken(GEParser.LAYERDEF, 0); }
		public TerminalNode LINE() { return getToken(GEParser.LINE, 0); }
		public LayerdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layerdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterLayerdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitLayerdef(this);
		}
	}

	public final LayerdefContext layerdef() throws RecognitionException {
		LayerdefContext _localctx = new LayerdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_layerdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LAYERDEF);
			setState(55);
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

	public static class ObjendContext extends ParserRuleContext {
		public TerminalNode OBJEND() { return getToken(GEParser.OBJEND, 0); }
		public ObjendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterObjend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitObjend(this);
		}
	}

	public final ObjendContext objend() throws RecognitionException {
		ObjendContext _localctx = new ObjendContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_objend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(OBJEND);
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

	public static class ObjstartContext extends ParserRuleContext {
		public TerminalNode OBJSTART() { return getToken(GEParser.OBJSTART, 0); }
		public ObjstartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objstart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterObjstart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitObjstart(this);
		}
	}

	public final ObjstartContext objstart() throws RecognitionException {
		ObjstartContext _localctx = new ObjstartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objstart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(OBJSTART);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\3\3\3\3\3\3\3\3\4\7\4!\n\4\f\4\16\4$\13\4\3"+
		"\5\3\5\7\5(\n\5\f\5\16\5+\13\5\3\5\3\5\3\6\3\6\7\6\61\n\6\f\6\16\6\64"+
		"\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16"+
		"\20\22\2\2\2:\2\25\3\2\2\2\4\33\3\2\2\2\6\"\3\2\2\2\b%\3\2\2\2\n.\3\2"+
		"\2\2\f\65\3\2\2\2\168\3\2\2\2\20;\3\2\2\2\22=\3\2\2\2\24\26\5\4\3\2\25"+
		"\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31"+
		"\32\7\7\2\2\32\3\3\2\2\2\33\34\5\16\b\2\34\35\5\6\4\2\35\36\5\f\7\2\36"+
		"\5\3\2\2\2\37!\5\b\5\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\7"+
		"\3\2\2\2$\"\3\2\2\2%)\5\22\n\2&(\5\n\6\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2"+
		"\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5\20\t\2-\t\3\2\2\2.\62\7\f\2\2/\61"+
		"\7\n\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\13\3"+
		"\2\2\2\64\62\3\2\2\2\65\66\7\3\2\2\66\67\7\n\2\2\67\r\3\2\2\289\7\4\2"+
		"\29:\7\n\2\2:\17\3\2\2\2;<\7\5\2\2<\21\3\2\2\2=>\7\6\2\2>\23\3\2\2\2\6"+
		"\27\")\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}