package eapli.base.app.backoffice.console.presentation.surveymanagement;

import eapli.framework.actions.Action;

public class CreateSurveyAction implements Action{

    @Override
    public boolean execute() {
        return new CreateSurveyUI().show();
    }
}