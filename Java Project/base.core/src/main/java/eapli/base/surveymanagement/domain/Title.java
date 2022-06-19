package eapli.base.surveymanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

@Embeddable
public class Title implements ValueObject, Serializable, Comparable<Title> {
    private static final long serialVersionUID = 1L;

    @XmlElement
    @JsonProperty
    private String title;

    public Title(final String title) {
        Preconditions.noneNull(title);
        this.title = title;
    }

    protected Title() {
        // for ORM
    }

    public static Title valueOf(final String title) {
        return new Title(title);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Title)) {
            return false;
        }

        final Title that = (Title) o;
        return this.title.equals(that.title);
    }

    @Override
    public int hashCode() {
        return this.title.hashCode();
    }

    @Override
    public String toString() {
        return this.title;
    }

    @Override
    public int compareTo(Title o) {
        return this.title.compareTo(o.title);
    }

}