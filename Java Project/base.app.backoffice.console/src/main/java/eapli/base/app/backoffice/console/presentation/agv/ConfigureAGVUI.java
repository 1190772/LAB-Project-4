package eapli.base.app.backoffice.console.presentation.agv;

import eapli.base.application.agv.ConfigureAGVController;
import eapli.base.domain.model.avg.AGV;
import eapli.base.domain.model.avg.AGVModel;
import eapli.base.domain.model.product.ShortDescription;
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
