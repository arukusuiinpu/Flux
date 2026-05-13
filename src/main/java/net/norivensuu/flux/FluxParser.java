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
		T__80=81, T__81=82, T__82=83, CHAR=84, STRING=85, INT=86, DECIMAL=87, 
		BOOL=88, WILDCARD=89, VOID=90, VAR=91, FIGURE_BRACKET_L=92, FIGURE_BRACKET_R=93, 
		ID=94, SYMBOL=95, TERMINATOR=96, NL=97, WS=98, SL_COMMENT=99, ML_COMMENT=100;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_className = 2, RULE_type = 3, 
		RULE_terminator = 4, RULE_accessModifier = 5, RULE_unfinishedMd = 6, RULE_implementationModifier = 7, 
		RULE_staticMd = 8, RULE_finalMd = 9, RULE_transientMd = 10, RULE_volatileMd = 11, 
		RULE_synchronizedMd = 12, RULE_nativeMd = 13, RULE_strictfpMd = 14, RULE_importDecl = 15, 
		RULE_variableModifiers = 16, RULE_localVarDecl = 17, RULE_idList = 18, 
		RULE_varDecl = 19, RULE_functionModifiers = 20, RULE_classDecl = 21, RULE_functionDecl = 22, 
		RULE_formalParameters = 23, RULE_formalParameter = 24, RULE_voidBlock = 25, 
		RULE_returnBlock = 26, RULE_voidLines = 27, RULE_expressionLines = 28, 
		RULE_block = 29, RULE_expressionReturn = 30, RULE_voidReturn = 31, RULE_statement = 32, 
		RULE_assignmentStat = 33, RULE_expression = 34, RULE_expressionList = 35, 
		RULE_fstring = 36, RULE_qualifiedId = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "className", "type", "terminator", "accessModifier", 
			"unfinishedMd", "implementationModifier", "staticMd", "finalMd", "transientMd", 
			"volatileMd", "synchronizedMd", "nativeMd", "strictfpMd", "importDecl", 
			"variableModifiers", "localVarDecl", "idList", "varDecl", "functionModifiers", 
			"classDecl", "functionDecl", "formalParameters", "formalParameter", "voidBlock", 
			"returnBlock", "voidLines", "expressionLines", "block", "expressionReturn", 
			"voidReturn", "statement", "assignmentStat", "expression", "expressionList", 
			"fstring", "qualifiedId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'public'", "'protected'", "'private'", "'unfinished'", 
			"'illegal'", "'abstract'", "'static'", "'native'", "'final'", "'transient'", 
			"'volatile'", "'synchronized'", "'strictfp'", "'import'", "'using'", 
			"'='", "','", "'class'", "':'", "'('", "')'", "'return'", "'for'", "'foreach'", 
			"'in'", "'if'", "'else if'", "'elif'", "'else'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'&='", "'^='", "'|='", "'<<='", "'>>='", "'>>>='", "'**='", 
			"'***='", "'/%='", "'%/='", "'++'", "'--'", "'['", "']'", "':='", "'**'", 
			"'^'", "'***'", "'^^'", "'+'", "'-'", "'~'", "'!'", "'not'", "'*'", "'/'", 
			"'%'", "'/%'", "'%/'", "'<<'", "'>>'", "'>>>'", "'<='", "'>='", "'instanceof'", 
			"'=='", "'!='", "'&'", "'|'", "'&&'", "'and'", "'||'", "'or'", "'?'", 
			"'new'", "'.'", "'f'", null, null, null, null, null, "'.*'", "'void'", 
			"'var'"
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
			"CHAR", "STRING", "INT", "DECIMAL", "BOOL", "WILDCARD", "VOID", "VAR", 
			"FIGURE_BRACKET_L", "FIGURE_BRACKET_R", "ID", "SYMBOL", "TERMINATOR", 
			"NL", "WS", "SL_COMMENT", "ML_COMMENT"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234770577987731448L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 44797L) != 0)) {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(76);
					declaration();
					}
					break;
				case 2:
					{
					setState(77);
					statement();
					}
					break;
				case 3:
					{
					setState(78);
					terminator();
					}
					break;
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
	public static class DeclarationContext extends ParserRuleContext {
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
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
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				importDecl();
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(87);
					terminator();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				classDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				functionDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				varDecl();
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(93);
					terminator();
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_className, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			qualifiedId();
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_className);
					setState(101);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(102);
					match(T__0);
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(103);
						className(0);
						}
					}

					setState(106);
					match(T__1);
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(113);
				match(VAR);
				}
				break;
			case ID:
				{
				setState(114);
				qualifiedId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(117);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(118);
					match(T__0);
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR || _la==ID) {
						{
						setState(119);
						type(0);
						}
					}

					setState(122);
					match(T__1);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 8, RULE_terminator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(128);
					match(TERMINATOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 10, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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
		enterRule(_localctx, 12, RULE_unfinishedMd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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
		enterRule(_localctx, 14, RULE_implementationModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_staticMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__8);
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
		enterRule(_localctx, 18, RULE_finalMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__10);
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
		enterRule(_localctx, 20, RULE_transientMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__11);
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
		enterRule(_localctx, 22, RULE_volatileMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__12);
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
		enterRule(_localctx, 24, RULE_synchronizedMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		enterRule(_localctx, 26, RULE_nativeMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__9);
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
		enterRule(_localctx, 28, RULE_strictfpMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
	public static class ImportDeclContext extends ParserRuleContext {
		public Token wildcard;
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
		enterRule(_localctx, 30, RULE_importDecl);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				qualifiedId();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(155);
					((ImportDeclContext)_localctx).wildcard = match(WILDCARD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				match(T__8);
				setState(160);
				qualifiedId();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(161);
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
		enterRule(_localctx, 32, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				setState(166);
				accessModifier();
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(169);
				unfinishedMd();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(172);
				staticMd();
				}
			}

			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(175);
				finalMd();
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(178);
				transientMd();
				}
			}

			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(181);
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
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
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
	public static class StrictlyTypedLocalVarsContext extends LocalVarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StrictlyTypedLocalVarsContext(LocalVarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterStrictlyTypedLocalVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitStrictlyTypedLocalVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitStrictlyTypedLocalVars(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LooselyTypedLocalVarsContext extends LocalVarDeclContext {
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(FluxParser.VAR, 0); }
		public LooselyTypedLocalVarsContext(LocalVarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterLooselyTypedLocalVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitLooselyTypedLocalVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitLooselyTypedLocalVars(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrictlyTypedLocalVarContext extends LocalVarDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new LooselyTypedLocalVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(184);
					match(VAR);
					}
				}

				setState(187);
				match(ID);
				setState(188);
				match(T__17);
				setState(189);
				expression(0);
				}
				break;
			case 2:
				_localctx = new StrictlyTypedLocalVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				type(0);
				setState(191);
				match(ID);
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(192);
					match(T__17);
					setState(193);
					expression(0);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new LooselyTypedLocalVarsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(196);
					match(VAR);
					}
				}

				setState(199);
				idList();
				setState(200);
				match(T__17);
				setState(201);
				expression(0);
				}
				break;
			case 4:
				_localctx = new StrictlyTypedLocalVarsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				type(0);
				setState(204);
				idList();
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(205);
					match(T__17);
					setState(206);
					expression(0);
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
		enterRule(_localctx, 36, RULE_idList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(ID);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(212);
					match(T__18);
					setState(213);
					match(ID);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class VarDeclContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public LocalVarDeclContext localVarDecl() {
			return getRuleContext(LocalVarDeclContext.class,0);
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
			setState(219);
			variableModifiers();
			setState(220);
			localVarDecl();
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
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				setState(222);
				accessModifier();
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(225);
				unfinishedMd();
				}
			}

			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(228);
				implementationModifier();
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(231);
				finalMd();
				}
			}

			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(234);
				transientMd();
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(237);
				volatileMd();
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(240);
				synchronizedMd();
				}
			}

			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(243);
				nativeMd();
				}
			}

			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(246);
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
		public FunctionModifiersContext functionModifiers() {
			return getRuleContext(FunctionModifiersContext.class,0);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public VoidBlockContext voidBlock() {
			return getRuleContext(VoidBlockContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			functionModifiers();
			setState(250);
			match(T__19);
			setState(251);
			className(0);
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(252);
				match(T__20);
				}
				break;
			case 2:
				{
				setState(253);
				className(0);
				}
				break;
			}
			setState(256);
			voidBlock();
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
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
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
		public TerminalNode VAR() { return getToken(FluxParser.VAR, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
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
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
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
		enterRule(_localctx, 44, RULE_functionDecl);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new RunnableFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				functionModifiers();
				setState(259);
				match(VOID);
				setState(260);
				match(ID);
				setState(261);
				match(T__21);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(262);
					formalParameters();
					}
				}

				setState(265);
				match(T__22);
				setState(266);
				voidBlock();
				}
				break;
			case 2:
				_localctx = new VarFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				functionModifiers();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(269);
					match(VAR);
					}
				}

				setState(272);
				match(ID);
				setState(273);
				match(T__21);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(274);
					formalParameters();
					}
				}

				setState(277);
				match(T__22);
				setState(278);
				returnBlock();
				}
				break;
			case 3:
				_localctx = new ConsumerFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				functionModifiers();
				setState(281);
				type(0);
				setState(282);
				match(ID);
				setState(283);
				match(T__21);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(284);
					formalParameters();
					}
				}

				setState(287);
				match(T__22);
				setState(288);
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
		enterRule(_localctx, 46, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			formalParameter();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(293);
				match(T__18);
				setState(294);
				formalParameter();
				}
				}
				setState(299);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
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
		enterRule(_localctx, 48, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			type(0);
			setState(301);
			match(ID);
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
		public ExpressionLinesContext expressionLines() {
			return getRuleContext(ExpressionLinesContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(FluxParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FluxParser.NL, i);
		}
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
		enterRule(_localctx, 50, RULE_voidBlock);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIGURE_BRACKET_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(FIGURE_BRACKET_L);
				setState(304);
				voidLines();
				setState(305);
				match(FIGURE_BRACKET_R);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(T__20);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(308);
					match(NL);
					}
					break;
				}
				setState(311);
				expressionLines();
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(312);
					match(NL);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnBlockContext extends ParserRuleContext {
		public TerminalNode FIGURE_BRACKET_L() { return getToken(FluxParser.FIGURE_BRACKET_L, 0); }
		public ExpressionLinesContext expressionLines() {
			return getRuleContext(ExpressionLinesContext.class,0);
		}
		public TerminalNode FIGURE_BRACKET_R() { return getToken(FluxParser.FIGURE_BRACKET_R, 0); }
		public List<TerminalNode> NL() { return getTokens(FluxParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FluxParser.NL, i);
		}
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
		enterRule(_localctx, 52, RULE_returnBlock);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIGURE_BRACKET_L:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(FIGURE_BRACKET_L);
				setState(318);
				expressionLines();
				setState(319);
				match(FIGURE_BRACKET_R);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(T__20);
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(322);
					match(NL);
					}
					break;
				}
				setState(325);
				expressionLines();
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(326);
					match(NL);
					}
					break;
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
		enterRule(_localctx, 54, RULE_voidLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234770577986486264L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 44797L) != 0)) {
				{
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(331);
					statement();
					}
					break;
				case 2:
					{
					setState(332);
					voidReturn();
					}
					break;
				case 3:
					{
					setState(333);
					terminator();
					}
					break;
				}
				}
				setState(338);
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
		enterRule(_localctx, 56, RULE_expressionLines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(342);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(339);
						statement();
						}
						break;
					case 2:
						{
						setState(340);
						expressionReturn();
						}
						break;
					case 3:
						{
						setState(341);
						terminator();
						}
						break;
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new VoidBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				voidBlock();
				}
				break;
			case 2:
				_localctx = new ReturnBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
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
			setState(351);
			match(T__23);
			setState(352);
			expression(0);
			setState(353);
			terminator();
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
			setState(355);
			match(T__23);
			setState(356);
			terminator();
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
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
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
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
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
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				functionDecl();
				}
				break;
			case 2:
				_localctx = new VoidBlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				voidBlock();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(T__24);
				setState(361);
				match(T__21);
				setState(362);
				localVarDecl();
				setState(363);
				terminator();
				setState(364);
				expression(0);
				setState(365);
				terminator();
				setState(366);
				assignmentStat();
				setState(367);
				match(T__22);
				setState(368);
				block();
				}
				break;
			case 4:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(371);
				match(T__21);
				setState(373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(372);
					type(0);
					}
					break;
				}
				setState(375);
				match(ID);
				setState(376);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(377);
				expression(0);
				setState(378);
				match(T__22);
				setState(379);
				block();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(381);
				match(T__27);
				setState(382);
				expression(0);
				setState(383);
				block();
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(384);
					terminator();
					}
					break;
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(387);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(388);
						expression(0);
						setState(389);
						block();
						}
						} 
					}
					setState(395);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(396);
					terminator();
					}
					break;
				}
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(399);
					match(T__30);
					setState(400);
					((IfStatementContext)_localctx).else_ = block();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new VarDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				varDecl();
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(404);
					terminator();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(407);
				assignmentStat();
				setState(409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(408);
					terminator();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(411);
				expression(0);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(412);
					terminator();
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new ExpressionReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(415);
				expressionReturn();
				}
				break;
			case 10:
				_localctx = new VoidReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(416);
				voidReturn();
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
		enterRule(_localctx, 66, RULE_assignmentStat);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new DefaultAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				qualifiedId();
				setState(420);
				((DefaultAssigmnentContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8791798317056L) != 0)) ) {
					((DefaultAssigmnentContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(421);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ExpAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				qualifiedId();
				setState(424);
				((ExpAssigmnentContext)_localctx).operator = match(T__42);
				setState(425);
				expression(0);
				}
				break;
			case 3:
				_localctx = new TetrAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				qualifiedId();
				setState(428);
				((TetrAssigmnentContext)_localctx).operator = match(T__43);
				setState(429);
				expression(0);
				}
				break;
			case 4:
				_localctx = new FloorDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				qualifiedId();
				setState(432);
				((FloorDivAssigmnentContext)_localctx).operator = match(T__44);
				setState(433);
				expression(0);
				}
				break;
			case 5:
				_localctx = new CeilDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				qualifiedId();
				setState(436);
				((CeilDivAssigmnentContext)_localctx).operator = match(T__45);
				setState(437);
				expression(0);
				}
				break;
			case 6:
				_localctx = new UnaryAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(439);
				qualifiedId();
				setState(440);
				((UnaryAssigmnentContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__46 || _la==T__47) ) {
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(FluxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FluxParser.ID, i);
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
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(445);
				match(T__21);
				setState(446);
				expression(0);
				setState(447);
				match(T__22);
				}
				break;
			case 2:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(449);
				match(T__48);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234770577598447616L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 8445L) != 0)) {
					{
					setState(450);
					expressionList();
					}
				}

				setState(453);
				match(T__49);
				}
				break;
			case 3:
				{
				_localctx = new WalrusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(454);
				qualifiedId();
				setState(455);
				((WalrusExprContext)_localctx).operator = match(T__50);
				setState(456);
				expression(33);
				}
				break;
			case 4:
				{
				_localctx = new GeneratorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(458);
				match(T__48);
				setState(459);
				expression(0);
				setState(460);
				match(T__24);
				setState(461);
				match(ID);
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__26) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				expression(0);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(464);
					match(T__24);
					setState(465);
					match(ID);
					setState(466);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__26) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(467);
					expression(0);
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__27) {
					{
					setState(473);
					match(T__27);
					setState(474);
					expression(0);
					{
					setState(475);
					match(T__30);
					setState(476);
					expression(0);
					}
					}
				}

				setState(480);
				match(T__49);
				}
				break;
			case 5:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(482);
				match(T__21);
				setState(483);
				type(0);
				setState(484);
				match(T__22);
				setState(485);
				expression(31);
				}
				break;
			case 6:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(487);
				((UnaryExprContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 504825370730561536L) != 0)) ) {
					((UnaryExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(488);
				expression(28);
				}
				break;
			case 7:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__58:
					{
					setState(489);
					match(T__58);
					setState(490);
					expression(0);
					}
					break;
				case T__59:
					{
					setState(491);
					match(T__59);
					setState(492);
					match(T__21);
					setState(493);
					expression(0);
					setState(494);
					match(T__22);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				{
				_localctx = new CreationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				match(T__80);
				setState(499);
				type(0);
				setState(500);
				match(T__21);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234770577598447616L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 8445L) != 0)) {
					{
					setState(501);
					expressionList();
					}
				}

				setState(504);
				match(T__22);
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(505);
					block();
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(508);
				qualifiedId();
				setState(509);
				match(T__21);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2234770577598447616L) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 8445L) != 0)) {
					{
					setState(510);
					expressionList();
					}
				}

				setState(513);
				match(T__22);
				}
				break;
			case 10:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(515);
				qualifiedId();
				}
				break;
			case 11:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(516);
				match(INT);
				}
				break;
			case 12:
				{
				_localctx = new DecimalExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(517);
				match(DECIMAL);
				}
				break;
			case 13:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518);
				match(BOOL);
				}
				break;
			case 14:
				{
				_localctx = new FStringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(519);
				fstring();
				}
				break;
			case 15:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(520);
				match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new CharExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(521);
				match(CHAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(591);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new ExpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(524);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(525);
						_la = _input.LA(1);
						if ( !(_la==T__51 || _la==T__52) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(526);
						expression(31);
						}
						break;
					case 2:
						{
						_localctx = new TetrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(527);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(528);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__54) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(529);
						expression(30);
						}
						break;
					case 3:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(530);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(531);
						((MulDivExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843009213693952L) != 0)) ) {
							((MulDivExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(532);
						expression(27);
						}
						break;
					case 4:
						{
						_localctx = new FloorDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(533);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(534);
						((FloorDivExprContext)_localctx).operator = match(T__63);
						setState(535);
						expression(26);
						}
						break;
					case 5:
						{
						_localctx = new CeilDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(536);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(537);
						((CeilDivExprContext)_localctx).operator = match(T__64);
						setState(538);
						expression(25);
						}
						break;
					case 6:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(539);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(540);
						((AddSubExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__55 || _la==T__56) ) {
							((AddSubExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(541);
						expression(24);
						}
						break;
					case 7:
						{
						_localctx = new ShiftExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(542);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(543);
						((ShiftExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 7L) != 0)) ) {
							((ShiftExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(544);
						expression(23);
						}
						break;
					case 8:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(545);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(546);
						((RelationalExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1 || _la==T__68 || _la==T__69) ) {
							((RelationalExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(547);
						expression(22);
						}
						break;
					case 9:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(548);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(549);
						((RelationalExprContext)_localctx).operator = match(T__70);
						setState(550);
						expression(21);
						}
						break;
					case 10:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(551);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(552);
						((EqualityExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__71 || _la==T__72) ) {
							((EqualityExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(553);
						expression(20);
						}
						break;
					case 11:
						{
						_localctx = new BitwiseANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(554);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(555);
						match(T__73);
						setState(556);
						expression(19);
						}
						break;
					case 12:
						{
						_localctx = new BitwiseXORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(557);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(558);
						match(T__52);
						setState(559);
						expression(18);
						}
						break;
					case 13:
						{
						_localctx = new BitwiseORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(560);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(561);
						match(T__74);
						setState(562);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new LogicalANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(563);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(564);
						_la = _input.LA(1);
						if ( !(_la==T__75 || _la==T__76) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(565);
						expression(16);
						}
						break;
					case 15:
						{
						_localctx = new LogicalORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(566);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(567);
						_la = _input.LA(1);
						if ( !(_la==T__77 || _la==T__78) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(568);
						expression(15);
						}
						break;
					case 16:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(569);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(570);
						match(T__79);
						setState(571);
						((TernaryExprContext)_localctx).true_ = expression(0);
						setState(572);
						match(T__20);
						setState(573);
						((TernaryExprContext)_localctx).false_ = expression(14);
						}
						break;
					case 17:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						((TernaryExprContext)_localctx).true_ = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(575);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(576);
						match(T__27);
						setState(577);
						((TernaryExprContext)_localctx).condition = expression(0);
						setState(578);
						match(T__30);
						setState(579);
						((TernaryExprContext)_localctx).false_ = expression(13);
						}
						break;
					case 18:
						{
						_localctx = new VariableAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(581);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(582);
						match(T__81);
						setState(583);
						expression(9);
						}
						break;
					case 19:
						{
						_localctx = new PostfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(584);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(585);
						((PostfixExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__46 || _la==T__47) ) {
							((PostfixExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 20:
						{
						_localctx = new ArrayAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(586);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(587);
						match(T__48);
						setState(588);
						expression(0);
						setState(589);
						match(T__49);
						}
						break;
					}
					} 
				}
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 70, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			expression(0);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(597);
				match(T__18);
				setState(598);
				expression(0);
				}
				}
				setState(603);
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
	public static class FstringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FluxParser.STRING, 0); }
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
		enterRule(_localctx, 72, RULE_fstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(T__82);
			setState(605);
			match(STRING);
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
		enterRule(_localctx, 74, RULE_qualifiedId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(ID);
			setState(612);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(608);
					match(T__81);
					setState(609);
					match(ID);
					}
					} 
				}
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		case 2:
			return className_sempred((ClassNameContext)_localctx, predIndex);
		case 3:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 34:
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
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 30);
		case 3:
			return precpred(_ctx, 29);
		case 4:
			return precpred(_ctx, 26);
		case 5:
			return precpred(_ctx, 25);
		case 6:
			return precpred(_ctx, 24);
		case 7:
			return precpred(_ctx, 23);
		case 8:
			return precpred(_ctx, 22);
		case 9:
			return precpred(_ctx, 21);
		case 10:
			return precpred(_ctx, 20);
		case 11:
			return precpred(_ctx, 19);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 16);
		case 15:
			return precpred(_ctx, 15);
		case 16:
			return precpred(_ctx, 14);
		case 17:
			return precpred(_ctx, 13);
		case 18:
			return precpred(_ctx, 12);
		case 19:
			return precpred(_ctx, 8);
		case 20:
			return precpred(_ctx, 34);
		case 21:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001d\u0268\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0003\u0001Y\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001_\b\u0001\u0003\u0001a\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002i\b\u0002\u0001\u0002\u0005\u0002l\b\u0002\n\u0002\f\u0002o\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003t\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003y\b\u0003\u0001\u0003\u0005\u0003"+
		"|\b\u0003\n\u0003\f\u0003\u007f\t\u0003\u0001\u0004\u0004\u0004\u0082"+
		"\b\u0004\u000b\u0004\f\u0004\u0083\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u009d"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a3"+
		"\b\u000f\u0003\u000f\u00a5\b\u000f\u0001\u0010\u0003\u0010\u00a8\b\u0010"+
		"\u0001\u0010\u0003\u0010\u00ab\b\u0010\u0001\u0010\u0003\u0010\u00ae\b"+
		"\u0010\u0001\u0010\u0003\u0010\u00b1\b\u0010\u0001\u0010\u0003\u0010\u00b4"+
		"\b\u0010\u0001\u0010\u0003\u0010\u00b7\b\u0010\u0001\u0011\u0003\u0011"+
		"\u00ba\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00c3\b\u0011\u0001\u0011\u0003\u0011"+
		"\u00c6\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d0\b\u0011\u0003\u0011"+
		"\u00d2\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00d7\b"+
		"\u0012\n\u0012\f\u0012\u00da\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0003\u0014\u00e0\b\u0014\u0001\u0014\u0003\u0014\u00e3\b"+
		"\u0014\u0001\u0014\u0003\u0014\u00e6\b\u0014\u0001\u0014\u0003\u0014\u00e9"+
		"\b\u0014\u0001\u0014\u0003\u0014\u00ec\b\u0014\u0001\u0014\u0003\u0014"+
		"\u00ef\b\u0014\u0001\u0014\u0003\u0014\u00f2\b\u0014\u0001\u0014\u0003"+
		"\u0014\u00f5\b\u0014\u0001\u0014\u0003\u0014\u00f8\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ff\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0108\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u010f\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0114\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u011e\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0123\b"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0128\b\u0017\n"+
		"\u0017\f\u0017\u012b\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0136\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u013a\b\u0019"+
		"\u0003\u0019\u013c\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0144\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0148\b\u001a\u0003\u001a\u014a\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u014f\b\u001b\n\u001b\f\u001b\u0152\t\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0157\b\u001c\n\u001c"+
		"\f\u001c\u015a\t\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u015e\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0176\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0182"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0005 \u0188\b \n \f \u018b\t \u0001 "+
		"\u0003 \u018e\b \u0001 \u0001 \u0003 \u0192\b \u0001 \u0001 \u0003 \u0196"+
		"\b \u0001 \u0001 \u0003 \u019a\b \u0001 \u0001 \u0003 \u019e\b \u0001"+
		" \u0001 \u0003 \u01a2\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01bb\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01c4\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u01d5\b\"\n\"\f\"\u01d8\t\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01df\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01f1\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01f7\b\"\u0001\"\u0001\"\u0003\"\u01fb\b\""+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u0200\b\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u020b\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u0250\b\"\n\"\f\"\u0253\t\"\u0001#\u0001#\u0001"+
		"#\u0005#\u0258\b#\n#\f#\u025b\t#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0005%\u0263\b%\n%\f%\u0266\t%\u0001%\u0001\u0264\u0003\u0004\u0006"+
		"D&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0013\u0001\u0000\u0003\u0005"+
		"\u0001\u0000\u0006\u0007\u0001\u0000\b\n\u0001\u0000\u0010\u0011\u0001"+
		"\u0000\u0019\u001a\u0002\u0000\u0015\u0015\u001b\u001b\u0001\u0000\u001d"+
		"\u001e\u0002\u0000\u0012\u0012 *\u0001\u0000/0\u0002\u0000/08:\u0001\u0000"+
		"45\u0001\u000067\u0001\u0000=?\u0001\u000089\u0001\u0000BD\u0002\u0000"+
		"\u0001\u0002EF\u0001\u0000HI\u0001\u0000LM\u0001\u0000NO\u02c1\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0002`\u0001\u0000\u0000\u0000\u0004b\u0001\u0000"+
		"\u0000\u0000\u0006s\u0001\u0000\u0000\u0000\b\u0081\u0001\u0000\u0000"+
		"\u0000\n\u0085\u0001\u0000\u0000\u0000\f\u0087\u0001\u0000\u0000\u0000"+
		"\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u008b\u0001\u0000\u0000\u0000"+
		"\u0012\u008d\u0001\u0000\u0000\u0000\u0014\u008f\u0001\u0000\u0000\u0000"+
		"\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000"+
		"\u001a\u0095\u0001\u0000\u0000\u0000\u001c\u0097\u0001\u0000\u0000\u0000"+
		"\u001e\u00a4\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000\u0000\""+
		"\u00d1\u0001\u0000\u0000\u0000$\u00d3\u0001\u0000\u0000\u0000&\u00db\u0001"+
		"\u0000\u0000\u0000(\u00df\u0001\u0000\u0000\u0000*\u00f9\u0001\u0000\u0000"+
		"\u0000,\u0122\u0001\u0000\u0000\u0000.\u0124\u0001\u0000\u0000\u00000"+
		"\u012c\u0001\u0000\u0000\u00002\u013b\u0001\u0000\u0000\u00004\u0149\u0001"+
		"\u0000\u0000\u00006\u0150\u0001\u0000\u0000\u00008\u0158\u0001\u0000\u0000"+
		"\u0000:\u015d\u0001\u0000\u0000\u0000<\u015f\u0001\u0000\u0000\u0000>"+
		"\u0163\u0001\u0000\u0000\u0000@\u01a1\u0001\u0000\u0000\u0000B\u01ba\u0001"+
		"\u0000\u0000\u0000D\u020a\u0001\u0000\u0000\u0000F\u0254\u0001\u0000\u0000"+
		"\u0000H\u025c\u0001\u0000\u0000\u0000J\u025f\u0001\u0000\u0000\u0000L"+
		"P\u0003\u0002\u0001\u0000MP\u0003@ \u0000NP\u0003\b\u0004\u0000OL\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\u0000"+
		"\u0000\u0001U\u0001\u0001\u0000\u0000\u0000VX\u0003\u001e\u000f\u0000"+
		"WY\u0003\b\u0004\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Ya\u0001\u0000\u0000\u0000Za\u0003*\u0015\u0000[a\u0003,\u0016\u0000\\"+
		"^\u0003&\u0013\u0000]_\u0003\b\u0004\u0000^]\u0001\u0000\u0000\u0000^"+
		"_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`V\u0001\u0000\u0000"+
		"\u0000`Z\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000"+
		"\u0000\u0000a\u0003\u0001\u0000\u0000\u0000bc\u0006\u0002\uffff\uffff"+
		"\u0000cd\u0003J%\u0000dm\u0001\u0000\u0000\u0000ef\n\u0002\u0000\u0000"+
		"fh\u0005\u0001\u0000\u0000gi\u0003\u0004\u0002\u0000hg\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0005\u0002"+
		"\u0000\u0000ke\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0005\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000pq\u0006\u0003\uffff\uffff\u0000qt\u0005"+
		"[\u0000\u0000rt\u0003J%\u0000sp\u0001\u0000\u0000\u0000sr\u0001\u0000"+
		"\u0000\u0000t}\u0001\u0000\u0000\u0000uv\n\u0003\u0000\u0000vx\u0005\u0001"+
		"\u0000\u0000wy\u0003\u0006\u0003\u0000xw\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0005\u0002\u0000\u0000"+
		"{u\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0007\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u0082\u0005`\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\t\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0007\u0000\u0000\u0000\u0086\u000b\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0007\u0001\u0000\u0000\u0088\r\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0007\u0002\u0000\u0000\u008a\u000f\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\t\u0000\u0000\u008c\u0011\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\u000b\u0000\u0000\u008e\u0013\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0015\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005\r\u0000\u0000\u0092\u0017\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005\u000e\u0000\u0000\u0094\u0019\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005\n\u0000\u0000\u0096\u001b\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\u000f\u0000\u0000\u0098\u001d\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0007\u0003\u0000\u0000\u009a\u009c\u0003J%\u0000\u009b\u009d\u0005Y"+
		"\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u00a5\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0003"+
		"\u0000\u0000\u009f\u00a0\u0005\t\u0000\u0000\u00a0\u00a2\u0003J%\u0000"+
		"\u00a1\u00a3\u0005Y\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4"+
		"\u0099\u0001\u0000\u0000\u0000\u00a4\u009e\u0001\u0000\u0000\u0000\u00a5"+
		"\u001f\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003\n\u0005\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003\f\u0006\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ae\u0003\u0010\b\u0000\u00ad\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000"+
		"\u0000\u0000\u00af\u00b1\u0003\u0012\t\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b4\u0003\u0014\n\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b7\u0003\u0016\u000b\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7!\u0001\u0000\u0000\u0000\u00b8"+
		"\u00ba\u0005[\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0005^\u0000\u0000\u00bc\u00bd\u0005\u0012\u0000\u0000\u00bd\u00d2\u0003"+
		"D\"\u0000\u00be\u00bf\u0003\u0006\u0003\u0000\u00bf\u00c2\u0005^\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0012\u0000\u0000\u00c1\u00c3\u0003D\"\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c3\u00d2\u0001\u0000\u0000\u0000\u00c4\u00c6\u0005[\u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003$\u0012\u0000\u00c8\u00c9"+
		"\u0005\u0012\u0000\u0000\u00c9\u00ca\u0003D\"\u0000\u00ca\u00d2\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0003\u0006\u0003\u0000\u00cc\u00cf\u0003"+
		"$\u0012\u0000\u00cd\u00ce\u0005\u0012\u0000\u0000\u00ce\u00d0\u0003D\""+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00b9\u0001\u0000\u0000"+
		"\u0000\u00d1\u00be\u0001\u0000\u0000\u0000\u00d1\u00c5\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d2#\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d8\u0005^\u0000\u0000\u00d4\u00d5\u0005\u0013\u0000\u0000\u00d5"+
		"\u00d7\u0005^\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9%\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u00dd\u0003\""+
		"\u0011\u0000\u00dd\'\u0001\u0000\u0000\u0000\u00de\u00e0\u0003\n\u0005"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00e3\u0003\f\u0006\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e6\u0003\u000e\u0007\u0000"+
		"\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e9\u0003\u0012\t\u0000\u00e8"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ea\u00ec\u0003\u0014\n\u0000\u00eb\u00ea"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ef\u0003\u0016\u000b\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003\u0018\f\u0000\u00f1\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f5\u0003\u001a\r\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f8\u0003\u001c\u000e\u0000\u00f7\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8)\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0003(\u0014\u0000\u00fa\u00fb\u0005\u0014\u0000\u0000"+
		"\u00fb\u00fe\u0003\u0004\u0002\u0000\u00fc\u00ff\u0005\u0015\u0000\u0000"+
		"\u00fd\u00ff\u0003\u0004\u0002\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u00032\u0019\u0000\u0101"+
		"+\u0001\u0000\u0000\u0000\u0102\u0103\u0003(\u0014\u0000\u0103\u0104\u0005"+
		"Z\u0000\u0000\u0104\u0105\u0005^\u0000\u0000\u0105\u0107\u0005\u0016\u0000"+
		"\u0000\u0106\u0108\u0003.\u0017\u0000\u0107\u0106\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0005\u0017\u0000\u0000\u010a\u010b\u00032\u0019\u0000\u010b"+
		"\u0123\u0001\u0000\u0000\u0000\u010c\u010e\u0003(\u0014\u0000\u010d\u010f"+
		"\u0005[\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0005"+
		"^\u0000\u0000\u0111\u0113\u0005\u0016\u0000\u0000\u0112\u0114\u0003.\u0017"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0017\u0000"+
		"\u0000\u0116\u0117\u00034\u001a\u0000\u0117\u0123\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0003(\u0014\u0000\u0119\u011a\u0003\u0006\u0003\u0000\u011a"+
		"\u011b\u0005^\u0000\u0000\u011b\u011d\u0005\u0016\u0000\u0000\u011c\u011e"+
		"\u0003.\u0017\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0005"+
		"\u0017\u0000\u0000\u0120\u0121\u00034\u001a\u0000\u0121\u0123\u0001\u0000"+
		"\u0000\u0000\u0122\u0102\u0001\u0000\u0000\u0000\u0122\u010c\u0001\u0000"+
		"\u0000\u0000\u0122\u0118\u0001\u0000\u0000\u0000\u0123-\u0001\u0000\u0000"+
		"\u0000\u0124\u0129\u00030\u0018\u0000\u0125\u0126\u0005\u0013\u0000\u0000"+
		"\u0126\u0128\u00030\u0018\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128"+
		"\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a/\u0001\u0000\u0000\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0003\u0006\u0003\u0000\u012d\u012e"+
		"\u0005^\u0000\u0000\u012e1\u0001\u0000\u0000\u0000\u012f\u0130\u0005\\"+
		"\u0000\u0000\u0130\u0131\u00036\u001b\u0000\u0131\u0132\u0005]\u0000\u0000"+
		"\u0132\u013c\u0001\u0000\u0000\u0000\u0133\u0135\u0005\u0015\u0000\u0000"+
		"\u0134\u0136\u0005a\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u0139\u00038\u001c\u0000\u0138\u013a\u0005a\u0000\u0000\u0139\u0138\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0001"+
		"\u0000\u0000\u0000\u013b\u012f\u0001\u0000\u0000\u0000\u013b\u0133\u0001"+
		"\u0000\u0000\u0000\u013c3\u0001\u0000\u0000\u0000\u013d\u013e\u0005\\"+
		"\u0000\u0000\u013e\u013f\u00038\u001c\u0000\u013f\u0140\u0005]\u0000\u0000"+
		"\u0140\u014a\u0001\u0000\u0000\u0000\u0141\u0143\u0005\u0015\u0000\u0000"+
		"\u0142\u0144\u0005a\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\u0147\u00038\u001c\u0000\u0146\u0148\u0005a\u0000\u0000\u0147\u0146\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a\u0001"+
		"\u0000\u0000\u0000\u0149\u013d\u0001\u0000\u0000\u0000\u0149\u0141\u0001"+
		"\u0000\u0000\u0000\u014a5\u0001\u0000\u0000\u0000\u014b\u014f\u0003@ "+
		"\u0000\u014c\u014f\u0003>\u001f\u0000\u014d\u014f\u0003\b\u0004\u0000"+
		"\u014e\u014b\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000"+
		"\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u01517\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153"+
		"\u0157\u0003@ \u0000\u0154\u0157\u0003<\u001e\u0000\u0155\u0157\u0003"+
		"\b\u0004\u0000\u0156\u0153\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000"+
		"\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000"+
		"\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000"+
		"\u0000\u0000\u01599\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000"+
		"\u0000\u015b\u015e\u00032\u0019\u0000\u015c\u015e\u00034\u001a\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e"+
		";\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0018\u0000\u0000\u0160\u0161"+
		"\u0003D\"\u0000\u0161\u0162\u0003\b\u0004\u0000\u0162=\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0005\u0018\u0000\u0000\u0164\u0165\u0003\b\u0004\u0000"+
		"\u0165?\u0001\u0000\u0000\u0000\u0166\u01a2\u0003,\u0016\u0000\u0167\u01a2"+
		"\u00032\u0019\u0000\u0168\u0169\u0005\u0019\u0000\u0000\u0169\u016a\u0005"+
		"\u0016\u0000\u0000\u016a\u016b\u0003\"\u0011\u0000\u016b\u016c\u0003\b"+
		"\u0004\u0000\u016c\u016d\u0003D\"\u0000\u016d\u016e\u0003\b\u0004\u0000"+
		"\u016e\u016f\u0003B!\u0000\u016f\u0170\u0005\u0017\u0000\u0000\u0170\u0171"+
		"\u0003:\u001d\u0000\u0171\u01a2\u0001\u0000\u0000\u0000\u0172\u0173\u0007"+
		"\u0004\u0000\u0000\u0173\u0175\u0005\u0016\u0000\u0000\u0174\u0176\u0003"+
		"\u0006\u0003\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0005"+
		"^\u0000\u0000\u0178\u0179\u0007\u0005\u0000\u0000\u0179\u017a\u0003D\""+
		"\u0000\u017a\u017b\u0005\u0017\u0000\u0000\u017b\u017c\u0003:\u001d\u0000"+
		"\u017c\u01a2\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u001c\u0000\u0000"+
		"\u017e\u017f\u0003D\"\u0000\u017f\u0181\u0003:\u001d\u0000\u0180\u0182"+
		"\u0003\b\u0004\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001"+
		"\u0000\u0000\u0000\u0182\u0189\u0001\u0000\u0000\u0000\u0183\u0184\u0007"+
		"\u0006\u0000\u0000\u0184\u0185\u0003D\"\u0000\u0185\u0186\u0003:\u001d"+
		"\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0183\u0001\u0000\u0000"+
		"\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000"+
		"\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018e\u0003\b\u0004\u0000"+
		"\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000"+
		"\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u001f\u0000\u0000"+
		"\u0190\u0192\u0003:\u001d\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192\u01a2\u0001\u0000\u0000\u0000\u0193"+
		"\u0195\u0003&\u0013\u0000\u0194\u0196\u0003\b\u0004\u0000\u0195\u0194"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u01a2"+
		"\u0001\u0000\u0000\u0000\u0197\u0199\u0003B!\u0000\u0198\u019a\u0003\b"+
		"\u0004\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000"+
		"\u0000\u0000\u019a\u01a2\u0001\u0000\u0000\u0000\u019b\u019d\u0003D\""+
		"\u0000\u019c\u019e\u0003\b\u0004\u0000\u019d\u019c\u0001\u0000\u0000\u0000"+
		"\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a2\u0001\u0000\u0000\u0000"+
		"\u019f\u01a2\u0003<\u001e\u0000\u01a0\u01a2\u0003>\u001f\u0000\u01a1\u0166"+
		"\u0001\u0000\u0000\u0000\u01a1\u0167\u0001\u0000\u0000\u0000\u01a1\u0168"+
		"\u0001\u0000\u0000\u0000\u01a1\u0172\u0001\u0000\u0000\u0000\u01a1\u017d"+
		"\u0001\u0000\u0000\u0000\u01a1\u0193\u0001\u0000\u0000\u0000\u01a1\u0197"+
		"\u0001\u0000\u0000\u0000\u01a1\u019b\u0001\u0000\u0000\u0000\u01a1\u019f"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2A\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0003J%\u0000\u01a4\u01a5\u0007\u0007\u0000"+
		"\u0000\u01a5\u01a6\u0003D\"\u0000\u01a6\u01bb\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0003J%\u0000\u01a8\u01a9\u0005+\u0000\u0000\u01a9\u01aa"+
		"\u0003D\"\u0000\u01aa\u01bb\u0001\u0000\u0000\u0000\u01ab\u01ac\u0003"+
		"J%\u0000\u01ac\u01ad\u0005,\u0000\u0000\u01ad\u01ae\u0003D\"\u0000\u01ae"+
		"\u01bb\u0001\u0000\u0000\u0000\u01af\u01b0\u0003J%\u0000\u01b0\u01b1\u0005"+
		"-\u0000\u0000\u01b1\u01b2\u0003D\"\u0000\u01b2\u01bb\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0003J%\u0000\u01b4\u01b5\u0005.\u0000\u0000\u01b5"+
		"\u01b6\u0003D\"\u0000\u01b6\u01bb\u0001\u0000\u0000\u0000\u01b7\u01b8"+
		"\u0003J%\u0000\u01b8\u01b9\u0007\b\u0000\u0000\u01b9\u01bb\u0001\u0000"+
		"\u0000\u0000\u01ba\u01a3\u0001\u0000\u0000\u0000\u01ba\u01a7\u0001\u0000"+
		"\u0000\u0000\u01ba\u01ab\u0001\u0000\u0000\u0000\u01ba\u01af\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b3\u0001\u0000\u0000\u0000\u01ba\u01b7\u0001\u0000"+
		"\u0000\u0000\u01bbC\u0001\u0000\u0000\u0000\u01bc\u01bd\u0006\"\uffff"+
		"\uffff\u0000\u01bd\u01be\u0005\u0016\u0000\u0000\u01be\u01bf\u0003D\""+
		"\u0000\u01bf\u01c0\u0005\u0017\u0000\u0000\u01c0\u020b\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c3\u00051\u0000\u0000\u01c2\u01c4\u0003F#\u0000\u01c3"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c5\u020b\u00052\u0000\u0000\u01c6\u01c7"+
		"\u0003J%\u0000\u01c7\u01c8\u00053\u0000\u0000\u01c8\u01c9\u0003D\"!\u01c9"+
		"\u020b\u0001\u0000\u0000\u0000\u01ca\u01cb\u00051\u0000\u0000\u01cb\u01cc"+
		"\u0003D\"\u0000\u01cc\u01cd\u0005\u0019\u0000\u0000\u01cd\u01ce\u0005"+
		"^\u0000\u0000\u01ce\u01cf\u0007\u0005\u0000\u0000\u01cf\u01d6\u0003D\""+
		"\u0000\u01d0\u01d1\u0005\u0019\u0000\u0000\u01d1\u01d2\u0005^\u0000\u0000"+
		"\u01d2\u01d3\u0007\u0005\u0000\u0000\u01d3\u01d5\u0003D\"\u0000\u01d4"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7"+
		"\u01de\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0005\u001c\u0000\u0000\u01da\u01db\u0003D\"\u0000\u01db\u01dc"+
		"\u0005\u001f\u0000\u0000\u01dc\u01dd\u0003D\"\u0000\u01dd\u01df\u0001"+
		"\u0000\u0000\u0000\u01de\u01d9\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005"+
		"2\u0000\u0000\u01e1\u020b\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\u0016"+
		"\u0000\u0000\u01e3\u01e4\u0003\u0006\u0003\u0000\u01e4\u01e5\u0005\u0017"+
		"\u0000\u0000\u01e5\u01e6\u0003D\"\u001f\u01e6\u020b\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e8\u0007\t\u0000\u0000\u01e8\u020b\u0003D\"\u001c\u01e9"+
		"\u01ea\u0005;\u0000\u0000\u01ea\u01f1\u0003D\"\u0000\u01eb\u01ec\u0005"+
		"<\u0000\u0000\u01ec\u01ed\u0005\u0016\u0000\u0000\u01ed\u01ee\u0003D\""+
		"\u0000\u01ee\u01ef\u0005\u0017\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f0\u01e9\u0001\u0000\u0000\u0000\u01f0\u01eb\u0001\u0000\u0000"+
		"\u0000\u01f1\u020b\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005Q\u0000\u0000"+
		"\u01f3\u01f4\u0003\u0006\u0003\u0000\u01f4\u01f6\u0005\u0016\u0000\u0000"+
		"\u01f5\u01f7\u0003F#\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fa"+
		"\u0005\u0017\u0000\u0000\u01f9\u01fb\u0003:\u001d\u0000\u01fa\u01f9\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u020b\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0003J%\u0000\u01fd\u01ff\u0005\u0016\u0000"+
		"\u0000\u01fe\u0200\u0003F#\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201"+
		"\u0202\u0005\u0017\u0000\u0000\u0202\u020b\u0001\u0000\u0000\u0000\u0203"+
		"\u020b\u0003J%\u0000\u0204\u020b\u0005V\u0000\u0000\u0205\u020b\u0005"+
		"W\u0000\u0000\u0206\u020b\u0005X\u0000\u0000\u0207\u020b\u0003H$\u0000"+
		"\u0208\u020b\u0005U\u0000\u0000\u0209\u020b\u0005T\u0000\u0000\u020a\u01bc"+
		"\u0001\u0000\u0000\u0000\u020a\u01c1\u0001\u0000\u0000\u0000\u020a\u01c6"+
		"\u0001\u0000\u0000\u0000\u020a\u01ca\u0001\u0000\u0000\u0000\u020a\u01e2"+
		"\u0001\u0000\u0000\u0000\u020a\u01e7\u0001\u0000\u0000\u0000\u020a\u01f0"+
		"\u0001\u0000\u0000\u0000\u020a\u01f2\u0001\u0000\u0000\u0000\u020a\u01fc"+
		"\u0001\u0000\u0000\u0000\u020a\u0203\u0001\u0000\u0000\u0000\u020a\u0204"+
		"\u0001\u0000\u0000\u0000\u020a\u0205\u0001\u0000\u0000\u0000\u020a\u0206"+
		"\u0001\u0000\u0000\u0000\u020a\u0207\u0001\u0000\u0000\u0000\u020a\u0208"+
		"\u0001\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u0251"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\n\u001e\u0000\u0000\u020d\u020e\u0007"+
		"\n\u0000\u0000\u020e\u0250\u0003D\"\u001f\u020f\u0210\n\u001d\u0000\u0000"+
		"\u0210\u0211\u0007\u000b\u0000\u0000\u0211\u0250\u0003D\"\u001e\u0212"+
		"\u0213\n\u001a\u0000\u0000\u0213\u0214\u0007\f\u0000\u0000\u0214\u0250"+
		"\u0003D\"\u001b\u0215\u0216\n\u0019\u0000\u0000\u0216\u0217\u0005@\u0000"+
		"\u0000\u0217\u0250\u0003D\"\u001a\u0218\u0219\n\u0018\u0000\u0000\u0219"+
		"\u021a\u0005A\u0000\u0000\u021a\u0250\u0003D\"\u0019\u021b\u021c\n\u0017"+
		"\u0000\u0000\u021c\u021d\u0007\r\u0000\u0000\u021d\u0250\u0003D\"\u0018"+
		"\u021e\u021f\n\u0016\u0000\u0000\u021f\u0220\u0007\u000e\u0000\u0000\u0220"+
		"\u0250\u0003D\"\u0017\u0221\u0222\n\u0015\u0000\u0000\u0222\u0223\u0007"+
		"\u000f\u0000\u0000\u0223\u0250\u0003D\"\u0016\u0224\u0225\n\u0014\u0000"+
		"\u0000\u0225\u0226\u0005G\u0000\u0000\u0226\u0250\u0003D\"\u0015\u0227"+
		"\u0228\n\u0013\u0000\u0000\u0228\u0229\u0007\u0010\u0000\u0000\u0229\u0250"+
		"\u0003D\"\u0014\u022a\u022b\n\u0012\u0000\u0000\u022b\u022c\u0005J\u0000"+
		"\u0000\u022c\u0250\u0003D\"\u0013\u022d\u022e\n\u0011\u0000\u0000\u022e"+
		"\u022f\u00055\u0000\u0000\u022f\u0250\u0003D\"\u0012\u0230\u0231\n\u0010"+
		"\u0000\u0000\u0231\u0232\u0005K\u0000\u0000\u0232\u0250\u0003D\"\u0011"+
		"\u0233\u0234\n\u000f\u0000\u0000\u0234\u0235\u0007\u0011\u0000\u0000\u0235"+
		"\u0250\u0003D\"\u0010\u0236\u0237\n\u000e\u0000\u0000\u0237\u0238\u0007"+
		"\u0012\u0000\u0000\u0238\u0250\u0003D\"\u000f\u0239\u023a\n\r\u0000\u0000"+
		"\u023a\u023b\u0005P\u0000\u0000\u023b\u023c\u0003D\"\u0000\u023c\u023d"+
		"\u0005\u0015\u0000\u0000\u023d\u023e\u0003D\"\u000e\u023e\u0250\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\n\f\u0000\u0000\u0240\u0241\u0005\u001c"+
		"\u0000\u0000\u0241\u0242\u0003D\"\u0000\u0242\u0243\u0005\u001f\u0000"+
		"\u0000\u0243\u0244\u0003D\"\r\u0244\u0250\u0001\u0000\u0000\u0000\u0245"+
		"\u0246\n\b\u0000\u0000\u0246\u0247\u0005R\u0000\u0000\u0247\u0250\u0003"+
		"D\"\t\u0248\u0249\n\"\u0000\u0000\u0249\u0250\u0007\b\u0000\u0000\u024a"+
		"\u024b\n\t\u0000\u0000\u024b\u024c\u00051\u0000\u0000\u024c\u024d\u0003"+
		"D\"\u0000\u024d\u024e\u00052\u0000\u0000\u024e\u0250\u0001\u0000\u0000"+
		"\u0000\u024f\u020c\u0001\u0000\u0000\u0000\u024f\u020f\u0001\u0000\u0000"+
		"\u0000\u024f\u0212\u0001\u0000\u0000\u0000\u024f\u0215\u0001\u0000\u0000"+
		"\u0000\u024f\u0218\u0001\u0000\u0000\u0000\u024f\u021b\u0001\u0000\u0000"+
		"\u0000\u024f\u021e\u0001\u0000\u0000\u0000\u024f\u0221\u0001\u0000\u0000"+
		"\u0000\u024f\u0224\u0001\u0000\u0000\u0000\u024f\u0227\u0001\u0000\u0000"+
		"\u0000\u024f\u022a\u0001\u0000\u0000\u0000\u024f\u022d\u0001\u0000\u0000"+
		"\u0000\u024f\u0230\u0001\u0000\u0000\u0000\u024f\u0233\u0001\u0000\u0000"+
		"\u0000\u024f\u0236\u0001\u0000\u0000\u0000\u024f\u0239\u0001\u0000\u0000"+
		"\u0000\u024f\u023f\u0001\u0000\u0000\u0000\u024f\u0245\u0001\u0000\u0000"+
		"\u0000\u024f\u0248\u0001\u0000\u0000\u0000\u024f\u024a\u0001\u0000\u0000"+
		"\u0000\u0250\u0253\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252E\u0001\u0000\u0000\u0000"+
		"\u0253\u0251\u0001\u0000\u0000\u0000\u0254\u0259\u0003D\"\u0000\u0255"+
		"\u0256\u0005\u0013\u0000\u0000\u0256\u0258\u0003D\"\u0000\u0257\u0255"+
		"\u0001\u0000\u0000\u0000\u0258\u025b\u0001\u0000\u0000\u0000\u0259\u0257"+
		"\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025aG\u0001"+
		"\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025c\u025d\u0005"+
		"S\u0000\u0000\u025d\u025e\u0005U\u0000\u0000\u025eI\u0001\u0000\u0000"+
		"\u0000\u025f\u0264\u0005^\u0000\u0000\u0260\u0261\u0005R\u0000\u0000\u0261"+
		"\u0263\u0005^\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0263\u0266"+
		"\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0264\u0262"+
		"\u0001\u0000\u0000\u0000\u0265K\u0001\u0000\u0000\u0000\u0266\u0264\u0001"+
		"\u0000\u0000\u0000KOQX^`hmsx}\u0083\u009c\u00a2\u00a4\u00a7\u00aa\u00ad"+
		"\u00b0\u00b3\u00b6\u00b9\u00c2\u00c5\u00cf\u00d1\u00d8\u00df\u00e2\u00e5"+
		"\u00e8\u00eb\u00ee\u00f1\u00f4\u00f7\u00fe\u0107\u010e\u0113\u011d\u0122"+
		"\u0129\u0135\u0139\u013b\u0143\u0147\u0149\u014e\u0150\u0156\u0158\u015d"+
		"\u0175\u0181\u0189\u018d\u0191\u0195\u0199\u019d\u01a1\u01ba\u01c3\u01d6"+
		"\u01de\u01f0\u01f6\u01fa\u01ff\u020a\u024f\u0251\u0259\u0264";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}