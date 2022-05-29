// Generated from C:/Users/Nandinho/Desktop/projeto_lapr4/Java Project/grammar/grammars\Validator.g4 by ANTLR 4.10.1
package lapr4.grammar.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValidatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, NAME=22, STRING=23, INT=24, WS=25;
	public static final int
		RULE_start = 0, RULE_atrribution = 1, RULE_val = 2, RULE_question = 3, 
		RULE_section = 4, RULE_intArg = 5, RULE_optionalArg = 6, RULE_validation = 7, 
		RULE_include = 8, RULE_optional = 9, RULE_optionalBody = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "atrribution", "val", "question", "section", "intArg", "optionalArg", 
			"validation", "include", "optional", "optionalBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<-'", "'Q'", "'x'", "'{'", "','", "'}'", "'S'", "'text'", "'('", 
			"')'", "'isInt'", "'()'", "'isNumeric'", "'singleChoice'", "'multipleChoice'", 
			"'singleChoiceT'", "'multipleChoiceT'", "'sort'", "'scale'", "'#include'", 
			"'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "NAME", "STRING", 
			"INT", "WS"
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
	public String getGrammarFileName() { return "Validator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ValidatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public List<AtrributionContext> atrribution() {
			return getRuleContexts(AtrributionContext.class);
		}
		public AtrributionContext atrribution(int i) {
			return getRuleContext(AtrributionContext.class,i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			include();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(23);
				atrribution();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__6) {
				{
				setState(31);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(29);
					section();
					}
					break;
				case T__1:
					{
					setState(30);
					question();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AtrributionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ValidatorParser.NAME, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AtrributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterAtrribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitAtrribution(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitAtrribution(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtrributionContext atrribution() throws RecognitionException {
		AtrributionContext _localctx = new AtrributionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atrribution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(NAME);
			setState(37);
			match(T__0);
			setState(38);
			val();
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

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntOContext extends ValContext {
		public OptionalContext optional() {
			return getRuleContext(OptionalContext.class,0);
		}
		public IntOContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterIntO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitIntO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitIntO(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntVContext extends ValContext {
		public TerminalNode INT() { return getToken(ValidatorParser.INT, 0); }
		public IntVContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterIntV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitIntV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitIntV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_val);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntVContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(INT);
				}
				break;
			case T__20:
				_localctx = new IntOContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				optional();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class QuestionContext extends ParserRuleContext {
		public Token opt;
		public Token secIndex;
		public Token qIndex;
		public ValidationContext validation() {
			return getRuleContext(ValidationContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(ValidatorParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ValidatorParser.INT, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(45);
				((QuestionContext)_localctx).opt = match(T__2);
				}
			}

			setState(48);
			match(T__0);
			setState(49);
			match(T__3);
			setState(50);
			((QuestionContext)_localctx).secIndex = match(INT);
			setState(51);
			match(T__4);
			setState(52);
			((QuestionContext)_localctx).qIndex = match(INT);
			setState(53);
			match(T__4);
			setState(54);
			validation();
			setState(55);
			match(T__5);
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

	public static class SectionContext extends ParserRuleContext {
		public Token opt;
		public TerminalNode INT() { return getToken(ValidatorParser.INT, 0); }
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__6);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(58);
				((SectionContext)_localctx).opt = match(T__2);
				}
			}

			setState(61);
			match(T__0);
			setState(62);
			match(T__3);
			setState(63);
			match(INT);
			setState(64);
			match(T__5);
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

	public static class IntArgContext extends ParserRuleContext {
		public IntArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArg; }
	 
		public IntArgContext() { }
		public void copyFrom(IntArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntValContext extends IntArgContext {
		public TerminalNode INT() { return getToken(ValidatorParser.INT, 0); }
		public IntValContext(IntArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitIntVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntVarContext extends IntArgContext {
		public TerminalNode NAME() { return getToken(ValidatorParser.NAME, 0); }
		public IntVarContext(IntArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterIntVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitIntVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitIntVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArgContext intArg() throws RecognitionException {
		IntArgContext _localctx = new IntArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intArg);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new IntVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(NAME);
				}
				break;
			case INT:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OptionalArgContext extends ParserRuleContext {
		public OptionalArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalArg; }
	 
		public OptionalArgContext() { }
		public void copyFrom(OptionalArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptValContext extends OptionalArgContext {
		public OptionalContext optional() {
			return getRuleContext(OptionalContext.class,0);
		}
		public OptValContext(OptionalArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterOptVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitOptVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitOptVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptVarContext extends OptionalArgContext {
		public TerminalNode NAME() { return getToken(ValidatorParser.NAME, 0); }
		public OptVarContext(OptionalArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterOptVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitOptVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitOptVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalArgContext optionalArg() throws RecognitionException {
		OptionalArgContext _localctx = new OptionalArgContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optionalArg);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new OptVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(NAME);
				}
				break;
			case T__20:
				_localctx = new OptValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				optional();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ValidationContext extends ParserRuleContext {
		public ValidationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_validation; }
	 
		public ValidationContext() { }
		public void copyFrom(ValidationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SortVContext extends ValidationContext {
		public OptionalArgContext opt;
		public OptionalArgContext optionalArg() {
			return getRuleContext(OptionalArgContext.class,0);
		}
		public SortVContext(ValidationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterSortV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitSortV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitSortV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleChoiceTVContext extends ValidationContext {
		public OptionalArgContext opt;
		public OptionalArgContext optionalArg() {
			return getRuleContext(OptionalArgContext.class,0);
		}
		public SingleChoiceTVContext(ValidationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterSingleChoiceTV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitSingleChoiceTV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitSingleChoiceTV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScaleVContext extends ValidationContext {
		public IntArgContext sec;
		public OptionalArgContext opt;
		public IntArgContext intArg() {
			return getRuleContext(IntArgContext.class,0);
		}
		public OptionalArgContext optionalArg() {
			return getRuleContext(OptionalArgContext.class,0);
		}
		public ScaleVContext(ValidationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterScaleV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitScaleV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitScaleV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleChoiceTVContext extends ValidationContext {
		public OptionalArgContext opt;
		public IntArgContext maxChoices;
		public OptionalArgContext optionalArg() {
			return getRuleContext(OptionalArgContext.class,0);
		}
		public IntArgContext intArg() {
			return getRuleContext(IntArgContext.class,0);
		}
		public MultipleChoiceTVContext(ValidationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterMultipleChoiceTV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitMultipleChoiceTV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitMultipleChoiceTV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsIntVContext extends ValidationContext {
		public IsIntVContext(ValidationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterIsIntV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitIsIntV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitIsIntV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsNumericVContext extends ValidationContext {
		public IsNumericVContext(ValidationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterIsNumericV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitIsNumericV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitIsNumericV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextVContext extends ValidationContext {
		public IntArgContext nLines;
		public IntArgContext nCharPerLine;
		public List<IntArgContext> intArg() {
			return getRuleContexts(IntArgContext.class);
		}
		public IntArgContext intArg(int i) {
			return getRuleContext(IntArgContext.class,i);
		}
		public TextVContext(ValidationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterTextV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitTextV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitTextV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleChoiceVContext extends ValidationContext {
		public OptionalArgContext opt;
		public OptionalArgContext optionalArg() {
			return getRuleContext(OptionalArgContext.class,0);
		}
		public SingleChoiceVContext(ValidationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterSingleChoiceV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitSingleChoiceV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitSingleChoiceV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleChoiceVContext extends ValidationContext {
		public OptionalArgContext opt;
		public IntArgContext maxChoices;
		public OptionalArgContext optionalArg() {
			return getRuleContext(OptionalArgContext.class,0);
		}
		public IntArgContext intArg() {
			return getRuleContext(IntArgContext.class,0);
		}
		public MultipleChoiceVContext(ValidationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterMultipleChoiceV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitMultipleChoiceV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitMultipleChoiceV(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValidationContext validation() throws RecognitionException {
		ValidationContext _localctx = new ValidationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_validation);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new TextVContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__7);
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(75);
					match(T__8);
					setState(76);
					match(T__9);
					}
					break;
				case 2:
					{
					setState(77);
					match(T__8);
					setState(78);
					((TextVContext)_localctx).nLines = intArg();
					setState(79);
					match(T__4);
					setState(80);
					((TextVContext)_localctx).nCharPerLine = intArg();
					setState(81);
					match(T__9);
					}
					break;
				}
				}
				break;
			case T__10:
				_localctx = new IsIntVContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(T__10);
				setState(86);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new IsNumericVContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(T__12);
				setState(88);
				match(T__11);
				}
				break;
			case T__13:
				_localctx = new SingleChoiceVContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(T__13);
				setState(90);
				match(T__8);
				setState(91);
				((SingleChoiceVContext)_localctx).opt = optionalArg();
				setState(92);
				match(T__9);
				}
				break;
			case T__14:
				_localctx = new MultipleChoiceVContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(T__14);
				setState(95);
				match(T__8);
				setState(96);
				((MultipleChoiceVContext)_localctx).opt = optionalArg();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(97);
					match(T__4);
					setState(98);
					((MultipleChoiceVContext)_localctx).maxChoices = intArg();
					}
				}

				setState(101);
				match(T__9);
				}
				break;
			case T__15:
				_localctx = new SingleChoiceTVContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				match(T__15);
				setState(104);
				match(T__8);
				setState(105);
				((SingleChoiceTVContext)_localctx).opt = optionalArg();
				setState(106);
				match(T__9);
				}
				break;
			case T__16:
				_localctx = new MultipleChoiceTVContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				match(T__16);
				setState(109);
				match(T__8);
				setState(110);
				((MultipleChoiceTVContext)_localctx).opt = optionalArg();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(111);
					match(T__4);
					setState(112);
					((MultipleChoiceTVContext)_localctx).maxChoices = intArg();
					}
				}

				setState(115);
				match(T__9);
				}
				break;
			case T__17:
				_localctx = new SortVContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				match(T__17);
				setState(118);
				match(T__8);
				setState(119);
				((SortVContext)_localctx).opt = optionalArg();
				setState(120);
				match(T__9);
				}
				break;
			case T__18:
				_localctx = new ScaleVContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				match(T__18);
				setState(123);
				match(T__8);
				setState(124);
				((ScaleVContext)_localctx).sec = intArg();
				setState(125);
				match(T__4);
				setState(126);
				((ScaleVContext)_localctx).opt = optionalArg();
				setState(127);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IncludeContext extends ParserRuleContext {
		public Token formName;
		public TerminalNode NAME() { return getToken(ValidatorParser.NAME, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitInclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitInclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__19);
			setState(132);
			((IncludeContext)_localctx).formName = match(NAME);
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

	public static class OptionalContext extends ParserRuleContext {
		public OptionalBodyContext optionalBody() {
			return getRuleContext(OptionalBodyContext.class,0);
		}
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_optional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__20);
			setState(135);
			optionalBody();
			setState(136);
			match(T__20);
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

	public static class OptionalBodyContext extends ParserRuleContext {
		public OptionalBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBody; }
	 
		public OptionalBodyContext() { }
		public void copyFrom(OptionalBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OptBodyMultipleContext extends OptionalBodyContext {
		public Token atom;
		public OptionalBodyContext optionalBody() {
			return getRuleContext(OptionalBodyContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ValidatorParser.STRING, 0); }
		public OptBodyMultipleContext(OptionalBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterOptBodyMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitOptBodyMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitOptBodyMultiple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptBodyAtomContext extends OptionalBodyContext {
		public Token atom;
		public TerminalNode STRING() { return getToken(ValidatorParser.STRING, 0); }
		public OptBodyAtomContext(OptionalBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).enterOptBodyAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidatorListener ) ((ValidatorListener)listener).exitOptBodyAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidatorVisitor ) return ((ValidatorVisitor<? extends T>)visitor).visitOptBodyAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalBodyContext optionalBody() throws RecognitionException {
		OptionalBodyContext _localctx = new OptionalBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_optionalBody);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new OptBodyMultipleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((OptBodyMultipleContext)_localctx).atom = match(STRING);
				setState(139);
				match(T__4);
				setState(140);
				optionalBody();
				}
				break;
			case 2:
				_localctx = new OptBodyAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((OptBodyAtomContext)_localctx).atom = match(STRING);
				}
				break;
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002+\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003/\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004<\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005E\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006I\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007T\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007d\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007r\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0082\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008f"+
		"\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0000\u0000\u0099\u0000\u0016\u0001\u0000\u0000\u0000\u0002"+
		"$\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006,\u0001"+
		"\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000"+
		"\fH\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000\u0010"+
		"\u0083\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000\u0000\u0000\u0014"+
		"\u008e\u0001\u0000\u0000\u0000\u0016\u001a\u0003\u0010\b\u0000\u0017\u0019"+
		"\u0003\u0002\u0001\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b!\u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001d \u0003\b\u0004\u0000\u001e \u0003\u0006\u0003"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001"+
		"\u0000\u0000\u0000\"\u0001\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0016\u0000\u0000%&\u0005\u0001\u0000\u0000&\'\u0003\u0004"+
		"\u0002\u0000\'\u0003\u0001\u0000\u0000\u0000(+\u0005\u0018\u0000\u0000"+
		")+\u0003\u0012\t\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000"+
		"+\u0005\u0001\u0000\u0000\u0000,.\u0005\u0002\u0000\u0000-/\u0005\u0003"+
		"\u0000\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0005\u0001\u0000\u000012\u0005\u0004\u0000\u0000"+
		"23\u0005\u0018\u0000\u000034\u0005\u0005\u0000\u000045\u0005\u0018\u0000"+
		"\u000056\u0005\u0005\u0000\u000067\u0003\u000e\u0007\u000078\u0005\u0006"+
		"\u0000\u00008\u0007\u0001\u0000\u0000\u00009;\u0005\u0007\u0000\u0000"+
		":<\u0005\u0003\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u0001\u0000\u0000>?\u0005\u0004"+
		"\u0000\u0000?@\u0005\u0018\u0000\u0000@A\u0005\u0006\u0000\u0000A\t\u0001"+
		"\u0000\u0000\u0000BE\u0005\u0016\u0000\u0000CE\u0005\u0018\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u000b\u0001\u0000"+
		"\u0000\u0000FI\u0005\u0016\u0000\u0000GI\u0003\u0012\t\u0000HF\u0001\u0000"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000I\r\u0001\u0000\u0000\u0000JS\u0005"+
		"\b\u0000\u0000KL\u0005\t\u0000\u0000LT\u0005\n\u0000\u0000MN\u0005\t\u0000"+
		"\u0000NO\u0003\n\u0005\u0000OP\u0005\u0005\u0000\u0000PQ\u0003\n\u0005"+
		"\u0000QR\u0005\n\u0000\u0000RT\u0001\u0000\u0000\u0000SK\u0001\u0000\u0000"+
		"\u0000SM\u0001\u0000\u0000\u0000T\u0082\u0001\u0000\u0000\u0000UV\u0005"+
		"\u000b\u0000\u0000V\u0082\u0005\f\u0000\u0000WX\u0005\r\u0000\u0000X\u0082"+
		"\u0005\f\u0000\u0000YZ\u0005\u000e\u0000\u0000Z[\u0005\t\u0000\u0000["+
		"\\\u0003\f\u0006\u0000\\]\u0005\n\u0000\u0000]\u0082\u0001\u0000\u0000"+
		"\u0000^_\u0005\u000f\u0000\u0000_`\u0005\t\u0000\u0000`c\u0003\f\u0006"+
		"\u0000ab\u0005\u0005\u0000\u0000bd\u0003\n\u0005\u0000ca\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005\n\u0000"+
		"\u0000f\u0082\u0001\u0000\u0000\u0000gh\u0005\u0010\u0000\u0000hi\u0005"+
		"\t\u0000\u0000ij\u0003\f\u0006\u0000jk\u0005\n\u0000\u0000k\u0082\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0011\u0000\u0000mn\u0005\t\u0000\u0000nq\u0003"+
		"\f\u0006\u0000op\u0005\u0005\u0000\u0000pr\u0003\n\u0005\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0005\n\u0000\u0000t\u0082\u0001\u0000\u0000\u0000uv\u0005\u0012\u0000"+
		"\u0000vw\u0005\t\u0000\u0000wx\u0003\f\u0006\u0000xy\u0005\n\u0000\u0000"+
		"y\u0082\u0001\u0000\u0000\u0000z{\u0005\u0013\u0000\u0000{|\u0005\t\u0000"+
		"\u0000|}\u0003\n\u0005\u0000}~\u0005\u0005\u0000\u0000~\u007f\u0003\f"+
		"\u0006\u0000\u007f\u0080\u0005\n\u0000\u0000\u0080\u0082\u0001\u0000\u0000"+
		"\u0000\u0081J\u0001\u0000\u0000\u0000\u0081U\u0001\u0000\u0000\u0000\u0081"+
		"W\u0001\u0000\u0000\u0000\u0081Y\u0001\u0000\u0000\u0000\u0081^\u0001"+
		"\u0000\u0000\u0000\u0081g\u0001\u0000\u0000\u0000\u0081l\u0001\u0000\u0000"+
		"\u0000\u0081u\u0001\u0000\u0000\u0000\u0081z\u0001\u0000\u0000\u0000\u0082"+
		"\u000f\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0014\u0000\u0000\u0084"+
		"\u0085\u0005\u0016\u0000\u0000\u0085\u0011\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u0015\u0000\u0000\u0087\u0088\u0003\u0014\n\u0000\u0088\u0089"+
		"\u0005\u0015\u0000\u0000\u0089\u0013\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005\u0017\u0000\u0000\u008b\u008c\u0005\u0005\u0000\u0000\u008c\u008f"+
		"\u0003\u0014\n\u0000\u008d\u008f\u0005\u0017\u0000\u0000\u008e\u008a\u0001"+
		"\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0015\u0001"+
		"\u0000\u0000\u0000\r\u001a\u001f!*.;DHScq\u0081\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}