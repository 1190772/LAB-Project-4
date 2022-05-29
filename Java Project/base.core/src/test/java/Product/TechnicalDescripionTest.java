package Product;

import eapli.base.product.domain.model.TechnicalDescription;
import org.junit.Test;

public class TechnicalDescripionTest {

    @Test(expected = IllegalArgumentException.class)
    public void ruleTechnicalDescriptionEmpty() {
        TechnicalDescription technicalDescription = new TechnicalDescription("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleTechnicalDescriptionNull() {
        TechnicalDescription technicalDescription = new TechnicalDescription(null);
    }
}
