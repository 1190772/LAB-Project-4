package lapr4.grammar.form.domain;

import lapr4.grammar.form.shared.LanguageValidations;

public class Config {
    public LanguageValidations validation;
    public String value;

    public Config(LanguageValidations validation, String value){
        this.validation=validation;
        this.value=value;
    }
}
