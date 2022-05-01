package eapli.base.application.productCatalog;

import eapli.base.domain.model.Brand;
import eapli.base.domain.model.ProductCatalog;
import org.springframework.data.domain.Sort;

public class SearchProductCatalogByBrandController {

    private final SearchProductCatalogService svc = new SearchProductCatalogService();

    public Iterable<ProductCatalog> findProductCatalogByBrand(Brand brand) {

        return svc.findProductCatalogByBrand(brand);
    }


}
