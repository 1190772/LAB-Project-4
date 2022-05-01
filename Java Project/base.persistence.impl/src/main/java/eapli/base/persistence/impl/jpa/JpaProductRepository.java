package eapli.base.persistence.impl.jpa;

import eapli.base.domain.model.product.InternalCode;
import eapli.base.domain.model.product.Product;
import eapli.base.domain.model.product.Reference;
import eapli.base.domain.persistence.ProductRepository;
import eapli.framework.domain.model.AggregateRoot;
import javax.persistence.TypedQuery;
import java.util.Optional;

public class JpaProductRepository extends BasepaRepositoryBase<Product, InternalCode, Reference> implements ProductRepository
        {

    public JpaProductRepository() {
        super("internalcode");
    }
    @Override
    public AggregateRoot save(AggregateRoot entity) {
        return null;
    }

    @Override
    public Optional ofIdentity(Comparable id) {
        return Optional.empty();
    }

    @Override
    public void delete(AggregateRoot entity) {

    }

    @Override
    public void deleteOfIdentity(Comparable entityId) {

    }

    @Override
    public Iterable<Product> findProductByInternalCode(InternalCode internalCode) {
        final TypedQuery<Product> query = entityManager().createQuery(
                "SELECT c FROM Product c WHERE c.internalCode = :internalCode",
                Product.class);
        query.setParameter("internalCode", internalCode);

        return query.getResultList();
    }


    @Override
    public Iterable<Product> findProductByReference(Reference reference) {
        final TypedQuery<Product> query = entityManager().createQuery(
                "SELECT c FROM Product c WHERE c.reference = :reference",
                Product.class);
        query.setParameter("reference", reference);

        return query.getResultList();
    }

}
