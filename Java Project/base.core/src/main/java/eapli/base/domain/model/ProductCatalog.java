package eapli.base.domain.model;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_catalog")
public class ProductCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "product_internalCode", referencedColumnName = "internalCode")
    })
    private Product product;

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
    public String toString() {
        return "ProductCatalog{" +
                "id=" + id +
                ", product=" + product +
                '}';
    }
}