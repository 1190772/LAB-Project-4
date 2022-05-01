package eapli.base.application.productCatalog;

import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.model.product.ShortDescription;

public class SearchProductCatalogByShortDescriptionController {

    private final SearchProductCatalogService svc = new SearchProductCatalogService();
    public Iterable<ProductCatalog> findProductCatalogByShortDescription(ShortDescription desc, String sort) {

        return svc.findProductsByShortDescription(desc, sort);
    }
}
