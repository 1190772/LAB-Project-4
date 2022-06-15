package eapli.base.order.application;

import eapli.base.customer.domain.model.Address;
import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.domain.model.VATiD;
import eapli.base.order.domain.model.Order;
import eapli.base.product.domain.model.*;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Date;
import java.util.List;

public class CreateOrderBySalesClerkController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    Customer customer;
    Order order;
    private List<OrderedProduct> listOfOrders;

    public void CreateOrderBySaleClerkController() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.SALES_CLERK);
    }

    public Customer findCustomerById(VATiD id){
        return CreateOrderBySalesClerkService.findCustomerById(id);
    }

    public void findProductById(String id){
        InternalCode ident=new InternalCode(id);
        Product prod=CreateOrderBySalesClerkService.findProductById(ident);
        addProduct(prod);
    }

    public void addProduct(Product prod){
        listOfOrders.add(new OrderedProduct(prod));
    }


    public Order saveOrder(ProductsList pl, Date date, EmailAddress emailAddress, Address address, Customer customer){
        double pwt=0, pwot=0;
        for(OrderedProduct op : listOfOrders){
            int qnt=op.getQuantity();
            pwt+=(op.getProduct().priceWithTaxes().get().priceValue().doubleValue()*qnt);
            pwot+=(op.getProduct().priceWithoutTaxes().get().priceValue().doubleValue()*qnt);
        }
        Order order=new Order(listOfOrders,new Price(Double.valueOf(pwot)),new Price(Double.valueOf(pwt)),date,emailAddress,address, customer);
        return CreateOrderBySalesClerkService.saveOrder(order);
    }


}