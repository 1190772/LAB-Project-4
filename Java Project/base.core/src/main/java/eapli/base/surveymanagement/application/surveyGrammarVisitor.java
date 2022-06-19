// Generated from C:/Users/pedro/OneDrive/Documentos/lei21_22_s4_2de_05/Java Project/base.core/src/main/java/eapli/base/surveymanagement/application4\surveyGrammar.g4 by ANTLR 4.10.1
package eapli.base.surveymanagement.application;

    import java.lang.*;

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
	 * Visit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#survey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurvey(eapli.base.surveymanagement.application.surveyGrammarParser.SurveyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prgf}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrgf(eapli.base.surveymanagement.application.surveyGrammarParser.PrgfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code survID}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#surveyID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurvID(eapli.base.surveymanagement.application.surveyGrammarParser.SurvIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tlt}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTlt(eapli.base.surveymanagement.application.surveyGrammarParser.TltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code msg}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsg(eapli.base.surveymanagement.application.surveyGrammarParser.MsgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code finalMsg}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#finalMessage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalMsg(eapli.base.surveymanagement.application.surveyGrammarParser.FinalMsgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sction}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSction(eapli.base.surveymanagement.application.surveyGrammarParser.SctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code openAnswer}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#align}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.OpenAnswerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionAnswer}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#align}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.OptionAnswerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code freeAnswer}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#align}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.FreeAnswerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalOption}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalOption(eapli.base.surveymanagement.application.surveyGrammarParser.NormalOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code otherOption}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherOption(eapli.base.surveymanagement.application.surveyGrammarParser.OtherOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code freeOption}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#free}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeOption(surveyGrammarParser.FreeOptionContext ctx);
}