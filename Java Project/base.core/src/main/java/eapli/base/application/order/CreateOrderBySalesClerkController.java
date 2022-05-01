package eapli.base.application.order;

import eapli.base.domain.model.*;
import eapli.base.domain.model.customer.Address;
import eapli.base.domain.model.customer.Customer;
import eapli.base.domain.model.customer.VATiD;
import eapli.base.service.CreateOrderBySalesClerkService;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Date;

public class CreateOrderBySalesClerkController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    Customer customer;
    Product product;
    Order order;
    final ProductsList products= new ProductsList();

    public void CreateOrderBySaleClerkController() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);
    }

    public Customer findCustomerById(VATiD id){
        return CreateOrderBySalesClerkService.findCustomerById(id);
    }

    public Product findProductById(InternalCode id){
        return CreateOrderBySalesClerkService.findProductById(id);
    }

    public void addProduct(Product prod){
        products.addProduct(prod);
    }


    public Order saveOrder(ProductsList pl, Date date, EmailAddress emailAddress, Address address){
        Order order=new Order(pl,date,emailAddress,address);
        return CreateOrderBySalesClerkService.saveOrder(order);
    }


}