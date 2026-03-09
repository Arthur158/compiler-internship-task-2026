error id: file://<WORKSPACE>/src/main/antlr/gen/MiniKotlinParser.java:_empty_/MiniKotlinParser#StatementContext#getRuleContext#
file://<WORKSPACE>/src/main/antlr/gen/MiniKotlinParser.java
empty definition using pc, found symbol in pc: _empty_/MiniKotlinParser#StatementContext#getRuleContext#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 16265
uri: file://<WORKSPACE>/src/main/antlr/gen/MiniKotlinParser.java
text:
```scala
// Generated from <WORKSPACE>/src/main/antlr/MiniKotlin.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiniKotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUN=1, VAR=2, IF=3, ELSE=4, WHILE=5, RETURN=6, INT_TYPE=7, STRING_TYPE=8, 
		BOOLEAN_TYPE=9, UNIT_TYPE=10, BOOLEAN_LITERAL=11, INTEGER_LITERAL=12, 
		STRING_LITERAL=13, PLUS=14, MINUS=15, MULT=16, DIV=17, MOD=18, ASSIGN=19, 
		EQ=20, NEQ=21, LT=22, GT=23, LE=24, GE=25, AND=26, OR=27, NOT=28, LPAREN=29, 
		RPAREN=30, LBRACE=31, RBRACE=32, COMMA=33, COLON=34, IDENTIFIER=35, WS=36, 
		LINE_COMMENT=37, BLOCK_COMMENT=38;
	public static final int
		RULE_program = 0, RULE_functionDeclaration = 1, RULE_parameterList = 2, 
		RULE_parameter = 3, RULE_type = 4, RULE_block = 5, RULE_statement = 6, 
		RULE_variableDeclaration = 7, RULE_variableAssignment = 8, RULE_ifStatement = 9, 
		RULE_whileStatement = 10, RULE_returnStatement = 11, RULE_expression = 12, 
		RULE_primary = 13, RULE_argumentList = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionDeclaration", "parameterList", "parameter", "type", 
			"block", "statement", "variableDeclaration", "variableAssignment", "ifStatement", 
			"whileStatement", "returnStatement", "expression", "primary", "argumentList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'var'", "'if'", "'else'", "'while'", "'return'", "'Int'", 
			"'String'", "'Boolean'", "'Unit'", null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'='", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&&'", 
			"'||'", "'!'", "'('", "')'", "'{'", "'}'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUN", "VAR", "IF", "ELSE", "WHILE", "RETURN", "INT_TYPE", "STRING_TYPE", 
			"BOOLEAN_TYPE", "UNIT_TYPE", "BOOLEAN_LITERAL", "INTEGER_LITERAL", "STRING_LITERAL", 
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "ASSIGN", "EQ", "NEQ", "LT", "GT", 
			"LE", "GE", "AND", "OR", "NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"COMMA", "COLON", "IDENTIFIER", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "MiniKotlin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniKotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniKotlinParser.EOF, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(30);
				functionDeclaration();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(MiniKotlinParser.FUN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniKotlinParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MiniKotlinParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MiniKotlinParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(MiniKotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@OverrideantlrparameterList
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(FUN);
			setState(39);
			match(IDENTIFIER);
			setState(40);
			match(LPAREN);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(41);
				parameterList();
				}
			}

			setState(44);
			match(RPAREN);
			setState(45);
			match(COLON);
			setState(46);
			type();
			setState(47);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniKotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniKotlinParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			parameter();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50);
				match(COMMA);
				setState(51);
				parameter();
				}
				}
				setState(56);
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
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniKotlinParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MiniKotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(IDENTIFIER);
			setState(58);
			match(COLON);
			setState(59);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(MiniKotlinParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(MiniKotlinParser.STRING_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(MiniKotlinParser.BOOLEAN_TYPE, 0); }
		public TerminalNode UNIT_TYPE() { return getToken(MiniKotlinParser.UNIT_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MiniKotlinParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MiniKotlinParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(LBRACE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35165059180L) != 0)) {
				{
				{
				setState(64);
				statement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
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
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRu@@leContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				variableAssignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				expression(0);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniKotlinParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MiniKotlinParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(MiniKotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniKotlinParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(VAR);
			setState(81);
			match(IDENTIFIER);
			setState(82);
			match(COLON);
			setState(83);
			type();
			setState(84);
			match(ASSIGN);
			setState(85);
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
	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniKotlinParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniKotlinParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENTIFIER);
			setState(88);
			match(ASSIGN);
			setState(89);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniKotlinParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(MiniKotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniKotlinParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniKotlinParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IF);
			setState(92);
			match(LPAREN);
			setState(93);
			expression(0);
			setState(94);
			match(RPAREN);
			setState(95);
			block();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(96);
				match(ELSE);
				setState(97);
				block();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniKotlinParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(MiniKotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniKotlinParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(WHILE);
			setState(101);
			match(LPAREN);
			setState(102);
			expression(0);
			setState(103);
			match(RPAREN);
			setState(104);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniKotlinParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(RETURN);
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(107);
				expression(0);
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
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiniKotlinParser.AND, 0); }
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExprContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniKotlinParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(MiniKotlinParser.LPAREN, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniKotlinParser.RPAREN, 0); }
		public FunctionCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterFunctionCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitFunctionCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(MiniKotlinParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(MiniKotlinParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniKotlinParser.MOD, 0); }
		public MulDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MiniKotlinParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MiniKotlinParser.NEQ, 0); }
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(MiniKotlinParser.LT, 0); }
		public TerminalNode GT() { return getToken(MiniKotlinParser.GT, 0); }
		public TerminalNode LE() { return getToken(MiniKotlinParser.LE, 0); }
		public TerminalNode GE() { return getToken(MiniKotlinParser.GE, 0); }
		public ComparisonExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(MiniKotlinParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MiniKotlinParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniKotlinParser.MINUS, 0); }
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(MiniKotlinParser.OR, 0); }
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitOrExpr(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(111);
				match(IDENTIFIER);
				setState(112);
				match(LPAREN);
				setState(113);
				argumentList();
				setState(114);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				primary();
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(NOT);
				setState(118);
				expression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(122);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(123);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(125);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(128);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(131);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(134);
						match(AND);
						setState(135);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(137);
						match(OR);
						setState(138);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(143);
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
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends PrimaryContext {
		public TerminalNode STRING_LITERAL() { return getToken(MiniKotlinParser.STRING_LITERAL, 0); }
		public StringLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLiteralContext extends PrimaryContext {
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MiniKotlinParser.BOOLEAN_LITERAL, 0); }
		public BoolLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExprContext extends PrimaryContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniKotlinParser.IDENTIFIER, 0); }
		public IdentifierExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends PrimaryContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(MiniKotlinParser.INTEGER_LITERAL, 0); }
		public IntLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends PrimaryContext {
		public TerminalNode LPAREN() { return getToken(MiniKotlinParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MiniKotlinParser.RPAREN, 0); }
		public ParenExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primary);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(LPAREN);
				setState(145);
				expression(0);
				setState(146);
				match(RPAREN);
				}
				break;
			case INTEGER_LITERAL:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(INTEGER_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(STRING_LITERAL);
				}
				break;
			case BOOLEAN_LITERAL:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(BOOLEAN_LITERAL);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				match(IDENTIFIER);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniKotlinParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniKotlinParser.COMMA, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniKotlinListener ) ((MiniKotlinListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniKotlinVisitor ) return ((MiniKotlinVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			expression(0);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				expression(0);
				}
				}
				setState(161);
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
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u00028\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0005\u0005B\b\u0005\n\u0005\f\u0005E\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006O\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tc\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000bm\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\fx\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u008c\b\f\n\f\f\f\u008f"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0099\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u009e\b\u000e"+
		"\n\u000e\f\u000e\u00a1\t\u000e\u0001\u000e\u0000\u0001\u0018\u000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u0000\u0005\u0001\u0000\u0007\n\u0001\u0000\u0010\u0012\u0001\u0000\u000e"+
		"\u000f\u0001\u0000\u0016\u0019\u0001\u0000\u0014\u0015\u00ab\u0000!\u0001"+
		"\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u00041\u0001\u0000\u0000"+
		"\u0000\u00069\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\n?\u0001"+
		"\u0000\u0000\u0000\fN\u0001\u0000\u0000\u0000\u000eP\u0001\u0000\u0000"+
		"\u0000\u0010W\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014"+
		"d\u0001\u0000\u0000\u0000\u0016j\u0001\u0000\u0000\u0000\u0018w\u0001"+
		"\u0000\u0000\u0000\u001a\u0098\u0001\u0000\u0000\u0000\u001c\u009a\u0001"+
		"\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&\'\u0005"+
		"\u0001\u0000\u0000\'(\u0005#\u0000\u0000(*\u0005\u001d\u0000\u0000)+\u0003"+
		"\u0004\u0002\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,-\u0005\u001e\u0000\u0000-.\u0005\"\u0000\u0000"+
		"./\u0003\b\u0004\u0000/0\u0003\n\u0005\u00000\u0003\u0001\u0000\u0000"+
		"\u000016\u0003\u0006\u0003\u000023\u0005!\u0000\u000035\u0003\u0006\u0003"+
		"\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u00007\u0005\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u00009:\u0005#\u0000\u0000:;\u0005\"\u0000\u0000"+
		";<\u0003\b\u0004\u0000<\u0007\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000"+
		"\u0000>\t\u0001\u0000\u0000\u0000?C\u0005\u001f\u0000\u0000@B\u0003\f"+
		"\u0006\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000FG\u0005 \u0000\u0000G\u000b\u0001\u0000\u0000"+
		"\u0000HO\u0003\u000e\u0007\u0000IO\u0003\u0012\t\u0000JO\u0003\u0014\n"+
		"\u0000KO\u0003\u0010\b\u0000LO\u0003\u0016\u000b\u0000MO\u0003\u0018\f"+
		"\u0000NH\u0001\u0000\u0000\u0000NI\u0001\u0000\u0000\u0000NJ\u0001\u0000"+
		"\u0000\u0000NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001"+
		"\u0000\u0000\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005\u0002\u0000\u0000"+
		"QR\u0005#\u0000\u0000RS\u0005\"\u0000\u0000ST\u0003\b\u0004\u0000TU\u0005"+
		"\u0013\u0000\u0000UV\u0003\u0018\f\u0000V\u000f\u0001\u0000\u0000\u0000"+
		"WX\u0005#\u0000\u0000XY\u0005\u0013\u0000\u0000YZ\u0003\u0018\f\u0000"+
		"Z\u0011\u0001\u0000\u0000\u0000[\\\u0005\u0003\u0000\u0000\\]\u0005\u001d"+
		"\u0000\u0000]^\u0003\u0018\f\u0000^_\u0005\u001e\u0000\u0000_b\u0003\n"+
		"\u0005\u0000`a\u0005\u0004\u0000\u0000ac\u0003\n\u0005\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0013\u0001\u0000\u0000\u0000"+
		"de\u0005\u0005\u0000\u0000ef\u0005\u001d\u0000\u0000fg\u0003\u0018\f\u0000"+
		"gh\u0005\u001e\u0000\u0000hi\u0003\n\u0005\u0000i\u0015\u0001\u0000\u0000"+
		"\u0000jl\u0005\u0006\u0000\u0000km\u0003\u0018\f\u0000lk\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u0017\u0001\u0000\u0000\u0000no\u0006"+
		"\f\uffff\uffff\u0000op\u0005#\u0000\u0000pq\u0005\u001d\u0000\u0000qr"+
		"\u0003\u001c\u000e\u0000rs\u0005\u001e\u0000\u0000sx\u0001\u0000\u0000"+
		"\u0000tx\u0003\u001a\r\u0000uv\u0005\u001c\u0000\u0000vx\u0003\u0018\f"+
		"\u0007wn\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000x\u008d\u0001\u0000\u0000\u0000yz\n\u0006\u0000\u0000z{\u0007"+
		"\u0001\u0000\u0000{\u008c\u0003\u0018\f\u0007|}\n\u0005\u0000\u0000}~"+
		"\u0007\u0002\u0000\u0000~\u008c\u0003\u0018\f\u0006\u007f\u0080\n\u0004"+
		"\u0000\u0000\u0080\u0081\u0007\u0003\u0000\u0000\u0081\u008c\u0003\u0018"+
		"\f\u0005\u0082\u0083\n\u0003\u0000\u0000\u0083\u0084\u0007\u0004\u0000"+
		"\u0000\u0084\u008c\u0003\u0018\f\u0004\u0085\u0086\n\u0002\u0000\u0000"+
		"\u0086\u0087\u0005\u001a\u0000\u0000\u0087\u008c\u0003\u0018\f\u0003\u0088"+
		"\u0089\n\u0001\u0000\u0000\u0089\u008a\u0005\u001b\u0000\u0000\u008a\u008c"+
		"\u0003\u0018\f\u0002\u008by\u0001\u0000\u0000\u0000\u008b|\u0001\u0000"+
		"\u0000\u0000\u008b\u007f\u0001\u0000\u0000\u0000\u008b\u0082\u0001\u0000"+
		"\u0000\u0000\u008b\u0085\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000"+
		"\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0019\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u001d"+
		"\u0000\u0000\u0091\u0092\u0003\u0018\f\u0000\u0092\u0093\u0005\u001e\u0000"+
		"\u0000\u0093\u0099\u0001\u0000\u0000\u0000\u0094\u0099\u0005\f\u0000\u0000"+
		"\u0095\u0099\u0005\r\u0000\u0000\u0096\u0099\u0005\u000b\u0000\u0000\u0097"+
		"\u0099\u0005#\u0000\u0000\u0098\u0090\u0001\u0000\u0000\u0000\u0098\u0094"+
		"\u0001\u0000\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u001b"+
		"\u0001\u0000\u0000\u0000\u009a\u009f\u0003\u0018\f\u0000\u009b\u009c\u0005"+
		"!\u0000\u0000\u009c\u009e\u0003\u0018\f\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u001d\u0001\u0000"+
		"\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\f!*6CNblw\u008b\u008d"+
		"\u0098\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/MiniKotlinParser#StatementContext#getRuleContext#