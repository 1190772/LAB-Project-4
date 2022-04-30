package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.application.productCatalog.SearchProductCatalogByCategoryController;
import eapli.base.application.productCatalog.SearchProductCatalogByShortDescriptionController;
import eapli.base.domain.model.AlphaNumericCode;
import eapli.base.domain.model.Category;
import eapli.base.domain.model.ProductCatalog;
import eapli.base.domain.model.ShortDescription;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractListUI;
import eapli.framework.visitor.Visitor;

public class SearchProductCatalogByShortDescriptionUI extends AbstractListUI {

    private SearchProductCatalogByShortDescriptionController theController = new SearchProductCatalogByShortDescriptionController();

    @Override
    protected boolean doShow() {
        String desc;

        desc = Console.readLine("Category:");
        System.out.println("Results with the category : " + desc);
        ShortDescription desc1 = new ShortDescription(desc);
        for (ProductCatalog cat : theController.findProductCatalogByShortDescription(desc1)) {
            System.out.println(cat.toString());
        }
        return false;
    }

    @Override
    protected Iterable elements() {
        return null;
    }

    @Override
    protected Visitor elementPrinter() {
        return null;
    }

    @Override
    protected String elementName() {
        return null;
    }

    @Override
    protected String listHeader() {
        return null;
    }

    @Override
    protected String emptyMessage() {
        return null;
    }

    @Override
    public String headline() {
        return null;
    }
}
