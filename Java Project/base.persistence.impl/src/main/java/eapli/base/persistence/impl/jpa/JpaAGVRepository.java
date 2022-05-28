package eapli.base.persistence.impl.jpa;

import eapli.base.agv.domain.model.AGV;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaAGVRepository extends JpaAutoTxRepository {

    private static final String NOT_SUPPORTED = "This feature is not yet supported";

    public JpaAGVRepository(String persistenceUnitName, String identityFieldName) {
        super(persistenceUnitName, identityFieldName);
    }

    public void save(AGV agv){
        super.save(agv);
    }

}
