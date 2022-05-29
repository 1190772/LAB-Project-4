package eapli.base.jsonreader.domain.aisles;

public class Coords {
    private int lSquare;
    private int wSquare;

    private Coords(int lSquare, int wSquare){
        this.lSquare=lSquare;
        this.wSquare=wSquare;
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
}
