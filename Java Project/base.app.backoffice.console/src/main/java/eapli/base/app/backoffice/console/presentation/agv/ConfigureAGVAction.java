package eapli.base.app.backoffice.console.presentation.agv;

import eapli.base.app.backoffice.console.presentation.SpecifyProduct.SpecifyProductUI;
import eapli.framework.actions.Action;

public class ConfigureAGVAction implements Action {
    @Override
    public boolean execute() {
        return new ConfigureAGVUI().show();
    }
}
