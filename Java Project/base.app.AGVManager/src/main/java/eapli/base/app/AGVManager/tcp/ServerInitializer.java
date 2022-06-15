package eapli.base.app.AGVManager.tcp;

public class ServerInitializer {

    public static void main(String[] args) {
        AGVManager server = new AGVManager();
        try {
            server.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
