package eapli.base.surveymanagement.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Section<T> implements Iterable<T> {
    protected boolean isOptional;

    @Override
    public Iterator<T> iterator() {
        return objects.iterator();
    }

    protected List<T> objects;

    public Section(boolean isOptional){
        objects = new LinkedList<>();
        this.isOptional=isOptional;
    }

    public Section(Section<T> section){
        this(section.isOptional());
        this.objects.addAll(section.objects);
    }

    public void add(T object){
        objects.add(object);
    }

    public T remove(int index){
        return objects.remove(index);
    }


    public boolean isOptional() {
        return isOptional;
    }
}
