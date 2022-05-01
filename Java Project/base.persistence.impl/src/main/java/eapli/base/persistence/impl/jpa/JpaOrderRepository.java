package eapli.base.persistence.impl.jpa;

import eapli.base.domain.model.Order;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

 public class JpaOrderRepository extends JpaAutoTxRepository{

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

    public JpaOrderRepository(String persistenceUnitName, String identityFieldName) {
        super(persistenceUnitName, identityFieldName);
    }

    public void save(Order order){
        super.save(order);
    }

}
