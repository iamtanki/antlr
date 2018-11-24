// Generated from Cell.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CellParser}.
 */
public interface CellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CellParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CellParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CellParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CellParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CellParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CellParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CellParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CellParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CellParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CellParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CellParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CellParser.ExprContext ctx);
}