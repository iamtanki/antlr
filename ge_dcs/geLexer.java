// Generated from ge.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class geLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, HEADCONTENT=4, ID=5, TEXT=6, LINE=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "HEADCONTENT", "ID", "ID_LETTER", "DIGIT", "TEXT", 
		"LINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'End'", "'Layer'", "'LayerEnd'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "HEADCONTENT", "ID", "TEXT", "LINE", "WS"
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


	public geLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ge.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nM\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6\64\13\6\3\7\3\7"+
		"\3\b\3\b\3\t\6\t;\n\t\r\t\16\t<\3\t\5\t@\n\t\3\n\5\nC\n\n\3\n\3\n\3\13"+
		"\6\13H\n\13\r\13\16\13I\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\2\17\2"+
		"\21\b\23\t\25\n\3\2\6\6\2C\\aac|~~\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\2P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\33\3\2\2\2\7!\3\2"+
		"\2\2\t*\3\2\2\2\13-\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21?\3\2\2\2\23"+
		"B\3\2\2\2\25G\3\2\2\2\27\30\7G\2\2\30\31\7p\2\2\31\32\7f\2\2\32\4\3\2"+
		"\2\2\33\34\7N\2\2\34\35\7c\2\2\35\36\7{\2\2\36\37\7g\2\2\37 \7t\2\2 \6"+
		"\3\2\2\2!\"\7N\2\2\"#\7c\2\2#$\7{\2\2$%\7g\2\2%&\7t\2\2&\'\7G\2\2\'(\7"+
		"p\2\2()\7f\2\2)\b\3\2\2\2*+\5\21\t\2+,\5\23\n\2,\n\3\2\2\2-\62\5\r\7\2"+
		".\61\5\r\7\2/\61\5\17\b\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\f\3\2\2\2\64\62\3\2\2\2\65\66\t\2\2\2\66\16"+
		"\3\2\2\2\678\t\3\2\28\20\3\2\2\29;\n\4\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2"+
		"\2<=\3\2\2\2=@\3\2\2\2>@\3\2\2\2?:\3\2\2\2?>\3\2\2\2@\22\3\2\2\2AC\7\17"+
		"\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\f\2\2E\24\3\2\2\2FH\t\5\2\2GF\3"+
		"\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\13\2\2L\26\3\2\2\2"+
		"\t\2\60\62<?BI\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}