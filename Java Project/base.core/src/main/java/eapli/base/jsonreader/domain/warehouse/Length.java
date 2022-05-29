package eapli.base.jsonreader.domain.warehouse;

public class Length {
    private double len;

    private Length(double len){
        this.len =len;
    }

    public static Length of(double len){
        return new Length(len);
    }

    public double length(){
        return len;
    }
}
