package eapli.base.product.application;

import eapli.base.product.domain.model.Product;
import eapli.base.category.domain.model.Category;

public class SearchProductCatalogByCategoryController {


    private final SearchProductCatalogService svc = new SearchProductCatalogService();

    public Iterable<Product> findProductCatalogByCategory(Category category, String sort) {

        return svc.findProductsByCategory(category, sort);
    }

}
