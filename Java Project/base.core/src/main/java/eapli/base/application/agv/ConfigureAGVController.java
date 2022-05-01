package eapli.base.application.agv;

import eapli.base.domain.model.*;
import eapli.base.domain.model.avg.AGV;
import eapli.base.domain.model.avg.AGVModel;
import eapli.base.domain.model.product.ShortDescription;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class ConfigureAGVController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    final ProductsList products= new ProductsList();

    public void CreateOrderBySaleClerkController() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.WAREHOUSE_EMPLOYEE);
    }



    public AGV saveAGV(ShortDescription desc, AGVModel mod, double limit){
        AGV agv=new AGV(desc,mod,limit);
        return ConfigureAGVService.saveAGV(agv);
    }


}
