package eapli.base.domain.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsList {

    
    private List<Product> products;

    private double price;

    public ProductsList(){
        products = new ArrayList<>();
        price=0;
    }

    public boolean addProduct(Product prod){
        Optional<Price> pr=(Price)prod.price();
        return products.add(prod);
    }

    public List<Product> productsList(){
        return products;
    }

    public Price totalPrice(boolean withTax){
        double totalPrice=0;


    }

}
