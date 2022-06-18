// Generated from C:/Users/Nandinho/Desktop/projeto_lapr4/Java Project/base.core/src/main/java/eapli/base/surveymanagement/application\surveyGrammar.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.application;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link surveyGrammarParser}.
 */
public interface surveyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(surveyGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(surveyGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#surveyID}.
	 * @param ctx the parse tree
	 */
	void enterSurveyID(surveyGrammarParser.SurveyIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#surveyID}.
	 * @param ctx the parse tree
	 */
	void exitSurveyID(surveyGrammarParser.SurveyIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(surveyGrammarParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(surveyGrammarParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(surveyGrammarParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(surveyGrammarParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(surveyGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(surveyGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(surveyGrammarParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(surveyGrammarParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(surveyGrammarParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(surveyGrammarParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(surveyGrammarParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(surveyGrammarParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#free}.
	 * @param ctx the parse tree
	 */
	void enterFree(surveyGrammarParser.FreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#free}.
	 * @param ctx the parse tree
	 */
	void exitFree(surveyGrammarParser.FreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#questionType}.
	 * @param ctx the parse tree
	 */
	void enterQuestionType(surveyGrammarParser.QuestionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#questionType}.
	 * @param ctx the parse tree
	 */
	void exitQuestionType(surveyGrammarParser.QuestionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#questionQ}.
	 * @param ctx the parse tree
	 */
	void enterQuestionQ(surveyGrammarParser.QuestionQContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#questionQ}.
	 * @param ctx the parse tree
	 */
	void exitQuestionQ(surveyGrammarParser.QuestionQContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(surveyGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(surveyGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(surveyGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(surveyGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(surveyGrammarParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(surveyGrammarParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link surveyGrammarParser#survey}.
	 * @param ctx the parse tree
	 */
	void enterSurvey(surveyGrammarParser.SurveyContext ctx);
	/**
	 * Exit a parse tree produced by {@link surveyGrammarParser#survey}.
	 * @param ctx the parse tree
	 */
	void exitSurvey(surveyGrammarParser.SurveyContext ctx);
}