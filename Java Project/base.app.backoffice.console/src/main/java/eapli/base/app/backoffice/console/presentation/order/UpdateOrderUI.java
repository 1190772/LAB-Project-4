package eapli.base.app.backoffice.console.presentation.order;

import eapli.base.order.application.UpdateOrderController;
import eapli.base.order.domain.model.Order;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class UpdateOrderUI extends AbstractUI {

    private final UpdateOrderController ctrl = new UpdateOrderController();
    

    @Override
    protected boolean doShow() {
        while (true) {
            Iterable<Order> order = ctrl.ordersPrepared();
            System.out.println("Orders Prepared:");
            for (Order o : order ) {
                System.out.println("#  Customer ID      Price               Status              Order ID");
                System.out.printf("%-20s%-20s%-20s%-4s", o.customerId(), o.price(), o.status(),
                        o.id());
            }
            int response = Console.readInteger("\nDo you want to update any of these orders?\n 1 - Yes  |  2 - No\n");
            if(response == 1){
                long orderID = Console.readLong("Insert the ID of the order you wish to update.");
                ctrl.orderUpdate(orderID);
            }
            if(response == 2){
                break;
            }
        }
        return false;
    }

    @Override
    public String headline() {
        return "Change Status to Delivered";
    }
}
