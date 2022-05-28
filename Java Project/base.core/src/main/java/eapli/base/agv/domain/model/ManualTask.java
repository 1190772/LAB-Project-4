package eapli.base.agv.domain.model;


import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ManualTask extends Task implements AggregateRoot<Integer>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    public ManualTask(){

    }

    public ManualTask(String info, Status status, Priority priority){
        super(info,status,priority);
    }

    public int getId(){
        return id;
    }

}