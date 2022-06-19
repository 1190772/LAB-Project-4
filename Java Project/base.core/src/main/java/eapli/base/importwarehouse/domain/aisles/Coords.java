package eapli.base.importwarehouse.domain.aisles;

import javax.persistence.Embeddable;

@Embeddable
public class Coords {
    private int lSquare;
    private int wSquare;

    private Coords(int lSquare, int wSquare){
        this.lSquare=lSquare;
        this.wSquare=wSquare;
    }

    public Coords() {

    }

    public static Coords of(int l, int w){
        return new Coords(l,w);
    }

    public int lSquare(){
        return lSquare;
    }

    public int wSquare(){
        return wSquare;
    }

    public int getlSquare() {
        return lSquare;
    }

    public int getwSquare() {
        return wSquare;
    }

    @Override
    public String toString() {
        return "Coords{" +
                "lSquare=" + lSquare +
                ", wSquare=" + wSquare +
                '}';
    }
}
