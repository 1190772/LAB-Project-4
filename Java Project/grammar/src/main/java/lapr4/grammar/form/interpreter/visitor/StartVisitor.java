package lapr4.grammar.form.interpreter.visitor;

import lapr4.grammar.antlr.ValidatorParser;
import lapr4.grammar.form.interpreter.Enviroment;
import lapr4.grammar.form.interpreter.memory.MemoryFrame;

public class StartVisitor extends MainVisitor<Integer>{

    private TypeVisitor type;
    private IncludeVisitor include;
    private AbstractionsVisitor abstractionsVisitor;

    public StartVisitor(MemoryFrame frame, Enviroment enviroment) {
        super(frame, enviroment);
        type=new TypeVisitor(frame, enviroment);
        include=new IncludeVisitor(frame, enviroment);
        abstractionsVisitor=new AbstractionsVisitor(frame, enviroment);
    }

    @Override
    public Integer visitStart(ValidatorParser.StartContext ctx) {
        return visit(ctx);
    }

    @Override
    public Integer visitAtrribution(ValidatorParser.AtrributionContext ctx) {
        if (type.visit(ctx)==null) {
            return 1;
        }
        return 0;
    }

    @Override
    public Integer visitQuestion(ValidatorParser.QuestionContext ctx) {
        return abstractionsVisitor.visit(ctx);
    }

    @Override
    public Integer visitSection(ValidatorParser.SectionContext ctx) {
        return abstractionsVisitor.visit(ctx);
    }

    @Override
    public Integer visitInclude(ValidatorParser.IncludeContext ctx) {
        int val= include.visit(ctx);
        frame.generate();
        return val;
    }
}
