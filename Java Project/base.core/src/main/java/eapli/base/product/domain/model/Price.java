package eapli.base.product.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;

@Embeddable
public class Price implements ValueObject {
    private Double price;

    public Price(Double newPrice) {
        Preconditions.nonNull(newPrice);
        if(!validateIfIsNegative(newPrice))
            throw new IllegalArgumentException("invalid price can't be negtive");
        this.price = newPrice;
    }


    protected Price() {
    }

    public static boolean validateIfIsNegative(Double price) {
        return price >= 0;
    }

    public static Price pricedAs(double price) {
        return new Price(price);
    }

    public Double priceValue(){
        return price;
    }

    @Override
    public String toString() {
        return "Price{ " + price.doubleValue() +
                " }";
    }
}
