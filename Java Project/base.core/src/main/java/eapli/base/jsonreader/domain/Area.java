package eapli.base.jsonreader.domain;

public class Area {
    private double area;

    private Area(double area){
        this.area=area;
    }

    public static Area of(double area){
        return new Area(area);
    }

    public double area(){
        return area;
    }

    public double getArea() {
        return area;
    }
}
