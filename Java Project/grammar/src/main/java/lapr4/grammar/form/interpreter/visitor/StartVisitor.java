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
        
    }

    @Override
    public Integer visitAtrribution(ValidatorParser.AtrributionContext ctx) {
        return super.visitAtrribution(ctx);
    }

    @Override
    public Integer visitQuestion(ValidatorParser.QuestionContext ctx) {
        return super.visitQuestion(ctx);
    }

    @Override
    public Integer visitSection(ValidatorParser.SectionContext ctx) {
        return super.visitSection(ctx);
    }

    @Override
    public Integer visitInclude(ValidatorParser.IncludeContext ctx) {
        return super.visitInclude(ctx);
    }
}
