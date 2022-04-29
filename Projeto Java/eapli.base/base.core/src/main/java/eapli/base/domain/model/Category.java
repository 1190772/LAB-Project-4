package eapli.base.domain.model;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.DomainEntity;

public class Category implements AggregateRoot<AlphaNumericCode> {

    private AlphaNumericCode code;
    private Description description;

    public Category() {

    }

    public Category(final AlphaNumericCode code, final Description description) {
        if (code == null) {
            throw new IllegalArgumentException();
        }
        this.code = code;

        if (description == null) {
            throw new IllegalArgumentException();
        }
        this.description = description;


    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual((DomainEntity<?>) this, o);
    }

    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public int compareTo(AlphaNumericCode other) {
        return AggregateRoot.super.compareTo(other);
    }

    @Override
    public String toString() {
        return String.format("AlphaNumeric Code: %s - Description: %s ", this.code, this.description);
    }

    public AlphaNumericCode codigoAlfaNumerico() {
        return identity();
    }

    public AlphaNumericCode identity() {
        return this.code;
    }

    @Override
    public boolean hasIdentity(AlphaNumericCode id) {
        return AggregateRoot.super.hasIdentity(id);
    }

    /*

    public CategoryDTO toDTO() {
        return new CategoryDTO(this.code.toString(),
                this.description.toString());
    }
    */


    public Description description() {
        return this.description;
    }

    public void changeCodTo(AlphaNumericCode cod) {
        this.code = cod;
    }

    public void changeDescriptionTo(Description descricao) {
        this.description = descricao;
    }
}

