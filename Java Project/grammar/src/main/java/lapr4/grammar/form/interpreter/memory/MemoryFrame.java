package lapr4.grammar.form.interpreter.memory;

import lapr4.grammar.form.interpreter.abstraction.QuestionAbstraction;
import lapr4.grammar.form.interpreter.abstraction.SectionAbstraction;
import lapr4.grammar.form.interpreter.types.Type;

import java.util.List;
import java.util.Map;

public class MemoryFrame {
    private Map<String, Type> constants;
    private Map<Integer,SectionAbstraction> sections;
    private Map<Integer,SectionAbstraction> abstractions;
    private Map<QuestionAbstraction,Integer> cache;

    public void putSection(int index, boolean optional, List<QuestionAbstraction> questions) {
        sections.put(index,new SectionAbstraction(index,optional,questions));
    }


    public void addSection(SectionAbstraction sectionAbstraction) {
        if (abstractions.containsKey(sectionAbstraction.getIndex())){
            throw new IllegalArgumentException();
        }
        abstractions.put(sectionAbstraction.getIndex(),sectionAbstraction);
    }

    public void addQuestion(int sectionIndex, QuestionAbstraction q){
        cache.put(q,sectionIndex);
    }

    public void compose(){
        for (QuestionAbstraction q : cache.keySet()){
            SectionAbstraction s =abstractions.get(cache.get(q));
            if (s==null){
                throw new IllegalArgumentException();
            }
            s.addQuestion(q);
        }
    }


}
