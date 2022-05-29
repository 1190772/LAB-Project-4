package eapli.base.app.backoffice.console.presentation.order;

import eapli.framework.actions.Action;

public class ChangeOrderToDeliveredAction implements Action {
    @Override
    public boolean execute() {
        return new ChangeOrderToDeliveredUI().show();
    }
}
