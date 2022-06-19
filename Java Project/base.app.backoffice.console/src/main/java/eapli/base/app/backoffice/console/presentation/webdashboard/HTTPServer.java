package eapli.base.app.backoffice.console.presentation.webdashboard;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.IOException;

public class HTTPServer extends Thread{

    static private final String PATH = "base.app.backoffice.console\\src\\main\\java\\eapli\\base\\app\\backoffice\\console\\presentation\\webdashboard\\site";
    static private SSLServerSocket sock;
    static final String TRUSTED_STORE = "myKeyStoreDash.jks";
    static final String PASSWORD = "123456";

    public HTTPServer() {}

    public void run()  {

        SSLSocket cliSock;


        //Security.addProvider(new Provider());

        //specifing the keystore file which contains the certificate/public key and the private key
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        //specifing the password of the keystore file
        System.setProperty("javax.net.ssl.keyStorePassword", PASSWORD);

        //Use this certificate and private key for client certificate when requested by the server
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword", PASSWORD);


        try {
            SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            //sock = (SSLServerSocket) sslF.createServerSocket(Integer.parseInt(args[0]));
            sock = (SSLServerSocket) sslF.createServerSocket(9980);
        } catch (IOException ex) {
            System.out.println("Server failed to open local port: " + ex.getMessage());
            System.exit(1);
            try {
                Thread.currentThread().join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        while (true) {
            try {
                cliSock = (SSLSocket) sock.accept();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            HTTPRequest request = new HTTPRequest(cliSock, PATH);
            request.start();
        }
    }






}
