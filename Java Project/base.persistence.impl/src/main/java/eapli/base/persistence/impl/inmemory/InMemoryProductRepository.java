package eapli.base.persistence.impl.inmemory;


import eapli.base.category.domain.model.Category;
import eapli.base.product.domain.model.*;
import eapli.base.product.domain.persistence.ProductRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryProductRepository extends InMemoryDomainRepository<Product, InternalCode> implements ProductRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<Product> findProductByInternalCode(InternalCode internalCode) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<Product> findProductByReference(Reference reference) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }


    @Override
    public Iterable<Product> findProductsByBrand(Brand brand, String sort) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<Product> findProductsByCategory(Category category, String sort) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<Product> findProductsByShortDescription(ShortDescription desc, String sort) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<Product> availableProducts() {
        return null;
    }


}
