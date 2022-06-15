package eapli.base.agv.application;


import eapli.base.agv.domain.model.AGV;
import eapli.base.agv.domain.model.AGVStatus;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.model.OrderStatus;

public class ListOrderToAGVController {

    private Order order;
    private AGV agv;

    public ListOrderToAGVController() {

    }

    public Iterable<Order> getReadyOrders() {
        return ListOrderToAGVService.readyOrders();
    }

    public Iterable<AGV> getCapableAGVs(){
        return ListOrderToAGVService.capableAGVs();
    }

    public boolean findOrderById(Long id) {
        order=ListOrderToAGVService.findOrderById(id);
        if(order==null)
            return false;

        return true;
    }

    public boolean listOrderToAGV(Long id) {
        agv=ListOrderToAGVService.findAGVById(id);
        if ((agv==null)||(agv.getMaxWeight().doubleValue()<order.getWeight().doubleValue()))
            return false;

        order.changeStatus(OrderStatus.BEING_PREPARED);
        agv.setOrderBeingPrepared(order);
        ListOrderToAGVService.saveOrder(order);
        ListOrderToAGVService.saveAGV(agv);
        return agv.isOccupied();
    }
}