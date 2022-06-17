package eapli.base.app.backoffice.console.presentation.warehouse;

import eapli.base.importwarehouse.application.ImportWarehouseController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.io.IOException;

public class ImportWarehouseUI extends AbstractUI {

    private final ImportWarehouseController ctrl = new ImportWarehouseController();

    @Override
    protected boolean doShow() {
        int response = Console.readInteger(("\nDo you wish to import the warehouse plant?\n 1 - Yes  |  2 - No\n"));
        if (response == 1) {
            try {
                ctrl.jsonParser();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else {
            System.exit(1);

        }

        return false;
    }


    @Override
    public String headline() {
        return "Import Warehouse Plant";
    }
}
