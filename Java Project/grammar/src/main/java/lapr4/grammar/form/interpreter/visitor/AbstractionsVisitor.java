package lapr4.grammar.form.interpreter.visitor;

import lapr4.grammar.antlr.ValidatorParser;
import lapr4.grammar.form.interpreter.Enviroment;
import lapr4.grammar.form.interpreter.memory.MemoryFrame;

public class AbstractionsVisitor extends MainVisitor<Integer>{


    public AbstractionsVisitor(MemoryFrame frame, Enviroment enviroment) {
        super(frame, enviroment);
    }

    @Override
    public Integer visitQuestion(ValidatorParser.QuestionContext ctx) {
        return 
    }

    @Override
    public Integer visitSection(ValidatorParser.SectionContext ctx) {
        return super.visitSection(ctx);
    }
}
