package eapli.base.app.backoffice.console.presentation.webdashboard;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WebDashboardUI{

    protected boolean show() throws IOException, URISyntaxException {

        URI uri = new URI("http://localhost:8000/WebDashboard.html");
        Desktop.getDesktop().browse(uri);
        /*File htmlFile = new File("WebDashboard.html");

        if(!htmlFile.isFile()){
            System.out.println("File not found!");
        }else{
            Desktop.getDesktop().browse(htmlFile.toURI());
        }*/
        return false;
    }



}
