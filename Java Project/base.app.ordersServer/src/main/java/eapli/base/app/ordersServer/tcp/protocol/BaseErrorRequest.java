package eapli.base.app.ordersServer.tcp.protocol;

import eapli.framework.csv.CsvRecord;

public abstract class BaseErrorRequest extends OrdersProtocolRequest {

    private final String errorDescription;

    protected BaseErrorRequest(final String request, final String errorDescription) {
        super(request);
        this.errorDescription = errorDescription;
    }

    protected BaseErrorRequest(final String request) {
        super(request);
        errorDescription = null;
    }

    @Override
    public String execute() {
        // nothing to do, just build the response
        return buildResponse();
    }

    protected String buildResponse() {
        final Object[] fields = {
                messageType(),
                request,
                errorDescription
        };
        final boolean[] mask = { false, true, true };
        return CsvRecord.valueOf(fields, mask).toString() + "\n";
    }

    protected abstract String messageType();
}
