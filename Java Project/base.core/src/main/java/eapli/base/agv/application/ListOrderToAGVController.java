package eapli.base.agv.application;


import eapli.base.agv.domain.model.AGV;
import eapli.base.order.domain.model.Order;

public class ListOrderToAGVController {

    private Order order;
    private AGV agv;

    public ListOrderToAGVController(){

    }

    public Iterable<Order> getPreparedOrders() {
        return ListOrderToAGVService.preparedOrders();
    }

    public void findOrderById(Long id) {
        order=ListOrderToAGVService.findOrderById(id);
    }

    public void listOrderToAGV(Long id) {
        agv=ListOrderToAGVService.findAGVById(id);
    }
}