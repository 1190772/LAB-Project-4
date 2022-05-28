package eapli.base.agv.domain;


import eapli.base.agv.domain.model.Info;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AGV  implements AggregateRoot<Integer>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;

    private String model;

    private Double maxWeight;

    private Double autonamy;

    private boolean ocuppied;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "AGV_id")
    private List<Info> tasks = new ArrayList<>();

    public AGV() {
    }

    public AGV(String description, String model) {
        this.description = description;
        this.model = model;
        this.ocuppied = false;
    }


    @Override
    public Integer identity() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getModel() {
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
}