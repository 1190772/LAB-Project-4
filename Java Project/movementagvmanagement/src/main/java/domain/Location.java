package domain;

import java.util.Objects;

public class Location {

    private final int x;

    private final  int y;

    private int obstacle;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Location(int x, int y , int obstacle) {
        this.x = x;
        this.y = y;
        this.obstacle = obstacle;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public int getObstacle() {
        return obstacle;
    }

    public void setObstacle(int obstacle) {
        this.obstacle = obstacle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x && y == location.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +  "|" + obstacle +
                '}';
    }

}
