package eapli.base.infrastructure.bootstrapers.masterdata;

import eapli.base.product.application.SpecifyProductController;
import eapli.base.category.domain.model.AlphaNumericCode;
import eapli.base.category.domain.model.AlphaNumericCodeException;
import eapli.base.category.domain.model.Category;
import eapli.base.product.domain.model.Product;
import eapli.base.category.domain.persistence.CategoryRepository;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProductBootstrapper implements Action {

    private static final Logger LOGGER = LogManager.getLogger(ProductBootstrapper.class);


    SpecifyProductController controller = new SpecifyProductController();
    CategoryRepository repo;


    @Override
    public boolean execute() {

        try {
            final Category cat1 = repo
                    .ofIdentity(AlphaNumericCode.valueOf("123"))
                    .orElseThrow(IllegalArgumentException::new);
            final Category cat2 = repo
                    .ofIdentity(AlphaNumericCode.valueOf("123"))
                    .orElseThrow(IllegalArgumentException::new);
            final Category cat3 = repo
                    .ofIdentity(AlphaNumericCode.valueOf("321"))
                    .orElseThrow(IllegalArgumentException::new);


            register(cat1,"123456", "A Computer", "A Computer used for gaming", "Asus", 313243L, 22d, 33d, 4d, 3d, 999);

            register(cat2,"134545", "A Computer", "A Computer used for working", "HP", 324364L, 25d, 30d, 3.6d, 2.7d, 899);

            register(cat3,"134535", "A Laptop", "A Computer used for gaming", "Lenovo", 313543L, 23d, 32d, 3.9d, 3d, 1099);

        } catch (AlphaNumericCodeException e) {
            e.printStackTrace();
        }

        return true;
    }

    private void register(final Category productCategory, final String internalCode, final String shortDescription, final String extendedDescription,
                          final String brand, final Long barcode, final Double width, final Double length,
                          final Double height, final Double weight, final double price){

        try{
            System.out.println("3");
            final Product p = controller.registerProduct(productCategory, internalCode, shortDescription,extendedDescription, null, brand, null, null, barcode, width, length, height, weight, price, null);
            LOGGER.debug(p);
        } catch (final IntegrityViolationException | ConcurrencyException e) {

            LOGGER.error("this should not happen", e);
        }

    }

}