import AST.Program;
import CodeGeneration.Generator;
import SemanticTable.ErrorHandler;
import SymbolTable.SymbolTable;
import Visitor.BaseVisitor;
import antlr.AngulerLexer;
import antlr.AngulerParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {

        String source =
                "C://Users//Rahaf//Downloads//Telegram Desktop//compiler (19)//compiler (15)//compiler (8) (5) (3) (2)//compiler (8) (5) (3)//compiler (8) (5)//compiler (8)//compiler//files//first_ui.txt";
        CharStream cs = CharStreams.fromFileName(source);

        AngulerLexer lexer = new AngulerLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AngulerParser parser = new AngulerParser(tokens);


        ParseTree tree = parser.prog();

        BaseVisitor visitor = new BaseVisitor();


        Program doc = (Program) visitor.visit(tree);


        SymbolTable symbolTable = visitor.getSymbolTable();
        if (!ErrorHandler.errors.isEmpty()) {
            ErrorHandler.writeErrorsToFile();

            //SymbolTableInjectableNoProvidedIn.getInstance().printSymbolTable();

            //  SymbolTableNoSelector.getInstance().printSymbolTable();

            throw new RuntimeException("Processing failed with " + ErrorHandler.errors.size() + " error(s). See Result/Semantic.txt for details.");

        } else {
            System.out.println("Processing completed successfully.");

            System.out.println("=== Program Structure ===");
            System.out.println(doc);

            System.out.println("\n=== Testing Generator ===");
            //System.out.println("\n=== Symbol Table ===");
            symbolTable.printSymbolTable();

            Generator generator = new Generator();
              generator.generate(doc);

        }


    }
}