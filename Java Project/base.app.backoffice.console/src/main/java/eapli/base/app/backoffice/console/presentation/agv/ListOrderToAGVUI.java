package eapli.base.app.backoffice.console.presentation.agv;

import eapli.base.agv.application.ListOrderToAGVController;
import eapli.base.order.domain.model.Order;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.visitor.Visitor;

import java.util.Objects;


public class ListOrderToAGVUI extends AbstractListUI<Order> {

    private final ListOrderToAGVController theController = new ListOrderToAGVController();

    @Override
    protected boolean doShow() {

        System.out.println("Orders Ready to be prepared By an AGV: \n");
        for (Order o: theController.getReadyOrders()) {
            System.out.println("#  Customer ID      Price               Status              Order ID");
            System.out.printf("%-20s%-20s%-20s%-4s", o.customerId(), o.price(), o.status(),
                    o.id());
        }
        System.out.println("\n\n");
        String orderID= Console.readLine("Order's ID(0 to terminate operation):");

        while(!Objects.equals(orderID, "0")) {
            theController.findOrderById(Long.getLong(orderID));
            String agvID = Console.readLine("AGV's ID:");
            if (theController.listOrderToAGV(Long.getLong(agvID)))
                System.out.println("Order listed to AGV successfully.");
            else
                System.out.println("Unsuccessful Operation.");

            System.out.println("\n\n");
            orderID = Console.readLine("Order's ID(0 to terminate operation):");
        }
        return false;
    }

    @Override
    protected Iterable<Order> elements() {
        return null;
    }

    @Override
    protected Visitor<Order> elementPrinter() {
        return null;
    }

    @Override
    protected String elementName() {
        return null;
    }

    @Override
    protected String listHeader() {
        return String.format("#  %-20s%-20s%-30s%-4s", "Internal Code", "Brand", "Short Description", "Price");
    }

    @Override
    protected String emptyMessage() {
        return null;
    }

    @Override
    public String headline() {
        return "List a Prepared Order Delivery to an AGV";
    }
}
