package eapli.base.application.productCatalog;

import eapli.base.domain.model.Brand;
import eapli.base.domain.model.ProductCatalog;

public class SearchProductCatalogByBrandController {

    private SearchProductCatalogService svc = new SearchProductCatalogService();

    public Iterable<ProductCatalog> findProductCatalogByBrand(Brand brand) {

        return svc.findProductCatalogByBrand(brand);
    }


}
