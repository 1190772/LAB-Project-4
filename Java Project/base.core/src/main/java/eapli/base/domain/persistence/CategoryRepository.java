package eapli.base.domain.persistence;

import eapli.base.domain.model.AlphaNumericCode;
import eapli.base.domain.model.Category;
import eapli.framework.domain.repositories.DomainRepository;

public interface CategoryRepository
        extends DomainRepository<AlphaNumericCode, Category> {
}

