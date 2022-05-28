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
	 * Enter a parse tree produced by {@link ValidatorParser#intArg}.
	 * @param ctx the parse tree
	 */
	void enterIntArg(ValidatorParser.IntArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#intArg}.
	 * @param ctx the parse tree
	 */
	void exitIntArg(ValidatorParser.IntArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidatorParser#optionalArg}.
	 * @param ctx the parse tree
	 */
	void enterOptionalArg(ValidatorParser.OptionalArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#optionalArg}.
	 * @param ctx the parse tree
	 */
	void exitOptionalArg(ValidatorParser.OptionalArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void enterValidation(ValidatorParser.ValidationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValidatorParser#validation}.
	 * @param ctx the parse tree
	 */
	void exitValidation(ValidatorParser.ValidationContext ctx);
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