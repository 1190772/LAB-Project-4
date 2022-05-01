package eapli.base.domain.model.customer;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Gender implements ValueObject, Serializable {
    private static final long serialVersionUID = 1L;
    private String gender;

    public Gender(final String gender) {
        this.gender = gender;
    }

    protected Gender() {
        // for ORM
    }

    public static Gender valueOf(final String gender){
        return new Gender(gender);
    }

    public static Gender genderAs(final String gender) {
        return new Gender(gender);
    }
}
