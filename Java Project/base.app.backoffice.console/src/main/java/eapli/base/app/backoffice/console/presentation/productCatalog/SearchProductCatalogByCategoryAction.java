package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.framework.actions.Action;

public class SearchProductCatalogByCategoryAction implements Action {

    @Override
    public boolean execute() {
        return new SearchProductCatalogByCategoryUI().show();
    }
}
