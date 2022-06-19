package domain;

import java.util.LinkedList;

public class Communication {


    private int sensor_norte;

    private int sensor_nordeste;

    private int sensor_este;

    private int sensor_sudeste;

    private int sensor_sul;

    private int sensor_sudoeste;

    private int sensor_oeste;

    private int sensor_noroeste;


    private String direccao;


    private Double velocity;


    private final Double MAX_BATTERY;

    private Double actualBattery;


    private final Location DOCK_LOCATION;

    private LinkedList<Location> productLocations;

    private Location actualPosition;

    private LinkedList<Location> route;


    public Communication(int sensor_norte, int sensor_nordeste, int sensor_este, int sensor_sudeste, int sensor_sul, int sensor_sudoeste,
                         int sensor_oeste, int sensor_noroeste, Double battery, Location dock, LinkedList<Location> productLocations) {
        this.sensor_norte = sensor_norte;
        this.sensor_nordeste = sensor_nordeste;
        this.sensor_este = sensor_este;
        this.sensor_sudeste = sensor_sudeste;
        this.sensor_sul = sensor_sul;
        this.sensor_sudoeste = sensor_sudoeste;
        this.sensor_oeste = sensor_oeste;
        this.sensor_noroeste = sensor_noroeste;
        this.MAX_BATTERY = battery;
        this.DOCK_LOCATION = dock;
        this.productLocations = productLocations;
        actualBattery = MAX_BATTERY;
        direccao = "";
        velocity = 0.0;
        actualPosition = DOCK_LOCATION;
        route = new LinkedList<>();
    }



    public void setSensor_norte(int sensor_norte) {
        this.sensor_norte = sensor_norte;
    }

    public void setSensor_nordeste(int sensor_nordeste) {
        this.sensor_nordeste = sensor_nordeste;
    }

    public void setSensor_este(int sensor_este) {
        this.sensor_este = sensor_este;
    }

    public void setSensor_sudeste(int sensor_sudeste) {
        this.sensor_sudeste = sensor_sudeste;
    }

    public void setSensor_sul(int sensor_sul) {
        this.sensor_sul = sensor_sul;
    }

    public void setSensor_sudoeste(int sensor_sudoeste) {
        this.sensor_sudoeste = sensor_sudoeste;
    }

    public void setSensor_oeste(int sensor_oeste) {
        this.sensor_oeste = sensor_oeste;
    }

    public void setSensor_noroeste(int sensor_noroeste) {
        this.sensor_noroeste = sensor_noroeste;
    }



    public int getSensor_norte() {
        return sensor_norte;
    }

    public int getSensor_nordeste() {
        return sensor_nordeste;
    }

    public int getSensor_este() {
        return sensor_este;
    }

    public int getSensor_sudeste() {
        return sensor_sudeste;
    }

    public int getSensor_sul() {
        return sensor_sul;
    }

    public int getSensor_sudoeste() {
        return sensor_sudoeste;
    }

    public int getSensor_oeste() {
        return sensor_oeste;
    }

    public int getSensor_noroeste() {
        return sensor_noroeste;
    }



    public String getDireccao() {
        return direccao;
    }

    public void setDireccao(String direccao) {
        this.direccao = direccao;
    }


    public Double getVelocity() {
        return velocity;
    }

    public void setVelocity(Double velocity) {
        this.velocity = velocity;
    }



    public Double getMAX_BATTERY() {
        return MAX_BATTERY;
    }

    public Double getActualBattery() {
        return actualBattery;
    }

    public void setActualBattery(Double actualBattery) {
        this.actualBattery = actualBattery;
    }



    public Location getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(Location actualPosition) {
        this.actualPosition = actualPosition;
    }



    public LinkedList<Location> getProductLocations() {
        return productLocations;
    }


    public void setProductLocations(LinkedList<Location> productLocations) {
        this.productLocations = productLocations;
    }



    public LinkedList<Location> getRoute() {
        return route;
    }


    public void setRoute(LinkedList<Location> route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Communication{" +
                "sensor_norte=" + sensor_norte +
                ", sensor_nordeste=" + sensor_nordeste +
                ", sensor_este=" + sensor_este +
                ", sensor_sudeste=" + sensor_sudeste +
                ", sensor_sul=" + sensor_sul +
                ", sensor_sudoeste=" + sensor_sudoeste +
                ", sensor_oeste=" + sensor_oeste +
                ", sensor_noroeste=" + sensor_noroeste +
                ", direccao='" + direccao + '\'' +
                ", velocity=" + velocity +
                ", MAX_BATTERY=" + MAX_BATTERY +
                ", actualBattery=" + actualBattery +
                ", DOCK_LOCATION=" + DOCK_LOCATION +
                ", productLocations=" + productLocations +
                ", actualPosition=" + actualPosition +
                ", route=" + route +
                '}';
    }
}
