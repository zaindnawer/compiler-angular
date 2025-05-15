package ErrorHandling;
import symbolTable.Row;
import symbolTable.SymbolTable;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ErrorDetection {
    private List<SymbolTable> symbolTables;
    private final Error error;

    // Constructors
    public ErrorDetection() {
        this(new ArrayList<>());
    }

    public ErrorDetection(List<SymbolTable> symbolTables) {
        this.symbolTables = symbolTables != null ? symbolTables : new ArrayList<>();
        this.error = new Error();
    }

    public List<SymbolTable> getSymbolTables() {
        return new ArrayList<>(symbolTables);
    }

    public Error getError() {
        return error;
    }

    public void setSymbolTables(List<SymbolTable> symbolTables) {
        this.symbolTables = symbolTables != null ? symbolTables : new ArrayList<>();
    }

    public boolean checkError() {
        boolean isError = true;
        if (!CheckDeclarationOfproperty(this.symbolTables)) {
            System.out.println();
            isError = false;
        }
        if (!checkImportComponents(this.symbolTables)) {
            System.out.println();
            isError = false;
        }
        if (!checkImportantProperty(this.symbolTables)) {
            System.out.println();
            isError = false;
        }
        if (!missingPropertyInImage(this.symbolTables)) {
            System.out.println();
            isError = false;
        }
        if (!checkKeyWordsInCss(this.symbolTables)) {
            System.out.println();
            isError = false;
        }
        return isError;
    }

    private boolean CheckDeclarationOfproperty(List<SymbolTable> symbolTables) {
        SymbolTable symbolTable = symbolTables.get(0);
        List<String> interfaceObjects = new ArrayList<>();
        List<String> functionObjects = new ArrayList<>();
        // stored in two lists
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("objectInterface"))
                    interfaceObjects.add(symbolTable.getRows().get(i).getValue());
                if (symbolTable.getRows().get(i).getType().contains("objectFunction"))
                    functionObjects.add(symbolTable.getRows().get(i).getValue());
            }
        }
        //boolean hasMismatch = false;

        // compare between two lists
        for (String funcAttr : functionObjects) {
            if (!interfaceObjects.contains(funcAttr)) {
                error.getErrors().add(funcAttr + " doesn't exist in interface body");
                return false;
            }
        }

      return true;
    }
    private boolean checkImportComponents(List<SymbolTable> symbolTables) {
        SymbolTable symbolTable = symbolTables.get(1);
        List<String>  importDeclLists = new ArrayList<>();
        List<String> importPropertyLists = new ArrayList<>();
        // store import component and used component(in @Component) in two lists
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("declarationImport"))
                    importDeclLists.add(symbolTable.getRows().get(i).getValue());
                if (symbolTable.getRows().get(i).getType().contains("usedInImport"))
                    importPropertyLists.add(symbolTable.getRows().get(i).getValue());
            }
        }
        //check if used component like imports: [commonModule] is imported or not
        for (String x : importPropertyLists) {
            if (!importDeclLists.contains(x)) {
                error.getErrors().add( x + " doesn't exist in imports");
                return false;
            }
        }
        return true;
    }
    private boolean checkImportantProperty (List<SymbolTable> symbolTables){
        boolean hasError = true;
        SymbolTable symbolTable = symbolTables.get(2);
        List<String> selectors = new ArrayList<>();
        List<String> templates = new ArrayList<>();
        //store selector and template in two list
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("selectorProperty"))
                    selectors.add(symbolTable.getRows().get(i).getValue());
                if (symbolTable.getRows().get(i).getType().contains("templateProperty"))
                    templates.add(symbolTable.getRows().get(i).getValue());
            }
        }
        //check if list contain template (this list only contains template property)
        if (templates.isEmpty()) {
            error.getErrors().add("template is not exist in Component Declaration");
            hasError = false;
        }
        //check if list contain selector (this list only contains selector property)
        if (selectors.isEmpty()) {
            error.getErrors().add("selector is not exist in Component Declaration");
            hasError = false;
        }
        return hasError;
    }
        boolean missingPropertyInImage(List<SymbolTable> symbolTables) {
        boolean is_error = true;
        int srcCount = 0;
        int altCount = 0;
        SymbolTable symbolTable = symbolTables.get(3);
        List<String> srcValues = new ArrayList<>();
        List<String> altValues = new ArrayList<>();
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getValue().contains("alt")){
                    srcCount++;
                    srcValues.add(symbolTable.getRows().get(i).getValue());
                    }
                if (symbolTable.getRows().get(i).getType().contains("srcProperty")){
                    altCount++;
                    altValues.add(symbolTable.getRows().get(i).getValue());
                    }
            }
        }
        for (String src : srcValues) {
            if (isValidAttributeName(src)) {
                is_error = false;
                System.err.println("Invalid attribute src: " + src);
            }
        }
        for (String alt : altValues) {
            if (isValidAttributeName(alt)) {
                is_error = false;
                System.err.println("Invalid attribute alt: " + alt);
            }
        }
        if(srcCount != altCount){
            is_error = false;
            System.err.println("missing attribute in img tag");
        }
        return is_error;
    }
    private boolean checkKeyWordsInCss (List<SymbolTable> symbolTables){
        boolean hasError = true;
        SymbolTable symbolTable = symbolTables.get(4);
        List<String> cssValues = new ArrayList<>();
        for (int i = 0; i < symbolTable.getRows().size(); i++) {
            if (symbolTable.getRows().get(i) != null) {
                if (symbolTable.getRows().get(i).getType().contains("ID_CSS"))
                    cssValues.add(symbolTable.getRows().get(i).getValue());
            }
        }
        for (String att : cssValues) {
            if (isValidAttributeName(att)) {
                hasError = false;
                System.err.println("Invalid attribute in Css: " + att);
            }
        }
        return hasError;
    }

    boolean isValidAttributeName(String attributeName) {
        List<String> validAttributeNames = Arrays.asList("[src]", "alt","display", "width", "gap", "border-right", "list-style-type",
                "padding", "align-items", "border-bottom", "cursor", "height", "object-fit", "margin-bottom");
        return !validAttributeNames.contains(attributeName);
    }
    public void printErrors() {
        error.print();  // Using the print() method from your Error class
    }
}

