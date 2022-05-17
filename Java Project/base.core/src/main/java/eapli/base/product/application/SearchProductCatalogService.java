package eapli.base.product.application;

import eapli.base.category.domain.model.Category;
import eapli.base.product.domain.model.Brand;
import eapli.base.product.domain.model.ProductCatalog;
import eapli.base.product.domain.model.ShortDescription;
import eapli.base.product.domain.persistence.ProductCatalogRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;


public class SearchProductCatalogService {

    private final ProductCatalogRepository repo = PersistenceContext.repositories().productCatalog();

    private static final String NO_RESULTS = "No results with those filters";

    private AuthorizationService auth;

    public Iterable<ProductCatalog> findProductsByBrand(Brand brand, String sort) {
        //auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        if(repo.findProductsByBrand(brand, sort) == null){
            throw new UnsupportedOperationException(NO_RESULTS);
        }else{
            return repo.findProductsByBrand(brand, sort);
        }

    }

    public Iterable<ProductCatalog> findProductsByCategory(Category category, String sort) {
        //auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        if(repo.findProductsByCategory(category, sort) == null){
            throw new UnsupportedOperationException(NO_RESULTS);
        }else{
            return repo.findProductsByCategory(category, sort);
        }

    }

    public Iterable<ProductCatalog> findProductsByShortDescription(ShortDescription desc, String sort) {
        //auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        if(repo.findProductsByShortDescription(desc, sort) == null){
            throw new UnsupportedOperationException(NO_RESULTS);
        }else{
            return repo.findProductsByShortDescription(desc, sort);
        }

    }


}