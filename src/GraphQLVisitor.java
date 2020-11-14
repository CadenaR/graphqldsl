// Generated from /home/cadena/Documents/GitHub/graphqldsl/src/GraphQL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraphQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraphQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema(GraphQLParser.SchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(GraphQLParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#inputTypeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputTypeDefinition(GraphQLParser.InputTypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#enumDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDefinition(GraphQLParser.EnumDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefinition(GraphQLParser.InterfaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#unionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionDefinition(GraphQLParser.UnionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#interfaceImplementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceImplementation(GraphQLParser.InterfaceImplementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#fieldDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinitions(GraphQLParser.FieldDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#fieldDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDefinition(GraphQLParser.FieldDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#enumFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumFields(GraphQLParser.EnumFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(GraphQLParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(GraphQLParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#operationDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDefinition(GraphQLParser.OperationDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#namedOperationDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedOperationDefinition(GraphQLParser.NamedOperationDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#operationType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationType(GraphQLParser.OperationTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#variableDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinitions(GraphQLParser.VariableDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(GraphQLParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(GraphQLParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GraphQLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(GraphQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#namedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedType(GraphQLParser.NamedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(GraphQLParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#nonNullNamedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonNullNamedType(GraphQLParser.NonNullNamedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#nonNullListType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonNullListType(GraphQLParser.NonNullListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#selectionSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionSet(GraphQLParser.SelectionSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(GraphQLParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(GraphQLParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(GraphQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#fragmentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentDefinition(GraphQLParser.FragmentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#fragmentSpread}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentSpread(GraphQLParser.FragmentSpreadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#inlineFragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineFragment(GraphQLParser.InlineFragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#fragmentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentName(GraphQLParser.FragmentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#typeCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCondition(GraphQLParser.TypeConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectives(GraphQLParser.DirectivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(GraphQLParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GraphQLParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(GraphQLParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(GraphQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(GraphQLParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#listValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValue(GraphQLParser.ListValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraphQLParser#objectValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(GraphQLParser.ObjectValueContext ctx);
}