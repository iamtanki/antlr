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
		LAYER=1, LAYEREND=2, OBJSTART=3, OBJEND=4, END=5, EQ=6, ID=7, LINE=8, 
		WS=9, WSLINE=10, TEXT=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LAYER", "LAYEREND", "OBJSTART", "OBJEND", "END", "EQ", "ID", "LINE", 
		"WS", "WSLINE", "TEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Layer'", "'LayerEnd'", "'ObjAlmHis'", "'ObjEnd'", "'END'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LAYER", "LAYEREND", "OBJSTART", "OBJEND", "END", "EQ", "ID", "LINE", 
		"WS", "WSLINE", "TEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rb\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\6\bA\n\b\r\b\16\bB\3\t\5\tF\n\t\3\t\3\t\3"+
		"\n\6\nK\n\n\r\n\16\nL\3\n\3\n\3\13\7\13R\n\13\f\13\16\13U\13\13\3\13\5"+
		"\13X\n\13\3\13\3\13\3\13\3\13\3\f\6\f_\n\f\r\f\16\f`\3`\2\r\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\6\4\2C\\c|\5\2\13\13\17"+
		"\17\"\"\4\2\13\13\"\"\4\2\f\f\17\17\2g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\37\3\2\2\2\7(\3\2"+
		"\2\2\t\62\3\2\2\2\139\3\2\2\2\r=\3\2\2\2\17@\3\2\2\2\21E\3\2\2\2\23J\3"+
		"\2\2\2\25S\3\2\2\2\27^\3\2\2\2\31\32\7N\2\2\32\33\7c\2\2\33\34\7{\2\2"+
		"\34\35\7g\2\2\35\36\7t\2\2\36\4\3\2\2\2\37 \7N\2\2 !\7c\2\2!\"\7{\2\2"+
		"\"#\7g\2\2#$\7t\2\2$%\7G\2\2%&\7p\2\2&\'\7f\2\2\'\6\3\2\2\2()\7Q\2\2)"+
		"*\7d\2\2*+\7l\2\2+,\7C\2\2,-\7n\2\2-.\7o\2\2./\7J\2\2/\60\7k\2\2\60\61"+
		"\7u\2\2\61\b\3\2\2\2\62\63\7Q\2\2\63\64\7d\2\2\64\65\7l\2\2\65\66\7G\2"+
		"\2\66\67\7p\2\2\678\7f\2\28\n\3\2\2\29:\7G\2\2:;\7P\2\2;<\7F\2\2<\f\3"+
		"\2\2\2=>\7?\2\2>\16\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC"+
		"\3\2\2\2C\20\3\2\2\2DF\7\17\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\f\2"+
		"\2H\22\3\2\2\2IK\t\3\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2"+
		"\2\2NO\b\n\2\2O\24\3\2\2\2PR\t\4\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3"+
		"\2\2\2TW\3\2\2\2US\3\2\2\2VX\7\17\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ"+
		"\7\f\2\2Z[\3\2\2\2[\\\b\13\2\2\\\26\3\2\2\2]_\n\5\2\2^]\3\2\2\2_`\3\2"+
		"\2\2`a\3\2\2\2`^\3\2\2\2a\30\3\2\2\2\t\2BELSW`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}