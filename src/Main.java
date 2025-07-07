
import AST.Program;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.VisitorAngular;
//myTextLanguage1
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
            VisitorAngular visitor=new VisitorAngular();
            Program doc = (Program) visitor.visit(tree);
            System.out.println(doc);

        } catch (IOException e) {
            System.err.println("Error: Unable to open file '");
        }
    }
}
