
package eapli.base.importwarehouse.domain.aisles;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aisle {

    @EmbeddedId
    private AisleId id;

    @Embedded
    private Coords begin;

    @Embedded
    private Coords end;

    @Embedded
    private Coords depth;

    @Embedded
    private Accessibility accessibility;

    @Embedded
    private List<AisleRow> rows;

    public Aisle(AisleId id, Coords begin, Coords end, Coords depth, Accessibility accessibility, List<AisleRow> rows) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.depth = depth;
        this.accessibility = accessibility;
        this.rows = rows;
    }

    public Aisle() {

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

    @Override
    public String toString() {
        return "Aisle{" +
                "id=" + id +
                ", begin=" + begin +
                ", end=" + end +
                ", depth=" + depth +
                ", accessibility=" + accessibility +
                ", rows=" + rows +
                '}';
    }
}

