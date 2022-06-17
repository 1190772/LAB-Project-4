package eapli.base.app.backoffice.console.presentation.customer;

import eapli.base.order.application.CheckOrderStatusController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class CheckOrderStatusUI extends AbstractUI {

    private final CheckOrderStatusController ctrl = new CheckOrderStatusController();


    @Override
    protected boolean doShow() {
        int response = Console.readInteger(("\nDo you wish to see the status of your orders?\n 1 - Yes  |  2 - No\n"));
        if (response == 1) {
            ctrl.checkOrderStatus();
        } else{
            System.exit(1);

        }
        return false;
    }

    @Override
    public String headline() {
        return "Check Order Status";
    }
}
