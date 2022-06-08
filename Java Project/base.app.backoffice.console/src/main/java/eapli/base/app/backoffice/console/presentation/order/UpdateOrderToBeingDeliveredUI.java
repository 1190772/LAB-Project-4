package eapli.base.app.backoffice.console.presentation.order;

import eapli.framework.presentation.console.AbstractUI;

public class UpdateOrderToBeingDeliveredUI extends AbstractUI {


    @Override
    protected boolean doShow() {
        return false;
    }

    @Override
    public String headline() {
        return "Change Order to Being Delivered";
    }
}
