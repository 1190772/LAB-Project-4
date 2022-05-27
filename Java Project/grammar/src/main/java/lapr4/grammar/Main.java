package lapr4.grammar;

import lapr4.grammar.form.compiler.Compiler;
import lapr4.grammar.form.domain.*;
import lapr4.grammar.form.shared.LanguageValidations;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Compiler compiler = new Compiler("C:\\Users\\Nandinho\\Desktop\\projeto_lapr4\\Java Project\\grammar\\src\\main\\resources");
        Form<Question> form = new Form<>();

        Question q1 = new Question("Age","A", new Config(LanguageValidations.TEXT,"10;3"),false);
        Question q2 = new Question("Sex","B", new Config(LanguageValidations.SINGLE_CHOICE_T,"|\"Teste1\", \"Teste2\"|"),true);
        Question q3 = new Question("Religion","C", new Config(LanguageValidations.SINGLE_CHOICE,"|\"Teste1\", \"Teste2\"|"),true);
        Question q4 = new Question("Help","D", new Config(LanguageValidations.SCALE,"55;|\"Teste1\", \"Teste2\",\"Teste3\", \"Teste4\",\"Teste5\"|"),false);

        Section<Question> s1 = new Section<>(false);
        s1.add(q1);
        s1.add(q2);
        Section<Question> s2 = new Section<>(true);
        s2.add(q3);
        s2.add(q4);
        form.add(s1);
        form.add(s2);

        StaticForm<Question> r = new StaticForm<>(form);


        try {
            compiler.compile(r,true,"Simple_Form","cform");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
