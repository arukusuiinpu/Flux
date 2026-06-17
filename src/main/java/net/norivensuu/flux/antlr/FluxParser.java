// Generated from C:/Users/AlexN/Projects/IdeaProjects/Flux/src/main/antlr/Flux.g4 by ANTLR 4.13.2
package net.norivensuu.flux.antlr;
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
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, FIGURE_BRACKET_L=103, FIGURE_BRACKET_R=104, FSTRING_OPENING=105, 
		FSTRING_MIDDLE=106, FSTRING_CLOSING=107, NULL=108, CHAR=109, STRING=110, 
		FSTRING_EMPTY=111, INT=112, DECIMAL=113, BOOL=114, WILDCARD=115, VOID=116, 
		VAR=117, ID=118, SYMBOL=119, TERMINATOR=120, WS=121, SL_COMMENT=122, ML_COMMENT=123, 
		INDENT=124, DEDENT=125;
	public static final int
		RULE_program = 0, RULE_precompile = 1, RULE_declaration = 2, RULE_className = 3, 
		RULE_type = 4, RULE_terminator = 5, RULE_accessModifier = 6, RULE_unfinishedMd = 7, 
		RULE_implementationModifier = 8, RULE_staticMd = 9, RULE_finalMd = 10, 
		RULE_transientMd = 11, RULE_volatileMd = 12, RULE_synchronizedMd = 13, 
		RULE_nativeMd = 14, RULE_strictfpMd = 15, RULE_variableModifiers = 16, 
		RULE_localVarDecl = 17, RULE_functionModifiers = 18, RULE_annotation = 19, 
		RULE_formalParameters = 20, RULE_formalParameter = 21, RULE_classBlock = 22, 
		RULE_voidBlock = 23, RULE_returnBlock = 24, RULE_classLines = 25, RULE_voidLines = 26, 
		RULE_expressionLines = 27, RULE_lines = 28, RULE_block = 29, RULE_expressionReturn = 30, 
		RULE_voidReturn = 31, RULE_statement = 32, RULE_assignmentStat = 33, RULE_generator_for = 34, 
		RULE_fstring = 35, RULE_expression = 36, RULE_rangeToken = 37, RULE_expressionList = 38, 
		RULE_expressionDict = 39, RULE_dictElement = 40, RULE_kwargs = 41, RULE_kwarg = 42, 
		RULE_idList = 43, RULE_packedId = 44, RULE_qualifiedId = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "precompile", "declaration", "className", "type", "terminator", 
			"accessModifier", "unfinishedMd", "implementationModifier", "staticMd", 
			"finalMd", "transientMd", "volatileMd", "synchronizedMd", "nativeMd", 
			"strictfpMd", "variableModifiers", "localVarDecl", "functionModifiers", 
			"annotation", "formalParameters", "formalParameter", "classBlock", "voidBlock", 
			"returnBlock", "classLines", "voidLines", "expressionLines", "lines", 
			"block", "expressionReturn", "voidReturn", "statement", "assignmentStat", 
			"generator_for", "fstring", "expression", "rangeToken", "expressionList", 
			"expressionDict", "dictElement", "kwargs", "kwarg", "idList", "packedId", 
			"qualifiedId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'precompile'", "'import'", "'using'", "'static'", "'class'", "'interface'", 
			"'@interface'", "':'", "'extends'", "'implements'", "'('", "')'", "'<'", 
			"'>'", "','", "'>>'", "'>>>'", "'>>>>'", "'[]'", "'public'", "'protected'", 
			"'private'", "'unfinished'", "'illegal'", "'suboptimal'", "'unpolished'", 
			"'ugly'", "'abstract'", "'native'", "'final'", "'transient'", "'volatile'", 
			"'synchronized'", "'strictfp'", "'='", "'@'", "'return'", "'for'", "'foreach'", 
			"'in'", "'if'", "'else if'", "'elif'", "'else'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'&='", "'^='", "'|='", "'<<='", "'>>='", "'>>>='", "'**='", 
			"'***='", "'/%='", "'%/='", "'++'", "'--'", "'f'", "'***'", "'**'", "'['", 
			"']'", "'lambda'", "'->'", "'=>'", "':='", "'-'", "'.'", "'~~'", "'[['", 
			"']]'", "'..'", "'!'", "'not'", "'+'", "'~'", "'*'", "'/'", "'%'", "'mod'", 
			"'/%'", "'%/'", "'<<'", "'<='", "'>='", "'instanceof'", "'is'", "'=='", 
			"'!='", "'&'", "'^'", "'|'", "'&&'", "'and'", "'||'", "'or'", "'?'", 
			"'new'", null, null, null, null, null, null, null, null, null, null, 
			null, null, "'.*'", null, "'var'"
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
			null, null, null, null, null, null, null, "FIGURE_BRACKET_L", "FIGURE_BRACKET_R", 
			"FSTRING_OPENING", "FSTRING_MIDDLE", "FSTRING_CLOSING", "NULL", "CHAR", 
			"STRING", "FSTRING_EMPTY", "INT", "DECIMAL", "BOOL", "WILDCARD", "VOID", 
			"VAR", "ID", "SYMBOL", "TERMINATOR", "WS", "SL_COMMENT", "ML_COMMENT", 
			"INDENT", "DEDENT"
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
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					declaration();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(98);
				precompile();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070453796422027772L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 629299295404751429L) != 0)) {
				{
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(101);
					declaration();
					}
					break;
				case 2:
					{
					setState(102);
					statement();
					}
					break;
				case 3:
					{
					setState(103);
					terminator();
					}
					break;
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
			setState(111);
			match(T__0);
			setState(112);
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclContext extends DeclarationContext {
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
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public ClassDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclContext extends DeclarationContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public LocalVarDeclContext localVarDecl() {
			return getRuleContext(LocalVarDeclContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public VarDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclContext extends DeclarationContext {
		public Token wildcard;
		public Token static_;
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public TerminalNode WILDCARD() { return getToken(FluxParser.WILDCARD, 0); }
		public ImportDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class RunnableFunctionDeclContext extends DeclarationContext {
		public FunctionModifiersContext functionModifiers() {
			return getRuleContext(FunctionModifiersContext.class,0);
		}
		public TerminalNode VOID() { return getToken(FluxParser.VOID, 0); }
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public VoidBlockContext voidBlock() {
			return getRuleContext(VoidBlockContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public RunnableFunctionDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
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
	public static class VarFunctionDeclContext extends DeclarationContext {
		public FunctionModifiersContext functionModifiers() {
			return getRuleContext(FunctionModifiersContext.class,0);
		}
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
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
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public VarFunctionDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
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
	public static class ConsumerFunctionDeclContext extends DeclarationContext {
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
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public ConsumerFunctionDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
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

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new ImportDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(114);
					match(INDENT);
					}
				}

				setState(117);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				qualifiedId();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(119);
					((ImportDeclContext)_localctx).wildcard = match(WILDCARD);
					}
				}

				setState(123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(122);
					terminator();
					}
					break;
				}
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(125);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ImportDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(128);
					match(INDENT);
					}
				}

				setState(131);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(132);
				((ImportDeclContext)_localctx).static_ = match(T__3);
				setState(133);
				qualifiedId();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(134);
					((ImportDeclContext)_localctx).wildcard = match(WILDCARD);
					}
				}

				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
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
				_localctx = new ClassDeclContext(_localctx);
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

				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(143);
					annotation();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				functionModifiers();
				setState(150);
				((ClassDeclContext)_localctx).classWord = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
					((ClassDeclContext)_localctx).classWord = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
				((ClassDeclContext)_localctx).mainClass = className(0);
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(152);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__8) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(153);
					((ClassDeclContext)_localctx).extendsClass = className(0);
					}
					break;
				}
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(156);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(157);
					((ClassDeclContext)_localctx).implementsClass = className(0);
					}
					break;
				}
				setState(160);
				classBlock();
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(161);
					terminator();
					}
					break;
				}
				setState(165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(164);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new RunnableFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(167);
					match(INDENT);
					}
				}

				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(170);
					annotation();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				functionModifiers();
				setState(177);
				match(VOID);
				setState(178);
				match(ID);
				setState(179);
				match(T__10);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35 || _la==VAR || _la==ID) {
					{
					setState(180);
					formalParameters();
					}
				}

				setState(183);
				match(T__11);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TERMINATOR) {
					{
					setState(184);
					terminator();
					}
				}

				setState(187);
				voidBlock();
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(188);
					terminator();
					}
					break;
				}
				setState(192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(191);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new VarFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(194);
					match(INDENT);
					}
				}

				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(197);
					annotation();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				functionModifiers();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(204);
					match(VAR);
					}
				}

				setState(207);
				match(ID);
				setState(208);
				match(T__10);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35 || _la==VAR || _la==ID) {
					{
					setState(209);
					formalParameters();
					}
				}

				setState(212);
				match(T__11);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TERMINATOR) {
					{
					setState(213);
					terminator();
					}
				}

				setState(216);
				returnBlock();
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(217);
					terminator();
					}
					break;
				}
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(220);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new ConsumerFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(223);
					match(INDENT);
					}
				}

				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(226);
					annotation();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				functionModifiers();
				setState(233);
				type(0);
				setState(234);
				match(ID);
				setState(235);
				match(T__10);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35 || _la==VAR || _la==ID) {
					{
					setState(236);
					formalParameters();
					}
				}

				setState(239);
				match(T__11);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TERMINATOR) {
					{
					setState(240);
					terminator();
					}
				}

				setState(243);
				returnBlock();
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(244);
					terminator();
					}
					break;
				}
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(247);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(250);
					match(INDENT);
					}
				}

				setState(253);
				variableModifiers();
				setState(254);
				localVarDecl();
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(255);
					terminator();
					}
					break;
				}
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(258);
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
			setState(264);
			qualifiedId();
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_className);
					setState(266);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(267);
					match(T__12);
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(268);
						className(0);
						}
					}

					setState(271);
					match(T__13);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
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
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(278);
				match(VAR);
				}
				break;
			case ID:
				{
				setState(279);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(282);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(283);
						match(T__12);
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==VAR || _la==ID) {
							{
							setState(284);
							type(0);
							}
						}

						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__14) {
							{
							{
							setState(287);
							match(T__14);
							setState(288);
							type(0);
							}
							}
							setState(293);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(294);
						match(T__13);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(295);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(296);
						match(T__12);
						setState(297);
						type(0);
						setState(298);
						match(T__12);
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==VAR || _la==ID) {
							{
							setState(299);
							type(0);
							}
						}

						setState(306);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__14) {
							{
							{
							setState(302);
							match(T__14);
							setState(303);
							type(0);
							}
							}
							setState(308);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(309);
						match(T__15);
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(311);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(312);
						match(T__12);
						setState(313);
						type(0);
						setState(314);
						match(T__12);
						setState(315);
						type(0);
						setState(316);
						match(T__12);
						setState(318);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==VAR || _la==ID) {
							{
							setState(317);
							type(0);
							}
						}

						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__14) {
							{
							{
							setState(320);
							match(T__14);
							setState(321);
							type(0);
							}
							}
							setState(326);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(327);
						match(T__16);
						}
						break;
					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(329);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(330);
						match(T__12);
						setState(331);
						type(0);
						setState(332);
						match(T__12);
						setState(333);
						type(0);
						setState(334);
						match(T__12);
						setState(335);
						type(0);
						setState(336);
						match(T__12);
						setState(338);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==VAR || _la==ID) {
							{
							setState(337);
							type(0);
							}
						}

						setState(344);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__14) {
							{
							{
							setState(340);
							match(T__14);
							setState(341);
							type(0);
							}
							}
							setState(346);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(347);
						match(T__17);
						}
						break;
					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(349);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(350);
						match(T__18);
						setState(354);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(351);
								match(T__18);
								}
								} 
							}
							setState(356);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
			setState(363); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(362);
					match(TERMINATOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
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
			setState(369);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 260046848L) != 0)) ) {
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
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 805306384L) != 0)) ) {
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
			setState(373);
			match(T__3);
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
			setState(375);
			match(T__29);
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
			setState(377);
			match(T__30);
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
			setState(379);
			match(T__31);
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
			setState(381);
			match(T__32);
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
			setState(383);
			match(T__28);
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
			setState(385);
			match(T__33);
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
		enterRule(_localctx, 32, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				setState(387);
				accessModifier();
				}
			}

			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 260046848L) != 0)) {
				{
				setState(390);
				unfinishedMd();
				}
			}

			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(393);
				staticMd();
				}
			}

			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(396);
				finalMd();
				}
			}

			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(399);
				transientMd();
				}
			}

			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(402);
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
		public Token var;
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
		enterRule(_localctx, 34, RULE_localVarDecl);
		int _la;
		try {
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new LooselyTypedLocalVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(405);
					((LooselyTypedLocalVarContext)_localctx).var = match(VAR);
					}
				}

				setState(408);
				packedId();
				setState(409);
				match(T__34);
				setState(410);
				expression(0);
				}
				break;
			case 2:
				_localctx = new StrictlyTypedLocalVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				type(0);
				setState(413);
				packedId();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__34) {
					{
					setState(414);
					match(T__34);
					setState(415);
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
		enterRule(_localctx, 36, RULE_functionModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				setState(420);
				accessModifier();
				}
			}

			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 260046848L) != 0)) {
				{
				setState(423);
				unfinishedMd();
				}
			}

			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(426);
				implementationModifier();
				}
				break;
			}
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(429);
				finalMd();
				}
			}

			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(432);
				transientMd();
				}
			}

			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(435);
				volatileMd();
				}
			}

			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(438);
				synchronizedMd();
				}
			}

			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(441);
				nativeMd();
				}
			}

			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(444);
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
		enterRule(_localctx, 38, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__35);
			setState(448);
			expression(0);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(449);
				match(T__10);
				setState(450);
				expressionList();
				setState(451);
				match(T__11);
				}
			}

			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TERMINATOR) {
				{
				setState(455);
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
		enterRule(_localctx, 40, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			formalParameter();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(459);
				match(T__14);
				setState(460);
				formalParameter();
				}
				}
				setState(465);
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
		enterRule(_localctx, 42, RULE_formalParameter);
		int _la;
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(466);
					annotation();
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(472);
					type(0);
					}
					break;
				}
				setState(475);
				packedId();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(476);
					annotation();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(482);
				packedId();
				setState(483);
				match(T__7);
				setState(484);
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
		enterRule(_localctx, 44, RULE_classBlock);
		int _la;
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIGURE_BRACKET_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				match(FIGURE_BRACKET_L);
				setState(490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(489);
					match(INDENT);
					}
					break;
				}
				setState(492);
				classLines();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(493);
					match(DEDENT);
					}
				}

				setState(496);
				match(FIGURE_BRACKET_R);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(T__7);
				setState(499);
				match(INDENT);
				setState(500);
				classLines();
				setState(501);
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
		enterRule(_localctx, 46, RULE_voidBlock);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIGURE_BRACKET_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(FIGURE_BRACKET_L);
				setState(507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(506);
					match(INDENT);
					}
					break;
				}
				setState(509);
				voidLines();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(510);
					match(DEDENT);
					}
				}

				setState(513);
				match(FIGURE_BRACKET_R);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(T__7);
				setState(516);
				match(INDENT);
				setState(517);
				voidLines();
				setState(518);
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
		enterRule(_localctx, 48, RULE_returnBlock);
		int _la;
		try {
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIGURE_BRACKET_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(FIGURE_BRACKET_L);
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(523);
					match(INDENT);
					}
					break;
				}
				setState(526);
				expressionLines();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(527);
					match(DEDENT);
					}
				}

				setState(530);
				match(FIGURE_BRACKET_R);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				match(T__7);
				setState(533);
				match(INDENT);
				setState(534);
				expressionLines();
				setState(535);
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
		enterRule(_localctx, 50, RULE_classLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070453796422027772L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 629299295404751429L) != 0)) {
				{
				setState(542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(539);
					declaration();
					}
					break;
				case 2:
					{
					setState(540);
					statement();
					}
					break;
				case 3:
					{
					setState(541);
					terminator();
					}
					break;
				}
				}
				setState(546);
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
		enterRule(_localctx, 52, RULE_voidLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070453796422027772L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 629299295404751429L) != 0)) {
				{
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(547);
					statement();
					}
					break;
				case 2:
					{
					setState(548);
					voidReturn();
					}
					break;
				case 3:
					{
					setState(549);
					terminator();
					}
					break;
				}
				}
				setState(554);
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
		enterRule(_localctx, 54, RULE_expressionLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070453796422027772L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 629299295404751429L) != 0)) {
				{
				setState(558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(555);
					statement();
					}
					break;
				case 2:
					{
					setState(556);
					expressionReturn();
					}
					break;
				case 3:
					{
					setState(557);
					terminator();
					}
					break;
				}
				}
				setState(562);
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
		enterRule(_localctx, 56, RULE_lines);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				voidLines();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				classLines();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(565);
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
		enterRule(_localctx, 58, RULE_block);
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				_localctx = new VoidBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				voidBlock();
				}
				break;
			case 2:
				_localctx = new ReturnBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
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
		enterRule(_localctx, 60, RULE_expressionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__36);
			setState(573);
			expression(0);
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(574);
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
		enterRule(_localctx, 62, RULE_voidReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__36);
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(578);
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
	public static class DeclStatementContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(FluxParser.INDENT, 0); }
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(FluxParser.DEDENT, 0); }
		public DeclStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitDeclStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitDeclStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statement);
		int _la;
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				_localctx = new DeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(581);
					match(INDENT);
					}
					break;
				}
				setState(584);
				declaration();
				setState(586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(585);
					terminator();
					}
					break;
				}
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(588);
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
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(591);
					match(INDENT);
					}
				}

				setState(594);
				voidBlock();
				setState(596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(595);
					terminator();
					}
					break;
				}
				setState(599);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(598);
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
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(601);
					match(INDENT);
					}
				}

				setState(604);
				match(T__37);
				setState(605);
				match(T__10);
				setState(606);
				localVarDecl();
				setState(607);
				terminator();
				setState(608);
				expression(0);
				setState(609);
				terminator();
				setState(610);
				assignmentStat();
				setState(611);
				match(T__11);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(612);
					match(DEDENT);
					}
				}

				setState(615);
				block();
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(617);
					match(INDENT);
					}
				}

				setState(620);
				match(T__37);
				setState(621);
				localVarDecl();
				setState(622);
				terminator();
				setState(623);
				expression(0);
				setState(624);
				terminator();
				setState(625);
				assignmentStat();
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(626);
					match(DEDENT);
					}
				}

				setState(629);
				block();
				}
				break;
			case 5:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(631);
					match(INDENT);
					}
				}

				setState(634);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(635);
				match(T__10);
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(636);
					type(0);
					}
					break;
				}
				setState(639);
				packedId();
				setState(640);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__39) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(641);
				expression(0);
				setState(642);
				match(T__11);
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(643);
					match(DEDENT);
					}
				}

				setState(646);
				block();
				}
				break;
			case 6:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(648);
					match(INDENT);
					}
				}

				setState(651);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(652);
					type(0);
					}
					break;
				}
				setState(655);
				packedId();
				setState(656);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__39) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(657);
				expression(0);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(658);
					match(DEDENT);
					}
				}

				setState(661);
				block();
				}
				break;
			case 7:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(663);
					match(INDENT);
					}
				}

				setState(666);
				match(T__40);
				setState(667);
				expression(0);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEDENT) {
					{
					setState(668);
					match(DEDENT);
					}
				}

				setState(671);
				block();
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(672);
					terminator();
					}
					break;
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__41 || _la==T__42) {
					{
					{
					setState(675);
					_la = _input.LA(1);
					if ( !(_la==T__41 || _la==T__42) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(676);
					expression(0);
					setState(677);
					block();
					}
					}
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(685);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(684);
					terminator();
					}
					break;
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(687);
					match(T__43);
					setState(688);
					((IfStatementContext)_localctx).else_ = block();
					}
				}

				}
				break;
			case 8:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(691);
					match(INDENT);
					}
				}

				setState(694);
				assignmentStat();
				setState(696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(695);
					terminator();
					}
					break;
				}
				setState(699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(698);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(701);
					match(INDENT);
					}
				}

				setState(704);
				expression(0);
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(705);
					terminator();
					}
					break;
				}
				setState(709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(708);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new ExpressionReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(711);
					match(INDENT);
					}
				}

				setState(714);
				expressionReturn();
				setState(716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(715);
					match(DEDENT);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new VoidReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INDENT) {
					{
					setState(718);
					match(INDENT);
					}
				}

				setState(721);
				voidReturn();
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(722);
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
		public ExpressionContext as;
		public Token operator;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public ExpressionContext as;
		public Token operator;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public ExpressionContext as;
		public Token operator;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public ExpressionContext as;
		public Token operator;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		public ExpressionContext as;
		public Token operator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public ExpressionContext as;
		public Token operator;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 66, RULE_assignmentStat);
		int _la;
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				_localctx = new DefaultAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				((DefaultAssigmnentContext)_localctx).as = expression(0);
				setState(728);
				((DefaultAssigmnentContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 72022444025577472L) != 0)) ) {
					((DefaultAssigmnentContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(729);
				((DefaultAssigmnentContext)_localctx).value = expression(0);
				}
				break;
			case 2:
				_localctx = new ExpAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				((ExpAssigmnentContext)_localctx).as = expression(0);
				setState(732);
				((ExpAssigmnentContext)_localctx).operator = match(T__55);
				setState(733);
				((ExpAssigmnentContext)_localctx).value = expression(0);
				}
				break;
			case 3:
				_localctx = new TetrAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				((TetrAssigmnentContext)_localctx).as = expression(0);
				setState(736);
				((TetrAssigmnentContext)_localctx).operator = match(T__56);
				setState(737);
				((TetrAssigmnentContext)_localctx).value = expression(0);
				}
				break;
			case 4:
				_localctx = new FloorDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(739);
				((FloorDivAssigmnentContext)_localctx).as = expression(0);
				setState(740);
				((FloorDivAssigmnentContext)_localctx).operator = match(T__57);
				setState(741);
				((FloorDivAssigmnentContext)_localctx).value = expression(0);
				}
				break;
			case 5:
				_localctx = new CeilDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(743);
				((CeilDivAssigmnentContext)_localctx).as = expression(0);
				setState(744);
				((CeilDivAssigmnentContext)_localctx).operator = match(T__58);
				setState(745);
				((CeilDivAssigmnentContext)_localctx).value = expression(0);
				}
				break;
			case 6:
				_localctx = new UnaryAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(747);
				((UnaryAssigmnentContext)_localctx).as = expression(0);
				setState(748);
				((UnaryAssigmnentContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__59 || _la==T__60) ) {
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
		enterRule(_localctx, 68, RULE_generator_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(T__37);
			setState(753);
			((Generator_forContext)_localctx).iterId = packedId();
			setState(754);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__39) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(755);
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
		enterRule(_localctx, 70, RULE_fstring);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(T__61);
			setState(758);
			match(FSTRING_OPENING);
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(759);
				expression(0);
				}
				break;
			}
			setState(771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(765);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(762);
							match(FSTRING_MIDDLE);
							}
							} 
						}
						setState(767);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
					}
					setState(768);
					expression(0);
					}
					} 
				}
				setState(773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			setState(774);
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
	public static class ApproximatelyExprContext extends ExpressionContext {
		public Token minus;
		public ExpressionContext neg_precision;
		public Token operator;
		public ExpressionContext precision;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ApproximatelyExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterApproximatelyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitApproximatelyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitApproximatelyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeExprContext extends ExpressionContext {
		public RangeTokenContext first;
		public RangeTokenContext second;
		public RangeTokenContext third;
		public List<RangeTokenContext> rangeToken() {
			return getRuleContexts(RangeTokenContext.class);
		}
		public RangeTokenContext rangeToken(int i) {
			return getRuleContext(RangeTokenContext.class,i);
		}
		public RangeExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterRangeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitRangeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitRangeExpr(this);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(777);
				match(T__66);
				{
				setState(778);
				idList();
				}
				setState(779);
				match(T__7);
				setState(780);
				expression(44);
				}
				break;
			case 2:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(782);
				match(T__10);
				{
				setState(783);
				idList();
				}
				setState(784);
				match(T__11);
				setState(785);
				_la = _input.LA(1);
				if ( !(_la==T__67 || _la==T__68) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(786);
				expression(43);
				}
				break;
			case 3:
				{
				_localctx = new WalrusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(788);
				qualifiedId();
				setState(789);
				((WalrusExprContext)_localctx).operator = match(T__69);
				setState(790);
				expression(42);
				}
				break;
			case 4:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(792);
				match(T__10);
				setState(793);
				type(0);
				setState(794);
				match(T__11);
				setState(795);
				expression(38);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(797);
				match(T__10);
				setState(798);
				expression(0);
				setState(799);
				match(T__11);
				}
				break;
			case 6:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(801);
				match(T__73);
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247930880L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 10054346641308229L) != 0)) {
					{
					setState(802);
					expressionList();
					}
				}

				setState(805);
				match(T__74);
				}
				break;
			case 7:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(806);
				match(T__64);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247930880L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 10054346641308229L) != 0)) {
					{
					setState(807);
					expressionList();
					}
				}

				setState(810);
				match(T__65);
				}
				break;
			case 8:
				{
				_localctx = new SetExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(811);
				match(FIGURE_BRACKET_L);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247930880L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 10054346641308229L) != 0)) {
					{
					setState(812);
					expressionList();
					}
				}

				setState(815);
				match(FIGURE_BRACKET_R);
				}
				break;
			case 9:
				{
				_localctx = new TupleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(816);
				match(T__10);
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247930880L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 10054346641308229L) != 0)) {
					{
					setState(817);
					expressionList();
					}
				}

				setState(820);
				match(T__11);
				}
				break;
			case 10:
				{
				_localctx = new DictExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(821);
				match(FIGURE_BRACKET_L);
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247930880L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 10054346641308229L) != 0)) {
					{
					setState(822);
					expressionDict();
					}
				}

				setState(825);
				match(FIGURE_BRACKET_R);
				}
				break;
			case 11:
				{
				_localctx = new RangeExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT || _la==ID) {
					{
					setState(826);
					((RangeExprContext)_localctx).first = rangeToken();
					}
				}

				setState(829);
				match(T__75);
				setState(830);
				((RangeExprContext)_localctx).second = rangeToken();
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(831);
					match(T__75);
					setState(832);
					((RangeExprContext)_localctx).third = rangeToken();
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new GeneratorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(835);
				match(T__64);
				setState(836);
				((GeneratorExprContext)_localctx).blk = block();
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(837);
					generator_for();
					}
					}
					setState(842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(843);
					match(T__40);
					setState(844);
					((GeneratorExprContext)_localctx).filter = expression(0);
					}
				}

				setState(847);
				match(T__65);
				}
				break;
			case 13:
				{
				_localctx = new GeneratorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(849);
				match(T__64);
				setState(850);
				((GeneratorExprContext)_localctx).item = expression(0);
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37) {
					{
					{
					setState(851);
					generator_for();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(857);
					match(T__40);
					setState(858);
					((GeneratorExprContext)_localctx).filter = expression(0);
					}
				}

				setState(861);
				match(T__65);
				}
				break;
			case 14:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(870);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__76:
					{
					setState(863);
					match(T__76);
					setState(864);
					expression(0);
					}
					break;
				case T__77:
					{
					setState(865);
					match(T__77);
					setState(866);
					match(T__10);
					setState(867);
					expression(0);
					setState(868);
					match(T__11);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(872);
				((UnaryExprContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 1574915L) != 0)) ) {
					((UnaryExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(873);
				expression(26);
				}
				break;
			case 16:
				{
				_localctx = new CreationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(874);
				match(T__101);
				setState(875);
				type(0);
				setState(876);
				match(T__10);
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247930880L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 10054346641308229L) != 0)) {
					{
					setState(877);
					expressionList();
					}
				}

				setState(880);
				match(T__11);
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(881);
					block();
					}
					break;
				}
				}
				break;
			case 17:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(884);
				match(ID);
				setState(885);
				match(T__10);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247930880L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 10054346641308229L) != 0)) {
					{
					setState(886);
					kwargs();
					}
				}

				setState(889);
				match(T__11);
				}
				break;
			case 18:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(890);
				qualifiedId();
				}
				break;
			case 19:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(891);
				match(INT);
				}
				break;
			case 20:
				{
				_localctx = new DecimalExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(892);
				match(DECIMAL);
				}
				break;
			case 21:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(893);
				match(BOOL);
				}
				break;
			case 22:
				{
				_localctx = new FStringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(894);
				fstring();
				}
				break;
			case 23:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(895);
				match(STRING);
				}
				break;
			case 24:
				{
				_localctx = new CharExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(896);
				match(CHAR);
				}
				break;
			case 25:
				{
				_localctx = new NullExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(897);
				match(NULL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(990);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(988);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
					case 1:
						{
						_localctx = new TetrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(900);
						if (!(precpred(_ctx, 47))) throw new FailedPredicateException(this, "precpred(_ctx, 47)");
						setState(901);
						match(T__62);
						setState(902);
						expression(47);
						}
						break;
					case 2:
						{
						_localctx = new ExpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(903);
						if (!(precpred(_ctx, 46))) throw new FailedPredicateException(this, "precpred(_ctx, 46)");
						setState(904);
						match(T__63);
						setState(905);
						expression(46);
						}
						break;
					case 3:
						{
						_localctx = new ApproximatelyExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(906);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(913);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450532247930880L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 10054346641308229L) != 0)) {
							{
							setState(908);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
							case 1:
								{
								setState(907);
								((ApproximatelyExprContext)_localctx).minus = match(T__70);
								}
								break;
							}
							setState(910);
							((ApproximatelyExprContext)_localctx).neg_precision = expression(0);
							setState(911);
							match(T__71);
							}
						}

						setState(915);
						((ApproximatelyExprContext)_localctx).operator = match(T__72);
						setState(916);
						expression(42);
						}
						break;
					case 4:
						{
						_localctx = new ApproximatelyExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(917);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(918);
						((ApproximatelyExprContext)_localctx).operator = match(T__72);
						setState(924);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__71) {
							{
							setState(919);
							match(T__71);
							setState(921);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
							case 1:
								{
								setState(920);
								((ApproximatelyExprContext)_localctx).minus = match(T__70);
								}
								break;
							}
							setState(923);
							((ApproximatelyExprContext)_localctx).precision = expression(0);
							}
						}

						setState(926);
						expression(41);
						}
						break;
					case 5:
						{
						_localctx = new VariableAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						((VariableAccessExprContext)_localctx).acc = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(927);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(928);
						match(T__71);
						setState(929);
						((VariableAccessExprContext)_localctx).variable = expression(40);
						}
						break;
					case 6:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(930);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(931);
						((MulDivExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 15L) != 0)) ) {
							((MulDivExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(932);
						expression(26);
						}
						break;
					case 7:
						{
						_localctx = new FloorDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(933);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(934);
						((FloorDivExprContext)_localctx).operator = match(T__84);
						setState(935);
						expression(25);
						}
						break;
					case 8:
						{
						_localctx = new CeilDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(936);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(937);
						((CeilDivExprContext)_localctx).operator = match(T__85);
						setState(938);
						expression(24);
						}
						break;
					case 9:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(939);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(940);
						((AddSubExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__70 || _la==T__78) ) {
							((AddSubExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(941);
						expression(23);
						}
						break;
					case 10:
						{
						_localctx = new ShiftExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(942);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(943);
						((ShiftExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16 || _la==T__86) ) {
							((ShiftExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(944);
						expression(22);
						}
						break;
					case 11:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(945);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(946);
						((RelationalExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13 || _la==T__87 || _la==T__88) ) {
							((RelationalExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(947);
						expression(21);
						}
						break;
					case 12:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(948);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(949);
						((RelationalExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__89 || _la==T__90) ) {
							((RelationalExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(950);
						expression(20);
						}
						break;
					case 13:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(951);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(952);
						((EqualityExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__91 || _la==T__92) ) {
							((EqualityExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(953);
						expression(19);
						}
						break;
					case 14:
						{
						_localctx = new BitwiseANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(954);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(955);
						match(T__93);
						setState(956);
						expression(18);
						}
						break;
					case 15:
						{
						_localctx = new BitwiseXORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(957);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(958);
						match(T__94);
						setState(959);
						expression(17);
						}
						break;
					case 16:
						{
						_localctx = new BitwiseORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(960);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(961);
						match(T__95);
						setState(962);
						expression(16);
						}
						break;
					case 17:
						{
						_localctx = new LogicalANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(963);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(964);
						_la = _input.LA(1);
						if ( !(_la==T__96 || _la==T__97) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(965);
						expression(15);
						}
						break;
					case 18:
						{
						_localctx = new LogicalORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(966);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(967);
						_la = _input.LA(1);
						if ( !(_la==T__98 || _la==T__99) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(968);
						expression(14);
						}
						break;
					case 19:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(969);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(970);
						match(T__100);
						setState(971);
						((TernaryExprContext)_localctx).true_ = expression(0);
						setState(972);
						match(T__7);
						setState(973);
						((TernaryExprContext)_localctx).false_ = expression(13);
						}
						break;
					case 20:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).true_ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(975);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(976);
						match(T__40);
						setState(977);
						((TernaryExprContext)_localctx).condition = expression(0);
						setState(978);
						match(T__43);
						setState(979);
						((TernaryExprContext)_localctx).false_ = expression(12);
						}
						break;
					case 21:
						{
						_localctx = new ArrayAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayAccessExprContext)_localctx).collection = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(981);
						if (!(precpred(_ctx, 45))) throw new FailedPredicateException(this, "precpred(_ctx, 45)");
						setState(982);
						match(T__64);
						setState(983);
						((ArrayAccessExprContext)_localctx).element = expression(0);
						setState(984);
						match(T__65);
						}
						break;
					case 22:
						{
						_localctx = new PostfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(986);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(987);
						((PostfixExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__59 || _la==T__60) ) {
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
				setState(992);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
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
	public static class RangeTokenContext extends ParserRuleContext {
		public RangeTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeToken; }
	 
		public RangeTokenContext() { }
		public void copyFrom(RangeTokenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeIdExprContext extends RangeTokenContext {
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public RangeIdExprContext(RangeTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterRangeIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitRangeIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitRangeIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeIntExprContext extends RangeTokenContext {
		public TerminalNode INT() { return getToken(FluxParser.INT, 0); }
		public RangeIntExprContext(RangeTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterRangeIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitRangeIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitRangeIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeTokenContext rangeToken() throws RecognitionException {
		RangeTokenContext _localctx = new RangeTokenContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rangeToken);
		try {
			setState(995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new RangeIdExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				qualifiedId();
				}
				break;
			case INT:
				_localctx = new RangeIntExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(INT);
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
		enterRule(_localctx, 76, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			expression(0);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(998);
				match(T__14);
				setState(999);
				expression(0);
				}
				}
				setState(1004);
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
		enterRule(_localctx, 78, RULE_expressionDict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			dictElement();
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(1006);
				match(T__14);
				setState(1007);
				dictElement();
				}
				}
				setState(1012);
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
		enterRule(_localctx, 80, RULE_dictElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			((DictElementContext)_localctx).key = expression(0);
			setState(1014);
			match(T__7);
			setState(1015);
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
		enterRule(_localctx, 82, RULE_kwargs);
		int _la;
		try {
			int _alt;
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				kwarg();
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1018);
					match(T__14);
					setState(1019);
					kwarg();
					}
					}
					setState(1024);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				expression(0);
				setState(1030);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1026);
						match(T__14);
						setState(1027);
						expression(0);
						}
						} 
					}
					setState(1032);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1033);
					match(T__14);
					setState(1034);
					kwarg();
					}
					}
					setState(1039);
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
		enterRule(_localctx, 84, RULE_kwarg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(ID);
			setState(1043);
			match(T__34);
			setState(1044);
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
		enterRule(_localctx, 86, RULE_idList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(ID);
			setState(1051);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1047);
					match(T__14);
					setState(1048);
					match(ID);
					}
					} 
				}
				setState(1053);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
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
		enterRule(_localctx, 88, RULE_packedId);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
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
		enterRule(_localctx, 90, RULE_qualifiedId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(ID);
			setState(1063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1059);
					match(T__71);
					setState(1060);
					match(ID);
					}
					} 
				}
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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
		case 36:
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
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 47);
		case 7:
			return precpred(_ctx, 46);
		case 8:
			return precpred(_ctx, 41);
		case 9:
			return precpred(_ctx, 40);
		case 10:
			return precpred(_ctx, 39);
		case 11:
			return precpred(_ctx, 25);
		case 12:
			return precpred(_ctx, 24);
		case 13:
			return precpred(_ctx, 23);
		case 14:
			return precpred(_ctx, 22);
		case 15:
			return precpred(_ctx, 21);
		case 16:
			return precpred(_ctx, 20);
		case 17:
			return precpred(_ctx, 19);
		case 18:
			return precpred(_ctx, 18);
		case 19:
			return precpred(_ctx, 17);
		case 20:
			return precpred(_ctx, 16);
		case 21:
			return precpred(_ctx, 15);
		case 22:
			return precpred(_ctx, 14);
		case 23:
			return precpred(_ctx, 13);
		case 24:
			return precpred(_ctx, 12);
		case 25:
			return precpred(_ctx, 11);
		case 26:
			return precpred(_ctx, 45);
		case 27:
			return precpred(_ctx, 31);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001}\u042b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t\u0000\u0001"+
		"\u0000\u0003\u0000d\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000i\b\u0000\n\u0000\f\u0000l\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002t\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002y\b\u0002\u0001\u0002\u0003"+
		"\u0002|\b\u0002\u0001\u0002\u0003\u0002\u007f\b\u0002\u0001\u0002\u0003"+
		"\u0002\u0082\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0088\b\u0002\u0001\u0002\u0003\u0002\u008b\b\u0002\u0001\u0002"+
		"\u0003\u0002\u008e\b\u0002\u0001\u0002\u0005\u0002\u0091\b\u0002\n\u0002"+
		"\f\u0002\u0094\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u009b\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u009f\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a3\b\u0002\u0001"+
		"\u0002\u0003\u0002\u00a6\b\u0002\u0001\u0002\u0003\u0002\u00a9\b\u0002"+
		"\u0001\u0002\u0005\u0002\u00ac\b\u0002\n\u0002\f\u0002\u00af\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00b6"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ba\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00be\b\u0002\u0001\u0002\u0003\u0002\u00c1\b"+
		"\u0002\u0001\u0002\u0003\u0002\u00c4\b\u0002\u0001\u0002\u0005\u0002\u00c7"+
		"\b\u0002\n\u0002\f\u0002\u00ca\t\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00ce\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00d3\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00d7\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00db\b\u0002\u0001\u0002\u0003\u0002\u00de\b\u0002"+
		"\u0001\u0002\u0003\u0002\u00e1\b\u0002\u0001\u0002\u0005\u0002\u00e4\b"+
		"\u0002\n\u0002\f\u0002\u00e7\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00ee\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00f2\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f6\b"+
		"\u0002\u0001\u0002\u0003\u0002\u00f9\b\u0002\u0001\u0002\u0003\u0002\u00fc"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0101\b\u0002"+
		"\u0001\u0002\u0003\u0002\u0104\b\u0002\u0003\u0002\u0106\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u010e\b\u0003\u0001\u0003\u0005\u0003\u0111\b\u0003\n\u0003\f\u0003"+
		"\u0114\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0119\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u011e\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u0122\b\u0004\n\u0004\f\u0004\u0125\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u012d\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0131\b"+
		"\u0004\n\u0004\f\u0004\u0134\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u013f\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0143\b"+
		"\u0004\n\u0004\f\u0004\u0146\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0153\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0157\b\u0004\n\u0004\f\u0004\u015a\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0161\b\u0004\n"+
		"\u0004\f\u0004\u0164\t\u0004\u0005\u0004\u0166\b\u0004\n\u0004\f\u0004"+
		"\u0169\t\u0004\u0001\u0005\u0004\u0005\u016c\b\u0005\u000b\u0005\f\u0005"+
		"\u016d\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0003\u0010\u0185\b\u0010\u0001\u0010\u0003\u0010\u0188\b\u0010"+
		"\u0001\u0010\u0003\u0010\u018b\b\u0010\u0001\u0010\u0003\u0010\u018e\b"+
		"\u0010\u0001\u0010\u0003\u0010\u0191\b\u0010\u0001\u0010\u0003\u0010\u0194"+
		"\b\u0010\u0001\u0011\u0003\u0011\u0197\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u01a1\b\u0011\u0003\u0011\u01a3\b\u0011\u0001\u0012\u0003"+
		"\u0012\u01a6\b\u0012\u0001\u0012\u0003\u0012\u01a9\b\u0012\u0001\u0012"+
		"\u0003\u0012\u01ac\b\u0012\u0001\u0012\u0003\u0012\u01af\b\u0012\u0001"+
		"\u0012\u0003\u0012\u01b2\b\u0012\u0001\u0012\u0003\u0012\u01b5\b\u0012"+
		"\u0001\u0012\u0003\u0012\u01b8\b\u0012\u0001\u0012\u0003\u0012\u01bb\b"+
		"\u0012\u0001\u0012\u0003\u0012\u01be\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01c6\b\u0013\u0001"+
		"\u0013\u0003\u0013\u01c9\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u01ce\b\u0014\n\u0014\f\u0014\u01d1\t\u0014\u0001\u0015\u0005\u0015"+
		"\u01d4\b\u0015\n\u0015\f\u0015\u01d7\t\u0015\u0001\u0015\u0003\u0015\u01da"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01de\b\u0015\n\u0015\f\u0015"+
		"\u01e1\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01e7\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u01eb\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u01ef\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01f8"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u01fc\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0200\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0209\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u020d\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0211\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u021a\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u021f\b\u0019\n\u0019\f\u0019\u0222"+
		"\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0227\b\u001a"+
		"\n\u001a\f\u001a\u022a\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u022f\b\u001b\n\u001b\f\u001b\u0232\t\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0237\b\u001c\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u023b\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0240\b"+
		"\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0244\b\u001f\u0001 \u0003"+
		" \u0247\b \u0001 \u0001 \u0003 \u024b\b \u0001 \u0003 \u024e\b \u0001"+
		" \u0003 \u0251\b \u0001 \u0001 \u0003 \u0255\b \u0001 \u0003 \u0258\b"+
		" \u0001 \u0003 \u025b\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0266\b \u0001 \u0001 \u0001 \u0003 \u026b\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0274\b \u0001 \u0001"+
		" \u0001 \u0003 \u0279\b \u0001 \u0001 \u0001 \u0003 \u027e\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u0285\b \u0001 \u0001 \u0001 \u0003 \u028a"+
		"\b \u0001 \u0001 \u0003 \u028e\b \u0001 \u0001 \u0001 \u0001 \u0003 \u0294"+
		"\b \u0001 \u0001 \u0001 \u0003 \u0299\b \u0001 \u0001 \u0001 \u0003 \u029e"+
		"\b \u0001 \u0001 \u0003 \u02a2\b \u0001 \u0001 \u0001 \u0001 \u0005 \u02a8"+
		"\b \n \f \u02ab\t \u0001 \u0003 \u02ae\b \u0001 \u0001 \u0003 \u02b2\b"+
		" \u0001 \u0003 \u02b5\b \u0001 \u0001 \u0003 \u02b9\b \u0001 \u0003 \u02bc"+
		"\b \u0001 \u0003 \u02bf\b \u0001 \u0001 \u0003 \u02c3\b \u0001 \u0003"+
		" \u02c6\b \u0001 \u0003 \u02c9\b \u0001 \u0001 \u0003 \u02cd\b \u0001"+
		" \u0003 \u02d0\b \u0001 \u0001 \u0003 \u02d4\b \u0003 \u02d6\b \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u02ef\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0003#\u02f9\b#\u0001#\u0005#\u02fc\b#\n#\f#\u02ff"+
		"\t#\u0001#\u0005#\u0302\b#\n#\f#\u0305\t#\u0001#\u0001#\u0001$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0324\b$\u0001$\u0001$\u0001"+
		"$\u0003$\u0329\b$\u0001$\u0001$\u0001$\u0003$\u032e\b$\u0001$\u0001$\u0001"+
		"$\u0003$\u0333\b$\u0001$\u0001$\u0001$\u0003$\u0338\b$\u0001$\u0001$\u0003"+
		"$\u033c\b$\u0001$\u0001$\u0001$\u0001$\u0003$\u0342\b$\u0001$\u0001$\u0001"+
		"$\u0005$\u0347\b$\n$\f$\u034a\t$\u0001$\u0001$\u0003$\u034e\b$\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0005$\u0355\b$\n$\f$\u0358\t$\u0001$\u0001"+
		"$\u0003$\u035c\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u0367\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u036f\b$\u0001$\u0001$\u0003$\u0373\b$\u0001$\u0001$\u0001$\u0003$\u0378"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u0383\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u038d\b$\u0001$\u0001$\u0001$\u0003$\u0392\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u039a\b$\u0001$\u0003$\u039d\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u03dd\b$\n$\f$\u03e0\t$\u0001%\u0001%\u0003%\u03e4\b%\u0001&\u0001&"+
		"\u0001&\u0005&\u03e9\b&\n&\f&\u03ec\t&\u0001\'\u0001\'\u0001\'\u0005\'"+
		"\u03f1\b\'\n\'\f\'\u03f4\t\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0005)\u03fd\b)\n)\f)\u0400\t)\u0001)\u0001)\u0001)\u0005)\u0405"+
		"\b)\n)\f)\u0408\t)\u0001)\u0001)\u0005)\u040c\b)\n)\f)\u040f\t)\u0003"+
		")\u0411\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0005+\u041a"+
		"\b+\n+\f+\u041d\t+\u0001,\u0001,\u0003,\u0421\b,\u0001-\u0001-\u0001-"+
		"\u0005-\u0426\b-\n-\f-\u0429\t-\u0001-\u0003\u02fd\u0303\u0427\u0003\u0006"+
		"\bH.\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u0016\u0001\u0000"+
		"\u0002\u0003\u0001\u0000\u0005\u0007\u0001\u0000\b\t\u0002\u0000\b\b\n"+
		"\n\u0001\u0000\u0014\u0016\u0001\u0000\u0017\u001b\u0002\u0000\u0004\u0004"+
		"\u001c\u001d\u0001\u0000&\'\u0002\u0000\b\b((\u0001\u0000*+\u0002\u0000"+
		"##-7\u0001\u0000<=\u0001\u0000DE\u0003\u0000<=GGOP\u0001\u0000QT\u0002"+
		"\u0000GGOO\u0002\u0000\u0010\u0011WW\u0002\u0000\r\u000eXY\u0001\u0000"+
		"Z[\u0001\u0000\\]\u0001\u0000ab\u0001\u0000cd\u04e9\u0000_\u0001\u0000"+
		"\u0000\u0000\u0002o\u0001\u0000\u0000\u0000\u0004\u0105\u0001\u0000\u0000"+
		"\u0000\u0006\u0107\u0001\u0000\u0000\u0000\b\u0118\u0001\u0000\u0000\u0000"+
		"\n\u016b\u0001\u0000\u0000\u0000\f\u016f\u0001\u0000\u0000\u0000\u000e"+
		"\u0171\u0001\u0000\u0000\u0000\u0010\u0173\u0001\u0000\u0000\u0000\u0012"+
		"\u0175\u0001\u0000\u0000\u0000\u0014\u0177\u0001\u0000\u0000\u0000\u0016"+
		"\u0179\u0001\u0000\u0000\u0000\u0018\u017b\u0001\u0000\u0000\u0000\u001a"+
		"\u017d\u0001\u0000\u0000\u0000\u001c\u017f\u0001\u0000\u0000\u0000\u001e"+
		"\u0181\u0001\u0000\u0000\u0000 \u0184\u0001\u0000\u0000\u0000\"\u01a2"+
		"\u0001\u0000\u0000\u0000$\u01a5\u0001\u0000\u0000\u0000&\u01bf\u0001\u0000"+
		"\u0000\u0000(\u01ca\u0001\u0000\u0000\u0000*\u01e6\u0001\u0000\u0000\u0000"+
		",\u01f7\u0001\u0000\u0000\u0000.\u0208\u0001\u0000\u0000\u00000\u0219"+
		"\u0001\u0000\u0000\u00002\u0220\u0001\u0000\u0000\u00004\u0228\u0001\u0000"+
		"\u0000\u00006\u0230\u0001\u0000\u0000\u00008\u0236\u0001\u0000\u0000\u0000"+
		":\u023a\u0001\u0000\u0000\u0000<\u023c\u0001\u0000\u0000\u0000>\u0241"+
		"\u0001\u0000\u0000\u0000@\u02d5\u0001\u0000\u0000\u0000B\u02ee\u0001\u0000"+
		"\u0000\u0000D\u02f0\u0001\u0000\u0000\u0000F\u02f5\u0001\u0000\u0000\u0000"+
		"H\u0382\u0001\u0000\u0000\u0000J\u03e3\u0001\u0000\u0000\u0000L\u03e5"+
		"\u0001\u0000\u0000\u0000N\u03ed\u0001\u0000\u0000\u0000P\u03f5\u0001\u0000"+
		"\u0000\u0000R\u0410\u0001\u0000\u0000\u0000T\u0412\u0001\u0000\u0000\u0000"+
		"V\u0416\u0001\u0000\u0000\u0000X\u0420\u0001\u0000\u0000\u0000Z\u0422"+
		"\u0001\u0000\u0000\u0000\\^\u0003\u0004\u0002\u0000]\\\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bd\u0003"+
		"\u0002\u0001\u0000cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"dj\u0001\u0000\u0000\u0000ei\u0003\u0004\u0002\u0000fi\u0003@ \u0000g"+
		"i\u0003\n\u0005\u0000he\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mn\u0005\u0000\u0000\u0001n\u0001\u0001\u0000\u0000\u0000"+
		"op\u0005\u0001\u0000\u0000pq\u0003,\u0016\u0000q\u0003\u0001\u0000\u0000"+
		"\u0000rt\u0005|\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0007\u0000\u0000\u0000vx\u0003Z-\u0000"+
		"wy\u0005s\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y{\u0001\u0000\u0000\u0000z|\u0003\n\u0005\u0000{z\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}\u007f\u0005}\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0106\u0001\u0000\u0000\u0000\u0080\u0082\u0005|\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0000\u0000\u0000\u0084\u0085"+
		"\u0005\u0004\u0000\u0000\u0085\u0087\u0003Z-\u0000\u0086\u0088\u0005s"+
		"\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u008b\u0005}\u0000"+
		"\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u0106\u0001\u0000\u0000\u0000\u008c\u008e\u0005|\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0092\u0001\u0000\u0000\u0000\u008f\u0091\u0003&\u0013\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0003$\u0012\u0000\u0096\u0097\u0007\u0001\u0000\u0000\u0097\u009a"+
		"\u0003\u0006\u0003\u0000\u0098\u0099\u0007\u0002\u0000\u0000\u0099\u009b"+
		"\u0003\u0006\u0003\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0007\u0003\u0000\u0000\u009d\u009f\u0003\u0006\u0003\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003,\u0016\u0000\u00a1\u00a3\u0003"+
		"\n\u0005\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005}\u0000"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a6\u0106\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005|\u0000\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ad\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003&\u0013\u0000\u00ab"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0003$\u0012\u0000\u00b1\u00b2\u0005t\u0000\u0000\u00b2\u00b3\u0005"+
		"v\u0000\u0000\u00b3\u00b5\u0005\u000b\u0000\u0000\u00b4\u00b6\u0003(\u0014"+
		"\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\f\u0000\u0000"+
		"\u00b8\u00ba\u0003\n\u0005\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bd\u0003.\u0017\u0000\u00bc\u00be\u0003\n\u0005\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c1\u0005}\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u0106\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c4\u0005|\u0000\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0003&\u0013\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cd\u0003$\u0012\u0000"+
		"\u00cc\u00ce\u0005u\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005v\u0000\u0000\u00d0\u00d2\u0005\u000b\u0000\u0000\u00d1\u00d3"+
		"\u0003(\u0014\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005"+
		"\f\u0000\u0000\u00d5\u00d7\u0003\n\u0005\u0000\u00d6\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00da\u00030\u0018\u0000\u00d9\u00db\u0003\n\u0005"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000"+
		"\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00de\u0005}\u0000\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000"+
		"\u00de\u0106\u0001\u0000\u0000\u0000\u00df\u00e1\u0005|\u0000\u0000\u00e0"+
		"\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003&\u0013\u0000\u00e3\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0003$\u0012\u0000\u00e9\u00ea\u0003\b\u0004\u0000\u00ea\u00eb\u0005"+
		"v\u0000\u0000\u00eb\u00ed\u0005\u000b\u0000\u0000\u00ec\u00ee\u0003(\u0014"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0005\f\u0000\u0000"+
		"\u00f0\u00f2\u0003\n\u0005\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f5\u00030\u0018\u0000\u00f4\u00f6\u0003\n\u0005\u0000\u00f5\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005}\u0000\u0000\u00f8\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u0106\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fc\u0005|\u0000\u0000\u00fb\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0003 \u0010\u0000\u00fe\u0100\u0003\"\u0011"+
		"\u0000\u00ff\u0101\u0003\n\u0005\u0000\u0100\u00ff\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000"+
		"\u0102\u0104\u0005}\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105"+
		"s\u0001\u0000\u0000\u0000\u0105\u0081\u0001\u0000\u0000\u0000\u0105\u008d"+
		"\u0001\u0000\u0000\u0000\u0105\u00a8\u0001\u0000\u0000\u0000\u0105\u00c3"+
		"\u0001\u0000\u0000\u0000\u0105\u00e0\u0001\u0000\u0000\u0000\u0105\u00fb"+
		"\u0001\u0000\u0000\u0000\u0106\u0005\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0006\u0003\uffff\uffff\u0000\u0108\u0109\u0003Z-\u0000\u0109\u0112\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\n\u0002\u0000\u0000\u010b\u010d\u0005\r"+
		"\u0000\u0000\u010c\u010e\u0003\u0006\u0003\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u0111\u0005\u000e\u0000\u0000\u0110\u010a\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0007\u0001\u0000"+
		"\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0006\u0004"+
		"\uffff\uffff\u0000\u0116\u0119\u0005u\u0000\u0000\u0117\u0119\u0005v\u0000"+
		"\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u0167\u0001\u0000\u0000\u0000\u011a\u011b\n\u0007\u0000\u0000"+
		"\u011b\u011d\u0005\r\u0000\u0000\u011c\u011e\u0003\b\u0004\u0000\u011d"+
		"\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"\u0123\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u000f\u0000\u0000\u0120"+
		"\u0122\u0003\b\u0004\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0125"+
		"\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0166\u0005\u000e\u0000\u0000\u0127\u0128"+
		"\n\u0006\u0000\u0000\u0128\u0129\u0005\r\u0000\u0000\u0129\u012a\u0003"+
		"\b\u0004\u0000\u012a\u012c\u0005\r\u0000\u0000\u012b\u012d\u0003\b\u0004"+
		"\u0000\u012c\u012b\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u0132\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u000f\u0000"+
		"\u0000\u012f\u0131\u0003\b\u0004\u0000\u0130\u012e\u0001\u0000\u0000\u0000"+
		"\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0010\u0000\u0000"+
		"\u0136\u0166\u0001\u0000\u0000\u0000\u0137\u0138\n\u0005\u0000\u0000\u0138"+
		"\u0139\u0005\r\u0000\u0000\u0139\u013a\u0003\b\u0004\u0000\u013a\u013b"+
		"\u0005\r\u0000\u0000\u013b\u013c\u0003\b\u0004\u0000\u013c\u013e\u0005"+
		"\r\u0000\u0000\u013d\u013f\u0003\b\u0004\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0144\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0005\u000f\u0000\u0000\u0141\u0143\u0003\b\u0004"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000"+
		"\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\u0011\u0000\u0000\u0148\u0166\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\n\u0004\u0000\u0000\u014a\u014b\u0005\r\u0000\u0000"+
		"\u014b\u014c\u0003\b\u0004\u0000\u014c\u014d\u0005\r\u0000\u0000\u014d"+
		"\u014e\u0003\b\u0004\u0000\u014e\u014f\u0005\r\u0000\u0000\u014f\u0150"+
		"\u0003\b\u0004\u0000\u0150\u0152\u0005\r\u0000\u0000\u0151\u0153\u0003"+
		"\b\u0004\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000"+
		"\u0000\u0000\u0153\u0158\u0001\u0000\u0000\u0000\u0154\u0155\u0005\u000f"+
		"\u0000\u0000\u0155\u0157\u0003\b\u0004\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015b\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0012\u0000"+
		"\u0000\u015c\u0166\u0001\u0000\u0000\u0000\u015d\u015e\n\u0003\u0000\u0000"+
		"\u015e\u0162\u0005\u0013\u0000\u0000\u015f\u0161\u0005\u0013\u0000\u0000"+
		"\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163\u0166\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000"+
		"\u0165\u011a\u0001\u0000\u0000\u0000\u0165\u0127\u0001\u0000\u0000\u0000"+
		"\u0165\u0137\u0001\u0000\u0000\u0000\u0165\u0149\u0001\u0000\u0000\u0000"+
		"\u0165\u015d\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000"+
		"\u0168\t\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a"+
		"\u016c\u0005x\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0001\u0000\u0000\u0000\u016e\u000b\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0007\u0004\u0000\u0000\u0170\r\u0001\u0000\u0000\u0000\u0171\u0172\u0007"+
		"\u0005\u0000\u0000\u0172\u000f\u0001\u0000\u0000\u0000\u0173\u0174\u0007"+
		"\u0006\u0000\u0000\u0174\u0011\u0001\u0000\u0000\u0000\u0175\u0176\u0005"+
		"\u0004\u0000\u0000\u0176\u0013\u0001\u0000\u0000\u0000\u0177\u0178\u0005"+
		"\u001e\u0000\u0000\u0178\u0015\u0001\u0000\u0000\u0000\u0179\u017a\u0005"+
		"\u001f\u0000\u0000\u017a\u0017\u0001\u0000\u0000\u0000\u017b\u017c\u0005"+
		" \u0000\u0000\u017c\u0019\u0001\u0000\u0000\u0000\u017d\u017e\u0005!\u0000"+
		"\u0000\u017e\u001b\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u001d\u0000"+
		"\u0000\u0180\u001d\u0001\u0000\u0000\u0000\u0181\u0182\u0005\"\u0000\u0000"+
		"\u0182\u001f\u0001\u0000\u0000\u0000\u0183\u0185\u0003\f\u0006\u0000\u0184"+
		"\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
		"\u0187\u0001\u0000\u0000\u0000\u0186\u0188\u0003\u000e\u0007\u0000\u0187"+
		"\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u018a\u0001\u0000\u0000\u0000\u0189\u018b\u0003\u0012\t\u0000\u018a\u0189"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d"+
		"\u0001\u0000\u0000\u0000\u018c\u018e\u0003\u0014\n\u0000\u018d\u018c\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0190\u0001"+
		"\u0000\u0000\u0000\u018f\u0191\u0003\u0016\u000b\u0000\u0190\u018f\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0193\u0001"+
		"\u0000\u0000\u0000\u0192\u0194\u0003\u0018\f\u0000\u0193\u0192\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194!\u0001\u0000\u0000"+
		"\u0000\u0195\u0197\u0005u\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0003X,\u0000\u0199\u019a\u0005#\u0000\u0000\u019a\u019b"+
		"\u0003H$\u0000\u019b\u01a3\u0001\u0000\u0000\u0000\u019c\u019d\u0003\b"+
		"\u0004\u0000\u019d\u01a0\u0003X,\u0000\u019e\u019f\u0005#\u0000\u0000"+
		"\u019f\u01a1\u0003H$\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a3\u0001\u0000\u0000\u0000\u01a2\u0196"+
		"\u0001\u0000\u0000\u0000\u01a2\u019c\u0001\u0000\u0000\u0000\u01a3#\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a6\u0003\f\u0006\u0000\u01a5\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a9\u0003\u000e\u0007\u0000\u01a8\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ac\u0003\u0010\b\u0000\u01ab\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ad\u01af\u0003\u0014\n\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b2\u0003\u0016\u000b\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b5\u0003\u0018\f\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b8\u0003\u001a\r\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000\u01b9\u01bb"+
		"\u0003\u001c\u000e\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01be"+
		"\u0003\u001e\u000f\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0001\u0000\u0000\u0000\u01be%\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"$\u0000\u0000\u01c0\u01c5\u0003H$\u0000\u01c1\u01c2\u0005\u000b\u0000"+
		"\u0000\u01c2\u01c3\u0003L&\u0000\u01c3\u01c4\u0005\f\u0000\u0000\u01c4"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c1\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c9\u0003\n\u0005\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c9\'\u0001\u0000\u0000\u0000\u01ca\u01cf\u0003"+
		"*\u0015\u0000\u01cb\u01cc\u0005\u000f\u0000\u0000\u01cc\u01ce\u0003*\u0015"+
		"\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000"+
		"\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d0)\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d4\u0003&\u0013\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d8\u01da\u0003\b\u0004\u0000\u01d9\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01db\u01e7\u0003X,\u0000\u01dc\u01de\u0003&"+
		"\u0013\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000"+
		"\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0003X,\u0000\u01e3\u01e4\u0005\b\u0000\u0000"+
		"\u01e4\u01e5\u0003\b\u0004\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6"+
		"\u01d5\u0001\u0000\u0000\u0000\u01e6\u01df\u0001\u0000\u0000\u0000\u01e7"+
		"+\u0001\u0000\u0000\u0000\u01e8\u01ea\u0005g\u0000\u0000\u01e9\u01eb\u0005"+
		"|\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ee\u00032\u0019"+
		"\u0000\u01ed\u01ef\u0005}\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0005h\u0000\u0000\u01f1\u01f8\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0005\b\u0000\u0000\u01f3\u01f4\u0005|\u0000\u0000\u01f4\u01f5"+
		"\u00032\u0019\u0000\u01f5\u01f6\u0005}\u0000\u0000\u01f6\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f7\u01e8\u0001\u0000\u0000\u0000\u01f7\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f8-\u0001\u0000\u0000\u0000\u01f9\u01fb\u0005g\u0000\u0000"+
		"\u01fa\u01fc\u0005|\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u01ff\u00034\u001a\u0000\u01fe\u0200\u0005}\u0000\u0000\u01ff\u01fe\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0005h\u0000\u0000\u0202\u0209\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0005\b\u0000\u0000\u0204\u0205\u0005|\u0000"+
		"\u0000\u0205\u0206\u00034\u001a\u0000\u0206\u0207\u0005}\u0000\u0000\u0207"+
		"\u0209\u0001\u0000\u0000\u0000\u0208\u01f9\u0001\u0000\u0000\u0000\u0208"+
		"\u0203\u0001\u0000\u0000\u0000\u0209/\u0001\u0000\u0000\u0000\u020a\u020c"+
		"\u0005g\u0000\u0000\u020b\u020d\u0005|\u0000\u0000\u020c\u020b\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000"+
		"\u0000\u0000\u020e\u0210\u00036\u001b\u0000\u020f\u0211\u0005}\u0000\u0000"+
		"\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0005h\u0000\u0000\u0213"+
		"\u021a\u0001\u0000\u0000\u0000\u0214\u0215\u0005\b\u0000\u0000\u0215\u0216"+
		"\u0005|\u0000\u0000\u0216\u0217\u00036\u001b\u0000\u0217\u0218\u0005}"+
		"\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u020a\u0001\u0000"+
		"\u0000\u0000\u0219\u0214\u0001\u0000\u0000\u0000\u021a1\u0001\u0000\u0000"+
		"\u0000\u021b\u021f\u0003\u0004\u0002\u0000\u021c\u021f\u0003@ \u0000\u021d"+
		"\u021f\u0003\n\u0005\u0000\u021e\u021b\u0001\u0000\u0000\u0000\u021e\u021c"+
		"\u0001\u0000\u0000\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021f\u0222"+
		"\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0001\u0000\u0000\u0000\u02213\u0001\u0000\u0000\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0223\u0227\u0003@ \u0000\u0224\u0227\u0003>\u001f"+
		"\u0000\u0225\u0227\u0003\n\u0005\u0000\u0226\u0223\u0001\u0000\u0000\u0000"+
		"\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0225\u0001\u0000\u0000\u0000"+
		"\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u02295\u0001\u0000\u0000\u0000\u022a"+
		"\u0228\u0001\u0000\u0000\u0000\u022b\u022f\u0003@ \u0000\u022c\u022f\u0003"+
		"<\u001e\u0000\u022d\u022f\u0003\n\u0005\u0000\u022e\u022b\u0001\u0000"+
		"\u0000\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022d\u0001\u0000"+
		"\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000"+
		"\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u02317\u0001\u0000\u0000"+
		"\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u0237\u00034\u001a\u0000"+
		"\u0234\u0237\u00032\u0019\u0000\u0235\u0237\u00036\u001b\u0000\u0236\u0233"+
		"\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0235"+
		"\u0001\u0000\u0000\u0000\u02379\u0001\u0000\u0000\u0000\u0238\u023b\u0003"+
		".\u0017\u0000\u0239\u023b\u00030\u0018\u0000\u023a\u0238\u0001\u0000\u0000"+
		"\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023b;\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0005%\u0000\u0000\u023d\u023f\u0003H$\u0000\u023e\u0240"+
		"\u0003\n\u0005\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u023f\u0240\u0001"+
		"\u0000\u0000\u0000\u0240=\u0001\u0000\u0000\u0000\u0241\u0243\u0005%\u0000"+
		"\u0000\u0242\u0244\u0003\n\u0005\u0000\u0243\u0242\u0001\u0000\u0000\u0000"+
		"\u0243\u0244\u0001\u0000\u0000\u0000\u0244?\u0001\u0000\u0000\u0000\u0245"+
		"\u0247\u0005|\u0000\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0246\u0247"+
		"\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248\u024a"+
		"\u0003\u0004\u0002\u0000\u0249\u024b\u0003\n\u0005\u0000\u024a\u0249\u0001"+
		"\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u024d\u0001"+
		"\u0000\u0000\u0000\u024c\u024e\u0005}\u0000\u0000\u024d\u024c\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u02d6\u0001\u0000"+
		"\u0000\u0000\u024f\u0251\u0005|\u0000\u0000\u0250\u024f\u0001\u0000\u0000"+
		"\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000"+
		"\u0000\u0252\u0254\u0003.\u0017\u0000\u0253\u0255\u0003\n\u0005\u0000"+
		"\u0254\u0253\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000"+
		"\u0255\u0257\u0001\u0000\u0000\u0000\u0256\u0258\u0005}\u0000\u0000\u0257"+
		"\u0256\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258"+
		"\u02d6\u0001\u0000\u0000\u0000\u0259\u025b\u0005|\u0000\u0000\u025a\u0259"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c"+
		"\u0001\u0000\u0000\u0000\u025c\u025d\u0005&\u0000\u0000\u025d\u025e\u0005"+
		"\u000b\u0000\u0000\u025e\u025f\u0003\"\u0011\u0000\u025f\u0260\u0003\n"+
		"\u0005\u0000\u0260\u0261\u0003H$\u0000\u0261\u0262\u0003\n\u0005\u0000"+
		"\u0262\u0263\u0003B!\u0000\u0263\u0265\u0005\f\u0000\u0000\u0264\u0266"+
		"\u0005}\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0265\u0266\u0001"+
		"\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0003"+
		":\u001d\u0000\u0268\u02d6\u0001\u0000\u0000\u0000\u0269\u026b\u0005|\u0000"+
		"\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0005&\u0000\u0000"+
		"\u026d\u026e\u0003\"\u0011\u0000\u026e\u026f\u0003\n\u0005\u0000\u026f"+
		"\u0270\u0003H$\u0000\u0270\u0271\u0003\n\u0005\u0000\u0271\u0273\u0003"+
		"B!\u0000\u0272\u0274\u0005}\u0000\u0000\u0273\u0272\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\u0003:\u001d\u0000\u0276\u02d6\u0001\u0000\u0000\u0000"+
		"\u0277\u0279\u0005|\u0000\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0278"+
		"\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0007\u0007\u0000\u0000\u027b\u027d\u0005\u000b\u0000\u0000\u027c"+
		"\u027e\u0003\b\u0004\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e"+
		"\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280"+
		"\u0003X,\u0000\u0280\u0281\u0007\b\u0000\u0000\u0281\u0282\u0003H$\u0000"+
		"\u0282\u0284\u0005\f\u0000\u0000\u0283\u0285\u0005}\u0000\u0000\u0284"+
		"\u0283\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0003:\u001d\u0000\u0287\u02d6"+
		"\u0001\u0000\u0000\u0000\u0288\u028a\u0005|\u0000\u0000\u0289\u0288\u0001"+
		"\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0001"+
		"\u0000\u0000\u0000\u028b\u028d\u0007\u0007\u0000\u0000\u028c\u028e\u0003"+
		"\b\u0004\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000"+
		"\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0003X,\u0000"+
		"\u0290\u0291\u0007\b\u0000\u0000\u0291\u0293\u0003H$\u0000\u0292\u0294"+
		"\u0005}\u0000\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0293\u0294\u0001"+
		"\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0296\u0003"+
		":\u001d\u0000\u0296\u02d6\u0001\u0000\u0000\u0000\u0297\u0299\u0005|\u0000"+
		"\u0000\u0298\u0297\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0005)\u0000\u0000"+
		"\u029b\u029d\u0003H$\u0000\u029c\u029e\u0005}\u0000\u0000\u029d\u029c"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0001\u0000\u0000\u0000\u029f\u02a1\u0003:\u001d\u0000\u02a0\u02a2\u0003"+
		"\n\u0005\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a9\u0001\u0000\u0000\u0000\u02a3\u02a4\u0007\t\u0000"+
		"\u0000\u02a4\u02a5\u0003H$\u0000\u02a5\u02a6\u0003:\u001d\u0000\u02a6"+
		"\u02a8\u0001\u0000\u0000\u0000\u02a7\u02a3\u0001\u0000\u0000\u0000\u02a8"+
		"\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9"+
		"\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab"+
		"\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ae\u0003\n\u0005\u0000\u02ad\u02ac"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae\u02b1"+
		"\u0001\u0000\u0000\u0000\u02af\u02b0\u0005,\u0000\u0000\u02b0\u02b2\u0003"+
		":\u001d\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000"+
		"\u0000\u0000\u02b2\u02d6\u0001\u0000\u0000\u0000\u02b3\u02b5\u0005|\u0000"+
		"\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b8\u0003B!\u0000\u02b7"+
		"\u02b9\u0003\n\u0005\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b8\u02b9"+
		"\u0001\u0000\u0000\u0000\u02b9\u02bb\u0001\u0000\u0000\u0000\u02ba\u02bc"+
		"\u0005}\u0000\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bc\u02d6\u0001\u0000\u0000\u0000\u02bd\u02bf\u0005"+
		"|\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c2\u0003H$\u0000"+
		"\u02c1\u02c3\u0003\n\u0005\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c5\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c6\u0005}\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c5\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c6\u02d6\u0001\u0000\u0000\u0000\u02c7\u02c9"+
		"\u0005|\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001"+
		"\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cc\u0003"+
		"<\u001e\u0000\u02cb\u02cd\u0005}\u0000\u0000\u02cc\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02d6\u0001\u0000\u0000"+
		"\u0000\u02ce\u02d0\u0005|\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d3\u0003>\u001f\u0000\u02d2\u02d4\u0005}\u0000\u0000\u02d3\u02d2"+
		"\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d5\u0246\u0001\u0000\u0000\u0000\u02d5\u0250"+
		"\u0001\u0000\u0000\u0000\u02d5\u025a\u0001\u0000\u0000\u0000\u02d5\u026a"+
		"\u0001\u0000\u0000\u0000\u02d5\u0278\u0001\u0000\u0000\u0000\u02d5\u0289"+
		"\u0001\u0000\u0000\u0000\u02d5\u0298\u0001\u0000\u0000\u0000\u02d5\u02b4"+
		"\u0001\u0000\u0000\u0000\u02d5\u02be\u0001\u0000\u0000\u0000\u02d5\u02c8"+
		"\u0001\u0000\u0000\u0000\u02d5\u02cf\u0001\u0000\u0000\u0000\u02d6A\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d8\u0003H$\u0000\u02d8\u02d9\u0007\n\u0000"+
		"\u0000\u02d9\u02da\u0003H$\u0000\u02da\u02ef\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0003H$\u0000\u02dc\u02dd\u00058\u0000\u0000\u02dd\u02de\u0003"+
		"H$\u0000\u02de\u02ef\u0001\u0000\u0000\u0000\u02df\u02e0\u0003H$\u0000"+
		"\u02e0\u02e1\u00059\u0000\u0000\u02e1\u02e2\u0003H$\u0000\u02e2\u02ef"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e4\u0003H$\u0000\u02e4\u02e5\u0005:"+
		"\u0000\u0000\u02e5\u02e6\u0003H$\u0000\u02e6\u02ef\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e8\u0003H$\u0000\u02e8\u02e9\u0005;\u0000\u0000\u02e9\u02ea"+
		"\u0003H$\u0000\u02ea\u02ef\u0001\u0000\u0000\u0000\u02eb\u02ec\u0003H"+
		"$\u0000\u02ec\u02ed\u0007\u000b\u0000\u0000\u02ed\u02ef\u0001\u0000\u0000"+
		"\u0000\u02ee\u02d7\u0001\u0000\u0000\u0000\u02ee\u02db\u0001\u0000\u0000"+
		"\u0000\u02ee\u02df\u0001\u0000\u0000\u0000\u02ee\u02e3\u0001\u0000\u0000"+
		"\u0000\u02ee\u02e7\u0001\u0000\u0000\u0000\u02ee\u02eb\u0001\u0000\u0000"+
		"\u0000\u02efC\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005&\u0000\u0000\u02f1"+
		"\u02f2\u0003X,\u0000\u02f2\u02f3\u0007\b\u0000\u0000\u02f3\u02f4\u0003"+
		"H$\u0000\u02f4E\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005>\u0000\u0000"+
		"\u02f6\u02f8\u0005i\u0000\u0000\u02f7\u02f9\u0003H$\u0000\u02f8\u02f7"+
		"\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000\u02f9\u0303"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fc\u0005j\u0000\u0000\u02fb\u02fa\u0001"+
		"\u0000\u0000\u0000\u02fc\u02ff\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fe\u0300\u0001"+
		"\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u0300\u0302\u0003"+
		"H$\u0000\u0301\u02fd\u0001\u0000\u0000\u0000\u0302\u0305\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000"+
		"\u0000\u0304\u0306\u0001\u0000\u0000\u0000\u0305\u0303\u0001\u0000\u0000"+
		"\u0000\u0306\u0307\u0005k\u0000\u0000\u0307G\u0001\u0000\u0000\u0000\u0308"+
		"\u0309\u0006$\uffff\uffff\u0000\u0309\u030a\u0005C\u0000\u0000\u030a\u030b"+
		"\u0003V+\u0000\u030b\u030c\u0005\b\u0000\u0000\u030c\u030d\u0003H$,\u030d"+
		"\u0383\u0001\u0000\u0000\u0000\u030e\u030f\u0005\u000b\u0000\u0000\u030f"+
		"\u0310\u0003V+\u0000\u0310\u0311\u0005\f\u0000\u0000\u0311\u0312\u0007"+
		"\f\u0000\u0000\u0312\u0313\u0003H$+\u0313\u0383\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0003Z-\u0000\u0315\u0316\u0005F\u0000\u0000\u0316\u0317"+
		"\u0003H$*\u0317\u0383\u0001\u0000\u0000\u0000\u0318\u0319\u0005\u000b"+
		"\u0000\u0000\u0319\u031a\u0003\b\u0004\u0000\u031a\u031b\u0005\f\u0000"+
		"\u0000\u031b\u031c\u0003H$&\u031c\u0383\u0001\u0000\u0000\u0000\u031d"+
		"\u031e\u0005\u000b\u0000\u0000\u031e\u031f\u0003H$\u0000\u031f\u0320\u0005"+
		"\f\u0000\u0000\u0320\u0383\u0001\u0000\u0000\u0000\u0321\u0323\u0005J"+
		"\u0000\u0000\u0322\u0324\u0003L&\u0000\u0323\u0322\u0001\u0000\u0000\u0000"+
		"\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000"+
		"\u0325\u0383\u0005K\u0000\u0000\u0326\u0328\u0005A\u0000\u0000\u0327\u0329"+
		"\u0003L&\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000"+
		"\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u0383\u0005B\u0000"+
		"\u0000\u032b\u032d\u0005g\u0000\u0000\u032c\u032e\u0003L&\u0000\u032d"+
		"\u032c\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e"+
		"\u032f\u0001\u0000\u0000\u0000\u032f\u0383\u0005h\u0000\u0000\u0330\u0332"+
		"\u0005\u000b\u0000\u0000\u0331\u0333\u0003L&\u0000\u0332\u0331\u0001\u0000"+
		"\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000"+
		"\u0000\u0000\u0334\u0383\u0005\f\u0000\u0000\u0335\u0337\u0005g\u0000"+
		"\u0000\u0336\u0338\u0003N\'\u0000\u0337\u0336\u0001\u0000\u0000\u0000"+
		"\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000"+
		"\u0339\u0383\u0005h\u0000\u0000\u033a\u033c\u0003J%\u0000\u033b\u033a"+
		"\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000\u0000\u033c\u033d"+
		"\u0001\u0000\u0000\u0000\u033d\u033e\u0005L\u0000\u0000\u033e\u0341\u0003"+
		"J%\u0000\u033f\u0340\u0005L\u0000\u0000\u0340\u0342\u0003J%\u0000\u0341"+
		"\u033f\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342"+
		"\u0383\u0001\u0000\u0000\u0000\u0343\u0344\u0005A\u0000\u0000\u0344\u0348"+
		"\u0003:\u001d\u0000\u0345\u0347\u0003D\"\u0000\u0346\u0345\u0001\u0000"+
		"\u0000\u0000\u0347\u034a\u0001\u0000\u0000\u0000\u0348\u0346\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034d\u0001\u0000"+
		"\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034b\u034c\u0005)\u0000"+
		"\u0000\u034c\u034e\u0003H$\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d"+
		"\u034e\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f"+
		"\u0350\u0005B\u0000\u0000\u0350\u0383\u0001\u0000\u0000\u0000\u0351\u0352"+
		"\u0005A\u0000\u0000\u0352\u0356\u0003H$\u0000\u0353\u0355\u0003D\"\u0000"+
		"\u0354\u0353\u0001\u0000\u0000\u0000\u0355\u0358\u0001\u0000\u0000\u0000"+
		"\u0356\u0354\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000"+
		"\u0357\u035b\u0001\u0000\u0000\u0000\u0358\u0356\u0001\u0000\u0000\u0000"+
		"\u0359\u035a\u0005)\u0000\u0000\u035a\u035c\u0003H$\u0000\u035b\u0359"+
		"\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u035d"+
		"\u0001\u0000\u0000\u0000\u035d\u035e\u0005B\u0000\u0000\u035e\u0383\u0001"+
		"\u0000\u0000\u0000\u035f\u0360\u0005M\u0000\u0000\u0360\u0367\u0003H$"+
		"\u0000\u0361\u0362\u0005N\u0000\u0000\u0362\u0363\u0005\u000b\u0000\u0000"+
		"\u0363\u0364\u0003H$\u0000\u0364\u0365\u0005\f\u0000\u0000\u0365\u0367"+
		"\u0001\u0000\u0000\u0000\u0366\u035f\u0001\u0000\u0000\u0000\u0366\u0361"+
		"\u0001\u0000\u0000\u0000\u0367\u0383\u0001\u0000\u0000\u0000\u0368\u0369"+
		"\u0007\r\u0000\u0000\u0369\u0383\u0003H$\u001a\u036a\u036b\u0005f\u0000"+
		"\u0000\u036b\u036c\u0003\b\u0004\u0000\u036c\u036e\u0005\u000b\u0000\u0000"+
		"\u036d\u036f\u0003L&\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036e\u036f"+
		"\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u0372"+
		"\u0005\f\u0000\u0000\u0371\u0373\u0003:\u001d\u0000\u0372\u0371\u0001"+
		"\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373\u0383\u0001"+
		"\u0000\u0000\u0000\u0374\u0375\u0005v\u0000\u0000\u0375\u0377\u0005\u000b"+
		"\u0000\u0000\u0376\u0378\u0003R)\u0000\u0377\u0376\u0001\u0000\u0000\u0000"+
		"\u0377\u0378\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000"+
		"\u0379\u0383\u0005\f\u0000\u0000\u037a\u0383\u0003Z-\u0000\u037b\u0383"+
		"\u0005p\u0000\u0000\u037c\u0383\u0005q\u0000\u0000\u037d\u0383\u0005r"+
		"\u0000\u0000\u037e\u0383\u0003F#\u0000\u037f\u0383\u0005n\u0000\u0000"+
		"\u0380\u0383\u0005m\u0000\u0000\u0381\u0383\u0005l\u0000\u0000\u0382\u0308"+
		"\u0001\u0000\u0000\u0000\u0382\u030e\u0001\u0000\u0000\u0000\u0382\u0314"+
		"\u0001\u0000\u0000\u0000\u0382\u0318\u0001\u0000\u0000\u0000\u0382\u031d"+
		"\u0001\u0000\u0000\u0000\u0382\u0321\u0001\u0000\u0000\u0000\u0382\u0326"+
		"\u0001\u0000\u0000\u0000\u0382\u032b\u0001\u0000\u0000\u0000\u0382\u0330"+
		"\u0001\u0000\u0000\u0000\u0382\u0335\u0001\u0000\u0000\u0000\u0382\u033b"+
		"\u0001\u0000\u0000\u0000\u0382\u0343\u0001\u0000\u0000\u0000\u0382\u0351"+
		"\u0001\u0000\u0000\u0000\u0382\u0366\u0001\u0000\u0000\u0000\u0382\u0368"+
		"\u0001\u0000\u0000\u0000\u0382\u036a\u0001\u0000\u0000\u0000\u0382\u0374"+
		"\u0001\u0000\u0000\u0000\u0382\u037a\u0001\u0000\u0000\u0000\u0382\u037b"+
		"\u0001\u0000\u0000\u0000\u0382\u037c\u0001\u0000\u0000\u0000\u0382\u037d"+
		"\u0001\u0000\u0000\u0000\u0382\u037e\u0001\u0000\u0000\u0000\u0382\u037f"+
		"\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0382\u0381"+
		"\u0001\u0000\u0000\u0000\u0383\u03de\u0001\u0000\u0000\u0000\u0384\u0385"+
		"\n/\u0000\u0000\u0385\u0386\u0005?\u0000\u0000\u0386\u03dd\u0003H$/\u0387"+
		"\u0388\n.\u0000\u0000\u0388\u0389\u0005@\u0000\u0000\u0389\u03dd\u0003"+
		"H$.\u038a\u0391\n)\u0000\u0000\u038b\u038d\u0005G\u0000\u0000\u038c\u038b"+
		"\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038e"+
		"\u0001\u0000\u0000\u0000\u038e\u038f\u0003H$\u0000\u038f\u0390\u0005H"+
		"\u0000\u0000\u0390\u0392\u0001\u0000\u0000\u0000\u0391\u038c\u0001\u0000"+
		"\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000"+
		"\u0000\u0000\u0393\u0394\u0005I\u0000\u0000\u0394\u03dd\u0003H$*\u0395"+
		"\u0396\n(\u0000\u0000\u0396\u039c\u0005I\u0000\u0000\u0397\u0399\u0005"+
		"H\u0000\u0000\u0398\u039a\u0005G\u0000\u0000\u0399\u0398\u0001\u0000\u0000"+
		"\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000"+
		"\u0000\u039b\u039d\u0003H$\u0000\u039c\u0397\u0001\u0000\u0000\u0000\u039c"+
		"\u039d\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e"+
		"\u03dd\u0003H$)\u039f\u03a0\n\'\u0000\u0000\u03a0\u03a1\u0005H\u0000\u0000"+
		"\u03a1\u03dd\u0003H$(\u03a2\u03a3\n\u0019\u0000\u0000\u03a3\u03a4\u0007"+
		"\u000e\u0000\u0000\u03a4\u03dd\u0003H$\u001a\u03a5\u03a6\n\u0018\u0000"+
		"\u0000\u03a6\u03a7\u0005U\u0000\u0000\u03a7\u03dd\u0003H$\u0019\u03a8"+
		"\u03a9\n\u0017\u0000\u0000\u03a9\u03aa\u0005V\u0000\u0000\u03aa\u03dd"+
		"\u0003H$\u0018\u03ab\u03ac\n\u0016\u0000\u0000\u03ac\u03ad\u0007\u000f"+
		"\u0000\u0000\u03ad\u03dd\u0003H$\u0017\u03ae\u03af\n\u0015\u0000\u0000"+
		"\u03af\u03b0\u0007\u0010\u0000\u0000\u03b0\u03dd\u0003H$\u0016\u03b1\u03b2"+
		"\n\u0014\u0000\u0000\u03b2\u03b3\u0007\u0011\u0000\u0000\u03b3\u03dd\u0003"+
		"H$\u0015\u03b4\u03b5\n\u0013\u0000\u0000\u03b5\u03b6\u0007\u0012\u0000"+
		"\u0000\u03b6\u03dd\u0003H$\u0014\u03b7\u03b8\n\u0012\u0000\u0000\u03b8"+
		"\u03b9\u0007\u0013\u0000\u0000\u03b9\u03dd\u0003H$\u0013\u03ba\u03bb\n"+
		"\u0011\u0000\u0000\u03bb\u03bc\u0005^\u0000\u0000\u03bc\u03dd\u0003H$"+
		"\u0012\u03bd\u03be\n\u0010\u0000\u0000\u03be\u03bf\u0005_\u0000\u0000"+
		"\u03bf\u03dd\u0003H$\u0011\u03c0\u03c1\n\u000f\u0000\u0000\u03c1\u03c2"+
		"\u0005`\u0000\u0000\u03c2\u03dd\u0003H$\u0010\u03c3\u03c4\n\u000e\u0000"+
		"\u0000\u03c4\u03c5\u0007\u0014\u0000\u0000\u03c5\u03dd\u0003H$\u000f\u03c6"+
		"\u03c7\n\r\u0000\u0000\u03c7\u03c8\u0007\u0015\u0000\u0000\u03c8\u03dd"+
		"\u0003H$\u000e\u03c9\u03ca\n\f\u0000\u0000\u03ca\u03cb\u0005e\u0000\u0000"+
		"\u03cb\u03cc\u0003H$\u0000\u03cc\u03cd\u0005\b\u0000\u0000\u03cd\u03ce"+
		"\u0003H$\r\u03ce\u03dd\u0001\u0000\u0000\u0000\u03cf\u03d0\n\u000b\u0000"+
		"\u0000\u03d0\u03d1\u0005)\u0000\u0000\u03d1\u03d2\u0003H$\u0000\u03d2"+
		"\u03d3\u0005,\u0000\u0000\u03d3\u03d4\u0003H$\f\u03d4\u03dd\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d6\n-\u0000\u0000\u03d6\u03d7\u0005A\u0000\u0000"+
		"\u03d7\u03d8\u0003H$\u0000\u03d8\u03d9\u0005B\u0000\u0000\u03d9\u03dd"+
		"\u0001\u0000\u0000\u0000\u03da\u03db\n\u001f\u0000\u0000\u03db\u03dd\u0007"+
		"\u000b\u0000\u0000\u03dc\u0384\u0001\u0000\u0000\u0000\u03dc\u0387\u0001"+
		"\u0000\u0000\u0000\u03dc\u038a\u0001\u0000\u0000\u0000\u03dc\u0395\u0001"+
		"\u0000\u0000\u0000\u03dc\u039f\u0001\u0000\u0000\u0000\u03dc\u03a2\u0001"+
		"\u0000\u0000\u0000\u03dc\u03a5\u0001\u0000\u0000\u0000\u03dc\u03a8\u0001"+
		"\u0000\u0000\u0000\u03dc\u03ab\u0001\u0000\u0000\u0000\u03dc\u03ae\u0001"+
		"\u0000\u0000\u0000\u03dc\u03b1\u0001\u0000\u0000\u0000\u03dc\u03b4\u0001"+
		"\u0000\u0000\u0000\u03dc\u03b7\u0001\u0000\u0000\u0000\u03dc\u03ba\u0001"+
		"\u0000\u0000\u0000\u03dc\u03bd\u0001\u0000\u0000\u0000\u03dc\u03c0\u0001"+
		"\u0000\u0000\u0000\u03dc\u03c3\u0001\u0000\u0000\u0000\u03dc\u03c6\u0001"+
		"\u0000\u0000\u0000\u03dc\u03c9\u0001\u0000\u0000\u0000\u03dc\u03cf\u0001"+
		"\u0000\u0000\u0000\u03dc\u03d5\u0001\u0000\u0000\u0000\u03dc\u03da\u0001"+
		"\u0000\u0000\u0000\u03dd\u03e0\u0001\u0000\u0000\u0000\u03de\u03dc\u0001"+
		"\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03dfI\u0001\u0000"+
		"\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e1\u03e4\u0003Z-\u0000"+
		"\u03e2\u03e4\u0005p\u0000\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3"+
		"\u03e2\u0001\u0000\u0000\u0000\u03e4K\u0001\u0000\u0000\u0000\u03e5\u03ea"+
		"\u0003H$\u0000\u03e6\u03e7\u0005\u000f\u0000\u0000\u03e7\u03e9\u0003H"+
		"$\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000\u03e9\u03ec\u0001\u0000\u0000"+
		"\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000\u0000"+
		"\u0000\u03ebM\u0001\u0000\u0000\u0000\u03ec\u03ea\u0001\u0000\u0000\u0000"+
		"\u03ed\u03f2\u0003P(\u0000\u03ee\u03ef\u0005\u000f\u0000\u0000\u03ef\u03f1"+
		"\u0003P(\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000\u03f1\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000"+
		"\u0000\u0000\u03f3O\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000"+
		"\u0000\u03f5\u03f6\u0003H$\u0000\u03f6\u03f7\u0005\b\u0000\u0000\u03f7"+
		"\u03f8\u0003H$\u0000\u03f8Q\u0001\u0000\u0000\u0000\u03f9\u03fe\u0003"+
		"T*\u0000\u03fa\u03fb\u0005\u000f\u0000\u0000\u03fb\u03fd\u0003T*\u0000"+
		"\u03fc\u03fa\u0001\u0000\u0000\u0000\u03fd\u0400\u0001\u0000\u0000\u0000"+
		"\u03fe\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000"+
		"\u03ff\u0411\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000\u0000\u0000"+
		"\u0401\u0406\u0003H$\u0000\u0402\u0403\u0005\u000f\u0000\u0000\u0403\u0405"+
		"\u0003H$\u0000\u0404\u0402\u0001\u0000\u0000\u0000\u0405\u0408\u0001\u0000"+
		"\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000"+
		"\u0000\u0000\u0407\u040d\u0001\u0000\u0000\u0000\u0408\u0406\u0001\u0000"+
		"\u0000\u0000\u0409\u040a\u0005\u000f\u0000\u0000\u040a\u040c\u0003T*\u0000"+
		"\u040b\u0409\u0001\u0000\u0000\u0000\u040c\u040f\u0001\u0000\u0000\u0000"+
		"\u040d\u040b\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000"+
		"\u040e\u0411\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000"+
		"\u0410\u03f9\u0001\u0000\u0000\u0000\u0410\u0401\u0001\u0000\u0000\u0000"+
		"\u0411S\u0001\u0000\u0000\u0000\u0412\u0413\u0005v\u0000\u0000\u0413\u0414"+
		"\u0005#\u0000\u0000\u0414\u0415\u0003H$\u0000\u0415U\u0001\u0000\u0000"+
		"\u0000\u0416\u041b\u0005v\u0000\u0000\u0417\u0418\u0005\u000f\u0000\u0000"+
		"\u0418\u041a\u0005v\u0000\u0000\u0419\u0417\u0001\u0000\u0000\u0000\u041a"+
		"\u041d\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000\u0000\u0000\u041b"+
		"\u041c\u0001\u0000\u0000\u0000\u041cW\u0001\u0000\u0000\u0000\u041d\u041b"+
		"\u0001\u0000\u0000\u0000\u041e\u0421\u0005v\u0000\u0000\u041f\u0421\u0003"+
		"V+\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0420\u041f\u0001\u0000\u0000"+
		"\u0000\u0421Y\u0001\u0000\u0000\u0000\u0422\u0427\u0005v\u0000\u0000\u0423"+
		"\u0424\u0005H\u0000\u0000\u0424\u0426\u0005v\u0000\u0000\u0425\u0423\u0001"+
		"\u0000\u0000\u0000\u0426\u0429\u0001\u0000\u0000\u0000\u0427\u0428\u0001"+
		"\u0000\u0000\u0000\u0427\u0425\u0001\u0000\u0000\u0000\u0428[\u0001\u0000"+
		"\u0000\u0000\u0429\u0427\u0001\u0000\u0000\u0000\u00a8_chjsx{~\u0081\u0087"+
		"\u008a\u008d\u0092\u009a\u009e\u00a2\u00a5\u00a8\u00ad\u00b5\u00b9\u00bd"+
		"\u00c0\u00c3\u00c8\u00cd\u00d2\u00d6\u00da\u00dd\u00e0\u00e5\u00ed\u00f1"+
		"\u00f5\u00f8\u00fb\u0100\u0103\u0105\u010d\u0112\u0118\u011d\u0123\u012c"+
		"\u0132\u013e\u0144\u0152\u0158\u0162\u0165\u0167\u016d\u0184\u0187\u018a"+
		"\u018d\u0190\u0193\u0196\u01a0\u01a2\u01a5\u01a8\u01ab\u01ae\u01b1\u01b4"+
		"\u01b7\u01ba\u01bd\u01c5\u01c8\u01cf\u01d5\u01d9\u01df\u01e6\u01ea\u01ee"+
		"\u01f7\u01fb\u01ff\u0208\u020c\u0210\u0219\u021e\u0220\u0226\u0228\u022e"+
		"\u0230\u0236\u023a\u023f\u0243\u0246\u024a\u024d\u0250\u0254\u0257\u025a"+
		"\u0265\u026a\u0273\u0278\u027d\u0284\u0289\u028d\u0293\u0298\u029d\u02a1"+
		"\u02a9\u02ad\u02b1\u02b4\u02b8\u02bb\u02be\u02c2\u02c5\u02c8\u02cc\u02cf"+
		"\u02d3\u02d5\u02ee\u02f8\u02fd\u0303\u0323\u0328\u032d\u0332\u0337\u033b"+
		"\u0341\u0348\u034d\u0356\u035b\u0366\u036e\u0372\u0377\u0382\u038c\u0391"+
		"\u0399\u039c\u03dc\u03de\u03e3\u03ea\u03f2\u03fe\u0406\u040d\u0410\u041b"+
		"\u0420\u0427";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}