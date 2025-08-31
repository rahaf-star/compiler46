package Visitor;
import AST.*;
import SemanticTable.*;
import antlr.AngulerParser;
import antlr.AngulerParserBaseVisitor;
import java.util.ArrayList;
import java.util.List;

import SymbolTable.SymbolTable;
import SymbolTable.SymbolTableDuplicateSelector;
import SymbolTable.SymbolTableNoSelector;
import SymbolTable.SymbolTableStandaloneNoTemplate;

import SymbolTable.SymbolTableStandalone;

import SemanticTable.ErrorHandler;
import SymbolTable.SymbolTableInjectableNoProvidedIn;
public class BaseVisitor  extends AngulerParserBaseVisitor<Object> {
    // SymbolTable symbolTable = new SymbolTable();
    // ComponentSelectorTable selectorTable = new ComponentSelectorTable();
    // public SymbolTable getSymbolTable() {
    //    return this.symbolTable;
    //  }
    public BaseVisitor() {
        this.symbolTable = symbolTable;
    }
    //SymbolTable mainTable = new SymbolTable();
    //  BaseVisitor visitor = new BaseVisitor(mainTable);

    private String currentClassName = null;
    private SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }
    //////////////////////nour//////////////////////////////////////////////
    @Override
    public Program visitProg(AngulerParser.ProgContext ctx) {
        Program program = new Program() {
        };

        // Handle anguler_import
        for (int i = 0; i < ctx.anguler_import().size(); i++) {
            Anguler_Import importNode = visitAnguler_import(ctx.anguler_import(i));
            program.getAnguler_importList().add(importNode);
        }

        // Handle component_declaration
        for (int i = 0; i < ctx.component_declaration().size(); i++) {
            Component_Declaration component = visitComponent_declaration(ctx.component_declaration(i));
            program.getComponent_declarationList().add(component);
        }

        // Handle injectable_declaration
        for (int i = 0; i < ctx.injectable_declaration().size(); i++) {
            Injectable_Declaration injectable =
                    (Injectable_Declaration) visitInjectable_declaration(ctx.injectable_declaration(i));
            program.getInjectable_declarationList().add(injectable);

        }

        // Handle export_statement
        for (int i = 0; i < ctx.export_statement().size(); i++) {
            Export_Statement exportStmt = (Export_Statement) visitExport_statement(ctx.export_statement(i));
            program.getExport_statementList().add(exportStmt);
        }

        for (int i = 0; i < ctx.class_declaration().size(); i++) {
            Program programNode = visitClass_declaration(ctx.class_declaration(i));
            if (programNode instanceof Class_Declaration) {
                Class_Declaration classDecl = (Class_Declaration) programNode;
                program.getClass_declarationList().add(classDecl);
            }
        }

        return program;
    }

    @Override
    public Program visitInjectable_declaration(AngulerParser.Injectable_declarationContext ctx) {
        Injectable_Declaration injectableDecl = new Injectable_Declaration();

        Injectable_Metadata metadata = (Injectable_Metadata) visitInjectable_metadata(ctx.injectable_metadata());
        Program programNode = visitClass_declaration(ctx.class_declaration());
        Class_Declaration classDecl = (Class_Declaration) programNode;

        injectableDecl.setInjectableMetadata(metadata);
        injectableDecl.setClassDeclaration(classDecl);

        boolean hasProvidedIn = false;
        if (metadata != null && metadata.getProperties() != null) {
            for (Injectable_Metadata_Property prop : metadata.getProperties()) {
                if (prop instanceof ProvidedIn_Property) {
                    hasProvidedIn = true;
                    break;
                }
            }
        }

        String serviceName = ctx.class_declaration().IDENTIFIER().getText();

        SymbolTableInjectableNoProvidedIn errorTable = SymbolTableInjectableNoProvidedIn.getInstance();
        try {
            errorTable.addSymbol(serviceName, metadata, hasProvidedIn ? "Injectable" : "InjectableError");
        } catch (InjectableNoProvidedInException e) {
            ErrorHandler.logError(e, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine() + 1);
            if (metadata != null) metadata.addSemanticError(e.getMessage());

            try {
                errorTable.addSymbol(serviceName, metadata, "InjectableError");
            } catch (InjectableNoProvidedInException ex) {
            }
        }

        SymbolTable mainTable = SymbolTable.getInstance(); // استخدم الـ instance العام
        symbolTable.addSymbol(serviceName, metadata, hasProvidedIn ? "Injectable" : "InjectableError");

        return injectableDecl;
    }
    ///////////
    @Override
    public Injectable_Metadata visitInjectable_metadata(AngulerParser.Injectable_metadataContext ctx) {
        if (ctx == null) {
            return null;
        }

        Injectable_Metadata metadata = new Injectable_Metadata();
        List<Injectable_Metadata_Property> properties = new ArrayList<>();

        // Process all injectable metadata properties
        if (ctx.injectable_metadata_property() != null) {
            for (var propCtx : ctx.injectable_metadata_property()) {
                if (propCtx != null) {
                    Injectable_Metadata_Property prop = visitInjectable_metadata_property(propCtx);
                    if (prop != null) {
                        properties.add(prop);
                    }
                }
            }
        }

        metadata.setProperties(properties); // You'll need to add this method to Injectable_Metadata

        return metadata;
    }
    @Override
    public Injectable_Metadata_Property visitInjectable_metadata_property(AngulerParser.Injectable_metadata_propertyContext ctx) {
        if (ctx == null) return null;

        if (ctx.PROVIDED_IN() != null) {
            String value = ctx.STRING_LITERAL() != null ? ctx.STRING_LITERAL().getText() : ctx.IDENTIFIER().getText();
            return new ProvidedIn_Property(value);
        }

        Injectable_Metadata_Property property = new Injectable_Metadata_Property();
        property.setPropertyName("unknown");
        property.setPropertyValue(ctx.STRING_LITERAL() != null ? ctx.STRING_LITERAL().getText() : ctx.IDENTIFIER().getText());
        return property;
    }
    @Override
    public Anguler_Import visitAnguler_import(AngulerParser.Anguler_importContext ctx) {
        Anguler_Import importNode = new Anguler_Import();
        importNode.setIdentifir(ctx.IDENTIFIER(0).getText());
        String literal = ctx.STRING_LITERAL().getText();
        importNode.setLiteral(literal.substring(1, literal.length() - 1));
        return importNode;
    }
    @Override
    public Component_Declaration visitComponent_declaration(AngulerParser.Component_declarationContext ctx) {
        Component_Declaration component = new Component_Declaration() {};

        String componentName = ctx.class_declaration() != null && ctx.class_declaration().IDENTIFIER() != null
                ? ctx.class_declaration().IDENTIFIER().getText()
                : "<UnknownComponent>";
        currentClassName = componentName;

        Component_Metadata metadata = visitComponent_metadata(ctx.component_metadata());
        component.setMetadata(metadata);

        Program programNode = visitClass_declaration(ctx.class_declaration());
        Class_Declaration classDecl = programNode instanceof Class_Declaration ? (Class_Declaration) programNode : null;
        component.setClassDecl(classDecl);

        int line = ctx.COMPONENT() != null ? ctx.COMPONENT().getSymbol().getLine() : 0;
        int column = ctx.COMPONENT() != null ? ctx.COMPONENT().getSymbol().getCharPositionInLine() + 1 : 0;

        boolean hasSelector = false;
        if (metadata != null && metadata.getProperties() != null) {
            for (Metadata_Property prop : metadata.getProperties()) {
                if (prop instanceof Selector_Property) {
                    hasSelector = true;
                    break;
                }
            }
        }

        if (!hasSelector) {
            SymbolTableNoSelector table = SymbolTableNoSelector.getInstance();
            try {
                table.addSymbol(componentName, metadata, "NoSelector");
            } catch (ComponentNoSelectorException e) {
                ErrorHandler.logError(e, line, column);
            }
        }

        SymbolTable mainTable = SymbolTable.getInstance();
        mainTable.addSymbol(componentName, metadata, hasSelector ? "Component" : "ComponentError");

        boolean isStandalone = false;
        boolean hasTemplate = false;
        if (metadata != null && metadata.getProperties() != null) {
            for (Metadata_Property prop : metadata.getProperties()) {
                if (prop instanceof Standalone_Property) {
                    isStandalone = ((Standalone_Property) prop).isStandalone();
                }
                if (prop instanceof Template_Property || prop instanceof TemplateUrl_Property) {
                  hasTemplate = true;
                }
            }
        }

        if (isStandalone && !hasTemplate) {
            SymbolTableStandaloneNoTemplate table = SymbolTableStandaloneNoTemplate.getInstance();
            try {
                table.addSymbol(componentName, metadata, "NoTemplate");
            } catch (StandaloneWithoutTemplateException e) {
                ErrorHandler.logError(e, line, column);
           }
            //table.printSymbolTable();
        }
        return component;
    }
    ///////////////
    @Override
    public Component_Metadata visitComponent_metadata(AngulerParser.Component_metadataContext ctx) {
        Component_Metadata metadata = new Component_Metadata();
        for (AngulerParser.Metadata_propertyContext propCtx : ctx.metadata_property()) {
            metadata.getProperties().add((Metadata_Property) visit(propCtx));}
        return metadata;}
    @Override
    public Program visitExport_statement(AngulerParser.Export_statementContext ctx) {
        Export_Statement exportStmt = new Export_Statement();

        // Check which child is present and visit it
        if (ctx.variable_declaration() != null) {
            VariableDeclaration varDecl = visitVariable_declaration(ctx.variable_declaration());
            exportStmt.setVariableDeclaration(varDecl);
        }

        if (ctx.method_declaration() != null) {
            MethodDeclaration methodDecl = visitMethod_declaration(ctx.method_declaration());
            exportStmt.setMethodDeclaration(methodDecl);
        }

        if (ctx.function_declaration() != null) {
            Instruction result = visitFunction_declaration(ctx.function_declaration());
            if (result instanceof Function_Declaration) {
                Function_Declaration funcDecl = (Function_Declaration) result;
                exportStmt.setFunctionDeclaration(funcDecl);
            }
        }

        if (ctx.interface_Declaration() != null) {
            Interface_Declaration interfaceDecl = visitInterface_Declaration(ctx.interface_Declaration());
            exportStmt.setInterfaceDeclaration(interfaceDecl);
        }

        return exportStmt;
    }

    @Override
    public Metadata_Property visitMetadataSelector(AngulerParser.MetadataSelectorContext ctx) {
        String selector = "<UnknownSelector>";
        if (ctx.STRING_LITERAL() != null) {
            selector = ctx.STRING_LITERAL().getText().replaceAll("^\"|\"$", "");
        }

        String componentName = "<UnknownComponent>";
        if (ctx.getParent() != null && ctx.getParent().getParent() instanceof AngulerParser.Component_declarationContext) {
            AngulerParser.Component_declarationContext compCtx =
                    (AngulerParser.Component_declarationContext) ctx.getParent().getParent();
            if (compCtx.class_declaration() != null && compCtx.class_declaration().IDENTIFIER() != null) {
                componentName = compCtx.class_declaration().IDENTIFIER().getText();
            }
        }

        currentClassName = componentName;

        int line = ctx.getStart() != null ? ctx.getStart().getLine() : 0;
        int column = ctx.getStart() != null ? ctx.getStart().getCharPositionInLine() + 1 : 0;

        SymbolTableDuplicateSelector symbolTableDup = SymbolTableDuplicateSelector.getInstance();
        try {
            // symbolTableDup.addSymbol(componentName + ":Selector", selector, "Property");

            symbolTableDup.addSymbol(selector, selector, "ComponentSelector");
        } catch (DuplicateSelectorException e) {
            ErrorHandler.logError(
                    new DuplicateSelectorException(
                            "Duplicate selector '" + selector + "' in component '" + componentName + "'"
                    ),
                    line,
                    column
            );

            //  System.out.println("=== Duplicate Selector Table ===");
         //   symbolTableDup.printSymbolTable();
        }

        symbolTable.addSymbol(componentName + ":Selector", selector, "Property");

        return new Selector_Property(selector);
    }




    @Override
    public Metadata_Property visitMetadataStandalone(AngulerParser.MetadataStandaloneContext ctx) {
        boolean isStandalone = Boolean.parseBoolean(ctx.BOOLEAN_LITERAL().getText());

        String componentName = ((AngulerParser.Component_declarationContext) ctx.parent.parent)
                .class_declaration().IDENTIFIER().getText();

        symbolTable.addSymbol(componentName + ":Standalone", String.valueOf(isStandalone), "Property");

        return new Standalone_Property(isStandalone);
    }

    @Override
    public Metadata_Property visitMetadataImports(AngulerParser.MetadataImportsContext ctx) {
        Imports_Array imports = visitImports_array(ctx.imports_array());
        String name = "imports";

        SymbolTableStandalone symbolTable = SymbolTableStandalone.getInstance();

        if (ctx.imports_array() != null && ctx.imports_array().value() != null) {
            for (AngulerParser.ValueContext valCtx : ctx.imports_array().value()) {
                String importName = "<UnknownImport>";

                if (valCtx instanceof AngulerParser.IdentifierValueContext) {
                    importName = ((AngulerParser.IdentifierValueContext) valCtx).getText().trim();
                } else if (valCtx instanceof AngulerParser.LiteralValueContext) {
                    String text = ((AngulerParser.LiteralValueContext) valCtx).getText().trim();
                    if (text.startsWith("\"") && text.endsWith("\"")) {
                        text = text.substring(1, text.length() - 1);
                    }
                    importName = text;


                }
            }
        }

        return new Imports_Property(name, imports);
    }
    @Override
    public Metadata_Property visitMetadataTemplate(AngulerParser.MetadataTemplateContext ctx) {
        String template = ctx.TEMPLATE_LITERAL().getText();

        Template_Property prop = new Template_Property("template");
        prop.setTemplateContent(template);

        symbolTable.addSymbol(currentClassName + ":Template", template, "Property");

        return prop;
    }
    @Override
    public Metadata_Property visitMetadataTemplateUrl(AngulerParser.MetadataTemplateUrlContext ctx) {
        String templateUrl = ctx.STRING_LITERAL().getText().replaceAll("^\"|\"$", "");
        TemplateUrl_Property prop = new TemplateUrl_Property("templateUrl");
        prop.setTemplateUrl(templateUrl);

        // تسجيل في جدول الرموز
        symbolTable.addSymbol(currentClassName + ":TemplateUrl", templateUrl, "Property");

        return prop;
    }
    @Override
    public Metadata_Property visitMetadataStyles(AngulerParser.MetadataStylesContext ctx) {
        Styles_Property stylesProperty=new Styles_Property();
        if (ctx.STRING_LITERAL() != null) {
         stylesProperty.setStyle(ctx.STRING_LITERAL().toString());

        } else {
                Array array = (Array) visit(ctx.array());
            stylesProperty.setStyleArray(array);


        }
        return stylesProperty;
    }


    @Override
    public Metadata_Property visitMetadataStyleUrls(AngulerParser.MetadataStyleUrlsContext ctx) {
        StyleUrls_Property styleUrlsProperty=new StyleUrls_Property();
         if(ctx.STYLE_URLS()!=null){
             Imports_Array importsArray = (Imports_Array) visit(ctx.imports_array());
             styleUrlsProperty.setStyleUrls(importsArray);

         }

        return styleUrlsProperty;
    }

    @Override
    public Class_Body visitClass_body(AngulerParser.Class_bodyContext ctx) {
        Class_Body classBody = new Class_Body();

        // Initialize all lists first (like Program does)
        classBody.setProperties(new ArrayList<>());
        classBody.setMethods(new ArrayList<>());
        classBody.setFunctions(new ArrayList<>());
        classBody.setClasses(new ArrayList<>());
        classBody.setInstructions(new ArrayList<>());


        // method_declaration - FOLLOWING visitProg PATTERN
         if (ctx.method_declaration() != null) {
            for (int i = 0; i < ctx.method_declaration().size(); i++) {
                MethodDeclaration method = (MethodDeclaration) visit(ctx.method_declaration(i));
                classBody.getMethods().add(method);
            }
        }

        // property_declaration - FOLLOWING visitProg PATTERN
            if (ctx.property_declaration() != null) {
            for (int i = 0; i < ctx.property_declaration().size(); i++) {
                PropertyDeclaration prop = (PropertyDeclaration) visit(ctx.property_declaration(i));
                classBody.getProperties().add(prop);
            }
        }





        // class_declaration - FOLLOWING visitProg PATTERN
         if (ctx.class_declaration() != null) {
            for (int i = 0; i < ctx.class_declaration().size(); i++) {
                Class_Declaration cls = (Class_Declaration) visit(ctx.class_declaration(i));
                classBody.getClasses().add(cls);
            }
        }

        // instruction - FOLLOWING visitProg PATTERN
         if (ctx.instruction() != null) {
            for (int i = 0; i < ctx.instruction().size(); i++) {
                Object result = visit(ctx.instruction(i));
                if (result instanceof Instruction) {
                    classBody.getInstructions().add((Instruction) result);
                }
            }
        }

        return classBody;
    }

    @Override
    public Program visitClass_declaration(AngulerParser.Class_declarationContext ctx) {
        Class_Declaration classDecl = new Class_Declaration();
        classDecl.setIdentifier(ctx.IDENTIFIER().getText());

        if (ctx.class_body() != null) {
            Class_Body body = (Class_Body) visit(ctx.class_body());
            classDecl.setClassBody(body);
        }

        return classDecl;
    }
    @Override
    public Imports_Array visitImports_array(AngulerParser.Imports_arrayContext ctx) {
        Imports_Array importsArray = new Imports_Array();
        for (int i = 0; i < ctx.value().size(); i++) {
            Value value = (Value) visit(ctx.value(i));
            importsArray.getValues().add(value);}

        return importsArray;}
    @Override
    public TypeAnnotation visitType_annotation(AngulerParser.Type_annotationContext ctx) {
        TypeAnnotation typeAnnotation = new TypeAnnotation();
        List<BaseTypeAnnotation> baseTypeAnnotationList = new ArrayList<>();

        if (ctx.base_type_annotation() != null) {
            for (int i = 0; i < ctx.base_type_annotation().size(); i++) {
                Object res = visit(ctx.base_type_annotation(i));
                if (res instanceof BaseTypeAnnotation) {
                    baseTypeAnnotationList.add((BaseTypeAnnotation) res);
                }
            }
        }

        typeAnnotation.setBaseTypeAnnotation(baseTypeAnnotationList);
        return typeAnnotation;
    }
    @Override
    public TypePair visitType_pair(AngulerParser.Type_pairContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();

        BaseTypeAnnotation baseType = (BaseTypeAnnotation) visit(ctx.base_type_annotation());

        TypePair typePair = new TypePair();
        typePair.setIdentifier(identifier);
        typePair.setBaseTypeAnnotations(baseType);

        return typePair;
    }
    @Override
    public Instruction visitFunction_declaration(AngulerParser.Function_declarationContext ctx) {
        Function_Declaration funcDecl = new Function_Declaration();

        funcDecl.setIdentifier(ctx.IDENTIFIER().getText());

        funcDecl.setFunctionBody(visitFunction_body(ctx.function_body()));

        return funcDecl;
    }
    @Override
    public MethodDeclaration visitMethod_declaration(AngulerParser.Method_declarationContext ctx) {
        MethodDeclaration methodDecl = new MethodDeclaration();

        // 1. Access modifier
        if (ctx.PUBLIC() != null) {
            methodDecl.setAccessModifier("public");
        } else if (ctx.PRIVATE() != null) {
            methodDecl.setAccessModifier("private");
        } else if (ctx.PROTECTED() != null) {
            methodDecl.setAccessModifier("protected");
        }

        // 2. Method name - YOU'RE MISSING THIS!
        if (ctx.IDENTIFIER() != null) {
            methodDecl.setMethodName(ctx.IDENTIFIER().getText());
        }

        // 3. Parameters - Visit the parameter_list as a whole
        if (ctx.parameter_list() != null) {
            ParameterList paramList = visitParameter_list(ctx.parameter_list()); // Visit the list
            methodDecl.setParameters(paramList); // Set the single ParameterList
        }

        // 4. Type annotation (optional)
        if (ctx.type_annotation() != null) {
            TypeAnnotation typeAnn = (TypeAnnotation) visit(ctx.type_annotation());
            methodDecl.setTypeAnnotation(typeAnn);
        }

        // 5. Method body
        if (ctx.method_body() != null) {
            MethodBody methodBody = (MethodBody) visit(ctx.method_body());
            methodDecl.setMethodBody(methodBody);
        }

        return methodDecl;
    }

    ///////////////////////////
    @Override
    public StructuredType visitStructured_type(AngulerParser.Structured_typeContext ctx) {
        StructuredType structuredType=new StructuredType();
        List<TypePair> typePairs=new ArrayList<>();
        for (int i = 0; i < ctx.type_pair().size(); i++) {
            Object res = visit(ctx.type_pair(i));
            typePairs.add((TypePair) res);
        }

        structuredType.setTypePair(typePairs);



        return structuredType;
    }

    @Override
    public PrimitiveType visitPrimitive_type(AngulerParser.Primitive_typeContext ctx) {
        PrimitiveType primitive = new PrimitiveType();

        if (ctx.STRING() != null) {
            primitive.setType("string");
        } else if (ctx.NUMBER() != null) {
            primitive.setType("number");
        } else if (ctx.BOOLEAN() != null) {
            primitive.setType("boolean");
        } else if (ctx.ANY() != null) {
            primitive.setType("any");
        } else if (ctx.UNDEFINED() != null) {
            primitive.setType("undefined");
        }

        return primitive;
    }
    @Override
    public ArrayType visitArray_type(AngulerParser.Array_typeContext ctx) {
        ArrayType arrayType = new ArrayType();
        arrayType.setIdentifier(ctx.IDENTIFIER().getText());



        return arrayType;

    }
    @Override
    public PropertyDeclaration visitProperty_declaration(AngulerParser.Property_declarationContext ctx) {
        PropertyDeclaration property = new PropertyDeclaration();

        // Handle visibility modifiers (PUBLIC, PRIVATE, PROTECTED)
        if (ctx.PUBLIC() != null) {
            property.setVisibility("public");
        } else if (ctx.PRIVATE() != null) {
            property.setVisibility("private");
        } else if (ctx.PROTECTED() != null) {
            property.setVisibility("protected");
        }

        // Handle OUTPUT property (second grammar alternative)
        if (ctx.OUTPUT() != null) {
            property.setOutput(true);
        } else {
            property.setOutput(false);
        }

        // Set identifier (always present)
        property.setIdentifier(ctx.IDENTIFIER().getText());

        // Handle type annotation (optional)
        if (ctx.type_annotation() != null) {
            TypeAnnotation typeAnno = (TypeAnnotation) visit(ctx.type_annotation());
            property.setTypeAnnotation(typeAnno);
        }

        // Handle expression (optional)
        if (ctx.expression() != null) {
            Expression expr = (Expression) visit(ctx.expression());
            property.setExpression(expr);
        }

        return property;
    }
///////////////////////Rahaf/////////////////////////////////////////////////////
    @Override
    public Array visitArray(AngulerParser.ArrayContext ctx) {
        Array array = new Array();
        List<ArrayElement> arrayElements = new ArrayList<>();
        for (AngulerParser.Array_elementContext array_elementCtx : ctx.array_element()) {
            ArrayElement arrayElement = (ArrayElement) visit(array_elementCtx);
            arrayElements.add(arrayElement);
        }
        array.setArrayElements(arrayElements);

        return array;
    }

    @Override
    public ArrayElement visitArray_element(AngulerParser.Array_elementContext ctx) {
        ArrayElement arrayElement = new ArrayElement();



            Expression expr = (Expression) visit(ctx.expression());
            arrayElement.setExpressions(expr);


        return arrayElement;
    }

    @Override
    public Primary visitPrimaryArray(AngulerParser.PrimaryArrayContext ctx) {
        Array array = new Array();
        List<ArrayElement> elements = new ArrayList<>();

        if (ctx.array() != null && ctx.array().array_element() != null) {
            for (AngulerParser.Array_elementContext elemCtx : ctx.array().array_element()) {
                ArrayElement element = visitArray_element(elemCtx); // ← THIS MUST BE CALLED
                elements.add(element);
            }
        }

        array.setArrayElements(elements); // ← THIS MUST BE CALLED
        return array;
    }

    @Override
    public FunctionBody visitFunction_body(AngulerParser.Function_bodyContext ctx) {
        if (ctx == null) {
            return null; // ✅ Handle null context
        }

        FunctionBody functionBody = new FunctionBody();

        // Handle parameter list - WITH NULL CHECK
        if (ctx.parameter_list() != null) {
            ParameterList parameterList = visitParameter_list(ctx.parameter_list());
            if (parameterList != null) {
                functionBody.setParameterList(parameterList);
            }
        }

        // Handle instructions - WITH NULL CHECKS
        List<Instruction> instructions = new ArrayList<>();
        if (ctx.instruction() != null) {
            for (AngulerParser.InstructionContext instrCtx : ctx.instruction()) {
                if (instrCtx != null) { // ✅ Check individual instruction context
                    Object result = visit(instrCtx);
                    if (result instanceof Instruction) { // ✅ Check if it's actually an Instruction
                        instructions.add((Instruction) result);
                    }
                }
            }
        }
        functionBody.setInstruction(instructions);

        return functionBody;
    }

    @Override
    public EmitStatement visitEmitStatement(AngulerParser.EmitStatementContext ctx) {
        EmitStatement emitStmt = new EmitStatement();
            JSONObject jsonObject = (JSONObject) visit(ctx.emit_statement().json_object());
            emitStmt.setJsonObject(jsonObject);


        return emitStmt;
    }

    @Override
    public ParameterList visitParameter_list(AngulerParser.Parameter_listContext ctx) {
        ParameterList parameterList = new ParameterList();
        List<Parameter> parameter = new ArrayList<>();

        for (int i = 0; i < ctx.parameter().size(); i++) {
            Object res = visit(ctx.parameter(i));
            parameter.add((Parameter) res);


        }
        parameterList.setParameter(parameter);


        return parameterList;

    }


    @Override
    public Parameter visitParameter(AngulerParser.ParameterContext ctx) {
        if (ctx == null) {
            return null; // ✅ Handle null context
        }

        Parameter parameter = new Parameter();

        // Check if IDENTIFIER exists
        if (ctx.IDENTIFIER() != null) {
            parameter.setIdentifier(ctx.IDENTIFIER().getText()); // Use getText() not toString()
        } else {
            parameter.setIdentifier(""); // or handle missing identifier
        }

        // Check if base_type_annotation exists before visiting
        if (ctx.base_type_annotation() != null) {
            BaseTypeAnnotation baseType = (BaseTypeAnnotation) visit(ctx.base_type_annotation());
            if (baseType != null) {
                parameter.setBaseTypeAnnotation(baseType);
            }
        }

        // Check if structured_type exists before visiting
        if (ctx.structured_type() != null) {
            StructuredType structType = (StructuredType) visit(ctx.structured_type());
            if (structType != null) {
                parameter.setStructuredType(structType);
            }
        }

        return parameter;
    }

    @Override
    public ArithmeticExpression visitArithmetic_expression(AngulerParser.Arithmetic_expressionContext ctx) {
        ArithmeticExpression arithmeticExpression = new ArithmeticExpression();
        List<PostFix_Expression> postFixExpressions = new ArrayList<>();
        for (AngulerParser.Postfix_expressionContext postfix_expressionCtx : ctx.postfix_expression()) {
            PostFix_Expression postFixExpression = (PostFix_Expression) visit(postfix_expressionCtx);
            postFixExpressions.add(postFixExpression);
        }
        arithmeticExpression.setExpression(postFixExpressions);


        return arithmeticExpression;
    }

    @Override
    public ConditionalExpression visitConditional_expression(AngulerParser.Conditional_expressionContext ctx) {
        ConditionalExpression conditionalExpression = new ConditionalExpression();
        PostFix_Expression postFixExpression = (PostFix_Expression) visit(ctx.postfix_expression());
        conditionalExpression.setPostFixExpression(postFixExpression);

        Expression expr = (Expression) visit(ctx.expression(0));
        conditionalExpression.setExpression(expr);

        return conditionalExpression;
    }


    @Override
    public DeclarationKeyword visitDeclaraiton_keywords(AngulerParser.Declaraiton_keywordsContext ctx) {
        DeclarationKeyword declarationKeyword = new DeclarationKeyword();
        if (ctx.LET() != null) {
            declarationKeyword.setKeyword(ctx.LET().getText());
        } else if (ctx.CONST() != null) {
            declarationKeyword.setKeyword(ctx.CONST().getText());
        } else if (ctx.VAR() != null) {
            declarationKeyword.setKeyword(ctx.VAR().getText());
        }

        return declarationKeyword;
    }

    @Override
    public EqualityExpression visitEquality_expression(AngulerParser.Equality_expressionContext ctx) {
        EqualityExpression equalityExpression = new EqualityExpression();
        List<PostFix_Expression> postFixExpressions = new ArrayList<>();
        for (AngulerParser.Postfix_expressionContext postfix_expressionCtx : ctx.postfix_expression()) {
            PostFix_Expression postFixExpression = (PostFix_Expression) visit(postfix_expressionCtx);
            postFixExpressions.add(postFixExpression);
        }
        equalityExpression.setExpression(postFixExpressions);


        return equalityExpression;
    }

    @Override
    public Generic_Type visitGeneric_Type(AngulerParser.Generic_TypeContext ctx) {
        Generic_Type genericType = new Generic_Type();
        if (ctx.IDENTIFIER() != null) {
            genericType.setId(ctx.IDENTIFIER().getText());
        }
        for (AngulerParser.Type_annotationContext typeAnnotationCtx : ctx.type_annotation()) {
            TypeAnnotation typeAnnotation = (TypeAnnotation) visit(typeAnnotationCtx);
            genericType.getTypeAnnotations().add(typeAnnotation);
        }
        return genericType;
    }


    @Override
    public ConditionalStatements visitIf_statement(AngulerParser.If_statementContext ctx) {
        if (ctx == null) {
            return null; // ✅ Handle null context
        }

        ifStatement ifstatement = new ifStatement();

        // 1. Condition expression - WITH NULL CHECK
        if (ctx.expression() != null) {
            Expression expression = (Expression) visit(ctx.expression());
            if (expression != null) {
                ifstatement.setExpression(expression);
            }
        }

        // 2. Nested if statement - WITH NULL CHECK (this might not exist!)
        if (ctx.if_statement() != null) {
            ifStatement ifStat = (ifStatement) visit(ctx.if_statement());
            if (ifStat != null) {
                ifstatement.setIfStat(ifStat);
            }
        }

        // 3. Block statements - WITH NULL CHECK
        if (ctx.block() != null) {
            for (AngulerParser.BlockContext blockCtx : ctx.block()) {
                if (blockCtx != null) { // ✅ Check individual block context
                    Block block = (Block) visit(blockCtx);
                    if (block != null) {
                        ifstatement.getBlock().add(block);
                    }
                }
            }
        }

        return ifstatement;
    }

    @Override
    public Interface_Declaration visitInterface_Declaration(AngulerParser.Interface_DeclarationContext ctx) {
        Interface_Declaration interfaceDeclaration = new Interface_Declaration();
        StructuredType structType = (StructuredType) visit(ctx.structured_type());
        interfaceDeclaration.setStructuredType(structType);
        interfaceDeclaration.setInterfaceName(ctx.INTERFACE().getText());

        return interfaceDeclaration;
    }

    @Override
    public JSONObject visitJson_object(AngulerParser.Json_objectContext ctx) {
        JSONObject jsonObject = new JSONObject();

        // No need to check for null anymore - getJsonPair() will always return a list!
        for (AngulerParser.Json_pairContext jsonPairCtx : ctx.json_pair()) {
            JsonPair jsonPair = (JsonPair) visit(jsonPairCtx);
            jsonObject.getJsonPair().add(jsonPair);
        }

        return jsonObject;
    }

    @Override
    public JsonPair visitJson_pair(AngulerParser.Json_pairContext ctx) {
        JsonPair jsonPair = new JsonPair();
        Expression expression= (Expression) visit(ctx.expression());
        jsonPair.setExpression(expression);

        return jsonPair;
    }


    @Override
    public LiteralValue visitLiteralValue(AngulerParser.LiteralValueContext ctx) {
        LiteralValue literalValue = new LiteralValue();
        literalValue.setType(ctx.literal_value().getText());
        return literalValue;
    }

    @Override
    public LogicalExpression visitLogical_expression(AngulerParser.Logical_expressionContext ctx) {
        LogicalExpression logicalExpression = new LogicalExpression();
        List<PostFix_Expression> postFixExpressions = new ArrayList<>();
        for (AngulerParser.Postfix_expressionContext postfix_expressionCtx : ctx.postfix_expression()) {
            PostFix_Expression postFixExpression = (PostFix_Expression) visit(postfix_expressionCtx);
            postFixExpressions.add(postFixExpression);
        }
        logicalExpression.setExpression(postFixExpressions);


        return logicalExpression;
    }

    @Override
    public MethodBody visitMethod_body(AngulerParser.Method_bodyContext ctx) {
        MethodBody methodBody = new MethodBody();

        // Initialize all lists first
        methodBody.setVariableDeclaration(new ArrayList<>());
        methodBody.setReturnStatement(new ArrayList<>());
        methodBody.setExpression(new ArrayList<>());

        // Variable declarations - NO else!
        if (ctx.variable_declaration() != null) {
            for (AngulerParser.Variable_declarationContext variableDeclarationCtx : ctx.variable_declaration()) {
                if (variableDeclarationCtx != null) {
                    VariableDeclaration variableDeclaration = (VariableDeclaration) visit(variableDeclarationCtx);
                    if (variableDeclaration != null) {
                        methodBody.getVariableDeclaration().add(variableDeclaration);
                    }
                }
            }
        }

        // Return statements - NO else!
        if (ctx.return_Statement() != null) {
            for (AngulerParser.Return_StatementContext returnCtx : ctx.return_Statement()) {
                if (returnCtx != null) {
                    Return_statement returnStatement = (Return_statement) visit(returnCtx);
                    if (returnStatement != null) {
                        methodBody.getReturnStatement().add(returnStatement);
                    }
                }
            }
        }

        // Expressions - NO else!
        if (ctx.expression() != null) {
            for (AngulerParser.ExpressionContext exprCtx : ctx.expression()) {
                if (exprCtx != null) {
                    Expression expression = (Expression) visit(exprCtx);
                    if (expression != null) {
                        methodBody.getExpression().add(expression);
                    }
                }
            }
        }

        return methodBody;
    }

    @Override
    public Primary visitNewExpression(AngulerParser.NewExpressionContext ctx) {
        newExpr newExpression = new newExpr();

        // CAPTURE THE CONSTRUCTOR NAME - THIS IS CRITICAL!
        newExpression.setConstructorName(ctx.IDENTIFIER().getText());

        if (ctx.type_arguments() != null) {
            TypeArguments typeArgs = (TypeArguments) visit(ctx.type_arguments());
            newExpression.setTypeArguments(typeArgs);
        }

        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            List<Expression> expressions = new ArrayList<>();
            for (AngulerParser.ExpressionContext exprCtx : ctx.expression()) {
                Expression expr = (Expression) visit(exprCtx);
                expressions.add(expr);
            }
            newExpression.setExpression(expressions);
        }

        return newExpression;
    }
    @Override
    public Primary visitPrimaryBoolean(AngulerParser.PrimaryBooleanContext ctx) {
        PrimaryBoolean primaryBoolean = new PrimaryBoolean();

        // Capture the boolean value
        String booleanText = ctx.getText();
        if ("true".equals(booleanText)) {
            primaryBoolean.setValue(true);
        } else if ("false".equals(booleanText)) {
            primaryBoolean.setValue(false);
        }

        return primaryBoolean;
    }
    @Override
    public SpreadExpr visitSpreadExpression(AngulerParser.SpreadExpressionContext ctx) {
        SpreadExpr spreadExpr = new SpreadExpr();


            Expression expr = (Expression) visit(ctx.expression());
            spreadExpr.setExpression(expr);


        return spreadExpr;
    }

    @Override
    public TypeArguments visitType_arguments(AngulerParser.Type_argumentsContext ctx) {
        TypeArguments typeArgs = new TypeArguments();


            List<TypeAnnotation> annotations = new ArrayList<>();
            for (AngulerParser.Type_annotationContext typeCtx : ctx.type_annotation()) {
                TypeAnnotation typeAnnotation = (TypeAnnotation) visit(typeCtx);
                annotations.add(typeAnnotation);
            }
            typeArgs.setTypeAnnotations(annotations);


        return typeArgs;
    }


    @Override
    public PostFix_Expression visitPostfix_expression(AngulerParser.Postfix_expressionContext ctx) {
        PostFix_Expression postFixExpr = new PostFix_Expression();



            Primary primary = (Primary) visit(ctx.primary());
            postFixExpr.setPrimary(primary);

        List<PostFixOper> postFixOpers = new ArrayList<>();
        for (AngulerParser.Postfix_operatorContext postfixOperatorCtx : ctx.postfix_operator()) {
            PostFixOper postFixOper = (PostFixOper) visit(postfixOperatorCtx);
            postFixOpers.add(postFixOper);

        }
        postFixExpr.setPostFixOpers(postFixOpers);



        return postFixExpr;
    }

    @Override
    public Expression visitAssignment(AngulerParser.AssignmentContext ctx) {
        Assignment assignment = new Assignment();


        if (ctx.postfix_expression() != null) {
            PostFix_Expression postFixExpr = (PostFix_Expression) visit(ctx.postfix_expression());
            assignment.setPostFixExpression(postFixExpr);
        }
      else  if (ctx.expression() != null) {
            Expression expression = (Expression) visit(ctx.expression());
            assignment.setExpression(expression);
        }



        return assignment;
    }

    @Override
    public Primary visitPrimaryIdentifier(AngulerParser.PrimaryIdentifierContext ctx) {
        PrimaryIdentifier primary = new PrimaryIdentifier();
        primary.setIdentifier(ctx.IDENTIFIER().getText()); // CAPTURE THE TEXT!
        return primary;
    }

    @Override
    public Primary visitPrimaryThis(AngulerParser.PrimaryThisContext ctx) {
        PrimaryThis primary = new PrimaryThis();
        primary.setValue("this"); // EXPLICITLY SET
        return primary;
    }

    @Override
    public Primary visitPrimaryLiteral(AngulerParser.PrimaryLiteralContext ctx) {
        PrimaryLiteral literal = new PrimaryLiteral();

        // Get the literal_value context first
        AngulerParser.Literal_valueContext literalValueCtx = ctx.literal_value();

        if (literalValueCtx.DECIMAL_INTEGER_LITERAL() != null) {
            literal.setValue(literalValueCtx.DECIMAL_INTEGER_LITERAL().getText());
            literal.setType("integer");
        }
        else if (literalValueCtx.FLOAT_LITERAL() != null) {
            literal.setValue(literalValueCtx.FLOAT_LITERAL().getText());
            literal.setType("float");
        }
        else if (literalValueCtx.STRING_LITERAL() != null) {
            literal.setValue(literalValueCtx.STRING_LITERAL().getText());
            literal.setType("string");
        }
        else if (literalValueCtx.TEMPLATE_LITERAL() != null) {
            literal.setValue(literalValueCtx.TEMPLATE_LITERAL().getText());
            literal.setType("template");
        }

        return literal;
    }

    @Override
    public PostFixOper visitMemberAccess(AngulerParser.MemberAccessContext ctx) {
        System.out.println("=== MEMBER ACCESS ===");
        System.out.println("Full text: " + ctx.getText());
        System.out.println("IDENTIFIER: " + ctx.IDENTIFIER().getText());
        System.out.println("OPEN_PAREN: " + (ctx.OPEN_PAREN() != null));
        System.out.println("Expression count: " + (ctx.expression() != null ? ctx.expression().size() : 0));

        MemberAccess memberAccess = new MemberAccess();
        memberAccess.setMemberName(ctx.IDENTIFIER().getText());

        if (ctx.OPEN_PAREN() != null) {
            List<Expression> args = new ArrayList<>();
            if (ctx.expression() != null) {
                for (AngulerParser.ExpressionContext argCtx : ctx.expression()) {
                    System.out.println("Argument: " + argCtx.getText());
                    Expression expr = (Expression) visit(argCtx);
                    args.add(expr);
                }
            }
            memberAccess.setArguments(args);
        }

        return memberAccess;
    }
    @Override
    public RelationalExpression visitRelational_expression(AngulerParser.Relational_expressionContext ctx) {
        RelationalExpression relationalExpr = new RelationalExpression();
        List<PostFix_Expression> postFixExpressions = new ArrayList<>();
        for (AngulerParser.Postfix_expressionContext postfix_expressionCtx : ctx.postfix_expression()) {
            PostFix_Expression postFixExpression = (PostFix_Expression) visit(postfix_expressionCtx);
            postFixExpressions.add(postFixExpression);
        }
        relationalExpr.setExpression(postFixExpressions);

        return relationalExpr;
    }

    @Override
    public UnaryExpression visitUnary_expression(AngulerParser.Unary_expressionContext ctx) {
        UnaryExpression unaryExpr = new UnaryExpression();
        if (ctx.value() != null) {
            Value value = (Value) visit(ctx.value());
            unaryExpr.setValue(value);
        }
        return unaryExpr;
    }


    @Override
    public VariableDeclaration visitVariable_declaration(AngulerParser.Variable_declarationContext ctx) {
        VariableDeclaration varDecl = new VariableDeclaration();

        if (ctx.declaraiton_keywords() == null) {
            varDecl.setDeclarationKeyword((DeclarationKeyword) visit(ctx.declaraiton_keywords()));
        }
        if (ctx.type_annotation() != null) {
            varDecl.setTypeAnnotation((TypeAnnotation) visit(ctx.type_annotation()));
        }


        if (ctx.expression() != null) {
            varDecl.setExpression((Expression) visit(ctx.expression()));
        }
        return varDecl;

    }





//////////////////////////huda/////////////////////////////////////////////
    @Override
    public ConditionalStatements visitSwitch_statement(AngulerParser.Switch_statementContext ctx) {
        Switch_statement switcStatement = new Switch_statement();

        if (ctx.value() != null) {
            switcStatement.setValue((Value) visit(ctx.value()));
        }

        if (ctx.switch_body() != null) {
            switcStatement.setSwitcBody((Switch_body) visit(ctx.switch_body()));
        }

        return (ConditionalStatements)switcStatement;
    }

    @Override
    public Expression visitPostfixExpr(AngulerParser.PostfixExprContext ctx) {


        // Check what methods are available in PostfixExprContext
        AngulerParser.Postfix_expressionContext postfixExpressionCtx = ctx.postfix_expression();


        if (postfixExpressionCtx != null) {

            System.out.println("Postfix operators count: " +
                    (postfixExpressionCtx.postfix_operator() != null ? postfixExpressionCtx.postfix_operator().size() : 0));
        }

        PostFix_Expression postfixExpr = new PostFix_Expression();

        if (postfixExpressionCtx != null) {
            // Visit primary
            if (postfixExpressionCtx.primary() != null) {
                Primary primary = (Primary) visit(postfixExpressionCtx.primary());
                postfixExpr.setPrimary(primary);
            }

            // Visit operators
            if (postfixExpressionCtx.postfix_operator() != null) {
                List<PostFixOper> operators = new ArrayList<>();
                for (AngulerParser.Postfix_operatorContext opCtx : postfixExpressionCtx.postfix_operator()) {
                    PostFixOper oper = (PostFixOper) visit(opCtx);
                    operators.add(oper);
                }
                postfixExpr.setPostFixOpers(operators);
            }
        }

        return postfixExpr;
    }


    @Override
    public ConditionalStatements visitWhile_statement(AngulerParser.While_statementContext ctx) {
        While_statement whileStatement = new While_statement();

        if (ctx.value() != null) {
            whileStatement.setValue((Value) visit(ctx.value()));
        }

        if (ctx.block() != null) {
            whileStatement.setBlock((Block) visit(ctx.block()));
        }

        return (ConditionalStatements)whileStatement;
    }

    @Override
    public ConditionalStatements visitDo_while_statement(AngulerParser.Do_while_statementContext ctx) {
        Do_while_statement doWhileStatement = new Do_while_statement();

        if (ctx.block() != null) {
            doWhileStatement.setBlock((Block) visit(ctx.block()));
        }

        if (ctx.value() != null) {
            doWhileStatement.setValue((Value) visit(ctx.value()));
        }

        return (ConditionalStatements)doWhileStatement;
    }

    @Override
    public ConditionalStatements visitFor_statement(AngulerParser.For_statementContext ctx) {
        For_statement forStatement = new For_statement();

        if (ctx.variable_declaration() != null) {
            forStatement.setVariableDeclaration((VariableDeclaration) visit(ctx.variable_declaration()));
        }

        if (ctx.expressionSequence().size() > 0) {
            forStatement.setExpressionSequence1((ExpressionSequence) visit(ctx.expressionSequence(0)));
        }

        if (ctx.expressionSequence().size() > 1) {
            forStatement.setExpressionSequence2((ExpressionSequence) visit(ctx.expressionSequence(1)));
        }

        if (ctx.expressionSequence().size() > 2) {
            forStatement.setExpressionSequence3((ExpressionSequence) visit(ctx.expressionSequence(2)));
        }

        if (ctx.block() != null) {
            forStatement.setBlock((Block) visit(ctx.block()));
        }

        return (ConditionalStatements)forStatement;
    }

    @Override
    public ConditionalStatements visitContinue_Statement(AngulerParser.Continue_StatementContext ctx) {
        Continue_statement continueStmt = new Continue_statement();

        if (ctx.IDENTIFIER() != null) {
            continueStmt.setLabel(ctx.IDENTIFIER().getText());
        }

        return (ConditionalStatements)continueStmt;
    }

    @Override
    public ConditionalStatements visitReturn_Statement(AngulerParser.Return_StatementContext ctx) {
        Return_statement returnStmt = new Return_statement();

        if (ctx.expression() != null) {
            Expression expr = (Expression) visit(ctx.expression());
            returnStmt.setExpression(expr); // Change to setExpression instead of setExpressionSequence
        }

        return returnStmt;
    }
    @Override
    public ConditionalStatements visitBreak_statement(AngulerParser.Break_statementContext ctx) {
        Break_statement breakStatement =new Break_statement();
        return (ConditionalStatements)breakStatement;
    }

    @Override
    public Block visitBlock(AngulerParser.BlockContext ctx) {
        Block block = new Block();

        for (AngulerParser.InstructionContext instrCtx : ctx.instruction()) {
            block.addInstruction((Instruction) visit(instrCtx));
        }

        return block;
    }

    @Override
    public ExpressionSequence visitExpressionSequence(AngulerParser.ExpressionSequenceContext ctx) {
        ExpressionSequence exprSeq = new ExpressionSequence();

        if (ctx.IDENTIFIER() != null) {
            exprSeq.setIdentifier(ctx.IDENTIFIER().getText());
        } else {
            for (AngulerParser.ValueContext valCtx : ctx.value()) {
                exprSeq.addValue((Value) visit(valCtx));
            }
        }

        return exprSeq;
    }

    @Override
    public Switch_case visitSwitch_case(AngulerParser.Switch_caseContext ctx) {
        Switch_case switchCase = new Switch_case();

        if (ctx.value() != null) {
            switchCase.setValue((Value) visit(ctx.value()));
        }

        for (AngulerParser.InstructionContext instrCtx : ctx.instruction()) {
            switchCase.addInstruction((Instruction) visit(instrCtx));
        }

        return switchCase;
    }

    @Override
    public Switch_body visitSwitch_body(AngulerParser.Switch_bodyContext ctx) {
        Switch_body switchBody = new Switch_body();

        for (AngulerParser.Switch_caseContext caseCtx : ctx.switch_case()) {
            switchBody.addCase(visitSwitch_case(caseCtx));
        }

        if (!ctx.switch_default().isEmpty()) {
            // Take the first default (since your AST only allows one)
            switchBody.setDefaultCase(visitSwitch_default(ctx.switch_default(0)));
        }


        return switchBody;
    }

    @Override
    public Switch_default visitSwitch_default(AngulerParser.Switch_defaultContext ctx) {
        Switch_default defaultCase = new Switch_default();

        for (AngulerParser.InstructionContext instrCtx : ctx.instruction()) {
            defaultCase.addInstruction((Instruction) visit(instrCtx));
        }

        return defaultCase;
    }

    @Override
    public Eos visitEos(AngulerParser.EosContext ctx) {
        Eos eos = new Eos();
        if (ctx.SEMICOLON() != null) {
            eos.setType("SEMICOLON");
        } else {
            eos.setType("EOF");
        }
        return eos;
    }

    @Override
    public SelfClosingTag visitSingle_tag(AngulerParser.Single_tagContext ctx) {
        SelfClosingTag tag = new SelfClosingTag();

        if (ctx.IDENTIFIER() != null) {
            tag.setTagName(ctx.IDENTIFIER().getText());
        } else if (ctx.tags() != null) {
            tag.setTagName(ctx.tags().getText());
        }

        for (AngulerParser.Html_attributeContext attrCtx : ctx.html_attribute()) {
            tag.addAttribute((Html_attribute) visit(attrCtx));
        }

        return tag;
    }


    @Override
    public TemplateVariable visitTemplate_variable(AngulerParser.Template_variableContext ctx) {
        TemplateVariable var = new TemplateVariable();
        if (ctx.IDENTIFIER() != null) {
            var.setName(ctx.IDENTIFIER().getText());
        }
        return var;
    }

    @Override
    public NgContent visitNg_content(AngulerParser.Ng_contentContext ctx) {
        NgContent ngContent = new NgContent();

        for (AngulerParser.Html_attributeContext attrCtx : ctx.html_attribute()) {
            ngContent.addAttribute((Html_attribute) visit(attrCtx));
        }

        return ngContent;
    }

    @Override
    public Tags visitTags(AngulerParser.TagsContext ctx) {
        Tags tag = new Tags();

        if (ctx.DIV_TAG() != null) tag.setTagName(ctx.DIV_TAG().getText());
        else if (ctx.H1_TAG() != null) tag.setTagName(ctx.H1_TAG().getText());
        else if (ctx.H2_TAG() != null) tag.setTagName(ctx.H2_TAG().getText());
        else if (ctx.H3_TAG() != null) tag.setTagName(ctx.H3_TAG().getText());
        else if (ctx.P_TAG() != null) tag.setTagName(ctx.P_TAG().getText());
        else if (ctx.IMG_TAG() != null) tag.setTagName(ctx.IMG_TAG().getText());
        else if (ctx.A_TAG() != null) tag.setTagName(ctx.A_TAG().getText());
        else if (ctx.SPAN_TAG() != null) tag.setTagName(ctx.SPAN_TAG().getText());
        else if (ctx.BUTTON_TAG() != null) tag.setTagName(ctx.BUTTON_TAG().getText());

        return tag;
    }

    @Override
    public OpenTag visitOpen_tag(AngulerParser.Open_tagContext ctx) {
        OpenTag openTag = new OpenTag();

        if (ctx.IDENTIFIER() != null) {
            openTag.setTagName(ctx.IDENTIFIER().getText());
        } else if (ctx.tags() != null) {
            openTag.setTagName(ctx.tags().getText());
        }

        for (AngulerParser.Html_attributeContext attrCtx : ctx.html_attribute()) {
            openTag.addAttribute((Html_attribute) visit(attrCtx));
        }

        return openTag;
    }

    @Override
    public Close_tag visitClose_tag(AngulerParser.Close_tagContext ctx) {
        Close_tag closeTag = new Close_tag();

        if (ctx.IDENTIFIER() != null) {
            closeTag.setTagName(ctx.IDENTIFIER().getText());
        } else if (ctx.tags() != null) {
            closeTag.setTagName(ctx.tags().getStart().getText());
        }

        return closeTag;
    }


}
