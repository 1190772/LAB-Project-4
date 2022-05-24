package eapli.base.customer.application;


import eapli.base.customer.domain.model.Customer;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.product.domain.model.InternalCode;
import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.ProductsList;
import eapli.base.product.domain.persistence.ProductRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;

import javax.transaction.Transactional;


public class AddToShoppingCartController {
    private AuthorizationService authorizationService;
    private final ProductRepository productRepository = PersistenceContext.repositories().products();
    private Customer cust;


    public AddToShoppingCartController(Customer c){
        this.cust=c;
    }

    public ProductsList getAvaliableProducts(){
        ProductsList pl = new ProductsList();
        for(Product prod : productRepository.availableProducts()){
            pl.addProduct(prod);
        }
        return pl;
    }


    public ProductsList AddProductToShoppingCart(String id){
        ProductsList pl = new ProductsList();
        InternalCode ic=new InternalCode(id);
        cust.getShoppingCart().addProduct((Product)productRepository.findProductByInternalCode(ic));
        for(Product prod : productRepository.availableProducts()){
            pl.addProduct(prod);
        }
        return pl;
    }
}