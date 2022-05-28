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
	 * Visit a parse tree produced by {@link ValidatorParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(ValidatorParser.ValContext ctx);
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
	 * Visit a parse tree produced by {@link ValidatorParser#intArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntArg(ValidatorParser.IntArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidatorParser#optionalArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalArg(ValidatorParser.OptionalArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidation(ValidatorParser.ValidationContext ctx);
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