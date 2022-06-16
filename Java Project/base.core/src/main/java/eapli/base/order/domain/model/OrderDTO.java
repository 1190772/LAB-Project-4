package eapli.base.order.domain.model;

import eapli.base.customer.domain.model.CustomerDTO;
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

    public OrderDTO(long id, List<OrderedProductDTO> listOfOrders, double priceWithoutTaxes, double priceWithTaxes,
                    Date creationDate, String email, String address, OrderStatus orderStatus, double weight, CustomerDTO customerDTO) {
        this.id = id;
        this.listOfOrders = listOfOrders;
        this.priceWithoutTaxes = priceWithoutTaxes;
        this.priceWithTaxes = priceWithTaxes;
        this.creationDate = creationDate;
        this.email = email;
        this.address = address;
        this.orderStatus = orderStatus;
        this.weight = weight;
        this.customerDTO = customerDTO;
    }
}
