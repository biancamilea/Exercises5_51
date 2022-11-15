public class Main3 {
    public static void main(String[] args) {
        Point point1 = new Point(4,5);
        Point point2 = new Point(6,8);

        Segment segment = new Segment(point1, point2);
        segment.setOffset(4,4 );

        System.out.println(segment.toString());
        System.out.println("Module: " +  segment.getModule());

    }
}
