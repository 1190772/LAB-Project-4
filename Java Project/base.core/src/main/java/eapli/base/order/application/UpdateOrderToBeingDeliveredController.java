package eapli.base.order.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.model.OrderStatus;
import eapli.base.order.repositories.OrderRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class UpdateOrderToBeingDeliveredController {
        private final OrderRepository orderRepository = PersistenceContext.repositories().order();
        private final AuthorizationService authz = AuthzRegistry.authorizationService();

        public Iterable<Order> ordersDispatched(){
            authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);
            return orderRepository.dispatchedOrders();
        }

        public void orderUpdate(Long id){
            authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.WAREHOUSE_EMPLOYEE);
            if(orderRepository.containsOfIdentity(id)){
                Order order = orderRepository.findOrderById(id).get();
                order.changeStatus(OrderStatus.BEING_DELIVERED);
                orderRepository.save(order);
            }else{
                System.out.println("Invalid ID.");
            }
        }
}

