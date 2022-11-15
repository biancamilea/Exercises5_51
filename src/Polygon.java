import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Polygon {
    Set<Point> points;

    public Polygon (){
        this.points = new HashSet<>();
    }

    public Polygon(Set<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return points.stream().map(point -> {
           return "(" + point.getX() + ", " + point.getY() + ")";
        }).collect(Collectors.joining(" - "));
    }
}
