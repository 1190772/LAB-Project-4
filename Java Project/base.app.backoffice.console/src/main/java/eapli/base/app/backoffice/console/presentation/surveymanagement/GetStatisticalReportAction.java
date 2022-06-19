package eapli.base.app.backoffice.console.presentation.surveymanagement;


import eapli.framework.actions.Action;

public class GetStatisticalReportAction implements Action {

    @Override
    public boolean execute() {
        return new GetStatisticalReportUI().doShow();
    }
}
