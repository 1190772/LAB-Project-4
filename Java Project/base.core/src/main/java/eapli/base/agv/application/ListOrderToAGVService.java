package eapli.base.agv.application;

import eapli.base.agv.repositories.AGVRepository;
import eapli.base.agv.domain.model.AGV;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.order.domain.model.Order;
import eapli.base.order.repositories.OrderRepository;

public class ListOrderToAGVService {

    private static final OrderRepository orderRepository = PersistenceContext.repositories().order();
    private static final AGVRepository agvRepository = PersistenceContext.repositories().agv();

    public static Iterable<Order> readyOrders() {
        return orderRepository.readyOrders();
    }

    public static Order findOrderById(Long id) {
        try{
        Order o= (Order) orderRepository.findOrderById(id).get();
            if(o!=null)
                return  o;
            else
                return null;
        } catch (Exception e) {
        }
        return null;
    }

    public static AGV findAGVById(Long id) {
        return (AGV) agvRepository.findAGVById(id);
    }

    public static void saveOrder(Order o) {
         orderRepository.save(o);
    }

    public static void saveAGV(AGV agv) {
        agvRepository.save(agv);
    }
}
