package eapli.base.persistence.impl.inmemory;

import eapli.base.domain.model.customer.Customer;
import eapli.base.domain.model.customer.VATiD;
import eapli.base.domain.persistence.CustomerRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryCustomerRepository extends InMemoryDomainRepository implements CustomerRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<Customer> findCustomerByVATiD(VATiD vatId) {
        return null;
    }


    @Override
    public AggregateRoot save(AggregateRoot entity) {
        return null;
    }

    @Override
    public void delete(AggregateRoot entity) {
    }
}
