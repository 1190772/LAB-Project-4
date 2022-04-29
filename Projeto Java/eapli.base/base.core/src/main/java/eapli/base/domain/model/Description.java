package eapli.base.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Description implements ValueObject, Serializable, Comparable<Description> {

    private static final long serialVersionUID = 1L;

    private String descricao;

    public Description(final String descricao) throws DescriptionException {
        if (descricao.length() > 50 || StringPredicates.isNullOrEmpty(descricao)) {
            throw new DescriptionException("Descricao inválida");
        }
        this.descricao = descricao;
    }

    protected Description() {
        // for ORM
    }

    public static Description valueOf(final String descricao) throws DescriptionException {
        return new Description(descricao);
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
        return this.descricao.equals(that.descricao);
    }

    @Override
    public int hashCode() {
        return this.descricao.hashCode();
    }

    @Override
    public String toString() {
        return this.descricao;
    }

    @Override
    public int compareTo(final Description arg0) {
        return descricao.compareTo(arg0.descricao);
    }

    public String descricao() {
        return this.descricao;
    }

    public void changeDescricaoTo(String descricao) {
        this.descricao = descricao;
    }

}

