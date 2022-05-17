package eapli.base.customer.domain.persistence;

import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.domain.model.VATiD;
import eapli.framework.domain.repositories.DomainRepository;

public interface CustomerRepository extends  DomainRepository<Long, Customer> {

    Iterable<Customer> findCustomerByVATiD(VATiD vatId);
}

