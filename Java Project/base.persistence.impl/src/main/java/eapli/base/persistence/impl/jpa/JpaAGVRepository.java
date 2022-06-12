package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.agv.domain.persistence.AGVRepository;
import eapli.base.agv.domain.model.AGV;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;

public class JpaAGVRepository extends JpaAutoTxRepository<AGV, Long, Long> implements AGVRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";


    public JpaAGVRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    public JpaAGVRepository(TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public Iterable<AGV> findAGVById(Long id){
        final TypedQuery<AGV> query = entityManager().createQuery(
                "SELECT c FROM AGV c WHERE c.agvId = :id",
                AGV.class);
        query.setParameter("id", id);

        return query.getResultList();
    }


}
