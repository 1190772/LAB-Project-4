// Generated from C:/Users/Nandinho/Desktop/projeto_lapr4/Java Project/base.core/src/main/java/eapli/base/surveymanagement/application\surveyGrammar.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.application;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class surveyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NUMBER=5, LETTER=6, STRING=7, ALFANUMERIC=8, 
		SPACE=9, SENTENCE=10, NEWLINE=11, OBLIGATORINESS=12, TYPE=13;
	public static final int
		RULE_prog = 0, RULE_surveyID = 1, RULE_title = 2, RULE_message = 3, RULE_id = 4, 
		RULE_answer = 5, RULE_choice = 6, RULE_numeric = 7, RULE_free = 8, RULE_questionType = 9, 
		RULE_questionQ = 10, RULE_question = 11, RULE_condition = 12, RULE_section = 13, 
		RULE_survey = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "surveyID", "title", "message", "id", "answer", "choice", "numeric", 
			"free", "questionType", "questionQ", "question", "condition", "section", 
			"survey"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'_'", "'?'", "'Dependent about the question: '", "'and on the section: '", 
			null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NUMBER", "LETTER", "STRING", "ALFANUMERIC", 
			"SPACE", "SENTENCE", "NEWLINE", "OBLIGATORINESS", "TYPE"
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
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
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

	public static class SurveyIDContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(surveyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(surveyGrammarParser.NUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(surveyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(surveyGrammarParser.STRING, i);
		}
		public SurveyIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surveyID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterSurveyID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitSurveyID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitSurveyID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurveyIDContext surveyID() throws RecognitionException {
		SurveyIDContext _localctx = new SurveyIDContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_surveyID);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(32);
					match(NUMBER);
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(37);
				match(T__0);
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(38);
					match(STRING);
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					match(STRING);
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				setState(48);
				match(T__0);
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(49);
					match(NUMBER);
					}
					}
					setState(52); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(surveyGrammarParser.NEWLINE, 0); }
		public TerminalNode STRING() { return getToken(surveyGrammarParser.STRING, 0); }
		public TerminalNode SENTENCE() { return getToken(surveyGrammarParser.SENTENCE, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==SENTENCE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
			match(NEWLINE);
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
		public TerminalNode SENTENCE() { return getToken(surveyGrammarParser.SENTENCE, 0); }
		public TerminalNode NEWLINE() { return getToken(surveyGrammarParser.NEWLINE, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(SENTENCE);
			setState(60);
			match(NEWLINE);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(surveyGrammarParser.NEWLINE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(surveyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(surveyGrammarParser.NUMBER, i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(NUMBER);
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(67);
			match(NEWLINE);
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

	public static class AnswerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(surveyGrammarParser.STRING, 0); }
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(STRING);
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

	public static class ChoiceContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<AnswerContext> answer() {
			return getRuleContexts(AnswerContext.class);
		}
		public AnswerContext answer(int i) {
			return getRuleContext(AnswerContext.class,i);
		}
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				id();
				setState(72);
				answer();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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

	public static class NumericContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(surveyGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(surveyGrammarParser.NUMBER, i);
		}
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitNumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				match(NUMBER);
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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
		public List<TerminalNode> STRING() { return getTokens(surveyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(surveyGrammarParser.STRING, i);
		}
		public FreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_free; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterFree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitFree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitFree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreeContext free() throws RecognitionException {
		FreeContext _localctx = new FreeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_free);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(83);
				match(STRING);
				}
				}
				setState(88);
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

	public static class QuestionTypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(surveyGrammarParser.TYPE, 0); }
		public TerminalNode NEWLINE() { return getToken(surveyGrammarParser.NEWLINE, 0); }
		public FreeContext free() {
			return getRuleContext(FreeContext.class,0);
		}
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public ChoiceContext choice() {
			return getRuleContext(ChoiceContext.class,0);
		}
		public QuestionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterQuestionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitQuestionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitQuestionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionTypeContext questionType() throws RecognitionException {
		QuestionTypeContext _localctx = new QuestionTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_questionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(TYPE);
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(90);
				free();
				}
				break;
			case 2:
				{
				setState(91);
				numeric();
				}
				break;
			case 3:
				{
				setState(92);
				choice();
				}
				break;
			}
			setState(95);
			match(NEWLINE);
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

	public static class QuestionQContext extends ParserRuleContext {
		public TerminalNode SENTENCE() { return getToken(surveyGrammarParser.SENTENCE, 0); }
		public TerminalNode NEWLINE() { return getToken(surveyGrammarParser.NEWLINE, 0); }
		public QuestionQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterQuestionQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitQuestionQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitQuestionQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionQContext questionQ() throws RecognitionException {
		QuestionQContext _localctx = new QuestionQContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_questionQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SENTENCE);
			setState(98);
			match(T__1);
			setState(99);
			match(NEWLINE);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public QuestionTypeContext questionType() {
			return getRuleContext(QuestionTypeContext.class,0);
		}
		public TerminalNode OBLIGATORINESS() { return getToken(surveyGrammarParser.OBLIGATORINESS, 0); }
		public QuestionQContext questionQ() {
			return getRuleContext(QuestionQContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_question);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(101);
				id();
				setState(102);
				questionType();
				setState(103);
				match(OBLIGATORINESS);
				setState(104);
				questionQ();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SENTENCE) {
					{
					setState(105);
					message();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(108);
				id();
				setState(109);
				questionType();
				setState(110);
				condition();
				setState(111);
				questionQ();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SENTENCE) {
					{
					setState(112);
					message();
					}
				}

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

	public static class ConditionContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(surveyGrammarParser.NEWLINE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__2);
			setState(118);
			id();
			setState(119);
			match(T__3);
			setState(120);
			id();
			setState(121);
			match(NEWLINE);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(surveyGrammarParser.NEWLINE, 0); }
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			id();
			setState(124);
			title();
			setState(125);
			message();
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				question();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(131);
			match(NEWLINE);
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
		public TerminalNode NEWLINE() { return getToken(surveyGrammarParser.NEWLINE, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
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
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).enterSurvey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof surveyGrammarListener ) ((surveyGrammarListener)listener).exitSurvey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof surveyGrammarVisitor ) return ((surveyGrammarVisitor<? extends T>)visitor).visitSurvey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurveyContext survey() throws RecognitionException {
		SurveyContext _localctx = new SurveyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_survey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			surveyID();
			setState(134);
			match(NEWLINE);
			setState(135);
			title();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENTENCE) {
				{
				setState(136);
				message();
				}
			}

			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				section();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(144);
			message();
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
		"\u0004\u0001\r\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001\f\u0001#\u0001\u0001\u0001"+
		"\u0001\u0004\u0001(\b\u0001\u000b\u0001\f\u0001)\u0001\u0001\u0004\u0001"+
		"-\b\u0001\u000b\u0001\f\u0001.\u0001\u0001\u0001\u0001\u0004\u00013\b"+
		"\u0001\u000b\u0001\f\u00014\u0003\u00017\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004"+
		"@\b\u0004\u000b\u0004\f\u0004A\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006K\b\u0006\u000b"+
		"\u0006\f\u0006L\u0001\u0007\u0004\u0007P\b\u0007\u000b\u0007\f\u0007Q"+
		"\u0001\b\u0005\bU\b\b\n\b\f\bX\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t^\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bk\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000br\b"+
		"\u000b\u0003\u000bt\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u0080\b\r\u000b\r\f\r\u0081"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u008a\b\u000e\u0001\u000e\u0004\u000e\u008d\b\u000e\u000b\u000e"+
		"\f\u000e\u008e\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0001\u0002\u0000\u0007\u0007\n\n\u0094\u0000\u001e\u0001\u0000"+
		"\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000"+
		"\u0006;\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nE\u0001\u0000"+
		"\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000eO\u0001\u0000\u0000\u0000"+
		"\u0010V\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000\u0000\u0014a"+
		"\u0001\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018u\u0001\u0000"+
		"\u0000\u0000\u001a{\u0001\u0000\u0000\u0000\u001c\u0085\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0003\u001c\u000e\u0000\u001f\u0001\u0001\u0000\u0000"+
		"\u0000 \"\u0005\u0005\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%\'\u0005\u0001\u0000\u0000&(\u0005\u0007\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*7\u0001\u0000\u0000\u0000+-\u0005\u0007"+
		"\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"02\u0005\u0001\u0000\u000013\u0005\u0005\u0000\u000021\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000057\u0001\u0000\u0000\u00006!\u0001\u0000\u0000\u00006,\u0001"+
		"\u0000\u0000\u00007\u0003\u0001\u0000\u0000\u000089\u0007\u0000\u0000"+
		"\u00009:\u0005\u000b\u0000\u0000:\u0005\u0001\u0000\u0000\u0000;<\u0005"+
		"\n\u0000\u0000<=\u0005\u000b\u0000\u0000=\u0007\u0001\u0000\u0000\u0000"+
		">@\u0005\u0005\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000"+
		"\u0000\u0000CD\u0005\u000b\u0000\u0000D\t\u0001\u0000\u0000\u0000EF\u0005"+
		"\u0007\u0000\u0000F\u000b\u0001\u0000\u0000\u0000GH\u0003\b\u0004\u0000"+
		"HI\u0003\n\u0005\u0000IK\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\r\u0001\u0000\u0000\u0000NP\u0005\u0005\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000R\u000f\u0001\u0000\u0000\u0000SU\u0005\u0007\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0011\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y]\u0005\r\u0000\u0000Z^\u0003\u0010\b\u0000"+
		"[^\u0003\u000e\u0007\u0000\\^\u0003\f\u0006\u0000]Z\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_`\u0005\u000b\u0000\u0000`\u0013\u0001\u0000\u0000\u0000"+
		"ab\u0005\n\u0000\u0000bc\u0005\u0002\u0000\u0000cd\u0005\u000b\u0000\u0000"+
		"d\u0015\u0001\u0000\u0000\u0000ef\u0003\b\u0004\u0000fg\u0003\u0012\t"+
		"\u0000gh\u0005\f\u0000\u0000hj\u0003\u0014\n\u0000ik\u0003\u0006\u0003"+
		"\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kt\u0001\u0000"+
		"\u0000\u0000lm\u0003\b\u0004\u0000mn\u0003\u0012\t\u0000no\u0003\u0018"+
		"\f\u0000oq\u0003\u0014\n\u0000pr\u0003\u0006\u0003\u0000qp\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000se\u0001"+
		"\u0000\u0000\u0000sl\u0001\u0000\u0000\u0000t\u0017\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0003\u0000\u0000vw\u0003\b\u0004\u0000wx\u0005\u0004\u0000"+
		"\u0000xy\u0003\b\u0004\u0000yz\u0005\u000b\u0000\u0000z\u0019\u0001\u0000"+
		"\u0000\u0000{|\u0003\b\u0004\u0000|}\u0003\u0004\u0002\u0000}\u007f\u0003"+
		"\u0006\u0003\u0000~\u0080\u0003\u0016\u000b\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u000b\u0000\u0000\u0084\u001b\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0003\u0002\u0001\u0000\u0086\u0087\u0005\u000b\u0000"+
		"\u0000\u0087\u0089\u0003\u0004\u0002\u0000\u0088\u008a\u0003\u0006\u0003"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u008d\u0003\u001a\r\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0003\u0006\u0003\u0000"+
		"\u0091\u001d\u0001\u0000\u0000\u0000\u0010#).46ALQV]jqs\u0081\u0089\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}