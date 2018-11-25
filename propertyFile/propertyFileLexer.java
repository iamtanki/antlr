// Generated from propertyFile.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class propertyFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ID=3, INT=4, FLOAT=5, STRING=6, LINE_COMMENT=7, COMMENT=8, 
		WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ID", "ID_LETTER", "INT", "FLOAT", "DIGIT", "STRING", 
		"ESC", "LINE_COMMENT", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ID", "INT", "FLOAT", "STRING", "LINE_COMMENT", "COMMENT", 
		"WS"
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


	    void startFile() {}
	    void finishFile() {}
	    void defineProperty(Token name, Token value) {}


	public propertyFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "propertyFile.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4#\n\4\f\4\16\4&\13"+
		"\4\3\5\3\5\3\6\6\6+\n\6\r\6\16\6,\3\7\6\7\60\n\7\r\7\16\7\61\3\7\3\7\7"+
		"\7\66\n\7\f\7\16\79\13\7\3\7\3\7\6\7=\n\7\r\7\16\7>\5\7A\n\7\3\b\3\b\3"+
		"\t\3\t\3\t\7\tH\n\t\f\t\16\tK\13\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nS\n\n\3"+
		"\13\3\13\3\13\3\13\7\13Y\n\13\f\13\16\13\\\13\13\3\13\5\13_\n\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fi\n\f\f\f\16\fl\13\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\6\rt\n\r\r\r\16\ru\3\r\3\r\5IZj\2\16\3\3\5\4\7\5\t\2\13\6\r"+
		"\7\17\2\21\b\23\2\25\t\27\n\31\13\3\2\5\6\2C\\aac|~~\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3"+
		"\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t\'\3\2\2\2\13*\3\2\2\2\r@\3\2\2\2\17"+
		"B\3\2\2\2\21D\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27d\3\2\2\2\31s\3\2\2\2"+
		"\33\34\7?\2\2\34\4\3\2\2\2\35\36\7\f\2\2\36\6\3\2\2\2\37$\5\t\5\2 #\5"+
		"\t\5\2!#\5\17\b\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2"+
		"%\b\3\2\2\2&$\3\2\2\2\'(\t\2\2\2(\n\3\2\2\2)+\t\3\2\2*)\3\2\2\2+,\3\2"+
		"\2\2,*\3\2\2\2,-\3\2\2\2-\f\3\2\2\2.\60\5\17\b\2/.\3\2\2\2\60\61\3\2\2"+
		"\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\67\7\60\2\2\64\66\5\17\b"+
		"\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28A\3\2\2\29\67\3"+
		"\2\2\2:<\7\60\2\2;=\5\17\b\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?"+
		"A\3\2\2\2@/\3\2\2\2@:\3\2\2\2A\16\3\2\2\2BC\t\3\2\2C\20\3\2\2\2DI\7$\2"+
		"\2EH\5\23\n\2FH\13\2\2\2GE\3\2\2\2GF\3\2\2\2HK\3\2\2\2IJ\3\2\2\2IG\3\2"+
		"\2\2JL\3\2\2\2KI\3\2\2\2LM\7$\2\2M\22\3\2\2\2NO\7^\2\2OS\7$\2\2PQ\7^\2"+
		"\2QS\7^\2\2RN\3\2\2\2RP\3\2\2\2S\24\3\2\2\2TU\7\61\2\2UV\7\61\2\2VZ\3"+
		"\2\2\2WY\13\2\2\2XW\3\2\2\2Y\\\3\2\2\2Z[\3\2\2\2ZX\3\2\2\2[^\3\2\2\2\\"+
		"Z\3\2\2\2]_\7\17\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\f\2\2ab\3\2\2\2"+
		"bc\b\13\2\2c\26\3\2\2\2de\7\61\2\2ef\7,\2\2fj\3\2\2\2gi\13\2\2\2hg\3\2"+
		"\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7,\2\2no\7\61"+
		"\2\2op\3\2\2\2pq\b\f\2\2q\30\3\2\2\2rt\t\4\2\2sr\3\2\2\2tu\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\r\2\2x\32\3\2\2\2\21\2\"$,\61\67>@GIRZ"+
		"^ju\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}