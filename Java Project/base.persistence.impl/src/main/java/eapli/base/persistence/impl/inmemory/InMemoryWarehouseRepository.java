package eapli.base.persistence.impl.inmemory;

import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.repositories.CustomerRepository;
import eapli.base.importwarehouse.domain.WarehousePlant;
import eapli.base.importwarehouse.repositories.WarehouseRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryWarehouseRepository extends InMemoryDomainRepository<WarehousePlant, Long> implements WarehouseRepository {

    static {
        InMemoryInitializer.init();
    }
}
