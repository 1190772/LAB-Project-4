package eapli.base.app.backoffice.console.presentation.order;

import eapli.base.order.application.UpdateOrderToBeingDeliveredController;
import eapli.base.order.domain.model.Order;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class UpdateOrderToBeingDeliveredUI extends AbstractUI {

    private final UpdateOrderToBeingDeliveredController ctrl = new UpdateOrderToBeingDeliveredController();

    @Override
    protected boolean doShow() {

        while (true) {
            Iterable<Order> order = ctrl.ordersDispatched();
            System.out.println("Orders Dispatched:");
            for (Order o : order ) {
                System.out.println("#  Customer ID      Price               Status              Order ID");
                System.out.printf("%-20s%-20s%-20s%-4s", o.customerId(), o.price(), o.status(),
                        o.id());
            }
            String response = Console.readLine("\nDo you want to update any of these orders?\n 1 - Yes  |  2 - No\n");
            if(response.equals("1")){
                String orderID = Console.readLine("Insert the ID of the order you wish to update.");
                if(ctrl.orderUpdate(Long.getLong(orderID))) {
                    System.out.println("Order Updated successfully");
                }else
                    System.out.println("Order wasn't Updated successfully");
            }
            if(response.equals("2")){
                break;
            }
        }
        return false;
    }

    @Override
    public String headline() {
        return "Change Order to Being Delivered";
    }
}
