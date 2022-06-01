package eapli.base.order.application;

import eapli.base.customer.domain.model.Address;
import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.domain.model.VATiD;
import eapli.base.order.domain.model.Order;
import eapli.base.product.domain.model.InternalCode;
import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.ProductsList;
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


    public Order saveOrder(ProductsList pl, Date date, EmailAddress emailAddress, Address address, Customer customer){
        Order order=new Order(pl,date,emailAddress,address, customer);
        return CreateOrderBySalesClerkService.saveOrder(order);
    }


}