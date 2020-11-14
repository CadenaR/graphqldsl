// Generated from /home/cadena/Documents/GitHub/graphqldsl/src/GraphQL.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraphQLParser}.
 */
public interface GraphQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(GraphQLParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(GraphQLParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(GraphQLParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(GraphQLParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#inputTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputTypeDefinition(GraphQLParser.InputTypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#inputTypeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputTypeDefinition(GraphQLParser.InputTypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(GraphQLParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(GraphQLParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(GraphQLParser.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(GraphQLParser.InterfaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#unionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnionDefinition(GraphQLParser.UnionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#unionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnionDefinition(GraphQLParser.UnionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#interfaceImplementation}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceImplementation(GraphQLParser.InterfaceImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#interfaceImplementation}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceImplementation(GraphQLParser.InterfaceImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#fieldDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinitions(GraphQLParser.FieldDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#fieldDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinitions(GraphQLParser.FieldDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFieldDefinition(GraphQLParser.FieldDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#fieldDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFieldDefinition(GraphQLParser.FieldDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#enumFields}.
	 * @param ctx the parse tree
	 */
	void enterEnumFields(GraphQLParser.EnumFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#enumFields}.
	 * @param ctx the parse tree
	 */
	void exitEnumFields(GraphQLParser.EnumFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(GraphQLParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(GraphQLParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(GraphQLParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(GraphQLParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#operationDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOperationDefinition(GraphQLParser.OperationDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#operationDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOperationDefinition(GraphQLParser.OperationDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#namedOperationDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamedOperationDefinition(GraphQLParser.NamedOperationDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#namedOperationDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamedOperationDefinition(GraphQLParser.NamedOperationDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#operationType}.
	 * @param ctx the parse tree
	 */
	void enterOperationType(GraphQLParser.OperationTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#operationType}.
	 * @param ctx the parse tree
	 */
	void exitOperationType(GraphQLParser.OperationTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#variableDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitions(GraphQLParser.VariableDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#variableDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitions(GraphQLParser.VariableDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(GraphQLParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(GraphQLParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(GraphQLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(GraphQLParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GraphQLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GraphQLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(GraphQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(GraphQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#namedType}.
	 * @param ctx the parse tree
	 */
	void enterNamedType(GraphQLParser.NamedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#namedType}.
	 * @param ctx the parse tree
	 */
	void exitNamedType(GraphQLParser.NamedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(GraphQLParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(GraphQLParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#nonNullNamedType}.
	 * @param ctx the parse tree
	 */
	void enterNonNullNamedType(GraphQLParser.NonNullNamedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#nonNullNamedType}.
	 * @param ctx the parse tree
	 */
	void exitNonNullNamedType(GraphQLParser.NonNullNamedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#nonNullListType}.
	 * @param ctx the parse tree
	 */
	void enterNonNullListType(GraphQLParser.NonNullListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#nonNullListType}.
	 * @param ctx the parse tree
	 */
	void exitNonNullListType(GraphQLParser.NonNullListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#selectionSet}.
	 * @param ctx the parse tree
	 */
	void enterSelectionSet(GraphQLParser.SelectionSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#selectionSet}.
	 * @param ctx the parse tree
	 */
	void exitSelectionSet(GraphQLParser.SelectionSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(GraphQLParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(GraphQLParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(GraphQLParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(GraphQLParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(GraphQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(GraphQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#fragmentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFragmentDefinition(GraphQLParser.FragmentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#fragmentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFragmentDefinition(GraphQLParser.FragmentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#fragmentSpread}.
	 * @param ctx the parse tree
	 */
	void enterFragmentSpread(GraphQLParser.FragmentSpreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#fragmentSpread}.
	 * @param ctx the parse tree
	 */
	void exitFragmentSpread(GraphQLParser.FragmentSpreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#inlineFragment}.
	 * @param ctx the parse tree
	 */
	void enterInlineFragment(GraphQLParser.InlineFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#inlineFragment}.
	 * @param ctx the parse tree
	 */
	void exitInlineFragment(GraphQLParser.InlineFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#fragmentName}.
	 * @param ctx the parse tree
	 */
	void enterFragmentName(GraphQLParser.FragmentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#fragmentName}.
	 * @param ctx the parse tree
	 */
	void exitFragmentName(GraphQLParser.FragmentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#typeCondition}.
	 * @param ctx the parse tree
	 */
	void enterTypeCondition(GraphQLParser.TypeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#typeCondition}.
	 * @param ctx the parse tree
	 */
	void exitTypeCondition(GraphQLParser.TypeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#directives}.
	 * @param ctx the parse tree
	 */
	void enterDirectives(GraphQLParser.DirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#directives}.
	 * @param ctx the parse tree
	 */
	void exitDirectives(GraphQLParser.DirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(GraphQLParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(GraphQLParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GraphQLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GraphQLParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GraphQLParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GraphQLParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GraphQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GraphQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(GraphQLParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(GraphQLParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#listValue}.
	 * @param ctx the parse tree
	 */
	void enterListValue(GraphQLParser.ListValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#listValue}.
	 * @param ctx the parse tree
	 */
	void exitListValue(GraphQLParser.ListValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraphQLParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(GraphQLParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraphQLParser#objectValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(GraphQLParser.ObjectValueContext ctx);
}