package eapli.base.app.ordersServer.tcp.protocol;

public class BadRequest extends BaseErrorRequest{

    public BadRequest(final String request, final String errorDescription) {
        super(request, errorDescription);
    }

    @Override
    protected String messageType() {
        return "BAD_REQUEST";
    }
}
