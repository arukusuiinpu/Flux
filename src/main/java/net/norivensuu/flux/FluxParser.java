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
		CHAR=81, STRING=82, INT=83, DECIMAL=84, BOOL=85, WILDCARD=86, VOID=87, 
		VAR=88, FIGURE_BRACKET_L=89, FIGURE_BRACKET_R=90, ID=91, SYMBOL=92, TERMINATOR=93, 
		NL=94, WS=95, SL_COMMENT=96, ML_COMMENT=97;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_type = 2, RULE_terminator = 3, 
		RULE_accessModifier = 4, RULE_unfinishedMd = 5, RULE_implementationModifier = 6, 
		RULE_staticMd = 7, RULE_finalMd = 8, RULE_transientMd = 9, RULE_volatileMd = 10, 
		RULE_synchronizedMd = 11, RULE_nativeMd = 12, RULE_strictfpMd = 13, RULE_importDecl = 14, 
		RULE_variableModifiers = 15, RULE_localVarDecl = 16, RULE_varDecl = 17, 
		RULE_functionModifiers = 18, RULE_functionDecl = 19, RULE_formalParameters = 20, 
		RULE_formalParameter = 21, RULE_voidBlock = 22, RULE_returnBlock = 23, 
		RULE_voidLines = 24, RULE_expressionLines = 25, RULE_block = 26, RULE_expressionReturn = 27, 
		RULE_voidReturn = 28, RULE_statement = 29, RULE_assignmentStat = 30, RULE_expression = 31, 
		RULE_expressionList = 32, RULE_qualifiedId = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "type", "terminator", "accessModifier", "unfinishedMd", 
			"implementationModifier", "staticMd", "finalMd", "transientMd", "volatileMd", 
			"synchronizedMd", "nativeMd", "strictfpMd", "importDecl", "variableModifiers", 
			"localVarDecl", "varDecl", "functionModifiers", "functionDecl", "formalParameters", 
			"formalParameter", "voidBlock", "returnBlock", "voidLines", "expressionLines", 
			"block", "expressionReturn", "voidReturn", "statement", "assignmentStat", 
			"expression", "expressionList", "qualifiedId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'public'", "'protected'", "'private'", "'unfinished'", 
			"'illegal'", "'abstract'", "'static'", "'native'", "'final'", "'transient'", 
			"'volatile'", "'synchronized'", "'strictfp'", "'import'", "'using'", 
			"'='", "'('", "')'", "','", "'return'", "'for'", "'foreach'", "':'", 
			"'in'", "'if'", "'else if'", "'elif'", "'else'", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'&='", "'^='", "'|='", "'<<='", "'>>='", "'>>>='", "'**='", 
			"'***='", "'/%='", "'%/='", "'++'", "'--'", "'['", "']'", "'**'", "'^'", 
			"'***'", "'^^'", "'+'", "'-'", "'~'", "'!'", "'not'", "'*'", "'/'", "'%'", 
			"'/%'", "'%/'", "'<<'", "'>>'", "'>>>'", "'<='", "'>='", "'instanceof'", 
			"'=='", "'!='", "'&'", "'|'", "'&&'", "'and'", "'||'", "'or'", "'?'", 
			"'new'", "'.'", null, null, null, null, null, "'.*'", "'void'", "'var'"
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
			null, null, null, null, null, null, null, null, null, "CHAR", "STRING", 
			"INT", "DECIMAL", "BOOL", "WILDCARD", "VOID", "VAR", "FIGURE_BRACKET_L", 
			"FIGURE_BRACKET_R", "ID", "SYMBOL", "TERMINATOR", "NL", "WS", "SL_COMMENT", 
			"ML_COMMENT"
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935167549432L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 22397L) != 0)) {
				{
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(68);
					declaration();
					}
					break;
				case 2:
					{
					setState(69);
					statement();
					}
					break;
				case 3:
					{
					setState(70);
					terminator();
					}
					break;
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				importDecl();
				setState(79);
				terminator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				functionDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				varDecl();
				setState(83);
				terminator();
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(88);
				match(VAR);
				}
				break;
			case ID:
				{
				setState(89);
				qualifiedId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(92);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(93);
					match(T__0);
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR || _la==ID) {
						{
						setState(94);
						type(0);
						}
					}

					setState(97);
					match(T__1);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 6, RULE_terminator);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(103);
					match(TERMINATOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 8, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
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
		enterRule(_localctx, 10, RULE_unfinishedMd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
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
		enterRule(_localctx, 12, RULE_implementationModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		enterRule(_localctx, 14, RULE_staticMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
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
		enterRule(_localctx, 16, RULE_finalMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		enterRule(_localctx, 18, RULE_transientMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
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
		enterRule(_localctx, 20, RULE_volatileMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		enterRule(_localctx, 22, RULE_synchronizedMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		enterRule(_localctx, 24, RULE_nativeMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		enterRule(_localctx, 26, RULE_strictfpMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		enterRule(_localctx, 28, RULE_importDecl);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(129);
				qualifiedId();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(130);
					((ImportDeclContext)_localctx).wildcard = match(WILDCARD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				match(T__8);
				setState(135);
				qualifiedId();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(136);
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
		enterRule(_localctx, 30, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				setState(141);
				accessModifier();
				}
			}

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(144);
				unfinishedMd();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(147);
				staticMd();
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(150);
				finalMd();
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(153);
				transientMd();
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(156);
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
		enterRule(_localctx, 32, RULE_localVarDecl);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new LooselyTypedLocalVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(159);
					match(VAR);
					}
				}

				setState(162);
				match(ID);
				setState(163);
				match(T__17);
				setState(164);
				expression(0);
				}
				break;
			case 2:
				_localctx = new StrictlyTypedLocalVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				type(0);
				setState(166);
				match(ID);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(167);
					match(T__17);
					setState(168);
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
		enterRule(_localctx, 34, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			variableModifiers();
			setState(174);
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
		enterRule(_localctx, 36, RULE_functionModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				setState(176);
				accessModifier();
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(179);
				unfinishedMd();
				}
			}

			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(182);
				implementationModifier();
				}
				break;
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(185);
				finalMd();
				}
			}

			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(188);
				transientMd();
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(191);
				volatileMd();
				}
			}

			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(194);
				synchronizedMd();
				}
			}

			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(197);
				nativeMd();
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(200);
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
		enterRule(_localctx, 38, RULE_functionDecl);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new RunnableFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				functionModifiers();
				setState(204);
				match(VOID);
				setState(205);
				match(ID);
				setState(206);
				match(T__18);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(207);
					formalParameters();
					}
				}

				setState(210);
				match(T__19);
				setState(211);
				voidBlock();
				}
				break;
			case 2:
				_localctx = new VarFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				functionModifiers();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(214);
					match(VAR);
					}
				}

				setState(217);
				match(ID);
				setState(218);
				match(T__18);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(219);
					formalParameters();
					}
				}

				setState(222);
				match(T__19);
				setState(223);
				returnBlock();
				}
				break;
			case 3:
				_localctx = new ConsumerFunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				functionModifiers();
				setState(226);
				type(0);
				setState(227);
				match(ID);
				setState(228);
				match(T__18);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(229);
					formalParameters();
					}
				}

				setState(232);
				match(T__19);
				setState(233);
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
		enterRule(_localctx, 40, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			formalParameter();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(238);
				match(T__20);
				setState(239);
				formalParameter();
				}
				}
				setState(244);
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
		enterRule(_localctx, 42, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			type(0);
			setState(246);
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
		enterRule(_localctx, 44, RULE_voidBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(FIGURE_BRACKET_L);
			setState(249);
			voidLines();
			setState(250);
			match(FIGURE_BRACKET_R);
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
		enterRule(_localctx, 46, RULE_returnBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(FIGURE_BRACKET_L);
			setState(253);
			expressionLines();
			setState(254);
			match(FIGURE_BRACKET_R);
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
		enterRule(_localctx, 48, RULE_voidLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935167352824L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 22397L) != 0)) {
				{
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(256);
					statement();
					}
					break;
				case 2:
					{
					setState(257);
					voidReturn();
					}
					break;
				case 3:
					{
					setState(258);
					terminator();
					}
					break;
				}
				}
				setState(263);
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
		enterRule(_localctx, 50, RULE_expressionLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935167352824L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 22397L) != 0)) {
				{
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(264);
					statement();
					}
					break;
				case 2:
					{
					setState(265);
					expressionReturn();
					}
					break;
				case 3:
					{
					setState(266);
					terminator();
					}
					break;
				}
				}
				setState(271);
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
		enterRule(_localctx, 52, RULE_block);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new VoidBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				voidBlock();
				}
				break;
			case 2:
				_localctx = new ReturnBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
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
		enterRule(_localctx, 54, RULE_expressionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__21);
			setState(277);
			expression(0);
			setState(278);
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
		enterRule(_localctx, 56, RULE_voidReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__21);
			setState(281);
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
		enterRule(_localctx, 58, RULE_statement);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				functionDecl();
				}
				break;
			case 2:
				_localctx = new VoidBlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				voidBlock();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				match(T__22);
				setState(286);
				match(T__18);
				setState(287);
				localVarDecl();
				setState(288);
				terminator();
				setState(289);
				expression(0);
				setState(290);
				terminator();
				setState(291);
				assignmentStat();
				setState(292);
				match(T__19);
				setState(293);
				block();
				}
				break;
			case 4:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				match(T__18);
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(297);
					type(0);
					}
					break;
				}
				setState(300);
				match(ID);
				setState(301);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(302);
				expression(0);
				setState(303);
				match(T__19);
				setState(304);
				block();
				}
				break;
			case 5:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				match(T__26);
				setState(307);
				match(T__18);
				setState(308);
				expression(0);
				setState(309);
				match(T__19);
				setState(310);
				block();
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(311);
					terminator();
					}
					break;
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27 || _la==T__28) {
					{
					{
					setState(314);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(315);
					match(T__18);
					setState(316);
					expression(0);
					setState(317);
					match(T__19);
					setState(318);
					block();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(325);
					terminator();
					}
					break;
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(328);
					match(T__29);
					setState(329);
					((IfStatementContext)_localctx).else_ = block();
					}
				}

				}
				break;
			case 6:
				_localctx = new VarDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				varDecl();
				setState(333);
				terminator();
				}
				break;
			case 7:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(335);
				assignmentStat();
				setState(336);
				terminator();
				}
				break;
			case 8:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(338);
				expression(0);
				setState(339);
				terminator();
				}
				break;
			case 9:
				_localctx = new ExpressionReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(341);
				expressionReturn();
				}
				break;
			case 10:
				_localctx = new VoidReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(342);
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
		enterRule(_localctx, 60, RULE_assignmentStat);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new DefaultAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				qualifiedId();
				setState(346);
				((DefaultAssigmnentContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4395899289600L) != 0)) ) {
					((DefaultAssigmnentContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(347);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ExpAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				qualifiedId();
				setState(350);
				((ExpAssigmnentContext)_localctx).operator = match(T__41);
				setState(351);
				expression(0);
				}
				break;
			case 3:
				_localctx = new TetrAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				qualifiedId();
				setState(354);
				((TetrAssigmnentContext)_localctx).operator = match(T__42);
				setState(355);
				expression(0);
				}
				break;
			case 4:
				_localctx = new FloorDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				qualifiedId();
				setState(358);
				((FloorDivAssigmnentContext)_localctx).operator = match(T__43);
				setState(359);
				expression(0);
				}
				break;
			case 5:
				_localctx = new CeilDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				qualifiedId();
				setState(362);
				((CeilDivAssigmnentContext)_localctx).operator = match(T__44);
				setState(363);
				expression(0);
				}
				break;
			case 6:
				_localctx = new UnaryAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				qualifiedId();
				setState(366);
				((UnaryAssigmnentContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__45 || _la==T__46) ) {
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
	public static class ArrayAccessExprContext extends ExpressionContext {
		public QualifiedIdContext qualifiedId() {
			return getRuleContext(QualifiedIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(371);
				match(T__18);
				setState(372);
				expression(0);
				setState(373);
				match(T__19);
				}
				break;
			case 2:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(375);
				match(T__47);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935003709440L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4221L) != 0)) {
					{
					setState(376);
					expressionList();
					}
				}

				setState(379);
				match(T__48);
				}
				break;
			case 3:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(380);
				match(T__18);
				setState(381);
				type(0);
				setState(382);
				match(T__19);
				setState(383);
				expression(29);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				((UnaryExprContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126311895798906880L) != 0)) ) {
					((UnaryExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(386);
				expression(26);
				}
				break;
			case 5:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__56:
					{
					setState(387);
					match(T__56);
					setState(388);
					expression(0);
					}
					break;
				case T__57:
					{
					setState(389);
					match(T__57);
					setState(390);
					match(T__18);
					setState(391);
					expression(0);
					setState(392);
					match(T__19);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				{
				_localctx = new CreationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(396);
				match(T__78);
				setState(397);
				type(0);
				setState(398);
				match(T__18);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935003709440L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4221L) != 0)) {
					{
					setState(399);
					expressionList();
					}
				}

				setState(402);
				match(T__19);
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(403);
					block();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(406);
				qualifiedId();
				setState(407);
				match(T__18);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935003709440L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4221L) != 0)) {
					{
					setState(408);
					expressionList();
					}
				}

				setState(411);
				match(T__19);
				}
				break;
			case 8:
				{
				_localctx = new ArrayAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				qualifiedId();
				setState(414);
				match(T__47);
				setState(415);
				expression(0);
				setState(416);
				match(T__48);
				}
				break;
			case 9:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(418);
				qualifiedId();
				}
				break;
			case 10:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(419);
				match(INT);
				}
				break;
			case 11:
				{
				_localctx = new DecimalExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420);
				match(DECIMAL);
				}
				break;
			case 12:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(421);
				match(BOOL);
				}
				break;
			case 13:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422);
				match(STRING);
				}
				break;
			case 14:
				{
				_localctx = new CharExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(423);
				match(CHAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(482);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ExpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(426);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(427);
						_la = _input.LA(1);
						if ( !(_la==T__49 || _la==T__50) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(428);
						expression(29);
						}
						break;
					case 2:
						{
						_localctx = new TetrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(429);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(430);
						_la = _input.LA(1);
						if ( !(_la==T__51 || _la==T__52) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(431);
						expression(28);
						}
						break;
					case 3:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(432);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(433);
						((MulDivExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4035225266123964416L) != 0)) ) {
							((MulDivExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(434);
						expression(25);
						}
						break;
					case 4:
						{
						_localctx = new FloorDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(435);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(436);
						((FloorDivExprContext)_localctx).operator = match(T__61);
						setState(437);
						expression(24);
						}
						break;
					case 5:
						{
						_localctx = new CeilDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(438);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(439);
						((CeilDivExprContext)_localctx).operator = match(T__62);
						setState(440);
						expression(23);
						}
						break;
					case 6:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(441);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(442);
						((AddSubExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__54) ) {
							((AddSubExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(443);
						expression(22);
						}
						break;
					case 7:
						{
						_localctx = new ShiftExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(444);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(445);
						((ShiftExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) ) {
							((ShiftExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(446);
						expression(21);
						}
						break;
					case 8:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(447);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(448);
						((RelationalExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1 || _la==T__66 || _la==T__67) ) {
							((RelationalExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(449);
						expression(20);
						}
						break;
					case 9:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(450);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(451);
						((RelationalExprContext)_localctx).operator = match(T__68);
						setState(452);
						expression(19);
						}
						break;
					case 10:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(453);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(454);
						((EqualityExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__69 || _la==T__70) ) {
							((EqualityExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(455);
						expression(18);
						}
						break;
					case 11:
						{
						_localctx = new BitwiseANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(456);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(457);
						match(T__71);
						setState(458);
						expression(17);
						}
						break;
					case 12:
						{
						_localctx = new BitwiseXORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(459);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(460);
						match(T__50);
						setState(461);
						expression(16);
						}
						break;
					case 13:
						{
						_localctx = new BitwiseORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(462);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(463);
						match(T__72);
						setState(464);
						expression(15);
						}
						break;
					case 14:
						{
						_localctx = new LogicalANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(466);
						_la = _input.LA(1);
						if ( !(_la==T__73 || _la==T__74) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(467);
						expression(14);
						}
						break;
					case 15:
						{
						_localctx = new LogicalORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(468);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(469);
						_la = _input.LA(1);
						if ( !(_la==T__75 || _la==T__76) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(470);
						expression(13);
						}
						break;
					case 16:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(471);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(472);
						match(T__77);
						setState(473);
						expression(0);
						setState(474);
						match(T__24);
						setState(475);
						expression(12);
						}
						break;
					case 17:
						{
						_localctx = new VariableAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(477);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(478);
						match(T__79);
						setState(479);
						expression(8);
						}
						break;
					case 18:
						{
						_localctx = new PostfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(480);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(481);
						((PostfixExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__45 || _la==T__46) ) {
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
				setState(486);
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
		enterRule(_localctx, 64, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			expression(0);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(488);
				match(T__20);
				setState(489);
				expression(0);
				}
				}
				setState(494);
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
		enterRule(_localctx, 66, RULE_qualifiedId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(ID);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(496);
					match(T__79);
					setState(497);
					match(ID);
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
			return type_sempred((TypeContext)_localctx, predIndex);
		case 31:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 28);
		case 2:
			return precpred(_ctx, 27);
		case 3:
			return precpred(_ctx, 24);
		case 4:
			return precpred(_ctx, 23);
		case 5:
			return precpred(_ctx, 22);
		case 6:
			return precpred(_ctx, 21);
		case 7:
			return precpred(_ctx, 20);
		case 8:
			return precpred(_ctx, 19);
		case 9:
			return precpred(_ctx, 18);
		case 10:
			return precpred(_ctx, 17);
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 14);
		case 14:
			return precpred(_ctx, 13);
		case 15:
			return precpred(_ctx, 12);
		case 16:
			return precpred(_ctx, 11);
		case 17:
			return precpred(_ctx, 7);
		case 18:
			return precpred(_ctx, 30);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001a\u01f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002`\b\u0002\u0001\u0002\u0005\u0002c\b\u0002\n\u0002\f"+
		"\u0002f\t\u0002\u0001\u0003\u0004\u0003i\b\u0003\u000b\u0003\f\u0003j"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0084\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u008a\b\u000e\u0003\u000e\u008c\b"+
		"\u000e\u0001\u000f\u0003\u000f\u008f\b\u000f\u0001\u000f\u0003\u000f\u0092"+
		"\b\u000f\u0001\u000f\u0003\u000f\u0095\b\u000f\u0001\u000f\u0003\u000f"+
		"\u0098\b\u000f\u0001\u000f\u0003\u000f\u009b\b\u000f\u0001\u000f\u0003"+
		"\u000f\u009e\b\u000f\u0001\u0010\u0003\u0010\u00a1\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00aa\b\u0010\u0003\u0010\u00ac\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u00b2\b\u0012\u0001\u0012\u0003"+
		"\u0012\u00b5\b\u0012\u0001\u0012\u0003\u0012\u00b8\b\u0012\u0001\u0012"+
		"\u0003\u0012\u00bb\b\u0012\u0001\u0012\u0003\u0012\u00be\b\u0012\u0001"+
		"\u0012\u0003\u0012\u00c1\b\u0012\u0001\u0012\u0003\u0012\u00c4\b\u0012"+
		"\u0001\u0012\u0003\u0012\u00c7\b\u0012\u0001\u0012\u0003\u0012\u00ca\b"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00d1\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00d8\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00dd\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00e7\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00ec\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u00f1\b\u0014\n\u0014\f\u0014\u00f4\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0104\b\u0018\n\u0018\f\u0018\u0107"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u010c\b\u0019"+
		"\n\u0019\f\u0019\u010f\t\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0113"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u012b"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0139\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0141\b\u001d\n\u001d\f\u001d"+
		"\u0144\t\u001d\u0001\u001d\u0003\u001d\u0147\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u014b\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0158\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0171\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u017a\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u018b"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0191"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0195\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u019a\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u01a9\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01e3\b\u001f\n\u001f"+
		"\f\u001f\u01e6\t\u001f\u0001 \u0001 \u0001 \u0005 \u01eb\b \n \f \u01ee"+
		"\t \u0001!\u0001!\u0001!\u0005!\u01f3\b!\n!\f!\u01f6\t!\u0001!\u0000\u0002"+
		"\u0004>\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0013\u0001\u0000\u0003"+
		"\u0005\u0001\u0000\u0006\u0007\u0001\u0000\b\n\u0001\u0000\u0010\u0011"+
		"\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001a\u0001\u0000\u001c\u001d"+
		"\u0002\u0000\u0012\u0012\u001f)\u0001\u0000./\u0002\u0000./68\u0001\u0000"+
		"23\u0001\u000045\u0001\u0000;=\u0001\u000067\u0001\u0000@B\u0002\u0000"+
		"\u0001\u0002CD\u0001\u0000FG\u0001\u0000JK\u0001\u0000LM\u023a\u0000I"+
		"\u0001\u0000\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004Z\u0001\u0000"+
		"\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000"+
		"\nn\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000\u0000\u000er\u0001\u0000"+
		"\u0000\u0000\u0010t\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000\u0000"+
		"\u0014x\u0001\u0000\u0000\u0000\u0016z\u0001\u0000\u0000\u0000\u0018|"+
		"\u0001\u0000\u0000\u0000\u001a~\u0001\u0000\u0000\u0000\u001c\u008b\u0001"+
		"\u0000\u0000\u0000\u001e\u008e\u0001\u0000\u0000\u0000 \u00ab\u0001\u0000"+
		"\u0000\u0000\"\u00ad\u0001\u0000\u0000\u0000$\u00b1\u0001\u0000\u0000"+
		"\u0000&\u00eb\u0001\u0000\u0000\u0000(\u00ed\u0001\u0000\u0000\u0000*"+
		"\u00f5\u0001\u0000\u0000\u0000,\u00f8\u0001\u0000\u0000\u0000.\u00fc\u0001"+
		"\u0000\u0000\u00000\u0105\u0001\u0000\u0000\u00002\u010d\u0001\u0000\u0000"+
		"\u00004\u0112\u0001\u0000\u0000\u00006\u0114\u0001\u0000\u0000\u00008"+
		"\u0118\u0001\u0000\u0000\u0000:\u0157\u0001\u0000\u0000\u0000<\u0170\u0001"+
		"\u0000\u0000\u0000>\u01a8\u0001\u0000\u0000\u0000@\u01e7\u0001\u0000\u0000"+
		"\u0000B\u01ef\u0001\u0000\u0000\u0000DH\u0003\u0002\u0001\u0000EH\u0003"+
		":\u001d\u0000FH\u0003\u0006\u0003\u0000GD\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LM\u0005\u0000\u0000\u0001M\u0001\u0001"+
		"\u0000\u0000\u0000NO\u0003\u001c\u000e\u0000OP\u0003\u0006\u0003\u0000"+
		"PV\u0001\u0000\u0000\u0000QV\u0003&\u0013\u0000RS\u0003\"\u0011\u0000"+
		"ST\u0003\u0006\u0003\u0000TV\u0001\u0000\u0000\u0000UN\u0001\u0000\u0000"+
		"\u0000UQ\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000V\u0003\u0001"+
		"\u0000\u0000\u0000WX\u0006\u0002\uffff\uffff\u0000X[\u0005X\u0000\u0000"+
		"Y[\u0003B!\u0000ZW\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000["+
		"d\u0001\u0000\u0000\u0000\\]\n\u0003\u0000\u0000]_\u0005\u0001\u0000\u0000"+
		"^`\u0003\u0004\u0002\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ac\u0005\u0002\u0000\u0000b\\\u0001\u0000"+
		"\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000e\u0005\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000"+
		"\u0000gi\u0005]\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u0007\u0001"+
		"\u0000\u0000\u0000lm\u0007\u0000\u0000\u0000m\t\u0001\u0000\u0000\u0000"+
		"no\u0007\u0001\u0000\u0000o\u000b\u0001\u0000\u0000\u0000pq\u0007\u0002"+
		"\u0000\u0000q\r\u0001\u0000\u0000\u0000rs\u0005\t\u0000\u0000s\u000f\u0001"+
		"\u0000\u0000\u0000tu\u0005\u000b\u0000\u0000u\u0011\u0001\u0000\u0000"+
		"\u0000vw\u0005\f\u0000\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0005\r"+
		"\u0000\u0000y\u0015\u0001\u0000\u0000\u0000z{\u0005\u000e\u0000\u0000"+
		"{\u0017\u0001\u0000\u0000\u0000|}\u0005\n\u0000\u0000}\u0019\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005\u000f\u0000\u0000\u007f\u001b\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0007\u0003\u0000\u0000\u0081\u0083\u0003B!\u0000\u0082"+
		"\u0084\u0005V\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u008c\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0007\u0003\u0000\u0000\u0086\u0087\u0005\t\u0000\u0000\u0087\u0089\u0003"+
		"B!\u0000\u0088\u008a\u0005V\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000"+
		"\u0000\u008b\u0080\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000"+
		"\u0000\u008c\u001d\u0001\u0000\u0000\u0000\u008d\u008f\u0003\b\u0004\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0092\u0003\n\u0005\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u0095\u0003\u000e\u0007\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0097\u0001\u0000\u0000\u0000\u0096\u0098\u0003\u0010\b\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0012\t\u0000\u009a\u0099\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0003\u0014\n\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u001f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a1\u0005X\u0000\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005[\u0000\u0000\u00a3\u00a4\u0005\u0012\u0000\u0000"+
		"\u00a4\u00ac\u0003>\u001f\u0000\u00a5\u00a6\u0003\u0004\u0002\u0000\u00a6"+
		"\u00a9\u0005[\u0000\u0000\u00a7\u00a8\u0005\u0012\u0000\u0000\u00a8\u00aa"+
		"\u0003>\u001f\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a0\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ac!\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0003\u001e\u000f\u0000\u00ae\u00af\u0003 \u0010"+
		"\u0000\u00af#\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\b\u0004\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b5\u0003\n\u0005\u0000\u00b4"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\f\u0006\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003\u0010\b\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0003\u0012\t\u0000\u00bd\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c1\u0003\u0014\n\u0000\u00c0\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0003\u0016\u000b\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0003\u0018\f\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0003\u001a\r\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca%\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0003$\u0012\u0000\u00cc\u00cd\u0005W\u0000\u0000\u00cd\u00ce\u0005["+
		"\u0000\u0000\u00ce\u00d0\u0005\u0013\u0000\u0000\u00cf\u00d1\u0003(\u0014"+
		"\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0014\u0000"+
		"\u0000\u00d3\u00d4\u0003,\u0016\u0000\u00d4\u00ec\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d7\u0003$\u0012\u0000\u00d6\u00d8\u0005X\u0000\u0000\u00d7\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0005[\u0000\u0000\u00da\u00dc\u0005"+
		"\u0013\u0000\u0000\u00db\u00dd\u0003(\u0014\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005\u0014\u0000\u0000\u00df\u00e0\u0003.\u0017"+
		"\u0000\u00e0\u00ec\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003$\u0012\u0000"+
		"\u00e2\u00e3\u0003\u0004\u0002\u0000\u00e3\u00e4\u0005[\u0000\u0000\u00e4"+
		"\u00e6\u0005\u0013\u0000\u0000\u00e5\u00e7\u0003(\u0014\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0014\u0000\u0000\u00e9\u00ea"+
		"\u0003.\u0017\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00cb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00d5\u0001\u0000\u0000\u0000\u00eb\u00e1\u0001"+
		"\u0000\u0000\u0000\u00ec\'\u0001\u0000\u0000\u0000\u00ed\u00f2\u0003*"+
		"\u0015\u0000\u00ee\u00ef\u0005\u0015\u0000\u0000\u00ef\u00f1\u0003*\u0015"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f3)\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0003\u0004\u0002\u0000\u00f6\u00f7\u0005[\u0000\u0000\u00f7"+
		"+\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005Y\u0000\u0000\u00f9\u00fa\u0003"+
		"0\u0018\u0000\u00fa\u00fb\u0005Z\u0000\u0000\u00fb-\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0005Y\u0000\u0000\u00fd\u00fe\u00032\u0019\u0000\u00fe"+
		"\u00ff\u0005Z\u0000\u0000\u00ff/\u0001\u0000\u0000\u0000\u0100\u0104\u0003"+
		":\u001d\u0000\u0101\u0104\u00038\u001c\u0000\u0102\u0104\u0003\u0006\u0003"+
		"\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u01061\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u010c\u0003:\u001d\u0000\u0109\u010c\u00036\u001b\u0000\u010a\u010c"+
		"\u0003\u0006\u0003\u0000\u010b\u0108\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010f"+
		"\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e3\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u0113\u0003,\u0016\u0000\u0111\u0113\u0003.\u0017"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0111\u0001\u0000\u0000"+
		"\u0000\u01135\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0016\u0000\u0000"+
		"\u0115\u0116\u0003>\u001f\u0000\u0116\u0117\u0003\u0006\u0003\u0000\u0117"+
		"7\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0016\u0000\u0000\u0119\u011a"+
		"\u0003\u0006\u0003\u0000\u011a9\u0001\u0000\u0000\u0000\u011b\u0158\u0003"+
		"&\u0013\u0000\u011c\u0158\u0003,\u0016\u0000\u011d\u011e\u0005\u0017\u0000"+
		"\u0000\u011e\u011f\u0005\u0013\u0000\u0000\u011f\u0120\u0003 \u0010\u0000"+
		"\u0120\u0121\u0003\u0006\u0003\u0000\u0121\u0122\u0003>\u001f\u0000\u0122"+
		"\u0123\u0003\u0006\u0003\u0000\u0123\u0124\u0003<\u001e\u0000\u0124\u0125"+
		"\u0005\u0014\u0000\u0000\u0125\u0126\u00034\u001a\u0000\u0126\u0158\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0007\u0004\u0000\u0000\u0128\u012a\u0005"+
		"\u0013\u0000\u0000\u0129\u012b\u0003\u0004\u0002\u0000\u012a\u0129\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0005[\u0000\u0000\u012d\u012e\u0007\u0005"+
		"\u0000\u0000\u012e\u012f\u0003>\u001f\u0000\u012f\u0130\u0005\u0014\u0000"+
		"\u0000\u0130\u0131\u00034\u001a\u0000\u0131\u0158\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005\u001b\u0000\u0000\u0133\u0134\u0005\u0013\u0000\u0000"+
		"\u0134\u0135\u0003>\u001f\u0000\u0135\u0136\u0005\u0014\u0000\u0000\u0136"+
		"\u0138\u00034\u001a\u0000\u0137\u0139\u0003\u0006\u0003\u0000\u0138\u0137"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u0142"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0007\u0006\u0000\u0000\u013b\u013c"+
		"\u0005\u0013\u0000\u0000\u013c\u013d\u0003>\u001f\u0000\u013d\u013e\u0005"+
		"\u0014\u0000\u0000\u013e\u013f\u00034\u001a\u0000\u013f\u0141\u0001\u0000"+
		"\u0000\u0000\u0140\u013a\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000"+
		"\u0000\u0000\u0145\u0147\u0003\u0006\u0003\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005\u001e\u0000\u0000\u0149\u014b\u00034\u001a"+
		"\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u0158\u0001\u0000\u0000\u0000\u014c\u014d\u0003\"\u0011\u0000"+
		"\u014d\u014e\u0003\u0006\u0003\u0000\u014e\u0158\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0003<\u001e\u0000\u0150\u0151\u0003\u0006\u0003\u0000\u0151"+
		"\u0158\u0001\u0000\u0000\u0000\u0152\u0153\u0003>\u001f\u0000\u0153\u0154"+
		"\u0003\u0006\u0003\u0000\u0154\u0158\u0001\u0000\u0000\u0000\u0155\u0158"+
		"\u00036\u001b\u0000\u0156\u0158\u00038\u001c\u0000\u0157\u011b\u0001\u0000"+
		"\u0000\u0000\u0157\u011c\u0001\u0000\u0000\u0000\u0157\u011d\u0001\u0000"+
		"\u0000\u0000\u0157\u0127\u0001\u0000\u0000\u0000\u0157\u0132\u0001\u0000"+
		"\u0000\u0000\u0157\u014c\u0001\u0000\u0000\u0000\u0157\u014f\u0001\u0000"+
		"\u0000\u0000\u0157\u0152\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158;\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0003B!\u0000\u015a\u015b\u0007\u0007\u0000\u0000\u015b"+
		"\u015c\u0003>\u001f\u0000\u015c\u0171\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0003B!\u0000\u015e\u015f\u0005*\u0000\u0000\u015f\u0160\u0003>\u001f"+
		"\u0000\u0160\u0171\u0001\u0000\u0000\u0000\u0161\u0162\u0003B!\u0000\u0162"+
		"\u0163\u0005+\u0000\u0000\u0163\u0164\u0003>\u001f\u0000\u0164\u0171\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0003B!\u0000\u0166\u0167\u0005,\u0000"+
		"\u0000\u0167\u0168\u0003>\u001f\u0000\u0168\u0171\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0003B!\u0000\u016a\u016b\u0005-\u0000\u0000\u016b\u016c"+
		"\u0003>\u001f\u0000\u016c\u0171\u0001\u0000\u0000\u0000\u016d\u016e\u0003"+
		"B!\u0000\u016e\u016f\u0007\b\u0000\u0000\u016f\u0171\u0001\u0000\u0000"+
		"\u0000\u0170\u0159\u0001\u0000\u0000\u0000\u0170\u015d\u0001\u0000\u0000"+
		"\u0000\u0170\u0161\u0001\u0000\u0000\u0000\u0170\u0165\u0001\u0000\u0000"+
		"\u0000\u0170\u0169\u0001\u0000\u0000\u0000\u0170\u016d\u0001\u0000\u0000"+
		"\u0000\u0171=\u0001\u0000\u0000\u0000\u0172\u0173\u0006\u001f\uffff\uffff"+
		"\u0000\u0173\u0174\u0005\u0013\u0000\u0000\u0174\u0175\u0003>\u001f\u0000"+
		"\u0175\u0176\u0005\u0014\u0000\u0000\u0176\u01a9\u0001\u0000\u0000\u0000"+
		"\u0177\u0179\u00050\u0000\u0000\u0178\u017a\u0003@ \u0000\u0179\u0178"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u01a9\u00051\u0000\u0000\u017c\u017d\u0005"+
		"\u0013\u0000\u0000\u017d\u017e\u0003\u0004\u0002\u0000\u017e\u017f\u0005"+
		"\u0014\u0000\u0000\u017f\u0180\u0003>\u001f\u001d\u0180\u01a9\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0007\t\u0000\u0000\u0182\u01a9\u0003>\u001f"+
		"\u001a\u0183\u0184\u00059\u0000\u0000\u0184\u018b\u0003>\u001f\u0000\u0185"+
		"\u0186\u0005:\u0000\u0000\u0186\u0187\u0005\u0013\u0000\u0000\u0187\u0188"+
		"\u0003>\u001f\u0000\u0188\u0189\u0005\u0014\u0000\u0000\u0189\u018b\u0001"+
		"\u0000\u0000\u0000\u018a\u0183\u0001\u0000\u0000\u0000\u018a\u0185\u0001"+
		"\u0000\u0000\u0000\u018b\u01a9\u0001\u0000\u0000\u0000\u018c\u018d\u0005"+
		"O\u0000\u0000\u018d\u018e\u0003\u0004\u0002\u0000\u018e\u0190\u0005\u0013"+
		"\u0000\u0000\u018f\u0191\u0003@ \u0000\u0190\u018f\u0001\u0000\u0000\u0000"+
		"\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u0192\u0194\u0005\u0014\u0000\u0000\u0193\u0195\u00034\u001a\u0000\u0194"+
		"\u0193\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195"+
		"\u01a9\u0001\u0000\u0000\u0000\u0196\u0197\u0003B!\u0000\u0197\u0199\u0005"+
		"\u0013\u0000\u0000\u0198\u019a\u0003@ \u0000\u0199\u0198\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005\u0014\u0000\u0000\u019c\u01a9\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0003B!\u0000\u019e\u019f\u00050\u0000\u0000\u019f"+
		"\u01a0\u0003>\u001f\u0000\u01a0\u01a1\u00051\u0000\u0000\u01a1\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a9\u0003B!\u0000\u01a3\u01a9\u0005S\u0000"+
		"\u0000\u01a4\u01a9\u0005T\u0000\u0000\u01a5\u01a9\u0005U\u0000\u0000\u01a6"+
		"\u01a9\u0005R\u0000\u0000\u01a7\u01a9\u0005Q\u0000\u0000\u01a8\u0172\u0001"+
		"\u0000\u0000\u0000\u01a8\u0177\u0001\u0000\u0000\u0000\u01a8\u017c\u0001"+
		"\u0000\u0000\u0000\u01a8\u0181\u0001\u0000\u0000\u0000\u01a8\u018a\u0001"+
		"\u0000\u0000\u0000\u01a8\u018c\u0001\u0000\u0000\u0000\u01a8\u0196\u0001"+
		"\u0000\u0000\u0000\u01a8\u019d\u0001\u0000\u0000\u0000\u01a8\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a3\u0001\u0000\u0000\u0000\u01a8\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9\u01e4\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\n\u001c\u0000\u0000\u01ab\u01ac\u0007\n"+
		"\u0000\u0000\u01ac\u01e3\u0003>\u001f\u001d\u01ad\u01ae\n\u001b\u0000"+
		"\u0000\u01ae\u01af\u0007\u000b\u0000\u0000\u01af\u01e3\u0003>\u001f\u001c"+
		"\u01b0\u01b1\n\u0018\u0000\u0000\u01b1\u01b2\u0007\f\u0000\u0000\u01b2"+
		"\u01e3\u0003>\u001f\u0019\u01b3\u01b4\n\u0017\u0000\u0000\u01b4\u01b5"+
		"\u0005>\u0000\u0000\u01b5\u01e3\u0003>\u001f\u0018\u01b6\u01b7\n\u0016"+
		"\u0000\u0000\u01b7\u01b8\u0005?\u0000\u0000\u01b8\u01e3\u0003>\u001f\u0017"+
		"\u01b9\u01ba\n\u0015\u0000\u0000\u01ba\u01bb\u0007\r\u0000\u0000\u01bb"+
		"\u01e3\u0003>\u001f\u0016\u01bc\u01bd\n\u0014\u0000\u0000\u01bd\u01be"+
		"\u0007\u000e\u0000\u0000\u01be\u01e3\u0003>\u001f\u0015\u01bf\u01c0\n"+
		"\u0013\u0000\u0000\u01c0\u01c1\u0007\u000f\u0000\u0000\u01c1\u01e3\u0003"+
		">\u001f\u0014\u01c2\u01c3\n\u0012\u0000\u0000\u01c3\u01c4\u0005E\u0000"+
		"\u0000\u01c4\u01e3\u0003>\u001f\u0013\u01c5\u01c6\n\u0011\u0000\u0000"+
		"\u01c6\u01c7\u0007\u0010\u0000\u0000\u01c7\u01e3\u0003>\u001f\u0012\u01c8"+
		"\u01c9\n\u0010\u0000\u0000\u01c9\u01ca\u0005H\u0000\u0000\u01ca\u01e3"+
		"\u0003>\u001f\u0011\u01cb\u01cc\n\u000f\u0000\u0000\u01cc\u01cd\u0005"+
		"3\u0000\u0000\u01cd\u01e3\u0003>\u001f\u0010\u01ce\u01cf\n\u000e\u0000"+
		"\u0000\u01cf\u01d0\u0005I\u0000\u0000\u01d0\u01e3\u0003>\u001f\u000f\u01d1"+
		"\u01d2\n\r\u0000\u0000\u01d2\u01d3\u0007\u0011\u0000\u0000\u01d3\u01e3"+
		"\u0003>\u001f\u000e\u01d4\u01d5\n\f\u0000\u0000\u01d5\u01d6\u0007\u0012"+
		"\u0000\u0000\u01d6\u01e3\u0003>\u001f\r\u01d7\u01d8\n\u000b\u0000\u0000"+
		"\u01d8\u01d9\u0005N\u0000\u0000\u01d9\u01da\u0003>\u001f\u0000\u01da\u01db"+
		"\u0005\u0019\u0000\u0000\u01db\u01dc\u0003>\u001f\f\u01dc\u01e3\u0001"+
		"\u0000\u0000\u0000\u01dd\u01de\n\u0007\u0000\u0000\u01de\u01df\u0005P"+
		"\u0000\u0000\u01df\u01e3\u0003>\u001f\b\u01e0\u01e1\n\u001e\u0000\u0000"+
		"\u01e1\u01e3\u0007\b\u0000\u0000\u01e2\u01aa\u0001\u0000\u0000\u0000\u01e2"+
		"\u01ad\u0001\u0000\u0000\u0000\u01e2\u01b0\u0001\u0000\u0000\u0000\u01e2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01e2\u01b6\u0001\u0000\u0000\u0000\u01e2"+
		"\u01b9\u0001\u0000\u0000\u0000\u01e2\u01bc\u0001\u0000\u0000\u0000\u01e2"+
		"\u01bf\u0001\u0000\u0000\u0000\u01e2\u01c2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01c5\u0001\u0000\u0000\u0000\u01e2\u01c8\u0001\u0000\u0000\u0000\u01e2"+
		"\u01cb\u0001\u0000\u0000\u0000\u01e2\u01ce\u0001\u0000\u0000\u0000\u01e2"+
		"\u01d1\u0001\u0000\u0000\u0000\u01e2\u01d4\u0001\u0000\u0000\u0000\u01e2"+
		"\u01d7\u0001\u0000\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5"+
		"?\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01ec"+
		"\u0003>\u001f\u0000\u01e8\u01e9\u0005\u0015\u0000\u0000\u01e9\u01eb\u0003"+
		">\u001f\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01edA\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f4\u0005[\u0000\u0000\u01f0\u01f1\u0005P\u0000\u0000\u01f1"+
		"\u01f3\u0005[\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f5C\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001"+
		"\u0000\u0000\u00008GIUZ_dj\u0083\u0089\u008b\u008e\u0091\u0094\u0097\u009a"+
		"\u009d\u00a0\u00a9\u00ab\u00b1\u00b4\u00b7\u00ba\u00bd\u00c0\u00c3\u00c6"+
		"\u00c9\u00d0\u00d7\u00dc\u00e6\u00eb\u00f2\u0103\u0105\u010b\u010d\u0112"+
		"\u012a\u0138\u0142\u0146\u014a\u0157\u0170\u0179\u018a\u0190\u0194\u0199"+
		"\u01a8\u01e2\u01e4\u01ec\u01f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}