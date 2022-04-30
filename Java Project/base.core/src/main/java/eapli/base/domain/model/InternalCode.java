package eapli.base.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class InternalCode implements ValueObject, Serializable, Comparable<InternalCode>{

    private String internalCode;

    public InternalCode() {
    }

    public InternalCode(String internalCode) {
        Preconditions.nonNull(internalCode);
        if(!validateProductionCodeLength(internalCode))
            throw new IllegalArgumentException("invalid intenal code length");
        if(!validateIsAlphaNumeric(internalCode))
            throw new IllegalArgumentException("invalid intenal code can't contain not aphnumeric characteres");
        this.internalCode = internalCode;
    }

    private static boolean validateProductionCodeLength(String productionCode) {
        return productionCode.length() > Constantes.MIN_INTERNALCODE_LENGTH && productionCode.length() < Constantes.MAX_INTERNALCODE_LENGTH;
    }

    public static boolean validateIsAlphaNumeric(String productionCode) {
        return Constantes.alphanumeric.matcher(productionCode).find();
    }

    public static InternalCode valueOf(final String internalCode) {
        return new InternalCode(internalCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InternalCode)) return false;
        InternalCode internalCode1 = (InternalCode) o;
        return Objects.equals(internalCode, internalCode1.internalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internalCode);
    }

    @Override
    public int compareTo(InternalCode o) {
        return this.internalCode.compareTo(o.internalCode);
    }

    @Override
    public String toString() {
        return "internalCode= " + internalCode;
    }
}
