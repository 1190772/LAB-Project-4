package eapli.base.order.domain.model;

import eapli.base.customer.domain.model.Address;
import eapli.base.product.domain.model.Price;
import eapli.base.product.domain.model.ProductsList;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.EmailAddress;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;



@Entity
@Table(name = "Orders")
public class Order implements AggregateRoot<Long>, Comparable<Long> {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @Transient
    private ProductsList prod;

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


    public Order(ProductsList products, Date date, EmailAddress e, Address a) {
        this.prod=products;
        this.priceWithoutTaxes=products.totalPrice(false);
        this.priceWithTaxes =products.totalPrice(true);
        this.creationDate=date;
        this.email=e;
        this.address=a;
        this.status=OrderStatus.NOT_PAID;
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

    public void changeStatus(OrderStatus s){
        this.status=s;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", prod=" + prod +
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
