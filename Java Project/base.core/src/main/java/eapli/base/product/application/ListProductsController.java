package eapli.base.product.application;

import eapli.base.product.domain.model.Product;

public class ListProductsController {


    SearchProductCatalogService svc = new SearchProductCatalogService();

    public Iterable<Product> listProducts() {
        System.out.println("3");
        return svc.availableProducts();
    }
}
