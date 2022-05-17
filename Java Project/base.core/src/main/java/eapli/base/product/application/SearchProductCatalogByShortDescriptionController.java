package eapli.base.product.application;

import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.ShortDescription;

public class SearchProductCatalogByShortDescriptionController {

    private final SearchProductCatalogService svc = new SearchProductCatalogService();
    public Iterable<Product> findProductCatalogByShortDescription(ShortDescription desc, String sort) {

        return svc.findProductsByShortDescription(desc, sort);
    }
}
