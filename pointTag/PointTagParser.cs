//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.7.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from PointTag.g4 by ANTLR 4.7.1

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
using System.Diagnostics;
using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.7.1")]
[System.CLSCompliant(false)]
public partial class PointTagParser : Parser {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		STRING=1, IF=2, PREADD=3, POSTADD=4, REPLACE=5, PRE=6, POST=7, INFIX=8, 
		LINE=9, WS=10, EQ=11, LB=12, RB=13, LP=14, RP=15, LCB=16, RCB=17, COMMA=18, 
		SEMI=19, STAR=20, QUOT=21, CC=22;
	public const int
		RULE_prog = 0, RULE_statements = 1, RULE_statement = 2, RULE_ifStat = 3, 
		RULE_condition = 4, RULE_value = 5, RULE_other_value = 6, RULE_other = 7;
	public static readonly string[] ruleNames = {
		"prog", "statements", "statement", "ifStat", "condition", "value", "other_value", 
		"other"
	};

	private static readonly string[] _LiteralNames = {
		null, null, "'if'", "'preadd'", "'postadd'", "'replace'", "'pre'", "'post'", 
		"'infix'", null, null, "'='", "'['", "']'", "'('", "')'", "'{'", "'}'", 
		"','", "';'", "'*'", "'\"'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "STRING", "IF", "PREADD", "POSTADD", "REPLACE", "PRE", "POST", "INFIX", 
		"LINE", "WS", "EQ", "LB", "RB", "LP", "RP", "LCB", "RCB", "COMMA", "SEMI", 
		"STAR", "QUOT", "CC"
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

	public override string GrammarFileName { get { return "PointTag.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static PointTagParser() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}

		public PointTagParser(ITokenStream input) : this(input, Console.Out, Console.Error) { }

		public PointTagParser(ITokenStream input, TextWriter output, TextWriter errorOutput)
		: base(input, output, errorOutput)
	{
		Interpreter = new ParserATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}
	public partial class ProgContext : ParserRuleContext {
		public StatementsContext statements() {
			return GetRuleContext<StatementsContext>(0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_prog; } }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterProg(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitProg(this);
		}
	}

	[RuleVersion(0)]
	public ProgContext prog() {
		ProgContext _localctx = new ProgContext(Context, State);
		EnterRule(_localctx, 0, RULE_prog);
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 16; statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class StatementsContext : ParserRuleContext {
		public StatementContext[] statement() {
			return GetRuleContexts<StatementContext>();
		}
		public StatementContext statement(int i) {
			return GetRuleContext<StatementContext>(i);
		}
		public ITerminalNode[] SEMI() { return GetTokens(PointTagParser.SEMI); }
		public ITerminalNode SEMI(int i) {
			return GetToken(PointTagParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_statements; } }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterStatements(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitStatements(this);
		}
	}

	[RuleVersion(0)]
	public StatementsContext statements() {
		StatementsContext _localctx = new StatementsContext(Context, State);
		EnterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 21;
			ErrorHandler.Sync(this);
			_la = TokenStream.LA(1);
			do {
				{
				{
				State = 18; statement();
				State = 19; Match(SEMI);
				}
				}
				State = 23;
				ErrorHandler.Sync(this);
				_la = TokenStream.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << IF) | (1L << PREADD) | (1L << POSTADD) | (1L << REPLACE) | (1L << PRE) | (1L << POST) | (1L << INFIX) | (1L << LINE) | (1L << WS) | (1L << LP) | (1L << RP) | (1L << CC))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class StatementContext : ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_statement; } }
	 
		public StatementContext() { }
		public virtual void CopyFrom(StatementContext context) {
			base.CopyFrom(context);
		}
	}
	public partial class IfStatementContext : StatementContext {
		public IfStatContext ifStat() {
			return GetRuleContext<IfStatContext>(0);
		}
		public ITerminalNode LP() { return GetToken(PointTagParser.LP, 0); }
		public ConditionContext condition() {
			return GetRuleContext<ConditionContext>(0);
		}
		public ITerminalNode[] COMMA() { return GetTokens(PointTagParser.COMMA); }
		public ITerminalNode COMMA(int i) {
			return GetToken(PointTagParser.COMMA, i);
		}
		public StatementContext[] statement() {
			return GetRuleContexts<StatementContext>();
		}
		public StatementContext statement(int i) {
			return GetRuleContext<StatementContext>(i);
		}
		public ITerminalNode RP() { return GetToken(PointTagParser.RP, 0); }
		public IfStatementContext(StatementContext context) { CopyFrom(context); }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterIfStatement(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitIfStatement(this);
		}
	}
	public partial class Value_statContext : StatementContext {
		public ValueContext value() {
			return GetRuleContext<ValueContext>(0);
		}
		public Value_statContext(StatementContext context) { CopyFrom(context); }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterValue_stat(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitValue_stat(this);
		}
	}

	[RuleVersion(0)]
	public StatementContext statement() {
		StatementContext _localctx = new StatementContext(Context, State);
		EnterRule(_localctx, 4, RULE_statement);
		try {
			State = 35;
			ErrorHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(TokenStream,1,Context) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				EnterOuterAlt(_localctx, 1);
				{
				State = 25; ifStat();
				State = 26; Match(LP);
				State = 27; condition();
				State = 28; Match(COMMA);
				State = 29; statement();
				State = 30; Match(COMMA);
				State = 31; statement();
				State = 32; Match(RP);
				}
				break;
			case 2:
				_localctx = new Value_statContext(_localctx);
				EnterOuterAlt(_localctx, 2);
				{
				State = 34; value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class IfStatContext : ParserRuleContext {
		public IfStatContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_ifStat; } }
	 
		public IfStatContext() { }
		public virtual void CopyFrom(IfStatContext context) {
			base.CopyFrom(context);
		}
	}
	public partial class ReplaceContext : IfStatContext {
		public ITerminalNode REPLACE() { return GetToken(PointTagParser.REPLACE, 0); }
		public ReplaceContext(IfStatContext context) { CopyFrom(context); }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterReplace(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitReplace(this);
		}
	}
	public partial class PreAddContext : IfStatContext {
		public ITerminalNode PREADD() { return GetToken(PointTagParser.PREADD, 0); }
		public PreAddContext(IfStatContext context) { CopyFrom(context); }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterPreAdd(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitPreAdd(this);
		}
	}
	public partial class PostAddContext : IfStatContext {
		public ITerminalNode POSTADD() { return GetToken(PointTagParser.POSTADD, 0); }
		public PostAddContext(IfStatContext context) { CopyFrom(context); }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterPostAdd(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitPostAdd(this);
		}
	}
	public partial class IfContext : IfStatContext {
		public ITerminalNode IF() { return GetToken(PointTagParser.IF, 0); }
		public IfContext(IfStatContext context) { CopyFrom(context); }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterIf(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitIf(this);
		}
	}

	[RuleVersion(0)]
	public IfStatContext ifStat() {
		IfStatContext _localctx = new IfStatContext(Context, State);
		EnterRule(_localctx, 6, RULE_ifStat);
		try {
			State = 41;
			ErrorHandler.Sync(this);
			switch (TokenStream.LA(1)) {
			case PREADD:
				_localctx = new PreAddContext(_localctx);
				EnterOuterAlt(_localctx, 1);
				{
				State = 37; Match(PREADD);
				}
				break;
			case POSTADD:
				_localctx = new PostAddContext(_localctx);
				EnterOuterAlt(_localctx, 2);
				{
				State = 38; Match(POSTADD);
				}
				break;
			case REPLACE:
				_localctx = new ReplaceContext(_localctx);
				EnterOuterAlt(_localctx, 3);
				{
				State = 39; Match(REPLACE);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				EnterOuterAlt(_localctx, 4);
				{
				State = 40; Match(IF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class ConditionContext : ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_condition; } }
	 
		public ConditionContext() { }
		public virtual void CopyFrom(ConditionContext context) {
			base.CopyFrom(context);
		}
	}
	public partial class CondContext : ConditionContext {
		public ITerminalNode EQ() { return GetToken(PointTagParser.EQ, 0); }
		public ValueContext value() {
			return GetRuleContext<ValueContext>(0);
		}
		public ITerminalNode PRE() { return GetToken(PointTagParser.PRE, 0); }
		public ITerminalNode POST() { return GetToken(PointTagParser.POST, 0); }
		public ITerminalNode INFIX() { return GetToken(PointTagParser.INFIX, 0); }
		public CondContext(ConditionContext context) { CopyFrom(context); }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterCond(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitCond(this);
		}
	}

	[RuleVersion(0)]
	public ConditionContext condition() {
		ConditionContext _localctx = new ConditionContext(Context, State);
		EnterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			_localctx = new CondContext(_localctx);
			EnterOuterAlt(_localctx, 1);
			{
			State = 43;
			_la = TokenStream.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRE) | (1L << POST) | (1L << INFIX))) != 0)) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
				ErrorHandler.ReportMatch(this);
			    Consume();
			}
			State = 44; Match(EQ);
			State = 45; value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class ValueContext : ParserRuleContext {
		public ITerminalNode STRING() { return GetToken(PointTagParser.STRING, 0); }
		public Other_valueContext other_value() {
			return GetRuleContext<Other_valueContext>(0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_value; } }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterValue(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitValue(this);
		}
	}

	[RuleVersion(0)]
	public ValueContext value() {
		ValueContext _localctx = new ValueContext(Context, State);
		EnterRule(_localctx, 10, RULE_value);
		try {
			State = 49;
			ErrorHandler.Sync(this);
			switch (TokenStream.LA(1)) {
			case STRING:
				EnterOuterAlt(_localctx, 1);
				{
				State = 47; Match(STRING);
				}
				break;
			case IF:
			case PREADD:
			case POSTADD:
			case REPLACE:
			case PRE:
			case POST:
			case INFIX:
			case LINE:
			case WS:
			case LP:
			case RP:
			case CC:
				EnterOuterAlt(_localctx, 2);
				{
				State = 48; other_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class Other_valueContext : ParserRuleContext {
		public OtherContext[] other() {
			return GetRuleContexts<OtherContext>();
		}
		public OtherContext other(int i) {
			return GetRuleContext<OtherContext>(i);
		}
		public Other_valueContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_other_value; } }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterOther_value(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitOther_value(this);
		}
	}

	[RuleVersion(0)]
	public Other_valueContext other_value() {
		Other_valueContext _localctx = new Other_valueContext(Context, State);
		EnterRule(_localctx, 12, RULE_other_value);
		try {
			int _alt;
			EnterOuterAlt(_localctx, 1);
			{
			State = 52;
			ErrorHandler.Sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					State = 51; other();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				State = 54;
				ErrorHandler.Sync(this);
				_alt = Interpreter.AdaptivePredict(TokenStream,4,Context);
			} while ( _alt!=1 && _alt!=global::Antlr4.Runtime.Atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class OtherContext : ParserRuleContext {
		public ITerminalNode STAR() { return GetToken(PointTagParser.STAR, 0); }
		public ITerminalNode STRING() { return GetToken(PointTagParser.STRING, 0); }
		public ITerminalNode LCB() { return GetToken(PointTagParser.LCB, 0); }
		public ITerminalNode RCB() { return GetToken(PointTagParser.RCB, 0); }
		public ITerminalNode COMMA() { return GetToken(PointTagParser.COMMA, 0); }
		public ITerminalNode SEMI() { return GetToken(PointTagParser.SEMI, 0); }
		public ITerminalNode LB() { return GetToken(PointTagParser.LB, 0); }
		public ITerminalNode RB() { return GetToken(PointTagParser.RB, 0); }
		public ITerminalNode QUOT() { return GetToken(PointTagParser.QUOT, 0); }
		public ITerminalNode EQ() { return GetToken(PointTagParser.EQ, 0); }
		public OtherContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_other; } }
		public override void EnterRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.EnterOther(this);
		}
		public override void ExitRule(IParseTreeListener listener) {
			IPointTagListener typedListener = listener as IPointTagListener;
			if (typedListener != null) typedListener.ExitOther(this);
		}
	}

	[RuleVersion(0)]
	public OtherContext other() {
		OtherContext _localctx = new OtherContext(Context, State);
		EnterRule(_localctx, 14, RULE_other);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 56;
			_la = TokenStream.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << EQ) | (1L << LB) | (1L << RB) | (1L << LCB) | (1L << RCB) | (1L << COMMA) | (1L << SEMI) | (1L << STAR) | (1L << QUOT))) != 0)) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
				ErrorHandler.ReportMatch(this);
			    Consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x3', '\x18', '=', '\x4', '\x2', '\t', '\x2', '\x4', '\x3', 
		'\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', '\x5', '\x4', 
		'\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', '\t', '\b', 
		'\x4', '\t', '\t', '\t', '\x3', '\x2', '\x3', '\x2', '\x3', '\x3', '\x3', 
		'\x3', '\x3', '\x3', '\x6', '\x3', '\x18', '\n', '\x3', '\r', '\x3', '\xE', 
		'\x3', '\x19', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', '\x3', '\x4', 
		'\x3', '\x4', '\x5', '\x4', '&', '\n', '\x4', '\x3', '\x5', '\x3', '\x5', 
		'\x3', '\x5', '\x3', '\x5', '\x5', '\x5', ',', '\n', '\x5', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\x6', '\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x5', 
		'\a', '\x34', '\n', '\a', '\x3', '\b', '\x6', '\b', '\x37', '\n', '\b', 
		'\r', '\b', '\xE', '\b', '\x38', '\x3', '\t', '\x3', '\t', '\x3', '\t', 
		'\x3', '\x38', '\x2', '\n', '\x2', '\x4', '\x6', '\b', '\n', '\f', '\xE', 
		'\x10', '\x2', '\x4', '\x3', '\x2', '\b', '\n', '\x5', '\x2', '\x3', '\x3', 
		'\r', '\xF', '\x12', '\x17', '\x2', ';', '\x2', '\x12', '\x3', '\x2', 
		'\x2', '\x2', '\x4', '\x17', '\x3', '\x2', '\x2', '\x2', '\x6', '%', '\x3', 
		'\x2', '\x2', '\x2', '\b', '+', '\x3', '\x2', '\x2', '\x2', '\n', '-', 
		'\x3', '\x2', '\x2', '\x2', '\f', '\x33', '\x3', '\x2', '\x2', '\x2', 
		'\xE', '\x36', '\x3', '\x2', '\x2', '\x2', '\x10', ':', '\x3', '\x2', 
		'\x2', '\x2', '\x12', '\x13', '\x5', '\x4', '\x3', '\x2', '\x13', '\x3', 
		'\x3', '\x2', '\x2', '\x2', '\x14', '\x15', '\x5', '\x6', '\x4', '\x2', 
		'\x15', '\x16', '\a', '\x15', '\x2', '\x2', '\x16', '\x18', '\x3', '\x2', 
		'\x2', '\x2', '\x17', '\x14', '\x3', '\x2', '\x2', '\x2', '\x18', '\x19', 
		'\x3', '\x2', '\x2', '\x2', '\x19', '\x17', '\x3', '\x2', '\x2', '\x2', 
		'\x19', '\x1A', '\x3', '\x2', '\x2', '\x2', '\x1A', '\x5', '\x3', '\x2', 
		'\x2', '\x2', '\x1B', '\x1C', '\x5', '\b', '\x5', '\x2', '\x1C', '\x1D', 
		'\a', '\x10', '\x2', '\x2', '\x1D', '\x1E', '\x5', '\n', '\x6', '\x2', 
		'\x1E', '\x1F', '\a', '\x14', '\x2', '\x2', '\x1F', ' ', '\x5', '\x6', 
		'\x4', '\x2', ' ', '!', '\a', '\x14', '\x2', '\x2', '!', '\"', '\x5', 
		'\x6', '\x4', '\x2', '\"', '#', '\a', '\x11', '\x2', '\x2', '#', '&', 
		'\x3', '\x2', '\x2', '\x2', '$', '&', '\x5', '\f', '\a', '\x2', '%', '\x1B', 
		'\x3', '\x2', '\x2', '\x2', '%', '$', '\x3', '\x2', '\x2', '\x2', '&', 
		'\a', '\x3', '\x2', '\x2', '\x2', '\'', ',', '\a', '\x5', '\x2', '\x2', 
		'(', ',', '\a', '\x6', '\x2', '\x2', ')', ',', '\a', '\a', '\x2', '\x2', 
		'*', ',', '\a', '\x4', '\x2', '\x2', '+', '\'', '\x3', '\x2', '\x2', '\x2', 
		'+', '(', '\x3', '\x2', '\x2', '\x2', '+', ')', '\x3', '\x2', '\x2', '\x2', 
		'+', '*', '\x3', '\x2', '\x2', '\x2', ',', '\t', '\x3', '\x2', '\x2', 
		'\x2', '-', '.', '\t', '\x2', '\x2', '\x2', '.', '/', '\a', '\r', '\x2', 
		'\x2', '/', '\x30', '\x5', '\f', '\a', '\x2', '\x30', '\v', '\x3', '\x2', 
		'\x2', '\x2', '\x31', '\x34', '\a', '\x3', '\x2', '\x2', '\x32', '\x34', 
		'\x5', '\xE', '\b', '\x2', '\x33', '\x31', '\x3', '\x2', '\x2', '\x2', 
		'\x33', '\x32', '\x3', '\x2', '\x2', '\x2', '\x34', '\r', '\x3', '\x2', 
		'\x2', '\x2', '\x35', '\x37', '\x5', '\x10', '\t', '\x2', '\x36', '\x35', 
		'\x3', '\x2', '\x2', '\x2', '\x37', '\x38', '\x3', '\x2', '\x2', '\x2', 
		'\x38', '\x39', '\x3', '\x2', '\x2', '\x2', '\x38', '\x36', '\x3', '\x2', 
		'\x2', '\x2', '\x39', '\xF', '\x3', '\x2', '\x2', '\x2', ':', ';', '\n', 
		'\x3', '\x2', '\x2', ';', '\x11', '\x3', '\x2', '\x2', '\x2', '\a', '\x19', 
		'%', '+', '\x33', '\x38',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
