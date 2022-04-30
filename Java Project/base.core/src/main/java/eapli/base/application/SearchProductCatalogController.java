package eapli.base.application;

import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;

import java.util.Collections;

public class SearchProductCatalogController {


    private SearchProductCatalogService svc;

    public Iterable<ProductCatalog> FilterByCategory(Category category){
        return svc.FilterByCategory(category);
    }

    /*public Iterable<ProductCatalog> FilterByBrand(Brand brand){
        return svc.FilterByBrand(brand);
    }*/




    public Iterable<ProductCatalog> SearchProductCatalog(){
        return svc.AllProducts();
    }
}
