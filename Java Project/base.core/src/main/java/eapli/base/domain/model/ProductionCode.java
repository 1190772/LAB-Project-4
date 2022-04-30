package eapli.base.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductionCode implements ValueObject, Serializable, Comparable<ProductionCode> {

    private String productionCode;

    public ProductionCode(String productionCode) {
        Preconditions.nonNull(productionCode);
        if (!validateProductionCodeLength(productionCode))
            throw new IllegalArgumentException("invalid production code length");
        if (!validateIsAlphaNumeric(productionCode))
            throw new IllegalArgumentException("invalid production code can't contain not aphnumeric characteres");
        this.productionCode = productionCode;
    }

    protected ProductionCode() {
    }

    private static boolean validateProductionCodeLength(String productionCode) {
        return productionCode.length() > Constantes.MIN_PRODUCTIONCODE_LENGTH && productionCode.length() < Constantes.MAX_PRODUCTIONCODE_LENGTH;
    }

    public static boolean validateIsAlphaNumeric(String productionCode) {
        return Constantes.alphanumeric.matcher(productionCode).find();
    }

    public static ProductionCode productedCodedAs(String productionCode) {
        return new ProductionCode(productionCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductionCode that = (ProductionCode) o;
        return Objects.equals(productionCode, that.productionCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productionCode);
    }

    @Override
    public int compareTo(ProductionCode o) {
        return this.productionCode.compareTo(o.productionCode);
    }

    @Override
    public String toString() {
        return this.productionCode;
    }
}
