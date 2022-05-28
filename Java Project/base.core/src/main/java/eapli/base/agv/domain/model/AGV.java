package eapli.base.agv.domain.model;


import eapli.base.product.domain.model.ShortDescription;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
public class AGV implements AggregateRoot<Long>, Comparable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String agvId;
    @Embedded
    ShortDescription shortDesc;

    @Embedded
    AGVModel model;

    double maxWeight;

    double maxVolume;



    private Status status;


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
