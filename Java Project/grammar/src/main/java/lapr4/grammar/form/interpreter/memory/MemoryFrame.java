package lapr4.grammar.form.interpreter.memory;

import lapr4.grammar.form.domain.Answer;
import lapr4.grammar.form.domain.Question;
import lapr4.grammar.form.domain.Section;
import lapr4.grammar.form.domain.StaticForm;
import lapr4.grammar.form.interpreter.abstraction.QuestionAbstraction;
import lapr4.grammar.form.interpreter.abstraction.SectionAbstraction;
import lapr4.grammar.form.interpreter.types.Type;

import java.util.*;

public class MemoryFrame {
    private Deque<String> stack;
    private Map<String, Type> constants;
    private Map<Integer, SectionAbstraction> sections;
    private Map<Integer, SectionAbstraction> abstractions;
    private Map<QuestionAbstraction, Integer> cache;
    private Map<String, Answer> answers;
    private Map<Integer, QuestionAbstraction> questionMap;

    public MemoryFrame() {
        stack = new ArrayDeque<>();
        constants = new LinkedHashMap<>();
        sections = new LinkedHashMap<>();
        abstractions = new LinkedHashMap<>();
        cache = new LinkedHashMap<>();
        answers = new LinkedHashMap<>();
        questionMap=new LinkedHashMap<>();
    }


    public void putSection(int index, boolean optional, List<QuestionAbstraction> questions) {
        sections.put(index, new SectionAbstraction(index, optional, questions));
    }


    public void addSection(SectionAbstraction sectionAbstraction) {
        if (abstractions.containsKey(sectionAbstraction.getIndex())) {
            throw new IllegalArgumentException();
        }
        abstractions.put(sectionAbstraction.getIndex(), sectionAbstraction);
    }

    public void addQuestion(int sectionIndex, QuestionAbstraction q) {
        cache.put(q, sectionIndex);
    }

    public void compose() {
        for (QuestionAbstraction q : cache.keySet()) {
            SectionAbstraction s = abstractions.get(cache.get(q));
            if (s == null) {
                throw new IllegalArgumentException();
            }
            s.addQuestion(q);
        }
    }

    public void loadForm(StaticForm<Answer> answeredForm) {
        for (Section<Answer> s : answeredForm) {
            for (Answer a : s) {
                answers.put(a.getId(),a);
            }
        }
    }

    public Deque<String> getStack() {
        return stack;
    }

    public void putConstant(String name, Type t) {
        if (constants.containsKey(name)) {
            throw new IllegalArgumentException();
        }
        constants.put(name, t);
    }

    public void generate() {
        this.questionMap = new LinkedHashMap<>();
        for (SectionAbstraction s : sections.values()) {
            for (QuestionAbstraction q : s.getQuestions()){
                questionMap.put(q.getIndex(),q);
            }
        }
    }

    public Map<Integer, QuestionAbstraction> getQuestionMap() {
        return questionMap;
    }

    public Map<String, Answer> getAnswers() {
        return answers;
    }

    public boolean validate() {

    }
}
