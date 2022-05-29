package Product;

import eapli.base.product.domain.model.Brand;
import org.junit.Test;

public class BrandTest {


    @Test(expected = IllegalArgumentException.class)
    public void ruleBrandMax() {
        Brand brand = new Brand("123456789012345678901234567dfsfd" +
                "rewewewewewewewewewewewewewewewewewewewewewewewewewewewew" +
                "rewwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwfsd");
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleBrandNull() {
        Brand brand = new Brand(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleBrandEmpty() {
        Brand brand = new Brand("");
    }
}
