package application;

import domain.Communication;

public class Battery {

    public void calculateAGVBattery(Communication c){

        Double battery = c.getActualBattery();

        if(c.getVelocity() == 1){
            battery -= (c.getMAX_BATTERY() * 0.01);
            c.setActualBattery(battery);
        }

        if(c.getVelocity() == 2){
            battery -= (c.getMAX_BATTERY() * 0.02);
            c.setActualBattery(battery);
        }

    }
}
