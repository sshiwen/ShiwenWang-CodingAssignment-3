// Generated from src/main/java/antlr/CalculatorGrammar.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PI=5, E=6, INT=7, FLOAT=8, SCIENTIFIC_NUMBER=9, 
		MUL=10, DIV=11, ADD=12, SUB=13, POW=14, SIN=15, COS=16, TAN=17, ASIN=18, 
		ACOS=19, ATAN=20, SINH=21, COSH=22, TANH=23, LOG=24, LN=25, WS=26;
	public static final int
		RULE_expr = 0, RULE_function = 1, RULE_number = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "function", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u00F7'", "'!'", "'('", "')'", null, "'e'", null, null, null, 
			"'*'", null, "'+'", "'-'", "'**'", "'sin'", "'cos'", "'tan'", "'asin'", 
			"'acos'", "'atan'", "'sinh'", "'cosh'", "'tanh'", "'log'", "'ln'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PI", "E", "INT", "FLOAT", "SCIENTIFIC_NUMBER", 
			"MUL", "DIV", "ADD", "SUB", "POW", "SIN", "COS", "TAN", "ASIN", "ACOS", 
			"ATAN", "SINH", "COSH", "TANH", "LOG", "LN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "CalculatorGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode LOG() { return getToken(CalculatorGrammarParser.LOG, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LN() { return getToken(CalculatorGrammarParser.LN, 0); }
		public TerminalNode SIN() { return getToken(CalculatorGrammarParser.SIN, 0); }
		public TerminalNode COS() { return getToken(CalculatorGrammarParser.COS, 0); }
		public TerminalNode TAN() { return getToken(CalculatorGrammarParser.TAN, 0); }
		public TerminalNode ASIN() { return getToken(CalculatorGrammarParser.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(CalculatorGrammarParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(CalculatorGrammarParser.ATAN, 0); }
		public TerminalNode SINH() { return getToken(CalculatorGrammarParser.SINH, 0); }
		public TerminalNode COSH() { return getToken(CalculatorGrammarParser.COSH, 0); }
		public TerminalNode TANH() { return getToken(CalculatorGrammarParser.TANH, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode MUL() { return getToken(CalculatorGrammarParser.MUL, 0); }
		public TerminalNode POW() { return getToken(CalculatorGrammarParser.POW, 0); }
		public TerminalNode ADD() { return getToken(CalculatorGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CalculatorGrammarParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorGrammarVisitor ) return ((CalculatorGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(7);
				match(LOG);
				setState(8);
				expr(15);
				}
				break;
			case 2:
				{
				setState(9);
				match(LN);
				setState(10);
				expr(14);
				}
				break;
			case 3:
				{
				setState(11);
				match(SIN);
				setState(12);
				expr(13);
				}
				break;
			case 4:
				{
				setState(13);
				match(COS);
				setState(14);
				expr(12);
				}
				break;
			case 5:
				{
				setState(15);
				match(TAN);
				setState(16);
				expr(11);
				}
				break;
			case 6:
				{
				setState(17);
				match(ASIN);
				setState(18);
				expr(10);
				}
				break;
			case 7:
				{
				setState(19);
				match(ACOS);
				setState(20);
				expr(9);
				}
				break;
			case 8:
				{
				setState(21);
				match(ATAN);
				setState(22);
				expr(8);
				}
				break;
			case 9:
				{
				setState(23);
				match(SINH);
				setState(24);
				expr(7);
				}
				break;
			case 10:
				{
				setState(25);
				match(COSH);
				setState(26);
				expr(6);
				}
				break;
			case 11:
				{
				setState(27);
				match(TANH);
				setState(28);
				expr(5);
				}
				break;
			case 12:
				{
				setState(29);
				match(T__2);
				setState(30);
				expr(0);
				setState(31);
				match(T__3);
				}
				break;
			case 13:
				{
				setState(33);
				function();
				setState(34);
				match(T__2);
				setState(35);
				expr(0);
				setState(36);
				match(T__3);
				}
				break;
			case 14:
				{
				setState(38);
				number();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(41);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(42);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17410L) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(43);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(44);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(45);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(46);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(47);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(48);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(CalculatorGrammarParser.SIN, 0); }
		public TerminalNode COS() { return getToken(CalculatorGrammarParser.COS, 0); }
		public TerminalNode TAN() { return getToken(CalculatorGrammarParser.TAN, 0); }
		public TerminalNode ASIN() { return getToken(CalculatorGrammarParser.ASIN, 0); }
		public TerminalNode ACOS() { return getToken(CalculatorGrammarParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(CalculatorGrammarParser.ATAN, 0); }
		public TerminalNode SINH() { return getToken(CalculatorGrammarParser.SINH, 0); }
		public TerminalNode COSH() { return getToken(CalculatorGrammarParser.COSH, 0); }
		public TerminalNode TANH() { return getToken(CalculatorGrammarParser.TANH, 0); }
		public TerminalNode LOG() { return getToken(CalculatorGrammarParser.LOG, 0); }
		public TerminalNode LN() { return getToken(CalculatorGrammarParser.LN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorGrammarVisitor ) return ((CalculatorGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67076096L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CalculatorGrammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(CalculatorGrammarParser.FLOAT, 0); }
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(CalculatorGrammarParser.SCIENTIFIC_NUMBER, 0); }
		public TerminalNode PI() { return getToken(CalculatorGrammarParser.PI, 0); }
		public TerminalNode E() { return getToken(CalculatorGrammarParser.E, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorGrammarVisitor ) return ((CalculatorGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000(\b"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u00002\b\u0000\n\u0000\f\u00005\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0000"+
		"\u0001\u0000\u0003\u0000\u0002\u0004\u0000\u0004\u0003\u0000\u0001\u0001"+
		"\n\n\u000e\u000e\u0001\u0000\f\r\u0001\u0000\u000f\u0019\u0001\u0000\u0005"+
		"\tG\u0000\'\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004"+
		"8\u0001\u0000\u0000\u0000\u0006\u0007\u0006\u0000\uffff\uffff\u0000\u0007"+
		"\b\u0005\u0018\u0000\u0000\b(\u0003\u0000\u0000\u000f\t\n\u0005\u0019"+
		"\u0000\u0000\n(\u0003\u0000\u0000\u000e\u000b\f\u0005\u000f\u0000\u0000"+
		"\f(\u0003\u0000\u0000\r\r\u000e\u0005\u0010\u0000\u0000\u000e(\u0003\u0000"+
		"\u0000\f\u000f\u0010\u0005\u0011\u0000\u0000\u0010(\u0003\u0000\u0000"+
		"\u000b\u0011\u0012\u0005\u0012\u0000\u0000\u0012(\u0003\u0000\u0000\n"+
		"\u0013\u0014\u0005\u0013\u0000\u0000\u0014(\u0003\u0000\u0000\t\u0015"+
		"\u0016\u0005\u0014\u0000\u0000\u0016(\u0003\u0000\u0000\b\u0017\u0018"+
		"\u0005\u0015\u0000\u0000\u0018(\u0003\u0000\u0000\u0007\u0019\u001a\u0005"+
		"\u0016\u0000\u0000\u001a(\u0003\u0000\u0000\u0006\u001b\u001c\u0005\u0017"+
		"\u0000\u0000\u001c(\u0003\u0000\u0000\u0005\u001d\u001e\u0005\u0003\u0000"+
		"\u0000\u001e\u001f\u0003\u0000\u0000\u0000\u001f \u0005\u0004\u0000\u0000"+
		" (\u0001\u0000\u0000\u0000!\"\u0003\u0002\u0001\u0000\"#\u0005\u0003\u0000"+
		"\u0000#$\u0003\u0000\u0000\u0000$%\u0005\u0004\u0000\u0000%(\u0001\u0000"+
		"\u0000\u0000&(\u0003\u0004\u0002\u0000\'\u0006\u0001\u0000\u0000\u0000"+
		"\'\t\u0001\u0000\u0000\u0000\'\u000b\u0001\u0000\u0000\u0000\'\r\u0001"+
		"\u0000\u0000\u0000\'\u000f\u0001\u0000\u0000\u0000\'\u0011\u0001\u0000"+
		"\u0000\u0000\'\u0013\u0001\u0000\u0000\u0000\'\u0015\u0001\u0000\u0000"+
		"\u0000\'\u0017\u0001\u0000\u0000\u0000\'\u0019\u0001\u0000\u0000\u0000"+
		"\'\u001b\u0001\u0000\u0000\u0000\'\u001d\u0001\u0000\u0000\u0000\'!\u0001"+
		"\u0000\u0000\u0000\'&\u0001\u0000\u0000\u0000(3\u0001\u0000\u0000\u0000"+
		")*\n\u0011\u0000\u0000*+\u0007\u0000\u0000\u0000+2\u0003\u0000\u0000\u0012"+
		",-\n\u0010\u0000\u0000-.\u0007\u0001\u0000\u0000.2\u0003\u0000\u0000\u0011"+
		"/0\n\u0004\u0000\u000002\u0005\u0002\u0000\u00001)\u0001\u0000\u0000\u0000"+
		"1,\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0001\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0007\u0002\u0000\u0000"+
		"7\u0003\u0001\u0000\u0000\u000089\u0007\u0003\u0000\u00009\u0005\u0001"+
		"\u0000\u0000\u0000\u0003\'13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}