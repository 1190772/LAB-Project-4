package eapli.base.persistence.impl.inmemory;

import eapli.base.category.domain.model.AlphaNumericCode;
import eapli.base.category.domain.model.Category;
import eapli.base.category.domain.persistence.CategoryRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryCategoryRepository extends InMemoryDomainRepository<Category, AlphaNumericCode> implements CategoryRepository {
    static {
        InMemoryInitializer.init();
    }
}
