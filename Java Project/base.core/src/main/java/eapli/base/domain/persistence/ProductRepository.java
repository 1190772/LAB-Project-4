package eapli.base.domain.persistence;

import eapli.base.domain.model.product.Product;
import eapli.base.domain.model.product.InternalCode;
import eapli.base.domain.model.product.Reference;
import eapli.framework.domain.repositories.DomainRepository;

public interface ProductRepository extends DomainRepository {

    Iterable<Product> findProductByInternalCode(InternalCode internalCode);
    Iterable<Product> findProductByReference(Reference reference);
}
