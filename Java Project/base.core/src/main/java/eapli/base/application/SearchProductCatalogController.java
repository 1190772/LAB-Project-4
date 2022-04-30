package eapli.base.application;

import eapli.base.domain.model.Brand;
import eapli.base.domain.model.Category;
import eapli.base.domain.model.Price;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.usermanagement.domain.BaseRoles;

import java.util.Collections;

public class SearchProductCatalogController {


    private SearchProductCatalogService svc;

    public Iterable<ProductCatalog> FilterByCategory(Category category){
        return svc.FilterByCategory(category);
    }

    public Iterable<ProductCatalog> FilterByBrand(Brand brand){
        return svc.FilterByBrand(brand);
    }

    public Iterable<ProductCatalog> SortByPrice(Price price){

        return svc.SortByPrice(price);
    }

    public Iterable<ProductCatalog> SortByCategory(Category category){
        return svc.SortByCategory(category);
    }

    public Iterable<ProductCatalog> SortByBrand(Brand brand){
        return svc.SortByBrand(brand);
    }


    public Iterable<ProductCatalog> SearchProductCatalog(){
        return svc.AllProducts();
    }
}
