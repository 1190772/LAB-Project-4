package eapli.base.agv.repositories;

import eapli.base.agv.domain.model.Task;
import eapli.base.order.domain.model.Order;
import eapli.framework.domain.repositories.DomainRepository;

public interface TaskRepository extends DomainRepository<String, Task> {

    Task TaskById(String id);

    Task TaskByOrder(Order id);
}
