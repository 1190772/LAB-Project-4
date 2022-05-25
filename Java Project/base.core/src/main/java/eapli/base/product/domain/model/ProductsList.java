package eapli.base.product.domain.model;


import eapli.base.product.domain.model.PriceWithTaxes;
import eapli.base.product.domain.model.PriceWithoutTaxes;
import eapli.base.product.domain.model.Product;
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
        Optional<PriceWithoutTaxes> pwot=prod.priceWithoutTaxes();
        priceWithoutTaxes+=pwot.get().priceValue().doubleValue();
        Optional<PriceWithTaxes> pwt=prod.priceWithTaxes();
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

    public PriceWithoutTaxes totalPrice(boolean withTax){
        if(withTax)
            return new PriceWithoutTaxes(priceWithTaxes);

        return new PriceWithoutTaxes(priceWithoutTaxes);
    }

    @Override
    public String toString() {
        String s="ProductsList{\n";
        for(Map.Entry<Product, Integer> prod : products.entrySet()){
            s.concat("\n\tProduct:" + prod.getKey() +"\n\tQuantidade:" + prod.getValue().intValue() + "\n\tPriceWithoutTaxes=" + prod.getKey().priceWithoutTaxes() +
            "\n\tPriceWithTaxes=" + prod.getKey().priceWithTaxes() + "}\n");
        }
        s.concat("}");
        return s;
    }
}
