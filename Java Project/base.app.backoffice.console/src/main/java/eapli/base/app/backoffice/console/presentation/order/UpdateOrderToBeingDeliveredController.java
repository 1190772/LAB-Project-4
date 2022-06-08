package eapli.base.app.backoffice.console.presentation.order;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.model.OrderStatus;
import eapli.base.order.domain.persistence.OrderRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class UpdateOrderToBeingDeliveredController {
        private final OrderRepository orderRepository = PersistenceContext.repositories().order();
        private final AuthorizationService authz = AuthzRegistry.authorizationService();

        public Iterable<Order> ordersPrepared(){
            authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);
            final Iterable<Order> orders = orderRepository.dispatchedOrders();
            return StreamSupport.stream(orders.spliterator(),true).collect(Collectors.toUnmodifiableList());
        }

        public void orderUpdate(Long id){
            authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.WAREHOUSE_EMPLOYEE);
            if(orderRepository.containsOfIdentity(id)){
                Order order = (Order) orderRepository.findOrderById(id);
                order.changeStatus(OrderStatus.BEING_DELIVERED);
                orderRepository.save(order);
            }else{
                System.out.println("Invalid ID.");
            }
        }
}

