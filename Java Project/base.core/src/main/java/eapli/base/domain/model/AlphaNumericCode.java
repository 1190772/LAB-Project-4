package eapli.base.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public
class AlphaNumericCode implements ValueObject, Serializable, Comparable<AlphaNumericCode>{
    private static final long serialVersionUID = 1L;

    private String code;

    public AlphaNumericCode(final String code) throws AlphaNumericCodeException {
        if(!code.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$")||StringPredicates.isNullOrEmpty(code)||code.length()>15) {
            throw new AlphaNumericCodeException("Codigo Alfa Numerico inválido");
        }
        this.code = code;
    }

    protected AlphaNumericCode() {
        // for ORM
    }

    public static AlphaNumericCode valueOf(final String codAlfaNum) throws AlphaNumericCodeException {
        return new AlphaNumericCode(codAlfaNum);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AlphaNumericCode)) {
            return false;
        }

        final AlphaNumericCode that = (AlphaNumericCode) o;
        return this.code.equals(that.code);
    }

    @Override
    public int hashCode() {
        return this.code.hashCode();
    }

    @Override
    public String toString() {
        return this.code;
    }

    @Override
    public int compareTo(final AlphaNumericCode arg0) {
        return code.compareTo(arg0.code);
    }

    public String codAlfaNum(){
        return this.code;
    }

    public void changeCodAlfaNumTo(String codAlfaNum){
        this.code =codAlfaNum;
    }
}
