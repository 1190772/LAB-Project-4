package lapr4.grammar.form.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

@Embeddable
public class Message implements ValueObject, Serializable, Comparable<Message> {
    private static final long serialVersionUID = 1L;

    @XmlElement
    @JsonProperty
    private String message;

    public Message(final String message) {
        Preconditions.noneNull(message);
        this.message = message;
    }

    protected Message() {
        // for ORM
    }

    public static Message valueOf(final String message) {
        return new Message(message);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Message)) {
            return false;
        }

        final Message that = (Message) o;
        return this.message.equals(that.message);
    }

    @Override
    public int hashCode() {
        return this.message.hashCode();
    }

    @Override
    public String toString() {
        return this.message;
    }

    @Override
    public int compareTo(Message o) {
        return this.message.compareTo(o.message);
    }

}
