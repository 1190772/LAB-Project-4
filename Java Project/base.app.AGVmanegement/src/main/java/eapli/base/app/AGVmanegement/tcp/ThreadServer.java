package eapli.base.app.AGVmanegement.tcp;

public class ThreadServer extends Thread {


    public void run() {
        AGVManager server = new AGVManager();
        try {
            server.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}