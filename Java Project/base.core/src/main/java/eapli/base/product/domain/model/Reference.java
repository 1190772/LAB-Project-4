package eapli.base.product.domain.model;

import eapli.base.Constantes;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Reference implements ValueObject, Serializable, Comparable<Reference> {

    private String reference;

    public Reference(String reference) {
        Preconditions.nonNull(reference);
        if (!validateReferenceLength(reference))
            throw new IllegalArgumentException("invalid reference length");
        if (!validateIsAlphaNumeric(reference))
            throw new IllegalArgumentException("invalid reference can't contain not aphnumeric characteres");
        this.reference = reference;
    }

    protected Reference() {
    }

    private static boolean validateReferenceLength(String reference) {
        return reference.length() > Constantes.MIN_REFERENCE_LENGTH && reference.length() < Constantes.MAX_REFERENCE_LENGTH;
    }

    public static boolean validateIsAlphaNumeric(String reference) {
        return Constantes.alphanumeric.matcher(reference).find();
    }

    public static Reference withReference(String reference) {
        return new Reference(reference);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reference reference1 = (Reference) o;
        return Objects.equals(reference, reference1.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference);
    }

    @Override
    public int compareTo(Reference o) {
        return this.reference.compareTo(o.reference);
    }

    @Override
    public String toString() {
        return this.reference;
    }
}
