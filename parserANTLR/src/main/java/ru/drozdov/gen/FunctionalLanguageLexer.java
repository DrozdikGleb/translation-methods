// Generated from /Users/glebdrozdov/IdeaProjects/translation-methods/parserANTLR/src/main/antlrgrammar/FunctionalLanguage.g4 by ANTLR 4.7

    package ru.drozdov.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionalLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ASSIGN=3, SEMICOLON=4, COLON=5, ARROW=6, DOUBLECOLON=7, 
		CONDITIONDIVIDER=8, INT=9, BOOLEAN=10, DOUBLE=11, ALL_TYPES=12, STRING=13, 
		OPERATIONS=14, BRACKETS=15, CONDITION_LEXEM=16, RETURN_LEXEM=17, EXPR=18, 
		TYPE=19, NAME=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ASSIGN", "SEMICOLON", "COLON", "ARROW", "DOUBLECOLON", 
		"CONDITIONDIVIDER", "INT", "BOOLEAN", "DOUBLE", "ALL_TYPES", "STRING", 
		"OPERATIONS", "BRACKETS", "CONDITION_LEXEM", "RETURN_LEXEM", "EXPR", "TYPE", 
		"NAME", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "';'", "':'", "'->'", "'::'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ASSIGN", "SEMICOLON", "COLON", "ARROW", "DOUBLECOLON", 
		"CONDITIONDIVIDER", "INT", "BOOLEAN", "DOUBLE", "ALL_TYPES", "STRING", 
		"OPERATIONS", "BRACKETS", "CONDITION_LEXEM", "RETURN_LEXEM", "EXPR", "TYPE", 
		"NAME", "WS"
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


	public FunctionalLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FunctionalLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u012b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\7\nB\n\n\f\n"+
		"\16\nE\13\n\3\n\5\nH\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13S\n\13\3\f\3\f\7\fW\n\f\f\f\16\fZ\13\f\3\f\5\f]\n\f\3\f\3\f\6\fa"+
		"\n\f\r\f\16\fb\3\r\3\r\3\r\5\rh\n\r\3\16\3\16\7\16l\n\16\f\16\16\16o\13"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21y\n\21\f\21\16\21|\13"+
		"\21\3\21\3\21\7\21\u0080\n\21\f\21\16\21\u0083\13\21\3\21\3\21\5\21\u0087"+
		"\n\21\3\21\7\21\u008a\n\21\f\21\16\21\u008d\13\21\3\21\3\21\7\21\u0091"+
		"\n\21\f\21\16\21\u0094\13\21\3\21\6\21\u0097\n\21\r\21\16\21\u0098\3\21"+
		"\7\21\u009c\n\21\f\21\16\21\u009f\13\21\3\21\3\21\7\21\u00a3\n\21\f\21"+
		"\16\21\u00a6\13\21\3\21\3\21\7\21\u00aa\n\21\f\21\16\21\u00ad\13\21\3"+
		"\21\7\21\u00b0\n\21\f\21\16\21\u00b3\13\21\3\21\3\21\7\21\u00b7\n\21\f"+
		"\21\16\21\u00ba\13\21\3\22\6\22\u00bd\n\22\r\22\16\22\u00be\3\22\7\22"+
		"\u00c2\n\22\f\22\16\22\u00c5\13\22\3\22\3\22\7\22\u00c9\n\22\f\22\16\22"+
		"\u00cc\13\22\3\22\6\22\u00cf\n\22\r\22\16\22\u00d0\6\22\u00d3\n\22\r\22"+
		"\16\22\u00d4\3\23\3\23\7\23\u00d9\n\23\f\23\16\23\u00dc\13\23\3\23\3\23"+
		"\7\23\u00e0\n\23\f\23\16\23\u00e3\13\23\3\23\3\23\7\23\u00e7\n\23\f\23"+
		"\16\23\u00ea\13\23\3\23\3\23\3\23\7\23\u00ef\n\23\f\23\16\23\u00f2\13"+
		"\23\3\23\3\23\7\23\u00f6\n\23\f\23\16\23\u00f9\13\23\3\23\3\23\7\23\u00fd"+
		"\n\23\f\23\16\23\u0100\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u011c\n\24\3\25\3\25\7\25\u0120\n\25\f\25\16\25"+
		"\u0123\13\25\3\26\6\26\u0126\n\26\r\26\16\26\u0127\3\26\3\26\2\2\27\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27\3\2\20\3\2\63;\3\2\62;\3\2\62\62\3\2\60\60"+
		"\3\2$$\6\2\'\',-//\61\61\3\2\"\"\5\2##>>@@\3\2??\4\2((~~\5\2\62;C\\c|"+
		"\6\2*+-;C\\c|\4\2C\\c|\5\2\13\f\17\17\"\"\2\u014e\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3"+
		"\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\17:\3\2\2\2\21=\3\2\2\2\23G\3\2\2\2"+
		"\25R\3\2\2\2\27\\\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35r\3\2\2\2\37t\3\2"+
		"\2\2!v\3\2\2\2#\u00bc\3\2\2\2%\u00d6\3\2\2\2\'\u011b\3\2\2\2)\u011d\3"+
		"\2\2\2+\u0125\3\2\2\2-.\7*\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62"+
		"\7?\2\2\62\b\3\2\2\2\63\64\7=\2\2\64\n\3\2\2\2\65\66\7<\2\2\66\f\3\2\2"+
		"\2\678\7/\2\289\7@\2\29\16\3\2\2\2:;\7<\2\2;<\7<\2\2<\20\3\2\2\2=>\7~"+
		"\2\2>\22\3\2\2\2?C\t\2\2\2@B\t\3\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2DH\3\2\2\2EC\3\2\2\2FH\t\4\2\2G?\3\2\2\2GF\3\2\2\2H\24\3\2\2\2I"+
		"J\7v\2\2JK\7t\2\2KL\7w\2\2LS\7g\2\2MN\7h\2\2NO\7c\2\2OP\7n\2\2PQ\7u\2"+
		"\2QS\7g\2\2RI\3\2\2\2RM\3\2\2\2S\26\3\2\2\2TX\t\2\2\2UW\t\3\2\2VU\3\2"+
		"\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y]\3\2\2\2ZX\3\2\2\2[]\t\4\2\2\\T\3"+
		"\2\2\2\\[\3\2\2\2]^\3\2\2\2^`\t\5\2\2_a\t\3\2\2`_\3\2\2\2ab\3\2\2\2b`"+
		"\3\2\2\2bc\3\2\2\2c\30\3\2\2\2dh\5\23\n\2eh\5\27\f\2fh\5\25\13\2gd\3\2"+
		"\2\2ge\3\2\2\2gf\3\2\2\2h\32\3\2\2\2im\7$\2\2jl\n\6\2\2kj\3\2\2\2lo\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7$\2\2q\34\3\2\2\2rs"+
		"\t\7\2\2s\36\3\2\2\2tu\4*+\2u \3\2\2\2vz\5)\25\2wy\t\b\2\2xw\3\2\2\2y"+
		"|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0086\3\2\2\2|z\3\2\2\2}\u0081\t\t\2\2"+
		"~\u0080\t\n\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0087\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7?"+
		"\2\2\u0085\u0087\7?\2\2\u0086}\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b"+
		"\3\2\2\2\u0088\u008a\t\b\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0092\5\31\r\2\u008f\u0091\t\b\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u00b8\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0095\u0097\t\13\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009d\3\2"+
		"\2\2\u009a\u009c\t\b\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u00a4\5)\25\2\u00a1\u00a3\t\b\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ab\t\t\2\2\u00a8\u00aa\t\n\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00b1\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\t\b\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5\31\r\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u0096\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd"+
		"\t\f\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00d2\3\2\2\2\u00c0\u00c2\t\b\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00ca\5\35\17\2\u00c7\u00c9\t"+
		"\b\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\t\r"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5$\3\2\2\2\u00d6\u00da"+
		"\5)\25\2\u00d7\u00d9\t\b\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e8\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00e1\5\35\17\2\u00de\u00e0\t\b\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\5)\25\2\u00e5\u00e7\3\2\2\2\u00e6"+
		"\u00dd\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7.\2\2\u00ec"+
		"\u00f0\5)\25\2\u00ed\u00ef\t\b\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00fe\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f7\5\35\17\2\u00f4\u00f6\t\b\2\2\u00f5\u00f4\3"+
		"\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\5)\25\2\u00fb\u00fd\3\2"+
		"\2\2\u00fc\u00f3\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff&\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7K\2\2\u0102"+
		"\u0103\7p\2\2\u0103\u0104\7v\2\2\u0104\u0105\7g\2\2\u0105\u0106\7i\2\2"+
		"\u0106\u0107\7g\2\2\u0107\u011c\7t\2\2\u0108\u0109\7U\2\2\u0109\u010a"+
		"\7v\2\2\u010a\u010b\7t\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2\u010d"+
		"\u011c\7i\2\2\u010e\u010f\7F\2\2\u010f\u0110\7q\2\2\u0110\u0111\7w\2\2"+
		"\u0111\u0112\7d\2\2\u0112\u0113\7n\2\2\u0113\u011c\7g\2\2\u0114\u0115"+
		"\7D\2\2\u0115\u0116\7q\2\2\u0116\u0117\7q\2\2\u0117\u0118\7n\2\2\u0118"+
		"\u0119\7g\2\2\u0119\u011a\7c\2\2\u011a\u011c\7p\2\2\u011b\u0101\3\2\2"+
		"\2\u011b\u0108\3\2\2\2\u011b\u010e\3\2\2\2\u011b\u0114\3\2\2\2\u011c("+
		"\3\2\2\2\u011d\u0121\t\16\2\2\u011e\u0120\t\f\2\2\u011f\u011e\3\2\2\2"+
		"\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122*\3"+
		"\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\t\17\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\b\26\2\2\u012a,\3\2\2\2$\2CGRX\\bgmz\u0081\u0086\u008b"+
		"\u0092\u0098\u009d\u00a4\u00ab\u00b1\u00b8\u00be\u00c3\u00ca\u00d0\u00d4"+
		"\u00da\u00e1\u00e8\u00f0\u00f7\u00fe\u011b\u0121\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}