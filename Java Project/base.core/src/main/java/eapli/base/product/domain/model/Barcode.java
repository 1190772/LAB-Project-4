package eapli.base.product.domain.model;

import eapli.base.Constantes;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.validations.Preconditions;

import java.util.Objects;

public class Barcode implements ValueObject, Comparable<Barcode> {

    private long barcode;

    public Barcode(Long barcode) {
        Preconditions.nonNull(barcode);
        if (!validateBarcode(barcode))
            throw new IllegalArgumentException("invalid barcode");
        this.barcode = barcode;
    }

    protected Barcode() {
    }

    public static Barcode withBarcode(Long barcode) {
        return new Barcode(barcode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barcode barcode1 = (Barcode) o;
        return barcode == barcode1.barcode;
    }

    private static boolean validateBarcode(Long barcode) {
        return barcode > Constantes.MIN_BARCODE_LENGTH  && barcode < Constantes.MAX_BARCODE_LENGTH ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcode);
    }

    @Override
    public int compareTo(Barcode o) {
        return 0;
    }

    @Override
    public String toString() {
        return Long.toString(this.barcode);
    }
}
