package eapli.base.order.domain.model;

import eapli.base.customer.domain.model.Address;
import eapli.base.customer.domain.model.Customer;
import eapli.base.product.domain.model.Brand;
import eapli.base.product.domain.model.OrderedProduct;
import eapli.base.product.domain.model.Price;
import eapli.base.product.domain.model.ProductsList;
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

    public Order(List<OrderedProduct> products,Price pwot, Price pwt, Date date, EmailAddress e, Address a, Customer customer) {
        this.listOfOrders=products;
        this.priceWithoutTaxes=pwot;
        this.priceWithTaxes =pwt;
        this.creationDate=date;
        this.email=e;
        this.address=a;
        this.status=OrderStatus.NOT_PAID;
        this.customer=customer;
    }

    public Order() {

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



}
