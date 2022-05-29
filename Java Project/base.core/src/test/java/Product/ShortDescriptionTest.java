package Product;

import eapli.base.product.domain.model.ShortDescription;
import org.junit.Test;

public class ShortDescriptionTest {

    @Test(expected = IllegalArgumentException.class)
    public void ruleShortDescriptionMax() {
        ShortDescription shortDescription = new ShortDescription("123456789012345678901234567xcsdafdsfsdffsdfdsfsd");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleShortDescriptionNull() {
        ShortDescription shortDescription = new ShortDescription(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleShortDescriptionEmpty() {
        ShortDescription shortDescription = new ShortDescription("");
    }
}
