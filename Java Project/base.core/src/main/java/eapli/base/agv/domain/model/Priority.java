package eapli.base.agv.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import java.io.Serializable;
import java.util.Objects;

public class Priority implements ValueObject, Serializable, Comparable<Priority> {

    private int priority;

    public Priority(){}

    public Priority(int priority) {
        Preconditions.nonNegative(priority);
        if(priority>5)
            throw new IllegalArgumentException("Prioridade fora do limite");
        this.priority = priority;
    }

    public static Priority valueOf(final int prioridade) {
        return new Priority(prioridade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Priority)) return false;
        Priority that = (Priority) o;
        return priority == that.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }

    @Override
    public String toString() {
        return "Priority= " + priority;
    }

    @Override
    public int compareTo(Priority o) {
        if(this.priority==o.priority)
            return 0;
        else if(this.priority>o.priority){
            return 1;
        }
        return -1;
    }
}