package eapli.base.domain.model;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public
class AlphaNumericCode implements ValueObject, Serializable, Comparable<AlphaNumericCode>{
    private static final long serialVersionUID = 1L;

    private String codAlfaNum;

    public AlphaNumericCode(final String codAlfaNum) throws AlphaNumericCodeException {
        if(!codAlfaNum.matches("^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]+$")||StringPredicates.isNullOrEmpty(codAlfaNum)||codAlfaNum.length()>15) {
            throw new AlphaNumericCodeException("Codigo Alfa Numerico inválido");
        }
        this.codAlfaNum = codAlfaNum;
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
        return this.codAlfaNum.equals(that.codAlfaNum);
    }

    @Override
    public int hashCode() {
        return this.codAlfaNum.hashCode();
    }

    @Override
    public String toString() {
        return this.codAlfaNum;
    }

    @Override
    public int compareTo(final AlphaNumericCode arg0) {
        return codAlfaNum.compareTo(arg0.codAlfaNum);
    }

    public String codAlfaNum(){
        return this.codAlfaNum;
    }

    public void changeCodAlfaNumTo(String codAlfaNum){
        this.codAlfaNum=codAlfaNum;
    }
}
