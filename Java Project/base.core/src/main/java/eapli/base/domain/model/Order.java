package eapli.base.domain.model;

import eapli.base.domain.model.customer.Address;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.EmailAddress;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Order implements AggregateRoot<Long>, Comparable<Long> {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private ProductsList prod;

    @Embedded
    private Price priceWithoutTaxes;

    @Embedded
    private Price priceWithTaxes;

    @Embedded
    private Date creationDate;

    @Embedded
    EmailAddress email;

    @Embedded
    Address address;


    public Order(ProductsList products, Date date, EmailAddress e, Address a) {
        this.prod=products;
        this.priceWithoutTaxes=products.totalPrice(false);
        this.priceWithTaxes=products.totalPrice(true);
        this.creationDate=date;
        this.email=e;
        this.address=a;
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

        return (this.id==that.identity());
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
