package eapli.base.order.repositories;

import eapli.base.order.domain.model.Order;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface OrderRepository extends DomainRepository<Long, Order> {


    Iterable<Order> readyOrders();

    Iterable<Order> preparedOrders();

    Iterable<Order> dispatchedOrders();

    Optional<Order> findOrderById(Long id);

}