package eapli.base.infrastructure.bootstrapers.masterdata;

import eapli.base.category.application.SpecifyCategoryController;
import eapli.base.category.domain.model.AlphaNumericCodeException;
import eapli.base.category.domain.model.Category;
import eapli.base.category.domain.model.DescriptionException;
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
