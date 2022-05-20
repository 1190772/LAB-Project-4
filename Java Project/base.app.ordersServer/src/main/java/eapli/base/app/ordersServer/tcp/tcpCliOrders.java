package eapli.base.app.ordersServer.tcp;

import eapli.base.AppSettings;
import eapli.base.Application;



public class tcpCliOrders {

    static AppSettings app = Application.settings();
    static final int serverAlgorithmNumber = app.getAlgorithmNumber();
    private static final String IP_SERVER_EXECUTOR_1 = "";
    private static final String IP_SERVER_EXECUTOR_2 = "";

    public static void main(String[] args) throws InterruptedException {

    }

}

class tcpCliOrdersThread implements Runnable {

    @Override
    public void run() {

    }
}