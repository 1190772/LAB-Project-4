package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.base.app.backoffice.console.presentation.validations.Validate;
import eapli.base.product.application.SearchProductCatalogByShortDescriptionController;
import eapli.base.product.domain.model.Product;
import eapli.base.product.domain.model.ShortDescription;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class SearchProductCatalogByShortDescriptionUI extends AbstractUI {

    private final SearchProductCatalogByShortDescriptionController theController = new SearchProductCatalogByShortDescriptionController();

    @Override
    protected boolean doShow() {
        ShortDescription desc;
        String sort = "InternalCode";
        int i = 0;
        do{
            desc = ShortDescription.shortDescriptedAs(Console.readLine("Short Description : "));
        }while(desc.getShtDescription() == null);

        sort = Validate.ValidateSort(sort, i);

        System.out.println("Results with the Short Description : " + desc);
        ShortDescription desc1 = new ShortDescription(desc.toString());

        for (Product cat : theController.findProductCatalogByShortDescription(desc1, sort)) {
            System.out.println(cat.toString());
        }
        return false;
    }



    @Override
    public String headline() {
        return "Search Product Catalog By Short Description";
    }
}
