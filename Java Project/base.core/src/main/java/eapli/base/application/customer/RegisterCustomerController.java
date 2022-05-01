package eapli.base.application.customer;

import eapli.base.domain.model.*;
import eapli.base.domain.model.customer.*;
import eapli.base.domain.persistence.CategoryRepository;
import eapli.base.domain.persistence.CustomerRepository;
import eapli.base.domain.persistence.ProductRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.util.Set;

public class RegisterCustomerController {
    private AuthorizationService authorizationService;
    private final CustomerRepository customerRepository = PersistenceContext.repositories().customers();

    /**
     * This method registers a new Customer in the database
     *
     * @return the instance saved in the database
     */

    @Transactional
    public Customer registerCustomer(String name, String vatId, String birthdate, String phoneNumber, String email, String district, String county, String street, String door , String gender) throws NameException, ParseException, PhoneNumberException, EmailException {

        final Customer newCustomer = new CustomerBuilder()
                .nameIs(Name.nameAs(name))
                .vatIdIs(VATiD.vatIdAs(vatId))
                .birthdateIs(Birthdate.birthdateAs(birthdate))
                .phoneNumberIs(PhoneNumber.phoneNumberAs(phoneNumber))
                .emailIs(Email.emailAs(email))
                .addressIs(Address.addressAs(district, county, street, door))
                .genderIs(Gender.genderAs(gender))
                .build();
        return (Customer) customerRepository.save(newCustomer);
    }


}
