package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.product.application.ListProductsController;
import eapli.base.product.domain.model.Product;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.visitor.Visitor;


public class ListProductsUI extends AbstractListUI<Product> {

    ListProductsController theController = new ListProductsController();

    /*@Override
    protected boolean doShow() {

        System.out.println("Product Catalog : ");
        for (Product p: theController.listProducts()) {
            System.out.println(p.toString());
        }
        return false;
    }*/

    @Override
    protected Iterable<Product> elements() {
        return theController.listProducts();
    }

    @Override
    protected Visitor<Product> elementPrinter() {
        return new ProductPrinter();

    }

    @Override
    protected String elementName() {
        return "Product Catalog";
    }

    @Override
    protected String listHeader() {
        return String.format("#  %-20s%-20s%-30s%-4s", "Internal Code", "Brand", "Short Description", "Price");
    }

    @Override
    protected String emptyMessage() {
        return "No data.";
    }

    @Override
    public String headline() {
        return "List products";
    }


}
