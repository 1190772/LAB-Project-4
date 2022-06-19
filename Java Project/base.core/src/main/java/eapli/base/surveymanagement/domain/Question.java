package eapli.base.surveymanagement.domain;

public class Question {

    private String description;
    private String id;
    private boolean isOptional;

    public Question(String description, String id, boolean isOptional) {
        this.description = description;
        this.id = id;

        this.isOptional=isOptional;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public boolean isOptional(){return isOptional;}
}
