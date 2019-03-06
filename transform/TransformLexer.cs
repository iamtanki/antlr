//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.7.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Transform.g4 by ANTLR 4.7.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7.1")]
[System.CLSCompliant(false)]
public partial class TransformLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		LP=1, RP=2, WS=3, COMMA=4, MATRIX=5, TRANSLATE=6, ROTATE=7, SCALE=8, SKEWX=9, 
		SKEWY=10, SKEW=11, NUMBER=12, INT=13, LINE=14;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"LP", "RP", "WS", "COMMA", "MATRIX", "TRANSLATE", "ROTATE", "SCALE", "SKEWX", 
		"SKEWY", "SKEW", "NUMBER", "EXP", "INT", "LINE"
	};


	public TransformLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public TransformLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'('", "')'", null, "','", "'matrix'", "'translate'", "'rotate'", 
		"'scale'", "'skewX'", "'skewY'", "'skew'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "LP", "RP", "WS", "COMMA", "MATRIX", "TRANSLATE", "ROTATE", "SCALE", 
		"SKEWX", "SKEWY", "SKEW", "NUMBER", "INT", "LINE"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Transform.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static TransformLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '\x10', '\x7F', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x3', 
		'\x2', '\x3', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', '\x6', 
		'\x4', '\'', '\n', '\x4', '\r', '\x4', '\xE', '\x4', '(', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', 
		'\a', '\x3', '\a', '\x3', '\a', '\x3', '\a', '\x3', '\a', '\x3', '\a', 
		'\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', 
		'\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\t', '\x3', '\t', 
		'\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\n', '\x3', 
		'\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\n', '\x3', '\v', 
		'\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', 
		'\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\r', 
		'\x5', '\r', ']', '\n', '\r', '\x3', '\r', '\x3', '\r', '\x3', '\r', '\x3', 
		'\r', '\x5', '\r', '\x63', '\n', '\r', '\x3', '\r', '\x5', '\r', '\x66', 
		'\n', '\r', '\x3', '\r', '\x3', '\r', '\x5', '\r', 'j', '\n', '\r', '\x5', 
		'\r', 'l', '\n', '\r', '\x3', '\xE', '\x3', '\xE', '\x5', '\xE', 'p', 
		'\n', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xF', '\x6', '\xF', 'u', 
		'\n', '\xF', '\r', '\xF', '\xE', '\xF', 'v', '\x3', '\x10', '\x3', '\x10', 
		'\x3', '\x10', '\x5', '\x10', '|', '\n', '\x10', '\x3', '\x10', '\x3', 
		'\x10', '\x2', '\x2', '\x11', '\x3', '\x3', '\x5', '\x4', '\a', '\x5', 
		'\t', '\x6', '\v', '\a', '\r', '\b', '\xF', '\t', '\x11', '\n', '\x13', 
		'\v', '\x15', '\f', '\x17', '\r', '\x19', '\xE', '\x1B', '\x2', '\x1D', 
		'\xF', '\x1F', '\x10', '\x3', '\x2', '\x5', '\x4', '\x2', '-', '-', '/', 
		'/', '\x4', '\x2', 'G', 'G', 'g', 'g', '\x3', '\x2', '\x32', ';', '\x2', 
		'\x86', '\x2', '\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\r', '\x3', '\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x1D', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1F', '\x3', '\x2', 
		'\x2', '\x2', '\x3', '!', '\x3', '\x2', '\x2', '\x2', '\x5', '#', '\x3', 
		'\x2', '\x2', '\x2', '\a', '&', '\x3', '\x2', '\x2', '\x2', '\t', '*', 
		'\x3', '\x2', '\x2', '\x2', '\v', ',', '\x3', '\x2', '\x2', '\x2', '\r', 
		'\x33', '\x3', '\x2', '\x2', '\x2', '\xF', '=', '\x3', '\x2', '\x2', '\x2', 
		'\x11', '\x44', '\x3', '\x2', '\x2', '\x2', '\x13', 'J', '\x3', '\x2', 
		'\x2', '\x2', '\x15', 'P', '\x3', '\x2', '\x2', '\x2', '\x17', 'V', '\x3', 
		'\x2', '\x2', '\x2', '\x19', 'k', '\x3', '\x2', '\x2', '\x2', '\x1B', 
		'm', '\x3', '\x2', '\x2', '\x2', '\x1D', 't', '\x3', '\x2', '\x2', '\x2', 
		'\x1F', '{', '\x3', '\x2', '\x2', '\x2', '!', '\"', '\a', '*', '\x2', 
		'\x2', '\"', '\x4', '\x3', '\x2', '\x2', '\x2', '#', '$', '\a', '+', '\x2', 
		'\x2', '$', '\x6', '\x3', '\x2', '\x2', '\x2', '%', '\'', '\a', '\"', 
		'\x2', '\x2', '&', '%', '\x3', '\x2', '\x2', '\x2', '\'', '(', '\x3', 
		'\x2', '\x2', '\x2', '(', '&', '\x3', '\x2', '\x2', '\x2', '(', ')', '\x3', 
		'\x2', '\x2', '\x2', ')', '\b', '\x3', '\x2', '\x2', '\x2', '*', '+', 
		'\a', '.', '\x2', '\x2', '+', '\n', '\x3', '\x2', '\x2', '\x2', ',', '-', 
		'\a', 'o', '\x2', '\x2', '-', '.', '\a', '\x63', '\x2', '\x2', '.', '/', 
		'\a', 'v', '\x2', '\x2', '/', '\x30', '\a', 't', '\x2', '\x2', '\x30', 
		'\x31', '\a', 'k', '\x2', '\x2', '\x31', '\x32', '\a', 'z', '\x2', '\x2', 
		'\x32', '\f', '\x3', '\x2', '\x2', '\x2', '\x33', '\x34', '\a', 'v', '\x2', 
		'\x2', '\x34', '\x35', '\a', 't', '\x2', '\x2', '\x35', '\x36', '\a', 
		'\x63', '\x2', '\x2', '\x36', '\x37', '\a', 'p', '\x2', '\x2', '\x37', 
		'\x38', '\a', 'u', '\x2', '\x2', '\x38', '\x39', '\a', 'n', '\x2', '\x2', 
		'\x39', ':', '\a', '\x63', '\x2', '\x2', ':', ';', '\a', 'v', '\x2', '\x2', 
		';', '<', '\a', 'g', '\x2', '\x2', '<', '\xE', '\x3', '\x2', '\x2', '\x2', 
		'=', '>', '\a', 't', '\x2', '\x2', '>', '?', '\a', 'q', '\x2', '\x2', 
		'?', '@', '\a', 'v', '\x2', '\x2', '@', '\x41', '\a', '\x63', '\x2', '\x2', 
		'\x41', '\x42', '\a', 'v', '\x2', '\x2', '\x42', '\x43', '\a', 'g', '\x2', 
		'\x2', '\x43', '\x10', '\x3', '\x2', '\x2', '\x2', '\x44', '\x45', '\a', 
		'u', '\x2', '\x2', '\x45', '\x46', '\a', '\x65', '\x2', '\x2', '\x46', 
		'G', '\a', '\x63', '\x2', '\x2', 'G', 'H', '\a', 'n', '\x2', '\x2', 'H', 
		'I', '\a', 'g', '\x2', '\x2', 'I', '\x12', '\x3', '\x2', '\x2', '\x2', 
		'J', 'K', '\a', 'u', '\x2', '\x2', 'K', 'L', '\a', 'm', '\x2', '\x2', 
		'L', 'M', '\a', 'g', '\x2', '\x2', 'M', 'N', '\a', 'y', '\x2', '\x2', 
		'N', 'O', '\a', 'Z', '\x2', '\x2', 'O', '\x14', '\x3', '\x2', '\x2', '\x2', 
		'P', 'Q', '\a', 'u', '\x2', '\x2', 'Q', 'R', '\a', 'm', '\x2', '\x2', 
		'R', 'S', '\a', 'g', '\x2', '\x2', 'S', 'T', '\a', 'y', '\x2', '\x2', 
		'T', 'U', '\a', '[', '\x2', '\x2', 'U', '\x16', '\x3', '\x2', '\x2', '\x2', 
		'V', 'W', '\a', 'u', '\x2', '\x2', 'W', 'X', '\a', 'm', '\x2', '\x2', 
		'X', 'Y', '\a', 'g', '\x2', '\x2', 'Y', 'Z', '\a', 'y', '\x2', '\x2', 
		'Z', '\x18', '\x3', '\x2', '\x2', '\x2', '[', ']', '\t', '\x2', '\x2', 
		'\x2', '\\', '[', '\x3', '\x2', '\x2', '\x2', '\\', ']', '\x3', '\x2', 
		'\x2', '\x2', ']', '^', '\x3', '\x2', '\x2', '\x2', '^', '_', '\x5', '\x1D', 
		'\xF', '\x2', '_', '`', '\a', '\x30', '\x2', '\x2', '`', '\x62', '\x5', 
		'\x1D', '\xF', '\x2', '\x61', '\x63', '\x5', '\x1B', '\xE', '\x2', '\x62', 
		'\x61', '\x3', '\x2', '\x2', '\x2', '\x62', '\x63', '\x3', '\x2', '\x2', 
		'\x2', '\x63', 'l', '\x3', '\x2', '\x2', '\x2', '\x64', '\x66', '\t', 
		'\x2', '\x2', '\x2', '\x65', '\x64', '\x3', '\x2', '\x2', '\x2', '\x65', 
		'\x66', '\x3', '\x2', '\x2', '\x2', '\x66', 'g', '\x3', '\x2', '\x2', 
		'\x2', 'g', 'i', '\x5', '\x1D', '\xF', '\x2', 'h', 'j', '\x5', '\x1B', 
		'\xE', '\x2', 'i', 'h', '\x3', '\x2', '\x2', '\x2', 'i', 'j', '\x3', '\x2', 
		'\x2', '\x2', 'j', 'l', '\x3', '\x2', '\x2', '\x2', 'k', '\\', '\x3', 
		'\x2', '\x2', '\x2', 'k', '\x65', '\x3', '\x2', '\x2', '\x2', 'l', '\x1A', 
		'\x3', '\x2', '\x2', '\x2', 'm', 'o', '\t', '\x3', '\x2', '\x2', 'n', 
		'p', '\t', '\x2', '\x2', '\x2', 'o', 'n', '\x3', '\x2', '\x2', '\x2', 
		'o', 'p', '\x3', '\x2', '\x2', '\x2', 'p', 'q', '\x3', '\x2', '\x2', '\x2', 
		'q', 'r', '\x5', '\x1D', '\xF', '\x2', 'r', '\x1C', '\x3', '\x2', '\x2', 
		'\x2', 's', 'u', '\t', '\x4', '\x2', '\x2', 't', 's', '\x3', '\x2', '\x2', 
		'\x2', 'u', 'v', '\x3', '\x2', '\x2', '\x2', 'v', 't', '\x3', '\x2', '\x2', 
		'\x2', 'v', 'w', '\x3', '\x2', '\x2', '\x2', 'w', '\x1E', '\x3', '\x2', 
		'\x2', '\x2', 'x', 'y', '\a', '\xF', '\x2', '\x2', 'y', '|', '\a', '\f', 
		'\x2', '\x2', 'z', '|', '\a', '\f', '\x2', '\x2', '{', 'x', '\x3', '\x2', 
		'\x2', '\x2', '{', 'z', '\x3', '\x2', '\x2', '\x2', '|', '}', '\x3', '\x2', 
		'\x2', '\x2', '}', '~', '\b', '\x10', '\x2', '\x2', '~', ' ', '\x3', '\x2', 
		'\x2', '\x2', '\f', '\x2', '(', '\\', '\x62', '\x65', 'i', 'k', 'o', 'v', 
		'{', '\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
