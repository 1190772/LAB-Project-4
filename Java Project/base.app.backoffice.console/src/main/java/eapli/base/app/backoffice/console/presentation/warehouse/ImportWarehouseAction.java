package eapli.base.app.backoffice.console.presentation.warehouse;

import eapli.framework.actions.Action;

public class ImportWarehouseAction implements Action {
    @Override
    public boolean execute() {
        return new ImportWarehouseUI().show();
    }
}
