package eapli.base.agv.domain.model;


import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Task implements AggregateRoot<Integer>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Priority priority;

    private Status status;

    private String info;
    private boolean approved;


    public Task() {
    }

    public Task(String info, Status status , Priority priority) {
        this.info = info;
        this.status = status;
        this.priority = priority;
    }


    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public Integer identity() {
        return id;
    }

    public Priority getPriority() { return priority;}

    public Status getStatus() { return status;}

    public String getInfo() { return info;}
    public boolean getType(){return this.approved;}

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task tarefa = (Task) o;
        return id == tarefa.id;
    }

}