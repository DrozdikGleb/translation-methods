// Generated from /Users/glebdrozdov/IdeaProjects/translation-methods/translatorsGenerator/src/main/antlrgrammar/Grammar.g4 by ANTLR 4.7

    package ru.drozdov.antlrgen;
    import ru.drozdov.generator.ParsedGrammar;
    import  ru.drozdov.generator.tokens.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
    import org.antlr.v4.runtime.tree.*;
import java.util.List;
    import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, RETURNS=2, COLON=3, SEMICOLON=4, LBRACKET=5, RBRACKET=6, LCBRACKET=7, 
		RCBRACKET=8, LSBRACKET=9, RSBRACKET=10, COMMA=11, OR=12, GRAMMARWORD=13, 
		TERMINAL=14, NOTTERMINAL=15, STRING=16, JAVA_CODE=17, CLASS_NAME=18, IN_VALUE=19, 
		WS=20;
	public static final int
		RULE_start = 0, RULE_terms = 1, RULE_term = 2, RULE_notterms = 3, RULE_notterm = 4, 
		RULE_arguments = 5, RULE_argument = 6, RULE_type = 7, RULE_productionsCommon = 8, 
		RULE_productions = 9, RULE_production = 10, RULE_tokenss = 11, RULE_token = 12;
	public static final String[] ruleNames = {
		"start", "terms", "term", "notterms", "notterm", "arguments", "argument", 
		"type", "productionsCommon", "productions", "production", "tokenss", "token"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'returns'", "':'", "';'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "','", "'|'", "'grammar'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUAL", "RETURNS", "COLON", "SEMICOLON", "LBRACKET", "RBRACKET", 
		"LCBRACKET", "RCBRACKET", "LSBRACKET", "RSBRACKET", "COMMA", "OR", "GRAMMARWORD", 
		"TERMINAL", "NOTTERMINAL", "STRING", "JAVA_CODE", "CLASS_NAME", "IN_VALUE", 
		"WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ParsedGrammar parsedGrammar;
		public Token CLASS_NAME;
		public Token NOTTERMINAL;
		public NottermsContext notterms;
		public TermsContext terms;
		public TerminalNode GRAMMARWORD() { return getToken(GrammarParser.GRAMMARWORD, 0); }
		public TerminalNode CLASS_NAME() { return getToken(GrammarParser.CLASS_NAME, 0); }
		public TerminalNode NOTTERMINAL() { return getToken(GrammarParser.NOTTERMINAL, 0); }
		public NottermsContext notterms() {
			return getRuleContext(NottermsContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(GRAMMARWORD);
			setState(27);
			((StartContext)_localctx).CLASS_NAME = match(CLASS_NAME);
			setState(28);
			((StartContext)_localctx).NOTTERMINAL = match(NOTTERMINAL);
			setState(29);
			((StartContext)_localctx).notterms = notterms();
			setState(30);
			((StartContext)_localctx).terms = terms();
			 ((StartContext)_localctx).parsedGrammar =  new ParsedGrammar((((StartContext)_localctx).NOTTERMINAL!=null?((StartContext)_localctx).NOTTERMINAL.getText():null), (((StartContext)_localctx).CLASS_NAME!=null?((StartContext)_localctx).CLASS_NAME.getText():null), ((StartContext)_localctx).notterms.notTerminals, ((StartContext)_localctx).terms.terminals); 
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

	public static class TermsContext extends ParserRuleContext {
		public List<Terminal> terminals;
		public TermContext term;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerms(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			((TermsContext)_localctx).term = term();
			 ((TermsContext)_localctx).terminals =  new ArrayList<>(); 
			 _localctx.terminals.add(((TermsContext)_localctx).term.val);      
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TERMINAL) {
				{
				{
				setState(36);
				((TermsContext)_localctx).term = term();
				 _localctx.terminals.add(((TermsContext)_localctx).term.val);      
				}
				}
				setState(43);
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

	public static class TermContext extends ParserRuleContext {
		public Terminal val;
		public Token TERMINAL;
		public Token STRING;
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((TermContext)_localctx).TERMINAL = match(TERMINAL);
			setState(45);
			match(COLON);
			setState(46);
			((TermContext)_localctx).STRING = match(STRING);
			setState(47);
			match(SEMICOLON);
			 ((TermContext)_localctx).val =  new Terminal((((TermContext)_localctx).TERMINAL!=null?((TermContext)_localctx).TERMINAL.getText():null), (((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null)); 
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

	public static class NottermsContext extends ParserRuleContext {
		public List<NotTerminal> notTerminals;
		public NottermContext notterm;
		public List<NottermContext> notterm() {
			return getRuleContexts(NottermContext.class);
		}
		public NottermContext notterm(int i) {
			return getRuleContext(NottermContext.class,i);
		}
		public NottermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notterms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNotterms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNotterms(this);
		}
	}

	public final NottermsContext notterms() throws RecognitionException {
		NottermsContext _localctx = new NottermsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_notterms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((NottermsContext)_localctx).notterm = notterm();
			 ((NottermsContext)_localctx).notTerminals =  new ArrayList<>(); 
			 _localctx.notTerminals.add(((NottermsContext)_localctx).notterm.notTerminal);   
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOTTERMINAL) {
				{
				{
				setState(53);
				((NottermsContext)_localctx).notterm = notterm();
				 _localctx.notTerminals.add(((NottermsContext)_localctx).notterm.notTerminal);   
				}
				}
				setState(60);
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

	public static class NottermContext extends ParserRuleContext {
		public NotTerminal notTerminal;
		public Token NOTTERMINAL;
		public ProductionsCommonContext productionsCommon;
		public ArgumentContext argument;
		public ArgumentsContext arguments;
		public TerminalNode NOTTERMINAL() { return getToken(GrammarParser.NOTTERMINAL, 0); }
		public ProductionsCommonContext productionsCommon() {
			return getRuleContext(ProductionsCommonContext.class,0);
		}
		public TerminalNode RETURNS() { return getToken(GrammarParser.RETURNS, 0); }
		public List<TerminalNode> LSBRACKET() { return getTokens(GrammarParser.LSBRACKET); }
		public TerminalNode LSBRACKET(int i) {
			return getToken(GrammarParser.LSBRACKET, i);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public List<TerminalNode> RSBRACKET() { return getTokens(GrammarParser.RSBRACKET); }
		public TerminalNode RSBRACKET(int i) {
			return getToken(GrammarParser.RSBRACKET, i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NottermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNotterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNotterm(this);
		}
	}

	public final NottermContext notterm() throws RecognitionException {
		NottermContext _localctx = new NottermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_notterm);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((NottermContext)_localctx).NOTTERMINAL = match(NOTTERMINAL);
				setState(62);
				((NottermContext)_localctx).productionsCommon = productionsCommon();
				 ((NottermContext)_localctx).notTerminal =  new NotTerminal((((NottermContext)_localctx).NOTTERMINAL!=null?((NottermContext)_localctx).NOTTERMINAL.getText():null), ((NottermContext)_localctx).productionsCommon.productionsList); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				((NottermContext)_localctx).NOTTERMINAL = match(NOTTERMINAL);
				setState(66);
				match(RETURNS);
				setState(67);
				match(LSBRACKET);
				setState(68);
				((NottermContext)_localctx).argument = argument();
				setState(69);
				match(RSBRACKET);
				setState(70);
				((NottermContext)_localctx).productionsCommon = productionsCommon();
				 ((NottermContext)_localctx).notTerminal =  new NotTerminal((((NottermContext)_localctx).NOTTERMINAL!=null?((NottermContext)_localctx).NOTTERMINAL.getText():null), ((NottermContext)_localctx).productionsCommon.productionsList, ((NottermContext)_localctx).argument.val); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				((NottermContext)_localctx).NOTTERMINAL = match(NOTTERMINAL);
				setState(74);
				match(LSBRACKET);
				setState(75);
				((NottermContext)_localctx).arguments = arguments();
				setState(76);
				match(RSBRACKET);
				setState(77);
				((NottermContext)_localctx).productionsCommon = productionsCommon();
				 ((NottermContext)_localctx).notTerminal =  new NotTerminal((((NottermContext)_localctx).NOTTERMINAL!=null?((NottermContext)_localctx).NOTTERMINAL.getText():null), ((NottermContext)_localctx).productionsCommon.productionsList, ((NottermContext)_localctx).arguments.vals); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				((NottermContext)_localctx).NOTTERMINAL = match(NOTTERMINAL);
				setState(81);
				match(LSBRACKET);
				setState(82);
				((NottermContext)_localctx).arguments = arguments();
				setState(83);
				match(RSBRACKET);
				setState(84);
				match(RETURNS);
				setState(85);
				match(LSBRACKET);
				setState(86);
				((NottermContext)_localctx).argument = argument();
				setState(87);
				match(RSBRACKET);
				setState(88);
				((NottermContext)_localctx).productionsCommon = productionsCommon();
				 ((NottermContext)_localctx).notTerminal =  new NotTerminal((((NottermContext)_localctx).NOTTERMINAL!=null?((NottermContext)_localctx).NOTTERMINAL.getText():null), ((NottermContext)_localctx).productionsCommon.productionsList, ((NottermContext)_localctx).arguments.vals, ((NottermContext)_localctx).argument.val); 
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Argument> vals;
		public ArgumentContext argument;
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arguments);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTTERMINAL:
			case CLASS_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				((ArgumentsContext)_localctx).argument = argument();
				 ((ArgumentsContext)_localctx).vals =  new ArrayList<>(); 
				 _localctx.vals.add(((ArgumentsContext)_localctx).argument.val); 
				}
				break;
			case RSBRACKET:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(97);
					match(COMMA);
					setState(98);
					((ArgumentsContext)_localctx).argument = argument();
					 _localctx.vals.add(((ArgumentsContext)_localctx).argument.val); 
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ArgumentContext extends ParserRuleContext {
		public Argument val;
		public TypeContext type;
		public Token NOTTERMINAL;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOTTERMINAL() { return getToken(GrammarParser.NOTTERMINAL, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			((ArgumentContext)_localctx).type = type();
			setState(109);
			((ArgumentContext)_localctx).NOTTERMINAL = match(NOTTERMINAL);
			 ((ArgumentContext)_localctx).val =  new Argument(((ArgumentContext)_localctx).type.t, (((ArgumentContext)_localctx).NOTTERMINAL!=null?((ArgumentContext)_localctx).NOTTERMINAL.getText():null)); 
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
		public String t;
		public Token CLASS_NAME;
		public Token NOTTERMINAL;
		public TerminalNode CLASS_NAME() { return getToken(GrammarParser.CLASS_NAME, 0); }
		public TerminalNode NOTTERMINAL() { return getToken(GrammarParser.NOTTERMINAL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((TypeContext)_localctx).CLASS_NAME = match(CLASS_NAME);
				 ((TypeContext)_localctx).t =  (((TypeContext)_localctx).CLASS_NAME!=null?((TypeContext)_localctx).CLASS_NAME.getText():null); 
				}
				break;
			case NOTTERMINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				((TypeContext)_localctx).NOTTERMINAL = match(NOTTERMINAL);
				 ((TypeContext)_localctx).t =  (((TypeContext)_localctx).NOTTERMINAL!=null?((TypeContext)_localctx).NOTTERMINAL.getText():null); 
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

	public static class ProductionsCommonContext extends ParserRuleContext {
		public List<Production> productionsList;
		public ProductionsContext productions;
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public ProductionsContext productions() {
			return getRuleContext(ProductionsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public ProductionsCommonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productionsCommon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProductionsCommon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProductionsCommon(this);
		}
	}

	public final ProductionsCommonContext productionsCommon() throws RecognitionException {
		ProductionsCommonContext _localctx = new ProductionsCommonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_productionsCommon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(COLON);
			setState(119);
			((ProductionsCommonContext)_localctx).productions = productions();
			setState(120);
			match(SEMICOLON);
			 ((ProductionsCommonContext)_localctx).productionsList =  ((ProductionsCommonContext)_localctx).productions.productionsList; 
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

	public static class ProductionsContext extends ParserRuleContext {
		public List<Production> productionsList;
		public ProductionContext production;
		public List<ProductionContext> production() {
			return getRuleContexts(ProductionContext.class);
		}
		public ProductionContext production(int i) {
			return getRuleContext(ProductionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GrammarParser.OR, i);
		}
		public ProductionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProductions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProductions(this);
		}
	}

	public final ProductionsContext productions() throws RecognitionException {
		ProductionsContext _localctx = new ProductionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_productions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((ProductionsContext)_localctx).production = production();
			 ((ProductionsContext)_localctx).productionsList =  new ArrayList<>();  
			 _localctx.productionsList.add(((ProductionsContext)_localctx).production.val);       
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(126);
				match(OR);
				setState(127);
				((ProductionsContext)_localctx).production = production();
				 _localctx.productionsList.add(((ProductionsContext)_localctx).production.val); 
				}
				}
				setState(134);
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

	public static class ProductionContext extends ParserRuleContext {
		public Production val;
		public TokenssContext tokenss;
		public TokenssContext tokenss() {
			return getRuleContext(TokenssContext.class,0);
		}
		public ProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_production; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProduction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProduction(this);
		}
	}

	public final ProductionContext production() throws RecognitionException {
		ProductionContext _localctx = new ProductionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_production);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((ProductionContext)_localctx).tokenss = tokenss();
			 ((ProductionContext)_localctx).val =  new Production(((ProductionContext)_localctx).tokenss.tokenList); 
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

	public static class TokenssContext extends ParserRuleContext {
		public List<MyToken> tokenList;
		public TokenContext token;
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public TokenssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTokenss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTokenss(this);
		}
	}

	public final TokenssContext tokenss() throws RecognitionException {
		TokenssContext _localctx = new TokenssContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tokenss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((TokenssContext)_localctx).token = token();
			 ((TokenssContext)_localctx).tokenList =  new ArrayList<>();   
			 _localctx.tokenList.add(((TokenssContext)_localctx).token.val);       
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TERMINAL) | (1L << NOTTERMINAL) | (1L << JAVA_CODE))) != 0)) {
				{
				{
				setState(141);
				((TokenssContext)_localctx).token = token();
				 _localctx.tokenList.add(((TokenssContext)_localctx).token.val);       
				}
				}
				setState(148);
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

	public static class TokenContext extends ParserRuleContext {
		public MyToken val;
		public Token TERMINAL;
		public Token NOTTERMINAL;
		public Token JAVA_CODE;
		public Token IN_VALUE;
		public TerminalNode TERMINAL() { return getToken(GrammarParser.TERMINAL, 0); }
		public TerminalNode NOTTERMINAL() { return getToken(GrammarParser.NOTTERMINAL, 0); }
		public TerminalNode JAVA_CODE() { return getToken(GrammarParser.JAVA_CODE, 0); }
		public TerminalNode IN_VALUE() { return getToken(GrammarParser.IN_VALUE, 0); }
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_token);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((TokenContext)_localctx).TERMINAL = match(TERMINAL);
				 ((TokenContext)_localctx).val =  new Terminal((((TokenContext)_localctx).TERMINAL!=null?((TokenContext)_localctx).TERMINAL.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				((TokenContext)_localctx).NOTTERMINAL = match(NOTTERMINAL);
				 ((TokenContext)_localctx).val =  new NotTerminal((((TokenContext)_localctx).NOTTERMINAL!=null?((TokenContext)_localctx).NOTTERMINAL.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				((TokenContext)_localctx).JAVA_CODE = match(JAVA_CODE);
				 ((TokenContext)_localctx).val =  new JavaCode((((TokenContext)_localctx).JAVA_CODE!=null?((TokenContext)_localctx).JAVA_CODE.getText():null)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				((TokenContext)_localctx).NOTTERMINAL = match(NOTTERMINAL);
				setState(156);
				((TokenContext)_localctx).IN_VALUE = match(IN_VALUE);
				 ((TokenContext)_localctx).val =  new NotTerminal((((TokenContext)_localctx).NOTTERMINAL!=null?((TokenContext)_localctx).NOTTERMINAL.getText():null), (((TokenContext)_localctx).IN_VALUE!=null?((TokenContext)_localctx).IN_VALUE.getText():null)); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u00a3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7h\n\7"+
		"\f\7\16\7k\13\7\5\7m\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tw\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0085\n\13\f"+
		"\13\16\13\u0088\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0093\n"+
		"\r\f\r\16\r\u0096\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00a1\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u00a2"+
		"\2\34\3\2\2\2\4#\3\2\2\2\6.\3\2\2\2\b\64\3\2\2\2\n]\3\2\2\2\fl\3\2\2\2"+
		"\16n\3\2\2\2\20v\3\2\2\2\22x\3\2\2\2\24}\3\2\2\2\26\u0089\3\2\2\2\30\u008c"+
		"\3\2\2\2\32\u00a0\3\2\2\2\34\35\7\17\2\2\35\36\7\24\2\2\36\37\7\21\2\2"+
		"\37 \5\b\5\2 !\5\4\3\2!\"\b\2\1\2\"\3\3\2\2\2#$\5\6\4\2$%\b\3\1\2%+\b"+
		"\3\1\2&\'\5\6\4\2\'(\b\3\1\2(*\3\2\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+"+
		",\3\2\2\2,\5\3\2\2\2-+\3\2\2\2./\7\20\2\2/\60\7\5\2\2\60\61\7\22\2\2\61"+
		"\62\7\6\2\2\62\63\b\4\1\2\63\7\3\2\2\2\64\65\5\n\6\2\65\66\b\5\1\2\66"+
		"<\b\5\1\2\678\5\n\6\289\b\5\1\29;\3\2\2\2:\67\3\2\2\2;>\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=\t\3\2\2\2><\3\2\2\2?@\7\21\2\2@A\5\22\n\2AB\b\6\1\2B^"+
		"\3\2\2\2CD\7\21\2\2DE\7\4\2\2EF\7\13\2\2FG\5\16\b\2GH\7\f\2\2HI\5\22\n"+
		"\2IJ\b\6\1\2J^\3\2\2\2KL\7\21\2\2LM\7\13\2\2MN\5\f\7\2NO\7\f\2\2OP\5\22"+
		"\n\2PQ\b\6\1\2Q^\3\2\2\2RS\7\21\2\2ST\7\13\2\2TU\5\f\7\2UV\7\f\2\2VW\7"+
		"\4\2\2WX\7\13\2\2XY\5\16\b\2YZ\7\f\2\2Z[\5\22\n\2[\\\b\6\1\2\\^\3\2\2"+
		"\2]?\3\2\2\2]C\3\2\2\2]K\3\2\2\2]R\3\2\2\2^\13\3\2\2\2_`\5\16\b\2`a\b"+
		"\7\1\2ab\b\7\1\2bm\3\2\2\2cd\7\r\2\2de\5\16\b\2ef\b\7\1\2fh\3\2\2\2gc"+
		"\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2l_\3\2\2\2l"+
		"i\3\2\2\2m\r\3\2\2\2no\5\20\t\2op\7\21\2\2pq\b\b\1\2q\17\3\2\2\2rs\7\24"+
		"\2\2sw\b\t\1\2tu\7\21\2\2uw\b\t\1\2vr\3\2\2\2vt\3\2\2\2w\21\3\2\2\2xy"+
		"\7\5\2\2yz\5\24\13\2z{\7\6\2\2{|\b\n\1\2|\23\3\2\2\2}~\5\26\f\2~\177\b"+
		"\13\1\2\177\u0086\b\13\1\2\u0080\u0081\7\16\2\2\u0081\u0082\5\26\f\2\u0082"+
		"\u0083\b\13\1\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\25\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\5\30\r\2\u008a\u008b\b\f\1\2\u008b\27\3\2\2"+
		"\2\u008c\u008d\5\32\16\2\u008d\u008e\b\r\1\2\u008e\u0094\b\r\1\2\u008f"+
		"\u0090\5\32\16\2\u0090\u0091\b\r\1\2\u0091\u0093\3\2\2\2\u0092\u008f\3"+
		"\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\31\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\20\2\2\u0098\u00a1\b\16"+
		"\1\2\u0099\u009a\7\21\2\2\u009a\u00a1\b\16\1\2\u009b\u009c\7\23\2\2\u009c"+
		"\u00a1\b\16\1\2\u009d\u009e\7\21\2\2\u009e\u009f\7\25\2\2\u009f\u00a1"+
		"\b\16\1\2\u00a0\u0097\3\2\2\2\u00a0\u0099\3\2\2\2\u00a0\u009b\3\2\2\2"+
		"\u00a0\u009d\3\2\2\2\u00a1\33\3\2\2\2\13+<]ilv\u0086\u0094\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}