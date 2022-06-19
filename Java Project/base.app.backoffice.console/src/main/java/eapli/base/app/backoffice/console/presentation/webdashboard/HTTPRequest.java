package eapli.base.app.backoffice.console.presentation.webdashboard;


import javax.net.ssl.SSLSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class HTTPRequest extends Thread{

    String baseFolder;
    SSLSocket sock;
    DataInputStream inS;
    DataOutputStream outS;

    public HTTPRequest(SSLSocket s, String f) {
        baseFolder=f; sock=s;
    }

    public void run() {
        try {
            outS = new DataOutputStream(sock.getOutputStream());
            inS = new DataInputStream(sock.getInputStream());
        }
        catch(IOException ex) { System.out.println("IO Exception"); }
        try {
            HTTPMessage request = new HTTPMessage(inS);
            HTTPMessage response = new HTTPMessage();


            String fullname=baseFolder + "/";
            if(request.getURI().equals("/")) fullname=fullname+"WebDashboard.html";
            else fullname=fullname+request.getURI();
            if(!response.setContentFromFile(fullname)) {
                response.setContentFromString(
                        "<html><body><h1>404 File not found</h1></body></html>",
                        "text/html");
                response.setResponseStatus("404 Not Found");
            }
            response.setResponseStatus("Ok");


            response.send(outS);

        }
        catch(IOException ex) { }
        try { sock.close();}
        catch(IOException ex) { System.out.println("IO Exception"); }
    }


}
