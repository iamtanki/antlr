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
		EQ=1, LIBEND=2, LIBDEF=3, OBJGROUP=4, LAYEREND=5, LAYERDEF=6, OBJEND=7, 
		OBJSTART=8, INT=9, LETTER=10, ID=11, LINE=12, WS=13, TEXT=14;
	public static final int
		RULE_file = 0, RULE_layer = 1, RULE_objs = 2, RULE_obj = 3, RULE_objgroup = 4, 
		RULE_expr = 5, RULE_layerend = 6, RULE_layerdef = 7, RULE_libend = 8, 
		RULE_libdef = 9, RULE_objend = 10, RULE_objstart = 11;
	public static final String[] ruleNames = {
		"file", "layer", "objs", "obj", "objgroup", "expr", "layerend", "layerdef", 
		"libend", "libdef", "objend", "objstart"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'LibEnd'", null, null, "'LayerEnd'", null, "'ObjEnd'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQ", "LIBEND", "LIBDEF", "OBJGROUP", "LAYEREND", "LAYERDEF", "OBJEND", 
		"OBJSTART", "INT", "LETTER", "ID", "LINE", "WS", "TEXT"
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				layer();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LIBDEF || _la==LAYERDEF );
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
		public LibdefContext libdef() {
			return getRuleContext(LibdefContext.class,0);
		}
		public LibendContext libend() {
			return getRuleContext(LibendContext.class,0);
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
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAYERDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				layerdef();
				setState(30);
				objs();
				setState(31);
				layerend();
				}
				break;
			case LIBDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				libdef();
				setState(34);
				objs();
				setState(35);
				libend();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJGROUP || _la==OBJSTART) {
				{
				{
				setState(39);
				obj();
				}
				}
				setState(44);
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
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
	 
		public ObjContext() { }
		public void copyFrom(ObjContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjOtherContext extends ObjContext {
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
		public ObjOtherContext(ObjContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterObjOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitObjOther(this);
		}
	}
	public static class OGroupContext extends ObjContext {
		public ObjgroupContext objgroup() {
			return getRuleContext(ObjgroupContext.class,0);
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
		public OGroupContext(ObjContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterOGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitOGroup(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_obj);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJGROUP:
				_localctx = new OGroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				objgroup();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJGROUP) | (1L << OBJSTART) | (1L << TEXT))) != 0)) {
					{
					{
					setState(46);
					expr();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				objend();
				}
				break;
			case OBJSTART:
				_localctx = new ObjOtherContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				objstart();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBJGROUP) | (1L << OBJSTART) | (1L << TEXT))) != 0)) {
					{
					{
					setState(55);
					expr();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				objend();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ObjgroupContext extends ParserRuleContext {
		public TerminalNode OBJGROUP() { return getToken(GEParser.OBJGROUP, 0); }
		public TerminalNode LINE() { return getToken(GEParser.LINE, 0); }
		public ObjgroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objgroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterObjgroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitObjgroup(this);
		}
	}

	public final ObjgroupContext objgroup() throws RecognitionException {
		ObjgroupContext _localctx = new ObjgroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objgroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(OBJGROUP);
			setState(66);
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
	public static class EObjContext extends ExprContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public EObjContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterEObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitEObj(this);
		}
	}
	public static class ETextContext extends ExprContext {
		public TerminalNode TEXT() { return getToken(GEParser.TEXT, 0); }
		public TerminalNode LINE() { return getToken(GEParser.LINE, 0); }
		public ETextContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterEText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitEText(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJGROUP:
			case OBJSTART:
				_localctx = new EObjContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				obj();
				}
				break;
			case TEXT:
				_localctx = new ETextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(TEXT);
				setState(70);
				match(LINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 12, RULE_layerend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LAYEREND);
			setState(74);
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
		enterRule(_localctx, 14, RULE_layerdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LAYERDEF);
			setState(77);
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

	public static class LibendContext extends ParserRuleContext {
		public TerminalNode LIBEND() { return getToken(GEParser.LIBEND, 0); }
		public TerminalNode LINE() { return getToken(GEParser.LINE, 0); }
		public LibendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterLibend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitLibend(this);
		}
	}

	public final LibendContext libend() throws RecognitionException {
		LibendContext _localctx = new LibendContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_libend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LIBEND);
			setState(80);
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

	public static class LibdefContext extends ParserRuleContext {
		public TerminalNode LIBDEF() { return getToken(GEParser.LIBDEF, 0); }
		public TerminalNode LINE() { return getToken(GEParser.LINE, 0); }
		public LibdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterLibdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitLibdef(this);
		}
	}

	public final LibdefContext libdef() throws RecognitionException {
		LibdefContext _localctx = new LibdefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_libdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LIBDEF);
			setState(83);
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
		public TerminalNode LINE() { return getToken(GEParser.LINE, 0); }
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
		enterRule(_localctx, 20, RULE_objend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(OBJEND);
			setState(86);
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

	public static class ObjstartContext extends ParserRuleContext {
		public TerminalNode OBJSTART() { return getToken(GEParser.OBJSTART, 0); }
		public TerminalNode LINE() { return getToken(GEParser.LINE, 0); }
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
		enterRule(_localctx, 22, RULE_objstart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(OBJSTART);
			setState(89);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20^\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3(\n\3\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\7\5\62\n\5\f\5\16\5"+
		"\65\13\5\3\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\5\5B\n\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\5\7J\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\2\2X\2\33\3\2\2\2\4\'\3\2\2\2\6,\3\2\2\2\bA\3\2\2\2\nC\3\2\2"+
		"\2\fI\3\2\2\2\16K\3\2\2\2\20N\3\2\2\2\22Q\3\2\2\2\24T\3\2\2\2\26W\3\2"+
		"\2\2\30Z\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2"+
		"\2\35\36\3\2\2\2\36\3\3\2\2\2\37 \5\20\t\2 !\5\6\4\2!\"\5\16\b\2\"(\3"+
		"\2\2\2#$\5\24\13\2$%\5\6\4\2%&\5\22\n\2&(\3\2\2\2\'\37\3\2\2\2\'#\3\2"+
		"\2\2(\5\3\2\2\2)+\5\b\5\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3"+
		"\2\2\2.,\3\2\2\2/\63\5\n\6\2\60\62\5\f\7\2\61\60\3\2\2\2\62\65\3\2\2\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\5\26\f"+
		"\2\67B\3\2\2\28<\5\30\r\29;\5\f\7\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=?\3\2\2\2><\3\2\2\2?@\5\26\f\2@B\3\2\2\2A/\3\2\2\2A8\3\2\2\2B\t"+
		"\3\2\2\2CD\7\6\2\2DE\7\16\2\2E\13\3\2\2\2FJ\5\b\5\2GH\7\20\2\2HJ\7\16"+
		"\2\2IF\3\2\2\2IG\3\2\2\2J\r\3\2\2\2KL\7\7\2\2LM\7\16\2\2M\17\3\2\2\2N"+
		"O\7\b\2\2OP\7\16\2\2P\21\3\2\2\2QR\7\4\2\2RS\7\16\2\2S\23\3\2\2\2TU\7"+
		"\5\2\2UV\7\16\2\2V\25\3\2\2\2WX\7\t\2\2XY\7\16\2\2Y\27\3\2\2\2Z[\7\n\2"+
		"\2[\\\7\16\2\2\\\31\3\2\2\2\t\35\',\63<AI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}