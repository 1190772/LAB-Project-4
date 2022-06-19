package eapli.base.importwarehouse.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.io.Serializable;

@Embeddable
public class AGVDockId implements Serializable {
    private static final long serialVersionUID = -3443564383184444233L;
    private String id;

    public AGVDockId(String id){
        this.id=id;
    }

    public AGVDockId() {

    }

    public String id(){
        return id;
    }

    @Override
    public String toString() {
        return "AGVDockId{" +
                "id='" + id + '\'' +
                '}';
    }
}
