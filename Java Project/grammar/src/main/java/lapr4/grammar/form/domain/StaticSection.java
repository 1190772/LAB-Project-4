package lapr4.grammar.form.domain;

public class StaticSection<T> extends Section<T>{

    @Override
    public void add(T object) {
        return ;
    }

    @Override
    public T remove(int index) {
        return null;
    }
}
