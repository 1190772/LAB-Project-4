// Generated from C:/Users/pedro/OneDrive/Documentos/lei21_22_s4_2de_05/Java Project/base.core/src/main/java/eapli/base/surveymanagement/application4\surveyGrammar.g4 by ANTLR 4.10.1
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
	 * Enter a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#survey}.
	 * @param ctx the parse tree
	 */
	void enterSurvey(eapli.base.surveymanagement.application.surveyGrammarParser.SurveyContext ctx);
	/**
	 * Exit a parse tree produced by {@link eapli.base.surveymanagement.application.surveyGrammarParser#survey}.
	 * @param ctx the parse tree
	 */
	void exitSurvey(eapli.base.surveymanagement.application.surveyGrammarParser.SurveyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prgf}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#newline}.
	 * @param ctx the parse tree
	 */
	void enterPrgf(eapli.base.surveymanagement.application.surveyGrammarParser.PrgfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prgf}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#newline}.
	 * @param ctx the parse tree
	 */
	void exitPrgf(eapli.base.surveymanagement.application.surveyGrammarParser.PrgfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code survID}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#surveyID}.
	 * @param ctx the parse tree
	 */
	void enterSurvID(eapli.base.surveymanagement.application.surveyGrammarParser.SurvIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code survID}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#surveyID}.
	 * @param ctx the parse tree
	 */
	void exitSurvID(eapli.base.surveymanagement.application.surveyGrammarParser.SurvIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tlt}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTlt(eapli.base.surveymanagement.application.surveyGrammarParser.TltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tlt}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTlt(eapli.base.surveymanagement.application.surveyGrammarParser.TltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code msg}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMsg(eapli.base.surveymanagement.application.surveyGrammarParser.MsgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code msg}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMsg(eapli.base.surveymanagement.application.surveyGrammarParser.MsgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code finalMsg}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#finalMessage}.
	 * @param ctx the parse tree
	 */
	void enterFinalMsg(eapli.base.surveymanagement.application.surveyGrammarParser.FinalMsgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code finalMsg}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#finalMessage}.
	 * @param ctx the parse tree
	 */
	void exitFinalMsg(eapli.base.surveymanagement.application.surveyGrammarParser.FinalMsgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sction}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSction(eapli.base.surveymanagement.application.surveyGrammarParser.SctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sction}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSction(eapli.base.surveymanagement.application.surveyGrammarParser.SctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code openAnswer}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#align}.
	 * @param ctx the parse tree
	 */
	void enterOpenAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.OpenAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code openAnswer}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#align}.
	 * @param ctx the parse tree
	 */
	void exitOpenAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.OpenAnswerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionAnswer}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#align}.
	 * @param ctx the parse tree
	 */
	void enterOptionAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.OptionAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionAnswer}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#align}.
	 * @param ctx the parse tree
	 */
	void exitOptionAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.OptionAnswerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code freeAnswer}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#align}.
	 * @param ctx the parse tree
	 */
	void enterFreeAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.FreeAnswerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code freeAnswer}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#align}.
	 * @param ctx the parse tree
	 */
	void exitFreeAnswer(eapli.base.surveymanagement.application.surveyGrammarParser.FreeAnswerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalOption}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void enterNormalOption(eapli.base.surveymanagement.application.surveyGrammarParser.NormalOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalOption}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void exitNormalOption(eapli.base.surveymanagement.application.surveyGrammarParser.NormalOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherOption}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOtherOption(eapli.base.surveymanagement.application.surveyGrammarParser.OtherOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherOption}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOtherOption(eapli.base.surveymanagement.application.surveyGrammarParser.OtherOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code freeOption}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#free}.
	 * @param ctx the parse tree
	 */
	void enterFreeOption(eapli.base.surveymanagement.application.surveyGrammarParser.FreeOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code freeOption}
	 * labeled alternative in {@link eapli.base.surveymanagement.application.surveyGrammarParser#free}.
	 * @param ctx the parse tree
	 */
	void exitFreeOption(surveyGrammarParser.FreeOptionContext ctx);
}