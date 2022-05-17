package eapli.base.customer.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Email implements ValueObject, Serializable, Comparable<Email> {
    private static final long serialVersionUID = 1L;
    private String email;

    public Email(final String email) throws EmailException {
        if (StringPredicates.isNullOrEmpty(email) || !email.contains("@") || !email.contains(".")) {
            throw new EmailException("Email Inválido. Por favor, insira um Email válido!");
        }
        // expression
        this.email = email;
    }

    protected Email() {
        // for ORM
    }

    public static Email valueOf(final String email) throws EmailException {
        return new Email(email);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Email)) {
            return false;
        }

        final Email that = (Email) o;
        return this.email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return this.email.hashCode();
    }

    @Override
    public String toString() {
        return "Email: " + this.email;
    }

    @Override
    public int compareTo(final Email arg0) {
        return email.compareTo(arg0.email);
    }

    public static Email emailAs(final String email) throws EmailException {
        return new Email(email);
    }
}
