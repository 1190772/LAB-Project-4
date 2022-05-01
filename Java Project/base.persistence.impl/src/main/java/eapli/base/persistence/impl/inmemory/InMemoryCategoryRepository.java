package eapli.base.persistence.impl.inmemory;

import eapli.base.domain.model.category.AlphaNumericCode;
import eapli.base.domain.model.category.Category;
import eapli.base.domain.persistence.CategoryRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryCategoryRepository extends InMemoryDomainRepository<Category, AlphaNumericCode> implements CategoryRepository {
    static {
        InMemoryInitializer.init();
    }
}
