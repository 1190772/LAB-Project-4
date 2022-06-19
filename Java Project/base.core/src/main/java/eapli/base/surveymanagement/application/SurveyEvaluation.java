package eapli.base.surveymanagement.application;

import antlr.ParseTree;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SurveyEvaluation {

    public static void parseWithVisitor(String file){
        try{
            //surveyGrammarLexer lexer = new surveyGrammarLexer(CharStreams.fromFileName(file));
            FileInputStream fis = new FileInputStream(file);
            //surveyGrammmarLexer lexer = new surveyGrammarLexer(new ANTLRinputStream(fis));
            //CommonTokenStream token = new CommonTokenStream(token);
            //ParseTree tree = parser.prog(); // parse
            SurveyVisitor surVisitor = new SurveyVisitor();
            //surVisitor.visit(tree);
            System.out.println("Survey has a valid format!");

        } catch (FileNotFoundException e) {
            System.out.println("Problem in the file location!");
        } catch (IOException e) {
            System.out.println("Survey doesnt have the correct format!");
        }
    }
}
