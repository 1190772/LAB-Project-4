/*package eapli.base.persistence.impl.jpa;

import eapli.base.domain.model.*;
import eapli.base.domain.persistence.OrderRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public class JpaOrderRepository extends JpaAutoTxRepository{

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

    public JpaOrderRepository(String persistenceUnitName, String identityFieldName) {
        super(persistenceUnitName, identityFieldName);
    }


    @Override
    public void save() {
        return save(order);
    }
}
*/