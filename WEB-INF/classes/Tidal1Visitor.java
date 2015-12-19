// Generated from Tidal1.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Tidal1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Tidal1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#tidal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTidal(Tidal1Parser.TidalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(Tidal1Parser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#seqp_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqp_spec(Tidal1Parser.Seqp_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#pattfrag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattfrag(Tidal1Parser.PattfragContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(Tidal1Parser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#samples_seqlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSamples_seqlist(Tidal1Parser.Samples_seqlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#sample_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_expr(Tidal1Parser.Sample_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#sample_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_atom(Tidal1Parser.Sample_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#app_func_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp_func_pattern(Tidal1Parser.App_func_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#cont_frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont_frag(Tidal1Parser.Cont_fragContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#cont_patt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont_patt(Tidal1Parser.Cont_pattContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#cont_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont_atom(Tidal1Parser.Cont_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#trans_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_spec(Tidal1Parser.Trans_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#trans_0arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_0arg(Tidal1Parser.Trans_0argContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#slow_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlow_pattern(Tidal1Parser.Slow_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#slowspread_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlowspread_pattern(Tidal1Parser.Slowspread_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#slowspread_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlowspread_atom(Tidal1Parser.Slowspread_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#sample_trans_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_trans_func(Tidal1Parser.Sample_trans_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#sample_trans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_trans(Tidal1Parser.Sample_transContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#int_arg_trans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_arg_trans(Tidal1Parser.Int_arg_transContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#zero2one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZero2one(Tidal1Parser.Zero2oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#intint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntint(Tidal1Parser.IntintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#int_or_ratio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_or_ratio(Tidal1Parser.Int_or_ratioContext ctx);
	/**
	 * Visit a parse tree produced by {@link Tidal1Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(Tidal1Parser.NumberContext ctx);
}