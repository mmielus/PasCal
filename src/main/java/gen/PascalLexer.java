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
		VAR=34, WHILE=35, STRING=36, WRITE=37, ASSIGN=38, COMMA=39, COLON=40, 
		DOT=41, DOTDOT=42, EQUAL=43, LT=44, LE=45, PLUS=46, MINUS=47, NOT_EQUAL=48, 
		POINTER=49, RBRACK=50, STAR=51, SLASH=52, SEMI=53, GE=54, GT=55, LPAREN=56, 
		RPAREN=57, LBRACK=58, LCURLY=59, RCURLY=60, WS=61, COMMENT_1=62, COMMENT_2=63, 
		IDENT=64, STRING_LITERAL=65, NUM_INT=66, NUM_REAL=67;
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
		"WRITE", "ASSIGN", "COMMA", "COLON", "DOT", "DOTDOT", "EQUAL", "LT", "LE", 
		"PLUS", "MINUS", "NOT_EQUAL", "POINTER", "RBRACK", "STAR", "SLASH", "SEMI", 
		"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LCURLY", "RCURLY", "WS", "COMMENT_1", 
		"COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", "NUM_REAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'array'", "'begin'", "'boolean'", "'case'", "'char'", 
		"'chr'", "'const'", "'div'", "'do'", "'downto'", "'exit'", "'else'", "'end'", 
		"'for'", "'function'", "'if'", "'in'", "'integer'", "'mod'", "'nil'", 
		"'not'", "'of'", "'or'", "'procedure'", "'program'", "'repeat'", "'real'", 
		"'record'", "'then'", "'type'", "'to'", "'until'", "'var'", "'while'", 
		"'string'", "'write'", "':='", "','", "':'", "'.'", "'..'", "'='", "'<'", 
		"'<='", "'+'", "'-'", "'<>'", "'^'", "']'", "'*'", "'/'", "';'", "'>='", 
		"'>'", "'('", "')'", "'['", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", 
		"DIV", "DO", "DOWNTO", "EXIT", "ELSE", "END", "FOR", "FUNCTION", "IF", 
		"IN", "INTEGER", "MOD", "NIL", "NOT", "OF", "OR", "PROCEDURE", "PROGRAM", 
		"REPEAT", "REAL", "RECORD", "THEN", "TYPE", "TO", "UNTIL", "VAR", "WHILE", 
		"STRING", "WRITE", "ASSIGN", "COMMA", "COLON", "DOT", "DOTDOT", "EQUAL", 
		"LT", "LE", "PLUS", "MINUS", "NOT_EQUAL", "POINTER", "RBRACK", "STAR", 
		"SLASH", "SEMI", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LCURLY", "RCURLY", 
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
		case 61:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u01c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\5>\u0185\n>\5>\u0187"+
		"\n>\3>\3>\3?\3?\3?\3?\3?\3?\7?\u0191\n?\f?\16?\u0194\13?\3?\3?\3?\3?\3"+
		"?\3@\3@\7@\u019d\n@\f@\16@\u01a0\13@\3@\3@\3@\3@\3A\3A\7A\u01a8\nA\fA"+
		"\16A\u01ab\13A\3B\3B\3B\3B\7B\u01b1\nB\fB\16B\u01b4\13B\3B\3B\3C\6C\u01b9"+
		"\nC\rC\16C\u01ba\3D\6D\u01be\nD\rD\16D\u01bf\3D\3D\6D\u01c4\nD\rD\16D"+
		"\u01c5\2\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\3\2\t\5\2"+
		"\13\13\16\16\"\"\4\2\f\f\17\17\3\2,,\3\2\177\177\4\2C\\c|\6\2\62;C\\a"+
		"ac|\3\2))\2\u01d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2"+
		"\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2\2\5\u008d"+
		"\3\2\2\2\7\u0093\3\2\2\2\t\u0099\3\2\2\2\13\u00a1\3\2\2\2\r\u00a6\3\2"+
		"\2\2\17\u00ab\3\2\2\2\21\u00af\3\2\2\2\23\u00b5\3\2\2\2\25\u00b9\3\2\2"+
		"\2\27\u00bc\3\2\2\2\31\u00c3\3\2\2\2\33\u00c8\3\2\2\2\35\u00cd\3\2\2\2"+
		"\37\u00d1\3\2\2\2!\u00d5\3\2\2\2#\u00de\3\2\2\2%\u00e1\3\2\2\2\'\u00e4"+
		"\3\2\2\2)\u00ec\3\2\2\2+\u00f0\3\2\2\2-\u00f4\3\2\2\2/\u00f8\3\2\2\2\61"+
		"\u00fb\3\2\2\2\63\u00fe\3\2\2\2\65\u0108\3\2\2\2\67\u0110\3\2\2\29\u0117"+
		"\3\2\2\2;\u011c\3\2\2\2=\u0123\3\2\2\2?\u0128\3\2\2\2A\u012d\3\2\2\2C"+
		"\u0130\3\2\2\2E\u0136\3\2\2\2G\u013a\3\2\2\2I\u0140\3\2\2\2K\u0147\3\2"+
		"\2\2M\u014d\3\2\2\2O\u0150\3\2\2\2Q\u0152\3\2\2\2S\u0154\3\2\2\2U\u0156"+
		"\3\2\2\2W\u0159\3\2\2\2Y\u015b\3\2\2\2[\u015d\3\2\2\2]\u0160\3\2\2\2_"+
		"\u0162\3\2\2\2a\u0164\3\2\2\2c\u0167\3\2\2\2e\u0169\3\2\2\2g\u016b\3\2"+
		"\2\2i\u016d\3\2\2\2k\u016f\3\2\2\2m\u0171\3\2\2\2o\u0174\3\2\2\2q\u0176"+
		"\3\2\2\2s\u0178\3\2\2\2u\u017a\3\2\2\2w\u017c\3\2\2\2y\u017e\3\2\2\2{"+
		"\u0186\3\2\2\2}\u018a\3\2\2\2\177\u019a\3\2\2\2\u0081\u01a5\3\2\2\2\u0083"+
		"\u01ac\3\2\2\2\u0085\u01b8\3\2\2\2\u0087\u01bd\3\2\2\2\u0089\u008a\7c"+
		"\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2\u008c\4\3\2\2\2\u008d\u008e"+
		"\7c\2\2\u008e\u008f\7t\2\2\u008f\u0090\7t\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7{\2\2\u0092\6\3\2\2\2\u0093\u0094\7d\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7i\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\b\3\2\2\2\u0099"+
		"\u009a\7d\2\2\u009a\u009b\7q\2\2\u009b\u009c\7q\2\2\u009c\u009d\7n\2\2"+
		"\u009d\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0\n\3\2"+
		"\2\2\u00a1\u00a2\7e\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\f\3\2\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9"+
		"\7c\2\2\u00a9\u00aa\7t\2\2\u00aa\16\3\2\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad"+
		"\7j\2\2\u00ad\u00ae\7t\2\2\u00ae\20\3\2\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7v\2\2\u00b4"+
		"\22\3\2\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7x\2\2\u00b8"+
		"\24\3\2\2\2\u00b9\u00ba\7f\2\2\u00ba\u00bb\7q\2\2\u00bb\26\3\2\2\2\u00bc"+
		"\u00bd\7f\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7y\2\2\u00bf\u00c0\7p\2\2"+
		"\u00c0\u00c1\7v\2\2\u00c1\u00c2\7q\2\2\u00c2\30\3\2\2\2\u00c3\u00c4\7"+
		"g\2\2\u00c4\u00c5\7z\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7v\2\2\u00c7\32"+
		"\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb"+
		"\u00cc\7g\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7p\2\2\u00cf"+
		"\u00d0\7f\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7t\2\2\u00d4 \3\2\2\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7w\2\2\u00d7"+
		"\u00d8\7p\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7k\2\2"+
		"\u00db\u00dc\7q\2\2\u00dc\u00dd\7p\2\2\u00dd\"\3\2\2\2\u00de\u00df\7k"+
		"\2\2\u00df\u00e0\7h\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3"+
		"\7p\2\2\u00e3&\3\2\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7i\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb(\3\2\2\2\u00ec\u00ed\7o\2\2\u00ed\u00ee\7q\2\2\u00ee"+
		"\u00ef\7f\2\2\u00ef*\3\2\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7k\2\2\u00f2"+
		"\u00f3\7n\2\2\u00f3,\3\2\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7q\2\2\u00f6"+
		"\u00f7\7v\2\2\u00f7.\3\2\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7h\2\2\u00fa"+
		"\60\3\2\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7t\2\2\u00fd\62\3\2\2\2\u00fe"+
		"\u00ff\7r\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7q\2\2\u0101\u0102\7e\2\2"+
		"\u0102\u0103\7g\2\2\u0103\u0104\7f\2\2\u0104\u0105\7w\2\2\u0105\u0106"+
		"\7t\2\2\u0106\u0107\7g\2\2\u0107\64\3\2\2\2\u0108\u0109\7r\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7q\2\2\u010b\u010c\7i\2\2\u010c\u010d\7t\2\2\u010d"+
		"\u010e\7c\2\2\u010e\u010f\7o\2\2\u010f\66\3\2\2\2\u0110\u0111\7t\2\2\u0111"+
		"\u0112\7g\2\2\u0112\u0113\7r\2\2\u0113\u0114\7g\2\2\u0114\u0115\7c\2\2"+
		"\u0115\u0116\7v\2\2\u01168\3\2\2\2\u0117\u0118\7t\2\2\u0118\u0119\7g\2"+
		"\2\u0119\u011a\7c\2\2\u011a\u011b\7n\2\2\u011b:\3\2\2\2\u011c\u011d\7"+
		"t\2\2\u011d\u011e\7g\2\2\u011e\u011f\7e\2\2\u011f\u0120\7q\2\2\u0120\u0121"+
		"\7t\2\2\u0121\u0122\7f\2\2\u0122<\3\2\2\2\u0123\u0124\7v\2\2\u0124\u0125"+
		"\7j\2\2\u0125\u0126\7g\2\2\u0126\u0127\7p\2\2\u0127>\3\2\2\2\u0128\u0129"+
		"\7v\2\2\u0129\u012a\7{\2\2\u012a\u012b\7r\2\2\u012b\u012c\7g\2\2\u012c"+
		"@\3\2\2\2\u012d\u012e\7v\2\2\u012e\u012f\7q\2\2\u012fB\3\2\2\2\u0130\u0131"+
		"\7w\2\2\u0131\u0132\7p\2\2\u0132\u0133\7v\2\2\u0133\u0134\7k\2\2\u0134"+
		"\u0135\7n\2\2\u0135D\3\2\2\2\u0136\u0137\7x\2\2\u0137\u0138\7c\2\2\u0138"+
		"\u0139\7t\2\2\u0139F\3\2\2\2\u013a\u013b\7y\2\2\u013b\u013c\7j\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7n\2\2\u013e\u013f\7g\2\2\u013fH\3\2\2\2\u0140"+
		"\u0141\7u\2\2\u0141\u0142\7v\2\2\u0142\u0143\7t\2\2\u0143\u0144\7k\2\2"+
		"\u0144\u0145\7p\2\2\u0145\u0146\7i\2\2\u0146J\3\2\2\2\u0147\u0148\7y\2"+
		"\2\u0148\u0149\7t\2\2\u0149\u014a\7k\2\2\u014a\u014b\7v\2\2\u014b\u014c"+
		"\7g\2\2\u014cL\3\2\2\2\u014d\u014e\7<\2\2\u014e\u014f\7?\2\2\u014fN\3"+
		"\2\2\2\u0150\u0151\7.\2\2\u0151P\3\2\2\2\u0152\u0153\7<\2\2\u0153R\3\2"+
		"\2\2\u0154\u0155\7\60\2\2\u0155T\3\2\2\2\u0156\u0157\7\60\2\2\u0157\u0158"+
		"\7\60\2\2\u0158V\3\2\2\2\u0159\u015a\7?\2\2\u015aX\3\2\2\2\u015b\u015c"+
		"\7>\2\2\u015cZ\3\2\2\2\u015d\u015e\7>\2\2\u015e\u015f\7?\2\2\u015f\\\3"+
		"\2\2\2\u0160\u0161\7-\2\2\u0161^\3\2\2\2\u0162\u0163\7/\2\2\u0163`\3\2"+
		"\2\2\u0164\u0165\7>\2\2\u0165\u0166\7@\2\2\u0166b\3\2\2\2\u0167\u0168"+
		"\7`\2\2\u0168d\3\2\2\2\u0169\u016a\7_\2\2\u016af\3\2\2\2\u016b\u016c\7"+
		",\2\2\u016ch\3\2\2\2\u016d\u016e\7\61\2\2\u016ej\3\2\2\2\u016f\u0170\7"+
		"=\2\2\u0170l\3\2\2\2\u0171\u0172\7@\2\2\u0172\u0173\7?\2\2\u0173n\3\2"+
		"\2\2\u0174\u0175\7@\2\2\u0175p\3\2\2\2\u0176\u0177\7*\2\2\u0177r\3\2\2"+
		"\2\u0178\u0179\7+\2\2\u0179t\3\2\2\2\u017a\u017b\7]\2\2\u017bv\3\2\2\2"+
		"\u017c\u017d\7}\2\2\u017dx\3\2\2\2\u017e\u017f\7\177\2\2\u017fz\3\2\2"+
		"\2\u0180\u0187\t\2\2\2\u0181\u0182\7\17\2\2\u0182\u0185\7\f\2\2\u0183"+
		"\u0185\t\3\2\2\u0184\u0181\3\2\2\2\u0184\u0183\3\2\2\2\u0185\u0187\3\2"+
		"\2\2\u0186\u0180\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\b>\2\2\u0189|\3\2\2\2\u018a\u018b\7*\2\2\u018b\u018c\7,\2\2\u018c"+
		"\u0192\3\2\2\2\u018d\u018e\6?\2\2\u018e\u0191\7,\2\2\u018f\u0191\n\4\2"+
		"\2\u0190\u018d\3\2\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195"+
		"\u0196\7,\2\2\u0196\u0197\7+\2\2\u0197\u0198\3\2\2\2\u0198\u0199\b?\2"+
		"\2\u0199~\3\2\2\2\u019a\u019e\7}\2\2\u019b\u019d\n\5\2\2\u019c\u019b\3"+
		"\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\7\177\2\2\u01a2\u01a3\3"+
		"\2\2\2\u01a3\u01a4\b@\2\2\u01a4\u0080\3\2\2\2\u01a5\u01a9\t\6\2\2\u01a6"+
		"\u01a8\t\7\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u0082\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01b2\7)\2\2\u01ad\u01ae\7)\2\2\u01ae\u01b1\7)\2\2\u01af\u01b1\n\b\2"+
		"\2\u01b0\u01ad\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5"+
		"\u01b6\7)\2\2\u01b6\u0084\3\2\2\2\u01b7\u01b9\4\62;\2\u01b8\u01b7\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u0086\3\2\2\2\u01bc\u01be\4\62;\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\5S*\2\u01c2\u01c4\4\62;\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2"+
		"\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u0088\3\2\2\2\16\2\u0184"+
		"\u0186\u0190\u0192\u019e\u01a9\u01b0\u01b2\u01ba\u01bf\u01c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}