package eapli.base.domain.persistence;

import eapli.base.domain.model.AlphaNumericCode;
import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.model.customer.Customer;
import eapli.base.domain.model.customer.VATiD;
import eapli.framework.domain.repositories.DomainRepository;

public interface CustomerRepository extends DomainRepository {

    Iterable<Customer> findCustomerByVATiD(VATiD vatId);
}

