package eapli.base.persistence.impl.inmemory;

import eapli.base.domain.model.AlphaNumericCode;
import eapli.base.domain.model.Category;
import eapli.base.domain.persistence.CategoryRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryCategoryRepository extends InMemoryDomainRepository<Category, AlphaNumericCode> implements CategoryRepository {
    static {
        InMemoryInitializer.init();
    }
}
