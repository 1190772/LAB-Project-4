/*package eapli.base.application;

import eapli.base.domain.model.*;
import eapli.base.service.CreateOrderBySalesClerkService;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.ArrayList;
import java.util.List;

public class CreateOrderBySalesClerkController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    Customer customer;
    Product product;
    Order order;
    List<Product> products;

    public CreateOrderBySaleClerkController() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);
        products=new ArrayList<>();
    }

    public Customer findCustomerById(int id){
        return CreateOrderBySalesClerkService.findCustomerById(id);
    }

    public Product findProductById(int id){
        return CreateOrderBySalesClerkService.findProductById(id);
    }

    public void AddProduct(){
        AddToProductList(product);
    }

    public void AddToProductList(Product product){
        products.add(product);
    }


    public boolean SaveOrder(){
        if(CreateOrderBySalesClerkService.saveOrder(order)!=null){
            return true;
        }
        return false;
    }


}*/