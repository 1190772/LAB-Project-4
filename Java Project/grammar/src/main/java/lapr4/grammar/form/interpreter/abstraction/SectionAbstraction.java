package lapr4.grammar.form.interpreter.abstraction;

import java.util.LinkedList;
import java.util.List;

public class SectionAbstraction {
    private int index;
    private boolean optional;
    private List<QuestionAbstraction> questions;

    public SectionAbstraction(int index, boolean optional, List<QuestionAbstraction> questions) {
        this.index = index;
        this.optional = optional;
        this.questions = new LinkedList<>(questions);
    }

    public SectionAbstraction(int index, boolean optional) {
        this.index = index;
        this.optional = optional;
        this.questions = new LinkedList<>();
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

    public void addQuestion(QuestionAbstraction q){
        questions.add(q);
    }
}
