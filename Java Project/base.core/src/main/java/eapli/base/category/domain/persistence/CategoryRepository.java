package eapli.base.category.domain.persistence;

import eapli.base.category.domain.model.AlphaNumericCode;
import eapli.base.category.domain.model.Category;
import eapli.framework.domain.repositories.DomainRepository;

public interface CategoryRepository
        extends DomainRepository<AlphaNumericCode, Category> {
}

