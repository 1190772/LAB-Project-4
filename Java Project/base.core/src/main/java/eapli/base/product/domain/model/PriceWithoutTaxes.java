package eapli.base.product.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;

@Embeddable
public class PriceWithoutTaxes implements ValueObject {
    private Double priceWithoutTaxes;

    public PriceWithoutTaxes(Double newPrice) {
        Preconditions.nonNull(newPrice);
        if(!validateIfIsNegative(newPrice))
            throw new IllegalArgumentException("invalid price can't be negtive");
        this.priceWithoutTaxes = newPrice;
    }

    protected PriceWithoutTaxes() {
    }

    public static boolean validateIfIsNegative(Double price) {
        return price >= 0;
    }

    public static PriceWithoutTaxes pricedAs(double price) {
        return new PriceWithoutTaxes(price);
    }

    public Double priceValue(){
        return priceWithoutTaxes;
    }
}
