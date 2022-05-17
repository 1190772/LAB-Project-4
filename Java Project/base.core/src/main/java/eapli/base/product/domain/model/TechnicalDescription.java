package eapli.base.product.domain.model;

import eapli.base.Constantes;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TechnicalDescription implements ValueObject, Serializable, Comparable<TechnicalDescription> {

    private String tecDescription;

    public TechnicalDescription(String tecDescription) {
        Preconditions.nonNull(tecDescription);
        if (!validateTechnicalDescription(tecDescription))
            throw new IllegalArgumentException("invalid thecnical description lehgth");
        this.tecDescription = tecDescription;
    }

    protected TechnicalDescription() {
        this.tecDescription = null;
    }

    private static boolean validateTechnicalDescription(String tecDescription) {
        return tecDescription.length() > Constantes.MIN_TECHDESC_LENGTH && tecDescription.length() < Constantes.MAX_TECHDESC_LENGTH;
    }

    public static TechnicalDescription tehcnincalDescriptedAs(String technicalDeescription) {
        return new TechnicalDescription(technicalDeescription);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechnicalDescription that = (TechnicalDescription) o;
        return Objects.equals(tecDescription, that.tecDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tecDescription);
    }

    @Override
    public int compareTo(TechnicalDescription o) {
        return this.tecDescription.compareTo(o.tecDescription);
    }

    @Override
    public String toString() {
        return this.tecDescription;
    }
}
