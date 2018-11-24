// Generated from Curly.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CurlyParser}.
 */
public interface CurlyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CurlyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CurlyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurlyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CurlyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CurlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CurlyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CurlyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CurlyParser.ExprContext ctx);
}