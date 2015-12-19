

import java.util.LinkedList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

/** This class handles the genotype-phenotype mapping between a genome and a tidal pattern. It uses a grammar developed using antlr4
 * 
 * @author sjh
 *
 */

public class tidalGE {



	public static final boolean DEBUG = false;
	/** The following are copied and pasted from Tidal1Parser
	 * TODO: find a way of doing this 'properly' from within antlr.
	 * (probably add extra getters and setters as needed)
	 *  */	
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
	
	/** NON-ANTLR global variables */
	
	String pattern;
	String mutant;
	int offset;
	

	/** Mutation types */
	//TODO: It may be easier to use an enum, but I'm following antlr convention here. 
	public static final int
		MT_NOMUT = 0, 	/** No mutation */
		MT_SUB = 1,		/** Substitution */
		MT_INS = 2,		/** Insertion */
		MR_DEL = 3;		/** Deletion */
	
	private static final double[] MT_rates = {0.5,0.9,0.95,1.0};
	
	
	/** The sounds */
	private static final String[] _Sample_atom = {
	"~",	"~",	"~",	"~",	"~",
	/* These were the original test signals */
	/*
	"arp","arpy","bass3","bd",
	"blip","can","cp","drum",
	"feel","future","hc","hh","ho",
	"ht","jvbass","kurt","lt","mouth",
	"mt","odx","rave","sn","sd",
	"sid","tabla",
	*/
	
	/* Full edited set from the dirt samples directory */
	
	/*"20010320-Samples","breaks157",*/	"flick",		"lighter",		"sax",
	/*"20020506","breaks165",*/			"foo",			"lt",			"seawolf",
	"808",				"breath",		/*"fuckable",*/	"made",			"sequential",
	"909",				"bubble",		"future",		"made2",		"sf",
	"ab",				"can",			"gab",			"mash",			"sheffield",
	"ade",				"casio",		"gabba",		"mash2",		"short",
	"ades2",			"cc",			"gabbaloud",	"metal",		"sid",
	"ades3",            "chin",       	"gabbalouder",  "miniyeah",    	"sine",
	"ades4",            "chink",      	"glasstap",     /*"moan",*/    	"sitar",
	"alex",             "circus",     	"glitch",       "monsterb",    	"sn",
	"alphabet",         "clak",       	"glitch2",      "moog",        	"space",
	"amencutup",        "click",      	"gretsch",      "mouth",       	"speech",
	"armora",           "co",         	"h",            "mp3",         	"speechless",
	"arp",              "cosmicg",    	"hand",         "msg",         	"speedupdown",
	"arpy",             "cp",         	"hardcore",     "mt",          	"stab",
	"auto",             "cr",         	"haw",          "mute",        	"stomp",
	/*"baa",*/          /*"crow",*/		"hc",           "newnotes",    	"subroc3d",
	/*"baa2",*/         "d",          	"hh",           "noise",      	"sugar",
	"bass",             "db",         	"hh27",         "noise2",      	"sundance",
	"bass0",            "diphone",    	"hit",          "notes",      	"tabla",
	"bass1",            "diphone2",   	"hmm",          "numbers",     	"tabla2",
	"bass2",            "dist",       	"ho",           "oc",          	"tablex",
	"bass3",            "dork2",      	"house",        "odx",         	"tacscan",
	"bassdm",           "dorkbot",    	"ht",           "off",         	"tech",
	"bassfoo",          "dr",         	"if",           "pad",         	"techno",
	"battles",          "dr2",        	"ifdrums",      "padlong",     	"tink",
	"bd",               "dr55",       	"incoming",     "pebbles",     	"tok",
	"bend",             "dr_few",     	"industrial",   "perc",        	"toys",
	/*"bev",*/          "drum",       	"insect",       "peri",        	"trump",
	"bin",              "drumtraks",  	"invaders",     "pluck",       	"ul",
	"birds3",           "e",          	"jazz",         "print",       	"ulgab",
	"bleep",            "east",       	"jungbass",     "printshort",  	"uxay",
	"blip",             "electro1",   	"jungle",       "proc",        	"v",
	"blue",             "erk",        	"jvbass",       "procshort",   	"voodoo",
	"bottle",           "f",          	"koy",          "psr",         	"wind",
	/*"breaks125",*/     "feel",       	"kurt",         /*"rave",*/		"wobble",
	/*"breaks152",*/     "feelfx",     	"latibro",      /*"rave2",*/	"world",
	/*"breaks152loud",*/ "fest",       	"led",          /*"ravemono",*/	/*"xmas",*/
	/*"breaks152louder",*/"fire",       "less",         "rm",          	"yeah"
	};
	
	
							
		private static final String[] SynthOp = {
		/**	Operator		   ValidRange */
			"accelerate",	// ?
			"bandf",		// 0-1 (needs bandq setting, a bit like the delay params
			"bandq",		// 0-1
			"begin",		// 0-1
			//"coarse",		// Doesn't appear to do anything in this context
			"crush",		// 1 - 16 (1 does nothing, 1.1 does lots! Fake resampling
			"cutoff",		// 0-1, but doesn't do much - needs resonance
			"delay",		// 0-1, controls level of delay
			"delayfeedback",// 0-1, controls fb of delay
			"delaytime",	// 0-1, controls time of delay (1 is not that long..)
			"end",			// 0-1
			//"gain",		//risky!
			"hcutoff",		// 0-1
			"hresonance",	// 0-1
			"pan",
			"resonance",	// 0-1
			"shape",		// 0-1
			"speed"
		};
	
	private int nMut; 	//The max number of mutations allowed
	
	/** 
	* Need to set MT_rates to give the CUMULATIVE probability of each type (none, sub, ins, del)
	*/
	private int getMType(){
		double rno = Math.random();
		
		for(int i=0; i<MT_rates.length; i++){
			if(rno < MT_rates[i])
				return i;
		}
		
		//catch-all:
		return 0;
		
		
	}
	
	
	
	LinkedList <Integer>genome;// = new LinkedList<Integer>();
	LinkedList <String>genome_code;//
	
	tidalGE(){
	
		System.out.println("Constructing tidalGE..");
		nMut = 0;
		genome = null;
		genome_code = null;
		pattern = "";
		mutant = "";
		System.out.println("..finished");
	}
	

	private ParseTree treeFromPattern(String pattern){

		boolean validparse = true;
		
		ANTLRInputStream fs=new ANTLRInputStream(pattern);
	    Tidal1lexer l = new Tidal1lexer(fs);
	    Tidal1Parser p = new Tidal1Parser(new CommonTokenStream(l));
	    p.addErrorListener(new BaseErrorListener() {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
	            throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
	        }
	    });
	    
	    String ss = "";
	    ParseTree tree = null;
	    //Now trying to get the tree out...
	    try{
	    	tree = p.tidal();
	    	ss = tree.toStringTree(p);
	    }
	    catch(IllegalStateException e){
	    	validparse=false;
	    }
		    
	    if(validparse)
	    	return tree;
	    else
	    	return null;
		
	}
	

	public String tokenTypeString(int type){
		String name="";
		
		//TODO: We can do this MUCH more easily by accessing Tidal1Parser._LITERAL_NAMES and Tidal1Parser._SYMBOLIC_NAMES
		
		if(type>=_LITERAL_NAMES.length){
			if(type>=_SYMBOLIC_NAMES.length){
				return "type index out of range!";
			}
			else
				return ""+_SYMBOLIC_NAMES[type]+" (type inde out of range)";
			//System.out.println("type "+type+"not recognized, should be > "+_LITERAL_NAMES.length);
		}
		
		if(_LITERAL_NAMES[type]==null){
			if(_SYMBOLIC_NAMES[type]==null)
				return "no data available for this type! (is it the root node?)";
			else
				return ""+_SYMBOLIC_NAMES[type]+" (list of literal names availabe)";
		}
		else{
			if(_SYMBOLIC_NAMES[type]==null)
				return "no symbolic name for literal type "+_LITERAL_NAMES[type];
			else
				return ""+_SYMBOLIC_NAMES[type]+" ("+_LITERAL_NAMES[type]+")";
		}
	}

	/** When we are building a genome, we need the index of the child rule w.r.t. its parent - this forms 
	 * the genome
	 * @param parent: the index of the parent.
	 * @return
	 */
	private int ruleIndex(int parent){
		
		System.out.println("Processing a "+ruleNames[parent]+"rule");
		
		switch(parent){
		
		}
		
		return (int) -1;
	}
	

	private String generateSynthOp(){
		int op = (int) Math.floor(SynthOp.length * Math.random());	
		return SynthOp[op];
	}
	
	/**
	: cont_atom (COMMA cont_atom)*
	| WAVE
	| LBRK trans_spec WAVE RBRK 
	| LBRK cont_patt RBRK
	| QUOT cont_patt QUOT 
	;*/
	//TODO: We are only doing the first two for now - need to tidy up the grammar
	private String generateContPatt(String spacer, double min, double max){
		
		/** 50% of the time we'll use a numeric sequence */
		if(Math.random()<0.5){
			String output = ""+String.format( "%.2f", min + ((max-min) * Math.random()) );
			
			/*Now we want a sequence of numbers*/
			double prob = 1.;
			while(Math.random()<prob){
				output += spacer +" "+String.format( "%.2f", min + ((max-min) * Math.random()) );
				prob *=0.66;
			}
			return " \""+output+"\"";
		}
		else{
			return generateWave();
		}	
	}
	
	
	private String generateWave(){
		String waveOp[] = {"sinewave1","sine1","squarewave1","triwave1"};
		int op = (int) Math.floor(waveOp.length * Math.random());	
		return " "+waveOp[op];
	}


	private String generateCompoundSampleAtom(){
	
		String output = "[";

		double prob = 1.;
		while(Math.random()<prob){
			output += " "+_Sample_atom[(int) Math.floor(_Sample_atom.length * Math.random())];
			prob *=0.8;
		}
	
		output+=(" ]");
		
		return output;
	}

	private String  generateContOp(){
		String p[] = {"pan","shape"};
		if(Math.random()<0.5){
			return p[0];
		}
		else
			return p[1];
	}

	private String  generateVowelPatt(){
		String v[] = {"a","e","i","o","u"};
		String output = v[(int) Math.floor(v.length * Math.random())];

		/*Now we want a sequence of numbers*/
		double prob = 1.;
		while(Math.random()<prob){
			output += " "+v[(int) Math.floor(v.length * Math.random())];
			prob *=0.8;
		}
		
		return " \""+output+"\"";
	}	
	
	
	private String generateVowelOp(){
		String p = "vowel";
		return p;
	}
	
	/** 
	// Continuous expressions (usually involves |+|)
	cont_frag 
		: (KNIT)? SYNTH_OP QUOT cont_patt QUOT
		| VOWEL_OP QUOT (VOWEL)+ QUOT
		| intint 								//TODO: This shouldn't be here should it?
		| slow_pattern							//TODO: This opens up a load of stuff...
		| CONT_OP cont_patt  
	; */
	private String generateContFrag(){
				
		final int nr = 3; //The number of expansions of this rule
		String output = "|+| ";
		
		
		int op = (int) Math.floor((1+SynthOp.length) * Math.random());	
	
		int f = (int) Math.floor(nr * Math.random());
		
		switch(f){
		case 0: //Proporional selection of vowelops 
			output += generateVowelOp();
			output += generateVowelPatt();
			break;
		default: //Generate a synthop()
			String sop = generateSynthOp();
			if(sop.equals("crush"))
				output += sop + " " + generateContPatt("",1,16);
			else
				output += sop + " " + generateContPatt("",0,1);
			break;
		}
		
		
		return output;
	}
	
	private void appendContFrag(ParserRuleContext ctx){
		
		String tmp = mutant;
		
		//TODO: Check if putting brackets around the message has any effect..
		//Prepend an LBRK
		
		//TODO: put the brackets around the message...
		//mutant = "("+tmp+")"+generateContFrag();
		
		//TODO: We are assuming here that we can get the position after "D1 $" - this may not always be the case...
		int start = ctx.getStart().getStartIndex();
		
		
		//mutant = tmp.substring(0,start)+"("+tmp.substring(start,tmp.length())+")"+generateContFrag();
		//offset++;
		
		mutant = tmp.substring(0,start)+tmp.substring(start,tmp.length())+generateContFrag();
		//offset++;
	}

	/** 
	// Complete Set of Transformation Specifications
	trans_spec
		: trans_0arg
			| LBRK trans_spec  RBRK (POINT LBRK trans_spec RBRK)*
			| slow_pattern
			| STUT INTEGER zero2one (zero2one | LBRK MINUS zero2one RBRK)
			| SUPERIMP LBRK trans_spec RBRK //DOLLAR message
			| cont_frag//(KNIT)? SYNTH_OP cont_patt
			| (DEG_BY|TRUNC) zero2one
			| (number)? (BEATR|BEATL)
			| int_arg_trans intint
			| EVERY INTEGER ((LBRK trans_spec RBRK)| trans_spec) 
			| FOLDEVERY LSQB INTEGER (COMMA INTEGER)+ RSQB LBRK trans_spec RBRK
			| (SOMETIMESBY_ALIASES | SOMETIMESBY zero2one) trans_spec
			| WHENMOD INTEGER INTEGER LBRK trans_spec RBRK 
			| WITHIN LBRK zero2one COMMA zero2one RBRK LBRK (trans_spec|(KNIT cont_frag )) RBRK //TODO: may need the 'KNIT' part in other commands
			| JUX LBRK trans_spec (POINT trans_spec)* RBRK //TODO: look at the point thing here for other functions
			| ZOOM LBRK zero2one COMMA zero2one RBRK
			| STRIATE1 INTEGER LBRK (ONE|INTEGER) DIVID (ONE|INTEGER) RBRK
			| SMASH intint LSQB number (COMMA number)* RSQB
			| slowspread_pattern
			;
			
		trans_0arg //Transformations with no arguments
			: (BRAK | DEGRADE | REV | PALIN);	 
		int_arg_trans
			: (CHOP|DENSITY|SLOW|ITER|STRIATE|GAP|SPIN)
			;	
		//Of these, I need to do at least: 		
		density		int_arg_trans intint
		slow		int_arg_trans intint
		striate		int_arg_trans intint
		jux			JUX LBRK trans_spec (POINT trans_spec)* RBRK
		rev			trans_0arg
		every		EVERY INTEGER ((LBRK trans_spec RBRK)| trans_spec) 

		*/
	private String generateTransSpec(boolean nested){
			
		String[] tspc = {
			"brak",			//0
			"degrade",		//1
			"rev",			//2
			"palindrome",	//3___to here, zero arg
			"chop",			//4
			"density",		//5
			"slow",			//6
			"iter",			//7
			"striate",		//8
			"gap",			//9
			"spin",			//10__to here, single integer arg
			"jux",			//11
			"every"			//12__special, but popular fns
		};

		//maximum int we'd expect to use here..
		final int maxint = 16;
		
		//TODO: Find a more elegant way to do this!
		int nops = tspc.length;
		if(nested)
			nops -= 2; //make sure we don't nest our every's and jux's
		
		
		
		String output = "";
		
		
		
		int op = (int) Math.floor((tspc.length) * Math.random());	
			
		switch(op){
		case 0: //Proportional selection of zero argument ops
		case 1:
		case 2:
		case 3:
			output += " "+tspc[op]+" ";
			break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			output += " "+tspc[op]+" "+(int)(maxint * Math.random());
			break;
		case 11: //jux
			output += " jux ("+ generateTransSpec(true)+") ";
			
			break;
		case 12: //every
			output += " every "+(int)(maxint * Math.random())+" ("+ generateTransSpec(true)+") ";
			
		//	output += generateContOp();
		//	output += generateContPatt(",");
		//	break;
		}
		
		
		if(!nested){
			output += " $ ";
			offset += output.length();
		}
		return output;
	}
	
	
	
	
	private void prependTransSpec(ParserRuleContext ctx) {
		
		String tmp = mutant;
		
		int start = ctx.getStart().getStartIndex();
		
		mutant = tmp.substring(0,start)+generateTransSpec(false)+tmp.substring(start,tmp.length());
		
	}
	
	private void mutateSample(int start, int stop){
		int mtype = getMType();
    	switch(mtype){
    	case MT_NOMUT:
    		break;
    	case MT_SUB:
    	
    		String sub = "";
    		
    		if(Math.random()<0.1)
    			sub = generateCompoundSampleAtom();
    		else
    			sub = _Sample_atom[(int) Math.floor(Math.random()*_Sample_atom.length)];

    		int patt_offset = stop-start + 1;
    		
    		mutant = mutant.substring(0, start+offset) + sub + mutant.substring(stop+offset+1,mutant.length());			
    		
    		offset = offset + (sub.length()-patt_offset);
    		
    		break;
    	case MT_INS:
    		break;
    	case MR_DEL:
    		break;
    	}
		
		
	}
	
	private void traversePhenotype(ParseTree node, int child, int depth) {
		//Report what we've found: 
    	System.out.println("node "+child+": depth: "+depth+" type: "+node.getClass().toString()+", text: "+node.getText());
    	String tcl = node.getClass().toString();
		System.out.println("Payload class is "+node.getPayload().getClass().toString());
    	if(tcl.equals("class org.antlr.v4.runtime.tree.TerminalNodeImpl")){
    		System.out.println("Terminal node detected");
    		
    		CommonToken cxt = (CommonToken) node.getPayload();
    		//System.out.println("Payload class is "+node.getPayload().getClass().toString());
    		System.out.println("Token type is "+cxt.getType()+": "+tokenTypeString(cxt.getType()));
    		
    		if(cxt.getType()==SAMPLE)
    			mutateSample(cxt.getStartIndex(), cxt.getStopIndex());
    		
    		    		
    	}
    	else{
    		System.out.println("Rule node detected");		
    		//System.out.println("Payload class is "+node.getPayload().getClass().toString());
    		
    		ParserRuleContext ctx = (ParserRuleContext) node.getPayload();
    		System.out.println("Rule index is "+ctx.getRuleIndex()+": "+ruleNames[ctx.getRuleIndex()]+", info is:"+ctx.toString());
    		
    		if(ctx.getRuleIndex()==RULE_message){
    			/** for now, we'll add a continuous pattern to the end */
    			int mt = getMType();
				switch(mt){
    			case MT_SUB:
					/** At the moment, we switch between adding a contfrag or a transspec - might need to do something more sophisticated...*/
					if(Math.random()<0.5)
						appendContFrag(ctx);
					else
						prependTransSpec(ctx);
					break;
				default://TODO: put insertion and deletion in..
					break;
    			}	
    		}
    		
    	}
    	
    	/** Try to get a number for each level of the grammar */
    	
    	
    	//Keep on traversing: 
	    for(int i=0;i<node.getChildCount();i++){
	    	traversePhenotype(node.getChild(i),i,++depth);
	    }
	}
	


	public String actionOnPattern(String testpattern, String action){
		
		ParseTree tree = null;
		tree = treeFromPattern(testpattern);
		
		
		if((tree)!=null){
			//Now we can do the parse and get the genome out: 
			//Tidal1Parser p;

			pattern = testpattern;
			if(action.equals("push") || action.equals("pull")){
			
				if(action.equals("pull")){
					mutant = testpattern;
					offset = 0;
					
					
					
					System.out.println("Building genome for "+testpattern);
					int offset = 0;
					traversePhenotype(tree,0,0);
					
					System.out.println("Pattern is: "+pattern+"\n"
									 + "Mutant is:  "+mutant);
				
					return mutant;
				}
			}
			return pattern;
			
		}
		else{
			return null;
		}
	}
	
	

	
	//TODO: Once we've understood genomeFromPattern, I'm hoping we can do this!
	public void genomeFromRandom(){
		
		
	}
	
	
	
	
	
}
