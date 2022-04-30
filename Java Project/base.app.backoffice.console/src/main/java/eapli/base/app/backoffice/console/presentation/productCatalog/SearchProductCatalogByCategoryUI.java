package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.application.productCatalog.SearchProductCatalogByCategoryController;
import eapli.base.domain.model.*;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.visitor.Visitor;

import java.io.IOException;

public class SearchProductCatalogByCategoryUI extends AbstractUI {


    private final SearchProductCatalogByCategoryController theController = new SearchProductCatalogByCategoryController();

    @Override
    protected boolean doShow() {
        AlphaNumericCode code = null;

        try {
            code = Category.readCode(Console.readLine("Category:"));
        } catch (IOException | AlphaNumericCodeException e) {
            e.printStackTrace();
        }
        System.out.println("Results with the category : " + code);
        Category category1 = new Category(code);
        for (ProductCatalog cat: theController.findProductCatalogByCategory(category1)) {
            System.out.println(cat.toString());
        }
        return false;
    }


    @Override
    public String headline() {
        return "Search Product Catalog By Category";
    }
}
