package eapli.base.customer.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Name implements ValueObject, Serializable, Comparable<Name> {
    private static final long serialVersionUID = 1L;
    private String name;

    public Name(final String name) throws NameException {
        if (StringPredicates.isNullOrEmpty(name) || name.length()>30 || !name.contains(" ")) {
            throw new NameException("Nome Inválido. Por favor, insira um Nome válido!");
        }
        // expression
        this.name = name;
    }

    protected Name() {
        // for ORM
    }

    public static Name valueOf(final String name) throws NameException {
        return new Name(name);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Name)) {
            return false;
        }

        final Name that = (Name) o;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "Nome: " + this.name;
    }

    @Override
    public int compareTo(final Name arg0) {
        return name.compareTo(arg0.name);
    }

    public static Name nameAs(final String name) throws NameException {
        return new Name(name);
    }
}
