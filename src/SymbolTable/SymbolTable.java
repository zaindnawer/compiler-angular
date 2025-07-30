package SymbolTable;

import SymbolTable.Scope.GlobalScope;
import SymbolTable.Scope.LocalScope;
import SymbolTable.Scope.Scope;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SymbolTable {

    private List<GlobalScope> globalScopes = new ArrayList<GlobalScope>();
    private List<LocalScope> localScopes = new ArrayList<LocalScope>();

    private static SymbolTable single_instance = null;

    public static SymbolTable getInstance() {
        if (single_instance == null)
            single_instance = new SymbolTable();
        return single_instance;
    }

    public boolean hasSyntaxError = false;
    public boolean hasSemanticError = false;

    public List<GlobalScope> getGlobalScopes() {
        return globalScopes;
    }

    public void setGlobalScopes(List<GlobalScope> globalScopes) {
        this.globalScopes = globalScopes;
    }

    public List<LocalScope> getLocalScopes() {
        return localScopes;
    }

    public void setLocalScopes(List<LocalScope> scopeList) {
        this.localScopes = scopeList;
    }

    public void addGlobalScope(GlobalScope scope) {
        this.globalScopes.add(scope);
    }

    public void addLocalScope(LocalScope scope) {
        this.localScopes.add(scope);
    }

    public List<Scope> getChildren(Scope scope) {
        return scope.getNestedScopes();
    }

    public void printTree(Scope scope, String s , FileWriter fw) {
        print(scope, s , fw);
        try {
            fw.append("{");
            for (Scope child : getChildren(scope)) {
                fw.append("\n \t");
                printTree(child, s + " " , fw);
            }
            fw.append("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(Scope scope, String indent , FileWriter fw) {
        try {
            fw.append(indent);
            String str = String.format("%10s" + "%4s" + "symbols: %2s", scope.getName(), "", scope.getSymbols());
            fw.append(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//
//    public void printGlobals() {
//        for (int i = 0; i < globalScopes.size(); i++) {
////            print(getGlobalScopes().get(i), "");
//        }
//    }

    public void write(String text) {
        try {
            FileWriter syntaxError = new FileWriter("Result\\Syntax.txt");
            syntaxError.append("Syntax Error : \n");
            syntaxError.write(text);
            syntaxError.flush();
            syntaxError.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
