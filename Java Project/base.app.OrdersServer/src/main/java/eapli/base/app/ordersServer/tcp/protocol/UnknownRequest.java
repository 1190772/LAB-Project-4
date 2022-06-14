package eapli.base.app.ordersServer.tcp.protocol;

public class UnknownRequest extends BaseErrorRequest {

    public UnknownRequest(final String inputLine) {
        super(inputLine);
    }

    @Override
    protected String messageType() {
        return "UNKNOWN_REQUEST";
    }
}
