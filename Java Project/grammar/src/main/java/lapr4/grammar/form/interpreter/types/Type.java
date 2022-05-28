package lapr4.grammar.form.interpreter.types;

public abstract class Type<T> {

    private String name;
    private String value;

    public Type(String name, String value){
        this.name=name;
        this.value=value;
    }



    public String name(){
        return name;
    }
    public String value(){
        return value;
    }
    public abstract T castedValue();
}
