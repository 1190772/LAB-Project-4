package lapr4.grammar.form.interpreter.abstraction;

public class QuestionAbstraction {

    private int index;
    private boolean optional;
    private String id;
    private String validation;
    private boolean validated;
    private boolean valid;

    public QuestionAbstraction(int index, boolean optional, String id, String validation) {
        this.index = index;
        this.optional = optional;
        this.id = id;
        this.validation = validation;
        this.validated=false;
        this.valid=true;
    }

    public QuestionAbstraction(int index, boolean optional, String id, boolean valid) {
        this.index = index;
        this.optional = optional;
        this.id = id;
        this.validation = "";
        this.validated=true;
        this.valid=valid;
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
    public boolean isValidated() {
        return validated;
    }
    public boolean isValid() {
        return valid;
    }







}
