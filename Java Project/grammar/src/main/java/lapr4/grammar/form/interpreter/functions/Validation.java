package lapr4.grammar.form.interpreter.functions;

public interface Validation<T extends Validation> {
    T setAnswer(String value);
}
