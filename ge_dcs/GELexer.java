// Generated from GE.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, LIBEND=2, LIBDEF=3, OBJGROUP=4, LAYEREND=5, LAYERDEF=6, OBJEND=7, 
		OBJSTART=8, INT=9, LETTER=10, ID=11, LINE=12, WS=13, TEXT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EQ", "LIBEND", "LIBDEF", "OBJGROUP", "LAYEREND", "LAYERDEF", "OBJEND", 
		"OBJSTART", "INT", "LETTER", "ID", "LINE", "WS", "TEXT"
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


	public GELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GE.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\6\7M\n\7\r\7\16\7N\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\6\na\n\n\r\n\16\nb\3\13\3\13\3\f\3\f\3\f"+
		"\7\fj\n\f\f\f\16\fm\13\f\3\r\3\r\3\r\5\rr\n\r\3\16\6\16u\n\16\r\16\16"+
		"\16v\3\17\6\17z\n\17\r\17\16\17{\6\17~\n\17\r\17\16\17\177\3{\2\20\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2"+
		"\13\4\2IIii\4\2TTtt\4\2QQqq\4\2WWww\4\2RRrr\3\2\62;\4\2C\\c|\4\2\13\13"+
		"\"\"\4\2\f\f\17\17\2\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3"+
		"\2\2\2\5!\3\2\2\2\7(\3\2\2\2\t\62\3\2\2\2\13<\3\2\2\2\rE\3\2\2\2\17R\3"+
		"\2\2\2\21Y\3\2\2\2\23`\3\2\2\2\25d\3\2\2\2\27f\3\2\2\2\31q\3\2\2\2\33"+
		"t\3\2\2\2\35}\3\2\2\2\37 \7?\2\2 \4\3\2\2\2!\"\7N\2\2\"#\7k\2\2#$\7d\2"+
		"\2$%\7G\2\2%&\7p\2\2&\'\7f\2\2\'\6\3\2\2\2()\7N\2\2)*\7k\2\2*+\7d\2\2"+
		"+,\7F\2\2,-\7g\2\2-.\7h\2\2./\3\2\2\2/\60\7.\2\2\60\61\5\35\17\2\61\b"+
		"\3\2\2\2\62\63\7Q\2\2\63\64\7d\2\2\64\65\7l\2\2\65\66\3\2\2\2\66\67\t"+
		"\2\2\2\678\t\3\2\289\t\4\2\29:\t\5\2\2:;\t\6\2\2;\n\3\2\2\2<=\7N\2\2="+
		">\7c\2\2>?\7{\2\2?@\7g\2\2@A\7t\2\2AB\7G\2\2BC\7p\2\2CD\7f\2\2D\f\3\2"+
		"\2\2EF\7N\2\2FG\7c\2\2GH\7{\2\2HI\7g\2\2IJ\7t\2\2JL\3\2\2\2KM\5\33\16"+
		"\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\5\27\f\2Q\16\3"+
		"\2\2\2RS\7Q\2\2ST\7d\2\2TU\7l\2\2UV\7G\2\2VW\7p\2\2WX\7f\2\2X\20\3\2\2"+
		"\2YZ\7Q\2\2Z[\7d\2\2[\\\7l\2\2\\]\3\2\2\2]^\5\27\f\2^\22\3\2\2\2_a\t\7"+
		"\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\24\3\2\2\2de\t\b\2\2e\26"+
		"\3\2\2\2fk\5\25\13\2gj\5\25\13\2hj\5\23\n\2ig\3\2\2\2ih\3\2\2\2jm\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2l\30\3\2\2\2mk\3\2\2\2no\7\17\2\2or\7\f\2\2pr"+
		"\7\f\2\2qn\3\2\2\2qp\3\2\2\2r\32\3\2\2\2su\t\t\2\2ts\3\2\2\2uv\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2w\34\3\2\2\2xz\n\n\2\2yx\3\2\2\2z{\3\2\2\2{|\3\2\2"+
		"\2{y\3\2\2\2|~\3\2\2\2}y\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\36\3\2\2\2\13\2Nbikqv{\177\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}