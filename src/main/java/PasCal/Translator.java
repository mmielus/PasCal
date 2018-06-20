package PasCal;

import IOUtils.ReadFile;
import IOUtils.WriteFile;
import gen.PascalLexer;
import gen.PascalParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Translator
{
    public static void main(String[] args) throws Exception
    {
        ANTLRInputStream input = new ANTLRInputStream(ReadFile.readFile("test"));

        PascalLexer lexer = new PascalLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PascalParser parser = new PascalParser(tokens);
        ParseTree tree = parser.program();

        TranslatingVisitor translatingVisitor = new TranslatingVisitor();
        String result = translatingVisitor.visit(tree);

        WriteFile.writeFile("out.c", result);

        System.out.println(result);
    }
}
