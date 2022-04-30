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


    public Order(ProductsList products,) {
        this.prod=products;
        this.priceWithoutTaxes=products.totalPriceWithoutTaxes();
        this.priceWithTaxes=products.totalPriceWithTaxes();

    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public Long identity() {
        return id;
    }
}
