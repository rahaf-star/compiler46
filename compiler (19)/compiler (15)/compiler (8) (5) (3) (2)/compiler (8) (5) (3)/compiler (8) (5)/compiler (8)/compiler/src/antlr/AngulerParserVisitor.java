// Generated from C:/Users/Lenovo/Downloads/Telegram Desktop/compiler (8) (5) (5)/compiler (8) (5) (3)/compiler (8) (5)/compiler (8)/compiler/src/antlr/AngulerParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngulerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngulerParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngulerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(AngulerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#injectable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectable_declaration(AngulerParser.Injectable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#injectable_metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectable_metadata(AngulerParser.Injectable_metadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#injectable_metadata_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectable_metadata_property(AngulerParser.Injectable_metadata_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#export_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_statement(AngulerParser.Export_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#anguler_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnguler_import(AngulerParser.Anguler_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#component_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_declaration(AngulerParser.Component_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#component_metadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_metadata(AngulerParser.Component_metadataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metadataSelector}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataSelector(AngulerParser.MetadataSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metadataStandalone}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataStandalone(AngulerParser.MetadataStandaloneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metadataImports}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataImports(AngulerParser.MetadataImportsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metadataTemplate}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataTemplate(AngulerParser.MetadataTemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metadataTemplateUrl}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataTemplateUrl(AngulerParser.MetadataTemplateUrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metadataStyles}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataStyles(AngulerParser.MetadataStylesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metadataStyleUrls}
	 * labeled alternative in {@link AngulerParser#metadata_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetadataStyleUrls(AngulerParser.MetadataStyleUrlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotation(AngulerParser.Type_annotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(AngulerParser.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(AngulerParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullType(AngulerParser.NullTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(AngulerParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structuredType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredType(AngulerParser.StructuredTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayType}
	 * labeled alternative in {@link AngulerParser#base_type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(AngulerParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(AngulerParser.Primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(AngulerParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#structured_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructured_type(AngulerParser.Structured_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#type_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_pair(AngulerParser.Type_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(AngulerParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(AngulerParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(AngulerParser.Property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(AngulerParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#method_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(AngulerParser.Method_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(AngulerParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(AngulerParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#emit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmit_statement(AngulerParser.Emit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(AngulerParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngulerParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#declaraiton_keywords}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraiton_keywords(AngulerParser.Declaraiton_keywordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(AngulerParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryLiteral}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryLiteral(AngulerParser.PrimaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryIdentifier}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryIdentifier(AngulerParser.PrimaryIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryEmptyParens}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryEmptyParens(AngulerParser.PrimaryEmptyParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryNull}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNull(AngulerParser.PrimaryNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryJsonObject}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryJsonObject(AngulerParser.PrimaryJsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryArray}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryArray(AngulerParser.PrimaryArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryBoolean}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBoolean(AngulerParser.PrimaryBooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryThis}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryThis(AngulerParser.PrimaryThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primarySuper}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimarySuper(AngulerParser.PrimarySuperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newExpression}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewExpression(AngulerParser.NewExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spreadExpression}
	 * labeled alternative in {@link AngulerParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadExpression(AngulerParser.SpreadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#type_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_arguments(AngulerParser.Type_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(AngulerParser.Postfix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link AngulerParser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(AngulerParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccess}
	 * labeled alternative in {@link AngulerParser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(AngulerParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link AngulerParser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngulerParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValue(AngulerParser.LiteralValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierValue(AngulerParser.IdentifierValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValue(AngulerParser.NullValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(AngulerParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(AngulerParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedValue(AngulerParser.ParenthesizedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spreadValue}
	 * labeled alternative in {@link AngulerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadValue(AngulerParser.SpreadValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AngulerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(AngulerParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(AngulerParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(AngulerParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(AngulerParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(AngulerParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expression(AngulerParser.Arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(AngulerParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(AngulerParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(AngulerParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(AngulerParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(AngulerParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(AngulerParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(AngulerParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(AngulerParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpr}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(AngulerParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentBoolean}
	 * labeled alternative in {@link AngulerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentBoolean(AngulerParser.AssignmentBooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#json_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_object(AngulerParser.Json_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#json_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_pair(AngulerParser.Json_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#imports_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports_array(AngulerParser.Imports_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngulerParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#array_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_element(AngulerParser.Array_elementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(AngulerParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(AngulerParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(AngulerParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emitStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmitStatement(AngulerParser.EmitStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngulerParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngulerParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngulerParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(AngulerParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceDeclaration}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngulerParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericType}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(AngulerParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(AngulerParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorStatement}
	 * labeled alternative in {@link AngulerParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorStatement(AngulerParser.ErrorStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementRule(AngulerParser.IfStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatementRule(AngulerParser.SwitchStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementRule(AngulerParser.WhileStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatementRule(AngulerParser.DoWhileStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementRule(AngulerParser.ForStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatementRule(AngulerParser.ContinueStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementRule(AngulerParser.ReturnStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatementRule}
	 * labeled alternative in {@link AngulerParser#conditional_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatementRule(AngulerParser.BreakStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngulerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(AngulerParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(AngulerParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(AngulerParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#switch_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_body(AngulerParser.Switch_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(AngulerParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#switch_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_default(AngulerParser.Switch_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(AngulerParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(AngulerParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#continue_Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_Statement(AngulerParser.Continue_StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#return_Statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_Statement(AngulerParser.Return_StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(AngulerParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#expressionSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSequence(AngulerParser.ExpressionSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#interface_Declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_Declaration(AngulerParser.Interface_DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#generic_Type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_Type(AngulerParser.Generic_TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(AngulerParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedHtml}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedHtml(AngulerParser.NestedHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingTag}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngulerParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code templateVariable}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateVariable(AngulerParser.TemplateVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngContent}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgContent(AngulerParser.NgContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngTemplate}
	 * labeled alternative in {@link AngulerParser#html_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgTemplate(AngulerParser.NgTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(AngulerParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#open_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_tag(AngulerParser.Open_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#html_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_attribute(AngulerParser.Html_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#close_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_tag(AngulerParser.Close_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#single_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_tag(AngulerParser.Single_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#template_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_variable(AngulerParser.Template_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngulerParser#ng_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNg_content(AngulerParser.Ng_contentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngTemplateWithContent}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgTemplateWithContent(AngulerParser.NgTemplateWithContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ngTemplateSelfClosing}
	 * labeled alternative in {@link AngulerParser#ng_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgTemplateSelfClosing(AngulerParser.NgTemplateSelfClosingContext ctx);
}