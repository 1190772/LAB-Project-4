package eapli.base.agv.application;

import eapli.base.agv.Repository.AGVRepository;
import eapli.base.agv.domain.AGV;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class ConfigureAGVService {


    private static final AGVRepository agvRepository = PersistenceContext.repositories().agvs();

    public static AGV saveAGV(AGV agv){
        return agvRepository.save(agv);
    }
}
