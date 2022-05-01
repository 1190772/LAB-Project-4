package eapli.base.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;

@Embeddable
public class PriceWithTaxes implements ValueObject {
    private Double priceWithTaxes;

    public PriceWithTaxes(Double newPrice) {
        Preconditions.nonNull(newPrice);
        if(!validateIfIsNegative(newPrice))
            throw new IllegalArgumentException("invalid price can't be negtive");
        this.priceWithTaxes = newPrice;
    }

    protected PriceWithTaxes() {
    }

    public static boolean validateIfIsNegative(Double price) {
        return price >= 0;
    }

    public static PriceWithTaxes pricedAs(double price) {
        return new PriceWithTaxes(price);
    }

    public Double priceValue(){
        return priceWithTaxes;
    }
}
