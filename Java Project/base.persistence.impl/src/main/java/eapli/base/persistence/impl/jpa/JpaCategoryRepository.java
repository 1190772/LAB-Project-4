package eapli.base.persistence.impl.jpa;

import eapli.base.domain.model.AlphaNumericCode;
import eapli.base.domain.model.Category;
import eapli.base.domain.persistence.CategoryRepository;

public class JpaCategoryRepository extends BasepaRepositoryBase<Category, AlphaNumericCode, AlphaNumericCode> implements CategoryRepository {

    public JpaCategoryRepository() {
        super("codAlfaNum");
    }
}
