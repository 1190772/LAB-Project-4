package eapli.base.app.backoffice.console.presentation.customer;


import eapli.framework.actions.Action;

public class CheckOrderStatusAction implements Action {
    @Override
    public boolean execute() {
        return new CheckOrderStatusUI().show();
    }
}
