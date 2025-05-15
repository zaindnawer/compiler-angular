package visitor;

import ErrorHandling.ErrorDetection;
import Grammers.parserZain;
import Grammers.parserZainBaseVisitor;
import symbolTable.Row;
import symbolTable.SymbolTable;
import AST.*;

import java.util.ArrayList;
import java.util.List;

public class VisitorAngular extends parserZainBaseVisitor {
    List<SymbolTable> symbolTables = new ArrayList<>();
    public void CreateFiveSymbolTable() {
        for(int i = 0;i < 5;i++){
            symbolTables.add(new SymbolTable());
        }

    }
    @Override

    public Program visitProgram(parserZain.ProgramContext ctx) {
        CreateFiveSymbolTable();
        Program prog = new Program();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) {
                prog.getStatments().add(visitStatement(ctx.statement(i)));
            }
        }
        for (SymbolTable symbolTable : symbolTables) {
            symbolTable.print();
            System.out.println();
        }
        ErrorDetection errorDetection = new ErrorDetection();
        errorDetection.setSymbolTables(this.symbolTables);
        errorDetection.checkError();
        errorDetection.printErrors();
        return prog;
    }

    @Override
    public Statment visitStatement(parserZain.StatementContext ctx) {
        Statment statment = new Statment();

        if(ctx.componentDeclaration()!=null){
            statment.setComponentDeclaration(visitComponentDeclaration(ctx.componentDeclaration()));
        }

        if (ctx.importDeclaration() != null) {

            statment.setImportDeclaration(visitImportDeclaration(ctx.importDeclaration()));
//            Row row =new Row() ;
//            row.setType("declarationImport");
//            row.setValue(ctx.importDeclaration().ID().getText());
//            symbolTables.get(0).setRow(row);
        }
        if (ctx.classDeclaration() != null) {
            statment.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));
        }
        if(ctx.methodDeclaration()!=null){
            statment.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));
        }
        if(ctx.variableDeclaration()!=null){
            statment.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        if(ctx.interfaceDeclaration()!=null){
            statment.setInterfaceDeclaration(visitInterfaceDeclaration(ctx.interfaceDeclaration()));
        }
        return statment;
    }

    @Override
    public ImportDeclaration visitImportDeclaration(parserZain.ImportDeclarationContext ctx) {
        ImportDeclaration importDeclaration = new ImportDeclaration();
        if (ctx.ID()!=null&& ctx.IMPORT() != null) {
            importDeclaration.setId(ctx.ID().getText());
            Row row =new Row() ;
            row.setType("declarationImport");
            row.setValue(ctx.ID().getText());
            symbolTables.get(1).setRow(row);

        }
        if (ctx.ID()!=null && ctx.IMPORTS() != null) {
            importDeclaration.setId(ctx.ID().getText());
            Row row =new Row() ;
            row.setType("usedInImport");
            row.setValue(ctx.ID().getText());
            symbolTables.get(1).setRow(row);
        }
        if (ctx.IMPORT()!= null && ctx.STRING_LIT() != null){
            importDeclaration.setString_lit(ctx.STRING_LIT().getText());
        }
        return importDeclaration;
    }

    @Override
    public ClassDeclaration visitClassDeclaration(parserZain.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();
        if (ctx.ID().getText() != null) {
            classDeclaration.setNameClass(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(classDeclaration.getNameClass());
//            symbolTable.getRows().add(row);
        }
        classDeclaration.setClassDeclarationBody(visitClassDeclarationBody(ctx.classDeclarationBody()));

        return classDeclaration;
    }

    @Override
    public ClassDeclarationBody visitClassDeclarationBody(parserZain.ClassDeclarationBodyContext ctx) {

        ClassDeclarationBody classDeclarationBody = new ClassDeclarationBody();
        if(ctx.classMember()!=null){
            for (int i = 0; i < ctx.classMember().size(); i++) {
                if (ctx.classMember()!=null && ctx.classMember(i) != null) {
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
            classMember.setPropertyDeclaration(visitPropertyDeclaration(ctx.propertyDeclaration()));
        }
        if (ctx.methodDeclaration() != null) {
            classMember.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));
        }
        return classMember;

    }

    @Override
    public PropertyDeclaration visitPropertyDeclaration(parserZain.PropertyDeclarationContext ctx) {
        PropertyDeclaration propertyDeclaration = new PropertyDeclaration();
        Row row =new Row() ;
        row.setType("objectInterface");
        row.setValue(ctx.ID(0).getText());
        symbolTables.get(0).setRow(row);
        if ( ctx.ID() != null) {
            for (int i=0 ;i< ctx.ID().size() ;i++) {
                if (ctx.ID(i).getText() != null && ctx.ID(i)!=null) {
                    propertyDeclaration.getID().add(ctx.ID(i).getText());
                }
            }
        }

        if(ctx.type()!=null){
            propertyDeclaration.setTypeV(visitType(ctx.type()));
        }
        if(ctx.initvalue()!=null){
            propertyDeclaration.setInitvalue(visitInitvalue(ctx.initvalue()));
        }
        return propertyDeclaration;
    }

    @Override
    public MethodDeclaration visitMethodDeclaration(parserZain.MethodDeclarationContext ctx) {
        MethodDeclaration methodDeclaration = new MethodDeclaration();

        if(ctx.ID()!=null){
            methodDeclaration.setName(ctx.ID().getText());
//            Row row = new Row() ;
//            row.setType("ID");
//            row.setValue(methodDeclaration.getName());
//            symbolTable.getRows().add(row);


        }
        if(ctx.methodBody()!=null){
            methodDeclaration.setMethodBody(visitMethodBody(ctx.methodBody()));

        }
        if( ctx.type()!=null){
            methodDeclaration.setTypeReturn(visitType(ctx.type()));

        }
        if(ctx.parameterList()!=null){

            methodDeclaration.setParameterLists(visitParameterList(ctx.parameterList()));


        }


        return methodDeclaration;
    }

    @Override
    public TypeV visitType(parserZain.TypeContext ctx) {
        TypeV typeV = new TypeV();
        if(ctx.BOOLEAN_TYPE()!=null && ctx.BOOLEAN_TYPE().getText()!=null){
            typeV.setIsboolean(ctx.BOOLEAN_TYPE().getText());
//            Row row =new Row() ;
//            row.setType("boolean");
//            row.setValue(typeV.getIsboolean().toString());
//            symbolTable.getRows().add(row);


        }
        if (ctx.ID()!=null && ctx.ID().getText() != null) {
            typeV.setString_type(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(typeV.getString_type());
//            symbolTable.getRows().add(row);


        }  if (ctx.list()!=null && ctx.list().getText() != null) {
            typeV.setListV(visitList(ctx.list()));


        } else if (ctx.NUMBER_TYPE() != null && ctx.NUMBER_TYPE().getText()!=null) {
            typeV.setNumber_type(ctx.NUMBER_TYPE().getText());
//            Row row =new Row() ;
//            row.setType("NUMBER");
//            row.setValue(typeV.getNumber_type());
//            symbolTable.getRows().add(row);

        }
        return typeV;
    }

    @Override
    public ListV visitList(parserZain.ListContext ctx) {
        ListV listV = new ListV();
        if(ctx.ID()!=null){
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
        if (ctx.STRING_LIT() != null && ctx.STRING_LIT().getText()!=null) {
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

        }  if(ctx.object()!=null) {

            initvalue.setObjectV(visitObject(ctx.object()));

        }
        return initvalue;
    }

    @Override
    public MethodBody visitMethodBody(parserZain.MethodBodyContext ctx) {
        MethodBody methodBody = new MethodBody();
        for (int i = 0; i < ctx.statementMethod().size(); i++) {
            if (ctx.statementMethod(i) != null) {
                methodBody.getStatementMethods().add(visitStatementMethod(ctx.statementMethod(i)));
            }
        }
        return methodBody;
    }

    @Override
    public StatementMethod visitStatementMethod(parserZain.StatementMethodContext ctx) {
        StatementMethod statementMethod = new StatementMethod();
        if(ctx.ID()!=null){
            for(int i=0 ;i<ctx.ID().size() ;i++){
                if(ctx.ID(i).getText()!=null &&ctx.ID(i)!=null){
                    statementMethod.getVariable().add(ctx.ID(i).getText());
//                    Row row =new Row() ;
//                    row.setType("ID");
//                    row.setValue(statementMethod.getVariable().get(i));
//                    symbolTable.getRows().add(row);
                }
            }
        }
        if (ctx.expression() != null) {
            statementMethod.setExpression(visitExpression(ctx.expression()));
        } else if (ctx.THIS() != null) {
            statementMethod.setThis(ctx.THIS().getText());
//            Row row =new Row() ;
//            row.setType("Keyword");
//            row.setValue(statementMethod.getThis());
//            symbolTable.getRows().add(row);

        }
        return statementMethod;
    }
    @Override
    public Parameter visitParameter(parserZain.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        if(ctx.ID()!=null){
            parameter.setName(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(parameter.getName());
//            symbolTable.getRows().add(row);
        }

        if(ctx.type()!=null){
            parameter.setTypeV(visitType(ctx.type()));

        }

        return parameter;


    }

    @Override
    public IsBoolean visitIsboolean(parserZain.IsbooleanContext ctx) {
        IsBoolean isBoolean = new IsBoolean();
        if(ctx.TRUE()!=null){
            isBoolean.setTruev(ctx.TRUE().getText());
//            Row row =new Row() ;
//            row.setType("BOOLEAN");
//            row.setValue(isBoolean.getTruev());
//            symbolTable.getRows().add(row);

        }
        if(ctx.FALSE()!=null){
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

        for (int i =0 ;i<ctx.initvalue().size() ;i++){
            if(ctx.initvalue(i)!=null){
                bodyList.getInitvalues().add(visitInitvalue(ctx.initvalue(i)));
            }
        }

        return bodyList;
    }

    @Override
    public ObjectV visitObject(parserZain.ObjectContext ctx) {
        ObjectV object = new ObjectV();
        if(ctx.bodyobject()!=null){
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
        if(ctx.expression()!=null){
            variableDeclaration.setExpression(visitExpression(ctx.expression()));
        }
        if(ctx.VAR()!=null && ctx.VAR().getText()!=null){
            variableDeclaration.setVar(ctx.VAR().getText());
//            Row row =new Row() ;
//            row.setType("KEYWORD");
//            row.setValue(variableDeclaration.getVar());
//            symbolTable.getRows().add(row);
        }
        if(ctx.CONST()!=null){
            variableDeclaration.setConstv(ctx.CONST().getText());
//            Row row =new Row() ;
//            row.setType("KEYWORD");
//            row.setValue(variableDeclaration.getConstv());
//            symbolTable.getRows().add(row);
        }
        if (ctx.LET()!=null){
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

        if (ctx.ID() != null && ctx.ID().getText()!=null) {
            expression.setString(ctx.ID().getText());
//            Row row =new Row() ;
//            row.setType("ID");
//            row.setValue(expression.getString());
//            symbolTable.getRows().add(row);



        } else if (ctx.isboolean()!=null) {
            expression.setIsboolean(visitIsboolean(ctx.isboolean()));

        } else if (ctx.variableDeclaration()!=null) {
            expression.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }
        else if(ctx.functionCall()!=null){
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
        for (int i =0; i<ctx.argument().size();i++)
        {
            if (ctx.argument(i) != null) {
                functionCall.getArguments().add(visitArgument(ctx.argument(i)));
            }
        }

        return  functionCall;
    }

    @Override
    public Argument visitArgument(parserZain.ArgumentContext ctx) {
        Argument argument = new Argument();
        if(ctx.expression()!=null){

            argument.setExpression(visitExpression(ctx.expression()));
        }
        return argument;
    }

    @Override
    public ComponentDeclaration visitComponentDeclaration(parserZain.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();
        if(ctx.DECORATOR()!=null && ctx.DECORATOR()!=null){
            componentDeclaration.setDecorato(ctx.DECORATOR().getText());
//            Row row =new Row() ;
//            row.setType("DECORATER");
//            row.setValue(componentDeclaration.getDecorato());
//            symbolTable.getRows().add(row);

        } if(ctx.componentDeclarationBody()!=null){

            componentDeclaration.setComponentDeclarationBody(visitComponentDeclarationBody(ctx.componentDeclarationBody()));

        }

        return componentDeclaration;
    }

    @Override
    public ComponentDeclarationBody visitComponentDeclarationBody(parserZain.ComponentDeclarationBodyContext ctx) {
        ComponentDeclarationBody componentDeclarationBody = new ComponentDeclarationBody();
        if(ctx.componentBodyElement()!=null){
            for (int i=0 ;i< ctx.componentBodyElement().size();i++){
                componentDeclarationBody.getComponentBodyElements().add(visitComponentBodyElement(ctx.componentBodyElement(i)));
            }
        }
        return componentDeclarationBody;
    }

    @Override
    public ComponentBodyElement visitComponentBodyElement(parserZain.ComponentBodyElementContext ctx) {
        ComponentBodyElement componentBodyElement = new ComponentBodyElement();
        if(ctx.selector()!=null){
            componentBodyElement.setSelector(visitSelector(ctx.selector()));

        }
        if(ctx.standalone()!=null){
            componentBodyElement.setStandalone(visitStandalone(ctx.standalone()));
        }
        if(ctx.importDeclaration()!=null){
            componentBodyElement.setImportDeclaration(visitImportDeclaration(ctx.importDeclaration()));
        }
        if(ctx.template()!=null){
            componentBodyElement.setTemplate(visitTemplate(ctx.template()));
        }
        if(ctx.styles()!=null){
            componentBodyElement.setStyles(visitStyles(ctx.styles()));
        }

        return componentBodyElement;
    }

    @Override
    public Selector visitSelector(parserZain.SelectorContext ctx) {
        Selector selector = new Selector();
        if(ctx.STRING_LIT()!=null){
            selector.setSTRING_LIT(ctx.STRING_LIT().getText());
            Row row =new Row() ;
            row.setType("selectorProperty");
            row.setValue(ctx.SELECTOR().getText());
            symbolTables.get(2).setRow(row);

        }
        return selector;
    }

    @Override
    public Standalone visitStandalone(parserZain.StandaloneContext ctx) {
        Standalone standalone = new Standalone();
        if(ctx.isboolean()!=null){
            standalone.setIsboolean(visitIsboolean(ctx.isboolean()));
        }

        return standalone;
    }

    @Override
    public Template visitTemplate(parserZain.TemplateContext ctx) {
        Template template = new Template();
        Row row =new Row() ;
        row.setType("templateProperty");
        row.setValue(ctx.TEMPLATE().getText());
        symbolTables.get(2).setRow(row);
        for (int i=0 ;i < ctx.element().size() ;i++){
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
        if(ctx.tag()!=null){
            element.setTag(visitTag(ctx.tag()));

        }
        if(ctx.interpolation()!=null){
            element.setInterpolation(visitInterpolation(ctx.interpolation()));
        }
        if(ctx.NAME_HTML()!=null && ctx.NAME_HTML().getText()!=null){
            element.setHtmlName(ctx.NAME_HTML().getText());
//                Row row =new Row() ;
//                row.setType("HTML_KEYWORD");
//                row.setValue(element.getHtmlName());
//                symbolTable.getRows().add(row);

        }


        return element;
    }
    @Override
    public Tag visitTag(parserZain.TagContext ctx) {
        Tag tag = new Tag();
        if (ctx.openingTag() != null && ctx.openingTag().getText()!=null) {
            tag.setOpeningTag(visitOpeningTag(ctx.openingTag()));

        }
        if (ctx.closingTag() != null) {
            tag.setClosingTag(visitClosingTag(ctx.closingTag()));
        }
        if (ctx.selfClosingTag() != null) {
            tag.setSelfClosingTag(visitSelfClosingTag(ctx.selfClosingTag()));
        }
        if (ctx.element() != null) {
            for (parserZain.ElementContext elementCtx : ctx.element()) {
                if (elementCtx != null) {
                    tag.getElements().add(visitElement(elementCtx));
                }
            }
        }
        return tag;
    }


    @Override
    public Interpolation visitInterpolation(parserZain.InterpolationContext ctx) {
        Interpolation interpolation = new Interpolation();

        if(ctx.NAME_HTML()!=null){
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
        if(ctx.attributes()!=null){
            for (int i =0 ; i<ctx.attributes().size();i++){
                if (ctx.attributes(i) != null && ctx.attributes(i).getText()!=null) {
                    openingTag.getAttributes().add(visitAttributes(ctx.attributes(i)));
                }
            }
        }
        return  openingTag;
    }

    @Override
    public ClosingTag visitClosingTag(parserZain.ClosingTagContext ctx) {
        ClosingTag closingTag = new ClosingTag();
        if(ctx.TAG_CLOSE_START_HTML()!=null){
            closingTag.setNAME_HTML(ctx.TAG_CLOSE_START_HTML().getText());
//            Row row =new Row() ;
//            row.setType("HTML_KEYWORD");
//            row.setValue(closingTag.getNAME_HTML());
//            symbolTable.getRows().add(row);

        }

        return  closingTag;
    }
    public Attributes visitAttributes(parserZain.AttributesContext ctx) {
        Attributes attributes = new Attributes();

        if (ctx.STRING_HTML() != null && ctx.STRING_HTML().getText()!=null) {
            attributes.setHtmlString(ctx.STRING_HTML().getText()); // S

        }
        if (ctx.NAME_HTML() != null && ctx.NAME_HTML().getText() != null) {
            attributes.setHtmlName(ctx.NAME_HTML().getText());
            Row row =new Row() ;
            row.setType("altProperty");
            row.setValue(ctx.NAME_HTML().getText());
            symbolTables.get(3).setRow(row);

        }
        if (ctx.BINDING_HTML() != null && ctx.BINDING_HTML().getText()!=null) {
            attributes.setBinding(ctx.BINDING_HTML().getText());
            Row row =new Row() ;
            row.setType("srcProperty");
            row.setValue(ctx.BINDING_HTML().getText());
            symbolTables.get(3).setRow(row);
        }
        if (ctx.STRUCTURAL_DIR_HTML() != null && ctx.STRUCTURAL_DIR_HTML().getText()!=null) {
            attributes.setStructuralDir(ctx.STRUCTURAL_DIR_HTML().getText());


        }
        if (ctx.EVENT_BINDING_HTML() != null && ctx.EVENT_BINDING_HTML()!=null) { // Make sure your grammar has EVENT_BINDING
            attributes.setEvent(ctx.EVENT_BINDING_HTML().getText());
//            Row row =new Row() ;
//            row.setType("EVENT");
//            row.setValue(attributes.getEvent());
//            symbolTable.getRows().add(row);

        }

        return attributes;
    }

    @Override
    public SelfClosingTag visitSelfClosingTag(parserZain.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag = new SelfClosingTag();
        if(ctx.attributes()!=null){
            for (int i =0 ; i<ctx.attributes().size();i++){
                if (ctx.attributes(i) != null) {
                    selfClosingTag.getAttributes().add(visitAttributes(ctx.attributes(i)));
                }
            }
        }
        return  selfClosingTag;
    }

    @Override
    public Styles visitStyles(parserZain.StylesContext ctx) {
        Styles styles = new Styles();
        if(ctx.cssBody()!=null){
            styles.setCssBody(visitCssBody(ctx.cssBody()));
        }
        return styles;
    }

    @Override
    public CssBody visitCssBody(parserZain.CssBodyContext ctx) {
        CssBody cssBody = new CssBody();
        if(ctx.cssObjects()!=null){
            cssBody.setCssObjects(visitCssObjects(ctx.cssObjects()));
        }
        return  cssBody;
    }

    @Override
    public CssObjects visitCssObjects(parserZain.CssObjectsContext ctx) {
        CssObjects cssObjects = new CssObjects();
        if(ctx.csselement()!=null){
            for (int i =0 ; i<ctx.csselement().size();i++){
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
        if(ctx.bodyelement()!=null){
            for (int i =0 ; i<ctx.bodyelement().size();i++){
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
        if(ctx.ID_CSS()!=null && ctx.ID_CSS().getText()!=null) {
            bodyelement.setId_css(ctx.ID_CSS().getText());
            Row row =new Row() ;
            row.setType("ID_CSS");
            row.setValue(bodyelement.getId_css());
            symbolTables.get(4).setRow(row);

        }
        if(ctx.cssValue()!=null){
            bodyelement.setCssValue(visitCssValue(ctx.cssValue()));

        }
        return bodyelement;

    }

    @Override
    public CssValue visitCssValue(parserZain.CssValueContext ctx) {
        CssValue cssValue = new CssValue();
        if(ctx.ID_CSS()!=null ){
            for (int i =0 ; i<ctx.ID_CSS().size();i++){
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
        if(ctx.interfaceMember()!=null){

            for (int i =0 ; i<ctx.interfaceMember().size();i++){
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
        if(ctx.propertyDeclaration()!=null){
            interfaceMember.setPropertyDeclaration(visitPropertyDeclaration(ctx.propertyDeclaration()));
        } else if (ctx.methodDeclaration()!=null) {
            interfaceMember.setMethodDeclaration(visitMethodDeclaration(ctx.methodDeclaration()));

        }
        return interfaceMember;
    }

    @Override
    public BodyObject visitBodyobject(parserZain.BodyobjectContext ctx) {
        BodyObject bodyObject = new BodyObject();
        if(ctx.initvalue()!=null){
            for (int i =0 ; i<ctx.initvalue().size();i++){
                if (ctx.initvalue(i).getText()!=null&& ctx.initvalue(i) != null) {
                    bodyObject.getInitvalues().add(visitInitvalue(ctx.initvalue(i)));
                    Row row =new Row() ;
                    row.setType("objectFunction");
                    row.setValue(ctx.ID(i).getText());
                    symbolTables.get(0).setRow(row);
                }
            }
        }
        return bodyObject;
    }

}
