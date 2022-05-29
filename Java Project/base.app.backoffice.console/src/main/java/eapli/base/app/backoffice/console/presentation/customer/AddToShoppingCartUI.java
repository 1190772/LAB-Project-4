package eapli.base.app.backoffice.console.presentation.customer;

import eapli.base.customer.application.AddToShoppingCartController;
import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.ProductsList;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class AddToShoppingCartUI extends AbstractUI {


    private final AddToShoppingCartController controller=new AddToShoppingCartController();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    protected boolean doShow() {

        System.out.println("Available Products: \n");
        for(Product p:controller.getAvaliableProducts()){
            System.out.println(p.toString());
        }

        System.out.println("\n\n");
        String productID= Console.readLine("Product's ID(0 to terminate operation):");

        while(productID!="0") {
            ProductsList pl = controller.AddProductToShoppingCart(productID);
            if (!pl.productsList().isEmpty() && pl != null)
                System.out.println("Shopping Cart Content:\n\n" + pl.toString() + "\nProduct added to Shopping Cart successfully.");
            else
                System.out.println("Fail adding the Product to the Shopping Cart.");

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