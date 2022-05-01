package eapli.base.persistence.impl.inmemory;


import eapli.base.domain.model.InternalCode;
import eapli.base.domain.model.Product;
import eapli.base.domain.model.Reference;
import eapli.base.domain.persistence.ProductRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryProductRepository extends InMemoryDomainRepository implements ProductRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<Product> findProductByInternalCode(InternalCode internalCode) {
        return null;
    }

    @Override
    public Iterable<Product> findProductByReference(Reference reference) {
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
