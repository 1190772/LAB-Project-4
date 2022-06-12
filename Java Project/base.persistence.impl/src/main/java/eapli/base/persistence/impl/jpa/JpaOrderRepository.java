package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.persistence.OrderRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;


import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class JpaOrderRepository extends JpaAutoTxRepository<Order, Long, Long> implements OrderRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

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
        final Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return matchOne("e.id=:id", params);

    }


}
