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
	 * Enter a parse tree produced by {@link GEParser#layer}.
	 * @param ctx the parse tree
	 */
	void enterLayer(GEParser.LayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#layer}.
	 * @param ctx the parse tree
	 */
	void exitLayer(GEParser.LayerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#objs}.
	 * @param ctx the parse tree
	 */
	void enterObjs(GEParser.ObjsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#objs}.
	 * @param ctx the parse tree
	 */
	void exitObjs(GEParser.ObjsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GEParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GEParser.ExprContext ctx);
}