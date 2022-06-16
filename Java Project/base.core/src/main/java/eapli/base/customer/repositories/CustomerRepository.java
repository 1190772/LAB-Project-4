package eapli.base.customer.repositories;

import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.domain.model.Email;
import eapli.base.customer.domain.model.VATiD;
import eapli.framework.domain.repositories.DomainRepository;

public interface CustomerRepository extends  DomainRepository<Long, Customer> {

    Iterable<Customer> findCustomerByVATiD(VATiD vatId);
    Iterable<Customer> findCustomerByEmail(String email);
}

