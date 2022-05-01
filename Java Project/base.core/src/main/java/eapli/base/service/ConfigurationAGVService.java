package eapli.base.service;

import eapli.base.domain.model.InternalCode;
import eapli.base.domain.model.Order;
import eapli.base.domain.model.Product;
import eapli.base.domain.persistence.OrderRepository;
import eapli.base.domain.persistence.ProductRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

public class ConfigurationAGVService {


    private static final OrderRepository orderRepository = PersistenceContext.repositories().order();

    public static Order saveOrder(Order order){
        return orderRepository.save(order);
    }
}
