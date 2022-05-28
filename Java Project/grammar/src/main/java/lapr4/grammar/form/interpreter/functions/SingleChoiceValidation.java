package lapr4.grammar.form.interpreter.functions;

import lapr4.grammar.form.interpreter.types.OptionalType;

public class SingleChoiceValidation implements Validation<SingleChoiceValidation>{

    private String answer;


    public SingleChoiceValidation setAnswer(String answer){
        this.answer=answer;
        return this;
    }
    
    public boolean validate(OptionalType type){
        if (type.has(answer))
    }
    
    
    
}
