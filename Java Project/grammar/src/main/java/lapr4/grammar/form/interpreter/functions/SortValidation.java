package lapr4.grammar.form.interpreter.functions;

import lapr4.grammar.form.interpreter.types.OptionalType;

import java.util.LinkedList;
import java.util.List;

public class SortValidation implements Validation<SortValidation> {
    private String answer;

    public List<String> validate(OptionalType type) {
        List<String> list = new LinkedList<>();
        String[] opts = answer.split(";");
        for (String s : opts) {
            if (!type.has(s)) {
                return null;
            }
            list.add(s);
        }
        return list;
    }


    @Override
    public SortValidation setAnswer(String value) {
        this.answer = value;
        return this;
    }
}
