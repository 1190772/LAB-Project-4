// Generated from C:/Users/Nandinho/Desktop/projeto_lapr4/Java Project/grammar/grammars\Validator.g4 by ANTLR 4.10.1
package lapr4.grammar.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ValidatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ValidatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ValidatorParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ValidatorParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidatorParser#atrribution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrribution(ValidatorParser.AtrributionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intV}
	 * labeled alternative in {@link ValidatorParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntV(ValidatorParser.IntVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intO}
	 * labeled alternative in {@link ValidatorParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntO(ValidatorParser.IntOContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidatorParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(ValidatorParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidatorParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(ValidatorParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intVar}
	 * labeled alternative in {@link ValidatorParser#intArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVar(ValidatorParser.IntVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intVal}
	 * labeled alternative in {@link ValidatorParser#intArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVal(ValidatorParser.IntValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optVar}
	 * labeled alternative in {@link ValidatorParser#optionalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptVar(ValidatorParser.OptVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optVal}
	 * labeled alternative in {@link ValidatorParser#optionalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptVal(ValidatorParser.OptValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextV(ValidatorParser.TextVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isIntV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsIntV(ValidatorParser.IsIntVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNumericV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNumericV(ValidatorParser.IsNumericVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleChoiceV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoiceV(ValidatorParser.SingleChoiceVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleChoiceV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceV(ValidatorParser.MultipleChoiceVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleChoiceTV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoiceTV(ValidatorParser.SingleChoiceTVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleChoiceTV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceTV(ValidatorParser.MultipleChoiceTVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sortV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortV(ValidatorParser.SortVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scaleV}
	 * labeled alternative in {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleV(ValidatorParser.ScaleVContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidatorParser#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(ValidatorParser.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidatorParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(ValidatorParser.OptionalContext ctx);
}