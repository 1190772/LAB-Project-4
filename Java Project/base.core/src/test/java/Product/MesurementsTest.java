package Product;

import eapli.base.product.domain.model.Mesurements;
import org.junit.Test;

public class MesurementsTest {

    @Test(expected = IllegalArgumentException.class)
    public void ruleBrandNotNegative() {
        Mesurements mesurements = new Mesurements(-1.0,-0.2,-0.3,-45.3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleBrandNull() {
        Mesurements mesurements  = new Mesurements(null,null,null,null);
    }

}