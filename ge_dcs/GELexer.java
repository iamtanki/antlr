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
		T__0=1, LAYER=2, LAYEREND=3, END=4, EQ=5, LINE=6, TEXT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "LAYER", "LAYEREND", "END", "EQ", "LINE", "TEXT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t8\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\5\7,\n\7\3\7\3\7\3\b\6\b\61\n\b\r\b\16\b\62\6\b\65\n\b\r\b"+
		"\16\b\66\3\66\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\3\6\2\f\f\17\17\""+
		"\"??\2:\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\25\3\2\2\2\7\33\3\2\2\2\t$\3\2"+
		"\2\2\13(\3\2\2\2\r+\3\2\2\2\17\64\3\2\2\2\21\22\7G\2\2\22\23\7p\2\2\23"+
		"\24\7f\2\2\24\4\3\2\2\2\25\26\7N\2\2\26\27\7c\2\2\27\30\7{\2\2\30\31\7"+
		"g\2\2\31\32\7t\2\2\32\6\3\2\2\2\33\34\7N\2\2\34\35\7c\2\2\35\36\7{\2\2"+
		"\36\37\7g\2\2\37 \7t\2\2 !\7G\2\2!\"\7p\2\2\"#\7f\2\2#\b\3\2\2\2$%\7G"+
		"\2\2%&\7P\2\2&\'\7F\2\2\'\n\3\2\2\2()\7?\2\2)\f\3\2\2\2*,\7\17\2\2+*\3"+
		"\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\f\2\2.\16\3\2\2\2/\61\n\2\2\2\60/\3\2\2"+
		"\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\60\3\2\2"+
		"\2\65\66\3\2\2\2\66\67\3\2\2\2\66\64\3\2\2\2\67\20\3\2\2\2\6\2+\62\66"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}