package eapli.base.agv.application;


import eapli.base.agv.domain.model.AGV;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.model.OrderStatus;

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

    public boolean listOrderToAGV(Long id) {
        agv=ListOrderToAGVService.findAGVById(id);
        agv.changeOcuppied(true);
        order.changeStatus(OrderStatus.BEING_PREPARED);
        return false;
    }
}