// Generated from C:/Users/Nandinho/Desktop/projeto_lapr4/Java Project/base.core/src/main/java/eapli/base/surveymanagement/application\surveyGrammar.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.application;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link surveyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface surveyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(surveyGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#surveyID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurveyID(surveyGrammarParser.SurveyIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(surveyGrammarParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(surveyGrammarParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(surveyGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(surveyGrammarParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(surveyGrammarParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(surveyGrammarParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#free}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFree(surveyGrammarParser.FreeContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#questionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionType(surveyGrammarParser.QuestionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#questionQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionQ(surveyGrammarParser.QuestionQContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(surveyGrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(surveyGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(surveyGrammarParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link surveyGrammarParser#survey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurvey(surveyGrammarParser.SurveyContext ctx);
}