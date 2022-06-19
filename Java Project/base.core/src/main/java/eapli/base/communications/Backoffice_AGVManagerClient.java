package eapli.base.communications;

import eapli.base.spoms.SPOMSPMessage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;

public class Backoffice_AGVManagerClient {
    static Socket sock;
    String info;

    public Backoffice_AGVManagerClient(int code, String input) throws InterruptedException, IOException {
        //byte[] data = new byte[300];
        try {
            sock = new Socket("localhost", 9999);
        } catch (IOException ex) {
            System.out.println("Failed to connect.");
            System.exit(1);
        }

        runCommand(code, input);
    }

    private byte[] runCommand(int code, String input) throws IOException, InterruptedException {


        DataOutputStream sOut = null;
        DataInputStream sIn = null;
        try {
            sOut = new DataOutputStream(sock.getOutputStream());
            sIn = new DataInputStream(sock.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // System.out.println("Connected to server");

        TcpBackManConn tcp;

        // start a thread to read incoming messages from the server
        Thread serverConn = new Thread(tcp = new TcpBackManConn(sock));
        serverConn.start();

        byte[] ret;

        byte[] m = new byte[2];
        sOut.write(SPOMSPMessage.write(3, m, m.length));
        if (input == null) {
            sOut.write(SPOMSPMessage.write(code, m, 2));
            // ret = SPOMSMessage.read(sIn);
        } else {
            sOut.write(SPOMSPMessage.write(code, input.getBytes(), input.length()));
            // ret = SPOMSMessage.read(sIn);
        }
        //System.out.println("escreveu e enviou");

        sOut.write(SPOMSPMessage.write(1, m, m.length));
        serverConn.join();

        setInfo(tcp.getTcpInfo());

        sock.close();
        return null;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String s){
        info = s;
    }

}


class TcpBackManConn implements Runnable {
    private static final int SEND_TASKID = 14;
    private static final int RECIEVE_AGV_INFO = 6;

    private Socket s;
    private DataInputStream sIn;

    protected String info = null;

    public TcpBackManConn(Socket tcp_s) {
        s = tcp_s;
    }

    public void run() {
        //          int nChars;
        //           byte[] data = new byte[300];
        //String frase;

        //System.out.println("TcpBackManCon");
        try {
            sIn = new DataInputStream(s.getInputStream());
            byte[] data = SPOMSPMessage.read(sIn);
            int opcao = data[0];
            //System.out.println(opcao + "aaaa");
            switch (opcao) {
                case (SEND_TASKID):
                    byte[] input = SPOMSPMessage.read(sIn);

                    System.out.println("Code: " + input[0] + "\nTask ID: " + new String(input, 1, (input.length - 1)));
                    break;
                case (RECIEVE_AGV_INFO):
                    // System.out.println("recebeu informacao com o codigo RECIEVE_AGV_INFO");
                    removeLastElement(data);
                    String string = new String(data, 2, (data.length - 2));

                    //Info i = new Info(string);
                    info = string;
                    // infoCtrl.sendInfo(string);
                    break;
            }
        } catch (Exception ex) {
            System.out.println("Client disconnected.");
        }
    }

    public String getTcpInfo() {
        return info;
    }
    private int convertByteArrayToInt(byte[] intBytes) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(intBytes);
        for (int i = 0; i < intBytes.length; i++)
            System.out.println(intBytes[i]);
        return byteBuffer.getInt();
    }

    public static byte[] removeLastElement(byte[] arr) {
        byte[] newArr = new byte[arr.length - 1];
        newArr = arr;
        //System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
        return newArr;
    }
}
