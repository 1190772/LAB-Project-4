package eapli.base.importwarehouse.domain.aisles;

public class Capacity {
    private int capacity;

    private Capacity(int capacity){
        this.capacity=capacity;
    }

    public static Capacity of(int capacity){
        return new Capacity(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "capacity=" + capacity +
                '}';
    }
}

