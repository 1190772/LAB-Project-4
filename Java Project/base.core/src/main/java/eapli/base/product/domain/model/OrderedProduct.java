package eapli.base.product.domain.model;


public class OrderedProduct {

    private Product product;

    private int quantity;

    public OrderedProduct(Product p){
        this.product = p;
    }

    @Override
    public String toString() {
        return "OrderedProduct{" +
                "product=" + product.identity() +
                ", quantity=" + quantity +
                '}';
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product p) {
        this.product = p;
    }

    public void incrementQuantity() {
        this.quantity++;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderedProductDTO toDTO() {
        return new OrderedProductDTO(product.toDTO(), quantity);
    }
}
