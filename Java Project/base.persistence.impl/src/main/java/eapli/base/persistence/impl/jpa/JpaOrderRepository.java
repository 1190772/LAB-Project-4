package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.customer.domain.model.Customer;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.persistence.OrderRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaOrderRepository extends JpaAutoTxRepository<Order, Long, Long> implements OrderRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

     public JpaOrderRepository(TransactionalContext autoTx) {
         super(autoTx, "id");
     }

     public JpaOrderRepository(String persistenceUnitName) {
         super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
     }


    @Override
    public Iterable<Order> readyOrders() {
        return null;
    }

    @Override
    public Iterable<Order> findOrderById(Long id) {
        return null;
    }
}
