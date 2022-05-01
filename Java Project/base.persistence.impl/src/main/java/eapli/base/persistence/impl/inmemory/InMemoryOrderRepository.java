package eapli.base.persistence.impl.inmemory;


import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryOrderRepository extends InMemoryDomainRepository{

    static {
        InMemoryInitializer.init();
    }

    private static final String NOT_SUPPORTED = "This feature is not yet supported";



    @Override
    public AggregateRoot save(AggregateRoot entity) {
        return save(entity);
    }

    @Override
    public void delete(AggregateRoot entity) {

    }
}