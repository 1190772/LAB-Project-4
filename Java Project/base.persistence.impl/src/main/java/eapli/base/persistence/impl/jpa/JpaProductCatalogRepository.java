package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.domain.model.*;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class JpaProductCatalogRepository extends JpaAutoTxRepository<ProductCatalog, Long, Long> implements ProductCatalogRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";
    private static final String NO_RESULTS = "No results with those filters";

    public JpaProductCatalogRepository(final TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaProductCatalogRepository(final String puName){
        super(puName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    @Override
    public Iterable<ProductCatalog> findProductsByBrand(Brand brand) {
        if (match("e.brand=:brand", "brand", brand) == null) {
            throw new UnsupportedOperationException(NO_RESULTS);
        } else {
            return match("e.brand=:brand", "brand", brand);
        }
    }

    @Override
    public Iterable<ProductCatalog> findProductsByCategory(Category category) {
        if (match("e.category=:category", "category", category) == null) {
            throw new UnsupportedOperationException(NO_RESULTS);
        } else {
            return match("e.category=:category", "category", category);
        }
    }

    @Override
    public Iterable<ProductCatalog> findProductsByShortDescription(ShortDescription desc) {
        if (match("e.desc=:desc", "desc", desc) == null) {
            throw new UnsupportedOperationException(NO_RESULTS);
        } else {
            return match("e.desc=:desc", "desc", desc);
        }
    }

}
