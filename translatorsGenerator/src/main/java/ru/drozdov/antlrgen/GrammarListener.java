// Generated from /Users/glebdrozdov/IdeaProjects/translation-methods/translatorsGenerator/src/main/antlrgrammar/Grammar.g4 by ANTLR 4.7

    package ru.drozdov.antlrgen;
    import  ru.drozdov.generator.tokens.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(GrammarParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(GrammarParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#notterms}.
	 * @param ctx the parse tree
	 */
	void enterNotterms(GrammarParser.NottermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#notterms}.
	 * @param ctx the parse tree
	 */
	void exitNotterms(GrammarParser.NottermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#notterm}.
	 * @param ctx the parse tree
	 */
	void enterNotterm(GrammarParser.NottermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#notterm}.
	 * @param ctx the parse tree
	 */
	void exitNotterm(GrammarParser.NottermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrammarParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#productionsCommon}.
	 * @param ctx the parse tree
	 */
	void enterProductionsCommon(GrammarParser.ProductionsCommonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#productionsCommon}.
	 * @param ctx the parse tree
	 */
	void exitProductionsCommon(GrammarParser.ProductionsCommonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#productions}.
	 * @param ctx the parse tree
	 */
	void enterProductions(GrammarParser.ProductionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#productions}.
	 * @param ctx the parse tree
	 */
	void exitProductions(GrammarParser.ProductionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#production}.
	 * @param ctx the parse tree
	 */
	void enterProduction(GrammarParser.ProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#production}.
	 * @param ctx the parse tree
	 */
	void exitProduction(GrammarParser.ProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tokenss}.
	 * @param ctx the parse tree
	 */
	void enterTokenss(GrammarParser.TokenssContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tokenss}.
	 * @param ctx the parse tree
	 */
	void exitTokenss(GrammarParser.TokenssContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(GrammarParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(GrammarParser.TokenContext ctx);
}