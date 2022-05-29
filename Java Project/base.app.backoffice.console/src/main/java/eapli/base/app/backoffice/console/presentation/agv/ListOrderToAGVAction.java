package eapli.base.app.backoffice.console.presentation.agv;

import eapli.framework.actions.Action;

public class ListOrderToAGVAction implements Action {
    @Override
    public boolean execute() {
        return new ListOrderToAGVUI().show();
    }
}
