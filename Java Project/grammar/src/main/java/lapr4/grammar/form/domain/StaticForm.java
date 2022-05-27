package lapr4.grammar.form.domain;

public class StaticForm<T> extends Form<T> {

    @Override
    public void add(Section<T> object) {
        return ;
    }

    @Override
    public Section<T> remove(int index) {
        return null;
    }
}
