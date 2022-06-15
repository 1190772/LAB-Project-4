package eapli.base.persistence.impl.inmemory;

import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.domain.model.VATiD;
import eapli.base.customer.repositories.CustomerRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryCustomerRepository extends InMemoryDomainRepository<Customer, Long> implements CustomerRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<Customer> findCustomerByVATiD(VATiD vatId) {
        return null;
    }


}
