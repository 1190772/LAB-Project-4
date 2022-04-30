package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.application.productCatalog.SearchProductCatalogByBrandController;
import eapli.base.application.productCatalog.SearchProductCatalogByCategoryController;
import eapli.base.domain.model.Brand;
import eapli.base.domain.model.BrandException;
import eapli.base.domain.model.ProductCatalog;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

public class SearchProductCatalogByBrandUI extends AbstractListUI {

    private SearchProductCatalogByBrandController theController = new SearchProductCatalogByBrandController();

    @Override
    protected boolean doShow() {
        String brand;

        brand = Console.readLine("Brand:");
        System.out.println("Results with the Brand : " + brand);
        Brand brand1 = new Brand(brand);
        for (ProductCatalog cat: theController.findProductCatalogByBrand(brand1)) {
            System.out.println(cat.toString());
        }
        return false;
    }

    @Override
    protected Iterable<ProductCatalog> elements() {
        return null;
    }

    @Override
    protected Visitor<ProductCatalog> elementPrinter() {
        return null;
    }

    @Override
    protected String elementName() {
        return "Product Catalog";
    }

    @Override
    protected String listHeader() {
        return "PRODUCT CATALOG";
    }

    @Override
    protected String emptyMessage() {
        return "No data.";
    }

    @Override
    public String headline() {
        return "Search Product Catalog";
    }
}
