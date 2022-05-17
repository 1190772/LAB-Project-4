package eapli.base.product.application;

import eapli.base.product.domain.model.Brand;
import eapli.base.product.domain.model.ProductCatalog;

public class SearchProductCatalogByBrandController {

    private final SearchProductCatalogService svc = new SearchProductCatalogService();

    public Iterable<ProductCatalog> findProductsByBrand(Brand brand, String sort) {

        return svc.findProductsByBrand(brand, sort);
    }


}
