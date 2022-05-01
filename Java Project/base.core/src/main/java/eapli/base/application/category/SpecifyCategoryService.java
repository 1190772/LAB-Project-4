/*
package eapli.base.service;

import eapli.base.domain.model.*;
import eapli.base.domain.persistence.CategoryRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class SpecifyCategoryService {

    private static final CategoryRepository repository = PersistenceContext.repositories().category();

    private static AlphaNumericCode registerAlphaNumericCode (String code) throws AlphaNumericCodeException {
        return new AlphaNumericCode(code);
    }

    private static Description registerDescription(String descricao) throws DescriptionException {
        return new Description(descricao);
    }

    public static Category specifyCategoryService (final String code, final String description) throws DescriptionException, AlphaNumericCodeException {
        AlphaNumericCode cod=registerAlphaNumericCode(code);
        Description description1=registerDescription(description);
        Category category=new Category(cod,description1);
        return repository.save(category);
    }

}
*/