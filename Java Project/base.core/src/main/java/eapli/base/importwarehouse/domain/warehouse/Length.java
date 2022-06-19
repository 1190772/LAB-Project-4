package eapli.base.importwarehouse.domain.warehouse;

import javax.persistence.Embeddable;

@Embeddable
public class Length {
    private double length;

    private Length(double len){
        this.length =len;
    }

    public Length() {

    }

    public static Length of(double len){
        return new Length(len);
    }

    public double length(){
        return length;
    }

    @Override
    public String toString() {
        return "Length{" +
                "length=" + length +
                '}';
    }
}
