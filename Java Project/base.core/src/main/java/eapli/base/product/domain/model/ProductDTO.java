package eapli.base.product.domain.model;

import eapli.base.category.domain.model.CategoryDTO;

public class ProductDTO {

    public double width;
    public double length;
    public double weight;
    public double height;
    public CategoryDTO category;
    public String internalCode;
    public String shortDescription;
    public String extendedDescription;
    public String technicalDescription;
    public String brand;
    public String reference;
    public String productionCode;
    public long barcode;
    public double priceWithTaxes;
    public double priceWithoutTaxes;
    public boolean productStatus;



    public ProductDTO(CategoryDTO category, String internalCode, String shortDescription, String extendedDescription, String technicalDescription, String brand, String reference, String productionCode, long barcode,
                      Double priceWithTaxes, Double priceWithoutTaxes, Double width, Double length, Double height, Double weight, boolean productStatus) {
        this.category = category;
        this.internalCode = internalCode;
        this.shortDescription = shortDescription;
        this.extendedDescription = extendedDescription;
        this.technicalDescription = technicalDescription;
        this.brand = brand;
        this.reference = reference;
        this.productionCode = productionCode;
        this.barcode = barcode;
        this.priceWithTaxes = priceWithTaxes;
        this.priceWithoutTaxes = priceWithoutTaxes;
        this.productStatus = productStatus;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.height = height;
    }
}
