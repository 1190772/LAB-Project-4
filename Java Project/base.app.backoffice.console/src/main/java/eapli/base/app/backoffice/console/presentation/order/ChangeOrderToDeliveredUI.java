package eapli.base.app.backoffice.console.presentation.order;

import eapli.base.order.application.ChangeOrderToDeliveredController;
import eapli.base.order.domain.model.Order;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class ChangeOrderToDeliveredUI extends AbstractUI {

    private final ChangeOrderToDeliveredController ctrl = new ChangeOrderToDeliveredController();
    

    @Override
    protected boolean doShow() {
        while (true) {
            Iterable<eapli.base.order.domain.model.Order> order = ctrl.ordersPrepared();
            System.out.println("Orders Prepared:");
            for (Order order1 : order ) {
                System.out.println(order1);
            }
            int response = Console.readInteger("Do you want to update any of these orders?\n 1 - Yes  |  2 - No\n");
            if(response == 1){
                long orderID = Console.readLong("Insert the ID of the order you wish to update.");
                ctrl.changeOrderToDispatched(orderID);
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
