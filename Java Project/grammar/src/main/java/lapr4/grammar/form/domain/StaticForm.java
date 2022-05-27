package lapr4.grammar.form.domain;

public class StaticForm<T> extends Form<T> {

    public StaticForm(Form<T> form){
        for (Section s :
                form.sections) {
            sections.add(new StaticSection<>(s));
        }
    }



    @Override
    public void add(Section<T> object) {
        return ;
    }

    @Override
    public Section<T> remove(int index) {
        return null;
    }
}
