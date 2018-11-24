// Generated from Commas.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CommasParser}.
 */
public interface CommasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CommasParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CommasParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommasParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CommasParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CommasParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CommasParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CommasParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CommasParser.RowContext ctx);
}