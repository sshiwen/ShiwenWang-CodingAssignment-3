// Generated from src/main/java/antlr/CalculatorGrammar.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CalculatorGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PI=5, E=6, INT=7, FLOAT=8, SCIENTIFIC_NUMBER=9, 
		MUL=10, DIV=11, ADD=12, SUB=13, POW=14, SIN=15, COS=16, TAN=17, ASIN=18, 
		ACOS=19, ATAN=20, SINH=21, COSH=22, TANH=23, LOG=24, LN=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "PI", "E", "INT", "FLOAT", "SCIENTIFIC_NUMBER", 
			"MUL", "DIV", "ADD", "SUB", "POW", "SIN", "COS", "TAN", "ASIN", "ACOS", 
			"ATAN", "SINH", "COSH", "TANH", "LOG", "LN", "WS"
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


	public CalculatorGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculatorGrammar.g4"; }

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
		"\u0004\u0000\u001a\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004A\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0004\u0006F\b\u0006\u000b\u0006\f\u0006G\u0001"+
		"\u0007\u0004\u0007K\b\u0007\u000b\u0007\f\u0007L\u0001\u0007\u0001\u0007"+
		"\u0005\u0007Q\b\u0007\n\u0007\f\u0007T\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007X\b\u0007\u000b\u0007\f\u0007Y\u0003\u0007\\\b\u0007\u0001"+
		"\b\u0004\b_\b\b\u000b\b\f\b`\u0001\b\u0001\b\u0003\be\b\b\u0001\b\u0004"+
		"\bh\b\b\u000b\b\f\bi\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0004\u0019\u00a9\b\u0019\u000b\u0019\f\u0019\u00aa\u0001\u0019\u0001"+
		"\u0019\u0000\u0000\u001a\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a\u0001\u0000\u0005\u0001"+
		"\u000009\u0002\u0000EEee\u0002\u0000++--\u0002\u0000//\u00f7\u00f7\u0003"+
		"\u0000\t\n\r\r  \u00b7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u0003"+
		"7\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000\u0007;\u0001"+
		"\u0000\u0000\u0000\t@\u0001\u0000\u0000\u0000\u000bB\u0001\u0000\u0000"+
		"\u0000\rE\u0001\u0000\u0000\u0000\u000f[\u0001\u0000\u0000\u0000\u0011"+
		"^\u0001\u0000\u0000\u0000\u0013k\u0001\u0000\u0000\u0000\u0015m\u0001"+
		"\u0000\u0000\u0000\u0017o\u0001\u0000\u0000\u0000\u0019q\u0001\u0000\u0000"+
		"\u0000\u001bs\u0001\u0000\u0000\u0000\u001dv\u0001\u0000\u0000\u0000\u001f"+
		"z\u0001\u0000\u0000\u0000!~\u0001\u0000\u0000\u0000#\u0082\u0001\u0000"+
		"\u0000\u0000%\u0087\u0001\u0000\u0000\u0000\'\u008c\u0001\u0000\u0000"+
		"\u0000)\u0091\u0001\u0000\u0000\u0000+\u0096\u0001\u0000\u0000\u0000-"+
		"\u009b\u0001\u0000\u0000\u0000/\u00a0\u0001\u0000\u0000\u00001\u00a4\u0001"+
		"\u0000\u0000\u00003\u00a8\u0001\u0000\u0000\u000056\u0005\u00f7\u0000"+
		"\u00006\u0002\u0001\u0000\u0000\u000078\u0005!\u0000\u00008\u0004\u0001"+
		"\u0000\u0000\u00009:\u0005(\u0000\u0000:\u0006\u0001\u0000\u0000\u0000"+
		";<\u0005)\u0000\u0000<\b\u0001\u0000\u0000\u0000=A\u0005\u03c0\u0000\u0000"+
		">?\u0005p\u0000\u0000?A\u0005i\u0000\u0000@=\u0001\u0000\u0000\u0000@"+
		">\u0001\u0000\u0000\u0000A\n\u0001\u0000\u0000\u0000BC\u0005e\u0000\u0000"+
		"C\f\u0001\u0000\u0000\u0000DF\u0007\u0000\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000H\u000e\u0001\u0000\u0000\u0000IK\u0007\u0000\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NR\u0005.\u0000"+
		"\u0000OQ\u0007\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\\\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UW\u0005.\u0000\u0000VX\u0007"+
		"\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[J\u0001\u0000\u0000\u0000[U\u0001\u0000\u0000\u0000\\\u0010\u0001"+
		"\u0000\u0000\u0000]_\u0007\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bd\u0007\u0001\u0000\u0000ce\u0007\u0002"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000fh\u0007\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000j\u0012\u0001\u0000\u0000\u0000kl\u0005*\u0000\u0000l\u0014\u0001"+
		"\u0000\u0000\u0000mn\u0007\u0003\u0000\u0000n\u0016\u0001\u0000\u0000"+
		"\u0000op\u0005+\u0000\u0000p\u0018\u0001\u0000\u0000\u0000qr\u0005-\u0000"+
		"\u0000r\u001a\u0001\u0000\u0000\u0000st\u0005*\u0000\u0000tu\u0005*\u0000"+
		"\u0000u\u001c\u0001\u0000\u0000\u0000vw\u0005s\u0000\u0000wx\u0005i\u0000"+
		"\u0000xy\u0005n\u0000\u0000y\u001e\u0001\u0000\u0000\u0000z{\u0005c\u0000"+
		"\u0000{|\u0005o\u0000\u0000|}\u0005s\u0000\u0000} \u0001\u0000\u0000\u0000"+
		"~\u007f\u0005t\u0000\u0000\u007f\u0080\u0005a\u0000\u0000\u0080\u0081"+
		"\u0005n\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"a\u0000\u0000\u0083\u0084\u0005s\u0000\u0000\u0084\u0085\u0005i\u0000"+
		"\u0000\u0085\u0086\u0005n\u0000\u0000\u0086$\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005a\u0000\u0000\u0088\u0089\u0005c\u0000\u0000\u0089\u008a\u0005"+
		"o\u0000\u0000\u008a\u008b\u0005s\u0000\u0000\u008b&\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005a\u0000\u0000\u008d\u008e\u0005t\u0000\u0000\u008e"+
		"\u008f\u0005a\u0000\u0000\u008f\u0090\u0005n\u0000\u0000\u0090(\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005s\u0000\u0000\u0092\u0093\u0005i\u0000"+
		"\u0000\u0093\u0094\u0005n\u0000\u0000\u0094\u0095\u0005h\u0000\u0000\u0095"+
		"*\u0001\u0000\u0000\u0000\u0096\u0097\u0005c\u0000\u0000\u0097\u0098\u0005"+
		"o\u0000\u0000\u0098\u0099\u0005s\u0000\u0000\u0099\u009a\u0005h\u0000"+
		"\u0000\u009a,\u0001\u0000\u0000\u0000\u009b\u009c\u0005t\u0000\u0000\u009c"+
		"\u009d\u0005a\u0000\u0000\u009d\u009e\u0005n\u0000\u0000\u009e\u009f\u0005"+
		"h\u0000\u0000\u009f.\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005l\u0000"+
		"\u0000\u00a1\u00a2\u0005o\u0000\u0000\u00a2\u00a3\u0005g\u0000\u0000\u00a3"+
		"0\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005l\u0000\u0000\u00a5\u00a6\u0005"+
		"n\u0000\u0000\u00a62\u0001\u0000\u0000\u0000\u00a7\u00a9\u0007\u0004\u0000"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u0019\u0000"+
		"\u0000\u00ad4\u0001\u0000\u0000\u0000\u000b\u0000@GLRY[`di\u00aa\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}