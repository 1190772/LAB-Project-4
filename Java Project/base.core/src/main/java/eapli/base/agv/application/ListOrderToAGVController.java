package eapli.base.agv.application;


import eapli.base.agv.domain.model.AGV;
import eapli.base.order.domain.model.Order;

public class ListOrderToAGVController {


    public ListOrderToAGVController(){

    }

    public Iterable<Order> getPreparedOrders() {
        return ListOrderToAGVService.preparedOrders();
    }

    public Order findOrderById(Long id) {
        return ListOrderToAGVService.findOrderById(id);
    }

    public AGV findAGVById(Long id) {
        return ListOrderToAGVService.findAGVById(id);
    }
}