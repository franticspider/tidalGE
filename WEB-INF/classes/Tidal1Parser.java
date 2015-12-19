// Generated from Tidal1.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tidal1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CHANNEL=1, DOLLAR=2, QUOT=3, SND_OP=4, BRAK=5, DEGRADE=6, REV=7, PALIN=8, 
		ITER=9, DENSITY=10, CHOP=11, STRIATE=12, GAP=13, RUN=14, DEG_BY=15, SLOW=16, 
		TRUNC=17, EVERY=18, FOLDEVERY=19, JUX=20, SAMPLES=21, SLOWSPREAD=22, SMASH=23, 
		SOMETIMESBY=24, SPREAD=25, SPREAD1=26, STRIATE1=27, STUT=28, WHENMOD=29, 
		WITHIN=30, ZOOM=31, SOMETIMESBY_ALIASES=32, SYNTH_OP=33, CONT_OP=34, PICK_OP=35, 
		VOWEL_OP=36, VOWEL=37, APPEND=38, APPEND1=39, CAT=40, INTERLACE=41, SEQP=42, 
		SLOWCAT=43, SPIN=44, STACK=45, SUPERIMP=46, WEAVE=47, WEAVE1=48, WEDGE=49, 
		SAMPLE=50, WAVE=51, KNIT=52, BEATR=53, BEATL=54, APDOLL=55, APSTAR=56, 
		LBRK=57, RBRK=58, LSQB=59, RSQB=60, LCRB=61, RCRB=62, COMMA=63, COLON=64, 
		TIMES=65, POINT=66, MODUL=67, DIVID=68, MINUS=69, QUESM=70, STAR=71, ZERO=72, 
		ONE=73, INTEGER=74, IDENTIFIER=75, WS=76;
	public static final int
		RULE_tidal = 0, RULE_message = 1, RULE_seqp_spec = 2, RULE_pattfrag = 3, 
		RULE_sequence = 4, RULE_samples_seqlist = 5, RULE_sample_expr = 6, RULE_sample_atom = 7, 
		RULE_app_func_pattern = 8, RULE_cont_frag = 9, RULE_cont_patt = 10, RULE_cont_atom = 11, 
		RULE_trans_spec = 12, RULE_trans_0arg = 13, RULE_slow_pattern = 14, RULE_slowspread_pattern = 15, 
		RULE_slowspread_atom = 16, RULE_sample_trans_func = 17, RULE_sample_trans = 18, 
		RULE_int_arg_trans = 19, RULE_zero2one = 20, RULE_intint = 21, RULE_int_or_ratio = 22, 
		RULE_number = 23;
	public static final String[] ruleNames = {
		"tidal", "message", "seqp_spec", "pattfrag", "sequence", "samples_seqlist", 
		"sample_expr", "sample_atom", "app_func_pattern", "cont_frag", "cont_patt", 
		"cont_atom", "trans_spec", "trans_0arg", "slow_pattern", "slowspread_pattern", 
		"slowspread_atom", "sample_trans_func", "sample_trans", "int_arg_trans", 
		"zero2one", "intint", "int_or_ratio", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'$'", "'\"'", "'sound'", "'brak'", "'degrade'", "'rev'", 
		"'palindrome'", "'iter'", "'density'", "'chop'", "'striate'", "'gap'", 
		"'run'", "'degradeBy'", "'slow'", "'trunc'", "'every'", "'foldEvery'", 
		"'jux'", "'samples'", "'slowspread'", "'smash'", "'sometimesBy'", "'spread'", 
		"'spread''", "'striate''", "'stut'", "'whenmod'", "'within'", "'zoom'", 
		null, null, null, "'pick'", "'vowel'", null, "'append'", "'append''", 
		"'cat'", "'interlace'", "'seqP'", "'slowcat'", "'spin'", "'stack'", "'superimpose'", 
		"'weave'", "'weave''", "'wedge'", null, null, "'|+|'", "'~>'", "'<~'", 
		"'<$>'", "'<*>'", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", 
		null, "'.'", "'%'", "'/'", "'-'", "'?'", null, "'0'", "'1'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CHANNEL", "DOLLAR", "QUOT", "SND_OP", "BRAK", "DEGRADE", "REV", 
		"PALIN", "ITER", "DENSITY", "CHOP", "STRIATE", "GAP", "RUN", "DEG_BY", 
		"SLOW", "TRUNC", "EVERY", "FOLDEVERY", "JUX", "SAMPLES", "SLOWSPREAD", 
		"SMASH", "SOMETIMESBY", "SPREAD", "SPREAD1", "STRIATE1", "STUT", "WHENMOD", 
		"WITHIN", "ZOOM", "SOMETIMESBY_ALIASES", "SYNTH_OP", "CONT_OP", "PICK_OP", 
		"VOWEL_OP", "VOWEL", "APPEND", "APPEND1", "CAT", "INTERLACE", "SEQP", 
		"SLOWCAT", "SPIN", "STACK", "SUPERIMP", "WEAVE", "WEAVE1", "WEDGE", "SAMPLE", 
		"WAVE", "KNIT", "BEATR", "BEATL", "APDOLL", "APSTAR", "LBRK", "RBRK", 
		"LSQB", "RSQB", "LCRB", "RCRB", "COMMA", "COLON", "TIMES", "POINT", "MODUL", 
		"DIVID", "MINUS", "QUESM", "STAR", "ZERO", "ONE", "INTEGER", "IDENTIFIER", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tidal1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Tidal1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TidalContext extends ParserRuleContext {
		public TerminalNode CHANNEL() { return getToken(Tidal1Parser.CHANNEL, 0); }
		public TerminalNode DOLLAR() { return getToken(Tidal1Parser.DOLLAR, 0); }
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TidalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tidal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterTidal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitTidal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitTidal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TidalContext tidal() throws RecognitionException {
		TidalContext _localctx = new TidalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tidal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(CHANNEL);
			setState(49);
			match(DOLLAR);
			setState(50);
			message();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageContext extends ParserRuleContext {
		public List<Trans_specContext> trans_spec() {
			return getRuleContexts(Trans_specContext.class);
		}
		public Trans_specContext trans_spec(int i) {
			return getRuleContext(Trans_specContext.class,i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(Tidal1Parser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(Tidal1Parser.DOLLAR, i);
		}
		public List<PattfragContext> pattfrag() {
			return getRuleContexts(PattfragContext.class);
		}
		public PattfragContext pattfrag(int i) {
			return getRuleContext(PattfragContext.class,i);
		}
		public List<TerminalNode> KNIT() { return getTokens(Tidal1Parser.KNIT); }
		public TerminalNode KNIT(int i) {
			return getToken(Tidal1Parser.KNIT, i);
		}
		public List<Cont_fragContext> cont_frag() {
			return getRuleContexts(Cont_fragContext.class);
		}
		public Cont_fragContext cont_frag(int i) {
			return getRuleContext(Cont_fragContext.class,i);
		}
		public List<TerminalNode> LBRK() { return getTokens(Tidal1Parser.LBRK); }
		public TerminalNode LBRK(int i) {
			return getToken(Tidal1Parser.LBRK, i);
		}
		public List<TerminalNode> RBRK() { return getTokens(Tidal1Parser.RBRK); }
		public TerminalNode RBRK(int i) {
			return getToken(Tidal1Parser.RBRK, i);
		}
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public TerminalNode APPEND() { return getToken(Tidal1Parser.APPEND, 0); }
		public TerminalNode APPEND1() { return getToken(Tidal1Parser.APPEND1, 0); }
		public TerminalNode INTERLACE() { return getToken(Tidal1Parser.INTERLACE, 0); }
		public TerminalNode WEDGE() { return getToken(Tidal1Parser.WEDGE, 0); }
		public List<IntintContext> intint() {
			return getRuleContexts(IntintContext.class);
		}
		public IntintContext intint(int i) {
			return getRuleContext(IntintContext.class,i);
		}
		public TerminalNode DIVID() { return getToken(Tidal1Parser.DIVID, 0); }
		public TerminalNode LSQB() { return getToken(Tidal1Parser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(Tidal1Parser.RSQB, 0); }
		public TerminalNode CAT() { return getToken(Tidal1Parser.CAT, 0); }
		public TerminalNode SLOWCAT() { return getToken(Tidal1Parser.SLOWCAT, 0); }
		public TerminalNode STACK() { return getToken(Tidal1Parser.STACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Tidal1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Tidal1Parser.COMMA, i);
		}
		public TerminalNode SEQP() { return getToken(Tidal1Parser.SEQP, 0); }
		public List<Seqp_specContext> seqp_spec() {
			return getRuleContexts(Seqp_specContext.class);
		}
		public Seqp_specContext seqp_spec(int i) {
			return getRuleContext(Seqp_specContext.class,i);
		}
		public TerminalNode WEAVE() { return getToken(Tidal1Parser.WEAVE, 0); }
		public TerminalNode INTEGER() { return getToken(Tidal1Parser.INTEGER, 0); }
		public TerminalNode WEAVE1() { return getToken(Tidal1Parser.WEAVE1, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_message);
		int _la;
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRAK) | (1L << DEGRADE) | (1L << REV) | (1L << PALIN) | (1L << ITER) | (1L << DENSITY) | (1L << CHOP) | (1L << STRIATE) | (1L << GAP) | (1L << DEG_BY) | (1L << SLOW) | (1L << TRUNC) | (1L << EVERY) | (1L << FOLDEVERY) | (1L << JUX) | (1L << SLOWSPREAD) | (1L << SMASH) | (1L << SOMETIMESBY) | (1L << SPREAD) | (1L << SPREAD1) | (1L << STRIATE1) | (1L << STUT) | (1L << WHENMOD) | (1L << WITHIN) | (1L << ZOOM) | (1L << SOMETIMESBY_ALIASES) | (1L << SYNTH_OP) | (1L << VOWEL_OP) | (1L << SPIN) | (1L << SUPERIMP) | (1L << KNIT) | (1L << BEATR) | (1L << BEATL) | (1L << LBRK))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (MINUS - 69)) | (1L << (ZERO - 69)) | (1L << (ONE - 69)) | (1L << (INTEGER - 69)))) != 0)) {
					{
					{
					setState(52);
					trans_spec();
					setState(53);
					match(DOLLAR);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(60);
					pattfrag();
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SND_OP );
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KNIT) {
					{
					{
					setState(65);
					match(KNIT);
					setState(66);
					cont_frag();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				trans_spec();
				setState(73);
				match(LBRK);
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74);
					pattfrag();
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SND_OP );
				setState(79);
				match(RBRK);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KNIT) {
					{
					{
					setState(80);
					match(KNIT);
					setState(81);
					cont_frag();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(LBRK);
				setState(88);
				message();
				setState(89);
				match(RBRK);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==KNIT) {
					{
					{
					setState(90);
					match(KNIT);
					setState(91);
					cont_frag();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				switch (_input.LA(1)) {
				case APPEND:
					{
					setState(97);
					match(APPEND);
					}
					break;
				case APPEND1:
					{
					setState(98);
					match(APPEND1);
					}
					break;
				case INTERLACE:
					{
					setState(99);
					match(INTERLACE);
					}
					break;
				case WEDGE:
					{
					{
					setState(100);
					match(WEDGE);
					setState(101);
					match(LBRK);
					setState(102);
					intint();
					setState(103);
					match(DIVID);
					setState(104);
					intint();
					setState(105);
					match(RBRK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109);
				match(LBRK);
				setState(110);
				message();
				setState(111);
				match(RBRK);
				setState(112);
				match(LBRK);
				setState(113);
				message();
				setState(114);
				match(RBRK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CAT) | (1L << SLOWCAT) | (1L << STACK))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(117);
				match(LSQB);
				setState(118);
				pattfrag();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					pattfrag();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(RSQB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(SEQP);
				setState(129);
				match(LSQB);
				setState(130);
				seqp_spec();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					seqp_spec();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(RSQB);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				match(WEAVE);
				setState(141);
				match(INTEGER);
				setState(142);
				match(LBRK);
				setState(143);
				trans_spec();
				setState(144);
				match(RBRK);
				setState(145);
				match(LSQB);
				setState(146);
				message();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(147);
					match(COMMA);
					setState(148);
					message();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(RSQB);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				match(WEAVE1);
				setState(157);
				match(INTEGER);
				setState(158);
				match(LBRK);
				setState(159);
				message();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(160);
					match(COMMA);
					setState(161);
					pattfrag();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(RBRK);
				setState(168);
				match(LSQB);
				setState(169);
				trans_spec();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(170);
					match(COMMA);
					setState(171);
					trans_spec();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(RSQB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Seqp_specContext extends ParserRuleContext {
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Tidal1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Tidal1Parser.COMMA, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(Tidal1Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Tidal1Parser.INTEGER, i);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public TerminalNode ZERO() { return getToken(Tidal1Parser.ZERO, 0); }
		public Seqp_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqp_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSeqp_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSeqp_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSeqp_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Seqp_specContext seqp_spec() throws RecognitionException {
		Seqp_specContext _localctx = new Seqp_specContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_seqp_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LBRK);
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==ZERO || _la==INTEGER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(183);
			match(COMMA);
			setState(184);
			match(INTEGER);
			setState(185);
			match(COMMA);
			setState(186);
			message();
			setState(187);
			match(RBRK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PattfragContext extends ParserRuleContext {
		public TerminalNode SND_OP() { return getToken(Tidal1Parser.SND_OP, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public PattfragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattfrag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterPattfrag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitPattfrag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitPattfrag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PattfragContext pattfrag() throws RecognitionException {
		PattfragContext _localctx = new PattfragContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pattfrag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(SND_OP);
			setState(190);
			sequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public List<TerminalNode> QUOT() { return getTokens(Tidal1Parser.QUOT); }
		public TerminalNode QUOT(int i) {
			return getToken(Tidal1Parser.QUOT, i);
		}
		public Sample_exprContext sample_expr() {
			return getRuleContext(Sample_exprContext.class,0);
		}
		public List<Trans_specContext> trans_spec() {
			return getRuleContexts(Trans_specContext.class);
		}
		public Trans_specContext trans_spec(int i) {
			return getRuleContext(Trans_specContext.class,i);
		}
		public List<TerminalNode> POINT() { return getTokens(Tidal1Parser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(Tidal1Parser.POINT, i);
		}
		public List<TerminalNode> LBRK() { return getTokens(Tidal1Parser.LBRK); }
		public TerminalNode LBRK(int i) {
			return getToken(Tidal1Parser.LBRK, i);
		}
		public List<TerminalNode> RBRK() { return getTokens(Tidal1Parser.RBRK); }
		public TerminalNode RBRK(int i) {
			return getToken(Tidal1Parser.RBRK, i);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode SAMPLES() { return getToken(Tidal1Parser.SAMPLES, 0); }
		public Samples_seqlistContext samples_seqlist() {
			return getRuleContext(Samples_seqlistContext.class,0);
		}
		public App_func_patternContext app_func_pattern() {
			return getRuleContext(App_func_patternContext.class,0);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sequence);
		int _la;
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(QUOT);
				setState(193);
				sample_expr();
				setState(194);
				match(QUOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				trans_spec();
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(197);
					match(POINT);
					setState(198);
					match(LBRK);
					setState(199);
					trans_spec();
					setState(200);
					match(RBRK);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(QUOT);
				setState(208);
				sample_expr();
				setState(209);
				match(QUOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(LBRK);
				setState(212);
				sequence();
				setState(213);
				match(RBRK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(SAMPLES);
				setState(216);
				match(QUOT);
				setState(217);
				sample_expr();
				setState(218);
				match(QUOT);
				setState(219);
				samples_seqlist();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				app_func_pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Samples_seqlistContext extends ParserRuleContext {
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public TerminalNode RUN() { return getToken(Tidal1Parser.RUN, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Tidal1Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Tidal1Parser.INTEGER, i);
		}
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public List<TerminalNode> QUOT() { return getTokens(Tidal1Parser.QUOT); }
		public TerminalNode QUOT(int i) {
			return getToken(Tidal1Parser.QUOT, i);
		}
		public Samples_seqlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_samples_seqlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSamples_seqlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSamples_seqlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSamples_seqlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Samples_seqlistContext samples_seqlist() throws RecognitionException {
		Samples_seqlistContext _localctx = new Samples_seqlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_samples_seqlist);
		int _la;
		try {
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(LBRK);
				setState(225);
				match(RUN);
				setState(226);
				match(INTEGER);
				setState(227);
				match(RBRK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(QUOT);
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					match(INTEGER);
					}
					}
					setState(232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INTEGER );
				setState(234);
				match(QUOT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(LBRK);
				setState(236);
				match(QUOT);
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(237);
					match(INTEGER);
					}
					}
					setState(240); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INTEGER );
				setState(242);
				match(QUOT);
				setState(243);
				match(RBRK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sample_exprContext extends ParserRuleContext {
		public List<Sample_atomContext> sample_atom() {
			return getRuleContexts(Sample_atomContext.class);
		}
		public Sample_atomContext sample_atom(int i) {
			return getRuleContext(Sample_atomContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Tidal1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Tidal1Parser.COMMA, i);
		}
		public Sample_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSample_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSample_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSample_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sample_exprContext sample_expr() throws RecognitionException {
		Sample_exprContext _localctx = new Sample_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sample_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				sample_atom();
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SAMPLE) | (1L << LBRK) | (1L << LSQB) | (1L << LCRB))) != 0) );
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(251);
				match(COMMA);
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					sample_atom();
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SAMPLE) | (1L << LBRK) | (1L << LSQB) | (1L << LCRB))) != 0) );
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sample_atomContext extends ParserRuleContext {
		public TerminalNode SAMPLE() { return getToken(Tidal1Parser.SAMPLE, 0); }
		public TerminalNode QUESM() { return getToken(Tidal1Parser.QUESM, 0); }
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public List<IntintContext> intint() {
			return getRuleContexts(IntintContext.class);
		}
		public IntintContext intint(int i) {
			return getRuleContext(IntintContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(Tidal1Parser.COMMA, 0); }
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public TerminalNode COLON() { return getToken(Tidal1Parser.COLON, 0); }
		public TerminalNode TIMES() { return getToken(Tidal1Parser.TIMES, 0); }
		public TerminalNode DIVID() { return getToken(Tidal1Parser.DIVID, 0); }
		public TerminalNode LSQB() { return getToken(Tidal1Parser.LSQB, 0); }
		public Sample_exprContext sample_expr() {
			return getRuleContext(Sample_exprContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(Tidal1Parser.RSQB, 0); }
		public TerminalNode LCRB() { return getToken(Tidal1Parser.LCRB, 0); }
		public TerminalNode RCRB() { return getToken(Tidal1Parser.RCRB, 0); }
		public TerminalNode MODUL() { return getToken(Tidal1Parser.MODUL, 0); }
		public Sample_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSample_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSample_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSample_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sample_atomContext sample_atom() throws RecognitionException {
		Sample_atomContext _localctx = new Sample_atomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sample_atom);
		int _la;
		try {
			setState(306);
			switch (_input.LA(1)) {
			case SAMPLE:
			case LBRK:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				switch (_input.LA(1)) {
				case SAMPLE:
					{
					setState(262);
					match(SAMPLE);
					setState(265);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(263);
						match(COLON);
						setState(264);
						intint();
						}
					}

					setState(269);
					_la = _input.LA(1);
					if (_la==TIMES || _la==DIVID) {
						{
						setState(267);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIVID) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(268);
						intint();
						}
					}

					}
					break;
				case LBRK:
					{
					{
					setState(271);
					match(LBRK);
					setState(272);
					intint();
					setState(273);
					match(COMMA);
					setState(274);
					intint();
					setState(275);
					match(RBRK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(280);
				_la = _input.LA(1);
				if (_la==QUESM) {
					{
					setState(279);
					match(QUESM);
					}
				}

				}
				break;
			case LSQB:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(LSQB);
				setState(283);
				sample_expr();
				setState(284);
				match(RSQB);
				setState(287);
				_la = _input.LA(1);
				if (_la==TIMES || _la==DIVID) {
					{
					setState(285);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIVID) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(286);
					intint();
					}
				}

				setState(290);
				_la = _input.LA(1);
				if (_la==QUESM) {
					{
					setState(289);
					match(QUESM);
					}
				}

				}
				break;
			case LCRB:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(LCRB);
				setState(293);
				sample_expr();
				setState(294);
				match(RCRB);
				setState(297);
				_la = _input.LA(1);
				if (_la==TIMES || _la==DIVID) {
					{
					setState(295);
					_la = _input.LA(1);
					if ( !(_la==TIMES || _la==DIVID) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(296);
					intint();
					}
				}

				setState(301);
				_la = _input.LA(1);
				if (_la==MODUL) {
					{
					setState(299);
					match(MODUL);
					setState(300);
					intint();
					}
				}

				setState(304);
				_la = _input.LA(1);
				if (_la==QUESM) {
					{
					setState(303);
					match(QUESM);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class App_func_patternContext extends ParserRuleContext {
		public TerminalNode APDOLL() { return getToken(Tidal1Parser.APDOLL, 0); }
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode APSTAR() { return getToken(Tidal1Parser.APSTAR, 0); }
		public Cont_fragContext cont_frag() {
			return getRuleContext(Cont_fragContext.class,0);
		}
		public TerminalNode SYNTH_OP() { return getToken(Tidal1Parser.SYNTH_OP, 0); }
		public TerminalNode PICK_OP() { return getToken(Tidal1Parser.PICK_OP, 0); }
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public TerminalNode STAR() { return getToken(Tidal1Parser.STAR, 0); }
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public App_func_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app_func_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterApp_func_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitApp_func_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitApp_func_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final App_func_patternContext app_func_pattern() throws RecognitionException {
		App_func_patternContext _localctx = new App_func_patternContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_app_func_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			switch (_input.LA(1)) {
			case LBRK:
				{
				{
				setState(308);
				match(LBRK);
				setState(309);
				match(STAR);
				setState(310);
				match(RBRK);
				}
				}
				break;
			case SYNTH_OP:
				{
				setState(311);
				match(SYNTH_OP);
				}
				break;
			case PICK_OP:
				{
				setState(312);
				match(PICK_OP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(315);
			match(APDOLL);
			setState(316);
			sequence();
			setState(317);
			match(APSTAR);
			setState(318);
			cont_frag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cont_fragContext extends ParserRuleContext {
		public TerminalNode SYNTH_OP() { return getToken(Tidal1Parser.SYNTH_OP, 0); }
		public List<TerminalNode> QUOT() { return getTokens(Tidal1Parser.QUOT); }
		public TerminalNode QUOT(int i) {
			return getToken(Tidal1Parser.QUOT, i);
		}
		public Cont_pattContext cont_patt() {
			return getRuleContext(Cont_pattContext.class,0);
		}
		public TerminalNode KNIT() { return getToken(Tidal1Parser.KNIT, 0); }
		public TerminalNode VOWEL_OP() { return getToken(Tidal1Parser.VOWEL_OP, 0); }
		public List<TerminalNode> VOWEL() { return getTokens(Tidal1Parser.VOWEL); }
		public TerminalNode VOWEL(int i) {
			return getToken(Tidal1Parser.VOWEL, i);
		}
		public IntintContext intint() {
			return getRuleContext(IntintContext.class,0);
		}
		public Slow_patternContext slow_pattern() {
			return getRuleContext(Slow_patternContext.class,0);
		}
		public Cont_fragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_frag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterCont_frag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitCont_frag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitCont_frag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cont_fragContext cont_frag() throws RecognitionException {
		Cont_fragContext _localctx = new Cont_fragContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cont_frag);
		int _la;
		try {
			setState(340);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				_la = _input.LA(1);
				if (_la==KNIT) {
					{
					setState(320);
					match(KNIT);
					}
				}

				setState(323);
				match(SYNTH_OP);
				setState(324);
				match(QUOT);
				setState(325);
				cont_patt();
				setState(326);
				match(QUOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(SYNTH_OP);
				setState(329);
				cont_patt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(VOWEL_OP);
				setState(331);
				match(QUOT);
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(332);
					match(VOWEL);
					}
					}
					setState(335); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VOWEL );
				setState(337);
				match(QUOT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				intint();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				slow_pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cont_pattContext extends ParserRuleContext {
		public List<Cont_atomContext> cont_atom() {
			return getRuleContexts(Cont_atomContext.class);
		}
		public Cont_atomContext cont_atom(int i) {
			return getRuleContext(Cont_atomContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Tidal1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Tidal1Parser.COMMA, i);
		}
		public TerminalNode WAVE() { return getToken(Tidal1Parser.WAVE, 0); }
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public Trans_specContext trans_spec() {
			return getRuleContext(Trans_specContext.class,0);
		}
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public Cont_pattContext cont_patt() {
			return getRuleContext(Cont_pattContext.class,0);
		}
		public List<TerminalNode> QUOT() { return getTokens(Tidal1Parser.QUOT); }
		public TerminalNode QUOT(int i) {
			return getToken(Tidal1Parser.QUOT, i);
		}
		public Cont_pattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_patt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterCont_patt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitCont_patt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitCont_patt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cont_pattContext cont_patt() throws RecognitionException {
		Cont_pattContext _localctx = new Cont_pattContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cont_patt);
		try {
			int _alt;
			setState(364);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				cont_atom();
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(343);
						match(COMMA);
						setState(344);
						cont_atom();
						}
						} 
					}
					setState(349);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(WAVE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(LBRK);
				setState(352);
				trans_spec();
				setState(353);
				match(WAVE);
				setState(354);
				match(RBRK);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(LBRK);
				setState(357);
				cont_patt();
				setState(358);
				match(RBRK);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				match(QUOT);
				setState(361);
				cont_patt();
				setState(362);
				match(QUOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cont_atomContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> LSQB() { return getTokens(Tidal1Parser.LSQB); }
		public TerminalNode LSQB(int i) {
			return getToken(Tidal1Parser.LSQB, i);
		}
		public List<Cont_pattContext> cont_patt() {
			return getRuleContexts(Cont_pattContext.class);
		}
		public Cont_pattContext cont_patt(int i) {
			return getRuleContext(Cont_pattContext.class,i);
		}
		public List<TerminalNode> RSQB() { return getTokens(Tidal1Parser.RSQB); }
		public TerminalNode RSQB(int i) {
			return getToken(Tidal1Parser.RSQB, i);
		}
		public List<IntintContext> intint() {
			return getRuleContexts(IntintContext.class);
		}
		public IntintContext intint(int i) {
			return getRuleContext(IntintContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(Tidal1Parser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(Tidal1Parser.TIMES, i);
		}
		public List<TerminalNode> DIVID() { return getTokens(Tidal1Parser.DIVID); }
		public TerminalNode DIVID(int i) {
			return getToken(Tidal1Parser.DIVID, i);
		}
		public Cont_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterCont_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitCont_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitCont_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cont_atomContext cont_atom() throws RecognitionException {
		Cont_atomContext _localctx = new Cont_atomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cont_atom);
		int _la;
		try {
			int _alt;
			setState(385);
			switch (_input.LA(1)) {
			case LBRK:
			case MINUS:
			case ZERO:
			case ONE:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(367); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(366);
						number();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(369); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LSQB:
				enterOuterAlt(_localctx, 2);
				{
				setState(381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(371);
					match(LSQB);
					setState(372);
					cont_patt();
					setState(373);
					match(RSQB);
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TIMES || _la==DIVID) {
						{
						{
						setState(374);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIVID) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(375);
						intint();
						}
						}
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(383); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LSQB );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trans_specContext extends ParserRuleContext {
		public Trans_0argContext trans_0arg() {
			return getRuleContext(Trans_0argContext.class,0);
		}
		public List<TerminalNode> LBRK() { return getTokens(Tidal1Parser.LBRK); }
		public TerminalNode LBRK(int i) {
			return getToken(Tidal1Parser.LBRK, i);
		}
		public List<Trans_specContext> trans_spec() {
			return getRuleContexts(Trans_specContext.class);
		}
		public Trans_specContext trans_spec(int i) {
			return getRuleContext(Trans_specContext.class,i);
		}
		public List<TerminalNode> RBRK() { return getTokens(Tidal1Parser.RBRK); }
		public TerminalNode RBRK(int i) {
			return getToken(Tidal1Parser.RBRK, i);
		}
		public List<TerminalNode> POINT() { return getTokens(Tidal1Parser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(Tidal1Parser.POINT, i);
		}
		public Slow_patternContext slow_pattern() {
			return getRuleContext(Slow_patternContext.class,0);
		}
		public TerminalNode STUT() { return getToken(Tidal1Parser.STUT, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(Tidal1Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Tidal1Parser.INTEGER, i);
		}
		public List<Zero2oneContext> zero2one() {
			return getRuleContexts(Zero2oneContext.class);
		}
		public Zero2oneContext zero2one(int i) {
			return getRuleContext(Zero2oneContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(Tidal1Parser.MINUS, 0); }
		public TerminalNode SUPERIMP() { return getToken(Tidal1Parser.SUPERIMP, 0); }
		public Cont_fragContext cont_frag() {
			return getRuleContext(Cont_fragContext.class,0);
		}
		public TerminalNode DEG_BY() { return getToken(Tidal1Parser.DEG_BY, 0); }
		public TerminalNode TRUNC() { return getToken(Tidal1Parser.TRUNC, 0); }
		public TerminalNode BEATR() { return getToken(Tidal1Parser.BEATR, 0); }
		public TerminalNode BEATL() { return getToken(Tidal1Parser.BEATL, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Int_arg_transContext int_arg_trans() {
			return getRuleContext(Int_arg_transContext.class,0);
		}
		public IntintContext intint() {
			return getRuleContext(IntintContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(Tidal1Parser.EVERY, 0); }
		public TerminalNode FOLDEVERY() { return getToken(Tidal1Parser.FOLDEVERY, 0); }
		public TerminalNode LSQB() { return getToken(Tidal1Parser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(Tidal1Parser.RSQB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Tidal1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Tidal1Parser.COMMA, i);
		}
		public TerminalNode SOMETIMESBY_ALIASES() { return getToken(Tidal1Parser.SOMETIMESBY_ALIASES, 0); }
		public TerminalNode SOMETIMESBY() { return getToken(Tidal1Parser.SOMETIMESBY, 0); }
		public TerminalNode WHENMOD() { return getToken(Tidal1Parser.WHENMOD, 0); }
		public TerminalNode WITHIN() { return getToken(Tidal1Parser.WITHIN, 0); }
		public TerminalNode KNIT() { return getToken(Tidal1Parser.KNIT, 0); }
		public TerminalNode JUX() { return getToken(Tidal1Parser.JUX, 0); }
		public TerminalNode ZOOM() { return getToken(Tidal1Parser.ZOOM, 0); }
		public TerminalNode STRIATE1() { return getToken(Tidal1Parser.STRIATE1, 0); }
		public TerminalNode DIVID() { return getToken(Tidal1Parser.DIVID, 0); }
		public List<TerminalNode> ONE() { return getTokens(Tidal1Parser.ONE); }
		public TerminalNode ONE(int i) {
			return getToken(Tidal1Parser.ONE, i);
		}
		public TerminalNode SMASH() { return getToken(Tidal1Parser.SMASH, 0); }
		public Slowspread_patternContext slowspread_pattern() {
			return getRuleContext(Slowspread_patternContext.class,0);
		}
		public Trans_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trans_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterTrans_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitTrans_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitTrans_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trans_specContext trans_spec() throws RecognitionException {
		Trans_specContext _localctx = new Trans_specContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_trans_spec);
		int _la;
		try {
			int _alt;
			setState(518);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				trans_0arg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(LBRK);
				setState(389);
				trans_spec();
				setState(390);
				match(RBRK);
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(391);
						match(POINT);
						setState(392);
						match(LBRK);
						setState(393);
						trans_spec();
						setState(394);
						match(RBRK);
						}
						} 
					}
					setState(400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				slow_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				match(STUT);
				setState(403);
				match(INTEGER);
				setState(404);
				zero2one();
				setState(411);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(405);
					zero2one();
					}
					break;
				case 2:
					{
					setState(406);
					match(LBRK);
					setState(407);
					match(MINUS);
					setState(408);
					zero2one();
					setState(409);
					match(RBRK);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				match(SUPERIMP);
				setState(414);
				match(LBRK);
				setState(415);
				trans_spec();
				setState(416);
				match(RBRK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				cont_frag();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==DEG_BY || _la==TRUNC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(420);
				zero2one();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(422);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LBRK - 57)) | (1L << (MINUS - 57)) | (1L << (ZERO - 57)) | (1L << (ONE - 57)) | (1L << (INTEGER - 57)))) != 0)) {
					{
					setState(421);
					number();
					}
				}

				setState(424);
				_la = _input.LA(1);
				if ( !(_la==BEATR || _la==BEATL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(425);
				int_arg_trans();
				setState(426);
				intint();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(428);
				match(EVERY);
				setState(429);
				match(INTEGER);
				setState(435);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					{
					setState(430);
					match(LBRK);
					setState(431);
					trans_spec();
					setState(432);
					match(RBRK);
					}
					}
					break;
				case 2:
					{
					setState(434);
					trans_spec();
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(437);
				match(FOLDEVERY);
				setState(438);
				match(LSQB);
				setState(439);
				match(INTEGER);
				setState(442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(440);
					match(COMMA);
					setState(441);
					match(INTEGER);
					}
					}
					setState(444); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(446);
				match(RSQB);
				setState(447);
				match(LBRK);
				setState(448);
				trans_spec();
				setState(449);
				match(RBRK);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(454);
				switch (_input.LA(1)) {
				case SOMETIMESBY_ALIASES:
					{
					setState(451);
					match(SOMETIMESBY_ALIASES);
					}
					break;
				case SOMETIMESBY:
					{
					setState(452);
					match(SOMETIMESBY);
					setState(453);
					zero2one();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(456);
				trans_spec();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(457);
				match(WHENMOD);
				setState(458);
				match(INTEGER);
				setState(459);
				match(INTEGER);
				setState(460);
				match(LBRK);
				setState(461);
				trans_spec();
				setState(462);
				match(RBRK);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(464);
				match(WITHIN);
				setState(465);
				match(LBRK);
				setState(466);
				zero2one();
				setState(467);
				match(COMMA);
				setState(468);
				zero2one();
				setState(469);
				match(RBRK);
				setState(470);
				match(LBRK);
				setState(474);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(471);
					trans_spec();
					}
					break;
				case 2:
					{
					{
					setState(472);
					match(KNIT);
					setState(473);
					cont_frag();
					}
					}
					break;
				}
				setState(476);
				match(RBRK);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(478);
				match(JUX);
				setState(479);
				match(LBRK);
				setState(480);
				trans_spec();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(481);
					match(POINT);
					setState(482);
					trans_spec();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				match(RBRK);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(490);
				match(ZOOM);
				setState(491);
				match(LBRK);
				setState(492);
				zero2one();
				setState(493);
				match(COMMA);
				setState(494);
				zero2one();
				setState(495);
				match(RBRK);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(497);
				match(STRIATE1);
				setState(498);
				match(INTEGER);
				setState(499);
				match(LBRK);
				setState(500);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(501);
				match(DIVID);
				setState(502);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(503);
				match(RBRK);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(504);
				match(SMASH);
				setState(505);
				intint();
				setState(506);
				match(LSQB);
				setState(507);
				number();
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(508);
					match(COMMA);
					setState(509);
					number();
					}
					}
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(515);
				match(RSQB);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(517);
				slowspread_pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trans_0argContext extends ParserRuleContext {
		public TerminalNode BRAK() { return getToken(Tidal1Parser.BRAK, 0); }
		public TerminalNode DEGRADE() { return getToken(Tidal1Parser.DEGRADE, 0); }
		public TerminalNode REV() { return getToken(Tidal1Parser.REV, 0); }
		public TerminalNode PALIN() { return getToken(Tidal1Parser.PALIN, 0); }
		public Trans_0argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trans_0arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterTrans_0arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitTrans_0arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitTrans_0arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trans_0argContext trans_0arg() throws RecognitionException {
		Trans_0argContext _localctx = new Trans_0argContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_trans_0arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRAK) | (1L << DEGRADE) | (1L << REV) | (1L << PALIN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slow_patternContext extends ParserRuleContext {
		public TerminalNode SLOW() { return getToken(Tidal1Parser.SLOW, 0); }
		public IntintContext intint() {
			return getRuleContext(IntintContext.class,0);
		}
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public Int_or_ratioContext int_or_ratio() {
			return getRuleContext(Int_or_ratioContext.class,0);
		}
		public Cont_fragContext cont_frag() {
			return getRuleContext(Cont_fragContext.class,0);
		}
		public List<TerminalNode> QUOT() { return getTokens(Tidal1Parser.QUOT); }
		public TerminalNode QUOT(int i) {
			return getToken(Tidal1Parser.QUOT, i);
		}
		public Slowspread_atomContext slowspread_atom() {
			return getRuleContext(Slowspread_atomContext.class,0);
		}
		public Slow_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slow_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSlow_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSlow_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSlow_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slow_patternContext slow_pattern() throws RecognitionException {
		Slow_patternContext _localctx = new Slow_patternContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_slow_pattern);
		try {
			setState(537);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(SLOW);
				setState(523);
				intint();
				setState(524);
				match(LBRK);
				setState(527);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(525);
					int_or_ratio();
					}
					break;
				case 2:
					{
					setState(526);
					cont_frag();
					}
					break;
				}
				setState(529);
				match(RBRK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				match(SLOW);
				setState(532);
				intint();
				setState(533);
				match(QUOT);
				{
				setState(534);
				slowspread_atom();
				}
				setState(535);
				match(QUOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slowspread_patternContext extends ParserRuleContext {
		public Sample_transContext sample_trans() {
			return getRuleContext(Sample_transContext.class,0);
		}
		public TerminalNode LSQB() { return getToken(Tidal1Parser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(Tidal1Parser.RSQB, 0); }
		public TerminalNode SPREAD() { return getToken(Tidal1Parser.SPREAD, 0); }
		public TerminalNode SLOWSPREAD() { return getToken(Tidal1Parser.SLOWSPREAD, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<Int_or_ratioContext> int_or_ratio() {
			return getRuleContexts(Int_or_ratioContext.class);
		}
		public Int_or_ratioContext int_or_ratio(int i) {
			return getRuleContext(Int_or_ratioContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Tidal1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Tidal1Parser.COMMA, i);
		}
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public TerminalNode DOLLAR() { return getToken(Tidal1Parser.DOLLAR, 0); }
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public List<Trans_specContext> trans_spec() {
			return getRuleContexts(Trans_specContext.class);
		}
		public Trans_specContext trans_spec(int i) {
			return getRuleContext(Trans_specContext.class,i);
		}
		public TerminalNode SPREAD1() { return getToken(Tidal1Parser.SPREAD1, 0); }
		public List<TerminalNode> QUOT() { return getTokens(Tidal1Parser.QUOT); }
		public TerminalNode QUOT(int i) {
			return getToken(Tidal1Parser.QUOT, i);
		}
		public Slowspread_atomContext slowspread_atom() {
			return getRuleContext(Slowspread_atomContext.class,0);
		}
		public Slowspread_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slowspread_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSlowspread_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSlowspread_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSlowspread_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slowspread_patternContext slowspread_pattern() throws RecognitionException {
		Slowspread_patternContext _localctx = new Slowspread_patternContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_slowspread_pattern);
		int _la;
		try {
			setState(579);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==SLOWSPREAD || _la==SPREAD) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(540);
				sample_trans();
				setState(541);
				match(LSQB);
				setState(544);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(542);
					number();
					}
					break;
				case 2:
					{
					setState(543);
					int_or_ratio();
					}
					break;
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(546);
					match(COMMA);
					setState(549);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						setState(547);
						number();
						}
						break;
					case 2:
						{
						setState(548);
						int_or_ratio();
						}
						break;
					}
					}
					}
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(556);
				match(RSQB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(SLOWSPREAD);
				setState(559);
				match(LBRK);
				setState(560);
				match(DOLLAR);
				setState(561);
				match(RBRK);
				setState(562);
				match(LSQB);
				setState(563);
				trans_spec();
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(564);
					match(COMMA);
					setState(565);
					trans_spec();
					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(571);
				match(RSQB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(SPREAD1);
				setState(574);
				sample_trans();
				setState(575);
				match(QUOT);
				{
				setState(576);
				slowspread_atom();
				}
				setState(577);
				match(QUOT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Slowspread_atomContext extends ParserRuleContext {
		public List<Int_or_ratioContext> int_or_ratio() {
			return getRuleContexts(Int_or_ratioContext.class);
		}
		public Int_or_ratioContext int_or_ratio(int i) {
			return getRuleContext(Int_or_ratioContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Tidal1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Tidal1Parser.COMMA, i);
		}
		public TerminalNode LSQB() { return getToken(Tidal1Parser.LSQB, 0); }
		public Slowspread_atomContext slowspread_atom() {
			return getRuleContext(Slowspread_atomContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(Tidal1Parser.RSQB, 0); }
		public Slowspread_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slowspread_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSlowspread_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSlowspread_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSlowspread_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slowspread_atomContext slowspread_atom() throws RecognitionException {
		Slowspread_atomContext _localctx = new Slowspread_atomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_slowspread_atom);
		int _la;
		try {
			setState(595);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				int_or_ratio();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==INTEGER) {
					{
					{
					setState(583);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(582);
						match(COMMA);
						}
					}

					setState(585);
					int_or_ratio();
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LSQB:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(LSQB);
				setState(592);
				slowspread_atom();
				setState(593);
				match(RSQB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sample_trans_funcContext extends ParserRuleContext {
		public Sample_transContext sample_trans() {
			return getRuleContext(Sample_transContext.class,0);
		}
		public Sample_trans_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_trans_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSample_trans_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSample_trans_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSample_trans_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sample_trans_funcContext sample_trans_func() throws RecognitionException {
		Sample_trans_funcContext _localctx = new Sample_trans_funcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sample_trans_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			sample_trans();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sample_transContext extends ParserRuleContext {
		public Int_arg_transContext int_arg_trans() {
			return getRuleContext(Int_arg_transContext.class,0);
		}
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public Sample_transContext sample_trans() {
			return getRuleContext(Sample_transContext.class,0);
		}
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public TerminalNode STUT() { return getToken(Tidal1Parser.STUT, 0); }
		public List<IntintContext> intint() {
			return getRuleContexts(IntintContext.class);
		}
		public IntintContext intint(int i) {
			return getRuleContext(IntintContext.class,i);
		}
		public TerminalNode STRIATE() { return getToken(Tidal1Parser.STRIATE, 0); }
		public Sample_transContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample_trans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterSample_trans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitSample_trans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitSample_trans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sample_transContext sample_trans() throws RecognitionException {
		Sample_transContext _localctx = new Sample_transContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sample_trans);
		try {
			setState(609);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				int_arg_trans();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(LBRK);
				setState(601);
				sample_trans();
				setState(602);
				match(RBRK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				match(STUT);
				setState(605);
				intint();
				setState(606);
				intint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				match(STRIATE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_arg_transContext extends ParserRuleContext {
		public TerminalNode CHOP() { return getToken(Tidal1Parser.CHOP, 0); }
		public TerminalNode DENSITY() { return getToken(Tidal1Parser.DENSITY, 0); }
		public TerminalNode SLOW() { return getToken(Tidal1Parser.SLOW, 0); }
		public TerminalNode ITER() { return getToken(Tidal1Parser.ITER, 0); }
		public TerminalNode STRIATE() { return getToken(Tidal1Parser.STRIATE, 0); }
		public TerminalNode GAP() { return getToken(Tidal1Parser.GAP, 0); }
		public TerminalNode SPIN() { return getToken(Tidal1Parser.SPIN, 0); }
		public Int_arg_transContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_arg_trans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterInt_arg_trans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitInt_arg_trans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitInt_arg_trans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_arg_transContext int_arg_trans() throws RecognitionException {
		Int_arg_transContext _localctx = new Int_arg_transContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_int_arg_trans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ITER) | (1L << DENSITY) | (1L << CHOP) | (1L << STRIATE) | (1L << GAP) | (1L << SLOW) | (1L << SPIN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zero2oneContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(Tidal1Parser.ONE, 0); }
		public TerminalNode ZERO() { return getToken(Tidal1Parser.ZERO, 0); }
		public TerminalNode POINT() { return getToken(Tidal1Parser.POINT, 0); }
		public TerminalNode INTEGER() { return getToken(Tidal1Parser.INTEGER, 0); }
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public Zero2oneContext zero2one() {
			return getRuleContext(Zero2oneContext.class,0);
		}
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public Zero2oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zero2one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterZero2one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitZero2one(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitZero2one(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zero2oneContext zero2one() throws RecognitionException {
		Zero2oneContext _localctx = new Zero2oneContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_zero2one);
		try {
			setState(623);
			switch (_input.LA(1)) {
			case ONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				match(ONE);
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(614);
				match(ZERO);
				setState(617);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(615);
					match(POINT);
					setState(616);
					match(INTEGER);
					}
					break;
				}
				}
				}
				break;
			case LBRK:
				enterOuterAlt(_localctx, 3);
				{
				setState(619);
				match(LBRK);
				setState(620);
				zero2one();
				setState(621);
				match(RBRK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntintContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(Tidal1Parser.ONE, 0); }
		public TerminalNode INTEGER() { return getToken(Tidal1Parser.INTEGER, 0); }
		public TerminalNode LBRK() { return getToken(Tidal1Parser.LBRK, 0); }
		public IntintContext intint() {
			return getRuleContext(IntintContext.class,0);
		}
		public TerminalNode RBRK() { return getToken(Tidal1Parser.RBRK, 0); }
		public IntintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterIntint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitIntint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitIntint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntintContext intint() throws RecognitionException {
		IntintContext _localctx = new IntintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_intint);
		int _la;
		try {
			setState(630);
			switch (_input.LA(1)) {
			case ONE:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				_la = _input.LA(1);
				if ( !(_la==ONE || _la==INTEGER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case LBRK:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(LBRK);
				setState(627);
				intint();
				setState(628);
				match(RBRK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_or_ratioContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(Tidal1Parser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(Tidal1Parser.INTEGER, i);
		}
		public TerminalNode MODUL() { return getToken(Tidal1Parser.MODUL, 0); }
		public Int_or_ratioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_or_ratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterInt_or_ratio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitInt_or_ratio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitInt_or_ratio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_or_ratioContext int_or_ratio() throws RecognitionException {
		Int_or_ratioContext _localctx = new Int_or_ratioContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_int_or_ratio);
		try {
			setState(636);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(633);
				match(INTEGER);
				setState(634);
				match(MODUL);
				setState(635);
				match(INTEGER);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(Tidal1Parser.MINUS, 0); }
		public List<TerminalNode> ZERO() { return getTokens(Tidal1Parser.ZERO); }
		public TerminalNode ZERO(int i) {
			return getToken(Tidal1Parser.ZERO, i);
		}
		public List<IntintContext> intint() {
			return getRuleContexts(IntintContext.class);
		}
		public IntintContext intint(int i) {
			return getRuleContext(IntintContext.class,i);
		}
		public TerminalNode POINT() { return getToken(Tidal1Parser.POINT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tidal1Listener ) ((Tidal1Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Tidal1Visitor ) return ((Tidal1Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_number);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(638);
				match(MINUS);
				}
			}

			setState(643); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(643);
					switch (_input.LA(1)) {
					case ZERO:
						{
						setState(641);
						match(ZERO);
						}
						break;
					case LBRK:
					case ONE:
					case INTEGER:
						{
						setState(642);
						intint();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(645); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(655);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(647);
				match(POINT);
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(650);
						switch (_input.LA(1)) {
						case ZERO:
							{
							setState(648);
							match(ZERO);
							}
							break;
						case LBRK:
						case ONE:
						case INTEGER:
							{
							setState(649);
							intint();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(654);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3N\u0294\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\6\3@\n\3\r\3"+
		"\16\3A\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\3\6\3N\n\3\r\3\16\3O"+
		"\3\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\3\3\3\3\3\7\3_\n\3\f\3"+
		"\16\3b\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3n\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3|\n\3\f\3\16\3\177\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0088\n\3\f\3\16\3\u008b\13\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0098\n\3\f\3\16\3\u009b\13\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00a5\n\3\f\3\16\3\u00a8\13\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3\u00af\n\3\f\3\16\3\u00b2\13\3\3\3\3\3\5\3\u00b6\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u00cd\n\6\f\6\16\6\u00d0\13\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e1\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\6\7\u00e9\n\7\r\7\16\7\u00ea\3\7\3\7\3\7\3\7\6\7\u00f1\n\7\r\7\16"+
		"\7\u00f2\3\7\3\7\5\7\u00f7\n\7\3\b\6\b\u00fa\n\b\r\b\16\b\u00fb\3\b\3"+
		"\b\6\b\u0100\n\b\r\b\16\b\u0101\7\b\u0104\n\b\f\b\16\b\u0107\13\b\3\t"+
		"\3\t\3\t\5\t\u010c\n\t\3\t\3\t\5\t\u0110\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0118\n\t\3\t\5\t\u011b\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0122\n\t\3\t\5"+
		"\t\u0125\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u012c\n\t\3\t\3\t\5\t\u0130\n\t\3"+
		"\t\5\t\u0133\n\t\5\t\u0135\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u013c\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\5\13\u0144\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\6\13\u0150\n\13\r\13\16\13\u0151\3\13\3\13\3\13\5\13\u0157"+
		"\n\13\3\f\3\f\3\f\7\f\u015c\n\f\f\f\16\f\u015f\13\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u016f\n\f\3\r\6\r\u0172\n\r"+
		"\r\r\16\r\u0173\3\r\3\r\3\r\3\r\3\r\7\r\u017b\n\r\f\r\16\r\u017e\13\r"+
		"\6\r\u0180\n\r\r\r\16\r\u0181\5\r\u0184\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u018f\n\16\f\16\16\16\u0192\13\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u019e\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01a9\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01b6\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\6\16\u01bd\n\16\r\16\16\16\u01be\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u01c9\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01dd\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u01e6\n\16\f\16\16\16\u01e9\13\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0201\n\16\f\16\16\16\u0204\13\16"+
		"\3\16\3\16\3\16\5\16\u0209\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0212\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u021c\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u0223\n\21\3\21\3\21\3\21\5\21\u0228\n\21"+
		"\7\21\u022a\n\21\f\21\16\21\u022d\13\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0239\n\21\f\21\16\21\u023c\13\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0246\n\21\3\22\3\22\5\22\u024a\n"+
		"\22\3\22\7\22\u024d\n\22\f\22\16\22\u0250\13\22\3\22\3\22\3\22\3\22\5"+
		"\22\u0256\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0264\n\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u026c\n\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0272\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u0279"+
		"\n\27\3\30\3\30\3\30\3\30\5\30\u027f\n\30\3\31\5\31\u0282\n\31\3\31\3"+
		"\31\6\31\u0286\n\31\r\31\16\31\u0287\3\31\3\31\3\31\7\31\u028d\n\31\f"+
		"\31\16\31\u0290\13\31\5\31\u0292\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\2\13\5\2**--//\4\2JJLL\4\2CCFF\4\2\21\21"+
		"\23\23\3\2\678\3\2KL\3\2\7\n\4\2\30\30\33\33\5\2\13\17\22\22..\u02ec\2"+
		"\62\3\2\2\2\4\u00b5\3\2\2\2\6\u00b7\3\2\2\2\b\u00bf\3\2\2\2\n\u00e0\3"+
		"\2\2\2\f\u00f6\3\2\2\2\16\u00f9\3\2\2\2\20\u0134\3\2\2\2\22\u013b\3\2"+
		"\2\2\24\u0156\3\2\2\2\26\u016e\3\2\2\2\30\u0183\3\2\2\2\32\u0208\3\2\2"+
		"\2\34\u020a\3\2\2\2\36\u021b\3\2\2\2 \u0245\3\2\2\2\"\u0255\3\2\2\2$\u0257"+
		"\3\2\2\2&\u0263\3\2\2\2(\u0265\3\2\2\2*\u0271\3\2\2\2,\u0278\3\2\2\2."+
		"\u027e\3\2\2\2\60\u0281\3\2\2\2\62\63\7\3\2\2\63\64\7\4\2\2\64\65\5\4"+
		"\3\2\65\3\3\2\2\2\66\67\5\32\16\2\678\7\4\2\28:\3\2\2\29\66\3\2\2\2:="+
		"\3\2\2\2;9\3\2\2\2;<\3\2\2\2<?\3\2\2\2=;\3\2\2\2>@\5\b\5\2?>\3\2\2\2@"+
		"A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CD\7\66\2\2DF\5\24\13\2EC\3\2\2"+
		"\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\u00b6\3\2\2\2IG\3\2\2\2JK\5\32\16\2"+
		"KM\7;\2\2LN\5\b\5\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2"+
		"QV\7<\2\2RS\7\66\2\2SU\5\24\13\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2"+
		"\2W\u00b6\3\2\2\2XV\3\2\2\2YZ\7;\2\2Z[\5\4\3\2[`\7<\2\2\\]\7\66\2\2]_"+
		"\5\24\13\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\u00b6\3\2\2\2b`\3"+
		"\2\2\2cn\7(\2\2dn\7)\2\2en\7+\2\2fg\7\63\2\2gh\7;\2\2hi\5,\27\2ij\7F\2"+
		"\2jk\5,\27\2kl\7<\2\2ln\3\2\2\2mc\3\2\2\2md\3\2\2\2me\3\2\2\2mf\3\2\2"+
		"\2no\3\2\2\2op\7;\2\2pq\5\4\3\2qr\7<\2\2rs\7;\2\2st\5\4\3\2tu\7<\2\2u"+
		"\u00b6\3\2\2\2vw\t\2\2\2wx\7=\2\2x}\5\b\5\2yz\7A\2\2z|\5\b\5\2{y\3\2\2"+
		"\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0081\7>\2\2\u0081\u00b6\3\2\2\2\u0082\u0083\7,\2\2\u0083\u0084\7=\2"+
		"\2\u0084\u0089\5\6\4\2\u0085\u0086\7A\2\2\u0086\u0088\5\6\4\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7>\2\2\u008d\u00b6\3\2"+
		"\2\2\u008e\u008f\7\61\2\2\u008f\u0090\7L\2\2\u0090\u0091\7;\2\2\u0091"+
		"\u0092\5\32\16\2\u0092\u0093\7<\2\2\u0093\u0094\7=\2\2\u0094\u0099\5\4"+
		"\3\2\u0095\u0096\7A\2\2\u0096\u0098\5\4\3\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7>\2\2\u009d\u00b6\3\2\2\2\u009e"+
		"\u009f\7\62\2\2\u009f\u00a0\7L\2\2\u00a0\u00a1\7;\2\2\u00a1\u00a6\5\4"+
		"\3\2\u00a2\u00a3\7A\2\2\u00a3\u00a5\5\b\5\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7<\2\2\u00aa\u00ab\7=\2\2\u00ab\u00b0"+
		"\5\32\16\2\u00ac\u00ad\7A\2\2\u00ad\u00af\5\32\16\2\u00ae\u00ac\3\2\2"+
		"\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		";\3\2\2\2\u00b5J\3\2\2\2\u00b5Y\3\2\2\2\u00b5m\3\2\2\2\u00b5v\3\2\2\2"+
		"\u00b5\u0082\3\2\2\2\u00b5\u008e\3\2\2\2\u00b5\u009e\3\2\2\2\u00b6\5\3"+
		"\2\2\2\u00b7\u00b8\7;\2\2\u00b8\u00b9\t\3\2\2\u00b9\u00ba\7A\2\2\u00ba"+
		"\u00bb\7L\2\2\u00bb\u00bc\7A\2\2\u00bc\u00bd\5\4\3\2\u00bd\u00be\7<\2"+
		"\2\u00be\7\3\2\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\5\n\6\2\u00c1\t\3\2"+
		"\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\7\5\2\2\u00c5"+
		"\u00e1\3\2\2\2\u00c6\u00ce\5\32\16\2\u00c7\u00c8\7D\2\2\u00c8\u00c9\7"+
		";\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\7<\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c7\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\5\2\2\u00d2"+
		"\u00d3\5\16\b\2\u00d3\u00d4\7\5\2\2\u00d4\u00e1\3\2\2\2\u00d5\u00d6\7"+
		";\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8\7<\2\2\u00d8\u00e1\3\2\2\2\u00d9"+
		"\u00da\7\27\2\2\u00da\u00db\7\5\2\2\u00db\u00dc\5\16\b\2\u00dc\u00dd\7"+
		"\5\2\2\u00dd\u00de\5\f\7\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5\22\n\2\u00e0"+
		"\u00c2\3\2\2\2\u00e0\u00c6\3\2\2\2\u00e0\u00d5\3\2\2\2\u00e0\u00d9\3\2"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e1\13\3\2\2\2\u00e2\u00e3\7;\2\2\u00e3\u00e4"+
		"\7\20\2\2\u00e4\u00e5\7L\2\2\u00e5\u00f7\7<\2\2\u00e6\u00e8\7\5\2\2\u00e7"+
		"\u00e9\7L\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f7\7\5\2\2\u00ed"+
		"\u00ee\7;\2\2\u00ee\u00f0\7\5\2\2\u00ef\u00f1\7L\2\2\u00f0\u00ef\3\2\2"+
		"\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f5\7\5\2\2\u00f5\u00f7\7<\2\2\u00f6\u00e2\3\2\2\2\u00f6"+
		"\u00e6\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f7\r\3\2\2\2\u00f8\u00fa\5\20\t"+
		"\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u0105\3\2\2\2\u00fd\u00ff\7A\2\2\u00fe\u0100\5\20\t\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u00fd\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\17\3\2\2\2\u0107\u0105\3\2\2"+
		"\2\u0108\u010b\7\64\2\2\u0109\u010a\7B\2\2\u010a\u010c\5,\27\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010e\t\4\2\2\u010e"+
		"\u0110\5,\27\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0118\3\2"+
		"\2\2\u0111\u0112\7;\2\2\u0112\u0113\5,\27\2\u0113\u0114\7A\2\2\u0114\u0115"+
		"\5,\27\2\u0115\u0116\7<\2\2\u0116\u0118\3\2\2\2\u0117\u0108\3\2\2\2\u0117"+
		"\u0111\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b\7H\2\2\u011a\u0119\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u0135\3\2\2\2\u011c\u011d\7=\2\2\u011d"+
		"\u011e\5\16\b\2\u011e\u0121\7>\2\2\u011f\u0120\t\4\2\2\u0120\u0122\5,"+
		"\27\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u0125\7H\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0135\3\2"+
		"\2\2\u0126\u0127\7?\2\2\u0127\u0128\5\16\b\2\u0128\u012b\7@\2\2\u0129"+
		"\u012a\t\4\2\2\u012a\u012c\5,\27\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012f\3\2\2\2\u012d\u012e\7E\2\2\u012e\u0130\5,\27\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133\7H"+
		"\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0117\3\2\2\2\u0134\u011c\3\2\2\2\u0134\u0126\3\2\2\2\u0135\21\3\2\2"+
		"\2\u0136\u0137\7;\2\2\u0137\u0138\7I\2\2\u0138\u013c\7<\2\2\u0139\u013c"+
		"\7#\2\2\u013a\u013c\7%\2\2\u013b\u0136\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\79\2\2\u013e\u013f\5\n"+
		"\6\2\u013f\u0140\7:\2\2\u0140\u0141\5\24\13\2\u0141\23\3\2\2\2\u0142\u0144"+
		"\7\66\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2"+
		"\u0145\u0146\7#\2\2\u0146\u0147\7\5\2\2\u0147\u0148\5\26\f\2\u0148\u0149"+
		"\7\5\2\2\u0149\u0157\3\2\2\2\u014a\u014b\7#\2\2\u014b\u0157\5\26\f\2\u014c"+
		"\u014d\7&\2\2\u014d\u014f\7\5\2\2\u014e\u0150\7\'\2\2\u014f\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0157\7\5\2\2\u0154\u0157\5,\27\2\u0155\u0157\5\36"+
		"\20\2\u0156\u0143\3\2\2\2\u0156\u014a\3\2\2\2\u0156\u014c\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\25\3\2\2\2\u0158\u015d\5\30\r"+
		"\2\u0159\u015a\7A\2\2\u015a\u015c\5\30\r\2\u015b\u0159\3\2\2\2\u015c\u015f"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u016f\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u016f\7\65\2\2\u0161\u0162\7;\2\2\u0162\u0163\5\32"+
		"\16\2\u0163\u0164\7\65\2\2\u0164\u0165\7<\2\2\u0165\u016f\3\2\2\2\u0166"+
		"\u0167\7;\2\2\u0167\u0168\5\26\f\2\u0168\u0169\7<\2\2\u0169\u016f\3\2"+
		"\2\2\u016a\u016b\7\5\2\2\u016b\u016c\5\26\f\2\u016c\u016d\7\5\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u0158\3\2\2\2\u016e\u0160\3\2\2\2\u016e\u0161\3\2"+
		"\2\2\u016e\u0166\3\2\2\2\u016e\u016a\3\2\2\2\u016f\27\3\2\2\2\u0170\u0172"+
		"\5\60\31\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2"+
		"\u0173\u0174\3\2\2\2\u0174\u0184\3\2\2\2\u0175\u0176\7=\2\2\u0176\u0177"+
		"\5\26\f\2\u0177\u017c\7>\2\2\u0178\u0179\t\4\2\2\u0179\u017b\5,\27\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0175\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2"+
		"\2\2\u0183\u0171\3\2\2\2\u0183\u017f\3\2\2\2\u0184\31\3\2\2\2\u0185\u0209"+
		"\5\34\17\2\u0186\u0187\7;\2\2\u0187\u0188\5\32\16\2\u0188\u0190\7<\2\2"+
		"\u0189\u018a\7D\2\2\u018a\u018b\7;\2\2\u018b\u018c\5\32\16\2\u018c\u018d"+
		"\7<\2\2\u018d\u018f\3\2\2\2\u018e\u0189\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0209\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0193\u0209\5\36\20\2\u0194\u0195\7\36\2\2\u0195\u0196\7L\2\2\u0196"+
		"\u019d\5*\26\2\u0197\u019e\5*\26\2\u0198\u0199\7;\2\2\u0199\u019a\7G\2"+
		"\2\u019a\u019b\5*\26\2\u019b\u019c\7<\2\2\u019c\u019e\3\2\2\2\u019d\u0197"+
		"\3\2\2\2\u019d\u0198\3\2\2\2\u019e\u0209\3\2\2\2\u019f\u01a0\7\60\2\2"+
		"\u01a0\u01a1\7;\2\2\u01a1\u01a2\5\32\16\2\u01a2\u01a3\7<\2\2\u01a3\u0209"+
		"\3\2\2\2\u01a4\u0209\5\24\13\2\u01a5\u01a6\t\5\2\2\u01a6\u0209\5*\26\2"+
		"\u01a7\u01a9\5\60\31\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa\u0209\t\6\2\2\u01ab\u01ac\5(\25\2\u01ac\u01ad\5,\27\2\u01ad"+
		"\u0209\3\2\2\2\u01ae\u01af\7\24\2\2\u01af\u01b5\7L\2\2\u01b0\u01b1\7;"+
		"\2\2\u01b1\u01b2\5\32\16\2\u01b2\u01b3\7<\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b6\5\32\16\2\u01b5\u01b0\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6\u0209\3"+
		"\2\2\2\u01b7\u01b8\7\25\2\2\u01b8\u01b9\7=\2\2\u01b9\u01bc\7L\2\2\u01ba"+
		"\u01bb\7A\2\2\u01bb\u01bd\7L\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\3\2\2"+
		"\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1"+
		"\7>\2\2\u01c1\u01c2\7;\2\2\u01c2\u01c3\5\32\16\2\u01c3\u01c4\7<\2\2\u01c4"+
		"\u0209\3\2\2\2\u01c5\u01c9\7\"\2\2\u01c6\u01c7\7\32\2\2\u01c7\u01c9\5"+
		"*\26\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u0209\5\32\16\2\u01cb\u01cc\7\37\2\2\u01cc\u01cd\7L\2\2\u01cd\u01ce\7"+
		"L\2\2\u01ce\u01cf\7;\2\2\u01cf\u01d0\5\32\16\2\u01d0\u01d1\7<\2\2\u01d1"+
		"\u0209\3\2\2\2\u01d2\u01d3\7 \2\2\u01d3\u01d4\7;\2\2\u01d4\u01d5\5*\26"+
		"\2\u01d5\u01d6\7A\2\2\u01d6\u01d7\5*\26\2\u01d7\u01d8\7<\2\2\u01d8\u01dc"+
		"\7;\2\2\u01d9\u01dd\5\32\16\2\u01da\u01db\7\66\2\2\u01db\u01dd\5\24\13"+
		"\2\u01dc\u01d9\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df"+
		"\7<\2\2\u01df\u0209\3\2\2\2\u01e0\u01e1\7\26\2\2\u01e1\u01e2\7;\2\2\u01e2"+
		"\u01e7\5\32\16\2\u01e3\u01e4\7D\2\2\u01e4\u01e6\5\32\16\2\u01e5\u01e3"+
		"\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\7<\2\2\u01eb\u0209\3\2"+
		"\2\2\u01ec\u01ed\7!\2\2\u01ed\u01ee\7;\2\2\u01ee\u01ef\5*\26\2\u01ef\u01f0"+
		"\7A\2\2\u01f0\u01f1\5*\26\2\u01f1\u01f2\7<\2\2\u01f2\u0209\3\2\2\2\u01f3"+
		"\u01f4\7\35\2\2\u01f4\u01f5\7L\2\2\u01f5\u01f6\7;\2\2\u01f6\u01f7\t\7"+
		"\2\2\u01f7\u01f8\7F\2\2\u01f8\u01f9\t\7\2\2\u01f9\u0209\7<\2\2\u01fa\u01fb"+
		"\7\31\2\2\u01fb\u01fc\5,\27\2\u01fc\u01fd\7=\2\2\u01fd\u0202\5\60\31\2"+
		"\u01fe\u01ff\7A\2\2\u01ff\u0201\5\60\31\2\u0200\u01fe\3\2\2\2\u0201\u0204"+
		"\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0205\u0206\7>\2\2\u0206\u0209\3\2\2\2\u0207\u0209\5 \21"+
		"\2\u0208\u0185\3\2\2\2\u0208\u0186\3\2\2\2\u0208\u0193\3\2\2\2\u0208\u0194"+
		"\3\2\2\2\u0208\u019f\3\2\2\2\u0208\u01a4\3\2\2\2\u0208\u01a5\3\2\2\2\u0208"+
		"\u01a8\3\2\2\2\u0208\u01ab\3\2\2\2\u0208\u01ae\3\2\2\2\u0208\u01b7\3\2"+
		"\2\2\u0208\u01c8\3\2\2\2\u0208\u01cb\3\2\2\2\u0208\u01d2\3\2\2\2\u0208"+
		"\u01e0\3\2\2\2\u0208\u01ec\3\2\2\2\u0208\u01f3\3\2\2\2\u0208\u01fa\3\2"+
		"\2\2\u0208\u0207\3\2\2\2\u0209\33\3\2\2\2\u020a\u020b\t\b\2\2\u020b\35"+
		"\3\2\2\2\u020c\u020d\7\22\2\2\u020d\u020e\5,\27\2\u020e\u0211\7;\2\2\u020f"+
		"\u0212\5.\30\2\u0210\u0212\5\24\13\2\u0211\u020f\3\2\2\2\u0211\u0210\3"+
		"\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\7<\2\2\u0214\u021c\3\2\2\2\u0215"+
		"\u0216\7\22\2\2\u0216\u0217\5,\27\2\u0217\u0218\7\5\2\2\u0218\u0219\5"+
		"\"\22\2\u0219\u021a\7\5\2\2\u021a\u021c\3\2\2\2\u021b\u020c\3\2\2\2\u021b"+
		"\u0215\3\2\2\2\u021c\37\3\2\2\2\u021d\u021e\t\t\2\2\u021e\u021f\5&\24"+
		"\2\u021f\u0222\7=\2\2\u0220\u0223\5\60\31\2\u0221\u0223\5.\30\2\u0222"+
		"\u0220\3\2\2\2\u0222\u0221\3\2\2\2\u0223\u022b\3\2\2\2\u0224\u0227\7A"+
		"\2\2\u0225\u0228\5\60\31\2\u0226\u0228\5.\30\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0226\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0224\3\2\2\2\u022a\u022d\3\2"+
		"\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022e\u022f\7>\2\2\u022f\u0246\3\2\2\2\u0230\u0231\7\30"+
		"\2\2\u0231\u0232\7;\2\2\u0232\u0233\7\4\2\2\u0233\u0234\7<\2\2\u0234\u0235"+
		"\7=\2\2\u0235\u023a\5\32\16\2\u0236\u0237\7A\2\2\u0237\u0239\5\32\16\2"+
		"\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b"+
		"\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7>\2\2\u023e"+
		"\u0246\3\2\2\2\u023f\u0240\7\34\2\2\u0240\u0241\5&\24\2\u0241\u0242\7"+
		"\5\2\2\u0242\u0243\5\"\22\2\u0243\u0244\7\5\2\2\u0244\u0246\3\2\2\2\u0245"+
		"\u021d\3\2\2\2\u0245\u0230\3\2\2\2\u0245\u023f\3\2\2\2\u0246!\3\2\2\2"+
		"\u0247\u024e\5.\30\2\u0248\u024a\7A\2\2\u0249\u0248\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\5.\30\2\u024c\u0249\3\2\2\2\u024d"+
		"\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0256\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0251\u0252\7=\2\2\u0252\u0253\5\"\22\2\u0253"+
		"\u0254\7>\2\2\u0254\u0256\3\2\2\2\u0255\u0247\3\2\2\2\u0255\u0251\3\2"+
		"\2\2\u0256#\3\2\2\2\u0257\u0258\5&\24\2\u0258%\3\2\2\2\u0259\u0264\5("+
		"\25\2\u025a\u025b\7;\2\2\u025b\u025c\5&\24\2\u025c\u025d\7<\2\2\u025d"+
		"\u0264\3\2\2\2\u025e\u025f\7\36\2\2\u025f\u0260\5,\27\2\u0260\u0261\5"+
		",\27\2\u0261\u0264\3\2\2\2\u0262\u0264\7\16\2\2\u0263\u0259\3\2\2\2\u0263"+
		"\u025a\3\2\2\2\u0263\u025e\3\2\2\2\u0263\u0262\3\2\2\2\u0264\'\3\2\2\2"+
		"\u0265\u0266\t\n\2\2\u0266)\3\2\2\2\u0267\u0272\7K\2\2\u0268\u026b\7J"+
		"\2\2\u0269\u026a\7D\2\2\u026a\u026c\7L\2\2\u026b\u0269\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026c\u0272\3\2\2\2\u026d\u026e\7;\2\2\u026e\u026f\5*\26\2\u026f"+
		"\u0270\7<\2\2\u0270\u0272\3\2\2\2\u0271\u0267\3\2\2\2\u0271\u0268\3\2"+
		"\2\2\u0271\u026d\3\2\2\2\u0272+\3\2\2\2\u0273\u0279\t\7\2\2\u0274\u0275"+
		"\7;\2\2\u0275\u0276\5,\27\2\u0276\u0277\7<\2\2\u0277\u0279\3\2\2\2\u0278"+
		"\u0273\3\2\2\2\u0278\u0274\3\2\2\2\u0279-\3\2\2\2\u027a\u027f\7L\2\2\u027b"+
		"\u027c\7L\2\2\u027c\u027d\7E\2\2\u027d\u027f\7L\2\2\u027e\u027a\3\2\2"+
		"\2\u027e\u027b\3\2\2\2\u027f/\3\2\2\2\u0280\u0282\7G\2\2\u0281\u0280\3"+
		"\2\2\2\u0281\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0286\7J\2\2\u0284"+
		"\u0286\5,\27\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0291\3\2\2\2\u0289"+
		"\u028e\7D\2\2\u028a\u028d\7J\2\2\u028b\u028d\5,\27\2\u028c\u028a\3\2\2"+
		"\2\u028c\u028b\3\2\2\2\u028d\u0290\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f"+
		"\3\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0291\u0289\3\2\2\2\u0291"+
		"\u0292\3\2\2\2\u0292\61\3\2\2\2J;AGOV`m}\u0089\u0099\u00a6\u00b0\u00b5"+
		"\u00ce\u00e0\u00ea\u00f2\u00f6\u00fb\u0101\u0105\u010b\u010f\u0117\u011a"+
		"\u0121\u0124\u012b\u012f\u0132\u0134\u013b\u0143\u0151\u0156\u015d\u016e"+
		"\u0173\u017c\u0181\u0183\u0190\u019d\u01a8\u01b5\u01be\u01c8\u01dc\u01e7"+
		"\u0202\u0208\u0211\u021b\u0222\u0227\u022b\u023a\u0245\u0249\u024e\u0255"+
		"\u0263\u026b\u0271\u0278\u027e\u0281\u0285\u0287\u028c\u028e\u0291";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}