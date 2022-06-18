package eapli.base.agv.domain.model;


import eapli.base.order.domain.model.Order;
import eapli.base.product.domain.model.Product;
import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Task implements AggregateRoot<String>, Serializable {

    @Id
    //  @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    private Priority priority;

    private String info;

    private boolean approved;
    private Status status;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private Order order;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    private AGV agv;

    public Task() {
    }


    public Task(String id, AGV agv, Order order, Status status, Priority priority) {
        this.id = id;
        this.agv = agv;
        this.order = order;
        this.status = Status.ASSOCIATED;
        this.priority = priority;
    }


    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Product)) {
            return false;
        }
        final Task that = (Task) other;
        if (this == that) {
            return true;
        }
        return identity().equals(that.identity());
    }

    @Override
    public String identity() {
        return id;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }


    public String getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task tarefa = (Task) o;
        return id == tarefa.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public AGV getAgv() {
        return agv;
    }

    public void setAgv(AGV agv) {
        this.agv = agv;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    /**
     * Changes the task status.
     */
    public void changeStatus(Status status) {
        this.status = status;
    }

    public String getInfo() { return info;
    }

    public boolean getType() {
        return this.approved;
    }
}
