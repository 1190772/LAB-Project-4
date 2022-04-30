package eapli.base.persistence.impl.inmemory;

import eapli.base.domain.model.Brand;
import eapli.base.domain.model.Category;
import eapli.base.domain.model.Price;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryProductCatalogRepository extends InMemoryDomainRepository implements ProductCatalogRepository {
    @Override
    public AggregateRoot save(AggregateRoot entity) {
        return null;
    }

    @Override
    public void delete(AggregateRoot entity) {

    }

    @Override
    public Iterable<ProductCatalog> FilterByCategory(Category category) {
        return null;
    }

    @Override
    public Iterable<ProductCatalog> FilterByBrand(Brand brand) {
        return null;
    }

    @Override
    public Iterable<ProductCatalog> SortByPrice(Price price) {
        return null;
    }

    @Override
    public Iterable<ProductCatalog> SortByCategory(Category category) {
        return null;
    }

    @Override
    public Iterable<ProductCatalog> SortByBrand(Brand brand) {
        return null;
    }
}
