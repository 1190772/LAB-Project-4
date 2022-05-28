package eapli.base.agv.domain.model;

import eapli.base.order.domain.model.Order;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Info implements AggregateRoot<Integer>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date dataLimite;
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    private Status status;
    private int tempoDecorrido;
    private int prioridade; //prioridade

    @OneToOne
    private Order order;

    @OneToOne
    private AGV agv;

    @OneToOne
    private Task task;

    public Info(){}

    public Info(Date dataLimite, int prioridade){
        this.dataLimite=dataLimite;
        this.prioridade=prioridade;
        this.status = Status.NOT_STARTED;
        this.dataInicio = Calendar.getInstance().getTime();
    }

    public int getId() {
        return id;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Status getStatus() {
        return status;
    }

    public int getTempoDecorrido() {
        return tempoDecorrido;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public Order getOrder() {
        return order;
    }

    public AGV getAgv() {
        return agv;
    }

    public Task getTask() {
        return task;
    }

    public void changeStatus(Status estado) {
        this.status = estado;
    }




    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public Integer identity() {
        return null;
    }

    public void associateAGV(AGV agv) {
        this.agv = agv;
    }
}