package eapli.base.application.productCatalog;

import eapli.base.domain.model.*;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;


public class SearchProductCatalogService {

    private final ProductCatalogRepository repo = PersistenceContext.repositories().productCatalog();

    private AuthorizationService auth;

    public Iterable<ProductCatalog> findProductCatalogByBrand(Brand brand) {
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.findProductCatalogByBrand(brand);
    }

    public Iterable<ProductCatalog> findProductCatalogByCategory(Category category) {
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.findProductCatalogByCategory(category);
    }

    public Iterable<ProductCatalog> findProductCatalogByShortDescription(ShortDescription desc) {
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.findProductCatalogByShortDescription(desc);
    }

    public Iterable<ProductCatalog> AllProducts(){
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.findAll();
    }


}