package eapli.base.application;

import eapli.base.domain.model.Brand;
import eapli.base.domain.model.Category;
import eapli.base.domain.model.Price;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.persistence.ProductCatalogRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;


public class SearchProductCatalogService {

    private final ProductCatalogRepository repo = PersistenceContext.repositories().productCatalog();

    private AuthorizationService auth;

    public Iterable<ProductCatalog> FilterByCategory(Category category){
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.FilterByCategory(category);
    }

    public Iterable<ProductCatalog> FilterByBrand(Brand brand){
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.FilterByBrand(brand);
    }

    public Iterable<ProductCatalog> SortByPrice(Price price){
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.SortByPrice(price);
    }

    public Iterable<ProductCatalog> SortByCategory(Category category){
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.SortByCategory(category);
    }

    public Iterable<ProductCatalog> SortByBrand(Brand brand){
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.SortByBrand(brand);
    }


    public Iterable<ProductCatalog> AllProducts(){
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);

        return repo.findAll();
    }


}