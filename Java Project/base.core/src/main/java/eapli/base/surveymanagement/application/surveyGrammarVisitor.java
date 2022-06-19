// Generated from C:/Users/pedro/OneDrive/Documentos/lei21_22_s4_2de_05/Java Project/base.core/src/main/java/eapli/base/surveymanagement/application\surveyGrammar.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.application;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link eapli.base.surveymanagement.application.surveyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface surveyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(eapli.base.surveymanagement.application.surveyGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#surveyID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurveyID(eapli.base.surveymanagement.application.surveyGrammarParser.SurveyIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(eapli.base.surveymanagement.application.surveyGrammarParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(eapli.base.surveymanagement.application.surveyGrammarParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(eapli.base.surveymanagement.application.surveyGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(eapli.base.surveymanagement.application.surveyGrammarParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(eapli.base.surveymanagement.application.surveyGrammarParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#free}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFree(eapli.base.surveymanagement.application.surveyGrammarParser.FreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#questionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionType(eapli.base.surveymanagement.application.surveyGrammarParser.QuestionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#questionQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionQ(eapli.base.surveymanagement.application.surveyGrammarParser.QuestionQContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(eapli.base.surveymanagement.application.surveyGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(eapli.base.surveymanagement.application.surveyGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(eapli.base.surveymanagement.application.surveyGrammarParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#survey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurvey(surveyGrammarParser.SurveyContext ctx);
}