package eapli.base.agv.application;

import eapli.base.agv.Repository.AGVRepository;
import eapli.base.agv.domain.model.AGV;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.persistence.OrderRepository;

public class ListOrderToAGVService {

    private static final OrderRepository orderRepository = PersistenceContext.repositories().order();
    private static final AGVRepository agvRepository = PersistenceContext.repositories().agv();

    public static Iterable<Order> readyOrders() {
        return orderRepository.readyOrders();
    }

    public static Order findOrderById(Long id) {
        return (Order) orderRepository.findOrderById(id);
    }

    public static AGV findAGVById(Long id) {
        return (AGV) agvRepository.findAGVById(id);
    }
}
