package eapli.base.agv.domain.persistence;

import eapli.base.agv.domain.model.AGV;
import eapli.framework.domain.repositories.DomainRepository;

public interface AGVRepository extends DomainRepository<Long, AGV> {

    Iterable<AGV> findAGVById(Long id);

}
