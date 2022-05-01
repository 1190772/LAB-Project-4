package eapli.base.domain.model.category;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Description implements ValueObject, Serializable, Comparable<Description> {

    private static final long serialVersionUID = 1L;

    private String description;

    public Description(final String description) throws DescriptionException {
        if (description.length() > 50 || StringPredicates.isNullOrEmpty(description)) {
            throw new DescriptionException("Descricao inválida");
        }
        this.description = description;
    }

    protected Description() {
        // for ORM
    }

    public static Description valueOf(final String description) throws DescriptionException {
        return new Description(description);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Description)) {
            return false;
        }

        final Description that = (Description) o;
        return this.description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return this.description.hashCode();
    }

    @Override
    public String toString() {
        return this.description;
    }

    @Override
    public int compareTo(final Description arg0) {
        return description.compareTo(arg0.description);
    }

    public String descricao() {
        return this.description;
    }

    public void changeDescricaoTo(String description) {
        this.description = description;
    }

}

