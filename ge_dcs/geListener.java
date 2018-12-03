// Generated from ge.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link geParser}.
 */
public interface geListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link geParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(geParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link geParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(geParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link geParser#layers}.
	 * @param ctx the parse tree
	 */
	void enterLayers(geParser.LayersContext ctx);
	/**
	 * Exit a parse tree produced by {@link geParser#layers}.
	 * @param ctx the parse tree
	 */
	void exitLayers(geParser.LayersContext ctx);
	/**
	 * Enter a parse tree produced by {@link geParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterLayer(geParser.LayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link geParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitLayer(geParser.LayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link geParser#headers}.
	 * @param ctx the parse tree
	 */
	void enterHeaders(geParser.HeadersContext ctx);
	/**
	 * Exit a parse tree produced by {@link geParser#headers}.
	 * @param ctx the parse tree
	 */
	void exitHeaders(geParser.HeadersContext ctx);
	/**
	 * Enter a parse tree produced by {@link geParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(geParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link geParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(geParser.HeadContext ctx);
}