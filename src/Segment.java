public class Segment {
    Point startPoint;
    Point endPoint;

    public Segment(){
        this.startPoint = new Point(0, 0);
        this.endPoint = new Point(0, 0);
    }

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getModule(){
        return Math.sqrt(Math.pow(endPoint.getX() - startPoint.getX(), 2)
                + Math.pow(endPoint.getY() - startPoint.getY(), 2) * 1.0);
    }
}
