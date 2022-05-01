package eapli.base.app.backoffice.console.presentation.customer;

import eapli.base.application.customer.RegisterCustomerController;
import eapli.base.domain.model.customer.EmailException;
import eapli.base.domain.model.customer.NameException;
import eapli.base.domain.model.customer.PhoneNumberException;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;

public class RegisterCustomerUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(RegisterCustomerUI.class);

    @Autowired
    private RegisterCustomerController controller;

    @Override
    protected boolean doShow() {


        final String name = Console.readLine("Name: ");

        final String vatId = Console.readLine("VAT Id: ");

        final String birthdate = Console.readLine("Birthdate: ");

        final String phoneNumber = Console.readLine("Phone number: ");

        final String email = Console.readLine("Email: ");

        final String district = Console.readLine("District: ");
        final String county = Console.readLine("County: ");
        final String street = Console.readLine("Street: ");
        final String door = Console.readLine("Door: ");

        final String gender = Console.readLine("Gender: ");


        try {
            controller.registerCustomer(name, vatId, birthdate, phoneNumber, email, district, county, street, door, gender);
        } catch (final IntegrityViolationException e) {
            System.out.println("You tried to register a customer which already exists in the database.");
        } catch (final ConcurrencyException e) {
            LOGGER.error("This should never happen", e);
            System.out.println(
                    "Unfortunately there was an unexpected error in the application. Please try again and if the problem persists, contact your system administrator.");
        } catch (EmailException e) {
            System.out.println("Please enter a valid email!");
        } catch (PhoneNumberException e) {
            System.out.println("Please enter a valid phone number(+351...)!");
        } catch (NameException e) {
            System.out.println("Please enter a valid name(at least two names)!");
        } catch (ParseException e) {
            System.out.println("Please enter a valid date(dd/MM/yyyy)!");
        }

        return false;
    }

    @Override
    public String headline() {
        return "Register Customer";
    }

}

