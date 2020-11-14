// Generated from /home/cadena/Documents/GitHub/graphqldsl/src/GraphqlCommon.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphqlCommonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, BooleanValue=12, NullValue=13, FRAGMENT=14, QUERY=15, 
		SCHEMA=16, SCALAR=17, TYPE=18, INTERFACE=19, IMPLEMENTS=20, ENUM=21, UNION=22, 
		INPUT=23, EXTEND=24, DIRECTIVE=25, ON_KEYWORD=26, NAME=27, IntValue=28, 
		FloatValue=29, StringValue=30, Comment=31, LF=32, CR=33, LineTerminator=34, 
		Space=35, Tab=36, Comma=37, UnicodeBOM=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "BooleanValue", "NullValue", "FRAGMENT", "QUERY", "SCHEMA", 
			"SCALAR", "TYPE", "INTERFACE", "IMPLEMENTS", "ENUM", "UNION", "INPUT", 
			"EXTEND", "DIRECTIVE", "ON_KEYWORD", "NAME", "IntValue", "IntegerPart", 
			"NegativeSign", "NonZeroDigit", "FloatValue", "FractionalPart", "ExponentPart", 
			"ExponentIndicator", "Sign", "Digit", "StringValue", "BlockStringCharacter", 
			"StringCharacter", "EscapedCharacter", "EscapedUnicode", "Hex", "ExtendedSourceCharacter", 
			"ExtendedSourceCharacterWithoutLineFeed", "Comment", "LF", "CR", "LineTerminator", 
			"Space", "Tab", "Comma", "UnicodeBOM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'{'", "'}'", "':'", "'@'", "'('", "')'", "'$'", 
			"'='", "'!'", null, "'null'", "'fragment'", "'query'", "'schema'", "'scalar'", 
			"'type'", "'interface'", "'implements'", "'enum'", "'union'", "'input'", 
			"'extend'", "'directive'", "'on'", null, null, null, null, null, null, 
			null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"BooleanValue", "NullValue", "FRAGMENT", "QUERY", "SCHEMA", "SCALAR", 
			"TYPE", "INTERFACE", "IMPLEMENTS", "ENUM", "UNION", "INPUT", "EXTEND", 
			"DIRECTIVE", "ON_KEYWORD", "NAME", "IntValue", "FloatValue", "StringValue", 
			"Comment", "LF", "CR", "LineTerminator", "Space", "Tab", "Comma", "UnicodeBOM"
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


	public GraphqlCommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraphqlCommon.g4"; }

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
		case 27:
			return IntValue_sempred((RuleContext)_localctx, predIndex);
		case 31:
			return FloatValue_sempred((RuleContext)_localctx, predIndex);
		case 37:
			return StringValue_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean IntValue_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  !isDigit(_input.LA(1)) && !isDot(_input.LA(1)) && !isNameStart(_input.LA(1))  ;
		}
		return true;
	}
	private boolean FloatValue_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  !isDigit(_input.LA(1)) && !isDot(_input.LA(1)) && !isNameStart(_input.LA(1))  ;
		case 2:
			return  !isDigit(_input.LA(1)) && !isDot(_input.LA(1)) && !isNameStart(_input.LA(1))  ;
		case 3:
			return  !isDigit(_input.LA(1)) && !isDot(_input.LA(1)) && !isNameStart(_input.LA(1))  ;
		}
		return true;
	}
	private boolean StringValue_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return  _input.LA(1) != '"';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0193\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\7\34\u00f2\n\34\f\34\16\34\u00f5\13\34"+
		"\3\35\3\35\3\35\3\36\5\36\u00fb\n\36\3\36\3\36\5\36\u00ff\n\36\3\36\3"+
		"\36\7\36\u0103\n\36\f\36\16\36\u0106\13\36\5\36\u0108\n\36\3\37\3\37\3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u011e\n!\3\"\3"+
		"\"\6\"\u0122\n\"\r\"\16\"\u0123\3#\3#\5#\u0128\n#\3#\6#\u012b\n#\r#\16"+
		"#\u012c\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\6\'\u013b\n\'\r\'\16"+
		"\'\u013c\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0146\n\'\f\'\16\'\u0149\13\'"+
		"\3\'\3\'\3\'\5\'\u014e\n\'\3(\3(\3(\3(\3(\5(\u0155\n(\3)\5)\u0158\n)\3"+
		")\3)\3)\3)\3)\3)\5)\u0160\n)\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\7/\u0171\n/\f/\16/\u0174\13/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\u0147\2\67\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2?\2A\37C\2E\2G"+
		"\2I\2K\2M O\2Q\2S\2U\2W\2Y\2[\2]!_\"a#c$e%g&i\'k(\3\2\16\5\2C\\aac|\6"+
		"\2\62;C\\aac|\4\2GGgg\4\2--//\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2"+
		"\f\f\3\2\17\17\3\2\u202a\u202b\3\2\"\"\3\2\13\13\3\2\uff01\uff01\5\6\2"+
		"\13\2\13\2\"\2#\2%\2]\2_\2\1\22\5\2\13\2\f\2\17\2\17\2\"\2\1\22\4\2\13"+
		"\2\13\2\"\2\1\22\u0196\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2A\3\2\2\2\2M\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5"+
		"o\3\2\2\2\7q\3\2\2\2\ts\3\2\2\2\13u\3\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21"+
		"{\3\2\2\2\23}\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2\2\31\u008c\3\2\2\2"+
		"\33\u008e\3\2\2\2\35\u0093\3\2\2\2\37\u009c\3\2\2\2!\u00a2\3\2\2\2#\u00a9"+
		"\3\2\2\2%\u00b0\3\2\2\2\'\u00b5\3\2\2\2)\u00bf\3\2\2\2+\u00ca\3\2\2\2"+
		"-\u00cf\3\2\2\2/\u00d5\3\2\2\2\61\u00db\3\2\2\2\63\u00e2\3\2\2\2\65\u00ec"+
		"\3\2\2\2\67\u00ef\3\2\2\29\u00f6\3\2\2\2;\u0107\3\2\2\2=\u0109\3\2\2\2"+
		"?\u010b\3\2\2\2A\u011d\3\2\2\2C\u011f\3\2\2\2E\u0125\3\2\2\2G\u012e\3"+
		"\2\2\2I\u0130\3\2\2\2K\u0132\3\2\2\2M\u014d\3\2\2\2O\u0154\3\2\2\2Q\u015f"+
		"\3\2\2\2S\u0161\3\2\2\2U\u0163\3\2\2\2W\u0168\3\2\2\2Y\u016a\3\2\2\2["+
		"\u016c\3\2\2\2]\u016e\3\2\2\2_\u0177\3\2\2\2a\u017b\3\2\2\2c\u017f\3\2"+
		"\2\2e\u0183\3\2\2\2g\u0187\3\2\2\2i\u018b\3\2\2\2k\u018f\3\2\2\2mn\7]"+
		"\2\2n\4\3\2\2\2op\7_\2\2p\6\3\2\2\2qr\7}\2\2r\b\3\2\2\2st\7\177\2\2t\n"+
		"\3\2\2\2uv\7<\2\2v\f\3\2\2\2wx\7B\2\2x\16\3\2\2\2yz\7*\2\2z\20\3\2\2\2"+
		"{|\7+\2\2|\22\3\2\2\2}~\7&\2\2~\24\3\2\2\2\177\u0080\7?\2\2\u0080\26\3"+
		"\2\2\2\u0081\u0082\7#\2\2\u0082\30\3\2\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7w\2\2\u0086\u008d\7g\2\2\u0087\u0088\7h\2\2\u0088"+
		"\u0089\7c\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u008d\7g\2\2"+
		"\u008c\u0083\3\2\2\2\u008c\u0087\3\2\2\2\u008d\32\3\2\2\2\u008e\u008f"+
		"\7p\2\2\u008f\u0090\7w\2\2\u0090\u0091\7n\2\2\u0091\u0092\7n\2\2\u0092"+
		"\34\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7t\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7i\2\2\u0097\u0098\7o\2\2\u0098\u0099\7g\2\2\u0099\u009a\7p\2\2"+
		"\u009a\u009b\7v\2\2\u009b\36\3\2\2\2\u009c\u009d\7s\2\2\u009d\u009e\7"+
		"w\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7{\2\2\u00a1 "+
		"\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7j\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7c\2\2\u00a8\"\3\2\2\2\u00a9"+
		"\u00aa\7u\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7n\2\2"+
		"\u00ad\u00ae\7c\2\2\u00ae\u00af\7t\2\2\u00af$\3\2\2\2\u00b0\u00b1\7v\2"+
		"\2\u00b1\u00b2\7{\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7g\2\2\u00b4&\3\2"+
		"\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9"+
		"\7g\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00bd\7e\2\2\u00bd\u00be\7g\2\2\u00be(\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0"+
		"\u00c1\7o\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\u00c5\7o\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8"+
		"\7v\2\2\u00c8\u00c9\7u\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc"+
		"\7p\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7o\2\2\u00ce,\3\2\2\2\u00cf\u00d0"+
		"\7w\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7q\2\2\u00d3"+
		"\u00d4\7p\2\2\u00d4.\3\2\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7p\2\2\u00d7"+
		"\u00d8\7r\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7v\2\2\u00da\60\3\2\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00dd\7z\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7g\2\2"+
		"\u00df\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\7"+
		"f\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7"+
		"\7e\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7x\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\66\3\2\2\2\u00ef\u00f3\t\2\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2\2"+
		"\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f48"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5;\36\2\u00f7\u00f8\6\35\2\2"+
		"\u00f8:\3\2\2\2\u00f9\u00fb\5=\37\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0108\7\62\2\2\u00fd\u00ff\5=\37\2\u00fe"+
		"\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0104\5?"+
		" \2\u0101\u0103\5K&\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u00fa\3\2\2\2\u0107\u00fe\3\2\2\2\u0108<\3\2\2\2\u0109\u010a\7/\2\2\u010a"+
		">\3\2\2\2\u010b\u010c\4\63;\2\u010c@\3\2\2\2\u010d\u010e\5;\36\2\u010e"+
		"\u010f\5C\"\2\u010f\u0110\5E#\2\u0110\u0111\3\2\2\2\u0111\u0112\6!\3\2"+
		"\u0112\u011e\3\2\2\2\u0113\u0114\5;\36\2\u0114\u0115\5C\"\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\6!\4\2\u0117\u011e\3\2\2\2\u0118\u0119\5;\36\2\u0119"+
		"\u011a\5E#\2\u011a\u011b\3\2\2\2\u011b\u011c\6!\5\2\u011c\u011e\3\2\2"+
		"\2\u011d\u010d\3\2\2\2\u011d\u0113\3\2\2\2\u011d\u0118\3\2\2\2\u011eB"+
		"\3\2\2\2\u011f\u0121\7\60\2\2\u0120\u0122\5K&\2\u0121\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124D\3\2\2\2"+
		"\u0125\u0127\5G$\2\u0126\u0128\5I%\2\u0127\u0126\3\2\2\2\u0127\u0128\3"+
		"\2\2\2\u0128\u012a\3\2\2\2\u0129\u012b\5K&\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012dF\3\2\2\2"+
		"\u012e\u012f\t\4\2\2\u012fH\3\2\2\2\u0130\u0131\t\5\2\2\u0131J\3\2\2\2"+
		"\u0132\u0133\4\62;\2\u0133L\3\2\2\2\u0134\u0135\7$\2\2\u0135\u0136\7$"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u014e\6\'\6\2\u0138\u013a\7$\2\2\u0139"+
		"\u013b\5Q)\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2"+
		"\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7$\2\2\u013f\u014e"+
		"\3\2\2\2\u0140\u0141\7$\2\2\u0141\u0142\7$\2\2\u0142\u0143\7$\2\2\u0143"+
		"\u0147\3\2\2\2\u0144\u0146\5O(\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2"+
		"\2\u0147\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014b\7$\2\2\u014b\u014c\7$\2\2\u014c\u014e\7$\2\2\u014d"+
		"\u0134\3\2\2\2\u014d\u0138\3\2\2\2\u014d\u0140\3\2\2\2\u014eN\3\2\2\2"+
		"\u014f\u0150\7^\2\2\u0150\u0151\7$\2\2\u0151\u0152\7$\2\2\u0152\u0155"+
		"\7$\2\2\u0153\u0155\5Y-\2\u0154\u014f\3\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"P\3\2\2\2\u0156\u0158\t\16\2\2\u0157\u0156\3\2\2\2\u0158\u0160\3\2\2\2"+
		"\u0159\u015a\7^\2\2\u015a\u015b\7w\2\2\u015b\u015c\3\2\2\2\u015c\u0160"+
		"\5U+\2\u015d\u015e\7^\2\2\u015e\u0160\5S*\2\u015f\u0157\3\2\2\2\u015f"+
		"\u0159\3\2\2\2\u015f\u015d\3\2\2\2\u0160R\3\2\2\2\u0161\u0162\t\6\2\2"+
		"\u0162T\3\2\2\2\u0163\u0164\5W,\2\u0164\u0165\5W,\2\u0165\u0166\5W,\2"+
		"\u0166\u0167\5W,\2\u0167V\3\2\2\2\u0168\u0169\t\7\2\2\u0169X\3\2\2\2\u016a"+
		"\u016b\t\17\2\2\u016bZ\3\2\2\2\u016c\u016d\t\20\2\2\u016d\\\3\2\2\2\u016e"+
		"\u0172\7%\2\2\u016f\u0171\5[.\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2"+
		"\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172"+
		"\3\2\2\2\u0175\u0176\b/\2\2\u0176^\3\2\2\2\u0177\u0178\t\b\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017a\b\60\3\2\u017a`\3\2\2\2\u017b\u017c\t\t\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\b\61\3\2\u017eb\3\2\2\2\u017f\u0180\t\n\2\2"+
		"\u0180\u0181\3\2\2\2\u0181\u0182\b\62\3\2\u0182d\3\2\2\2\u0183\u0184\t"+
		"\13\2\2\u0184\u0185\3\2\2\2\u0185\u0186\b\63\3\2\u0186f\3\2\2\2\u0187"+
		"\u0188\t\f\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b\64\3\2\u018ah\3\2\2\2"+
		"\u018b\u018c\7.\2\2\u018c\u018d\3\2\2\2\u018d\u018e\b\65\3\2\u018ej\3"+
		"\2\2\2\u018f\u0190\t\r\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b\66\3\2\u0192"+
		"l\3\2\2\2\24\2\u008c\u00f3\u00fa\u00fe\u0104\u0107\u011d\u0123\u0127\u012c"+
		"\u013c\u0147\u014d\u0154\u0157\u015f\u0172\4\2\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}