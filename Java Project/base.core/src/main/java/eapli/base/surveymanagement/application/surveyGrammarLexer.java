// Generated from C:/Users/pedro/OneDrive/Documentos/lei21_22_s4_2de_05/Java Project/base.core/src/main/java/eapli/base/surveymanagement/application4\surveyGrammar.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.application;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class surveyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NUMBER=4, STRING=5, ALFANUMERIC=6, NEWLINE=7, 
		SECTION=8, ALIGN=9, OPTION=10, CHOICEMUL=11, MANDATORY=12, OPTIONAL=13, 
		FREE=14, SYMBOLS=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "NUMBER", "STRING", "ALFANUMERIC", "NEWLINE", 
			"SECTION", "ALIGN", "OPTION", "CHOICEMUL", "MANDATORY", "OPTIONAL", "FREE", 
			"SYMBOLS", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'_'", "';'", "':'", null, null, null, null, null, null, null, 
			"'>'", "'*'", "'x'", "'free'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NUMBER", "STRING", "ALFANUMERIC", "NEWLINE", 
			"SECTION", "ALIGN", "OPTION", "CHOICEMUL", "MANDATORY", "OPTIONAL", "FREE", 
			"SYMBOLS", "WS"
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


	public surveyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "surveyGrammar.g4"; }

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
		"\u0004\u0000\u0010l\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0004\u0003)\b\u0003\u000b\u0003\f\u0003"+
		"*\u0001\u0004\u0004\u0004.\b\u0004\u000b\u0004\f\u0004/\u0001\u0005\u0001"+
		"\u0005\u0003\u00054\b\u0005\u0001\u0006\u0003\u00067\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0004\u0007<\b\u0007\u000b\u0007\f\u0007=\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0004\bC\b\b\u000b\b\f\bD\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tN\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\tV\b\t\u0003\tX\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000"+
		"\u0005\u0001\u000009\u0002\u0000AZaz\u0001\u0000az\u0004\u0000,,??[[]"+
		"]\u0003\u0000\t\n\r\r  w\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000\u0000"+
		"\u0005%\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000\u0000\t-\u0001"+
		"\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r6\u0001\u0000\u0000"+
		"\u0000\u000f;\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013"+
		"W\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017]\u0001"+
		"\u0000\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001ba\u0001\u0000\u0000"+
		"\u0000\u001df\u0001\u0000\u0000\u0000\u001fh\u0001\u0000\u0000\u0000!"+
		"\"\u0005_\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005;\u0000\u0000"+
		"$\u0004\u0001\u0000\u0000\u0000%&\u0005:\u0000\u0000&\u0006\u0001\u0000"+
		"\u0000\u0000\')\u0007\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+\b\u0001\u0000\u0000\u0000,.\u0007\u0001\u0000\u0000-,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u00000\n\u0001\u0000\u0000\u000014\u0003\t\u0004\u000024\u0003"+
		"\u0007\u0003\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u0000"+
		"4\f\u0001\u0000\u0000\u000057\u0005\r\u0000\u000065\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0005\n\u0000"+
		"\u00009\u000e\u0001\u0000\u0000\u0000:<\u0003\u0007\u0003\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005-\u0000\u0000"+
		"@\u0010\u0001\u0000\u0000\u0000AC\u0007\u0002\u0000\u0000BA\u0001\u0000"+
		"\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005)\u0000\u0000G\u0012"+
		"\u0001\u0000\u0000\u0000HI\u0005i\u0000\u0000IX\u0005x\u0000\u0000JK\u0005"+
		"i\u0000\u0000KX\u0005v\u0000\u0000LN\u0005v\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NU\u0001\u0000\u0000\u0000OV\u0005"+
		"i\u0000\u0000PQ\u0005i\u0000\u0000QV\u0005i\u0000\u0000RS\u0005i\u0000"+
		"\u0000ST\u0005i\u0000\u0000TV\u0005i\u0000\u0000UO\u0001\u0000\u0000\u0000"+
		"UP\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WH\u0001\u0000\u0000\u0000WJ\u0001\u0000"+
		"\u0000\u0000WM\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005"+
		".\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[\\\u0005>\u0000\u0000\\\u0016"+
		"\u0001\u0000\u0000\u0000]^\u0005*\u0000\u0000^\u0018\u0001\u0000\u0000"+
		"\u0000_`\u0005x\u0000\u0000`\u001a\u0001\u0000\u0000\u0000ab\u0005f\u0000"+
		"\u0000bc\u0005r\u0000\u0000cd\u0005e\u0000\u0000de\u0005e\u0000\u0000"+
		"e\u001c\u0001\u0000\u0000\u0000fg\u0007\u0003\u0000\u0000g\u001e\u0001"+
		"\u0000\u0000\u0000hi\u0007\u0004\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0006\u000f\u0000\u0000k \u0001\u0000\u0000\u0000\n\u0000*/36=DMUW"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}