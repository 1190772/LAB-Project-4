package eapli.base.product.domain.model;

public class OrderedProductDTO {

    public ProductDTO productDTO;
    public int quantity;

    public OrderedProductDTO(ProductDTO productDTO, int quantity) {
        this.productDTO = productDTO;
        this.quantity = quantity;
    }
}
