package eapli.base.app.backoffice.console.presentation.SpecifyProduct;

import eapli.base.app.backoffice.console.presentation.customer.RegisterCustomerUI;

import eapli.framework.actions.Action;

public class SpecifyProductAction implements Action {
    @Override
    public boolean execute() {
        return new SpecifyProductUI().show();
    }
}
