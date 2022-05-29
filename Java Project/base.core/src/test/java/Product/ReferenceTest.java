package Product;

import eapli.base.product.domain.model.Reference;
import org.junit.Test;

public class ReferenceTest {

    @Test(expected = IllegalArgumentException.class)
    public void ruleReferenceMax() {
        Reference reference = new Reference("123456789012345678901234567dfsfsdfsdfsfsdf");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleReferenceNull() {
        Reference reference = new Reference(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleReferenceEmpty() {
        Reference reference = new Reference("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleReferenceNotAlphaNumericChar() {
        Reference reference = new Reference("dfsdf.3243");
    }
}