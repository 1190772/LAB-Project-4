package eapli.base.persistence.impl.jpa;

import eapli.base.product.domain.model.InternalCode;
import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.Reference;
import eapli.base.product.domain.persistence.ProductRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.Optional;

public class JpaProductRepository extends JpaAutoTxRepository<Product, InternalCode, Reference> implements ProductRepository
        {


            public JpaProductRepository(String persistenceUnitName, String identityFieldName) {
                super(persistenceUnitName, identityFieldName);
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

            @Override
            public <S extends Product> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Product> ofIdentity(InternalCode id) {
                return Optional.empty();
            }

            @Override
            public boolean containsOfIdentity(InternalCode id) {
                return ProductRepository.super.containsOfIdentity(id);
            }

            @Override
            public void delete(Product entity) {

            }

            @Override
            public void deleteOfIdentity(InternalCode entityId) {

            }
        }
