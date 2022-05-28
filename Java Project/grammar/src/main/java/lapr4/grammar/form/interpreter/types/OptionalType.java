package lapr4.grammar.form.interpreter.types;

public class OptionalType extends Type<OptionalType> {

    public OptionalType(String name, String value) {
        super(name, value);
    }

    public OptionalType castedValue(){
        return this;
    }
    
    public boolean has(String option){
        
    }

}
