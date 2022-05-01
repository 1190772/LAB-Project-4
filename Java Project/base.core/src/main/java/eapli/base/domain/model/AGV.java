package eapli.base.domain.model;


import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class AGV implements AggregateRoot<Long>, Comparable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Embedded
    ShortDescription shortDesc;

    @Embedded
    AGVModel model;

    double maxWeight;


    public AGV(ShortDescription desc, AGVModel mod, double limit){
        this.shortDesc=desc;
        this.model=mod;
        this.maxWeight=limit;
    }

    public AGV() {
    }


    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public Long identity() {
        return null;
    }
}
