package Product;

import eapli.base.product.domain.model.ProductionCode;
import org.junit.Test;

public class ProductionCodeTest {

    @Test(expected = IllegalArgumentException.class)
    public void ruleReferenceMax() {
        ProductionCode productionCode = new ProductionCode("123456789012345678901234567dfsfsdfsdfsfsdf");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleReferenceNull() {
        ProductionCode productionCode = new ProductionCode(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleReferenceEmpty() {
        ProductionCode productionCode = new ProductionCode("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleReferenceNotAlphaNumericChar() {
        ProductionCode productionCode = new ProductionCode("dfsdf.3243");
    }
}