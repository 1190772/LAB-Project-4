package eapli.base.app.user.console.presentation;

import eapli.base.application.SpecifyCategoryController;
import eapli.base.domain.model.AlphaNumericCodeException;
import eapli.base.domain.model.DescriptionException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

public class SpecifyCategoryUI extends AbstractUI {

    private final SpecifyCategoryController ctrl = new SpecifyCategoryController();

    @Override
    protected boolean doShow() {

        int i=0;
        String alphaNumericCode = "";
        String description = "";
        while(i==0){
            try{
                alphaNumericCode = Console.readLine("Alphanumeric Code:");
                this.ctrl.registerAlphaNumericCode(alphaNumericCode);
                i++;
            } catch (AlphaNumericCodeException alphaNumericCodeException){
                System.out.println("Invalid Alpha Numeric Code. Please insert a valid code.");
                i=0;
            }
        }
        i=0;

        while(i==0){
            try{
                description = Console.readLine("Category Description:");
                this.ctrl.registerDescription(description);
                i++;
            } catch(DescriptionException descriptionException){
                System.out.println("Invalid Description. Please insert a valid description.");
                i=0;
            }
        }

        try{
            this.ctrl.specifyCategory(alphaNumericCode,description);

        } catch (@SuppressWarnings("unused") final IntegrityViolationException | DescriptionException | AlphaNumericCodeException e) {
            System.out.println("This alphanumeric code is already being used.");
        }
        return false;
    }

    @Override
    public String headline() {
        return "Specify category";
    }
}
