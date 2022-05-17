package eapli.base.persistence.impl.inmemory;


import eapli.base.product.domain.model.InternalCode;
import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.Reference;
import eapli.base.product.domain.persistence.ProductRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryProductRepository extends InMemoryDomainRepository<Product, InternalCode> implements ProductRepository {

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



}
