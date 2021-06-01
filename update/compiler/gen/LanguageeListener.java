// Generated from C:/Users/Lenovo/Desktop/vitareal/grammar\Languagee.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageeParser}.
 */
public interface LanguageeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LanguageeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LanguageeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LanguageeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LanguageeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LanguageeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LanguageeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LanguageeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LanguageeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LanguageeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LanguageeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#arif}.
	 * @param ctx the parse tree
	 */
	void enterArif(LanguageeParser.ArifContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#arif}.
	 * @param ctx the parse tree
	 */
	void exitArif(LanguageeParser.ArifContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void enterCompare_op(LanguageeParser.Compare_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#compare_op}.
	 * @param ctx the parse tree
	 */
	void exitCompare_op(LanguageeParser.Compare_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(LanguageeParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(LanguageeParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#signature_method}.
	 * @param ctx the parse tree
	 */
	void enterSignature_method(LanguageeParser.Signature_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#signature_method}.
	 * @param ctx the parse tree
	 */
	void exitSignature_method(LanguageeParser.Signature_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(LanguageeParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(LanguageeParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(LanguageeParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(LanguageeParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expr(LanguageeParser.Print_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expr(LanguageeParser.Print_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#br_expr}.
	 * @param ctx the parse tree
	 */
	void enterBr_expr(LanguageeParser.Br_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#br_expr}.
	 * @param ctx the parse tree
	 */
	void exitBr_expr(LanguageeParser.Br_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#neg_expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg_expr(LanguageeParser.Neg_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#neg_expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg_expr(LanguageeParser.Neg_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#while_cycle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cycle(LanguageeParser.While_cycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#while_cycle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cycle(LanguageeParser.While_cycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#if_then}.
	 * @param ctx the parse tree
	 */
	void enterIf_then(LanguageeParser.If_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#if_then}.
	 * @param ctx the parse tree
	 */
	void exitIf_then(LanguageeParser.If_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#block_then}.
	 * @param ctx the parse tree
	 */
	void enterBlock_then(LanguageeParser.Block_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#block_then}.
	 * @param ctx the parse tree
	 */
	void exitBlock_then(LanguageeParser.Block_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(LanguageeParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(LanguageeParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#block_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_return(LanguageeParser.Block_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#block_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_return(LanguageeParser.Block_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_non_return(LanguageeParser.Block_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_non_return(LanguageeParser.Block_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_return(LanguageeParser.Subprogram_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_return(LanguageeParser.Subprogram_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_non_return(LanguageeParser.Subprogram_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_non_return(LanguageeParser.Subprogram_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageeParser#global_program}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_program(LanguageeParser.Global_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageeParser#global_program}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_program(LanguageeParser.Global_programContext ctx);
}