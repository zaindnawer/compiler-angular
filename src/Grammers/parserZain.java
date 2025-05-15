// Generated from C:/Users/Zain/Desktop/compiler-angular/src/Grammers/parserZain.g4 by ANTLR 4.13.2
package Grammers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class parserZain extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, ELSE_IF=3, FOR=4, FOR_EACH=5, BREAK=6, CONTINUE=7, RETURN=8, 
		WHILE=9, DO=10, IN=11, DEFAULT_CASE=12, NEW=13, FUNCTION=14, CLASS=15, 
		INTERFACE=16, IMPORT=17, EXPORT=18, CONST=19, LET=20, VAR=21, FROM=22, 
		COMPONENT=23, SELECTOR=24, STANDALONE=25, IMPORTS=26, TEMPLATE=27, STYLES=28, 
		STRING_TYPE=29, NUMBER_TYPE=30, BOOLEAN_TYPE=31, ANY_TYPE=32, VOID_TYPE=33, 
		COMMA=34, COLON=35, DOT=36, SEMICOLON=37, EQUALS=38, THIS=39, ASSIGN=40, 
		PLUS=41, MINUS=42, STAR=43, SLASH=44, LESS=45, GREATER=46, EQUAL=47, NOT_EQUAL=48, 
		LPAREN=49, RPAREN=50, LBRACE=51, RBRACE=52, TRUE=53, FALSE=54, ID=55, 
		STRING_LIT=56, NUMBER_LIT=57, WS=58, LINE_COMMENT=59, BLOCK_COMMENT=60, 
		DECORATOR=61, AS=62, TYPE=63, LBRACKET=64, RBRACKET=65, OR=66, BACKTICK=67, 
		LINE_COMMENT_HTML=68, BLOCK_COMMENT_HTML=69, TAG_OPEN_START_HTML=70, TAG_CLOSE_START_HTML=71, 
		TAG_CLOSE_END_HTML=72, TAG_END_HTML=73, ATTRIBUTE_EQUALS_HTML=74, STRING_HTML=75, 
		STRUCTURAL_DIR_HTML=76, BINDING_HTML=77, EVENT_BINDING_HTML=78, NEGATION_HTML=79, 
		COLON_HTML=80, INTERPOLATION_START_HTML=81, INTERPOLATION_END_HTML=82, 
		DOT_HTML=83, NAME_HTML=84, WS_HTML=85, END_TEMPLATE=86, BACKTICK_HTML=87, 
		BACKTICK_CSS=88, COLON_CSS=89, COMMA_CSS=90, OPEN_LIST=91, CLOSE_LIST=92, 
		DOT_CSS=93, SEMICOLON_CSS=94, LBRACE_CSS=95, RBRACE_CSS=96, PERCENT=97, 
		WS_CSS=98, LINE_COMMENT_CSS=99, BLOCK_COMMENT_CSS=100, PX=101, EM=102, 
		REM=103, ID_CSS=104;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_componentDeclaration = 2, RULE_componentDeclarationBody = 3, 
		RULE_componentBodyElement = 4, RULE_selector = 5, RULE_standalone = 6, 
		RULE_template = 7, RULE_styles = 8, RULE_isboolean = 9, RULE_classDeclaration = 10, 
		RULE_classDeclarationBody = 11, RULE_classMember = 12, RULE_propertyDeclaration = 13, 
		RULE_methodDeclaration = 14, RULE_methodBody = 15, RULE_statementMethod = 16, 
		RULE_interfaceDeclaration = 17, RULE_interfaceMember = 18, RULE_parameter = 19, 
		RULE_parameterList = 20, RULE_variableDeclaration = 21, RULE_importDeclaration = 22, 
		RULE_type = 23, RULE_list = 24, RULE_bodylist = 25, RULE_object = 26, 
		RULE_bodyobject = 27, RULE_initvalue = 28, RULE_expression = 29, RULE_functionCall = 30, 
		RULE_argument = 31, RULE_element = 32, RULE_tag = 33, RULE_openingTag = 34, 
		RULE_closingTag = 35, RULE_selfClosingTag = 36, RULE_attributes = 37, 
		RULE_interpolation = 38, RULE_cssBody = 39, RULE_cssObjects = 40, RULE_csselement = 41, 
		RULE_bodyelement = 42, RULE_cssValue = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "componentDeclaration", "componentDeclarationBody", 
			"componentBodyElement", "selector", "standalone", "template", "styles", 
			"isboolean", "classDeclaration", "classDeclarationBody", "classMember", 
			"propertyDeclaration", "methodDeclaration", "methodBody", "statementMethod", 
			"interfaceDeclaration", "interfaceMember", "parameter", "parameterList", 
			"variableDeclaration", "importDeclaration", "type", "list", "bodylist", 
			"object", "bodyobject", "initvalue", "expression", "functionCall", "argument", 
			"element", "tag", "openingTag", "closingTag", "selfClosingTag", "attributes", 
			"interpolation", "cssBody", "cssObjects", "csselement", "bodyelement", 
			"cssValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", null, "'for'", "'forEach'", "'break'", "'continue'", 
			"'return'", "'while'", "'do'", "'in'", "'default'", "'new'", "'function'", 
			"'class'", "'interface'", "'import'", "'export'", "'const'", "'let'", 
			"'var'", "'from'", "'Component'", "'selector'", "'standalone'", "'imports'", 
			"'template'", "'styles'", "'string'", "'number'", "'boolean'", "'any'", 
			"'void'", null, null, null, null, null, "'this'", null, "'+'", "'-'", 
			"'*'", "'/'", "'<'", null, null, "'!='", "'('", "')'", null, null, "'true'", 
			"'false'", null, null, null, null, null, null, "'@'", "'as'", "'type'", 
			null, null, "'|'", null, null, null, null, "'</'", null, "'/>'", null, 
			null, null, null, null, "'!'", null, "'{{'", "'}}'", null, null, null, 
			"'`,'", null, null, null, null, null, null, null, null, null, null, "'%'", 
			null, null, null, "'px'", "'em'", "'rem'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "ELSE_IF", "FOR", "FOR_EACH", "BREAK", "CONTINUE", 
			"RETURN", "WHILE", "DO", "IN", "DEFAULT_CASE", "NEW", "FUNCTION", "CLASS", 
			"INTERFACE", "IMPORT", "EXPORT", "CONST", "LET", "VAR", "FROM", "COMPONENT", 
			"SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATE", "STYLES", "STRING_TYPE", 
			"NUMBER_TYPE", "BOOLEAN_TYPE", "ANY_TYPE", "VOID_TYPE", "COMMA", "COLON", 
			"DOT", "SEMICOLON", "EQUALS", "THIS", "ASSIGN", "PLUS", "MINUS", "STAR", 
			"SLASH", "LESS", "GREATER", "EQUAL", "NOT_EQUAL", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "TRUE", "FALSE", "ID", "STRING_LIT", "NUMBER_LIT", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT", "DECORATOR", "AS", "TYPE", "LBRACKET", 
			"RBRACKET", "OR", "BACKTICK", "LINE_COMMENT_HTML", "BLOCK_COMMENT_HTML", 
			"TAG_OPEN_START_HTML", "TAG_CLOSE_START_HTML", "TAG_CLOSE_END_HTML", 
			"TAG_END_HTML", "ATTRIBUTE_EQUALS_HTML", "STRING_HTML", "STRUCTURAL_DIR_HTML", 
			"BINDING_HTML", "EVENT_BINDING_HTML", "NEGATION_HTML", "COLON_HTML", 
			"INTERPOLATION_START_HTML", "INTERPOLATION_END_HTML", "DOT_HTML", "NAME_HTML", 
			"WS_HTML", "END_TEMPLATE", "BACKTICK_HTML", "BACKTICK_CSS", "COLON_CSS", 
			"COMMA_CSS", "OPEN_LIST", "CLOSE_LIST", "DOT_CSS", "SEMICOLON_CSS", "LBRACE_CSS", 
			"RBRACE_CSS", "PERCENT", "WS_CSS", "LINE_COMMENT_CSS", "BLOCK_COMMENT_CSS", 
			"PX", "EM", "REM", "ID_CSS"
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
	public String getGrammarFileName() { return "parserZain.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public parserZain(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(88);
				statement();
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2341871806303928320L) != 0) );
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
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECORATOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				componentDeclaration();
				}
				break;
			case CLASS:
			case EXPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				classDeclaration();
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				interfaceDeclaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				methodDeclaration();
				}
				break;
			case CONST:
			case LET:
			case VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				variableDeclaration();
				}
				break;
			case IMPORT:
			case IMPORTS:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				importDeclaration();
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
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode DECORATOR() { return getToken(parserZain.DECORATOR, 0); }
		public TerminalNode COMPONENT() { return getToken(parserZain.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(parserZain.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(parserZain.LBRACE, 0); }
		public ComponentDeclarationBodyContext componentDeclarationBody() {
			return getRuleContext(ComponentDeclarationBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(parserZain.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(parserZain.RPAREN, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(DECORATOR);
			setState(102);
			match(COMPONENT);
			setState(103);
			match(LPAREN);
			setState(104);
			match(LBRACE);
			setState(105);
			componentDeclarationBody();
			setState(106);
			match(RBRACE);
			setState(107);
			match(RPAREN);
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
	public static class ComponentDeclarationBodyContext extends ParserRuleContext {
		public List<ComponentBodyElementContext> componentBodyElement() {
			return getRuleContexts(ComponentBodyElementContext.class);
		}
		public ComponentBodyElementContext componentBodyElement(int i) {
			return getRuleContext(ComponentBodyElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserZain.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserZain.COMMA, i);
		}
		public ComponentDeclarationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclarationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterComponentDeclarationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitComponentDeclarationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitComponentDeclarationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationBodyContext componentDeclarationBody() throws RecognitionException {
		ComponentDeclarationBodyContext _localctx = new ComponentDeclarationBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentDeclarationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 520224768L) != 0)) {
				{
				setState(109);
				componentBodyElement();
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(110);
					match(COMMA);
					}
					break;
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					componentBodyElement();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ComponentBodyElementContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public StandaloneContext standalone() {
			return getRuleContext(StandaloneContext.class,0);
		}
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public StylesContext styles() {
			return getRuleContext(StylesContext.class,0);
		}
		public ComponentBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterComponentBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitComponentBodyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitComponentBodyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyElementContext componentBodyElement() throws RecognitionException {
		ComponentBodyElementContext _localctx = new ComponentBodyElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentBodyElement);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				selector();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				standalone();
				}
				break;
			case IMPORT:
			case IMPORTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				importDeclaration();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				template();
				}
				break;
			case STYLES:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				styles();
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
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(parserZain.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(parserZain.COLON, 0); }
		public TerminalNode STRING_LIT() { return getToken(parserZain.STRING_LIT, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(SELECTOR);
			setState(130);
			match(COLON);
			setState(131);
			match(STRING_LIT);
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
	public static class StandaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(parserZain.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(parserZain.COLON, 0); }
		public IsbooleanContext isboolean() {
			return getRuleContext(IsbooleanContext.class,0);
		}
		public StandaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterStandalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitStandalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitStandalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneContext standalone() throws RecognitionException {
		StandaloneContext _localctx = new StandaloneContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_standalone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(STANDALONE);
			setState(134);
			match(COLON);
			setState(135);
			isboolean();
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
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(parserZain.TEMPLATE, 0); }
		public TerminalNode COLON_HTML() { return getToken(parserZain.COLON_HTML, 0); }
		public TerminalNode BACKTICK_HTML() { return getToken(parserZain.BACKTICK_HTML, 0); }
		public TerminalNode END_TEMPLATE() { return getToken(parserZain.END_TEMPLATE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(TEMPLATE);
			setState(138);
			match(COLON_HTML);
			setState(139);
			match(BACKTICK_HTML);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 18433L) != 0)) {
				{
				{
				setState(140);
				element();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(END_TEMPLATE);
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
	public static class StylesContext extends ParserRuleContext {
		public TerminalNode STYLES() { return getToken(parserZain.STYLES, 0); }
		public TerminalNode COLON_CSS() { return getToken(parserZain.COLON_CSS, 0); }
		public TerminalNode OPEN_LIST() { return getToken(parserZain.OPEN_LIST, 0); }
		public CssBodyContext cssBody() {
			return getRuleContext(CssBodyContext.class,0);
		}
		public TerminalNode CLOSE_LIST() { return getToken(parserZain.CLOSE_LIST, 0); }
		public TerminalNode COMMA() { return getToken(parserZain.COMMA, 0); }
		public StylesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterStyles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitStyles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitStyles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesContext styles() throws RecognitionException {
		StylesContext _localctx = new StylesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_styles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(STYLES);
			setState(149);
			match(COLON_CSS);
			setState(150);
			match(OPEN_LIST);
			setState(151);
			cssBody();
			setState(152);
			match(CLOSE_LIST);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(153);
				match(COMMA);
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
	public static class IsbooleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(parserZain.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(parserZain.FALSE, 0); }
		public IsbooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isboolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterIsboolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitIsboolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitIsboolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsbooleanContext isboolean() throws RecognitionException {
		IsbooleanContext _localctx = new IsbooleanContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_isboolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(parserZain.CLASS, 0); }
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public ClassDeclarationBodyContext classDeclarationBody() {
			return getRuleContext(ClassDeclarationBodyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(parserZain.EXPORT, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(158);
				match(EXPORT);
				}
			}

			setState(161);
			match(CLASS);
			setState(162);
			match(ID);
			setState(163);
			classDeclarationBody();
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
	public static class ClassDeclarationBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(parserZain.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(parserZain.RBRACE, 0); }
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(parserZain.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(parserZain.SEMICOLON, i);
		}
		public ClassDeclarationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterClassDeclarationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitClassDeclarationBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitClassDeclarationBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationBodyContext classDeclarationBody() throws RecognitionException {
		ClassDeclarationBodyContext _localctx = new ClassDeclarationBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classDeclarationBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(LBRACE);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(166);
				classMember();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(167);
					match(SEMICOLON);
					}
				}

				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(RBRACE);
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
	public static class ClassMemberContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitClassMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitClassMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_classMember);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				propertyDeclaration();
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
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
	 
		public PropertyDeclarationContext() { }
		public void copyFrom(PropertyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedAssignedPropertyContext extends PropertyDeclarationContext {
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode COLON() { return getToken(parserZain.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(parserZain.ASSIGN, 0); }
		public InitvalueContext initvalue() {
			return getRuleContext(InitvalueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(parserZain.SEMICOLON, 0); }
		public TypedAssignedPropertyContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterTypedAssignedProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitTypedAssignedProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitTypedAssignedProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionalTypedPropertyContext extends PropertyDeclarationContext {
		public List<TerminalNode> ID() { return getTokens(parserZain.ID); }
		public TerminalNode ID(int i) {
			return getToken(parserZain.ID, i);
		}
		public TerminalNode COLON() { return getToken(parserZain.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OR() { return getToken(parserZain.OR, 0); }
		public TerminalNode ASSIGN() { return getToken(parserZain.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(parserZain.SEMICOLON, 0); }
		public OptionalTypedPropertyContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterOptionalTypedProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitOptionalTypedProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitOptionalTypedProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertyDeclaration);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new TypedAssignedPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(ID);
				setState(182);
				match(COLON);
				setState(183);
				type();
				setState(184);
				match(ASSIGN);
				setState(185);
				initvalue();
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(186);
					match(SEMICOLON);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new OptionalTypedPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(ID);
				setState(190);
				match(COLON);
				setState(191);
				type();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(192);
					match(OR);
					setState(193);
					match(ID);
					setState(194);
					match(ASSIGN);
					setState(195);
					match(ID);
					}
				}

				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(198);
					match(SEMICOLON);
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
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode LPAREN() { return getToken(parserZain.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(parserZain.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(parserZain.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(parserZain.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(parserZain.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ID);
			setState(204);
			match(LPAREN);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(205);
				parameterList();
				}
			}

			setState(208);
			match(RPAREN);
			setState(209);
			match(COLON);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028813661962240L) != 0)) {
				{
				setState(210);
				type();
				}
			}

			setState(213);
			match(LBRACE);
			setState(214);
			methodBody();
			setState(215);
			match(RBRACE);
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
	public static class MethodBodyContext extends ParserRuleContext {
		public List<StatementMethodContext> statementMethod() {
			return getRuleContexts(StatementMethodContext.class);
		}
		public StatementMethodContext statementMethod(int i) {
			return getRuleContext(StatementMethodContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279223726656454656L) != 0)) {
				{
				{
				setState(217);
				statementMethod();
				}
				}
				setState(222);
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
	public static class StatementMethodContext extends ParserRuleContext {
		public StatementMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethod; }
	 
		public StatementMethodContext() { }
		public void copyFrom(StatementMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisAssignIDContext extends StatementMethodContext {
		public TerminalNode THIS() { return getToken(parserZain.THIS, 0); }
		public TerminalNode DOT() { return getToken(parserZain.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(parserZain.ID); }
		public TerminalNode ID(int i) {
			return getToken(parserZain.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(parserZain.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(parserZain.SEMICOLON, 0); }
		public ThisAssignIDContext(StatementMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterThisAssignID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitThisAssignID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitThisAssignID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisAssignExprContext extends StatementMethodContext {
		public TerminalNode THIS() { return getToken(parserZain.THIS, 0); }
		public TerminalNode DOT() { return getToken(parserZain.DOT, 0); }
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(parserZain.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(parserZain.SEMICOLON, 0); }
		public ThisAssignExprContext(StatementMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterThisAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitThisAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitThisAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStatementContext extends StatementMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(parserZain.SEMICOLON, 0); }
		public ExprStatementContext(StatementMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends StatementMethodContext {
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(parserZain.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(parserZain.SEMICOLON, 0); }
		public AssignStatementContext(StatementMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodContext statementMethod() throws RecognitionException {
		StatementMethodContext _localctx = new StatementMethodContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementMethod);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(ID);
				setState(224);
				match(ASSIGN);
				setState(225);
				expression();
				setState(226);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ThisAssignIDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(THIS);
				setState(229);
				match(DOT);
				setState(230);
				match(ID);
				setState(231);
				match(ASSIGN);
				setState(232);
				match(ID);
				setState(233);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new ThisAssignExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(THIS);
				setState(235);
				match(DOT);
				setState(236);
				match(ID);
				setState(237);
				match(ASSIGN);
				setState(238);
				expression();
				setState(239);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				expression();
				setState(242);
				match(SEMICOLON);
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
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(parserZain.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode LBRACE() { return getToken(parserZain.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(parserZain.RBRACE, 0); }
		public List<InterfaceMemberContext> interfaceMember() {
			return getRuleContexts(InterfaceMemberContext.class);
		}
		public InterfaceMemberContext interfaceMember(int i) {
			return getRuleContext(InterfaceMemberContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(INTERFACE);
			setState(247);
			match(ID);
			setState(248);
			match(LBRACE);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(249);
				interfaceMember();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(RBRACE);
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
	public static class InterfaceMemberContext extends ParserRuleContext {
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public InterfaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterInterfaceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitInterfaceMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitInterfaceMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberContext interfaceMember() throws RecognitionException {
		InterfaceMemberContext _localctx = new InterfaceMemberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceMember);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				propertyDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				methodDeclaration();
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode COLON() { return getToken(parserZain.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(ID);
			setState(262);
			match(COLON);
			setState(263);
			type();
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserZain.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserZain.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			parameter();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				parameter();
				}
				}
				setState(272);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(parserZain.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONST() { return getToken(parserZain.CONST, 0); }
		public TerminalNode LET() { return getToken(parserZain.LET, 0); }
		public TerminalNode VAR() { return getToken(parserZain.VAR, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(274);
			match(ID);
			setState(275);
			match(ASSIGN);
			setState(276);
			expression();
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
	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	 
		public ImportDeclarationContext() { }
		public void copyFrom(ImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportSingleContext extends ImportDeclarationContext {
		public TerminalNode IMPORT() { return getToken(parserZain.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(parserZain.LBRACE, 0); }
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode RBRACE() { return getToken(parserZain.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(parserZain.FROM, 0); }
		public TerminalNode STRING_LIT() { return getToken(parserZain.STRING_LIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(parserZain.SEMICOLON, 0); }
		public ImportSingleContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterImportSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitImportSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitImportSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportComponentContext extends ImportDeclarationContext {
		public TerminalNode IMPORT() { return getToken(parserZain.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(parserZain.LBRACE, 0); }
		public TerminalNode COMPONENT() { return getToken(parserZain.COMPONENT, 0); }
		public TerminalNode RBRACE() { return getToken(parserZain.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(parserZain.FROM, 0); }
		public TerminalNode STRING_LIT() { return getToken(parserZain.STRING_LIT, 0); }
		public TerminalNode SEMICOLON() { return getToken(parserZain.SEMICOLON, 0); }
		public ImportComponentContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterImportComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitImportComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitImportComponent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportArrayContext extends ImportDeclarationContext {
		public TerminalNode IMPORTS() { return getToken(parserZain.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(parserZain.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(parserZain.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(parserZain.RBRACKET, 0); }
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public ImportArrayContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterImportArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitImportArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitImportArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_importDeclaration);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ImportSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(IMPORT);
				setState(279);
				match(LBRACE);
				setState(280);
				match(ID);
				setState(281);
				match(RBRACE);
				setState(282);
				match(FROM);
				setState(283);
				match(STRING_LIT);
				setState(284);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new ImportComponentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(IMPORT);
				setState(286);
				match(LBRACE);
				setState(287);
				match(COMPONENT);
				setState(288);
				match(RBRACE);
				setState(289);
				match(FROM);
				setState(290);
				match(STRING_LIT);
				setState(291);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new ImportArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(IMPORTS);
				setState(293);
				match(COLON);
				setState(294);
				match(LBRACKET);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(295);
					match(ID);
					}
				}

				setState(298);
				match(RBRACKET);
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
		public TerminalNode STRING_TYPE() { return getToken(parserZain.STRING_TYPE, 0); }
		public TerminalNode NUMBER_TYPE() { return getToken(parserZain.NUMBER_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(parserZain.BOOLEAN_TYPE, 0); }
		public TerminalNode ANY_TYPE() { return getToken(parserZain.ANY_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(parserZain.VOID_TYPE, 0); }
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_type);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(STRING_TYPE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(NUMBER_TYPE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(BOOLEAN_TYPE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(ANY_TYPE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(VOID_TYPE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(306);
				match(ID);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(307);
				list();
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(parserZain.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(parserZain.RBRACKET, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ID);
			setState(311);
			match(LBRACKET);
			setState(312);
			match(RBRACKET);
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
	public static class BodylistContext extends ParserRuleContext {
		public List<InitvalueContext> initvalue() {
			return getRuleContexts(InitvalueContext.class);
		}
		public InitvalueContext initvalue(int i) {
			return getRuleContext(InitvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserZain.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserZain.COMMA, i);
		}
		public BodylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodylist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterBodylist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitBodylist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitBodylist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodylistContext bodylist() throws RecognitionException {
		BodylistContext _localctx = new BodylistContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bodylist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 8301L) != 0)) {
				{
				setState(314);
				initvalue();
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(315);
					match(COMMA);
					setState(316);
					initvalue();
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(parserZain.LBRACE, 0); }
		public BodyobjectContext bodyobject() {
			return getRuleContext(BodyobjectContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(parserZain.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(parserZain.COMMA, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(LBRACE);
			setState(325);
			bodyobject();
			setState(326);
			match(RBRACE);
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(327);
				match(COMMA);
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
	public static class BodyobjectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(parserZain.ID); }
		public TerminalNode ID(int i) {
			return getToken(parserZain.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(parserZain.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(parserZain.COLON, i);
		}
		public List<InitvalueContext> initvalue() {
			return getRuleContexts(InitvalueContext.class);
		}
		public InitvalueContext initvalue(int i) {
			return getRuleContext(InitvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(parserZain.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(parserZain.COMMA, i);
		}
		public BodyobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterBodyobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitBodyobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitBodyobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyobjectContext bodyobject() throws RecognitionException {
		BodyobjectContext _localctx = new BodyobjectContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bodyobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(330);
				match(ID);
				setState(331);
				match(COLON);
				setState(332);
				initvalue();
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					match(ID);
					setState(335);
					match(COLON);
					setState(336);
					initvalue();
					setState(338);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(337);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class InitvalueContext extends ParserRuleContext {
		public TerminalNode NUMBER_LIT() { return getToken(parserZain.NUMBER_LIT, 0); }
		public TerminalNode STRING_LIT() { return getToken(parserZain.STRING_LIT, 0); }
		public IsbooleanContext isboolean() {
			return getRuleContext(IsbooleanContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(parserZain.LBRACKET, 0); }
		public BodylistContext bodylist() {
			return getRuleContext(BodylistContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(parserZain.RBRACKET, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public InitvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterInitvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitInitvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitInitvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitvalueContext initvalue() throws RecognitionException {
		InitvalueContext _localctx = new InitvalueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_initvalue);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(NUMBER_LIT);
				}
				break;
			case STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(STRING_LIT);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				isboolean();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(LBRACKET);
				setState(351);
				bodylist();
				setState(352);
				match(RBRACKET);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				object();
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode STRING_LIT() { return getToken(parserZain.STRING_LIT, 0); }
		public TerminalNode NUMBER_LIT() { return getToken(parserZain.NUMBER_LIT, 0); }
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public IsbooleanContext isboolean() {
			return getRuleContext(IsbooleanContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(STRING_LIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(NUMBER_LIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				isboolean();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				variableDeclaration();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(parserZain.ID, 0); }
		public TerminalNode LPAREN() { return getToken(parserZain.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(parserZain.RPAREN, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(ID);
			setState(366);
			match(LPAREN);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279223176900640768L) != 0)) {
				{
				{
				setState(367);
				argument();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(RPAREN);
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
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			expression();
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
	public static class ElementContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode NAME_HTML() { return getToken(parserZain.NAME_HTML, 0); }
		public TerminalNode COLON_HTML() { return getToken(parserZain.COLON_HTML, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_element);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN_START_HTML:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				tag();
				}
				break;
			case NAME_HTML:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(NAME_HTML);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON_HTML) {
					{
					setState(379);
					match(COLON_HTML);
					}
				}

				}
				break;
			case INTERPOLATION_START_HTML:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				interpolation();
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
	public static class TagContext extends ParserRuleContext {
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
	 
		public TagContext() { }
		public void copyFrom(TagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfTagContext extends TagContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public SelfTagContext(TagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterSelfTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitSelfTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitSelfTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalTagContext extends TagContext {
		public OpeningTagContext openingTag() {
			return getRuleContext(OpeningTagContext.class,0);
		}
		public ClosingTagContext closingTag() {
			return getRuleContext(ClosingTagContext.class,0);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public NormalTagContext(TagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterNormalTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitNormalTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitNormalTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tag);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new NormalTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				openingTag();
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 18433L) != 0)) {
					{
					{
					setState(386);
					element();
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(392);
				closingTag();
				}
				break;
			case 2:
				_localctx = new SelfTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				selfClosingTag();
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
	public static class OpeningTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_START_HTML() { return getToken(parserZain.TAG_OPEN_START_HTML, 0); }
		public TerminalNode TAG_CLOSE_END_HTML() { return getToken(parserZain.TAG_CLOSE_END_HTML, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public OpeningTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterOpeningTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitOpeningTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitOpeningTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpeningTagContext openingTag() throws RecognitionException {
		OpeningTagContext _localctx = new OpeningTagContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_openingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(TAG_OPEN_START_HTML);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 263L) != 0)) {
				{
				{
				setState(398);
				attributes();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(TAG_CLOSE_END_HTML);
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
	public static class ClosingTagContext extends ParserRuleContext {
		public TerminalNode TAG_CLOSE_START_HTML() { return getToken(parserZain.TAG_CLOSE_START_HTML, 0); }
		public TerminalNode NAME_HTML() { return getToken(parserZain.NAME_HTML, 0); }
		public TerminalNode TAG_CLOSE_END_HTML() { return getToken(parserZain.TAG_CLOSE_END_HTML, 0); }
		public ClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosingTagContext closingTag() throws RecognitionException {
		ClosingTagContext _localctx = new ClosingTagContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_closingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(TAG_CLOSE_START_HTML);
			setState(407);
			match(NAME_HTML);
			setState(408);
			match(TAG_CLOSE_END_HTML);
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
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN_START_HTML() { return getToken(parserZain.TAG_OPEN_START_HTML, 0); }
		public TerminalNode TAG_END_HTML() { return getToken(parserZain.TAG_END_HTML, 0); }
		public List<AttributesContext> attributes() {
			return getRuleContexts(AttributesContext.class);
		}
		public AttributesContext attributes(int i) {
			return getRuleContext(AttributesContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(TAG_OPEN_START_HTML);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 263L) != 0)) {
				{
				{
				setState(411);
				attributes();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(TAG_END_HTML);
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
	public static class AttributesContext extends ParserRuleContext {
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	 
		public AttributesContext() { }
		public void copyFrom(AttributesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventAttrContext extends AttributesContext {
		public TerminalNode EVENT_BINDING_HTML() { return getToken(parserZain.EVENT_BINDING_HTML, 0); }
		public TerminalNode ATTRIBUTE_EQUALS_HTML() { return getToken(parserZain.ATTRIBUTE_EQUALS_HTML, 0); }
		public TerminalNode STRING_HTML() { return getToken(parserZain.STRING_HTML, 0); }
		public EventAttrContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterEventAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitEventAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitEventAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructuralAttrContext extends AttributesContext {
		public TerminalNode STRUCTURAL_DIR_HTML() { return getToken(parserZain.STRUCTURAL_DIR_HTML, 0); }
		public TerminalNode ATTRIBUTE_EQUALS_HTML() { return getToken(parserZain.ATTRIBUTE_EQUALS_HTML, 0); }
		public TerminalNode STRING_HTML() { return getToken(parserZain.STRING_HTML, 0); }
		public StructuralAttrContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterStructuralAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitStructuralAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitStructuralAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BindingAttrContext extends AttributesContext {
		public TerminalNode BINDING_HTML() { return getToken(parserZain.BINDING_HTML, 0); }
		public TerminalNode ATTRIBUTE_EQUALS_HTML() { return getToken(parserZain.ATTRIBUTE_EQUALS_HTML, 0); }
		public TerminalNode STRING_HTML() { return getToken(parserZain.STRING_HTML, 0); }
		public BindingAttrContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterBindingAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitBindingAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitBindingAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalAttrContext extends AttributesContext {
		public TerminalNode NAME_HTML() { return getToken(parserZain.NAME_HTML, 0); }
		public TerminalNode ATTRIBUTE_EQUALS_HTML() { return getToken(parserZain.ATTRIBUTE_EQUALS_HTML, 0); }
		public TerminalNode STRING_HTML() { return getToken(parserZain.STRING_HTML, 0); }
		public NormalAttrContext(AttributesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterNormalAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitNormalAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitNormalAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_attributes);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_HTML:
				_localctx = new NormalAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(NAME_HTML);
				setState(420);
				match(ATTRIBUTE_EQUALS_HTML);
				setState(421);
				match(STRING_HTML);
				}
				break;
			case STRUCTURAL_DIR_HTML:
				_localctx = new StructuralAttrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(STRUCTURAL_DIR_HTML);
				setState(423);
				match(ATTRIBUTE_EQUALS_HTML);
				setState(424);
				match(STRING_HTML);
				}
				break;
			case BINDING_HTML:
				_localctx = new BindingAttrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				match(BINDING_HTML);
				setState(426);
				match(ATTRIBUTE_EQUALS_HTML);
				setState(427);
				match(STRING_HTML);
				}
				break;
			case EVENT_BINDING_HTML:
				_localctx = new EventAttrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				match(EVENT_BINDING_HTML);
				setState(429);
				match(ATTRIBUTE_EQUALS_HTML);
				setState(430);
				match(STRING_HTML);
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
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_START_HTML() { return getToken(parserZain.INTERPOLATION_START_HTML, 0); }
		public TerminalNode NAME_HTML() { return getToken(parserZain.NAME_HTML, 0); }
		public TerminalNode INTERPOLATION_END_HTML() { return getToken(parserZain.INTERPOLATION_END_HTML, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(INTERPOLATION_START_HTML);
			setState(434);
			match(NAME_HTML);
			setState(435);
			match(INTERPOLATION_END_HTML);
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
	public static class CssBodyContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK_CSS() { return getTokens(parserZain.BACKTICK_CSS); }
		public TerminalNode BACKTICK_CSS(int i) {
			return getToken(parserZain.BACKTICK_CSS, i);
		}
		public CssObjectsContext cssObjects() {
			return getRuleContext(CssObjectsContext.class,0);
		}
		public TerminalNode COMMA_CSS() { return getToken(parserZain.COMMA_CSS, 0); }
		public CssBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterCssBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitCssBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitCssBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBodyContext cssBody() throws RecognitionException {
		CssBodyContext _localctx = new CssBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_cssBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(BACKTICK_CSS);
			setState(438);
			cssObjects();
			setState(439);
			match(BACKTICK_CSS);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_CSS) {
				{
				setState(440);
				match(COMMA_CSS);
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
	public static class CssObjectsContext extends ParserRuleContext {
		public List<CsselementContext> csselement() {
			return getRuleContexts(CsselementContext.class);
		}
		public CsselementContext csselement(int i) {
			return getRuleContext(CsselementContext.class,i);
		}
		public List<TerminalNode> COMMA_CSS() { return getTokens(parserZain.COMMA_CSS); }
		public TerminalNode COMMA_CSS(int i) {
			return getToken(parserZain.COMMA_CSS, i);
		}
		public CssObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssObjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterCssObjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitCssObjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitCssObjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssObjectsContext cssObjects() throws RecognitionException {
		CssObjectsContext _localctx = new CssObjectsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_cssObjects);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(443);
				csselement();
				}
				break;
			}
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_CSS || _la==DOT_CSS) {
				{
				{
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_CSS) {
					{
					setState(446);
					match(COMMA_CSS);
					}
				}

				setState(449);
				csselement();
				}
				}
				setState(454);
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
	public static class CsselementContext extends ParserRuleContext {
		public TerminalNode DOT_CSS() { return getToken(parserZain.DOT_CSS, 0); }
		public TerminalNode LBRACE_CSS() { return getToken(parserZain.LBRACE_CSS, 0); }
		public TerminalNode RBRACE_CSS() { return getToken(parserZain.RBRACE_CSS, 0); }
		public List<TerminalNode> ID_CSS() { return getTokens(parserZain.ID_CSS); }
		public TerminalNode ID_CSS(int i) {
			return getToken(parserZain.ID_CSS, i);
		}
		public List<BodyelementContext> bodyelement() {
			return getRuleContexts(BodyelementContext.class);
		}
		public BodyelementContext bodyelement(int i) {
			return getRuleContext(BodyelementContext.class,i);
		}
		public CsselementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csselement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterCsselement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitCsselement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitCsselement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CsselementContext csselement() throws RecognitionException {
		CsselementContext _localctx = new CsselementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_csselement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(DOT_CSS);
			setState(457); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(456);
				match(ID_CSS);
				}
				}
				setState(459); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID_CSS );
			setState(461);
			match(LBRACE_CSS);
			setState(463); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(462);
				bodyelement();
				}
				}
				setState(465); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID_CSS );
			setState(467);
			match(RBRACE_CSS);
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
	public static class BodyelementContext extends ParserRuleContext {
		public TerminalNode ID_CSS() { return getToken(parserZain.ID_CSS, 0); }
		public TerminalNode COLON_CSS() { return getToken(parserZain.COLON_CSS, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public TerminalNode SEMICOLON_CSS() { return getToken(parserZain.SEMICOLON_CSS, 0); }
		public BodyelementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyelement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterBodyelement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitBodyelement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitBodyelement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyelementContext bodyelement() throws RecognitionException {
		BodyelementContext _localctx = new BodyelementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bodyelement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(ID_CSS);
			setState(470);
			match(COLON_CSS);
			setState(471);
			cssValue();
			setState(472);
			match(SEMICOLON_CSS);
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
	public static class CssValueContext extends ParserRuleContext {
		public TerminalNode PERCENT() { return getToken(parserZain.PERCENT, 0); }
		public List<TerminalNode> ID_CSS() { return getTokens(parserZain.ID_CSS); }
		public TerminalNode ID_CSS(int i) {
			return getToken(parserZain.ID_CSS, i);
		}
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof parserZainListener ) ((parserZainListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof parserZainVisitor ) return ((parserZainVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_cssValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !(_la==PERCENT || _la==ID_CSS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_CSS) {
				{
				setState(475);
				match(ID_CSS);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID_CSS) {
					{
					setState(476);
					match(ID_CSS);
					}
				}

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

	public static final String _serializedATN =
		"\u0004\u0001h\u01e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0004\u0000"+
		"Z\b\u0000\u000b\u0000\f\u0000[\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001d\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u0003p\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003t\b\u0003\n\u0003\f\u0003w\t\u0003\u0003\u0003y\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0080\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u008e\b\u0007\n\u0007\f\u0007\u0091\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u009b\b\b\u0001\t\u0001\t\u0001\n\u0003\n\u00a0\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00a9"+
		"\b\u000b\u0005\u000b\u00ab\b\u000b\n\u000b\f\u000b\u00ae\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00b4\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bc\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c5\b\r\u0001\r\u0003\r\u00c8\b\r"+
		"\u0003\r\u00ca\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cf"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d4\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0005\u000f"+
		"\u00db\b\u000f\n\u000f\f\u000f\u00de\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00f5\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00fb\b\u0011\n\u0011\f\u0011\u00fe\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0104\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u010d\b\u0014\n\u0014\f\u0014\u0110\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0129\b\u0016\u0001"+
		"\u0016\u0003\u0016\u012c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0135\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u013e\b\u0019\n\u0019\f\u0019\u0141\t\u0019\u0003\u0019"+
		"\u0143\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0149\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0153\b\u001b\u0005\u001b"+
		"\u0155\b\u001b\n\u001b\f\u001b\u0158\t\u001b\u0003\u001b\u015a\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0164\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u016c\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0171\b\u001e\n\u001e"+
		"\f\u001e\u0174\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0003 \u017d\b \u0001 \u0003 \u0180\b \u0001!\u0001"+
		"!\u0005!\u0184\b!\n!\f!\u0187\t!\u0001!\u0001!\u0001!\u0003!\u018c\b!"+
		"\u0001\"\u0001\"\u0005\"\u0190\b\"\n\"\f\"\u0193\t\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0005$\u019d\b$\n$\f$\u01a0\t$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u01b0\b%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u01ba\b\'\u0001(\u0003(\u01bd\b(\u0001"+
		"(\u0003(\u01c0\b(\u0001(\u0005(\u01c3\b(\n(\f(\u01c6\t(\u0001)\u0001)"+
		"\u0004)\u01ca\b)\u000b)\f)\u01cb\u0001)\u0001)\u0004)\u01d0\b)\u000b)"+
		"\f)\u01d1\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0003+\u01de\b+\u0003+\u01e0\b+\u0001+\u0000\u0000,\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0003\u0001\u000056\u0001\u0000\u0013"+
		"\u0015\u0002\u0000aahh\u0200\u0000Y\u0001\u0000\u0000\u0000\u0002c\u0001"+
		"\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006x\u0001\u0000\u0000"+
		"\u0000\b\u007f\u0001\u0000\u0000\u0000\n\u0081\u0001\u0000\u0000\u0000"+
		"\f\u0085\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010"+
		"\u0094\u0001\u0000\u0000\u0000\u0012\u009c\u0001\u0000\u0000\u0000\u0014"+
		"\u009f\u0001\u0000\u0000\u0000\u0016\u00a5\u0001\u0000\u0000\u0000\u0018"+
		"\u00b3\u0001\u0000\u0000\u0000\u001a\u00c9\u0001\u0000\u0000\u0000\u001c"+
		"\u00cb\u0001\u0000\u0000\u0000\u001e\u00dc\u0001\u0000\u0000\u0000 \u00f4"+
		"\u0001\u0000\u0000\u0000\"\u00f6\u0001\u0000\u0000\u0000$\u0103\u0001"+
		"\u0000\u0000\u0000&\u0105\u0001\u0000\u0000\u0000(\u0109\u0001\u0000\u0000"+
		"\u0000*\u0111\u0001\u0000\u0000\u0000,\u012b\u0001\u0000\u0000\u0000."+
		"\u0134\u0001\u0000\u0000\u00000\u0136\u0001\u0000\u0000\u00002\u0142\u0001"+
		"\u0000\u0000\u00004\u0144\u0001\u0000\u0000\u00006\u0159\u0001\u0000\u0000"+
		"\u00008\u0163\u0001\u0000\u0000\u0000:\u016b\u0001\u0000\u0000\u0000<"+
		"\u016d\u0001\u0000\u0000\u0000>\u0177\u0001\u0000\u0000\u0000@\u017f\u0001"+
		"\u0000\u0000\u0000B\u018b\u0001\u0000\u0000\u0000D\u018d\u0001\u0000\u0000"+
		"\u0000F\u0196\u0001\u0000\u0000\u0000H\u019a\u0001\u0000\u0000\u0000J"+
		"\u01af\u0001\u0000\u0000\u0000L\u01b1\u0001\u0000\u0000\u0000N\u01b5\u0001"+
		"\u0000\u0000\u0000P\u01bc\u0001\u0000\u0000\u0000R\u01c7\u0001\u0000\u0000"+
		"\u0000T\u01d5\u0001\u0000\u0000\u0000V\u01da\u0001\u0000\u0000\u0000X"+
		"Z\u0003\u0002\u0001\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0001\u0001"+
		"\u0000\u0000\u0000]d\u0003\u0004\u0002\u0000^d\u0003\u0014\n\u0000_d\u0003"+
		"\"\u0011\u0000`d\u0003\u001c\u000e\u0000ad\u0003*\u0015\u0000bd\u0003"+
		",\u0016\u0000c]\u0001\u0000\u0000\u0000c^\u0001\u0000\u0000\u0000c_\u0001"+
		"\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000d\u0003\u0001\u0000\u0000\u0000ef\u0005=\u0000"+
		"\u0000fg\u0005\u0017\u0000\u0000gh\u00051\u0000\u0000hi\u00053\u0000\u0000"+
		"ij\u0003\u0006\u0003\u0000jk\u00054\u0000\u0000kl\u00052\u0000\u0000l"+
		"\u0005\u0001\u0000\u0000\u0000mo\u0003\b\u0004\u0000np\u0005\"\u0000\u0000"+
		"on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pu\u0001\u0000\u0000"+
		"\u0000qr\u0005\"\u0000\u0000rt\u0003\b\u0004\u0000sq\u0001\u0000\u0000"+
		"\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xm\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0007\u0001\u0000\u0000"+
		"\u0000z\u0080\u0003\n\u0005\u0000{\u0080\u0003\f\u0006\u0000|\u0080\u0003"+
		",\u0016\u0000}\u0080\u0003\u000e\u0007\u0000~\u0080\u0003\u0010\b\u0000"+
		"\u007fz\u0001\u0000\u0000\u0000\u007f{\u0001\u0000\u0000\u0000\u007f|"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u0080\t\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0018\u0000"+
		"\u0000\u0082\u0083\u0005#\u0000\u0000\u0083\u0084\u00058\u0000\u0000\u0084"+
		"\u000b\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0019\u0000\u0000\u0086"+
		"\u0087\u0005#\u0000\u0000\u0087\u0088\u0003\u0012\t\u0000\u0088\r\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u001b\u0000\u0000\u008a\u008b\u0005"+
		"P\u0000\u0000\u008b\u008f\u0005W\u0000\u0000\u008c\u008e\u0003@ \u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005V\u0000\u0000\u0093\u000f\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\u001c\u0000\u0000\u0095\u0096\u0005Y\u0000\u0000\u0096\u0097"+
		"\u0005[\u0000\u0000\u0097\u0098\u0003N\'\u0000\u0098\u009a\u0005\\\u0000"+
		"\u0000\u0099\u009b\u0005\"\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0011\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0007\u0000\u0000\u0000\u009d\u0013\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0005\u0012\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0005\u000f\u0000\u0000\u00a2\u00a3\u00057\u0000\u0000\u00a3"+
		"\u00a4\u0003\u0016\u000b\u0000\u00a4\u0015\u0001\u0000\u0000\u0000\u00a5"+
		"\u00ac\u00053\u0000\u0000\u00a6\u00a8\u0003\u0018\f\u0000\u00a7\u00a9"+
		"\u0005%\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0005"+
		"4\u0000\u0000\u00b0\u0017\u0001\u0000\u0000\u0000\u00b1\u00b4\u0003\u001c"+
		"\u000e\u0000\u00b2\u00b4\u0003\u001a\r\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0019\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u00057\u0000\u0000\u00b6\u00b7\u0005#\u0000\u0000\u00b7"+
		"\u00b8\u0003.\u0017\u0000\u00b8\u00b9\u0005(\u0000\u0000\u00b9\u00bb\u0003"+
		"8\u001c\u0000\u00ba\u00bc\u0005%\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ca\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u00057\u0000\u0000\u00be\u00bf\u0005#\u0000\u0000\u00bf"+
		"\u00c4\u0003.\u0017\u0000\u00c0\u00c1\u0005B\u0000\u0000\u00c1\u00c2\u0005"+
		"7\u0000\u0000\u00c2\u00c3\u0005(\u0000\u0000\u00c3\u00c5\u00057\u0000"+
		"\u0000\u00c4\u00c0\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c8\u0005%\u0000\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00b5\u0001\u0000\u0000\u0000"+
		"\u00c9\u00bd\u0001\u0000\u0000\u0000\u00ca\u001b\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u00057\u0000\u0000\u00cc\u00ce\u00051\u0000\u0000\u00cd\u00cf"+
		"\u0003(\u0014\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"2\u0000\u0000\u00d1\u00d3\u0005#\u0000\u0000\u00d2\u00d4\u0003.\u0017"+
		"\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u00053\u0000\u0000"+
		"\u00d6\u00d7\u0003\u001e\u000f\u0000\u00d7\u00d8\u00054\u0000\u0000\u00d8"+
		"\u001d\u0001\u0000\u0000\u0000\u00d9\u00db\u0003 \u0010\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u001f"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u00057\u0000\u0000\u00e0\u00e1\u0005(\u0000\u0000\u00e1\u00e2\u0003:"+
		"\u001d\u0000\u00e2\u00e3\u0005%\u0000\u0000\u00e3\u00f5\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005\'\u0000\u0000\u00e5\u00e6\u0005$\u0000\u0000"+
		"\u00e6\u00e7\u00057\u0000\u0000\u00e7\u00e8\u0005(\u0000\u0000\u00e8\u00e9"+
		"\u00057\u0000\u0000\u00e9\u00f5\u0005%\u0000\u0000\u00ea\u00eb\u0005\'"+
		"\u0000\u0000\u00eb\u00ec\u0005$\u0000\u0000\u00ec\u00ed\u00057\u0000\u0000"+
		"\u00ed\u00ee\u0005(\u0000\u0000\u00ee\u00ef\u0003:\u001d\u0000\u00ef\u00f0"+
		"\u0005%\u0000\u0000\u00f0\u00f5\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003"+
		":\u001d\u0000\u00f2\u00f3\u0005%\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f4\u00df\u0001\u0000\u0000\u0000\u00f4\u00e4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00ea\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f5!\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0010\u0000\u0000"+
		"\u00f7\u00f8\u00057\u0000\u0000\u00f8\u00fc\u00053\u0000\u0000\u00f9\u00fb"+
		"\u0003$\u0012\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u00054\u0000\u0000\u0100#\u0001\u0000\u0000"+
		"\u0000\u0101\u0104\u0003\u001a\r\u0000\u0102\u0104\u0003\u001c\u000e\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000"+
		"\u0104%\u0001\u0000\u0000\u0000\u0105\u0106\u00057\u0000\u0000\u0106\u0107"+
		"\u0005#\u0000\u0000\u0107\u0108\u0003.\u0017\u0000\u0108\'\u0001\u0000"+
		"\u0000\u0000\u0109\u010e\u0003&\u0013\u0000\u010a\u010b\u0005\"\u0000"+
		"\u0000\u010b\u010d\u0003&\u0013\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0001\u0000\u0000\u0000\u010f)\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0001\u0000\u0000\u0112"+
		"\u0113\u00057\u0000\u0000\u0113\u0114\u0005(\u0000\u0000\u0114\u0115\u0003"+
		":\u001d\u0000\u0115+\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0011\u0000"+
		"\u0000\u0117\u0118\u00053\u0000\u0000\u0118\u0119\u00057\u0000\u0000\u0119"+
		"\u011a\u00054\u0000\u0000\u011a\u011b\u0005\u0016\u0000\u0000\u011b\u011c"+
		"\u00058\u0000\u0000\u011c\u012c\u0005%\u0000\u0000\u011d\u011e\u0005\u0011"+
		"\u0000\u0000\u011e\u011f\u00053\u0000\u0000\u011f\u0120\u0005\u0017\u0000"+
		"\u0000\u0120\u0121\u00054\u0000\u0000\u0121\u0122\u0005\u0016\u0000\u0000"+
		"\u0122\u0123\u00058\u0000\u0000\u0123\u012c\u0005%\u0000\u0000\u0124\u0125"+
		"\u0005\u001a\u0000\u0000\u0125\u0126\u0005#\u0000\u0000\u0126\u0128\u0005"+
		"@\u0000\u0000\u0127\u0129\u00057\u0000\u0000\u0128\u0127\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012c\u0005A\u0000\u0000\u012b\u0116\u0001\u0000\u0000\u0000"+
		"\u012b\u011d\u0001\u0000\u0000\u0000\u012b\u0124\u0001\u0000\u0000\u0000"+
		"\u012c-\u0001\u0000\u0000\u0000\u012d\u0135\u0005\u001d\u0000\u0000\u012e"+
		"\u0135\u0005\u001e\u0000\u0000\u012f\u0135\u0005\u001f\u0000\u0000\u0130"+
		"\u0135\u0005 \u0000\u0000\u0131\u0135\u0005!\u0000\u0000\u0132\u0135\u0005"+
		"7\u0000\u0000\u0133\u0135\u00030\u0018\u0000\u0134\u012d\u0001\u0000\u0000"+
		"\u0000\u0134\u012e\u0001\u0000\u0000\u0000\u0134\u012f\u0001\u0000\u0000"+
		"\u0000\u0134\u0130\u0001\u0000\u0000\u0000\u0134\u0131\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000"+
		"\u0000\u0135/\u0001\u0000\u0000\u0000\u0136\u0137\u00057\u0000\u0000\u0137"+
		"\u0138\u0005@\u0000\u0000\u0138\u0139\u0005A\u0000\u0000\u01391\u0001"+
		"\u0000\u0000\u0000\u013a\u013f\u00038\u001c\u0000\u013b\u013c\u0005\""+
		"\u0000\u0000\u013c\u013e\u00038\u001c\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u013a\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u01433\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u00053\u0000\u0000\u0145\u0146\u00036\u001b\u0000\u0146\u0148"+
		"\u00054\u0000\u0000\u0147\u0149\u0005\"\u0000\u0000\u0148\u0147\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u01495\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u00057\u0000\u0000\u014b\u014c\u0005#\u0000\u0000"+
		"\u014c\u0156\u00038\u001c\u0000\u014d\u014e\u0005\"\u0000\u0000\u014e"+
		"\u014f\u00057\u0000\u0000\u014f\u0150\u0005#\u0000\u0000\u0150\u0152\u0003"+
		"8\u001c\u0000\u0151\u0153\u0005\"\u0000\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000"+
		"\u0000\u0000\u0154\u014d\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0159\u014a\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a7\u0001\u0000\u0000\u0000\u015b\u0164\u00059\u0000\u0000"+
		"\u015c\u0164\u00058\u0000\u0000\u015d\u0164\u0003\u0012\t\u0000\u015e"+
		"\u015f\u0005@\u0000\u0000\u015f\u0160\u00032\u0019\u0000\u0160\u0161\u0005"+
		"A\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0164\u00034\u001a"+
		"\u0000\u0163\u015b\u0001\u0000\u0000\u0000\u0163\u015c\u0001\u0000\u0000"+
		"\u0000\u0163\u015d\u0001\u0000\u0000\u0000\u0163\u015e\u0001\u0000\u0000"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u01649\u0001\u0000\u0000\u0000"+
		"\u0165\u016c\u00058\u0000\u0000\u0166\u016c\u00059\u0000\u0000\u0167\u016c"+
		"\u00057\u0000\u0000\u0168\u016c\u0003\u0012\t\u0000\u0169\u016c\u0003"+
		"<\u001e\u0000\u016a\u016c\u0003*\u0015\u0000\u016b\u0165\u0001\u0000\u0000"+
		"\u0000\u016b\u0166\u0001\u0000\u0000\u0000\u016b\u0167\u0001\u0000\u0000"+
		"\u0000\u016b\u0168\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c;\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u00057\u0000\u0000\u016e\u0172\u00051\u0000\u0000\u016f\u0171"+
		"\u0003>\u001f\u0000\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0174\u0001"+
		"\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u00052\u0000\u0000\u0176=\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0003:\u001d\u0000\u0178?\u0001\u0000\u0000\u0000\u0179"+
		"\u0180\u0003B!\u0000\u017a\u017c\u0005T\u0000\u0000\u017b\u017d\u0005"+
		"P\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u0180\u0003L&\u0000"+
		"\u017f\u0179\u0001\u0000\u0000\u0000\u017f\u017a\u0001\u0000\u0000\u0000"+
		"\u017f\u017e\u0001\u0000\u0000\u0000\u0180A\u0001\u0000\u0000\u0000\u0181"+
		"\u0185\u0003D\"\u0000\u0182\u0184\u0003@ \u0000\u0183\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0003F#\u0000"+
		"\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u018c\u0003H$\u0000\u018b\u0181"+
		"\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018cC\u0001"+
		"\u0000\u0000\u0000\u018d\u0191\u0005F\u0000\u0000\u018e\u0190\u0003J%"+
		"\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000"+
		"\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005H\u0000\u0000\u0195E\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0005G\u0000\u0000\u0197\u0198\u0005T\u0000\u0000\u0198\u0199\u0005"+
		"H\u0000\u0000\u0199G\u0001\u0000\u0000\u0000\u019a\u019e\u0005F\u0000"+
		"\u0000\u019b\u019d\u0003J%\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d"+
		"\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005I\u0000\u0000\u01a2I\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0005T\u0000\u0000\u01a4\u01a5\u0005J\u0000"+
		"\u0000\u01a5\u01b0\u0005K\u0000\u0000\u01a6\u01a7\u0005L\u0000\u0000\u01a7"+
		"\u01a8\u0005J\u0000\u0000\u01a8\u01b0\u0005K\u0000\u0000\u01a9\u01aa\u0005"+
		"M\u0000\u0000\u01aa\u01ab\u0005J\u0000\u0000\u01ab\u01b0\u0005K\u0000"+
		"\u0000\u01ac\u01ad\u0005N\u0000\u0000\u01ad\u01ae\u0005J\u0000\u0000\u01ae"+
		"\u01b0\u0005K\u0000\u0000\u01af\u01a3\u0001\u0000\u0000\u0000\u01af\u01a6"+
		"\u0001\u0000\u0000\u0000\u01af\u01a9\u0001\u0000\u0000\u0000\u01af\u01ac"+
		"\u0001\u0000\u0000\u0000\u01b0K\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005"+
		"Q\u0000\u0000\u01b2\u01b3\u0005T\u0000\u0000\u01b3\u01b4\u0005R\u0000"+
		"\u0000\u01b4M\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005X\u0000\u0000\u01b6"+
		"\u01b7\u0003P(\u0000\u01b7\u01b9\u0005X\u0000\u0000\u01b8\u01ba\u0005"+
		"Z\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000"+
		"\u0000\u0000\u01baO\u0001\u0000\u0000\u0000\u01bb\u01bd\u0003R)\u0000"+
		"\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bd\u01c4\u0001\u0000\u0000\u0000\u01be\u01c0\u0005Z\u0000\u0000\u01bf"+
		"\u01be\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c3\u0003R)\u0000\u01c2\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5Q\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01c9\u0005]\u0000"+
		"\u0000\u01c8\u01ca\u0005h\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0005_\u0000\u0000\u01ce\u01d0\u0003T*\u0000\u01cf\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005`\u0000\u0000\u01d4S\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0005h\u0000\u0000\u01d6\u01d7\u0005Y\u0000\u0000"+
		"\u01d7\u01d8\u0003V+\u0000\u01d8\u01d9\u0005^\u0000\u0000\u01d9U\u0001"+
		"\u0000\u0000\u0000\u01da\u01df\u0007\u0002\u0000\u0000\u01db\u01dd\u0005"+
		"h\u0000\u0000\u01dc\u01de\u0005h\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000"+
		"\u0000\u01df\u01db\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000"+
		"\u0000\u01e0W\u0001\u0000\u0000\u00002[coux\u007f\u008f\u009a\u009f\u00a8"+
		"\u00ac\u00b3\u00bb\u00c4\u00c7\u00c9\u00ce\u00d3\u00dc\u00f4\u00fc\u0103"+
		"\u010e\u0128\u012b\u0134\u013f\u0142\u0148\u0152\u0156\u0159\u0163\u016b"+
		"\u0172\u017c\u017f\u0185\u018b\u0191\u019e\u01af\u01b9\u01bc\u01bf\u01c4"+
		"\u01cb\u01d1\u01dd\u01df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}