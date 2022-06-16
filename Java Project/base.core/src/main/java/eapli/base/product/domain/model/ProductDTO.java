package eapli.base.product.domain.model;

import eapli.base.category.domain.model.CategoryDTO;

public class ProductDTO {

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
    public double mesurements;
    public boolean productStatus;

    public ProductDTO(CategoryDTO category, String internalCode, String shortDescription, String extendedDescription, String technicalDescription, String brand, String reference,
                      String productionCode, long barcode, double priceWithTaxes, double priceWithoutTaxes, double mesurements, boolean productStatus) {
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
        this.mesurements = mesurements;
        this.productStatus = productStatus;
    }
}
