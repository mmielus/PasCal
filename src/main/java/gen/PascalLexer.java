// Generated from C:/Users/user/Desktop/PasCal\Pascal.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", "DIV", 
		"DO", "DOWNTO", "EXIT", "ELSE", "END", "FOR", "FUNCTION", "IF", "IN", 
		"INTEGER", "MOD", "NIL", "NOT", "OF", "OR", "PROCEDURE", "PROGRAM", "REPEAT", 
		"REAL", "RECORD", "THEN", "TYPE", "TO", "UNTIL", "VAR", "WHILE", "STRING", 
		"ASSIGN", "COMMA", "COLON", "DOT", "DOTDOT", "EQUAL", "LT", "LE", "PLUS", 
		"MINUS", "NOT_EQUAL", "POINTER", "RBRACK", "STAR", "SLASH", "SEMI", "GE", 
		"GT", "LPAREN", "RPAREN", "LBRACK", "LCURLY", "RCURLY", "WS", "COMMENT_1", 
		"COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", "NUM_REAL"
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


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 60:
			return COMMENT_1_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean COMMENT_1_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  _input.LA(2) != ')' ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01bf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3=\3=\5=\u017d\n=\5=\u017f\n=\3=\3=\3>\3>\3>\3"+
		">\3>\3>\7>\u0189\n>\f>\16>\u018c\13>\3>\3>\3>\3>\3>\3?\3?\7?\u0195\n?"+
		"\f?\16?\u0198\13?\3?\3?\3?\3?\3@\3@\7@\u01a0\n@\f@\16@\u01a3\13@\3A\3"+
		"A\3A\3A\7A\u01a9\nA\fA\16A\u01ac\13A\3A\3A\3B\6B\u01b1\nB\rB\16B\u01b2"+
		"\3C\6C\u01b6\nC\rC\16C\u01b7\3C\3C\6C\u01bc\nC\rC\16C\u01bd\2\2D\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\3\2\t\5\2\13\13\16\16\"\"\4\2\f"+
		"\f\17\17\3\2,,\3\2\177\177\4\2C\\c|\6\2\62;C\\aac|\3\2))\2\u01c9\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\3\u0087\3\2\2\2\5\u008b\3\2\2\2\7\u0091\3\2\2\2\t\u0097\3\2\2"+
		"\2\13\u009f\3\2\2\2\r\u00a4\3\2\2\2\17\u00a9\3\2\2\2\21\u00ad\3\2\2\2"+
		"\23\u00b3\3\2\2\2\25\u00b7\3\2\2\2\27\u00ba\3\2\2\2\31\u00c1\3\2\2\2\33"+
		"\u00c6\3\2\2\2\35\u00cb\3\2\2\2\37\u00cf\3\2\2\2!\u00d3\3\2\2\2#\u00dc"+
		"\3\2\2\2%\u00df\3\2\2\2\'\u00e2\3\2\2\2)\u00ea\3\2\2\2+\u00ee\3\2\2\2"+
		"-\u00f2\3\2\2\2/\u00f6\3\2\2\2\61\u00f9\3\2\2\2\63\u00fc\3\2\2\2\65\u0106"+
		"\3\2\2\2\67\u010e\3\2\2\29\u0115\3\2\2\2;\u011a\3\2\2\2=\u0121\3\2\2\2"+
		"?\u0126\3\2\2\2A\u012b\3\2\2\2C\u012e\3\2\2\2E\u0134\3\2\2\2G\u0138\3"+
		"\2\2\2I\u013e\3\2\2\2K\u0145\3\2\2\2M\u0148\3\2\2\2O\u014a\3\2\2\2Q\u014c"+
		"\3\2\2\2S\u014e\3\2\2\2U\u0151\3\2\2\2W\u0153\3\2\2\2Y\u0155\3\2\2\2["+
		"\u0158\3\2\2\2]\u015a\3\2\2\2_\u015c\3\2\2\2a\u015f\3\2\2\2c\u0161\3\2"+
		"\2\2e\u0163\3\2\2\2g\u0165\3\2\2\2i\u0167\3\2\2\2k\u0169\3\2\2\2m\u016c"+
		"\3\2\2\2o\u016e\3\2\2\2q\u0170\3\2\2\2s\u0172\3\2\2\2u\u0174\3\2\2\2w"+
		"\u0176\3\2\2\2y\u017e\3\2\2\2{\u0182\3\2\2\2}\u0192\3\2\2\2\177\u019d"+
		"\3\2\2\2\u0081\u01a4\3\2\2\2\u0083\u01b0\3\2\2\2\u0085\u01b5\3\2\2\2\u0087"+
		"\u0088\7c\2\2\u0088\u0089\7p\2\2\u0089\u008a\7f\2\2\u008a\4\3\2\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7t\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2"+
		"\u008f\u0090\7{\2\2\u0090\6\3\2\2\2\u0091\u0092\7d\2\2\u0092\u0093\7g"+
		"\2\2\u0093\u0094\7i\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2\2\u0096\b"+
		"\3\2\2\2\u0097\u0098\7d\2\2\u0098\u0099\7q\2\2\u0099\u009a\7q\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7p\2\2"+
		"\u009e\n\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7u"+
		"\2\2\u00a2\u00a3\7g\2\2\u00a3\f\3\2\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6"+
		"\7j\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7t\2\2\u00a8\16\3\2\2\2\u00a9\u00aa"+
		"\7e\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7t\2\2\u00ac\20\3\2\2\2\u00ad\u00ae"+
		"\7e\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7u\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7x\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7q\2\2\u00b9"+
		"\26\3\2\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7y\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0\30\3\2\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c3\7z\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7v\2\2"+
		"\u00c5\32\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7"+
		"u\2\2\u00c9\u00ca\7g\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7p\2\2\u00cd\u00ce\7f\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1"+
		"\7q\2\2\u00d1\u00d2\7t\2\2\u00d2 \3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5"+
		"\7w\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7v\2\2\u00d8"+
		"\u00d9\7k\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7p\2\2\u00db\"\3\2\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7h\2\2\u00de$\3\2\2\2\u00df\u00e0\7k\2\2\u00e0"+
		"\u00e1\7p\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7i\2\2\u00e7\u00e8\7g\2\2"+
		"\u00e8\u00e9\7t\2\2\u00e9(\3\2\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7q\2"+
		"\2\u00ec\u00ed\7f\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7"+
		"k\2\2\u00f0\u00f1\7n\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7v\2\2\u00f5.\3\2\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8"+
		"\7h\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7t\2\2\u00fb\62"+
		"\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7e\2\2\u0100\u0101\7g\2\2\u0101\u0102\7f\2\2\u0102\u0103\7w\2\2"+
		"\u0103\u0104\7t\2\2\u0104\u0105\7g\2\2\u0105\64\3\2\2\2\u0106\u0107\7"+
		"r\2\2\u0107\u0108\7t\2\2\u0108\u0109\7q\2\2\u0109\u010a\7i\2\2\u010a\u010b"+
		"\7t\2\2\u010b\u010c\7c\2\2\u010c\u010d\7o\2\2\u010d\66\3\2\2\2\u010e\u010f"+
		"\7t\2\2\u010f\u0110\7g\2\2\u0110\u0111\7r\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7c\2\2\u0113\u0114\7v\2\2\u01148\3\2\2\2\u0115\u0116\7t\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7c\2\2\u0118\u0119\7n\2\2\u0119:\3\2\2\2\u011a"+
		"\u011b\7t\2\2\u011b\u011c\7g\2\2\u011c\u011d\7e\2\2\u011d\u011e\7q\2\2"+
		"\u011e\u011f\7t\2\2\u011f\u0120\7f\2\2\u0120<\3\2\2\2\u0121\u0122\7v\2"+
		"\2\u0122\u0123\7j\2\2\u0123\u0124\7g\2\2\u0124\u0125\7p\2\2\u0125>\3\2"+
		"\2\2\u0126\u0127\7v\2\2\u0127\u0128\7{\2\2\u0128\u0129\7r\2\2\u0129\u012a"+
		"\7g\2\2\u012a@\3\2\2\2\u012b\u012c\7v\2\2\u012c\u012d\7q\2\2\u012dB\3"+
		"\2\2\2\u012e\u012f\7w\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131"+
		"\u0132\7k\2\2\u0132\u0133\7n\2\2\u0133D\3\2\2\2\u0134\u0135\7x\2\2\u0135"+
		"\u0136\7c\2\2\u0136\u0137\7t\2\2\u0137F\3\2\2\2\u0138\u0139\7y\2\2\u0139"+
		"\u013a\7j\2\2\u013a\u013b\7k\2\2\u013b\u013c\7n\2\2\u013c\u013d\7g\2\2"+
		"\u013dH\3\2\2\2\u013e\u013f\7u\2\2\u013f\u0140\7v\2\2\u0140\u0141\7t\2"+
		"\2\u0141\u0142\7k\2\2\u0142\u0143\7p\2\2\u0143\u0144\7i\2\2\u0144J\3\2"+
		"\2\2\u0145\u0146\7<\2\2\u0146\u0147\7?\2\2\u0147L\3\2\2\2\u0148\u0149"+
		"\7.\2\2\u0149N\3\2\2\2\u014a\u014b\7<\2\2\u014bP\3\2\2\2\u014c\u014d\7"+
		"\60\2\2\u014dR\3\2\2\2\u014e\u014f\7\60\2\2\u014f\u0150\7\60\2\2\u0150"+
		"T\3\2\2\2\u0151\u0152\7?\2\2\u0152V\3\2\2\2\u0153\u0154\7>\2\2\u0154X"+
		"\3\2\2\2\u0155\u0156\7>\2\2\u0156\u0157\7?\2\2\u0157Z\3\2\2\2\u0158\u0159"+
		"\7-\2\2\u0159\\\3\2\2\2\u015a\u015b\7/\2\2\u015b^\3\2\2\2\u015c\u015d"+
		"\7>\2\2\u015d\u015e\7@\2\2\u015e`\3\2\2\2\u015f\u0160\7`\2\2\u0160b\3"+
		"\2\2\2\u0161\u0162\7_\2\2\u0162d\3\2\2\2\u0163\u0164\7,\2\2\u0164f\3\2"+
		"\2\2\u0165\u0166\7\61\2\2\u0166h\3\2\2\2\u0167\u0168\7=\2\2\u0168j\3\2"+
		"\2\2\u0169\u016a\7@\2\2\u016a\u016b\7?\2\2\u016bl\3\2\2\2\u016c\u016d"+
		"\7@\2\2\u016dn\3\2\2\2\u016e\u016f\7*\2\2\u016fp\3\2\2\2\u0170\u0171\7"+
		"+\2\2\u0171r\3\2\2\2\u0172\u0173\7]\2\2\u0173t\3\2\2\2\u0174\u0175\7}"+
		"\2\2\u0175v\3\2\2\2\u0176\u0177\7\177\2\2\u0177x\3\2\2\2\u0178\u017f\t"+
		"\2\2\2\u0179\u017a\7\17\2\2\u017a\u017d\7\f\2\2\u017b\u017d\t\3\2\2\u017c"+
		"\u0179\3\2\2\2\u017c\u017b\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0178\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b=\2\2\u0181"+
		"z\3\2\2\2\u0182\u0183\7*\2\2\u0183\u0184\7,\2\2\u0184\u018a\3\2\2\2\u0185"+
		"\u0186\6>\2\2\u0186\u0189\7,\2\2\u0187\u0189\n\4\2\2\u0188\u0185\3\2\2"+
		"\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7,\2\2\u018e"+
		"\u018f\7+\2\2\u018f\u0190\3\2\2\2\u0190\u0191\b>\2\2\u0191|\3\2\2\2\u0192"+
		"\u0196\7}\2\2\u0193\u0195\n\5\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019a\7\177\2\2\u019a\u019b\3\2\2\2\u019b\u019c\b"+
		"?\2\2\u019c~\3\2\2\2\u019d\u01a1\t\6\2\2\u019e\u01a0\t\7\2\2\u019f\u019e"+
		"\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u0080\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01aa\7)\2\2\u01a5\u01a6\7)\2"+
		"\2\u01a6\u01a9\7)\2\2\u01a7\u01a9\n\b\2\2\u01a8\u01a5\3\2\2\2\u01a8\u01a7"+
		"\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7)\2\2\u01ae\u0082\3\2"+
		"\2\2\u01af\u01b1\4\62;\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u0084\3\2\2\2\u01b4\u01b6\4\62"+
		";\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\5Q)\2\u01ba\u01bc\4\62"+
		";\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u0086\3\2\2\2\16\2\u017c\u017e\u0188\u018a\u0196"+
		"\u01a1\u01a8\u01aa\u01b2\u01b7\u01bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}