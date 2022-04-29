/*package eapli.base.service;

import eapli.base.domain.model.*;
import eapli.base.domain.persistence.OrderRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class CreateOrderBySalesClerkService {

    private static final CustomerRepository customerRepository = PersistenceContext.repositories().customer();
    private static final ProductRepository productRepository = PersistenceContext.repositories().product();
    private static final OrderRepository orderRepository = PersistenceContext.repositories().order();

    public static Customer findCustomerById(int id){
        return customerRepository.findCustomerById(id);
    }

    public static Product findProductById(int id){
        return productRepository.findProductById(id);
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

}
*/