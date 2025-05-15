// Generated from C:/Users/Zain/Desktop/compiler-angular/src/Grammers/parserZain.g4 by ANTLR 4.13.2
package Grammers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parserZain}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parserZainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parserZain#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(parserZain.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(parserZain.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(parserZain.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#componentDeclarationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclarationBody(parserZain.ComponentDeclarationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#componentBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBodyElement(parserZain.ComponentBodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(parserZain.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#standalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandalone(parserZain.StandaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(parserZain.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#styles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyles(parserZain.StylesContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#isboolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsboolean(parserZain.IsbooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(parserZain.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#classDeclarationBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationBody(parserZain.ClassDeclarationBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(parserZain.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypedAssignedProperty}
	 * labeled alternative in {@link parserZain#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedAssignedProperty(parserZain.TypedAssignedPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionalTypedProperty}
	 * labeled alternative in {@link parserZain#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalTypedProperty(parserZain.OptionalTypedPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(parserZain.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(parserZain.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStatement}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(parserZain.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisAssignID}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssignID(parserZain.ThisAssignIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisAssignExpr}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssignExpr(parserZain.ThisAssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link parserZain#statementMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(parserZain.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(parserZain.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#interfaceMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMember(parserZain.InterfaceMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(parserZain.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(parserZain.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(parserZain.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportSingle}
	 * labeled alternative in {@link parserZain#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSingle(parserZain.ImportSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportComponent}
	 * labeled alternative in {@link parserZain#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportComponent(parserZain.ImportComponentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportArray}
	 * labeled alternative in {@link parserZain#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportArray(parserZain.ImportArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(parserZain.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(parserZain.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#bodylist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodylist(parserZain.BodylistContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(parserZain.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#bodyobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyobject(parserZain.BodyobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#initvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvalue(parserZain.InitvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(parserZain.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(parserZain.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(parserZain.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(parserZain.ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalTag}
	 * labeled alternative in {@link parserZain#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTag(parserZain.NormalTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfTag}
	 * labeled alternative in {@link parserZain#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfTag(parserZain.SelfTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#openingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeningTag(parserZain.OpeningTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#closingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosingTag(parserZain.ClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(parserZain.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAttr(parserZain.NormalAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructuralAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralAttr(parserZain.StructuralAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BindingAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingAttr(parserZain.BindingAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventAttr}
	 * labeled alternative in {@link parserZain#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAttr(parserZain.EventAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(parserZain.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#cssBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBody(parserZain.CssBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#cssObjects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssObjects(parserZain.CssObjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#csselement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsselement(parserZain.CsselementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#bodyelement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyelement(parserZain.BodyelementContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserZain#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(parserZain.CssValueContext ctx);
}