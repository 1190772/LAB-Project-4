package eapli.base.app.backoffice.console.presentation.order;


import eapli.base.domain.model.InternalCode;
import eapli.base.domain.model.Product;
import eapli.base.domain.model.ProductsList;
import eapli.base.domain.model.customer.Customer;
import eapli.base.domain.model.customer.VATiD;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.base.application.order.*;
import org.springframework.security.core.userdetails.User;

import java.util.Calendar;
import java.util.Date;


public class CreateOrderBySalesClerkUI extends AbstractUI {


    private final CreateOrderBySalesClerkController theController=new CreateOrderBySalesClerkController();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    protected boolean doShow() {

        final String customerId = Console.readLine("Customer ID: ");

        ProductsList pl = new ProductsList();

        Customer customer;

        Product product;

        try {
            customer = theController.findCustomerById(new VATiD(customerId));
        } catch (final Exception e) {
            System.out.println("You inserted an invalid customerID.");
        }

        String productId = Console.readLine("Product ID('end' to stop adding products): ");


        while (!productId.equals("end")) {
            try {
                product = theController.findProductById(new InternalCode(productId));
                theController.addProduct(product);
                productId = Console.readLine("Product ID('end' to stop adding products): ");
            } catch (final Exception e) {
                System.out.println("You inserted an invalid customerID.");
            }
        }

        Date date = Calendar.getInstance().getTime();
        if (theController.saveOrder(pl, date,authz.session().get().authenticatedUser().email())){
            System.out.println("Order Registration managed successfully");
        }else{
            System.out.println("Order Registration wasn't managed successfully");
        }

        return false;
    }


    @Override
    public String headline() {
        return "Register Order";
    }
}