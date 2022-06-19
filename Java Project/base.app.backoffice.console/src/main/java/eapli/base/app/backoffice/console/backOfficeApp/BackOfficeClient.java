package eapli.base.app.backoffice.console.backOfficeApp;

import eapli.base.spoms.SPOMSPMessage;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class BackOfficeClient {

    static SSLSocket sock;

    static final String TRUSTED_STORE = "myTrustStoreDash.jts";
    static final String PASSWORD = "123456";


    public BackOfficeClient(int code, String input) throws InterruptedException, IOException {


        //specifing the trustStore file which contains the certificate & public of the server
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        //specifing the password of the trustStore file
        System.setProperty("javax.net.ssl.trustStorePassword", PASSWORD);

        //Use this certificate and private key for client certificate when requested by the server
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", PASSWORD);

        try {

            //SSLSSocketFactory establishes the ssl context and and creates SSLSocket
            SSLSocketFactory sslsocketfactory = (SSLSocketFactory)SSLSocketFactory.getDefault();
            //Create SSLSocket using SSLServerFactory already established ssl context and connect to server
            sock = (SSLSocket)sslsocketfactory.createSocket("localhost",9980);

        } catch(IOException ex) {
            System.out.println("Failed to establish TCP connection");
            System.exit(1); }


        runCli(code, input);
    }

    private byte[] runCli(int code, String input) throws IOException, InterruptedException {


        DataOutputStream sOut = null;
        DataInputStream sIn = null;
        try {
            sOut = new DataOutputStream(sock.getOutputStream());
            sIn = new DataInputStream(sock.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Connected to the server");

        TcpBackOffice tcp;

        while(true) {
            Thread serverConn = new Thread(tcp = new TcpBackOffice(sock));
            serverConn.start();

            byte[] m = new byte[2];
            sOut.write(SPOMSPMessage.write(3, m, m.length));
            if (input == null) {

                sOut.write(SPOMSPMessage.write(code, m, 2));
            } else {

                sOut.write(SPOMSPMessage.write(code, input.getBytes(), input.length()));
            }

            sOut.write(SPOMSPMessage.write(1, m, m.length));
            serverConn.join();

            sock.close();


        }

    }

}


class TcpBackOffice implements Runnable {


    private Socket s;
    private DataInputStream sIn;

    public TcpBackOffice(Socket tcp_s) {
        s = tcp_s;
    }

    public void run() {


        try {
            sIn = new DataInputStream(s.getInputStream());

        } catch (Exception ex) {
            System.out.println("Client on port number: " + this.s.getPort() + " disconnected");
        }
    }


}
