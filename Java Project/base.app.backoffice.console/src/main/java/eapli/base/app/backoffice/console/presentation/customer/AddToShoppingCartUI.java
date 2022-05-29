/*package eapli.base.app.backoffice.console.presentation.customer;

import eapli.base.customer.application.AddToShoppingCartController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class AddToShoppingCartUI extends AbstractUI {


    private final AddToShoppingCartController controller=new AddToShoppingCartController();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    protected boolean doShow() {

        System.out.println("Orders Prepared for Delivery: \n");
        controller.getAvaliableProducts();

        System.out.println("\n\n");
        String productID= Console.readLine("Product's ID:");
        controller.AddProductToShoppingCart(prodcutID);


        return false;
    }

    @Override
    public String headline() {
        return "Add an Available Product to the Customer's Shopping Cart";
    }
}*/
