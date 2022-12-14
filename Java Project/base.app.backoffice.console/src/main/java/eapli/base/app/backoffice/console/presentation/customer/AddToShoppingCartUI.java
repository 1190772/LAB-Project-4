package eapli.base.app.backoffice.console.presentation.customer;

import eapli.base.app.backoffice.console.presentation.productCatalog.ListProductsUI;
import eapli.base.customer.application.AddToShoppingCartController;
import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.ProductsList;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class AddToShoppingCartUI extends AbstractUI {


    private final AddToShoppingCartController controller=new AddToShoppingCartController();
    //private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    protected boolean doShow() {

        System.out.println("Available Products: \n");
            new ListProductsUI().show();

        System.out.println("\n\n");
        String productID= Console.readLine("Product's ID(0 to terminate operation):");

        while(productID!="0") {
            if (controller.AddProductToShoppingCart(productID)) {
                System.out.println("Product added to Shopping Cart successfully.");
            }else {
                System.out.println("Fail adding the Product to the Shopping Cart.");
            }

            System.out.println("\n\n");
            productID= Console.readLine("Product's ID(0 to terminate operation):");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Add an Available Product to the Customer's Shopping Cart";
    }
}