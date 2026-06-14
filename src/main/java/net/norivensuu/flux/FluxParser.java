// Generated from C:/Users/AlexN/Projects/IdeaProjects/Flux/src/main/antlr/Flux.g4 by ANTLR 4.13.2
package net.norivensuu.flux;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FluxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, FIGURE_BRACKET_L=98, FIGURE_BRACKET_R=99, 
		FSTRING_OPENING=100, FSTRING_MIDDLE=101, FSTRING_CLOSING=102, NULL=103, 
		CHAR=104, STRING=105, FSTRING_EMPTY=106, INT=107, DECIMAL=108, BOOL=109, 
		WILDCARD=110, VOID=111, VAR=112, ID=113, SYMBOL=114, TERMINATOR=115, WS=116, 
		SL_COMMENT=117, ML_COMMENT=118, INDENT=119, DEDENT=120;
	public static final int
		RULE_program = 0, RULE_precompile = 1, RULE_declaration = 2, RULE_className = 3, 
		RULE_type = 4, RULE_terminator = 5, RULE_accessModifier = 6, RULE_unfinishedMd = 7, 
		RULE_implementationModifier = 8, RULE_staticMd = 9, RULE_finalMd = 10, 
		RULE_transientMd = 11, RULE_volatileMd = 12, RULE_synchronizedMd = 13, 
		RULE_nativeMd = 14, RULE_strictfpMd = 15, RULE_importDecl = 16, RULE_variableModifiers = 17, 
		RULE_localVarDecl = 18, RULE_varDecl = 19, RULE_functionModifiers = 20, 
		RULE_classDecl = 21, RULE_annotation = 22, RULE_functionDecl = 23, RULE_formalParameters = 24, 
		RULE_formalParameter = 25, RULE_classBlock = 26, RULE_voidBlock = 27, 
		RULE_returnBlock = 28, RULE_classLines = 29, RULE_voidLines = 30, RULE_expressionLines = 31, 
		RULE_lines = 32, RULE_block = 33, RULE_expressionReturn = 34, RULE_voidReturn = 35, 
		RULE_statement = 36, RULE_assignmentStat = 37, RULE_generator_for = 38, 
		RULE_fstring = 39, RULE_expression = 40, RULE_expressionList = 41, RULE_expressionDict = 42, 
		RULE_dictElement = 43, RULE_kwargs = 44, RULE_kwarg = 45, RULE_idList = 46, 
		RULE_packedId = 47, RULE_qualifiedId = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "precompile", "declaration", "className", "type", "terminator", 
			"accessModifier", "unfinishedMd", "implementationModifier", "staticMd", 
			"finalMd", "transientMd", "volatileMd", "synchronizedMd", "nativeMd", 
			"strictfpMd", "importDecl", "variableModifiers", "localVarDecl", "varDecl", 
			"functionModifiers", "classDecl", "annotation", "functionDecl", "formalParameters", 
			"formalParameter", "classBlock", "voidBlock", "returnBlock", "classLines", 
			"voidLines", "expressionLines", "lines", "block", "expressionReturn", 
			"voidReturn", "statement", "assignmentStat", "generator_for", "fstring", 
			"expression", "expressionList", "expressionDict", "dictElement", "kwargs", 
			"kwarg", "idList", "packedId", "qualifiedId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'precompile'", "'<'", "'>'", "'[]'", "'public'", "'protected'", 
			"'private'", "'unfinished'", "'illegal'", "'suboptimal'", "'unpolished'", 
			"'ugly'", "'abstract'", "'static'", "'native'", "'final'", "'transient'", 
			"'volatile'", "'synchronized'", "'strictfp'", "'import'", "'using'", 
			"'='", "'class'", "'interface'", "'@interface'", "':'", "'extends'", 
			"'implements'", "'@'", "'('", "')'", "','", "'return'", "'for'", "'foreach'", 
			"'in'", "'if'", "'else if'", "'elif'", "'else'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'&='", "'^='", "'|='", "'<<='", "'>>='", "'>>>='", "'**='", 
			"'***='", "'/%='", "'%/='", "'++'", "'--'", "'f'", "'***'", "'**'", "'['", 
			"']'", "'.'", "'lambda'", "'->'", "'=>'", "':='", "'[['", "']]'", "'!'", 
			"'not'", "'+'", "'-'", "'~'", "'*'", "'/'", "'%'", "'/%'", "'%/'", "'<<'", 
			"'>>'", "'>>>'", "'<='", "'>='", "'instanceof'", "'=='", "'!='", "'&'", 
			"'^'", "'|'", "'&&'", "'and'", "'||'", "'or'", "'?'", "'new'", null, 
			null, null, null, null, null, null, null, null, null, null, null, "'.*'", 
			null, "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "FIGURE_BRACKET_L", "FIGURE_BRACKET_R", "FSTRING_OPENING", 
			"FSTRING_MIDDLE", "FSTRING_CLOSING", "NULL", "CHAR", "STRING", "FSTRING_EMPTY", 
			"INT", "DECIMAL", "BOOL", "WILDCARD", "VOID", "VAR", "ID", "SYMBOL", 
			"TERMINATOR", "WS", "SL_COMMENT", "ML_COMMENT", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Flux.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FluxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FluxParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public PrecompileContext precompile() {
			return getRuleContext(PrecompileContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					declaration();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(104);
				precompile();
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492733576642528L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 19665602981398481L) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(107);
					declaration();
					}
					break;
				case 2:
					{
					setState(108);
					statement();
					}
					break;
				case 3:
					{
					setState(109);
					terminator();
					}
					break;
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrecompileContext extends ParserRuleContext {
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public PrecompileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precompile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterPrecompile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitPrecompile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitPrecompile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecompileContext precompile() throws RecognitionException {
		PrecompileContext _localctx = new PrecompileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_precompile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__0);
			setState(118);
			classBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(120);
					match(INDENT);
					}
				}

				setState(123);
				importDecl();
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(124);
					terminator();
					}
					break;
				}
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(127);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(130);
					match(INDENT);
					}
				}

				setState(133);
				classDecl();
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(134);
					terminator();
					}
					break;
				}
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(137);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(140);
					match(INDENT);
					}
				}

				setState(143);
				functionDecl();
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(144);
					terminator();
					}
					break;
				}
				setState(148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(147);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(150);
					match(INDENT);
					}
				}

				setState(153);
				varDecl();
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(154);
					terminator();
					}
					break;
				}
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(157);
					match(DEDENT);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		return className(0);
	}

	private ClassNameContext className(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassNameContext _localctx = new ClassNameContext(_ctx, _parentState);
		ClassNameContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_className, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			qualifiedId();
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_className);
					setState(165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(166);
					match(T__1);
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(167);
						className(0);
						}
					}

					setState(170);
					match(T__2);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(FluxParser.VAR, 0); }
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(177);
				match(VAR);
				}
				break;
			case ID:
				{
				setState(178);
				qualifiedId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						match(T__3);
						setState(186);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(183);
								match(T__3);
								}
								} 
							}
							setState(188);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						}
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(189);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(190);
						match(T__1);
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==VAR || _la==ID) {
							{
							setState(191);
							type(0);
							}
						}

						setState(194);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminatorContext extends ParserRuleContext {
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
		}
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitTerminator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitTerminator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_terminator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(200);
					match(TERMINATOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnfinishedMdContext extends ParserRuleContext {
		public UnfinishedMdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unfinishedMd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterUnfinishedMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitUnfinishedMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitUnfinishedMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnfinishedMdContext unfinishedMd() throws RecognitionException {
		UnfinishedMdContext _localctx = new UnfinishedMdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unfinishedMd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImplementationModifierContext extends ParserRuleContext {
		public ImplementationModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementationModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterImplementationModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitImplementationModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitImplementationModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementationModifierContext implementationModifier() throws RecognitionException {
		ImplementationModifierContext _localctx = new ImplementationModifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_implementationModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StaticMdContext extends ParserRuleContext {
		public StaticMdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticMd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterStaticMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitStaticMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitStaticMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticMdContext staticMd() throws RecognitionException {
		StaticMdContext _localctx = new StaticMdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_staticMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FinalMdContext extends ParserRuleContext {
		public FinalMdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalMd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFinalMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFinalMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFinalMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalMdContext finalMd() throws RecognitionException {
		FinalMdContext _localctx = new FinalMdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_finalMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransientMdContext extends ParserRuleContext {
		public TransientMdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transientMd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterTransientMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitTransientMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitTransientMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransientMdContext transientMd() throws RecognitionException {
		TransientMdContext _localctx = new TransientMdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_transientMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VolatileMdContext extends ParserRuleContext {
		public VolatileMdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_volatileMd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVolatileMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVolatileMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVolatileMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VolatileMdContext volatileMd() throws RecognitionException {
		VolatileMdContext _localctx = new VolatileMdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_volatileMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__17);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SynchronizedMdContext extends ParserRuleContext {
		public SynchronizedMdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedMd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterSynchronizedMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitSynchronizedMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitSynchronizedMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynchronizedMdContext synchronizedMd() throws RecognitionException {
		SynchronizedMdContext _localctx = new SynchronizedMdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_synchronizedMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NativeMdContext extends ParserRuleContext {
		public NativeMdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nativeMd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterNativeMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitNativeMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitNativeMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NativeMdContext nativeMd() throws RecognitionException {
		NativeMdContext _localctx = new NativeMdContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nativeMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StrictfpMdContext extends ParserRuleContext {
		public StrictfpMdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictfpMd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterStrictfpMd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitStrictfpMd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitStrictfpMd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictfpMdContext strictfpMd() throws RecognitionException {
		StrictfpMdContext _localctx = new StrictfpMdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_strictfpMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclContext extends ParserRuleContext {
		public Token wildcard;
		public Token static_;
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(FluxParser.WILDCARD, 0); }
		public ImportDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterImportDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitImportDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitImportDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclContext importDecl() throws RecognitionException {
		ImportDeclContext _localctx = new ImportDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_importDecl);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				qualifiedId();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(227);
					((ImportDeclContext)_localctx).wildcard = match(WILDCARD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				((ImportDeclContext)_localctx).static_ = match(T__13);
				setState(232);
				qualifiedId();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(233);
					((ImportDeclContext)_localctx).wildcard = match(WILDCARD);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableModifiersContext extends ParserRuleContext {
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public UnfinishedMdContext unfinishedMd() {
			return getRuleContext(UnfinishedMdContext.class,0);
		}
		public StaticMdContext staticMd() {
			return getRuleContext(StaticMdContext.class,0);
		}
		public FinalMdContext finalMd() {
			return getRuleContext(FinalMdContext.class,0);
		}
		public TransientMdContext transientMd() {
			return getRuleContext(TransientMdContext.class,0);
		}
		public VolatileMdContext volatileMd() {
			return getRuleContext(VolatileMdContext.class,0);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVariableModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVariableModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVariableModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
				{
				setState(238);
				accessModifier();
				}
			}

			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(241);
				unfinishedMd();
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(244);
				staticMd();
				}
			}

			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(247);
				finalMd();
				}
			}

			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(250);
				transientMd();
				}
			}

			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(253);
				volatileMd();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVarDeclContext extends ParserRuleContext {
		public LocalVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDecl; }
	 
		public LocalVarDeclContext() { }
		public void copyFrom(LocalVarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LooselyTypedLocalVarContext extends LocalVarDeclContext {
		public PackedIdContext packedId() {
			return getRuleContext(PackedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(FluxParser.VAR, 0); }
		public LooselyTypedLocalVarContext(LocalVarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterLooselyTypedLocalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitLooselyTypedLocalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitLooselyTypedLocalVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrictlyTypedLocalVarContext extends LocalVarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PackedIdContext packedId() {
			return getRuleContext(PackedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StrictlyTypedLocalVarContext(LocalVarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterStrictlyTypedLocalVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitStrictlyTypedLocalVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitStrictlyTypedLocalVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarDeclContext localVarDecl() throws RecognitionException {
		LocalVarDeclContext _localctx = new LocalVarDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_localVarDecl);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new LooselyTypedLocalVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(256);
					match(VAR);
					}
				}

				setState(259);
				packedId();
				setState(260);
				match(T__22);
				setState(261);
				expression(0);
				}
				break;
			case 2:
				_localctx = new StrictlyTypedLocalVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				type(0);
				setState(264);
				packedId();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(265);
					match(T__22);
					setState(266);
					expression(0);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public LocalVarDeclContext localVarDecl() {
			return getRuleContext(LocalVarDeclContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			variableModifiers();
			setState(272);
			localVarDecl();
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(273);
				terminator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionModifiersContext extends ParserRuleContext {
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public UnfinishedMdContext unfinishedMd() {
			return getRuleContext(UnfinishedMdContext.class,0);
		}
		public ImplementationModifierContext implementationModifier() {
			return getRuleContext(ImplementationModifierContext.class,0);
		}
		public FinalMdContext finalMd() {
			return getRuleContext(FinalMdContext.class,0);
		}
		public TransientMdContext transientMd() {
			return getRuleContext(TransientMdContext.class,0);
		}
		public VolatileMdContext volatileMd() {
			return getRuleContext(VolatileMdContext.class,0);
		}
		public SynchronizedMdContext synchronizedMd() {
			return getRuleContext(SynchronizedMdContext.class,0);
		}
		public NativeMdContext nativeMd() {
			return getRuleContext(NativeMdContext.class,0);
		}
		public StrictfpMdContext strictfpMd() {
			return getRuleContext(StrictfpMdContext.class,0);
		}
		public FunctionModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFunctionModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFunctionModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFunctionModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionModifiersContext functionModifiers() throws RecognitionException {
		FunctionModifiersContext _localctx = new FunctionModifiersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) {
				{
				setState(276);
				accessModifier();
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7936L) != 0)) {
				{
				setState(279);
				unfinishedMd();
				}
			}

			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(282);
				implementationModifier();
				}
				break;
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(285);
				finalMd();
				}
			}

			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(288);
				transientMd();
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(291);
				volatileMd();
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(294);
				synchronizedMd();
				}
			}

			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(297);
				nativeMd();
				}
			}

			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(300);
				strictfpMd();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclContext extends ParserRuleContext {
		public Token classWord;
		public ClassNameContext mainClass;
		public ClassNameContext extendsClass;
		public ClassNameContext implementsClass;
		public FunctionModifiersContext functionModifiers() {
			return getRuleContext(FunctionModifiersContext.class,0);
		}
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(303);
				annotation();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			functionModifiers();
			setState(310);
			((ClassDeclContext)_localctx).classWord = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
				((ClassDeclContext)_localctx).classWord = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(311);
			((ClassDeclContext)_localctx).mainClass = className(0);
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(312);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__27) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				((ClassDeclContext)_localctx).extendsClass = className(0);
				}
				break;
			}
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(317);
				((ClassDeclContext)_localctx).implementsClass = className(0);
				}
				break;
			}
			setState(320);
			classBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__29);
			setState(323);
			expression(0);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(324);
				match(T__30);
				setState(325);
				expressionList();
				setState(326);
				match(T__31);
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERMINATOR) {
				{
				setState(330);
				terminator();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
	 
		public FunctionDeclContext() { }
		public void copyFrom(FunctionDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RunnableFunctionDeclContext extends FunctionDeclContext {
		public FunctionModifiersContext functionModifiers() {
			return getRuleContext(FunctionModifiersContext.class,0);
		}
		public TerminalNode VOID() { return getToken(FluxParser.VOID, 0); }
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public VoidBlockContext voidBlock() {
			return getRuleContext(VoidBlockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public RunnableFunctionDeclContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterRunnableFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitRunnableFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitRunnableFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarFunctionDeclContext extends FunctionDeclContext {
		public FunctionModifiersContext functionModifiers() {
			return getRuleContext(FunctionModifiersContext.class,0);
		}
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode VAR() { return getToken(FluxParser.VAR, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public VarFunctionDeclContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVarFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVarFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVarFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConsumerFunctionDeclContext extends FunctionDeclContext {
		public FunctionModifiersContext functionModifiers() {
			return getRuleContext(FunctionModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public ConsumerFunctionDeclContext(FunctionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterConsumerFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitConsumerFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitConsumerFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionDecl);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new RunnableFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(333);
					annotation();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
				functionModifiers();
				setState(340);
				match(VOID);
				setState(341);
				match(ID);
				setState(342);
				match(T__30);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29 || _la==VAR || _la==ID) {
					{
					setState(343);
					formalParameters();
					}
				}

				setState(346);
				match(T__31);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TERMINATOR) {
					{
					setState(347);
					terminator();
					}
				}

				setState(350);
				voidBlock();
				}
				break;
			case 2:
				_localctx = new VarFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(352);
					annotation();
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				functionModifiers();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(359);
					match(VAR);
					}
				}

				setState(362);
				match(ID);
				setState(363);
				match(T__30);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29 || _la==VAR || _la==ID) {
					{
					setState(364);
					formalParameters();
					}
				}

				setState(367);
				match(T__31);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TERMINATOR) {
					{
					setState(368);
					terminator();
					}
				}

				setState(371);
				returnBlock();
				}
				break;
			case 3:
				_localctx = new ConsumerFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(373);
					annotation();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(379);
				functionModifiers();
				setState(380);
				type(0);
				setState(381);
				match(ID);
				setState(382);
				match(T__30);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29 || _la==VAR || _la==ID) {
					{
					setState(383);
					formalParameters();
					}
				}

				setState(386);
				match(T__31);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TERMINATOR) {
					{
					setState(387);
					terminator();
					}
				}

				setState(390);
				returnBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			formalParameter();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(395);
				match(T__32);
				setState(396);
				formalParameter();
				}
				}
				setState(401);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public PackedIdContext packedId() {
			return getRuleContext(PackedIdContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_formalParameter);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(402);
					annotation();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(408);
					type(0);
					}
					break;
				}
				setState(411);
				packedId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(412);
					annotation();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
				packedId();
				setState(419);
				match(T__26);
				setState(420);
				type(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBlockContext extends ParserRuleContext {
		public TerminalNode FIGURE_BRACKET_L() { return getToken(FluxParser.FIGURE_BRACKET_L, 0); }
		public ClassLinesContext classLines() {
			return getRuleContext(ClassLinesContext.class,0);
		}
		public TerminalNode FIGURE_BRACKET_R() { return getToken(FluxParser.FIGURE_BRACKET_R, 0); }
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public ClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterClassBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitClassBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitClassBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_classBlock);
		int _la;
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIGURE_BRACKET_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(FIGURE_BRACKET_L);
				setState(426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(425);
					match(INDENT);
					}
					break;
				}
				setState(428);
				classLines();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(429);
					match(DEDENT);
					}
				}

				setState(432);
				match(FIGURE_BRACKET_R);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(T__26);
				setState(435);
				match(INDENT);
				setState(436);
				classLines();
				setState(437);
				match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VoidBlockContext extends ParserRuleContext {
		public TerminalNode FIGURE_BRACKET_L() { return getToken(FluxParser.FIGURE_BRACKET_L, 0); }
		public VoidLinesContext voidLines() {
			return getRuleContext(VoidLinesContext.class,0);
		}
		public TerminalNode FIGURE_BRACKET_R() { return getToken(FluxParser.FIGURE_BRACKET_R, 0); }
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public VoidBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVoidBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVoidBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVoidBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidBlockContext voidBlock() throws RecognitionException {
		VoidBlockContext _localctx = new VoidBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_voidBlock);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIGURE_BRACKET_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				match(FIGURE_BRACKET_L);
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(442);
					match(INDENT);
					}
					break;
				}
				setState(445);
				voidLines();
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(446);
					match(DEDENT);
					}
				}

				setState(449);
				match(FIGURE_BRACKET_R);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(T__26);
				setState(452);
				match(INDENT);
				setState(453);
				voidLines();
				setState(454);
				match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnBlockContext extends ParserRuleContext {
		public TerminalNode FIGURE_BRACKET_L() { return getToken(FluxParser.FIGURE_BRACKET_L, 0); }
		public ExpressionLinesContext expressionLines() {
			return getRuleContext(ExpressionLinesContext.class,0);
		}
		public TerminalNode FIGURE_BRACKET_R() { return getToken(FluxParser.FIGURE_BRACKET_R, 0); }
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public ReturnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterReturnBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitReturnBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitReturnBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBlockContext returnBlock() throws RecognitionException {
		ReturnBlockContext _localctx = new ReturnBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnBlock);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIGURE_BRACKET_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(FIGURE_BRACKET_L);
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(459);
					match(INDENT);
					}
					break;
				}
				setState(462);
				expressionLines();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(463);
					match(DEDENT);
					}
				}

				setState(466);
				match(FIGURE_BRACKET_R);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(T__26);
				setState(469);
				match(INDENT);
				setState(470);
				expressionLines();
				setState(471);
				match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassLinesContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public ClassLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classLines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterClassLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitClassLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitClassLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassLinesContext classLines() throws RecognitionException {
		ClassLinesContext _localctx = new ClassLinesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492733576642528L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 19665602981398481L) != 0)) {
				{
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(475);
					declaration();
					}
					break;
				case 2:
					{
					setState(476);
					statement();
					}
					break;
				case 3:
					{
					setState(477);
					terminator();
					}
					break;
				}
				}
				setState(482);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VoidLinesContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VoidReturnContext> voidReturn() {
			return getRuleContexts(VoidReturnContext.class);
		}
		public VoidReturnContext voidReturn(int i) {
			return getRuleContext(VoidReturnContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public VoidLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidLines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVoidLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVoidLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVoidLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidLinesContext voidLines() throws RecognitionException {
		VoidLinesContext _localctx = new VoidLinesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_voidLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492733452910560L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 19665602981398481L) != 0)) {
				{
				setState(486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(483);
					statement();
					}
					break;
				case 2:
					{
					setState(484);
					voidReturn();
					}
					break;
				case 3:
					{
					setState(485);
					terminator();
					}
					break;
				}
				}
				setState(490);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionLinesContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionReturnContext> expressionReturn() {
			return getRuleContexts(ExpressionReturnContext.class);
		}
		public ExpressionReturnContext expressionReturn(int i) {
			return getRuleContext(ExpressionReturnContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public ExpressionLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionLines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterExpressionLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitExpressionLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitExpressionLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionLinesContext expressionLines() throws RecognitionException {
		ExpressionLinesContext _localctx = new ExpressionLinesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492733452910560L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 19665602981398481L) != 0)) {
				{
				setState(494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(491);
					statement();
					}
					break;
				case 2:
					{
					setState(492);
					expressionReturn();
					}
					break;
				case 3:
					{
					setState(493);
					terminator();
					}
					break;
				}
				}
				setState(498);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinesContext extends ParserRuleContext {
		public VoidLinesContext voidLines() {
			return getRuleContext(VoidLinesContext.class,0);
		}
		public ClassLinesContext classLines() {
			return getRuleContext(ClassLinesContext.class,0);
		}
		public ExpressionLinesContext expressionLines() {
			return getRuleContext(ExpressionLinesContext.class,0);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lines);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				voidLines();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				classLines();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				expressionLines();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidBlockOptionContext extends BlockContext {
		public VoidBlockContext voidBlock() {
			return getRuleContext(VoidBlockContext.class,0);
		}
		public VoidBlockOptionContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVoidBlockOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVoidBlockOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVoidBlockOption(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnBlockOptionContext extends BlockContext {
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public ReturnBlockOptionContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterReturnBlockOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitReturnBlockOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitReturnBlockOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new VoidBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				voidBlock();
				}
				break;
			case 2:
				_localctx = new ReturnBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				returnBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionReturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public ExpressionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterExpressionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitExpressionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitExpressionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionReturnContext expressionReturn() throws RecognitionException {
		ExpressionReturnContext _localctx = new ExpressionReturnContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(T__33);
			setState(509);
			expression(0);
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(510);
				terminator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VoidReturnContext extends ParserRuleContext {
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public VoidReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVoidReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVoidReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVoidReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidReturnContext voidReturn() throws RecognitionException {
		VoidReturnContext _localctx = new VoidReturnContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_voidReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(T__33);
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(514);
				terminator();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionReturnStatementContext extends StatementContext {
		public ExpressionReturnContext expressionReturn() {
			return getRuleContext(ExpressionReturnContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public ExpressionReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterExpressionReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitExpressionReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitExpressionReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends StatementContext {
		public BlockContext else_;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentStatContext assignmentStat() {
			return getRuleContext(AssignmentStatContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidReturnStatementContext extends StatementContext {
		public VoidReturnContext voidReturn() {
			return getRuleContext(VoidReturnContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public VoidReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVoidReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVoidReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVoidReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidBlockStatementContext extends StatementContext {
		public VoidBlockContext voidBlock() {
			return getRuleContext(VoidBlockContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public VoidBlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVoidBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVoidBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVoidBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends StatementContext {
		public LocalVarDeclContext localVarDecl() {
			return getRuleContext(LocalVarDeclContext.class,0);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatContext assignmentStat() {
			return getRuleContext(AssignmentStatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclStatementContext extends StatementContext {
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public FunctionDeclStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFunctionDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFunctionDeclStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFunctionDeclStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForeachStatementContext extends StatementContext {
		public PackedIdContext packedId() {
			return getRuleContext(PackedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public ForeachStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterForeachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitForeachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitForeachStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclStatementContext extends StatementContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public VarDeclStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVarDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVarDeclStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVarDeclStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_statement);
		int _la;
		try {
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(517);
					match(INDENT);
					}
				}

				setState(520);
				functionDecl();
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(521);
					terminator();
					}
					break;
				}
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(524);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new VoidBlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(527);
					match(INDENT);
					}
				}

				setState(530);
				voidBlock();
				setState(532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(531);
					terminator();
					}
					break;
				}
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(534);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(537);
					match(INDENT);
					}
				}

				setState(540);
				match(T__34);
				setState(541);
				match(T__30);
				setState(542);
				localVarDecl();
				setState(543);
				terminator();
				setState(544);
				expression(0);
				setState(545);
				terminator();
				setState(546);
				assignmentStat();
				setState(547);
				match(T__31);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(548);
					match(DEDENT);
					}
				}

				setState(551);
				block();
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(553);
					match(INDENT);
					}
				}

				setState(556);
				match(T__34);
				setState(557);
				localVarDecl();
				setState(558);
				terminator();
				setState(559);
				expression(0);
				setState(560);
				terminator();
				setState(561);
				assignmentStat();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(562);
					match(DEDENT);
					}
				}

				setState(565);
				block();
				}
				break;
			case 5:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(567);
					match(INDENT);
					}
				}

				setState(570);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==T__35) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(571);
				match(T__30);
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(572);
					type(0);
					}
					break;
				}
				setState(575);
				packedId();
				setState(576);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(577);
				expression(0);
				setState(578);
				match(T__31);
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(579);
					match(DEDENT);
					}
				}

				setState(582);
				block();
				}
				break;
			case 6:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(584);
					match(INDENT);
					}
				}

				setState(587);
				_la = _input.LA(1);
				if ( !(_la==T__34 || _la==T__35) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(588);
					type(0);
					}
					break;
				}
				setState(591);
				packedId();
				setState(592);
				_la = _input.LA(1);
				if ( !(_la==T__26 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(593);
				expression(0);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(594);
					match(DEDENT);
					}
				}

				setState(597);
				block();
				}
				break;
			case 7:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(599);
					match(INDENT);
					}
				}

				setState(602);
				match(T__37);
				setState(603);
				expression(0);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(604);
					match(DEDENT);
					}
				}

				setState(607);
				block();
				setState(609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(608);
					terminator();
					}
					break;
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38 || _la==T__39) {
					{
					{
					setState(611);
					_la = _input.LA(1);
					if ( !(_la==T__38 || _la==T__39) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(612);
					expression(0);
					setState(613);
					block();
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(620);
					terminator();
					}
					break;
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(623);
					match(T__40);
					setState(624);
					((IfStatementContext)_localctx).else_ = block();
					}
				}

				}
				break;
			case 8:
				_localctx = new VarDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(627);
					match(INDENT);
					}
				}

				setState(630);
				varDecl();
				setState(632);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(631);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(634);
					match(INDENT);
					}
				}

				setState(637);
				assignmentStat();
				setState(639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(638);
					terminator();
					}
					break;
				}
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(641);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(644);
					match(INDENT);
					}
				}

				setState(647);
				expression(0);
				setState(649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(648);
					terminator();
					}
					break;
				}
				setState(652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(651);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new ExpressionReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(654);
					match(INDENT);
					}
				}

				setState(657);
				expressionReturn();
				setState(659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(658);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 12:
				_localctx = new VoidReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(661);
					match(INDENT);
					}
				}

				setState(664);
				voidReturn();
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(665);
					match(DEDENT);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatContext extends ParserRuleContext {
		public AssignmentStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStat; }
	 
		public AssignmentStatContext() { }
		public void copyFrom(AssignmentStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CeilDivAssigmnentContext extends AssignmentStatContext {
		public Token operator;
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CeilDivAssigmnentContext(AssignmentStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterCeilDivAssigmnent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitCeilDivAssigmnent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitCeilDivAssigmnent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TetrAssigmnentContext extends AssignmentStatContext {
		public Token operator;
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TetrAssigmnentContext(AssignmentStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterTetrAssigmnent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitTetrAssigmnent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitTetrAssigmnent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloorDivAssigmnentContext extends AssignmentStatContext {
		public Token operator;
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FloorDivAssigmnentContext(AssignmentStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFloorDivAssigmnent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFloorDivAssigmnent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFloorDivAssigmnent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultAssigmnentContext extends AssignmentStatContext {
		public Token operator;
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultAssigmnentContext(AssignmentStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterDefaultAssigmnent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitDefaultAssigmnent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitDefaultAssigmnent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryAssigmnentContext extends AssignmentStatContext {
		public Token operator;
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public UnaryAssigmnentContext(AssignmentStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterUnaryAssigmnent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitUnaryAssigmnent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitUnaryAssigmnent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpAssigmnentContext extends AssignmentStatContext {
		public Token operator;
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpAssigmnentContext(AssignmentStatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterExpAssigmnent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitExpAssigmnent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitExpAssigmnent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatContext assignmentStat() throws RecognitionException {
		AssignmentStatContext _localctx = new AssignmentStatContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assignmentStat);
		int _la;
		try {
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new DefaultAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				qualifiedId();
				setState(671);
				((DefaultAssigmnentContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9002801216618496L) != 0)) ) {
					((DefaultAssigmnentContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(672);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ExpAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				qualifiedId();
				setState(675);
				((ExpAssigmnentContext)_localctx).operator = match(T__52);
				setState(676);
				expression(0);
				}
				break;
			case 3:
				_localctx = new TetrAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				qualifiedId();
				setState(679);
				((TetrAssigmnentContext)_localctx).operator = match(T__53);
				setState(680);
				expression(0);
				}
				break;
			case 4:
				_localctx = new FloorDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(682);
				qualifiedId();
				setState(683);
				((FloorDivAssigmnentContext)_localctx).operator = match(T__54);
				setState(684);
				expression(0);
				}
				break;
			case 5:
				_localctx = new CeilDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(686);
				qualifiedId();
				setState(687);
				((CeilDivAssigmnentContext)_localctx).operator = match(T__55);
				setState(688);
				expression(0);
				}
				break;
			case 6:
				_localctx = new UnaryAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(690);
				qualifiedId();
				setState(691);
				((UnaryAssigmnentContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__56 || _la==T__57) ) {
					((UnaryAssigmnentContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Generator_forContext extends ParserRuleContext {
		public PackedIdContext iterId;
		public ExpressionContext collection;
		public PackedIdContext packedId() {
			return getRuleContext(PackedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Generator_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generator_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterGenerator_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitGenerator_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitGenerator_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generator_forContext generator_for() throws RecognitionException {
		Generator_forContext _localctx = new Generator_forContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_generator_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(T__34);
			setState(696);
			((Generator_forContext)_localctx).iterId = packedId();
			setState(697);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(698);
			((Generator_forContext)_localctx).collection = expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FstringContext extends ParserRuleContext {
		public TerminalNode FSTRING_OPENING() { return getToken(FluxParser.FSTRING_OPENING, 0); }
		public TerminalNode FSTRING_CLOSING() { return getToken(FluxParser.FSTRING_CLOSING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> FSTRING_MIDDLE() { return getTokens(FluxParser.FSTRING_MIDDLE); }
		public TerminalNode FSTRING_MIDDLE(int i) {
			return getToken(FluxParser.FSTRING_MIDDLE, i);
		}
		public FstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringContext fstring() throws RecognitionException {
		FstringContext _localctx = new FstringContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fstring);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(T__58);
			setState(701);
			match(FSTRING_OPENING);
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(702);
				expression(0);
				}
				break;
			}
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(708);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(705);
							match(FSTRING_MIDDLE);
							}
							} 
						}
						setState(710);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					}
					setState(711);
					expression(0);
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			setState(717);
			match(FSTRING_CLOSING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(FluxParser.BOOL, 0); }
		public BoolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(FluxParser.STRING, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseANDExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitwiseANDExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterBitwiseANDExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitBitwiseANDExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitBitwiseANDExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExprContext extends ExpressionContext {
		public Token operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterExpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitExpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitExpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalORExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalORExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterLogicalORExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitLogicalORExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitLogicalORExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullExprContext extends ExpressionContext {
		public TerminalNode NULL() { return getToken(FluxParser.NULL, 0); }
		public NullExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterNullExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitNullExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitNullExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExprContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorExprContext extends ExpressionContext {
		public BlockContext blk;
		public ExpressionContext filter;
		public ExpressionContext item;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Generator_forContext> generator_for() {
			return getRuleContexts(Generator_forContext.class);
		}
		public Generator_forContext generator_for(int i) {
			return getRuleContext(Generator_forContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GeneratorExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterGeneratorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitGeneratorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitGeneratorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ExpressionContext {
		public Token operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetExprContext extends ExpressionContext {
		public TerminalNode FIGURE_BRACKET_L() { return getToken(FluxParser.FIGURE_BRACKET_L, 0); }
		public TerminalNode FIGURE_BRACKET_R() { return getToken(FluxParser.FIGURE_BRACKET_R, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public SetExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloorDivExprContext extends ExpressionContext {
		public Token operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FloorDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFloorDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFloorDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFloorDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastExprContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitCastExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitCastExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CeilDivExprContext extends ExpressionContext {
		public Token operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CeilDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterCeilDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitCeilDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitCeilDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreationExprContext extends ExpressionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CreationExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterCreationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitCreationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitCreationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictExprContext extends ExpressionContext {
		public TerminalNode FIGURE_BRACKET_L() { return getToken(FluxParser.FIGURE_BRACKET_L, 0); }
		public TerminalNode FIGURE_BRACKET_R() { return getToken(FluxParser.FIGURE_BRACKET_R, 0); }
		public ExpressionDictContext expressionDict() {
			return getRuleContext(ExpressionDictContext.class,0);
		}
		public DictExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterDictExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitDictExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitDictExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseXORExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitwiseXORExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterBitwiseXORExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitBitwiseXORExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitBitwiseXORExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExprContext extends ExpressionContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ListExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FStringExprContext extends ExpressionContext {
		public FstringContext fstring() {
			return getRuleContext(FstringContext.class,0);
		}
		public FStringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExprContext extends ExpressionContext {
		public Token operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ShiftExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterShiftExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitShiftExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitShiftExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExprContext extends ExpressionContext {
		public ExpressionContext condition;
		public ExpressionContext true_;
		public ExpressionContext false_;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TernaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterTernaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitTernaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitTernaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAccessExprContext extends ExpressionContext {
		public ExpressionContext acc;
		public ExpressionContext variable;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVariableAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVariableAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVariableAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseORExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BitwiseORExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterBitwiseORExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitBitwiseORExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitBitwiseORExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExpressionContext {
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WalrusExprContext extends ExpressionContext {
		public Token operator;
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WalrusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterWalrusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitWalrusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitWalrusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExprContext extends ExpressionContext {
		public ExpressionContext collection;
		public ExpressionContext element;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAccessExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterArrayAccessExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitArrayAccessExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitArrayAccessExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public LambdaExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExpressionContext {
		public Token operator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalExprContext extends ExpressionContext {
		public TerminalNode DECIMAL() { return getToken(FluxParser.DECIMAL, 0); }
		public DecimalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterDecimalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitDecimalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitDecimalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleExprContext extends ExpressionContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TupleExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitTupleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitTupleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharExprContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(FluxParser.CHAR, 0); }
		public CharExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterCharExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitCharExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitCharExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends ExpressionContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public KwargsContext kwargs() {
			return getRuleContext(KwargsContext.class,0);
		}
		public FunctionCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExpressionContext {
		public Token operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalANDExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalANDExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterLogicalANDExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitLogicalANDExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitLogicalANDExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TetrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TetrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterTetrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitTetrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitTetrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitParenthesizedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitParenthesizedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntExprContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(FluxParser.INT, 0); }
		public IntExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExpressionContext {
		public Token operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(720);
				match(T__64);
				{
				setState(721);
				idList();
				}
				setState(722);
				match(T__26);
				setState(723);
				expression(40);
				}
				break;
			case 2:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(725);
				match(T__30);
				{
				setState(726);
				idList();
				}
				setState(727);
				match(T__31);
				setState(728);
				_la = _input.LA(1);
				if ( !(_la==T__65 || _la==T__66) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(729);
				expression(39);
				}
				break;
			case 3:
				{
				_localctx = new WalrusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(731);
				qualifiedId();
				setState(732);
				((WalrusExprContext)_localctx).operator = match(T__67);
				setState(733);
				expression(38);
				}
				break;
			case 4:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(735);
				match(T__30);
				setState(736);
				type(0);
				setState(737);
				match(T__31);
				setState(738);
				expression(37);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(740);
				match(T__30);
				setState(741);
				expression(0);
				setState(742);
				match(T__31);
				}
				break;
			case 6:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(744);
				match(T__68);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492337105862656L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 314198332540881L) != 0)) {
					{
					setState(745);
					expressionList();
					}
				}

				setState(748);
				match(T__69);
				}
				break;
			case 7:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(749);
				match(T__61);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492337105862656L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 314198332540881L) != 0)) {
					{
					setState(750);
					expressionList();
					}
				}

				setState(753);
				match(T__62);
				}
				break;
			case 8:
				{
				_localctx = new SetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(754);
				match(FIGURE_BRACKET_L);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492337105862656L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 314198332540881L) != 0)) {
					{
					setState(755);
					expressionList();
					}
				}

				setState(758);
				match(FIGURE_BRACKET_R);
				}
				break;
			case 9:
				{
				_localctx = new TupleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(759);
				match(T__30);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492337105862656L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 314198332540881L) != 0)) {
					{
					setState(760);
					expressionList();
					}
				}

				setState(763);
				match(T__31);
				}
				break;
			case 10:
				{
				_localctx = new DictExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(764);
				match(FIGURE_BRACKET_L);
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492337105862656L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 314198332540881L) != 0)) {
					{
					setState(765);
					expressionDict();
					}
				}

				setState(768);
				match(FIGURE_BRACKET_R);
				}
				break;
			case 11:
				{
				_localctx = new GeneratorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(769);
				match(T__61);
				setState(770);
				((GeneratorExprContext)_localctx).blk = block();
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__34) {
					{
					{
					setState(771);
					generator_for();
					}
					}
					setState(776);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(777);
					match(T__37);
					setState(778);
					((GeneratorExprContext)_localctx).filter = expression(0);
					}
				}

				setState(781);
				match(T__62);
				}
				break;
			case 12:
				{
				_localctx = new GeneratorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(783);
				match(T__61);
				setState(784);
				((GeneratorExprContext)_localctx).item = expression(0);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__34) {
					{
					{
					setState(785);
					generator_for();
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(791);
					match(T__37);
					setState(792);
					((GeneratorExprContext)_localctx).filter = expression(0);
					}
				}

				setState(795);
				match(T__62);
				}
				break;
			case 13:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(804);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__70:
					{
					setState(797);
					match(T__70);
					setState(798);
					expression(0);
					}
					break;
				case T__71:
					{
					setState(799);
					match(T__71);
					setState(800);
					match(T__30);
					setState(801);
					expression(0);
					setState(802);
					match(T__31);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 14:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(806);
				((UnaryExprContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 458755L) != 0)) ) {
					((UnaryExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(807);
				expression(26);
				}
				break;
			case 15:
				{
				_localctx = new CreationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(808);
				match(T__96);
				setState(809);
				type(0);
				setState(810);
				match(T__30);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492337105862656L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 314198332540881L) != 0)) {
					{
					setState(811);
					expressionList();
					}
				}

				setState(814);
				match(T__31);
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(815);
					block();
					}
					break;
				}
				}
				break;
			case 16:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(818);
				match(ID);
				setState(819);
				match(T__30);
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5620492337105862656L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 314198332540881L) != 0)) {
					{
					setState(820);
					kwargs();
					}
				}

				setState(823);
				match(T__31);
				}
				break;
			case 17:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(824);
				qualifiedId();
				}
				break;
			case 18:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(825);
				match(INT);
				}
				break;
			case 19:
				{
				_localctx = new DecimalExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(826);
				match(DECIMAL);
				}
				break;
			case 20:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(827);
				match(BOOL);
				}
				break;
			case 21:
				{
				_localctx = new FStringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(828);
				fstring();
				}
				break;
			case 22:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(829);
				match(STRING);
				}
				break;
			case 23:
				{
				_localctx = new CharExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(830);
				match(CHAR);
				}
				break;
			case 24:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(831);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(901);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
					case 1:
						{
						_localctx = new TetrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(834);
						if (!(precpred(_ctx, 44))) throw new FailedPredicateException(this, "precpred(_ctx, 44)");
						setState(835);
						match(T__59);
						setState(836);
						expression(44);
						}
						break;
					case 2:
						{
						_localctx = new ExpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(837);
						if (!(precpred(_ctx, 43))) throw new FailedPredicateException(this, "precpred(_ctx, 43)");
						setState(838);
						match(T__60);
						setState(839);
						expression(43);
						}
						break;
					case 3:
						{
						_localctx = new VariableAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						((VariableAccessExprContext)_localctx).acc = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(840);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(841);
						match(T__63);
						setState(842);
						((VariableAccessExprContext)_localctx).variable = expression(42);
						}
						break;
					case 4:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(843);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(844);
						((MulDivExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 7L) != 0)) ) {
							((MulDivExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(845);
						expression(26);
						}
						break;
					case 5:
						{
						_localctx = new FloorDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(846);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(847);
						((FloorDivExprContext)_localctx).operator = match(T__78);
						setState(848);
						expression(25);
						}
						break;
					case 6:
						{
						_localctx = new CeilDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(849);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(850);
						((CeilDivExprContext)_localctx).operator = match(T__79);
						setState(851);
						expression(24);
						}
						break;
					case 7:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(852);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(853);
						((AddSubExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__72 || _la==T__73) ) {
							((AddSubExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(854);
						expression(23);
						}
						break;
					case 8:
						{
						_localctx = new ShiftExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(855);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(856);
						((ShiftExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 7L) != 0)) ) {
							((ShiftExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(857);
						expression(22);
						}
						break;
					case 9:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(858);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(859);
						((RelationalExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__2 || _la==T__83 || _la==T__84) ) {
							((RelationalExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(860);
						expression(21);
						}
						break;
					case 10:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(861);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(862);
						((RelationalExprContext)_localctx).operator = match(T__85);
						setState(863);
						expression(20);
						}
						break;
					case 11:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(864);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(865);
						((EqualityExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__86 || _la==T__87) ) {
							((EqualityExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(866);
						expression(19);
						}
						break;
					case 12:
						{
						_localctx = new BitwiseANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(867);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(868);
						match(T__88);
						setState(869);
						expression(18);
						}
						break;
					case 13:
						{
						_localctx = new BitwiseXORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(870);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(871);
						match(T__89);
						setState(872);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new BitwiseORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(873);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(874);
						match(T__90);
						setState(875);
						expression(16);
						}
						break;
					case 15:
						{
						_localctx = new LogicalANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(876);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(877);
						_la = _input.LA(1);
						if ( !(_la==T__91 || _la==T__92) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(878);
						expression(15);
						}
						break;
					case 16:
						{
						_localctx = new LogicalORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(879);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(880);
						_la = _input.LA(1);
						if ( !(_la==T__93 || _la==T__94) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(881);
						expression(14);
						}
						break;
					case 17:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(882);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(883);
						match(T__95);
						setState(884);
						((TernaryExprContext)_localctx).true_ = expression(0);
						setState(885);
						match(T__26);
						setState(886);
						((TernaryExprContext)_localctx).false_ = expression(13);
						}
						break;
					case 18:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).true_ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(888);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(889);
						match(T__37);
						setState(890);
						((TernaryExprContext)_localctx).condition = expression(0);
						setState(891);
						match(T__40);
						setState(892);
						((TernaryExprContext)_localctx).false_ = expression(12);
						}
						break;
					case 19:
						{
						_localctx = new ArrayAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayAccessExprContext)_localctx).collection = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(894);
						if (!(precpred(_ctx, 42))) throw new FailedPredicateException(this, "precpred(_ctx, 42)");
						setState(895);
						match(T__61);
						setState(896);
						((ArrayAccessExprContext)_localctx).element = expression(0);
						setState(897);
						match(T__62);
						}
						break;
					case 20:
						{
						_localctx = new PostfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(899);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(900);
						((PostfixExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__56 || _la==T__57) ) {
							((PostfixExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			expression(0);
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(907);
				match(T__32);
				setState(908);
				expression(0);
				}
				}
				setState(913);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionDictContext extends ParserRuleContext {
		public List<DictElementContext> dictElement() {
			return getRuleContexts(DictElementContext.class);
		}
		public DictElementContext dictElement(int i) {
			return getRuleContext(DictElementContext.class,i);
		}
		public ExpressionDictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionDict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterExpressionDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitExpressionDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitExpressionDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionDictContext expressionDict() throws RecognitionException {
		ExpressionDictContext _localctx = new ExpressionDictContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressionDict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			dictElement();
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(915);
				match(T__32);
				setState(916);
				dictElement();
				}
				}
				setState(921);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DictElementContext extends ParserRuleContext {
		public ExpressionContext key;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DictElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterDictElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitDictElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitDictElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictElementContext dictElement() throws RecognitionException {
		DictElementContext _localctx = new DictElementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_dictElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			((DictElementContext)_localctx).key = expression(0);
			setState(923);
			match(T__26);
			setState(924);
			((DictElementContext)_localctx).value = expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KwargsContext extends ParserRuleContext {
		public List<KwargContext> kwarg() {
			return getRuleContexts(KwargContext.class);
		}
		public KwargContext kwarg(int i) {
			return getRuleContext(KwargContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public KwargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterKwargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitKwargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitKwargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwargsContext kwargs() throws RecognitionException {
		KwargsContext _localctx = new KwargsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_kwargs);
		int _la;
		try {
			int _alt;
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				kwarg();
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(927);
					match(T__32);
					setState(928);
					kwarg();
					}
					}
					setState(933);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				expression(0);
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(935);
						match(T__32);
						setState(936);
						expression(0);
						}
						} 
					}
					setState(941);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__32) {
					{
					{
					setState(942);
					match(T__32);
					setState(943);
					kwarg();
					}
					}
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KwargContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KwargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwarg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterKwarg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitKwarg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitKwarg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwargContext kwarg() throws RecognitionException {
		KwargContext _localctx = new KwargContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_kwarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(ID);
			setState(952);
			match(T__22);
			setState(953);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FluxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FluxParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_idList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(ID);
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(956);
					match(T__32);
					setState(957);
					match(ID);
					}
					} 
				}
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackedIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public PackedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterPackedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitPackedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitPackedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackedIdContext packedId() throws RecognitionException {
		PackedIdContext _localctx = new PackedIdContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_packedId);
		try {
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				idList();
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedIdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FluxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FluxParser.ID, i);
		}
		public QualifiedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterQualifiedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitQualifiedId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitQualifiedId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedIdContext qualifiedId() throws RecognitionException {
		QualifiedIdContext _localctx = new QualifiedIdContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_qualifiedId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(ID);
			setState(972);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(968);
					match(T__63);
					setState(969);
					match(ID);
					}
					} 
				}
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return className_sempred((ClassNameContext)_localctx, predIndex);
		case 4:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 40:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean className_sempred(ClassNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 44);
		case 4:
			return precpred(_ctx, 43);
		case 5:
			return precpred(_ctx, 41);
		case 6:
			return precpred(_ctx, 25);
		case 7:
			return precpred(_ctx, 24);
		case 8:
			return precpred(_ctx, 23);
		case 9:
			return precpred(_ctx, 22);
		case 10:
			return precpred(_ctx, 21);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 16);
		case 16:
			return precpred(_ctx, 15);
		case 17:
			return precpred(_ctx, 14);
		case 18:
			return precpred(_ctx, 13);
		case 19:
			return precpred(_ctx, 12);
		case 20:
			return precpred(_ctx, 11);
		case 21:
			return precpred(_ctx, 42);
		case 22:
			return precpred(_ctx, 30);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001x\u03d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0005\u0000"+
		"d\b\u0000\n\u0000\f\u0000g\t\u0000\u0001\u0000\u0003\u0000j\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000o\b\u0000\n\u0000\f\u0000r\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0003\u0002z\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002~\b\u0002"+
		"\u0001\u0002\u0003\u0002\u0081\b\u0002\u0001\u0002\u0003\u0002\u0084\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0088\b\u0002\u0001\u0002\u0003"+
		"\u0002\u008b\b\u0002\u0001\u0002\u0003\u0002\u008e\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0092\b\u0002\u0001\u0002\u0003\u0002\u0095\b"+
		"\u0002\u0001\u0002\u0003\u0002\u0098\b\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u009c\b\u0002\u0001\u0002\u0003\u0002\u009f\b\u0002\u0003\u0002"+
		"\u00a1\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00a9\b\u0003\u0001\u0003\u0005\u0003\u00ac\b"+
		"\u0003\n\u0003\f\u0003\u00af\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00b4\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00b9\b\u0004\n\u0004\f\u0004\u00bc\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00c1\b\u0004\u0001\u0004\u0005\u0004\u00c4\b\u0004"+
		"\n\u0004\f\u0004\u00c7\t\u0004\u0001\u0005\u0004\u0005\u00ca\b\u0005\u000b"+
		"\u0005\f\u0005\u00cb\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00e5\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00eb\b\u0010\u0003\u0010"+
		"\u00ed\b\u0010\u0001\u0011\u0003\u0011\u00f0\b\u0011\u0001\u0011\u0003"+
		"\u0011\u00f3\b\u0011\u0001\u0011\u0003\u0011\u00f6\b\u0011\u0001\u0011"+
		"\u0003\u0011\u00f9\b\u0011\u0001\u0011\u0003\u0011\u00fc\b\u0011\u0001"+
		"\u0011\u0003\u0011\u00ff\b\u0011\u0001\u0012\u0003\u0012\u0102\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u010c\b\u0012\u0003\u0012\u010e\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0113\b\u0013\u0001"+
		"\u0014\u0003\u0014\u0116\b\u0014\u0001\u0014\u0003\u0014\u0119\b\u0014"+
		"\u0001\u0014\u0003\u0014\u011c\b\u0014\u0001\u0014\u0003\u0014\u011f\b"+
		"\u0014\u0001\u0014\u0003\u0014\u0122\b\u0014\u0001\u0014\u0003\u0014\u0125"+
		"\b\u0014\u0001\u0014\u0003\u0014\u0128\b\u0014\u0001\u0014\u0003\u0014"+
		"\u012b\b\u0014\u0001\u0014\u0003\u0014\u012e\b\u0014\u0001\u0015\u0005"+
		"\u0015\u0131\b\u0015\n\u0015\f\u0015\u0134\t\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u013b\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u013f\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0149\b\u0016\u0001\u0016\u0003\u0016\u014c\b\u0016\u0001\u0017\u0005"+
		"\u0017\u014f\b\u0017\n\u0017\f\u0017\u0152\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0159\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u015d\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0162\b\u0017\n\u0017\f\u0017\u0165\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0169\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u016e\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0172\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0177\b\u0017\n\u0017"+
		"\f\u0017\u017a\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0181\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0185\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0189\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u018e\b\u0018\n\u0018\f\u0018"+
		"\u0191\t\u0018\u0001\u0019\u0005\u0019\u0194\b\u0019\n\u0019\f\u0019\u0197"+
		"\t\u0019\u0001\u0019\u0003\u0019\u019a\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u019e\b\u0019\n\u0019\f\u0019\u01a1\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01a7\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01ab\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01af"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01b8\b\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u01bc\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01c0\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u01c9\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01cd\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01d1\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u01da\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u01df\b\u001d\n\u001d\f\u001d\u01e2\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u01e7\b\u001e\n\u001e\f\u001e\u01ea\t\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01ef\b\u001f\n\u001f\f\u001f"+
		"\u01f2\t\u001f\u0001 \u0001 \u0001 \u0003 \u01f7\b \u0001!\u0001!\u0003"+
		"!\u01fb\b!\u0001\"\u0001\"\u0001\"\u0003\"\u0200\b\"\u0001#\u0001#\u0003"+
		"#\u0204\b#\u0001$\u0003$\u0207\b$\u0001$\u0001$\u0003$\u020b\b$\u0001"+
		"$\u0003$\u020e\b$\u0001$\u0003$\u0211\b$\u0001$\u0001$\u0003$\u0215\b"+
		"$\u0001$\u0003$\u0218\b$\u0001$\u0003$\u021b\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0226\b$\u0001$\u0001$\u0001"+
		"$\u0003$\u022b\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u0234\b$\u0001$\u0001$\u0001$\u0003$\u0239\b$\u0001$\u0001$\u0001$\u0003"+
		"$\u023e\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0245\b$\u0001$\u0001"+
		"$\u0001$\u0003$\u024a\b$\u0001$\u0001$\u0003$\u024e\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u0254\b$\u0001$\u0001$\u0001$\u0003$\u0259\b$\u0001$\u0001"+
		"$\u0001$\u0003$\u025e\b$\u0001$\u0001$\u0003$\u0262\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0005$\u0268\b$\n$\f$\u026b\t$\u0001$\u0003$\u026e\b$\u0001$"+
		"\u0001$\u0003$\u0272\b$\u0001$\u0003$\u0275\b$\u0001$\u0001$\u0003$\u0279"+
		"\b$\u0001$\u0003$\u027c\b$\u0001$\u0001$\u0003$\u0280\b$\u0001$\u0003"+
		"$\u0283\b$\u0001$\u0003$\u0286\b$\u0001$\u0001$\u0003$\u028a\b$\u0001"+
		"$\u0003$\u028d\b$\u0001$\u0003$\u0290\b$\u0001$\u0001$\u0003$\u0294\b"+
		"$\u0001$\u0003$\u0297\b$\u0001$\u0001$\u0003$\u029b\b$\u0003$\u029d\b"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u02b6\b%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0003\'\u02c0\b\'\u0001\'\u0005\'\u02c3\b\'"+
		"\n\'\f\'\u02c6\t\'\u0001\'\u0005\'\u02c9\b\'\n\'\f\'\u02cc\t\'\u0001\'"+
		"\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u02eb"+
		"\b(\u0001(\u0001(\u0001(\u0003(\u02f0\b(\u0001(\u0001(\u0001(\u0003(\u02f5"+
		"\b(\u0001(\u0001(\u0001(\u0003(\u02fa\b(\u0001(\u0001(\u0001(\u0003(\u02ff"+
		"\b(\u0001(\u0001(\u0001(\u0001(\u0005(\u0305\b(\n(\f(\u0308\t(\u0001("+
		"\u0001(\u0003(\u030c\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0313"+
		"\b(\n(\f(\u0316\t(\u0001(\u0001(\u0003(\u031a\b(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0325\b(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u032d\b(\u0001(\u0001(\u0003(\u0331"+
		"\b(\u0001(\u0001(\u0001(\u0003(\u0336\b(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u0341\b(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u0386\b(\n(\f(\u0389\t(\u0001)\u0001)\u0001"+
		")\u0005)\u038e\b)\n)\f)\u0391\t)\u0001*\u0001*\u0001*\u0005*\u0396\b*"+
		"\n*\f*\u0399\t*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0005"+
		",\u03a2\b,\n,\f,\u03a5\t,\u0001,\u0001,\u0001,\u0005,\u03aa\b,\n,\f,\u03ad"+
		"\t,\u0001,\u0001,\u0005,\u03b1\b,\n,\f,\u03b4\t,\u0003,\u03b6\b,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u03bf\b.\n.\f.\u03c2"+
		"\t.\u0001/\u0001/\u0003/\u03c6\b/\u00010\u00010\u00010\u00050\u03cb\b"+
		"0\n0\f0\u03ce\t0\u00010\u0003\u02c4\u02ca\u03cc\u0003\u0006\bP1\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\u0015\u0001\u0000\u0005"+
		"\u0007\u0001\u0000\b\f\u0001\u0000\r\u000f\u0001\u0000\u0015\u0016\u0001"+
		"\u0000\u0018\u001a\u0001\u0000\u001b\u001c\u0002\u0000\u001b\u001b\u001d"+
		"\u001d\u0001\u0000#$\u0002\u0000\u001b\u001b%%\u0001\u0000\'(\u0002\u0000"+
		"\u0017\u0017*4\u0001\u00009:\u0001\u0000BC\u0002\u00009:IK\u0001\u0000"+
		"LN\u0001\u0000IJ\u0001\u0000QS\u0002\u0000\u0002\u0003TU\u0001\u0000W"+
		"X\u0001\u0000\\]\u0001\u0000^_\u0473\u0000e\u0001\u0000\u0000\u0000\u0002"+
		"u\u0001\u0000\u0000\u0000\u0004\u00a0\u0001\u0000\u0000\u0000\u0006\u00a2"+
		"\u0001\u0000\u0000\u0000\b\u00b3\u0001\u0000\u0000\u0000\n\u00c9\u0001"+
		"\u0000\u0000\u0000\f\u00cd\u0001\u0000\u0000\u0000\u000e\u00cf\u0001\u0000"+
		"\u0000\u0000\u0010\u00d1\u0001\u0000\u0000\u0000\u0012\u00d3\u0001\u0000"+
		"\u0000\u0000\u0014\u00d5\u0001\u0000\u0000\u0000\u0016\u00d7\u0001\u0000"+
		"\u0000\u0000\u0018\u00d9\u0001\u0000\u0000\u0000\u001a\u00db\u0001\u0000"+
		"\u0000\u0000\u001c\u00dd\u0001\u0000\u0000\u0000\u001e\u00df\u0001\u0000"+
		"\u0000\u0000 \u00ec\u0001\u0000\u0000\u0000\"\u00ef\u0001\u0000\u0000"+
		"\u0000$\u010d\u0001\u0000\u0000\u0000&\u010f\u0001\u0000\u0000\u0000("+
		"\u0115\u0001\u0000\u0000\u0000*\u0132\u0001\u0000\u0000\u0000,\u0142\u0001"+
		"\u0000\u0000\u0000.\u0188\u0001\u0000\u0000\u00000\u018a\u0001\u0000\u0000"+
		"\u00002\u01a6\u0001\u0000\u0000\u00004\u01b7\u0001\u0000\u0000\u00006"+
		"\u01c8\u0001\u0000\u0000\u00008\u01d9\u0001\u0000\u0000\u0000:\u01e0\u0001"+
		"\u0000\u0000\u0000<\u01e8\u0001\u0000\u0000\u0000>\u01f0\u0001\u0000\u0000"+
		"\u0000@\u01f6\u0001\u0000\u0000\u0000B\u01fa\u0001\u0000\u0000\u0000D"+
		"\u01fc\u0001\u0000\u0000\u0000F\u0201\u0001\u0000\u0000\u0000H\u029c\u0001"+
		"\u0000\u0000\u0000J\u02b5\u0001\u0000\u0000\u0000L\u02b7\u0001\u0000\u0000"+
		"\u0000N\u02bc\u0001\u0000\u0000\u0000P\u0340\u0001\u0000\u0000\u0000R"+
		"\u038a\u0001\u0000\u0000\u0000T\u0392\u0001\u0000\u0000\u0000V\u039a\u0001"+
		"\u0000\u0000\u0000X\u03b5\u0001\u0000\u0000\u0000Z\u03b7\u0001\u0000\u0000"+
		"\u0000\\\u03bb\u0001\u0000\u0000\u0000^\u03c5\u0001\u0000\u0000\u0000"+
		"`\u03c7\u0001\u0000\u0000\u0000bd\u0003\u0004\u0002\u0000cb\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hj\u0003\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jp\u0001\u0000\u0000\u0000ko\u0003\u0004\u0002\u0000lo\u0003H$\u0000"+
		"mo\u0003\n\u0005\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000st\u0005\u0000\u0000\u0001t\u0001\u0001\u0000\u0000\u0000"+
		"uv\u0005\u0001\u0000\u0000vw\u00034\u001a\u0000w\u0003\u0001\u0000\u0000"+
		"\u0000xz\u0005w\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{}\u0003 \u0010\u0000|~\u0003\n\u0005"+
		"\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007f\u0081\u0005x\u0000\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u00a1\u0001\u0000"+
		"\u0000\u0000\u0082\u0084\u0005w\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000"+
		"\u0000\u0085\u0087\u0003*\u0015\u0000\u0086\u0088\u0003\n\u0005\u0000"+
		"\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000"+
		"\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u008b\u0005x\u0000\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u00a1\u0001\u0000\u0000\u0000\u008c\u008e\u0005w\u0000\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0091\u0003.\u0017\u0000\u0090\u0092\u0003"+
		"\n\u0005\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0095\u0005x\u0000"+
		"\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u00a1\u0001\u0000\u0000\u0000\u0096\u0098\u0005w\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0003&\u0013\u0000\u009a"+
		"\u009c\u0003\n\u0005\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0005x\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0y\u0001\u0000"+
		"\u0000\u0000\u00a0\u0083\u0001\u0000\u0000\u0000\u00a0\u008d\u0001\u0000"+
		"\u0000\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a1\u0005\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0006\u0003\uffff\uffff\u0000\u00a3\u00a4\u0003"+
		"`0\u0000\u00a4\u00ad\u0001\u0000\u0000\u0000\u00a5\u00a6\n\u0002\u0000"+
		"\u0000\u00a6\u00a8\u0005\u0002\u0000\u0000\u00a7\u00a9\u0003\u0006\u0003"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005\u0003\u0000"+
		"\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u0007\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0006\u0004\uffff\uffff\u0000\u00b1\u00b4\u0005p\u0000"+
		"\u0000\u00b2\u00b4\u0003`0\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00c5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\n\u0004\u0000\u0000\u00b6\u00ba\u0005\u0004\u0000\u0000\u00b7\u00b9"+
		"\u0005\u0004\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc"+
		"\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bb\u00c4\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\n\u0003\u0000\u0000\u00be\u00c0\u0005"+
		"\u0002\u0000\u0000\u00bf\u00c1\u0003\b\u0004\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0005\u0003\u0000\u0000\u00c3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c6\t\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00ca\u0005s\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u000b\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0007\u0000\u0000\u0000\u00ce\r\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0007\u0001\u0000\u0000\u00d0\u000f\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0007\u0002\u0000\u0000\u00d2\u0011\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005\u000e\u0000\u0000\u00d4\u0013\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005\u0010\u0000\u0000\u00d6\u0015\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0011\u0000\u0000\u00d8\u0017\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\u0012\u0000\u0000\u00da\u0019\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005\u0013\u0000\u0000\u00dc\u001b\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005\u000f\u0000\u0000\u00de\u001d\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005\u0014\u0000\u0000\u00e0\u001f\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0007\u0003\u0000\u0000\u00e2\u00e4\u0003`0\u0000\u00e3\u00e5\u0005"+
		"n\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00ed\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007\u0003"+
		"\u0000\u0000\u00e7\u00e8\u0005\u000e\u0000\u0000\u00e8\u00ea\u0003`0\u0000"+
		"\u00e9\u00eb\u0005n\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e1\u0001\u0000\u0000\u0000\u00ec\u00e6\u0001\u0000\u0000\u0000\u00ed"+
		"!\u0001\u0000\u0000\u0000\u00ee\u00f0\u0003\f\u0006\u0000\u00ef\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f3\u0003\u000e\u0007\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003\u0012\t\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f9\u0003\u0014\n\u0000\u00f8\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fc\u0003\u0016\u000b\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fd\u00ff\u0003\u0018\f\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000"+
		"\u0100\u0102\u0005p\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0003^/\u0000\u0104\u0105\u0005\u0017\u0000\u0000\u0105\u0106\u0003"+
		"P(\u0000\u0106\u010e\u0001\u0000\u0000\u0000\u0107\u0108\u0003\b\u0004"+
		"\u0000\u0108\u010b\u0003^/\u0000\u0109\u010a\u0005\u0017\u0000\u0000\u010a"+
		"\u010c\u0003P(\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001"+
		"\u0000\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0101\u0001"+
		"\u0000\u0000\u0000\u010d\u0107\u0001\u0000\u0000\u0000\u010e%\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0003\"\u0011\u0000\u0110\u0112\u0003$\u0012"+
		"\u0000\u0111\u0113\u0003\n\u0005\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\'\u0001\u0000\u0000\u0000\u0114"+
		"\u0116\u0003\f\u0006\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0119"+
		"\u0003\u000e\u0007\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u011c"+
		"\u0003\u0010\b\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001"+
		"\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u011f\u0003"+
		"\u0014\n\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0122\u0003\u0016"+
		"\u000b\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0125\u0003\u0018"+
		"\f\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0128\u0003\u001a\r\u0000"+
		"\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000"+
		"\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u012b\u0003\u001c\u000e\u0000"+
		"\u012a\u0129\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012e\u0003\u001e\u000f\u0000"+
		"\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000"+
		"\u012e)\u0001\u0000\u0000\u0000\u012f\u0131\u0003,\u0016\u0000\u0130\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0003(\u0014\u0000\u0136\u0137\u0007\u0004\u0000\u0000\u0137\u013a\u0003"+
		"\u0006\u0003\u0000\u0138\u0139\u0007\u0005\u0000\u0000\u0139\u013b\u0003"+
		"\u0006\u0003\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013d\u0007"+
		"\u0006\u0000\u0000\u013d\u013f\u0003\u0006\u0003\u0000\u013e\u013c\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u00034\u001a\u0000\u0141+\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0005\u001e\u0000\u0000\u0143\u0148\u0003P(\u0000\u0144"+
		"\u0145\u0005\u001f\u0000\u0000\u0145\u0146\u0003R)\u0000\u0146\u0147\u0005"+
		" \u0000\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0144\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000"+
		"\u0000\u0000\u014a\u014c\u0003\n\u0005\u0000\u014b\u014a\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c-\u0001\u0000\u0000\u0000"+
		"\u014d\u014f\u0003,\u0016\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0001\u0000\u0000\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0153\u0154\u0003(\u0014\u0000\u0154\u0155"+
		"\u0005o\u0000\u0000\u0155\u0156\u0005q\u0000\u0000\u0156\u0158\u0005\u001f"+
		"\u0000\u0000\u0157\u0159\u00030\u0018\u0000\u0158\u0157\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000"+
		"\u0000\u015a\u015c\u0005 \u0000\u0000\u015b\u015d\u0003\n\u0005\u0000"+
		"\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u00036\u001b\u0000\u015f"+
		"\u0189\u0001\u0000\u0000\u0000\u0160\u0162\u0003,\u0016\u0000\u0161\u0160"+
		"\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166"+
		"\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0003(\u0014\u0000\u0167\u0169\u0005p\u0000\u0000\u0168\u0167\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005q\u0000\u0000\u016b\u016d\u0005\u001f\u0000"+
		"\u0000\u016c\u016e\u00030\u0018\u0000\u016d\u016c\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f\u0171\u0005 \u0000\u0000\u0170\u0172\u0003\n\u0005\u0000\u0171"+
		"\u0170\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u00038\u001c\u0000\u0174\u0189"+
		"\u0001\u0000\u0000\u0000\u0175\u0177\u0003,\u0016\u0000\u0176\u0175\u0001"+
		"\u0000\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0001"+
		"\u0000\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u017c\u0003"+
		"(\u0014\u0000\u017c\u017d\u0003\b\u0004\u0000\u017d\u017e\u0005q\u0000"+
		"\u0000\u017e\u0180\u0005\u001f\u0000\u0000\u017f\u0181\u00030\u0018\u0000"+
		"\u0180\u017f\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0005 \u0000\u0000\u0183"+
		"\u0185\u0003\n\u0005\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u00038\u001c\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0150\u0001"+
		"\u0000\u0000\u0000\u0188\u0163\u0001\u0000\u0000\u0000\u0188\u0178\u0001"+
		"\u0000\u0000\u0000\u0189/\u0001\u0000\u0000\u0000\u018a\u018f\u00032\u0019"+
		"\u0000\u018b\u018c\u0005!\u0000\u0000\u018c\u018e\u00032\u0019\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f"+
		"\u018d\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190"+
		"1\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0194"+
		"\u0003,\u0016\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194\u0197\u0001"+
		"\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001"+
		"\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001"+
		"\u0000\u0000\u0000\u0198\u019a\u0003\b\u0004\u0000\u0199\u0198\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u01a7\u0003^/\u0000\u019c\u019e\u0003,\u0016\u0000"+
		"\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0003^/\u0000\u01a3\u01a4\u0005\u001b\u0000\u0000\u01a4\u01a5"+
		"\u0003\b\u0004\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u0195\u0001"+
		"\u0000\u0000\u0000\u01a6\u019f\u0001\u0000\u0000\u0000\u01a73\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0005b\u0000\u0000\u01a9\u01ab\u0005w\u0000\u0000"+
		"\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0003:\u001d\u0000\u01ad"+
		"\u01af\u0005x\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0005c\u0000\u0000\u01b1\u01b8\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005"+
		"\u001b\u0000\u0000\u01b3\u01b4\u0005w\u0000\u0000\u01b4\u01b5\u0003:\u001d"+
		"\u0000\u01b5\u01b6\u0005x\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b7\u01a8\u0001\u0000\u0000\u0000\u01b7\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b85\u0001\u0000\u0000\u0000\u01b9\u01bb\u0005b\u0000\u0000\u01ba\u01bc"+
		"\u0005w\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01bf\u0003"+
		"<\u001e\u0000\u01be\u01c0\u0005x\u0000\u0000\u01bf\u01be\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0005c\u0000\u0000\u01c2\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0005\u001b\u0000\u0000\u01c4\u01c5\u0005w\u0000\u0000\u01c5"+
		"\u01c6\u0003<\u001e\u0000\u01c6\u01c7\u0005x\u0000\u0000\u01c7\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c8\u01b9\u0001\u0000\u0000\u0000\u01c8\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c97\u0001\u0000\u0000\u0000\u01ca\u01cc\u0005b\u0000"+
		"\u0000\u01cb\u01cd\u0005w\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000"+
		"\u01ce\u01d0\u0003>\u001f\u0000\u01cf\u01d1\u0005x\u0000\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005c\u0000\u0000\u01d3\u01da\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0005\u001b\u0000\u0000\u01d5\u01d6\u0005"+
		"w\u0000\u0000\u01d6\u01d7\u0003>\u001f\u0000\u01d7\u01d8\u0005x\u0000"+
		"\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01ca\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d4\u0001\u0000\u0000\u0000\u01da9\u0001\u0000\u0000\u0000"+
		"\u01db\u01df\u0003\u0004\u0002\u0000\u01dc\u01df\u0003H$\u0000\u01dd\u01df"+
		"\u0003\n\u0005\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01df\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e1;\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e7\u0003H$\u0000\u01e4\u01e7\u0003F#\u0000\u01e5"+
		"\u01e7\u0003\n\u0005\u0000\u01e6\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7\u01ea"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e9=\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ef\u0003H$\u0000\u01ec\u01ef\u0003D\"\u0000"+
		"\u01ed\u01ef\u0003\n\u0005\u0000\u01ee\u01eb\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f1?\u0001\u0000\u0000\u0000\u01f2\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f7\u0003<\u001e\u0000\u01f4\u01f7\u0003"+
		":\u001d\u0000\u01f5\u01f7\u0003>\u001f\u0000\u01f6\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f7A\u0001\u0000\u0000\u0000\u01f8\u01fb\u00036\u001b\u0000\u01f9"+
		"\u01fb\u00038\u001c\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fbC\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005"+
		"\"\u0000\u0000\u01fd\u01ff\u0003P(\u0000\u01fe\u0200\u0003\n\u0005\u0000"+
		"\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u0200E\u0001\u0000\u0000\u0000\u0201\u0203\u0005\"\u0000\u0000\u0202"+
		"\u0204\u0003\n\u0005\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204G\u0001\u0000\u0000\u0000\u0205\u0207\u0005"+
		"w\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000"+
		"\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020a\u0003.\u0017"+
		"\u0000\u0209\u020b\u0003\n\u0005\u0000\u020a\u0209\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000"+
		"\u020c\u020e\u0005x\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020d"+
		"\u020e\u0001\u0000\u0000\u0000\u020e\u029d\u0001\u0000\u0000\u0000\u020f"+
		"\u0211\u0005w\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0214"+
		"\u00036\u001b\u0000\u0213\u0215\u0003\n\u0005\u0000\u0214\u0213\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001"+
		"\u0000\u0000\u0000\u0216\u0218\u0005x\u0000\u0000\u0217\u0216\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u029d\u0001\u0000"+
		"\u0000\u0000\u0219\u021b\u0005w\u0000\u0000\u021a\u0219\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0005#\u0000\u0000\u021d\u021e\u0005\u001f\u0000\u0000"+
		"\u021e\u021f\u0003$\u0012\u0000\u021f\u0220\u0003\n\u0005\u0000\u0220"+
		"\u0221\u0003P(\u0000\u0221\u0222\u0003\n\u0005\u0000\u0222\u0223\u0003"+
		"J%\u0000\u0223\u0225\u0005 \u0000\u0000\u0224\u0226\u0005x\u0000\u0000"+
		"\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0003B!\u0000\u0228\u029d"+
		"\u0001\u0000\u0000\u0000\u0229\u022b\u0005w\u0000\u0000\u022a\u0229\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0005#\u0000\u0000\u022d\u022e\u0003$\u0012"+
		"\u0000\u022e\u022f\u0003\n\u0005\u0000\u022f\u0230\u0003P(\u0000\u0230"+
		"\u0231\u0003\n\u0005\u0000\u0231\u0233\u0003J%\u0000\u0232\u0234\u0005"+
		"x\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0003B!\u0000"+
		"\u0236\u029d\u0001\u0000\u0000\u0000\u0237\u0239\u0005w\u0000\u0000\u0238"+
		"\u0237\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0007\u0007\u0000\u0000\u023b"+
		"\u023d\u0005\u001f\u0000\u0000\u023c\u023e\u0003\b\u0004\u0000\u023d\u023c"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0003^/\u0000\u0240\u0241\u0007\b"+
		"\u0000\u0000\u0241\u0242\u0003P(\u0000\u0242\u0244\u0005 \u0000\u0000"+
		"\u0243\u0245\u0005x\u0000\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246"+
		"\u0247\u0003B!\u0000\u0247\u029d\u0001\u0000\u0000\u0000\u0248\u024a\u0005"+
		"w\u0000\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024d\u0007\u0007"+
		"\u0000\u0000\u024c\u024e\u0003\b\u0004\u0000\u024d\u024c\u0001\u0000\u0000"+
		"\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0003^/\u0000\u0250\u0251\u0007\b\u0000\u0000\u0251"+
		"\u0253\u0003P(\u0000\u0252\u0254\u0005x\u0000\u0000\u0253\u0252\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0003B!\u0000\u0256\u029d\u0001\u0000\u0000"+
		"\u0000\u0257\u0259\u0005w\u0000\u0000\u0258\u0257\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000"+
		"\u025a\u025b\u0005&\u0000\u0000\u025b\u025d\u0003P(\u0000\u025c\u025e"+
		"\u0005x\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025d\u025e\u0001"+
		"\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0261\u0003"+
		"B!\u0000\u0260\u0262\u0003\n\u0005\u0000\u0261\u0260\u0001\u0000\u0000"+
		"\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0269\u0001\u0000\u0000"+
		"\u0000\u0263\u0264\u0007\t\u0000\u0000\u0264\u0265\u0003P(\u0000\u0265"+
		"\u0266\u0003B!\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0263\u0001"+
		"\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026d\u0001"+
		"\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026e\u0003"+
		"\n\u0005\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000"+
		"\u0000\u0000\u026e\u0271\u0001\u0000\u0000\u0000\u026f\u0270\u0005)\u0000"+
		"\u0000\u0270\u0272\u0003B!\u0000\u0271\u026f\u0001\u0000\u0000\u0000\u0271"+
		"\u0272\u0001\u0000\u0000\u0000\u0272\u029d\u0001\u0000\u0000\u0000\u0273"+
		"\u0275\u0005w\u0000\u0000\u0274\u0273\u0001\u0000\u0000\u0000\u0274\u0275"+
		"\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0278"+
		"\u0003&\u0013\u0000\u0277\u0279\u0005x\u0000\u0000\u0278\u0277\u0001\u0000"+
		"\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u029d\u0001\u0000"+
		"\u0000\u0000\u027a\u027c\u0005w\u0000\u0000\u027b\u027a\u0001\u0000\u0000"+
		"\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000"+
		"\u0000\u027d\u027f\u0003J%\u0000\u027e\u0280\u0003\n\u0005\u0000\u027f"+
		"\u027e\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280"+
		"\u0282\u0001\u0000\u0000\u0000\u0281\u0283\u0005x\u0000\u0000\u0282\u0281"+
		"\u0001\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u029d"+
		"\u0001\u0000\u0000\u0000\u0284\u0286\u0005w\u0000\u0000\u0285\u0284\u0001"+
		"\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0001"+
		"\u0000\u0000\u0000\u0287\u0289\u0003P(\u0000\u0288\u028a\u0003\n\u0005"+
		"\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000"+
		"\u0000\u028a\u028c\u0001\u0000\u0000\u0000\u028b\u028d\u0005x\u0000\u0000"+
		"\u028c\u028b\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000"+
		"\u028d\u029d\u0001\u0000\u0000\u0000\u028e\u0290\u0005w\u0000\u0000\u028f"+
		"\u028e\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0001\u0000\u0000\u0000\u0291\u0293\u0003D\"\u0000\u0292\u0294"+
		"\u0005x\u0000\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0293\u0294\u0001"+
		"\u0000\u0000\u0000\u0294\u029d\u0001\u0000\u0000\u0000\u0295\u0297\u0005"+
		"w\u0000\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000"+
		"\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u029a\u0003F#\u0000"+
		"\u0299\u029b\u0005x\u0000\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029a"+
		"\u029b\u0001\u0000\u0000\u0000\u029b\u029d\u0001\u0000\u0000\u0000\u029c"+
		"\u0206\u0001\u0000\u0000\u0000\u029c\u0210\u0001\u0000\u0000\u0000\u029c"+
		"\u021a\u0001\u0000\u0000\u0000\u029c\u022a\u0001\u0000\u0000\u0000\u029c"+
		"\u0238\u0001\u0000\u0000\u0000\u029c\u0249\u0001\u0000\u0000\u0000\u029c"+
		"\u0258\u0001\u0000\u0000\u0000\u029c\u0274\u0001\u0000\u0000\u0000\u029c"+
		"\u027b\u0001\u0000\u0000\u0000\u029c\u0285\u0001\u0000\u0000\u0000\u029c"+
		"\u028f\u0001\u0000\u0000\u0000\u029c\u0296\u0001\u0000\u0000\u0000\u029d"+
		"I\u0001\u0000\u0000\u0000\u029e\u029f\u0003`0\u0000\u029f\u02a0\u0007"+
		"\n\u0000\u0000\u02a0\u02a1\u0003P(\u0000\u02a1\u02b6\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a3\u0003`0\u0000\u02a3\u02a4\u00055\u0000\u0000\u02a4"+
		"\u02a5\u0003P(\u0000\u02a5\u02b6\u0001\u0000\u0000\u0000\u02a6\u02a7\u0003"+
		"`0\u0000\u02a7\u02a8\u00056\u0000\u0000\u02a8\u02a9\u0003P(\u0000\u02a9"+
		"\u02b6\u0001\u0000\u0000\u0000\u02aa\u02ab\u0003`0\u0000\u02ab\u02ac\u0005"+
		"7\u0000\u0000\u02ac\u02ad\u0003P(\u0000\u02ad\u02b6\u0001\u0000\u0000"+
		"\u0000\u02ae\u02af\u0003`0\u0000\u02af\u02b0\u00058\u0000\u0000\u02b0"+
		"\u02b1\u0003P(\u0000\u02b1\u02b6\u0001\u0000\u0000\u0000\u02b2\u02b3\u0003"+
		"`0\u0000\u02b3\u02b4\u0007\u000b\u0000\u0000\u02b4\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b5\u029e\u0001\u0000\u0000\u0000\u02b5\u02a2\u0001\u0000\u0000"+
		"\u0000\u02b5\u02a6\u0001\u0000\u0000\u0000\u02b5\u02aa\u0001\u0000\u0000"+
		"\u0000\u02b5\u02ae\u0001\u0000\u0000\u0000\u02b5\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b6K\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005#\u0000\u0000\u02b8"+
		"\u02b9\u0003^/\u0000\u02b9\u02ba\u0007\b\u0000\u0000\u02ba\u02bb\u0003"+
		"P(\u0000\u02bbM\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005;\u0000\u0000"+
		"\u02bd\u02bf\u0005d\u0000\u0000\u02be\u02c0\u0003P(\u0000\u02bf\u02be"+
		"\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02ca"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c3\u0005e\u0000\u0000\u02c2\u02c1\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02c7\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c9\u0003"+
		"P(\u0000\u02c8\u02c4\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cd\u02ce\u0005f\u0000\u0000\u02ceO\u0001\u0000\u0000\u0000\u02cf"+
		"\u02d0\u0006(\uffff\uffff\u0000\u02d0\u02d1\u0005A\u0000\u0000\u02d1\u02d2"+
		"\u0003\\.\u0000\u02d2\u02d3\u0005\u001b\u0000\u0000\u02d3\u02d4\u0003"+
		"P((\u02d4\u0341\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005\u001f\u0000"+
		"\u0000\u02d6\u02d7\u0003\\.\u0000\u02d7\u02d8\u0005 \u0000\u0000\u02d8"+
		"\u02d9\u0007\f\u0000\u0000\u02d9\u02da\u0003P(\'\u02da\u0341\u0001\u0000"+
		"\u0000\u0000\u02db\u02dc\u0003`0\u0000\u02dc\u02dd\u0005D\u0000\u0000"+
		"\u02dd\u02de\u0003P(&\u02de\u0341\u0001\u0000\u0000\u0000\u02df\u02e0"+
		"\u0005\u001f\u0000\u0000\u02e0\u02e1\u0003\b\u0004\u0000\u02e1\u02e2\u0005"+
		" \u0000\u0000\u02e2\u02e3\u0003P(%\u02e3\u0341\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e5\u0005\u001f\u0000\u0000\u02e5\u02e6\u0003P(\u0000\u02e6\u02e7"+
		"\u0005 \u0000\u0000\u02e7\u0341\u0001\u0000\u0000\u0000\u02e8\u02ea\u0005"+
		"E\u0000\u0000\u02e9\u02eb\u0003R)\u0000\u02ea\u02e9\u0001\u0000\u0000"+
		"\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ec\u0341\u0005F\u0000\u0000\u02ed\u02ef\u0005>\u0000\u0000\u02ee"+
		"\u02f0\u0003R)\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001"+
		"\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u0341\u0005"+
		"?\u0000\u0000\u02f2\u02f4\u0005b\u0000\u0000\u02f3\u02f5\u0003R)\u0000"+
		"\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u0341\u0005c\u0000\u0000\u02f7"+
		"\u02f9\u0005\u001f\u0000\u0000\u02f8\u02fa\u0003R)\u0000\u02f9\u02f8\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u0341\u0005 \u0000\u0000\u02fc\u02fe\u0005b\u0000"+
		"\u0000\u02fd\u02ff\u0003T*\u0000\u02fe\u02fd\u0001\u0000\u0000\u0000\u02fe"+
		"\u02ff\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300"+
		"\u0341\u0005c\u0000\u0000\u0301\u0302\u0005>\u0000\u0000\u0302\u0306\u0003"+
		"B!\u0000\u0303\u0305\u0003L&\u0000\u0304\u0303\u0001\u0000\u0000\u0000"+
		"\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u030b\u0001\u0000\u0000\u0000"+
		"\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u030a\u0005&\u0000\u0000\u030a"+
		"\u030c\u0003P(\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001"+
		"\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u030e\u0005"+
		"?\u0000\u0000\u030e\u0341\u0001\u0000\u0000\u0000\u030f\u0310\u0005>\u0000"+
		"\u0000\u0310\u0314\u0003P(\u0000\u0311\u0313\u0003L&\u0000\u0312\u0311"+
		"\u0001\u0000\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314\u0312"+
		"\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0319"+
		"\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317\u0318"+
		"\u0005&\u0000\u0000\u0318\u031a\u0003P(\u0000\u0319\u0317\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000"+
		"\u0000\u0000\u031b\u031c\u0005?\u0000\u0000\u031c\u0341\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0005G\u0000\u0000\u031e\u0325\u0003P(\u0000\u031f"+
		"\u0320\u0005H\u0000\u0000\u0320\u0321\u0005\u001f\u0000\u0000\u0321\u0322"+
		"\u0003P(\u0000\u0322\u0323\u0005 \u0000\u0000\u0323\u0325\u0001\u0000"+
		"\u0000\u0000\u0324\u031d\u0001\u0000\u0000\u0000\u0324\u031f\u0001\u0000"+
		"\u0000\u0000\u0325\u0341\u0001\u0000\u0000\u0000\u0326\u0327\u0007\r\u0000"+
		"\u0000\u0327\u0341\u0003P(\u001a\u0328\u0329\u0005a\u0000\u0000\u0329"+
		"\u032a\u0003\b\u0004\u0000\u032a\u032c\u0005\u001f\u0000\u0000\u032b\u032d"+
		"\u0003R)\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000"+
		"\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0330\u0005 \u0000"+
		"\u0000\u032f\u0331\u0003B!\u0000\u0330\u032f\u0001\u0000\u0000\u0000\u0330"+
		"\u0331\u0001\u0000\u0000\u0000\u0331\u0341\u0001\u0000\u0000\u0000\u0332"+
		"\u0333\u0005q\u0000\u0000\u0333\u0335\u0005\u001f\u0000\u0000\u0334\u0336"+
		"\u0003X,\u0000\u0335\u0334\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000"+
		"\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0341\u0005 \u0000"+
		"\u0000\u0338\u0341\u0003`0\u0000\u0339\u0341\u0005k\u0000\u0000\u033a"+
		"\u0341\u0005l\u0000\u0000\u033b\u0341\u0005m\u0000\u0000\u033c\u0341\u0003"+
		"N\'\u0000\u033d\u0341\u0005i\u0000\u0000\u033e\u0341\u0005h\u0000\u0000"+
		"\u033f\u0341\u0005g\u0000\u0000\u0340\u02cf\u0001\u0000\u0000\u0000\u0340"+
		"\u02d5\u0001\u0000\u0000\u0000\u0340\u02db\u0001\u0000\u0000\u0000\u0340"+
		"\u02df\u0001\u0000\u0000\u0000\u0340\u02e4\u0001\u0000\u0000\u0000\u0340"+
		"\u02e8\u0001\u0000\u0000\u0000\u0340\u02ed\u0001\u0000\u0000\u0000\u0340"+
		"\u02f2\u0001\u0000\u0000\u0000\u0340\u02f7\u0001\u0000\u0000\u0000\u0340"+
		"\u02fc\u0001\u0000\u0000\u0000\u0340\u0301\u0001\u0000\u0000\u0000\u0340"+
		"\u030f\u0001\u0000\u0000\u0000\u0340\u0324\u0001\u0000\u0000\u0000\u0340"+
		"\u0326\u0001\u0000\u0000\u0000\u0340\u0328\u0001\u0000\u0000\u0000\u0340"+
		"\u0332\u0001\u0000\u0000\u0000\u0340\u0338\u0001\u0000\u0000\u0000\u0340"+
		"\u0339\u0001\u0000\u0000\u0000\u0340\u033a\u0001\u0000\u0000\u0000\u0340"+
		"\u033b\u0001\u0000\u0000\u0000\u0340\u033c\u0001\u0000\u0000\u0000\u0340"+
		"\u033d\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0340"+
		"\u033f\u0001\u0000\u0000\u0000\u0341\u0387\u0001\u0000\u0000\u0000\u0342"+
		"\u0343\n,\u0000\u0000\u0343\u0344\u0005<\u0000\u0000\u0344\u0386\u0003"+
		"P(,\u0345\u0346\n+\u0000\u0000\u0346\u0347\u0005=\u0000\u0000\u0347\u0386"+
		"\u0003P(+\u0348\u0349\n)\u0000\u0000\u0349\u034a\u0005@\u0000\u0000\u034a"+
		"\u0386\u0003P(*\u034b\u034c\n\u0019\u0000\u0000\u034c\u034d\u0007\u000e"+
		"\u0000\u0000\u034d\u0386\u0003P(\u001a\u034e\u034f\n\u0018\u0000\u0000"+
		"\u034f\u0350\u0005O\u0000\u0000\u0350\u0386\u0003P(\u0019\u0351\u0352"+
		"\n\u0017\u0000\u0000\u0352\u0353\u0005P\u0000\u0000\u0353\u0386\u0003"+
		"P(\u0018\u0354\u0355\n\u0016\u0000\u0000\u0355\u0356\u0007\u000f\u0000"+
		"\u0000\u0356\u0386\u0003P(\u0017\u0357\u0358\n\u0015\u0000\u0000\u0358"+
		"\u0359\u0007\u0010\u0000\u0000\u0359\u0386\u0003P(\u0016\u035a\u035b\n"+
		"\u0014\u0000\u0000\u035b\u035c\u0007\u0011\u0000\u0000\u035c\u0386\u0003"+
		"P(\u0015\u035d\u035e\n\u0013\u0000\u0000\u035e\u035f\u0005V\u0000\u0000"+
		"\u035f\u0386\u0003P(\u0014\u0360\u0361\n\u0012\u0000\u0000\u0361\u0362"+
		"\u0007\u0012\u0000\u0000\u0362\u0386\u0003P(\u0013\u0363\u0364\n\u0011"+
		"\u0000\u0000\u0364\u0365\u0005Y\u0000\u0000\u0365\u0386\u0003P(\u0012"+
		"\u0366\u0367\n\u0010\u0000\u0000\u0367\u0368\u0005Z\u0000\u0000\u0368"+
		"\u0386\u0003P(\u0011\u0369\u036a\n\u000f\u0000\u0000\u036a\u036b\u0005"+
		"[\u0000\u0000\u036b\u0386\u0003P(\u0010\u036c\u036d\n\u000e\u0000\u0000"+
		"\u036d\u036e\u0007\u0013\u0000\u0000\u036e\u0386\u0003P(\u000f\u036f\u0370"+
		"\n\r\u0000\u0000\u0370\u0371\u0007\u0014\u0000\u0000\u0371\u0386\u0003"+
		"P(\u000e\u0372\u0373\n\f\u0000\u0000\u0373\u0374\u0005`\u0000\u0000\u0374"+
		"\u0375\u0003P(\u0000\u0375\u0376\u0005\u001b\u0000\u0000\u0376\u0377\u0003"+
		"P(\r\u0377\u0386\u0001\u0000\u0000\u0000\u0378\u0379\n\u000b\u0000\u0000"+
		"\u0379\u037a\u0005&\u0000\u0000\u037a\u037b\u0003P(\u0000\u037b\u037c"+
		"\u0005)\u0000\u0000\u037c\u037d\u0003P(\f\u037d\u0386\u0001\u0000\u0000"+
		"\u0000\u037e\u037f\n*\u0000\u0000\u037f\u0380\u0005>\u0000\u0000\u0380"+
		"\u0381\u0003P(\u0000\u0381\u0382\u0005?\u0000\u0000\u0382\u0386\u0001"+
		"\u0000\u0000\u0000\u0383\u0384\n\u001e\u0000\u0000\u0384\u0386\u0007\u000b"+
		"\u0000\u0000\u0385\u0342\u0001\u0000\u0000\u0000\u0385\u0345\u0001\u0000"+
		"\u0000\u0000\u0385\u0348\u0001\u0000\u0000\u0000\u0385\u034b\u0001\u0000"+
		"\u0000\u0000\u0385\u034e\u0001\u0000\u0000\u0000\u0385\u0351\u0001\u0000"+
		"\u0000\u0000\u0385\u0354\u0001\u0000\u0000\u0000\u0385\u0357\u0001\u0000"+
		"\u0000\u0000\u0385\u035a\u0001\u0000\u0000\u0000\u0385\u035d\u0001\u0000"+
		"\u0000\u0000\u0385\u0360\u0001\u0000\u0000\u0000\u0385\u0363\u0001\u0000"+
		"\u0000\u0000\u0385\u0366\u0001\u0000\u0000\u0000\u0385\u0369\u0001\u0000"+
		"\u0000\u0000\u0385\u036c\u0001\u0000\u0000\u0000\u0385\u036f\u0001\u0000"+
		"\u0000\u0000\u0385\u0372\u0001\u0000\u0000\u0000\u0385\u0378\u0001\u0000"+
		"\u0000\u0000\u0385\u037e\u0001\u0000\u0000\u0000\u0385\u0383\u0001\u0000"+
		"\u0000\u0000\u0386\u0389\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000"+
		"\u0000\u0000\u0387\u0388\u0001\u0000\u0000\u0000\u0388Q\u0001\u0000\u0000"+
		"\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u038a\u038f\u0003P(\u0000\u038b"+
		"\u038c\u0005!\u0000\u0000\u038c\u038e\u0003P(\u0000\u038d\u038b\u0001"+
		"\u0000\u0000\u0000\u038e\u0391\u0001\u0000\u0000\u0000\u038f\u038d\u0001"+
		"\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390S\u0001\u0000"+
		"\u0000\u0000\u0391\u038f\u0001\u0000\u0000\u0000\u0392\u0397\u0003V+\u0000"+
		"\u0393\u0394\u0005!\u0000\u0000\u0394\u0396\u0003V+\u0000\u0395\u0393"+
		"\u0001\u0000\u0000\u0000\u0396\u0399\u0001\u0000\u0000\u0000\u0397\u0395"+
		"\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398U\u0001"+
		"\u0000\u0000\u0000\u0399\u0397\u0001\u0000\u0000\u0000\u039a\u039b\u0003"+
		"P(\u0000\u039b\u039c\u0005\u001b\u0000\u0000\u039c\u039d\u0003P(\u0000"+
		"\u039dW\u0001\u0000\u0000\u0000\u039e\u03a3\u0003Z-\u0000\u039f\u03a0"+
		"\u0005!\u0000\u0000\u03a0\u03a2\u0003Z-\u0000\u03a1\u039f\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a5\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001\u0000"+
		"\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000\u03a4\u03b6\u0001\u0000"+
		"\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000\u03a6\u03ab\u0003P(\u0000"+
		"\u03a7\u03a8\u0005!\u0000\u0000\u03a8\u03aa\u0003P(\u0000\u03a9\u03a7"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ad\u0001\u0000\u0000\u0000\u03ab\u03a9"+
		"\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03b2"+
		"\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ae\u03af"+
		"\u0005!\u0000\u0000\u03af\u03b1\u0003Z-\u0000\u03b0\u03ae\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b4\u0001\u0000\u0000\u0000\u03b2\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000\u03b5\u039e\u0001\u0000"+
		"\u0000\u0000\u03b5\u03a6\u0001\u0000\u0000\u0000\u03b6Y\u0001\u0000\u0000"+
		"\u0000\u03b7\u03b8\u0005q\u0000\u0000\u03b8\u03b9\u0005\u0017\u0000\u0000"+
		"\u03b9\u03ba\u0003P(\u0000\u03ba[\u0001\u0000\u0000\u0000\u03bb\u03c0"+
		"\u0005q\u0000\u0000\u03bc\u03bd\u0005!\u0000\u0000\u03bd\u03bf\u0005q"+
		"\u0000\u0000\u03be\u03bc\u0001\u0000\u0000\u0000\u03bf\u03c2\u0001\u0000"+
		"\u0000\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000"+
		"\u0000\u0000\u03c1]\u0001\u0000\u0000\u0000\u03c2\u03c0\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c6\u0005q\u0000\u0000\u03c4\u03c6\u0003\\.\u0000\u03c5"+
		"\u03c3\u0001\u0000\u0000\u0000\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c6"+
		"_\u0001\u0000\u0000\u0000\u03c7\u03cc\u0005q\u0000\u0000\u03c8\u03c9\u0005"+
		"@\u0000\u0000\u03c9\u03cb\u0005q\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000"+
		"\u0000\u03cb\u03ce\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000"+
		"\u0000\u03cc\u03ca\u0001\u0000\u0000\u0000\u03cda\u0001\u0000\u0000\u0000"+
		"\u03ce\u03cc\u0001\u0000\u0000\u0000\u0097einpy}\u0080\u0083\u0087\u008a"+
		"\u008d\u0091\u0094\u0097\u009b\u009e\u00a0\u00a8\u00ad\u00b3\u00ba\u00c0"+
		"\u00c3\u00c5\u00cb\u00e4\u00ea\u00ec\u00ef\u00f2\u00f5\u00f8\u00fb\u00fe"+
		"\u0101\u010b\u010d\u0112\u0115\u0118\u011b\u011e\u0121\u0124\u0127\u012a"+
		"\u012d\u0132\u013a\u013e\u0148\u014b\u0150\u0158\u015c\u0163\u0168\u016d"+
		"\u0171\u0178\u0180\u0184\u0188\u018f\u0195\u0199\u019f\u01a6\u01aa\u01ae"+
		"\u01b7\u01bb\u01bf\u01c8\u01cc\u01d0\u01d9\u01de\u01e0\u01e6\u01e8\u01ee"+
		"\u01f0\u01f6\u01fa\u01ff\u0203\u0206\u020a\u020d\u0210\u0214\u0217\u021a"+
		"\u0225\u022a\u0233\u0238\u023d\u0244\u0249\u024d\u0253\u0258\u025d\u0261"+
		"\u0269\u026d\u0271\u0274\u0278\u027b\u027f\u0282\u0285\u0289\u028c\u028f"+
		"\u0293\u0296\u029a\u029c\u02b5\u02bf\u02c4\u02ca\u02ea\u02ef\u02f4\u02f9"+
		"\u02fe\u0306\u030b\u0314\u0319\u0324\u032c\u0330\u0335\u0340\u0385\u0387"+
		"\u038f\u0397\u03a3\u03ab\u03b2\u03b5\u03c0\u03c5\u03cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}