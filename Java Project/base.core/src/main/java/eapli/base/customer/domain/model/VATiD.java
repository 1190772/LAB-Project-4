package eapli.base.customer.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

@Embeddable
public class VATiD implements ValueObject, Serializable, Comparable<VATiD> {
    private static final long serialVersionUID = 1L;

    @XmlElement
    @JsonProperty
    private String vatId;

    public VATiD(final String vatId) {
        Preconditions.noneNull(vatId);
        this.vatId = vatId;
    }

    protected VATiD() {
        // for ORM
    }

    public static VATiD valueOf(final String vatId) {
        return new VATiD(vatId);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VATiD)) {
            return false;
        }

        final VATiD that = (VATiD) o;
        return this.vatId.equals(that.vatId);
    }

    @Override
    public int hashCode() {
        return this.vatId.hashCode();
    }

    @Override
    public String toString() {
        return this.vatId;
    }

    @Override
    public int compareTo(VATiD o) {
        return this.vatId.compareTo(o.vatId);
    }

    public static VATiD vatIdAs(final String vatId) {
        return new VATiD(vatId);
    }
}
