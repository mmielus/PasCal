// Generated from C:/Users/user/Desktop/PasCal\Pascal.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, BOOLEAN=4, CASE=5, CHAR=6, CHR=7, CONST=8, DIV=9, 
		DO=10, DOWNTO=11, EXIT=12, ELSE=13, END=14, FOR=15, FUNCTION=16, IF=17, 
		IN=18, INTEGER=19, MOD=20, NIL=21, NOT=22, OF=23, OR=24, PROCEDURE=25, 
		PROGRAM=26, REPEAT=27, REAL=28, RECORD=29, THEN=30, TYPE=31, TO=32, UNTIL=33, 
		VAR=34, WHILE=35, STRING=36, ASSIGN=37, COMMA=38, COLON=39, DOT=40, DOTDOT=41, 
		EQUAL=42, LT=43, LE=44, PLUS=45, MINUS=46, NOT_EQUAL=47, POINTER=48, RBRACK=49, 
		STAR=50, SLASH=51, SEMI=52, GE=53, GT=54, LPAREN=55, RPAREN=56, LBRACK=57, 
		LCURLY=58, RCURLY=59, WS=60, COMMENT_1=61, COMMENT_2=62, IDENT=63, STRING_LITERAL=64, 
		NUM_INT=65, NUM_REAL=66;
	public static final int
		RULE_program = 0, RULE_programHead = 1, RULE_identifier = 2, RULE_block = 3, 
		RULE_declarationsAndDefinitions = 4, RULE_constantDefinitionPart = 5, 
		RULE_constantDefinition = 6, RULE_constant = 7, RULE_unsignedNumber = 8, 
		RULE_unsignedInteger = 9, RULE_unsignedReal = 10, RULE_string = 11, RULE_sign = 12, 
		RULE_typeDefinitionPart = 13, RULE_typeDefinition = 14, RULE_typedefBody = 15, 
		RULE_type = 16, RULE_simpleType = 17, RULE_subrangeType = 18, RULE_typeIdentifier = 19, 
		RULE_standardType = 20, RULE_unpackedStructuredType = 21, RULE_arrayType = 22, 
		RULE_recordType = 23, RULE_fixedPart = 24, RULE_recordSection = 25, RULE_pointerType = 26, 
		RULE_variableDeclarationPart = 27, RULE_variableDeclaration = 28, RULE_procedureAndFunctionDeclarationPart = 29, 
		RULE_procedureOrFunctionDeclaration = 30, RULE_procedureDeclaration = 31, 
		RULE_blockOrDirective = 32, RULE_functionDeclaration = 33, RULE_formalParameterList = 34, 
		RULE_formalParameterSection = 35, RULE_parameter = 36, RULE_varParameter = 37, 
		RULE_identifierList = 38, RULE_resultType = 39, RULE_statement = 40, RULE_unlabelledStatement = 41, 
		RULE_exitStatement = 42, RULE_simpleStatement = 43, RULE_assignmentStatement = 44, 
		RULE_variable = 45, RULE_variableExtension = 46, RULE_dotIdentifier = 47, 
		RULE_compoundExpression = 48, RULE_moreExpressions = 49, RULE_expression = 50, 
		RULE_operator = 51, RULE_simpleExpression = 52, RULE_simpleExpressionOperator = 53, 
		RULE_term = 54, RULE_operators = 55, RULE_signedFactor = 56, RULE_factor = 57, 
		RULE_unsignedConstant = 58, RULE_functionDesignator = 59, RULE_parameterList = 60, 
		RULE_elementList = 61, RULE_element = 62, RULE_procedureStatement = 63, 
		RULE_actualParameter = 64, RULE_emptyStatement = 65, RULE_empty = 66, 
		RULE_structuredStatement = 67, RULE_compoundStatement = 68, RULE_statements = 69, 
		RULE_conditionalStatement = 70, RULE_ifStatement = 71, RULE_caseStatement = 72, 
		RULE_caseListElement = 73, RULE_loopStatement = 74, RULE_whileStatement = 75, 
		RULE_forStatement = 76, RULE_forList = 77, RULE_initialValue = 78, RULE_finalValue = 79;
	public static final String[] ruleNames = {
		"program", "programHead", "identifier", "block", "declarationsAndDefinitions", 
		"constantDefinitionPart", "constantDefinition", "constant", "unsignedNumber", 
		"unsignedInteger", "unsignedReal", "string", "sign", "typeDefinitionPart", 
		"typeDefinition", "typedefBody", "type", "simpleType", "subrangeType", 
		"typeIdentifier", "standardType", "unpackedStructuredType", "arrayType", 
		"recordType", "fixedPart", "recordSection", "pointerType", "variableDeclarationPart", 
		"variableDeclaration", "procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
		"procedureDeclaration", "blockOrDirective", "functionDeclaration", "formalParameterList", 
		"formalParameterSection", "parameter", "varParameter", "identifierList", 
		"resultType", "statement", "unlabelledStatement", "exitStatement", "simpleStatement", 
		"assignmentStatement", "variable", "variableExtension", "dotIdentifier", 
		"compoundExpression", "moreExpressions", "expression", "operator", "simpleExpression", 
		"simpleExpressionOperator", "term", "operators", "signedFactor", "factor", 
		"unsignedConstant", "functionDesignator", "parameterList", "elementList", 
		"element", "procedureStatement", "actualParameter", "emptyStatement", 
		"empty", "structuredStatement", "compoundStatement", "statements", "conditionalStatement", 
		"ifStatement", "caseStatement", "caseListElement", "loopStatement", "whileStatement", 
		"forStatement", "forList", "initialValue", "finalValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'array'", "'begin'", "'boolean'", "'case'", "'char'", 
		"'chr'", "'const'", "'div'", "'do'", "'downto'", "'exit'", "'else'", "'end'", 
		"'for'", "'function'", "'if'", "'in'", "'integer'", "'mod'", "'nil'", 
		"'not'", "'of'", "'or'", "'procedure'", "'program'", "'repeat'", "'real'", 
		"'record'", "'then'", "'type'", "'to'", "'until'", "'var'", "'while'", 
		"'string'", "':='", "','", "':'", "'.'", "'..'", "'='", "'<'", "'<='", 
		"'+'", "'-'", "'<>'", "'^'", "']'", "'*'", "'/'", "';'", "'>='", "'>'", 
		"'('", "')'", "'['", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", 
		"DIV", "DO", "DOWNTO", "EXIT", "ELSE", "END", "FOR", "FUNCTION", "IF", 
		"IN", "INTEGER", "MOD", "NIL", "NOT", "OF", "OR", "PROCEDURE", "PROGRAM", 
		"REPEAT", "REAL", "RECORD", "THEN", "TYPE", "TO", "UNTIL", "VAR", "WHILE", 
		"STRING", "ASSIGN", "COMMA", "COLON", "DOT", "DOTDOT", "EQUAL", "LT", 
		"LE", "PLUS", "MINUS", "NOT_EQUAL", "POINTER", "RBRACK", "STAR", "SLASH", 
		"SEMI", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LCURLY", "RCURLY", 
		"WS", "COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", 
		"NUM_REAL"
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
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeadContext programHead() {
			return getRuleContext(ProgramHeadContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PascalParser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			programHead();
			setState(161);
			block();
			setState(162);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramHeadContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(PascalParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ProgramHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHead; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProgramHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeadContext programHead() throws RecognitionException {
		ProgramHeadContext _localctx = new ProgramHeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(PROGRAM);
			setState(165);
			identifier();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(166);
				match(LPAREN);
				setState(167);
				identifierList();
				setState(168);
				match(RPAREN);
				}
			}

			setState(172);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<DeclarationsAndDefinitionsContext> declarationsAndDefinitions() {
			return getRuleContexts(DeclarationsAndDefinitionsContext.class);
		}
		public DeclarationsAndDefinitionsContext declarationsAndDefinitions(int i) {
			return getRuleContext(DeclarationsAndDefinitionsContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << FUNCTION) | (1L << PROCEDURE) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				{
				setState(176);
				declarationsAndDefinitions();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsAndDefinitionsContext extends ParserRuleContext {
		public ConstantDefinitionPartContext constantDefinitionPart() {
			return getRuleContext(ConstantDefinitionPartContext.class,0);
		}
		public TypeDefinitionPartContext typeDefinitionPart() {
			return getRuleContext(TypeDefinitionPartContext.class,0);
		}
		public VariableDeclarationPartContext variableDeclarationPart() {
			return getRuleContext(VariableDeclarationPartContext.class,0);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,0);
		}
		public DeclarationsAndDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationsAndDefinitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitDeclarationsAndDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsAndDefinitionsContext declarationsAndDefinitions() throws RecognitionException {
		DeclarationsAndDefinitionsContext _localctx = new DeclarationsAndDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationsAndDefinitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				{
				setState(184);
				constantDefinitionPart();
				}
				break;
			case TYPE:
				{
				setState(185);
				typeDefinitionPart();
				}
				break;
			case VAR:
				{
				setState(186);
				variableDeclarationPart();
				}
				break;
			case FUNCTION:
			case PROCEDURE:
				{
				setState(187);
				procedureAndFunctionDeclarationPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PascalParser.CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitConstantDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constantDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CONST);
			setState(191);
			constantDefinition();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(192);
					match(SEMI);
					setState(193);
					constantDefinition();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(199);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitConstantDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			identifier();
			setState(202);
			match(EQUAL);
			setState(203);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public SignContext s;
		public UnsignedNumberContext n;
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				unsignedNumber();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				((ConstantContext)_localctx).s = sign();
				setState(207);
				((ConstantContext)_localctx).n = unsignedNumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				string();
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

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unsignedNumber);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				unsignedReal();
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

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(PascalParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitUnsignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(PascalParser.NUM_REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitUnsignedReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(NUM_REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PascalParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class TypeDefinitionPartContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(PascalParser.TYPE, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public TypeDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitTypeDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typeDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(TYPE);
			setState(225);
			typeDefinition();
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					match(SEMI);
					setState(227);
					typeDefinition();
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(233);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public Token e;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypedefBodyContext typedefBody() {
			return getRuleContext(TypedefBodyContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			identifier();
			setState(236);
			((TypeDefinitionContext)_localctx).e = match(EQUAL);
			setState(237);
			typedefBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefBodyContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedefBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitTypedefBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefBodyContext typedefBody() throws RecognitionException {
		TypedefBodyContext _localctx = new TypedefBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typedefBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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

	public static class TypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public UnpackedStructuredTypeContext unpackedStructuredType() {
			return getRuleContext(UnpackedStructuredTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
			case STRING:
			case PLUS:
			case MINUS:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				simpleType();
				}
				break;
			case ARRAY:
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				unpackedStructuredType();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				pointerType();
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simpleType);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				subrangeType();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
			case STRING:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				typeIdentifier();
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

	public static class SubrangeTypeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(PascalParser.DOTDOT, 0); }
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSubrangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			constant();
			setState(251);
			match(DOTDOT);
			setState(252);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StandardTypeContext standardType() {
			return getRuleContext(StandardTypeContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeIdentifier);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				identifier();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				standardType();
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

	public static class StandardTypeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(PascalParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascalParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PascalParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(PascalParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(PascalParser.STRING, 0); }
		public StandardTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitStandardType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardTypeContext standardType() throws RecognitionException {
		StandardTypeContext _localctx = new StandardTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_standardType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0)) ) {
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

	public static class UnpackedStructuredTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public UnpackedStructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedStructuredType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitUnpackedStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpackedStructuredTypeContext unpackedStructuredType() throws RecognitionException {
		UnpackedStructuredTypeContext _localctx = new UnpackedStructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unpackedStructuredType);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				recordType();
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PascalParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(PascalParser.LBRACK, 0); }
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PascalParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ARRAY);
			setState(265);
			match(LBRACK);
			setState(266);
			subrangeType();
			setState(267);
			match(RBRACK);
			setState(268);
			match(OF);
			setState(269);
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

	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(PascalParser.RECORD, 0); }
		public FixedPartContext fixedPart() {
			return getRuleContext(FixedPartContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_recordType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(RECORD);
			setState(272);
			fixedPart();
			setState(273);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedPartContext extends ParserRuleContext {
		public List<RecordSectionContext> recordSection() {
			return getRuleContexts(RecordSectionContext.class);
		}
		public RecordSectionContext recordSection(int i) {
			return getRuleContext(RecordSectionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public FixedPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFixedPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fixedPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			recordSection();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(276);
				match(SEMI);
				setState(277);
				recordSection();
				}
				}
				setState(282);
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

	public static class RecordSectionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitRecordSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			identifierList();
			setState(284);
			match(COLON);
			setState(285);
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

	public static class PointerTypeContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(PascalParser.POINTER, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(POINTER);
			setState(288);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVariableDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(VAR);
			setState(291);
			variableDeclaration();
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					match(SEMI);
					setState(293);
					variableDeclaration();
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(299);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public Token c;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			identifierList();
			setState(302);
			((VariableDeclarationContext)_localctx).c = match(COLON);
			setState(303);
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

	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProcedureAndFunctionDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			procedureOrFunctionDeclaration();
			setState(306);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureOrFunctionDeclarationContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOrFunctionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProcedureOrFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_procedureOrFunctionDeclaration);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				functionDeclaration();
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

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public BlockOrDirectiveContext body;
		public TerminalNode PROCEDURE() { return getToken(PascalParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public BlockOrDirectiveContext blockOrDirective() {
			return getRuleContext(BlockOrDirectiveContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(PROCEDURE);
			setState(313);
			identifier();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(314);
				formalParameterList();
				}
			}

			setState(317);
			match(SEMI);
			setState(318);
			((ProcedureDeclarationContext)_localctx).body = blockOrDirective();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockOrDirectiveContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockOrDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOrDirective; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitBlockOrDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockOrDirectiveContext blockOrDirective() throws RecognitionException {
		BlockOrDirectiveContext _localctx = new BlockOrDirectiveContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_blockOrDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public BlockOrDirectiveContext body;
		public TerminalNode FUNCTION() { return getToken(PascalParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public BlockOrDirectiveContext blockOrDirective() {
			return getRuleContext(BlockOrDirectiveContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(FUNCTION);
			setState(323);
			identifier();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(324);
				formalParameterList();
				}
			}

			setState(327);
			match(COLON);
			setState(328);
			resultType();
			setState(329);
			match(SEMI);
			setState(330);
			((FunctionDeclarationContext)_localctx).body = blockOrDirective();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LPAREN);
			setState(333);
			formalParameterSection();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(334);
				match(SEMI);
				setState(335);
				formalParameterSection();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
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

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public VarParameterContext varParameter() {
			return getRuleContext(VarParameterContext.class,0);
		}
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFormalParameterSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_formalParameterSection);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				parameter();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				varParameter();
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeIdentifierContext t;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			identifier();
			setState(348);
			match(COLON);
			setState(349);
			((ParameterContext)_localctx).t = typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarParameterContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public VarParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVarParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarParameterContext varParameter() throws RecognitionException {
		VarParameterContext _localctx = new VarParameterContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_varParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(VAR);
			setState(352);
			parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			identifier();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(355);
				match(COMMA);
				setState(356);
				identifier();
				}
				}
				setState(361);
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			unlabelledStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitUnlabelledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unlabelledStatement);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXIT:
			case ELSE:
			case END:
			case SEMI:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				simpleStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case FOR:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				structuredStatement();
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

	public static class ExitStatementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(PascalParser.EXIT, 0); }
		public ExitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitExitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitStatementContext exitStatement() throws RecognitionException {
		ExitStatementContext _localctx = new ExitStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(EXIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public ExitStatementContext exitStatement() {
			return getRuleContext(ExitStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_simpleStatement);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				exitStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375);
				emptyStatement();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			variable();
			setState(379);
			match(ASSIGN);
			setState(380);
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

	public static class VariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableExtensionContext> variableExtension() {
			return getRuleContexts(VariableExtensionContext.class);
		}
		public VariableExtensionContext variableExtension(int i) {
			return getRuleContext(VariableExtensionContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			identifier();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << POINTER) | (1L << LBRACK))) != 0)) {
				{
				{
				setState(383);
				variableExtension();
				}
				}
				setState(388);
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

	public static class VariableExtensionContext extends ParserRuleContext {
		public CompoundExpressionContext compoundExpression() {
			return getRuleContext(CompoundExpressionContext.class,0);
		}
		public DotIdentifierContext dotIdentifier() {
			return getRuleContext(DotIdentifierContext.class,0);
		}
		public TerminalNode POINTER() { return getToken(PascalParser.POINTER, 0); }
		public VariableExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExtension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVariableExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExtensionContext variableExtension() throws RecognitionException {
		VariableExtensionContext _localctx = new VariableExtensionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_variableExtension);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				compoundExpression();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				dotIdentifier();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(POINTER);
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

	public static class DotIdentifierContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PascalParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DotIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotIdentifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitDotIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotIdentifierContext dotIdentifier() throws RecognitionException {
		DotIdentifierContext _localctx = new DotIdentifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dotIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(DOT);
			setState(395);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PascalParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MoreExpressionsContext moreExpressions() {
			return getRuleContext(MoreExpressionsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PascalParser.RBRACK, 0); }
		public CompoundExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitCompoundExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundExpressionContext compoundExpression() throws RecognitionException {
		CompoundExpressionContext _localctx = new CompoundExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_compoundExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(LBRACK);
			setState(398);
			expression();
			setState(399);
			moreExpressions();
			setState(400);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoreExpressionsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MoreExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreExpressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitMoreExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreExpressionsContext moreExpressions() throws RecognitionException {
		MoreExpressionsContext _localctx = new MoreExpressionsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_moreExpressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(402);
				match(COMMA);
				setState(403);
				expression();
				}
				}
				setState(408);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			simpleExpression();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EQUAL) | (1L << LT) | (1L << LE) | (1L << NOT_EQUAL) | (1L << GE) | (1L << GT))) != 0)) {
				{
				{
				setState(410);
				operator();
				setState(411);
				simpleExpression();
				}
				}
				setState(417);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PascalParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(PascalParser.LT, 0); }
		public TerminalNode LE() { return getToken(PascalParser.LE, 0); }
		public TerminalNode GE() { return getToken(PascalParser.GE, 0); }
		public TerminalNode GT() { return getToken(PascalParser.GT, 0); }
		public TerminalNode IN() { return getToken(PascalParser.IN, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EQUAL) | (1L << LT) | (1L << LE) | (1L << NOT_EQUAL) | (1L << GE) | (1L << GT))) != 0)) ) {
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<SimpleExpressionOperatorContext> simpleExpressionOperator() {
			return getRuleContexts(SimpleExpressionOperatorContext.class);
		}
		public SimpleExpressionOperatorContext simpleExpressionOperator(int i) {
			return getRuleContext(SimpleExpressionOperatorContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			term();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(421);
				simpleExpressionOperator();
				setState(422);
				term();
				}
				}
				setState(428);
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

	public static class SimpleExpressionOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(PascalParser.OR, 0); }
		public SimpleExpressionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpressionOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSimpleExpressionOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionOperatorContext simpleExpressionOperator() throws RecognitionException {
		SimpleExpressionOperatorContext _localctx = new SimpleExpressionOperatorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_simpleExpressionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public List<SignedFactorContext> signedFactor() {
			return getRuleContexts(SignedFactorContext.class);
		}
		public SignedFactorContext signedFactor(int i) {
			return getRuleContext(SignedFactorContext.class,i);
		}
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			signedFactor();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				{
				setState(432);
				operators();
				setState(433);
				signedFactor();
				}
				}
				setState(439);
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

	public static class OperatorsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PascalParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PascalParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(PascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PascalParser.MOD, 0); }
		public TerminalNode AND() { return getToken(PascalParser.AND, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitOperators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
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

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSignedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(442);
				sign();
				}
			}

			setState(445);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_factor);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(LPAREN);
				setState(449);
				expression();
				setState(450);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				match(NOT);
				setState(455);
				factor();
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

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NIL() { return getToken(PascalParser.NIL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unsignedConstant);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				unsignedNumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				match(NIL);
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

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public IdentifierContext id;
		public ParameterListContext args;
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFunctionDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			((FunctionDesignatorContext)_localctx).id = identifier();
			setState(464);
			match(LPAREN);
			setState(465);
			((FunctionDesignatorContext)_localctx).args = parameterList();
			setState(466);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			actualParameter();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(469);
				match(COMMA);
				setState(470);
				actualParameter();
				}
				}
				setState(475);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_elementList);
		int _la;
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NIL:
			case NOT:
			case PLUS:
			case MINUS:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				element();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(477);
					match(COMMA);
					setState(478);
					element();
					}
					}
					setState(483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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

	public static class ProcedureStatementContext extends ParserRuleContext {
		public IdentifierContext id;
		public ParameterListContext args;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			((ProcedureStatementContext)_localctx).id = identifier();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(490);
				match(LPAREN);
				setState(491);
				((ProcedureStatementContext)_localctx).args = parameterList();
				setState(492);
				match(RPAREN);
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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_actualParameter);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(498);
				emptyStatement();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitStructuredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_structuredStatement);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				conditionalStatement();
				}
				break;
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				loopStatement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(BEGIN);
			setState(511);
			statements();
			setState(512);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			statement();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(515);
				match(SEMI);
				setState(516);
				statement();
				}
				}
				setState(521);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_conditionalStatement);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				caseStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(IF);
			setState(527);
			expression();
			setState(528);
			match(THEN);
			setState(529);
			statement();
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(530);
				match(ELSE);
				setState(531);
				statement();
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(PascalParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(CASE);
			setState(535);
			expression();
			setState(536);
			match(OF);
			setState(537);
			caseListElement();
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(538);
					match(SEMI);
					setState(539);
					caseListElement();
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(545);
				match(SEMI);
				}
			}

			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(548);
				match(ELSE);
				setState(549);
				statements();
				}
			}

			setState(552);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseListElementContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitCaseListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			constant();
			setState(555);
			match(COLON);
			setState(556);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_loopStatement);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				forStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(WHILE);
			setState(563);
			expression();
			setState(564);
			match(DO);
			setState(565);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PascalParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(FOR);
			setState(568);
			identifier();
			setState(569);
			match(ASSIGN);
			setState(570);
			forList();
			setState(571);
			match(DO);
			setState(572);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForListContext extends ParserRuleContext {
		public Token rel;
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(PascalParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(PascalParser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			initialValue();
			setState(575);
			((ForListContext)_localctx).rel = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
				((ForListContext)_localctx).rel = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(576);
			finalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
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

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u0249\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u00ad\n\3\3\3\3\3\3\4\3\4\3\5\7\5\u00b4\n\5"+
		"\f\5\16\5\u00b7\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u00bf\n\6\3\7\3\7\3\7"+
		"\3\7\7\7\u00c5\n\7\f\7\16\7\u00c8\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00d5\n\t\3\n\3\n\5\n\u00d9\n\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00e7\n\17\f\17\16\17\u00ea\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u00f7"+
		"\n\22\3\23\3\23\5\23\u00fb\n\23\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0103"+
		"\n\25\3\26\3\26\3\27\3\27\5\27\u0109\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u0119\n\32\f\32\16\32\u011c"+
		"\13\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u0129"+
		"\n\35\f\35\16\35\u012c\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \5 \u0139\n \3!\3!\3!\5!\u013e\n!\3!\3!\3!\3\"\3\"\3#\3#\3#\5"+
		"#\u0148\n#\3#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u0153\n$\f$\16$\u0156\13$\3$"+
		"\3$\3%\3%\5%\u015c\n%\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\7(\u0168\n(\f("+
		"\16(\u016b\13(\3)\3)\3*\3*\3+\3+\5+\u0173\n+\3,\3,\3-\3-\3-\3-\5-\u017b"+
		"\n-\3.\3.\3.\3.\3/\3/\7/\u0183\n/\f/\16/\u0186\13/\3\60\3\60\3\60\5\60"+
		"\u018b\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u0197"+
		"\n\63\f\63\16\63\u019a\13\63\3\64\3\64\3\64\3\64\7\64\u01a0\n\64\f\64"+
		"\16\64\u01a3\13\64\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u01ab\n\66\f\66"+
		"\16\66\u01ae\13\66\3\67\3\67\38\38\38\38\78\u01b6\n8\f8\168\u01b9\138"+
		"\39\39\3:\5:\u01be\n:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u01cb\n;\3<"+
		"\3<\3<\5<\u01d0\n<\3=\3=\3=\3=\3=\3>\3>\3>\7>\u01da\n>\f>\16>\u01dd\13"+
		">\3?\3?\3?\7?\u01e2\n?\f?\16?\u01e5\13?\3?\5?\u01e8\n?\3@\3@\3A\3A\3A"+
		"\3A\3A\5A\u01f1\nA\3B\3B\3B\5B\u01f6\nB\3C\3C\3D\3D\3E\3E\3E\5E\u01ff"+
		"\nE\3F\3F\3F\3F\3G\3G\3G\7G\u0208\nG\fG\16G\u020b\13G\3H\3H\5H\u020f\n"+
		"H\3I\3I\3I\3I\3I\3I\5I\u0217\nI\3J\3J\3J\3J\3J\3J\7J\u021f\nJ\fJ\16J\u0222"+
		"\13J\3J\5J\u0225\nJ\3J\3J\5J\u0229\nJ\3J\3J\3K\3K\3K\3K\3L\3L\5L\u0233"+
		"\nL\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3Q\3Q\3Q\2\2"+
		"R\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\2\b\3\2/"+
		"\60\7\2\6\6\b\b\25\25\36\36&&\6\2\24\24,.\61\61\678\4\2\32\32/\60\6\2"+
		"\3\3\13\13\26\26\64\65\4\2\r\r\"\"\2\u0230\2\u00a2\3\2\2\2\4\u00a6\3\2"+
		"\2\2\6\u00b0\3\2\2\2\b\u00b5\3\2\2\2\n\u00be\3\2\2\2\f\u00c0\3\2\2\2\16"+
		"\u00cb\3\2\2\2\20\u00d4\3\2\2\2\22\u00d8\3\2\2\2\24\u00da\3\2\2\2\26\u00dc"+
		"\3\2\2\2\30\u00de\3\2\2\2\32\u00e0\3\2\2\2\34\u00e2\3\2\2\2\36\u00ed\3"+
		"\2\2\2 \u00f1\3\2\2\2\"\u00f6\3\2\2\2$\u00fa\3\2\2\2&\u00fc\3\2\2\2(\u0102"+
		"\3\2\2\2*\u0104\3\2\2\2,\u0108\3\2\2\2.\u010a\3\2\2\2\60\u0111\3\2\2\2"+
		"\62\u0115\3\2\2\2\64\u011d\3\2\2\2\66\u0121\3\2\2\28\u0124\3\2\2\2:\u012f"+
		"\3\2\2\2<\u0133\3\2\2\2>\u0138\3\2\2\2@\u013a\3\2\2\2B\u0142\3\2\2\2D"+
		"\u0144\3\2\2\2F\u014e\3\2\2\2H\u015b\3\2\2\2J\u015d\3\2\2\2L\u0161\3\2"+
		"\2\2N\u0164\3\2\2\2P\u016c\3\2\2\2R\u016e\3\2\2\2T\u0172\3\2\2\2V\u0174"+
		"\3\2\2\2X\u017a\3\2\2\2Z\u017c\3\2\2\2\\\u0180\3\2\2\2^\u018a\3\2\2\2"+
		"`\u018c\3\2\2\2b\u018f\3\2\2\2d\u0198\3\2\2\2f\u019b\3\2\2\2h\u01a4\3"+
		"\2\2\2j\u01a6\3\2\2\2l\u01af\3\2\2\2n\u01b1\3\2\2\2p\u01ba\3\2\2\2r\u01bd"+
		"\3\2\2\2t\u01ca\3\2\2\2v\u01cf\3\2\2\2x\u01d1\3\2\2\2z\u01d6\3\2\2\2|"+
		"\u01e7\3\2\2\2~\u01e9\3\2\2\2\u0080\u01eb\3\2\2\2\u0082\u01f5\3\2\2\2"+
		"\u0084\u01f7\3\2\2\2\u0086\u01f9\3\2\2\2\u0088\u01fe\3\2\2\2\u008a\u0200"+
		"\3\2\2\2\u008c\u0204\3\2\2\2\u008e\u020e\3\2\2\2\u0090\u0210\3\2\2\2\u0092"+
		"\u0218\3\2\2\2\u0094\u022c\3\2\2\2\u0096\u0232\3\2\2\2\u0098\u0234\3\2"+
		"\2\2\u009a\u0239\3\2\2\2\u009c\u0240\3\2\2\2\u009e\u0244\3\2\2\2\u00a0"+
		"\u0246\3\2\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4\5\b\5\2\u00a4\u00a5\7*"+
		"\2\2\u00a5\3\3\2\2\2\u00a6\u00a7\7\34\2\2\u00a7\u00ac\5\6\4\2\u00a8\u00a9"+
		"\79\2\2\u00a9\u00aa\5N(\2\u00aa\u00ab\7:\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\66"+
		"\2\2\u00af\5\3\2\2\2\u00b0\u00b1\7A\2\2\u00b1\7\3\2\2\2\u00b2\u00b4\5"+
		"\n\6\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\5\u008a"+
		"F\2\u00b9\t\3\2\2\2\u00ba\u00bf\5\f\7\2\u00bb\u00bf\5\34\17\2\u00bc\u00bf"+
		"\58\35\2\u00bd\u00bf\5<\37\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\13\3\2\2\2\u00c0\u00c1\7\n\2"+
		"\2\u00c1\u00c6\5\16\b\2\u00c2\u00c3\7\66\2\2\u00c3\u00c5\5\16\b\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\66\2\2\u00ca"+
		"\r\3\2\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\7,\2\2\u00cd\u00ce\5\20\t\2"+
		"\u00ce\17\3\2\2\2\u00cf\u00d5\5\22\n\2\u00d0\u00d1\5\32\16\2\u00d1\u00d2"+
		"\5\22\n\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5\30\r\2\u00d4\u00cf\3\2\2\2"+
		"\u00d4\u00d0\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\21\3\2\2\2\u00d6\u00d9"+
		"\5\24\13\2\u00d7\u00d9\5\26\f\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2"+
		"\2\u00d9\23\3\2\2\2\u00da\u00db\7C\2\2\u00db\25\3\2\2\2\u00dc\u00dd\7"+
		"D\2\2\u00dd\27\3\2\2\2\u00de\u00df\7B\2\2\u00df\31\3\2\2\2\u00e0\u00e1"+
		"\t\2\2\2\u00e1\33\3\2\2\2\u00e2\u00e3\7!\2\2\u00e3\u00e8\5\36\20\2\u00e4"+
		"\u00e5\7\66\2\2\u00e5\u00e7\5\36\20\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7\66\2\2\u00ec\35\3\2\2\2\u00ed\u00ee\5\6\4"+
		"\2\u00ee\u00ef\7,\2\2\u00ef\u00f0\5 \21\2\u00f0\37\3\2\2\2\u00f1\u00f2"+
		"\5\"\22\2\u00f2!\3\2\2\2\u00f3\u00f7\5$\23\2\u00f4\u00f7\5,\27\2\u00f5"+
		"\u00f7\5\66\34\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3"+
		"\2\2\2\u00f7#\3\2\2\2\u00f8\u00fb\5&\24\2\u00f9\u00fb\5(\25\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb%\3\2\2\2\u00fc\u00fd\5\20\t\2\u00fd"+
		"\u00fe\7+\2\2\u00fe\u00ff\5\20\t\2\u00ff\'\3\2\2\2\u0100\u0103\5\6\4\2"+
		"\u0101\u0103\5*\26\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103)\3"+
		"\2\2\2\u0104\u0105\t\3\2\2\u0105+\3\2\2\2\u0106\u0109\5.\30\2\u0107\u0109"+
		"\5\60\31\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109-\3\2\2\2\u010a"+
		"\u010b\7\4\2\2\u010b\u010c\7;\2\2\u010c\u010d\5&\24\2\u010d\u010e\7\63"+
		"\2\2\u010e\u010f\7\31\2\2\u010f\u0110\5\"\22\2\u0110/\3\2\2\2\u0111\u0112"+
		"\7\37\2\2\u0112\u0113\5\62\32\2\u0113\u0114\7\20\2\2\u0114\61\3\2\2\2"+
		"\u0115\u011a\5\64\33\2\u0116\u0117\7\66\2\2\u0117\u0119\5\64\33\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\63\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\5N(\2\u011e\u011f"+
		"\7)\2\2\u011f\u0120\5\"\22\2\u0120\65\3\2\2\2\u0121\u0122\7\62\2\2\u0122"+
		"\u0123\5(\25\2\u0123\67\3\2\2\2\u0124\u0125\7$\2\2\u0125\u012a\5:\36\2"+
		"\u0126\u0127\7\66\2\2\u0127\u0129\5:\36\2\u0128\u0126\3\2\2\2\u0129\u012c"+
		"\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u012a\3\2\2\2\u012d\u012e\7\66\2\2\u012e9\3\2\2\2\u012f\u0130\5N(\2\u0130"+
		"\u0131\7)\2\2\u0131\u0132\5\"\22\2\u0132;\3\2\2\2\u0133\u0134\5> \2\u0134"+
		"\u0135\7\66\2\2\u0135=\3\2\2\2\u0136\u0139\5@!\2\u0137\u0139\5D#\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139?\3\2\2\2\u013a\u013b\7\33\2\2"+
		"\u013b\u013d\5\6\4\2\u013c\u013e\5F$\2\u013d\u013c\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\66\2\2\u0140\u0141\5B\"\2\u0141"+
		"A\3\2\2\2\u0142\u0143\5\b\5\2\u0143C\3\2\2\2\u0144\u0145\7\22\2\2\u0145"+
		"\u0147\5\6\4\2\u0146\u0148\5F$\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2"+
		"\2\u0148\u0149\3\2\2\2\u0149\u014a\7)\2\2\u014a\u014b\5P)\2\u014b\u014c"+
		"\7\66\2\2\u014c\u014d\5B\"\2\u014dE\3\2\2\2\u014e\u014f\79\2\2\u014f\u0154"+
		"\5H%\2\u0150\u0151\7\66\2\2\u0151\u0153\5H%\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2"+
		"\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7:\2\2\u0158G\3\2\2\2\u0159\u015c"+
		"\5J&\2\u015a\u015c\5L\'\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"I\3\2\2\2\u015d\u015e\5\6\4\2\u015e\u015f\7)\2\2\u015f\u0160\5(\25\2\u0160"+
		"K\3\2\2\2\u0161\u0162\7$\2\2\u0162\u0163\5J&\2\u0163M\3\2\2\2\u0164\u0169"+
		"\5\6\4\2\u0165\u0166\7(\2\2\u0166\u0168\5\6\4\2\u0167\u0165\3\2\2\2\u0168"+
		"\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016aO\3\2\2\2"+
		"\u016b\u0169\3\2\2\2\u016c\u016d\5(\25\2\u016dQ\3\2\2\2\u016e\u016f\5"+
		"T+\2\u016fS\3\2\2\2\u0170\u0173\5X-\2\u0171\u0173\5\u0088E\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0171\3\2\2\2\u0173U\3\2\2\2\u0174\u0175\7\16\2\2\u0175"+
		"W\3\2\2\2\u0176\u017b\5Z.\2\u0177\u017b\5\u0080A\2\u0178\u017b\5V,\2\u0179"+
		"\u017b\5\u0084C\2\u017a\u0176\3\2\2\2\u017a\u0177\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u0179\3\2\2\2\u017bY\3\2\2\2\u017c\u017d\5\\/\2\u017d\u017e"+
		"\7\'\2\2\u017e\u017f\5f\64\2\u017f[\3\2\2\2\u0180\u0184\5\6\4\2\u0181"+
		"\u0183\5^\60\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185]\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018b"+
		"\5b\62\2\u0188\u018b\5`\61\2\u0189\u018b\7\62\2\2\u018a\u0187\3\2\2\2"+
		"\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b_\3\2\2\2\u018c\u018d\7"+
		"*\2\2\u018d\u018e\5\6\4\2\u018ea\3\2\2\2\u018f\u0190\7;\2\2\u0190\u0191"+
		"\5f\64\2\u0191\u0192\5d\63\2\u0192\u0193\7\63\2\2\u0193c\3\2\2\2\u0194"+
		"\u0195\7(\2\2\u0195\u0197\5f\64\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199e\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019b\u01a1\5j\66\2\u019c\u019d\5h\65\2\u019d\u019e\5j\66\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u019c\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2g\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5"+
		"\t\4\2\2\u01a5i\3\2\2\2\u01a6\u01ac\5n8\2\u01a7\u01a8\5l\67\2\u01a8\u01a9"+
		"\5n8\2\u01a9\u01ab\3\2\2\2\u01aa\u01a7\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01adk\3\2\2\2\u01ae\u01ac\3\2\2\2"+
		"\u01af\u01b0\t\5\2\2\u01b0m\3\2\2\2\u01b1\u01b7\5r:\2\u01b2\u01b3\5p9"+
		"\2\u01b3\u01b4\5r:\2\u01b4\u01b6\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b6\u01b9"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8o\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01bb\t\6\2\2\u01bbq\3\2\2\2\u01bc\u01be\5\32\16"+
		"\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0"+
		"\5t;\2\u01c0s\3\2\2\2\u01c1\u01cb\5\\/\2\u01c2\u01c3\79\2\2\u01c3\u01c4"+
		"\5f\64\2\u01c4\u01c5\7:\2\2\u01c5\u01cb\3\2\2\2\u01c6\u01cb\5x=\2\u01c7"+
		"\u01cb\5v<\2\u01c8\u01c9\7\30\2\2\u01c9\u01cb\5t;\2\u01ca\u01c1\3\2\2"+
		"\2\u01ca\u01c2\3\2\2\2\u01ca\u01c6\3\2\2\2\u01ca\u01c7\3\2\2\2\u01ca\u01c8"+
		"\3\2\2\2\u01cbu\3\2\2\2\u01cc\u01d0\5\22\n\2\u01cd\u01d0\5\30\r\2\u01ce"+
		"\u01d0\7\27\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3"+
		"\2\2\2\u01d0w\3\2\2\2\u01d1\u01d2\5\6\4\2\u01d2\u01d3\79\2\2\u01d3\u01d4"+
		"\5z>\2\u01d4\u01d5\7:\2\2\u01d5y\3\2\2\2\u01d6\u01db\5\u0082B\2\u01d7"+
		"\u01d8\7(\2\2\u01d8\u01da\5\u0082B\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3"+
		"\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc{\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01de\u01e3\5~@\2\u01df\u01e0\7(\2\2\u01e0\u01e2\5~@\2\u01e1"+
		"\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e8\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7"+
		"\u01de\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8}\3\2\2\2\u01e9\u01ea\5f\64\2"+
		"\u01ea\177\3\2\2\2\u01eb\u01f0\5\6\4\2\u01ec\u01ed\79\2\2\u01ed\u01ee"+
		"\5z>\2\u01ee\u01ef\7:\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u0081\3\2\2\2\u01f2\u01f6\5f\64\2\u01f3\u01f6\5\30"+
		"\r\2\u01f4\u01f6\5\u0084C\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f6\u0083\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0085\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0087\3\2\2\2\u01fb\u01ff\5\u008aF\2\u01fc"+
		"\u01ff\5\u008eH\2\u01fd\u01ff\5\u0096L\2\u01fe\u01fb\3\2\2\2\u01fe\u01fc"+
		"\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0089\3\2\2\2\u0200\u0201\7\5\2\2\u0201"+
		"\u0202\5\u008cG\2\u0202\u0203\7\20\2\2\u0203\u008b\3\2\2\2\u0204\u0209"+
		"\5R*\2\u0205\u0206\7\66\2\2\u0206\u0208\5R*\2\u0207\u0205\3\2\2\2\u0208"+
		"\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u008d\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020c\u020f\5\u0090I\2\u020d\u020f\5\u0092J\2"+
		"\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f\u008f\3\2\2\2\u0210\u0211"+
		"\7\23\2\2\u0211\u0212\5f\64\2\u0212\u0213\7 \2\2\u0213\u0216\5R*\2\u0214"+
		"\u0215\7\17\2\2\u0215\u0217\5R*\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0091\3\2\2\2\u0218\u0219\7\7\2\2\u0219\u021a\5f\64\2\u021a"+
		"\u021b\7\31\2\2\u021b\u0220\5\u0094K\2\u021c\u021d\7\66\2\2\u021d\u021f"+
		"\5\u0094K\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2"+
		"\2\u0220\u0221\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225"+
		"\7\66\2\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0228\3\2\2\2"+
		"\u0226\u0227\7\17\2\2\u0227\u0229\5\u008cG\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7\20\2\2\u022b\u0093\3"+
		"\2\2\2\u022c\u022d\5\20\t\2\u022d\u022e\7)\2\2\u022e\u022f\5R*\2\u022f"+
		"\u0095\3\2\2\2\u0230\u0233\5\u0098M\2\u0231\u0233\5\u009aN\2\u0232\u0230"+
		"\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0097\3\2\2\2\u0234\u0235\7%\2\2\u0235"+
		"\u0236\5f\64\2\u0236\u0237\7\f\2\2\u0237\u0238\5R*\2\u0238\u0099\3\2\2"+
		"\2\u0239\u023a\7\21\2\2\u023a\u023b\5\6\4\2\u023b\u023c\7\'\2\2\u023c"+
		"\u023d\5\u009cO\2\u023d\u023e\7\f\2\2\u023e\u023f\5R*\2\u023f\u009b\3"+
		"\2\2\2\u0240\u0241\5\u009eP\2\u0241\u0242\t\7\2\2\u0242\u0243\5\u00a0"+
		"Q\2\u0243\u009d\3\2\2\2\u0244\u0245\5f\64\2\u0245\u009f\3\2\2\2\u0246"+
		"\u0247\5f\64\2\u0247\u00a1\3\2\2\2-\u00ac\u00b5\u00be\u00c6\u00d4\u00d8"+
		"\u00e8\u00f6\u00fa\u0102\u0108\u011a\u012a\u0138\u013d\u0147\u0154\u015b"+
		"\u0169\u0172\u017a\u0184\u018a\u0198\u01a1\u01ac\u01b7\u01bd\u01ca\u01cf"+
		"\u01db\u01e3\u01e7\u01f0\u01f5\u01fe\u0209\u020e\u0216\u0220\u0224\u0228"+
		"\u0232";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}