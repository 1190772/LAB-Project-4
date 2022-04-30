package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.application.SearchProductCatalogController;
import eapli.base.domain.model.ProductCatalog;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

public class SearchProductCatalogUI  extends AbstractListUI<ProductCatalog> {


    private SearchProductCatalogController theControler;

    @Override
    protected Iterable<ProductCatalog> elements() {
        return theControler.SearchProductCatalog();
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
