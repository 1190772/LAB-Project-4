package eapli.base.agv.repositories;

import eapli.base.agv.domain.model.Info;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;
import java.util.Optional;

public interface InfoRepository extends DomainRepository<Integer, Info> {
    Optional<Info> ofIdentity(final Integer id);
}
