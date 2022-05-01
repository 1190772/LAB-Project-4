package eapli.base.application.productCatalog;

import eapli.base.domain.model.Brand;
import eapli.base.domain.model.ProductCatalog;

public class SearchProductCatalogByBrandController {

    private final SearchProductCatalogService svc = new SearchProductCatalogService();

    public Iterable<ProductCatalog> findProductsByBrand(Brand brand) {

        return svc.findProductsByBrand(brand);
    }


}
