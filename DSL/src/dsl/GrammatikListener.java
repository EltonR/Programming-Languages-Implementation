// Generated from Grammatik.g by ANTLR 4.5.3
package dsl;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammatikParser}.
 */
public interface GrammatikListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GrammatikParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GrammatikParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#op_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_atribuicao(GrammatikParser.Op_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#op_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_atribuicao(GrammatikParser.Op_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#op_condicional}.
	 * @param ctx the parse tree
	 */
	void enterOp_condicional(GrammatikParser.Op_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#op_condicional}.
	 * @param ctx the parse tree
	 */
	void exitOp_condicional(GrammatikParser.Op_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void enterOp_logica(GrammatikParser.Op_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void exitOp_logica(GrammatikParser.Op_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#op_condicional_se}.
	 * @param ctx the parse tree
	 */
	void enterOp_condicional_se(GrammatikParser.Op_condicional_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#op_condicional_se}.
	 * @param ctx the parse tree
	 */
	void exitOp_condicional_se(GrammatikParser.Op_condicional_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#op_mostra}.
	 * @param ctx the parse tree
	 */
	void enterOp_mostra(GrammatikParser.Op_mostraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#op_mostra}.
	 * @param ctx the parse tree
	 */
	void exitOp_mostra(GrammatikParser.Op_mostraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#op_matematica}.
	 * @param ctx the parse tree
	 */
	void enterOp_matematica(GrammatikParser.Op_matematicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#op_matematica}.
	 * @param ctx the parse tree
	 */
	void exitOp_matematica(GrammatikParser.Op_matematicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#exp_mostra}.
	 * @param ctx the parse tree
	 */
	void enterExp_mostra(GrammatikParser.Exp_mostraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#exp_mostra}.
	 * @param ctx the parse tree
	 */
	void exitExp_mostra(GrammatikParser.Exp_mostraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#exp_se}.
	 * @param ctx the parse tree
	 */
	void enterExp_se(GrammatikParser.Exp_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#exp_se}.
	 * @param ctx the parse tree
	 */
	void exitExp_se(GrammatikParser.Exp_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#exp_logica}.
	 * @param ctx the parse tree
	 */
	void enterExp_logica(GrammatikParser.Exp_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#exp_logica}.
	 * @param ctx the parse tree
	 */
	void exitExp_logica(GrammatikParser.Exp_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#exp_condicional}.
	 * @param ctx the parse tree
	 */
	void enterExp_condicional(GrammatikParser.Exp_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#exp_condicional}.
	 * @param ctx the parse tree
	 */
	void exitExp_condicional(GrammatikParser.Exp_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#exp_matematica}.
	 * @param ctx the parse tree
	 */
	void enterExp_matematica(GrammatikParser.Exp_matematicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#exp_matematica}.
	 * @param ctx the parse tree
	 */
	void exitExp_matematica(GrammatikParser.Exp_matematicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#exp_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterExp_atribuicao(GrammatikParser.Exp_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#exp_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitExp_atribuicao(GrammatikParser.Exp_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammatikParser#dec_variavel}.
	 * @param ctx the parse tree
	 */
	void enterDec_variavel(GrammatikParser.Dec_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammatikParser#dec_variavel}.
	 * @param ctx the parse tree
	 */
	void exitDec_variavel(GrammatikParser.Dec_variavelContext ctx);
}