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
    public OptionalType visitIntO(ValidatorParser.IntOContext ctx) {
        return visit(ctx.optional());
    }

    @Override
    public Type visitAtrribution(ValidatorParser.AtrributionContext ctx) {
       Type t =  visit(ctx.val());
       t.setName(ctx.NAME().getText());
       return t;
    }

    @Override
    public Type visitOptional(ValidatorParser.OptionalContext ctx) {
        return super.visitOptional(ctx);
    }

    @Override
    public Type visitOptBodyMultiple(ValidatorParser.OptBodyMultipleContext ctx) {
        return super.visitOptBodyMultiple(ctx);
    }

    @Override
    public Type visitOptBodyAtom(ValidatorParser.OptBodyAtomContext ctx) {
        return super.visitOptBodyAtom(ctx);
    }
}
