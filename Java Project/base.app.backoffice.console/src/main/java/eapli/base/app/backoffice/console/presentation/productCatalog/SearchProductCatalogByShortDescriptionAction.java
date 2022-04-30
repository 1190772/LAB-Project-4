package eapli.base.app.backoffice.console.presentation.productCatalog;

import eapli.framework.actions.Action;

public class SearchProductCatalogByShortDescriptionAction implements Action {

    @Override
    public boolean execute() {
        return new SearchProductCatalogByShortDescriptionUI().show();
    }
}
