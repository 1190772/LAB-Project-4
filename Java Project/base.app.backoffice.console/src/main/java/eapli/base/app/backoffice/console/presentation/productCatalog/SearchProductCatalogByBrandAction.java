package eapli.base.app.backoffice.console.presentation.productCatalog;


import eapli.framework.actions.Action;

public class SearchProductCatalogByBrandAction implements Action {

    @Override
    public boolean execute() {
        return new SearchProductCatalogByBrandUI().show();
    }
}
