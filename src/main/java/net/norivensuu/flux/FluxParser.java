// Generated from C:/Users/student/IdeaProjects/Flux/src/main/antlr/Flux.g4 by ANTLR 4.13.2
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
		RULE_program = 0, RULE_type = 1, RULE_accessModifier = 2, RULE_unfinishedMd = 3, 
		RULE_implementationModifier = 4, RULE_staticMd = 5, RULE_finalMd = 6, 
		RULE_transientMd = 7, RULE_volatileMd = 8, RULE_synchronizedMd = 9, RULE_nativeMd = 10, 
		RULE_strictfpMd = 11, RULE_importDecl = 12, RULE_variableModifiers = 13, 
		RULE_localVarDecl = 14, RULE_varDecl = 15, RULE_methodModifiers = 16, 
		RULE_methodDecl = 17, RULE_formalParameters = 18, RULE_formalParameter = 19, 
		RULE_voidBlock = 20, RULE_returnBlock = 21, RULE_voidLines = 22, RULE_expressionLines = 23, 
		RULE_block = 24, RULE_expressionReturn = 25, RULE_voidReturn = 26, RULE_statement = 27, 
		RULE_assignmentStat = 28, RULE_expression = 29, RULE_expressionList = 30, 
		RULE_absoluteId = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "type", "accessModifier", "unfinishedMd", "implementationModifier", 
			"staticMd", "finalMd", "transientMd", "volatileMd", "synchronizedMd", 
			"nativeMd", "strictfpMd", "importDecl", "variableModifiers", "localVarDecl", 
			"varDecl", "methodModifiers", "methodDecl", "formalParameters", "formalParameter", 
			"voidBlock", "returnBlock", "voidLines", "expressionLines", "block", 
			"expressionReturn", "voidReturn", "statement", "assignmentStat", "expression", 
			"expressionList", "absoluteId"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935167549432L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 22397L) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__18:
				case T__21:
				case T__22:
				case T__23:
				case T__26:
				case T__45:
				case T__46:
				case T__47:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__78:
				case CHAR:
				case STRING:
				case INT:
				case DECIMAL:
				case BOOL:
				case VOID:
				case VAR:
				case FIGURE_BRACKET_L:
				case ID:
					{
					setState(64);
					statement();
					}
					break;
				case TERMINATOR:
					{
					setState(66); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(65);
							match(TERMINATOR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(68); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(FluxParser.VAR, 0); }
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(78);
				match(VAR);
				}
				break;
			case ID:
				{
				setState(79);
				absoluteId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
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
					setState(82);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(83);
					match(T__0);
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==VAR || _la==ID) {
						{
						setState(84);
						type(0);
						}
					}

					setState(87);
					match(T__1);
					}
					} 
				}
				setState(92);
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
		enterRule(_localctx, 4, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		enterRule(_localctx, 6, RULE_unfinishedMd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		enterRule(_localctx, 8, RULE_implementationModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		enterRule(_localctx, 10, RULE_staticMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		enterRule(_localctx, 12, RULE_finalMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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
		enterRule(_localctx, 14, RULE_transientMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
		enterRule(_localctx, 16, RULE_volatileMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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
		enterRule(_localctx, 18, RULE_synchronizedMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 20, RULE_nativeMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		enterRule(_localctx, 22, RULE_strictfpMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		public Token static_;
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		enterRule(_localctx, 24, RULE_importDecl);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				absoluteId();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(115);
					((ImportDeclContext)_localctx).wildcard = match(WILDCARD);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				((ImportDeclContext)_localctx).static_ = match(T__8);
				setState(120);
				absoluteId();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WILDCARD) {
					{
					setState(121);
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
		enterRule(_localctx, 26, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				setState(126);
				accessModifier();
				}
			}

			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(129);
				unfinishedMd();
				}
			}

			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(132);
				staticMd();
				}
			}

			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(135);
				finalMd();
				}
			}

			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(138);
				transientMd();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(141);
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
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(FluxParser.VAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterLocalVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitLocalVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitLocalVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarDeclContext localVarDecl() throws RecognitionException {
		LocalVarDeclContext _localctx = new LocalVarDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_localVarDecl);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(144);
					match(VAR);
					}
				}

				setState(147);
				match(ID);
				setState(148);
				match(T__17);
				setState(149);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				type(0);
				setState(151);
				match(ID);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(152);
					match(T__17);
					setState(153);
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
		enterRule(_localctx, 30, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			variableModifiers();
			setState(159);
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
	public static class MethodModifiersContext extends ParserRuleContext {
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
		public MethodModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterMethodModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitMethodModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitMethodModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodModifiersContext methodModifiers() throws RecognitionException {
		MethodModifiersContext _localctx = new MethodModifiersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				setState(161);
				accessModifier();
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(164);
				unfinishedMd();
				}
			}

			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(167);
				implementationModifier();
				}
				break;
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(170);
				finalMd();
				}
			}

			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(173);
				transientMd();
				}
			}

			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(176);
				volatileMd();
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(179);
				synchronizedMd();
				}
			}

			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(182);
				nativeMd();
				}
			}

			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(185);
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
	public static class MethodDeclContext extends ParserRuleContext {
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	 
		public MethodDeclContext() { }
		public void copyFrom(MethodDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RunnableMethodDeclContext extends MethodDeclContext {
		public MethodModifiersContext methodModifiers() {
			return getRuleContext(MethodModifiersContext.class,0);
		}
		public TerminalNode VOID() { return getToken(FluxParser.VOID, 0); }
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public VoidBlockContext voidBlock() {
			return getRuleContext(VoidBlockContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public RunnableMethodDeclContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterRunnableMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitRunnableMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitRunnableMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionMethodDeclContext extends MethodDeclContext {
		public MethodModifiersContext methodModifiers() {
			return getRuleContext(MethodModifiersContext.class,0);
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
		public FunctionMethodDeclContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFunctionMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFunctionMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFunctionMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarMethodDeclContext extends MethodDeclContext {
		public MethodModifiersContext methodModifiers() {
			return getRuleContext(MethodModifiersContext.class,0);
		}
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public ReturnBlockContext returnBlock() {
			return getRuleContext(ReturnBlockContext.class,0);
		}
		public TerminalNode VAR() { return getToken(FluxParser.VAR, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public VarMethodDeclContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterVarMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitVarMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitVarMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodDecl);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new RunnableMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				methodModifiers();
				setState(189);
				match(VOID);
				setState(190);
				match(ID);
				setState(191);
				match(T__18);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(192);
					formalParameters();
					}
				}

				setState(195);
				match(T__19);
				setState(196);
				voidBlock();
				}
				break;
			case 2:
				_localctx = new VarMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				methodModifiers();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(199);
					match(VAR);
					}
				}

				setState(202);
				match(ID);
				setState(203);
				match(T__18);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(204);
					formalParameters();
					}
				}

				setState(207);
				match(T__19);
				setState(208);
				returnBlock();
				}
				break;
			case 3:
				_localctx = new FunctionMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				methodModifiers();
				setState(211);
				type(0);
				setState(212);
				match(ID);
				setState(213);
				match(T__18);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(214);
					formalParameters();
					}
				}

				setState(217);
				match(T__19);
				setState(218);
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
		enterRule(_localctx, 36, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			formalParameter();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(223);
				match(T__20);
				setState(224);
				formalParameter();
				}
				}
				setState(229);
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
		enterRule(_localctx, 38, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			type(0);
			setState(231);
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
		enterRule(_localctx, 40, RULE_voidBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(FIGURE_BRACKET_L);
			setState(234);
			voidLines();
			setState(235);
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
		enterRule(_localctx, 42, RULE_returnBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(FIGURE_BRACKET_L);
			setState(238);
			expressionLines();
			setState(239);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
		enterRule(_localctx, 44, RULE_voidLines);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935167549432L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 22397L) != 0)) {
				{
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(241);
					statement();
					}
					break;
				case 2:
					{
					setState(242);
					voidReturn();
					}
					break;
				case 3:
					{
					setState(244); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(243);
							match(TERMINATOR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(246); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				setState(252);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
		enterRule(_localctx, 46, RULE_expressionLines);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935167549432L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 22397L) != 0)) {
				{
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(253);
					statement();
					}
					break;
				case 2:
					{
					setState(254);
					expressionReturn();
					}
					break;
				case 3:
					{
					setState(256); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(255);
							match(TERMINATOR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(258); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				setState(264);
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
		enterRule(_localctx, 48, RULE_block);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new VoidBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				voidBlock();
				}
				break;
			case 2:
				_localctx = new ReturnBlockOptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
		enterRule(_localctx, 50, RULE_expressionReturn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__21);
			setState(270);
			expression(0);
			setState(272); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(271);
					match(TERMINATOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(274); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
	public static class VoidReturnContext extends ParserRuleContext {
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
		enterRule(_localctx, 52, RULE_voidReturn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__21);
			setState(278); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(277);
					match(TERMINATOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(280); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
	public static class ImportDeclStatementContext extends StatementContext {
		public ImportDeclContext importDecl() {
			return getRuleContext(ImportDeclContext.class,0);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
		}
		public ImportDeclStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterImportDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitImportDeclStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitImportDeclStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentStatContext assignmentStat() {
			return getRuleContext(AssignmentStatContext.class,0);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
	public static class MethodDeclStatementContext extends StatementContext {
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public MethodDeclStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterMethodDeclStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitMethodDeclStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitMethodDeclStatement(this);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatContext assignmentStat() {
			return getRuleContext(AssignmentStatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
		public List<TerminalNode> TERMINATOR() { return getTokens(FluxParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(FluxParser.TERMINATOR, i);
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
		enterRule(_localctx, 54, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new ImportDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				importDecl();
				setState(284); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(283);
						match(TERMINATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(286); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new MethodDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				methodDecl();
				}
				break;
			case 3:
				_localctx = new VoidBlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				voidBlock();
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				match(T__22);
				setState(291);
				match(T__18);
				setState(292);
				localVarDecl();
				setState(294); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(293);
					match(TERMINATOR);
					}
					}
					setState(296); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TERMINATOR );
				setState(298);
				expression(0);
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(299);
					match(TERMINATOR);
					}
					}
					setState(302); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TERMINATOR );
				setState(304);
				assignmentStat();
				setState(305);
				match(T__19);
				setState(306);
				block();
				}
				break;
			case 5:
				_localctx = new ForeachStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				match(T__18);
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(310);
					type(0);
					}
					break;
				}
				setState(313);
				match(ID);
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(315);
				expression(0);
				setState(316);
				match(T__19);
				setState(317);
				block();
				}
				break;
			case 6:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(319);
				match(T__26);
				setState(320);
				match(T__18);
				setState(321);
				expression(0);
				setState(322);
				match(T__19);
				setState(323);
				block();
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(325); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(324);
							match(TERMINATOR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(327); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27 || _la==T__28) {
					{
					{
					setState(331);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(332);
					match(T__18);
					setState(333);
					expression(0);
					setState(334);
					match(T__19);
					setState(335);
					block();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(343); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(342);
							match(TERMINATOR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(345); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(349);
					match(T__29);
					setState(350);
					((IfStatementContext)_localctx).else_ = block();
					}
				}

				}
				break;
			case 7:
				_localctx = new VarDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(353);
				varDecl();
				setState(355); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(354);
						match(TERMINATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(357); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(359);
				assignmentStat();
				setState(361); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(360);
						match(TERMINATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(363); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 9:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(365);
				expression(0);
				setState(367); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(366);
						match(TERMINATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(369); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 10:
				_localctx = new ExpressionReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(371);
				expressionReturn();
				}
				break;
			case 11:
				_localctx = new VoidReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(372);
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
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		enterRule(_localctx, 56, RULE_assignmentStat);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new DefaultAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				absoluteId();
				setState(376);
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
				setState(377);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ExpAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				absoluteId();
				setState(380);
				((ExpAssigmnentContext)_localctx).operator = match(T__41);
				setState(381);
				expression(0);
				}
				break;
			case 3:
				_localctx = new TetrAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				absoluteId();
				setState(384);
				((TetrAssigmnentContext)_localctx).operator = match(T__42);
				setState(385);
				expression(0);
				}
				break;
			case 4:
				_localctx = new FloorDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				absoluteId();
				setState(388);
				((FloorDivAssigmnentContext)_localctx).operator = match(T__43);
				setState(389);
				expression(0);
				}
				break;
			case 5:
				_localctx = new CeilDivAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				absoluteId();
				setState(392);
				((CeilDivAssigmnentContext)_localctx).operator = match(T__44);
				setState(393);
				expression(0);
				}
				break;
			case 6:
				_localctx = new UnaryAssigmnentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(395);
				absoluteId();
				setState(396);
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
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		public AbsoluteIdContext absoluteId() {
			return getRuleContext(AbsoluteIdContext.class,0);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(401);
				match(T__18);
				setState(402);
				expression(0);
				setState(403);
				match(T__19);
				}
				break;
			case 2:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(405);
				match(T__47);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935003709440L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4221L) != 0)) {
					{
					setState(406);
					expressionList();
					}
				}

				setState(409);
				match(T__48);
				}
				break;
			case 3:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(410);
				match(T__18);
				setState(411);
				type(0);
				setState(412);
				match(T__19);
				setState(413);
				expression(29);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(415);
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
				setState(416);
				expression(26);
				}
				break;
			case 5:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__56:
					{
					setState(417);
					match(T__56);
					setState(418);
					expression(0);
					}
					break;
				case T__57:
					{
					setState(419);
					match(T__57);
					setState(420);
					match(T__18);
					setState(421);
					expression(0);
					setState(422);
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
				setState(426);
				match(T__78);
				setState(427);
				type(0);
				setState(428);
				match(T__18);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935003709440L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4221L) != 0)) {
					{
					setState(429);
					expressionList();
					}
				}

				setState(432);
				match(T__19);
				setState(434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(433);
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
				setState(436);
				absoluteId();
				setState(437);
				match(T__18);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 558938935003709440L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 4221L) != 0)) {
					{
					setState(438);
					expressionList();
					}
				}

				setState(441);
				match(T__19);
				}
				break;
			case 8:
				{
				_localctx = new ArrayAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(443);
				absoluteId();
				setState(444);
				match(T__47);
				setState(445);
				expression(0);
				setState(446);
				match(T__48);
				}
				break;
			case 9:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(448);
				absoluteId();
				}
				break;
			case 10:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(449);
				match(INT);
				}
				break;
			case 11:
				{
				_localctx = new DecimalExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(450);
				match(DECIMAL);
				}
				break;
			case 12:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(451);
				match(BOOL);
				}
				break;
			case 13:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(452);
				match(STRING);
				}
				break;
			case 14:
				{
				_localctx = new CharExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(453);
				match(CHAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(512);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new ExpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(456);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(457);
						_la = _input.LA(1);
						if ( !(_la==T__49 || _la==T__50) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(458);
						expression(29);
						}
						break;
					case 2:
						{
						_localctx = new TetrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(459);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(460);
						_la = _input.LA(1);
						if ( !(_la==T__51 || _la==T__52) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(461);
						expression(28);
						}
						break;
					case 3:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(462);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(463);
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
						setState(464);
						expression(25);
						}
						break;
					case 4:
						{
						_localctx = new FloorDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(466);
						((FloorDivExprContext)_localctx).operator = match(T__61);
						setState(467);
						expression(24);
						}
						break;
					case 5:
						{
						_localctx = new CeilDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(468);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(469);
						((CeilDivExprContext)_localctx).operator = match(T__62);
						setState(470);
						expression(23);
						}
						break;
					case 6:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(471);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(472);
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
						setState(473);
						expression(22);
						}
						break;
					case 7:
						{
						_localctx = new ShiftExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(474);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(475);
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
						setState(476);
						expression(21);
						}
						break;
					case 8:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(477);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(478);
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
						setState(479);
						expression(20);
						}
						break;
					case 9:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(480);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(481);
						((RelationalExprContext)_localctx).operator = match(T__68);
						setState(482);
						expression(19);
						}
						break;
					case 10:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(483);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(484);
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
						setState(485);
						expression(18);
						}
						break;
					case 11:
						{
						_localctx = new BitwiseANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(486);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(487);
						match(T__71);
						setState(488);
						expression(17);
						}
						break;
					case 12:
						{
						_localctx = new BitwiseXORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(489);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(490);
						match(T__50);
						setState(491);
						expression(16);
						}
						break;
					case 13:
						{
						_localctx = new BitwiseORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(492);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(493);
						match(T__72);
						setState(494);
						expression(15);
						}
						break;
					case 14:
						{
						_localctx = new LogicalANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(495);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(496);
						_la = _input.LA(1);
						if ( !(_la==T__73 || _la==T__74) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(497);
						expression(14);
						}
						break;
					case 15:
						{
						_localctx = new LogicalORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(498);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(499);
						_la = _input.LA(1);
						if ( !(_la==T__75 || _la==T__76) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(500);
						expression(13);
						}
						break;
					case 16:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(501);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(502);
						match(T__77);
						setState(503);
						expression(0);
						setState(504);
						match(T__24);
						setState(505);
						expression(12);
						}
						break;
					case 17:
						{
						_localctx = new VariableAccessExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(507);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(508);
						match(T__79);
						setState(509);
						expression(8);
						}
						break;
					case 18:
						{
						_localctx = new PostfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(510);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(511);
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
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		enterRule(_localctx, 60, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			expression(0);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(518);
				match(T__20);
				setState(519);
				expression(0);
				}
				}
				setState(524);
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
	public static class AbsoluteIdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FluxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FluxParser.ID, i);
		}
		public AbsoluteIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absoluteId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterAbsoluteId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitAbsoluteId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitAbsoluteId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbsoluteIdContext absoluteId() throws RecognitionException {
		AbsoluteIdContext _localctx = new AbsoluteIdContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_absoluteId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(ID);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(526);
					match(T__79);
					setState(527);
					match(ID);
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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
		case 1:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 29:
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
		"\u0004\u0001a\u0216\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0004\u0000C\b\u0000"+
		"\u000b\u0000\f\u0000D\u0005\u0000G\b\u0000\n\u0000\f\u0000J\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Q\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001"+
		"\u0001\u0005\u0001Y\b\u0001\n\u0001\f\u0001\\\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\fu\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f{\b\f\u0003"+
		"\f}\b\f\u0001\r\u0003\r\u0080\b\r\u0001\r\u0003\r\u0083\b\r\u0001\r\u0003"+
		"\r\u0086\b\r\u0001\r\u0003\r\u0089\b\r\u0001\r\u0003\r\u008c\b\r\u0001"+
		"\r\u0003\r\u008f\b\r\u0001\u000e\u0003\u000e\u0092\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u009b\b\u000e\u0003\u000e\u009d\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u00a3\b\u0010\u0001\u0010\u0003"+
		"\u0010\u00a6\b\u0010\u0001\u0010\u0003\u0010\u00a9\b\u0010\u0001\u0010"+
		"\u0003\u0010\u00ac\b\u0010\u0001\u0010\u0003\u0010\u00af\b\u0010\u0001"+
		"\u0010\u0003\u0010\u00b2\b\u0010\u0001\u0010\u0003\u0010\u00b5\b\u0010"+
		"\u0001\u0010\u0003\u0010\u00b8\b\u0010\u0001\u0010\u0003\u0010\u00bb\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00c2\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00c9\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00ce\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d8\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00dd\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00e2\b\u0012\n\u0012\f\u0012\u00e5\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0004\u0016\u00f5\b\u0016\u000b\u0016\f\u0016"+
		"\u00f6\u0005\u0016\u00f9\b\u0016\n\u0016\f\u0016\u00fc\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0004\u0017\u0101\b\u0017\u000b\u0017\f\u0017"+
		"\u0102\u0005\u0017\u0105\b\u0017\n\u0017\f\u0017\u0108\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u010c\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0004\u0019\u0111\b\u0019\u000b\u0019\f\u0019\u0112\u0001\u001a\u0001"+
		"\u001a\u0004\u001a\u0117\b\u001a\u000b\u001a\f\u001a\u0118\u0001\u001b"+
		"\u0001\u001b\u0004\u001b\u011d\b\u001b\u000b\u001b\f\u001b\u011e\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0004"+
		"\u001b\u0127\b\u001b\u000b\u001b\f\u001b\u0128\u0001\u001b\u0001\u001b"+
		"\u0004\u001b\u012d\b\u001b\u000b\u001b\f\u001b\u012e\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0138\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0004\u001b\u0146\b\u001b\u000b\u001b\f\u001b\u0147"+
		"\u0003\u001b\u014a\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0152\b\u001b\n\u001b\f\u001b\u0155"+
		"\t\u001b\u0001\u001b\u0004\u001b\u0158\b\u001b\u000b\u001b\f\u001b\u0159"+
		"\u0003\u001b\u015c\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0160\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u0164\b\u001b\u000b\u001b\f"+
		"\u001b\u0165\u0001\u001b\u0001\u001b\u0004\u001b\u016a\b\u001b\u000b\u001b"+
		"\f\u001b\u016b\u0001\u001b\u0001\u001b\u0004\u001b\u0170\b\u001b\u000b"+
		"\u001b\f\u001b\u0171\u0001\u001b\u0001\u001b\u0003\u001b\u0176\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u018f\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0198\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01a9\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01af\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u01b3\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01b8\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01c7\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u0201\b\u001d\n\u001d\f\u001d\u0204\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u0209\b\u001e\n\u001e\f\u001e\u020c\t\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0211\b\u001f\n\u001f\f\u001f"+
		"\u0214\t\u001f\u0001\u001f\u0000\u0002\u0002: \u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>\u0000\u0013\u0001\u0000\u0003\u0005\u0001\u0000\u0006\u0007\u0001"+
		"\u0000\b\n\u0001\u0000\u0010\u0011\u0001\u0000\u0017\u0018\u0001\u0000"+
		"\u0019\u001a\u0001\u0000\u001c\u001d\u0002\u0000\u0012\u0012\u001f)\u0001"+
		"\u0000./\u0002\u0000./68\u0001\u000023\u0001\u000045\u0001\u0000;=\u0001"+
		"\u000067\u0001\u0000@B\u0002\u0000\u0001\u0002CD\u0001\u0000FG\u0001\u0000"+
		"JK\u0001\u0000LM\u0264\u0000H\u0001\u0000\u0000\u0000\u0002P\u0001\u0000"+
		"\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000"+
		"\ba\u0001\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fe\u0001\u0000"+
		"\u0000\u0000\u000eg\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000"+
		"\u0012k\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016o"+
		"\u0001\u0000\u0000\u0000\u0018|\u0001\u0000\u0000\u0000\u001a\u007f\u0001"+
		"\u0000\u0000\u0000\u001c\u009c\u0001\u0000\u0000\u0000\u001e\u009e\u0001"+
		"\u0000\u0000\u0000 \u00a2\u0001\u0000\u0000\u0000\"\u00dc\u0001\u0000"+
		"\u0000\u0000$\u00de\u0001\u0000\u0000\u0000&\u00e6\u0001\u0000\u0000\u0000"+
		"(\u00e9\u0001\u0000\u0000\u0000*\u00ed\u0001\u0000\u0000\u0000,\u00fa"+
		"\u0001\u0000\u0000\u0000.\u0106\u0001\u0000\u0000\u00000\u010b\u0001\u0000"+
		"\u0000\u00002\u010d\u0001\u0000\u0000\u00004\u0114\u0001\u0000\u0000\u0000"+
		"6\u0175\u0001\u0000\u0000\u00008\u018e\u0001\u0000\u0000\u0000:\u01c6"+
		"\u0001\u0000\u0000\u0000<\u0205\u0001\u0000\u0000\u0000>\u020d\u0001\u0000"+
		"\u0000\u0000@G\u00036\u001b\u0000AC\u0005]\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000FB\u0001"+
		"\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000KL\u0005\u0000\u0000\u0001L\u0001\u0001\u0000\u0000\u0000MN\u0006"+
		"\u0001\uffff\uffff\u0000NQ\u0005X\u0000\u0000OQ\u0003>\u001f\u0000PM\u0001"+
		"\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QZ\u0001\u0000\u0000\u0000"+
		"RS\n\u0003\u0000\u0000SU\u0005\u0001\u0000\u0000TV\u0003\u0002\u0001\u0000"+
		"UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WY\u0005\u0002\u0000\u0000XR\u0001\u0000\u0000\u0000Y\\\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0003"+
		"\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0007\u0000\u0000"+
		"\u0000^\u0005\u0001\u0000\u0000\u0000_`\u0007\u0001\u0000\u0000`\u0007"+
		"\u0001\u0000\u0000\u0000ab\u0007\u0002\u0000\u0000b\t\u0001\u0000\u0000"+
		"\u0000cd\u0005\t\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0005\u000b"+
		"\u0000\u0000f\r\u0001\u0000\u0000\u0000gh\u0005\f\u0000\u0000h\u000f\u0001"+
		"\u0000\u0000\u0000ij\u0005\r\u0000\u0000j\u0011\u0001\u0000\u0000\u0000"+
		"kl\u0005\u000e\u0000\u0000l\u0013\u0001\u0000\u0000\u0000mn\u0005\n\u0000"+
		"\u0000n\u0015\u0001\u0000\u0000\u0000op\u0005\u000f\u0000\u0000p\u0017"+
		"\u0001\u0000\u0000\u0000qr\u0007\u0003\u0000\u0000rt\u0003>\u001f\u0000"+
		"su\u0005V\u0000\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"u}\u0001\u0000\u0000\u0000vw\u0007\u0003\u0000\u0000wx\u0005\t\u0000\u0000"+
		"xz\u0003>\u001f\u0000y{\u0005V\u0000\u0000zy\u0001\u0000\u0000\u0000z"+
		"{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|q\u0001\u0000\u0000"+
		"\u0000|v\u0001\u0000\u0000\u0000}\u0019\u0001\u0000\u0000\u0000~\u0080"+
		"\u0003\u0004\u0002\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u0083\u0003"+
		"\u0006\u0003\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0086\u0003"+
		"\n\u0005\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000\u0087\u0089\u0003\f\u0006"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u008c\u0003\u000e\u0007"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008f\u0003\u0010\b\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u001b\u0001\u0000\u0000\u0000\u0090\u0092\u0005X\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005[\u0000\u0000\u0094\u0095"+
		"\u0005\u0012\u0000\u0000\u0095\u009d\u0003:\u001d\u0000\u0096\u0097\u0003"+
		"\u0002\u0001\u0000\u0097\u009a\u0005[\u0000\u0000\u0098\u0099\u0005\u0012"+
		"\u0000\u0000\u0099\u009b\u0003:\u001d\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u0091\u0001\u0000\u0000\u0000\u009c\u0096\u0001\u0000\u0000"+
		"\u0000\u009d\u001d\u0001\u0000\u0000\u0000\u009e\u009f\u0003\u001a\r\u0000"+
		"\u009f\u00a0\u0003\u001c\u000e\u0000\u00a0\u001f\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0003\u0004\u0002\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a6\u0003\u0006\u0003\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a9\u0003\b\u0004\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ac\u0003\f\u0006\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00af"+
		"\u0003\u000e\u0007\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0003\u0010\b\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b5\u0003"+
		"\u0012\t\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u0014"+
		"\n\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003\u0016\u000b"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb!\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003 \u0010\u0000\u00bd"+
		"\u00be\u0005W\u0000\u0000\u00be\u00bf\u0005[\u0000\u0000\u00bf\u00c1\u0005"+
		"\u0013\u0000\u0000\u00c0\u00c2\u0003$\u0012\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\u0014\u0000\u0000\u00c4\u00c5\u0003(\u0014"+
		"\u0000\u00c5\u00dd\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003 \u0010\u0000"+
		"\u00c7\u00c9\u0005X\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005[\u0000\u0000\u00cb\u00cd\u0005\u0013\u0000\u0000\u00cc\u00ce"+
		"\u0003$\u0012\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\u0014\u0000\u0000\u00d0\u00d1\u0003*\u0015\u0000\u00d1\u00dd\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0003 \u0010\u0000\u00d3\u00d4\u0003\u0002\u0001"+
		"\u0000\u00d4\u00d5\u0005[\u0000\u0000\u00d5\u00d7\u0005\u0013\u0000\u0000"+
		"\u00d6\u00d8\u0003$\u0012\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\u0014\u0000\u0000\u00da\u00db\u0003*\u0015\u0000\u00db\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dc\u00bc\u0001\u0000\u0000\u0000\u00dc\u00c6"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d2\u0001\u0000\u0000\u0000\u00dd#\u0001"+
		"\u0000\u0000\u0000\u00de\u00e3\u0003&\u0013\u0000\u00df\u00e0\u0005\u0015"+
		"\u0000\u0000\u00e0\u00e2\u0003&\u0013\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4%\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003\u0002\u0001\u0000"+
		"\u00e7\u00e8\u0005[\u0000\u0000\u00e8\'\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0005Y\u0000\u0000\u00ea\u00eb\u0003,\u0016\u0000\u00eb\u00ec\u0005"+
		"Z\u0000\u0000\u00ec)\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005Y\u0000"+
		"\u0000\u00ee\u00ef\u0003.\u0017\u0000\u00ef\u00f0\u0005Z\u0000\u0000\u00f0"+
		"+\u0001\u0000\u0000\u0000\u00f1\u00f9\u00036\u001b\u0000\u00f2\u00f9\u0003"+
		"4\u001a\u0000\u00f3\u00f5\u0005]\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f1\u0001\u0000\u0000\u0000\u00f8\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb-\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fd\u0105\u00036\u001b\u0000\u00fe\u0105\u00032\u0019\u0000\u00ff\u0101"+
		"\u0005]\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u00fd\u0001"+
		"\u0000\u0000\u0000\u0104\u00fe\u0001\u0000\u0000\u0000\u0104\u0100\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107/\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c\u0003(\u0014"+
		"\u0000\u010a\u010c\u0003*\u0015\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010a\u0001\u0000\u0000\u0000\u010c1\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005\u0016\u0000\u0000\u010e\u0110\u0003:\u001d\u0000\u010f\u0111"+
		"\u0005]\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u01133\u0001\u0000\u0000\u0000\u0114\u0116\u0005\u0016"+
		"\u0000\u0000\u0115\u0117\u0005]\u0000\u0000\u0116\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u01195\u0001\u0000\u0000\u0000"+
		"\u011a\u011c\u0003\u0018\f\u0000\u011b\u011d\u0005]\u0000\u0000\u011c"+
		"\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0176\u0001\u0000\u0000\u0000\u0120\u0176\u0003\"\u0011\u0000\u0121\u0176"+
		"\u0003(\u0014\u0000\u0122\u0123\u0005\u0017\u0000\u0000\u0123\u0124\u0005"+
		"\u0013\u0000\u0000\u0124\u0126\u0003\u001c\u000e\u0000\u0125\u0127\u0005"+
		"]\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0003:\u001d"+
		"\u0000\u012b\u012d\u0005]\u0000\u0000\u012c\u012b\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u00038\u001c\u0000\u0131\u0132\u0005\u0014\u0000\u0000\u0132"+
		"\u0133\u00030\u0018\u0000\u0133\u0176\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0007\u0004\u0000\u0000\u0135\u0137\u0005\u0013\u0000\u0000\u0136\u0138"+
		"\u0003\u0002\u0001\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005[\u0000\u0000\u013a\u013b\u0007\u0005\u0000\u0000\u013b\u013c\u0003"+
		":\u001d\u0000\u013c\u013d\u0005\u0014\u0000\u0000\u013d\u013e\u00030\u0018"+
		"\u0000\u013e\u0176\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u001b\u0000"+
		"\u0000\u0140\u0141\u0005\u0013\u0000\u0000\u0141\u0142\u0003:\u001d\u0000"+
		"\u0142\u0143\u0005\u0014\u0000\u0000\u0143\u0149\u00030\u0018\u0000\u0144"+
		"\u0146\u0005]\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0001\u0000\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0145"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0153"+
		"\u0001\u0000\u0000\u0000\u014b\u014c\u0007\u0006\u0000\u0000\u014c\u014d"+
		"\u0005\u0013\u0000\u0000\u014d\u014e\u0003:\u001d\u0000\u014e\u014f\u0005"+
		"\u0014\u0000\u0000\u014f\u0150\u00030\u0018\u0000\u0150\u0152\u0001\u0000"+
		"\u0000\u0000\u0151\u014b\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u015b\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0156\u0158\u0005]\u0000\u0000\u0157\u0156\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001\u0000\u0000"+
		"\u0000\u015b\u0157\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000"+
		"\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u001e\u0000"+
		"\u0000\u015e\u0160\u00030\u0018\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0176\u0001\u0000\u0000\u0000"+
		"\u0161\u0163\u0003\u001e\u000f\u0000\u0162\u0164\u0005]\u0000\u0000\u0163"+
		"\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165"+
		"\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166"+
		"\u0176\u0001\u0000\u0000\u0000\u0167\u0169\u00038\u001c\u0000\u0168\u016a"+
		"\u0005]\u0000\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016c\u0176\u0001\u0000\u0000\u0000\u016d\u016f\u0003"+
		":\u001d\u0000\u016e\u0170\u0005]\u0000\u0000\u016f\u016e\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0176\u0001\u0000\u0000"+
		"\u0000\u0173\u0176\u00032\u0019\u0000\u0174\u0176\u00034\u001a\u0000\u0175"+
		"\u011a\u0001\u0000\u0000\u0000\u0175\u0120\u0001\u0000\u0000\u0000\u0175"+
		"\u0121\u0001\u0000\u0000\u0000\u0175\u0122\u0001\u0000\u0000\u0000\u0175"+
		"\u0134\u0001\u0000\u0000\u0000\u0175\u013f\u0001\u0000\u0000\u0000\u0175"+
		"\u0161\u0001\u0000\u0000\u0000\u0175\u0167\u0001\u0000\u0000\u0000\u0175"+
		"\u016d\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175"+
		"\u0174\u0001\u0000\u0000\u0000\u01767\u0001\u0000\u0000\u0000\u0177\u0178"+
		"\u0003>\u001f\u0000\u0178\u0179\u0007\u0007\u0000\u0000\u0179\u017a\u0003"+
		":\u001d\u0000\u017a\u018f\u0001\u0000\u0000\u0000\u017b\u017c\u0003>\u001f"+
		"\u0000\u017c\u017d\u0005*\u0000\u0000\u017d\u017e\u0003:\u001d\u0000\u017e"+
		"\u018f\u0001\u0000\u0000\u0000\u017f\u0180\u0003>\u001f\u0000\u0180\u0181"+
		"\u0005+\u0000\u0000\u0181\u0182\u0003:\u001d\u0000\u0182\u018f\u0001\u0000"+
		"\u0000\u0000\u0183\u0184\u0003>\u001f\u0000\u0184\u0185\u0005,\u0000\u0000"+
		"\u0185\u0186\u0003:\u001d\u0000\u0186\u018f\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0003>\u001f\u0000\u0188\u0189\u0005-\u0000\u0000\u0189\u018a\u0003"+
		":\u001d\u0000\u018a\u018f\u0001\u0000\u0000\u0000\u018b\u018c\u0003>\u001f"+
		"\u0000\u018c\u018d\u0007\b\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000"+
		"\u018e\u0177\u0001\u0000\u0000\u0000\u018e\u017b\u0001\u0000\u0000\u0000"+
		"\u018e\u017f\u0001\u0000\u0000\u0000\u018e\u0183\u0001\u0000\u0000\u0000"+
		"\u018e\u0187\u0001\u0000\u0000\u0000\u018e\u018b\u0001\u0000\u0000\u0000"+
		"\u018f9\u0001\u0000\u0000\u0000\u0190\u0191\u0006\u001d\uffff\uffff\u0000"+
		"\u0191\u0192\u0005\u0013\u0000\u0000\u0192\u0193\u0003:\u001d\u0000\u0193"+
		"\u0194\u0005\u0014\u0000\u0000\u0194\u01c7\u0001\u0000\u0000\u0000\u0195"+
		"\u0197\u00050\u0000\u0000\u0196\u0198\u0003<\u001e\u0000\u0197\u0196\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001"+
		"\u0000\u0000\u0000\u0199\u01c7\u00051\u0000\u0000\u019a\u019b\u0005\u0013"+
		"\u0000\u0000\u019b\u019c\u0003\u0002\u0001\u0000\u019c\u019d\u0005\u0014"+
		"\u0000\u0000\u019d\u019e\u0003:\u001d\u001d\u019e\u01c7\u0001\u0000\u0000"+
		"\u0000\u019f\u01a0\u0007\t\u0000\u0000\u01a0\u01c7\u0003:\u001d\u001a"+
		"\u01a1\u01a2\u00059\u0000\u0000\u01a2\u01a9\u0003:\u001d\u0000\u01a3\u01a4"+
		"\u0005:\u0000\u0000\u01a4\u01a5\u0005\u0013\u0000\u0000\u01a5\u01a6\u0003"+
		":\u001d\u0000\u01a6\u01a7\u0005\u0014\u0000\u0000\u01a7\u01a9\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a1\u0001\u0000\u0000\u0000\u01a8\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a9\u01c7\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005O\u0000"+
		"\u0000\u01ab\u01ac\u0003\u0002\u0001\u0000\u01ac\u01ae\u0005\u0013\u0000"+
		"\u0000\u01ad\u01af\u0003<\u001e\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b2\u0005\u0014\u0000\u0000\u01b1\u01b3\u00030\u0018\u0000\u01b2"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"\u01c7\u0001\u0000\u0000\u0000\u01b4\u01b5\u0003>\u001f\u0000\u01b5\u01b7"+
		"\u0005\u0013\u0000\u0000\u01b6\u01b8\u0003<\u001e\u0000\u01b7\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u0005\u0014\u0000\u0000\u01ba\u01c7\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0003>\u001f\u0000\u01bc\u01bd\u00050\u0000"+
		"\u0000\u01bd\u01be\u0003:\u001d\u0000\u01be\u01bf\u00051\u0000\u0000\u01bf"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c0\u01c7\u0003>\u001f\u0000\u01c1\u01c7"+
		"\u0005S\u0000\u0000\u01c2\u01c7\u0005T\u0000\u0000\u01c3\u01c7\u0005U"+
		"\u0000\u0000\u01c4\u01c7\u0005R\u0000\u0000\u01c5\u01c7\u0005Q\u0000\u0000"+
		"\u01c6\u0190\u0001\u0000\u0000\u0000\u01c6\u0195\u0001\u0000\u0000\u0000"+
		"\u01c6\u019a\u0001\u0000\u0000\u0000\u01c6\u019f\u0001\u0000\u0000\u0000"+
		"\u01c6\u01a8\u0001\u0000\u0000\u0000\u01c6\u01aa\u0001\u0000\u0000\u0000"+
		"\u01c6\u01b4\u0001\u0000\u0000\u0000\u01c6\u01bb\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c0\u0001\u0000\u0000\u0000\u01c6\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c2\u0001\u0000\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c7\u0202\u0001\u0000\u0000\u0000\u01c8\u01c9\n\u001c\u0000\u0000\u01c9"+
		"\u01ca\u0007\n\u0000\u0000\u01ca\u0201\u0003:\u001d\u001d\u01cb\u01cc"+
		"\n\u001b\u0000\u0000\u01cc\u01cd\u0007\u000b\u0000\u0000\u01cd\u0201\u0003"+
		":\u001d\u001c\u01ce\u01cf\n\u0018\u0000\u0000\u01cf\u01d0\u0007\f\u0000"+
		"\u0000\u01d0\u0201\u0003:\u001d\u0019\u01d1\u01d2\n\u0017\u0000\u0000"+
		"\u01d2\u01d3\u0005>\u0000\u0000\u01d3\u0201\u0003:\u001d\u0018\u01d4\u01d5"+
		"\n\u0016\u0000\u0000\u01d5\u01d6\u0005?\u0000\u0000\u01d6\u0201\u0003"+
		":\u001d\u0017\u01d7\u01d8\n\u0015\u0000\u0000\u01d8\u01d9\u0007\r\u0000"+
		"\u0000\u01d9\u0201\u0003:\u001d\u0016\u01da\u01db\n\u0014\u0000\u0000"+
		"\u01db\u01dc\u0007\u000e\u0000\u0000\u01dc\u0201\u0003:\u001d\u0015\u01dd"+
		"\u01de\n\u0013\u0000\u0000\u01de\u01df\u0007\u000f\u0000\u0000\u01df\u0201"+
		"\u0003:\u001d\u0014\u01e0\u01e1\n\u0012\u0000\u0000\u01e1\u01e2\u0005"+
		"E\u0000\u0000\u01e2\u0201\u0003:\u001d\u0013\u01e3\u01e4\n\u0011\u0000"+
		"\u0000\u01e4\u01e5\u0007\u0010\u0000\u0000\u01e5\u0201\u0003:\u001d\u0012"+
		"\u01e6\u01e7\n\u0010\u0000\u0000\u01e7\u01e8\u0005H\u0000\u0000\u01e8"+
		"\u0201\u0003:\u001d\u0011\u01e9\u01ea\n\u000f\u0000\u0000\u01ea\u01eb"+
		"\u00053\u0000\u0000\u01eb\u0201\u0003:\u001d\u0010\u01ec\u01ed\n\u000e"+
		"\u0000\u0000\u01ed\u01ee\u0005I\u0000\u0000\u01ee\u0201\u0003:\u001d\u000f"+
		"\u01ef\u01f0\n\r\u0000\u0000\u01f0\u01f1\u0007\u0011\u0000\u0000\u01f1"+
		"\u0201\u0003:\u001d\u000e\u01f2\u01f3\n\f\u0000\u0000\u01f3\u01f4\u0007"+
		"\u0012\u0000\u0000\u01f4\u0201\u0003:\u001d\r\u01f5\u01f6\n\u000b\u0000"+
		"\u0000\u01f6\u01f7\u0005N\u0000\u0000\u01f7\u01f8\u0003:\u001d\u0000\u01f8"+
		"\u01f9\u0005\u0019\u0000\u0000\u01f9\u01fa\u0003:\u001d\f\u01fa\u0201"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\n\u0007\u0000\u0000\u01fc\u01fd\u0005"+
		"P\u0000\u0000\u01fd\u0201\u0003:\u001d\b\u01fe\u01ff\n\u001e\u0000\u0000"+
		"\u01ff\u0201\u0007\b\u0000\u0000\u0200\u01c8\u0001\u0000\u0000\u0000\u0200"+
		"\u01cb\u0001\u0000\u0000\u0000\u0200\u01ce\u0001\u0000\u0000\u0000\u0200"+
		"\u01d1\u0001\u0000\u0000\u0000\u0200\u01d4\u0001\u0000\u0000\u0000\u0200"+
		"\u01d7\u0001\u0000\u0000\u0000\u0200\u01da\u0001\u0000\u0000\u0000\u0200"+
		"\u01dd\u0001\u0000\u0000\u0000\u0200\u01e0\u0001\u0000\u0000\u0000\u0200"+
		"\u01e3\u0001\u0000\u0000\u0000\u0200\u01e6\u0001\u0000\u0000\u0000\u0200"+
		"\u01e9\u0001\u0000\u0000\u0000\u0200\u01ec\u0001\u0000\u0000\u0000\u0200"+
		"\u01ef\u0001\u0000\u0000\u0000\u0200\u01f2\u0001\u0000\u0000\u0000\u0200"+
		"\u01f5\u0001\u0000\u0000\u0000\u0200\u01fb\u0001\u0000\u0000\u0000\u0200"+
		"\u01fe\u0001\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000\u0202"+
		"\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203"+
		";\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u020a"+
		"\u0003:\u001d\u0000\u0206\u0207\u0005\u0015\u0000\u0000\u0207\u0209\u0003"+
		":\u001d\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000"+
		"\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b=\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000"+
		"\u0000\u020d\u0212\u0005[\u0000\u0000\u020e\u020f\u0005P\u0000\u0000\u020f"+
		"\u0211\u0005[\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0214"+
		"\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0001\u0000\u0000\u0000\u0213?\u0001\u0000\u0000\u0000\u0214\u0212\u0001"+
		"\u0000\u0000\u0000CDFHPUZtz|\u007f\u0082\u0085\u0088\u008b\u008e\u0091"+
		"\u009a\u009c\u00a2\u00a5\u00a8\u00ab\u00ae\u00b1\u00b4\u00b7\u00ba\u00c1"+
		"\u00c8\u00cd\u00d7\u00dc\u00e3\u00f6\u00f8\u00fa\u0102\u0104\u0106\u010b"+
		"\u0112\u0118\u011e\u0128\u012e\u0137\u0147\u0149\u0153\u0159\u015b\u015f"+
		"\u0165\u016b\u0171\u0175\u018e\u0197\u01a8\u01ae\u01b2\u01b7\u01c6\u0200"+
		"\u0202\u020a\u0212";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}