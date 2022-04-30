package eapli.base.domain.persistence;

import eapli.base.domain.model.*;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface ProductCatalogRepository extends PagingAndSortingRepository {

    Iterable<ProductCatalog> findProductCatalogByBrand(Brand brand);

    Iterable<ProductCatalog> findProductCatalogByCategory(Category category);

    Iterable<ProductCatalog> findProductCatalogByShortDescription(ShortDescription desc);
}