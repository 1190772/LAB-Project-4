package lapr4.grammar.form.interpreter.functions;

import lapr4.grammar.form.interpreter.types.OptionalType;

public class ScaleValidation implements Validation<ScaleValidation>{
    private String answer;

    public boolean validate(OptionalType type){
        return type.has(answer);
    }

    @Override
    public ScaleValidation setAnswer(String value) {
        this.answer = value;
        return this;
    }
}
