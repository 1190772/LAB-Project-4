package eapli.base.product.domain.model;


import org.springframework.stereotype.Service;

import javax.persistence.Embeddable;
import java.util.*;

@Service
@Embeddable
public class ProductsList {

    
    private Map<Product, Integer> products;

    private double priceWithoutTaxes;

    private double priceWithTaxes;

    public ProductsList(){
        products = new TreeMap<>();
        priceWithoutTaxes=0;
        priceWithTaxes=0;
    }

    public void addProduct(Product prod){
        Optional<Price> pwot=prod.priceWithoutTaxes();
        priceWithoutTaxes+=pwot.get().priceValue().doubleValue();
        Optional<Price> pwt=prod.priceWithTaxes();
        priceWithTaxes+=pwt.get().priceValue().doubleValue();
        pwt.get().priceValue().doubleValue();
        if(products.containsKey(prod)){
            products.replace(prod, products.get(prod),new Integer(products.get(prod).intValue()+1));
        }else{
            products.put(prod,new Integer(1));
        }
    }

    public Map<Product,Integer> productsList(){
        return products;
    }

    public Price totalPrice(boolean withTax){
        if(withTax)
            return new Price(priceWithTaxes);

        return new Price(priceWithoutTaxes);
    }

    @Override
    public String toString() {
        String s="ProductsList{";
        for(Map.Entry<Product, Integer> prod : products.entrySet()){
            s.concat("\n\t{Product:" + prod.getKey() +"\n\tQuantidade:" + prod.getValue().intValue() + "\n\tPriceWithoutTaxes=" + prod.getKey().priceWithoutTaxes() +
            "\n\tPriceWithTaxes=" + prod.getKey().priceWithTaxes() + "}\n");
        }
        s.concat("}");
        return s;
    }
}
