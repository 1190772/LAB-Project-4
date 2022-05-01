package eapli.base.persistence.impl.inmemory;

import eapli.base.domain.model.*;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryProductCatalogRepository extends InMemoryDomainRepository<ProductCatalog, Long> implements ProductCatalogRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

    @Override
    public Iterable<ProductCatalog> findProductsByBrand(Brand brand, String sort) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<ProductCatalog> findProductsByCategory(Category category, String sort) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<ProductCatalog> findProductsByShortDescription(ShortDescription desc, String sort) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }


}
