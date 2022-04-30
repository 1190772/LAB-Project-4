/*package eapli.base.persistence.impl.jpa;

import eapli.base.domain.model.Brand;
import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.model.ShortDescription;
import eapli.base.domain.persistence.OrderRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class JpaOrderRepository extends JpaAutoTxRepository implements OrderRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

    public JpaOrderRepository(String persistenceUnitName, String identityFieldName) {
        super(persistenceUnitName, identityFieldName);
    }


    @Override
    public Iterable<ProductCatalog> findProductCatalogByBrand(Brand brand) {
        return match("e.brand=:brand", "brand", brand);
    }

    @Override
    public Iterable<ProductCatalog> findProductCatalogByCategory(Category category) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable<ProductCatalog> findProductCatalogByShortDescription(ShortDescription desc) {
        throw new UnsupportedOperationException(NOT_SUPPORTED);
    }

    @Override
    public Iterable findAll(Sort sort) {
        return null;
    }

    @Override
    public Page findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Iterable saveAll(Iterable entities) {
        return null;
    }

    @Override
    public boolean existsById(Object o) {
        return false;
    }

    @Override
    public Iterable findAllById(Iterable iterable) {
        return null;
    }

    @Override
    public void deleteAllById(Iterable iterable) {

    }

    @Override
    public void deleteAll(Iterable entities) {

    }

    @Override
    public void deleteAll() {

    }
}
*/