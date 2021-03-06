
// Generated from LabeledExpr.g4 by ANTLR 4.7.1


#include "LabeledExprListener.h"

#include "LabeledExprParser.h"


using namespace antlrcpp;
using namespace antlr4;

LabeledExprParser::LabeledExprParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

LabeledExprParser::~LabeledExprParser() {
  delete _interpreter;
}

std::string LabeledExprParser::getGrammarFileName() const {
  return "LabeledExpr.g4";
}

const std::vector<std::string>& LabeledExprParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& LabeledExprParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- ProgContext ------------------------------------------------------------------

LabeledExprParser::ProgContext::ProgContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<LabeledExprParser::StatContext *> LabeledExprParser::ProgContext::stat() {
  return getRuleContexts<LabeledExprParser::StatContext>();
}

LabeledExprParser::StatContext* LabeledExprParser::ProgContext::stat(size_t i) {
  return getRuleContext<LabeledExprParser::StatContext>(i);
}


size_t LabeledExprParser::ProgContext::getRuleIndex() const {
  return LabeledExprParser::RuleProg;
}

void LabeledExprParser::ProgContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterProg(this);
}

void LabeledExprParser::ProgContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitProg(this);
}

LabeledExprParser::ProgContext* LabeledExprParser::prog() {
  ProgContext *_localctx = _tracker.createInstance<ProgContext>(_ctx, getState());
  enterRule(_localctx, 0, LabeledExprParser::RuleProg);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(7); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(6);
      stat();
      setState(9); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << LabeledExprParser::T__1)
      | (1ULL << LabeledExprParser::ID)
      | (1ULL << LabeledExprParser::INT))) != 0));
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatContext ------------------------------------------------------------------

LabeledExprParser::StatContext::StatContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t LabeledExprParser::StatContext::getRuleIndex() const {
  return LabeledExprParser::RuleStat;
}

void LabeledExprParser::StatContext::copyFrom(StatContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- PrintExprContext ------------------------------------------------------------------

LabeledExprParser::ExprContext* LabeledExprParser::PrintExprContext::expr() {
  return getRuleContext<LabeledExprParser::ExprContext>(0);
}

tree::TerminalNode* LabeledExprParser::PrintExprContext::SEMI() {
  return getToken(LabeledExprParser::SEMI, 0);
}

LabeledExprParser::PrintExprContext::PrintExprContext(StatContext *ctx) { copyFrom(ctx); }

void LabeledExprParser::PrintExprContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPrintExpr(this);
}
void LabeledExprParser::PrintExprContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPrintExpr(this);
}
//----------------- AssignContext ------------------------------------------------------------------

tree::TerminalNode* LabeledExprParser::AssignContext::ID() {
  return getToken(LabeledExprParser::ID, 0);
}

LabeledExprParser::ExprContext* LabeledExprParser::AssignContext::expr() {
  return getRuleContext<LabeledExprParser::ExprContext>(0);
}

tree::TerminalNode* LabeledExprParser::AssignContext::SEMI() {
  return getToken(LabeledExprParser::SEMI, 0);
}

LabeledExprParser::AssignContext::AssignContext(StatContext *ctx) { copyFrom(ctx); }

void LabeledExprParser::AssignContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssign(this);
}
void LabeledExprParser::AssignContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssign(this);
}
LabeledExprParser::StatContext* LabeledExprParser::stat() {
  StatContext *_localctx = _tracker.createInstance<StatContext>(_ctx, getState());
  enterRule(_localctx, 2, LabeledExprParser::RuleStat);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(19);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 1, _ctx)) {
    case 1: {
      _localctx = dynamic_cast<StatContext *>(_tracker.createInstance<LabeledExprParser::PrintExprContext>(_localctx));
      enterOuterAlt(_localctx, 1);
      setState(11);
      expr(0);
      setState(12);
      match(LabeledExprParser::SEMI);
      break;
    }

    case 2: {
      _localctx = dynamic_cast<StatContext *>(_tracker.createInstance<LabeledExprParser::AssignContext>(_localctx));
      enterOuterAlt(_localctx, 2);
      setState(14);
      match(LabeledExprParser::ID);
      setState(15);
      match(LabeledExprParser::T__0);
      setState(16);
      expr(0);
      setState(17);
      match(LabeledExprParser::SEMI);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExprContext ------------------------------------------------------------------

LabeledExprParser::ExprContext::ExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t LabeledExprParser::ExprContext::getRuleIndex() const {
  return LabeledExprParser::RuleExpr;
}

void LabeledExprParser::ExprContext::copyFrom(ExprContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- ParensContext ------------------------------------------------------------------

LabeledExprParser::ExprContext* LabeledExprParser::ParensContext::expr() {
  return getRuleContext<LabeledExprParser::ExprContext>(0);
}

LabeledExprParser::ParensContext::ParensContext(ExprContext *ctx) { copyFrom(ctx); }

void LabeledExprParser::ParensContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterParens(this);
}
void LabeledExprParser::ParensContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitParens(this);
}
//----------------- MulDivContext ------------------------------------------------------------------

std::vector<LabeledExprParser::ExprContext *> LabeledExprParser::MulDivContext::expr() {
  return getRuleContexts<LabeledExprParser::ExprContext>();
}

LabeledExprParser::ExprContext* LabeledExprParser::MulDivContext::expr(size_t i) {
  return getRuleContext<LabeledExprParser::ExprContext>(i);
}

LabeledExprParser::MulDivContext::MulDivContext(ExprContext *ctx) { copyFrom(ctx); }

void LabeledExprParser::MulDivContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMulDiv(this);
}
void LabeledExprParser::MulDivContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMulDiv(this);
}
//----------------- AddSubContext ------------------------------------------------------------------

std::vector<LabeledExprParser::ExprContext *> LabeledExprParser::AddSubContext::expr() {
  return getRuleContexts<LabeledExprParser::ExprContext>();
}

LabeledExprParser::ExprContext* LabeledExprParser::AddSubContext::expr(size_t i) {
  return getRuleContext<LabeledExprParser::ExprContext>(i);
}

LabeledExprParser::AddSubContext::AddSubContext(ExprContext *ctx) { copyFrom(ctx); }

void LabeledExprParser::AddSubContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAddSub(this);
}
void LabeledExprParser::AddSubContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAddSub(this);
}
//----------------- IdContext ------------------------------------------------------------------

tree::TerminalNode* LabeledExprParser::IdContext::ID() {
  return getToken(LabeledExprParser::ID, 0);
}

LabeledExprParser::IdContext::IdContext(ExprContext *ctx) { copyFrom(ctx); }

void LabeledExprParser::IdContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterId(this);
}
void LabeledExprParser::IdContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitId(this);
}
//----------------- IntContext ------------------------------------------------------------------

tree::TerminalNode* LabeledExprParser::IntContext::INT() {
  return getToken(LabeledExprParser::INT, 0);
}

LabeledExprParser::IntContext::IntContext(ExprContext *ctx) { copyFrom(ctx); }

void LabeledExprParser::IntContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInt(this);
}
void LabeledExprParser::IntContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<LabeledExprListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInt(this);
}

LabeledExprParser::ExprContext* LabeledExprParser::expr() {
   return expr(0);
}

LabeledExprParser::ExprContext* LabeledExprParser::expr(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  LabeledExprParser::ExprContext *_localctx = _tracker.createInstance<ExprContext>(_ctx, parentState);
  LabeledExprParser::ExprContext *previousContext = _localctx;
  size_t startState = 4;
  enterRecursionRule(_localctx, 4, LabeledExprParser::RuleExpr, precedence);

    size_t _la = 0;

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(28);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case LabeledExprParser::INT: {
        _localctx = _tracker.createInstance<IntContext>(_localctx);
        _ctx = _localctx;
        previousContext = _localctx;

        setState(22);
        match(LabeledExprParser::INT);
        break;
      }

      case LabeledExprParser::ID: {
        _localctx = _tracker.createInstance<IdContext>(_localctx);
        _ctx = _localctx;
        previousContext = _localctx;
        setState(23);
        match(LabeledExprParser::ID);
        break;
      }

      case LabeledExprParser::T__1: {
        _localctx = _tracker.createInstance<ParensContext>(_localctx);
        _ctx = _localctx;
        previousContext = _localctx;
        setState(24);
        match(LabeledExprParser::T__1);
        setState(25);
        expr(0);
        setState(26);
        match(LabeledExprParser::T__2);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    _ctx->stop = _input->LT(-1);
    setState(38);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(36);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx)) {
        case 1: {
          auto newContext = _tracker.createInstance<MulDivContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(30);

          if (!(precpred(_ctx, 5))) throw FailedPredicateException(this, "precpred(_ctx, 5)");
          setState(31);
          dynamic_cast<MulDivContext *>(_localctx)->op = _input->LT(1);
          _la = _input->LA(1);
          if (!(_la == LabeledExprParser::MUL

          || _la == LabeledExprParser::DIV)) {
            dynamic_cast<MulDivContext *>(_localctx)->op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(32);
          expr(6);
          break;
        }

        case 2: {
          auto newContext = _tracker.createInstance<AddSubContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(33);

          if (!(precpred(_ctx, 4))) throw FailedPredicateException(this, "precpred(_ctx, 4)");
          setState(34);
          dynamic_cast<AddSubContext *>(_localctx)->op = _input->LT(1);
          _la = _input->LA(1);
          if (!(_la == LabeledExprParser::ADD

          || _la == LabeledExprParser::SUB)) {
            dynamic_cast<AddSubContext *>(_localctx)->op = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(35);
          expr(5);
          break;
        }

        } 
      }
      setState(40);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

bool LabeledExprParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 2: return exprSempred(dynamic_cast<ExprContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool LabeledExprParser::exprSempred(ExprContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 5);
    case 1: return precpred(_ctx, 4);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> LabeledExprParser::_decisionToDFA;
atn::PredictionContextCache LabeledExprParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN LabeledExprParser::_atn;
std::vector<uint16_t> LabeledExprParser::_serializedATN;

std::vector<std::string> LabeledExprParser::_ruleNames = {
  "prog", "stat", "expr"
};

std::vector<std::string> LabeledExprParser::_literalNames = {
  "", "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "", "", "';'"
};

std::vector<std::string> LabeledExprParser::_symbolicNames = {
  "", "", "", "", "MUL", "DIV", "ADD", "SUB", "ID", "INT", "SEMI", "NEWLINE", 
  "WS"
};

dfa::Vocabulary LabeledExprParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> LabeledExprParser::_tokenNames;

LabeledExprParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0xe, 0x2c, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 0x9, 
    0x4, 0x3, 0x2, 0x6, 0x2, 0xa, 0xa, 0x2, 0xd, 0x2, 0xe, 0x2, 0xb, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x5, 0x3, 0x16, 0xa, 0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 
    0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x1f, 0xa, 0x4, 0x3, 0x4, 0x3, 
    0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x7, 0x4, 0x27, 0xa, 0x4, 
    0xc, 0x4, 0xe, 0x4, 0x2a, 0xb, 0x4, 0x3, 0x4, 0x2, 0x3, 0x6, 0x5, 0x2, 
    0x4, 0x6, 0x2, 0x4, 0x3, 0x2, 0x6, 0x7, 0x3, 0x2, 0x8, 0x9, 0x2, 0x2e, 
    0x2, 0x9, 0x3, 0x2, 0x2, 0x2, 0x4, 0x15, 0x3, 0x2, 0x2, 0x2, 0x6, 0x1e, 
    0x3, 0x2, 0x2, 0x2, 0x8, 0xa, 0x5, 0x4, 0x3, 0x2, 0x9, 0x8, 0x3, 0x2, 
    0x2, 0x2, 0xa, 0xb, 0x3, 0x2, 0x2, 0x2, 0xb, 0x9, 0x3, 0x2, 0x2, 0x2, 
    0xb, 0xc, 0x3, 0x2, 0x2, 0x2, 0xc, 0x3, 0x3, 0x2, 0x2, 0x2, 0xd, 0xe, 
    0x5, 0x6, 0x4, 0x2, 0xe, 0xf, 0x7, 0xc, 0x2, 0x2, 0xf, 0x16, 0x3, 0x2, 
    0x2, 0x2, 0x10, 0x11, 0x7, 0xa, 0x2, 0x2, 0x11, 0x12, 0x7, 0x3, 0x2, 
    0x2, 0x12, 0x13, 0x5, 0x6, 0x4, 0x2, 0x13, 0x14, 0x7, 0xc, 0x2, 0x2, 
    0x14, 0x16, 0x3, 0x2, 0x2, 0x2, 0x15, 0xd, 0x3, 0x2, 0x2, 0x2, 0x15, 
    0x10, 0x3, 0x2, 0x2, 0x2, 0x16, 0x5, 0x3, 0x2, 0x2, 0x2, 0x17, 0x18, 
    0x8, 0x4, 0x1, 0x2, 0x18, 0x1f, 0x7, 0xb, 0x2, 0x2, 0x19, 0x1f, 0x7, 
    0xa, 0x2, 0x2, 0x1a, 0x1b, 0x7, 0x4, 0x2, 0x2, 0x1b, 0x1c, 0x5, 0x6, 
    0x4, 0x2, 0x1c, 0x1d, 0x7, 0x5, 0x2, 0x2, 0x1d, 0x1f, 0x3, 0x2, 0x2, 
    0x2, 0x1e, 0x17, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x19, 0x3, 0x2, 0x2, 0x2, 
    0x1e, 0x1a, 0x3, 0x2, 0x2, 0x2, 0x1f, 0x28, 0x3, 0x2, 0x2, 0x2, 0x20, 
    0x21, 0xc, 0x7, 0x2, 0x2, 0x21, 0x22, 0x9, 0x2, 0x2, 0x2, 0x22, 0x27, 
    0x5, 0x6, 0x4, 0x8, 0x23, 0x24, 0xc, 0x6, 0x2, 0x2, 0x24, 0x25, 0x9, 
    0x3, 0x2, 0x2, 0x25, 0x27, 0x5, 0x6, 0x4, 0x7, 0x26, 0x20, 0x3, 0x2, 
    0x2, 0x2, 0x26, 0x23, 0x3, 0x2, 0x2, 0x2, 0x27, 0x2a, 0x3, 0x2, 0x2, 
    0x2, 0x28, 0x26, 0x3, 0x2, 0x2, 0x2, 0x28, 0x29, 0x3, 0x2, 0x2, 0x2, 
    0x29, 0x7, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x28, 0x3, 0x2, 0x2, 0x2, 0x7, 
    0xb, 0x15, 0x1e, 0x26, 0x28, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

LabeledExprParser::Initializer LabeledExprParser::_init;
