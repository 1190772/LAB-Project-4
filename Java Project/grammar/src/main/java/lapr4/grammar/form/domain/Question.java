package lapr4.grammar.form.domain;

import lapr4.grammar.form.shared.LanguageValidations;

public class Question {

    private String description;
    private String id;
    private LanguageValidations validation;

    public Question(String description, String id, LanguageValidations validation) {
        this.description = description;
        this.id = id;
        this.validation = validation;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public LanguageValidations getValidation() {
        return validation;
    }
}
