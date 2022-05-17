package eapli.base.app.backoffice.console.presentation.SpecifyProduct;

import eapli.base.application.product.SpecifyProductController;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class SpecifyProductUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(SpecifyProductUI.class);

    @Autowired
    private SpecifyProductController theController;

    @Override
    protected boolean doShow() {
        final Iterable<Category> category = theController.getCategories();
        final SelectWidget<Category> selector = new SelectWidget<>("Select a category", category);
        selector.show();
        final Category thecategory = selector.selectedElement();

        final String internalCode = Console.readLine("Internal Code");

        final String shortDescription = Console.readLine("Short Description");

        final String extendedDescription = Console.readLine("Extended Description");

        final String technicalDescription = Console.readLine("Technical Description");

        final String brand = Console.readLine("Brand");

        final String reference = Console.readLine("Reference");

        final String productionCode = Console.readLine("Production Code");

        final long barcode = Console.readLong("Barcode");

        final double width = Console.readLong("Width");

        final double length = Console.readLong("Length");

        final double height = Console.readLong("Height");

        final double weight = Console.readLong("Weight");

        final double price = Console.readDouble("Price");

        final Set<byte[]> photos = null;

        try {
            theController.registerProduct(thecategory,internalCode,shortDescription,extendedDescription,technicalDescription,brand,reference,productionCode,barcode,width,length,height,weight,price,photos);
        } catch (final IntegrityViolationException e) {
            System.out.println("You tried to enter a product which already exists in the database.");
        } catch (final ConcurrencyException e) {
            LOGGER.error("This should never happen", e);
            System.out.println(
                    "Unfortunatelly there was an unexpected error in the application. Please try again and if the problem persists, contact your system admnistrator.");
        }

        return false;
    }

    @Override
    public String headline() {
        return "Specify Product";
    }

}
