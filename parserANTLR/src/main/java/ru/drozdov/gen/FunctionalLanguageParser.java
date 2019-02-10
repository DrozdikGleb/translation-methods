// Generated from /Users/glebdrozdov/IdeaProjects/translation-methods/parserANTLR/src/main/antlrgrammar/FunctionalLanguage.g4 by ANTLR 4.7

    package ru.drozdov.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionalLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ASSIGN=3, SEMICOLON=4, COLON=5, ARROW=6, DOUBLECOLON=7, 
		CONDITIONDIVIDER=8, INT=9, BOOLEAN=10, DOUBLE=11, ALL_TYPES=12, STRING=13, 
		OPERATIONS=14, BRACKETS=15, CONDITION_LEXEM=16, RETURN_LEXEM=17, EXPR=18, 
		TYPE=19, NAME=20, WS=21;
	public static final int
		RULE_start = 0, RULE_functions = 1, RULE_function = 2, RULE_input_return_types = 3, 
		RULE_input_types = 4, RULE_type = 5, RULE_return_type = 6, RULE_method_declaration = 7, 
		RULE_declaration = 8, RULE_inputs_output = 9, RULE_defaultBranch = 10, 
		RULE_inputs = 11, RULE_condition_parser = 12, RULE_var = 13, RULE_condition = 14, 
		RULE_input = 15, RULE_output = 16, RULE_recursion = 17;
	public static final String[] ruleNames = {
		"start", "functions", "function", "input_return_types", "input_types", 
		"type", "return_type", "method_declaration", "declaration", "inputs_output", 
		"defaultBranch", "inputs", "condition_parser", "var", "condition", "input", 
		"output", "recursion"
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

	@Override
	public String getGrammarFileName() { return "FunctionalLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionalLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FunctionalLanguageParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			functions();
			setState(37);
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

	public static class FunctionsContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(39);
				function();
				}
				}
				setState(44);
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

	public static class FunctionContext extends ParserRuleContext {
		public Input_return_typesContext input_return_types() {
			return getRuleContext(Input_return_typesContext.class,0);
		}
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			input_return_types();
			setState(46);
			method_declaration();
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

	public static class Input_return_typesContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FunctionalLanguageParser.NAME, 0); }
		public TerminalNode DOUBLECOLON() { return getToken(FunctionalLanguageParser.DOUBLECOLON, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public List<Input_typesContext> input_types() {
			return getRuleContexts(Input_typesContext.class);
		}
		public Input_typesContext input_types(int i) {
			return getRuleContext(Input_typesContext.class,i);
		}
		public List<TerminalNode> ARROW() { return getTokens(FunctionalLanguageParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(FunctionalLanguageParser.ARROW, i);
		}
		public Input_return_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_return_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterInput_return_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitInput_return_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitInput_return_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_return_typesContext input_return_types() throws RecognitionException {
		Input_return_typesContext _localctx = new Input_return_typesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_return_types);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NAME);
			setState(49);
			match(DOUBLECOLON);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					input_types();
					setState(51);
					match(ARROW);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			return_type();
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

	public static class Input_typesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ARROW() { return getTokens(FunctionalLanguageParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(FunctionalLanguageParser.ARROW, i);
		}
		public Input_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterInput_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitInput_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitInput_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_typesContext input_types() throws RecognitionException {
		Input_typesContext _localctx = new Input_typesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input_types);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					match(ARROW);
					setState(62);
					type();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(FunctionalLanguageParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(FunctionalLanguageParser.NAME, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(TYPE);
			setState(69);
			match(NAME);
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

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(FunctionalLanguageParser.TYPE, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(TYPE);
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

	public static class Method_declarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FunctionalLanguageParser.NAME, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionalLanguageParser.SEMICOLON, 0); }
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(NAME);
			setState(74);
			declaration();
			setState(75);
			match(SEMICOLON);
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<Inputs_outputContext> inputs_output() {
			return getRuleContexts(Inputs_outputContext.class);
		}
		public Inputs_outputContext inputs_output(int i) {
			return getRuleContext(Inputs_outputContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(FunctionalLanguageParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(FunctionalLanguageParser.COLON, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			inputs_output();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(78);
				match(COLON);
				setState(79);
				inputs_output();
				}
				}
				setState(84);
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

	public static class Inputs_outputContext extends ParserRuleContext {
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionalLanguageParser.ASSIGN, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public DefaultBranchContext defaultBranch() {
			return getRuleContext(DefaultBranchContext.class,0);
		}
		public Inputs_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterInputs_output(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitInputs_output(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitInputs_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inputs_outputContext inputs_output() throws RecognitionException {
		Inputs_outputContext _localctx = new Inputs_outputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inputs_output);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case STRING:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				inputs();
				setState(86);
				match(ASSIGN);
				setState(87);
				output();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(ASSIGN);
				setState(90);
				defaultBranch();
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

	public static class DefaultBranchContext extends ParserRuleContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public DefaultBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterDefaultBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitDefaultBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitDefaultBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultBranchContext defaultBranch() throws RecognitionException {
		DefaultBranchContext _localctx = new DefaultBranchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defaultBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			output();
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

	public static class InputsContext extends ParserRuleContext {
		public Condition_parserContext condition_parser() {
			return getRuleContext(Condition_parserContext.class,0);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inputs);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				condition_parser();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					input();
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << NAME))) != 0) );
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

	public static class Condition_parserContext extends ParserRuleContext {
		public TerminalNode CONDITIONDIVIDER() { return getToken(FunctionalLanguageParser.CONDITIONDIVIDER, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Condition_parserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_parser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterCondition_parser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitCondition_parser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitCondition_parser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_parserContext condition_parser() throws RecognitionException {
		Condition_parserContext _localctx = new Condition_parserContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition_parser);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				var();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(108);
			match(CONDITIONDIVIDER);
			setState(109);
			condition();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FunctionalLanguageParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(NAME);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode CONDITION_LEXEM() { return getToken(FunctionalLanguageParser.CONDITION_LEXEM, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(CONDITION_LEXEM);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FunctionalLanguageParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(FunctionalLanguageParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(FunctionalLanguageParser.STRING, 0); }
		public TerminalNode NAME() { return getToken(FunctionalLanguageParser.NAME, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << NAME))) != 0)) ) {
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FunctionalLanguageParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(FunctionalLanguageParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(FunctionalLanguageParser.STRING, 0); }
		public TerminalNode RETURN_LEXEM() { return getToken(FunctionalLanguageParser.RETURN_LEXEM, 0); }
		public RecursionContext recursion() {
			return getRuleContext(RecursionContext.class,0);
		}
		public TerminalNode NAME() { return getToken(FunctionalLanguageParser.NAME, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_output);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(DOUBLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(RETURN_LEXEM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				recursion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(NAME);
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

	public static class RecursionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FunctionalLanguageParser.NAME, 0); }
		public TerminalNode EXPR() { return getToken(FunctionalLanguageParser.EXPR, 0); }
		public RecursionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).enterRecursion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionalLanguageListener ) ((FunctionalLanguageListener)listener).exitRecursion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionalLanguageVisitor ) return ((FunctionalLanguageVisitor<? extends T>)visitor).visitRecursion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursionContext recursion() throws RecognitionException {
		RecursionContext _localctx = new RecursionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_recursion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(NAME);
			setState(126);
			match(T__0);
			setState(127);
			match(EXPR);
			setState(128);
			match(T__1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\3\5\3\6\3\6\3\6\7\6B\n\6\f\6"+
		"\16\6E\13\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nS\n\n\f"+
		"\n\16\nV\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13^\n\13\3\f\3\f\3\r\3\r"+
		"\6\rd\n\r\r\r\16\re\5\rh\n\r\3\16\6\16k\n\16\r\16\16\16l\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22~\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\3\6\2\13\13\r\r\17\17\26\26\2\177\2&\3\2\2\2\4,\3\2\2\2\6"+
		"/\3\2\2\2\b\62\3\2\2\2\n>\3\2\2\2\fF\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22"+
		"O\3\2\2\2\24]\3\2\2\2\26_\3\2\2\2\30g\3\2\2\2\32j\3\2\2\2\34q\3\2\2\2"+
		"\36s\3\2\2\2 u\3\2\2\2\"}\3\2\2\2$\177\3\2\2\2&\'\5\4\3\2\'(\7\2\2\3("+
		"\3\3\2\2\2)+\5\6\4\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\5\3\2\2"+
		"\2.,\3\2\2\2/\60\5\b\5\2\60\61\5\20\t\2\61\7\3\2\2\2\62\63\7\26\2\2\63"+
		"9\7\t\2\2\64\65\5\n\6\2\65\66\7\b\2\2\668\3\2\2\2\67\64\3\2\2\28;\3\2"+
		"\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\5\16\b\2=\t\3\2\2\2>"+
		"C\5\f\7\2?@\7\b\2\2@B\5\f\7\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2"+
		"D\13\3\2\2\2EC\3\2\2\2FG\7\25\2\2GH\7\26\2\2H\r\3\2\2\2IJ\7\25\2\2J\17"+
		"\3\2\2\2KL\7\26\2\2LM\5\22\n\2MN\7\6\2\2N\21\3\2\2\2OT\5\24\13\2PQ\7\7"+
		"\2\2QS\5\24\13\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\23\3\2\2\2V"+
		"T\3\2\2\2WX\5\30\r\2XY\7\5\2\2YZ\5\"\22\2Z^\3\2\2\2[\\\7\5\2\2\\^\5\26"+
		"\f\2]W\3\2\2\2][\3\2\2\2^\25\3\2\2\2_`\5\"\22\2`\27\3\2\2\2ah\5\32\16"+
		"\2bd\5 \21\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ga\3\2\2"+
		"\2gc\3\2\2\2h\31\3\2\2\2ik\5\34\17\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2mn\3\2\2\2no\7\n\2\2op\5\36\20\2p\33\3\2\2\2qr\7\26\2\2r\35\3\2"+
		"\2\2st\7\22\2\2t\37\3\2\2\2uv\t\2\2\2v!\3\2\2\2w~\7\13\2\2x~\7\r\2\2y"+
		"~\7\17\2\2z~\7\23\2\2{~\5$\23\2|~\7\26\2\2}w\3\2\2\2}x\3\2\2\2}y\3\2\2"+
		"\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~#\3\2\2\2\177\u0080\7\26\2\2\u0080\u0081"+
		"\7\3\2\2\u0081\u0082\7\24\2\2\u0082\u0083\7\4\2\2\u0083%\3\2\2\2\13,9"+
		"CT]egl}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}