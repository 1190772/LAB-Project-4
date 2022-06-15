package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.category.domain.model.Category;
import eapli.base.product.domain.model.*;
import eapli.base.product.domain.persistence.ProductRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Consumer;

public class JpaProductRepository extends JpaAutoTxRepository<Product, InternalCode, Reference> implements ProductRepository {


    public JpaProductRepository(TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaProductRepository(final String puName){
        super(puName, Application.settings().getExtendedPersistenceProperties(), "id");
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
    public Iterable<Product> findProductsByBrand(Brand brand, String sort) {
        final TypedQuery<Product> query = entityManager().createQuery(
                "SELECT p FROM Product p WHERE p.brand = :brand ORDER BY :sort",
                Product.class);
        query.setParameter("brand", brand);
        query.setParameter("sort", sort);

        return query.getResultList();
    }

    @Override
    public Iterable<Product> findProductsByCategory(Category category, String sort) {
        final TypedQuery<Product> query = entityManager().createQuery(
                "SELECT p FROM Product p WHERE p.productCategory = :category ORDER BY :sort",
                Product.class);
        query.setParameter("category", category);
        query.setParameter("sort", sort);

        return query.getResultList();
    }

    @Override
    public Iterable<Product> findProductsByShortDescription(ShortDescription desc, String sort) {
        final TypedQuery<Product> query = entityManager().createQuery(
                "SELECT p FROM Product p WHERE p.shortDescription = :desc ORDER BY :sort",
                Product.class);
        query.setParameter("desc", desc);
        query.setParameter("sort", sort);

        return query.getResultList();
    }

    @Override
    public Iterable<Product> availableProducts() {
        return match("e.productStatus=true");
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
    public boolean contains(Product entity) {
        return ProductRepository.super.contains(entity);
    }
    

    @Override
    public void deleteOfIdentity(InternalCode entityId) {
    }

    @Override
    public long size() {
        return ProductRepository.super.size();
    }

    @Override
    public void remove(Product entity) {
        ProductRepository.super.remove(entity);
    }

    @Override
    public void removeOfIdentity(InternalCode entityId) {
        ProductRepository.super.removeOfIdentity(entityId);
    }

    @Override
    public void forEach(Consumer<? super Product> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Product> spliterator() {
        return super.spliterator();
    }

}
