package eapli.base.customer.domain.model;

import eapli.base.product.domain.model.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ShoppingCart {

    @Id
    private Long id;

    @Transient
    private List<OrderedProduct> listOfOrders;

    @Embedded
    @Transient
    @Column(name = "PriceWithoutTaxes")
    private Price pwTt;

    @Embedded
    @Column(name = "PriceWithTaxes")
    private Price pwt;


    public ShoppingCart(Long id){
        this.id=id;
        this.listOfOrders = new ArrayList<>();
        pwTt=new Price((double) 0);
        pwt=new Price((double) 0);
    }

    public ShoppingCart(){

    }

    public boolean addProduct(Product prod){
        for(OrderedProduct p : listOfOrders){
            if(p.getProduct().identity().equals(prod.identity())){
                p.incrementQuantity();
                return true;
            }
        }
        listOfOrders.add(new OrderedProduct(prod));
        return true;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", listOfOrders=" + listOfOrders +
                ", pwTt=" + pwTt +
                ", pwt=" + pwt +
                '}';
    }
}
