package lapr4.grammar.form.interpreter;

import lapr4.grammar.antlr.*;
import lapr4.grammar.form.domain.StaticForm;
import lapr4.grammar.form.interpreter.memory.MemoryFrame;
import lapr4.grammar.form.interpreter.visitor.StartVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import lapr4.grammar.form.domain.Answer;

import java.io.IOException;

public class Interpreter {
    private Enviroment enviroment;

    public Interpreter(Enviroment enviroment){
        this.enviroment=enviroment;
    }

    public boolean interpret(String formName, StaticForm<Answer> answeredForm){
        try {
            ValidatorLexer lexer = new ValidatorLexer(CharStreams.fromFileName(String.format("%s/%s.%s",enviroment.getHomeDir(),formName,enviroment.getScriptExtension())));
            TokenStream stream = new CommonTokenStream(lexer);
            ValidatorParser parser = new ValidatorParser(stream);
            MemoryFrame frame = new MemoryFrame();
            frame.loadForm(answeredForm);
            StartVisitor visitor = new StartVisitor(frame,enviroment);
            visitor.visitStart(parser.start());
            return frame.validate();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean interpret(String formName, StaticForm<Answer> answeredForm,Enviroment enviroment){
        Enviroment old = this.enviroment;
        this.enviroment=enviroment;
        boolean flag =interpret(formName, answeredForm);
        this.enviroment=old;
        return flag;
    }








}
