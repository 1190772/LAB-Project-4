package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.agv.repositories.AGVRepository;
import eapli.base.agv.domain.model.AGV;
import eapli.base.order.domain.model.Order;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.Map;
import java.util.Optional;

public class JpaAGVRepository extends JpaAutoTxRepository<AGV, Long, Long> implements AGVRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";


    public JpaAGVRepository(TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaAGVRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaAGVRepository(String persistenceUnitName, Map properties, String identityFieldName) {
        super(persistenceUnitName, properties, identityFieldName);
    }
    @Override
    public Iterable<AGV> readyAGVs(){
        return match("e.status=0");
    }

    @Override
    public Optional<AGV> findAGVById(Long id){

        return matchOne("e.id=id");
    }


}
