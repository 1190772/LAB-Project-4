package eapli.base.order.application;

import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.repositories.CustomerRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.model.OrderDTO;
import eapli.base.order.repositories.OrderRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.LinkedList;
import java.util.List;

public class CheckOrderStatusController {

    private final OrderRepository orderRepository = PersistenceContext.repositories().order();
    private final CustomerRepository customerRepository = PersistenceContext.repositories().customers();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final String emailCustomer = authz.session().get().authenticatedUser().email().toString();
    private final Customer customer = (Customer) customerRepository.findCustomerByEmail(emailCustomer);

    public Iterable<OrderDTO> checkOrderStatus() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.CUSTOMER);
        Iterable<Order> order = orderRepository.findOrderByClient(customer);
        List<OrderDTO> result = new LinkedList<>();
        order.forEach(order1 -> {
            result.add(order1.toDTO());
        });
        return result;
    }

}
