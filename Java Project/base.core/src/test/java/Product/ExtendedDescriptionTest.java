package Product;

import eapli.base.product.domain.model.ExtendedDescription;
import org.junit.Test;

public class ExtendedDescriptionTest {

    @Test(expected = IllegalArgumentException.class)
    public void ruleExtendedDescriptionMin() {
        ExtendedDescription extendedDescription = new ExtendedDescription("123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleExtendedDescriptionNull() {
        ExtendedDescription extendedDescription = new ExtendedDescription(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleExtendedDescriptionMax() {
        ExtendedDescription extendedDescription = new ExtendedDescription("1222222222222" +
                "211111111111111111111111111111111111111111111111111111111111111111111" +
                "21333333333333333333333333333333333333333333333333333333333333333333" +
                "2131313131313131313131313131313131313131313131313131313131313131313" +
                "1323232323232323232323232323232323232323232323232323232323232323232" +
                "1233333333333333333333333333333333333333333333333333333333333332321231");
    }
}