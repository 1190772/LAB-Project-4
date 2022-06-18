package eapli.base.persistence.impl.inmemory;

import eapli.base.agv.domain.model.Task;
import eapli.base.agv.repositories.TaskRepository;
import eapli.base.order.domain.model.Order;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryTaskRepository extends InMemoryDomainRepository<Task, String> implements TaskRepository {

    static {
        InMemoryInitializer.init();
    }


    @Override
    public Task TaskById(String id) {
        return null;
    }

    @Override
    public Task TaskByOrder(Order id) {
        return null;
    }
}
