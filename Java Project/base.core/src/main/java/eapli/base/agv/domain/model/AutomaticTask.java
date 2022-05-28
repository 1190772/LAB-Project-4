package eapli.base.agv.domain.model;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class AutomaticTask extends Task implements AggregateRoot<Integer>, Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    public AutomaticTask(){


    }
    public AutomaticTask(String description, Status approval, Priority priority){
        super(description,approval,priority);
    }

    public int getId(){

        return id;
    }

}
