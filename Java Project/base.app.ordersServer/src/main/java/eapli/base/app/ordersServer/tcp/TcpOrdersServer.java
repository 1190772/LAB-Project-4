package eapli.base.app.ordersServer.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpOrdersServer {

    static ServerSocket sock;


    public static void main(String[] args) throws Exception {
        Socket cliSock;

        try {
            sock = new ServerSocket(9999);
            System.out.println("Server is Running!");
        }
        catch(IOException ex) {
            System.out.println("Failed to open server socket"); System.exit(1);
        }
        while(true) {
            cliSock=sock.accept();
            new Thread(new TcpOrdersServerThread(cliSock)).start();
        }
    }
}

class TcpOrdersServerThread implements Runnable{

    private Socket s;
    private DataOutputStream sOut;
    private DataInputStream sIn;

    public TcpOrdersServerThread(Socket cli_s){
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
                    System.out.println("Showing Product Catalog to the client");
                    sOut.write(serverpcMessage);
                    sOut.flush();
                }else if(option == 2){
                    System.out.println("Showing Order Status to the client");
                    sOut.write(serverosMessage);
                    sOut.flush();
                }


            }

            System.out.println("Client " + clientIP.getHostAddress() +
                    ", port number: " + s.getPort() + " disconnected");
            s.close();

        } catch (IOException e) {
            System.out.println("IO Exception");
        }

    }
}


