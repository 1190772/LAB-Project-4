package eapli.base.importwarehouse.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Area {
    private double area;

    private Area(double area){
        this.area=area;
    }

    public Area() {

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

    @Override
    public String toString() {
        return "Area{" +
                "area=" + area +
                '}';
    }
}
