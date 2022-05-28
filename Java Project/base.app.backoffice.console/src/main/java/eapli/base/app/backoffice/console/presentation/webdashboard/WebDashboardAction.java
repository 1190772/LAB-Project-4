package eapli.base.app.backoffice.console.presentation.webdashboard;

import eapli.base.app.backoffice.console.presentation.productCatalog.ListProductsUI;
import eapli.framework.actions.Action;

import java.io.IOException;

public class WebDashboardAction implements Action {
    @Override
    public boolean execute() {
        try {
            return new WebDashboardUI().show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
