package eapli.base.app.CustomerApp.tcp;


import eapli.base.app.backoffice.console.presentation.customer.AddToShoppingCartUI;


import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class CustomerApp {

    static InetAddress serverIP;
    static SSLSocket sslSocket;
    static final String TRUSTED_STORE = "myTrustStore.jts";
    static final String PASSWORD = "123456";


    public static void main(String[] args) throws Exception{

        //specifing the trustStore file which contains the certificate & public of the server
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        //specifing the password of the trustStore file
        System.setProperty("javax.net.ssl.trustStorePassword", PASSWORD);

        //Use this certificate and private key for client certificate when requested by the server
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", PASSWORD);


        if(args.length!=1) {
            System.out.println("Server IPv4/IPv6 address or DNS name is required");
            System.exit(1); }

        try {
            serverIP = InetAddress.getByName(args[0]);
        }
        catch(UnknownHostException ex) {
            System.out.println("Invalid server specified: " + args[0]);
            System.exit(1); }

        try {

            //SSLSSocketFactory establishes the ssl context and and creates SSLSocket
            SSLSocketFactory sslsocketfactory = (SSLSocketFactory)SSLSocketFactory.getDefault();
            //Create SSLSocket using SSLServerFactory already established ssl context and connect to server
            sslSocket = (SSLSocket)sslsocketfactory.createSocket(serverIP,9999);

            //sock = new Socket(serverIP, 9999);
        }
        catch(IOException ex) {
            System.out.println("Failed to establish TCP connection");
            System.exit(1); }


        System.out.println("Connected to: " + serverIP.getHostAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //Create OutputStream to send message to server
        DataOutputStream sOutData = new DataOutputStream(sslSocket.getOutputStream());
        //Create InputStream to read messages send by the server
        DataInputStream sInData = new DataInputStream(sslSocket.getInputStream());



        //Mandar um pedido para o servido -> codigo: 0 (Teste)
        byte[] clientMessage = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        sOutData.write(clientMessage);
        sOutData.flush();

        //Esperar a resposta do servidor a dizer que entendeu a mensagem
        byte[] serverMessage = sInData.readNBytes(4);
        int option;
        if (serverMessage[1] == 2) {

            System.out.println("1. Add Product to the Shopping Cart");
            System.out.println("2. Order Status");
            option = Integer.parseInt(in.readLine());

            byte[] optionMessage = {(byte) 0, (byte) option, (byte) 0, (byte) 0};
            sOutData.write(optionMessage);
            sOutData.flush();

            serverMessage = sInData.readNBytes(4);
            if(serverMessage[1] == 3){
                new AddToShoppingCartUI().show();
            }else if(serverMessage[1] == 4){
                System.out.println("You are seeing orders status");
            }

            //Mandar um pedido para o servido -> codigo: 9 (Fim)
            byte[] clienteMessageEnd = {(byte) 0, (byte) 9, (byte) 0, (byte) 0};
            sOutData.write(clienteMessageEnd);
            sOutData.flush();

            byte[] serverMessageEnd = sInData.readNBytes(4);
            if (serverMessageEnd[1] == 2) {
                sslSocket.close();
            } else {
                System.out.println("==> SERVER ERROR");
            }

        }



    }
}
