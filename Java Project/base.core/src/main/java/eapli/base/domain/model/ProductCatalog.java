package eapli.base.domain.model;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ProductCatalog implements AggregateRoot<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @ManyToOne
    private Product product;

    public Product getProduct() {
        return product;
    }

    public ProductCatalog(Product product) {
        if(product.productStatus()){
            this.product = product;
        }
    }

    public ProductCatalog() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCatalog that = (ProductCatalog) o;
        return id.equals(that.id) && product.equals(that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product);
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "id=" + id +
                ", product=" + product +
                '}';
    }

    @Override
    public Long identity() {
        return null;
    }
}