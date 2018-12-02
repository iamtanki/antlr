// Generated from cymbol.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cymbolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, INT=23, FLOAT=24, STRING=25, 
		LINE_COMMENT=26, COMMENT=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "ID", "ID_LETTER", "INT", "FLOAT", 
		"DIGIT", "STRING", "ESC", "LINE_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'float'", "'int'", "'void'", "'('", "')'", "','", 
		"'{'", "'}'", "'if'", "'then'", "'else'", "'return'", "'['", "']'", "'-'", 
		"'!'", "'*'", "'+'", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"FLOAT", "STRING", "LINE_COMMENT", "COMMENT", "WS"
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


	public cymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cymbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00db\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\7\27\u0085\n\27\f\27\16\27\u0088\13\27\3\30\3"+
		"\30\3\31\6\31\u008d\n\31\r\31\16\31\u008e\3\32\6\32\u0092\n\32\r\32\16"+
		"\32\u0093\3\32\3\32\7\32\u0098\n\32\f\32\16\32\u009b\13\32\3\32\3\32\6"+
		"\32\u009f\n\32\r\32\16\32\u00a0\5\32\u00a3\n\32\3\33\3\33\3\34\3\34\3"+
		"\34\7\34\u00aa\n\34\f\34\16\34\u00ad\13\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\5\35\u00b5\n\35\3\36\3\36\3\36\3\36\7\36\u00bb\n\36\f\36\16\36\u00be"+
		"\13\36\3\36\5\36\u00c1\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7"+
		"\37\u00cb\n\37\f\37\16\37\u00ce\13\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u00d6"+
		"\n \r \16 \u00d7\3 \3 \5\u00ab\u00bc\u00cc\2!\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\2\61\31\63\32\65\2\67\339\2;\34=\35?\36\3\2\5\6\2C\\aac|~~\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2\u00e5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tK\3\2\2\2"+
		"\13O\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23Z\3\2\2\2\25\\\3\2\2"+
		"\2\27^\3\2\2\2\31a\3\2\2\2\33f\3\2\2\2\35k\3\2\2\2\37r\3\2\2\2!t\3\2\2"+
		"\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3\2\2\2+~\3\2\2\2-\u0081\3\2\2\2/"+
		"\u0089\3\2\2\2\61\u008c\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67\u00a6"+
		"\3\2\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=\u00c6\3\2\2\2?\u00d5\3\2\2\2A"+
		"B\7?\2\2B\4\3\2\2\2CD\7=\2\2D\6\3\2\2\2EF\7h\2\2FG\7n\2\2GH\7q\2\2HI\7"+
		"c\2\2IJ\7v\2\2J\b\3\2\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2N\n\3\2\2\2OP\7x\2"+
		"\2PQ\7q\2\2QR\7k\2\2RS\7f\2\2S\f\3\2\2\2TU\7*\2\2U\16\3\2\2\2VW\7+\2\2"+
		"W\20\3\2\2\2XY\7.\2\2Y\22\3\2\2\2Z[\7}\2\2[\24\3\2\2\2\\]\7\177\2\2]\26"+
		"\3\2\2\2^_\7k\2\2_`\7h\2\2`\30\3\2\2\2ab\7v\2\2bc\7j\2\2cd\7g\2\2de\7"+
		"p\2\2e\32\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\34\3\2\2\2kl\7"+
		"t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2op\7t\2\2pq\7p\2\2q\36\3\2\2\2rs\7]\2"+
		"\2s \3\2\2\2tu\7_\2\2u\"\3\2\2\2vw\7/\2\2w$\3\2\2\2xy\7#\2\2y&\3\2\2\2"+
		"z{\7,\2\2{(\3\2\2\2|}\7-\2\2}*\3\2\2\2~\177\7?\2\2\177\u0080\7?\2\2\u0080"+
		",\3\2\2\2\u0081\u0086\5/\30\2\u0082\u0085\5/\30\2\u0083\u0085\5\65\33"+
		"\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087.\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\t\2\2\2\u008a\60\3\2\2\2\u008b\u008d\t\3\2\2\u008c\u008b\3\2\2"+
		"\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\62"+
		"\3\2\2\2\u0090\u0092\5\65\33\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0099"+
		"\7\60\2\2\u0096\u0098\5\65\33\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a3\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009e\7\60\2\2\u009d\u009f\5\65\33\2\u009e\u009d\3\2\2"+
		"\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u0091\3\2\2\2\u00a2\u009c\3\2\2\2\u00a3\64\3\2\2\2\u00a4"+
		"\u00a5\t\3\2\2\u00a5\66\3\2\2\2\u00a6\u00ab\7$\2\2\u00a7\u00aa\59\35\2"+
		"\u00a8\u00aa\13\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7$\2\2\u00af8\3\2\2\2\u00b0\u00b1\7^\2\2\u00b1"+
		"\u00b5\7$\2\2\u00b2\u00b3\7^\2\2\u00b3\u00b5\7^\2\2\u00b4\u00b0\3\2\2"+
		"\2\u00b4\u00b2\3\2\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8"+
		"\7\61\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\13\2\2\2\u00ba\u00b9\3\2\2\2"+
		"\u00bb\u00be\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\7\17\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c5\b\36\2\2\u00c5<\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7"+
		"\u00c8\7,\2\2\u00c8\u00cc\3\2\2\2\u00c9\u00cb\13\2\2\2\u00ca\u00c9\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7,\2\2\u00d0\u00d1\7\61"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\37\2\2\u00d3>\3\2\2\2\u00d4\u00d6"+
		"\t\4\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b \2\2\u00da@\3\2\2\2\21"+
		"\2\u0084\u0086\u008e\u0093\u0099\u00a0\u00a2\u00a9\u00ab\u00b4\u00bc\u00c0"+
		"\u00cc\u00d7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}