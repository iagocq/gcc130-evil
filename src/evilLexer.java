// Generated from evil.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class evilLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEJA=1, ATR=2, NUM=3, OPARIT=4, OPREL=5, ID=6, STRING=7, COM=8, SE=9, 
		SENAO=10, ENQUANTO=11, PCADA=12, EM=13, FN=14, VIRG=15, DP=16, FL=17, 
		AP=18, FP=19, ACH=20, FCH=21, ACO=22, FCO=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEJA", "ATR", "NUM", "OPARIT", "OPREL", "ID", "STRING", "COM", "SE", 
			"SENAO", "ENQUANTO", "PCADA", "EM", "FN", "VIRG", "DP", "FL", "AP", "FP", 
			"ACH", "FCH", "ACO", "FCO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'seja'", "'='", null, null, null, null, null, null, "'se'", null, 
			null, "'pcada'", "'em'", "'fn'", "','", "':'", "';'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEJA", "ATR", "NUM", "OPARIT", "OPREL", "ID", "STRING", "COM", 
			"SE", "SENAO", "ENQUANTO", "PCADA", "EM", "FN", "VIRG", "DP", "FL", "AP", 
			"FP", "ACH", "FCH", "ACO", "FCO", "WS"
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


	public evilLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "evil.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\5\4<\n\4\3\4\3\4\3\4\5\4A\n\4\3"+
		"\4\7\4D\n\4\f\4\16\4G\13\4\5\4I\n\4\3\4\3\4\3\4\5\4N\n\4\3\4\7\4Q\n\4"+
		"\f\4\16\4T\13\4\5\4V\n\4\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\5\6_\n\6\3\6\3\6"+
		"\5\6c\n\6\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\b\3\b\3\b\3\b\3\b\7\bq\n\b"+
		"\f\b\16\bt\13\b\3\b\3\b\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008b\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\6\31\u00bb"+
		"\n\31\r\31\16\31\u00bc\3\31\3\31\4r{\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\3\2\f\3\2\63;\3\2\62;\6\2\'\',-//\61\61\4\2>>@@\4\2"+
		"##??\5\2C\\aac|\6\2\62;C\\aac|\4\2$$``\3\2\f\f\5\2\13\f\17\17\"\"\2\u00d1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\3\63\3\2\2\2\58\3\2\2\2\7;\3\2\2\2\tZ\3\2\2\2\13b\3\2"+
		"\2\2\rd\3\2\2\2\17k\3\2\2\2\21w\3\2\2\2\23\u0080\3\2\2\2\25\u008a\3\2"+
		"\2\2\27\u0099\3\2\2\2\31\u009b\3\2\2\2\33\u00a1\3\2\2\2\35\u00a4\3\2\2"+
		"\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00af"+
		"\3\2\2\2)\u00b1\3\2\2\2+\u00b3\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61"+
		"\u00ba\3\2\2\2\63\64\7u\2\2\64\65\7g\2\2\65\66\7l\2\2\66\67\7c\2\2\67"+
		"\4\3\2\2\289\7?\2\29\6\3\2\2\2:<\7/\2\2;:\3\2\2\2;<\3\2\2\2<H\3\2\2\2"+
		"=I\7\62\2\2>E\t\2\2\2?A\7a\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BD\t\3\2\2"+
		"C@\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2H=\3\2\2\2"+
		"H>\3\2\2\2IU\3\2\2\2JK\7\60\2\2KR\t\3\2\2LN\7a\2\2ML\3\2\2\2MN\3\2\2\2"+
		"NO\3\2\2\2OQ\t\3\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2"+
		"TR\3\2\2\2UJ\3\2\2\2UV\3\2\2\2V\b\3\2\2\2W[\t\4\2\2XY\7\61\2\2Y[\7\61"+
		"\2\2ZW\3\2\2\2ZX\3\2\2\2[\n\3\2\2\2\\^\t\5\2\2]_\7?\2\2^]\3\2\2\2^_\3"+
		"\2\2\2_c\3\2\2\2`a\t\6\2\2ac\7?\2\2b\\\3\2\2\2b`\3\2\2\2c\f\3\2\2\2dh"+
		"\t\7\2\2eg\t\b\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\16\3\2\2\2"+
		"jh\3\2\2\2kr\7$\2\2lq\t\t\2\2mn\7^\2\2nq\7$\2\2oq\13\2\2\2pl\3\2\2\2p"+
		"m\3\2\2\2po\3\2\2\2qt\3\2\2\2rs\3\2\2\2rp\3\2\2\2su\3\2\2\2tr\3\2\2\2"+
		"uv\7$\2\2v\20\3\2\2\2w{\7%\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2"+
		"\2{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\t\n\2\2\177\22\3\2\2\2\u0080\u0081"+
		"\7u\2\2\u0081\u0082\7g\2\2\u0082\24\3\2\2\2\u0083\u0084\7u\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7p\2\2\u0086\u0087\7c\2\2\u0087\u008b\7q\2\2\u0088"+
		"\u0089\7u\2\2\u0089\u008b\7p\2\2\u008a\u0083\3\2\2\2\u008a\u0088\3\2\2"+
		"\2\u008b\26\3\2\2\2\u008c\u008d\7g\2\2\u008d\u008e\7p\2\2\u008e\u008f"+
		"\7s\2\2\u008f\u0090\7w\2\2\u0090\u0091\7c\2\2\u0091\u0092\7p\2\2\u0092"+
		"\u0093\7v\2\2\u0093\u009a\7q\2\2\u0094\u0095\7g\2\2\u0095\u0096\7p\2\2"+
		"\u0096\u0097\7s\2\2\u0097\u0098\7v\2\2\u0098\u009a\7q\2\2\u0099\u008c"+
		"\3\2\2\2\u0099\u0094\3\2\2\2\u009a\30\3\2\2\2\u009b\u009c\7r\2\2\u009c"+
		"\u009d\7e\2\2\u009d\u009e\7c\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\32\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7o\2\2\u00a3\34\3\2\2"+
		"\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7p\2\2\u00a6\36\3\2\2\2\u00a7\u00a8"+
		"\7.\2\2\u00a8 \3\2\2\2\u00a9\u00aa\7<\2\2\u00aa\"\3\2\2\2\u00ab\u00ac"+
		"\7=\2\2\u00ac$\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae&\3\2\2\2\u00af\u00b0\7"+
		"+\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7\177"+
		"\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7]\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7_\2"+
		"\2\u00b8\60\3\2\2\2\u00b9\u00bb\t\13\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\b\31\2\2\u00bf\62\3\2\2\2\24\2;@EHMRUZ^bhpr{\u008a\u0099\u00bc"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}