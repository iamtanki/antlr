// Generated from GE_Expr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GE_ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, EQ=6, STRING=7, RGB=8, EXID=9, 
		ID=10, INT=11, LINE=12, WS=13, CC=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "EQ", "STRING", "RGB", "EXID", 
		"ID", "INT", "LINE", "WS", "CC"
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


	public GE_ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GE_Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b.\n\b\f\b\16\b\61\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nY\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\5\f\u008d\n\f\3"+
		"\f\6\f\u0090\n\f\r\f\16\f\u0091\3\r\3\r\3\r\5\r\u0097\n\r\3\16\6\16\u009a"+
		"\n\16\r\16\16\16\u009b\3\17\6\17\u009f\n\17\r\17\16\17\u00a0\4/\u00a0"+
		"\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\3\2\32\4\2TTtt\4\2IIii\4\2DDdd\4\2RRrr\4\2GGgg\4\2PPpp\4\2VVvv\4\2"+
		"QQqq\4\2MMmm\4\2EEee\4\2NNnn\4\2CCcc\4\2YYyy\4\2UUuu\4\2\\\\||\4\2OOo"+
		"o\4\2WWww\4\2JJjj\4\2FFff\4\2HHhh\4\2[[{{\4\2--//\3\2\62;\4\2\13\13\""+
		"\"\2\u00ba\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2"+
		"\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21\64\3\2"+
		"\2\2\23X\3\2\2\2\25\u0089\3\2\2\2\27\u008c\3\2\2\2\31\u0096\3\2\2\2\33"+
		"\u0099\3\2\2\2\35\u009e\3\2\2\2\37 \7.\2\2 \4\3\2\2\2!\"\7*\2\2\"\6\3"+
		"\2\2\2#$\7+\2\2$\b\3\2\2\2%&\7]\2\2&\n\3\2\2\2\'(\7_\2\2(\f\3\2\2\2)*"+
		"\7?\2\2*\16\3\2\2\2+/\7$\2\2,.\13\2\2\2-,\3\2\2\2.\61\3\2\2\2/\60\3\2"+
		"\2\2/-\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7$\2\2\63\20\3\2\2\2\64"+
		"\65\t\2\2\2\65\66\t\3\2\2\66\67\t\4\2\2\67\22\3\2\2\289\t\5\2\29:\t\6"+
		"\2\2:Y\t\7\2\2;<\7W\2\2<Y\7r\2\2=>\t\5\2\2>?\t\b\2\2?Y\5\27\f\2@A\t\5"+
		"\2\2AB\t\t\2\2BC\t\n\2\2CY\t\6\2\2DE\t\13\2\2EF\t\t\2\2FG\t\f\2\2GH\t"+
		"\t\2\2HI\t\2\2\2IY\5\27\f\2JK\t\r\2\2KL\t\2\2\2LM\t\2\2\2MN\t\t\2\2NY"+
		"\t\16\2\2OP\t\17\2\2PY\t\20\2\2QR\t\2\2\2RY\t\21\2\2ST\t\4\2\2TU\t\2\2"+
		"\2UV\t\22\2\2VW\t\17\2\2WY\t\23\2\2X8\3\2\2\2X;\3\2\2\2X=\3\2\2\2X@\3"+
		"\2\2\2XD\3\2\2\2XJ\3\2\2\2XO\3\2\2\2XQ\3\2\2\2XS\3\2\2\2Y\24\3\2\2\2Z"+
		"[\t\22\2\2[\\\t\5\2\2\\\u008a\t\b\2\2]^\7W\2\2^\u008a\7R\2\2_`\t\4\2\2"+
		"`a\t\21\2\2a\u008a\t\5\2\2bc\t\13\2\2cd\t\21\2\2d\u008a\t\24\2\2ef\t\17"+
		"\2\2fg\t\b\2\2g\u008a\t\13\2\2hi\t\r\2\2ij\t\13\2\2j\u008a\t\13\2\2kl"+
		"\t\5\2\2lm\t\r\2\2mn\t\2\2\2n\u008a\t\r\2\2op\t\25\2\2pq\t\7\2\2q\u008a"+
		"\t\b\2\2rs\t\24\2\2st\t\26\2\2t\u008a\t\7\2\2uv\t\r\2\2vw\t\22\2\2wx\t"+
		"\b\2\2xy\t\t\2\2yz\t\16\2\2z{\t\2\2\2{|\t\r\2\2|\u008a\t\5\2\2}~\t\b\2"+
		"\2~\177\t\2\2\2\177\u0080\t\r\2\2\u0080\u0081\t\7\2\2\u0081\u0082\t\17"+
		"\2\2\u0082\u0083\t\f\2\2\u0083\u0084\t\r\2\2\u0084\u0085\t\b\2\2\u0085"+
		"\u008a\t\6\2\2\u0086\u0087\t\17\2\2\u0087\u0088\t\b\2\2\u0088\u008a\t"+
		"\2\2\2\u0089Z\3\2\2\2\u0089]\3\2\2\2\u0089_\3\2\2\2\u0089b\3\2\2\2\u0089"+
		"e\3\2\2\2\u0089h\3\2\2\2\u0089k\3\2\2\2\u0089o\3\2\2\2\u0089r\3\2\2\2"+
		"\u0089u\3\2\2\2\u0089}\3\2\2\2\u0089\u0086\3\2\2\2\u008a\26\3\2\2\2\u008b"+
		"\u008d\t\27\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3"+
		"\2\2\2\u008e\u0090\t\30\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\30\3\2\2\2\u0093\u0094\7\17\2"+
		"\2\u0094\u0097\7\f\2\2\u0095\u0097\7\f\2\2\u0096\u0093\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\32\3\2\2\2\u0098\u009a\t\31\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\34\3\2\2"+
		"\2\u009d\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\36\3\2\2\2\13\2/X\u0089\u008c"+
		"\u0091\u0096\u009b\u00a0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}