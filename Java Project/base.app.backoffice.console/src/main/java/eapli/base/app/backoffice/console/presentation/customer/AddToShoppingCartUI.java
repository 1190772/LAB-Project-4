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

        controller.getAvaliableProducts();

        controller.



        final String producId = Console.readLine("Customer ID: ");
        return false;
    }

    @Override
    public String headline() {
        return "Add To Shopping Cart ";
    }
}*/
