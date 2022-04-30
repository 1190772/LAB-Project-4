package eapli.base.domain.persistence;

import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;
import eapli.framework.domain.repositories.DomainRepository;


public interface ProductCatalogRepository extends DomainRepository {

    Iterable<ProductCatalog> FilterByCategory(Category category);

    //Iterable<ProductCatalog> FilterByBrand(Brand brand);
}