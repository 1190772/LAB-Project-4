package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.domain.model.VATiD;
import eapli.base.customer.repositories.CustomerRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import org.springframework.stereotype.Component;

import javax.persistence.TypedQuery;

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

    @Override
    public Iterable<Customer> findCustomerByEmail(String email) {
        final TypedQuery<Customer> query = entityManager().createQuery(
                "SELECT c FROM Customer c WHERE c.email = :email",
                Customer.class);
        query.setParameter("email", email);
        return query.getResultList();
    }
}
