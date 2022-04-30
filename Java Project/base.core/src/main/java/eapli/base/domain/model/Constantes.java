package eapli.base.domain.model;

import java.util.regex.Pattern;

public class Constantes {
    public static final long MIN_BARCODE_LENGTH = 999999999999L;
    public static final long MAX_BARCODE_LENGTH = 10000000000000L;

    public static final int MIN_BRAND_LENGTH = 0;
    public static final int MAX_BRAND_LENGTH = 51;

    public static Pattern alphanumeric = Pattern.compile("^[a-zA-Z0-9]*$");
    public static final int MIN_REFERENCE_LENGTH = 0;
    public static final int MAX_REFERENCE_LENGTH = 24;

    public static final int MAX_TECHDESC_LENGTH = Integer.MAX_VALUE;
    public static final int MIN_TECHDESC_LENGTH = 0;
    public static final int MAX_EXTDESC_LENGTH = 101;
    public static final int MIN_EXTHDESC_LENGTH = 19;
    public static final int MAX_SHTHDESC_LENGTH = 31;
    public static final int MIN_SHTHDESC_LENGTH = 0;

    public static final int MIN_PRODUCTIONCODE_LENGTH = 0;
    public static final int MAX_PRODUCTIONCODE_LENGTH = 24;

    public static final int MIN_INTERNALCODE_LENGTH = 0;
    public static final int MAX_INTERNALCODE_LENGTH = 24;
}
