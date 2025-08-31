// Generated from C:/Users/Lenovo/Downloads/Telegram Desktop/compiler (8) (5) (5)/compiler (8) (5) (3)/compiler (8) (5)/compiler (8)/compiler/src/antlr/AngulerParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngulerParser}.
 */
public interface AngulerParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngulerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(AngulerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(AngulerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#injectable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInjectable_declaration(AngulerParser.Injectable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#injectable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInjectable_declaration(AngulerParser.Injectable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#injectable_metadata}.
	 * @param ctx the parse tree
	 */
	void enterInjectable_metadata(AngulerParser.Injectable_metadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#injectable_metadata}.
	 * @param ctx the parse tree
	 */
	void exitInjectable_metadata(AngulerParser.Injectable_metadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#injectable_metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterInjectable_metadata_property(AngulerParser.Injectable_metadata_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#injectable_metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitInjectable_metadata_property(AngulerParser.Injectable_metadata_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#export_statement}.
	 * @param ctx the parse tree
	 */
	void enterExport_statement(AngulerParser.Export_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#export_statement}.
	 * @param ctx the parse tree
	 */
	void exitExport_statement(AngulerParser.Export_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#anguler_import}.
	 * @param ctx the parse tree
	 */
	void enterAnguler_import(AngulerParser.Anguler_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#anguler_import}.
	 * @param ctx the parse tree
	 */
	void exitAnguler_import(AngulerParser.Anguler_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void enterComponent_declaration(AngulerParser.Component_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#component_declaration}.
	 * @param ctx the parse tree
	 */
	void exitComponent_declaration(AngulerParser.Component_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void enterComponent_metadata(AngulerParser.Component_metadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#component_metadata}.
	 * @param ctx the parse tree
	 */
	void exitComponent_metadata(AngulerParser.Component_metadataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataSelector}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataSelector(AngulerParser.MetadataSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataSelector}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataSelector(AngulerParser.MetadataSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataStandalone}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataStandalone(AngulerParser.MetadataStandaloneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataStandalone}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataStandalone(AngulerParser.MetadataStandaloneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataImports}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataImports(AngulerParser.MetadataImportsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataImports}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataImports(AngulerParser.MetadataImportsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataTemplate}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataTemplate(AngulerParser.MetadataTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataTemplate}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataTemplate(AngulerParser.MetadataTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataTemplateUrl}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataTemplateUrl(AngulerParser.MetadataTemplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataTemplateUrl}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataTemplateUrl(AngulerParser.MetadataTemplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataStyles}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataStyles(AngulerParser.MetadataStylesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataStyles}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataStyles(AngulerParser.MetadataStylesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metadataStyleUrls}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void enterMetadataStyleUrls(AngulerParser.MetadataStyleUrlsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metadataStyleUrls}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 */
	void exitMetadataStyleUrls(AngulerParser.MetadataStyleUrlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterType_annotation(AngulerParser.Type_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitType_annotation(AngulerParser.Type_annotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(AngulerParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(AngulerParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(AngulerParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(AngulerParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterNullType(AngulerParser.NullTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitNullType(AngulerParser.NullTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(AngulerParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(AngulerParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structuredType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(AngulerParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structuredType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(AngulerParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(AngulerParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(AngulerParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_type(AngulerParser.Primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_type(AngulerParser.Primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(AngulerParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(AngulerParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#structured_type}.
	 * @param ctx the parse tree
	 */
	void enterStructured_type(AngulerParser.Structured_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#structured_type}.
	 * @param ctx the parse tree
	 */
	void exitStructured_type(AngulerParser.Structured_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#type_pair}.
	 * @param ctx the parse tree
	 */
	void enterType_pair(AngulerParser.Type_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#type_pair}.
	 * @param ctx the parse tree
	 */
	void exitType_pair(AngulerParser.Type_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(AngulerParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(AngulerParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(AngulerParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(AngulerParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(AngulerParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(AngulerParser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(AngulerParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(AngulerParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(AngulerParser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(AngulerParser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(AngulerParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(AngulerParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(AngulerParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(AngulerParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#emit_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmit_statement(AngulerParser.Emit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#emit_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmit_statement(AngulerParser.Emit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(AngulerParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(AngulerParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngulerParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngulerParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#declaraiton_keywords}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraiton_keywords(AngulerParser.Declaraiton_keywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#declaraiton_keywords}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraiton_keywords(AngulerParser.Declaraiton_keywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(AngulerParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(AngulerParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryLiteral}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryLiteral(AngulerParser.PrimaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryLiteral}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryLiteral(AngulerParser.PrimaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryIdentifier}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryIdentifier(AngulerParser.PrimaryIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryIdentifier}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryIdentifier(AngulerParser.PrimaryIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryEmptyParens}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryEmptyParens(AngulerParser.PrimaryEmptyParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryEmptyParens}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryEmptyParens(AngulerParser.PrimaryEmptyParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryNull}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNull(AngulerParser.PrimaryNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryNull}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNull(AngulerParser.PrimaryNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryJsonObject}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryJsonObject(AngulerParser.PrimaryJsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryJsonObject}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryJsonObject(AngulerParser.PrimaryJsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryArray}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryArray(AngulerParser.PrimaryArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryArray}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryArray(AngulerParser.PrimaryArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryBoolean}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBoolean(AngulerParser.PrimaryBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryBoolean}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBoolean(AngulerParser.PrimaryBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryThis}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryThis(AngulerParser.PrimaryThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryThis}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryThis(AngulerParser.PrimaryThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primarySuper}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimarySuper(AngulerParser.PrimarySuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primarySuper}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimarySuper(AngulerParser.PrimarySuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(AngulerParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(AngulerParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spreadExpression}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterSpreadExpression(AngulerParser.SpreadExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spreadExpression}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitSpreadExpression(AngulerParser.SpreadExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void enterType_arguments(AngulerParser.Type_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void exitType_arguments(AngulerParser.Type_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(AngulerParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(AngulerParser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link AngulerParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(AngulerParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link AngulerParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(AngulerParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link AngulerParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(AngulerParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link AngulerParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(AngulerParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link AngulerParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngulerParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link AngulerParser#postfix_operator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngulerParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(AngulerParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(AngulerParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierValue(AngulerParser.IdentifierValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierValue(AngulerParser.IdentifierValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(AngulerParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(AngulerParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(AngulerParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(AngulerParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(AngulerParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(AngulerParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedValue(AngulerParser.ParenthesizedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedValue(AngulerParser.ParenthesizedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spreadValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterSpreadValue(AngulerParser.SpreadValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spreadValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitSpreadValue(AngulerParser.SpreadValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngulerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngulerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(AngulerParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(AngulerParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(AngulerParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(AngulerParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(AngulerParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(AngulerParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(AngulerParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(AngulerParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(AngulerParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(AngulerParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(AngulerParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(AngulerParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(AngulerParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(AngulerParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(AngulerParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(AngulerParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(AngulerParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(AngulerParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(AngulerParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(AngulerParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(AngulerParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(AngulerParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(AngulerParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(AngulerParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(AngulerParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(AngulerParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(AngulerParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(AngulerParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(AngulerParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(AngulerParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentBoolean}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentBoolean(AngulerParser.AssignmentBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentBoolean}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentBoolean(AngulerParser.AssignmentBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#json_object}.
	 * @param ctx the parse tree
	 */
	void enterJson_object(AngulerParser.Json_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#json_object}.
	 * @param ctx the parse tree
	 */
	void exitJson_object(AngulerParser.Json_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#json_pair}.
	 * @param ctx the parse tree
	 */
	void enterJson_pair(AngulerParser.Json_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#json_pair}.
	 * @param ctx the parse tree
	 */
	void exitJson_pair(AngulerParser.Json_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#imports_array}.
	 * @param ctx the parse tree
	 */
	void enterImports_array(AngulerParser.Imports_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#imports_array}.
	 * @param ctx the parse tree
	 */
	void exitImports_array(AngulerParser.Imports_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngulerParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngulerParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#array_element}.
	 * @param ctx the parse tree
	 */
	void enterArray_element(AngulerParser.Array_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#array_element}.
	 * @param ctx the parse tree
	 */
	void exitArray_element(AngulerParser.Array_elementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(AngulerParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(AngulerParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(AngulerParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(AngulerParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(AngulerParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(AngulerParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emitStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(AngulerParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emitStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(AngulerParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngulerParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngulerParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngulerParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngulerParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(AngulerParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(AngulerParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(AngulerParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(AngulerParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngulerParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngulerParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericType}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(AngulerParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericType}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(AngulerParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngulerParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngulerParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterErrorStatement(AngulerParser.ErrorStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitErrorStatement(AngulerParser.ErrorStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementRule(AngulerParser.IfStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementRule(AngulerParser.IfStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatementRule(AngulerParser.SwitchStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatementRule(AngulerParser.SwitchStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementRule(AngulerParser.WhileStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementRule(AngulerParser.WhileStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatementRule(AngulerParser.DoWhileStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatementRule(AngulerParser.DoWhileStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterForStatementRule(AngulerParser.ForStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitForStatementRule(AngulerParser.ForStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatementRule(AngulerParser.ContinueStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatementRule(AngulerParser.ContinueStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementRule(AngulerParser.ReturnStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementRule(AngulerParser.ReturnStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatementRule(AngulerParser.BreakStatementRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatementRule(AngulerParser.BreakStatementRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngulerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngulerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(AngulerParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(AngulerParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(AngulerParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(AngulerParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(AngulerParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(AngulerParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_body(AngulerParser.Switch_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#switch_body}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_body(AngulerParser.Switch_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_case(AngulerParser.Switch_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#switch_case}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_case(AngulerParser.Switch_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#switch_default}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_default(AngulerParser.Switch_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#switch_default}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_default(AngulerParser.Switch_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(AngulerParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(AngulerParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_statement(AngulerParser.Do_while_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#do_while_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_statement(AngulerParser.Do_while_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#continue_Statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_Statement(AngulerParser.Continue_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#continue_Statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_Statement(AngulerParser.Continue_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#return_Statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_Statement(AngulerParser.Return_StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#return_Statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_Statement(AngulerParser.Return_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(AngulerParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(AngulerParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(AngulerParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(AngulerParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#interface_Declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_Declaration(AngulerParser.Interface_DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#interface_Declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_Declaration(AngulerParser.Interface_DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#generic_Type}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_Type(AngulerParser.Generic_TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#generic_Type}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_Type(AngulerParser.Generic_TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(AngulerParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(AngulerParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedHtml}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterNestedHtml(AngulerParser.NestedHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedHtml}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitNestedHtml(AngulerParser.NestedHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingTag}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(AngulerParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingTag}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(AngulerParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code templateVariable}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterTemplateVariable(AngulerParser.TemplateVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code templateVariable}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitTemplateVariable(AngulerParser.TemplateVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngContent}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterNgContent(AngulerParser.NgContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngContent}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitNgContent(AngulerParser.NgContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngTemplate}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void enterNgTemplate(AngulerParser.NgTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngTemplate}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 */
	void exitNgTemplate(AngulerParser.NgTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(AngulerParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(AngulerParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void enterOpen_tag(AngulerParser.Open_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#open_tag}.
	 * @param ctx the parse tree
	 */
	void exitOpen_tag(AngulerParser.Open_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void enterHtml_attribute(AngulerParser.Html_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 */
	void exitHtml_attribute(AngulerParser.Html_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void enterClose_tag(AngulerParser.Close_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#close_tag}.
	 * @param ctx the parse tree
	 */
	void exitClose_tag(AngulerParser.Close_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#single_tag}.
	 * @param ctx the parse tree
	 */
	void enterSingle_tag(AngulerParser.Single_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#single_tag}.
	 * @param ctx the parse tree
	 */
	void exitSingle_tag(AngulerParser.Single_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#template_variable}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_variable(AngulerParser.Template_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#template_variable}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_variable(AngulerParser.Template_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngulerParser#ng_content}.
	 * @param ctx the parse tree
	 */
	void enterNg_content(AngulerParser.Ng_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngulerParser#ng_content}.
	 * @param ctx the parse tree
	 */
	void exitNg_content(AngulerParser.Ng_contentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngTemplateWithContent}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 */
	void enterNgTemplateWithContent(AngulerParser.NgTemplateWithContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngTemplateWithContent}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 */
	void exitNgTemplateWithContent(AngulerParser.NgTemplateWithContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ngTemplateSelfClosing}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 */
	void enterNgTemplateSelfClosing(AngulerParser.NgTemplateSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ngTemplateSelfClosing}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 */
	void exitNgTemplateSelfClosing(AngulerParser.NgTemplateSelfClosingContext ctx);
}