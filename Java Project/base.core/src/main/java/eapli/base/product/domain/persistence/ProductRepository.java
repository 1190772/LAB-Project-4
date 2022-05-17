package eapli.base.product.domain.persistence;

import eapli.base.category.domain.model.Category;
import eapli.base.product.domain.model.*;
import eapli.framework.domain.repositories.DomainRepository;

public interface ProductRepository extends DomainRepository<InternalCode, Product> {

    Iterable<Product> findProductByInternalCode(InternalCode internalCode);
    Iterable<Product> findProductByReference(Reference reference);

    Iterable<Product> findProductsByBrand(Brand brand, String sort);

    Iterable<Product> findProductsByCategory(Category category, String sort);

    Iterable<Product> findProductsByShortDescription(ShortDescription desc, String sort);

    Iterable<Product> availableProducts();
}
