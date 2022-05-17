package eapli.base.product.domain.model;

import eapli.base.Constantes;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ShortDescription implements ValueObject, Serializable, Comparable<ShortDescription> {

    private String shtDescription;

    public ShortDescription(String shtDescription) {
        Preconditions.nonNull(shtDescription);
        if(!validateShortDescription(shtDescription))
            throw new IllegalArgumentException("invalid short description length");
        this.shtDescription = shtDescription;
    }

    protected ShortDescription() {
    }

    public String getShtDescription() {
        return shtDescription;
    }

    public void setShtDescription(String shtDescription) {
        this.shtDescription = shtDescription;
    }

    private static boolean validateShortDescription(String shtDescription) {
        return shtDescription.length() > Constantes.MIN_SHTHDESC_LENGTH && shtDescription.length() < Constantes.MAX_SHTHDESC_LENGTH;
    }

    public static ShortDescription shortDescriptedAs(String shortDescription) {
        return new ShortDescription(shortDescription);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortDescription that = (ShortDescription) o;
        return Objects.equals(shtDescription, that.shtDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shtDescription);
    }

    @Override
    public int compareTo(ShortDescription o) {
        return this.shtDescription.compareTo(o.shtDescription);
    }

    @Override
    public String toString() {
        return this.shtDescription;}
}