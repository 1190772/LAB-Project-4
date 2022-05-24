package eapli.base.app.ordersServer.tcp.presentation;


import eapli.base.app.ordersServer.tcp.protocol.OrdersProtocolMessageParser;
import eapli.base.app.ordersServer.tcp.protocol.OrdersProtocolRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class OrdersServer {

    private static final Logger LOGGER = LogManager.getLogger(OrdersServer.class);

    private static class ClientHandler extends Thread {
        private Socket clientSocket;

        public ClientHandler(final Socket socket) {
            clientSocket = socket;
        }

        @Override
        public void run(){

            final var clientIP = clientSocket.getInetAddress();
            LOGGER.debug("Acepted connection from {}:{}", clientIP.getHostAddress(), clientSocket.getPort());

            try (var out = new PrintWriter(clientSocket.getOutputStream(), true);
                 var in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    LOGGER.debug("Received message:----\n{}\n----", inputLine);
                    final OrdersProtocolRequest request = OrdersProtocolMessageParser.parse(inputLine);
                    final String response = request.execute();
                    out.println(response);
                    LOGGER.debug("Sent message:----\n{}\n----", response);
                    if (request.isGoodbye()) {
                        break;
                    }
                }
            } catch (final IOException e) {
                LOGGER.error(e);
            } finally {
                try {
                    clientSocket.close();
                    LOGGER.debug("Closing client socket {}:{}", clientIP.getHostAddress(), clientSocket.getPort());
                } catch (final IOException e) {
                    LOGGER.error("While closing the client socket {}:{}", clientIP.getHostAddress(),
                            clientSocket.getPort(), e);
                }
                // null the reference to ensure it will be caught by the garbage collector
                clientSocket = null;

                // helper debug - SHOULD NOT BE USED IN PRODUCTION CODE!!!
                if (LOGGER.isDebugEnabled()) {
                    final int finalThreadCount = Thread.activeCount();
                    LOGGER.debug("Ending client thread - final thread count: {}", finalThreadCount);
                    final Thread[] t = new Thread[finalThreadCount];
                    final int n = Thread.enumerate(t);
                    for (var i = 0; i < n; i++) {
                        LOGGER.debug("T {}: {}", t[i].getId(), t[i].getName());
                    }
                }
            }

        }

    }

    /**
     * Wait for connections.
     * <p>
     * Suppress warning java:S2189 - Loops should not be infinite
     *
     * @param port
     *
     */

    private void listen(final int port) {
        try (var serverSocket = new ServerSocket(port)) {
            while (true) {
                final var clientSocket = serverSocket.accept();
                new ClientHandler(clientSocket).start();
            }
        } catch (final IOException e) {
            LOGGER.error(e);
        }
    }

    /**
     * Wait for connections.
     *
     * @param port
     * @param blocking
     *            if {@code false} the socket runs in its own thread and does not block calling
     *            thread.
     */

    public void start(final int port, final boolean blocking) {
        if (blocking) {
            listen(port);
        } else {
            new Thread(() -> listen(port)).start();
        }
    }


}
