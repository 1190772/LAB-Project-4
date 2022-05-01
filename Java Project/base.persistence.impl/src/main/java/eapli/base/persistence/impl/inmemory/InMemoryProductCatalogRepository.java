package eapli.base.persistence.impl.inmemory;

import eapli.base.domain.model.*;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class InMemoryProductCatalogRepository extends InMemoryDomainRepository<ProductCatalog, Long> implements ProductCatalogRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

    @Override
    public Iterable<ProductCatalog> findProductsByBrand(Brand brand) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<ProductCatalog> findProductsByCategory(Category category) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<ProductCatalog> findProductsByShortDescription(ShortDescription desc) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }


}
