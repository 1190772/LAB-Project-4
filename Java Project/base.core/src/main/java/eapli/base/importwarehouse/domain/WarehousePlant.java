package eapli.base.importwarehouse.domain;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.customer.domain.model.Customer;
import eapli.base.importwarehouse.domain.warehouse.Length;
import eapli.base.importwarehouse.domain.warehouse.Name;
import eapli.base.importwarehouse.domain.aisles.Aisle;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;


public class WarehousePlant implements AggregateRoot<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @XmlElement
    @JsonProperty
    private Name name;

    @Embedded
    @XmlElement
    @JsonProperty
    private Length length;

    @Embedded
    @XmlElement
    @JsonProperty
    private Length width;

    @Embedded
    @XmlElement
    @JsonProperty
    private Area area;

    @Embedded
    @XmlElement
    @JsonProperty
    private Name unit;

    @Embedded
    @XmlElement
    @JsonProperty
    private List<Aisle> aisles;

    @Embedded
    @XmlElement
    @JsonProperty
    private List<AGVDock> docks;


    public WarehousePlant(Name name, Length length, Length width, Area area, Name unit, List<Aisle> aisles, List<AGVDock> docks) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.area = area;
        this.unit = unit;
        this.aisles = new LinkedList<>(aisles);
        this.docks = new LinkedList<>(docks);
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


    @Override
    public String toString() {
        return "WarehousePlant{" +
                "name=" + name +
                ", length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", unit=" + unit +
                ", aisles=" + aisles +
                ", docks=" + docks +
                '}';
    }

    @Override
    public boolean sameAs(final Object other) {
        if (!(other instanceof WarehousePlant)) {
            return false;
        }
        return other.equals(this);
    }



    @Override
    public Long identity() {
        return id;
    }
}

