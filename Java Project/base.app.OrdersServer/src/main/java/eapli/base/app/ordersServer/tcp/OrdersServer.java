package eapli.base.app.ordersServer.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import eapli.base.AppSettings;
import eapli.base.Application;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

public class OrdersServer {

    static AppSettings app = Application.settings();
    static final String TRUSTED_STORE = "myKeyStore.jks";
    static final String PASSWORD = "123456";
    static ServerSocket sock;


    public static void main(String[] args) throws Exception {
        Socket cliSock;
        SSLServerSocket sslServerSocket = null;
        SSLSocket sslSocket = null;

        //Security.addProvider(new Provider());

        //specifing the keystore file which contains the certificate/public key and the private key
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        //specifing the password of the keystore file
        System.setProperty("javax.net.ssl.keyStorePassword", PASSWORD);

        //Use this certificate and private key for client certificate when requested by the server
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword", PASSWORD);

        try {
            // SSLServerSocketFactory establishes the ssl context and creates SSLServerSocket
            SSLServerSocketFactory sslServerSocketFactory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            //Create SSLServerSocket using SSLServerSocketFactory established ssl context
            sslServerSocket = (SSLServerSocket) sslServerSocketFactory.createServerSocket(9999);

            System.out.println("OrdersServer is Running!");



            //sock = new ServerSocket(9999);

        }
        catch(IOException ex) {
            System.out.println("Failed to open server socket"); System.exit(1);
        }
        while(true) {
            //Wait for the SSL client to connect to this server
            sslSocket = (SSLSocket) sslServerSocket.accept();
            new Thread(new OrdersServerThread(sslSocket)).start();
        }
    }
}

class OrdersServerThread implements Runnable{

    private final Socket s;
    private DataOutputStream sOut;
    private DataInputStream sIn;

    public OrdersServerThread(Socket cli_s){
        s = cli_s;
    }

    @Override
    public void run() {

        InetAddress clientIP;
        try {
            clientIP = s.getInetAddress();
            System.out.println("New client connection from " + clientIP.getHostAddress() + " , port number: " + s.getPort());

            sOut = new DataOutputStream(s.getOutputStream());
            sIn = new DataInputStream(s.getInputStream());

            byte[] clientMessage = sIn.readNBytes(4);
            if (clientMessage[1] == 0) {
                System.out.println("==> Client test successfull");

                //Dizer ao cliente para continuar
                byte[] serverMessage = {(byte) 0, (byte) 2, (byte) 0, (byte) 0};


                byte[] serverpcMessage = {(byte) 0, (byte) 3, (byte) 0, (byte) 0};
                byte[] serverosMessage = {(byte) 0, (byte) 4, (byte) 0, (byte) 0};
                sOut.write(serverMessage);
                sOut.flush();
                byte[] clientMessageOpt = sIn.readNBytes(4);
                int option = clientMessageOpt[1];


                if(option == 1){
                    System.out.println("==> Showing Product Catalog to the client");
                    sOut.write(serverpcMessage);
                    sOut.flush();
                }else if(option == 2){
                    System.out.println("==> Showing Order Status to the client");
                    sOut.write(serverosMessage);
                    sOut.flush();
                }

                byte[] clienteMessageEnd = sIn.readNBytes(4);
                if (clienteMessageEnd[1] == 9) {
                    System.out.println("==> Request to end connection successful");
                    //Dizer ao cliente que entendeu
                    System.out.println("==> Sending message to the client to close Socket");
                    byte[] serverMessageEnd = {(byte) 0, (byte) 2, (byte) 0, (byte) 0};
                    sOut.write(serverMessageEnd);
                    sOut.flush();
                    System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + this.s.getPort() + " disconnected");

                } else {
                    System.out.println("==> CLIENT ERROR");
                }
            }

        } catch (IOException e) {
            System.out.println("IO Exception");
        }

    }
}


