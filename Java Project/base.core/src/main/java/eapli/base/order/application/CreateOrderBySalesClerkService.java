package eapli.base.order.application;

import eapli.base.customer.domain.persistence.CustomerRepository;
import eapli.base.customer.domain.model.Customer;
import eapli.base.customer.domain.model.VATiD;
import eapli.base.order.domain.model.Order;
import eapli.base.order.domain.persistence.OrderRepository;
import eapli.base.product.domain.model.InternalCode;
import eapli.base.product.domain.model.Product;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.product.domain.persistence.ProductRepository;

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
