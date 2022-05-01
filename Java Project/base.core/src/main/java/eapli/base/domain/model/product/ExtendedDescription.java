package eapli.base.domain.model.product;

import eapli.base.domain.model.Constantes;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ExtendedDescription implements ValueObject, Serializable, Comparable<ExtendedDescription> {

    private String extDescription;

    public ExtendedDescription(String extDescription) {
        Preconditions.nonNull(extDescription);
        if (!validateExtendedDescription(extDescription))
            throw new IllegalArgumentException("invalid extended description lehgth");
        this.extDescription = extDescription;
    }

    protected ExtendedDescription() {
    }

    private static boolean validateExtendedDescription(String extDescription) {
        return extDescription.length() > Constantes.MIN_EXTHDESC_LENGTH && extDescription.length() < Constantes.MAX_EXTDESC_LENGTH;
    }

    public static ExtendedDescription extendedDescriptedAs(String extendedDescription) {
        return new ExtendedDescription(extendedDescription);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtendedDescription that = (ExtendedDescription) o;
        return Objects.equals(extDescription, that.extDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extDescription);
    }

    @Override
    public int compareTo(ExtendedDescription o) {
        return this.extDescription.compareTo(o.extDescription);
    }

    @Override
    public String toString() {
        return this.extDescription;
    }
}
