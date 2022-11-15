import java.util.HashSet;
import java.util.Set;

public class Polygon {
    Set<Point> points;

    public Polygon (){
        this.points = new HashSet<>();
    }

    public Polygon(Set<Point> points) {
        this.points = points;
    }
}
