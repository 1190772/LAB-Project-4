package eapli.base.app.AGVManager.tcp;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class AGVManager {
    private static HashMap<Socket, DataOutputStream> cliList = new HashMap<>();

    static final String TRUSTED_STORE = "KEYS/avgManager.jks";
    static final String PASS = "1234567";

    public static synchronized void sendToAll(int len, byte[] data) throws Exception {
        for (DataOutputStream cOut : cliList.values()) {
            cOut.write(len);
            cOut.write(data, 0, len);
        }

    }

    public static synchronized void addCli(Socket s) throws Exception {
        cliList.put(s, new DataOutputStream(s.getOutputStream()));
    }

    public static synchronized void remCli(Socket s) throws Exception {
        cliList.get(s).write(0);
        cliList.remove(s);
        s.close();
    }

    private static ServerSocket serverSocket;
    private int temp = 0;


    public void run() throws Exception {

        Socket cliSock;
        SSLServerSocket sslServerSocket = null;
        SSLSocket sslSocket = null;

        //Security.addProvider(new Provider());

        //specifing the keystore file which contains the certificate/public key and the private key
        System.setProperty("javax.net.ssl.keyStore","myKeyStore1.jks");
        //specifing the password of the keystore file
        System.setProperty("javax.net.ssl.keyStorePassword","123456");

        try {
            // SSLServerSocketFactory establishes the ssl context and creates SSLServerSocket
            SSLServerSocketFactory sslServerSocketFactory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            //Create SSLServerSocket using SSLServerSocketFactory established ssl context
            sslServerSocket = (SSLServerSocket) sslServerSocketFactory.createServerSocket(9999);

            System.out.println("AGVManager is Running!");



            //sock = new ServerSocket(9999);

        }
        catch(IOException ex) {
            System.out.println("Failed to open server socket"); System.exit(1);
        }
        while(true) {
            //Wait for the SSL client to connect to this server
            sslSocket = (SSLSocket) sslServerSocket.accept();
            new Thread(new TcpChatSrvClient(sslSocket)).start();
        }

    }
        /*//   Server server = Server.createTcpServer().start();
        Socket cliSock;
        int i;

        //Trust these certificates provided by authorized clients
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword", PASS);

        // Use this certificate and private key as server certificate
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", PASS);

        // SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        try {
            serverSocket = new ServerSocket(32507); //new ServerSocket(port);
            // serverSocket.setNeedClientAuth(true);
            System.out.println("AGVManager is Running!");
        } catch (IOException ex) {
            System.out.println("Local port number not available.");
            System.exit(1);
        }

        while (true) {
            cliSock = serverSocket.accept(); // wait for a new client connection request
            addCli(cliSock);
            Thread cli = new TcpChatSrvClient(cliSock);
            cli.start();
        }
        //server.stop();
    }*/
}


class TcpChatSrvClient extends Thread {
    private Socket myS;
    private DataInputStream sIn;
    private static final byte VERSION = 0;
    private static final byte CODE = 1;
    private static final byte NUMERO_TAREFAS_PENDENTES = 3;
    private static final byte NUMERO_TAREFAS_DEPOIS_PRAZO = 4;
    private static final byte NUMERO_TAREFAS_EM_MENOS_DE_UM_DIA = 5;
    private static final byte LISTA_TAREFAS_URGENCIA_CRITICIDADE = 6;
    private static final byte ATUALIZAR_PEDIDO = 7;
    private static final byte ACEITE = 8;
    private static final byte REJEITADO = 9;
    private static final byte DASHBOARD = 10;
    //Assing Tasks atraves CMD API
    //recever data do agv para dar update do status API
    //   PedidoRepository pedidoRepository = PersistenceContext.repositories().pedido();
    //   private PesquisarTarefaController ptc = new PesquisarTarefaController();
    //   private TarefasTCPController ttc = new TarefasTCPController();

    public TcpChatSrvClient(Socket s) {
        myS = s;
    }



    public void run() {
        int nChars;
        byte[] data = new byte[500];
        InetAddress clientIP;

        try {
            clientIP = myS.getInetAddress();
            System.out.println("New client connection from " + clientIP.getHostAddress() + " , port number: " + myS.getPort());

            sIn = new DataInputStream(myS.getInputStream());
            while (true) {
                nChars = sIn.read();
                if (nChars == 0) break; // empty line means client wants to exit
                sIn.read(data, 0, nChars);
                int opcao = data[1];
                if (opcao == NUMERO_TAREFAS_PENDENTES) {
                    int colaborador = data[3];
                    //     data = numeroTarefasPendentesColaborador(colaborador);
                }
                if (opcao == NUMERO_TAREFAS_DEPOIS_PRAZO) {
                    int colaborador = data[3];
                    //    data = numeroTarefasDepoisPrazo(colaborador);

                }
                if (opcao == NUMERO_TAREFAS_EM_MENOS_DE_UM_DIA) {
                    int colaborador = data[3];
                    //    data = numeroTarefasEmMenosDeUmDia(colaborador);
                }
                if (opcao == LISTA_TAREFAS_URGENCIA_CRITICIDADE) {
                    int colaborador = data[3];
                    //            data = listaTarefasUrgenciaCriticidade(colaborador);
                }
                if (opcao == ATUALIZAR_PEDIDO) {
                    int idPedido = data[3];
                    //          data = atualizarEstadoPedido(idPedido);
                }
                if (opcao == DASHBOARD) {
                    int numeroColaborador = data[3];
                    //        String tarefas1 = numeroTarefasPendentesColaborador2(numeroColaborador);
                    //        String tarefas2 = numeroTarefasDepoisPrazo2(numeroColaborador);
                    //        String tarefas3 = numeroTarefasEmMenosDeUmDia2(numeroColaborador);
                    //        String listaTarefas = listaTarefasUrgenciaCriticidade2(numeroColaborador);
                    //        String tarefas4 = "Lista de tarefas: " + listaTarefas;
                    //        int tamanho1 = tarefas1.length();
                    //        int tamanho2 = tarefas2.length();
                    //        int tamanho3 = tarefas3.length();
                    //        int tamanho4 = tarefas4.length();
                    //        String finalString = tarefas1 + tarefas2 + tarefas3 + tarefas4;
                    //        int tamanho = finalString.length();
                    //        byte[] tamanhoB = String.valueOf(tamanho).getBytes();
                    data[0] = VERSION;
                    data[1] = DASHBOARD;
                    //      data[2] = (byte) tamanhoB.length;
                    //      data[3] = (byte) tamanho1;
                    //      data[4] = (byte) tamanho2;
                    //      data[5] = (byte) tamanho3;
                    //      data[6] = (byte) tamanho4;
                    //      for (int i = 0, j = 7; i < tamanhoB.length; i++, j++) {
                    //          data[j] = tamanhoB[i];
                    //      }
                    //      byte[] string = finalString.getBytes();
                    //      for (int i = 7 + tamanhoB.length, j = 0; j < string.length; i++, j++) {
                    //          data[i] = string[j];
                    //                 }
                }

                /*InfoTarefa it = ptc.procurarInfoTarefaPorID(idPedido);
                int idTarefa = it.obteridTarefa();

                data[0] = VERSION;
                data[1] = ACEITE;
                data[2] = (Integer.SIZE/8);
                byte[] bytes = String.valueOf(idTarefa).getBytes();
                data[3] = bytes[0];
                data[4] = bytes[1];
                data[5] = bytes[2];
                data[6] = bytes[3];*/

                AGVManager.sendToAll(data.length, data);
            }
            // the client wants to exit
            AGVManager.remCli(myS);
        } catch (Exception ex) {
            System.out.println("Error");
        }

    }

}
