package eapli.base.app.ordersServer.tcp;

//import eapli.base.app.backoffice.console.presentation.productCatalog.ListProductsUI;

import javax.net.ssl.SSLSocket;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpOrdersClient {

    static InetAddress serverIP;
    static Socket sock;


    public static void main(String[] args) throws Exception{

        if(args.length!=1) {
            System.out.println("Server IPv4/IPv6 address or DNS name is required");
            System.exit(1); }

        try { serverIP = InetAddress.getByName(args[0]); }
        catch(UnknownHostException ex) {
            System.out.println("Invalid server specified: " + args[0]);
            System.exit(1); }

        try { sock = new Socket(serverIP, 9999); }
        catch(IOException ex) {
            System.out.println("Failed to establish TCP connection");
            System.exit(1); }


        System.out.println("Connected to: " + serverIP.getHostAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        DataOutputStream sOutData = new DataOutputStream(sock.getOutputStream());
        DataInputStream sInData = new DataInputStream(sock.getInputStream());



        //Mandar um pedido para o servido -> codigo: 0 (Teste)
        byte[] clientMessage = {(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        sOutData.write(clientMessage);
        sOutData.flush();

        //Esperar a resposta do servidor a dizer que entendeu a mensagem
        byte[] serverMessage = sInData.readNBytes(4);
        int option;
        if (serverMessage[1] == 2) {
            System.out.println("1. Product Catalog");
            System.out.println("2. Order Status");
            option = Integer.parseInt(in.readLine());

            byte[] optionMessage = {(byte) 0, (byte) option, (byte) 0, (byte) 0};
            sOutData.write(optionMessage);
            sOutData.flush();

            serverMessage = sInData.readNBytes(4);
            if(serverMessage[1] == 3){
            //    new ListProductsUI().show();
            }else if(serverMessage[1] == 4){
                System.out.println("You are seeing orders status");
            }



        }



    }
}
