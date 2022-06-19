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

        public boolean orderUpdate(Long id){
            if(orderRepository.containsOfIdentity(id)){
                Order order = orderRepository.findOrderById(id).get();
                order.changeStatus(OrderStatus.BEING_DELIVERED);
                try {
                    orderRepository.save(order);
                }catch(Exception e){
                    return false;
                }
                return (order.status()==OrderStatus.BEING_DELIVERED);
            }
                return false;
        }
}

