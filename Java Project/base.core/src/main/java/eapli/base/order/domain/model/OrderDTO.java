package eapli.base.order.domain.model;

import eapli.base.product.domain.model.OrderedProduct;
import eapli.base.product.domain.model.OrderedProductDTO;

import java.util.Date;
import java.util.List;

public class OrderDTO {

    public long id;
    public List<OrderedProductDTO> listOfOrders;
    public double priceWithoutTaxes;
    public double priceWithTaxes;
    public Date creationDate;
    public String email;
    public String address;
    public OrderStatus orderStatus;
    public double weight;
    public CustomerDTO customerDTO;
}
