package eapli.base.product.application;

import eapli.base.product.domain.model.ProductCatalog;
import eapli.base.category.domain.model.Category;

public class SearchProductCatalogByCategoryController {


    private final SearchProductCatalogService svc = new SearchProductCatalogService();

    public Iterable<ProductCatalog> findProductCatalogByCategory(Category category, String sort) {

        return svc.findProductsByCategory(category, sort);
    }

}
