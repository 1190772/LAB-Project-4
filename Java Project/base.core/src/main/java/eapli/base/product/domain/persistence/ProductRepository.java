package eapli.base.product.domain.persistence;

import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.InternalCode;
import eapli.base.product.domain.model.Reference;
import eapli.framework.domain.repositories.DomainRepository;

public interface ProductRepository extends DomainRepository<InternalCode, Product> {

    Iterable<Product> findProductByInternalCode(InternalCode internalCode);
    Iterable<Product> findProductByReference(Reference reference);
}
