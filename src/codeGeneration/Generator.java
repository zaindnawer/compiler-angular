package codeGeneration;

import AST.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Generator {
    boolean isVisitCss = false;
    boolean isVisitHtml = false;
    boolean isVisitJs = false;
    public void generate(Program program) {
        String Space = "\t\t";

        try {
            FileWriter fw = new FileWriter("Result\\GeneratedCode.html");
            generate("<!DOCTYPE html>", fw);
            generate("\n<html>", fw);
            generate("\n<head>", fw);
            generate("\n<style>", fw);
            isVisitCss = true;
            for (int i=0; i < program.getStatments().size(); i++){
                generate(program.getStatments().get(i),Space,fw);
            }
            generate("\n</style>", fw);
            isVisitCss = false;
            generate("\n<title>Angular App</title>", fw);
            generate("\n</head>", fw);
            isVisitHtml = true;
            generate("\n<body>\n", fw);
            // html
            for (int i=0; i < program.getStatments().size(); i++){
                generate(program.getStatments().get(i),Space,fw);
            }

            isVisitHtml = false;
            isVisitJs = true;
            generate("\n<script>\n", fw);
            for (int i=0; i < program.getStatments().size(); i++){
                generate(program.getStatments().get(i),Space,fw);
            }
            generate("\n",fw);
            generate("\n</script>", fw);
            isVisitJs = false;
            generate("\n</body>", fw);
            generate("\n</html>", fw);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void generate(String s, FileWriter fw) {
        try {
            System.out.print("\n");
            fw.append(s);
        } catch (IOException e) {
            System.out.println("error" + e.getMessage());
        }
    }
    public void generate(Statment statment,String s, FileWriter fw) {
        if (statment.getComponentDeclaration() != null){
            generate(statment.getComponentDeclaration(),s,fw);
        }
        if (statment.getClassDeclaration() != null && isVisitJs){
            generate(statment.getClassDeclaration(),s,fw);
        }
    }
    public void generate(ComponentDeclaration componentDeclaration, String s, FileWriter fw) {
        generate(componentDeclaration.getComponentDeclarationBody(),s,fw);
    }
    public void generate(ComponentDeclarationBody componentDeclarationBody, String s, FileWriter fw) {
        for (int i=0; i < componentDeclarationBody.getComponentBodyElements().size(); i++){
            generate(componentDeclarationBody.getComponentBodyElements().get(i),s,fw);
        }
    }
    public void generate(ComponentBodyElement componentBodyElement, String s, FileWriter fw) {
        if (componentBodyElement.getStyles() != null && isVisitCss){
            generate(componentBodyElement.getStyles(),s,fw);
        }
        if (componentBodyElement.getTemplate() != null && isVisitHtml){
            generate(componentBodyElement.getTemplate(),s,fw);
        }
    }
    public void generate(Styles styles, String s, FileWriter fw) {
        generate(styles.getCssBody(),s,fw);
    }
    public void generate(CssBody cssBody, String s, FileWriter fw) {
        generate(cssBody.getCssObjects(),s,fw);
    }
    public void generate(CssObjects cssObjects, String s, FileWriter fw) {
        if (cssObjects.getCssElementlist() != null){
            for (int i=0; i < cssObjects.getCssElementlist().size(); i++){
                generate(cssObjects.getCssElementlist().get(i),s,fw);
            }
        }
    }
    public void generate(CssElement cssElement, String s, FileWriter fw) {
        generate("\n.",fw);
        for (int i=0; i < cssElement.getDOT_CSS().size(); i++){
            generate(cssElement.getDOT_CSS().get(i),fw);
            generate(" ",fw);
        }
        generate(" {\n",fw);
        for (int i=0; i < cssElement.getBodyCssElements().size(); i++){
            generate(cssElement.getBodyCssElements().get(i),s,fw);
        }
        generate("}",fw);
    }
    public void generate(Bodyelement bodyelement, String s, FileWriter fw) {
        generate(bodyelement.getId_css(),fw);
        generate(":",fw);
        generate(bodyelement.getCssValue(),s,fw);
    }
    public void generate(CssValue cssValue, String s, FileWriter fw) {
        for (int i=0; i < cssValue.getID_CSS().size(); i++){
            generate(cssValue.getID_CSS().get(i),fw);
            generate(" ",fw);
        }
        generate(";\n",fw);
    }

// classDeclaration
    public void generate(ClassDeclaration classDeclaration,String s, FileWriter fw) {
        generate(classDeclaration.getClassDeclarationBody(),s,fw);
    }
    public void generate(ClassDeclarationBody classDeclarationBody,String s, FileWriter fw) {
        if (classDeclarationBody.getClassMembers() != null){
            for (int i=0; i < classDeclarationBody.getClassMembers().size(); i++){
                generate(classDeclarationBody.getClassMembers().get(i),s,fw);
            }
        }
    }
    public void generate(ClassMember classMember,String s, FileWriter fw) {
        if (classMember.getPropertyDeclaration() != null){
            generate(classMember.getPropertyDeclaration(),s,fw);
        }
    }
    public void generate(PropertyDeclaration propertyDeclaration,String s, FileWriter fw) {
        if (propertyDeclaration instanceof TypedAssignedProperty){
            TypedAssignedProperty typedAssignedProperty = (TypedAssignedProperty) propertyDeclaration;
            generate(typedAssignedProperty,s,fw);
        }
    }
    public void generate(TypedAssignedProperty typedAssignedProperty,String s, FileWriter fw) {
        generate("\nconst ",fw);
        generate(typedAssignedProperty.getID(),fw);
        generate(" =  ",fw);
        generate(typedAssignedProperty.getInitvalue(),s,fw);
    }
    public void generate(Initvalue initvalue,String s, FileWriter fw) {
        if (initvalue.getBodyList() != null){
            generate(" [\n",fw);
            generate(initvalue.getBodyList(),s,fw);
            generate("\n]",fw);
        }
        if (initvalue.getObjectV() != null){
            generate(initvalue.getObjectV(),s,fw);
        }
        if (initvalue.getString() != null){
            generate(initvalue.getString(),fw);
        }
        if (initvalue.getNumber() != null){
            generate(initvalue.getNumber(),fw);
        }
    }
    public void generate(BodyList bodyList,String s, FileWriter fw) {
        if (bodyList.getInitvalues() != null){
            for (int i=0; i < bodyList.getInitvalues().size(); i++){
                generate(bodyList.getInitvalues().get(i),s,fw);
                generate(",\n",fw);
            }
        }
    }
    public void generate(ObjectV objectV,String s, FileWriter fw) {
       generate("{\n",fw);
       generate(objectV.getBodyObject(),s,fw);
       generate("\n}",fw);
    }
    public void generate(BodyObject bodyObject,String s, FileWriter fw) {
        if (bodyObject.getInitvalues() != null){
            for (int i=0; i < bodyObject.getInitvalues().size(); i++){
                generate(bodyObject.getID().get(i),fw);
                generate(": ",fw);
                generate(bodyObject.getInitvalues().get(i),s,fw);
                generate(",\n",fw);
            }
        }
    }
    // html
    public void generate(Template template, String s, FileWriter fw) {

    }

}