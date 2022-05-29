package eapli.base.jsonreader.domain;

import java.util.LinkedList;
import java.util.List;
import eapli.base.jsonreader.domain.*;
import eapli.base.jsonreader.domain.aisles.*;
import eapli.base.jsonreader.domain.*;
import eapli.base.jsonreader.domain.warehouse.Length;
import eapli.base.jsonreader.domain.warehouse.Name;


public class WarehousePlant {
    private Name name;
    private Length length;
    private Length width;
    private Area area;
    private Name unit;
    private List<Aisles> aisles;
    private List<AGVDock> docks;

    public WarehousePlant(Name name, Length length, Length width,Area area,Name unit,List<Aisles> aisles, List<AGVDock> docks){
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

    public List<Aisles> getAisles() {
        return aisles;
    }

    public List<AGVDock> getDocks() {
        return docks;
    }

    //Todo Getters





}
