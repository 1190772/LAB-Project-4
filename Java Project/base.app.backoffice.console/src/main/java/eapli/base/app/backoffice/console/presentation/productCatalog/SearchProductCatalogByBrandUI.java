package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.application.productCatalog.SearchProductCatalogByBrandController;
import eapli.base.domain.model.Brand;
import eapli.base.domain.model.ProductCatalog;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class SearchProductCatalogByBrandUI extends AbstractUI {

    private final SearchProductCatalogByBrandController theController = new SearchProductCatalogByBrandController();

    @Override
    protected boolean doShow() {
        String brand;
        brand = Console.readLine("Brand:");
        System.out.println("Results with the Brand : " + brand);
        Brand brand1 = new Brand(brand);
        for (ProductCatalog cat: theController.findProductsByBrand(brand1)) {
            System.out.println(cat.toString());
        }
        return false;
    }

    @Override
    public String headline() {
        return "Search Product Catalog by Brand";
    }
}
