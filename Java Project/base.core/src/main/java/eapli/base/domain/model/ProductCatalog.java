package eapli.base.domain.model;

import eapli.framework.domain.model.AggregateRoot;

import javax.persistence.*;

@Entity
@Table(name = "product_catalog")
public class ProductCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;


}