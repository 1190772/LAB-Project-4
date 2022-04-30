package eapli.base.domain.persistence;

import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;
import eapli.framework.domain.repositories.DomainRepository;

public interface ProductRepository extends DomainRepository {

    Iterable<ProductCatalog> findProductCatalogByCategory(Category category);
}
