package eapli.base.product.application;

import eapli.base.category.domain.model.Category;
import eapli.base.product.domain.model.Brand;
import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.ShortDescription;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.product.domain.persistence.ProductRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;


public class SearchProductCatalogService {

    private final ProductRepository repo = PersistenceContext.repositories().products();

    private static final String NO_RESULTS = "No results with those filters";

    private AuthorizationService auth;

    public Iterable<Product> findProductsByBrand(Brand brand, String sort) {
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        if(repo.findProductsByBrand(brand, sort) == null){
            throw new UnsupportedOperationException(NO_RESULTS);
        }else{
            return repo.findProductsByBrand(brand, sort);
        }

    }

    public Iterable<Product> findProductsByCategory(Category category, String sort) {
        //auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        if(repo.findProductsByCategory(category, sort) == null){
            throw new UnsupportedOperationException(NO_RESULTS);
        }else{
            return repo.findProductsByCategory(category, sort);
        }

    }

    public Iterable<Product> findProductsByShortDescription(ShortDescription desc, String sort) {
        //auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        if(repo.findProductsByShortDescription(desc, sort) == null){
            throw new UnsupportedOperationException(NO_RESULTS);
        }else{
            return repo.findProductsByShortDescription(desc, sort);
        }

    }

    public Iterable<Product> availableProducts() {
        //auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);
        System.out.println("7");
        return repo.availableProducts();
    }


}