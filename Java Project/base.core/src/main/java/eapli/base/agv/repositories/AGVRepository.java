package eapli.base.agv.repositories;

import eapli.base.agv.domain.model.AGV;
import eapli.base.order.domain.model.Order;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface AGVRepository extends DomainRepository<Long, AGV> {

    Iterable<AGV> readyAGVs();

    Optional<AGV> findAGVById(Long id);

}
