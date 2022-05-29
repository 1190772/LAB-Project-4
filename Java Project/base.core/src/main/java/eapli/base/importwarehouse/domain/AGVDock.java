package eapli.base.importwarehouse.domain;

import eapli.base.importwarehouse.domain.aisles.Accessibility;
import eapli.base.importwarehouse.domain.aisles.Coords;
import eapli.base.importwarehouse.domain.AGVDockId;

public class AGVDock {
    private AGVDockId id;
    private Coords begin;
    private Coords end;
    private Coords depth;
    private Accessibility accessibility;

    public AGVDock(AGVDockId id, Coords begin, Coords end, Coords depth, Accessibility accessibility) {
        this.id = id;
        this.begin = begin;
        this.end = end;
        this.depth = depth;
        this.accessibility = accessibility;
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
}

