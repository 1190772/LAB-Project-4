package eapli.base.domain.model;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.Money;

import javax.persistence.*;

@Entity
public class Order implements AggregateRoot<Long> {

    @Id
    @GeneratedValue // (strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private ProductsList prod;

    @Embedded
    private Price priceWithoutTaxes;

    @Embedded
    private Price priceWithTaxes;


    public Order(ProductsList products) {
        this.prod=products;
        this.priceWithoutTaxes=products.totalPrice(false);
        this.priceWithTaxes=products.totalPrice(true);

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
    public Long identity() {
        return id;
    }



}
