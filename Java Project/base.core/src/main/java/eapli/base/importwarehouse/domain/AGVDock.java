package eapli.base.importwarehouse.domain;

import eapli.base.importwarehouse.domain.aisles.Accessibility;
import eapli.base.importwarehouse.domain.aisles.Coords;
import eapli.base.importwarehouse.domain.AGVDockId;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class AGVDock {

    @EmbeddedId
    private AGVDockId id;

    @Embedded
    private Coords begin;

    @Embedded
    private Coords end;

    @Embedded
    private Coords depth;

    @Embedded
    private Accessibility accessibility;

    public AGVDock(AGVDockId id, Coords begin, Coords end, Coords depth, Accessibility accessibility) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.depth = depth;
        this.accessibility = accessibility;
    }

    public AGVDock() {

    }

    public AGVDockId getId() {
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

    @Override
    public String toString() {
        return "AGVDock{" +
                "id=" + id +
                ", begin=" + begin +
                ", end=" + end +
                ", depth=" + depth +
                ", accessibility=" + accessibility +
                '}';
    }
}

