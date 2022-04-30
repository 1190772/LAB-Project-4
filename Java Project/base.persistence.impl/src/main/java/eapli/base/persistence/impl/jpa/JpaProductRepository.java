package eapli.base.persistence.impl.jpa;

import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.base.domain.persistence.ProductRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.Map;
import java.util.Optional;

public class JpaProductRepository  extends JpaAutoTxRepository implements ProductRepository {

    public JpaProductRepository(String persistenceUnitName, String identityFieldName) {
        super(persistenceUnitName, identityFieldName);
    }

    @Override
    public Iterable<ProductCatalog> findProductCatalogByCategory(Category category) {
        return null;
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
}
