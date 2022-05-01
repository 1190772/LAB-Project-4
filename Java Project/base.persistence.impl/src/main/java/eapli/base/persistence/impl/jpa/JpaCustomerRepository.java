package eapli.base.persistence.impl.jpa;

import eapli.base.domain.model.customer.Customer;
import eapli.base.domain.model.customer.VATiD;
import eapli.base.domain.persistence.CustomerRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.general.domain.model.Designation;
import org.springframework.stereotype.Component;

import javax.persistence.TypedQuery;
import java.util.Optional;

@Component
class JpaCustomerRepository extends BasepaRepositoryBase<Customer, Designation, Designation> implements CustomerRepository {

    public JpaCustomerRepository() {
        super("vatId");
    }


    @Override
    public AggregateRoot save(AggregateRoot entity) {
        return null;
    }

    @Override
    public Optional ofIdentity(Comparable id) {
        return Optional.empty();
    }

    @Override
    public void delete(AggregateRoot entity) {

    }

    @Override
    public void deleteOfIdentity(Comparable entityId) {

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
