// Generated from GE.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GEParser}.
 */
public interface GEListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GEParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GEParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GEParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#headers}.
	 * @param ctx the parse tree
	 */
	void enterHeaders(GEParser.HeadersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#headers}.
	 * @param ctx the parse tree
	 */
	void exitHeaders(GEParser.HeadersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(GEParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(GEParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#layers}.
	 * @param ctx the parse tree
	 */
	void enterLayers(GEParser.LayersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#layers}.
	 * @param ctx the parse tree
	 */
	void exitLayers(GEParser.LayersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#layerid}.
	 * @param ctx the parse tree
	 */
	void enterLayerid(GEParser.LayeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#layerid}.
	 * @param ctx the parse tree
	 */
	void exitLayerid(GEParser.LayeridContext ctx);
}