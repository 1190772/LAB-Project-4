package Product;

import eapli.base.product.domain.model.InternalCode;
import org.junit.Test;

public class InternalCodeTest {

    @Test(expected = IllegalArgumentException.class)
    public void ruleInternalCodeMax() {
        InternalCode internalCode = new InternalCode("123456789012345678901234567dfsfsdfsdfsfsdf");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleInternalCodeNull() {
        InternalCode internalCode = new InternalCode(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleInternalCodeEmpty() {
        InternalCode internalCode = new InternalCode("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleInternalCodeNotAlphaNumericChar() {
        InternalCode internalCode = new InternalCode("dfsdf.3243");
    }

}