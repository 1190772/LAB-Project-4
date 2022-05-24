package eapli.base.app.ordersServer.tcp;

import eapli.base.app.ordersServer.tcp.presentation.OrdersServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class OrdersServerDaemon implements CommandLineRunner {

    private static final int BOOKING_PORT = 8899;
    private static final Logger LOGGER = LogManager.getLogger(OrdersServerDaemon.class);


    public static void main(String[] args) throws Exception {

         SpringApplication.run(OrdersServerDaemon.class, args);

    }

    @Override
    public void run(final String... args) throws Exception {
        LOGGER.info("Configuring the daemon");

        LOGGER.info("Starting the server socket on port {}", BOOKING_PORT);
        final var server = new OrdersServer();
        server.start(BOOKING_PORT, false);

        LOGGER.info("Exiting the daemon");
        System.exit(0);
    }

}


