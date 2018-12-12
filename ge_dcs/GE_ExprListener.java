// Generated from GE_Expr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GE_ExprParser}.
 */
public interface GE_ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GE_ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GE_ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GE_ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GE_ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GE_ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GE_ExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GE_ExprParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GE_ExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(GE_ExprParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(GE_ExprParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex(GE_ExprParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex(GE_ExprParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(GE_ExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(GE_ExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(GE_ExprParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(GE_ExprParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Wenben}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWenben(GE_ExprParser.WenbenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Wenben}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWenben(GE_ExprParser.WenbenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(GE_ExprParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Empty}
	 * labeled alternative in {@link GE_ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(GE_ExprParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GE_ExprParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(GE_ExprParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GE_ExprParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(GE_ExprParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GE_ExprParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(GE_ExprParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GE_ExprParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(GE_ExprParser.TextContext ctx);
}