package eapli.base.importwarehouse.domain.aisles;
import eapli.base.importwarehouse.domain.aisles.AisleRowId;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

@Embeddable
public class AisleRow {

    @EmbeddedId
    private AisleRowId id;

    @Embedded
    private Coords begin;

    @Embedded
    private Coords end;

    @Embedded
    private Capacity capacity;


    public AisleRow(AisleRowId id, Coords begin, Coords end, Capacity capacity) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.capacity = capacity;
    }

    public AisleRow() {

    }

    public AisleRowId getId() {
        return id;
    }

    public Coords getBegin() {
        return begin;
    }

    public Coords getEnd() {
        return end;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "AisleRow{" +
                "id=" + id +
                ", begin=" + begin +
                ", end=" + end +
                ", capacity=" + capacity +
                '}';
    }
}
