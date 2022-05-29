package eapli.base.app.backoffice.console.presentation.agv;

import eapli.base.agv.application.ListOrderToAGVController;
import eapli.base.order.domain.model.Order;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class ListOrderToAGVUI extends AbstractUI {

    private final ListOrderToAGVController theController = new ListOrderToAGVController();

    @Override
    protected boolean doShow() {

        System.out.println("Orders Prepared for Delivery: \n");
        for (Order o: theController.getPreparedOrders()) {
            System.out.println(o.toString());
        }
        System.out.println("\n\n");
        String orderID= Console.readLine("Order's ID:");
        theController.findOrderById(Long.getLong(orderID));
        String agvID= Console.readLine("AGV's ID:");
        if(theController.listOrderToAGV(Long.getLong(agvID))){
            System.out.println("Operação Finalizada com sucesso.");
        }else{
            System.out.println("Operação Finalizada sem sucesso.");
        }


        return false;
    }

    @Override
    public String headline() {
        return "List a Prepared Order Delivery to an AGV";
    }
}
