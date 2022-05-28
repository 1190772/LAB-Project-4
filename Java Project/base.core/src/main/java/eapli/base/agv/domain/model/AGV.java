package eapli.base.agv.domain.model;


import eapli.base.agv.domain.model.AGVModel;
import eapli.base.agv.domain.model.Info;
import eapli.base.product.domain.model.ShortDescription;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AGV  implements AggregateRoot<Integer>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(unique = true, nullable = false)
    private String agvId;
    @Embedded
    private ShortDescription description;

    @Embedded
    AGVModel model;

    private Double maxWeight;

    private Double autonamy;

    private boolean ocuppied;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "AGV_id")
    private List<Info> tasks = new ArrayList<>();

    public AGV() {
    }

    public AGV(ShortDescription description, AGVModel model, double limit ) {
        this.description = description;
        this.model = model;
        this.maxWeight = limit;
        this.ocuppied = false;
    }


    @Override
    public Integer identity() {
        return id;
    }

    public ShortDescription getDescription() {
        return description;
    }

    public AGVModel getModel() {
        return model;
    }

    public boolean isOcuppied() {
        return ocuppied;
    }

    public List<Info> getTasks() {
        return tasks;
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }


    public void changeOcuppied(boolean ocuppied) {
        this.ocuppied = ocuppied;
    }

    public int getId() {
        return id;
    }

    public void acceptTask(Info tarefa) {
        tasks.add(tarefa);
    }

    @Override
    public String toString() {
        return "AGV{" +
                "id=" + id +
                ", shortDesc=" + description +
                ", model=" + model +
                ", maxWeight=" + maxWeight +
                '}';
    }
}