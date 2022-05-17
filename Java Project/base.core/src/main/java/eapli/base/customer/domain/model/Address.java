package eapli.base.customer.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Address implements ValueObject, Serializable {
    private static final long serialVersionUID = 1L;

    private String district;

    private String county;

    private String street;

    private String door;

    public Address(final String district, final String county, final String street, final String door) {
        Preconditions.noneNull(district, county, street, door);
        // TODO validate invariants, i.e., cor regular expression
        this.district = district;
        this.county = county;
        this.street = street;
        this.door = door;
    }

    protected Address() {
        // for ORM
    }

    public String district() {
        return this.district;
    }

    public String county() {
        return this.county;
    }

    public String street() {
        return this.street;
    }

    public String door() {
        return this.door;
    }

    public void newDistrict(String district){
        this.district = district;
    }
    public void newCounty(String county){
        this.county = county;
    }
    public void newStreet(String street){
        this.street = street;
    }
    public void newDoor(String door){
        this.door = door;
    }

    public static Address addressAs(final String district, final String county, final String street, final String door) {
        return new Address(district, county, street, door);
    }
}
