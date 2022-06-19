package eapli.base.importwarehouse.domain.warehouse;

import javax.persistence.Embeddable;

@Embeddable
public class Width {

    private double width;

    private Width(double wid){
        this.width =wid;
    }

    public Width() {

    }

    public static Width of(double wid){
        return new Width(wid);
    }

    public double width(){
        return width;
    }

    @Override
    public String toString() {
        return "Width{" +
                "width=" + width +
                '}';
    }
}
