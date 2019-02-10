// Generated from /Users/glebdrozdov/IdeaProjects/translation-methods/parserANTLR/src/main/antlrgrammar/FunctionalLanguage.g4 by ANTLR 4.7

    package ru.drozdov.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionalLanguageParser}.
 */
public interface FunctionalLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FunctionalLanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FunctionalLanguageParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(FunctionalLanguageParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(FunctionalLanguageParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionalLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionalLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#input_return_types}.
	 * @param ctx the parse tree
	 */
	void enterInput_return_types(FunctionalLanguageParser.Input_return_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#input_return_types}.
	 * @param ctx the parse tree
	 */
	void exitInput_return_types(FunctionalLanguageParser.Input_return_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#input_types}.
	 * @param ctx the parse tree
	 */
	void enterInput_types(FunctionalLanguageParser.Input_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#input_types}.
	 * @param ctx the parse tree
	 */
	void exitInput_types(FunctionalLanguageParser.Input_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FunctionalLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FunctionalLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(FunctionalLanguageParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(FunctionalLanguageParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(FunctionalLanguageParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(FunctionalLanguageParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FunctionalLanguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FunctionalLanguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#inputs_output}.
	 * @param ctx the parse tree
	 */
	void enterInputs_output(FunctionalLanguageParser.Inputs_outputContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#inputs_output}.
	 * @param ctx the parse tree
	 */
	void exitInputs_output(FunctionalLanguageParser.Inputs_outputContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBranch(FunctionalLanguageParser.DefaultBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#defaultBranch}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBranch(FunctionalLanguageParser.DefaultBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(FunctionalLanguageParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(FunctionalLanguageParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#condition_parser}.
	 * @param ctx the parse tree
	 */
	void enterCondition_parser(FunctionalLanguageParser.Condition_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#condition_parser}.
	 * @param ctx the parse tree
	 */
	void exitCondition_parser(FunctionalLanguageParser.Condition_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(FunctionalLanguageParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(FunctionalLanguageParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FunctionalLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FunctionalLanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(FunctionalLanguageParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(FunctionalLanguageParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(FunctionalLanguageParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(FunctionalLanguageParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionalLanguageParser#recursion}.
	 * @param ctx the parse tree
	 */
	void enterRecursion(FunctionalLanguageParser.RecursionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionalLanguageParser#recursion}.
	 * @param ctx the parse tree
	 */
	void exitRecursion(FunctionalLanguageParser.RecursionContext ctx);
}