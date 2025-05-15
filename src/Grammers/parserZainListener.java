// Generated from C:/Users/Zain/Desktop/compiler-angular/src/Grammers/parserZain.g4 by ANTLR 4.13.2
package Grammers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parserZain}.
 */
public interface parserZainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parserZain#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(parserZain.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(parserZain.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(parserZain.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(parserZain.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(parserZain.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(parserZain.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#componentDeclarationBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclarationBody(parserZain.ComponentDeclarationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#componentDeclarationBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclarationBody(parserZain.ComponentDeclarationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterComponentBodyElement(parserZain.ComponentBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitComponentBodyElement(parserZain.ComponentBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(parserZain.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(parserZain.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#standalone}.
	 * @param ctx the parse tree
	 */
	void enterStandalone(parserZain.StandaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#standalone}.
	 * @param ctx the parse tree
	 */
	void exitStandalone(parserZain.StandaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(parserZain.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(parserZain.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#styles}.
	 * @param ctx the parse tree
	 */
	void enterStyles(parserZain.StylesContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#styles}.
	 * @param ctx the parse tree
	 */
	void exitStyles(parserZain.StylesContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#isboolean}.
	 * @param ctx the parse tree
	 */
	void enterIsboolean(parserZain.IsbooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#isboolean}.
	 * @param ctx the parse tree
	 */
	void exitIsboolean(parserZain.IsbooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(parserZain.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(parserZain.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#classDeclarationBody}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationBody(parserZain.ClassDeclarationBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#classDeclarationBody}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationBody(parserZain.ClassDeclarationBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(parserZain.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(parserZain.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedAssignedProperty}
	 * labeled alternative in {@link parserZain#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedAssignedProperty(parserZain.TypedAssignedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedAssignedProperty}
	 * labeled alternative in {@link parserZain#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedAssignedProperty(parserZain.TypedAssignedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionalTypedProperty}
	 * labeled alternative in {@link parserZain#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOptionalTypedProperty(parserZain.OptionalTypedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionalTypedProperty}
	 * labeled alternative in {@link parserZain#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOptionalTypedProperty(parserZain.OptionalTypedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(parserZain.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(parserZain.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(parserZain.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(parserZain.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(parserZain.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(parserZain.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisAssignID}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 */
	void enterThisAssignID(parserZain.ThisAssignIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisAssignID}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 */
	void exitThisAssignID(parserZain.ThisAssignIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisAssignExpr}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 */
	void enterThisAssignExpr(parserZain.ThisAssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisAssignExpr}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 */
	void exitThisAssignExpr(parserZain.ThisAssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(parserZain.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(parserZain.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(parserZain.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(parserZain.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMember(parserZain.InterfaceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#interfaceMember}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMember(parserZain.InterfaceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(parserZain.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(parserZain.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(parserZain.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(parserZain.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(parserZain.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(parserZain.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportSingle}
	 * labeled alternative in {@link parserZain#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportSingle(parserZain.ImportSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportSingle}
	 * labeled alternative in {@link parserZain#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportSingle(parserZain.ImportSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportComponent}
	 * labeled alternative in {@link parserZain#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportComponent(parserZain.ImportComponentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportComponent}
	 * labeled alternative in {@link parserZain#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportComponent(parserZain.ImportComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportArray}
	 * labeled alternative in {@link parserZain#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportArray(parserZain.ImportArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportArray}
	 * labeled alternative in {@link parserZain#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportArray(parserZain.ImportArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#type}.
	 * @param ctx the parse tree
	 */
	void enterType(parserZain.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#type}.
	 * @param ctx the parse tree
	 */
	void exitType(parserZain.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#list}.
	 * @param ctx the parse tree
	 */
	void enterList(parserZain.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#list}.
	 * @param ctx the parse tree
	 */
	void exitList(parserZain.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#bodylist}.
	 * @param ctx the parse tree
	 */
	void enterBodylist(parserZain.BodylistContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#bodylist}.
	 * @param ctx the parse tree
	 */
	void exitBodylist(parserZain.BodylistContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(parserZain.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(parserZain.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#bodyobject}.
	 * @param ctx the parse tree
	 */
	void enterBodyobject(parserZain.BodyobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#bodyobject}.
	 * @param ctx the parse tree
	 */
	void exitBodyobject(parserZain.BodyobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#initvalue}.
	 * @param ctx the parse tree
	 */
	void enterInitvalue(parserZain.InitvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#initvalue}.
	 * @param ctx the parse tree
	 */
	void exitInitvalue(parserZain.InitvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(parserZain.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(parserZain.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(parserZain.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(parserZain.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(parserZain.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(parserZain.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(parserZain.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(parserZain.ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalTag}
	 * labeled alternative in {@link parserZain#tag}.
	 * @param ctx the parse tree
	 */
	void enterNormalTag(parserZain.NormalTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalTag}
	 * labeled alternative in {@link parserZain#tag}.
	 * @param ctx the parse tree
	 */
	void exitNormalTag(parserZain.NormalTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfTag}
	 * labeled alternative in {@link parserZain#tag}.
	 * @param ctx the parse tree
	 */
	void enterSelfTag(parserZain.SelfTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfTag}
	 * labeled alternative in {@link parserZain#tag}.
	 * @param ctx the parse tree
	 */
	void exitSelfTag(parserZain.SelfTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#openingTag}.
	 * @param ctx the parse tree
	 */
	void enterOpeningTag(parserZain.OpeningTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#openingTag}.
	 * @param ctx the parse tree
	 */
	void exitOpeningTag(parserZain.OpeningTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#closingTag}.
	 * @param ctx the parse tree
	 */
	void enterClosingTag(parserZain.ClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#closingTag}.
	 * @param ctx the parse tree
	 */
	void exitClosingTag(parserZain.ClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(parserZain.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(parserZain.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 */
	void enterNormalAttr(parserZain.NormalAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 */
	void exitNormalAttr(parserZain.NormalAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructuralAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 */
	void enterStructuralAttr(parserZain.StructuralAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructuralAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 */
	void exitStructuralAttr(parserZain.StructuralAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BindingAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 */
	void enterBindingAttr(parserZain.BindingAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BindingAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 */
	void exitBindingAttr(parserZain.BindingAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 */
	void enterEventAttr(parserZain.EventAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 */
	void exitEventAttr(parserZain.EventAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(parserZain.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(parserZain.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#cssBody}.
	 * @param ctx the parse tree
	 */
	void enterCssBody(parserZain.CssBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#cssBody}.
	 * @param ctx the parse tree
	 */
	void exitCssBody(parserZain.CssBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#cssObjects}.
	 * @param ctx the parse tree
	 */
	void enterCssObjects(parserZain.CssObjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#cssObjects}.
	 * @param ctx the parse tree
	 */
	void exitCssObjects(parserZain.CssObjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#csselement}.
	 * @param ctx the parse tree
	 */
	void enterCsselement(parserZain.CsselementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#csselement}.
	 * @param ctx the parse tree
	 */
	void exitCsselement(parserZain.CsselementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#bodyelement}.
	 * @param ctx the parse tree
	 */
	void enterBodyelement(parserZain.BodyelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#bodyelement}.
	 * @param ctx the parse tree
	 */
	void exitBodyelement(parserZain.BodyelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link parserZain#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(parserZain.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link parserZain#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(parserZain.CssValueContext ctx);
}