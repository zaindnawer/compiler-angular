package visitor;

import AST.*;


import Grammers.parserZainBaseVisitor;
import Grammers.parserZain;
import SemanticCheck.SemanticCheck;
import SymbolTable.Scope.GlobalScope;
import SymbolTable.Scope.LocalScope;
import SymbolTable.Symbol.SymbolBase;
import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Objects;
import java.util.Stack;

public class VisitorAngular extends parserZainBaseVisitor {
    private Stack<GlobalScope> globalStack;
    private Stack<LocalScope> scopeStack;
    private SymbolTable symbolTable;
    SemanticCheck semanticCheck = new SemanticCheck();
    GlobalScope globalScope = new GlobalScope(null);

    public VisitorAngular(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        globalStack = new Stack<>();
        scopeStack = new Stack<>();
    }

    @Override
    public Program visitProgram(parserZain.ProgramContext ctx) {
        globalScope.setName("global-program");
        globalStack.push(globalScope);
        this.symbolTable.addGlobalScope(globalScope);

        Program prog = new Program();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) {
                prog.getStatments().add(visitStatement(ctx.statement(i)));
            }
        }
        return prog;
    }

    @Override
    public Statment visitStatement(parserZain.StatementContext ctx) {
        Statment statment = new Statment();

        if (ctx.componentDeclaration() != null) {
            statment.setComponentDeclaration(visitComponentDeclaration(ctx.componentDeclaration()));
            System.out.println("nnnnn");
        }

        if (ctx.importDeclaration() != null) {
            visit(ctx.importDeclaration()); // test2
        }
        if (ctx.classDeclaration() != null) {
            statment.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        }
        if (ctx.methodDeclaration() != null) {
            statment.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));
        }
        if (ctx.variableDeclaration() != null) {
            statment.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        if (ctx.interfaceDeclaration() != null) {
            statment.setInterfaceDeclaration(visitInterfaceDeclaration(ctx.interfaceDeclaration()));
        }
        return statment;
    }

    @Override
    public TypedAssignedProperty visitTypedAssignedProperty(parserZain.TypedAssignedPropertyContext ctx) {
        System.out.println("visitooooo");
        TypedAssignedProperty typedAssignedProperty = new TypedAssignedProperty();
        System.out.println(ctx.ID());
        typedAssignedProperty.setID(ctx.ID().getText());
        typedAssignedProperty.setType(visitType(ctx.type()));
        typedAssignedProperty.setInitvalue(visitInitvalue(ctx.initvalue()));

        return typedAssignedProperty;

    }

    @Override
    public OptionalTypedProperty visitOptionalTypedProperty(parserZain.OptionalTypedPropertyContext ctx) {
        OptionalTypedProperty optionalTypedProperty = new OptionalTypedProperty();

        SymbolBase symbolBase = new SymbolBase();
        for (int i = 0; i < ctx.ID().size(); i++) {
            optionalTypedProperty.getID().add(ctx.ID().get(i).getText());
            symbolBase.setName(ctx.ID().get(i).getText());
        }
        ParserRuleContext parent = ctx.getParent();

        LocalScope localScope = null;

        if (parent instanceof parserZain.InterfaceMemberContext) {
            parserZain.InterfaceMemberContext interfaceMember = (parserZain.InterfaceMemberContext) parent;
            for (int i=0; i < scopeStack.size(); i++){
                if (Objects.equals(scopeStack.get(i).getName(), interfaceMember.getParent().getChild(1).getText())){
                    localScope = scopeStack.get(i);
                }
            }
        }

        optionalTypedProperty.setType(visitType(ctx.type()));
        symbolBase.setType(ctx.type().getText());

        if (localScope != null){
            localScope.define(symbolBase);
        }

        return optionalTypedProperty;
    }

    @Override
    public AssignStatement visitAssignStatement(parserZain.AssignStatementContext ctx) {
        AssignStatement assignStatement = new AssignStatement();
        assignStatement.setID(ctx.ID().getText());
        assignStatement.setExpression(visitExpression(ctx.expression()));
        return assignStatement;
    }

    @Override
    public ThisAssignID visitThisAssignID(parserZain.ThisAssignIDContext ctx) {
        ThisAssignID thisAssignID = new ThisAssignID();
        thisAssignID.setTHIS(ctx.THIS().getText());
        for (int i = 0; i < ctx.ID().size(); i++) {
            thisAssignID.getID().add(ctx.ID().get(i).getText());
        }
        return thisAssignID;
    }

    @Override
    public ThisAssignExpr visitThisAssignExpr(parserZain.ThisAssignExprContext ctx) {
        ThisAssignExpr thisAssignExpr = new ThisAssignExpr();
        thisAssignExpr.setTHIS(ctx.THIS().getText());
        thisAssignExpr.setID(ctx.ID().getText());
        thisAssignExpr.setExpression(visitExpression(ctx.expression()));
        return thisAssignExpr;
    }

    @Override
    public ExprStatement visitExprStatement(parserZain.ExprStatementContext ctx) {
        ExprStatement exprStatement = new ExprStatement();
        exprStatement.setExpression(visitExpression(ctx.expression()));
        return exprStatement;
    }

    @Override
    public ImportSingle visitImportSingle(parserZain.ImportSingleContext ctx) {
        SymbolBase symbolBase = new SymbolBase();

        ImportSingle importSingle = new ImportSingle();
        importSingle.setImport(ctx.IMPORT().getText());
        importSingle.setFrom(ctx.FROM().getText());
        importSingle.setID(ctx.ID().getText());
        importSingle.setSTRING_LIT(ctx.STRING_LIT().getText());

        symbolBase.setName(ctx.ID().getText());
        symbolBase.setType(ctx.IMPORT().getText());
        symbolBase.setValue(ctx.STRING_LIT().getText());

        globalScope.define(symbolBase);
        return importSingle;
    }

    @Override
    public ImportComponent visitImportComponent(parserZain.ImportComponentContext ctx) {

        SymbolBase symbolBase = new SymbolBase();

        ImportComponent importComponent = new ImportComponent();
        importComponent.setImport(ctx.IMPORT().getText());
        importComponent.setFrom(ctx.FROM().getText());
        importComponent.setCOMPONENT(ctx.COMPONENT().getText());
        importComponent.setSTRING_LIT(ctx.STRING_LIT().getText());

        symbolBase.setName(ctx.COMPONENT().getText());
        symbolBase.setType(ctx.IMPORT().getText());
        symbolBase.setValue(ctx.STRING_LIT().getText());

        globalScope.define(symbolBase);
        return importComponent;
    }

    @Override
    public ImportArray visitImportArray(parserZain.ImportArrayContext ctx) {
        ImportArray importArray = new ImportArray();
        importArray.setImports(ctx.IMPORTS().getText());
        if (ctx.ID() != null) {
            importArray.setID(ctx.ID().getText());
            semanticCheck.isImport(ctx.ID().getText(),globalScope);
        }
        return importArray;
    }

    @Override
    public NormalTag visitNormalTag(parserZain.NormalTagContext ctx) {
        NormalTag normalTag = new NormalTag();
        normalTag.setOpeningTag(visitOpeningTag(ctx.openingTag()));
        for (int i = 0; i < ctx.element().size(); i++) {
            normalTag.getElement().add(visitElement(ctx.element().get(i)));

        }
        normalTag.setClosingTag(visitClosingTag(ctx.closingTag()));

        return normalTag;
    }

    @Override
    public SelfTag visitSelfTag(parserZain.SelfTagContext ctx) {
        SelfTag selfTag = new SelfTag();
        selfTag.setSelfClosingTag(visitSelfClosingTag(ctx.selfClosingTag()));

        return selfTag;
    }

    @Override
    public Attributes visitNormalAttr(parserZain.NormalAttrContext ctx) {
        NormalAttr normalAttr = new NormalAttr();
        normalAttr.setSTRING_HTML(ctx.STRING_HTML().getText());
        normalAttr.setNAME_HTML(ctx.NAME_HTML().getText());
        return normalAttr;
    }

    @Override
    public StructuralAttr visitStructuralAttr(parserZain.StructuralAttrContext ctx) {
        StructuralAttr structuralAttr = new StructuralAttr();
        structuralAttr.setSTRUCTURAL_DIR_HTML(ctx.STRUCTURAL_DIR_HTML().getText());
        structuralAttr.setSTRING_HTML(ctx.STRING_HTML().getText());

        return structuralAttr;
    }

    @Override
    public BindingAttr visitBindingAttr(parserZain.BindingAttrContext ctx) {
        BindingAttr bindingAttr = new BindingAttr();
        bindingAttr.setBINDING_HTML(ctx.BINDING_HTML().getText());
        bindingAttr.setSTRING_HTML(ctx.STRING_HTML().getText());
        return bindingAttr;
    }

    @Override
    public EventAttr visitEventAttr(parserZain.EventAttrContext ctx) {
        EventAttr eventAttr = new EventAttr();
        eventAttr.setEVENT_BINDING_HTML(ctx.EVENT_BINDING_HTML().getText());
        eventAttr.setSTRING_HTML(ctx.STRING_HTML().getText());
        return eventAttr;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(parserZain.ClassDeclarationContext ctx) {
        LocalScope localScope = new LocalScope(globalScope);

        localScope.setName(ctx.ID().getText());
        scopeStack.push(localScope);
        globalScope.nest(localScope);

        ClassDeclaration classDeclaration = new ClassDeclaration();
        if (ctx.ID().getText() != null) {
            classDeclaration.setNameClass(ctx.ID().getText());
        }
        classDeclaration.setClassDeclarationBody(visitClassDeclarationBody(ctx.classDeclarationBody()));

        return classDeclaration;
    }

    @Override
    public ClassDeclarationBody visitClassDeclarationBody(parserZain.ClassDeclarationBodyContext ctx) {

        ClassDeclarationBody classDeclarationBody = new ClassDeclarationBody();
        if (ctx.classMember() != null) {
            for (int i = 0; i < ctx.classMember().size(); i++) {
                if (ctx.classMember() != null && ctx.classMember(i) != null) {
                    classDeclarationBody.getClassMembers().add(visitClassMember(ctx.classMember(i)));
                }
            }

        }
        return classDeclarationBody;
    }

    @Override
    public ClassMember visitClassMember(parserZain.ClassMemberContext ctx) {
        ClassMember classMember = new ClassMember();
        if (ctx.propertyDeclaration() != null) {
            Object res = visit(ctx.propertyDeclaration()); // test1
            if (res instanceof TypedAssignedProperty){
                TypedAssignedProperty typedAssignedProperty = (TypedAssignedProperty) res;
                classMember.setPropertyDeclaration(typedAssignedProperty);
            }

        }
        if (ctx.methodDeclaration() != null) {
            classMember.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));
        }
        return classMember;

    }


    @Override
    public MethodDeclaration visitMethodDeclaration(parserZain.MethodDeclarationContext ctx) {
        MethodDeclaration methodDeclaration = new MethodDeclaration();

        if (ctx.ID() != null) {
            methodDeclaration.setName(ctx.ID().getText());
//            Row row = new Row() ;
//            row.setType("ID");
//            row.setValue(methodDeclaration.getName());
//            symbolTable.getRows().add(row);


        }
        if (ctx.methodBody() != null) {
            methodDeclaration.setMethodBody(visitMethodBody(ctx.methodBody()));

        }
        if (ctx.type() != null) {
            methodDeclaration.setTypeReturn(visitType(ctx.type()));

        }
        if (ctx.parameterList() != null) {

            methodDeclaration.setParameterLists(visitParameterList(ctx.parameterList()));


        }


        return methodDeclaration;
    }

    @Override
    public TypeV visitType(parserZain.TypeContext ctx) {
        TypeV typeV = new TypeV();
        if (ctx.BOOLEAN_TYPE() != null && ctx.BOOLEAN_TYPE().getText() != null) {
            typeV.setIsboolean(ctx.BOOLEAN_TYPE().getText());
        }
        if (ctx.ID() != null && ctx.ID().getText() != null) {
            typeV.setString_type(ctx.ID().getText());
        }
        if (ctx.list() != null && ctx.list().getText() != null) {
            typeV.setListV(visitList(ctx.list()));
        }
        if (ctx.NUMBER_TYPE() != null && ctx.NUMBER_TYPE().getText() != null) {
            typeV.setNumber_type(ctx.NUMBER_TYPE().getText());
        }
        if (ctx.STRING_TYPE() != null && ctx.STRING_TYPE().getText() != null) {
            typeV.setString_type(ctx.STRING_TYPE().getText());
        }
        return typeV;
    }

    @Override
    public ListV visitList(parserZain.ListContext ctx) {
        ListV listV = new ListV();
        if (ctx.ID() != null) {
            listV.setNameList(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(listV.getNameList());
//            symbolTables.get(0).setRow(row);

        }

        return listV;
    }

    @Override
    public ParameterList visitParameterList(parserZain.ParameterListContext ctx) {
        ParameterList parameterList = new ParameterList();
        for (int i = 0; i < ctx.parameter().size(); i++) {
            if (ctx.parameter(i) != null) {
                parameterList.getParameters().add(visitParameter(ctx.parameter(i)));
            }
        }

        return parameterList;
    }

    @Override
    public Initvalue visitInitvalue(parserZain.InitvalueContext ctx) {
        Initvalue initvalue = new Initvalue();
        if (ctx.STRING_LIT() != null && ctx.STRING_LIT().getText() != null) {
            initvalue.setString(ctx.STRING_LIT().getText());
//            Row row =new Row() ;
//            row.setType("objectFunction");
//            row.setValue(ctx.);
//            symbolTables.get(0).setRow(row);


        } else if (ctx.NUMBER_LIT() != null) {
            initvalue.setNumber(ctx.NUMBER_LIT().getText());
//            Row row =new Row() ;
//            row.setType("NUMBER");
//            row.setValue(initvalue.getNumber());
//            symbolTables.get(0).setRow(row);

        } else if (ctx.isboolean() != null) {
            initvalue.setIsBoolean(visitIsboolean(ctx.isboolean()));

        } else if (ctx.bodylist() != null) {
            initvalue.setBodyList(visitBodylist(ctx.bodylist()));

        }
        if (ctx.object() != null) {

            initvalue.setObjectV(visitObject(ctx.object()));

        }
        return initvalue;
    }

    @Override
    public MethodBody visitMethodBody(parserZain.MethodBodyContext ctx) {
        MethodBody methodBody = new MethodBody();
        for (int i = 0; i < ctx.statementMethod().size(); i++) {
            if (ctx.statementMethod().get(i) != null) {
                //methodBody.getStatementMethods().add(visitStatementMethod(ctx.statementMethod(i)));
                visit(ctx.statementMethod().get(i)); //test3
            }
        }
        return methodBody;
    }

    @Override
    public Parameter visitParameter(parserZain.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        if (ctx.ID() != null) {
            parameter.setName(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(parameter.getName());
//            symbolTable.getRows().add(row);
        }

        if (ctx.type() != null) {
            parameter.setTypeV(visitType(ctx.type()));

        }

        return parameter;


    }

    @Override
    public IsBoolean visitIsboolean(parserZain.IsbooleanContext ctx) {
        IsBoolean isBoolean = new IsBoolean();
        if (ctx.TRUE() != null) {
            isBoolean.setTruev(ctx.TRUE().getText());
//            Row row =new Row() ;
//            row.setType("BOOLEAN");
//            row.setValue(isBoolean.getTruev());
//            symbolTable.getRows().add(row);

        }
        if (ctx.FALSE() != null) {
            isBoolean.setFalsev(ctx.FALSE().getText());

//            Row row =new Row() ;
//            row.setType("BOOLEAN");
//            row.setValue(isBoolean.getFalsev());
//            symbolTable.getRows().add(row);

        }

        return isBoolean;
    }

    @Override
    public BodyList visitBodylist(parserZain.BodylistContext ctx) {
        BodyList bodyList = new BodyList();

        for (int i = 0; i < ctx.initvalue().size(); i++) {
            if (ctx.initvalue(i) != null) {
                bodyList.getInitvalues().add(visitInitvalue(ctx.initvalue(i)));
            }
        }

        return bodyList;
    }

    @Override
    public ObjectV visitObject(parserZain.ObjectContext ctx) {
        ObjectV object = new ObjectV();
        if (ctx.bodyobject() != null) {
            object.setBodyObject(visitBodyobject(ctx.bodyobject()));
        }
        return object;
    }


    @Override
    public VariableDeclaration visitVariableDeclaration(parserZain.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        if (ctx.ID() != null) {
            variableDeclaration.setName(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(variableDeclaration.getName());
//            symbolTable.getRows().add(row);
        }
        if (ctx.expression() != null) {
            variableDeclaration.setExpression(visitExpression(ctx.expression()));
        }
        if (ctx.VAR() != null && ctx.VAR().getText() != null) {
            variableDeclaration.setVar(ctx.VAR().getText());
//            Row row =new Row() ;
//            row.setType("KEYWORD");
//            row.setValue(variableDeclaration.getVar());
//            symbolTable.getRows().add(row);
        }
        if (ctx.CONST() != null) {
            variableDeclaration.setConstv(ctx.CONST().getText());
//            Row row =new Row() ;
//            row.setType("KEYWORD");
//            row.setValue(variableDeclaration.getConstv());
//            symbolTable.getRows().add(row);
        }
        if (ctx.LET() != null) {
            variableDeclaration.setLet(ctx.LET().getText());
//            Row row =new Row() ;
//            row.setType("KEYWORD");
//            row.setValue(variableDeclaration.getLet());
//            symbolTable.getRows().add(row);
        }


        return variableDeclaration;
    }

    @Override
    public Expression visitExpression(parserZain.ExpressionContext ctx) {
        Expression expression = new Expression();

        if (ctx.ID() != null && ctx.ID().getText() != null) {
            expression.setString(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(expression.getString());
//            symbolTable.getRows().add(row);


        } else if (ctx.isboolean() != null) {
            expression.setIsboolean(visitIsboolean(ctx.isboolean()));

        } else if (ctx.variableDeclaration() != null) {
            expression.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        } else if (ctx.functionCall() != null) {
            expression.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        }

        return expression;


    }

    @Override
    public FunctionCall visitFunctionCall(parserZain.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall();
        if (ctx.ID() != null) {
            functionCall.setNameFun(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("NAME FUNCTION");
//            row.setValue(functionCall.getNameFun());
//            symbolTable.getRows().add(row);

        }
        for (int i = 0; i < ctx.argument().size(); i++) {
            if (ctx.argument(i) != null) {
                functionCall.getArguments().add(visitArgument(ctx.argument(i)));
            }
        }

        return functionCall;
    }

    @Override
    public Argument visitArgument(parserZain.ArgumentContext ctx) {
        Argument argument = new Argument();
        if (ctx.expression() != null) {

            argument.setExpression(visitExpression(ctx.expression()));
        }
        return argument;
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(parserZain.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        semanticCheck.isImport(ctx.COMPONENT().getText(),globalScope);
        if (ctx.DECORATOR() != null && ctx.DECORATOR() != null) {
            componentDeclaration.setDecorato(ctx.DECORATOR().getText());
        }
        if (ctx.componentDeclarationBody() != null) {
            componentDeclaration.setComponentDeclarationBody(visitComponentDeclarationBody(ctx.componentDeclarationBody()));
        }

        return componentDeclaration;
    }

    @Override
    public ComponentDeclarationBody visitComponentDeclarationBody(parserZain.ComponentDeclarationBodyContext ctx) {
        ComponentDeclarationBody componentDeclarationBody = new ComponentDeclarationBody();
        if (ctx.componentBodyElement() != null) {
            for (int i = 0; i < ctx.componentBodyElement().size(); i++) {
                componentDeclarationBody.getComponentBodyElements().add(visitComponentBodyElement(ctx.componentBodyElement(i)));
            }
        }
        return componentDeclarationBody;
    }

    @Override
    public ComponentBodyElement visitComponentBodyElement(parserZain.ComponentBodyElementContext ctx) {
        ComponentBodyElement componentBodyElement = new ComponentBodyElement();
        if (ctx.selector() != null) {
            componentBodyElement.setSelector(visitSelector(ctx.selector()));

        }
        if (ctx.standalone() != null) {
            componentBodyElement.setStandalone(visitStandalone(ctx.standalone()));
        }
        if (ctx.importDeclaration() != null) {
            //componentBodyElement.setImportDeclaration(visitImportDeclaration(ctx.importDeclaration()));
            visit(ctx.importDeclaration()); //test 4
        }
        if (ctx.template() != null) {
            componentBodyElement.setTemplate(visitTemplate(ctx.template()));
        }
        if (ctx.styles() != null) {
            componentBodyElement.setStyles(visitStyles(ctx.styles()));
        }

        return componentBodyElement;
    }

    @Override
    public Selector visitSelector(parserZain.SelectorContext ctx) {
        Selector selector = new Selector();
        if (ctx.STRING_LIT() != null) {
            selector.setSTRING_LIT(ctx.STRING_LIT().getText());
        }
        return selector;
    }

    @Override
    public Standalone visitStandalone(parserZain.StandaloneContext ctx) {
        Standalone standalone = new Standalone();
        if (ctx.isboolean() != null) {
            standalone.setIsboolean(visitIsboolean(ctx.isboolean()));
        }

        return standalone;
    }

    @Override
    public Template visitTemplate(parserZain.TemplateContext ctx) {
        Template template = new Template();
        for (int i = 0; i < ctx.element().size(); i++) {
            if (ctx.element(i) != null) {
                template.getElement().add(visitElement(ctx.element(i)));
            }
        }
        return template;
    }

    //
    @Override
    public Element visitElement(parserZain.ElementContext ctx) {
        Element element = new Element();
        if (ctx.tag() != null) {
            //element.setTag(visitTag(ctx.tag()));
            visit(ctx.tag());  // test 5

        }
        if (ctx.interpolation() != null) {
            element.setInterpolation(visitInterpolation(ctx.interpolation()));
        }
        if (ctx.NAME_HTML() != null && ctx.NAME_HTML().getText() != null) {
            element.setHtmlName(ctx.NAME_HTML().getText());
//                Row row =new Row() ;
//                row.setType("HTML_KEYWORD");
//                row.setValue(element.getHtmlName());
//                symbolTable.getRows().add(row);

        }


        return element;
    }

    @Override
    public Interpolation visitInterpolation(parserZain.InterpolationContext ctx) {
        Interpolation interpolation = new Interpolation();

        if (ctx.NAME_HTML() != null) {
            interpolation.setNAME_HTML(ctx.NAME_HTML().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(interpolation.getNAME_HTML());
//            symbolTable.getRows().add(row);

        }
        return interpolation;
    }

    @Override
    public OpeningTag visitOpeningTag(parserZain.OpeningTagContext ctx) {
        OpeningTag openingTag = new OpeningTag();
        if (ctx.attributes() != null) {
            for (int i = 0; i < ctx.attributes().size(); i++) {
                if (ctx.attributes(i) != null && ctx.attributes(i).getText() != null) {
                    //openingTag.getAttributes().add(visitAttributes(ctx.attributes(i)));
                    visit(ctx.attributes(i));  // test 6
                }
            }
        }
        return openingTag;
    }

    @Override
    public ClosingTag visitClosingTag(parserZain.ClosingTagContext ctx) {
        ClosingTag closingTag = new ClosingTag();
        if (ctx.TAG_CLOSE_START_HTML() != null) {
            closingTag.setNAME_HTML(ctx.TAG_CLOSE_START_HTML().getText());
//            Row row =new Row() ;
//            row.setType("HTML_KEYWORD");
//            row.setValue(closingTag.getNAME_HTML());
//            symbolTable.getRows().add(row);

        }

        return closingTag;
    }

    @Override
    public SelfClosingTag visitSelfClosingTag(parserZain.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag = new SelfClosingTag();
        if (ctx.attributes() != null) {
            for (int i = 0; i < ctx.attributes().size(); i++) {
                if (ctx.attributes().get(i) != null) {
                    // selfClosingTag.getAttributes().add(visitAttributes(ctx.attributes(i)));
                    visit(ctx.attributes().get(i));  // test 7
                }
            }
        }
        return selfClosingTag;
    }

    @Override
    public Styles visitStyles(parserZain.StylesContext ctx) {
        Styles styles = new Styles();
        if (ctx.cssBody() != null) {
            styles.setCssBody(visitCssBody(ctx.cssBody()));
        }
        return styles;
    }

    @Override
    public CssBody visitCssBody(parserZain.CssBodyContext ctx) {
        CssBody cssBody = new CssBody();
        if (ctx.cssObjects() != null) {
            cssBody.setCssObjects(visitCssObjects(ctx.cssObjects()));
        }
        return cssBody;
    }

    @Override
    public CssObjects visitCssObjects(parserZain.CssObjectsContext ctx) {
        CssObjects cssObjects = new CssObjects();
        if (ctx.csselement() != null) {
            for (int i = 0; i < ctx.csselement().size(); i++) {
                if (ctx.csselement(i) != null) {
                    cssObjects.getCssElementlist().add(visitCsselement(ctx.csselement(i)));
                }
            }
        }
        return cssObjects;
    }


    @Override
    public CssElement visitCsselement(parserZain.CsselementContext ctx) {
        CssElement cssElement = new CssElement();
        for (int i = 0; i < ctx.ID_CSS().size(); i++) {
            cssElement.getDOT_CSS().add(ctx.ID_CSS().get(i).getText());
        }
        if (ctx.bodyelement() != null) {
            for (int i = 0; i < ctx.bodyelement().size(); i++) {
                if (ctx.bodyelement(i) != null) {
                    cssElement.getBodyCssElements().add(visitBodyelement(ctx.bodyelement(i)));
                }
            }
        }


        return cssElement;
    }


    @Override
    public Bodyelement visitBodyelement(parserZain.BodyelementContext ctx) {
        Bodyelement bodyelement = new Bodyelement();
        if (ctx.ID_CSS() != null && ctx.ID_CSS().getText() != null) {
            bodyelement.setId_css(ctx.ID_CSS().getText());

        }
        if (ctx.cssValue() != null) {
            bodyelement.setCssValue(visitCssValue(ctx.cssValue()));

        }
        return bodyelement;

    }

    @Override
    public CssValue visitCssValue(parserZain.CssValueContext ctx) {
        CssValue cssValue = new CssValue();
        if (ctx.ID_CSS() != null) {
            for (int i = 0; i < ctx.ID_CSS().size(); i++) {
                if (ctx.ID_CSS(i) != null) {
                    cssValue.getID_CSS().add(ctx.ID_CSS(i).getText());
                }
            }
        }
        return cssValue;
    }

    @Override
    public InterfaceDeclaration visitInterfaceDeclaration(parserZain.InterfaceDeclarationContext ctx) {
        InterfaceDeclaration interfaceDeclaration = new InterfaceDeclaration();
        LocalScope localScope = new LocalScope(globalScope);
        localScope.setName(ctx.ID().getText());
        scopeStack.push(localScope);
        globalScope.nest(localScope);

        if (ctx.interfaceMember() != null) {

            for (int i = 0; i < ctx.interfaceMember().size(); i++) {
                if (ctx.interfaceMember(i) != null) {
                    interfaceDeclaration.getInterfaceMembers().add(visitInterfaceMember(ctx.interfaceMember(i)));
                }
            }

        }
        return interfaceDeclaration;
    }


    @Override
    public InterfaceMember visitInterfaceMember(parserZain.InterfaceMemberContext ctx) {
        InterfaceMember interfaceMember = new InterfaceMember();
        if (ctx.propertyDeclaration() != null) {
            // interfaceMember.setPropertyDeclaration(visitPropertyDeclaration(ctx.propertyDeclaration()));
            visit(ctx.propertyDeclaration());
        } else if (ctx.methodDeclaration() != null) {
            interfaceMember.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));

        }
        return interfaceMember;
    }

    @Override
    public BodyObject visitBodyobject(parserZain.BodyobjectContext ctx) {
        BodyObject bodyObject = new BodyObject();
        if (ctx.initvalue() != null) {
            for (int i = 0; i < ctx.initvalue().size(); i++) {
                if (ctx.initvalue(i).getText() != null && ctx.initvalue(i) != null) {
                    bodyObject.getInitvalues().add(visitInitvalue(ctx.initvalue(i)));
                }
            }
        }
        if (ctx.ID() != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                bodyObject.getID().add(ctx.ID().get(i).getText());
            }
        }
        return bodyObject;
    }

}
