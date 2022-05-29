package lapr4.grammar.form.interpreter.functions;

import lapr4.grammar.form.interpreter.types.OptionalType;

public class MultipleChoiceValidation implements Validation<MultipleChoiceValidation> {
    private String awnser;





    public boolean validation(OptionalType opt){
        String[] a = awnser.split(";");
    }


    @Override
    public MultipleChoiceValidation setAnswer(String value) {
        awnser = value;
        return this;
    }
}
