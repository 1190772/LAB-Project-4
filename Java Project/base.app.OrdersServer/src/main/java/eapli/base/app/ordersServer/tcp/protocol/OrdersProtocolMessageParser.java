package eapli.base.app.ordersServer.tcp.protocol;

import eapli.framework.csv.util.CsvLineMarshaler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.ParseException;

public class OrdersProtocolMessageParser {

    private static final Logger LOGGER = LogManager.getLogger(OrdersProtocolMessageParser.class);

    private OrdersProtocolMessageParser() {
        // avoid instantiation
    }

    /**
     * Parse and build the request.
     *
     * @param inputLine
     * @return
     */
    public static OrdersProtocolRequest parse(final String inputLine) {
        // as a fallback make sure we return unknown
        OrdersProtocolRequest request = new UnknownRequest(inputLine);

        return request;
    }
}
