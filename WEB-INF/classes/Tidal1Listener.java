// Generated from Tidal1.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Tidal1Parser}.
 */
public interface Tidal1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#tidal}.
	 * @param ctx the parse tree
	 */
	void enterTidal(Tidal1Parser.TidalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#tidal}.
	 * @param ctx the parse tree
	 */
	void exitTidal(Tidal1Parser.TidalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(Tidal1Parser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(Tidal1Parser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#seqp_spec}.
	 * @param ctx the parse tree
	 */
	void enterSeqp_spec(Tidal1Parser.Seqp_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#seqp_spec}.
	 * @param ctx the parse tree
	 */
	void exitSeqp_spec(Tidal1Parser.Seqp_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#pattfrag}.
	 * @param ctx the parse tree
	 */
	void enterPattfrag(Tidal1Parser.PattfragContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#pattfrag}.
	 * @param ctx the parse tree
	 */
	void exitPattfrag(Tidal1Parser.PattfragContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(Tidal1Parser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(Tidal1Parser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#samples_seqlist}.
	 * @param ctx the parse tree
	 */
	void enterSamples_seqlist(Tidal1Parser.Samples_seqlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#samples_seqlist}.
	 * @param ctx the parse tree
	 */
	void exitSamples_seqlist(Tidal1Parser.Samples_seqlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#sample_expr}.
	 * @param ctx the parse tree
	 */
	void enterSample_expr(Tidal1Parser.Sample_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#sample_expr}.
	 * @param ctx the parse tree
	 */
	void exitSample_expr(Tidal1Parser.Sample_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#sample_atom}.
	 * @param ctx the parse tree
	 */
	void enterSample_atom(Tidal1Parser.Sample_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#sample_atom}.
	 * @param ctx the parse tree
	 */
	void exitSample_atom(Tidal1Parser.Sample_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#app_func_pattern}.
	 * @param ctx the parse tree
	 */
	void enterApp_func_pattern(Tidal1Parser.App_func_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#app_func_pattern}.
	 * @param ctx the parse tree
	 */
	void exitApp_func_pattern(Tidal1Parser.App_func_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#cont_frag}.
	 * @param ctx the parse tree
	 */
	void enterCont_frag(Tidal1Parser.Cont_fragContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#cont_frag}.
	 * @param ctx the parse tree
	 */
	void exitCont_frag(Tidal1Parser.Cont_fragContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#cont_patt}.
	 * @param ctx the parse tree
	 */
	void enterCont_patt(Tidal1Parser.Cont_pattContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#cont_patt}.
	 * @param ctx the parse tree
	 */
	void exitCont_patt(Tidal1Parser.Cont_pattContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#cont_atom}.
	 * @param ctx the parse tree
	 */
	void enterCont_atom(Tidal1Parser.Cont_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#cont_atom}.
	 * @param ctx the parse tree
	 */
	void exitCont_atom(Tidal1Parser.Cont_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#trans_spec}.
	 * @param ctx the parse tree
	 */
	void enterTrans_spec(Tidal1Parser.Trans_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#trans_spec}.
	 * @param ctx the parse tree
	 */
	void exitTrans_spec(Tidal1Parser.Trans_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#trans_0arg}.
	 * @param ctx the parse tree
	 */
	void enterTrans_0arg(Tidal1Parser.Trans_0argContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#trans_0arg}.
	 * @param ctx the parse tree
	 */
	void exitTrans_0arg(Tidal1Parser.Trans_0argContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#slow_pattern}.
	 * @param ctx the parse tree
	 */
	void enterSlow_pattern(Tidal1Parser.Slow_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#slow_pattern}.
	 * @param ctx the parse tree
	 */
	void exitSlow_pattern(Tidal1Parser.Slow_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#slowspread_pattern}.
	 * @param ctx the parse tree
	 */
	void enterSlowspread_pattern(Tidal1Parser.Slowspread_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#slowspread_pattern}.
	 * @param ctx the parse tree
	 */
	void exitSlowspread_pattern(Tidal1Parser.Slowspread_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#slowspread_atom}.
	 * @param ctx the parse tree
	 */
	void enterSlowspread_atom(Tidal1Parser.Slowspread_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#slowspread_atom}.
	 * @param ctx the parse tree
	 */
	void exitSlowspread_atom(Tidal1Parser.Slowspread_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#sample_trans_func}.
	 * @param ctx the parse tree
	 */
	void enterSample_trans_func(Tidal1Parser.Sample_trans_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#sample_trans_func}.
	 * @param ctx the parse tree
	 */
	void exitSample_trans_func(Tidal1Parser.Sample_trans_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#sample_trans}.
	 * @param ctx the parse tree
	 */
	void enterSample_trans(Tidal1Parser.Sample_transContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#sample_trans}.
	 * @param ctx the parse tree
	 */
	void exitSample_trans(Tidal1Parser.Sample_transContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#int_arg_trans}.
	 * @param ctx the parse tree
	 */
	void enterInt_arg_trans(Tidal1Parser.Int_arg_transContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#int_arg_trans}.
	 * @param ctx the parse tree
	 */
	void exitInt_arg_trans(Tidal1Parser.Int_arg_transContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#zero2one}.
	 * @param ctx the parse tree
	 */
	void enterZero2one(Tidal1Parser.Zero2oneContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#zero2one}.
	 * @param ctx the parse tree
	 */
	void exitZero2one(Tidal1Parser.Zero2oneContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#intint}.
	 * @param ctx the parse tree
	 */
	void enterIntint(Tidal1Parser.IntintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#intint}.
	 * @param ctx the parse tree
	 */
	void exitIntint(Tidal1Parser.IntintContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#int_or_ratio}.
	 * @param ctx the parse tree
	 */
	void enterInt_or_ratio(Tidal1Parser.Int_or_ratioContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#int_or_ratio}.
	 * @param ctx the parse tree
	 */
	void exitInt_or_ratio(Tidal1Parser.Int_or_ratioContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tidal1Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Tidal1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tidal1Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Tidal1Parser.NumberContext ctx);
}