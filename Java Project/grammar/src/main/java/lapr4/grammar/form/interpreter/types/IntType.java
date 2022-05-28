package lapr4.grammar.form.interpreter.types;

public class IntType extends Type<Integer>{

    public IntType(String name, int value) {
        super(name, Integer.toString(value));
    }


    public Integer castedValue(){
        return Integer.parseInt(value());
    }

}
