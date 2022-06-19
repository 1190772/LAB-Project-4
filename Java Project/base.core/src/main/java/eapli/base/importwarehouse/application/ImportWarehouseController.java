package eapli.base.importwarehouse.application;

import eapli.base.importwarehouse.domain.WarehousePlant;
import eapli.base.importwarehouse.repositories.WarehouseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.io.IOException;

public class ImportWarehouseController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final WarehouseJsonReader jsonReader = new WarehouseJsonReader();
    private final WarehouseRepository repository = PersistenceContext.repositories().warehouse();


    public WarehousePlant jsonParser() throws IOException {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.WAREHOUSE_EMPLOYEE);
        repository.save(jsonReader.parse("C:\\Users\\Nandinho\\Desktop\\projeto_lapr4\\Java Project\\warehouse1.json"));
        return jsonReader.parse("C:\\Users\\Nandinho\\Desktop\\projeto_lapr4\\Java Project\\warehouse1.json");
    }

}
