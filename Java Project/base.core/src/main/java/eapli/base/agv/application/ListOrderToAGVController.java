package eapli.base.agv.application;


import eapli.base.agv.domain.model.AGV;
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
        double agvMaxWeight=agv.getMaxWeight().doubleValue();
        double orderWeight=order.getWeight().doubleValue();
        if ((agv==null) || (agvMaxWeight<orderWeight))
            return false;

        order.changeStatus(OrderStatus.BEING_PREPARED);
        agv.setOrderBeingPrepared(order);
        try {
            ListOrderToAGVService.saveOrder(order);
            ListOrderToAGVService.saveAGV(agv);
        }catch(Exception e){
            return false;
        }
        return ((agv.isOccupied())&&(order.status()==OrderStatus.BEING_PREPARED)&&(agv.getOrderBeingPrepared().equals(order)));
    }
}