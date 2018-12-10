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
		LAYEREND=1, LAYERDEF=2, OBJEND=3, OBJSTART=4, END=5, EQ=6, ID=7, LINE=8, 
		WS=9, TEXT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LAYEREND", "LAYERDEF", "OBJEND", "OBJSTART", "END", "EQ", "ID", "LINE", 
		"WS", "TEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fk\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6"+
		"\3(\n\3\r\3\16\3)\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\66\n\4\f"+
		"\4\16\49\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\3\b\6\bS\n\b\r\b\16\bT\3"+
		"\t\5\tX\n\t\3\t\3\t\3\n\6\n]\n\n\r\n\16\n^\3\n\3\n\3\13\6\13d\n\13\r\13"+
		"\16\13e\6\13h\n\13\r\13\16\13i\3e\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\3\2\5\4\2C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2s\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5 \3\2\2\2"+
		"\7-\3\2\2\2\t:\3\2\2\2\13E\3\2\2\2\rO\3\2\2\2\17R\3\2\2\2\21W\3\2\2\2"+
		"\23\\\3\2\2\2\25g\3\2\2\2\27\30\7N\2\2\30\31\7c\2\2\31\32\7{\2\2\32\33"+
		"\7g\2\2\33\34\7t\2\2\34\35\7G\2\2\35\36\7p\2\2\36\37\7f\2\2\37\4\3\2\2"+
		"\2 !\7N\2\2!\"\7c\2\2\"#\7{\2\2#$\7g\2\2$%\7t\2\2%\'\3\2\2\2&(\5\23\n"+
		"\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\5\17\b\2,\6\3"+
		"\2\2\2-.\7Q\2\2./\7d\2\2/\60\7l\2\2\60\61\7G\2\2\61\62\7p\2\2\62\63\7"+
		"f\2\2\63\67\3\2\2\2\64\66\5\21\t\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28\b\3\2\2\29\67\3\2\2\2:;\7Q\2\2;<\7d\2\2<=\7l\2\2=>\3"+
		"\2\2\2>B\5\17\b\2?A\5\21\t\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C"+
		"\n\3\2\2\2DB\3\2\2\2EF\7G\2\2FG\7P\2\2GH\7F\2\2HL\3\2\2\2IK\5\21\t\2J"+
		"I\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\f\3\2\2\2NL\3\2\2\2OP\7?\2\2"+
		"P\16\3\2\2\2QS\t\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\20\3\2"+
		"\2\2VX\7\17\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\f\2\2Z\22\3\2\2\2[]"+
		"\t\3\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\b\n\2\2"+
		"a\24\3\2\2\2bd\n\4\2\2cb\3\2\2\2de\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2\2"+
		"\2gc\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\26\3\2\2\2\f\2)\67BLTW^ei"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}