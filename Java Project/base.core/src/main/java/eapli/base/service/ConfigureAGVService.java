package eapli.base.service;

import eapli.base.domain.model.AGV;
import eapli.base.domain.persistence.AGVRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class ConfigureAGVService {


    private static final AGVRepository agvRepository = PersistenceContext.repositories().agvs();

    public static AGV saveAGV(AGV agv){
        return agvRepository.save(agv);
    }
}
