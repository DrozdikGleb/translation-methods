// Generated from /Users/glebdrozdov/IdeaProjects/translation-methods/parserANTLR/src/main/antlrgrammar/FunctionalLanguage.g4 by ANTLR 4.7

    package ru.drozdov.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionalLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionalLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(FunctionalLanguageParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions(FunctionalLanguageParser.FunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionalLanguageParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#input_return_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_return_types(FunctionalLanguageParser.Input_return_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#input_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_types(FunctionalLanguageParser.Input_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FunctionalLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(FunctionalLanguageParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(FunctionalLanguageParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(FunctionalLanguageParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#inputs_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs_output(FunctionalLanguageParser.Inputs_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#defaultBranch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBranch(FunctionalLanguageParser.DefaultBranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(FunctionalLanguageParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#condition_parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_parser(FunctionalLanguageParser.Condition_parserContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(FunctionalLanguageParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FunctionalLanguageParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(FunctionalLanguageParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(FunctionalLanguageParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionalLanguageParser#recursion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursion(FunctionalLanguageParser.RecursionContext ctx);
}