package domain;

import domain.graph.Algorithms;
import domain.graph.map.MapGraph;
import eapli.base.importwarehouse.domain.WarehousePlant;
import eapli.base.importwarehouse.domain.aisles.Aisle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Map {

    private List<Location> map;

    public void createMap() {

        MapGraph<Location, Integer> graph = new MapGraph<>(false);
        WarehousePlant warehousePlant=null;

        int nX = (int)warehousePlant.getWidth().width();
        int nY = (int)warehousePlant.getLength().length();


        System.out.println(nX);
        System.out.println(nY);



        map = new ArrayList<>();


        for(int i = 1; i <= nX; i++){
            for (int j = 1; j <= nY; j++) {
                Location local = new Location(i, j, 0);
                map.add(local);
                graph.addVertex(local);
            }
        }


        int auxXr;
        int auxXl;
        int auxYr;
        int auxYl;
        for(int i = 1; i <= nX; i++){
            auxXr = i + 1;
            auxXl = i - 1;
            for (int j = 1; j <= nY; j++) {
                auxYr = j + 1;
                auxYl = j - 1;

                if(auxXr >= 1 && auxXr <= nX) {
                    graph.addEdge(graph.getVertex(i,j),graph.getVertex(auxXr,j),1);
                }

                if(auxYr >= 1 && auxYr <= nY) {
                    graph.addEdge(graph.getVertex(i,j),graph.getVertex(i,auxYr),1);
                }

                if(auxXl >= 1 && auxXl <= nX) {
                    graph.addEdge(graph.getVertex(i,j),graph.getVertex(auxXl,j),1);
                }

                if(auxYl >= 1 && auxYl <= nY) {
                    graph.addEdge(graph.getVertex(i,j),graph.getVertex(i,auxYl),1);
                }

            }
        }

        List<Aisle> aisles = warehousePlant.getAisles();



        for (Aisle al : aisles) {
            int xBegin = Math.toIntExact(al.getBegin().getwSquare());
            int yBegin = Math.toIntExact(al.getBegin().getlSquare());
            int xEnd = Math.toIntExact(al.getEnd().getwSquare());
            int yEnd = Math.toIntExact(al.getEnd().getlSquare());
            int xDepth = Math.toIntExact(al.getDepth().getwSquare());
            int yDepth = Math.toIntExact(al.getDepth().getwSquare());

            System.out.println();

            if(xBegin == xEnd){
                if(xBegin <= xDepth) {
                    for (int i = xBegin; i <= xDepth; i++) {
                        for (int j = yBegin; j <= yEnd; j++) {
                            graph.removeVertex(graph.getVertex(i,j));
                        }
                    }
                } else {
                    for (int i = xBegin; i >= xDepth; i--) {
                        for (int j = yBegin; j <= yEnd; j++) {
                            graph.removeVertex(graph.getVertex(i,j));
                        }
                    }
                }
            }
            if(yBegin == yEnd) {
                if(yBegin <= yDepth) {
                    for (int i = yBegin; i <= yDepth; i++) {
                        for (int j = xBegin; j <= xEnd; j++) {
                            graph.removeVertex(graph.getVertex(j,i));
                        }
                    }
                } else {
                    for (int i = yBegin; i >= yDepth; i--) {
                        for (int j = xBegin; j <= xEnd; j++) {
                            graph.removeVertex(graph.getVertex(j,i));
                        }
                    }
                }
            }
        }


        Comparator<Integer> compareInt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 - o2);
            }
        };

        BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer aDouble, Integer aDouble2) {
                return aDouble + aDouble2;
            }
        };

        LinkedList<Location> shortPath = new LinkedList<>();
        Algorithms.shortestPath(graph, graph.getVertex(3,1),graph.getVertex(12,14), compareInt, sum,0,shortPath);


        System.out.println(shortPath);

    }

   public void repositioningAGV(Location previousLocation, Location newLocation) {
        for (Location l : map) {
            if (l.getX() == previousLocation.getX() && l.getY() == previousLocation.getY()) {
                l.setObstacle(previousLocation.getObstacle());
            }
            if (l.getX() == newLocation.getX() && l.getY() == newLocation.getY()) {
                l.setObstacle(3);
            }
        }

    }



    public void addDockPosition(Location location) {
        for (Location l : map) {
            if (l.getX() == location.getX() && l.getY() == location.getY()) {
                l.setObstacle(1);

            }
        }
    }

    public void addShelfPosition(Location location) {
        for (Location l : map) {
            if (l.getX() == location.getX() && l.getY() == location.getY()) {
                l.setObstacle(2);

            }
        }
    }



    public Location locationGoingUp(Location location) {
        Location location1 = null;
        for (Location l : map) {
            if (l.getX() == location.getX() + 1 && l.getY() == location.getY()) {
                location1 = l;
            }
        }
        return location1;
    }



    public Location locationGoingDown(Location location) {
        Location location1 = null;
        for (Location l : map) {
            if (l.getX() == location.getX() - 1 && l.getY() == location.getY()) {
                location1 = l;
            }
        }
        return location1;
    }

    public Location locationGoingRight(Location location) {
        Location location1 = null;
        for (Location l : map) {
            if (l.getX() == location.getX() && l.getY() == location.getY() + 1) {
                location1 = l;
            }
        }
        return location1;
    }

    public Location locationGoingLeft(Location location) {
        Location location1 = null;
        for (Location l : map) {
            if (l.getX() == location.getX() && l.getY() == location.getY() - 1) {
                location1 = l;
            }
        }
        return location1;
    }

    public void printMap() {

        Location loc = map.get(map.size() - 1);

        for (int l = 0; l < loc.getY(); l++) {
            String linha = "";

            for (int k = 0; k < loc.getX(); k++) {
                if (l < 9) {
                    linha = linha.concat(String.valueOf(l + 1)) + "  | ";
                } else {
                    linha = linha.concat(String.valueOf(l + 1)) + " | ";
                }
                linha = linha.concat(map.get(k).getObstacle() + "  | ");
            }

            System.out.println(linha);
        }
        System.out.println("\n0 -> No obstacles");
        System.out.println("1 -> AGV Dock");
        System.out.println("2 -> AGV");
        System.out.println("3 -> Shelf");
    }

}
