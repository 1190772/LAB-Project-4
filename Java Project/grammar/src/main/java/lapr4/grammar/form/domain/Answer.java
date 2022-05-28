package lapr4.grammar.form.domain;

import lapr4.grammar.form.shared.LanguageValidations;

public class Answer {

    private String answer;
    private String id;
    private LanguageValidations validation;

    public Answer(String answer, String id, LanguageValidations validation) {
        this.answer = answer;
        this.id = id;
        this.validation = validation;
    }

    public String getAnswer() {
        return answer;
    }

    public String getId() {
        return id;
    }

    public LanguageValidations getValidation() {
        return validation;
    }
}
