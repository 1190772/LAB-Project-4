package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.category.domain.model.AlphaNumericCode;
import eapli.base.category.domain.model.Category;
import eapli.base.category.repositories.CategoryRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaCategoryRepository extends JpaAutoTxRepository<Category, AlphaNumericCode, AlphaNumericCode> implements CategoryRepository {

    public JpaCategoryRepository(TransactionalContext autoTx) {
        super(autoTx,"codAlfaNum");
    }

    public JpaCategoryRepository(final String puName){
        super(puName, Application.settings().getExtendedPersistenceProperties(), "id");
    }

}
