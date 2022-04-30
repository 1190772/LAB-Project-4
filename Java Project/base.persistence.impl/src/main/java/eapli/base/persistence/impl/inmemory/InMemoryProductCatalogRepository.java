package eapli.base.persistence.impl.inmemory;

import eapli.base.domain.model.*;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class InMemoryProductCatalogRepository extends InMemoryDomainRepository implements ProductCatalogRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

    @Override
    public Iterable<ProductCatalog> findProductCatalogByBrand(Brand brand) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<ProductCatalog> findProductCatalogByCategory(Category category) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<ProductCatalog> findProductCatalogByShortDescription(ShortDescription desc) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public AggregateRoot save(AggregateRoot entity) {
        return null;
    }

    @Override
    public void delete(AggregateRoot entity) {

    }

    @Override
    public Iterable findAll(Sort sort) {
        return null;
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Iterable saveAll(Iterable entities) {
        return null;
    }

    @Override
    public boolean existsById(Object o) {
        return false;
    }

    @Override
    public Iterable findAllById(Iterable iterable) {
        return null;
    }

    @Override
    public void deleteAllById(Iterable iterable) {

    }

    @Override
    public void deleteAll(Iterable entities) {

    }

    @Override
    public void deleteAll() {

    }
}
