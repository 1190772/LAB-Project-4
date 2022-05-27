package lapr4.grammar.form.domain;

import lapr4.grammar.form.shared.LanguageValidations;

public class Question {

    private String description;
    private String id;
    private boolean isOptional;
    private Config config;

    public Question(String description, String id, Config config, boolean isOptional) {
        this.description = description;
        this.id = id;
        this.config = config;
        this.isOptional=isOptional;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public Config getConfig() {
        return config;
    }

    public boolean isOptional(){return isOptional;}
}
