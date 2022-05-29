package lapr4.grammar.form.interpreter.memory;

import lapr4.grammar.form.interpreter.abstraction.QuestionAbstraction;
import lapr4.grammar.form.interpreter.abstraction.SectionAbstraction;
import lapr4.grammar.form.interpreter.types.Type;

import java.util.List;
import java.util.Map;

public class MemoryFrame {
    private Map<String, Type> constants;
    private Map<Integer,SectionAbstraction> sections;

    public void putSection(int index, boolean optional, List<QuestionAbstraction> questions) {
        sections.put(index,new SectionAbstraction(index,optional,questions));
    }


}
