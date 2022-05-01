package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.domain.model.customer.Customer;
import eapli.base.domain.model.customer.VATiD;
import eapli.base.domain.persistence.CustomerRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.general.domain.model.Designation;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import org.springframework.stereotype.Component;

import javax.persistence.TypedQuery;
import java.util.Optional;

@Component
class JpaCustomerRepository extends JpaAutoTxRepository<Customer, Long, Long> implements CustomerRepository {


    public JpaCustomerRepository(final TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaCustomerRepository(final String puName){
        super(puName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    @Override
    public Iterable<Customer> findCustomerByVATiD(VATiD vatId) {
        final TypedQuery<Customer> query = entityManager().createQuery(
                "SELECT c FROM Customer c WHERE c.vatId = :vatId",
                Customer.class);
        query.setParameter("vatId", vatId);

        return query.getResultList();
    }
}