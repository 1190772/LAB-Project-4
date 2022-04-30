package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.application.productCatalog.SearchProductCatalogByCategoryController;
import eapli.base.application.productCatalog.SearchProductCatalogByShortDescriptionController;
import eapli.base.domain.model.AlphaNumericCode;
import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.model.ShortDescription;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.visitor.Visitor;

public class SearchProductCatalogByShortDescriptionUI extends AbstractUI {

    private final SearchProductCatalogByShortDescriptionController theController = new SearchProductCatalogByShortDescriptionController();

    @Override
    protected boolean doShow() {
        String desc;

        desc = Console.readLine("Short Description?:");
        System.out.println("Results with the Short Description : " + desc);
        ShortDescription desc1 = new ShortDescription(desc);
        for (ProductCatalog cat : theController.findProductCatalogByShortDescription(desc1)) {
            System.out.println(cat.toString());
        }
        return false;
    }

    @Override
    public String headline() {
        return "Search Product Catalog By Short Description";
    }
}
