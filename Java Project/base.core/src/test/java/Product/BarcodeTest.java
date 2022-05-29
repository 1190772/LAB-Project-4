package Product;

import eapli.base.product.domain.model.Barcode;
import org.junit.Test;

public class BarcodeTest {

    @Test(expected = IllegalArgumentException.class)
    public void ruleBarcodeMax() {
        Barcode barcode = new Barcode(1237890123L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleBarcodeNull() {
        Barcode barcode = new Barcode(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ruleBarcodeEmpty() {
        Barcode barcode = new Barcode(231312L);
    }

}