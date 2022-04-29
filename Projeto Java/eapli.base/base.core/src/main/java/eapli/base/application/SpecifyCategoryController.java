package eapli.base.application;

import eapli.base.domain.model.*;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class SpecifyCategoryController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final CategoryRepository repository = PersistenceContext.repositories().category();

    public AlphaNumericCode registerAlphaNumericCode (String code) throws AlphaNumericCodeException {
        return new AlphaNumericCode(code);
    }

    public Description registerDescription(String descricao) throws DescriptionException {
        return new Description(descricao);
    }

    public Category specifyCategory (final String code, final String description) throws DescriptionException, AlphaNumericCodeException {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);
        AlphaNumericCode cod=registerAlphaNumericCode(code);
        Description description1=registerDescription(description);
        Category category=new Category(cod,description1);
        return this.repository.save(category);
    }
}
