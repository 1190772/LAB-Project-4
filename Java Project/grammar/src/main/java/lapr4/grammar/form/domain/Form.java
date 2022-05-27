package lapr4.grammar.form.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Form<T> implements Iterable<Section<T>>{

    private List<Section<T>> sections;

    public Form() {
        this.sections = new LinkedList<>();
    }

    public void add(Section<T> object){
        sections.add(object);
    }

    public Section<T> remove(int index){
        return sections.remove(index);
    }


    @Override
    public Iterator<Section<T>> iterator() {
        return sections.iterator();
    }
}
