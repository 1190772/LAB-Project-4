package eapli.base.importwarehouse.application;

import eapli.base.importwarehouse.domain.WarehousePlant;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.io.IOException;

public class ImportWarehouseController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final WarehouseJsonReader jsonReader = new WarehouseJsonReader();

    public WarehousePlant jsonParser() throws IOException {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.WAREHOUSE_EMPLOYEE);
        return jsonReader.parse("C:/Users/José Silva/Desktop/lapr4_project/warehouse1.json");
    }

}
