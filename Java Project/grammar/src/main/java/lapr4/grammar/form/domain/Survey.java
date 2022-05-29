package lapr4.grammar.form.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.validations.Preconditions;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Survey implements AggregateRoot<Long>, Comparable<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @XmlElement
    @JsonProperty
    private SurveyId surveyId;

    @Embedded
    @XmlElement
    @JsonProperty
    private Message message;

    @Embedded
    @XmlElement
    @JsonProperty
    private Title title;

    @Embedded
    @XmlElement
    @JsonProperty
    private Question question;

    @Embedded
    @XmlElement
    @JsonProperty
    private Section section;

    public Survey(final SurveyId surveyId, Message message, Title title, Question question, Section section) {

        Preconditions.noneNull(surveyId, message, title, question, section);
        this.surveyId = surveyId;
        this.message = message;
        this.title = title;
        this.question = question;
        this.section = section;

    }


    public SurveyId getSurveyId() {
        return surveyId;
    }

    public Message getMessage() {
        return message;
    }

    public Title getTitle() {
        return title;
    }

    public Question getQuestion() {
        return question;
    }

    public Section getSection() {
        return section;
    }




    @Override
    public String toString() {
        return String.format("SurveyId: %s - Message: %s - Title: %s - Question: %s - Section: %s - ",
                this.surveyId, this.message, this.title, this.question, this.section);
    }

}
