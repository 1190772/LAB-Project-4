package eapli.base.app.backoffice.console.presentation.webdashboard;

import eapli.framework.presentation.console.AbstractUI;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractList;

public class WebDashboardUI extends AbstractUI {


    public boolean doShow() {

        Thread webDash = new HTTPServer();
        webDash.start();

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("https://localhost:9980"));
            } catch (IOException | URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }


        /*URI uri = null;
        try {
            uri = new URI("http://localhost:8000/WebDashboard.html");
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }*/

        /*File htmlFile = new File("WebDashboard.html");

        if(!htmlFile.isFile()){
            System.out.println("File not found!");
        }else{
            Desktop.getDesktop().browse(htmlFile.toURI());
        }*/
        return false;
    }

    @Override
    public String headline() {
        return null;
    }


}
