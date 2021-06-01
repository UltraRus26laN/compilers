// Generated from D:/University/2020-2021/yapis/Lab/egorreal/grammar\Languagee.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LanguageeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LanguageeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LanguageeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LanguageeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LanguageeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#arif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArif(LanguageeParser.ArifContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#compare_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_op(LanguageeParser.Compare_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LanguageeParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#signature_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_method(LanguageeParser.Signature_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(LanguageeParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(LanguageeParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_expr(LanguageeParser.Print_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#br_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBr_expr(LanguageeParser.Br_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#neg_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg_expr(LanguageeParser.Neg_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#while_cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cycle(LanguageeParser.While_cycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#if_then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then(LanguageeParser.If_thenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#block_then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_then(LanguageeParser.Block_thenContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(LanguageeParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#block_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_return(LanguageeParser.Block_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#block_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_non_return(LanguageeParser.Block_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#subprogram_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_return(LanguageeParser.Subprogram_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_non_return(LanguageeParser.Subprogram_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageeParser#global_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_program(LanguageeParser.Global_programContext ctx);
}