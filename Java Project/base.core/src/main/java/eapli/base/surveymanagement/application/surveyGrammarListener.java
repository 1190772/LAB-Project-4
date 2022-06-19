// Generated from C:/Users/pedro/OneDrive/Documentos/lei21_22_s4_2de_05/Java Project/base.core/src/main/java/eapli/base/surveymanagement/application\surveyGrammar.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.application;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link eapli.base.surveymanagement.application.surveyGrammarParser}.
 */
public interface surveyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(eapli.base.surveymanagement.application.surveyGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(eapli.base.surveymanagement.application.surveyGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#surveyID}.
	 * @param ctx the parse tree
	 */
	void enterSurveyID(eapli.base.surveymanagement.application.surveyGrammarParser.SurveyIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#surveyID}.
	 * @param ctx the parse tree
	 */
	void exitSurveyID(eapli.base.surveymanagement.application.surveyGrammarParser.SurveyIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(eapli.base.surveymanagement.application.surveyGrammarParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(eapli.base.surveymanagement.application.surveyGrammarParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(eapli.base.surveymanagement.application.surveyGrammarParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(eapli.base.surveymanagement.application.surveyGrammarParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(eapli.base.surveymanagement.application.surveyGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(eapli.base.surveymanagement.application.surveyGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(eapli.base.surveymanagement.application.surveyGrammarParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(eapli.base.surveymanagement.application.surveyGrammarParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(eapli.base.surveymanagement.application.surveyGrammarParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(eapli.base.surveymanagement.application.surveyGrammarParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#free}.
	 * @param ctx the parse tree
	 */
	void enterFree(eapli.base.surveymanagement.application.surveyGrammarParser.FreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#free}.
	 * @param ctx the parse tree
	 */
	void exitFree(eapli.base.surveymanagement.application.surveyGrammarParser.FreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#questionType}.
	 * @param ctx the parse tree
	 */
	void enterQuestionType(eapli.base.surveymanagement.application.surveyGrammarParser.QuestionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#questionType}.
	 * @param ctx the parse tree
	 */
	void exitQuestionType(eapli.base.surveymanagement.application.surveyGrammarParser.QuestionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#questionQ}.
	 * @param ctx the parse tree
	 */
	void enterQuestionQ(eapli.base.surveymanagement.application.surveyGrammarParser.QuestionQContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#questionQ}.
	 * @param ctx the parse tree
	 */
	void exitQuestionQ(eapli.base.surveymanagement.application.surveyGrammarParser.QuestionQContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(eapli.base.surveymanagement.application.surveyGrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(eapli.base.surveymanagement.application.surveyGrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(eapli.base.surveymanagement.application.surveyGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(eapli.base.surveymanagement.application.surveyGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(eapli.base.surveymanagement.application.surveyGrammarParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(eapli.base.surveymanagement.application.surveyGrammarParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#survey}.
	 * @param ctx the parse tree
	 */
	void enterSurvey(eapli.base.surveymanagement.application.surveyGrammarParser.SurveyContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#survey}.
	 * @param ctx the parse tree
	 */
	void exitSurvey(surveyGrammarParser.SurveyContext ctx);
}