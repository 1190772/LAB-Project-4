package eapli.base.domain.model.product;

import eapli.base.domain.model.Constantes;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Brand implements ValueObject, Serializable, Comparable<Brand> {

    private String brand;

    public Brand(String brand) {
        Preconditions.nonNull(brand);
        if (!validateBrand(brand))
            throw new IllegalArgumentException("invalid brand");
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    protected Brand() {
    }

    private static boolean validateBrand(String brand) {
        return brand.length() > Constantes.MIN_BRAND_LENGTH && brand.length() < Constantes.MAX_BRAND_LENGTH;
    }

    public static Brand fromBrand(String brand) {
        return new Brand(brand);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand1 = (Brand) o;
        return Objects.equals(brand, brand1.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }

    @Override
    public int compareTo(Brand o) {
        return this.brand.compareTo(o.brand);
    }

    @Override
    public String toString() {
        return this.brand;
    }

}