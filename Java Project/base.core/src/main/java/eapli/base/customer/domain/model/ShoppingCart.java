package eapli.base.customer.domain.model;

import eapli.base.product.domain.model.*;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShoppingCart {

    @Id
    private Long id;

    @Embedded
    private ProductsList prodList;

    @Embedded
    @Column(name = "PriceWithoutTaxes")
    private Price pwTt;

    @Embedded
    @Column(name = "PriceWithTaxes")
    private Price pwt;


    public ShoppingCart(Long id){
        this.id=id;
        this.prodList = new ProductsList();
        pwTt=new Price((double) 0);
        pwt=new Price((double) 0);
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
