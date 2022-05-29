// Generated from C:/Users/Nandinho/Desktop/projeto_lapr4/Java Project/grammar/grammars\Validator.g4 by ANTLR 4.10.1
package lapr4.grammar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ValidatorParser}.
 */
public interface ValidatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ValidatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ValidatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ValidatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidatorParser#atrribution}.
	 * @param ctx the parse tree
	 */
	void enterAtrribution(ValidatorParser.AtrributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#atrribution}.
	 * @param ctx the parse tree
	 */
	void exitAtrribution(ValidatorParser.AtrributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidatorParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(ValidatorParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(ValidatorParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidatorParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(ValidatorParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(ValidatorParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidatorParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(ValidatorParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(ValidatorParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intVar}
	 * labeled alternative in {@link ValidatorParser#intArg}.
	 * @param ctx the parse tree
	 */
	void enterIntVar(ValidatorParser.IntVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intVar}
	 * labeled alternative in {@link ValidatorParser#intArg}.
	 * @param ctx the parse tree
	 */
	void exitIntVar(ValidatorParser.IntVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link ValidatorParser#intArg}.
	 * @param ctx the parse tree
	 */
	void enterIntVal(ValidatorParser.IntValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link ValidatorParser#intArg}.
	 * @param ctx the parse tree
	 */
	void exitIntVal(ValidatorParser.IntValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optVar}
	 * labeled alternative in {@link ValidatorParser#optionalArg}.
	 * @param ctx the parse tree
	 */
	void enterOptVar(ValidatorParser.OptVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optVar}
	 * labeled alternative in {@link ValidatorParser#optionalArg}.
	 * @param ctx the parse tree
	 */
	void exitOptVar(ValidatorParser.OptVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optVal}
	 * labeled alternative in {@link ValidatorParser#optionalArg}.
	 * @param ctx the parse tree
	 */
	void enterOptVal(ValidatorParser.OptValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optVal}
	 * labeled alternative in {@link ValidatorParser#optionalArg}.
	 * @param ctx the parse tree
	 */
	void exitOptVal(ValidatorParser.OptValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterTextV(ValidatorParser.TextVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitTextV(ValidatorParser.TextVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isIntV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterIsIntV(ValidatorParser.IsIntVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isIntV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitIsIntV(ValidatorParser.IsIntVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNumericV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterIsNumericV(ValidatorParser.IsNumericVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNumericV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitIsNumericV(ValidatorParser.IsNumericVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleChoiceV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoiceV(ValidatorParser.SingleChoiceVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleChoiceV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoiceV(ValidatorParser.SingleChoiceVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleChoiceV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceV(ValidatorParser.MultipleChoiceVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleChoiceV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceV(ValidatorParser.MultipleChoiceVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleChoiceTV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoiceTV(ValidatorParser.SingleChoiceTVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleChoiceTV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoiceTV(ValidatorParser.SingleChoiceTVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleChoiceTV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceTV(ValidatorParser.MultipleChoiceTVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleChoiceTV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceTV(ValidatorParser.MultipleChoiceTVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sortV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterSortV(ValidatorParser.SortVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sortV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitSortV(ValidatorParser.SortVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scaleV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterScaleV(ValidatorParser.ScaleVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scaleV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitScaleV(ValidatorParser.ScaleVContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidatorParser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(ValidatorParser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(ValidatorParser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidatorParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(ValidatorParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(ValidatorParser.OptionalContext ctx);
}