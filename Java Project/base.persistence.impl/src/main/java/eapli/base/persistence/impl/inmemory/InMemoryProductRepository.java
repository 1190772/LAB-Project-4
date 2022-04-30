package eapli.base.persistence.impl.inmemory;

import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.base.domain.persistence.ProductRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryProductRepository extends InMemoryDomainRepository implements ProductRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<ProductCatalog> findProductCatalogByCategory(Category category) {
        return null;
    }

    @Override
    public AggregateRoot save(AggregateRoot entity) {
        return null;
    }

    @Override
    public void delete(AggregateRoot entity) {

    }
}
