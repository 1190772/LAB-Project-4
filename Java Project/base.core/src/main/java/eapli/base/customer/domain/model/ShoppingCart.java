package eapli.base.customer.domain.model;

import eapli.base.product.domain.model.*;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShoppingCart {

    @Id
    private Long id;

    @Embedded
    ProductsList prodList;

    @Embedded
    PriceWithoutTaxes pwTt;

    @Embedded
    PriceWithTaxes pwt;

    public ShoppingCart(Long id){
        this.id=id;
        this.prodList = new ProductsList();
        pwTt=new PriceWithoutTaxes((double) 0);
        pwt=new PriceWithTaxes((double) 0);
    }

    public ShoppingCart(){

    }

    public ProductsList addProduct(Product prod){
        prodList.addProduct(prod);
        return prodList;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", prodList=" + prodList +
                ", pwTt=" + pwTt +
                ", pwt=" + pwt +
                '}';
    }
}
