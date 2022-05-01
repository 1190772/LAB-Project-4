package eapli.base.application.productCatalog;

import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;

public class SearchProductCatalogByCategoryController {


    private final SearchProductCatalogService svc = new SearchProductCatalogService();

    public Iterable<ProductCatalog> findProductCatalogByCategory(Category category) {

        return svc.findProductsByCategory(category);
    }

}
