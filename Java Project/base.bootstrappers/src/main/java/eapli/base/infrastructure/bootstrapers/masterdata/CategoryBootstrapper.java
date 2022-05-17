package eapli.base.infrastructure.bootstrapers.masterdata;

import eapli.base.application.category.SpecifyCategoryController;
import eapli.base.domain.model.category.AlphaNumericCode;
import eapli.base.domain.model.category.AlphaNumericCodeException;
import eapli.base.domain.model.category.Category;
import eapli.base.domain.model.category.DescriptionException;
import eapli.base.domain.model.product.Product;
import eapli.base.domain.persistence.CategoryRepository;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CategoryBootstrapper implements Action {

    private static final Logger LOGGER = LogManager.getLogger(CategoryBootstrapper.class);

    SpecifyCategoryController controller = new SpecifyCategoryController();

    @Override
    public boolean execute() {

        register("123", "Laptops");
        register("321", "Desktops");

        return true;
    }

    private void register(final String code, final String description){

        try{
            System.out.println("3");
            final Category c = controller.specifyCategory(code, description);
            System.out.println("5");
            LOGGER.debug(c);
        } catch (final IntegrityViolationException | ConcurrencyException | DescriptionException | AlphaNumericCodeException e) {

            LOGGER.error("this should not happen", e);
        }

    }
}
