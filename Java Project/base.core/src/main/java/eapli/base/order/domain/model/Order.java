package eapli.base.order.domain.model;

import eapli.base.customer.domain.model.Address;
import eapli.base.product.domain.model.PriceWithoutTaxes;
import eapli.base.product.domain.model.ProductsList;
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
    private PriceWithoutTaxes priceWithoutTaxes;

    @Embedded
    private PriceWithoutTaxes priceWithoutTaxesWithTaxes;

    @Embedded
    private Date creationDate;

    @Embedded
    EmailAddress email;

    @Embedded
    Address address;


    public Order(ProductsList products, Date date, EmailAddress e, Address a) {
        this.prod=products;
        this.priceWithoutTaxes=products.totalPrice(false);
        this.priceWithoutTaxesWithTaxes =products.totalPrice(true);
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
                ", priceWithTaxes=" + priceWithoutTaxesWithTaxes +
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
