package eapli.base.importwarehouse.domain.aisles;
import eapli.base.importwarehouse.domain.aisles.AisleRowId;
public class AisleRow {
    private AisleRowId id;
    private Coords begin;
    private Coords end;
    private Capacity capacity;

    public AisleRow(AisleRowId id, Coords begin, Coords end, Capacity capacity) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.capacity = capacity;
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
}
