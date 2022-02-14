// Generated from Expression.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ExpressionParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ExpressionParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(ExpressionParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(ExpressionParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(ExpressionParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(ExpressionParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(ExpressionParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(ExpressionParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupedExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGroupedExpr(ExpressionParser.GroupedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupedExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGroupedExpr(ExpressionParser.GroupedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProductExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterProductExpr(ExpressionParser.ProductExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProductExpr}
	 * labeled alternative in {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitProductExpr(ExpressionParser.ProductExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerNum}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerNum(ExpressionParser.IntegerNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerNum}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerNum(ExpressionParser.IntegerNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterRealNum(ExpressionParser.RealNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealNum}
	 * labeled alternative in {@link ExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitRealNum(ExpressionParser.RealNumContext ctx);
}