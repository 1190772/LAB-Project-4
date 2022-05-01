package eapli.base.domain.persistence;

import eapli.base.domain.model.*;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface ProductCatalogRepository extends DomainRepository<Long, ProductCatalog> {

    Iterable<ProductCatalog> findProductsByBrand(Brand brand);

    Iterable<ProductCatalog> findProductsByCategory(Category category);

    Iterable<ProductCatalog> findProductsByShortDescription(ShortDescription desc);
}