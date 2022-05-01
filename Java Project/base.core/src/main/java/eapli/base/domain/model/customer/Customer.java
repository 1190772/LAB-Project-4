package eapli.base.domain.model.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import eapli.base.domain.model.Barcode;
import eapli.base.domain.model.InternalCode;
import eapli.base.domain.model.Product;
import eapli.base.domain.model.TechnicalDescription;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.validations.Preconditions;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Optional;

@XmlRootElement
@Entity
public class Customer implements AggregateRoot<VATiD>, Comparable<VATiD> {

    private static final long serialVersionUID = 1L;

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

    @OneToOne
    private Customer customer;


    public Customer(final Name name, VATiD vatId, Birthdate birthdate, PhoneNumber phoneNumber, Email email, Address address, Gender gender) {

        Preconditions.noneNull(name, vatId, phoneNumber, email, address);
        this.name = name;
        this.vatId = vatId;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }

    protected Customer() {
        // for ORM only
    }

    public Name getname() {
        return name;
    }

    public VATiD getvatId() {
        return vatId;
    }

    public PhoneNumber getphoneNumber() {
        return phoneNumber;
    }

    public Email getemail() {
        return email;
    }

    public Address getaddress() {
        return address;
    }

    public void newPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address address() {
        return this.address;
    }


    public String name() {
        return this.name.toString();
    }





    /**
     * @return the Birthdate of this Customer
     */
    public Optional<Birthdate> birthdate() {
        return Optional.ofNullable(birthdate);
    }

    /**
     * @return the Gender of this Customer
     */
    public Optional<Gender> gender() {
        return Optional.ofNullable(gender);
    }






    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }




    @Override
    public boolean sameAs(final Object other) {
        if (!(other instanceof Customer)) {
            return false;
        }

        final Customer that = (Customer) other;
        if (this == that) {
            return true;
        }

        return identity().equals(that.identity());
    }


    @Override
    public String toString() {
        return String.format("Name: %s - Email: %s - Phone Number: %s - VAT id: %s - Address: %s - ",
                this.name, this.email, this.phoneNumber, this.vatId, this.address);
    }

    /**
     * Changes the name info of the customer.
     *
     * @param name The new Name.
     */
    public void changeNameTo(final Name name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    /**
     * Changes the vatId info of the customer.
     *
     * @param vatId The new VATiD.
     */
    public void changeVATiDTo(final VATiD vatId) {
        if (vatId == null) {
            throw new IllegalArgumentException();
        }
        this.vatId = vatId;
    }

    /**
     * Changes the phoneNumber info of the customer.
     *
     * @param phoneNumber The new PhoneNumber.
     */
    public void changePhoneNumberTo(final PhoneNumber phoneNumber) {
        if (phoneNumber == null) {
            throw new IllegalArgumentException();
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * Changes the email info of the customer.
     *
     * @param email The new Email.
     */
    public void changeEmailTo(final Email email) {
        if (email == null) {
            throw new IllegalArgumentException();
        }
        this.email = email;
    }

    /**
     * Changes the address info of the customer.
     *
     * @param address The new Address.
     */
    public void changeAddressTo(final Address address) {
        if (address == null) {
            throw new IllegalArgumentException();
        }
        this.address = address;
    }

    @Override
    public VATiD identity() {
        return vatId;
    }
}

