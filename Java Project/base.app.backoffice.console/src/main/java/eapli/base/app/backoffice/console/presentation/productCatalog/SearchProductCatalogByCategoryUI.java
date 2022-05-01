package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.app.backoffice.console.presentation.validations.Validate;
import eapli.base.application.productCatalog.SearchProductCatalogByCategoryController;
import eapli.base.domain.model.*;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.io.IOException;

public class SearchProductCatalogByCategoryUI extends AbstractUI {


    private final SearchProductCatalogByCategoryController theController = new SearchProductCatalogByCategoryController();

    @Override
    protected boolean doShow() {
        AlphaNumericCode code = null;
        String sort = "InternalCode";
        int i = 0;
        try {
            code = Category.readCode(Console.readLine("Category Code:"));
        } catch (IOException | AlphaNumericCodeException e) {
            e.printStackTrace();
        }

        sort = Validate.ValidateSort(sort, i);

        System.out.println("Results with the category : " + code);
        Category category1 = new Category(code);
        for (ProductCatalog cat: theController.findProductCatalogByCategory(category1, sort)) {
            System.out.println(cat.toString());
        }
        return false;
    }


    @Override
    public String headline() {
        return "Search Product Catalog By Category";
    }
}
