package eapli.base.app.backoffice.console.presentation.surveymanagement;

import eapli.base.surveymanagement.application.SurveyController;
import eapli.framework.presentation.console.AbstractUI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreateSurveyUI extends AbstractUI {
    private static final Logger LOGGER = LogManager.getLogger(CreateSurveyUI.class);

    private SurveyController tController =new SurveyController();

    @Override
    protected boolean doShow() {
        /*try {
            tController.controller();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        System.out.println("Not implemented yet");
        return true;
    }

    @Override
    public String headline() {
        return "Create Survey";
    }

}
