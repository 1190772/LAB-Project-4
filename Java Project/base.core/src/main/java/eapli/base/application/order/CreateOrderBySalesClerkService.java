package eapli.base.application.order;

import eapli.base.domain.model.*;
import eapli.base.domain.model.customer.Customer;
import eapli.base.domain.model.customer.VATiD;
import eapli.base.domain.model.product.InternalCode;
import eapli.base.domain.model.product.Product;
import eapli.base.domain.persistence.*;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class CreateOrderBySalesClerkService {

    private static final CustomerRepository customerRepository = PersistenceContext.repositories().customers();
    private static final ProductRepository productRepository = PersistenceContext.repositories().product();
    private static final OrderRepository orderRepository = PersistenceContext.repositories().order();

    public static Customer findCustomerById(VATiD id){
        return (Customer)customerRepository.findCustomerByVATiD(id);
    }

    public static Product findProductById(InternalCode id){
        return (Product)productRepository.findProductByInternalCode(id);
    }

    public static Order saveOrder(Order order){
        return orderRepository.save(order);
    }

}
