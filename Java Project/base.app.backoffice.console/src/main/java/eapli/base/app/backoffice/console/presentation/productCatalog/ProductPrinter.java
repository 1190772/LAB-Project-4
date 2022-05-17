package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.product.domain.model.Product;
import eapli.framework.visitor.Visitor;

public class ProductPrinter implements Visitor<Product> {

    @Override
    public void visit(final Product visitee) {
        System.out.printf("%-10s%-30s%-4s", visitee.brand(), visitee.getInternalCode(),
                String.valueOf(visitee.productStatus()));
    }
}
