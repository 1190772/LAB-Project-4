package eapli.base.persistence.impl.jpa;

import eapli.base.domain.model.Brand;
import eapli.base.domain.model.Category;
import eapli.base.domain.model.Price;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class JpaProductCatalogRepository extends JpaAutoTxRepository implements ProductCatalogRepository {

    public JpaProductCatalogRepository(String persistenceUnitName, String identityFieldName) {
        super(persistenceUnitName, identityFieldName);
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
    public Iterable<ProductCatalog> FilterByCategory(Category category) {
        return null;
    }

    @Override
    public Iterable<ProductCatalog> FilterByBrand(Brand brand) {
        return null;
    }

    @Override
    public Iterable<ProductCatalog> SortByPrice(Price price) {
        return null;
    }

    @Override
    public Iterable<ProductCatalog> SortByCategory(Category category) {
        return null;
    }

    @Override
    public Iterable<ProductCatalog> SortByBrand(Brand brand) {
        return null;
    }
}
