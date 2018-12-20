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
	 * Enter a parse tree produced by the {@code OGroup}
	 * labeled alternative in {@link GEParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterOGroup(GEParser.OGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OGroup}
	 * labeled alternative in {@link GEParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitOGroup(GEParser.OGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjOther}
	 * labeled alternative in {@link GEParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObjOther(GEParser.ObjOtherContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjOther}
	 * labeled alternative in {@link GEParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObjOther(GEParser.ObjOtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#objgroup}.
	 * @param ctx the parse tree
	 */
	void enterObjgroup(GEParser.ObjgroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#objgroup}.
	 * @param ctx the parse tree
	 */
	void exitObjgroup(GEParser.ObjgroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EObj}
	 * labeled alternative in {@link GEParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEObj(GEParser.EObjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EObj}
	 * labeled alternative in {@link GEParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEObj(GEParser.EObjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EText}
	 * labeled alternative in {@link GEParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEText(GEParser.ETextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EText}
	 * labeled alternative in {@link GEParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEText(GEParser.ETextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#layerend}.
	 * @param ctx the parse tree
	 */
	void enterLayerend(GEParser.LayerendContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#layerend}.
	 * @param ctx the parse tree
	 */
	void exitLayerend(GEParser.LayerendContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#layerdef}.
	 * @param ctx the parse tree
	 */
	void enterLayerdef(GEParser.LayerdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#layerdef}.
	 * @param ctx the parse tree
	 */
	void exitLayerdef(GEParser.LayerdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#libend}.
	 * @param ctx the parse tree
	 */
	void enterLibend(GEParser.LibendContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#libend}.
	 * @param ctx the parse tree
	 */
	void exitLibend(GEParser.LibendContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#libdef}.
	 * @param ctx the parse tree
	 */
	void enterLibdef(GEParser.LibdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#libdef}.
	 * @param ctx the parse tree
	 */
	void exitLibdef(GEParser.LibdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#objend}.
	 * @param ctx the parse tree
	 */
	void enterObjend(GEParser.ObjendContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#objend}.
	 * @param ctx the parse tree
	 */
	void exitObjend(GEParser.ObjendContext ctx);
	/**
	 * Enter a parse tree produced by {@link GEParser#objstart}.
	 * @param ctx the parse tree
	 */
	void enterObjstart(GEParser.ObjstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GEParser#objstart}.
	 * @param ctx the parse tree
	 */
	void exitObjstart(GEParser.ObjstartContext ctx);
}