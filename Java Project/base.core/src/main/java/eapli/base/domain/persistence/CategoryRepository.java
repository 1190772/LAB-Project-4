package eapli.base.domain.persistence;

import eapli.base.domain.model.category.AlphaNumericCode;
import eapli.base.domain.model.category.Category;
import eapli.framework.domain.repositories.DomainRepository;

public interface CategoryRepository
        extends DomainRepository<AlphaNumericCode, Category> {
}

