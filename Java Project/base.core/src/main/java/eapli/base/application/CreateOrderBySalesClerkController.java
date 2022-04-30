/*package eapli.base.application;

import eapli.base.domain.model.*;
import eapli.base.service.CreateOrderBySalesClerkService;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class CreateOrderBySalesClerkController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    Customer customer;
    Product product;
    Order order;
    final ProductsList products= new ProductsList();

    public CreateOrderBySaleClerkController() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);
    }

    public Customer findCustomerById(int id){
        return CreateOrderBySalesClerkService.findCustomerById(id);
    }

    public Product findProductById(int id){
        return CreateOrderBySalesClerkService.findProductById(id);
    }

    public void AddProduct(Product prod){
        products.addProduct(prod);
    }


    public boolean SaveOrder(){
        if(CreateOrderBySalesClerkService.saveOrder(order)!=null){
            return true;
        }
        return false;
    }


}*/