package eapli.base.importwarehouse.domain.aisles;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AisleId implements Serializable {
    private static final long serialVersionUID = -7652333231398773664L;
    private Long id;

    public AisleId(long id){
        this.id=id;
    }

    public AisleId() {

    }

    public long id(){
        return id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AisleId{" +
                "id=" + id +
                '}';
    }
}
