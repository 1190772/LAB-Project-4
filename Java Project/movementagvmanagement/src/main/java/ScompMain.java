import application.PathPlanner;
import domain.Location;
import domain.Map;

public class ScompMain {

    public static void main(String[] args) {

        Map map = new Map();
        map.createMap();


        map.addDockPosition(new Location(1, 1));
        map.addDockPosition(new Location(1, 2));
        map.addDockPosition(new Location(1, 4));
        map.addDockPosition(new Location(1, 5));
        map.addDockPosition(new Location(1, 7));
        map.addDockPosition(new Location(1, 8));


        for (int k = 5; k < 15; k++) {
            map.addShelfPosition(new Location(1, k));
            map.addShelfPosition(new Location(20, k));
        }

        map.printMap();




//        map.changeAgvPosition(new Location(1,2),new Location(2,2));
//        map.printMap();
//
//        map.changeAgvPosition(new Location(2,2),new Location(3,2));
//        map.printMap();
//
//        map.changeAgvPosition(new Location(3,2),new Location(3,1));
//        map.printMap();
//
//        map.changeAgvPosition(new Location(3,1),new Location(4,1));
//        map.printMap();

        PathPlanner planner = new PathPlanner();

    }

}
