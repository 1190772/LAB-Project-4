package lapr4.grammar.form.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Section<T> implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {
        return objects.iterator();
    }

    private List<T> objects;

    public Section(){
        objects = new LinkedList<>();
    }

    public void add(T object){
        objects.add(object);
    }

    public T remove(int index){
        return objects.remove(index);
    }



}
