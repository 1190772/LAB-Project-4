package eapli.base.importwarehouse.domain.aisles;


import javax.persistence.Embeddable;

@Embeddable
public class Capacity {
    private int capacity;

    private Capacity(int capacity){
        this.capacity=capacity;
    }

    public Capacity() {

    }

    public static Capacity of(int capacity){
        return new Capacity(capacity);
    }



    @Override
    public String toString() {
        return "Capacity{" +
                "capacity=" + capacity +
                '}';
    }
}

