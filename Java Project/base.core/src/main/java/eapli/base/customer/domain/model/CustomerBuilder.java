package eapli.base.customer.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.framework.domain.model.DomainFactory;

import javax.xml.bind.annotation.XmlElement;

public class CustomerBuilder implements DomainFactory<Customer> {

    private Customer customer;

    @XmlElement
    @JsonProperty
    private Name name;

    @XmlElement
    @JsonProperty
    private VATiD vatId;

    @XmlElement
    @JsonProperty
    private Birthdate birthdate;

    @XmlElement
    @JsonProperty
    private PhoneNumber phoneNumber;

    @XmlElement
    @JsonProperty
    private Email email;

    @XmlElement
    @JsonProperty
    private Address address;

    @XmlElement
    @JsonProperty
    private Gender gender;


    public CustomerBuilder nameIs(final Name name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder vatIdIs(final VATiD vatId) {
        this.vatId = vatId;
        return this;
    }


    public CustomerBuilder birthdateIs(final Birthdate birthdate) {
        buildOrThrow();
        this.birthdate = birthdate;
        return this;
    }


    public CustomerBuilder phoneNumberIs(final PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }


    public CustomerBuilder emailIs(final Email email) {
        this.email = email;
        return this;

    }

    public CustomerBuilder addressIs(final Address address) {
        this.address = address;
        return this;

    }

    public CustomerBuilder genderIs(final Gender gender) {
        buildOrThrow();
        this.gender = gender;
        return this;

    }



    private Customer buildOrThrow() {
        if (customer != null) {
            return customer;
        } else if (name != null && vatId != null && phoneNumber != null && email != null && address != null) {
            customer = new Customer(name, vatId, birthdate, phoneNumber, email, address, gender);
            return customer;
        } else {
            throw new IllegalStateException();
        }
    }


    @Override
    public Customer build() {
        final Customer ret = buildOrThrow();
        customer = null;
        return ret;
    }
}
