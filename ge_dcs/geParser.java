// Generated from ge.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class geParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, HEADCONTENT=17, 
		ID=18, TEXT=19, LINE=20, WS=21;
	public static final int
		RULE_file = 0, RULE_desc = 1, RULE_headers = 2, RULE_head = 3, RULE_layers = 4, 
		RULE_layer = 5;
	public static final String[] ruleNames = {
		"file", "desc", "headers", "head", "layers", "layer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'End'", "'Version'", "'='", "'Description'", "'Template'", "'Size'", 
		"'background'", "'backBmpFile'", "'Period'", "'leftfig'", "'rightfig'", 
		"'downfig'", "'upfig'", "'TranslateKeyFile'", "'Layer'", "'LayerEnd'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "HEADCONTENT", "ID", "TEXT", "LINE", "WS"
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
	public String getGrammarFileName() { return "ge.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public geParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
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
			if ( listener instanceof geListener ) ((geListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			desc();
			setState(13);
			headers();
			setState(14);
			layers();
			setState(15);
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

	public static class DescContext extends ParserRuleContext {
		public TerminalNode HEADCONTENT() { return getToken(geParser.HEADCONTENT, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).exitDesc(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(HEADCONTENT);
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
			if ( listener instanceof geListener ) ((geListener)listener).enterHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).exitHeaders(this);
		}
	}

	public final HeadersContext headers() throws RecognitionException {
		HeadersContext _localctx = new HeadersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_headers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				head();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << TEXT))) != 0) );
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
		public TerminalNode HEADCONTENT() { return getToken(geParser.HEADCONTENT, 0); }
		public TerminalNode TEXT() { return getToken(geParser.TEXT, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_head);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(T__1);
				setState(25);
				match(T__2);
				setState(26);
				match(HEADCONTENT);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(T__3);
				setState(28);
				match(T__2);
				setState(29);
				match(HEADCONTENT);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(T__4);
				setState(31);
				match(T__2);
				setState(32);
				match(HEADCONTENT);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(T__5);
				setState(34);
				match(T__2);
				setState(35);
				match(HEADCONTENT);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				match(T__6);
				setState(37);
				match(T__2);
				setState(38);
				match(HEADCONTENT);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				match(T__7);
				setState(40);
				match(T__2);
				setState(41);
				match(HEADCONTENT);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				match(T__8);
				setState(43);
				match(T__2);
				setState(44);
				match(HEADCONTENT);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				match(T__9);
				setState(46);
				match(T__2);
				setState(47);
				match(HEADCONTENT);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 9);
				{
				setState(48);
				match(T__10);
				setState(49);
				match(T__2);
				setState(50);
				match(HEADCONTENT);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 10);
				{
				setState(51);
				match(T__11);
				setState(52);
				match(T__2);
				setState(53);
				match(HEADCONTENT);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 11);
				{
				setState(54);
				match(T__12);
				setState(55);
				match(T__2);
				setState(56);
				match(HEADCONTENT);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 12);
				{
				setState(57);
				match(T__13);
				setState(58);
				match(T__2);
				setState(59);
				match(HEADCONTENT);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 13);
				{
				setState(60);
				match(TEXT);
				setState(61);
				match(T__2);
				setState(62);
				match(HEADCONTENT);
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

	public static class LayersContext extends ParserRuleContext {
		public List<LayerContext> layer() {
			return getRuleContexts(LayerContext.class);
		}
		public LayerContext layer(int i) {
			return getRuleContext(LayerContext.class,i);
		}
		public LayersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).enterLayers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).exitLayers(this);
		}
	}

	public final LayersContext layers() throws RecognitionException {
		LayersContext _localctx = new LayersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_layers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				layer();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
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
		public List<TerminalNode> TEXT() { return getTokens(geParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(geParser.TEXT, i);
		}
		public LayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).enterLayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof geListener ) ((geListener)listener).exitLayer(this);
		}
	}

	public final LayerContext layer() throws RecognitionException {
		LayerContext _localctx = new LayerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_layer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__14);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(71);
				match(TEXT);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__15);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\6\4"+
		"\27\n\4\r\4\16\4\30\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n\5\3\6\6\6E\n\6\r\6\16\6F\3"+
		"\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2Z\2"+
		"\16\3\2\2\2\4\23\3\2\2\2\6\26\3\2\2\2\bA\3\2\2\2\nD\3\2\2\2\fH\3\2\2\2"+
		"\16\17\5\4\3\2\17\20\5\6\4\2\20\21\5\n\6\2\21\22\7\3\2\2\22\3\3\2\2\2"+
		"\23\24\7\23\2\2\24\5\3\2\2\2\25\27\5\b\5\2\26\25\3\2\2\2\27\30\3\2\2\2"+
		"\30\26\3\2\2\2\30\31\3\2\2\2\31\7\3\2\2\2\32\33\7\4\2\2\33\34\7\5\2\2"+
		"\34B\7\23\2\2\35\36\7\6\2\2\36\37\7\5\2\2\37B\7\23\2\2 !\7\7\2\2!\"\7"+
		"\5\2\2\"B\7\23\2\2#$\7\b\2\2$%\7\5\2\2%B\7\23\2\2&\'\7\t\2\2\'(\7\5\2"+
		"\2(B\7\23\2\2)*\7\n\2\2*+\7\5\2\2+B\7\23\2\2,-\7\13\2\2-.\7\5\2\2.B\7"+
		"\23\2\2/\60\7\f\2\2\60\61\7\5\2\2\61B\7\23\2\2\62\63\7\r\2\2\63\64\7\5"+
		"\2\2\64B\7\23\2\2\65\66\7\16\2\2\66\67\7\5\2\2\67B\7\23\2\289\7\17\2\2"+
		"9:\7\5\2\2:B\7\23\2\2;<\7\20\2\2<=\7\5\2\2=B\7\23\2\2>?\7\25\2\2?@\7\5"+
		"\2\2@B\7\23\2\2A\32\3\2\2\2A\35\3\2\2\2A \3\2\2\2A#\3\2\2\2A&\3\2\2\2"+
		"A)\3\2\2\2A,\3\2\2\2A/\3\2\2\2A\62\3\2\2\2A\65\3\2\2\2A8\3\2\2\2A;\3\2"+
		"\2\2A>\3\2\2\2B\t\3\2\2\2CE\5\f\7\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2G\13\3\2\2\2HL\7\21\2\2IK\7\25\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2"+
		"LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\22\2\2P\r\3\2\2\2\6\30AFL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}