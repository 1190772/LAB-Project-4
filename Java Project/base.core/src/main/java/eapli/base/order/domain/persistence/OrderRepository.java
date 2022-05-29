package eapli.base.order.domain.persistence;

import eapli.base.order.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


    Iterable<Order> preparedOrders();

    Iterable<Order> findOrderById(Long id);

}