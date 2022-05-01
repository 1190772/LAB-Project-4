package eapli.base.application.agv;

import eapli.base.domain.model.avg.AGV;
import eapli.base.domain.persistence.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class ConfigureAGVService {


    private static final AGVRepository agvRepository = PersistenceContext.repositories().agvs();

    public static AGV saveAGV(AGV agv){
        return agvRepository.save(agv);
    }
}
