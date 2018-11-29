// Generated from propertyFile.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link propertyFileParser}.
 */
public interface propertyFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link propertyFileParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(propertyFileParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link propertyFileParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(propertyFileParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link propertyFileParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(propertyFileParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link propertyFileParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(propertyFileParser.PropContext ctx);
}