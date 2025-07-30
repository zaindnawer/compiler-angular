
import AST.Program;

import SymbolTable.Scope.GlobalScope;
import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.VisitorAngular;
//myTextLanguage1
import java.io.FileWriter;
import java.io.IOException;
import Grammers.lexerZain;
import Grammers.parserZain;
public class Main {
    public static void main(String[] args) {
        String source = "tests/test2.txt";
        try {
            CharStream cs = CharStreams.fromFileName(source);
            lexerZain lexer = new lexerZain(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            parserZain parser = new parserZain(token);

            ParseTree tree = parser.program();
            SymbolTable symbolTable = new SymbolTable();

            VisitorAngular visitor=new VisitorAngular(symbolTable);
            Program doc = (Program) visitor.visit(tree);
            System.out.println(doc);

            FileWriter st = new FileWriter("Result\\SymbolTable.txt");
            st.append("Symbol Table\n");
            for (GlobalScope global : symbolTable.getGlobalScopes()) {
                symbolTable.printTree(global," \t",st);

            }
            st.flush();
            st.close();

        } catch (IOException e) {
            System.err.println("Error: Unable to open file '");
        }
    }
}
