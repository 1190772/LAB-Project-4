package eapli.base.application;

import eapli.base.domain.model.*;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.service.SpecifyCategoryService;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class SpecifyCategoryController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final CategoryRepository repository = PersistenceContext.repositories().category();


    public Category specifyCategory (final String code, final String description) throws DescriptionException, AlphaNumericCodeException {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);
        return SpecifyCategoryService.specifyCategoryService(code,description);
    }
}
