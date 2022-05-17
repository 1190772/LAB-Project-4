package eapli.base.product.domain.persistence;

import eapli.base.category.domain.model.Category;
import eapli.base.product.domain.model.Brand;
import eapli.base.product.domain.model.ProductCatalog;
import eapli.base.product.domain.model.ShortDescription;
import eapli.framework.domain.repositories.DomainRepository;

public interface ProductCatalogRepository extends DomainRepository<Long, ProductCatalog> {

    Iterable<ProductCatalog> findProductsByBrand(Brand brand, String sort);

    Iterable<ProductCatalog> findProductsByCategory(Category category, String sort);

    Iterable<ProductCatalog> findProductsByShortDescription(ShortDescription desc, String sort);
}