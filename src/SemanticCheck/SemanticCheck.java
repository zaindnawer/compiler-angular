package SemanticCheck;

import SymbolTable.Scope.GlobalScope;
import SymbolTable.Scope.Scope;
import SymbolTable.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SemanticCheck {

    SymbolTable symbolTable= SymbolTable.getInstance();
    public static List<String> Errors=new ArrayList<>();

    public void isImport(String name, GlobalScope globalScope) {
        if (!globalScope.symbols.containsKey(name)){
            Errors.add(name + " Does not import");
            checkErrors("Result\\isImportError.txt");
//            Errors.clear();
        }
    }

    public void checkErrors(String fileName) {
        try {
            FileWriter test =  new FileWriter(fileName);
            if (!Errors.isEmpty()){
                symbolTable.hasSemanticError=true;
            }
            test.append("Semantic Check : \n");

            for (int i=0;i<Errors.size();i++){
                test.append(Errors.get(i)+"\n");
            }
            test.flush();
            test.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
