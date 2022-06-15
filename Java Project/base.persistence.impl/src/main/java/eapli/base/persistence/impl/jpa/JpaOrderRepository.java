package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.order.domain.model.Order;
import eapli.base.order.repositories.OrderRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
@Transactional
public class JpaOrderRepository extends JpaAutoTxRepository<Order, Long, Long> implements OrderRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

    @PersistenceContext
    EntityManager entityManager;

     public JpaOrderRepository(TransactionalContext autoTx) {
         super(autoTx, "id");
     }

     public JpaOrderRepository(String persistenceUnitName) {
         super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
     }


    @Override
    public Iterable<Order> readyOrders(){
        return match("e.status=1");
    }

    @Override
    public Iterable<Order> preparedOrders(){
         return match("e.status=3");
    }

    @Override
    public Iterable<Order> dispatchedOrders() {
        return match("e.status=4");
    }

    public Optional<Order> findOrderById(Long id){
        return matchOne("e.id=id");

    }


}
