package eapli.base.order.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.order.domain.model.Order;
import eapli.base.order.repositories.OrderRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.List;

public class CheckOrderStatusController {

    private final OrderRepository orderRepository = PersistenceContext.repositories().order();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    public List<Order> checkOrderStatus(long id){
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.CUSTOMER);
        while(orderRepository.containsOfIdentity(id)){
            System.out.println(orderRepository);
        }

    }


}
