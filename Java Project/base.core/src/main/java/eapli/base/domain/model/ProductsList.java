package eapli.base.domain.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsList {

    
    private List<Product> products;

    private double priceWithoutTaxes;

    private double priceWithTaxes;

    public ProductsList(){
        products = new ArrayList<>();
        priceWithoutTaxes=0;
        priceWithTaxes=0;
    }

    public boolean addProduct(Product prod){
        Optional<Price> pwot=prod.priceWithoutTaxes();
        priceWithoutTaxes+=pwot.get().priceValue().doubleValue();
        Optional<Price> pwt=prod.priceWithTaxes();
        priceWithTaxes+=pwt.get().priceValue().doubleValue();
        pwt.get().priceValue().doubleValue();
        return products.add(prod);
    }

    public List<Product> productsList(){
        return products;
    }

    public Price totalPrice(boolean withTax){
        if(withTax)
            return new Price(priceWithTaxes);

        return new Price(priceWithoutTaxes);
    }

}
