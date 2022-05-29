package lapr4.grammar.form.interpreter.abstraction;

import java.util.List;

public class SectionAbstraction {
    private int index;
    private boolean optional;
    private List<QuestionAbstraction> questions;

    public SectionAbstraction(int index, boolean optional, List<QuestionAbstraction> questions) {
        this.index = index;
        this.optional = optional;
        this.questions = questions;
    }

    public int getIndex() {
        return index;
    }

    public boolean isOptional() {
        return optional;
    }

    public List<QuestionAbstraction> getQuestions() {
        return questions;
    }
}
