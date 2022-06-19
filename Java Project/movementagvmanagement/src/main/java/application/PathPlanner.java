package application;

import domain.Communication;
import domain.Location;
import domain.Map;

import java.util.LinkedList;

public class PathPlanner {

    public void calculateRouteToProduct(Communication c,Location aGVLocation,Location productLocations , Map map) {


        Location productLocation = productLocations;
        Location route = aGVLocation;
        LinkedList<Location> routeList = new LinkedList<>();
        boolean b = true;
        do {


            if (route.getY() < productLocation.getY()) {
                if (map.locationGoingRight(route).getObstacle() == 0) {
                    System.out.println(map.locationGoingRight(route));
                    routeList.add(map.locationGoingRight(route));
                    route = map.locationGoingRight(route);
                }
            }else if (route.getY() > productLocation.getY()) {
                if (map.locationGoingLeft(route).getObstacle() == 0) {
                    System.out.println(map.locationGoingLeft(route));
                    routeList.add(map.locationGoingLeft(route));
                    route = map.locationGoingLeft(route);
                }
            }else if (route.getX() > productLocation.getX()) {
                if (map.locationGoingDown(route).getObstacle() == 0) {
                    //Verifica se tem obstaculo a d no preciso momento
                    System.out.println(map.locationGoingDown(route));
                    routeList.add(map.locationGoingDown(route));
                    route = map.locationGoingDown(route);
                }
            }else if (route.getX() < productLocation.getX()) {
                if (map.locationGoingUp(route).getObstacle() == 0) {
                    System.out.println(map.locationGoingUp(route));
                    routeList.add(map.locationGoingUp(route));
                    route = map.locationGoingUp(route);
                }
            }

             b = (route.getX() == productLocation.getX() && route.getY() == productLocation.getY());
        }while (!b);

        System.out.println("\n");
        for (Location l: routeList) {
            System.out.println(l);

        }

        c.setRoute(routeList);
    }


    public void recalculateRoute(Communication c) {

    }
}
