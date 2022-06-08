package eapli.base.order.domain.persistence;

import eapli.base.customer.domain.model.Customer;
import eapli.base.order.domain.model.Order;
import eapli.framework.domain.repositories.DomainRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends DomainRepository<Long, Order> {


    Iterable<Order> readyOrders();

    Iterable<Order> preparedOrders();

    Iterable<Order> dispatchedOrders();

    Iterable<Order> findOrderById(Long id);

}