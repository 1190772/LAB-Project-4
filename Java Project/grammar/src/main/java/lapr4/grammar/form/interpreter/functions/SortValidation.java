package lapr4.grammar.form.interpreter.functions;

import lapr4.grammar.form.interpreter.types.OptionalType;

import java.util.LinkedList;
import java.util.List;

public class SortValidation implements Validation<SortValidation> {
    private String answer;
    private List<String> list=new LinkedList<>();

    public boolean validate(OptionalType type) {
        String[] opts = answer.split(";");
        for (String s : opts) {
            if (!type.has(s)) {
                return false;
            }
            list.add(s);
        }
        return true;
    }


    @Override
    public SortValidation setAnswer(String value) {
        this.answer = value;
        return this;
    }
}
