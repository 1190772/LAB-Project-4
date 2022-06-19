package application;

import domain.Communication;
import domain.Location;

public class PositioningInformation {

    public void positioning(Communication c){


        Double quantosSAndou = c.getVelocity();
        Location actualPosition = c.getActualPosition();


        if (c.getDireccao().equalsIgnoreCase("direita")){
            c.setActualPosition(new Location( actualPosition.getX() + quantosSAndou.intValue(),(actualPosition.getY())));
        }else if (c.getDireccao().equalsIgnoreCase("esquerda")){
            c.setActualPosition(new Location(actualPosition.getX() - quantosSAndou.intValue(),(actualPosition.getY())));
        }else if (c.getDireccao().equalsIgnoreCase("baixo")){
            c.setActualPosition(new Location(actualPosition.getX(),(actualPosition.getY() - quantosSAndou.intValue())));
        }else if (c.getDireccao().equalsIgnoreCase("cima")){
            c.setActualPosition(new Location(actualPosition.getX(),(actualPosition.getY() + quantosSAndou.intValue())));
        }
    }

}
