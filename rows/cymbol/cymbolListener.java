// Generated from cymbol.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cymbolParser}.
 */
public interface cymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(cymbolParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(cymbolParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link cymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(cymbolParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(cymbolParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link cymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(cymbolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(cymbolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cymbolParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(cymbolParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(cymbolParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link cymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(cymbolParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(cymbolParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link cymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(cymbolParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(cymbolParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link cymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(cymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(cymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(cymbolParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(cymbolParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link cymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(cymbolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(cymbolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link cymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(cymbolParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(cymbolParser.ExprListContext ctx);
}