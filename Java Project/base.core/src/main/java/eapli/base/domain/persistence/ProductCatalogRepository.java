package eapli.base.domain.persistence;

import eapli.base.domain.model.*;
import eapli.base.domain.model.category.Category;
import eapli.base.domain.model.product.Brand;
import eapli.base.domain.model.product.ShortDescription;
import eapli.framework.domain.repositories.DomainRepository;

public interface ProductCatalogRepository extends DomainRepository<Long, ProductCatalog> {

    Iterable<ProductCatalog> findProductsByBrand(Brand brand, String sort);

    Iterable<ProductCatalog> findProductsByCategory(Category category, String sort);

    Iterable<ProductCatalog> findProductsByShortDescription(ShortDescription desc, String sort);
}