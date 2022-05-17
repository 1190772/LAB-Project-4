package eapli.base.product.application;

import eapli.base.product.domain.model.ProductCatalog;
import eapli.base.product.domain.model.ShortDescription;

public class SearchProductCatalogByShortDescriptionController {

    private final SearchProductCatalogService svc = new SearchProductCatalogService();
    public Iterable<ProductCatalog> findProductCatalogByShortDescription(ShortDescription desc, String sort) {

        return svc.findProductsByShortDescription(desc, sort);
    }
}
