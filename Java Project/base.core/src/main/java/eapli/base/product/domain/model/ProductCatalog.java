package eapli.base.product.domain.model;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ProductCatalog implements AggregateRoot<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    private Product products;

    public Product getProduct() {
        return products;
    }

    public ProductCatalog(Product products) {
        if(products.productStatus()){
            this.products = products;
        }
    }

    public ProductCatalog() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCatalog that = (ProductCatalog) o;
        return id.equals(that.id) && products.equals(that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "id=" + id +
                ", product=" + products +
                '}';
    }

    @Override
    public Long identity() {
        return id;
    }
}