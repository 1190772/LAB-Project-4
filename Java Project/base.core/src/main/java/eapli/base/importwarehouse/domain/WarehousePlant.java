package eapli.base.importwarehouse.domain;

import java.util.LinkedList;
import java.util.List;

import eapli.base.importwarehouse.domain.warehouse.Length;
import eapli.base.importwarehouse.domain.warehouse.Name;
import eapli.base.importwarehouse.domain.aisles.Aisle;


public class WarehousePlant {
    private Name name;
    private Length length;
    private Length width;
    private Area area;
    private Name unit;
    private List<Aisle> aisles;
    private List<AGVDock> docks;

    public WarehousePlant(Name name, Length length, Length width,Area area,Name unit,List<Aisle> aisles, List<AGVDock> docks){
        this.name=name;
        this.length=length;
        this.width=width;
        this.area=area;
        this.unit=unit;
        this.aisles =new LinkedList<>(aisles);
        this.docks=new LinkedList<>(docks);
    }

    public Name getName() {
        return name;
    }

    public Length getLength() {
        return length;
    }

    public Length getWidth() {
        return width;
    }

    public Area getArea() {
        return area;
    }

    public Name getUnit() {
        return unit;
    }

    public List<Aisle> getAisles() {
        return aisles;
    }

    public List<AGVDock> getDocks() {
        return docks;
    }





}
