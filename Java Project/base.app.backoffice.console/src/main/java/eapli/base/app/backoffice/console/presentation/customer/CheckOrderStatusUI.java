package eapli.base.app.backoffice.console.presentation.customer;

import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.domain.model.VATiD;
import eapli.base.order.application.CheckOrderStatusController;
import eapli.base.order.application.CreateOrderBySalesClerkController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class CheckOrderStatusUI extends AbstractUI {

    private final CheckOrderStatusController ctrl = new CheckOrderStatusController();
    private final CreateOrderBySalesClerkController theController = new CreateOrderBySalesClerkController();


    @Override
    protected boolean doShow() {

        final String customerId = Console.readLine("Customer ID: ");

        Customer customer = null;

        try {
            customer = theController.findCustomerById(new VATiD(customerId));
        } catch (final Exception e) {
            System.out.println("You inserted an invalid customerID.");
        }

        int response = Console.readInteger(("\nDo you wish to see the status of your orders?\n 1 - Yes  |  2 - No\n"));
        if (response == 1) {
            ctrl.checkOrderStatus();
        } else {
            System.exit(1);

        }
        return false;
    }

    @Override
    public String headline() {
        return "Check Order Status";
    }
}
