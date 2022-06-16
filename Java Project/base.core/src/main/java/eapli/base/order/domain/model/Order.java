package eapli.base.order.domain.model;

import eapli.base.customer.domain.model.Address;
import eapli.base.customer.domain.model.Customer;
import eapli.base.product.domain.model.*;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.EmailAddress;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "Orders")
public class Order implements AggregateRoot<Long>, Comparable<Long> {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    private List<OrderedProduct> listOfOrders;

    @Embedded
    @Transient
    @Column(name = "PriceWithoutTaxes")
    private Price priceWithoutTaxes;

    @Embedded
    @Column(name = "PriceWithTaxes")
    private Price priceWithTaxes;

    private Date creationDate;

    @Embedded
    EmailAddress email;

    @Embedded
    Address address;

    @Enumerated(EnumType.ORDINAL)
    OrderStatus status;

    @OneToOne
    private Customer customer;

    @Transient
    private Double weight;

    public Order(List<OrderedProduct> products,Price pwot, Price pwt, Date date, EmailAddress e, Address a, Customer customer) {
        this.listOfOrders=products;
        this.priceWithoutTaxes=pwot;
        this.priceWithTaxes =pwt;
        this.creationDate=date;
        this.email=e;
        this.address=a;
        this.status=OrderStatus.NOT_PAID;
        this.customer=customer;
        this.weight=calculateWeight();
    }

    public Order() {

    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    private Double calculateWeight(){
        double totalWeight=0;
        for(OrderedProduct p : listOfOrders){
            totalWeight+=p.getProduct().getMesurements().getWeight().doubleValue();
        }
        return Double.valueOf(totalWeight);
    }

    @Override
    public boolean sameAs(Object other) {
        if (!(other instanceof Order)) {
            return false;
        }

        final Order that = (Order) other;
        if (this == that) {
            return true;
        }

        return (Objects.equals(this.id, that.identity()));
    }

    public Long id() { return id;
    }

    public Long customerId() { return customer.identity();
    }

    public Price price() { return priceWithTaxes;
    }

    public OrderStatus status() { return status;
    }

    public void changeStatus(OrderStatus s){
        this.status=s;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", prod=" + listOfOrders +
                ", priceWithoutTaxes=" + priceWithoutTaxes +
                ", priceWithTaxes=" + priceWithTaxes +
                ", creationDate=" + creationDate +
                ", email=" + email +
                ", address=" + address +
                '}';
    }

    @Override
    public Long identity() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public OrderDTO toDTO() {
        List<OrderedProductDTO> result = new LinkedList<>();
        listOfOrders.forEach(lo -> result.add(lo.toDTO()));
        return new OrderDTO(id, result, priceWithoutTaxes.priceValue(), priceWithTaxes.priceValue(), creationDate, email.toString(), address.toString(), status, weight, customer.toDTO());
    }
}
