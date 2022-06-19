package eapli.base.importwarehouse.domain.aisles;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AisleRowId implements Serializable {
    private static final long serialVersionUID = -7145496638069067793L;
    private long id;

    public AisleRowId(long id){
        this.id=id;
    }

    public AisleRowId() {

    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AisleRowId{" +
                "id=" + id +
                '}';
    }
}
