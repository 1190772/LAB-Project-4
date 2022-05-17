package eapli.base.agv.domain.persistence;

import eapli.base.agv.domain.model.AGV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AGVRepository extends JpaRepository<AGV, Long> {


}