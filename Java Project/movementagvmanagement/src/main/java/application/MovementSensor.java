package application;

import domain.Communication;

public class MovementSensor {


    public void currentSpeed(Communication c) {


        if (c.getDireccao().equalsIgnoreCase("direita")) {
            if (c.getSensor_este() == 0 || c.getSensor_este() == 1 || c.getSensor_sudeste() == 0 || c.getSensor_nordeste() == 0) {
                c.setVelocity(new Double(0));
            }else if (c.getSensor_este() == 2 || c.getSensor_sudeste() == 1 || c.getSensor_sudeste() == 2 || c.getSensor_nordeste() == 1 || c.getSensor_nordeste() == 2) {
                c.setVelocity(new Double(1));
            }else if (c.getSensor_este() > 3 && c.getSensor_sudeste() > 3 || c.getSensor_nordeste() > 3) {
                c.setVelocity(new Double(2));
            }
        }else if (c.getDireccao().equalsIgnoreCase("esquerda")) {
            if (c.getSensor_oeste() == 0 || c.getSensor_sudoeste() == 0) {
                c.setVelocity(new Double(0));
            }else if (c.getSensor_oeste() == 1 || c.getSensor_oeste() == 2 || c.getSensor_sudoeste() == 1 || c.getSensor_sudoeste() == 2 || (c.getSensor_noroeste() >= 0 && c.getSensor_noroeste() < 3)) {
                c.setVelocity(new Double(1));
            }else if (c.getSensor_oeste() > 3 && c.getSensor_sudoeste() > 3 || c.getSensor_noroeste() > 3) {
                c.setVelocity(new Double(2));
            }
        }else if (c.getDireccao().equalsIgnoreCase("baixo")) {
            if (c.getSensor_sul() == 0 || c.getSensor_sul() == 1 || c.getSensor_sudeste() == 0) {
                c.setVelocity(new Double(0));
            }else if (c.getSensor_sul() == 2 || c.getSensor_sudoeste() == 1 || c.getSensor_sudoeste() == 2 || c.getSensor_sudeste() == 1 || c.getSensor_sudeste() == 2) {
                c.setVelocity(new Double(1));
            }else if (c.getSensor_sul() > 3 && c.getSensor_sudoeste() > 3 || c.getSensor_sudeste() > 3) {
                c.setVelocity(new Double(2));
            }
        }else if (c.getDireccao().equalsIgnoreCase("cima")) {
            if (c.getSensor_norte() == 0) {
                c.setVelocity(new Double(0));
            }else if (c.getSensor_norte() == 1 || c.getSensor_norte() == 2 || (c.getSensor_noroeste() >= 0 && c.getSensor_noroeste() < 3) || (c.getSensor_nordeste() >= 0 && c.getSensor_nordeste() < 3)) {
                c.setVelocity(new Double(1));
            }else if (c.getSensor_norte() >= 3 && c.getSensor_noroeste() >= 3 || c.getSensor_nordeste() >= 3) {
                c.setVelocity(new Double(2));
            }
        }


    }
}