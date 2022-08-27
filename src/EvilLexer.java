// Generated from Evil.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EvilLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		SEJA=18, SE=19, SENAO=20, ENQUANTO=21, PCADA=22, RETORNA=23, EM=24, FN=25, 
		BOOL=26, ATR=27, NUM=28, OPARIT=29, OPREL=30, OPBIN=31, OPBOOL=32, ATRARIT=33, 
		OPACC=34, ID=35, STRING=36, COM=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"SEJA", "SE", "SENAO", "ENQUANTO", "PCADA", "RETORNA", "EM", "FN", "BOOL", 
			"ATR", "NUM", "OPARIT", "OPREL", "OPBIN", "OPBOOL", "ATRARIT", "OPACC", 
			"ID", "STRING", "COM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "','", "'{'", "'}'", "';'", "'**'", "'*'", 
			"'/'", "'%'", "'//'", "'+'", "'-'", "'&&'", "'||'", "'->'", "'seja'", 
			"'se'", null, null, "'pcada'", "'retorna'", "'em'", "'fn'", null, "'='", 
			null, null, null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "SEJA", "SE", "SENAO", "ENQUANTO", 
			"PCADA", "RETORNA", "EM", "FN", "BOOL", "ATR", "NUM", "OPARIT", "OPREL", 
			"OPBIN", "OPBOOL", "ATRARIT", "OPACC", "ID", "STRING", "COM", "WS"
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


	public EvilLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Evil.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u011c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0086\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0095\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u00b9\n\33\3\34\3\34\3\35\5\35\u00be\n\35\3\35\3\35\3\35\5\35\u00c3\n"+
		"\35\3\35\7\35\u00c6\n\35\f\35\16\35\u00c9\13\35\5\35\u00cb\n\35\3\35\3"+
		"\35\3\35\5\35\u00d0\n\35\3\35\7\35\u00d3\n\35\f\35\16\35\u00d6\13\35\5"+
		"\35\u00d8\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u00df\n\36\3\37\3\37\5\37"+
		"\u00e3\n\37\3\37\3\37\5\37\u00e7\n\37\3 \3 \3!\3!\3!\3!\3!\3!\5!\u00f1"+
		"\n!\3\"\3\"\3\"\3#\3#\3$\3$\7$\u00fa\n$\f$\16$\u00fd\13$\3%\3%\3%\3%\3"+
		"%\7%\u0104\n%\f%\16%\u0107\13%\3%\3%\3&\3&\7&\u010d\n&\f&\16&\u0110\13"+
		"&\3&\3&\3&\3&\3\'\6\'\u0117\n\'\r\'\16\'\u0118\3\'\3\'\4\u0105\u010e\2"+
		"(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(\3\2\r\3\2\63;\3\2\62;\6\2\'\',-//\61\61\4\2>>@@\4"+
		"\2##??\5\2((``~~\5\2C\\aac|\6\2\62;C\\aac|\4\2$$``\3\2\f\f\5\2\13\f\17"+
		"\17\"\"\2\u0131\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2"+
		"\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21]\3\2\2"+
		"\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33i\3\2\2\2\35k\3\2"+
		"\2\2\37m\3\2\2\2!p\3\2\2\2#s\3\2\2\2%v\3\2\2\2\'{\3\2\2\2)\u0085\3\2\2"+
		"\2+\u0094\3\2\2\2-\u0096\3\2\2\2/\u009c\3\2\2\2\61\u00a4\3\2\2\2\63\u00a7"+
		"\3\2\2\2\65\u00b8\3\2\2\2\67\u00ba\3\2\2\29\u00bd\3\2\2\2;\u00de\3\2\2"+
		"\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00f0\3\2\2\2C\u00f2\3\2\2\2E\u00f5"+
		"\3\2\2\2G\u00f7\3\2\2\2I\u00fe\3\2\2\2K\u010a\3\2\2\2M\u0116\3\2\2\2O"+
		"P\7*\2\2P\4\3\2\2\2QR\7+\2\2R\6\3\2\2\2ST\7<\2\2T\b\3\2\2\2UV\7.\2\2V"+
		"\n\3\2\2\2WX\7}\2\2X\f\3\2\2\2YZ\7\177\2\2Z\16\3\2\2\2[\\\7=\2\2\\\20"+
		"\3\2\2\2]^\7,\2\2^_\7,\2\2_\22\3\2\2\2`a\7,\2\2a\24\3\2\2\2bc\7\61\2\2"+
		"c\26\3\2\2\2de\7\'\2\2e\30\3\2\2\2fg\7\61\2\2gh\7\61\2\2h\32\3\2\2\2i"+
		"j\7-\2\2j\34\3\2\2\2kl\7/\2\2l\36\3\2\2\2mn\7(\2\2no\7(\2\2o \3\2\2\2"+
		"pq\7~\2\2qr\7~\2\2r\"\3\2\2\2st\7/\2\2tu\7@\2\2u$\3\2\2\2vw\7u\2\2wx\7"+
		"g\2\2xy\7l\2\2yz\7c\2\2z&\3\2\2\2{|\7u\2\2|}\7g\2\2}(\3\2\2\2~\177\7u"+
		"\2\2\177\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081\u0082\7c\2\2\u0082\u0086"+
		"\7q\2\2\u0083\u0084\7u\2\2\u0084\u0086\7p\2\2\u0085~\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086*\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7s\2\2\u008a\u008b\7w\2\2\u008b\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u0095\7q\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2"+
		"\u0091\u0092\7s\2\2\u0092\u0093\7v\2\2\u0093\u0095\7q\2\2\u0094\u0087"+
		"\3\2\2\2\u0094\u008f\3\2\2\2\u0095,\3\2\2\2\u0096\u0097\7r\2\2\u0097\u0098"+
		"\7e\2\2\u0098\u0099\7c\2\2\u0099\u009a\7f\2\2\u009a\u009b\7c\2\2\u009b"+
		".\3\2\2\2\u009c\u009d\7t\2\2\u009d\u009e\7g\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7c\2\2"+
		"\u00a3\60\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7o\2\2\u00a6\62\3\2\2"+
		"\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7p\2\2\u00a9\64\3\2\2\2\u00aa\u00ab"+
		"\7x\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7f\2\2\u00b0\u00b9\7g\2\2\u00b1\u00b2\7o\2\2"+
		"\u00b2\u00b3\7g\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6"+
		"\7k\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b9\7c\2\2\u00b8\u00aa\3\2\2\2\u00b8"+
		"\u00b1\3\2\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb8\3\2\2\2\u00bc"+
		"\u00be\7/\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00ca\3\2"+
		"\2\2\u00bf\u00cb\7\62\2\2\u00c0\u00c7\t\2\2\2\u00c1\u00c3\7a\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\t\3"+
		"\2\2\u00c5\u00c2\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00bf\3\2"+
		"\2\2\u00ca\u00c0\3\2\2\2\u00cb\u00d7\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd"+
		"\u00d4\t\3\2\2\u00ce\u00d0\7a\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\t\3\2\2\u00d2\u00cf\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		":\3\2\2\2\u00d9\u00df\t\4\2\2\u00da\u00db\7\61\2\2\u00db\u00df\7\61\2"+
		"\2\u00dc\u00dd\7,\2\2\u00dd\u00df\7,\2\2\u00de\u00d9\3\2\2\2\u00de\u00da"+
		"\3\2\2\2\u00de\u00dc\3\2\2\2\u00df<\3\2\2\2\u00e0\u00e2\t\5\2\2\u00e1"+
		"\u00e3\7?\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7\3\2"+
		"\2\2\u00e4\u00e5\t\6\2\2\u00e5\u00e7\7?\2\2\u00e6\u00e0\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e7>\3\2\2\2\u00e8\u00e9\t\7\2\2\u00e9@\3\2\2\2\u00ea"+
		"\u00eb\7(\2\2\u00eb\u00f1\7(\2\2\u00ec\u00ed\7~\2\2\u00ed\u00f1\7~\2\2"+
		"\u00ee\u00ef\7/\2\2\u00ef\u00f1\7@\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ec"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1B\3\2\2\2\u00f2\u00f3\5;\36\2\u00f3"+
		"\u00f4\7?\2\2\u00f4D\3\2\2\2\u00f5\u00f6\7\60\2\2\u00f6F\3\2\2\2\u00f7"+
		"\u00fb\t\b\2\2\u00f8\u00fa\t\t\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcH\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u0105\7$\2\2\u00ff\u0104\t\n\2\2\u0100\u0101\7^\2\2\u0101"+
		"\u0104\7$\2\2\u0102\u0104\13\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2"+
		"\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7$"+
		"\2\2\u0109J\3\2\2\2\u010a\u010e\7%\2\2\u010b\u010d\13\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\t\13\2\2\u0112\u0113\3"+
		"\2\2\2\u0113\u0114\b&\2\2\u0114L\3\2\2\2\u0115\u0117\t\f\2\2\u0116\u0115"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\b\'\2\2\u011bN\3\2\2\2\26\2\u0085\u0094\u00b8"+
		"\u00bd\u00c2\u00c7\u00ca\u00cf\u00d4\u00d7\u00de\u00e2\u00e6\u00f0\u00fb"+
		"\u0103\u0105\u010e\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}