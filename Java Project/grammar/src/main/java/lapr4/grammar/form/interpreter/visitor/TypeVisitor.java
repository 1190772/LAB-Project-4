package lapr4.grammar.form.interpreter.visitor;

import lapr4.grammar.antlr.ValidatorParser;
import lapr4.grammar.form.interpreter.Enviroment;
import lapr4.grammar.form.interpreter.memory.MemoryFrame;
import lapr4.grammar.form.interpreter.types.IntType;
import lapr4.grammar.form.interpreter.types.OptionalType;
import lapr4.grammar.form.interpreter.types.Type;

public class TypeVisitor extends MainVisitor<Type>{

    public TypeVisitor(MemoryFrame frame, Enviroment enviroment) {
        super(frame, enviroment);
    }

    @Override
    public IntType visitIntV(ValidatorParser.IntVContext ctx) {
        return new IntType("",Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public Type visitIntO(ValidatorParser.IntOContext ctx) {
        return visit(ctx.optional());
    }

    @Override
    public Type visitAtrribution(ValidatorParser.AtrributionContext ctx) {
       Type t =  visit(ctx.val());
       t.setName(ctx.NAME().getText());
       frame.putConstant(t.name(),t);
       return t;
    }

    @Override
    public Type visitOptional(ValidatorParser.OptionalContext ctx) {
        return visit(ctx.optionalBody());
    }

    @Override
    public Type visitOptBodyMultiple(ValidatorParser.OptBodyMultipleContext ctx) {
        OptionalType tmp = (OptionalType) visit(ctx.optionalBody());
        return new OptionalType("",String.format("%s;%s",ctx.atom.getText(),tmp.value()));
    }

    @Override
    public OptionalType visitOptBodyAtom(ValidatorParser.OptBodyAtomContext ctx) {
        return new OptionalType("",ctx.atom.getText());
    }
}
