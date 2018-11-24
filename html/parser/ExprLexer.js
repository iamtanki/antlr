// Generated from Expr.g4 by ANTLR 4.7.1
// jshint ignore: start
var antlr4 = require('antlr4/index');


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0002\u000eC\b\u0001\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004",
    "\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t",
    "\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004",
    "\f\t\f\u0004\r\t\r\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003",
    "\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003",
    "\u0007\u0003\u0007\u0003\b\u0003\b\u0003\t\u0006\t+\n\t\r\t\u000e\t",
    ",\u0003\n\u0006\n0\n\n\r\n\u000e\n1\u0003\u000b\u0003\u000b\u0003\f",
    "\u0005\f7\n\f\u0003\f\u0003\f\u0003\f\u0003\f\u0003\r\u0006\r>\n\r\r",
    "\r\u000e\r?\u0003\r\u0003\r\u0002\u0002\u000e\u0003\u0003\u0005\u0004",
    "\u0007\u0005\t\u0006\u000b\u0007\r\b\u000f\t\u0011\n\u0013\u000b\u0015",
    "\f\u0017\r\u0019\u000e\u0003\u0002\u0005\u0004\u0002C\\c|\u0003\u0002",
    "2;\u0004\u0002\u000b\u000b\"\"\u0002F\u0002\u0003\u0003\u0002\u0002",
    "\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002",
    "\u0002\u0002\t\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002",
    "\u0002\u0002\r\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002",
    "\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002",
    "\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002",
    "\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0003\u001b\u0003\u0002\u0002",
    "\u0002\u0005\u001d\u0003\u0002\u0002\u0002\u0007\u001f\u0003\u0002\u0002",
    "\u0002\t!\u0003\u0002\u0002\u0002\u000b#\u0003\u0002\u0002\u0002\r%",
    "\u0003\u0002\u0002\u0002\u000f\'\u0003\u0002\u0002\u0002\u0011*\u0003",
    "\u0002\u0002\u0002\u0013/\u0003\u0002\u0002\u0002\u00153\u0003\u0002",
    "\u0002\u0002\u00176\u0003\u0002\u0002\u0002\u0019=\u0003\u0002\u0002",
    "\u0002\u001b\u001c\u0007?\u0002\u0002\u001c\u0004\u0003\u0002\u0002",
    "\u0002\u001d\u001e\u0007,\u0002\u0002\u001e\u0006\u0003\u0002\u0002",
    "\u0002\u001f \u00071\u0002\u0002 \b\u0003\u0002\u0002\u0002!\"\u0007",
    "-\u0002\u0002\"\n\u0003\u0002\u0002\u0002#$\u0007/\u0002\u0002$\f\u0003",
    "\u0002\u0002\u0002%&\u0007*\u0002\u0002&\u000e\u0003\u0002\u0002\u0002",
    "\'(\u0007+\u0002\u0002(\u0010\u0003\u0002\u0002\u0002)+\t\u0002\u0002",
    "\u0002*)\u0003\u0002\u0002\u0002+,\u0003\u0002\u0002\u0002,*\u0003\u0002",
    "\u0002\u0002,-\u0003\u0002\u0002\u0002-\u0012\u0003\u0002\u0002\u0002",
    ".0\t\u0003\u0002\u0002/.\u0003\u0002\u0002\u000201\u0003\u0002\u0002",
    "\u00021/\u0003\u0002\u0002\u000212\u0003\u0002\u0002\u00022\u0014\u0003",
    "\u0002\u0002\u000234\u0007=\u0002\u00024\u0016\u0003\u0002\u0002\u0002",
    "57\u0007\u000f\u0002\u000265\u0003\u0002\u0002\u000267\u0003\u0002\u0002",
    "\u000278\u0003\u0002\u0002\u000289\u0007\f\u0002\u00029:\u0003\u0002",
    "\u0002\u0002:;\b\f\u0002\u0002;\u0018\u0003\u0002\u0002\u0002<>\t\u0004",
    "\u0002\u0002=<\u0003\u0002\u0002\u0002>?\u0003\u0002\u0002\u0002?=\u0003",
    "\u0002\u0002\u0002?@\u0003\u0002\u0002\u0002@A\u0003\u0002\u0002\u0002",
    "AB\b\r\u0002\u0002B\u001a\u0003\u0002\u0002\u0002\u0007\u0002,16?\u0003",
    "\b\u0002\u0002"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

function ExprLexer(input) {
	antlr4.Lexer.call(this, input);
    this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    return this;
}

ExprLexer.prototype = Object.create(antlr4.Lexer.prototype);
ExprLexer.prototype.constructor = ExprLexer;

Object.defineProperty(ExprLexer.prototype, "atn", {
        get : function() {
                return atn;
        }
});

ExprLexer.EOF = antlr4.Token.EOF;
ExprLexer.T__0 = 1;
ExprLexer.T__1 = 2;
ExprLexer.T__2 = 3;
ExprLexer.T__3 = 4;
ExprLexer.T__4 = 5;
ExprLexer.T__5 = 6;
ExprLexer.T__6 = 7;
ExprLexer.ID = 8;
ExprLexer.INT = 9;
ExprLexer.SEMI = 10;
ExprLexer.NEWLINE = 11;
ExprLexer.WS = 12;

ExprLexer.prototype.channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];

ExprLexer.prototype.modeNames = [ "DEFAULT_MODE" ];

ExprLexer.prototype.literalNames = [ null, "'='", "'*'", "'/'", "'+'", "'-'", 
                                     "'('", "')'", null, null, "';'" ];

ExprLexer.prototype.symbolicNames = [ null, null, null, null, null, null, 
                                      null, null, "ID", "INT", "SEMI", "NEWLINE", 
                                      "WS" ];

ExprLexer.prototype.ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", 
                                  "T__5", "T__6", "ID", "INT", "SEMI", "NEWLINE", 
                                  "WS" ];

ExprLexer.prototype.grammarFileName = "Expr.g4";



exports.ExprLexer = ExprLexer;

