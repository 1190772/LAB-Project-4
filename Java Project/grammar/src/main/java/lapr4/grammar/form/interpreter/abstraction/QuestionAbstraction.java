package lapr4.grammar.form.interpreter.abstraction;

public class QuestionAbstraction {

    private int index;
    private boolean optional;
    private String id;
    private String validation;

    public QuestionAbstraction(int index, boolean optional, String id, String validation) {
        this.index = index;
        this.optional = optional;
        this.id = id;
        this.validation = validation;
    }

    public int getIndex() {
        return index;
    }

    public boolean isOptional() {
        return optional;
    }

    public String getId() {
        return id;
    }

    public String getValidation() {
        return validation;
    }







}
