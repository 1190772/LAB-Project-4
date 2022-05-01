package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.domain.model.*;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import javax.persistence.TypedQuery;


public class JpaProductCatalogRepository extends JpaAutoTxRepository<ProductCatalog, Long, Long> implements ProductCatalogRepository {


    public JpaProductCatalogRepository(final TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaProductCatalogRepository(final String puName){
        super(puName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    @Override
    public Iterable<ProductCatalog> findProductsByBrand(Brand brand, String sort) {
        final TypedQuery<ProductCatalog> query = entityManager().createQuery(
                "SELECT p FROM ProductCatalog p WHERE p.products.brand = :brand ORDER BY :sort",
                ProductCatalog.class);
        query.setParameter("brand", brand);
        query.setParameter("sort", sort);

        return query.getResultList();
    }

    @Override
    public Iterable<ProductCatalog> findProductsByCategory(Category category, String sort) {
        final TypedQuery<ProductCatalog> query = entityManager().createQuery(
                "SELECT p FROM ProductCatalog p WHERE p.products.productCategory = :category ORDER BY :sort",
                ProductCatalog.class);
        query.setParameter("category", category);
        query.setParameter("sort", sort);

        return query.getResultList();
    }

    @Override
    public Iterable<ProductCatalog> findProductsByShortDescription(ShortDescription desc, String sort) {
        final TypedQuery<ProductCatalog> query = entityManager().createQuery(
                "SELECT p FROM ProductCatalog p WHERE p.products.shortDescription = :desc ORDER BY :sort",
                ProductCatalog.class);
        query.setParameter("desc", desc);
        query.setParameter("sort", sort);

        return query.getResultList();
    }


}
