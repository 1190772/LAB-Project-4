package lapr4.grammar.form.domain;

import java.util.LinkedList;

public class StaticSection<T> extends Section<T>{


    public StaticSection(boolean isOptional){
        super(isOptional);
    }

    public StaticSection(Section<T> section) {
        super(section.isOptional());
        this.objects.addAll(section.objects);
    }

        @Override
    public void add(T object) {
        return ;
    }

    @Override
    public T remove(int index) {
        return null;
    }
}
