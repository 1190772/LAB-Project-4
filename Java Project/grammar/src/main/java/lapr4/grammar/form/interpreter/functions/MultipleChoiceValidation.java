package lapr4.grammar.form.interpreter.functions;

import lapr4.grammar.form.interpreter.types.IntType;
import lapr4.grammar.form.interpreter.types.OptionalType;

public class MultipleChoiceValidation implements Validation<MultipleChoiceValidation> {
    private String awnser;


    public boolean validation(OptionalType opt) {
        String[] a = awnser.split(";");
        for (String s : a) {
            if (!opt.has(s)) {
                return false;
            }
        }
        return true;
    }

    public boolean validation(OptionalType opt, IntType maxOpts){
        if (awnser.split(";").length<=maxOpts.castedValue()) {
            return validation(opt);
        }
        return false;
    }

    public boolean validationT(OptionalType opt) {
        String[] a = awnser.split(";");
        for (int i=0;i<a.length-2;i++) {
            String s = a[i];
            if (!opt.has(s)) {
                return false;
            }
        }
        return true;
    }

    public boolean validationT(OptionalType opt, IntType maxOpts){
        if (awnser.split(";").length<=maxOpts.castedValue()) {
            return validation(opt);
        }
        return false;
    }

    @Override
    public MultipleChoiceValidation setAnswer(String value) {
        awnser = value;
        return this;
    }
}
