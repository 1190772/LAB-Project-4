package eapli.base.agv.domain.model;


import eapli.base.product.domain.model.ShortDescription;
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
    public String toString() {
        return "AGV{" +
                "id=" + id +
                ", shortDesc=" + shortDesc +
                ", model=" + model +
                ", maxWeight=" + maxWeight +
                '}';
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
