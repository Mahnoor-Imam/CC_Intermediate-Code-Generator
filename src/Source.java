import lexer.Lexer;
import parser_and_tac_generator.ParserAndTranslator;


import java.io.IOException;

public class Source {

    public static void main(String[] args) throws IOException {

        //Lexical Analysis
        Lexer lexer = new Lexer();
        if(!lexer.setFilename(args[0]))
        {
            return;
        }
        lexer.startLexicalAnalysis();
        if(!lexer.success)
        {
            System.exit(1);     //not to proceed further if some error was encountered previously
        }

        //Parsing
        ParserAndTranslator parserAndTranslator = new ParserAndTranslator();
        parserAndTranslator.setFilename(args[0]);
        parserAndTranslator.startParsingAndTranslating();
    }
}