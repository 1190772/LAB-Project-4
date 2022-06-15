package eapli.base.agv.domain.model;


import eapli.base.order.domain.model.Order;
import eapli.base.product.domain.model.ShortDescription;
import eapli.framework.domain.model.AggregateRoot;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AGV  implements AggregateRoot<Long>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long agvId;

    @Embedded
    private ShortDescription description;

    @Embedded
    AGVModel model;

    private Double maxWeight;

    private Double autonomy; // Minutes

    @Enumerated(EnumType.ORDINAL)
    AGVStatus status;


    @OneToOne
    @Nullable
    @JoinColumn(name = "order_id")
    Order orderBeingPrepared;

    @Transient
    @Nullable
    private List<Info> tasks = new ArrayList<>();

    public AGV() {
    }

    public AGV(ShortDescription description, AGVModel model, double limit ) {
        this.description = description;
        this.model = model;
        this.maxWeight = limit;
        this.autonomy = 300d;
        this.status = AGVStatus.FREE;
        this.orderBeingPrepared=null;
    }


    public ShortDescription getDescription() {
        return description;
    }

    public AGVModel getModel() {
        return model;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isFree() {
        return status==AGVStatus.FREE;
    }

    public boolean isCharging() {
        return status==AGVStatus.CHARGING;
    }

    public boolean isOccupied() {
        return status==AGVStatus.OCCUPIED;
    }

    public List<Info> getTasks() {
        return tasks;
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    public void changeStatus(AGVStatus s){
        this.status=s;
    }

    public Order getOrderBeingPrepared() {
        return orderBeingPrepared;
    }

    public void setOrderBeingPrepared(Order order) {
        this.orderBeingPrepared = order;
        this.changeStatus(AGVStatus.OCCUPIED);
    }

    public void endOfOrderPreparation() {
        this.orderBeingPrepared=null;
        this.changeStatus(AGVStatus.FREE);
    }


    public void acceptTask(Info tarefa) {
        tasks.add(tarefa);
    }

    @Override
    public String toString() {
        return "AGV{" +
                "id=" + agvId +
                ", shortDesc=" + description +
                ", model=" + model +
                ", maxWeight=" + maxWeight +
                '}';
    }


    @Override
    public Long identity() {
        return agvId;
    }
}