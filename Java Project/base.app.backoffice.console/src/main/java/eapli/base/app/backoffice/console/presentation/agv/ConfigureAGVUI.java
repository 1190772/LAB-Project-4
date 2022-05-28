package eapli.base.app.backoffice.console.presentation.agv;

import eapli.base.agv.application.ConfigureAGVController;
import eapli.base.agv.domain.AGV;
import eapli.base.agv.domain.model.AGVModel;
import eapli.base.product.domain.model.ShortDescription;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class ConfigureAGVUI extends AbstractUI {

    private final ConfigureAGVController theController = new ConfigureAGVController();

    @Override
    protected boolean doShow() {
        String shortDesc= Console.readLine("AGV's Short Description:");
        String agvModel= Console.readLine("AGV's Model:");
        String maxWeight= Console.readLine("AGV's maximum weight handled:");
        AGV agv=theController.saveAGV(new ShortDescription(shortDesc),new AGVModel(agvModel),Double.parseDouble(maxWeight));
        if (agv!=null){
            agv.toString();
            System.out.println("AGV Configuration managed successfully");
        }else{
            System.out.println("AGV Configuration wasn't managed successfully");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Configure new AGV";
    }
}
