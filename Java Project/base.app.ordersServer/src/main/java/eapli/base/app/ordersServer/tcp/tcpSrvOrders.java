package eapli.base.app.ordersServer.tcp;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Calendar;

public class tcpSrvOrders {

    static final String TRUSTED_STORE = "serverMotorFluxos.jks";
    static final String KEYSTORE_PASS = "forgotten";
    static SSLServerSocket sock;
    static int serverPortProperties;
    static Calendar c;

    public static void main(String[] args) throws Exception {

        // Trust these certificates provided by authorized clients
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword", KEYSTORE_PASS);

        // Use this certificate and private key as server certificate
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", KEYSTORE_PASS);

        SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        Socket cliSock;
        try {
            sock = (SSLServerSocket) sslF.createServerSocket(serverPortProperties);
            sock.setNeedClientAuth(true);
        } catch (IOException ex) {
            System.out.println("Failed to open server socket");
            System.exit(1);
        }

        while (true) {
            cliSock = sock.accept();
            new Thread(new tcpSrvOrdersThread(cliSock,c)).start();
        }
    }

    }


class tcpSrvOrdersThread implements Runnable {

    private Socket s;
    private Calendar c;

    public tcpSrvOrdersThread(Socket cliSock, Calendar c) {
        this.s = cliSock;
        this.c = c;
    }

    @Override
    public void run() {

        InetAddress clientIP;

        try {
            clientIP = this.s.getInetAddress();
            System.out.println("==> New client connection from " + clientIP.getHostAddress() + ", port number " + this.s.getPort());

            DataInputStream sIn = new DataInputStream(this.s.getInputStream());
            DataOutputStream sOut = new DataOutputStream(this.s.getOutputStream());
            byte[] clientMessage = sIn.readNBytes(4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
