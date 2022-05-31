
package eapli.base.importwarehouse.domain.aisles;

import java.util.List;

public class Aisle {
    private AisleId id;
    private Coords begin;
    private Coords end;
    private Coords depth;
    private Accessibility accessibility;
    private List<AisleRow> rows;

    public Aisle(AisleId id, Coords begin, Coords end, Coords depth, Accessibility accessibility, List<AisleRow> rows) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.depth = depth;
        this.accessibility = accessibility;
        this.rows = rows;
    }

    public AisleId getId() {
        return id;
    }

    public Coords getBegin() {
        return begin;
    }

    public Coords getEnd() {
        return end;
    }

    public Coords getDepth() {
        return depth;
    }

    public Accessibility getAccessibility() {
        return accessibility;
    }

    public List<AisleRow> getRows() {
        return rows;
    }
}

