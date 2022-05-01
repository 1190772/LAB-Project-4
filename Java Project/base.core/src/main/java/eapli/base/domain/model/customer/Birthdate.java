package eapli.base.domain.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Embeddable
public class Birthdate implements ValueObject, Serializable {
    private static final long serialVersionUID = 1L;

    private Date birthDate;

    public Birthdate(final Date birthDate) {
        this.birthDate = birthDate;
    }

    protected Birthdate() {
        // for ORM
    }

    public Date birthDate() {
        return this.birthDate;
    }


    public void newBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public static Birthdate birthdateAs(final String birthDate) throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
        return new Birthdate(date);
    }
}

