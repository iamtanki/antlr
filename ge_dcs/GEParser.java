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
		T__0=1, LAYER=2, LAYEREND=3, END=4, EQ=5, LINE=6, TEXT=7;
	public static final int
		RULE_file = 0, RULE_headers = 1, RULE_head = 2, RULE_layers = 3, RULE_layerid = 4;
	public static final String[] ruleNames = {
		"file", "headers", "head", "layers", "layerid"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'End'", "'Layer'", "'LayerEnd'", "'END'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LAYER", "LAYEREND", "END", "EQ", "LINE", "TEXT"
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
		public HeadersContext headers() {
			return getRuleContext(HeadersContext.class,0);
		}
		public LayersContext layers() {
			return getRuleContext(LayersContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			headers();
			setState(11);
			layers();
			setState(12);
			match(T__0);
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

	public static class HeadersContext extends ParserRuleContext {
		public List<HeadContext> head() {
			return getRuleContexts(HeadContext.class);
		}
		public HeadContext head(int i) {
			return getRuleContext(HeadContext.class,i);
		}
		public HeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitHeaders(this);
		}
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_headers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				head();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LINE) | (1L << TEXT))) != 0) );
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode LINE() { return getToken(GEParser.LINE, 0); }
		public List<TerminalNode> TEXT() { return getTokens(GEParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(GEParser.TEXT, i);
		}
		public TerminalNode EQ() { return getToken(GEParser.EQ, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_head);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(19);
					match(TEXT);
					}
					}
					setState(22); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				setState(24);
				match(LINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(25);
					match(TEXT);
					}
					}
					setState(28); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				setState(30);
				match(EQ);
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					match(TEXT);
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				setState(36);
				match(LINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(37);
					match(TEXT);
					}
					}
					setState(40); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				setState(42);
				match(EQ);
				setState(43);
				match(LINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(EQ);
				setState(45);
				match(LINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				match(LINE);
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

	public static class LayersContext extends ParserRuleContext {
		public List<LayeridContext> layerid() {
			return getRuleContexts(LayeridContext.class);
		}
		public LayeridContext layerid(int i) {
			return getRuleContext(LayeridContext.class,i);
		}
		public LayersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterLayers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitLayers(this);
		}
	}

	public final LayersContext layers() throws RecognitionException {
		LayersContext _localctx = new LayersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_layers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				layerid();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LAYER );
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

	public static class LayeridContext extends ParserRuleContext {
		public TerminalNode LAYER() { return getToken(GEParser.LAYER, 0); }
		public TerminalNode TEXT() { return getToken(GEParser.TEXT, 0); }
		public TerminalNode LAYEREND() { return getToken(GEParser.LAYEREND, 0); }
		public List<TerminalNode> LINE() { return getTokens(GEParser.LINE); }
		public TerminalNode LINE(int i) {
			return getToken(GEParser.LINE, i);
		}
		public LayeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).enterLayerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEListener ) ((GEListener)listener).exitLayerid(this);
		}
	}

	public final LayeridContext layerid() throws RecognitionException {
		LayeridContext _localctx = new LayeridContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_layerid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LAYER);
			setState(55);
			match(TEXT);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE) {
				{
				{
				setState(56);
				match(LINE);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(LAYEREND);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE) {
				{
				{
				setState(63);
				match(LINE);
				}
				}
				setState(68);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\tH\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\6\3\22\n\3\r\3\16\3\23"+
		"\3\4\6\4\27\n\4\r\4\16\4\30\3\4\3\4\6\4\35\n\4\r\4\16\4\36\3\4\3\4\6\4"+
		"#\n\4\r\4\16\4$\3\4\3\4\6\4)\n\4\r\4\16\4*\3\4\3\4\3\4\3\4\3\4\5\4\62"+
		"\n\4\3\5\6\5\65\n\5\r\5\16\5\66\3\6\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3"+
		"\6\3\6\7\6C\n\6\f\6\16\6F\13\6\3\6\2\2\7\2\4\6\b\n\2\2\2N\2\f\3\2\2\2"+
		"\4\21\3\2\2\2\6\61\3\2\2\2\b\64\3\2\2\2\n8\3\2\2\2\f\r\5\4\3\2\r\16\5"+
		"\b\5\2\16\17\7\3\2\2\17\3\3\2\2\2\20\22\5\6\4\2\21\20\3\2\2\2\22\23\3"+
		"\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\5\3\2\2\2\25\27\7\t\2\2\26\25\3"+
		"\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\62\7"+
		"\b\2\2\33\35\7\t\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3"+
		"\2\2\2\37 \3\2\2\2 \"\7\7\2\2!#\7\t\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2"+
		"\2$%\3\2\2\2%&\3\2\2\2&\62\7\b\2\2\')\7\t\2\2(\'\3\2\2\2)*\3\2\2\2*(\3"+
		"\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\7\2\2-\62\7\b\2\2./\7\7\2\2/\62\7\b\2\2"+
		"\60\62\7\b\2\2\61\26\3\2\2\2\61\34\3\2\2\2\61(\3\2\2\2\61.\3\2\2\2\61"+
		"\60\3\2\2\2\62\7\3\2\2\2\63\65\5\n\6\2\64\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\289\7\4\2\29=\7\t\2\2:<\7\b\2\2;"+
		":\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@D\7\5\2\2"+
		"AC\7\b\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\13\3\2\2\2FD\3\2\2"+
		"\2\13\23\30\36$*\61\66=D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}