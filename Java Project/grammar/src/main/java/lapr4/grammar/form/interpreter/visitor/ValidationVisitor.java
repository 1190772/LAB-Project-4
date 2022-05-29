package lapr4.grammar.form.interpreter.visitor;

import lapr4.grammar.antlr.ValidatorParser;
import lapr4.grammar.form.interpreter.Enviroment;
import lapr4.grammar.form.interpreter.functions.*;
import lapr4.grammar.form.interpreter.memory.MemoryFrame;
import lapr4.grammar.form.interpreter.types.IntType;
import lapr4.grammar.form.interpreter.types.OptionalType;

public class ValidationVisitor extends MainVisitor<Integer> {

    private TypeVisitor visitor;

    public ValidationVisitor(MemoryFrame frame, Enviroment enviroment) {
        super(frame, enviroment);
        visitor = new TypeVisitor(frame, enviroment);
    }

    @Override
    public Integer visitTextV(ValidatorParser.TextVContext ctx) {
        TextValidation t = new TextValidation();
        t.setAnswer(frame.getStack().pop());
        if (ctx.nLines == null || ctx.nCharPerLine == null) {
            if (t.validate()) {
                return 0;
            }
            return 1;
        }
        if (t.validate(Integer.parseInt(visitor.visit(ctx.nLines).value()), Integer.parseInt(visitor.visit(ctx.nCharPerLine).value()))) {
            return 0;
        }
        return 1;
    }

    @Override
    public Integer visitIsIntV(ValidatorParser.IsIntVContext ctx) {
        IsIntValidation isInt = new IsIntValidation();
        return isInt.setAnswer(frame.getStack().pop()).validate() ? 0 : 1;
    }

    @Override
    public Integer visitIsNumericV(ValidatorParser.IsNumericVContext ctx) {
        IsNumericValidation isInt = new IsNumericValidation();
        return isInt.setAnswer(frame.getStack().pop()).validate() ? 0 : 1;
    }

    @Override
    public Integer visitSingleChoiceV(ValidatorParser.SingleChoiceVContext ctx) {
        SingleChoiceValidation sc = new SingleChoiceValidation();
        return sc.setAnswer(frame.getStack().pop()).validate(((OptionalType) visitor.visit(ctx.opt))) ? 0 : 1;
    }

    @Override
    public Integer visitMultipleChoiceV(ValidatorParser.MultipleChoiceVContext ctx) {
        MultipleChoiceValidation mo = new MultipleChoiceValidation();
        mo.setAnswer(frame.getStack().pop());
        if (ctx.maxChoices == null) {
            return mo.validation(((OptionalType) visitor.visit(ctx.opt))) ? 0 : 1;
        }
        return mo.validation(((OptionalType) visitor.visit(ctx.opt)), ((IntType) visitor.visit(ctx.intArg()))) ? 0 : 1;
    }

    @Override
    public Integer visitSingleChoiceTV(ValidatorParser.SingleChoiceTVContext ctx) {
        SingleChoiceValidation sc = new SingleChoiceValidation();
        return sc.setAnswer(frame.getStack().pop()).validateT(((OptionalType) visitor.visit(ctx.opt))) ? 0 : 1;
    }

    @Override
    public Integer visitMultipleChoiceTV(ValidatorParser.MultipleChoiceTVContext ctx) {
        MultipleChoiceValidation mo = new MultipleChoiceValidation();
        mo.setAnswer(frame.getStack().pop());
        if (ctx.maxChoices == null) {
            return mo.validationT(((OptionalType) visitor.visit(ctx.opt))) ? 0 : 1;
        }
        return mo.validationT(((OptionalType) visitor.visit(ctx.opt)), ((IntType) visitor.visit(ctx.intArg()))) ? 0 : 1;
    }

    @Override
    public Integer visitSortV(ValidatorParser.SortVContext ctx) {
        SortValidation sort = new SortValidation();
        sort.setAnswer(frame.getStack().pop());
        return sort.validate(((OptionalType) visitor.visit(ctx.opt)))? 0:1;
    }

    @Override
    public Integer visitScaleV(ValidatorParser.ScaleVContext ctx) {
        ScaleValidation sort = new ScaleValidation();
        return sort.setAnswer(frame.getStack().pop()).validate(((OptionalType) visitor.visit(ctx.opt))) ? 0 : 1;

    }
}
