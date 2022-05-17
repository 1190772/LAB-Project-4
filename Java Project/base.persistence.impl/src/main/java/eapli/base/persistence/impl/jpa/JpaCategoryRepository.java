package eapli.base.persistence.impl.jpa;

import eapli.base.category.domain.model.AlphaNumericCode;
import eapli.base.category.domain.model.Category;
import eapli.base.category.domain.persistence.CategoryRepository;

public class JpaCategoryRepository extends BasepaRepositoryBase<Category, AlphaNumericCode, AlphaNumericCode> implements CategoryRepository {

    public JpaCategoryRepository() {
        super("codAlfaNum");
    }
}
