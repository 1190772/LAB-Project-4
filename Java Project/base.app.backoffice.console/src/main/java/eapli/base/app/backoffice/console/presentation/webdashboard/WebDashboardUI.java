package eapli.base.app.backoffice.console.presentation.webdashboard;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WebDashboardUI{

    protected boolean show() throws IOException {
        File htmlFile;
        htmlFile = new File("WebDashboard.html");

        if(!htmlFile.isFile()){
            System.out.println("File not found!");
        }else{
            Desktop.getDesktop().browse(htmlFile.toURI());
        }
        return false;
    }



}
