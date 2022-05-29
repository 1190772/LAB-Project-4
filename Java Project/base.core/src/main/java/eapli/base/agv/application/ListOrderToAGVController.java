package eapli.base.agv.application;


import eapli.base.agv.domain.model.AGV;
import eapli.base.agv.domain.model.AGVStatus;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.model.OrderStatus;

public class ListOrderToAGVController {

    private Order order;
    private AGV agv;

    public ListOrderToAGVController(){

    }

    public Iterable<Order> getReadyOrders() {
        return ListOrderToAGVService.readyOrders();
    }

    public void findOrderById(Long id) {
        order=ListOrderToAGVService.findOrderById(id);
    }

    public boolean listOrderToAGV(Long id) {
        agv=ListOrderToAGVService.findAGVById(id);
        order.changeStatus(OrderStatus.BEING_PREPARED);
        agv.setOrderBeingPrepared(order);
        return (agv.isOccupied() && agv!=null && order!=null);
    }
}