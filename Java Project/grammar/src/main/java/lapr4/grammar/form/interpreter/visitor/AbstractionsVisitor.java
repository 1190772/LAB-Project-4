package lapr4.grammar.form.interpreter.visitor;

import lapr4.grammar.antlr.ValidatorParser;
import lapr4.grammar.form.interpreter.Enviroment;
import lapr4.grammar.form.interpreter.abstraction.QuestionAbstraction;
import lapr4.grammar.form.interpreter.abstraction.SectionAbstraction;
import lapr4.grammar.form.interpreter.memory.MemoryFrame;

public class AbstractionsVisitor extends MainVisitor<Integer>{

    private ValidationVisitor visitor;
    public AbstractionsVisitor(MemoryFrame frame, Enviroment enviroment) {
        super(frame, enviroment);
        visitor=new ValidationVisitor(frame,enviroment);
    }

    @Override
    public Integer visitQuestion(ValidatorParser.QuestionContext ctx) {
        boolean optional=true;
        if (ctx.opt==null){
            optional=false;
        }

        try {
            //TODO put answer in stack
            int i = visitor.visit(ctx.validation());
            frame.addQuestion(Integer.parseInt(ctx.secIndex.getText()),new QuestionAbstraction(
                    Integer.parseInt(ctx.qIndex.getText()),optional,"", i==0));
        } catch (Exception e) {
            return 1;
        }
        return 0;
    }

    @Override
    public Integer visitSection(ValidatorParser.SectionContext ctx) {
        boolean optional=true;
        if (ctx.opt==null){
            optional=false;
        }
        try {
            frame.addSection(new SectionAbstraction(Integer.parseInt(ctx.INT().getText()),optional));
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }
}
