// Generated from C:/Users/pedro/OneDrive/Documentos/lei21_22_s4_2de_05/Java Project/base.core/src/main/java/eapli/base/surveymanagement/application4\surveyGrammar.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.application;

    import java.lang.*;

    import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
    import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class surveyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NUMBER=4, STRING=5, ALFANUMERIC=6, NEWLINE=7, 
		SECTION=8, ALIGN=9, OPTION=10, CHOICEMUL=11, MANDATORY=12, OPTIONAL=13, 
		FREE=14, SYMBOLS=15, WS=16;
	public static final int
		RULE_prog = 0, RULE_survey = 1, RULE_newline = 2, RULE_surveyID = 3, RULE_title = 4, 
		RULE_message = 5, RULE_finalMessage = 6, RULE_section = 7, RULE_align = 8, 
		RULE_option = 9, RULE_free = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "survey", "newline", "surveyID", "title", "message", "finalMessage", 
			"section", "align", "option", "free"
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

	@Override
	public String getGrammarFileName() { return "surveyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }





	public surveyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public SurveyContext survey() {
			return getRuleContext(SurveyContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			survey();
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

	public static class SurveyContext extends ParserRuleContext {
		public SurveyIDContext surveyID() {
			return getRuleContext(SurveyIDContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public FinalMessageContext finalMessage() {
			return getRuleContext(FinalMessageContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public SurveyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_survey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterSurvey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitSurvey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitSurvey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurveyContext survey() throws RecognitionException {
		SurveyContext _localctx = new SurveyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_survey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			surveyID();
			setState(25);
			title();
			setState(26);
			message();
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				section();
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SECTION );
			setState(32);
			finalMessage();
			setState(33);
			newline();
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

	public static class NewlineContext extends ParserRuleContext {
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
	 
		public NewlineContext() { }
		public void copyFrom(NewlineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrgfContext extends NewlineContext {
		public List<TerminalNode> NEWLINE() { return getTokens(surveyGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(surveyGrammarParser.NEWLINE, i);
		}
		public PrgfContext(NewlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterPrgf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitPrgf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitPrgf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_newline);
		int _la;
		try {
			_localctx = new PrgfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(NEWLINE);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SurveyIDContext extends ParserRuleContext {
		public SurveyIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surveyID; }
	 
		public SurveyIDContext() { }
		public void copyFrom(SurveyIDContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SurvIDContext extends SurveyIDContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(surveyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(surveyGrammarParser.NUMBER, i);
		}
		public SurvIDContext(SurveyIDContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterSurvID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitSurvID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitSurvID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurveyIDContext surveyID() throws RecognitionException {
		SurveyIDContext _localctx = new SurveyIDContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_surveyID);
		int _la;
		try {
			_localctx = new SurvIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				match(NUMBER);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(45);
			match(T__0);
			setState(46);
			title();
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

	public static class TitleContext extends ParserRuleContext {
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
	 
		public TitleContext() { }
		public void copyFrom(TitleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TltContext extends TitleContext {
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(surveyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(surveyGrammarParser.STRING, i);
		}
		public TltContext(TitleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterTlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitTlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitTlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_title);
		int _la;
		try {
			_localctx = new TltContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				match(STRING);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
			setState(53);
			newline();
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

	public static class MessageContext extends ParserRuleContext {
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
	 
		public MessageContext() { }
		public void copyFrom(MessageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MsgContext extends MessageContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public MsgContext(MessageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterMsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitMsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitMsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_message);
		try {
			_localctx = new MsgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			title();
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

	public static class FinalMessageContext extends ParserRuleContext {
		public FinalMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalMessage; }
	 
		public FinalMessageContext() { }
		public void copyFrom(FinalMessageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FinalMsgContext extends FinalMessageContext {
		public List<TerminalNode> STRING() { return getTokens(surveyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(surveyGrammarParser.STRING, i);
		}
		public FinalMsgContext(FinalMessageContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterFinalMsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitFinalMsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitFinalMsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalMessageContext finalMessage() throws RecognitionException {
		FinalMessageContext _localctx = new FinalMessageContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_finalMessage);
		int _la;
		try {
			_localctx = new FinalMsgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(STRING);
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
	 
		public SectionContext() { }
		public void copyFrom(SectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SctionContext extends SectionContext {
		public TerminalNode SECTION() { return getToken(surveyGrammarParser.SECTION, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<AlignContext> align() {
			return getRuleContexts(AlignContext.class);
		}
		public AlignContext align(int i) {
			return getRuleContext(AlignContext.class,i);
		}
		public SctionContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterSction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitSction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitSction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_section);
		int _la;
		try {
			_localctx = new SctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(SECTION);
			setState(63);
			title();
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				align();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ALIGN );
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

	public static class AlignContext extends ParserRuleContext {
		public AlignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_align; }
	 
		public AlignContext() { }
		public void copyFrom(AlignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpenAnswerContext extends AlignContext {
		public TerminalNode ALIGN() { return getToken(surveyGrammarParser.ALIGN, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(surveyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(surveyGrammarParser.STRING, i);
		}
		public TerminalNode MANDATORY() { return getToken(surveyGrammarParser.MANDATORY, 0); }
		public OpenAnswerContext(AlignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterOpenAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitOpenAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitOpenAnswer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FreeAnswerContext extends AlignContext {
		public TerminalNode ALIGN() { return getToken(surveyGrammarParser.ALIGN, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(surveyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(surveyGrammarParser.STRING, i);
		}
		public TerminalNode MANDATORY() { return getToken(surveyGrammarParser.MANDATORY, 0); }
		public TerminalNode FREE() { return getToken(surveyGrammarParser.FREE, 0); }
		public List<FreeContext> free() {
			return getRuleContexts(FreeContext.class);
		}
		public FreeContext free(int i) {
			return getRuleContext(FreeContext.class,i);
		}
		public FreeAnswerContext(AlignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterFreeAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitFreeAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitFreeAnswer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OptionAnswerContext extends AlignContext {
		public TerminalNode ALIGN() { return getToken(surveyGrammarParser.ALIGN, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public TerminalNode OPTION() { return getToken(surveyGrammarParser.OPTION, 0); }
		public List<TerminalNode> STRING() { return getTokens(surveyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(surveyGrammarParser.STRING, i);
		}
		public TerminalNode MANDATORY() { return getToken(surveyGrammarParser.MANDATORY, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public TerminalNode CHOICEMUL() { return getToken(surveyGrammarParser.CHOICEMUL, 0); }
		public OptionAnswerContext(AlignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterOptionAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitOptionAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitOptionAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignContext align() throws RecognitionException {
		AlignContext _localctx = new AlignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_align);
		int _la;
		try {
			int _alt;
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new OpenAnswerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ALIGN);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					match(STRING);
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MANDATORY) {
					{
					setState(75);
					match(MANDATORY);
					}
				}

				setState(78);
				newline();
				}
				break;
			case 2:
				_localctx = new OptionAnswerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(ALIGN);
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					match(STRING);
					}
					}
					setState(83); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MANDATORY) {
					{
					setState(85);
					match(MANDATORY);
					}
				}

				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(88);
					match(OPTION);
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CHOICEMUL) {
						{
						setState(89);
						match(CHOICEMUL);
						}
					}

					}
					break;
				case 2:
					{
					}
					break;
				case 3:
					{
					setState(93);
					match(OPTION);
					}
					break;
				}
				setState(96);
				newline();
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					option();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OPTION );
				}
				break;
			case 3:
				_localctx = new FreeAnswerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(ALIGN);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					match(STRING);
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MANDATORY) {
					{
					setState(108);
					match(MANDATORY);
					}
				}

				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FREE) {
					{
					setState(111);
					match(FREE);
					}
				}

				setState(114);
				newline();
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(115);
						free();
						}
						} 
					}
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
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

	public static class OptionContext extends ParserRuleContext {
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
	 
		public OptionContext() { }
		public void copyFrom(OptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalOptionContext extends OptionContext {
		public TerminalNode OPTION() { return getToken(surveyGrammarParser.OPTION, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(surveyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(surveyGrammarParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(surveyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(surveyGrammarParser.NUMBER, i);
		}
		public NormalOptionContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterNormalOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitNormalOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitNormalOption(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OtherOptionContext extends OptionContext {
		public TerminalNode OPTION() { return getToken(surveyGrammarParser.OPTION, 0); }
		public TerminalNode STRING() { return getToken(surveyGrammarParser.STRING, 0); }
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public OtherOptionContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterOtherOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).exitOtherOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((eapli.base.surveymanagement.application.surveyGrammarVisitor<? extends T>)visitor).visitOtherOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_option);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new NormalOptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(OPTION);
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					_la = _input.LA(1);
					if ( !(_la==NUMBER || _la==STRING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER || _la==STRING );
				setState(129);
				match(T__1);
				setState(130);
				newline();
				}
				break;
			case 2:
				_localctx = new OtherOptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(OPTION);
				setState(132);
				match(STRING);
				setState(133);
				match(T__2);
				setState(134);
				newline();
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

	public static class FreeContext extends ParserRuleContext {
		public FreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_free; }
	 
		public FreeContext() { }
		public void copyFrom(FreeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FreeOptionContext extends FreeContext {
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public List<TerminalNode> SYMBOLS() { return getTokens(surveyGrammarParser.SYMBOLS); }
		public TerminalNode SYMBOLS(int i) {
			return getToken(surveyGrammarParser.SYMBOLS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(surveyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(surveyGrammarParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(surveyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(surveyGrammarParser.NUMBER, i);
		}
		public List<TerminalNode> ALFANUMERIC() { return getTokens(surveyGrammarParser.ALFANUMERIC); }
		public TerminalNode ALFANUMERIC(int i) {
			return getToken(surveyGrammarParser.ALFANUMERIC, i);
		}
		public FreeOptionContext(FreeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((eapli.base.surveymanagement.application.surveyGrammarListener)listener).enterFreeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof eapli.base.surveymanagement.application.surveyGrammarListener) ((surveyGrammarListener)listener).exitFreeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof eapli.base.surveymanagement.application.surveyGrammarVisitor) return ((surveyGrammarVisitor<? extends T>)visitor).visitFreeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreeContext free() throws RecognitionException {
		FreeContext _localctx = new FreeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_free);
		int _la;
		try {
			_localctx = new FreeOptionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ALFANUMERIC) | (1L << SYMBOLS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ALFANUMERIC) | (1L << SYMBOLS))) != 0) );
			setState(142);
			newline();
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
		"\u0004\u0001\u0010\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001d\b\u0001"+
		"\u000b\u0001\f\u0001\u001e\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0004\u0002%\b\u0002\u000b\u0002\f\u0002&\u0001\u0003\u0004\u0003*\b"+
		"\u0003\u000b\u0003\f\u0003+\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0004\u00042\b\u0004\u000b\u0004\f\u00043\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u0006;\b\u0006\u000b\u0006"+
		"\f\u0006<\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007B\b\u0007\u000b"+
		"\u0007\f\u0007C\u0001\b\u0001\b\u0004\bH\b\b\u000b\b\f\bI\u0001\b\u0003"+
		"\bM\b\b\u0001\b\u0001\b\u0001\b\u0004\bR\b\b\u000b\b\f\bS\u0001\b\u0003"+
		"\bW\b\b\u0001\b\u0001\b\u0003\b[\b\b\u0001\b\u0001\b\u0003\b_\b\b\u0001"+
		"\b\u0001\b\u0004\bc\b\b\u000b\b\f\bd\u0001\b\u0001\b\u0004\bi\b\b\u000b"+
		"\b\f\bj\u0001\b\u0003\bn\b\b\u0001\b\u0003\bq\b\b\u0001\b\u0001\b\u0005"+
		"\bu\b\b\n\b\f\bx\t\b\u0003\bz\b\b\u0001\t\u0001\t\u0004\t~\b\t\u000b\t"+
		"\f\t\u007f\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0088"+
		"\b\t\u0001\n\u0004\n\u008b\b\n\u000b\n\f\n\u008c\u0001\n\u0001\n\u0001"+
		"\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0002\u0001\u0000\u0004\u0005\u0002\u0000\u0004\u0006\u000f\u000f"+
		"\u009c\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000"+
		"\u0000\u0004$\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b"+
		"1\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\f:\u0001\u0000\u0000"+
		"\u0000\u000e>\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012"+
		"\u0087\u0001\u0000\u0000\u0000\u0014\u008a\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0003\u0002\u0001\u0000\u0017\u0001\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0003\u0006\u0003\u0000\u0019\u001a\u0003\b\u0004\u0000\u001a\u001c"+
		"\u0003\n\u0005\u0000\u001b\u001d\u0003\u000e\u0007\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000"+
		"\u0000\u0000 !\u0003\f\u0006\u0000!\"\u0003\u0004\u0002\u0000\"\u0003"+
		"\u0001\u0000\u0000\u0000#%\u0005\u0007\u0000\u0000$#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000(*\u0005\u0004\u0000\u0000"+
		")(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0001"+
		"\u0000\u0000./\u0003\b\u0004\u0000/\u0007\u0001\u0000\u0000\u000002\u0005"+
		"\u0005\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000"+
		"\u000056\u0003\u0004\u0002\u00006\t\u0001\u0000\u0000\u000078\u0003\b"+
		"\u0004\u00008\u000b\u0001\u0000\u0000\u00009;\u0005\u0005\u0000\u0000"+
		":9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=\r\u0001\u0000\u0000\u0000>?\u0005\b"+
		"\u0000\u0000?A\u0003\b\u0004\u0000@B\u0003\u0010\b\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000D\u000f\u0001\u0000\u0000\u0000EG\u0005\t\u0000\u0000"+
		"FH\u0005\u0005\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000"+
		"\u0000\u0000KM\u0005\f\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000Nz\u0003\u0004\u0002\u0000OQ\u0005"+
		"\t\u0000\u0000PR\u0005\u0005\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000UW\u0005\f\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W^\u0001\u0000\u0000\u0000XZ\u0005\n\u0000\u0000"+
		"Y[\u0005\u000b\u0000\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[_\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000]_\u0005\n"+
		"\u0000\u0000^X\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0003\u0004\u0002\u0000"+
		"ac\u0003\u0012\t\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ez\u0001\u0000\u0000"+
		"\u0000fh\u0005\t\u0000\u0000gi\u0005\u0005\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000km\u0001\u0000\u0000\u0000ln\u0005\f\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000oq\u0005"+
		"\u000e\u0000\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000rv\u0003\u0004\u0002\u0000su\u0003\u0014\n\u0000"+
		"ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000yE\u0001\u0000\u0000\u0000yO\u0001\u0000\u0000\u0000yf\u0001"+
		"\u0000\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{}\u0005\n\u0000\u0000"+
		"|~\u0007\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0002\u0000"+
		"\u0000\u0082\u0088\u0003\u0004\u0002\u0000\u0083\u0084\u0005\n\u0000\u0000"+
		"\u0084\u0085\u0005\u0005\u0000\u0000\u0085\u0086\u0005\u0003\u0000\u0000"+
		"\u0086\u0088\u0003\u0004\u0002\u0000\u0087{\u0001\u0000\u0000\u0000\u0087"+
		"\u0083\u0001\u0000\u0000\u0000\u0088\u0013\u0001\u0000\u0000\u0000\u0089"+
		"\u008b\u0007\u0001\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0003\u0004\u0002\u0000\u008f\u0015\u0001\u0000\u0000\u0000\u0015"+
		"\u001e&+3<CILSVZ^djmpvy\u007f\u0087\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}