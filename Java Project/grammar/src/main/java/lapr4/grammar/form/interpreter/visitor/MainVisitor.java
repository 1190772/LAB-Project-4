package lapr4.grammar.form.interpreter.visitor;

import lapr4.grammar.antlr.ValidatorBaseVisitor;
import lapr4.grammar.form.interpreter.Enviroment;
import lapr4.grammar.form.interpreter.memory.MemoryFrame;

public abstract class MainVisitor<T> extends ValidatorBaseVisitor<T> {

    protected MemoryFrame frame;
    protected Enviroment enviroment;

    public MainVisitor(MemoryFrame frame, Enviroment enviroment) {
        this.frame = frame;
        this.enviroment = enviroment;
    }
}
