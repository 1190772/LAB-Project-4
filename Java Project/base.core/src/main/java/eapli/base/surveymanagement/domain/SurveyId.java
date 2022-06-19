package eapli.base.surveymanagement.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

@Embeddable
public class SurveyId implements ValueObject, Serializable, Comparable<SurveyId> {
    private static final long serialVersionUID = 1L;

    @XmlElement
    @JsonProperty
    private String surveyId;

    public SurveyId(final String surveyId) {
        Preconditions.noneNull(surveyId);
        this.surveyId = surveyId;
    }

    protected SurveyId() {
        // for ORM
    }

    public static SurveyId valueOf(final String surveyId) {
        return new SurveyId(surveyId);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SurveyId)) {
            return false;
        }

        final SurveyId that = (SurveyId) o;
        return this.surveyId.equals(that.surveyId);
    }

    @Override
    public int hashCode() {
        return this.surveyId.hashCode();
    }

    @Override
    public String toString() {
        return this.surveyId;
    }

    @Override
    public int compareTo(SurveyId o) {
        return this.surveyId.compareTo(o.surveyId);
    }

}
