
import AST.Program;
import Grammers.lexerZain;
import Grammers.parserZain;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.VisitorAngular;
//myTextLanguage1
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String source = "tests/test1.txt";
//        String source2 ="myTextLanguage1.txt";
        try {
            // Attempt to read the file
            CharStream cs = CharStreams.fromFileName(source);
            lexerZain lexer = new lexerZain(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            parserZain parser = new parserZain(token);

            ParseTree tree = parser.program();
            VisitorAngular visitor=new VisitorAngular();
            Program doc = (Program) visitor.visit(tree);
            System.out.println(doc);

        } catch (IOException e) {
            // Handle the exception if the file is not found
            System.err.println("Error: Unable to open file '");

        }
    }
}
