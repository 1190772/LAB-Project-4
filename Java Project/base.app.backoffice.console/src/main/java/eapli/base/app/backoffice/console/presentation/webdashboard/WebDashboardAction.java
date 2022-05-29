package eapli.base.app.backoffice.console.presentation.webdashboard;

import eapli.base.app.backoffice.console.presentation.productCatalog.ListProductsUI;
import eapli.framework.actions.Action;

import java.io.IOException;
import java.net.URISyntaxException;

public class WebDashboardAction implements Action {
    @Override
    public boolean execute() {
        try {
            return new WebDashboardUI().show();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return false;
    }
}
