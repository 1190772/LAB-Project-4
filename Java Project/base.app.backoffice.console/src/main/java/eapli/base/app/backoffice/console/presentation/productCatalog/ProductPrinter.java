package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.product.domain.model.Product;
import eapli.framework.visitor.Visitor;

public class ProductPrinter implements Visitor<Product> {

    @Override
    public void visit(final Product visitee) {
        System.out.printf("%-20s%-20s%-30s%-4s", visitee.getInternalCode(), visitee.brand(), visitee.getShortDescription(),
                String.valueOf(visitee.priceWithTaxes()));
    }
}
