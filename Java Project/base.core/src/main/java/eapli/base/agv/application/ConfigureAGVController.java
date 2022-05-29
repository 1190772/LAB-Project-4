package eapli.base.agv.application;

import eapli.base.agv.domain.model.AGV;
import eapli.base.agv.domain.model.AGVModel;
import eapli.base.product.domain.model.ProductsList;
import eapli.base.product.domain.model.ShortDescription;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class ConfigureAGVController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    final ProductsList products= new ProductsList();

    public ConfigureAGVController() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.WAREHOUSE_EMPLOYEE);
    }



    public AGV saveAGV(ShortDescription desc, AGVModel mod, double limit){
        AGV agv=new AGV(desc,mod,limit);
        return ConfigureAGVService.saveAGV(agv);
    }


}
