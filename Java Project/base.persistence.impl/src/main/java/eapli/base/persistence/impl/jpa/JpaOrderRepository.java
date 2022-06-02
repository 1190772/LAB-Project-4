package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.persistence.OrderRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;


import javax.persistence.TypedQuery;


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

    public Iterable<Order> findOrderById(Long id){
        final TypedQuery<Order> query = entityManager().createQuery(
                "SELECT c FROM Order c WHERE c.id = :id",
                Order.class);
        query.setParameter("id", id);

        return query.getResultList();

    }


}
