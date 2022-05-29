package eapli.base.order.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.model.OrderStatus;
import eapli.base.order.domain.persistence.OrderRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class UpdateOrderController {
    private final OrderRepository orderRepository = PersistenceContext.repositories().order();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    public Iterable<Order> ordersPrepared(){
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.WAREHOUSE_EMPLOYEE);
        final Iterable<Order> orders = orderRepository.readyOrders();
        return StreamSupport.stream(orders.spliterator(),true).collect(Collectors.toUnmodifiableList());
    }

    public void changeOrderToDispatched (Long id){
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.WAREHOUSE_EMPLOYEE);
        Order order = (Order) orderRepository.findOrderById(id);
        if(order != null){
            order.changeStatus(OrderStatus.DELIVERED);
            orderRepository.save(order);

        }else{
            System.out.println("Invalid ID.");
        }
    }
}
