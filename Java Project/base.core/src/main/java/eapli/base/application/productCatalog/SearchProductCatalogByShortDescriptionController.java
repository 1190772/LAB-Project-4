package eapli.base.application.productCatalog;

import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.model.ShortDescription;

public class SearchProductCatalogByShortDescriptionController {

    private final SearchProductCatalogService svc = new SearchProductCatalogService();
    public Iterable<ProductCatalog> findProductCatalogByShortDescription(ShortDescription desc) {

        return svc.findProductsByShortDescription(desc);
    }
}
