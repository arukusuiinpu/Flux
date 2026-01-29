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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, TERMINATOR=59, 
		INT=60, DECIMAL=61, BOOL=62, STRING=63, ID=64, NL=65, WS=66, SL_COMMENT=67, 
		ML_COMMENT=68;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_type = 2, RULE_terminator = 3, 
		RULE_accessModifier = 4, RULE_implementationModifier = 5, RULE_staticMd = 6, 
		RULE_finalMd = 7, RULE_transientMd = 8, RULE_volatileMd = 9, RULE_synchronizedMd = 10, 
		RULE_nativeMd = 11, RULE_strictfpMd = 12, RULE_variableModifiers = 13, 
		RULE_varDecl = 14, RULE_functionModifiers = 15, RULE_functionDecl = 16, 
		RULE_formalParameters = 17, RULE_formalParameter = 18, RULE_block = 19, 
		RULE_statement = 20, RULE_assignmentStat = 21, RULE_expression = 22, RULE_expressionList = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "type", "terminator", "accessModifier", "implementationModifier", 
			"staticMd", "finalMd", "transientMd", "volatileMd", "synchronizedMd", 
			"nativeMd", "strictfpMd", "variableModifiers", "varDecl", "functionModifiers", 
			"functionDecl", "formalParameters", "formalParameter", "block", "statement", 
			"assignmentStat", "expression", "expressionList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'float'", "'double'", "'int'", "'bool'", "'string'", "'void'", 
			"'public'", "'protected'", "'private'", "'abstract'", "'static'", "'native'", 
			"'final'", "'transient'", "'volatile'", "'synchronized'", "'strictfp'", 
			"'='", "'('", "')'", "','", "'{'", "'}'", "'if'", "'else'", "'return'", 
			"'['", "']'", "'++'", "'--'", "'**'", "'+'", "'-'", "'~'", "'!'", "'not'", 
			"'*'", "'/'", "'%'", "'<<'", "'>>'", "'>>>'", "'<'", "'>'", "'<='", "'>='", 
			"'instanceof'", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'and'", 
			"'||'", "'or'", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "TERMINATOR", 
			"INT", "DECIMAL", "BOOL", "STRING", "ID", "NL", "WS", "SL_COMMENT", "ML_COMMENT"
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
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(48);
				terminator();
				}
				break;
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -8935141660702932993L) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
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
				case ID:
					{
					setState(51);
					declaration();
					}
					break;
				case TERMINATOR:
					{
					setState(52);
					terminator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				functionDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				varDecl();
				setState(62);
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
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
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
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -9223372036854775745L) != 0)) ) {
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
			setState(69); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(68);
					match(TERMINATOR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
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
		enterRule(_localctx, 10, RULE_implementationModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
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
		enterRule(_localctx, 12, RULE_staticMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
		enterRule(_localctx, 14, RULE_finalMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		enterRule(_localctx, 16, RULE_transientMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
		enterRule(_localctx, 18, RULE_volatileMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
		enterRule(_localctx, 20, RULE_synchronizedMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		enterRule(_localctx, 22, RULE_nativeMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
		enterRule(_localctx, 24, RULE_strictfpMd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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
	public static class VariableModifiersContext extends ParserRuleContext {
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
				{
				setState(91);
				accessModifier();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(94);
				staticMd();
				}
			}

			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(97);
				finalMd();
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(100);
				transientMd();
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(103);
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
	public static class VarDeclContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 28, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			variableModifiers();
			setState(107);
			type();
			setState(108);
			match(ID);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(109);
				match(T__17);
				setState(110);
				expression(0);
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
	public static class FunctionModifiersContext extends ParserRuleContext {
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
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
		enterRule(_localctx, 30, RULE_functionModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
				{
				setState(113);
				accessModifier();
				}
			}

			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(116);
				implementationModifier();
				}
				break;
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(119);
				finalMd();
				}
			}

			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(122);
				transientMd();
				}
			}

			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(125);
				volatileMd();
				}
			}

			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(128);
				synchronizedMd();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(131);
				nativeMd();
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(134);
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
		public FunctionModifiersContext functionModifiers() {
			return getRuleContext(FunctionModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			functionModifiers();
			setState(138);
			type();
			setState(139);
			match(ID);
			setState(140);
			match(T__18);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -9223372036854775745L) != 0)) {
				{
				setState(141);
				formalParameters();
				}
			}

			setState(144);
			match(T__19);
			setState(145);
			block();
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
		enterRule(_localctx, 34, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			formalParameter();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(148);
				match(T__20);
				setState(149);
				formalParameter();
				}
				}
				setState(154);
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
		enterRule(_localctx, 36, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			type();
			setState(156);
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
	public static class BlockContext extends ParserRuleContext {
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__21);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -288230308662870017L) != 0)) {
				{
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
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
				case T__23:
				case T__25:
				case T__26:
				case T__28:
				case T__29:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case INT:
				case DECIMAL:
				case BOOL:
				case STRING:
				case ID:
					{
					setState(159);
					statement();
					}
					break;
				case TERMINATOR:
					{
					setState(160);
					terminator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(T__22);
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
	public static class IfStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
	public static class ReturnStatementContext extends StatementContext {
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitBlockStatement(this);
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
		enterRule(_localctx, 40, RULE_statement);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				block();
				}
				break;
			case 2:
				_localctx = new VarDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				varDecl();
				setState(170);
				terminator();
				}
				break;
			case 3:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__23);
				setState(173);
				match(T__18);
				setState(174);
				expression(0);
				setState(175);
				match(T__19);
				setState(176);
				block();
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(177);
					match(T__24);
					setState(178);
					block();
					}
				}

				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(T__25);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 68169721179393L) != 0)) {
					{
					setState(182);
					expression(0);
					}
				}

				setState(185);
				terminator();
				}
				break;
			case 5:
				_localctx = new FunctionDeclStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				functionDecl();
				}
				break;
			case 6:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				assignmentStat();
				setState(188);
				terminator();
				}
				break;
			case 7:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				expression(0);
				setState(191);
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
	public static class AssignmentStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterAssignmentStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitAssignmentStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitAssignmentStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatContext assignmentStat() throws RecognitionException {
		AssignmentStatContext _localctx = new AssignmentStatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ID);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(196);
				match(T__26);
				setState(197);
				expression(0);
				setState(198);
				match(T__27);
				}
			}

			setState(202);
			match(T__17);
			setState(203);
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
	public static class SqParenthesizedExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SqParenthesizedExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).enterSqParenthesizedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FluxListener ) ((FluxListener)listener).exitSqParenthesizedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FluxVisitor ) return ((FluxVisitor<? extends T>)visitor).visitSqParenthesizedExpr(this);
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
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
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
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
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
	public static class FunctionCallExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(FluxParser.ID, 0); }
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206);
				match(T__18);
				setState(207);
				expression(0);
				setState(208);
				match(T__19);
				}
				break;
			case 2:
				{
				_localctx = new SqParenthesizedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__26);
				setState(211);
				expression(0);
				setState(212);
				match(T__27);
				}
				break;
			case 3:
				{
				_localctx = new CastExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214);
				match(T__18);
				setState(215);
				type();
				setState(216);
				match(T__19);
				setState(217);
				expression(22);
				}
				break;
			case 4:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				((UnaryExprContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31675383808L) != 0)) ) {
					((UnaryExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				expression(20);
				}
				break;
			case 5:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__34:
					{
					setState(221);
					match(T__34);
					setState(222);
					expression(0);
					}
					break;
				case T__35:
					{
					setState(223);
					match(T__35);
					setState(224);
					match(T__18);
					setState(225);
					expression(0);
					setState(226);
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
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(230);
				match(ID);
				setState(231);
				match(T__18);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & 68169721179393L) != 0)) {
					{
					setState(232);
					expressionList();
					}
				}

				setState(235);
				match(T__19);
				}
				break;
			case 7:
				{
				_localctx = new ArrayAccessExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(ID);
				setState(237);
				match(T__26);
				setState(238);
				expression(0);
				setState(239);
				match(T__27);
				}
				break;
			case 8:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new IntExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(INT);
				}
				break;
			case 10:
				{
				_localctx = new DecimalExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(DECIMAL);
				}
				break;
			case 11:
				{
				_localctx = new BoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(BOOL);
				}
				break;
			case 12:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(STRING);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ExpExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(249);
						match(T__30);
						setState(250);
						expression(22);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(252);
						((MulDivExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
							((MulDivExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(253);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(255);
						((AddSubExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((AddSubExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(256);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ShiftExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(258);
						((ShiftExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) ) {
							((ShiftExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(261);
						((RelationalExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 272678883688448L) != 0)) ) {
							((RelationalExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(264);
						((EqualityExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__47 || _la==T__48) ) {
							((EqualityExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(267);
						match(T__49);
						setState(268);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseXORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(270);
						match(T__50);
						setState(271);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new BitwiseORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(273);
						match(T__51);
						setState(274);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new LogicalANDExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(276);
						_la = _input.LA(1);
						if ( !(_la==T__52 || _la==T__53) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(277);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new LogicalORExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(279);
						_la = _input.LA(1);
						if ( !(_la==T__54 || _la==T__55) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						expression(10);
						}
						break;
					case 12:
						{
						_localctx = new TernaryExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(282);
						match(T__56);
						setState(283);
						expression(0);
						setState(284);
						match(T__57);
						setState(285);
						expression(9);
						}
						break;
					case 13:
						{
						_localctx = new PostfixExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(288);
						((PostfixExprContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__28 || _la==T__29) ) {
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
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 46, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expression(0);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(295);
				match(T__20);
				setState(296);
				expression(0);
				}
				}
				setState(301);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001D\u012f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0003\u0000"+
		"2\b\u0000\u0001\u0000\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001A\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0004\u0003F\b\u0003\u000b\u0003\f\u0003G\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0003\r]\b\r\u0001\r\u0003\r`\b\r\u0001\r\u0003\rc"+
		"\b\r\u0001\r\u0003\rf\b\r\u0001\r\u0003\ri\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000ep\b\u000e\u0001\u000f"+
		"\u0003\u000fs\b\u000f\u0001\u000f\u0003\u000fv\b\u000f\u0001\u000f\u0003"+
		"\u000fy\b\u000f\u0001\u000f\u0003\u000f|\b\u000f\u0001\u000f\u0003\u000f"+
		"\u007f\b\u000f\u0001\u000f\u0003\u000f\u0082\b\u000f\u0001\u000f\u0003"+
		"\u000f\u0085\b\u000f\u0001\u000f\u0003\u000f\u0088\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u008f\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0097\b\u0011\n\u0011\f\u0011\u009a\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00a2"+
		"\b\u0013\n\u0013\f\u0013\u00a5\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00b4\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00b8\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00c2\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00c9\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u00e5\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00ea\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u00f7\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0122\b\u0016\n\u0016\f\u0016\u0125\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u012a\b\u0017\n\u0017\f\u0017\u012d"+
		"\t\u0017\u0001\u0017\u0000\u0001,\u0018\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000"+
		"\f\u0002\u0000\u0001\u0006@@\u0001\u0000\u0007\t\u0001\u0000\n\f\u0002"+
		"\u0000\u001d\u001e \"\u0001\u0000%\'\u0001\u0000 !\u0001\u0000(*\u0001"+
		"\u0000+/\u0001\u000001\u0001\u000056\u0001\u000078\u0001\u0000\u001d\u001e"+
		"\u0151\u00001\u0001\u0000\u0000\u0000\u0002@\u0001\u0000\u0000\u0000\u0004"+
		"B\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\bI\u0001\u0000"+
		"\u0000\u0000\nK\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000e"+
		"O\u0001\u0000\u0000\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012S\u0001"+
		"\u0000\u0000\u0000\u0014U\u0001\u0000\u0000\u0000\u0016W\u0001\u0000\u0000"+
		"\u0000\u0018Y\u0001\u0000\u0000\u0000\u001a\\\u0001\u0000\u0000\u0000"+
		"\u001cj\u0001\u0000\u0000\u0000\u001er\u0001\u0000\u0000\u0000 \u0089"+
		"\u0001\u0000\u0000\u0000\"\u0093\u0001\u0000\u0000\u0000$\u009b\u0001"+
		"\u0000\u0000\u0000&\u009e\u0001\u0000\u0000\u0000(\u00c1\u0001\u0000\u0000"+
		"\u0000*\u00c3\u0001\u0000\u0000\u0000,\u00f6\u0001\u0000\u0000\u0000."+
		"\u0126\u0001\u0000\u0000\u000002\u0003\u0006\u0003\u000010\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000027\u0001\u0000\u0000\u000036\u0003"+
		"\u0002\u0001\u000046\u0003\u0006\u0003\u000053\u0001\u0000\u0000\u0000"+
		"54\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0000\u0000\u0001;\u0001\u0001\u0000\u0000\u0000"+
		"<A\u0003 \u0010\u0000=>\u0003\u001c\u000e\u0000>?\u0003\u0006\u0003\u0000"+
		"?A\u0001\u0000\u0000\u0000@<\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000"+
		"\u0000A\u0003\u0001\u0000\u0000\u0000BC\u0007\u0000\u0000\u0000C\u0005"+
		"\u0001\u0000\u0000\u0000DF\u0005;\u0000\u0000ED\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0007\u0001\u0000\u0000J\t\u0001"+
		"\u0000\u0000\u0000KL\u0007\u0002\u0000\u0000L\u000b\u0001\u0000\u0000"+
		"\u0000MN\u0005\u000b\u0000\u0000N\r\u0001\u0000\u0000\u0000OP\u0005\r"+
		"\u0000\u0000P\u000f\u0001\u0000\u0000\u0000QR\u0005\u000e\u0000\u0000"+
		"R\u0011\u0001\u0000\u0000\u0000ST\u0005\u000f\u0000\u0000T\u0013\u0001"+
		"\u0000\u0000\u0000UV\u0005\u0010\u0000\u0000V\u0015\u0001\u0000\u0000"+
		"\u0000WX\u0005\f\u0000\u0000X\u0017\u0001\u0000\u0000\u0000YZ\u0005\u0011"+
		"\u0000\u0000Z\u0019\u0001\u0000\u0000\u0000[]\u0003\b\u0004\u0000\\[\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000"+
		"^`\u0003\f\u0006\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000ac\u0003\u000e\u0007\u0000ba\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000\u0000df\u0003\u0010"+
		"\b\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000gi\u0003\u0012\t\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000i\u001b\u0001\u0000\u0000\u0000jk\u0003\u001a\r\u0000kl\u0003"+
		"\u0004\u0002\u0000lo\u0005@\u0000\u0000mn\u0005\u0012\u0000\u0000np\u0003"+
		",\u0016\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p\u001d"+
		"\u0001\u0000\u0000\u0000qs\u0003\b\u0004\u0000rq\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tv\u0003\n\u0005\u0000"+
		"ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000"+
		"\u0000wy\u0003\u000e\u0007\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y{\u0001\u0000\u0000\u0000z|\u0003\u0010\b\u0000{z\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}\u007f"+
		"\u0003\u0012\t\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080\u0082\u0003\u0014\n\u0000"+
		"\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0085\u0003\u0016\u000b\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0018\f\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u001f\u0001\u0000\u0000\u0000\u0089\u008a\u0003\u001e\u000f\u0000\u008a"+
		"\u008b\u0003\u0004\u0002\u0000\u008b\u008c\u0005@\u0000\u0000\u008c\u008e"+
		"\u0005\u0013\u0000\u0000\u008d\u008f\u0003\"\u0011\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\u0014\u0000\u0000\u0091\u0092\u0003"+
		"&\u0013\u0000\u0092!\u0001\u0000\u0000\u0000\u0093\u0098\u0003$\u0012"+
		"\u0000\u0094\u0095\u0005\u0015\u0000\u0000\u0095\u0097\u0003$\u0012\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000"+
		"\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099#\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0003\u0004\u0002\u0000\u009c\u009d\u0005@\u0000\u0000\u009d%\u0001"+
		"\u0000\u0000\u0000\u009e\u00a3\u0005\u0016\u0000\u0000\u009f\u00a2\u0003"+
		"(\u0014\u0000\u00a0\u00a2\u0003\u0006\u0003\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0017\u0000\u0000\u00a7\'\u0001\u0000\u0000"+
		"\u0000\u00a8\u00c2\u0003&\u0013\u0000\u00a9\u00aa\u0003\u001c\u000e\u0000"+
		"\u00aa\u00ab\u0003\u0006\u0003\u0000\u00ab\u00c2\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0018\u0000\u0000\u00ad\u00ae\u0005\u0013\u0000\u0000"+
		"\u00ae\u00af\u0003,\u0016\u0000\u00af\u00b0\u0005\u0014\u0000\u0000\u00b0"+
		"\u00b3\u0003&\u0013\u0000\u00b1\u00b2\u0005\u0019\u0000\u0000\u00b2\u00b4"+
		"\u0003&\u0013\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00c2\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005"+
		"\u001a\u0000\u0000\u00b6\u00b8\u0003,\u0016\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00c2\u0003\u0006\u0003\u0000\u00ba\u00c2\u0003 \u0010"+
		"\u0000\u00bb\u00bc\u0003*\u0015\u0000\u00bc\u00bd\u0003\u0006\u0003\u0000"+
		"\u00bd\u00c2\u0001\u0000\u0000\u0000\u00be\u00bf\u0003,\u0016\u0000\u00bf"+
		"\u00c0\u0003\u0006\u0003\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1"+
		"\u00a8\u0001\u0000\u0000\u0000\u00c1\u00a9\u0001\u0000\u0000\u0000\u00c1"+
		"\u00ac\u0001\u0000\u0000\u0000\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1"+
		"\u00ba\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1"+
		"\u00be\u0001\u0000\u0000\u0000\u00c2)\u0001\u0000\u0000\u0000\u00c3\u00c8"+
		"\u0005@\u0000\u0000\u00c4\u00c5\u0005\u001b\u0000\u0000\u00c5\u00c6\u0003"+
		",\u0016\u0000\u00c6\u00c7\u0005\u001c\u0000\u0000\u00c7\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0012"+
		"\u0000\u0000\u00cb\u00cc\u0003,\u0016\u0000\u00cc+\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0006\u0016\uffff\uffff\u0000\u00ce\u00cf\u0005\u0013\u0000"+
		"\u0000\u00cf\u00d0\u0003,\u0016\u0000\u00d0\u00d1\u0005\u0014\u0000\u0000"+
		"\u00d1\u00f7\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001b\u0000\u0000"+
		"\u00d3\u00d4\u0003,\u0016\u0000\u00d4\u00d5\u0005\u001c\u0000\u0000\u00d5"+
		"\u00f7\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0013\u0000\u0000\u00d7"+
		"\u00d8\u0003\u0004\u0002\u0000\u00d8\u00d9\u0005\u0014\u0000\u0000\u00d9"+
		"\u00da\u0003,\u0016\u0016\u00da\u00f7\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0007\u0003\u0000\u0000\u00dc\u00f7\u0003,\u0016\u0014\u00dd\u00de\u0005"+
		"#\u0000\u0000\u00de\u00e5\u0003,\u0016\u0000\u00df\u00e0\u0005$\u0000"+
		"\u0000\u00e0\u00e1\u0005\u0013\u0000\u0000\u00e1\u00e2\u0003,\u0016\u0000"+
		"\u00e2\u00e3\u0005\u0014\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e4\u00dd\u0001\u0000\u0000\u0000\u00e4\u00df\u0001\u0000\u0000\u0000"+
		"\u00e5\u00f7\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005@\u0000\u0000\u00e7"+
		"\u00e9\u0005\u0013\u0000\u0000\u00e8\u00ea\u0003.\u0017\u0000\u00e9\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00f7\u0005\u0014\u0000\u0000\u00ec\u00ed"+
		"\u0005@\u0000\u0000\u00ed\u00ee\u0005\u001b\u0000\u0000\u00ee\u00ef\u0003"+
		",\u0016\u0000\u00ef\u00f0\u0005\u001c\u0000\u0000\u00f0\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f7\u0005@\u0000\u0000\u00f2\u00f7\u0005<\u0000\u0000"+
		"\u00f3\u00f7\u0005=\u0000\u0000\u00f4\u00f7\u0005>\u0000\u0000\u00f5\u00f7"+
		"\u0005?\u0000\u0000\u00f6\u00cd\u0001\u0000\u0000\u0000\u00f6\u00d2\u0001"+
		"\u0000\u0000\u0000\u00f6\u00d6\u0001\u0000\u0000\u0000\u00f6\u00db\u0001"+
		"\u0000\u0000\u0000\u00f6\u00e4\u0001\u0000\u0000\u0000\u00f6\u00e6\u0001"+
		"\u0000\u0000\u0000\u00f6\u00ec\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u0123\u0001\u0000\u0000\u0000\u00f8\u00f9\n\u0015"+
		"\u0000\u0000\u00f9\u00fa\u0005\u001f\u0000\u0000\u00fa\u0122\u0003,\u0016"+
		"\u0016\u00fb\u00fc\n\u0012\u0000\u0000\u00fc\u00fd\u0007\u0004\u0000\u0000"+
		"\u00fd\u0122\u0003,\u0016\u0013\u00fe\u00ff\n\u0011\u0000\u0000\u00ff"+
		"\u0100\u0007\u0005\u0000\u0000\u0100\u0122\u0003,\u0016\u0012\u0101\u0102"+
		"\n\u0010\u0000\u0000\u0102\u0103\u0007\u0006\u0000\u0000\u0103\u0122\u0003"+
		",\u0016\u0011\u0104\u0105\n\u000f\u0000\u0000\u0105\u0106\u0007\u0007"+
		"\u0000\u0000\u0106\u0122\u0003,\u0016\u0010\u0107\u0108\n\u000e\u0000"+
		"\u0000\u0108\u0109\u0007\b\u0000\u0000\u0109\u0122\u0003,\u0016\u000f"+
		"\u010a\u010b\n\r\u0000\u0000\u010b\u010c\u00052\u0000\u0000\u010c\u0122"+
		"\u0003,\u0016\u000e\u010d\u010e\n\f\u0000\u0000\u010e\u010f\u00053\u0000"+
		"\u0000\u010f\u0122\u0003,\u0016\r\u0110\u0111\n\u000b\u0000\u0000\u0111"+
		"\u0112\u00054\u0000\u0000\u0112\u0122\u0003,\u0016\f\u0113\u0114\n\n\u0000"+
		"\u0000\u0114\u0115\u0007\t\u0000\u0000\u0115\u0122\u0003,\u0016\u000b"+
		"\u0116\u0117\n\t\u0000\u0000\u0117\u0118\u0007\n\u0000\u0000\u0118\u0122"+
		"\u0003,\u0016\n\u0119\u011a\n\b\u0000\u0000\u011a\u011b\u00059\u0000\u0000"+
		"\u011b\u011c\u0003,\u0016\u0000\u011c\u011d\u0005:\u0000\u0000\u011d\u011e"+
		"\u0003,\u0016\t\u011e\u0122\u0001\u0000\u0000\u0000\u011f\u0120\n\u0017"+
		"\u0000\u0000\u0120\u0122\u0007\u000b\u0000\u0000\u0121\u00f8\u0001\u0000"+
		"\u0000\u0000\u0121\u00fb\u0001\u0000\u0000\u0000\u0121\u00fe\u0001\u0000"+
		"\u0000\u0000\u0121\u0101\u0001\u0000\u0000\u0000\u0121\u0104\u0001\u0000"+
		"\u0000\u0000\u0121\u0107\u0001\u0000\u0000\u0000\u0121\u010a\u0001\u0000"+
		"\u0000\u0000\u0121\u010d\u0001\u0000\u0000\u0000\u0121\u0110\u0001\u0000"+
		"\u0000\u0000\u0121\u0113\u0001\u0000\u0000\u0000\u0121\u0116\u0001\u0000"+
		"\u0000\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124-\u0001\u0000\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u012b\u0003,\u0016\u0000"+
		"\u0127\u0128\u0005\u0015\u0000\u0000\u0128\u012a\u0003,\u0016\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c"+
		"/\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000!157@G\\"+
		"_behorux{~\u0081\u0084\u0087\u008e\u0098\u00a1\u00a3\u00b3\u00b7\u00c1"+
		"\u00c8\u00e4\u00e9\u00f6\u0121\u0123\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}